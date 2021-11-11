<%-- ***
This file is generated
 GeneratedDate  : Tue Feb 21 17:49:35 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KQ0060\KQ0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KQ0060.*" %>
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
<jsp:useBean id="aKQ0060010Control" class="com.nec.jp.orteus.metamorBase.KQ0060.KQ0060010Control" scope="request"/>
<jsp:useBean id="aKQ0060010Struct" class="com.nec.jp.orteus.metamorBase.KQ0060.KQ0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受注/生産アンバランス一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0060/jsp/KQ0060010.jsp,v $
$Author: geng-jia $   
$Revision: 1.17 $$Date: 2017/02/22 02:07:13 $
********************************************************* --%>
<html>
<head>
<title>受注/生産アンバランス一覧</title>
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
<script class="expj-script-KQ0060010_init">
  // KQ0060010名前空間
  expj.KQ0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<%
    String numberColKind = "OBT_NUMBER;14.1;FLOOR;4";
%>
  <div id="expj-business-screen-KQ0060010" data-screen="KQ0060010" data-newdata="<%=aKQ0060010Control.isNewData() %>">
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
              <script class="expj-script-KQ0060010-KQ0060010form1">
expj.KQ0060010.KQ0060010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.KQ0060010.KQ0060010form1.onLoad0 = function () {
  console.log('KQ0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;?KQ0060010form1/IN_ITEM_CD[eq]SAME[and]?KQ0060010form1/IN_DATE[eq]SAME[and]?KQ0060010form1/*[eq]NORMAL@*0,*1"
expj.KQ0060010.KQ0060010form1.onDecision0 = function () {
  console.log('KQ0060010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0060010', 'KQ0060010form1', '?KQ0060010form1/IN_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0060010', 'KQ0060010form1', '?KQ0060010form1/IN_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0060010', 'KQ0060010form1', '?KQ0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KQ0060010button0/CSVOUT"
expj.KQ0060010.KQ0060010form1.child0 = function () {
  console.log('KQ0060010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0060010', 'KQ0060010form1', '_KQ0060010button0/CSVOUT');
};
// script4="child;1;MASK;_KQ0060010button0/CSVOUT"
expj.KQ0060010.KQ0060010form1.child1 = function () {
  console.log('KQ0060010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KQ0060010', 'KQ0060010form1', '_KQ0060010button0/CSVOUT');
};
expj.KQ0060010.KQ0060010form1.executeAllOnDecision = function () {
  console.log('execute KQ0060010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0060010.KQ0060010form1['onDecision' + i])) {
        expj.KQ0060010.KQ0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.KQ0060010.KQ0060010form1.executeOnLoad = function () {
  expj.KQ0060010.KQ0060010form1.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010form1.executePScriptOnLoad = function () {
  console.log('execute KQ0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0060010.KQ0060010form1['onLoad' + i])) {
      expj.KQ0060010.KQ0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0060010-KQ0060010form1" action="KQ0060010Servlet" name="KQ0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%=TypeConverter.sanitizer(aKQ0060010Control.getReadStatusString())%>" style="height:54px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:54px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:280px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KQ0060010-KQ0060010form1-IN_ITEM_CD">
expj.KQ0060010.KQ0060010form1.IN_ITEM_CD = {};
expj.KQ0060010.KQ0060010form1.IN_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KQ0060010form1/IN_ITEM_CD.onDecision');
  expj.KQ0060010.KQ0060010form1.executeAllOnDecision();
  expj.KQ0060010.executeAllOnDecision();
};
expj.KQ0060010.KQ0060010form1.IN_ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0060010-KQ0060010form1-IN_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0060010', 'KQ0060010form1', 'IN_ITEM_CD', this);
  });
  expj.KQ0060010.KQ0060010form1.IN_ITEM_CD.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010form1.IN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0060010form1/IN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0060010-KQ0060010form1-IN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0060010-KQ0060010form1-IN_ITEM_CD" name="IN_ITEM_CD" class="KQ0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKQ0060010Struct.getIN_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0060010-KQ0060010form1-PeekerIN_ITEM_CD">
expj.KQ0060010.KQ0060010form1.PeekerIN_ITEM_CD = {};
// script1="onClick;0;PEEKER;_KQ0060010form1/IN_ITEM_CD@<%=contextNo%>"
expj.KQ0060010.KQ0060010form1.PeekerIN_ITEM_CD.onClick0 = function () {
  console.log('PeekerIN_ITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0060010';
var parameterValues = 'PeekerIN_ITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0060010', 'KQ0060010form1', '_KQ0060010form1/IN_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0060010form1/IN_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0060010.KQ0060010form1.PeekerIN_ITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0060010.KQ0060010form1.PeekerIN_ITEM_CD['onClick' + i])) {
        expj.KQ0060010.KQ0060010form1.PeekerIN_ITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.KQ0060010.KQ0060010form1.PeekerIN_ITEM_CD.executeAllOnDecision = function () {
};
expj.KQ0060010.KQ0060010form1.PeekerIN_ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0060010-KQ0060010form1-PeekerIN_ITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0060010', 'KQ0060010form1', 'PeekerIN_ITEM_CD', this, 'Button');
    }
  });
  expj.KQ0060010.KQ0060010form1.PeekerIN_ITEM_CD.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010form1.PeekerIN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0060010form1/PeekerIN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0060010-KQ0060010form1-PeekerIN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0060010-KQ0060010form1-PeekerIN_ITEM_CD" class="KQ0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:280px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0029",rb)%></span><!-- 期間 --></div><!--/td-->
<script class="expj-script-KQ0060010-KQ0060010form1-IN_DATE">
expj.KQ0060010.KQ0060010form1.IN_DATE = {};
expj.KQ0060010.KQ0060010form1.IN_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0060010form1/IN_DATE.onDecision');
  expj.KQ0060010.KQ0060010form1.executeAllOnDecision();
  expj.KQ0060010.executeAllOnDecision();
};
expj.KQ0060010.KQ0060010form1.IN_DATE.executeOnLoad = function () {
  $('#expj-KQ0060010-KQ0060010form1-IN_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0060010', 'KQ0060010form1', 'IN_DATE', this);
  });
  expj.KQ0060010.KQ0060010form1.IN_DATE.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010form1.IN_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0060010form1/IN_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0060010-KQ0060010form1-IN_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0060010-KQ0060010form1-IN_DATE" name="IN_DATE" class="KQ0060010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0060010Struct.getIN_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KQ0060010-KQ0060010form1-IN_DATE_CALENDAR">
expj.KQ0060010.KQ0060010form1.IN_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KQ0060010form1/IN_DATE"
expj.KQ0060010.KQ0060010form1.IN_DATE_CALENDAR.onClick0 = function () {
  console.log('IN_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KQ0060010','KQ0060010form1','_KQ0060010form1/IN_DATE');
};
expj.KQ0060010.KQ0060010form1.IN_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0060010.KQ0060010form1.IN_DATE_CALENDAR['onClick' + i])) {
        expj.KQ0060010.KQ0060010form1.IN_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KQ0060010.KQ0060010form1.IN_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KQ0060010.KQ0060010form1.IN_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KQ0060010-KQ0060010form1-IN_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0060010', 'KQ0060010form1', 'IN_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0060010','KQ0060010form1','_KQ0060010form1/IN_DATE');
  expj.KQ0060010.KQ0060010form1.IN_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010form1.IN_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KQ0060010form1/IN_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0060010-KQ0060010form1-IN_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0060010-KQ0060010form1-IN_DATE_CALENDAR" class="KQ0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KQ0060010-KQ0060010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0060010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-KQ0060010-KQ0060010form1-DOWNLOAD_FILE">
expj.KQ0060010.KQ0060010form1.DOWNLOAD_FILE = {};
expj.KQ0060010.KQ0060010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute KQ0060010form1/DOWNLOAD_FILE.onDecision');
  expj.KQ0060010.KQ0060010form1.executeAllOnDecision();
  expj.KQ0060010.executeAllOnDecision();
};
expj.KQ0060010.KQ0060010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-KQ0060010-KQ0060010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0060010', 'KQ0060010form1', 'DOWNLOAD_FILE', this);
  });
  expj.KQ0060010.KQ0060010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute KQ0060010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0060010-KQ0060010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:280px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KQ0060010-KQ0060010button1">
expj.KQ0060010.KQ0060010button1 = {};
expj.KQ0060010.KQ0060010button1.executeAllOnDecision = function () {
  console.log('execute KQ0060010button1.onDecision');
};
expj.KQ0060010.KQ0060010button1.executeOnLoad = function () {
  expj.KQ0060010.KQ0060010button1.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010button1.executePScriptOnLoad = function () {
  console.log('execute KQ0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0060010-KQ0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0060010-KQ0060010button1-Select">
expj.KQ0060010.KQ0060010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0060010form1/*@KQ0060010Servlet"
expj.KQ0060010.KQ0060010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0060010', 'KQ0060010button1', '_KQ0060010form1/*', 'KQ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0060010', response);
expj.common.updateBusinessScreenTab('KQ0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0060010.KQ0060010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0060010.KQ0060010button1.Select['onClick' + i])) {
        expj.KQ0060010.KQ0060010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KQ0060010.KQ0060010button1.Select.executeAllOnDecision = function () {
};
expj.KQ0060010.KQ0060010button1.Select.executeOnLoad = function () {
  $('#expj-KQ0060010-KQ0060010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0060010', 'KQ0060010button1', 'Select', this, 'Button');
    }
  });
  expj.KQ0060010.KQ0060010button1.Select.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KQ0060010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KQ0060010-KQ0060010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0060010-KQ0060010button1-Select" name="Select" class="KQ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段一覧用のDataGridを配置する。↓ --><script class="expj-script-KQ0060010-KQ0060010view1">
expj.KQ0060010.KQ0060010view1 = {};
expj.KQ0060010.KQ0060010view1.executeAllOnClick = function () {
};
expj.KQ0060010.KQ0060010view1.executeAllOnDecision = function () {
  console.log('execute KQ0060010view1.onDecision');
};
expj.KQ0060010.KQ0060010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KQ0060010view1", "expj.KQ0060010.KQ0060010view1.executeAllOnClick");
%>
  expj.KQ0060010.KQ0060010view1.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010view1.executePScriptOnLoad = function () {
  console.log('execute KQ0060010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KQ0060010-KQ0060010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String KQ0060010view1_Id = "KQ0060010view1";
 String KQ0060010view1_select = "single";
 String KQ0060010view1_sortable = "true";
 String KQ0060010view1_resize = "true";
 String KQ0060010view1_scroll = "true";
 StringBuffer KQ0060010view1_HB = new StringBuffer();
 StringBuffer KQ0060010view1_DB = new StringBuffer();
%>
<%
 KQ0060010view1_select = "single";
 KQ0060010view1_sortable = "true";
 KQ0060010view1_resize = "true";
 KQ0060010view1_scroll = "true";
%>
<%
 KQ0060010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
%>
     
<%
KQ0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
KQ0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
KQ0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0714",rb))).append("', 'name':'SUM_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
KQ0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0715",rb))).append("', 'name':'UNCONFIRM_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
KQ0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0717",rb))).append("', 'name':'SHIP_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
KQ0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0718",rb))).append("', 'name':'ODR_REM_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
KQ0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0327",rb))).append("', 'name':'SUM_OD', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
KQ0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0329",rb))).append("', 'name':'SUM_STOCK_ON_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
KQ0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0719",rb))).append("', 'name':'QTY_DIFF', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
KQ0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0716",rb))).append("', 'name':'PLN_QTY_REMAIN', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
KQ0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'PKG_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0060010view1_sortable).append("}").append(",");
%>
<%
 int aKQ0060010StructLength = aKQ0060010Control.getListsize();
 final KQ0060010Struct structBackup = aKQ0060010Struct;
 aKQ0060010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKQ0060010StructLength; ++loopCount) {
  if((aKQ0060010Struct = (KQ0060010Struct) aKQ0060010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKQ0060010Struct", aKQ0060010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KQ0060010view1_DB.append("[");
 KQ0060010view1_DB.append(loopCount);
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getITEM_CD())).append("</span>'");
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getITEM_NAME())).append("</span>'");
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-SUM_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-SUM_ODR_QTY\" data-name=\"SUM_ODR_QTY\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getSUM_ODR_QTY())).append("</span>'");
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-UNCONFIRM_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-UNCONFIRM_ODR_QTY\" data-name=\"UNCONFIRM_ODR_QTY\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getUNCONFIRM_ODR_QTY())).append("</span>'");
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-SHIP_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-SHIP_QTY\" data-name=\"SHIP_QTY\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getSHIP_QTY())).append("</span>'");
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-ODR_REM_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-ODR_REM_QTY\" data-name=\"ODR_REM_QTY\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getODR_REM_QTY())).append("</span>'");
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-SUM_OD-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-SUM_OD\" data-name=\"SUM_OD\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getSUM_OD())).append("</span>'");
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-SUM_STOCK_ON_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-SUM_STOCK_ON_HAND_QTY\" data-name=\"SUM_STOCK_ON_HAND_QTY\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getSUM_STOCK_ON_HAND_QTY())).append("</span>'");
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-QTY_DIFF-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-QTY_DIFF\" data-name=\"QTY_DIFF\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getQTY_DIFF())).append("</span>'");
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-PLN_QTY_REMAIN-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-PLN_QTY_REMAIN\" data-name=\"PLN_QTY_REMAIN\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getPLN_QTY_REMAIN())).append("</span>'");
 KQ0060010view1_DB.append(",").append("'<span id=\"expj-KQ0060010-KQ0060010view1-PKG_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KQ0060010-KQ0060010view1-PKG_UNIT\" data-name=\"PKG_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0060010Struct.getPKG_UNIT())).append("</span>'");
 KQ0060010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKQ0060010StructLength) {
   KQ0060010view1_DB.append(",");
  }
 }
 aKQ0060010Struct = structBackup;
 viewIdList.add(KQ0060010view1_Id);
 viewSelectList.add(KQ0060010view1_select);
 viewResizeList.add(KQ0060010view1_resize);
 viewScrollList.add(KQ0060010view1_scroll);
 viewHeaderDataList.add(KQ0060010view1_HB);
 viewBodyDataList.add(KQ0060010view1_DB);
%>
<%
}
%>
<!-- ここに下段一覧用のDataGridを配置する。↑ --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 315px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KQ0060010 Revision: 1.12  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-KQ0060010-KQ0060010button0">
expj.KQ0060010.KQ0060010button0 = {};
expj.KQ0060010.KQ0060010button0.executeAllOnDecision = function () {
  console.log('execute KQ0060010button0.onDecision');
};
expj.KQ0060010.KQ0060010button0.executeOnLoad = function () {
  expj.KQ0060010.KQ0060010button0.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010button0.executePScriptOnLoad = function () {
  console.log('execute KQ0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0060010-KQ0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0060010-KQ0060010button0-CSVOUT">
expj.KQ0060010.KQ0060010button0.CSVOUT = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0060010form1/*@KQ0060010Servlet"
expj.KQ0060010.KQ0060010button0.CSVOUT.onClick0 = function () {
  console.log('CSVOUT script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0060010', 'KQ0060010button0', '_KQ0060010form1/*', 'KQ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0060010', response);
expj.common.updateBusinessScreenTab('KQ0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0060010.KQ0060010button0.CSVOUT.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0060010.KQ0060010button0.CSVOUT['onClick' + i])) {
        expj.KQ0060010.KQ0060010button0.CSVOUT['onClick' + i]();
      }
    }
  }
};
expj.KQ0060010.KQ0060010button0.CSVOUT.executeAllOnDecision = function () {
};
expj.KQ0060010.KQ0060010button0.CSVOUT.executeOnLoad = function () {
  $('#expj-KQ0060010-KQ0060010button0-CSVOUT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0060010', 'KQ0060010button0', 'CSVOUT', this, 'Button');
    }
  });
  expj.KQ0060010.KQ0060010button0.CSVOUT.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010button0.CSVOUT.executePScriptOnLoad = function () {
  console.log('execute KQ0060010button0/CSVOUT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0060010-KQ0060010button0-CSVOUT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0060010-KQ0060010button0-CSVOUT" name="CSVOUT" class="KQ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-KQ0060010-KQ0060010button0-Clear">
expj.KQ0060010.KQ0060010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KQ0060010Servlet,,$ZZ07008"
expj.KQ0060010.KQ0060010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0060010', 'KQ0060010button0', '', 'KQ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0060010', response);
expj.common.updateBusinessScreenTab('KQ0060010', contents);
};
expj.common.pscript.callConfirm('KQ0060010', 'KQ0060010button0', 'ZZ07008', okEvent);
};
expj.KQ0060010.KQ0060010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0060010.KQ0060010button0.Clear['onClick' + i])) {
        expj.KQ0060010.KQ0060010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KQ0060010.KQ0060010button0.Clear.executeAllOnDecision = function () {
};
expj.KQ0060010.KQ0060010button0.Clear.executeOnLoad = function () {
  $('#expj-KQ0060010-KQ0060010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0060010', 'KQ0060010button0', 'Clear', this, 'Button');
    }
  });
  expj.KQ0060010.KQ0060010button0.Clear.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KQ0060010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KQ0060010-KQ0060010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0060010-KQ0060010button0-Clear" name="Clear" class="KQ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KQ0060010-KQ0060010button0-Close">
expj.KQ0060010.KQ0060010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KQ0060010.KQ0060010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KQ0060010');
};
expj.KQ0060010.KQ0060010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0060010.KQ0060010button0.Close['onClick' + i])) {
        expj.KQ0060010.KQ0060010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KQ0060010.KQ0060010button0.Close.executeAllOnDecision = function () {
};
expj.KQ0060010.KQ0060010button0.Close.executeOnLoad = function () {
  $('#expj-KQ0060010-KQ0060010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0060010', 'KQ0060010button0', 'Close', this, 'Button');
    }
  });
  expj.KQ0060010.KQ0060010button0.Close.executePScriptOnLoad();
};

expj.KQ0060010.KQ0060010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KQ0060010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KQ0060010-KQ0060010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0060010-KQ0060010button0-Close" name="Close" class="KQ0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KQ0060010 (END)-->
<%
MessageStruct msgStruct = aKQ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KQ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KQ0060010)) {
  expj.common.treeInstanceMap.KQ0060010 = {};
}
expj.common.treeInstanceMap.KQ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KQ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KQ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KQ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KQ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KQ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KQ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KQ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KQ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0060010)) {
  expj.common.detailDialogMap.KQ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KQ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.KQ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KQ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KQ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KQ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KQ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KQ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KQ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KQ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KQ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KQ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KQ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KQ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KQ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KQ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KQ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KQ0060010)) {
  expj.common.viewInstanceMap.KQ0060010 = {};
}
expj.common.viewInstanceMap.KQ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.KQ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KQ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KQ0060010.<%=viewId %>.init = function () {
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
    expj.KQ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KQ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KQ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KQ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KQ0060010_init">
/**
 * KQ0060010用のロード完了時初期化関数
 */
expj.KQ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KQ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KQ0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KQ0060010');
  expj.common.calendarInstanceMap.KQ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KQ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KQ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.KQ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KQ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KQ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KQ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KQ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KQ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KQ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.KQ0060010.KQ0060010form1.IN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010form1.PeekerIN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010form1.IN_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010form1.IN_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010button0.CSVOUT.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010form1.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010button1.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010view1.executeOnLoad();}catch(e){};
  try{expj.KQ0060010.KQ0060010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KQ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KQ0060010', 'KQ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KQ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KQ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.KQ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KQ0060010', '<%=request.getContextPath() %>');
};

/**
 * KQ0060010の全体onDecision処理
 */
expj.KQ0060010.executeAllOnDecision = function () {
  expj.KQ0060010.KQ0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KQ0060010_console">
expj.KQ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>