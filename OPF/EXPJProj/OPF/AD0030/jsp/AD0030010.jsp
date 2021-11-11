<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:30:29 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0030\AD0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0030.*" %>
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
<jsp:useBean id="aAD0030010Control" class="com.nec.jp.orteus.metamorBase.AD0030.AD0030010Control" scope="request"/>
<jsp:useBean id="aAD0030010Struct" class="com.nec.jp.orteus.metamorBase.AD0030.AD0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業系列展開処理実行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/jsp/AD0030010.jsp,v $
$Author: geng-jia $	
$Revision: 1.23 $ $Date: 2017/02/22 02:04:42 $
********************************************************* --%>
<html>
<head>
<title>作業系列展開処理実行</title>
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
<script class="expj-script-AD0030010_init">
  // AD0030010名前空間
  expj.AD0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AD0030010" data-screen="AD0030010" data-newdata="<%=aAD0030010Control.isNewData() %>">
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
              <script class="expj-script-AD0030010-AD0030010form1">
expj.AD0030010.AD0030010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AD0030010.AD0030010form1.onLoad0 = function () {
  console.log('AD0030010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHK;_AD0030010form1/r1_MODE[eq]true@*0,*1"
expj.AD0030010.AD0030010form1.onDecision0 = function () {
  console.log('AD0030010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/r1_MODE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;CHKRQ;A@*2,*3"
expj.AD0030010.AD0030010form1.child0 = function () {
  console.log('AD0030010form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHKRQ;B@*2,*3"
expj.AD0030010.AD0030010form1.child1 = function () {
  console.log('AD0030010form1 script4');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030010', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;UNMASK;_AD0030010button1/Execute"
expj.AD0030010.AD0030010form1.child2 = function () {
  console.log('AD0030010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010button1/Execute');
};
// script6="child;3;MASK;_AD0030010button1/Execute"
expj.AD0030010.AD0030010form1.child3 = function () {
  console.log('AD0030010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010button1/Execute');
};
// script7="onDecision;1;CHK;_AD0030010form1/r1_MODE[eq]true@*4,*7"
expj.AD0030010.AD0030010form1.onDecision1 = function () {
  console.log('AD0030010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/r1_MODE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;4;UNMASK;_AD0030010form1/OPR_INST_START_DATE,_AD0030010form1/OPR_INST_START_TIME,_AD0030010form1/CalendarOprInstStartDate@*5"
expj.AD0030010.AD0030010form1.child4 = function () {
  console.log('AD0030010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/OPR_INST_START_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/OPR_INST_START_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/CalendarOprInstStartDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script9="child;5;MASK;_AD0030010form1/PRD_DUE_DATE,_AD0030010form1/PRD_DUE_TIME,_AD0030010form1/CalendarPrdDueDate@*6"
expj.AD0030010.AD0030010form1.child5 = function () {
  console.log('AD0030010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/PRD_DUE_DATE');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/PRD_DUE_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/CalendarPrdDueDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script10="child;6;SET;_AD0030010form1/PRD_DUE_DATE=,_AD0030010form1/PRD_DUE_TIME="
expj.AD0030010.AD0030010form1.child6 = function () {
  console.log('AD0030010form1 script10');
expj.common.pscript.setReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/PRD_DUE_DATE', '');
expj.common.pscript.setReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/PRD_DUE_TIME', '');
};
// script11="child;7;UNMASK;_AD0030010form1/PRD_DUE_DATE,_AD0030010form1/PRD_DUE_TIME,_AD0030010form1/CalendarPrdDueDate@*8"
expj.AD0030010.AD0030010form1.child7 = function () {
  console.log('AD0030010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/PRD_DUE_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/PRD_DUE_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/CalendarPrdDueDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script12="child;8;MASK;_AD0030010form1/OPR_INST_START_DATE,_AD0030010form1/OPR_INST_START_TIME,_AD0030010form1/CalendarOprInstStartDate@*9"
expj.AD0030010.AD0030010form1.child8 = function () {
  console.log('AD0030010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/OPR_INST_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/OPR_INST_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/CalendarOprInstStartDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script13="child;9;SET;_AD0030010form1/OPR_INST_START_DATE=,_AD0030010form1/OPR_INST_START_TIME="
expj.AD0030010.AD0030010form1.child9 = function () {
  console.log('AD0030010form1 script13');
expj.common.pscript.setReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/OPR_INST_START_DATE', '');
expj.common.pscript.setReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/OPR_INST_START_TIME', '');
};
// script14="onDecision;2;CHK;_AD0030010form1/TIME_CTRL[eq]false@*10"
expj.AD0030010.AD0030010form1.onDecision2 = function () {
  console.log('AD0030010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/TIME_CTRL'), '[eq]', 'false')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script15="child;10;MASK;_AD0030010form1/OPR_INST_START_TIME,_AD0030010form1/PRD_DUE_TIME@*11"
expj.AD0030010.AD0030010form1.child10 = function () {
  console.log('AD0030010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/OPR_INST_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/PRD_DUE_TIME');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script16="child;11;SET;_AD0030010form1/OPR_INST_START_TIME=,_AD0030010form1/PRD_DUE_TIME="
expj.AD0030010.AD0030010form1.child11 = function () {
  console.log('AD0030010form1 script16');
expj.common.pscript.setReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/OPR_INST_START_TIME', '');
expj.common.pscript.setReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/PRD_DUE_TIME', '');
};
expj.AD0030010.AD0030010form1.executeAllOnDecision = function () {
  console.log('execute AD0030010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030010.AD0030010form1['onDecision' + i])) {
        expj.AD0030010.AD0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0030010.AD0030010form1.executeOnLoad = function () {
  expj.AD0030010.AD0030010form1.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0030010.AD0030010form1['onLoad' + i])) {
      expj.AD0030010.AD0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0030010-AD0030010form1" action="AD0030010Servlet" name="AD0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0030010Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_START_DATE_6",rb)%></span><!-- 品目別製造着手日 --></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-OPR_INST_START_DATE">
expj.AD0030010.AD0030010form1.OPR_INST_START_DATE = {};
expj.AD0030010.AD0030010form1.OPR_INST_START_DATE.executeAllOnDecision = function () {
  console.log('execute AD0030010form1/OPR_INST_START_DATE.onDecision');
  expj.AD0030010.AD0030010form1.executeAllOnDecision();
  expj.AD0030010.executeAllOnDecision();
};
expj.AD0030010.AD0030010form1.OPR_INST_START_DATE.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-OPR_INST_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030010', 'AD0030010form1', 'OPR_INST_START_DATE', this);
  });
  expj.AD0030010.AD0030010form1.OPR_INST_START_DATE.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.OPR_INST_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/OPR_INST_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-OPR_INST_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030010-AD0030010form1-OPR_INST_START_DATE" name="OPR_INST_START_DATE" class="AD0030010-focus-move  required-value expj-AD0030010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0030010Struct.getOPR_INST_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-CalendarOprInstStartDate">
expj.AD0030010.AD0030010form1.CalendarOprInstStartDate = {};
// script1="onClick;0;CALENDAR;_AD0030010form1/OPR_INST_START_DATE"
expj.AD0030010.AD0030010form1.CalendarOprInstStartDate.onClick0 = function () {
  console.log('CalendarOprInstStartDate script1');
expj.common.pscript.executeCalendar('AD0030010','AD0030010form1','_AD0030010form1/OPR_INST_START_DATE');
};
expj.AD0030010.AD0030010form1.CalendarOprInstStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030010.AD0030010form1.CalendarOprInstStartDate['onClick' + i])) {
        expj.AD0030010.AD0030010form1.CalendarOprInstStartDate['onClick' + i]();
      }
    }
  }
};
expj.AD0030010.AD0030010form1.CalendarOprInstStartDate.executeAllOnDecision = function () {
};
expj.AD0030010.AD0030010form1.CalendarOprInstStartDate.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-CalendarOprInstStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030010', 'AD0030010form1', 'CalendarOprInstStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0030010','AD0030010form1','_AD0030010form1/OPR_INST_START_DATE');
  expj.AD0030010.AD0030010form1.CalendarOprInstStartDate.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.CalendarOprInstStartDate.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/CalendarOprInstStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-CalendarOprInstStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030010-AD0030010form1-CalendarOprInstStartDate" class="AD0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-OPR_INST_START_TIME">
expj.AD0030010.AD0030010form1.OPR_INST_START_TIME = {};
expj.AD0030010.AD0030010form1.OPR_INST_START_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030010form1/OPR_INST_START_TIME.onDecision');
  expj.AD0030010.AD0030010form1.executeAllOnDecision();
  expj.AD0030010.executeAllOnDecision();
};
expj.AD0030010.AD0030010form1.OPR_INST_START_TIME.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-OPR_INST_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030010', 'AD0030010form1', 'OPR_INST_START_TIME', this);
  });
  expj.AD0030010.AD0030010form1.OPR_INST_START_TIME.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.OPR_INST_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/OPR_INST_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-OPR_INST_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0030010-AD0030010form1-OPR_INST_START_TIME" name="OPR_INST_START_TIME" class="AD0030010-focus-move  " style="width:100%;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0030010Struct.getOPR_INST_START_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-r1_MODE">
expj.AD0030010.AD0030010form1.r1_MODE = {};
expj.AD0030010.AD0030010form1.r1_MODE.executeAllOnDecision = function () {
  console.log('execute AD0030010form1/r1_MODE.onDecision');
  expj.AD0030010.AD0030010form1.executeAllOnDecision();
  expj.AD0030010.executeAllOnDecision();
};
expj.AD0030010.AD0030010form1.r1_MODE.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-r1_MODE').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030010', 'AD0030010form1', 'r1_MODE', this, 'RadioButton');
    }
  });
  expj.AD0030010.AD0030010form1.r1_MODE.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.r1_MODE.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/r1_MODE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-r1_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="MODE" data-name="r1_MODE" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030010Struct.getr1_MODE())) || "".equals(TypeConverter.convert(aAD0030010Struct.getr1_MODE())))?"checked=\"checked\"": "" %> class="" id="expj-AD0030010-AD0030010form1-r1_MODE" ><label for="expj-AD0030010-AD0030010form1-r1_MODE"><%=CoreTools.getRBString("Expj.Cmt0510",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_6",rb)%></span><!-- 品目別製造納期 --></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-PRD_DUE_DATE">
expj.AD0030010.AD0030010form1.PRD_DUE_DATE = {};
expj.AD0030010.AD0030010form1.PRD_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AD0030010form1/PRD_DUE_DATE.onDecision');
  expj.AD0030010.AD0030010form1.executeAllOnDecision();
  expj.AD0030010.executeAllOnDecision();
};
expj.AD0030010.AD0030010form1.PRD_DUE_DATE.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-PRD_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030010', 'AD0030010form1', 'PRD_DUE_DATE', this);
  });
  expj.AD0030010.AD0030010form1.PRD_DUE_DATE.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.PRD_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/PRD_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-PRD_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030010-AD0030010form1-PRD_DUE_DATE" name="PRD_DUE_DATE" class="AD0030010-focus-move  required-value expj-AD0030010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0030010Struct.getPRD_DUE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-CalendarPrdDueDate">
expj.AD0030010.AD0030010form1.CalendarPrdDueDate = {};
// script1="onClick;0;CALENDAR;_AD0030010form1/PRD_DUE_DATE"
expj.AD0030010.AD0030010form1.CalendarPrdDueDate.onClick0 = function () {
  console.log('CalendarPrdDueDate script1');
expj.common.pscript.executeCalendar('AD0030010','AD0030010form1','_AD0030010form1/PRD_DUE_DATE');
};
expj.AD0030010.AD0030010form1.CalendarPrdDueDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030010.AD0030010form1.CalendarPrdDueDate['onClick' + i])) {
        expj.AD0030010.AD0030010form1.CalendarPrdDueDate['onClick' + i]();
      }
    }
  }
};
expj.AD0030010.AD0030010form1.CalendarPrdDueDate.executeAllOnDecision = function () {
};
expj.AD0030010.AD0030010form1.CalendarPrdDueDate.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-CalendarPrdDueDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030010', 'AD0030010form1', 'CalendarPrdDueDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0030010','AD0030010form1','_AD0030010form1/PRD_DUE_DATE');
  expj.AD0030010.AD0030010form1.CalendarPrdDueDate.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.CalendarPrdDueDate.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/CalendarPrdDueDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-CalendarPrdDueDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030010-AD0030010form1-CalendarPrdDueDate" class="AD0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-PRD_DUE_TIME">
expj.AD0030010.AD0030010form1.PRD_DUE_TIME = {};
expj.AD0030010.AD0030010form1.PRD_DUE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030010form1/PRD_DUE_TIME.onDecision');
  expj.AD0030010.AD0030010form1.executeAllOnDecision();
  expj.AD0030010.executeAllOnDecision();
};
expj.AD0030010.AD0030010form1.PRD_DUE_TIME.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-PRD_DUE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030010', 'AD0030010form1', 'PRD_DUE_TIME', this);
  });
  expj.AD0030010.AD0030010form1.PRD_DUE_TIME.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.PRD_DUE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/PRD_DUE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-PRD_DUE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0030010-AD0030010form1-PRD_DUE_TIME" name="PRD_DUE_TIME" class="AD0030010-focus-move  " style="width:100%;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0030010Struct.getPRD_DUE_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-r2_MODE">
expj.AD0030010.AD0030010form1.r2_MODE = {};
expj.AD0030010.AD0030010form1.r2_MODE.executeAllOnDecision = function () {
  console.log('execute AD0030010form1/r2_MODE.onDecision');
  expj.AD0030010.AD0030010form1.executeAllOnDecision();
  expj.AD0030010.executeAllOnDecision();
};
expj.AD0030010.AD0030010form1.r2_MODE.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-r2_MODE').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030010', 'AD0030010form1', 'r2_MODE', this, 'RadioButton');
    }
  });
  expj.AD0030010.AD0030010form1.r2_MODE.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.r2_MODE.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/r2_MODE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-r2_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="MODE" data-name="r2_MODE" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030010Struct.getr2_MODE())))?"checked=\"checked\"":"" %> class="" id="expj-AD0030010-AD0030010form1-r2_MODE" ><label for="expj-AD0030010-AD0030010form1-r2_MODE"><%=CoreTools.getRBString("Expj.Cmt0511",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-JOB_ODR_CD">
expj.AD0030010.AD0030010form1.JOB_ODR_CD = {};
expj.AD0030010.AD0030010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0030010form1/JOB_ODR_CD.onDecision');
  expj.AD0030010.AD0030010form1.executeAllOnDecision();
  expj.AD0030010.executeAllOnDecision();
};
expj.AD0030010.AD0030010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030010', 'AD0030010form1', 'JOB_ODR_CD', this);
  });
  expj.AD0030010.AD0030010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030010-AD0030010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AD0030010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAD0030010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-PeekerJOB_ODR_CD">
expj.AD0030010.AD0030010form1.PeekerJOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AD0030010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AD0030010.AD0030010form1.PeekerJOB_ODR_CD.onClick0 = function () {
  console.log('PeekerJOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030010';
var parameterValues = 'PeekerJOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_12%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030010.AD0030010form1.PeekerJOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030010.AD0030010form1.PeekerJOB_ODR_CD['onClick' + i])) {
        expj.AD0030010.AD0030010form1.PeekerJOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AD0030010.AD0030010form1.PeekerJOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AD0030010.AD0030010form1.PeekerJOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-PeekerJOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030010', 'AD0030010form1', 'PeekerJOB_ODR_CD', this, 'Button');
    }
  });
  expj.AD0030010.AD0030010form1.PeekerJOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.PeekerJOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/PeekerJOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-PeekerJOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030010-AD0030010form1-PeekerJOB_ODR_CD" class="AD0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010form1-c_JOB_ODR_CD">
expj.AD0030010.AD0030010form1.c_JOB_ODR_CD = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.onLoad0 = function () {
  console.log('c_JOB_ODR_CD script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0,*1"
expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.onClick0 = function () {
  console.log('c_JOB_ODR_CD script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030010', 'AD0030010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AD0030010form1/JOB_ODR_CD,_AD0030010form1/PeekerJOB_ODR_CD"
expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.child0 = function () {
  console.log('c_JOB_ODR_CD script3');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/PeekerJOB_ODR_CD');
};
// script4="child;1;MASK;_AD0030010form1/JOB_ODR_CD,_AD0030010form1/PeekerJOB_ODR_CD@*2"
expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.child1 = function () {
  console.log('c_JOB_ODR_CD script4');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0030010', 'AD0030010form1', '_AD0030010form1/PeekerJOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;SET;_AD0030010form1/JOB_ODR_CD="
expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.child2 = function () {
  console.log('c_JOB_ODR_CD script5');
expj.common.pscript.setReferenceComponentValue('AD0030010', 'AD0030010form1', '_AD0030010form1/JOB_ODR_CD', '');
};
expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030010.AD0030010form1.c_JOB_ODR_CD['onClick' + i])) {
        expj.AD0030010.AD0030010form1.c_JOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0030010form1/c_JOB_ODR_CD.onDecision');
  expj.AD0030010.AD0030010form1.executeAllOnDecision();
  expj.AD0030010.executeAllOnDecision();
};
expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-c_JOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030010', 'AD0030010form1', 'c_JOB_ODR_CD', this, 'CheckBox');
    }
  });
  expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/c_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-c_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0030010.AD0030010form1.c_JOB_ODR_CD['onLoad' + i])) {
      expj.AD0030010.AD0030010form1.c_JOB_ODR_CD['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_CD" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030010Struct.getc_JOB_ODR_CD())) || "1".equals(TypeConverter.convert(aAD0030010Struct.getc_JOB_ODR_CD())))?"checked=\"checked\"":"" %>  class="AD0030010-focus-move" id="expj-AD0030010-AD0030010form1-c_JOB_ODR_CD"><label for="expj-AD0030010-AD0030010form1-c_JOB_ODR_CD"><%=CoreTools.getRBString("Expj.Cmt0208",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030010-AD0030010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0030010-AD0030010form1-TIME_CTRL">
expj.AD0030010.AD0030010form1.TIME_CTRL = {};
expj.AD0030010.AD0030010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0030010form1/TIME_CTRL.onDecision');
  expj.AD0030010.AD0030010form1.executeAllOnDecision();
  expj.AD0030010.executeAllOnDecision();
};
expj.AD0030010.AD0030010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030010', 'AD0030010form1', 'TIME_CTRL', this);
  });
  expj.AD0030010.AD0030010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0030010.AD0030010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0030010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010form1-TIME_CTRL');
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
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0030010-AD0030010button1">
expj.AD0030010.AD0030010button1 = {};
expj.AD0030010.AD0030010button1.executeAllOnDecision = function () {
  console.log('execute AD0030010button1.onDecision');
};
expj.AD0030010.AD0030010button1.executeOnLoad = function () {
  expj.AD0030010.AD0030010button1.executePScriptOnLoad();
};

expj.AD0030010.AD0030010button1.executePScriptOnLoad = function () {
  console.log('execute AD0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030010-AD0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030010-AD0030010button1-Execute">
expj.AD0030010.AD0030010button1.Execute = {};
// script1="onClick;0;CHK;~LEN(_AD0030010form1/OPR_INST_START_TIME)[eq]1[or]~LEN(_AD0030010form1/OPR_INST_START_TIME)[eq]2@!AS00029"
expj.AD0030010.AD0030010button1.Execute.onClick0 = function () {
  console.log('Execute script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030010', 'AD0030010button1', '_AD0030010form1/OPR_INST_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030010', 'AD0030010button1', '_AD0030010form1/OPR_INST_START_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030010', 'AD0030010button1', 'AS00029');
}
};
// script2="onClick;1;CHK;~LEN(_AD0030010form1/PRD_DUE_TIME)[eq]1[or]~LEN(_AD0030010form1/PRD_DUE_TIME)[eq]2@!AS00027"
expj.AD0030010.AD0030010button1.Execute.onClick1 = function () {
  console.log('Execute script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030010', 'AD0030010button1', '_AD0030010form1/PRD_DUE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030010', 'AD0030010button1', '_AD0030010form1/PRD_DUE_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030010', 'AD0030010button1', 'AS00027');
}
};
// script3="onClick;2;CHK;~LEN(_AD0030010form1/OPR_INST_START_TIME)[eq]3@*3"
expj.AD0030010.AD0030010button1.Execute.onClick2 = function () {
  console.log('Execute script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030010', 'AD0030010button1', '_AD0030010form1/OPR_INST_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;3;CHK;[{~CHARAT(_AD0030010form1/OPR_INST_START_TIME:1)}*10+{~CHARAT(_AD0030010form1/OPR_INST_START_TIME:2)}][gte]60@!AS00030"
expj.AD0030010.AD0030010button1.Execute.child3 = function () {
  console.log('Execute script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/OPR_INST_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/OPR_INST_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030010', 'AD0030010button1', 'AS00030');
}
};
// script5="onClick;4;CHK;~LEN(_AD0030010form1/PRD_DUE_TIME)[eq]3@*5"
expj.AD0030010.AD0030010button1.Execute.onClick4 = function () {
  console.log('Execute script5');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030010', 'AD0030010button1', '_AD0030010form1/PRD_DUE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;5;CHK;[{~CHARAT(_AD0030010form1/PRD_DUE_TIME:1)}*10+{~CHARAT(_AD0030010form1/PRD_DUE_TIME:2)}][gte]60@!AS00028"
expj.AD0030010.AD0030010button1.Execute.child5 = function () {
  console.log('Execute script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/PRD_DUE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/PRD_DUE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030010', 'AD0030010button1', 'AS00028');
}
};
// script7="onClick;6;CHK;~LEN(_AD0030010form1/OPR_INST_START_TIME)[eq]4@*7"
expj.AD0030010.AD0030010button1.Execute.onClick6 = function () {
  console.log('Execute script7');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030010', 'AD0030010button1', '_AD0030010form1/OPR_INST_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;7;CHK;[{~CHARAT(_AD0030010form1/OPR_INST_START_TIME:0)}*10+{~CHARAT(_AD0030010form1/OPR_INST_START_TIME:1)}][gte]24[or][{~CHARAT(_AD0030010form1/OPR_INST_START_TIME:2)}*10+{~CHARAT(_AD0030010form1/OPR_INST_START_TIME:3)}][gte]60@!AS00030"
expj.AD0030010.AD0030010button1.Execute.child7 = function () {
  console.log('Execute script8');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/OPR_INST_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/OPR_INST_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/OPR_INST_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/OPR_INST_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030010', 'AD0030010button1', 'AS00030');
}
};
// script9="onClick;8;CHK;~LEN(_AD0030010form1/PRD_DUE_TIME)[eq]4@*9"
expj.AD0030010.AD0030010button1.Execute.onClick8 = function () {
  console.log('Execute script9');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030010', 'AD0030010button1', '_AD0030010form1/PRD_DUE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="child;9;CHK;[{~CHARAT(_AD0030010form1/PRD_DUE_TIME:0)}*10+{~CHARAT(_AD0030010form1/PRD_DUE_TIME:1)}][gte]24[or][{~CHARAT(_AD0030010form1/PRD_DUE_TIME:2)}*10+{~CHARAT(_AD0030010form1/PRD_DUE_TIME:3)}][gte]60@!AS00028"
expj.AD0030010.AD0030010button1.Execute.child9 = function () {
  console.log('Execute script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/PRD_DUE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/PRD_DUE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/PRD_DUE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030010', 'AD0030010button1', '_AD0030010form1/PRD_DUE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030010', 'AD0030010button1', 'AS00028');
}
};
// script11="onClick;10;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030010form1/*@AD0030010Servlet,,$ZZ07010"
expj.AD0030010.AD0030010button1.Execute.onClick10 = function () {
  console.log('Execute script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030010', 'AD0030010button1', '_AD0030010form1/*', 'AD0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030010', response);
expj.common.updateBusinessScreenTab('AD0030010', contents);
};
expj.common.pscript.callConfirm('AD0030010', 'AD0030010button1', 'ZZ07010', okEvent);
};
expj.AD0030010.AD0030010button1.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030010.AD0030010button1.Execute['onClick' + i])) {
        expj.AD0030010.AD0030010button1.Execute['onClick' + i]();
      }
    }
  }
};
expj.AD0030010.AD0030010button1.Execute.executeAllOnDecision = function () {
};
expj.AD0030010.AD0030010button1.Execute.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010button1-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030010', 'AD0030010button1', 'Execute', this, 'Button');
    }
  });
  expj.AD0030010.AD0030010button1.Execute.executePScriptOnLoad();
};

expj.AD0030010.AD0030010button1.Execute.executePScriptOnLoad = function () {
  console.log('execute AD0030010button1/Execute.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010button1-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030010-AD0030010button1-Execute" name="Execute" class="AD0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
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
<span class="version">AD0030010 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AD0030010-AD0030010button0">
expj.AD0030010.AD0030010button0 = {};
expj.AD0030010.AD0030010button0.executeAllOnDecision = function () {
  console.log('execute AD0030010button0.onDecision');
};
expj.AD0030010.AD0030010button0.executeOnLoad = function () {
  expj.AD0030010.AD0030010button0.executePScriptOnLoad();
};

expj.AD0030010.AD0030010button0.executePScriptOnLoad = function () {
  console.log('execute AD0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030010-AD0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030010-AD0030010button0-Clear">
expj.AD0030010.AD0030010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030010form1/*@AD0030010Servlet,,$ZZ07008"
expj.AD0030010.AD0030010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030010', 'AD0030010button0', '_AD0030010form1/*', 'AD0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030010', response);
expj.common.updateBusinessScreenTab('AD0030010', contents);
};
expj.common.pscript.callConfirm('AD0030010', 'AD0030010button0', 'ZZ07008', okEvent);
};
expj.AD0030010.AD0030010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030010.AD0030010button0.Clear['onClick' + i])) {
        expj.AD0030010.AD0030010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0030010.AD0030010button0.Clear.executeAllOnDecision = function () {
};
expj.AD0030010.AD0030010button0.Clear.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030010', 'AD0030010button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0030010.AD0030010button0.Clear.executePScriptOnLoad();
};

expj.AD0030010.AD0030010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0030010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030010-AD0030010button0-Clear" name="Clear" class="AD0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0030010-AD0030010button0-Close">
expj.AD0030010.AD0030010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0030010.AD0030010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0030010');
};
expj.AD0030010.AD0030010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030010.AD0030010button0.Close['onClick' + i])) {
        expj.AD0030010.AD0030010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0030010.AD0030010button0.Close.executeAllOnDecision = function () {
};
expj.AD0030010.AD0030010button0.Close.executeOnLoad = function () {
  $('#expj-AD0030010-AD0030010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030010', 'AD0030010button0', 'Close', this, 'Button');
    }
  });
  expj.AD0030010.AD0030010button0.Close.executePScriptOnLoad();
};

expj.AD0030010.AD0030010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0030010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0030010-AD0030010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030010-AD0030010button0-Close" name="Close" class="AD0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0030010 (END)-->
<%
MessageStruct msgStruct = aAD0030010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0030010)) {
  expj.common.treeInstanceMap.AD0030010 = {};
}
expj.common.treeInstanceMap.AD0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030010)) {
  expj.common.detailDialogMap.AD0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0030010)) {
  expj.common.viewInstanceMap.AD0030010 = {};
}
expj.common.viewInstanceMap.AD0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0030010.<%=viewId %>.init = function () {
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
    expj.AD0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0030010_init">
/**
 * AD0030010用のロード完了時初期化関数
 */
expj.AD0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0030010');
  expj.common.calendarInstanceMap.AD0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0030010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0030010.AD0030010form1.OPR_INST_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.CalendarOprInstStartDate.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.OPR_INST_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.r1_MODE.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.PRD_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.CalendarPrdDueDate.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.PRD_DUE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.r2_MODE.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.PeekerJOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.c_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010button1.Execute.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010form1.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010button1.executeOnLoad();}catch(e){};
  try{expj.AD0030010.AD0030010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0030010', 'AD0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0030010', '<%=request.getContextPath() %>');
};

/**
 * AD0030010の全体onDecision処理
 */
expj.AD0030010.executeAllOnDecision = function () {
  expj.AD0030010.AD0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0030010_console">
expj.AD0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>