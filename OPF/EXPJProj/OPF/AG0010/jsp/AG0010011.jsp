<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:40:50 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AG0010\AG0010011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AG0010.*" %>
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
<jsp:useBean id="aAG0010010Control" class="com.nec.jp.orteus.metamorBase.AG0010.AG0010010Control" scope="request"/>
<jsp:useBean id="aAG0010010Struct" class="com.nec.jp.orteus.metamorBase.AG0010.AG0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

在庫参照サブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0010/jsp/AG0010011.jsp,v $
$Author: geng-jia $	
$Revision: 1.12 $ $Date: 2017/02/22 02:05:56 $
********************************************************* --%>
<html>
<head>
<title>在庫参照サブ1</title>
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
<script class="expj-script-AG0010010_init">
  // AG0010010名前空間
  expj.AG0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AG0010010" data-screen="AG0010011" data-newdata="<%=aAG0010010Control.isNewData() %>">
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
 
            <div class="expj-td frame04" style=""></div><!--/td-->

            <div class="expj-td frame05" style=""> 
              <script class="expj-script-AG0010010-AG0010011form1">
expj.AG0010010.AG0010011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AG0010010.AG0010011form1.onLoad0 = function () {
  console.log('AG0010011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;?AG0010011view1/?[neq]NOT_SELECTED@*0,*1"
expj.AG0010010.AG0010011form1.onDecision0 = function () {
  console.log('AG0010011form1 script2');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0010010', 'AG0010011form1', '?AG0010011view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AG0010011button1/inventoryDetailsub1"
expj.AG0010010.AG0010011form1.child0 = function () {
  console.log('AG0010011form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AG0010010', 'AG0010011form1', '_AG0010011button1/inventoryDetailsub1');
};
// script4="child;1;MASK;_AG0010011button1/inventoryDetailsub1"
expj.AG0010010.AG0010011form1.child1 = function () {
  console.log('AG0010011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AG0010010', 'AG0010011form1', '_AG0010011button1/inventoryDetailsub1');
};
// script5="onDecision;1;CHK;_AG0010011form1/h_lotCtrl[eq]true[and]_AG0010011form1/h_lotFlg[eq]1@,*2"
expj.AG0010010.AG0010011form1.onDecision1 = function () {
  console.log('AG0010011form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0010010', 'AG0010011form1', '_AG0010011form1/h_lotCtrl'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0010010', 'AG0010011form1', '_AG0010011form1/h_lotFlg'), '[eq]', '1')) {

} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script7="child;2;MASK;_AG0010011button1/inventoryDetailsub1"
expj.AG0010010.AG0010011form1.child2 = function () {
  console.log('AG0010011form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AG0010010', 'AG0010011form1', '_AG0010011button1/inventoryDetailsub1');
};
expj.AG0010010.AG0010011form1.executeAllOnDecision = function () {
  console.log('execute AG0010011form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010011form1['onDecision' + i])) {
        expj.AG0010010.AG0010011form1['onDecision' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010011form1.executeOnLoad = function () {
  expj.AG0010010.AG0010011form1.executePScriptOnLoad();
};

expj.AG0010010.AG0010011form1.executePScriptOnLoad = function () {
  console.log('execute AG0010011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AG0010010.AG0010011form1['onLoad' + i])) {
      expj.AG0010010.AG0010011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0010010-AG0010011form1" action="AG0010010Servlet" name="AG0010011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010011form1-w_ITEM_CD">
expj.AG0010010.AG0010011form1.w_ITEM_CD = {};
expj.AG0010010.AG0010011form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AG0010011form1/w_ITEM_CD.onDecision');
  expj.AG0010010.AG0010011form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010011form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010011form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010011form1', 'w_ITEM_CD', this);
  });
  expj.AG0010010.AG0010011form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AG0010010.AG0010011form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AG0010011form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010011form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010011form1-w_ITEM_CD" name="w_ITEM_CD" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AG0010010-AG0010011form1-w_ITEM_NAME">
expj.AG0010010.AG0010011form1.w_ITEM_NAME = {};
expj.AG0010010.AG0010011form1.w_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AG0010011form1/w_ITEM_NAME.onDecision');
  expj.AG0010010.AG0010011form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010011form1.w_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010011form1-w_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010011form1', 'w_ITEM_NAME', this);
  });
  expj.AG0010010.AG0010011form1.w_ITEM_NAME.executePScriptOnLoad();
};

expj.AG0010010.AG0010011form1.w_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0010011form1/w_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010011form1-w_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010011form1-w_ITEM_NAME" name="w_ITEM_NAME" class="AG0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AG0010010-AG0010011form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0010010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AG0010010-AG0010011form1-h_lotCtrl">
expj.AG0010010.AG0010011form1.h_lotCtrl = {};
expj.AG0010010.AG0010011form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AG0010011form1/h_lotCtrl.onDecision');
  expj.AG0010010.AG0010011form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010011form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010011form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010011form1', 'h_lotCtrl', this);
  });
  expj.AG0010010.AG0010011form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AG0010010.AG0010011form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AG0010011form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010011form1-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AG0010010-AG0010011form1-h_lotFlg" name="h_lotFlg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0010010Struct.geth_lotFlg()) %>">
<script class="expj-script-AG0010010-AG0010011form1-h_lotFlg">
expj.AG0010010.AG0010011form1.h_lotFlg = {};
expj.AG0010010.AG0010011form1.h_lotFlg.executeAllOnDecision = function () {
  console.log('execute AG0010011form1/h_lotFlg.onDecision');
  expj.AG0010010.AG0010011form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010011form1.h_lotFlg.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010011form1-h_lotFlg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010011form1', 'h_lotFlg', this);
  });
  expj.AG0010010.AG0010011form1.h_lotFlg.executePScriptOnLoad();
};

expj.AG0010010.AG0010011form1.h_lotFlg.executePScriptOnLoad = function () {
  console.log('execute AG0010011form1/h_lotFlg.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010011form1-h_lotFlg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AG0010010-AG0010011view1">
expj.AG0010010.AG0010011view1 = {};
expj.AG0010010.AG0010011view1.executeAllOnClick = function () {
};
expj.AG0010010.AG0010011view1.executeAllOnDecision = function () {
  console.log('execute AG0010011view1.onDecision');
};
expj.AG0010010.AG0010011view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AG0010011view1", "expj.AG0010010.AG0010011view1.executeAllOnClick");
%>
  expj.AG0010010.AG0010011view1.executePScriptOnLoad();
};

expj.AG0010010.AG0010011view1.executePScriptOnLoad = function () {
  console.log('execute AG0010011view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AG0010010-AG0010011view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AG0010011view1_Id = "AG0010011view1";
 String AG0010011view1_select = "single";
 String AG0010011view1_sortable = "true";
 String AG0010011view1_resize = "true";
 String AG0010011view1_scroll = "true";
 StringBuffer AG0010011view1_HB = new StringBuffer();
 StringBuffer AG0010011view1_DB = new StringBuffer();
%>
<%
 AG0010011view1_select = "single";
 AG0010011view1_sortable = "true";
 AG0010011view1_resize = "true";
 AG0010011view1_scroll = "true";
%>
<%
 AG0010011view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AG0010011view1_sortable).append("}").append(",");
%>
     
<%
AG0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_NAME",rb))).append("', 'name':'PLANT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0010011view1_sortable).append("}").append(",");
AG0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0010011view1_sortable).append("}").append(",");
AG0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'w_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0010011view1_sortable).append("}").append(",");
AG0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0010011view1_sortable).append("}").append(",");
AG0010011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_FLG",rb))).append("', 'name':'MRP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0010011view1_sortable).append("}").append(",");
AG0010011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY",rb))).append("', 'name':'w_STOCK_ON_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0010011view1_sortable).append("}").append(",");
AG0010011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEFECT_QTY",rb))).append("', 'name':'w_DEFECT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0010011view1_sortable).append("}").append(",");
AG0010011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRVS_DAYEND_STOCK_QTY",rb))).append("', 'name':'w_PRVS_DAYEND_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0010011view1_sortable).append("}").append(",");
AG0010011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRVS_MONTHEND_STOCK_QTY",rb))).append("', 'name':'w_PRVS_MONTHEND_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0010011view1_sortable).append("}").append(",");
%>
<%
 int aAG0010010StructLength = aAG0010010Control.getListsize();
 final AG0010010Struct structBackup = aAG0010010Struct;
 aAG0010010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAG0010010StructLength; ++loopCount) {
  if((aAG0010010Struct = (AG0010010Struct) aAG0010010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAG0010010Struct", aAG0010010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AG0010011view1_DB.append("[");
 AG0010011view1_DB.append(loopCount);
 AG0010011view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010011view1-PLANT_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010011view1-PLANT_NAME\" data-name=\"PLANT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0010010Struct.getPLANT_NAME())).append("</span>'");
 AG0010011view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010011view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010011view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0010010Struct.getJOB_ODR_CD())).append("</span>'");
 AG0010011view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010011view1-w_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010011view1-w_WH_CD\" data-name=\"w_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0010010Struct.getw_WH_CD())).append("</span>'");
 AG0010011view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010011view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010011view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0010010Struct.getWH_NAME())).append("</span>'");
 AG0010011view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010011view1-MRP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010011view1-MRP_NAME\" data-name=\"MRP_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0010010Struct.getMRP_NAME())).append("</span>'");
 AG0010011view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010011view1-w_STOCK_ON_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010011view1-w_STOCK_ON_HAND_QTY\" data-name=\"w_STOCK_ON_HAND_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0010010Struct.getw_STOCK_ON_HAND_QTY())).append("</span>'");
 AG0010011view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010011view1-w_DEFECT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010011view1-w_DEFECT_QTY\" data-name=\"w_DEFECT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0010010Struct.getw_DEFECT_QTY())).append("</span>'");
 AG0010011view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010011view1-w_PRVS_DAYEND_STOCK_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010011view1-w_PRVS_DAYEND_STOCK_QTY\" data-name=\"w_PRVS_DAYEND_STOCK_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0010010Struct.getw_PRVS_DAYEND_STOCK_QTY())).append("</span>'");
 AG0010011view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010011view1-w_PRVS_MONTHEND_STOCK_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010011view1-w_PRVS_MONTHEND_STOCK_QTY\" data-name=\"w_PRVS_MONTHEND_STOCK_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0010010Struct.getw_PRVS_MONTHEND_STOCK_QTY())).append("</span>'");
 AG0010011view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAG0010010StructLength) {
   AG0010011view1_DB.append(",");
  }
 }
 aAG0010010Struct = structBackup;
 viewIdList.add(AG0010011view1_Id);
 viewSelectList.add(AG0010011view1_select);
 viewResizeList.add(AG0010011view1_resize);
 viewScrollList.add(AG0010011view1_scroll);
 viewHeaderDataList.add(AG0010011view1_HB);
 viewBodyDataList.add(AG0010011view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:769px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 853px);"><script class="expj-script-AG0010010-AG0010011button1">
expj.AG0010010.AG0010011button1 = {};
expj.AG0010010.AG0010011button1.executeAllOnDecision = function () {
  console.log('execute AG0010011button1.onDecision');
};
expj.AG0010010.AG0010011button1.executeOnLoad = function () {
  expj.AG0010010.AG0010011button1.executePScriptOnLoad();
};

expj.AG0010010.AG0010011button1.executePScriptOnLoad = function () {
  console.log('execute AG0010011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0010010-AG0010011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0010010-AG0010011button1-inventoryDetailsub1">
expj.AG0010010.AG0010011button1.inventoryDetailsub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AG0010011form1/*,_AG0010011view1/+,_AG0010011form3/*@AG0010010Servlet"
expj.AG0010010.AG0010011button1.inventoryDetailsub1.onClick0 = function () {
  console.log('inventoryDetailsub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0010010', 'AG0010011button1', '_AG0010011form1/*,_AG0010011view1/+,_AG0010011form3/*', 'AG0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0010010', response);
expj.common.changeBusinessScreenTab('AG0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AG0010010.AG0010011button1.inventoryDetailsub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010011button1.inventoryDetailsub1['onClick' + i])) {
        expj.AG0010010.AG0010011button1.inventoryDetailsub1['onClick' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010011button1.inventoryDetailsub1.executeAllOnDecision = function () {
};
expj.AG0010010.AG0010011button1.inventoryDetailsub1.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010011button1-inventoryDetailsub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0010010', 'AG0010011button1', 'inventoryDetailsub1', this, 'Button');
    }
  });
  expj.AG0010010.AG0010011button1.inventoryDetailsub1.executePScriptOnLoad();
};

expj.AG0010010.AG0010011button1.inventoryDetailsub1.executePScriptOnLoad = function () {
  console.log('execute AG0010011button1/inventoryDetailsub1.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010011button1-inventoryDetailsub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0010010-AG0010011button1-inventoryDetailsub1" name="inventoryDetailsub1" class="AG0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInventoryDetailsub2",rb)%></button><!-- ロット別詳細ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
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
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AG0010010-AG0010011form3">
expj.AG0010010.AG0010011form3 = {};
expj.AG0010010.AG0010011form3.executeAllOnDecision = function () {
  console.log('execute AG0010011form3.onDecision');
};
expj.AG0010010.AG0010011form3.executeOnLoad = function () {
  expj.AG0010010.AG0010011form3.executePScriptOnLoad();
};

expj.AG0010010.AG0010011form3.executePScriptOnLoad = function () {
  console.log('execute AG0010011form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0010010-AG0010011form3" action="AG0010010Servlet" name="AG0010011form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010011form3-DRAW_CD">
expj.AG0010010.AG0010011form3.DRAW_CD = {};
expj.AG0010010.AG0010011form3.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AG0010011form3/DRAW_CD.onDecision');
  expj.AG0010010.AG0010011form3.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010011form3.DRAW_CD.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010011form3-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010011form3', 'DRAW_CD', this);
  });
  expj.AG0010010.AG0010011form3.DRAW_CD.executePScriptOnLoad();
};

expj.AG0010010.AG0010011form3.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AG0010011form3/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010011form3-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010011form3-DRAW_CD" name="DRAW_CD" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_UNIT",rb)%></span><!-- 計量単位 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010011form3-STOCK_UNIT">
expj.AG0010010.AG0010011form3.STOCK_UNIT = {};
expj.AG0010010.AG0010011form3.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AG0010011form3/STOCK_UNIT.onDecision');
  expj.AG0010010.AG0010011form3.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010011form3.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010011form3-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010011form3', 'STOCK_UNIT', this);
  });
  expj.AG0010010.AG0010011form3.STOCK_UNIT.executePScriptOnLoad();
};

expj.AG0010010.AG0010011form3.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AG0010011form3/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010011form3-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010011form3-STOCK_UNIT" name="STOCK_UNIT" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010011form3-SPEC">
expj.AG0010010.AG0010011form3.SPEC = {};
expj.AG0010010.AG0010011form3.SPEC.executeAllOnDecision = function () {
  console.log('execute AG0010011form3/SPEC.onDecision');
  expj.AG0010010.AG0010011form3.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010011form3.SPEC.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010011form3-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010011form3', 'SPEC', this);
  });
  expj.AG0010010.AG0010011form3.SPEC.executePScriptOnLoad();
};

expj.AG0010010.AG0010011form3.SPEC.executePScriptOnLoad = function () {
  console.log('execute AG0010011form3/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010011form3-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010011form3-SPEC" name="SPEC" class="AG0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010011form3-MRP_ODR_NAME">
expj.AG0010010.AG0010011form3.MRP_ODR_NAME = {};
expj.AG0010010.AG0010011form3.MRP_ODR_NAME.executeAllOnDecision = function () {
  console.log('execute AG0010011form3/MRP_ODR_NAME.onDecision');
  expj.AG0010010.AG0010011form3.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010011form3.MRP_ODR_NAME.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010011form3-MRP_ODR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010011form3', 'MRP_ODR_NAME', this);
  });
  expj.AG0010010.AG0010011form3.MRP_ODR_NAME.executePScriptOnLoad();
};

expj.AG0010010.AG0010011form3.MRP_ODR_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0010011form3/MRP_ODR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010011form3-MRP_ODR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010011form3-MRP_ODR_NAME" name="MRP_ODR_NAME" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getMRP_ODR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style=""></div><!--/td-->
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
<span class="version">AG0010011 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AG0010010-AG0010011button0">
expj.AG0010010.AG0010011button0 = {};
expj.AG0010010.AG0010011button0.executeAllOnDecision = function () {
  console.log('execute AG0010011button0.onDecision');
};
expj.AG0010010.AG0010011button0.executeOnLoad = function () {
  expj.AG0010010.AG0010011button0.executePScriptOnLoad();
};

expj.AG0010010.AG0010011button0.executePScriptOnLoad = function () {
  console.log('execute AG0010011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0010010-AG0010011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0010010-AG0010011button0-CloseSub1">
expj.AG0010010.AG0010011button0.CloseSub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@AG0010010Servlet,,$ZZ07013"
expj.AG0010010.AG0010011button0.CloseSub1.onClick0 = function () {
  console.log('CloseSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0010010', 'AG0010011button0', '', 'AG0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0010010', response);
expj.common.changeBusinessScreenTab('AG0010010', contents);
};
expj.common.pscript.callConfirm('AG0010010', 'AG0010011button0', 'ZZ07013', okEvent);
};
expj.AG0010010.AG0010011button0.CloseSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010011button0.CloseSub1['onClick' + i])) {
        expj.AG0010010.AG0010011button0.CloseSub1['onClick' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010011button0.CloseSub1.executeAllOnDecision = function () {
};
expj.AG0010010.AG0010011button0.CloseSub1.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010011button0-CloseSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0010010', 'AG0010011button0', 'CloseSub1', this, 'Button');
    }
  });
  expj.AG0010010.AG0010011button0.CloseSub1.executePScriptOnLoad();
};

expj.AG0010010.AG0010011button0.CloseSub1.executePScriptOnLoad = function () {
  console.log('execute AG0010011button0/CloseSub1.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010011button0-CloseSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0010010-AG0010011button0-CloseSub1" name="CloseSub1" class="AG0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AG0010010 (END)-->
<%
MessageStruct msgStruct = aAG0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AG0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AG0010010)) {
  expj.common.treeInstanceMap.AG0010010 = {};
}
expj.common.treeInstanceMap.AG0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AG0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AG0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AG0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AG0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AG0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AG0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AG0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AG0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0010010)) {
  expj.common.detailDialogMap.AG0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AG0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AG0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AG0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AG0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AG0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AG0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AG0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AG0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AG0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AG0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AG0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AG0010010)) {
  expj.common.viewInstanceMap.AG0010010 = {};
}
expj.common.viewInstanceMap.AG0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AG0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AG0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AG0010010.<%=viewId %>.init = function () {
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
    expj.AG0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AG0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AG0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AG0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AG0010010_init">
/**
 * AG0010010用のロード完了時初期化関数
 */
expj.AG0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AG0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AG0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AG0010010');
  expj.common.calendarInstanceMap.AG0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AG0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AG0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AG0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AG0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AG0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AG0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AG0010010.AG0010011form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011form1.w_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011form1.h_lotFlg.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011button1.inventoryDetailsub1.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011form3.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011form3.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011form3.SPEC.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011form3.MRP_ODR_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011button0.CloseSub1.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011form1.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011view1.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011button1.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011form3.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AG0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AG0010010', 'AG0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AG0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AG0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.AG0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AG0010010', '<%=request.getContextPath() %>');
};

/**
 * AG0010010の全体onDecision処理
 */
expj.AG0010010.executeAllOnDecision = function () {
  expj.AG0010010.AG0010011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AG0010010_console">
expj.AG0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>