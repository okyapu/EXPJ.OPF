<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:05:50 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0090\AE0090040.html
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
<jsp:useBean id="aAE0090040Control" class="com.nec.jp.orteus.metamorBase.AE0090.AE0090040Control" scope="request"/>
<jsp:useBean id="aAE0090040Struct" class="com.nec.jp.orteus.metamorBase.AE0090.AE0090040Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製品構成別発注残参照(ツリー)
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/jsp/AE0090040.jsp,v $
$Author: geng-jia $
$Revision: 1.14 $ $Date: 2017/02/22 02:05:21 $
********************************************************* --%>
<html>
<head>
<title>製品構成別発注残参照(ツリー)</title>
<%@include file="common/expj_v5.jsp" %>
<% ScreenMoveUtil su = new ScreenMoveUtil("AG0010010Servlet", so); %>
<% ScreenMoveUtil su2 = new ScreenMoveUtil("AG0030010Servlet", so); %>

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
<script class="expj-script-AE0090040_init">
  // AE0090040名前空間
  expj.AE0090040 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>


  <div id="expj-business-screen-AE0090040" data-screen="AE0090040" data-newdata="<%=aAE0090040Control.isNewData() %>">
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

            <div class="expj-td frame05" style="">            <script class="expj-script-AE0090040-AE0090040form1">
expj.AE0090040.AE0090040form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AE0090040.AE0090040form1.onLoad0 = function () {
  console.log('AE0090040form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*2,*1"
expj.AE0090040.AE0090040form1.onDecision0 = function () {
  console.log('AE0090040form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0090040', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHKRQ;?AE0090040tree1/*[eq]SELECTED@*5,*7"
expj.AE0090040.AE0090040form1.onDecision1 = function () {
  console.log('AE0090040form1 script3');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040form1', '?AE0090040tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script4="onDecision;2;CHKRQ;?AE0090040tree1/*[eq]SELECTED@*5,*7"
expj.AE0090040.AE0090040form1.onDecision2 = function () {
  console.log('AE0090040form1 script4');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040form1', '?AE0090040tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script6="child;1;MASK;_AE0090040button1/TreeSelect,_AE0090040button1/ViewSelect"
expj.AE0090040.AE0090040form1.child1 = function () {
  console.log('AE0090040form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AE0090040', 'AE0090040form1', '_AE0090040button1/TreeSelect');
expj.common.pscript.setMaskToReferenceComponent('AE0090040', 'AE0090040form1', '_AE0090040button1/ViewSelect');
};
// script7="child;2;UNMASK;_AE0090040button1/TreeSelect,_AE0090040button1/ViewSelect"
expj.AE0090040.AE0090040form1.child2 = function () {
  console.log('AE0090040form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090040', 'AE0090040form1', '_AE0090040button1/TreeSelect');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090040', 'AE0090040form1', '_AE0090040button1/ViewSelect');
};
// script8="child;3;UNMASK;_AE0090040button1/ViewSelect@*4"
expj.AE0090040.AE0090040form1.child3 = function () {
  console.log('AE0090040form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090040', 'AE0090040form1', '_AE0090040button1/ViewSelect');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script9="child;4;MASK;_AE0090040button1/TreeSelect"
expj.AE0090040.AE0090040form1.child4 = function () {
  console.log('AE0090040form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AE0090040', 'AE0090040form1', '_AE0090040button1/TreeSelect');
};
// script10="child;5;CHK;?AE0090040form1/*[eq]NORMAL[and]?AE0090040form1/Target_ITEM_CD[eq]SAME[and]?AE0090040form1/DEVELOP_TYP[eq]SAME[and]?AE0090040form1/TargetDate[eq]SAME@*6,*7"
expj.AE0090040.AE0090040form1.child5 = function () {
  console.log('AE0090040form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040form1', '?AE0090040form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040form1', '?AE0090040form1/Target_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040form1', '?AE0090040form1/DEVELOP_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040form1', '?AE0090040form1/TargetDate'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_AE0090040button0/StockInquiry,_AE0090040button0/ValidStockInquiry"
expj.AE0090040.AE0090040form1.child6 = function () {
  console.log('AE0090040form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090040', 'AE0090040form1', '_AE0090040button0/StockInquiry');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090040', 'AE0090040form1', '_AE0090040button0/ValidStockInquiry');
};
// script12="child;7;MASK;_AE0090040button0/StockInquiry,_AE0090040button0/ValidStockInquiry"
expj.AE0090040.AE0090040form1.child7 = function () {
  console.log('AE0090040form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AE0090040', 'AE0090040form1', '_AE0090040button0/StockInquiry');
expj.common.pscript.setMaskToReferenceComponent('AE0090040', 'AE0090040form1', '_AE0090040button0/ValidStockInquiry');
};
expj.AE0090040.AE0090040form1.executeAllOnDecision = function () {
  console.log('execute AE0090040form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040form1['onDecision' + i])) {
        expj.AE0090040.AE0090040form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040form1.executeOnLoad = function () {
  expj.AE0090040.AE0090040form1.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0090040.AE0090040form1['onLoad' + i])) {
      expj.AE0090040.AE0090040form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0090040-AE0090040form1" action="AE0090040Servlet" name="AE0090040form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0090040Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-PLANT_CD">
expj.AE0090040.AE0090040form1.PLANT_CD = {};
expj.AE0090040.AE0090040form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AE0090040form1/PLANT_CD.onDecision');
  expj.AE0090040.AE0090040form1.executeAllOnDecision();
  expj.AE0090040.executeAllOnDecision();
};
expj.AE0090040.AE0090040form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090040', 'AE0090040form1', 'PLANT_CD', this);
  });
  expj.AE0090040.AE0090040form1.PLANT_CD.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0090040-AE0090040form1-PLANT_CD" name="PLANT_CD" class="AE0090040-focus-move  " style="width:260px;" data-kind="OBT_AN;" value="<%= TypeConverter.sanitizer(aAE0090040Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-PeekerPLANT_CD">
expj.AE0090040.AE0090040form1.PeekerPLANT_CD = {};
// script1="onClick;0;PEEKER;_AE0090040form1/PLANT_CD@<%=contextNo%>"
expj.AE0090040.AE0090040form1.PeekerPLANT_CD.onClick0 = function () {
  console.log('PeekerPLANT_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0090040';
var parameterValues = 'PeekerPLANT_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040form1', '_AE0090040form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0090040form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0090040%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0090040.AE0090040form1.PeekerPLANT_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040form1.PeekerPLANT_CD['onClick' + i])) {
        expj.AE0090040.AE0090040form1.PeekerPLANT_CD['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040form1.PeekerPLANT_CD.executeAllOnDecision = function () {
};
expj.AE0090040.AE0090040form1.PeekerPLANT_CD.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-PeekerPLANT_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090040', 'AE0090040form1', 'PeekerPLANT_CD', this, 'Button');
    }
  });
  expj.AE0090040.AE0090040form1.PeekerPLANT_CD.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.PeekerPLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/PeekerPLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-PeekerPLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090040-AE0090040form1-PeekerPLANT_CD" class="AE0090040-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt3140",rb)%></span><!-- 期間2起点日 --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-TERM2STARTDATE">
expj.AE0090040.AE0090040form1.TERM2STARTDATE = {};
expj.AE0090040.AE0090040form1.TERM2STARTDATE.executeAllOnDecision = function () {
  console.log('execute AE0090040form1/TERM2STARTDATE.onDecision');
  expj.AE0090040.AE0090040form1.executeAllOnDecision();
  expj.AE0090040.executeAllOnDecision();
};
expj.AE0090040.AE0090040form1.TERM2STARTDATE.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-TERM2STARTDATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090040', 'AE0090040form1', 'TERM2STARTDATE', this);
  });
  expj.AE0090040.AE0090040form1.TERM2STARTDATE.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.TERM2STARTDATE.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/TERM2STARTDATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-TERM2STARTDATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0090040-AE0090040form1-TERM2STARTDATE" name="TERM2STARTDATE" class="AE0090040-focus-move  required-value expj-AE0090040-required-A" style="width:100%;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0090040Struct.getTERM2STARTDATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-CalendarTERM2STARTDATE">
expj.AE0090040.AE0090040form1.CalendarTERM2STARTDATE = {};
// script1="onClick;0;CALENDAR;_AE0090040form1/TERM2STARTDATE@<%=contextNo%>"
expj.AE0090040.AE0090040form1.CalendarTERM2STARTDATE.onClick0 = function () {
  console.log('CalendarTERM2STARTDATE script1');
expj.common.pscript.executeCalendar('AE0090040','AE0090040form1','_AE0090040form1/TERM2STARTDATE');
};
expj.AE0090040.AE0090040form1.CalendarTERM2STARTDATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040form1.CalendarTERM2STARTDATE['onClick' + i])) {
        expj.AE0090040.AE0090040form1.CalendarTERM2STARTDATE['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040form1.CalendarTERM2STARTDATE.executeAllOnDecision = function () {
};
expj.AE0090040.AE0090040form1.CalendarTERM2STARTDATE.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-CalendarTERM2STARTDATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090040', 'AE0090040form1', 'CalendarTERM2STARTDATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0090040','AE0090040form1','_AE0090040form1/TERM2STARTDATE');
  expj.AE0090040.AE0090040form1.CalendarTERM2STARTDATE.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.CalendarTERM2STARTDATE.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/CalendarTERM2STARTDATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-CalendarTERM2STARTDATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090040-AE0090040form1-CalendarTERM2STARTDATE" class="AE0090040-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_6",rb)%></span><!-- 対象品目番号 --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-Target_ITEM_CD">
expj.AE0090040.AE0090040form1.Target_ITEM_CD = {};
expj.AE0090040.AE0090040form1.Target_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AE0090040form1/Target_ITEM_CD.onDecision');
  expj.AE0090040.AE0090040form1.executeAllOnDecision();
  expj.AE0090040.executeAllOnDecision();
};
expj.AE0090040.AE0090040form1.Target_ITEM_CD.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-Target_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090040', 'AE0090040form1', 'Target_ITEM_CD', this);
  });
  expj.AE0090040.AE0090040form1.Target_ITEM_CD.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.Target_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/Target_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-Target_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0090040-AE0090040form1-Target_ITEM_CD" name="Target_ITEM_CD" class="AE0090040-focus-move  required-value expj-AE0090040-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090040Struct.getTarget_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-PeekerTargetItemCd">
expj.AE0090040.AE0090040form1.PeekerTargetItemCd = {};
// script1="onClick;0;PEEKER;_AE0090040form1/Target_ITEM_CD@<%=contextNo%>"
expj.AE0090040.AE0090040form1.PeekerTargetItemCd.onClick0 = function () {
  console.log('PeekerTargetItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0090040';
var parameterValues = 'PeekerTargetItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040form1', '_Target_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0090040form1/Target_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0090040%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0090040.AE0090040form1.PeekerTargetItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040form1.PeekerTargetItemCd['onClick' + i])) {
        expj.AE0090040.AE0090040form1.PeekerTargetItemCd['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040form1.PeekerTargetItemCd.executeAllOnDecision = function () {
};
expj.AE0090040.AE0090040form1.PeekerTargetItemCd.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-PeekerTargetItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090040', 'AE0090040form1', 'PeekerTargetItemCd', this, 'Button');
    }
  });
  expj.AE0090040.AE0090040form1.PeekerTargetItemCd.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.PeekerTargetItemCd.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/PeekerTargetItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-PeekerTargetItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090040-AE0090040form1-PeekerTargetItemCd" class="AE0090040-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0017",rb)%></span><!-- 展開区分 --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-DEVELOP_TYP">
expj.AE0090040.AE0090040form1.DEVELOP_TYP = {};
expj.AE0090040.AE0090040form1.DEVELOP_TYP.executeAllOnDecision = function () {
  console.log('execute AE0090040form1/DEVELOP_TYP.onDecision');
  expj.AE0090040.AE0090040form1.executeAllOnDecision();
  expj.AE0090040.executeAllOnDecision();
};
expj.AE0090040.AE0090040form1.DEVELOP_TYP.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-DEVELOP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AE0090040', 'AE0090040form1', 'DEVELOP_TYP', this);
  });
  expj.AE0090040.AE0090040form1.DEVELOP_TYP.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.DEVELOP_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/DEVELOP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-DEVELOP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AE0090040-AE0090040form1-DEVELOP_TYP" name='DEVELOP_TYP' class='AE0090040-focus-move' style='width:260px;'><%  for(int i = 0, size = aAE0090040Control.getStruct().getList_DEVELOP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAE0090040Control.getStruct().getList_DEVELOP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAE0090040Control.getStruct().getList_DEVELOP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAE0090040Struct.getDEVELOP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_3",rb)%></span><!-- 対象日付 --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-TargetDate">
expj.AE0090040.AE0090040form1.TargetDate = {};
expj.AE0090040.AE0090040form1.TargetDate.executeAllOnDecision = function () {
  console.log('execute AE0090040form1/TargetDate.onDecision');
  expj.AE0090040.AE0090040form1.executeAllOnDecision();
  expj.AE0090040.executeAllOnDecision();
};
expj.AE0090040.AE0090040form1.TargetDate.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-TargetDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090040', 'AE0090040form1', 'TargetDate', this);
  });
  expj.AE0090040.AE0090040form1.TargetDate.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.TargetDate.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/TargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-TargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0090040-AE0090040form1-TargetDate" name="TargetDate" class="AE0090040-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0090040Struct.getTargetDate()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-CalendarTargetDate">
expj.AE0090040.AE0090040form1.CalendarTargetDate = {};
// script1="onClick;0;CALENDAR;_AE0090040form1/TargetDate"
expj.AE0090040.AE0090040form1.CalendarTargetDate.onClick0 = function () {
  console.log('CalendarTargetDate script1');
expj.common.pscript.executeCalendar('AE0090040','AE0090040form1','_AE0090040form1/TargetDate');
};
expj.AE0090040.AE0090040form1.CalendarTargetDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040form1.CalendarTargetDate['onClick' + i])) {
        expj.AE0090040.AE0090040form1.CalendarTargetDate['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040form1.CalendarTargetDate.executeAllOnDecision = function () {
};
expj.AE0090040.AE0090040form1.CalendarTargetDate.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-CalendarTargetDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090040', 'AE0090040form1', 'CalendarTargetDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0090040','AE0090040form1','_AE0090040form1/TargetDate');
  expj.AE0090040.AE0090040form1.CalendarTargetDate.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.CalendarTargetDate.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/CalendarTargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-CalendarTargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090040-AE0090040form1-CalendarTargetDate" class="AE0090040-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0018",rb)%></span><!-- 初期展開レベル --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-InitLevel">
expj.AE0090040.AE0090040form1.InitLevel = {};
expj.AE0090040.AE0090040form1.InitLevel.executeAllOnDecision = function () {
  console.log('execute AE0090040form1/InitLevel.onDecision');
  expj.AE0090040.AE0090040form1.executeAllOnDecision();
  expj.AE0090040.executeAllOnDecision();
};
expj.AE0090040.AE0090040form1.InitLevel.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-InitLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090040', 'AE0090040form1', 'InitLevel', this);
  });
  expj.AE0090040.AE0090040form1.InitLevel.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.InitLevel.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/InitLevel.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-InitLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0090040-AE0090040form1-InitLevel" name="InitLevel" class="AE0090040-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;8" value="<%= TypeConverter.sanitizer(aAE0090040Struct.getInitLevel()) %>" maxlength="2147483647" ></div><!--/td-->
<input type="hidden" id="expj-AE0090040-AE0090040form1-h_MaxLevel" name="h_MaxLevel" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0090040Struct.geth_MaxLevel()) %>">
<script class="expj-script-AE0090040-AE0090040form1-h_MaxLevel">
expj.AE0090040.AE0090040form1.h_MaxLevel = {};
expj.AE0090040.AE0090040form1.h_MaxLevel.executeAllOnDecision = function () {
  console.log('execute AE0090040form1/h_MaxLevel.onDecision');
  expj.AE0090040.AE0090040form1.executeAllOnDecision();
  expj.AE0090040.executeAllOnDecision();
};
expj.AE0090040.AE0090040form1.h_MaxLevel.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-h_MaxLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090040', 'AE0090040form1', 'h_MaxLevel', this);
  });
  expj.AE0090040.AE0090040form1.h_MaxLevel.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.h_MaxLevel.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/h_MaxLevel.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-h_MaxLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_UNIT_QTY_1",rb)%></span><!-- 必要数 --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040form1-NEED_QTY_1">
expj.AE0090040.AE0090040form1.NEED_QTY_1 = {};
expj.AE0090040.AE0090040form1.NEED_QTY_1.executeAllOnDecision = function () {
  console.log('execute AE0090040form1/NEED_QTY_1.onDecision');
  expj.AE0090040.AE0090040form1.executeAllOnDecision();
  expj.AE0090040.executeAllOnDecision();
};
expj.AE0090040.AE0090040form1.NEED_QTY_1.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040form1-NEED_QTY_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090040', 'AE0090040form1', 'NEED_QTY_1', this);
  });
  expj.AE0090040.AE0090040form1.NEED_QTY_1.executePScriptOnLoad();
};

expj.AE0090040.AE0090040form1.NEED_QTY_1.executePScriptOnLoad = function () {
  console.log('execute AE0090040form1/NEED_QTY_1.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040form1-NEED_QTY_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0090040-AE0090040form1-NEED_QTY_1" name="NEED_QTY_1" class="AE0090040-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;18.0;ROUND;4" value="<%= TypeConverter.sanitizer(aAE0090040Struct.getNEED_QTY_1()) %>" maxlength="18" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0090040-AE0090040button1">
expj.AE0090040.AE0090040button1 = {};
expj.AE0090040.AE0090040button1.executeAllOnDecision = function () {
  console.log('execute AE0090040button1.onDecision');
};
expj.AE0090040.AE0090040button1.executeOnLoad = function () {
  expj.AE0090040.AE0090040button1.executePScriptOnLoad();
};

expj.AE0090040.AE0090040button1.executePScriptOnLoad = function () {
  console.log('execute AE0090040button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0090040-AE0090040button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0090040-AE0090040button1-TreeSelect">
expj.AE0090040.AE0090040button1.TreeSelect = {};
// script1="onClick;0;CHK;_AE0090040form1/InitLevel[gt]_AE0090040form1/h_MaxLevel@#AA20001:_AE0090040form1/h_MaxLevel"
expj.AE0090040.AE0090040button1.TreeSelect.onClick0 = function () {
  console.log('TreeSelect script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040button1', '_AE0090040form1/InitLevel')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040button1', '_AE0090040form1/h_MaxLevel')))) {
expj.common.pscript.addErrorMessage('AE0090040', 'AE0090040button1', 'AA20001:_AE0090040form1/h_MaxLevel');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0090040form1/*@AE0090040Servlet"
expj.AE0090040.AE0090040button1.TreeSelect.onClick1 = function () {
  console.log('TreeSelect script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090040', 'AE0090040button1', '_AE0090040form1/*', 'AE0090040Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090040Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090040', response);
expj.common.updateBusinessScreenTab('AE0090040', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0090040.AE0090040button1.TreeSelect.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040button1.TreeSelect['onClick' + i])) {
        expj.AE0090040.AE0090040button1.TreeSelect['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040button1.TreeSelect.executeAllOnDecision = function () {
};
expj.AE0090040.AE0090040button1.TreeSelect.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040button1-TreeSelect').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090040', 'AE0090040button1', 'TreeSelect', this, 'Button');
    }
  });
  expj.AE0090040.AE0090040button1.TreeSelect.executePScriptOnLoad();
};

expj.AE0090040.AE0090040button1.TreeSelect.executePScriptOnLoad = function () {
  console.log('execute AE0090040button1/TreeSelect.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040button1-TreeSelect');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090040-AE0090040button1-TreeSelect" name="TreeSelect" class="AE0090040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnTreeSelect",rb)%></button><!-- ツリー読込ボタン --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040button1-ViewSelect">
expj.AE0090040.AE0090040button1.ViewSelect = {};
// script1="onClick;0;CHK;_AE0090040form1/InitLevel[gt]_AE0090040form1/h_MaxLevel@#AA20001:_AE0090040form1/h_MaxLevel"
expj.AE0090040.AE0090040button1.ViewSelect.onClick0 = function () {
  console.log('ViewSelect script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040button1', '_AE0090040form1/InitLevel')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0090040', 'AE0090040button1', '_AE0090040form1/h_MaxLevel')))) {
expj.common.pscript.addErrorMessage('AE0090040', 'AE0090040button1', 'AA20001:_AE0090040form1/h_MaxLevel');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0090040form1/*@AE0090040Servlet,,"
expj.AE0090040.AE0090040button1.ViewSelect.onClick1 = function () {
  console.log('ViewSelect script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090040', 'AE0090040button1', '_AE0090040form1/*', 'AE0090040Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090040Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090040', response);
expj.common.changeBusinessScreenTab('AE0090040', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0090040.AE0090040button1.ViewSelect.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040button1.ViewSelect['onClick' + i])) {
        expj.AE0090040.AE0090040button1.ViewSelect['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040button1.ViewSelect.executeAllOnDecision = function () {
};
expj.AE0090040.AE0090040button1.ViewSelect.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040button1-ViewSelect').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090040', 'AE0090040button1', 'ViewSelect', this, 'Button');
    }
  });
  expj.AE0090040.AE0090040button1.ViewSelect.executePScriptOnLoad();
};

expj.AE0090040.AE0090040button1.ViewSelect.executePScriptOnLoad = function () {
  console.log('execute AE0090040button1/ViewSelect.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040button1-ViewSelect');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090040-AE0090040button1-ViewSelect" name="ViewSelect" class="AE0090040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnViewSelect",rb)%></button><!-- 一覧読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><%
                String Context1 = CoreTools.getRBString("Expj.Cmt0243",rb);         // この品目で正展開
                String Context2 = CoreTools.getRBString("Expj.Cmt0244",rb);         // この品目で逆展開
              %><script class="expj-script-AE0090040-AE0090040tree1">
expj.AE0090040.AE0090040tree1 = {};
// script1="setContext;0;N1,T1;<%=Context1%>@0"
expj.AE0090040.AE0090040tree1.setContext0 = function () {
  console.log('AE0090040tree1 script1');
expj.AE0090040.AE0090040tree1.child0();
};
// script2="setContext;1;N1,T1;<%=Context2%>@1"
expj.AE0090040.AE0090040tree1.setContext1 = function () {
  console.log('AE0090040tree1 script2');
expj.AE0090040.AE0090040tree1.child1();
};
// script3="onClick;0;FSHOW;AE0090040float1@161"
expj.AE0090040.AE0090040tree1.onClick0 = function () {
  console.log('AE0090040tree1 script3');
expj.common.pscript.showDetailWindow('AE0090040', 'AE0090040float1', '161');
};
// script4="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ShowDetail=ACT,SUBMIT_BUTTON_TYPE=0,_AE0090040form1/*,_AE0090040tree1/+@AE0090040Servlet"
expj.AE0090040.AE0090040tree1.onClick1 = function () {
  console.log('AE0090040tree1 script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090040', 'AE0090040tree1', 'ShowDetail=ACT,SUBMIT_BUTTON_TYPE=0,_AE0090040form1/*,_AE0090040tree1/+', 'AE0090040Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090040Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090040', response);
expj.common.updateBusinessScreenTab('AE0090040', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script5="child;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ShowS_Tree=ACT,_AE0090040form1/*,_AE0090040tree1/+@AE0090040Servlet"
expj.AE0090040.AE0090040tree1.child0 = function () {
  console.log('AE0090040tree1 script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090040', 'AE0090040tree1', 'ShowS_Tree=ACT,_AE0090040form1/*,_AE0090040tree1/+', 'AE0090040Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090040Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090040', response);
expj.common.updateBusinessScreenTab('AE0090040', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script6="child;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ShowR_Tree=ACT,_AE0090040form1/*,_AE0090040tree1/+@AE0090040Servlet"
expj.AE0090040.AE0090040tree1.child1 = function () {
  console.log('AE0090040tree1 script6');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090040', 'AE0090040tree1', 'ShowR_Tree=ACT,_AE0090040form1/*,_AE0090040tree1/+', 'AE0090040Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090040Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090040', response);
expj.common.updateBusinessScreenTab('AE0090040', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script7="onDmyOpen;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,AddTree=ACT,_AE0090040form1/*,_AE0090040tree1/+@AE0090040Servlet"
expj.AE0090040.AE0090040tree1.onDmyOpen0 = function () {
  console.log('AE0090040tree1 script7');
var params = expj.common.pscript.createParameter('AE0090040', 'AE0090040tree1', 'AddTree=ACT,_AE0090040form1/*,_AE0090040tree1/+', 'AE0090040Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
return params;
};
expj.AE0090040.AE0090040tree1.setContextAll = function () {
  var controlData = [
    'N1,T1','N1,T1',
  ];
  var contextData = [
    {'title':'<%=Context1%>', 'action':expj.AE0090040.AE0090040tree1.setContext0},
    {'title':'<%=Context2%>', 'action':expj.AE0090040.AE0090040tree1.setContext1},
  ];
  var beforeFunc = function (event, ui) {
    expj.common.changeStateTreeContext(expj.common.treeInstanceMap.AE0090040.AE0090040tree1.gPrevSelectedNode, ui);
  };
  expj.common.createTreeContextInstance('#expj-AE0090040-AE0090040tree1-wrapper', '#expj-AE0090040-AE0090040tree1', contextData, controlData, beforeFunc);
};
expj.AE0090040.AE0090040tree1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040tree1['onClick' + i])) {
        expj.AE0090040.AE0090040tree1['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040tree1.executeAllOnDecision = function () {
  console.log('execute AE0090040tree1.onDecision');
};
expj.AE0090040.AE0090040tree1.executeOnLoad = function () {
<%
    treeClickEvent.put("AE0090040tree1", "expj.AE0090040.AE0090040tree1.executeAllOnClick");
%>
  expj.AE0090040.AE0090040tree1.setContextAll();
  expj.AE0090040.AE0090040tree1.executePScriptOnLoad();
};

expj.AE0090040.AE0090040tree1.executePScriptOnLoad = function () {
  console.log('execute AE0090040tree1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
if(aAE0090040Control.isNewData() == true){
%>
<div id="expj-AE0090040-AE0090040tree1-wrapper" class="expj-datagrid-tree" style="width:100%; height:100%; overflow:auto;background-color:#FFFFFF;">
<div id="expj-AE0090040-AE0090040tree1" data-orftype="Tree" data-mode="TREE" class="hasmenu" style="background-color:#FFFFFF;">
</div><!--Tree-->
</div>
<%
 treeId = "AE0090040tree1";
 treeXmlData = aAE0090040Control.getFlashTreeXML();
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-right" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0090040 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AE0090040-AE0090040button0">
expj.AE0090040.AE0090040button0 = {};
expj.AE0090040.AE0090040button0.executeAllOnDecision = function () {
  console.log('execute AE0090040button0.onDecision');
};
expj.AE0090040.AE0090040button0.executeOnLoad = function () {
  expj.AE0090040.AE0090040button0.executePScriptOnLoad();
};

expj.AE0090040.AE0090040button0.executePScriptOnLoad = function () {
  console.log('execute AE0090040button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0090040-AE0090040button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0090040-AE0090040button0-ValidStockInquiry">
expj.AE0090040.AE0090040button0.ValidStockInquiry = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AE0090040tree1/Lower_ITEM_CD,_AE0090040form1/PLANT_CD@AG0030010Servlet,<%=contextNo%>,<%=su2.getScreenName()%>,<%=su2.getScreenID()%>"
expj.AE0090040.AE0090040button0.ValidStockInquiry.onClick0 = function () {
  console.log('ValidStockInquiry script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090040', 'AE0090040button0', '_AE0090040tree1/Lower_ITEM_CD,_AE0090040form1/PLANT_CD', 'AG0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su2.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AG0030010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AG0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su2.getScreenName()%>', contents, 'AE0090040');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0090040.AE0090040button0.ValidStockInquiry.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040button0.ValidStockInquiry['onClick' + i])) {
        expj.AE0090040.AE0090040button0.ValidStockInquiry['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040button0.ValidStockInquiry.executeAllOnDecision = function () {
};
expj.AE0090040.AE0090040button0.ValidStockInquiry.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040button0-ValidStockInquiry').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090040', 'AE0090040button0', 'ValidStockInquiry', this, 'Button');
    }
  });
  expj.AE0090040.AE0090040button0.ValidStockInquiry.executePScriptOnLoad();
};

expj.AE0090040.AE0090040button0.ValidStockInquiry.executePScriptOnLoad = function () {
  console.log('execute AE0090040button0/ValidStockInquiry.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040button0-ValidStockInquiry');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090040-AE0090040button0-ValidStockInquiry" name="ValidStockInquiry" class="AE0090040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnValidStockInquiry",rb)%></button><!-- 有効在庫参照ボタン --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040button0-StockInquiry">
expj.AE0090040.AE0090040button0.StockInquiry = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AE0090040tree1/Lower_ITEM_CD,_AE0090040form1/PLANT_CD@AG0010010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AE0090040.AE0090040button0.StockInquiry.onClick0 = function () {
  console.log('StockInquiry script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090040', 'AE0090040button0', '_AE0090040tree1/Lower_ITEM_CD,_AE0090040form1/PLANT_CD', 'AG0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AG0010010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AG0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AE0090040');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0090040.AE0090040button0.StockInquiry.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040button0.StockInquiry['onClick' + i])) {
        expj.AE0090040.AE0090040button0.StockInquiry['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040button0.StockInquiry.executeAllOnDecision = function () {
};
expj.AE0090040.AE0090040button0.StockInquiry.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040button0-StockInquiry').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090040', 'AE0090040button0', 'StockInquiry', this, 'Button');
    }
  });
  expj.AE0090040.AE0090040button0.StockInquiry.executePScriptOnLoad();
};

expj.AE0090040.AE0090040button0.StockInquiry.executePScriptOnLoad = function () {
  console.log('execute AE0090040button0/StockInquiry.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040button0-StockInquiry');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090040-AE0090040button0-StockInquiry" name="StockInquiry" class="AE0090040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnStockInquiry",rb)%></button><!-- 在庫参照ボタン --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040button0-Clear">
expj.AE0090040.AE0090040button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0090040Servlet,,$ZZ07008"
expj.AE0090040.AE0090040button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090040', 'AE0090040button0', '', 'AE0090040Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090040Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090040', response);
expj.common.updateBusinessScreenTab('AE0090040', contents);
};
expj.common.pscript.callConfirm('AE0090040', 'AE0090040button0', 'ZZ07008', okEvent);
};
expj.AE0090040.AE0090040button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040button0.Clear['onClick' + i])) {
        expj.AE0090040.AE0090040button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040button0.Clear.executeAllOnDecision = function () {
};
expj.AE0090040.AE0090040button0.Clear.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090040', 'AE0090040button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0090040.AE0090040button0.Clear.executePScriptOnLoad();
};

expj.AE0090040.AE0090040button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0090040button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090040-AE0090040button0-Clear" name="Clear" class="AE0090040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0090040-AE0090040button0-Close">
expj.AE0090040.AE0090040button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0090040.AE0090040button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0090040');
};
expj.AE0090040.AE0090040button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090040.AE0090040button0.Close['onClick' + i])) {
        expj.AE0090040.AE0090040button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0090040.AE0090040button0.Close.executeAllOnDecision = function () {
};
expj.AE0090040.AE0090040button0.Close.executeOnLoad = function () {
  $('#expj-AE0090040-AE0090040button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090040', 'AE0090040button0', 'Close', this, 'Button');
    }
  });
  expj.AE0090040.AE0090040button0.Close.executePScriptOnLoad();
};

expj.AE0090040.AE0090040button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0090040button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0090040-AE0090040button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090040-AE0090040button0-Close" name="Close" class="AE0090040-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0090040 (END)-->
<%
  MessageStruct msgStruct = aAE0090040Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><script class="expj-script-AE0090040-AE0090040detailview1">
expj.AE0090040.AE0090040detailview1 = {};
expj.AE0090040.AE0090040detailview1.executeAllOnDecision = function () {
  console.log('execute AE0090040detailview1.onDecision');
};
expj.AE0090040.AE0090040detailview1.executeOnLoad = function () {
  expj.AE0090040.AE0090040detailview1.executePScriptOnLoad();
};

expj.AE0090040.AE0090040detailview1.executePScriptOnLoad = function () {
  console.log('execute AE0090040detailview1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAE0090040Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AE0090040-AE0090040detailview1" class="expj-datagird-detail" data-float="AE0090040float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AE0090040detailview1";
 detailFloat = "AE0090040float1";
 detailWidth = 358;
 detailHeight = 323 + 47;
 String AE0090040detailview1_Id = "AE0090040detailview1";
 String AE0090040detailview1_select = "single";
 String AE0090040detailview1_sortable = "true";
 String AE0090040detailview1_resize = "true";
 String AE0090040detailview1_scroll = "true";
 StringBuffer AE0090040detailview1_HB = new StringBuffer();
 StringBuffer AE0090040detailview1_DB = new StringBuffer();
%>
<%
 AE0090040detailview1_sortable = "false";
 AE0090040detailview1_select = "none";
%>
<% AE0090040detailview1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AE0090040detailview1_sortable).append("}").append(","); %>
<%  AE0090040detailview1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AE0090040detailview1_sortable).append("}").append(",");
AE0090040detailview1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AE0090040detailview1_sortable).append("}").append(",");
AE0090040detailview1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AE0090040detailview1_sortable).append("}").append(",");
 %>
  <% AE0090040detailview1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Parent_ITEM_CD\" class=\"expj-label\" data-name=\"Det_Parent_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Parent_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Parent_ITEM_NAME\" class=\"expj-label\" data-name=\"Det_Parent_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Parent_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['3','").append(CoreTools.getRBString("Expj.COMP_ITEM_CD_1",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_ITEM_CD\" class=\"expj-label\" data-name=\"Det_Comp_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['4','").append(CoreTools.getRBString("Expj.ITEM_NAME_1",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_ITEM_NAME\" class=\"expj-label\" data-name=\"Det_Comp_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['5','").append(CoreTools.getRBString("Expj.PS_UNIT_QTY_1",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_Need_QTY\" class=\"expj-label\" data-name=\"Det_Comp_Need_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;ROUND;4\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_Need_QTY())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['6','").append(CoreTools.getRBString("Expj.Cmt3076",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_ONHAND_QTY\" class=\"expj-label\" data-name=\"Det_Comp_ONHAND_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_ONHAND_QTY())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['7','").append(CoreTools.getRBString("Expj.Cmt3138",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-RECEIPT_SCHEDULES_NUMBER1\" class=\"expj-label\" data-name=\"RECEIPT_SCHEDULES_NUMBER1\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090040Struct.getRECEIPT_SCHEDULES_NUMBER1())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['8','").append(CoreTools.getRBString("Expj.Cmt3139",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-RECEIPT_SCHEDULES_NUMBER2\" class=\"expj-label\" data-name=\"RECEIPT_SCHEDULES_NUMBER2\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090040Struct.getRECEIPT_SCHEDULES_NUMBER2())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['9','").append(CoreTools.getRBString("Expj.STOCK_UNIT",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_STOCK_UNIT\" class=\"expj-label\" data-name=\"Det_Comp_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_STOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['10','").append(CoreTools.getRBString("Expj.Cmt3141",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_PRODUCT_TYP\" class=\"expj-label\" data-name=\"Det_Comp_PRODUCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_PRODUCT_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['11','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP_5",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_OUTSIDE_TYP\" class=\"expj-label\" data-name=\"Det_Comp_OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_OUTSIDE_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['12','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP_1",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"Det_Comp_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_MRP_ODR_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['13','").append(CoreTools.getRBString("Expj.PS_UNIT_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_PS_UNIT_QTY\" class=\"expj-label\" data-name=\"Det_Comp_PS_UNIT_QTY\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_PS_UNIT_QTY())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['14','").append(CoreTools.getRBString("Expj.Cmt1505",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_ITEM_SPOIL\" class=\"expj-label\" data-name=\"Det_Comp_ITEM_SPOIL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_ITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['15','").append(CoreTools.getRBString("Expj.PS_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_PS_SPOIL\" class=\"expj-label\" data-name=\"Det_Comp_PS_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_PS_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['16','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"Det_Comp_EFF_PHASE_IN_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['17','").append(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_EFF_PHASE_OUT_DATE\" class=\"expj-label\" data-name=\"Det_Comp_EFF_PHASE_OUT_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_EFF_PHASE_OUT_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['18','").append(CoreTools.getRBString("Expj.CONS_TYP",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_CONS_TYP\" class=\"expj-label\" data-name=\"Det_Comp_CONS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_CONS_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AE0090040detailview1_Id;
 detailViewSelect = AE0090040detailview1_select;
 detailViewResize = AE0090040detailview1_resize;
 detailViewScroll = AE0090040detailview1_scroll;
 detailViewHeaderData = AE0090040detailview1_HB;
 detailViewBodyData = AE0090040detailview1_DB;
%>
<%
}
%>
<%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0090040-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0090040)) {
  expj.common.treeInstanceMap.AE0090040 = {};
}
expj.common.treeInstanceMap.AE0090040.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0090040.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0090040.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0090040.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0090040.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0090040.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0090040.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0090040.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0090040.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = expj.AE0090040.AE0090040tree1.onDmyOpen0;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0090040-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0090040-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090040)) {
  expj.common.detailDialogMap.AE0090040 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090040._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0090040._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090040.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0090040.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090040.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090040.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0090040.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0090040.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0090040-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0090040-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0090040-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0090040.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0090040.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0090040._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0090040-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0090040)) {
  expj.common.viewInstanceMap.AE0090040 = {};
}
expj.common.viewInstanceMap.AE0090040.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0090040.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0090040.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0090040.<%=viewId %>.init = function () {
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
    expj.AE0090040.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0090040.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0090040-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0090040-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0090040_init">
/**
 * AE0090040用のロード完了時初期化関数
 */
expj.AE0090040.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0090040');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0090040');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0090040');
  expj.common.calendarInstanceMap.AE0090040 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0090040.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0090040.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0090040');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0090040');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0090040-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0090040-<%=detailId %>');
<%
 }
%>
  try{expj.AE0090040.AE0090040form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.PeekerPLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.TERM2STARTDATE.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.CalendarTERM2STARTDATE.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.Target_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.PeekerTargetItemCd.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.DEVELOP_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.TargetDate.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.CalendarTargetDate.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.InitLevel.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.h_MaxLevel.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.NEED_QTY_1.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040button1.TreeSelect.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040button1.ViewSelect.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040button0.ValidStockInquiry.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040button0.StockInquiry.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040form1.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040button1.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040tree1.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040button0.executeOnLoad();}catch(e){};
  try{expj.AE0090040.AE0090040detailview1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0090040.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0090040', 'AE0090040');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0090040');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0090040-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0090040-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0090040', '<%=request.getContextPath() %>');
};

/**
 * AE0090040の全体onDecision処理
 */
expj.AE0090040.executeAllOnDecision = function () {
  expj.AE0090040.AE0090040form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0090040_console">
expj.AE0090040.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>