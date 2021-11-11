<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:39:14 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0060\AF0060011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0060.*" %>
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
<jsp:useBean id="aAF0060010Control" class="com.nec.jp.orteus.metamorBase.AF0060.AF0060010Control" scope="request"/>
<jsp:useBean id="aAF0060010Struct" class="com.nec.jp.orteus.metamorBase.AF0060.AF0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

保管区移動入庫実績入力サブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0060/jsp/AF0060011.jsp,v $
$Author: geng-jia $    
$Revision: 1.20 $ $Date: 2017/02/22 02:05:45 $
********************************************************* --%>
<html>
<head>
<title>保管区移動入庫実績入力サブ1</title>
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
<script class="expj-script-AF0060010_init">
  // AF0060010名前空間
  expj.AF0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AF0060010" data-screen="AF0060011" data-newdata="<%=aAF0060010Control.isNewData() %>">
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
              <script class="expj-script-AF0060010-AF0060011form1">
expj.AF0060010.AF0060011form1 = {};
expj.AF0060010.AF0060011form1.executeAllOnDecision = function () {
  console.log('execute AF0060011form1.onDecision');
};
expj.AF0060010.AF0060011form1.executeOnLoad = function () {
  expj.AF0060010.AF0060011form1.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0060010-AF0060011form1" action="AF0060010Servlet" name="AF0060011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form1-JOB_ODR_CD">
expj.AF0060010.AF0060011form1.JOB_ODR_CD = {};
expj.AF0060010.AF0060011form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/JOB_ODR_CD.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'JOB_ODR_CD', this);
  });
  expj.AF0060010.AF0060011form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getJOB_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AF0060010-AF0060011form1-TRANSPORT_CMPLT_TYP" name="TRANSPORT_CMPLT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getTRANSPORT_CMPLT_TYP()) %>">
<script class="expj-script-AF0060010-AF0060011form1-TRANSPORT_CMPLT_TYP">
expj.AF0060010.AF0060011form1.TRANSPORT_CMPLT_TYP = {};
expj.AF0060010.AF0060011form1.TRANSPORT_CMPLT_TYP.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/TRANSPORT_CMPLT_TYP.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.TRANSPORT_CMPLT_TYP.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-TRANSPORT_CMPLT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'TRANSPORT_CMPLT_TYP', this);
  });
  expj.AF0060010.AF0060011form1.TRANSPORT_CMPLT_TYP.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.TRANSPORT_CMPLT_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/TRANSPORT_CMPLT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-TRANSPORT_CMPLT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AF0060010-AF0060011form1-w_MODIFY_COUNT" name="w_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getw_MODIFY_COUNT()) %>">
<script class="expj-script-AF0060010-AF0060011form1-w_MODIFY_COUNT">
expj.AF0060010.AF0060011form1.w_MODIFY_COUNT = {};
expj.AF0060010.AF0060011form1.w_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/w_MODIFY_COUNT.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.w_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-w_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'w_MODIFY_COUNT', this);
  });
  expj.AF0060010.AF0060011form1.w_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.w_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/w_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-w_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AF0060010-AF0060011form1-w_UNIT_QTY_TYP" name="w_UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getw_UNIT_QTY_TYP()) %>">
<script class="expj-script-AF0060010-AF0060011form1-w_UNIT_QTY_TYP">
expj.AF0060010.AF0060011form1.w_UNIT_QTY_TYP = {};
expj.AF0060010.AF0060011form1.w_UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/w_UNIT_QTY_TYP.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.w_UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-w_UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'w_UNIT_QTY_TYP', this);
  });
  expj.AF0060010.AF0060011form1.w_UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.w_UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/w_UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-w_UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TRANSPORT_SLIP_CD",rb)%></span><!-- 積送伝票番号 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form1-TRANSPORT_SLIP_CD">
expj.AF0060010.AF0060011form1.TRANSPORT_SLIP_CD = {};
expj.AF0060010.AF0060011form1.TRANSPORT_SLIP_CD.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/TRANSPORT_SLIP_CD.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.TRANSPORT_SLIP_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-TRANSPORT_SLIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'TRANSPORT_SLIP_CD', this);
  });
  expj.AF0060010.AF0060011form1.TRANSPORT_SLIP_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.TRANSPORT_SLIP_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/TRANSPORT_SLIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-TRANSPORT_SLIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form1-TRANSPORT_SLIP_CD" name="TRANSPORT_SLIP_CD" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getTRANSPORT_SLIP_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AF0060010-AF0060011form1-w_BUSINESS_OPR_DATE" name="w_BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getw_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-AF0060010-AF0060011form1-w_BUSINESS_OPR_DATE">
expj.AF0060010.AF0060011form1.w_BUSINESS_OPR_DATE = {};
expj.AF0060010.AF0060011form1.w_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/w_BUSINESS_OPR_DATE.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.w_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-w_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'w_BUSINESS_OPR_DATE', this);
  });
  expj.AF0060010.AF0060011form1.w_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.w_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/w_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-w_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AF0060010-AF0060011form1-h_TRANSPORT_CMPLT_TYP" name="h_TRANSPORT_CMPLT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.geth_TRANSPORT_CMPLT_TYP()) %>">
<script class="expj-script-AF0060010-AF0060011form1-h_TRANSPORT_CMPLT_TYP">
expj.AF0060010.AF0060011form1.h_TRANSPORT_CMPLT_TYP = {};
expj.AF0060010.AF0060011form1.h_TRANSPORT_CMPLT_TYP.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/h_TRANSPORT_CMPLT_TYP.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.h_TRANSPORT_CMPLT_TYP.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-h_TRANSPORT_CMPLT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'h_TRANSPORT_CMPLT_TYP', this);
  });
  expj.AF0060010.AF0060011form1.h_TRANSPORT_CMPLT_TYP.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.h_TRANSPORT_CMPLT_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/h_TRANSPORT_CMPLT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-h_TRANSPORT_CMPLT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form1-ITEM_CD">
expj.AF0060010.AF0060011form1.ITEM_CD = {};
expj.AF0060010.AF0060011form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/ITEM_CD.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'ITEM_CD', this);
  });
  expj.AF0060010.AF0060011form1.ITEM_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form1-ITEM_CD" name="ITEM_CD" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form1-ITEM_NAME">
expj.AF0060010.AF0060011form1.ITEM_NAME = {};
expj.AF0060010.AF0060011form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/ITEM_NAME.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'ITEM_NAME', this);
  });
  expj.AF0060010.AF0060011form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form1-ITEM_NAME" name="ITEM_NAME" class="AF0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AF0060010-AF0060011form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AF0060010-AF0060011form1-h_lotCtrl">
expj.AF0060010.AF0060011form1.h_lotCtrl = {};
expj.AF0060010.AF0060011form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/h_lotCtrl.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'h_lotCtrl', this);
  });
  expj.AF0060010.AF0060011form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form1-LOT_NO">
expj.AF0060010.AF0060011form1.LOT_NO = {};
expj.AF0060010.AF0060011form1.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/LOT_NO.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.LOT_NO.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'LOT_NO', this);
  });
  expj.AF0060010.AF0060011form1.LOT_NO.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form1-LOT_NO" name="LOT_NO" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getLOT_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0060010-AF0060011form1-h_lotFlg" name="h_lotFlg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.geth_lotFlg()) %>">
<script class="expj-script-AF0060010-AF0060011form1-h_lotFlg">
expj.AF0060010.AF0060011form1.h_lotFlg = {};
expj.AF0060010.AF0060011form1.h_lotFlg.executeAllOnDecision = function () {
  console.log('execute AF0060011form1/h_lotFlg.onDecision');
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form1.h_lotFlg.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form1-h_lotFlg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form1', 'h_lotFlg', this);
  });
  expj.AF0060010.AF0060011form1.h_lotFlg.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form1.h_lotFlg.executePScriptOnLoad = function () {
  console.log('execute AF0060011form1/h_lotFlg.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form1-h_lotFlg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AF0060010-AF0060011form2">
expj.AF0060010.AF0060011form2 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0060010.AF0060011form2.onLoad0 = function () {
  console.log('AF0060011form2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_AF0060011form2/c_TRANSPORT_CMPLT_TYP=true@*1"
expj.AF0060010.AF0060011form2.child0 = function () {
  console.log('AF0060011form2 script2');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form2', '_AF0060011form2/c_TRANSPORT_CMPLT_TYP', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script3="child;1;SET;_AF0060011form1/h_TRANSPORT_CMPLT_TYP=1@*2"
expj.AF0060010.AF0060011form2.child1 = function () {
  console.log('AF0060011form2 script3');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form2', '_AF0060011form1/h_TRANSPORT_CMPLT_TYP', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;CHK;<%= TypeConverter.sanitizer(aAF0060010Struct.getTRANSPORT_CMPLT_TYP()) %>[eq]1@*3"
expj.AF0060010.AF0060011form2.child2 = function () {
  console.log('AF0060011form2 script4');
if (expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(aAF0060010Struct.getTRANSPORT_CMPLT_TYP()) %>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;3;MASK;_AF0060011button2/insertSub1,_AF0060011form2/RCV_ISSUE_QTY,_AF0060011form2/RCV_ISSUE_DATE,_AF0060011form2/VEND_LOT_NO,_AF0060011form2/c_TRANSPORT_CMPLT_TYP,_AF0060011form2/CalendarRcvIssueDate,_AF0060011form2/RCV_ISSUE_COMMENT,_AF0060011form2/PeekerRcvIssueCd"
expj.AF0060010.AF0060011form2.child3 = function () {
  console.log('AF0060011form2 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060011form2', '_AF0060011button2/insertSub1');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060011form2', '_AF0060011form2/RCV_ISSUE_QTY');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060011form2', '_AF0060011form2/RCV_ISSUE_DATE');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060011form2', '_AF0060011form2/VEND_LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060011form2', '_AF0060011form2/c_TRANSPORT_CMPLT_TYP');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060011form2', '_AF0060011form2/CalendarRcvIssueDate');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060011form2', '_AF0060011form2/RCV_ISSUE_COMMENT');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060011form2', '_AF0060011form2/PeekerRcvIssueCd');
};
// script6="onLoad;1;CALL;onDecision@0"
expj.AF0060010.AF0060011form2.onLoad1 = function () {
  console.log('AF0060011form2 script6');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script7="onDecision;0;CHK;<%= TypeConverter.sanitizer(aAF0060010Struct.getTRANSPORT_CMPLT_TYP()) %>[eq]0@*4"
expj.AF0060010.AF0060011form2.onDecision0 = function () {
  console.log('AF0060011form2 script7');
if (expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(aAF0060010Struct.getTRANSPORT_CMPLT_TYP()) %>', '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;4;CHKRQ;A@*5,*6"
expj.AF0060010.AF0060011form2.child4 = function () {
  console.log('AF0060011form2 script8');
if (expj.common.pscript.satisfiedRequiredComponent('AF0060010', 'A')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_AF0060011button2/insertSub1"
expj.AF0060010.AF0060011form2.child5 = function () {
  console.log('AF0060011form2 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AF0060010', 'AF0060011form2', '_AF0060011button2/insertSub1');
};
// script10="child;6;MASK;_AF0060011button2/insertSub1"
expj.AF0060010.AF0060011form2.child6 = function () {
  console.log('AF0060011form2 script10');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060011form2', '_AF0060011button2/insertSub1');
};
expj.AF0060010.AF0060011form2.executeAllOnDecision = function () {
  console.log('execute AF0060011form2.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form2['onDecision' + i])) {
        expj.AF0060010.AF0060011form2['onDecision' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060011form2.executeOnLoad = function () {
  expj.AF0060010.AF0060011form2.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form2.executePScriptOnLoad = function () {
  console.log('execute AF0060011form2.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form2['onLoad' + i])) {
      expj.AF0060010.AF0060011form2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0060010-AF0060011form2" action="AF0060010Servlet" name="AF0060011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:148px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.RCV_QTY",rb)%></span><!-- 入庫数 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form2-RCV_ISSUE_QTY">
expj.AF0060010.AF0060011form2.RCV_ISSUE_QTY = {};
expj.AF0060010.AF0060011form2.RCV_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0060011form2/RCV_ISSUE_QTY.onDecision');
  expj.AF0060010.AF0060011form2.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form2.RCV_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form2-RCV_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form2', 'RCV_ISSUE_QTY', this);
  });
  expj.AF0060010.AF0060011form2.RCV_ISSUE_QTY.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form2.RCV_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0060011form2/RCV_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form2-RCV_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form2-RCV_ISSUE_QTY" name="RCV_ISSUE_QTY" class="AF0060010-focus-move expj-align-right required-value expj-AF0060010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_ISSUE_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form2-STOCK_UNIT">
expj.AF0060010.AF0060011form2.STOCK_UNIT = {};
expj.AF0060010.AF0060011form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AF0060011form2/STOCK_UNIT.onDecision');
  expj.AF0060010.AF0060011form2.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form2', 'STOCK_UNIT', this);
  });
  expj.AF0060010.AF0060011form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AF0060011form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form2-STOCK_UNIT" name="STOCK_UNIT" class="AF0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form2-c_TRANSPORT_CMPLT_TYP">
expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP = {};
// script1="onClick;0;CHK;_THIS[eq]true@*0,*1"
expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP.onClick0 = function () {
  console.log('c_TRANSPORT_CMPLT_TYP script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011form2', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SET;_AF0060011form1/h_TRANSPORT_CMPLT_TYP=1"
expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP.child0 = function () {
  console.log('c_TRANSPORT_CMPLT_TYP script2');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form2', '_AF0060011form1/h_TRANSPORT_CMPLT_TYP', '1');
};
// script3="child;1;SET;_AF0060011form1/h_TRANSPORT_CMPLT_TYP=0"
expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP.child1 = function () {
  console.log('c_TRANSPORT_CMPLT_TYP script3');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form2', '_AF0060011form1/h_TRANSPORT_CMPLT_TYP', '0');
};
expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP['onClick' + i])) {
        expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP.executeAllOnDecision = function () {
  console.log('execute AF0060011form2/c_TRANSPORT_CMPLT_TYP.onDecision');
  expj.AF0060010.AF0060011form2.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form2-c_TRANSPORT_CMPLT_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060011form2', 'c_TRANSPORT_CMPLT_TYP', this, 'CheckBox');
    }
  });
  expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0060011form2/c_TRANSPORT_CMPLT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form2-c_TRANSPORT_CMPLT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:148px;text-align:left;"><input type="checkbox" name="c_TRANSPORT_CMPLT_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAF0060010Struct.getc_TRANSPORT_CMPLT_TYP())) || "1".equals(TypeConverter.convert(aAF0060010Struct.getc_TRANSPORT_CMPLT_TYP())))?"checked=\"checked\"":"" %>  class="AF0060010-focus-move" id="expj-AF0060010-AF0060011form2-c_TRANSPORT_CMPLT_TYP"><label for="expj-AF0060010-AF0060011form2-c_TRANSPORT_CMPLT_TYP"><%=CoreTools.getRBString("Expj.Cmt0425",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.RCV_DATE",rb)%></span><!-- 入庫日 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form2-RCV_ISSUE_DATE">
expj.AF0060010.AF0060011form2.RCV_ISSUE_DATE = {};
expj.AF0060010.AF0060011form2.RCV_ISSUE_DATE.executeAllOnDecision = function () {
  console.log('execute AF0060011form2/RCV_ISSUE_DATE.onDecision');
  expj.AF0060010.AF0060011form2.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form2.RCV_ISSUE_DATE.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form2-RCV_ISSUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form2', 'RCV_ISSUE_DATE', this);
  });
  expj.AF0060010.AF0060011form2.RCV_ISSUE_DATE.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form2.RCV_ISSUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0060011form2/RCV_ISSUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form2-RCV_ISSUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form2-RCV_ISSUE_DATE" name="RCV_ISSUE_DATE" class="AF0060010-focus-move  required-value expj-AF0060010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_ISSUE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form2-CalendarRcvIssueDate">
expj.AF0060010.AF0060011form2.CalendarRcvIssueDate = {};
// script1="onClick;0;CALENDAR;_AF0060011form2/RCV_ISSUE_DATE"
expj.AF0060010.AF0060011form2.CalendarRcvIssueDate.onClick0 = function () {
  console.log('CalendarRcvIssueDate script1');
expj.common.pscript.executeCalendar('AF0060010','AF0060011form2','_AF0060011form2/RCV_ISSUE_DATE');
};
expj.AF0060010.AF0060011form2.CalendarRcvIssueDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form2.CalendarRcvIssueDate['onClick' + i])) {
        expj.AF0060010.AF0060011form2.CalendarRcvIssueDate['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060011form2.CalendarRcvIssueDate.executeAllOnDecision = function () {
};
expj.AF0060010.AF0060011form2.CalendarRcvIssueDate.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form2-CalendarRcvIssueDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060011form2', 'CalendarRcvIssueDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AF0060010','AF0060011form2','_AF0060011form2/RCV_ISSUE_DATE');
  expj.AF0060010.AF0060011form2.CalendarRcvIssueDate.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form2.CalendarRcvIssueDate.executePScriptOnLoad = function () {
  console.log('execute AF0060011form2/CalendarRcvIssueDate.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form2-CalendarRcvIssueDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0060010-AF0060011form2-CalendarRcvIssueDate" class="AF0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:148px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt6855",rb)%></span><!-- 出庫理由 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form2-ISSUE_COMMENT">
expj.AF0060010.AF0060011form2.ISSUE_COMMENT = {};
expj.AF0060010.AF0060011form2.ISSUE_COMMENT.executeAllOnDecision = function () {
  console.log('execute AF0060011form2/ISSUE_COMMENT.onDecision');
  expj.AF0060010.AF0060011form2.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form2.ISSUE_COMMENT.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form2-ISSUE_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form2', 'ISSUE_COMMENT', this);
  });
  expj.AF0060010.AF0060011form2.ISSUE_COMMENT.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form2.ISSUE_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AF0060011form2/ISSUE_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form2-ISSUE_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form2-ISSUE_COMMENT" name="ISSUE_COMMENT" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getISSUE_COMMENT()) %>" maxlength="80" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_LOT_NO",rb)%></span><!-- メーカロット番号 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form2-VEND_LOT_NO">
expj.AF0060010.AF0060011form2.VEND_LOT_NO = {};
expj.AF0060010.AF0060011form2.VEND_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AF0060011form2/VEND_LOT_NO.onDecision');
  expj.AF0060010.AF0060011form2.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form2.VEND_LOT_NO.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form2-VEND_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form2', 'VEND_LOT_NO', this);
  });
  expj.AF0060010.AF0060011form2.VEND_LOT_NO.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form2.VEND_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AF0060011form2/VEND_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form2-VEND_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form2-VEND_LOT_NO" name="VEND_LOT_NO" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getVEND_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:148px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt6854",rb)%></span><!-- 保管区移動理由 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form2-RCV_ISSUE_COMMENT">
expj.AF0060010.AF0060011form2.RCV_ISSUE_COMMENT = {};
expj.AF0060010.AF0060011form2.RCV_ISSUE_COMMENT.executeAllOnDecision = function () {
  console.log('execute AF0060011form2/RCV_ISSUE_COMMENT.onDecision');
  expj.AF0060010.AF0060011form2.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form2.RCV_ISSUE_COMMENT.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form2-RCV_ISSUE_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form2', 'RCV_ISSUE_COMMENT', this);
  });
  expj.AF0060010.AF0060011form2.RCV_ISSUE_COMMENT.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form2.RCV_ISSUE_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AF0060011form2/RCV_ISSUE_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form2-RCV_ISSUE_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form2-RCV_ISSUE_COMMENT" name="RCV_ISSUE_COMMENT" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_ISSUE_COMMENT()) %>" maxlength="80" ></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form2-PeekerRcvIssueCd">
expj.AF0060010.AF0060011form2.PeekerRcvIssueCd = {};
// script1="onClick;0;PEEKER;_AF0060011form2/RCV_ISSUE_COMMENT@<%=contextNo%>"
expj.AF0060010.AF0060011form2.PeekerRcvIssueCd.onClick0 = function () {
  console.log('PeekerRcvIssueCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0060010';
var parameterValues = 'PeekerRcvIssueCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011form2', '_AF0060011form2/RCV_ISSUE_COMMENT') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%RCV_ISSUE_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0060011form2/RCV_ISSUE_COMMENT%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0060010.AF0060011form2.PeekerRcvIssueCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form2.PeekerRcvIssueCd['onClick' + i])) {
        expj.AF0060010.AF0060011form2.PeekerRcvIssueCd['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060011form2.PeekerRcvIssueCd.executeAllOnDecision = function () {
};
expj.AF0060010.AF0060011form2.PeekerRcvIssueCd.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form2-PeekerRcvIssueCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060011form2', 'PeekerRcvIssueCd', this, 'Button');
    }
  });
  expj.AF0060010.AF0060011form2.PeekerRcvIssueCd.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form2.PeekerRcvIssueCd.executePScriptOnLoad = function () {
  console.log('execute AF0060011form2/PeekerRcvIssueCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form2-PeekerRcvIssueCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0060010-AF0060011form2-PeekerRcvIssueCd" class="AF0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0060010-AF0060011button2">
expj.AF0060010.AF0060011button2 = {};
expj.AF0060010.AF0060011button2.executeAllOnDecision = function () {
  console.log('execute AF0060011button2.onDecision');
};
expj.AF0060010.AF0060011button2.executeOnLoad = function () {
  expj.AF0060010.AF0060011button2.executePScriptOnLoad();
};

expj.AF0060010.AF0060011button2.executePScriptOnLoad = function () {
  console.log('execute AF0060011button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0060010-AF0060011button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0060010-AF0060011button2-insertSub1">
expj.AF0060010.AF0060011button2.insertSub1 = {};
// script1="onClick;0;CHK;_AF0060011form2/RCV_ISSUE_QTY[gte]_AF0060011form3/w_LEAVE_RCV_QTY@*0,*3"
expj.AF0060010.AF0060011button2.insertSub1.onClick0 = function () {
  console.log('insertSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form2/RCV_ISSUE_QTY')), '[gte]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form3/w_LEAVE_RCV_QTY')))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script2="child;0;CHK;_AF0060011form2/c_TRANSPORT_CMPLT_TYP[neq]true@*1"
expj.AF0060010.AF0060011button2.insertSub1.child0 = function () {
  console.log('insertSub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form2/c_TRANSPORT_CMPLT_TYP'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;SET;_AF0060011form2/c_TRANSPORT_CMPLT_TYP=1@$AF90005"
expj.AF0060010.AF0060011button2.insertSub1.child1 = function () {
  console.log('insertSub1 script3');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form2/c_TRANSPORT_CMPLT_TYP', '1');
if (!expj.common.pscript.alertMessageFlag){expj.common.pscript.addWarningMessage('AF0060010', 'AF0060011button2', 'AF90005');}
};
// script4="child;2;SET;_AF0060011form2/c_TRANSPORT_CMPLT_TYP=true"
expj.AF0060010.AF0060011button2.insertSub1.child2 = function () {
  console.log('insertSub1 script4');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form2/c_TRANSPORT_CMPLT_TYP', 'true');
};
// script5="child;3;CHK;_AF0060011form2/c_TRANSPORT_CMPLT_TYP[eq]true@$AF90006"
expj.AF0060010.AF0060011button2.insertSub1.child3 = function () {
  console.log('insertSub1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form2/c_TRANSPORT_CMPLT_TYP'), '[eq]', 'true')) {
expj.common.pscript.addWarningMessage('AF0060010', 'AF0060011button2', 'AF90006');
}
};
// script6="onClick;1;CHK;_AF0060011form2/RCV_ISSUE_QTY[lt]0@#AF00062"
expj.AF0060010.AF0060011button2.insertSub1.onClick1 = function () {
  console.log('insertSub1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form2/RCV_ISSUE_QTY')), '[lt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AF0060010', 'AF0060011button2', 'AF00062');
}
};
// script7="onClick;2;CHK;_AF0060011form2/RCV_ISSUE_QTY[gt]_AF0060011form3/w_LEAVE_RCV_QTY@#AF00052"
expj.AF0060010.AF0060011button2.insertSub1.onClick2 = function () {
  console.log('insertSub1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form2/RCV_ISSUE_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form3/w_LEAVE_RCV_QTY')))) {
expj.common.pscript.addErrorMessage('AF0060010', 'AF0060011button2', 'AF00052');
}
};
// script8="onClick;3;CHK;_AF0060011form2/RCV_ISSUE_DATE[gt]_AF0060011form1/w_BUSINESS_OPR_DATE@#ZZ05103"
expj.AF0060010.AF0060011button2.insertSub1.onClick3 = function () {
  console.log('insertSub1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form2/RCV_ISSUE_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form1/w_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('AF0060010', 'AF0060011button2', 'ZZ05103');
}
};
// script9="onClick;4;CHK;_AF0060011form2/c_TRANSPORT_CMPLT_TYP[eq]true@*4,*5"
expj.AF0060010.AF0060011button2.insertSub1.onClick4 = function () {
  console.log('insertSub1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form2/c_TRANSPORT_CMPLT_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="child;4;SET;_AF0060011form1/h_TRANSPORT_CMPLT_TYP=1"
expj.AF0060010.AF0060011button2.insertSub1.child4 = function () {
  console.log('insertSub1 script10');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form1/h_TRANSPORT_CMPLT_TYP', '1');
};
// script11="child;5;SET;_AF0060011form1/h_TRANSPORT_CMPLT_TYP=0"
expj.AF0060010.AF0060011button2.insertSub1.child5 = function () {
  console.log('insertSub1 script11');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011button2', '_AF0060011form1/h_TRANSPORT_CMPLT_TYP', '0');
};
// script12="onClick;5;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AF0060011form1/*,_AF0060011form2/*,_AF0060011form3/*@AF0060010Servlet,,$ZZ07003"
expj.AF0060010.AF0060011button2.insertSub1.onClick5 = function () {
  console.log('insertSub1 script12');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0060010', 'AF0060011button2', '_AF0060011form1/*,_AF0060011form2/*,_AF0060011form3/*', 'AF0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0060010', response);
expj.common.changeBusinessScreenTab('AF0060010', contents);
};
expj.common.pscript.callConfirm('AF0060010', 'AF0060011button2', 'ZZ07003', okEvent);
};
expj.AF0060010.AF0060011button2.insertSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060011button2.insertSub1['onClick' + i])) {
        expj.AF0060010.AF0060011button2.insertSub1['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060011button2.insertSub1.executeAllOnDecision = function () {
};
expj.AF0060010.AF0060011button2.insertSub1.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011button2-insertSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060011button2', 'insertSub1', this, 'Button');
    }
  });
  expj.AF0060010.AF0060011button2.insertSub1.executePScriptOnLoad();
};

expj.AF0060010.AF0060011button2.insertSub1.executePScriptOnLoad = function () {
  console.log('execute AF0060011button2/insertSub1.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011button2-insertSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0060010-AF0060011button2-insertSub1" name="insertSub1" class="AF0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<%
	String ColKind1 = "OBT_NUMBER;14.1;FLOOR;4";
    String ColKind2 = "OBT_NUMBER;14.1;FLOOR;4";
    String ColKind3 = "OBT_NUMBER;14.1;FLOOR;4";


	if(aAF0060010Struct.getSTOCK_ON_HAND_QTY() == null){
        ColKind1 ="";
    }
	
	if(aAF0060010Struct.getDEFECT_QTY() == null){
	    ColKind2 ="";
    }

	if(aAF0060010Struct.getALLOCABLE_QTY() == null){
        ColKind3 ="";
    }
%><div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AF0060010-AF0060011form3">
expj.AF0060010.AF0060011form3 = {};
expj.AF0060010.AF0060011form3.executeAllOnDecision = function () {
  console.log('execute AF0060011form3.onDecision');
};
expj.AF0060010.AF0060011form3.executeOnLoad = function () {
  expj.AF0060010.AF0060011form3.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0060010-AF0060011form3" action="AF0060010Servlet" name="AF0060011form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-DRAW_CD">
expj.AF0060010.AF0060011form3.DRAW_CD = {};
expj.AF0060010.AF0060011form3.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/DRAW_CD.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.DRAW_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'DRAW_CD', this);
  });
  expj.AF0060010.AF0060011form3.DRAW_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-DRAW_CD" name="DRAW_CD" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-SPEC">
expj.AF0060010.AF0060011form3.SPEC = {};
expj.AF0060010.AF0060011form3.SPEC.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/SPEC.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.SPEC.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'SPEC', this);
  });
  expj.AF0060010.AF0060011form3.SPEC.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.SPEC.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-SPEC" name="SPEC" class="AF0060010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD_1",rb)%></span><!-- 出庫工場コード --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-ISSUE_PLANT_CD">
expj.AF0060010.AF0060011form3.ISSUE_PLANT_CD = {};
expj.AF0060010.AF0060011form3.ISSUE_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/ISSUE_PLANT_CD.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.ISSUE_PLANT_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-ISSUE_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'ISSUE_PLANT_CD', this);
  });
  expj.AF0060010.AF0060011form3.ISSUE_PLANT_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.ISSUE_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/ISSUE_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-ISSUE_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-ISSUE_PLANT_CD" name="ISSUE_PLANT_CD" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getISSUE_PLANT_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-ISSUE_PLANT_NAME">
expj.AF0060010.AF0060011form3.ISSUE_PLANT_NAME = {};
expj.AF0060010.AF0060011form3.ISSUE_PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/ISSUE_PLANT_NAME.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.ISSUE_PLANT_NAME.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-ISSUE_PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'ISSUE_PLANT_NAME', this);
  });
  expj.AF0060010.AF0060011form3.ISSUE_PLANT_NAME.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.ISSUE_PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/ISSUE_PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-ISSUE_PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-ISSUE_PLANT_NAME" name="ISSUE_PLANT_NAME" class="AF0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getISSUE_PLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_WH_CD",rb)%></span><!-- 出庫保管区コード --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-ISSUE_WH_CD">
expj.AF0060010.AF0060011form3.ISSUE_WH_CD = {};
expj.AF0060010.AF0060011form3.ISSUE_WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/ISSUE_WH_CD.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.ISSUE_WH_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-ISSUE_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'ISSUE_WH_CD', this);
  });
  expj.AF0060010.AF0060011form3.ISSUE_WH_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.ISSUE_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/ISSUE_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-ISSUE_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-ISSUE_WH_CD" name="ISSUE_WH_CD" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getISSUE_WH_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-ISSUE_WH_NAME">
expj.AF0060010.AF0060011form3.ISSUE_WH_NAME = {};
expj.AF0060010.AF0060011form3.ISSUE_WH_NAME.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/ISSUE_WH_NAME.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.ISSUE_WH_NAME.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-ISSUE_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'ISSUE_WH_NAME', this);
  });
  expj.AF0060010.AF0060011form3.ISSUE_WH_NAME.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.ISSUE_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/ISSUE_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-ISSUE_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-ISSUE_WH_NAME" name="ISSUE_WH_NAME" class="AF0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getISSUE_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.RCV_ISSUE_QTY_6",rb)%></span><!-- 出庫数 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-ISSUE_QTY">
expj.AF0060010.AF0060011form3.ISSUE_QTY = {};
expj.AF0060010.AF0060011form3.ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/ISSUE_QTY.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'ISSUE_QTY', this);
  });
  expj.AF0060010.AF0060011form3.ISSUE_QTY.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-ISSUE_QTY" name="ISSUE_QTY" class="AF0060010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getISSUE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-STOCK_UNIT_1">
expj.AF0060010.AF0060011form3.STOCK_UNIT_1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0060010.AF0060011form3.STOCK_UNIT_1.onLoad0 = function () {
  console.log('STOCK_UNIT_1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0060011form2/STOCK_UNIT"
expj.AF0060010.AF0060011form3.STOCK_UNIT_1.child0 = function () {
  console.log('STOCK_UNIT_1 script2');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011form3', '_AF0060011form2/STOCK_UNIT'));
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_1.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_1.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_1.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-STOCK_UNIT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'STOCK_UNIT_1', this);
  });
  expj.AF0060010.AF0060011form3.STOCK_UNIT_1.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.STOCK_UNIT_1.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_1.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-STOCK_UNIT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form3.STOCK_UNIT_1['onLoad' + i])) {
      expj.AF0060010.AF0060011form3.STOCK_UNIT_1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-STOCK_UNIT_1" name="STOCK_UNIT_1" class="AF0060010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_DATE",rb)%></span><!-- 出庫日 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-ISSUE_DATE">
expj.AF0060010.AF0060011form3.ISSUE_DATE = {};
expj.AF0060010.AF0060011form3.ISSUE_DATE.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/ISSUE_DATE.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.ISSUE_DATE.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-ISSUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'ISSUE_DATE', this);
  });
  expj.AF0060010.AF0060011form3.ISSUE_DATE.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.ISSUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/ISSUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-ISSUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-ISSUE_DATE" name="ISSUE_DATE" class="AF0060010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getISSUE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.RCV_PLANT_CD",rb)%></span><!-- 入庫工場コード --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-RCV_PLANT_CD">
expj.AF0060010.AF0060011form3.RCV_PLANT_CD = {};
expj.AF0060010.AF0060011form3.RCV_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/RCV_PLANT_CD.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.RCV_PLANT_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-RCV_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'RCV_PLANT_CD', this);
  });
  expj.AF0060010.AF0060011form3.RCV_PLANT_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.RCV_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/RCV_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-RCV_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-RCV_PLANT_CD" name="RCV_PLANT_CD" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_PLANT_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-RCV_PLANT_NAME">
expj.AF0060010.AF0060011form3.RCV_PLANT_NAME = {};
expj.AF0060010.AF0060011form3.RCV_PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/RCV_PLANT_NAME.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.RCV_PLANT_NAME.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-RCV_PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'RCV_PLANT_NAME', this);
  });
  expj.AF0060010.AF0060011form3.RCV_PLANT_NAME.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.RCV_PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/RCV_PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-RCV_PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-RCV_PLANT_NAME" name="RCV_PLANT_NAME" class="AF0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_PLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.RCV_WH_CD",rb)%></span><!-- 入庫保管区コード --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-RCV_WH_CD">
expj.AF0060010.AF0060011form3.RCV_WH_CD = {};
expj.AF0060010.AF0060011form3.RCV_WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/RCV_WH_CD.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.RCV_WH_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-RCV_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'RCV_WH_CD', this);
  });
  expj.AF0060010.AF0060011form3.RCV_WH_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.RCV_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/RCV_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-RCV_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-RCV_WH_CD" name="RCV_WH_CD" class="AF0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_WH_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-RCV_WH_NAME">
expj.AF0060010.AF0060011form3.RCV_WH_NAME = {};
expj.AF0060010.AF0060011form3.RCV_WH_NAME.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/RCV_WH_NAME.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.RCV_WH_NAME.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-RCV_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'RCV_WH_NAME', this);
  });
  expj.AF0060010.AF0060011form3.RCV_WH_NAME.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.RCV_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/RCV_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-RCV_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-RCV_WH_NAME" name="RCV_WH_NAME" class="AF0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TOTAL_RCV_QTY",rb)%></span><!-- 入庫累計数 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-RCV_QTY">
expj.AF0060010.AF0060011form3.RCV_QTY = {};
expj.AF0060010.AF0060011form3.RCV_QTY.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/RCV_QTY.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.RCV_QTY.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-RCV_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'RCV_QTY', this);
  });
  expj.AF0060010.AF0060011form3.RCV_QTY.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.RCV_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/RCV_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-RCV_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-RCV_QTY" name="RCV_QTY" class="AF0060010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-STOCK_UNIT_2">
expj.AF0060010.AF0060011form3.STOCK_UNIT_2 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0060010.AF0060011form3.STOCK_UNIT_2.onLoad0 = function () {
  console.log('STOCK_UNIT_2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0060011form2/STOCK_UNIT"
expj.AF0060010.AF0060011form3.STOCK_UNIT_2.child0 = function () {
  console.log('STOCK_UNIT_2 script2');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011form3', '_AF0060011form2/STOCK_UNIT'));
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_2.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_2.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_2.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-STOCK_UNIT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'STOCK_UNIT_2', this);
  });
  expj.AF0060010.AF0060011form3.STOCK_UNIT_2.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.STOCK_UNIT_2.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_2.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-STOCK_UNIT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form3.STOCK_UNIT_2['onLoad' + i])) {
      expj.AF0060010.AF0060011form3.STOCK_UNIT_2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-STOCK_UNIT_2" name="STOCK_UNIT_2" class="AF0060010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0426",rb)%></span><!-- 入庫残数 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-w_LEAVE_RCV_QTY">
expj.AF0060010.AF0060011form3.w_LEAVE_RCV_QTY = {};
expj.AF0060010.AF0060011form3.w_LEAVE_RCV_QTY.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/w_LEAVE_RCV_QTY.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.w_LEAVE_RCV_QTY.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-w_LEAVE_RCV_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'w_LEAVE_RCV_QTY', this);
  });
  expj.AF0060010.AF0060011form3.w_LEAVE_RCV_QTY.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.w_LEAVE_RCV_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/w_LEAVE_RCV_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-w_LEAVE_RCV_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-w_LEAVE_RCV_QTY" name="w_LEAVE_RCV_QTY" class="AF0060010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getw_LEAVE_RCV_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-STOCK_UNIT_3">
expj.AF0060010.AF0060011form3.STOCK_UNIT_3 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0060010.AF0060011form3.STOCK_UNIT_3.onLoad0 = function () {
  console.log('STOCK_UNIT_3 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0060011form2/STOCK_UNIT"
expj.AF0060010.AF0060011form3.STOCK_UNIT_3.child0 = function () {
  console.log('STOCK_UNIT_3 script2');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011form3', '_AF0060011form2/STOCK_UNIT'));
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_3.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_3.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_3.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-STOCK_UNIT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'STOCK_UNIT_3', this);
  });
  expj.AF0060010.AF0060011form3.STOCK_UNIT_3.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.STOCK_UNIT_3.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_3.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-STOCK_UNIT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form3.STOCK_UNIT_3['onLoad' + i])) {
      expj.AF0060010.AF0060011form3.STOCK_UNIT_3['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-STOCK_UNIT_3" name="STOCK_UNIT_3" class="AF0060010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_5",rb)%></span><!-- ロット別手持在庫数 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-STOCK_ON_HAND_QTY">
expj.AF0060010.AF0060011form3.STOCK_ON_HAND_QTY = {};
expj.AF0060010.AF0060011form3.STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/STOCK_ON_HAND_QTY.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'STOCK_ON_HAND_QTY', this);
  });
  expj.AF0060010.AF0060011form3.STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-STOCK_ON_HAND_QTY" name="STOCK_ON_HAND_QTY" class="AF0060010-focus-move  " style="width:150px;" data-kind="<%= ColKind1 %>" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getSTOCK_ON_HAND_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-STOCK_UNIT_6">
expj.AF0060010.AF0060011form3.STOCK_UNIT_6 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0060010.AF0060011form3.STOCK_UNIT_6.onLoad0 = function () {
  console.log('STOCK_UNIT_6 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0060011form2/STOCK_UNIT"
expj.AF0060010.AF0060011form3.STOCK_UNIT_6.child0 = function () {
  console.log('STOCK_UNIT_6 script2');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011form3', '_AF0060011form2/STOCK_UNIT'));
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_6.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_6.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_6.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-STOCK_UNIT_6').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'STOCK_UNIT_6', this);
  });
  expj.AF0060010.AF0060011form3.STOCK_UNIT_6.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.STOCK_UNIT_6.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_6.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-STOCK_UNIT_6');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form3.STOCK_UNIT_6['onLoad' + i])) {
      expj.AF0060010.AF0060011form3.STOCK_UNIT_6['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-STOCK_UNIT_6" name="STOCK_UNIT_6" class="AF0060010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_4",rb)%></span><!-- 入庫保管区在庫数 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-w_WH_STOCK_ON_HAND_QTY">
expj.AF0060010.AF0060011form3.w_WH_STOCK_ON_HAND_QTY = {};
expj.AF0060010.AF0060011form3.w_WH_STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/w_WH_STOCK_ON_HAND_QTY.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.w_WH_STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-w_WH_STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'w_WH_STOCK_ON_HAND_QTY', this);
  });
  expj.AF0060010.AF0060011form3.w_WH_STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.w_WH_STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/w_WH_STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-w_WH_STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-w_WH_STOCK_ON_HAND_QTY" name="w_WH_STOCK_ON_HAND_QTY" class="AF0060010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getw_WH_STOCK_ON_HAND_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-STOCK_UNIT_4">
expj.AF0060010.AF0060011form3.STOCK_UNIT_4 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0060010.AF0060011form3.STOCK_UNIT_4.onLoad0 = function () {
  console.log('STOCK_UNIT_4 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0060011form2/STOCK_UNIT"
expj.AF0060010.AF0060011form3.STOCK_UNIT_4.child0 = function () {
  console.log('STOCK_UNIT_4 script2');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011form3', '_AF0060011form2/STOCK_UNIT'));
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_4.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_4.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_4.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-STOCK_UNIT_4').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'STOCK_UNIT_4', this);
  });
  expj.AF0060010.AF0060011form3.STOCK_UNIT_4.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.STOCK_UNIT_4.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_4.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-STOCK_UNIT_4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form3.STOCK_UNIT_4['onLoad' + i])) {
      expj.AF0060010.AF0060011form3.STOCK_UNIT_4['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-STOCK_UNIT_4" name="STOCK_UNIT_4" class="AF0060010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEFECT_QTY_6",rb)%></span><!-- ロット別不良数 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-DEFECT_QTY">
expj.AF0060010.AF0060011form3.DEFECT_QTY = {};
expj.AF0060010.AF0060011form3.DEFECT_QTY.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/DEFECT_QTY.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.DEFECT_QTY.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-DEFECT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'DEFECT_QTY', this);
  });
  expj.AF0060010.AF0060011form3.DEFECT_QTY.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.DEFECT_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/DEFECT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-DEFECT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-DEFECT_QTY" name="DEFECT_QTY" class="AF0060010-focus-move  " style="width:150px;" data-kind="<%= ColKind2 %>" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getDEFECT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-STOCK_UNIT_7">
expj.AF0060010.AF0060011form3.STOCK_UNIT_7 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0060010.AF0060011form3.STOCK_UNIT_7.onLoad0 = function () {
  console.log('STOCK_UNIT_7 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0060011form2/STOCK_UNIT"
expj.AF0060010.AF0060011form3.STOCK_UNIT_7.child0 = function () {
  console.log('STOCK_UNIT_7 script2');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011form3', '_AF0060011form2/STOCK_UNIT'));
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_7.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_7.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_7.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-STOCK_UNIT_7').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'STOCK_UNIT_7', this);
  });
  expj.AF0060010.AF0060011form3.STOCK_UNIT_7.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.STOCK_UNIT_7.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_7.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-STOCK_UNIT_7');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form3.STOCK_UNIT_7['onLoad' + i])) {
      expj.AF0060010.AF0060011form3.STOCK_UNIT_7['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-STOCK_UNIT_7" name="STOCK_UNIT_7" class="AF0060010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0306",rb)%></span><!-- 在庫累計数 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-w_TOTAL_STOCK_ON_HAND_QTY">
expj.AF0060010.AF0060011form3.w_TOTAL_STOCK_ON_HAND_QTY = {};
expj.AF0060010.AF0060011form3.w_TOTAL_STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/w_TOTAL_STOCK_ON_HAND_QTY.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.w_TOTAL_STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-w_TOTAL_STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'w_TOTAL_STOCK_ON_HAND_QTY', this);
  });
  expj.AF0060010.AF0060011form3.w_TOTAL_STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.w_TOTAL_STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/w_TOTAL_STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-w_TOTAL_STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-w_TOTAL_STOCK_ON_HAND_QTY" name="w_TOTAL_STOCK_ON_HAND_QTY" class="AF0060010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getw_TOTAL_STOCK_ON_HAND_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-STOCK_UNIT_5">
expj.AF0060010.AF0060011form3.STOCK_UNIT_5 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0060010.AF0060011form3.STOCK_UNIT_5.onLoad0 = function () {
  console.log('STOCK_UNIT_5 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0060011form2/STOCK_UNIT"
expj.AF0060010.AF0060011form3.STOCK_UNIT_5.child0 = function () {
  console.log('STOCK_UNIT_5 script2');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011form3', '_AF0060011form2/STOCK_UNIT'));
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_5.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_5.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_5.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-STOCK_UNIT_5').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'STOCK_UNIT_5', this);
  });
  expj.AF0060010.AF0060011form3.STOCK_UNIT_5.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.STOCK_UNIT_5.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_5.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-STOCK_UNIT_5');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form3.STOCK_UNIT_5['onLoad' + i])) {
      expj.AF0060010.AF0060011form3.STOCK_UNIT_5['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-STOCK_UNIT_5" name="STOCK_UNIT_5" class="AF0060010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0340",rb)%></span><!-- 出庫可能数 --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-ALLOCABLE_QTY">
expj.AF0060010.AF0060011form3.ALLOCABLE_QTY = {};
expj.AF0060010.AF0060011form3.ALLOCABLE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/ALLOCABLE_QTY.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.ALLOCABLE_QTY.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-ALLOCABLE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'ALLOCABLE_QTY', this);
  });
  expj.AF0060010.AF0060011form3.ALLOCABLE_QTY.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.ALLOCABLE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/ALLOCABLE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-ALLOCABLE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-ALLOCABLE_QTY" name="ALLOCABLE_QTY" class="AF0060010-focus-move  " style="width:150px;" data-kind="<%= ColKind3 %>" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getALLOCABLE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0060010-AF0060011form3-STOCK_UNIT_8">
expj.AF0060010.AF0060011form3.STOCK_UNIT_8 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0060010.AF0060011form3.STOCK_UNIT_8.onLoad0 = function () {
  console.log('STOCK_UNIT_8 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0060011form2/STOCK_UNIT"
expj.AF0060010.AF0060011form3.STOCK_UNIT_8.child0 = function () {
  console.log('STOCK_UNIT_8 script2');
expj.common.pscript.setReferenceComponentValue('AF0060010', 'AF0060011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060011form3', '_AF0060011form2/STOCK_UNIT'));
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_8.executeAllOnDecision = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_8.onDecision');
  expj.AF0060010.AF0060011form3.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060011form3.STOCK_UNIT_8.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011form3-STOCK_UNIT_8').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060011form3', 'STOCK_UNIT_8', this);
  });
  expj.AF0060010.AF0060011form3.STOCK_UNIT_8.executePScriptOnLoad();
};

expj.AF0060010.AF0060011form3.STOCK_UNIT_8.executePScriptOnLoad = function () {
  console.log('execute AF0060011form3/STOCK_UNIT_8.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011form3-STOCK_UNIT_8');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0060010.AF0060011form3.STOCK_UNIT_8['onLoad' + i])) {
      expj.AF0060010.AF0060011form3.STOCK_UNIT_8['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060011form3-STOCK_UNIT_8" name="STOCK_UNIT_8" class="AF0060010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AF0060011 Revision: 1.11  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AF0060010-AF0060011button0">
expj.AF0060010.AF0060011button0 = {};
expj.AF0060010.AF0060011button0.executeAllOnDecision = function () {
  console.log('execute AF0060011button0.onDecision');
};
expj.AF0060010.AF0060011button0.executeOnLoad = function () {
  expj.AF0060010.AF0060011button0.executePScriptOnLoad();
};

expj.AF0060010.AF0060011button0.executePScriptOnLoad = function () {
  console.log('execute AF0060011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0060010-AF0060011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0060010-AF0060011button0-closeSub1">
expj.AF0060010.AF0060011button0.closeSub1 = {};
// script2="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AF0060011form1/*,_AF0060011form2/*,_AF0060011form3/*@AF0060010Servlet,,$ZZ07013"
expj.AF0060010.AF0060011button0.closeSub1.onClick0 = function () {
  console.log('closeSub1 script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0060010', 'AF0060011button0', '_AF0060011form1/*,_AF0060011form2/*,_AF0060011form3/*', 'AF0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0060010', response);
expj.common.changeBusinessScreenTab('AF0060010', contents);
};
expj.common.pscript.callConfirm('AF0060010', 'AF0060011button0', 'ZZ07013', okEvent);
};
expj.AF0060010.AF0060011button0.closeSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060011button0.closeSub1['onClick' + i])) {
        expj.AF0060010.AF0060011button0.closeSub1['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060011button0.closeSub1.executeAllOnDecision = function () {
};
expj.AF0060010.AF0060011button0.closeSub1.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060011button0-closeSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060011button0', 'closeSub1', this, 'Button');
    }
  });
  expj.AF0060010.AF0060011button0.closeSub1.executePScriptOnLoad();
};

expj.AF0060010.AF0060011button0.closeSub1.executePScriptOnLoad = function () {
  console.log('execute AF0060011button0/closeSub1.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060011button0-closeSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0060010-AF0060011button0-closeSub1" name="closeSub1" class="AF0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0060010 (END)-->
<%
MessageStruct msgStruct = aAF0060010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0060010)) {
  expj.common.treeInstanceMap.AF0060010 = {};
}
expj.common.treeInstanceMap.AF0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0060010)) {
  expj.common.detailDialogMap.AF0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AF0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0060010)) {
  expj.common.viewInstanceMap.AF0060010 = {};
}
expj.common.viewInstanceMap.AF0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0060010.<%=viewId %>.init = function () {
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
    expj.AF0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0060010_init">
/**
 * AF0060010用のロード完了時初期化関数
 */
expj.AF0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0060010');
  expj.common.calendarInstanceMap.AF0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0060010.AF0060011form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.TRANSPORT_CMPLT_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.w_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.w_UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.TRANSPORT_SLIP_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.w_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.h_TRANSPORT_CMPLT_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.h_lotFlg.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form2.RCV_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form2.c_TRANSPORT_CMPLT_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form2.RCV_ISSUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form2.CalendarRcvIssueDate.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form2.ISSUE_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form2.VEND_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form2.RCV_ISSUE_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form2.PeekerRcvIssueCd.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011button2.insertSub1.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.SPEC.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.ISSUE_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.ISSUE_PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.ISSUE_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.ISSUE_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.STOCK_UNIT_1.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.ISSUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.RCV_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.RCV_PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.RCV_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.RCV_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.RCV_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.STOCK_UNIT_2.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.w_LEAVE_RCV_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.STOCK_UNIT_3.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.STOCK_UNIT_6.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.w_WH_STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.STOCK_UNIT_4.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.DEFECT_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.STOCK_UNIT_7.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.w_TOTAL_STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.STOCK_UNIT_5.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.ALLOCABLE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.STOCK_UNIT_8.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011button0.closeSub1.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form1.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form2.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011button2.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011form3.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0060010', 'AF0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0060010', '<%=request.getContextPath() %>');
};

/**
 * AF0060010の全体onDecision処理
 */
expj.AF0060010.executeAllOnDecision = function () {
  expj.AF0060010.AF0060011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0060010_console">
expj.AF0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>