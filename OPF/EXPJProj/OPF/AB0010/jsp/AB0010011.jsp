<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:26:28 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AB0010\AB0010011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AB0010.*" %>
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
<jsp:useBean id="aAB0010010Control" class="com.nec.jp.orteus.metamorBase.AB0010.AB0010010Control" scope="request"/>
<jsp:useBean id="aAB0010010Struct" class="com.nec.jp.orteus.metamorBase.AB0010.AB0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

生産計画メンテナンス(MRP)サブ
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AB0010/jsp/AB0010011.jsp,v $
$Author: geng-jia $	
$Revision: 1.27 $　$Date: 2017/02/22 02:04:19 $
********************************************************* --%>
<html>
<head>
<title>生産計画メンテナンス(MRP)サブ</title>
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
<script class="expj-script-AB0010010_init">
  // AB0010010名前空間
  expj.AB0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AB0010010" data-screen="AB0010011" data-newdata="<%=aAB0010010Control.isNewData() %>">
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
              <script class="expj-script-AB0010010-AB0010011form1">
expj.AB0010010.AB0010011form1 = {};
expj.AB0010010.AB0010011form1.executeAllOnDecision = function () {
  console.log('execute AB0010011form1.onDecision');
};
expj.AB0010010.AB0010011form1.executeOnLoad = function () {
  expj.AB0010010.AB0010011form1.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form1.executePScriptOnLoad = function () {
  console.log('execute AB0010011form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AB0010010-AB0010011form1" action="AB0010010Servlet" name="AB0010011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010011form1-w_PLANT_CD">
expj.AB0010010.AB0010011form1.w_PLANT_CD = {};
expj.AB0010010.AB0010011form1.w_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AB0010011form1/w_PLANT_CD.onDecision');
  expj.AB0010010.AB0010011form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form1.w_PLANT_CD.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form1-w_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form1', 'w_PLANT_CD', this);
  });
  expj.AB0010010.AB0010011form1.w_PLANT_CD.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form1.w_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AB0010011form1/w_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form1-w_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010011form1-w_PLANT_CD" name="w_PLANT_CD" class="AB0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getw_PLANT_CD()) %>" maxlength="2" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AB0010010-AB0010011form1-PLANT_NAME">
expj.AB0010010.AB0010011form1.PLANT_NAME = {};
expj.AB0010010.AB0010011form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AB0010011form1/PLANT_NAME.onDecision');
  expj.AB0010010.AB0010011form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form1', 'PLANT_NAME', this);
  });
  expj.AB0010010.AB0010011form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0010011form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010011form1-PLANT_NAME" name="PLANT_NAME" class="AB0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010011form1-UNIT_QTY_TYP" name="UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getUNIT_QTY_TYP()) %>">
<script class="expj-script-AB0010010-AB0010011form1-UNIT_QTY_TYP">
expj.AB0010010.AB0010011form1.UNIT_QTY_TYP = {};
expj.AB0010010.AB0010011form1.UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AB0010011form1/UNIT_QTY_TYP.onDecision');
  expj.AB0010010.AB0010011form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form1.UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form1-UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form1', 'UNIT_QTY_TYP', this);
  });
  expj.AB0010010.AB0010011form1.UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form1.UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0010011form1/UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form1-UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AB0010010-AB0010011form1-h_saveNewPlanOrder" name="h_saveNewPlanOrder" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.geth_saveNewPlanOrder()) %>">
<script class="expj-script-AB0010010-AB0010011form1-h_saveNewPlanOrder">
expj.AB0010010.AB0010011form1.h_saveNewPlanOrder = {};
expj.AB0010010.AB0010011form1.h_saveNewPlanOrder.executeAllOnDecision = function () {
  console.log('execute AB0010011form1/h_saveNewPlanOrder.onDecision');
  expj.AB0010010.AB0010011form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form1.h_saveNewPlanOrder.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form1-h_saveNewPlanOrder').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form1', 'h_saveNewPlanOrder', this);
  });
  expj.AB0010010.AB0010011form1.h_saveNewPlanOrder.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form1.h_saveNewPlanOrder.executePScriptOnLoad = function () {
  console.log('execute AB0010011form1/h_saveNewPlanOrder.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form1-h_saveNewPlanOrder');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010011form1-h_saveMUL_ODR_QTY" name="h_saveMUL_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.geth_saveMUL_ODR_QTY()) %>">
<script class="expj-script-AB0010010-AB0010011form1-h_saveMUL_ODR_QTY">
expj.AB0010010.AB0010011form1.h_saveMUL_ODR_QTY = {};
expj.AB0010010.AB0010011form1.h_saveMUL_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AB0010011form1/h_saveMUL_ODR_QTY.onDecision');
  expj.AB0010010.AB0010011form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form1.h_saveMUL_ODR_QTY.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form1-h_saveMUL_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form1', 'h_saveMUL_ODR_QTY', this);
  });
  expj.AB0010010.AB0010011form1.h_saveMUL_ODR_QTY.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form1.h_saveMUL_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AB0010011form1/h_saveMUL_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form1-h_saveMUL_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010011form1-w_ITEM_CD">
expj.AB0010010.AB0010011form1.w_ITEM_CD = {};
expj.AB0010010.AB0010011form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AB0010011form1/w_ITEM_CD.onDecision');
  expj.AB0010010.AB0010011form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form1', 'w_ITEM_CD', this);
  });
  expj.AB0010010.AB0010011form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AB0010011form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010011form1-w_ITEM_CD" name="w_ITEM_CD" class="AB0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getw_ITEM_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AB0010010-AB0010011form1-ITEM_NAME">
expj.AB0010010.AB0010011form1.ITEM_NAME = {};
expj.AB0010010.AB0010011form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AB0010011form1/ITEM_NAME.onDecision');
  expj.AB0010010.AB0010011form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form1', 'ITEM_NAME', this);
  });
  expj.AB0010010.AB0010011form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0010011form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010011form1-ITEM_NAME" name="ITEM_NAME" class="AB0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010011form1-MUL_ODR_QTY" name="MUL_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getMUL_ODR_QTY()) %>">
<script class="expj-script-AB0010010-AB0010011form1-MUL_ODR_QTY">
expj.AB0010010.AB0010011form1.MUL_ODR_QTY = {};
expj.AB0010010.AB0010011form1.MUL_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AB0010011form1/MUL_ODR_QTY.onDecision');
  expj.AB0010010.AB0010011form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form1.MUL_ODR_QTY.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form1-MUL_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form1', 'MUL_ODR_QTY', this);
  });
  expj.AB0010010.AB0010011form1.MUL_ODR_QTY.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form1.MUL_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AB0010011form1/MUL_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form1-MUL_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010011form1-MRP_ODR_TYP" name="MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getMRP_ODR_TYP()) %>">
<script class="expj-script-AB0010010-AB0010011form1-MRP_ODR_TYP">
expj.AB0010010.AB0010011form1.MRP_ODR_TYP = {};
expj.AB0010010.AB0010011form1.MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AB0010011form1/MRP_ODR_TYP.onDecision');
  expj.AB0010010.AB0010011form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form1.MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form1-MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form1', 'MRP_ODR_TYP', this);
  });
  expj.AB0010010.AB0010011form1.MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form1.MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0010011form1/MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form1-MRP_ODR_TYP');
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
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AB0010010-AB0010011view1">
expj.AB0010010.AB0010011view1 = {};
// script1="onClick;0;SET;_AB0010011form2/sub_PlanDate_TIME=_AB0010011view1/PlanDate_nonCoron,_AB0010011form2/sub_PlanDate_TIME_h=_AB0010011view1/PlanDate_nonCoron, _AB0010011form2/sub_NEW_PLAN_ORDER=_AB0010011view1/NewPlanOrder"
expj.AB0010010.AB0010011view1.onClick0 = function () {
  console.log('AB0010011view1 script1');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010011view1', '_AB0010011form2/sub_PlanDate_TIME', expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011view1', '_AB0010011view1/PlanDate_nonCoron'));
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010011view1', '_AB0010011form2/sub_PlanDate_TIME_h', expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011view1', '_AB0010011view1/PlanDate_nonCoron'));
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010011view1', ' _AB0010011form2/sub_NEW_PLAN_ORDER', expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011view1', '_AB0010011view1/NewPlanOrder'));
};
expj.AB0010010.AB0010011view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010011view1['onClick' + i])) {
        expj.AB0010010.AB0010011view1['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010011view1.executeAllOnDecision = function () {
  console.log('execute AB0010011view1.onDecision');
};
expj.AB0010010.AB0010011view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AB0010011view1", "expj.AB0010010.AB0010011view1.executeAllOnClick");
%>
  expj.AB0010010.AB0010011view1.executePScriptOnLoad();
};

expj.AB0010010.AB0010011view1.executePScriptOnLoad = function () {
  console.log('execute AB0010011view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AB0010010-AB0010011view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AB0010011view1_Id = "AB0010011view1";
 String AB0010011view1_select = "single";
 String AB0010011view1_sortable = "true";
 String AB0010011view1_resize = "true";
 String AB0010011view1_scroll = "true";
 StringBuffer AB0010011view1_HB = new StringBuffer();
 StringBuffer AB0010011view1_DB = new StringBuffer();
%>
<%
 AB0010011view1_select = "single";
 AB0010011view1_sortable = "false";
 AB0010011view1_resize = "true";
 AB0010011view1_scroll = "true";
%>
<%
 AB0010011view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AB0010011view1_sortable).append("}").append(",");
%>
      
<%
AB0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TIME",rb))).append("', 'name':'PlanDate', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0010011view1_sortable).append("}").append(",");
AB0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'PlanDate_nonCoron', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AB0010011view1_sortable).append("}").append(",");
AB0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0405",rb))).append("', 'name':'FixDemand', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0010011view1_sortable).append("}").append(",");
AB0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0403",rb))).append("', 'name':'PlanDemand', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0010011view1_sortable).append("}").append(",");
AB0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0404",rb))).append("', 'name':'FixOrder', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0010011view1_sortable).append("}").append(",");
AB0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0401",rb))).append("', 'name':'OldPlanOrder', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0010011view1_sortable).append("}").append(",");
AB0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0402",rb))).append("', 'name':'NewPlanOrder', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0010011view1_sortable).append("}").append(",");
AB0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'Difference', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AB0010011view1_sortable).append("}").append(",");
AB0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0432",rb))).append("', 'name':'ValidStock', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AB0010011view1_sortable).append("}").append(",");
%>
<%
 int aAB0010010StructLength = aAB0010010Control.getListsize();
 final AB0010010Struct structBackup = aAB0010010Struct;
 aAB0010010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAB0010010StructLength; ++loopCount) {
  if((aAB0010010Struct = (AB0010010Struct) aAB0010010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAB0010010Struct", aAB0010010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AB0010011view1_DB.append("[");
 AB0010011view1_DB.append(loopCount);
%> <%
    String selColor = "000000";

    if(aAB0010010Struct.isHoliday()){
        selColor = "FF0033";
    }
    String canSelect = "true";
    if(loopCount == 0 || aAB0010010Struct.isHoliday()){
        canSelect = "false";
    }
    String numberColKind = "OBT_NUMBER;14.1;FLOOR;4";
    if(loopCount == 0){
        numberColKind = "";
    }
%> <%
 AB0010011view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010011view1-PlanDate-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010011view1-PlanDate\" data-name=\"PlanDate\" data-view=\"true\" data-rowselectable=\"").append( canSelect ).append("\" style=\"color:#").append(selColor).append(";\">").append(TypeConverter.sanitizer(aAB0010010Struct.getPlanDate())).append("</span>'");
 AB0010011view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010011view1-PlanDate_nonCoron-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010011view1-PlanDate_nonCoron\" data-name=\"PlanDate_nonCoron\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getPlanDate_nonCoron())).append("</span>'");
 AB0010011view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010011view1-FixDemand-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010011view1-FixDemand\" data-name=\"FixDemand\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getFixDemand())).append("</span>'");
 AB0010011view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010011view1-PlanDemand-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010011view1-PlanDemand\" data-name=\"PlanDemand\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getPlanDemand())).append("</span>'");
 AB0010011view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010011view1-FixOrder-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010011view1-FixOrder\" data-name=\"FixOrder\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getFixOrder())).append("</span>'");
 AB0010011view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010011view1-OldPlanOrder-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010011view1-OldPlanOrder\" data-name=\"OldPlanOrder\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getOldPlanOrder())).append("</span>'");
 AB0010011view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010011view1-NewPlanOrder-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010011view1-NewPlanOrder\" data-name=\"NewPlanOrder\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getNewPlanOrder())).append("</span>'");
 AB0010011view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010011view1-Difference-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010011view1-Difference\" data-name=\"Difference\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getDifference())).append("</span>'");
 AB0010011view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010011view1-ValidStock-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010011view1-ValidStock\" data-name=\"ValidStock\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAB0010010Struct.getValidStock())).append("</span>'");
 AB0010011view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAB0010010StructLength) {
   AB0010011view1_DB.append(",");
  }
 }
 aAB0010010Struct = structBackup;
 viewIdList.add(AB0010011view1_Id);
 viewSelectList.add(AB0010011view1_select);
 viewResizeList.add(AB0010011view1_resize);
 viewScrollList.add(AB0010011view1_scroll);
 viewHeaderDataList.add(AB0010011view1_HB);
 viewBodyDataList.add(AB0010011view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AB0010010-AB0010011form2">
expj.AB0010010.AB0010011form2 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AB0010010.AB0010011form2.onLoad0 = function () {
  console.log('AB0010011form2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHK;_AB0010011form2/sub_NEW_PLAN_ORDER[gt]0.0@*0,*1"
expj.AB0010010.AB0010011form2.onDecision0 = function () {
  console.log('AB0010011form2 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form2/sub_NEW_PLAN_ORDER')), '[gt]', expj.common.pscript.convertNumber('0.0'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AB0010011button1/subInsert"
expj.AB0010010.AB0010011form2.child0 = function () {
  console.log('AB0010011form2 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AB0010010', 'AB0010011form2', '_AB0010011button1/subInsert');
};
// script4="child;1;MASK;_AB0010011button1/subInsert"
expj.AB0010010.AB0010011form2.child1 = function () {
  console.log('AB0010011form2 script4');
expj.common.pscript.setMaskToReferenceComponent('AB0010010', 'AB0010011form2', '_AB0010011button1/subInsert');
};
// script5="onDecision;1;CHK;?AB0010011view1/?[eq]SINGLE[and]_AB0010011form2/sub_PlanDate_TIME[eq]_AB0010011form2/sub_PlanDate_TIME_h[and]_AB0010011form2/sub_NEW_PLAN_ORDER[gt]0.0@*2,*3"
expj.AB0010010.AB0010011form2.onDecision1 = function () {
  console.log('AB0010011form2 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '?AB0010011view1/?'), '[eq]', 'SINGLE') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form2/sub_PlanDate_TIME'), '[eq]', expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form2/sub_PlanDate_TIME_h')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form2/sub_NEW_PLAN_ORDER')), '[gt]', expj.common.pscript.convertNumber('0.0'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AB0010011button1/subUpdate,_AB0010011button1/subDelete"
expj.AB0010010.AB0010011form2.child2 = function () {
  console.log('AB0010011form2 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AB0010010', 'AB0010011form2', '_AB0010011button1/subUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('AB0010010', 'AB0010011form2', '_AB0010011button1/subDelete');
};
// script7="child;3;MASK;_AB0010011button1/subUpdate,_AB0010011button1/subDelete"
expj.AB0010010.AB0010011form2.child3 = function () {
  console.log('AB0010011form2 script7');
expj.common.pscript.setMaskToReferenceComponent('AB0010010', 'AB0010011form2', '_AB0010011button1/subUpdate');
expj.common.pscript.setMaskToReferenceComponent('AB0010010', 'AB0010011form2', '_AB0010011button1/subDelete');
};
expj.AB0010010.AB0010011form2.executeAllOnDecision = function () {
  console.log('execute AB0010011form2.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010011form2['onDecision' + i])) {
        expj.AB0010010.AB0010011form2['onDecision' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010011form2.executeOnLoad = function () {
  expj.AB0010010.AB0010011form2.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form2.executePScriptOnLoad = function () {
  console.log('execute AB0010011form2.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AB0010010.AB0010011form2['onLoad' + i])) {
      expj.AB0010010.AB0010011form2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AB0010010-AB0010011form2" action="AB0010010Servlet" name="AB0010011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0420",rb)%></span><!-- 生産計画期間 --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010011form2-sub_PlanDate">
expj.AB0010010.AB0010011form2.sub_PlanDate = {};
expj.AB0010010.AB0010011form2.sub_PlanDate.executeAllOnDecision = function () {
  console.log('execute AB0010011form2/sub_PlanDate.onDecision');
  expj.AB0010010.AB0010011form2.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form2.sub_PlanDate.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form2-sub_PlanDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form2', 'sub_PlanDate', this);
  });
  expj.AB0010010.AB0010011form2.sub_PlanDate.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form2.sub_PlanDate.executePScriptOnLoad = function () {
  console.log('execute AB0010011form2/sub_PlanDate.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form2-sub_PlanDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010011form2-sub_PlanDate" name="sub_PlanDate" class="AB0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getsub_PlanDate()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AB0010010-AB0010011form2-sub_PlanDate_TIME">
expj.AB0010010.AB0010011form2.sub_PlanDate_TIME = {};
expj.AB0010010.AB0010011form2.sub_PlanDate_TIME.executeAllOnDecision = function () {
  console.log('execute AB0010011form2/sub_PlanDate_TIME.onDecision');
  expj.AB0010010.AB0010011form2.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form2.sub_PlanDate_TIME.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form2-sub_PlanDate_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form2', 'sub_PlanDate_TIME', this);
  });
  expj.AB0010010.AB0010011form2.sub_PlanDate_TIME.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form2.sub_PlanDate_TIME.executePScriptOnLoad = function () {
  console.log('execute AB0010011form2/sub_PlanDate_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form2-sub_PlanDate_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010011form2-sub_PlanDate_TIME" name="sub_PlanDate_TIME" class="AB0010010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getsub_PlanDate_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010011form2-sub_PlanDate_TIME_h" name="sub_PlanDate_TIME_h" class="" data-kind="OBT_N;" maxlength="4" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getsub_PlanDate_TIME_h()) %>">
<script class="expj-script-AB0010010-AB0010011form2-sub_PlanDate_TIME_h">
expj.AB0010010.AB0010011form2.sub_PlanDate_TIME_h = {};
expj.AB0010010.AB0010011form2.sub_PlanDate_TIME_h.executeAllOnDecision = function () {
  console.log('execute AB0010011form2/sub_PlanDate_TIME_h.onDecision');
  expj.AB0010010.AB0010011form2.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form2.sub_PlanDate_TIME_h.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form2-sub_PlanDate_TIME_h').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form2', 'sub_PlanDate_TIME_h', this);
  });
  expj.AB0010010.AB0010011form2.sub_PlanDate_TIME_h.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form2.sub_PlanDate_TIME_h.executePScriptOnLoad = function () {
  console.log('execute AB0010011form2/sub_PlanDate_TIME_h.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form2-sub_PlanDate_TIME_h');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0402",rb)%></span><!-- 新計画オーダ --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010011form2-sub_NEW_PLAN_ORDER">
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER = {};
// script1="onDecision;0;CHK;_AB0010011form1/UNIT_QTY_TYP[eq]1@*0"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.onDecision0 = function () {
  console.log('sub_NEW_PLAN_ORDER script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form1/UNIT_QTY_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;[({_sub_NEW_PLAN_ORDER}*10000)%10000][gt]0@*1"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.child0 = function () {
  console.log('sub_NEW_PLAN_ORDER script2');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('(' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_sub_NEW_PLAN_ORDER') + '*10000)%10000'), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;CHK;_sub_NEW_PLAN_ORDER[neq]99999999999999.0@*2"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.child1 = function () {
  console.log('sub_NEW_PLAN_ORDER script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_sub_NEW_PLAN_ORDER'), '[neq]', '99999999999999.0')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;2;SET;_AB0010011form2/sub_NEW_PLAN_ORDER=[({_AB0010011form2/sub_NEW_PLAN_ORDER}-((({_AB0010011form2/sub_NEW_PLAN_ORDER}*10000)%10000)/10000))+1-1]@*3"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.child2 = function () {
  console.log('sub_NEW_PLAN_ORDER script4');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form2/sub_NEW_PLAN_ORDER', expj.common.pscript.eval('(' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form2/sub_NEW_PLAN_ORDER') + '-(((' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form2/sub_NEW_PLAN_ORDER') + '*10000)%10000)/10000))+1-1'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHK;1[eq]1@!AD00081"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.child3 = function () {
  console.log('sub_NEW_PLAN_ORDER script5');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AB0010010', 'AB0010011form2', 'AD00081');
}
};
// script6="onDecision;1;CHK;_AB0010011form1/MRP_ODR_TYP[eq]<%= AB0010Const.C_ODR_LOT %>@*4"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.onDecision1 = function () {
  console.log('sub_NEW_PLAN_ORDER script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form1/MRP_ODR_TYP'), '[eq]', '<%= AB0010Const.C_ODR_LOT %>')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;4;SET;_AB0010011form1/h_saveNewPlanOrder=[{_sub_NEW_PLAN_ORDER}*10000]@*5"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.child4 = function () {
  console.log('sub_NEW_PLAN_ORDER script7');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form1/h_saveNewPlanOrder', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_sub_NEW_PLAN_ORDER') + '*10000'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script8="child;5;SET;_AB0010011form1/h_saveMUL_ODR_QTY=[{_AB0010011form1/MUL_ODR_QTY}*10000]@*6"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.child5 = function () {
  console.log('sub_NEW_PLAN_ORDER script8');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form1/h_saveMUL_ODR_QTY', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form1/MUL_ODR_QTY') + '*10000'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script9="child;6;CHK;[{_AB0010011form1/h_saveNewPlanOrder}%{_AB0010011form1/h_saveMUL_ODR_QTY}][gt]0@*7"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.child6 = function () {
  console.log('sub_NEW_PLAN_ORDER script9');
if (expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form1/h_saveNewPlanOrder') + '%' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_AB0010011form1/h_saveMUL_ODR_QTY')), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;7;CHK;_sub_NEW_PLAN_ORDER[neq]99999999999999.0@*8"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.child7 = function () {
  console.log('sub_NEW_PLAN_ORDER script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011form2', '_sub_NEW_PLAN_ORDER'), '[neq]', '99999999999999.0')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;8;CFMPUT;_AB0010011form2/sub_NEW_PLAN_ORDER=NO@AB90002"
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.child8 = function () {
  console.log('sub_NEW_PLAN_ORDER script11');
var yesFunc = function () {
};
var noFunc = function () {
expj.common.pscript.backInputValue('AB0010010', 'AB0010011form2', '_AB0010011form2/sub_NEW_PLAN_ORDER');
};
expj.common.pscript.executeConfirmPut('AB0010010', 'AB0010011form2', '_AB0010011form2/sub_NEW_PLAN_ORDER', 'AB90002', yesFunc, noFunc);
};
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.executeAllOnDecision = function () {
  console.log('execute AB0010011form2/sub_NEW_PLAN_ORDER.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER['onDecision' + i])) {
        expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER['onDecision' + i]();
      }
    }
  }
  expj.AB0010010.AB0010011form2.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011form2-sub_NEW_PLAN_ORDER').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010011form2', 'sub_NEW_PLAN_ORDER', this);
  });
  expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.executePScriptOnLoad();
};

expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.executePScriptOnLoad = function () {
  console.log('execute AB0010011form2/sub_NEW_PLAN_ORDER.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011form2-sub_NEW_PLAN_ORDER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010011form2-sub_NEW_PLAN_ORDER" name="sub_NEW_PLAN_ORDER" class="AB0010010-focus-move  required-value expj-AB0010010-required-A" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getsub_NEW_PLAN_ORDER()) %>" maxlength="15" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AB0010010-AB0010011button1">
expj.AB0010010.AB0010011button1 = {};
expj.AB0010010.AB0010011button1.executeAllOnDecision = function () {
  console.log('execute AB0010011button1.onDecision');
};
expj.AB0010010.AB0010011button1.executeOnLoad = function () {
  expj.AB0010010.AB0010011button1.executePScriptOnLoad();
};

expj.AB0010010.AB0010011button1.executePScriptOnLoad = function () {
  console.log('execute AB0010011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AB0010010-AB0010011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AB0010010-AB0010011button1-subInsert">
expj.AB0010010.AB0010011button1.subInsert = {};
// script1="onClick;0;CHK;~LEN(_AB0010011form2/sub_PlanDate_TIME)[eq]1[or]~LEN(_AB0010011form2/sub_PlanDate_TIME)[eq]2@#AS00015"
expj.AB0010010.AB0010011button1.subInsert.onClick0 = function () {
  console.log('subInsert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AB0010010', 'AB0010011button1', 'AS00015');
}
};
// script2="onClick;1;CHK;~LEN(_AB0010011form2/sub_PlanDate_TIME)[eq]3@*0"
expj.AB0010010.AB0010011button1.subInsert.onClick1 = function () {
  console.log('subInsert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onClick;2;CHK;~LEN(_AB0010011form2/sub_PlanDate_TIME)[eq]4@*1"
expj.AB0010010.AB0010011button1.subInsert.onClick2 = function () {
  console.log('subInsert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="onClick;3;CHK;_AB0010011form2/sub_PlanDate_TIME[eq]@*2"
expj.AB0010010.AB0010011button1.subInsert.onClick3 = function () {
  console.log('subInsert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script5="onClick;4;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AB0010011form1/*,_AB0010011form2/*@AB0010010Servlet,,$ZZ07005"
expj.AB0010010.AB0010011button1.subInsert.onClick4 = function () {
  console.log('subInsert script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0010010', 'AB0010011button1', '_AB0010011form1/*,_AB0010011form2/*', 'AB0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0010010', response);
expj.common.changeBusinessScreenTab('AB0010010', contents);
};
expj.common.pscript.callConfirm('AB0010010', 'AB0010011button1', 'ZZ07005', okEvent);
};
// script6="child;0;CHK;[{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:1)}*10+{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:2)}][gte]60@#AS00016"
expj.AB0010010.AB0010011button1.subInsert.child0 = function () {
  console.log('subInsert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AB0010010', 'AB0010011button1', 'AS00016');
}
};
// script7="child;1;CHK;[{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:0)}*10+{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:1)}][gte]24[or][{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:2)}*10+{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:3)}][gte]60@#AS00016"
expj.AB0010010.AB0010011button1.subInsert.child1 = function () {
  console.log('subInsert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AB0010010', 'AB0010011button1', 'AS00016');
}
};
// script8="child;2;SET;_AB0010011form2/sub_PlanDate_TIME=2359"
expj.AB0010010.AB0010011button1.subInsert.child2 = function () {
  console.log('subInsert script8');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '2359');
};
expj.AB0010010.AB0010011button1.subInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010011button1.subInsert['onClick' + i])) {
        expj.AB0010010.AB0010011button1.subInsert['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010011button1.subInsert.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010011button1.subInsert.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011button1-subInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010011button1', 'subInsert', this, 'Button');
    }
  });
  expj.AB0010010.AB0010011button1.subInsert.executePScriptOnLoad();
};

expj.AB0010010.AB0010011button1.subInsert.executePScriptOnLoad = function () {
  console.log('execute AB0010011button1/subInsert.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011button1-subInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010011button1-subInsert" name="subInsert" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010011button1-subUpdate">
expj.AB0010010.AB0010011button1.subUpdate = {};
// script1="onClick;0;CHK;~LEN(_AB0010011form2/sub_PlanDate_TIME)[eq]1[or]~LEN(_AB0010011form2/sub_PlanDate_TIME)[eq]2@#AS00015"
expj.AB0010010.AB0010011button1.subUpdate.onClick0 = function () {
  console.log('subUpdate script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AB0010010', 'AB0010011button1', 'AS00015');
}
};
// script2="onClick;1;CHK;~LEN(_AB0010011form2/sub_PlanDate_TIME)[eq]3@*0"
expj.AB0010010.AB0010011button1.subUpdate.onClick1 = function () {
  console.log('subUpdate script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onClick;2;CHK;~LEN(_AB0010011form2/sub_PlanDate_TIME)[eq]4@*1"
expj.AB0010010.AB0010011button1.subUpdate.onClick2 = function () {
  console.log('subUpdate script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="onClick;3;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AB0010011form1/*,_AB0010011form2/*@AB0010010Servlet,,$ZZ07006"
expj.AB0010010.AB0010011button1.subUpdate.onClick3 = function () {
  console.log('subUpdate script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0010010', 'AB0010011button1', '_AB0010011form1/*,_AB0010011form2/*', 'AB0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0010010', response);
expj.common.changeBusinessScreenTab('AB0010010', contents);
};
expj.common.pscript.callConfirm('AB0010010', 'AB0010011button1', 'ZZ07006', okEvent);
};
// script5="child;0;CHK;[{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:1)}*10+{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:2)}][gte]60@#AS00016"
expj.AB0010010.AB0010011button1.subUpdate.child0 = function () {
  console.log('subUpdate script5');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AB0010010', 'AB0010011button1', 'AS00016');
}
};
// script6="child;1;CHK;[{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:0)}*10+{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:1)}][gte]24[or][{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:2)}*10+{~CHARAT(_AB0010011form2/sub_PlanDate_TIME:3)}][gte]60@#AS00016"
expj.AB0010010.AB0010011button1.subUpdate.child1 = function () {
  console.log('subUpdate script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0010010', 'AB0010011button1', '_AB0010011form2/sub_PlanDate_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AB0010010', 'AB0010011button1', 'AS00016');
}
};
expj.AB0010010.AB0010011button1.subUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010011button1.subUpdate['onClick' + i])) {
        expj.AB0010010.AB0010011button1.subUpdate['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010011button1.subUpdate.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010011button1.subUpdate.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011button1-subUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010011button1', 'subUpdate', this, 'Button');
    }
  });
  expj.AB0010010.AB0010011button1.subUpdate.executePScriptOnLoad();
};

expj.AB0010010.AB0010011button1.subUpdate.executePScriptOnLoad = function () {
  console.log('execute AB0010011button1/subUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011button1-subUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010011button1-subUpdate" name="subUpdate" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010011button1-subDelete">
expj.AB0010010.AB0010011button1.subDelete = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AB0010011form1/*,_AB0010011form2/*@AB0010010Servlet,,$ZZ07007"
expj.AB0010010.AB0010011button1.subDelete.onClick0 = function () {
  console.log('subDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0010010', 'AB0010011button1', '_AB0010011form1/*,_AB0010011form2/*', 'AB0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0010010', response);
expj.common.changeBusinessScreenTab('AB0010010', contents);
};
expj.common.pscript.callConfirm('AB0010010', 'AB0010011button1', 'ZZ07007', okEvent);
};
expj.AB0010010.AB0010011button1.subDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010011button1.subDelete['onClick' + i])) {
        expj.AB0010010.AB0010011button1.subDelete['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010011button1.subDelete.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010011button1.subDelete.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011button1-subDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010011button1', 'subDelete', this, 'Button');
    }
  });
  expj.AB0010010.AB0010011button1.subDelete.executePScriptOnLoad();
};

expj.AB0010010.AB0010011button1.subDelete.executePScriptOnLoad = function () {
  console.log('execute AB0010011button1/subDelete.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011button1-subDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010011button1-subDelete" name="subDelete" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:12px"><div class="expj-td" style="width:12px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"></div><!--/td-->
<div class="expj-td" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:42px"><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AB0010011 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AB0010010-AB0010011button0">
expj.AB0010010.AB0010011button0 = {};
expj.AB0010010.AB0010011button0.executeAllOnDecision = function () {
  console.log('execute AB0010011button0.onDecision');
};
expj.AB0010010.AB0010011button0.executeOnLoad = function () {
  expj.AB0010010.AB0010011button0.executePScriptOnLoad();
};

expj.AB0010010.AB0010011button0.executePScriptOnLoad = function () {
  console.log('execute AB0010011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AB0010010-AB0010011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AB0010010-AB0010011button0-cancelSub1">
expj.AB0010010.AB0010011button0.cancelSub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@AB0010010Servlet,,$ZZ07013"
expj.AB0010010.AB0010011button0.cancelSub1.onClick0 = function () {
  console.log('cancelSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0010010', 'AB0010011button0', '', 'AB0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0010010', response);
expj.common.changeBusinessScreenTab('AB0010010', contents);
};
expj.common.pscript.callConfirm('AB0010010', 'AB0010011button0', 'ZZ07013', okEvent);
};
expj.AB0010010.AB0010011button0.cancelSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010011button0.cancelSub1['onClick' + i])) {
        expj.AB0010010.AB0010011button0.cancelSub1['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010011button0.cancelSub1.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010011button0.cancelSub1.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010011button0-cancelSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010011button0', 'cancelSub1', this, 'Button');
    }
  });
  expj.AB0010010.AB0010011button0.cancelSub1.executePScriptOnLoad();
};

expj.AB0010010.AB0010011button0.cancelSub1.executePScriptOnLoad = function () {
  console.log('execute AB0010011button0/cancelSub1.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010011button0-cancelSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010011button0-cancelSub1" name="cancelSub1" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AB0010010 (END)-->
<%
MessageStruct msgStruct = aAB0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AB0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AB0010010)) {
  expj.common.treeInstanceMap.AB0010010 = {};
}
expj.common.treeInstanceMap.AB0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AB0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AB0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AB0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AB0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AB0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AB0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AB0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AB0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AB0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AB0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0010010)) {
  expj.common.detailDialogMap.AB0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AB0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AB0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AB0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AB0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AB0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AB0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AB0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AB0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AB0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AB0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AB0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AB0010010)) {
  expj.common.viewInstanceMap.AB0010010 = {};
}
expj.common.viewInstanceMap.AB0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AB0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AB0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AB0010010.<%=viewId %>.init = function () {
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
    expj.AB0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AB0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AB0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AB0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AB0010010_init">
/**
 * AB0010010用のロード完了時初期化関数
 */
expj.AB0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AB0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AB0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AB0010010');
  expj.common.calendarInstanceMap.AB0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AB0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AB0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AB0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AB0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AB0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AB0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AB0010010.AB0010011form1.w_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form1.UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form1.h_saveNewPlanOrder.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form1.h_saveMUL_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form1.MUL_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form1.MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form2.sub_PlanDate.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form2.sub_PlanDate_TIME.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form2.sub_PlanDate_TIME_h.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form2.sub_NEW_PLAN_ORDER.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011button1.subInsert.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011button1.subUpdate.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011button1.subDelete.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011button0.cancelSub1.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form1.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011view1.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011form2.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011button1.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AB0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AB0010010', 'AB0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AB0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AB0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.AB0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AB0010010', '<%=request.getContextPath() %>');
};

/**
 * AB0010010の全体onDecision処理
 */
expj.AB0010010.executeAllOnDecision = function () {
  expj.AB0010010.AB0010011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AB0010010_console">
expj.AB0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>