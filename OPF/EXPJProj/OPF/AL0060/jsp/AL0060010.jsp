<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:45:52 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AL0060\AL0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AL0060.*" %>
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
<jsp:useBean id="aAL0060010Control" class="com.nec.jp.orteus.metamorBase.AL0060.AL0060010Control" scope="request"/>
<jsp:useBean id="aAL0060010Struct" class="com.nec.jp.orteus.metamorBase.AL0060.AL0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

���׎R�ς݃o�b�`���s
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0060/jsp/AL0060010.jsp,v $
$Author: geng-jia $    
$Revision: 1.6 $ $Date: 2017/02/22 02:06:20 $
********************************************************* --%>
<html>
<head>
<title>���׎R�ς݃o�b�`���s</title>
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
<script class="expj-script-AL0060010_init">
  // AL0060010���O���
  expj.AL0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AL0060010" data-screen="AL0060010" data-newdata="<%=aAL0060010Control.isNewData() %>">
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
              <script class="expj-script-AL0060010-AL0060010form1">
expj.AL0060010.AL0060010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AL0060010.AL0060010form1.onLoad0 = function () {
  console.log('AL0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AL0060010.AL0060010form1.onDecision0 = function () {
  console.log('AL0060010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AL0060010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AL0060010button1/Execute"
expj.AL0060010.AL0060010form1.child0 = function () {
  console.log('AL0060010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AL0060010', 'AL0060010form1', '_AL0060010button1/Execute');
};
// script4="child;1;MASK;_AL0060010button1/Execute"
expj.AL0060010.AL0060010form1.child1 = function () {
  console.log('AL0060010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AL0060010', 'AL0060010form1', '_AL0060010button1/Execute');
};
expj.AL0060010.AL0060010form1.executeAllOnDecision = function () {
  console.log('execute AL0060010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0060010.AL0060010form1['onDecision' + i])) {
        expj.AL0060010.AL0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.AL0060010.AL0060010form1.executeOnLoad = function () {
  expj.AL0060010.AL0060010form1.executePScriptOnLoad();
};

expj.AL0060010.AL0060010form1.executePScriptOnLoad = function () {
  console.log('execute AL0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AL0060010.AL0060010form1['onLoad' + i])) {
      expj.AL0060010.AL0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AL0060010-AL0060010form1" action="AL0060010Servlet" name="AL0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
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
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0430",rb)%></span><!-- ���׎R�ς݊��� --></div><!--/td-->
<script class="expj-script-AL0060010-AL0060010form1-LOAD_CALC_FROM">
expj.AL0060010.AL0060010form1.LOAD_CALC_FROM = {};
expj.AL0060010.AL0060010form1.LOAD_CALC_FROM.executeAllOnDecision = function () {
  console.log('execute AL0060010form1/LOAD_CALC_FROM.onDecision');
  expj.AL0060010.AL0060010form1.executeAllOnDecision();
  expj.AL0060010.executeAllOnDecision();
};
expj.AL0060010.AL0060010form1.LOAD_CALC_FROM.executeOnLoad = function () {
  $('#expj-AL0060010-AL0060010form1-LOAD_CALC_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0060010', 'AL0060010form1', 'LOAD_CALC_FROM', this);
  });
  expj.AL0060010.AL0060010form1.LOAD_CALC_FROM.executePScriptOnLoad();
};

expj.AL0060010.AL0060010form1.LOAD_CALC_FROM.executePScriptOnLoad = function () {
  console.log('execute AL0060010form1/LOAD_CALC_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AL0060010-AL0060010form1-LOAD_CALC_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0060010-AL0060010form1-LOAD_CALC_FROM" name="LOAD_CALC_FROM" class="AL0060010-focus-move  required-value expj-AL0060010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAL0060010Struct.getLOAD_CALC_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AL0060010-AL0060010form1-CalendarLoadCalcFrom">
expj.AL0060010.AL0060010form1.CalendarLoadCalcFrom = {};
// script1="onClick;0;CALENDAR;_AL0060010form1/LOAD_CALC_FROM"
expj.AL0060010.AL0060010form1.CalendarLoadCalcFrom.onClick0 = function () {
  console.log('CalendarLoadCalcFrom script1');
expj.common.pscript.executeCalendar('AL0060010','AL0060010form1','_AL0060010form1/LOAD_CALC_FROM');
};
expj.AL0060010.AL0060010form1.CalendarLoadCalcFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0060010.AL0060010form1.CalendarLoadCalcFrom['onClick' + i])) {
        expj.AL0060010.AL0060010form1.CalendarLoadCalcFrom['onClick' + i]();
      }
    }
  }
};
expj.AL0060010.AL0060010form1.CalendarLoadCalcFrom.executeAllOnDecision = function () {
};
expj.AL0060010.AL0060010form1.CalendarLoadCalcFrom.executeOnLoad = function () {
  $('#expj-AL0060010-AL0060010form1-CalendarLoadCalcFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0060010', 'AL0060010form1', 'CalendarLoadCalcFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AL0060010','AL0060010form1','_AL0060010form1/LOAD_CALC_FROM');
  expj.AL0060010.AL0060010form1.CalendarLoadCalcFrom.executePScriptOnLoad();
};

expj.AL0060010.AL0060010form1.CalendarLoadCalcFrom.executePScriptOnLoad = function () {
  console.log('execute AL0060010form1/CalendarLoadCalcFrom.onLoad');
  var targetComponent = document.getElementById('expj-AL0060010-AL0060010form1-CalendarLoadCalcFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AL0060010-AL0060010form1-CalendarLoadCalcFrom" class="AL0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- �` --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AL0060010-AL0060010form1-LOAD_CALC_TO">
expj.AL0060010.AL0060010form1.LOAD_CALC_TO = {};
expj.AL0060010.AL0060010form1.LOAD_CALC_TO.executeAllOnDecision = function () {
  console.log('execute AL0060010form1/LOAD_CALC_TO.onDecision');
  expj.AL0060010.AL0060010form1.executeAllOnDecision();
  expj.AL0060010.executeAllOnDecision();
};
expj.AL0060010.AL0060010form1.LOAD_CALC_TO.executeOnLoad = function () {
  $('#expj-AL0060010-AL0060010form1-LOAD_CALC_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0060010', 'AL0060010form1', 'LOAD_CALC_TO', this);
  });
  expj.AL0060010.AL0060010form1.LOAD_CALC_TO.executePScriptOnLoad();
};

expj.AL0060010.AL0060010form1.LOAD_CALC_TO.executePScriptOnLoad = function () {
  console.log('execute AL0060010form1/LOAD_CALC_TO.onLoad');
  var targetComponent = document.getElementById('expj-AL0060010-AL0060010form1-LOAD_CALC_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0060010-AL0060010form1-LOAD_CALC_TO" name="LOAD_CALC_TO" class="AL0060010-focus-move  required-value expj-AL0060010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAL0060010Struct.getLOAD_CALC_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AL0060010-AL0060010form1-CalendarLoadCalcTo">
expj.AL0060010.AL0060010form1.CalendarLoadCalcTo = {};
// script1="onClick;0;CALENDAR;_AL0060010form1/LOAD_CALC_TO"
expj.AL0060010.AL0060010form1.CalendarLoadCalcTo.onClick0 = function () {
  console.log('CalendarLoadCalcTo script1');
expj.common.pscript.executeCalendar('AL0060010','AL0060010form1','_AL0060010form1/LOAD_CALC_TO');
};
expj.AL0060010.AL0060010form1.CalendarLoadCalcTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0060010.AL0060010form1.CalendarLoadCalcTo['onClick' + i])) {
        expj.AL0060010.AL0060010form1.CalendarLoadCalcTo['onClick' + i]();
      }
    }
  }
};
expj.AL0060010.AL0060010form1.CalendarLoadCalcTo.executeAllOnDecision = function () {
};
expj.AL0060010.AL0060010form1.CalendarLoadCalcTo.executeOnLoad = function () {
  $('#expj-AL0060010-AL0060010form1-CalendarLoadCalcTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0060010', 'AL0060010form1', 'CalendarLoadCalcTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AL0060010','AL0060010form1','_AL0060010form1/LOAD_CALC_TO');
  expj.AL0060010.AL0060010form1.CalendarLoadCalcTo.executePScriptOnLoad();
};

expj.AL0060010.AL0060010form1.CalendarLoadCalcTo.executePScriptOnLoad = function () {
  console.log('execute AL0060010form1/CalendarLoadCalcTo.onLoad');
  var targetComponent = document.getElementById('expj-AL0060010-AL0060010form1-CalendarLoadCalcTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AL0060010-AL0060010form1-CalendarLoadCalcTo" class="AL0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-AL0060010-AL0060010form1-h_LOAD_CALC" name="h_LOAD_CALC" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0060010Struct.geth_LOAD_CALC()) %>">
<script class="expj-script-AL0060010-AL0060010form1-h_LOAD_CALC">
expj.AL0060010.AL0060010form1.h_LOAD_CALC = {};
expj.AL0060010.AL0060010form1.h_LOAD_CALC.executeAllOnDecision = function () {
  console.log('execute AL0060010form1/h_LOAD_CALC.onDecision');
  expj.AL0060010.AL0060010form1.executeAllOnDecision();
  expj.AL0060010.executeAllOnDecision();
};
expj.AL0060010.AL0060010form1.h_LOAD_CALC.executeOnLoad = function () {
  $('#expj-AL0060010-AL0060010form1-h_LOAD_CALC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0060010', 'AL0060010form1', 'h_LOAD_CALC', this);
  });
  expj.AL0060010.AL0060010form1.h_LOAD_CALC.executePScriptOnLoad();
};

expj.AL0060010.AL0060010form1.h_LOAD_CALC.executePScriptOnLoad = function () {
  console.log('execute AL0060010form1/h_LOAD_CALC.onLoad');
  var targetComponent = document.getElementById('expj-AL0060010-AL0060010form1-h_LOAD_CALC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0060010-AL0060010form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0060010Struct.geth_PLANT_CD()) %>">
<script class="expj-script-AL0060010-AL0060010form1-h_PLANT_CD">
expj.AL0060010.AL0060010form1.h_PLANT_CD = {};
expj.AL0060010.AL0060010form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AL0060010form1/h_PLANT_CD.onDecision');
  expj.AL0060010.AL0060010form1.executeAllOnDecision();
  expj.AL0060010.executeAllOnDecision();
};
expj.AL0060010.AL0060010form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-AL0060010-AL0060010form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0060010', 'AL0060010form1', 'h_PLANT_CD', this);
  });
  expj.AL0060010.AL0060010form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.AL0060010.AL0060010form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AL0060010form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0060010-AL0060010form1-h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AL0060010-AL0060010button1">
expj.AL0060010.AL0060010button1 = {};
expj.AL0060010.AL0060010button1.executeAllOnDecision = function () {
  console.log('execute AL0060010button1.onDecision');
};
expj.AL0060010.AL0060010button1.executeOnLoad = function () {
  expj.AL0060010.AL0060010button1.executePScriptOnLoad();
};

expj.AL0060010.AL0060010button1.executePScriptOnLoad = function () {
  console.log('execute AL0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0060010-AL0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0060010-AL0060010button1-Execute">
expj.AL0060010.AL0060010button1.Execute = {};
// script1="onClick;0;CHK;_AL0060010form1/LOAD_CALC_FROM[lt]_AL0060010form1/h_LOAD_CALC@#AL60015"
expj.AL0060010.AL0060010button1.Execute.onClick0 = function () {
  console.log('Execute script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0060010', 'AL0060010button1', '_AL0060010form1/LOAD_CALC_FROM')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0060010', 'AL0060010button1', '_AL0060010form1/h_LOAD_CALC')))) {
expj.common.pscript.addErrorMessage('AL0060010', 'AL0060010button1', 'AL60015');
}
};
// script2="onClick;1;CHK;_AL0060010form1/LOAD_CALC_TO[lt]_AL0060010form1/h_LOAD_CALC@#AL60016"
expj.AL0060010.AL0060010button1.Execute.onClick1 = function () {
  console.log('Execute script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0060010', 'AL0060010button1', '_AL0060010form1/LOAD_CALC_TO')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0060010', 'AL0060010button1', '_AL0060010form1/h_LOAD_CALC')))) {
expj.common.pscript.addErrorMessage('AL0060010', 'AL0060010button1', 'AL60016');
}
};
// script3="onClick;2;CHK;_AL0060010form1/LOAD_CALC_TO[lt]_AL0060010form1/LOAD_CALC_FROM@#AL60014"
expj.AL0060010.AL0060010button1.Execute.onClick2 = function () {
  console.log('Execute script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0060010', 'AL0060010button1', '_AL0060010form1/LOAD_CALC_TO')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0060010', 'AL0060010button1', '_AL0060010form1/LOAD_CALC_FROM')))) {
expj.common.pscript.addErrorMessage('AL0060010', 'AL0060010button1', 'AL60014');
}
};
// script4="onClick;3;CHK;_AL0060010form1/LOAD_CALC_TO[gt]~ADDDATE(_AL0060010form1/LOAD_CALC_FROM:150)@#AL60011"
expj.AL0060010.AL0060010button1.Execute.onClick3 = function () {
  console.log('Execute script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0060010', 'AL0060010button1', '_AL0060010form1/LOAD_CALC_TO')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.ADDDATE('AL0060010', 'AL0060010button1', '_AL0060010form1/LOAD_CALC_FROM', '150')))) {
expj.common.pscript.addErrorMessage('AL0060010', 'AL0060010button1', 'AL60011');
}
};
// script5="onClick;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0060010form1/*@AL0060010Servlet,,$ZZ07010"
expj.AL0060010.AL0060010button1.Execute.onClick4 = function () {
  console.log('Execute script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0060010', 'AL0060010button1', '_AL0060010form1/*', 'AL0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0060010', response);
expj.common.updateBusinessScreenTab('AL0060010', contents);
};
expj.common.pscript.callConfirm('AL0060010', 'AL0060010button1', 'ZZ07010', okEvent);
};
expj.AL0060010.AL0060010button1.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0060010.AL0060010button1.Execute['onClick' + i])) {
        expj.AL0060010.AL0060010button1.Execute['onClick' + i]();
      }
    }
  }
};
expj.AL0060010.AL0060010button1.Execute.executeAllOnDecision = function () {
};
expj.AL0060010.AL0060010button1.Execute.executeOnLoad = function () {
  $('#expj-AL0060010-AL0060010button1-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0060010', 'AL0060010button1', 'Execute', this, 'Button');
    }
  });
  expj.AL0060010.AL0060010button1.Execute.executePScriptOnLoad();
};

expj.AL0060010.AL0060010button1.Execute.executePScriptOnLoad = function () {
  console.log('execute AL0060010button1/Execute.onLoad');
  var targetComponent = document.getElementById('expj-AL0060010-AL0060010button1-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0060010-AL0060010button1-Execute" name="Execute" class="AL0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- ���s�{�^�� --></div><!--/td-->
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
<span class="version">AL0060010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AL0060010-AL0060010button0">
expj.AL0060010.AL0060010button0 = {};
expj.AL0060010.AL0060010button0.executeAllOnDecision = function () {
  console.log('execute AL0060010button0.onDecision');
};
expj.AL0060010.AL0060010button0.executeOnLoad = function () {
  expj.AL0060010.AL0060010button0.executePScriptOnLoad();
};

expj.AL0060010.AL0060010button0.executePScriptOnLoad = function () {
  console.log('execute AL0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0060010-AL0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0060010-AL0060010button0-Clear">
expj.AL0060010.AL0060010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AL0060010Servlet,,$ZZ07008"
expj.AL0060010.AL0060010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0060010', 'AL0060010button0', '', 'AL0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0060010', response);
expj.common.updateBusinessScreenTab('AL0060010', contents);
};
expj.common.pscript.callConfirm('AL0060010', 'AL0060010button0', 'ZZ07008', okEvent);
};
expj.AL0060010.AL0060010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0060010.AL0060010button0.Clear['onClick' + i])) {
        expj.AL0060010.AL0060010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AL0060010.AL0060010button0.Clear.executeAllOnDecision = function () {
};
expj.AL0060010.AL0060010button0.Clear.executeOnLoad = function () {
  $('#expj-AL0060010-AL0060010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0060010', 'AL0060010button0', 'Clear', this, 'Button');
    }
  });
  expj.AL0060010.AL0060010button0.Clear.executePScriptOnLoad();
};

expj.AL0060010.AL0060010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AL0060010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AL0060010-AL0060010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0060010-AL0060010button0-Clear" name="Clear" class="AL0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- �N���A�{�^�� --></div><!--/td-->
<script class="expj-script-AL0060010-AL0060010button0-Close">
expj.AL0060010.AL0060010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AL0060010.AL0060010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AL0060010');
};
expj.AL0060010.AL0060010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0060010.AL0060010button0.Close['onClick' + i])) {
        expj.AL0060010.AL0060010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AL0060010.AL0060010button0.Close.executeAllOnDecision = function () {
};
expj.AL0060010.AL0060010button0.Close.executeOnLoad = function () {
  $('#expj-AL0060010-AL0060010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0060010', 'AL0060010button0', 'Close', this, 'Button');
    }
  });
  expj.AL0060010.AL0060010button0.Close.executePScriptOnLoad();
};

expj.AL0060010.AL0060010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AL0060010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AL0060010-AL0060010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0060010-AL0060010button0-Close" name="Close" class="AL0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- ����{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AL0060010 (END)-->
<%
  MessageStruct msgStruct = aAL0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AL0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AL0060010)) {
  expj.common.treeInstanceMap.AL0060010 = {};
}
expj.common.treeInstanceMap.AL0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AL0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AL0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AL0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
expj.common.treeInstanceMap.AL0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AL0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AL0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AL0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AL0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AL0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js�錾
 if (detailId != null) {
%>
<script class="expj-script-AL0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0060010)) {
  expj.common.detailDialogMap.AL0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AL0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AL0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AL0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AL0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AL0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AL0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AL0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AL0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AL0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
  expj.common.detailDialogMap.AL0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AL0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AL0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AL0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AL0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AL0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AL0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AL0060010)) {
  expj.common.viewInstanceMap.AL0060010 = {};
}
expj.common.viewInstanceMap.AL0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AL0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AL0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AL0060010.<%=viewId %>.init = function () {
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
    expj.AL0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AL0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AL0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AL0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AL0060010_init">
/**
 * AL0060010�p�̃��[�h�������������֐�
 */
expj.AL0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AL0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AL0060010');
  //��DataGridTable�ɓ��I�����ݒ�
  expj.common.setExpjDynamicHeight('AL0060010');
  expj.common.calendarInstanceMap.AL0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AL0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AL0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AL0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AL0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AL0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AL0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AL0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AL0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AL0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AL0060010.AL0060010form1.LOAD_CALC_FROM.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010form1.CalendarLoadCalcFrom.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010form1.LOAD_CALC_TO.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010form1.CalendarLoadCalcTo.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010form1.h_LOAD_CALC.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010button1.Execute.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010form1.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010button1.executeOnLoad();}catch(e){};
  try{expj.AL0060010.AL0060010button0.executeOnLoad();}catch(e){};
  // �R���\�[���o��
  expj.AL0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AL0060010', 'AL0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AL0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AL0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AL0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AL0060010', '<%=request.getContextPath() %>');
};

/**
 * AL0060010�̑S��onDecision����
 */
expj.AL0060010.executeAllOnDecision = function () {
  expj.AL0060010.AL0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AL0060010_console">
expj.AL0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>