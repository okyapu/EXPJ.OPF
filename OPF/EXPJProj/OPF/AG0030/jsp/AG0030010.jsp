<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:41:13 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AG0030\AG0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AG0030.*" %>
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
<jsp:useBean id="aAG0030010Control" class="com.nec.jp.orteus.metamorBase.AG0030.AG0030010Control" scope="request"/>
<jsp:useBean id="aAG0030010Struct" class="com.nec.jp.orteus.metamorBase.AG0030.AG0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

有効在庫参照
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0030/jsp/AG0030010.jsp,v $
$Author: geng-jia $	
$Revision: 1.11 $ $Date: 2017/02/22 02:05:58 $
********************************************************* --%>
<html>
<head>
<title>有効在庫参照</title>
<%@ page import="com.nec.jp.orteus.metamorBase.common01.StockCalculate.MrpData" %>
<%@ page import="com.nec.jp.orteus.metamorBase.common01.StockCalculate.MrpManager" %>
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
<script class="expj-script-AG0030010_init">
  // AG0030010名前空間
  expj.AG0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AG0030010" data-screen="AG0030010" data-newdata="<%=aAG0030010Control.isNewData() %>">
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
 
            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style=""> 
              <script class="expj-script-AG0030010-AG0030010form1">
expj.AG0030010.AG0030010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AG0030010.AG0030010form1.onLoad0 = function () {
  console.log('AG0030010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AG0030010.AG0030010form1.onDecision0 = function () {
  console.log('AG0030010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AG0030010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AG0030010button1/select"
expj.AG0030010.AG0030010form1.child0 = function () {
  console.log('AG0030010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AG0030010', 'AG0030010form1', '_AG0030010button1/select');
};
// script4="child;1;MASK;_AG0030010button1/select"
expj.AG0030010.AG0030010form1.child1 = function () {
  console.log('AG0030010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AG0030010', 'AG0030010form1', '_AG0030010button1/select');
};
expj.AG0030010.AG0030010form1.executeAllOnDecision = function () {
  console.log('execute AG0030010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0030010.AG0030010form1['onDecision' + i])) {
        expj.AG0030010.AG0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.AG0030010.AG0030010form1.executeOnLoad = function () {
  expj.AG0030010.AG0030010form1.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AG0030010.AG0030010form1['onLoad' + i])) {
      expj.AG0030010.AG0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0030010-AG0030010form1" action="AG0030010Servlet" name="AG0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010form1-w_PLANT_CD">
expj.AG0030010.AG0030010form1.w_PLANT_CD = {};
expj.AG0030010.AG0030010form1.w_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AG0030010form1/w_PLANT_CD.onDecision');
  expj.AG0030010.AG0030010form1.executeAllOnDecision();
  expj.AG0030010.executeAllOnDecision();
};
expj.AG0030010.AG0030010form1.w_PLANT_CD.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010form1-w_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0030010', 'AG0030010form1', 'w_PLANT_CD', this);
  });
  expj.AG0030010.AG0030010form1.w_PLANT_CD.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.w_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1/w_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010form1-w_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0030010-AG0030010form1-w_PLANT_CD" name="w_PLANT_CD" class="AG0030010-focus-move  required-value expj-AG0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0030010Struct.getw_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010form1-PeekerWPlantCd">
expj.AG0030010.AG0030010form1.PeekerWPlantCd = {};
// script1="onClick;0;PEEKER;_AG0030010form1/w_PLANT_CD@<%=contextNo%>"
expj.AG0030010.AG0030010form1.PeekerWPlantCd.onClick0 = function () {
  console.log('PeekerWPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0030010';
var parameterValues = 'PeekerWPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0030010', 'AG0030010form1', '_AG0030010form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AG0030010form1/w_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0030010.AG0030010form1.PeekerWPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0030010.AG0030010form1.PeekerWPlantCd['onClick' + i])) {
        expj.AG0030010.AG0030010form1.PeekerWPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AG0030010.AG0030010form1.PeekerWPlantCd.executeAllOnDecision = function () {
};
expj.AG0030010.AG0030010form1.PeekerWPlantCd.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010form1-PeekerWPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0030010', 'AG0030010form1', 'PeekerWPlantCd', this, 'Button');
    }
  });
  expj.AG0030010.AG0030010form1.PeekerWPlantCd.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.PeekerWPlantCd.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1/PeekerWPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010form1-PeekerWPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0030010-AG0030010form1-PeekerWPlantCd" class="AG0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010form1-PLANT_NAME">
expj.AG0030010.AG0030010form1.PLANT_NAME = {};
expj.AG0030010.AG0030010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AG0030010form1/PLANT_NAME.onDecision');
  expj.AG0030010.AG0030010form1.executeAllOnDecision();
  expj.AG0030010.executeAllOnDecision();
};
expj.AG0030010.AG0030010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0030010', 'AG0030010form1', 'PLANT_NAME', this);
  });
  expj.AG0030010.AG0030010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0030010-AG0030010form1-PLANT_NAME" name="PLANT_NAME" class="AG0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0030010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010form1-w_ITEM_CD">
expj.AG0030010.AG0030010form1.w_ITEM_CD = {};
expj.AG0030010.AG0030010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AG0030010form1/w_ITEM_CD.onDecision');
  expj.AG0030010.AG0030010form1.executeAllOnDecision();
  expj.AG0030010.executeAllOnDecision();
};
expj.AG0030010.AG0030010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0030010', 'AG0030010form1', 'w_ITEM_CD', this);
  });
  expj.AG0030010.AG0030010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0030010-AG0030010form1-w_ITEM_CD" name="w_ITEM_CD" class="AG0030010-focus-move  required-value expj-AG0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0030010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010form1-PeekerWItemCd">
expj.AG0030010.AG0030010form1.PeekerWItemCd = {};
// script1="onClick;0;PEEKER;_AG0030010form1/w_ITEM_CD@<%=contextNo%>"
expj.AG0030010.AG0030010form1.PeekerWItemCd.onClick0 = function () {
  console.log('PeekerWItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0030010';
var parameterValues = 'PeekerWItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0030010', 'AG0030010form1', '_AG0030010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_06%&%';
parameterValues += 'TARGET_FIELD%=%_AG0030010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0030010.AG0030010form1.PeekerWItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0030010.AG0030010form1.PeekerWItemCd['onClick' + i])) {
        expj.AG0030010.AG0030010form1.PeekerWItemCd['onClick' + i]();
      }
    }
  }
};
expj.AG0030010.AG0030010form1.PeekerWItemCd.executeAllOnDecision = function () {
};
expj.AG0030010.AG0030010form1.PeekerWItemCd.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010form1-PeekerWItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0030010', 'AG0030010form1', 'PeekerWItemCd', this, 'Button');
    }
  });
  expj.AG0030010.AG0030010form1.PeekerWItemCd.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.PeekerWItemCd.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1/PeekerWItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010form1-PeekerWItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0030010-AG0030010form1-PeekerWItemCd" class="AG0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010form1-ITEM_NAME">
expj.AG0030010.AG0030010form1.ITEM_NAME = {};
expj.AG0030010.AG0030010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AG0030010form1/ITEM_NAME.onDecision');
  expj.AG0030010.AG0030010form1.executeAllOnDecision();
  expj.AG0030010.executeAllOnDecision();
};
expj.AG0030010.AG0030010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0030010', 'AG0030010form1', 'ITEM_NAME', this);
  });
  expj.AG0030010.AG0030010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0030010-AG0030010form1-ITEM_NAME" name="ITEM_NAME" class="AG0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0030010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0420",rb)%></span><!-- 生産計画期間 --></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010form1-w_date_from">
expj.AG0030010.AG0030010form1.w_date_from = {};
expj.AG0030010.AG0030010form1.w_date_from.executeAllOnDecision = function () {
  console.log('execute AG0030010form1/w_date_from.onDecision');
  expj.AG0030010.AG0030010form1.executeAllOnDecision();
  expj.AG0030010.executeAllOnDecision();
};
expj.AG0030010.AG0030010form1.w_date_from.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010form1-w_date_from').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0030010', 'AG0030010form1', 'w_date_from', this);
  });
  expj.AG0030010.AG0030010form1.w_date_from.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.w_date_from.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1/w_date_from.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010form1-w_date_from');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0030010-AG0030010form1-w_date_from" name="w_date_from" class="AG0030010-focus-move  required-value expj-AG0030010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAG0030010Struct.getw_date_from()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010form1-CalendarFromDate">
expj.AG0030010.AG0030010form1.CalendarFromDate = {};
// script1="onClick;0;CALENDAR;_AG0030010form1/w_date_from"
expj.AG0030010.AG0030010form1.CalendarFromDate.onClick0 = function () {
  console.log('CalendarFromDate script1');
expj.common.pscript.executeCalendar('AG0030010','AG0030010form1','_AG0030010form1/w_date_from');
};
expj.AG0030010.AG0030010form1.CalendarFromDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0030010.AG0030010form1.CalendarFromDate['onClick' + i])) {
        expj.AG0030010.AG0030010form1.CalendarFromDate['onClick' + i]();
      }
    }
  }
};
expj.AG0030010.AG0030010form1.CalendarFromDate.executeAllOnDecision = function () {
};
expj.AG0030010.AG0030010form1.CalendarFromDate.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010form1-CalendarFromDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0030010', 'AG0030010form1', 'CalendarFromDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AG0030010','AG0030010form1','_AG0030010form1/w_date_from');
  expj.AG0030010.AG0030010form1.CalendarFromDate.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.CalendarFromDate.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1/CalendarFromDate.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010form1-CalendarFromDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0030010-AG0030010form1-CalendarFromDate" class="AG0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010form1-w_date_to">
expj.AG0030010.AG0030010form1.w_date_to = {};
expj.AG0030010.AG0030010form1.w_date_to.executeAllOnDecision = function () {
  console.log('execute AG0030010form1/w_date_to.onDecision');
  expj.AG0030010.AG0030010form1.executeAllOnDecision();
  expj.AG0030010.executeAllOnDecision();
};
expj.AG0030010.AG0030010form1.w_date_to.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010form1-w_date_to').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0030010', 'AG0030010form1', 'w_date_to', this);
  });
  expj.AG0030010.AG0030010form1.w_date_to.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.w_date_to.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1/w_date_to.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010form1-w_date_to');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0030010-AG0030010form1-w_date_to" name="w_date_to" class="AG0030010-focus-move  required-value expj-AG0030010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAG0030010Struct.getw_date_to()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010form1-CalendarToDate">
expj.AG0030010.AG0030010form1.CalendarToDate = {};
// script1="onClick;0;CALENDAR;_AG0030010form1/w_date_to"
expj.AG0030010.AG0030010form1.CalendarToDate.onClick0 = function () {
  console.log('CalendarToDate script1');
expj.common.pscript.executeCalendar('AG0030010','AG0030010form1','_AG0030010form1/w_date_to');
};
expj.AG0030010.AG0030010form1.CalendarToDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0030010.AG0030010form1.CalendarToDate['onClick' + i])) {
        expj.AG0030010.AG0030010form1.CalendarToDate['onClick' + i]();
      }
    }
  }
};
expj.AG0030010.AG0030010form1.CalendarToDate.executeAllOnDecision = function () {
};
expj.AG0030010.AG0030010form1.CalendarToDate.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010form1-CalendarToDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0030010', 'AG0030010form1', 'CalendarToDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AG0030010','AG0030010form1','_AG0030010form1/w_date_to');
  expj.AG0030010.AG0030010form1.CalendarToDate.executePScriptOnLoad();
};

expj.AG0030010.AG0030010form1.CalendarToDate.executePScriptOnLoad = function () {
  console.log('execute AG0030010form1/CalendarToDate.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010form1-CalendarToDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AG0030010-AG0030010form1-CalendarToDate" class="AG0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AG0030010-AG0030010button1">
expj.AG0030010.AG0030010button1 = {};
expj.AG0030010.AG0030010button1.executeAllOnDecision = function () {
  console.log('execute AG0030010button1.onDecision');
};
expj.AG0030010.AG0030010button1.executeOnLoad = function () {
  expj.AG0030010.AG0030010button1.executePScriptOnLoad();
};

expj.AG0030010.AG0030010button1.executePScriptOnLoad = function () {
  console.log('execute AG0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0030010-AG0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0030010-AG0030010button1-Detail">
expj.AG0030010.AG0030010button1.Detail = {};
// script1="onClick;0;FSHOW;AG0030010float1"
expj.AG0030010.AG0030010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AG0030010', 'AG0030010float1', '');
};
expj.AG0030010.AG0030010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0030010.AG0030010button1.Detail['onClick' + i])) {
        expj.AG0030010.AG0030010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AG0030010.AG0030010button1.Detail.executeAllOnDecision = function () {
};
expj.AG0030010.AG0030010button1.Detail.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0030010', 'AG0030010button1', 'Detail', this, 'Button');
    }
  });
  expj.AG0030010.AG0030010button1.Detail.executePScriptOnLoad();
};

expj.AG0030010.AG0030010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AG0030010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0030010-AG0030010button1-Detail" name="Detail" class="AG0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010button1-select">
expj.AG0030010.AG0030010button1.select = {};
// script1="onClick;0;CHK;_AG0030010form1/w_date_from[gt]_AG0030010form1/w_date_to@!AB00005,*0"
expj.AG0030010.AG0030010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AG0030010', 'AG0030010button1', '_AG0030010form1/w_date_from')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AG0030010', 'AG0030010button1', '_AG0030010form1/w_date_to')))) {
expj.common.pscript.viewErrorMessage('AG0030010', 'AG0030010button1', 'AB00005');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AG0030010form1/*@AG0030010Servlet"
expj.AG0030010.AG0030010button1.select.child0 = function () {
  console.log('select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0030010', 'AG0030010button1', '_AG0030010form1/*', 'AG0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0030010', response);
expj.common.updateBusinessScreenTab('AG0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AG0030010.AG0030010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0030010.AG0030010button1.select['onClick' + i])) {
        expj.AG0030010.AG0030010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AG0030010.AG0030010button1.select.executeAllOnDecision = function () {
};
expj.AG0030010.AG0030010button1.select.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0030010', 'AG0030010button1', 'select', this, 'Button');
    }
  });
  expj.AG0030010.AG0030010button1.select.executePScriptOnLoad();
};

expj.AG0030010.AG0030010button1.select.executePScriptOnLoad = function () {
  console.log('execute AG0030010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0030010-AG0030010button1-select" name="select" class="AG0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AG0030010-AG0030010view1">
expj.AG0030010.AG0030010view1 = {};
expj.AG0030010.AG0030010view1.executeAllOnClick = function () {
};
expj.AG0030010.AG0030010view1.executeAllOnDecision = function () {
  console.log('execute AG0030010view1.onDecision');
};
expj.AG0030010.AG0030010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AG0030010view1", "expj.AG0030010.AG0030010view1.executeAllOnClick");
%>
  expj.AG0030010.AG0030010view1.executePScriptOnLoad();
};

expj.AG0030010.AG0030010view1.executePScriptOnLoad = function () {
  console.log('execute AG0030010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AG0030010-AG0030010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AG0030010view1_Id = "AG0030010view1";
 String AG0030010view1_select = "single";
 String AG0030010view1_sortable = "true";
 String AG0030010view1_resize = "true";
 String AG0030010view1_scroll = "true";
 StringBuffer AG0030010view1_HB = new StringBuffer();
 StringBuffer AG0030010view1_DB = new StringBuffer();
%>
<%
 AG0030010view1_select = "multi";
 AG0030010view1_sortable = "true";
 AG0030010view1_resize = "true";
 AG0030010view1_scroll = "true";
%>
<%
 AG0030010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AG0030010view1_sortable).append("}").append(",");
%>
      
<%
AG0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0057",rb))).append("', 'name':'PlanDate', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0030010view1_sortable).append("}").append(",");
AG0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0405",rb))).append("', 'name':'FixDemand', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AG0030010view1_sortable).append("}").append(",");
AG0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0403",rb))).append("', 'name':'PlanDemand', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AG0030010view1_sortable).append("}").append(",");
AG0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0404",rb))).append("', 'name':'FixOrder', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AG0030010view1_sortable).append("}").append(",");
AG0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0400",rb))).append("', 'name':'OldPlanOrder', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AG0030010view1_sortable).append("}").append(",");
AG0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0432",rb))).append("', 'name':'ValidStock', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0030010view1_sortable).append("}").append(",");
%>
<%
 int aAG0030010StructLength = aAG0030010Control.getListsize();
 final AG0030010Struct structBackup = aAG0030010Struct;
 aAG0030010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAG0030010StructLength; ++loopCount) {
  if((aAG0030010Struct = (AG0030010Struct) aAG0030010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAG0030010Struct", aAG0030010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AG0030010view1_DB.append("[");
 AG0030010view1_DB.append(loopCount);
%> <%
    String selColor = "000000";
    if(aAG0030010Struct.isHoliday()){
        selColor = "FF0033";
    }
    String dateColKind = "OBT_DATE;TYPE_YMD";
    String numberColKind = "OBT_NUMBER;14.1;FLOOR;4";
    if(loopCount == 0){
        dateColKind = "";
        numberColKind = "";
    }
%> <%
 AG0030010view1_DB.append(",").append("'<span id=\"expj-AG0030010-AG0030010view1-PlanDate-").append(loopCount).append("\" class=\"expj-label expj-AG0030010-AG0030010view1-PlanDate\" data-name=\"PlanDate\" data-view=\"true\" data-kind=\"").append( dateColKind ).append("\" style=\"color:#").append(selColor).append(";\">").append(TypeConverter.sanitizer(aAG0030010Struct.getPlanDate())).append("</span>'");
 AG0030010view1_DB.append(",").append("'<span id=\"expj-AG0030010-AG0030010view1-FixDemand-").append(loopCount).append("\" class=\"expj-label expj-AG0030010-AG0030010view1-FixDemand\" data-name=\"FixDemand\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAG0030010Struct.getFixDemand())).append("</span>'");
 AG0030010view1_DB.append(",").append("'<span id=\"expj-AG0030010-AG0030010view1-PlanDemand-").append(loopCount).append("\" class=\"expj-label expj-AG0030010-AG0030010view1-PlanDemand\" data-name=\"PlanDemand\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAG0030010Struct.getPlanDemand())).append("</span>'");
 AG0030010view1_DB.append(",").append("'<span id=\"expj-AG0030010-AG0030010view1-FixOrder-").append(loopCount).append("\" class=\"expj-label expj-AG0030010-AG0030010view1-FixOrder\" data-name=\"FixOrder\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAG0030010Struct.getFixOrder())).append("</span>'");
 AG0030010view1_DB.append(",").append("'<span id=\"expj-AG0030010-AG0030010view1-OldPlanOrder-").append(loopCount).append("\" class=\"expj-label expj-AG0030010-AG0030010view1-OldPlanOrder\" data-name=\"OldPlanOrder\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAG0030010Struct.getOldPlanOrder())).append("</span>'");
 AG0030010view1_DB.append(",").append("'<span id=\"expj-AG0030010-AG0030010view1-ValidStock-").append(loopCount).append("\" class=\"expj-label expj-AG0030010-AG0030010view1-ValidStock\" data-name=\"ValidStock\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0030010Struct.getValidStock())).append("</span>'");
 AG0030010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAG0030010StructLength) {
   AG0030010view1_DB.append(",");
  }
 }
 aAG0030010Struct = structBackup;
 viewIdList.add(AG0030010view1_Id);
 viewSelectList.add(AG0030010view1_select);
 viewResizeList.add(AG0030010view1_resize);
 viewScrollList.add(AG0030010view1_scroll);
 viewHeaderDataList.add(AG0030010view1_HB);
 viewBodyDataList.add(AG0030010view1_DB);
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AG0030010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AG0030010-AG0030010button0">
expj.AG0030010.AG0030010button0 = {};
expj.AG0030010.AG0030010button0.executeAllOnDecision = function () {
  console.log('execute AG0030010button0.onDecision');
};
expj.AG0030010.AG0030010button0.executeOnLoad = function () {
  expj.AG0030010.AG0030010button0.executePScriptOnLoad();
};

expj.AG0030010.AG0030010button0.executePScriptOnLoad = function () {
  console.log('execute AG0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0030010-AG0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0030010-AG0030010button0-clear">
expj.AG0030010.AG0030010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AG0030010Servlet,,$ZZ07008"
expj.AG0030010.AG0030010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0030010', 'AG0030010button0', '', 'AG0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0030010', response);
expj.common.updateBusinessScreenTab('AG0030010', contents);
};
expj.common.pscript.callConfirm('AG0030010', 'AG0030010button0', 'ZZ07008', okEvent);
};
expj.AG0030010.AG0030010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0030010.AG0030010button0.clear['onClick' + i])) {
        expj.AG0030010.AG0030010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AG0030010.AG0030010button0.clear.executeAllOnDecision = function () {
};
expj.AG0030010.AG0030010button0.clear.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0030010', 'AG0030010button0', 'clear', this, 'Button');
    }
  });
  expj.AG0030010.AG0030010button0.clear.executePScriptOnLoad();
};

expj.AG0030010.AG0030010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AG0030010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0030010-AG0030010button0-clear" name="clear" class="AG0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AG0030010-AG0030010button0-close">
expj.AG0030010.AG0030010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AG0030010.AG0030010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AG0030010');
};
expj.AG0030010.AG0030010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0030010.AG0030010button0.close['onClick' + i])) {
        expj.AG0030010.AG0030010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AG0030010.AG0030010button0.close.executeAllOnDecision = function () {
};
expj.AG0030010.AG0030010button0.close.executeOnLoad = function () {
  $('#expj-AG0030010-AG0030010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0030010', 'AG0030010button0', 'close', this, 'Button');
    }
  });
  expj.AG0030010.AG0030010button0.close.executePScriptOnLoad();
};

expj.AG0030010.AG0030010button0.close.executePScriptOnLoad = function () {
  console.log('execute AG0030010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AG0030010-AG0030010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0030010-AG0030010button0-close" name="close" class="AG0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AG0030010 (END)-->
<script class="expj-script-AG0030010-AG0030010detail1">
expj.AG0030010.AG0030010detail1 = {};
expj.AG0030010.AG0030010detail1.executeAllOnDecision = function () {
  console.log('execute AG0030010detail1.onDecision');
};
expj.AG0030010.AG0030010detail1.executeOnLoad = function () {
  expj.AG0030010.AG0030010detail1.executePScriptOnLoad();
};

expj.AG0030010.AG0030010detail1.executePScriptOnLoad = function () {
  console.log('execute AG0030010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAG0030010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AG0030010-AG0030010detail1" class="expj-datagird-detail" data-float="AG0030010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AG0030010detail1";
 detailFloat = "AG0030010float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AG0030010detail1_Id = "AG0030010detail1";
 String AG0030010detail1_select = "single";
 String AG0030010detail1_sortable = "true";
 String AG0030010detail1_resize = "true";
 String AG0030010detail1_scroll = "true";
 StringBuffer AG0030010detail1_HB = new StringBuffer();
 StringBuffer AG0030010detail1_DB = new StringBuffer();
%>
<%
 AG0030010detail1_sortable = "false";
 AG0030010detail1_select = "none";
%>
<% AG0030010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AG0030010detail1_sortable).append("}").append(","); %>
<%  AG0030010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AG0030010detail1_sortable).append("}").append(",");
AG0030010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AG0030010detail1_sortable).append("}").append(",");
AG0030010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AG0030010detail1_sortable).append("}").append(",");
 %>
  <% AG0030010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AG0030010-AG0030010detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_SPEC",rb)).append("','").append("<span id=\"expj-AG0030010-AG0030010detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AG0030010-AG0030010detail1-MRP_ODR_NAME\" class=\"expj-label\" data-name=\"MRP_ODR_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getMRP_ODR_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AG0030010-AG0030010detail1-OUTSIDE_NAME\" class=\"expj-label\" data-name=\"OUTSIDE_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getOUTSIDE_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AG0030010-AG0030010detail1-ITEM_SPOIL\" class=\"expj-label\" data-name=\"ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0030010Struct.getITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AG0030010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AG0030010-AG0030010detail1-UNIT_QTY_NAME\" class=\"expj-label\" data-name=\"UNIT_QTY_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getUNIT_QTY_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.LOT_SIZING_TYP",rb)).append("','").append("<span id=\"expj-AG0030010-AG0030010detail1-LOT_SIZING_NAME\" class=\"expj-label\" data-name=\"LOT_SIZING_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getLOT_SIZING_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.MAX_PERIOD",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AG0030010-AG0030010detail1-MAX_PERIOD\" class=\"expj-label\" data-name=\"MAX_PERIOD\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6;;\">").append(TypeConverter.sanitizer(aAG0030010Struct.getMAX_PERIOD())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.MUL_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AG0030010-AG0030010detail1-MUL_ODR_QTY\" class=\"expj-label\" data-name=\"MUL_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0030010Struct.getMUL_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AG0030010-AG0030010detail1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.MAX_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AG0030010-AG0030010detail1-MAX_ODR_QTY\" class=\"expj-label\" data-name=\"MAX_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0030010Struct.getMAX_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AG0030010-AG0030010detail1-STOCK_UNIT_1\" class=\"expj-label\" data-name=\"STOCK_UNIT_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getSTOCK_UNIT_1())).append("</span>").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.MIN_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AG0030010-AG0030010detail1-MIN_ODR_QTY\" class=\"expj-label\" data-name=\"MIN_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0030010Struct.getMIN_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AG0030010-AG0030010detail1-STOCK_UNIT_2\" class=\"expj-label\" data-name=\"STOCK_UNIT_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getSTOCK_UNIT_2())).append("</span>").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.SAFETY_STOCK",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AG0030010-AG0030010detail1-SAFETY_STOCK\" class=\"expj-label\" data-name=\"SAFETY_STOCK\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0030010Struct.getSAFETY_STOCK())).append("</span>").append("</div>','").append("<span id=\"expj-AG0030010-AG0030010detail1-STOCK_UNIT_3\" class=\"expj-label\" data-name=\"STOCK_UNIT_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getSTOCK_UNIT_3())).append("</span>").append("']").append(",");%>
 <% AG0030010detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AG0030010-AG0030010detail1-STOCK_ON_HAND_QTY\" class=\"expj-label\" data-name=\"STOCK_ON_HAND_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0030010Struct.getSTOCK_ON_HAND_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AG0030010-AG0030010detail1-STOCK_UNIT_4\" class=\"expj-label\" data-name=\"STOCK_UNIT_4\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAG0030010Struct.getSTOCK_UNIT_4())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AG0030010detail1_Id;
 detailViewSelect = AG0030010detail1_select;
 detailViewResize = AG0030010detail1_resize;
 detailViewScroll = AG0030010detail1_scroll;
 detailViewHeaderData = AG0030010detail1_HB;
 detailViewBodyData = AG0030010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAG0030010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AG0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AG0030010)) {
  expj.common.treeInstanceMap.AG0030010 = {};
}
expj.common.treeInstanceMap.AG0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AG0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AG0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AG0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AG0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AG0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AG0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AG0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AG0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0030010)) {
  expj.common.detailDialogMap.AG0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AG0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.AG0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AG0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AG0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AG0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AG0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AG0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AG0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AG0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AG0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AG0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AG0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AG0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AG0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AG0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AG0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AG0030010)) {
  expj.common.viewInstanceMap.AG0030010 = {};
}
expj.common.viewInstanceMap.AG0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.AG0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AG0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AG0030010.<%=viewId %>.init = function () {
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
    expj.AG0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AG0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AG0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AG0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AG0030010_init">
/**
 * AG0030010用のロード完了時初期化関数
 */
expj.AG0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AG0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AG0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AG0030010');
  expj.common.calendarInstanceMap.AG0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AG0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AG0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.AG0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AG0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AG0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AG0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AG0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AG0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AG0030010-<%=detailId %>');
<%
 }
%>
  try{expj.AG0030010.AG0030010form1.w_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010form1.PeekerWPlantCd.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010form1.PeekerWItemCd.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010form1.w_date_from.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010form1.CalendarFromDate.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010form1.w_date_to.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010form1.CalendarToDate.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010button1.select.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010button0.close.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010form1.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010button1.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010view1.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010button0.executeOnLoad();}catch(e){};
  try{expj.AG0030010.AG0030010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AG0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AG0030010', 'AG0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AG0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AG0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.AG0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AG0030010', '<%=request.getContextPath() %>');
};

/**
 * AG0030010の全体onDecision処理
 */
expj.AG0030010.executeAllOnDecision = function () {
  expj.AG0030010.AG0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AG0030010_console">
expj.AG0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>