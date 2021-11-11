<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:45:24 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AL0040\AL0040012.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AL0040.*" %>
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
<jsp:useBean id="aAL0040010Control" class="com.nec.jp.orteus.metamorBase.AL0040.AL0040010Control" scope="request"/>
<jsp:useBean id="aAL0040010Struct" class="com.nec.jp.orteus.metamorBase.AL0040.AL0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

工程別負荷明細
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0040/jsp/AL0040012.jsp,v $
$Author: geng-jia $    
$Revision: 1.8 $ $Date: 2017/02/22 02:06:18 $
********************************************************* --%>
<html>
<head>
<title>工程別負荷明細</title>
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
<script class="expj-script-AL0040010_init">
  // AL0040010名前空間
  expj.AL0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AL0040010" data-screen="AL0040012" data-newdata="<%=aAL0040010Control.isNewData() %>">
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
              <script class="expj-script-AL0040010-AL0040012form1">
expj.AL0040010.AL0040012form1 = {};
expj.AL0040010.AL0040012form1.executeAllOnDecision = function () {
  console.log('execute AL0040012form1.onDecision');
};
expj.AL0040010.AL0040012form1.executeOnLoad = function () {
  expj.AL0040010.AL0040012form1.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AL0040010-AL0040012form1" action="AL0040010Servlet" name="AL0040012form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.NECK_PROC_CD",rb)%></span><!-- 制約工程コード --></div><!--/td-->
<script class="expj-script-AL0040010-AL0040012form1-LKM_NECK_PROC_CD">
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CD = {};
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/LKM_NECK_PROC_CD.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CD.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-LKM_NECK_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'LKM_NECK_PROC_CD', this);
  });
  expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CD.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/LKM_NECK_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-LKM_NECK_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AL0040010-AL0040012form1-LKM_NECK_PROC_CD" name="LKM_NECK_PROC_CD" class="AL0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getLKM_NECK_PROC_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AL0040010-AL0040012form1-LKM_NECK_PROC_NAME">
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_NAME = {};
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_NAME.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/LKM_NECK_PROC_NAME.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_NAME.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-LKM_NECK_PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'LKM_NECK_PROC_NAME', this);
  });
  expj.AL0040010.AL0040012form1.LKM_NECK_PROC_NAME.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.LKM_NECK_PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/LKM_NECK_PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-LKM_NECK_PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AL0040010-AL0040012form1-LKM_NECK_PROC_NAME" name="LKM_NECK_PROC_NAME" class="AL0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getLKM_NECK_PROC_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AL0040010-AL0040012form1-K_PLANT_CD" name="K_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getK_PLANT_CD()) %>">
<script class="expj-script-AL0040010-AL0040012form1-K_PLANT_CD">
expj.AL0040010.AL0040012form1.K_PLANT_CD = {};
expj.AL0040010.AL0040012form1.K_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/K_PLANT_CD.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.K_PLANT_CD.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-K_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'K_PLANT_CD', this);
  });
  expj.AL0040010.AL0040012form1.K_PLANT_CD.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.K_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/K_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-K_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AL0040010-AL0040012form1-K_NECK_PROC_CD" name="K_NECK_PROC_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getK_NECK_PROC_CD()) %>">
<script class="expj-script-AL0040010-AL0040012form1-K_NECK_PROC_CD">
expj.AL0040010.AL0040012form1.K_NECK_PROC_CD = {};
expj.AL0040010.AL0040012form1.K_NECK_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/K_NECK_PROC_CD.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.K_NECK_PROC_CD.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-K_NECK_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'K_NECK_PROC_CD', this);
  });
  expj.AL0040010.AL0040012form1.K_NECK_PROC_CD.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.K_NECK_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/K_NECK_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-K_NECK_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0040010-AL0040012form1-K_LOAD_DATE" name="K_LOAD_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getK_LOAD_DATE()) %>">
<script class="expj-script-AL0040010-AL0040012form1-K_LOAD_DATE">
expj.AL0040010.AL0040012form1.K_LOAD_DATE = {};
expj.AL0040010.AL0040012form1.K_LOAD_DATE.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/K_LOAD_DATE.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.K_LOAD_DATE.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-K_LOAD_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'K_LOAD_DATE', this);
  });
  expj.AL0040010.AL0040012form1.K_LOAD_DATE.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.K_LOAD_DATE.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/K_LOAD_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-K_LOAD_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.NECK_PROC_CAPA_1",rb)%></span><!-- 能力／日 --></div><!--/td-->
<script class="expj-script-AL0040010-AL0040012form1-LKM_NECK_PROC_CAPA">
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA = {};
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/LKM_NECK_PROC_CAPA.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-LKM_NECK_PROC_CAPA').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'LKM_NECK_PROC_CAPA', this);
  });
  expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/LKM_NECK_PROC_CAPA.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-LKM_NECK_PROC_CAPA');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0040010-AL0040012form1-LKM_NECK_PROC_CAPA" name="LKM_NECK_PROC_CAPA" class="AL0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;8.1;FLOOR;2" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getLKM_NECK_PROC_CAPA()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AL0040010-AL0040012form1-LKM_NECK_PROC_CAPA_UNIT">
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA_UNIT = {};
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA_UNIT.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/LKM_NECK_PROC_CAPA_UNIT.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA_UNIT.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-LKM_NECK_PROC_CAPA_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'LKM_NECK_PROC_CAPA_UNIT', this);
  });
  expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA_UNIT.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA_UNIT.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/LKM_NECK_PROC_CAPA_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-LKM_NECK_PROC_CAPA_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AL0040010-AL0040012form1-LKM_NECK_PROC_CAPA_UNIT" name="LKM_NECK_PROC_CAPA_UNIT" class="AL0040010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getLKM_NECK_PROC_CAPA_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0040010-AL0040012form1-DateFrom" name="DateFrom" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getDateFrom()) %>">
<script class="expj-script-AL0040010-AL0040012form1-DateFrom">
expj.AL0040010.AL0040012form1.DateFrom = {};
expj.AL0040010.AL0040012form1.DateFrom.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/DateFrom.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.DateFrom.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-DateFrom').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'DateFrom', this);
  });
  expj.AL0040010.AL0040012form1.DateFrom.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.DateFrom.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/DateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-DateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0040010-AL0040012form1-DateTo" name="DateTo" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getDateTo()) %>">
<script class="expj-script-AL0040010-AL0040012form1-DateTo">
expj.AL0040010.AL0040012form1.DateTo = {};
expj.AL0040010.AL0040012form1.DateTo.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/DateTo.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.DateTo.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-DateTo').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'DateTo', this);
  });
  expj.AL0040010.AL0040012form1.DateTo.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.DateTo.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/DateTo.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-DateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOAD_DATE_1",rb)%></span><!-- 負荷参照日 --></div><!--/td-->
<script class="expj-script-AL0040010-AL0040012form1-LKM_LOAD_DATE">
expj.AL0040010.AL0040012form1.LKM_LOAD_DATE = {};
expj.AL0040010.AL0040012form1.LKM_LOAD_DATE.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/LKM_LOAD_DATE.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.LKM_LOAD_DATE.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-LKM_LOAD_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'LKM_LOAD_DATE', this);
  });
  expj.AL0040010.AL0040012form1.LKM_LOAD_DATE.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.LKM_LOAD_DATE.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/LKM_LOAD_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-LKM_LOAD_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0040010-AL0040012form1-LKM_LOAD_DATE" name="LKM_LOAD_DATE" class="AL0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getLKM_LOAD_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0040010-AL0040012form1-Shift_Date" name="Shift_Date" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getShift_Date()) %>">
<script class="expj-script-AL0040010-AL0040012form1-Shift_Date">
expj.AL0040010.AL0040012form1.Shift_Date = {};
expj.AL0040010.AL0040012form1.Shift_Date.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/Shift_Date.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.Shift_Date.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-Shift_Date').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'Shift_Date', this);
  });
  expj.AL0040010.AL0040012form1.Shift_Date.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.Shift_Date.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/Shift_Date.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-Shift_Date');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0040010-AL0040012form1-S_LOAD_DATE" name="S_LOAD_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getS_LOAD_DATE()) %>">
<script class="expj-script-AL0040010-AL0040012form1-S_LOAD_DATE">
expj.AL0040010.AL0040012form1.S_LOAD_DATE = {};
expj.AL0040010.AL0040012form1.S_LOAD_DATE.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/S_LOAD_DATE.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.S_LOAD_DATE.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-S_LOAD_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'S_LOAD_DATE', this);
  });
  expj.AL0040010.AL0040012form1.S_LOAD_DATE.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.S_LOAD_DATE.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/S_LOAD_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-S_LOAD_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOAD_QTY_1",rb)%></span><!-- 合計負荷量 --></div><!--/td-->
<script class="expj-script-AL0040010-AL0040012form1-LKM_SUM_LOAD_QTY">
expj.AL0040010.AL0040012form1.LKM_SUM_LOAD_QTY = {};
expj.AL0040010.AL0040012form1.LKM_SUM_LOAD_QTY.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/LKM_SUM_LOAD_QTY.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.LKM_SUM_LOAD_QTY.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-LKM_SUM_LOAD_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'LKM_SUM_LOAD_QTY', this);
  });
  expj.AL0040010.AL0040012form1.LKM_SUM_LOAD_QTY.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.LKM_SUM_LOAD_QTY.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/LKM_SUM_LOAD_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-LKM_SUM_LOAD_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0040010-AL0040012form1-LKM_SUM_LOAD_QTY" name="LKM_SUM_LOAD_QTY" class="AL0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;18.1;FLOOR;6" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getLKM_SUM_LOAD_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOAD_QTY_2",rb)%></span><!-- 負荷オーバ量 --></div><!--/td-->
<script class="expj-script-AL0040010-AL0040012form1-LKM_OVR_LOAD_QTY">
expj.AL0040010.AL0040012form1.LKM_OVR_LOAD_QTY = {};
expj.AL0040010.AL0040012form1.LKM_OVR_LOAD_QTY.executeAllOnDecision = function () {
  console.log('execute AL0040012form1/LKM_OVR_LOAD_QTY.onDecision');
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
  expj.AL0040010.executeAllOnDecision();
};
expj.AL0040010.AL0040012form1.LKM_OVR_LOAD_QTY.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012form1-LKM_OVR_LOAD_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0040010', 'AL0040012form1', 'LKM_OVR_LOAD_QTY', this);
  });
  expj.AL0040010.AL0040012form1.LKM_OVR_LOAD_QTY.executePScriptOnLoad();
};

expj.AL0040010.AL0040012form1.LKM_OVR_LOAD_QTY.executePScriptOnLoad = function () {
  console.log('execute AL0040012form1/LKM_OVR_LOAD_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012form1-LKM_OVR_LOAD_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0040010-AL0040012form1-LKM_OVR_LOAD_QTY" name="LKM_OVR_LOAD_QTY" class="AL0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;18.1;FLOOR;6" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getLKM_OVR_LOAD_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AL0040010-AL0040012view1">
expj.AL0040010.AL0040012view1 = {};
expj.AL0040010.AL0040012view1.executeAllOnClick = function () {
};
expj.AL0040010.AL0040012view1.executeAllOnDecision = function () {
  console.log('execute AL0040012view1.onDecision');
};
expj.AL0040010.AL0040012view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AL0040012view1", "expj.AL0040010.AL0040012view1.executeAllOnClick");
%>
  expj.AL0040010.AL0040012view1.executePScriptOnLoad();
};

expj.AL0040010.AL0040012view1.executePScriptOnLoad = function () {
  console.log('execute AL0040012view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AL0040010-AL0040012view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AL0040012view1_Id = "AL0040012view1";
 String AL0040012view1_select = "single";
 String AL0040012view1_sortable = "true";
 String AL0040012view1_resize = "true";
 String AL0040012view1_scroll = "true";
 StringBuffer AL0040012view1_HB = new StringBuffer();
 StringBuffer AL0040012view1_DB = new StringBuffer();
%>
<%
 AL0040012view1_select = "multi";
 AL0040012view1_sortable = "true";
 AL0040012view1_resize = "true";
 AL0040012view1_scroll = "true";
%>
<%
 AL0040012view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
%>
     
<%
AL0040012view1_HB.append("{'visible':true, 'type':'string', 'width':'116px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'LKM_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
AL0040012view1_HB.append("{'visible':true, 'type':'string', 'width':'154px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'LKM_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
AL0040012view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'LKM_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
AL0040012view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_STS_TYP",rb))).append("', 'name':'LKM_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
AL0040012view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb))).append("', 'name':'LKM_PRD_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
AL0040012view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb))).append("', 'name':'LKM_PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
AL0040012view1_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_QTY_1",rb))).append("', 'name':'LKM_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
AL0040012view1_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_QTY_1",rb))).append("', 'name':'LKM_TOTAL_RCV_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
AL0040012view1_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_LOAD_1",rb))).append("', 'name':'LKM_UNIT_LOAD', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
AL0040012view1_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.LOAD_QTY",rb))).append("', 'name':'LKM_LOAD_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AL0040012view1_sortable).append("}").append(",");
%>
<%
 int aAL0040010StructLength = aAL0040010Control.getListsize();
 final AL0040010Struct structBackup = aAL0040010Struct;
 aAL0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAL0040010StructLength; ++loopCount) {
  if((aAL0040010Struct = (AL0040010Struct) aAL0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAL0040010Struct", aAL0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AL0040012view1_DB.append("[");
 AL0040012view1_DB.append(loopCount);
 AL0040012view1_DB.append(",").append("'<span id=\"expj-AL0040010-AL0040012view1-LKM_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AL0040010-AL0040012view1-LKM_ITEM_CD\" data-name=\"LKM_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0040010Struct.getLKM_ITEM_CD())).append("</span>'");
 AL0040012view1_DB.append(",").append("'<span id=\"expj-AL0040010-AL0040012view1-LKM_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AL0040010-AL0040012view1-LKM_ITEM_NAME\" data-name=\"LKM_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0040010Struct.getLKM_ITEM_NAME())).append("</span>'");
 AL0040012view1_DB.append(",").append("'<span id=\"expj-AL0040010-AL0040012view1-LKM_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AL0040010-AL0040012view1-LKM_JOB_ODR_CD\" data-name=\"LKM_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0040010Struct.getLKM_JOB_ODR_CD())).append("</span>'");
 AL0040012view1_DB.append(",").append("'<span id=\"expj-AL0040010-AL0040012view1-LKM_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AL0040010-AL0040012view1-LKM_ODR_STS_TYP\" data-name=\"LKM_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0040010Struct.getLKM_ODR_STS_TYP())).append("</span>'");
 AL0040012view1_DB.append(",").append("'<span id=\"expj-AL0040010-AL0040012view1-LKM_PRD_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AL0040010-AL0040012view1-LKM_PRD_START_DATE\" data-name=\"LKM_PRD_START_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAL0040010Struct.getLKM_PRD_START_DATE())).append("</span>'");
 AL0040012view1_DB.append(",").append("'<span id=\"expj-AL0040010-AL0040012view1-LKM_PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AL0040010-AL0040012view1-LKM_PRD_DUE_DATE\" data-name=\"LKM_PRD_DUE_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAL0040010Struct.getLKM_PRD_DUE_DATE())).append("</span>'");
 AL0040012view1_DB.append(",").append("'<span id=\"expj-AL0040010-AL0040012view1-LKM_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AL0040010-AL0040012view1-LKM_ODR_QTY\" data-name=\"LKM_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAL0040010Struct.getLKM_ODR_QTY())).append("</span>'");
 AL0040012view1_DB.append(",").append("'<span id=\"expj-AL0040010-AL0040012view1-LKM_TOTAL_RCV_QTY-").append(loopCount).append("\" class=\"expj-label expj-AL0040010-AL0040012view1-LKM_TOTAL_RCV_QTY\" data-name=\"LKM_TOTAL_RCV_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAL0040010Struct.getLKM_TOTAL_RCV_QTY())).append("</span>'");
 AL0040012view1_DB.append(",").append("'<span id=\"expj-AL0040010-AL0040012view1-LKM_UNIT_LOAD-").append(loopCount).append("\" class=\"expj-label expj-AL0040010-AL0040012view1-LKM_UNIT_LOAD\" data-name=\"LKM_UNIT_LOAD\" data-view=\"true\" data-kind=\"OBT_NUMBER;4.1;FLOOR;2\">").append(TypeConverter.sanitizer(aAL0040010Struct.getLKM_UNIT_LOAD())).append("</span>'");
 AL0040012view1_DB.append(",").append("'<span id=\"expj-AL0040010-AL0040012view1-LKM_LOAD_QTY-").append(loopCount).append("\" class=\"expj-label expj-AL0040010-AL0040012view1-LKM_LOAD_QTY\" data-name=\"LKM_LOAD_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;18.1;FLOOR;6\">").append(TypeConverter.sanitizer(aAL0040010Struct.getLKM_LOAD_QTY())).append("</span>'");
 AL0040012view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAL0040010StructLength) {
   AL0040012view1_DB.append(",");
  }
 }
 aAL0040010Struct = structBackup;
 viewIdList.add(AL0040012view1_Id);
 viewSelectList.add(AL0040012view1_select);
 viewResizeList.add(AL0040012view1_resize);
 viewScrollList.add(AL0040012view1_scroll);
 viewHeaderDataList.add(AL0040012view1_HB);
 viewBodyDataList.add(AL0040012view1_DB);
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
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AL0040012 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AL0040010-AL0040012button0">
expj.AL0040010.AL0040012button0 = {};
expj.AL0040010.AL0040012button0.executeAllOnDecision = function () {
  console.log('execute AL0040012button0.onDecision');
};
expj.AL0040010.AL0040012button0.executeOnLoad = function () {
  expj.AL0040010.AL0040012button0.executePScriptOnLoad();
};

expj.AL0040010.AL0040012button0.executePScriptOnLoad = function () {
  console.log('execute AL0040012button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0040010-AL0040012button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0040010-AL0040012button0-CancelSub2">
expj.AL0040010.AL0040012button0.CancelSub2 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AL0040012form1/*@AL0040010Servlet,,$ZZ07013"
expj.AL0040010.AL0040012button0.CancelSub2.onClick0 = function () {
  console.log('CancelSub2 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0040010', 'AL0040012button0', '_AL0040012form1/*', 'AL0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0040010', response);
expj.common.changeBusinessScreenTab('AL0040010', contents);
};
expj.common.pscript.callConfirm('AL0040010', 'AL0040012button0', 'ZZ07013', okEvent);
};
expj.AL0040010.AL0040012button0.CancelSub2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0040010.AL0040012button0.CancelSub2['onClick' + i])) {
        expj.AL0040010.AL0040012button0.CancelSub2['onClick' + i]();
      }
    }
  }
};
expj.AL0040010.AL0040012button0.CancelSub2.executeAllOnDecision = function () {
};
expj.AL0040010.AL0040012button0.CancelSub2.executeOnLoad = function () {
  $('#expj-AL0040010-AL0040012button0-CancelSub2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0040010', 'AL0040012button0', 'CancelSub2', this, 'Button');
    }
  });
  expj.AL0040010.AL0040012button0.CancelSub2.executePScriptOnLoad();
};

expj.AL0040010.AL0040012button0.CancelSub2.executePScriptOnLoad = function () {
  console.log('execute AL0040012button0/CancelSub2.onLoad');
  var targetComponent = document.getElementById('expj-AL0040010-AL0040012button0-CancelSub2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0040010-AL0040012button0-CancelSub2" name="CancelSub2" class="AL0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AL0040010 (END)-->
<%
  MessageStruct msgStruct = aAL0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AL0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AL0040010)) {
  expj.common.treeInstanceMap.AL0040010 = {};
}
expj.common.treeInstanceMap.AL0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AL0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AL0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AL0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AL0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AL0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AL0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AL0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AL0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AL0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AL0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0040010)) {
  expj.common.detailDialogMap.AL0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AL0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AL0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AL0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AL0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AL0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AL0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AL0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AL0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AL0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AL0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AL0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AL0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AL0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AL0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AL0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AL0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AL0040010)) {
  expj.common.viewInstanceMap.AL0040010 = {};
}
expj.common.viewInstanceMap.AL0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AL0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AL0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AL0040010.<%=viewId %>.init = function () {
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
    expj.AL0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AL0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AL0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AL0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AL0040010_init">
/**
 * AL0040010用のロード完了時初期化関数
 */
expj.AL0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AL0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AL0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AL0040010');
  expj.common.calendarInstanceMap.AL0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AL0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AL0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AL0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AL0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AL0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AL0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AL0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AL0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AL0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.LKM_NECK_PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.K_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.K_NECK_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.K_LOAD_DATE.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.LKM_NECK_PROC_CAPA_UNIT.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.DateFrom.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.DateTo.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.LKM_LOAD_DATE.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.Shift_Date.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.S_LOAD_DATE.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.LKM_SUM_LOAD_QTY.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.LKM_OVR_LOAD_QTY.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012button0.CancelSub2.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012form1.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012view1.executeOnLoad();}catch(e){};
  try{expj.AL0040010.AL0040012button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AL0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AL0040010', 'AL0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AL0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AL0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AL0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AL0040010', '<%=request.getContextPath() %>');
};

/**
 * AL0040010の全体onDecision処理
 */
expj.AL0040010.executeAllOnDecision = function () {
  expj.AL0040010.AL0040012form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AL0040010_console">
expj.AL0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>