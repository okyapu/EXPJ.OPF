<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:43:55 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AJ0040\AJ0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AJ0040.*" %>
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
<jsp:useBean id="aAJ0040010Control" class="com.nec.jp.orteus.metamorBase.AJ0040.AJ0040010Control" scope="request"/>
<jsp:useBean id="aAJ0040010Struct" class="com.nec.jp.orteus.metamorBase.AJ0040.AJ0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

発注指示進捗一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0040/jsp/AJ0040010.jsp,v $
$Author: geng-jia $	
$Revision: 1.11 $ $Date: 2017/02/22 02:06:13 $
********************************************************* --%>
<html>
<head>
<title>発注指示進捗一覧</title>
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
<script class="expj-script-AJ0040010_init">
  // AJ0040010名前空間
  expj.AJ0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AJ0040010" data-screen="AJ0040010" data-newdata="<%=aAJ0040010Control.isNewData() %>">
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
              <script class="expj-script-AJ0040010-AJ0040010form1">
expj.AJ0040010.AJ0040010form1 = {};
expj.AJ0040010.AJ0040010form1.executeAllOnDecision = function () {
  console.log('execute AJ0040010form1.onDecision');
};
expj.AJ0040010.AJ0040010form1.executeOnLoad = function () {
  expj.AJ0040010.AJ0040010form1.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form1.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AJ0040010-AJ0040010form1" action="AJ0040010Servlet" name="AJ0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form1-PLANT_CD">
expj.AJ0040010.AJ0040010form1.PLANT_CD = {};
expj.AJ0040010.AJ0040010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AJ0040010form1/PLANT_CD.onDecision');
  expj.AJ0040010.AJ0040010form1.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form1', 'PLANT_CD', this);
  });
  expj.AJ0040010.AJ0040010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form1-PLANT_CD" name="PLANT_CD" class="AJ0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getPLANT_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form1-PLANT_NAME">
expj.AJ0040010.AJ0040010form1.PLANT_NAME = {};
expj.AJ0040010.AJ0040010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AJ0040010form1/PLANT_NAME.onDecision');
  expj.AJ0040010.AJ0040010form1.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form1', 'PLANT_NAME', this);
  });
  expj.AJ0040010.AJ0040010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form1-PLANT_NAME" name="PLANT_NAME" class="AJ0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form1-JOB_ODR_CD">
expj.AJ0040010.AJ0040010form1.JOB_ODR_CD = {};
expj.AJ0040010.AJ0040010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AJ0040010form1/JOB_ODR_CD.onDecision');
  expj.AJ0040010.AJ0040010form1.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form1', 'JOB_ODR_CD', this);
  });
  expj.AJ0040010.AJ0040010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AJ0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getJOB_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form1-JOB_ODR_CANCEL_NO">
expj.AJ0040010.AJ0040010form1.JOB_ODR_CANCEL_NO = {};
expj.AJ0040010.AJ0040010form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AJ0040010form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AJ0040010.AJ0040010form1.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AJ0040010.AJ0040010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AJ0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6;;" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_TYP",rb)%></span><!-- 製番種別 --></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form1-JOB_ODR_TYP_DN">
expj.AJ0040010.AJ0040010form1.JOB_ODR_TYP_DN = {};
expj.AJ0040010.AJ0040010form1.JOB_ODR_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AJ0040010form1/JOB_ODR_TYP_DN.onDecision');
  expj.AJ0040010.AJ0040010form1.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form1.JOB_ODR_TYP_DN.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form1-JOB_ODR_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form1', 'JOB_ODR_TYP_DN', this);
  });
  expj.AJ0040010.AJ0040010form1.JOB_ODR_TYP_DN.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form1.JOB_ODR_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form1/JOB_ODR_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form1-JOB_ODR_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form1-JOB_ODR_TYP_DN" name="JOB_ODR_TYP_DN" class="AJ0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getJOB_ODR_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALC_GRP_CD",rb)%></span><!-- 引当グループコード --></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form1-ALC_GRP_CD">
expj.AJ0040010.AJ0040010form1.ALC_GRP_CD = {};
expj.AJ0040010.AJ0040010form1.ALC_GRP_CD.executeAllOnDecision = function () {
  console.log('execute AJ0040010form1/ALC_GRP_CD.onDecision');
  expj.AJ0040010.AJ0040010form1.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form1.ALC_GRP_CD.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form1-ALC_GRP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form1', 'ALC_GRP_CD', this);
  });
  expj.AJ0040010.AJ0040010form1.ALC_GRP_CD.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form1.ALC_GRP_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form1/ALC_GRP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form1-ALC_GRP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form1-ALC_GRP_CD" name="ALC_GRP_CD" class="AJ0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getALC_GRP_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form1-ITEM_CD">
expj.AJ0040010.AJ0040010form1.ITEM_CD = {};
expj.AJ0040010.AJ0040010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AJ0040010form1/ITEM_CD.onDecision');
  expj.AJ0040010.AJ0040010form1.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form1', 'ITEM_CD', this);
  });
  expj.AJ0040010.AJ0040010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form1-ITEM_CD" name="ITEM_CD" class="AJ0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form1-ITEM_NAME">
expj.AJ0040010.AJ0040010form1.ITEM_NAME = {};
expj.AJ0040010.AJ0040010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AJ0040010form1/ITEM_NAME.onDecision');
  expj.AJ0040010.AJ0040010form1.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form1', 'ITEM_NAME', this);
  });
  expj.AJ0040010.AJ0040010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form1-ITEM_NAME" name="ITEM_NAME" class="AJ0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AJ0040010-AJ0040010view1">
expj.AJ0040010.AJ0040010view1 = {};
expj.AJ0040010.AJ0040010view1.executeAllOnClick = function () {
};
expj.AJ0040010.AJ0040010view1.executeAllOnDecision = function () {
  console.log('execute AJ0040010view1.onDecision');
};
expj.AJ0040010.AJ0040010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AJ0040010view1", "expj.AJ0040010.AJ0040010view1.executeAllOnClick");
%>
  expj.AJ0040010.AJ0040010view1.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010view1.executePScriptOnLoad = function () {
  console.log('execute AJ0040010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AJ0040010-AJ0040010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AJ0040010view1_Id = "AJ0040010view1";
 String AJ0040010view1_select = "single";
 String AJ0040010view1_sortable = "true";
 String AJ0040010view1_resize = "true";
 String AJ0040010view1_scroll = "true";
 StringBuffer AJ0040010view1_HB = new StringBuffer();
 StringBuffer AJ0040010view1_DB = new StringBuffer();
%>
<%
 AJ0040010view1_select = "single";
 AJ0040010view1_sortable = "true";
 AJ0040010view1_resize = "true";
 AJ0040010view1_scroll = "true";
%>
<%
 AJ0040010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
%>
       
<%
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0437",rb))).append("', 'name':'l_PROGRESS_STATUS_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_STS_TYP",rb))).append("', 'name':'l_PUCH_ODR_STS_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'l_PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_ANAME",rb))).append("', 'name':'l_VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD_2",rb))).append("', 'name':'l_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_INST_DATE",rb))).append("', 'name':'l_PUCH_ODR_INST_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_EDI_ISS_DATE",rb))).append("', 'name':'l_PUCH_ODR_EDI_ISS_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_SLIP_ISS_DATE_1",rb))).append("', 'name':'l_PUCH_ODR_SLIP_ISS_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_START_DATE",rb))).append("', 'name':'l_PUCH_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb))).append("', 'name':'l_PUCH_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONFIRM_DLV_DATE",rb))).append("', 'name':'l_CONFIRM_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb))).append("', 'name':'l_PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_QTY_5",rb))).append("', 'name':'l_TOTAL_ACPT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_CMPLT_DATE",rb))).append("', 'name':'l_ACPT_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0317",rb))).append("', 'name':'l_TOTAL_INSPECTED_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0324",rb))).append("', 'name':'l_TOTAL_ACCEPTED_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0325",rb))).append("', 'name':'l_TOTAL_DEFECTED_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPC_CMPLT_DATE",rb))).append("', 'name':'l_INSPC_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb))).append("', 'name':'l_ACPT_INSPC_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt1030",rb))).append("', 'name':'l_CONFIRM_DLV_DATE_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
AJ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PUCH_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0040010view1_sortable).append("}").append(",");
%>
<%
 int aAJ0040010StructLength = aAJ0040010Control.getListsize();
 final AJ0040010Struct structBackup = aAJ0040010Struct;
 aAJ0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAJ0040010StructLength; ++loopCount) {
  if((aAJ0040010Struct = (AJ0040010Struct) aAJ0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAJ0040010Struct", aAJ0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AJ0040010view1_DB.append("[");
 AJ0040010view1_DB.append(loopCount);
%> <%
String bgcolor = null;
if (aAJ0040010Struct.getl_PROGRESS_STATUS_DN() == null
		|| "".equals(aAJ0040010Struct.getl_PROGRESS_STATUS_DN())) {
	bgcolor="";
} else {
	bgcolor="FFCCCC";
}
%> <%
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_PROGRESS_STATUS_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_PROGRESS_STATUS_DN\" data-name=\"l_PROGRESS_STATUS_DN\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_PROGRESS_STATUS_DN())).append("</span>'");
%> <%
bgcolor = null;
if ("1".equals(aAJ0040010Struct.getl_PUCH_ODR_STS_TYP())) {
	bgcolor="FFFF99";
} else if ("2".equals(aAJ0040010Struct.getl_PUCH_ODR_STS_TYP())) {
	bgcolor="A9EA9E";
} else {
	bgcolor="ADD8E6";
}
%> <%
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_STS_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_STS_TYP_DN\" data-name=\"l_PUCH_ODR_STS_TYP_DN\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_PUCH_ODR_STS_TYP_DN())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_CD\" data-name=\"l_PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_PUCH_ODR_CD())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_VEND_CD())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_VEND_ANAME\" data-name=\"l_VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_VEND_ANAME())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_WH_CD\" data-name=\"l_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_WH_CD())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_INST_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_INST_DATE\" data-name=\"l_PUCH_ODR_INST_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_PUCH_ODR_INST_DATE())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_EDI_ISS_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_EDI_ISS_DATE\" data-name=\"l_PUCH_ODR_EDI_ISS_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_PUCH_ODR_EDI_ISS_DATE())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_SLIP_ISS_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_SLIP_ISS_DATE\" data-name=\"l_PUCH_ODR_SLIP_ISS_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_PUCH_ODR_SLIP_ISS_DATE())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_START_DATE\" data-name=\"l_PUCH_ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_PUCH_ODR_START_DATE())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_DLV_DATE\" data-name=\"l_PUCH_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_PUCH_ODR_DLV_DATE())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_CONFIRM_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_CONFIRM_DLV_DATE\" data-name=\"l_CONFIRM_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_CONFIRM_DLV_DATE())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_QTY\" data-name=\"l_PUCH_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_PUCH_ODR_QTY())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_TOTAL_ACPT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_TOTAL_ACPT_QTY\" data-name=\"l_TOTAL_ACPT_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_TOTAL_ACPT_QTY())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_ACPT_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_ACPT_CMPLT_DATE\" data-name=\"l_ACPT_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_ACPT_CMPLT_DATE())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_TOTAL_INSPECTED_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_TOTAL_INSPECTED_QTY\" data-name=\"l_TOTAL_INSPECTED_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_TOTAL_INSPECTED_QTY())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_TOTAL_ACCEPTED_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_TOTAL_ACCEPTED_QTY\" data-name=\"l_TOTAL_ACCEPTED_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_TOTAL_ACCEPTED_QTY())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_TOTAL_DEFECTED_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_TOTAL_DEFECTED_QTY\" data-name=\"l_TOTAL_DEFECTED_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_TOTAL_DEFECTED_QTY())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_INSPC_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_INSPC_CMPLT_DATE\" data-name=\"l_INSPC_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_INSPC_CMPLT_DATE())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_ACPT_INSPC_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_ACPT_INSPC_TYP_DN\" data-name=\"l_ACPT_INSPC_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_ACPT_INSPC_TYP_DN())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_CONFIRM_DLV_DATE_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_CONFIRM_DLV_DATE_COMMENT\" data-name=\"l_CONFIRM_DLV_DATE_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_CONFIRM_DLV_DATE_COMMENT())).append("</span>'");
 AJ0040010view1_DB.append(",").append("'<span id=\"expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AJ0040010-AJ0040010view1-l_PUCH_ODR_STS_TYP\" data-name=\"l_PUCH_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0040010Struct.getl_PUCH_ODR_STS_TYP())).append("</span>'");
 AJ0040010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAJ0040010StructLength) {
   AJ0040010view1_DB.append(",");
  }
 }
 aAJ0040010Struct = structBackup;
 viewIdList.add(AJ0040010view1_Id);
 viewSelectList.add(AJ0040010view1_select);
 viewResizeList.add(AJ0040010view1_resize);
 viewScrollList.add(AJ0040010view1_scroll);
 viewHeaderDataList.add(AJ0040010view1_HB);
 viewBodyDataList.add(AJ0040010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:px;">
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに上段検索条件用のDataGridを配置する。↓ --><script class="expj-script-AJ0040010-AJ0040010form2">
expj.AJ0040010.AJ0040010form2 = {};
expj.AJ0040010.AJ0040010form2.executeAllOnDecision = function () {
  console.log('execute AJ0040010form2.onDecision');
};
expj.AJ0040010.AJ0040010form2.executeOnLoad = function () {
  expj.AJ0040010.AJ0040010form2.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form2.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AJ0040010-AJ0040010form2" action="AJ0040010Servlet" name="AJ0040010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:110px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_QTY",rb)%></span><!-- 製番数 --></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form2-JOB_ODR_QTY">
expj.AJ0040010.AJ0040010form2.JOB_ODR_QTY = {};
expj.AJ0040010.AJ0040010form2.JOB_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AJ0040010form2/JOB_ODR_QTY.onDecision');
  expj.AJ0040010.AJ0040010form2.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form2.JOB_ODR_QTY.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form2-JOB_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form2', 'JOB_ODR_QTY', this);
  });
  expj.AJ0040010.AJ0040010form2.JOB_ODR_QTY.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form2.JOB_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form2/JOB_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form2-JOB_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form2-JOB_ODR_QTY" name="JOB_ODR_QTY" class="AJ0040010-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getJOB_ODR_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)%></span><!-- 製造納期 --></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form2-JOB_ODR_DLV_DATE">
expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_DATE = {};
expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AJ0040010form2/JOB_ODR_DLV_DATE.onDecision');
  expj.AJ0040010.AJ0040010form2.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form2-JOB_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form2', 'JOB_ODR_DLV_DATE', this);
  });
  expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form2/JOB_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form2-JOB_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form2-JOB_ODR_DLV_DATE" name="JOB_ODR_DLV_DATE" class="AJ0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getJOB_ODR_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form2-JOB_ODR_DLV_TIME">
expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_TIME = {};
expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_TIME.executeAllOnDecision = function () {
  console.log('execute AJ0040010form2/JOB_ODR_DLV_TIME.onDecision');
  expj.AJ0040010.AJ0040010form2.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_TIME.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form2-JOB_ODR_DLV_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form2', 'JOB_ODR_DLV_TIME', this);
  });
  expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_TIME.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_TIME.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form2/JOB_ODR_DLV_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form2-JOB_ODR_DLV_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form2-JOB_ODR_DLV_TIME" name="JOB_ODR_DLV_TIME" class="AJ0040010-focus-move  " style="width:88px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getJOB_ODR_DLV_TIME()) %>" maxlength="5" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form2-DRAW_CD">
expj.AJ0040010.AJ0040010form2.DRAW_CD = {};
expj.AJ0040010.AJ0040010form2.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AJ0040010form2/DRAW_CD.onDecision');
  expj.AJ0040010.AJ0040010form2.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form2.DRAW_CD.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form2-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form2', 'DRAW_CD', this);
  });
  expj.AJ0040010.AJ0040010form2.DRAW_CD.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form2.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form2/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form2-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form2-DRAW_CD" name="DRAW_CD" class="AJ0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:110px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AJ0040010-AJ0040010form2-SPEC">
expj.AJ0040010.AJ0040010form2.SPEC = {};
expj.AJ0040010.AJ0040010form2.SPEC.executeAllOnDecision = function () {
  console.log('execute AJ0040010form2/SPEC.onDecision');
  expj.AJ0040010.AJ0040010form2.executeAllOnDecision();
  expj.AJ0040010.executeAllOnDecision();
};
expj.AJ0040010.AJ0040010form2.SPEC.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010form2-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0040010', 'AJ0040010form2', 'SPEC', this);
  });
  expj.AJ0040010.AJ0040010form2.SPEC.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010form2.SPEC.executePScriptOnLoad = function () {
  console.log('execute AJ0040010form2/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010form2-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AJ0040010-AJ0040010form2-SPEC" name="SPEC" class="AJ0040010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0040010Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AJ0040010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AJ0040010-AJ0040010button0">
expj.AJ0040010.AJ0040010button0 = {};
expj.AJ0040010.AJ0040010button0.executeAllOnDecision = function () {
  console.log('execute AJ0040010button0.onDecision');
};
expj.AJ0040010.AJ0040010button0.executeOnLoad = function () {
  expj.AJ0040010.AJ0040010button0.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010button0.executePScriptOnLoad = function () {
  console.log('execute AJ0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AJ0040010-AJ0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AJ0040010-AJ0040010button0-Close">
expj.AJ0040010.AJ0040010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AJ0040010.AJ0040010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AJ0040010');
};
expj.AJ0040010.AJ0040010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0040010.AJ0040010button0.Close['onClick' + i])) {
        expj.AJ0040010.AJ0040010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AJ0040010.AJ0040010button0.Close.executeAllOnDecision = function () {
};
expj.AJ0040010.AJ0040010button0.Close.executeOnLoad = function () {
  $('#expj-AJ0040010-AJ0040010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0040010', 'AJ0040010button0', 'Close', this, 'Button');
    }
  });
  expj.AJ0040010.AJ0040010button0.Close.executePScriptOnLoad();
};

expj.AJ0040010.AJ0040010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AJ0040010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AJ0040010-AJ0040010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0040010-AJ0040010button0-Close" name="Close" class="AJ0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AJ0040010 (END)-->
<%
MessageStruct msgStruct = aAJ0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AJ0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AJ0040010)) {
  expj.common.treeInstanceMap.AJ0040010 = {};
}
expj.common.treeInstanceMap.AJ0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AJ0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AJ0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AJ0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AJ0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AJ0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AJ0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AJ0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AJ0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AJ0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AJ0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0040010)) {
  expj.common.detailDialogMap.AJ0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AJ0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AJ0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AJ0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AJ0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AJ0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AJ0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AJ0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AJ0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AJ0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AJ0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AJ0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AJ0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AJ0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AJ0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AJ0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AJ0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AJ0040010)) {
  expj.common.viewInstanceMap.AJ0040010 = {};
}
expj.common.viewInstanceMap.AJ0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AJ0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AJ0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AJ0040010.<%=viewId %>.init = function () {
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
    expj.AJ0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AJ0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AJ0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AJ0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AJ0040010_init">
/**
 * AJ0040010用のロード完了時初期化関数
 */
expj.AJ0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AJ0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AJ0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AJ0040010');
  expj.common.calendarInstanceMap.AJ0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AJ0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AJ0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AJ0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AJ0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AJ0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AJ0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AJ0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AJ0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AJ0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AJ0040010.AJ0040010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form1.JOB_ODR_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form1.ALC_GRP_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form2.JOB_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form2.JOB_ODR_DLV_TIME.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form2.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form2.SPEC.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form1.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010view1.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010form2.executeOnLoad();}catch(e){};
  try{expj.AJ0040010.AJ0040010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AJ0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AJ0040010', 'AJ0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AJ0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AJ0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AJ0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AJ0040010', '<%=request.getContextPath() %>');
};

/**
 * AJ0040010の全体onDecision処理
 */
expj.AJ0040010.executeAllOnDecision = function () {
  expj.AJ0040010.AJ0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AJ0040010_console">
expj.AJ0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>