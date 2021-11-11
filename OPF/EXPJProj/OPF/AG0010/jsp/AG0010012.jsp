<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:40:53 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AG0010\AG0010012.html
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

画面名を記入
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0010/jsp/AG0010012.jsp,v $
$Author: geng-jia $	
$Revision: 1.10 $　$Date: 2017/02/22 02:05:56 $
********************************************************* --%>
<html>
<head>
<title>在庫参照サブ2</title>
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
  <div id="expj-business-screen-AG0010010" data-screen="AG0010012" data-newdata="<%=aAG0010010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
			  <script class="expj-script-AG0010010-AG0010012form1">
expj.AG0010010.AG0010012form1 = {};
expj.AG0010010.AG0010012form1.executeAllOnDecision = function () {
  console.log('execute AG0010012form1.onDecision');
};
expj.AG0010010.AG0010012form1.executeOnLoad = function () {
  expj.AG0010010.AG0010012form1.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form1.executePScriptOnLoad = function () {
  console.log('execute AG0010012form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0010010-AG0010012form1" action="AG0010010Servlet" name="AG0010012form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<script class="expj-script-AG0010010-AG0010012form1-w_ITEM_CD">
expj.AG0010010.AG0010012form1.w_ITEM_CD = {};
expj.AG0010010.AG0010012form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AG0010012form1/w_ITEM_CD.onDecision');
  expj.AG0010010.AG0010012form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010012form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010012form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010012form1', 'w_ITEM_CD', this);
  });
  expj.AG0010010.AG0010012form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AG0010012form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010012form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010012form1-w_ITEM_CD" name="w_ITEM_CD" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AG0010010-AG0010012form1-w_ITEM_NAME">
expj.AG0010010.AG0010012form1.w_ITEM_NAME = {};
expj.AG0010010.AG0010012form1.w_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AG0010012form1/w_ITEM_NAME.onDecision');
  expj.AG0010010.AG0010012form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010012form1.w_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010012form1-w_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010012form1', 'w_ITEM_NAME', this);
  });
  expj.AG0010010.AG0010012form1.w_ITEM_NAME.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form1.w_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0010012form1/w_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010012form1-w_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010012form1-w_ITEM_NAME" name="w_ITEM_NAME" class="AG0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AG0010010-AG0010012form1-h_screenflg" name="h_screenflg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0010010Struct.geth_screenflg()) %>">
<script class="expj-script-AG0010010-AG0010012form1-h_screenflg">
expj.AG0010010.AG0010012form1.h_screenflg = {};
expj.AG0010010.AG0010012form1.h_screenflg.executeAllOnDecision = function () {
  console.log('execute AG0010012form1/h_screenflg.onDecision');
  expj.AG0010010.AG0010012form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010012form1.h_screenflg.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010012form1-h_screenflg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010012form1', 'h_screenflg', this);
  });
  expj.AG0010010.AG0010012form1.h_screenflg.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form1.h_screenflg.executePScriptOnLoad = function () {
  console.log('execute AG0010012form1/h_screenflg.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010012form1-h_screenflg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010012form1-w_WH_CD">
expj.AG0010010.AG0010012form1.w_WH_CD = {};
expj.AG0010010.AG0010012form1.w_WH_CD.executeAllOnDecision = function () {
  console.log('execute AG0010012form1/w_WH_CD.onDecision');
  expj.AG0010010.AG0010012form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010012form1.w_WH_CD.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010012form1-w_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010012form1', 'w_WH_CD', this);
  });
  expj.AG0010010.AG0010012form1.w_WH_CD.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form1.w_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AG0010012form1/w_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010012form1-w_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010012form1-w_WH_CD" name="w_WH_CD" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_WH_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AG0010010-AG0010012form1-WH_NAME">
expj.AG0010010.AG0010012form1.WH_NAME = {};
expj.AG0010010.AG0010012form1.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AG0010012form1/WH_NAME.onDecision');
  expj.AG0010010.AG0010012form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010012form1.WH_NAME.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010012form1-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010012form1', 'WH_NAME', this);
  });
  expj.AG0010010.AG0010012form1.WH_NAME.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form1.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0010012form1/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010012form1-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010012form1-WH_NAME" name="WH_NAME" class="AG0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td " style="width:12px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AG0010010-AG0010012view1">
expj.AG0010010.AG0010012view1 = {};
expj.AG0010010.AG0010012view1.executeAllOnClick = function () {
};
expj.AG0010010.AG0010012view1.executeAllOnDecision = function () {
  console.log('execute AG0010012view1.onDecision');
};
expj.AG0010010.AG0010012view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AG0010012view1", "expj.AG0010010.AG0010012view1.executeAllOnClick");
%>
  expj.AG0010010.AG0010012view1.executePScriptOnLoad();
};

expj.AG0010010.AG0010012view1.executePScriptOnLoad = function () {
  console.log('execute AG0010012view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AG0010010-AG0010012view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AG0010012view1_Id = "AG0010012view1";
 String AG0010012view1_select = "single";
 String AG0010012view1_sortable = "true";
 String AG0010012view1_resize = "true";
 String AG0010012view1_scroll = "true";
 StringBuffer AG0010012view1_HB = new StringBuffer();
 StringBuffer AG0010012view1_DB = new StringBuffer();
%>
<%
 AG0010012view1_select = "multi";
 AG0010012view1_sortable = "true";
 AG0010012view1_resize = "true";
 AG0010012view1_scroll = "true";
%>
<%
 AG0010012view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AG0010012view1_sortable).append("}").append(",");
%>
     
<%
AG0010012view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_NAME",rb))).append("', 'name':'l_PLANT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0010012view1_sortable).append("}").append(",");
AG0010012view1_HB.append("{'visible':true, 'type':'string', 'width':'144px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'l_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0010012view1_sortable).append("}").append(",");
AG0010012view1_HB.append("{'visible':true, 'type':'numeric', 'width':'144px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY",rb))).append("', 'name':'l_STOCK_ON_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0010012view1_sortable).append("}").append(",");
AG0010012view1_HB.append("{'visible':true, 'type':'numeric', 'width':'0px', 'title':'', 'name':'l_ALCD_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AG0010012view1_sortable).append("}").append(",");
AG0010012view1_HB.append("{'visible':true, 'type':'string', 'width':'159px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5073",rb))).append("', 'name':'l_EXPIRATION_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0010012view1_sortable).append("}").append(",");
AG0010012view1_HB.append("{'visible':true, 'type':'string', 'width':'320px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_PROC_DATE",rb))).append("', 'name':'l_PRD_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0010012view1_sortable).append("}").append(",");
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
 AG0010012view1_DB.append("[");
 AG0010012view1_DB.append(loopCount);
 AG0010012view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010012view1-l_PLANT_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010012view1-l_PLANT_NAME\" data-name=\"l_PLANT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0010010Struct.getl_PLANT_NAME())).append("</span>'");
 AG0010012view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010012view1-l_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010012view1-l_LOT_NO\" data-name=\"l_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0010010Struct.getl_LOT_NO())).append("</span>'");
 AG0010012view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010012view1-l_STOCK_ON_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010012view1-l_STOCK_ON_HAND_QTY\" data-name=\"l_STOCK_ON_HAND_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0010010Struct.getl_STOCK_ON_HAND_QTY())).append("</span>'");
 AG0010012view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010012view1-l_ALCD_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010012view1-l_ALCD_QTY\" data-name=\"l_ALCD_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0010010Struct.getl_ALCD_QTY())).append("</span>'");
 AG0010012view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010012view1-l_EXPIRATION_DATE-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010012view1-l_EXPIRATION_DATE\" data-name=\"l_EXPIRATION_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0010010Struct.getl_EXPIRATION_DATE())).append("</span>'");
 AG0010012view1_DB.append(",").append("'<span id=\"expj-AG0010010-AG0010012view1-l_PRD_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AG0010010-AG0010012view1-l_PRD_CMPLT_DATE\" data-name=\"l_PRD_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0010010Struct.getl_PRD_CMPLT_DATE())).append("</span>'");
 AG0010012view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAG0010010StructLength) {
   AG0010012view1_DB.append(",");
  }
 }
 aAG0010010Struct = structBackup;
 viewIdList.add(AG0010012view1_Id);
 viewSelectList.add(AG0010012view1_select);
 viewResizeList.add(AG0010012view1_resize);
 viewScrollList.add(AG0010012view1_scroll);
 viewHeaderDataList.add(AG0010012view1_HB);
 viewBodyDataList.add(AG0010012view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AG0010010-AG0010012form2">
expj.AG0010010.AG0010012form2 = {};
expj.AG0010010.AG0010012form2.executeAllOnDecision = function () {
  console.log('execute AG0010012form2.onDecision');
};
expj.AG0010010.AG0010012form2.executeOnLoad = function () {
  expj.AG0010010.AG0010012form2.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form2.executePScriptOnLoad = function () {
  console.log('execute AG0010012form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0010010-AG0010012form2" action="AG0010010Servlet" name="AG0010012form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AG0010010-AG0010012form2-DRAW_CD">
expj.AG0010010.AG0010012form2.DRAW_CD = {};
expj.AG0010010.AG0010012form2.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AG0010012form2/DRAW_CD.onDecision');
  expj.AG0010010.AG0010012form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010012form2.DRAW_CD.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010012form2-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010012form2', 'DRAW_CD', this);
  });
  expj.AG0010010.AG0010012form2.DRAW_CD.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form2.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AG0010012form2/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010012form2-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010012form2-DRAW_CD" name="DRAW_CD" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_UNIT",rb)%></span><!-- 計量単位 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010012form2-STOCK_UNIT">
expj.AG0010010.AG0010012form2.STOCK_UNIT = {};
expj.AG0010010.AG0010012form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AG0010012form2/STOCK_UNIT.onDecision');
  expj.AG0010010.AG0010012form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010012form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010012form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010012form2', 'STOCK_UNIT', this);
  });
  expj.AG0010010.AG0010012form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AG0010012form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010012form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010012form2-STOCK_UNIT" name="STOCK_UNIT" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010012form2-SPEC">
expj.AG0010010.AG0010012form2.SPEC = {};
expj.AG0010010.AG0010012form2.SPEC.executeAllOnDecision = function () {
  console.log('execute AG0010012form2/SPEC.onDecision');
  expj.AG0010010.AG0010012form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010012form2.SPEC.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010012form2-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010012form2', 'SPEC', this);
  });
  expj.AG0010010.AG0010012form2.SPEC.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form2.SPEC.executePScriptOnLoad = function () {
  console.log('execute AG0010012form2/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010012form2-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010012form2-SPEC" name="SPEC" class="AG0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010012form2-MRP_ODR_NAME">
expj.AG0010010.AG0010012form2.MRP_ODR_NAME = {};
expj.AG0010010.AG0010012form2.MRP_ODR_NAME.executeAllOnDecision = function () {
  console.log('execute AG0010012form2/MRP_ODR_NAME.onDecision');
  expj.AG0010010.AG0010012form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010012form2.MRP_ODR_NAME.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010012form2-MRP_ODR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010012form2', 'MRP_ODR_NAME', this);
  });
  expj.AG0010010.AG0010012form2.MRP_ODR_NAME.executePScriptOnLoad();
};

expj.AG0010010.AG0010012form2.MRP_ODR_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0010012form2/MRP_ODR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010012form2-MRP_ODR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010012form2-MRP_ODR_NAME" name="MRP_ODR_NAME" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getMRP_ODR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AG0010012 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AG0010010-AG0010012button0">
expj.AG0010010.AG0010012button0 = {};
expj.AG0010010.AG0010012button0.executeAllOnDecision = function () {
  console.log('execute AG0010012button0.onDecision');
};
expj.AG0010010.AG0010012button0.executeOnLoad = function () {
  expj.AG0010010.AG0010012button0.executePScriptOnLoad();
};

expj.AG0010010.AG0010012button0.executePScriptOnLoad = function () {
  console.log('execute AG0010012button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0010010-AG0010012button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0010010-AG0010012button0-CloseSub2">
expj.AG0010010.AG0010012button0.CloseSub2 = {};
// script1="onClick;0;CHK;_AG0010012form1/h_screenflg[eq]1@*0,*1"
expj.AG0010010.AG0010012button0.CloseSub2.onClick0 = function () {
  console.log('CloseSub2 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0010010', 'AG0010012button0', '_AG0010012form1/h_screenflg'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;CLOSE"
expj.AG0010010.AG0010012button0.CloseSub2.child0 = function () {
  console.log('CloseSub2 script2');
expj.common.executeBusinessScreenCloseDialog('AG0010010');
};
// script3="child;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>@AG0010010Servlet,,$ZZ07013"
expj.AG0010010.AG0010012button0.CloseSub2.child1 = function () {
  console.log('CloseSub2 script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0010010', 'AG0010012button0', '', 'AG0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0010010', response);
expj.common.changeBusinessScreenTab('AG0010010', contents);
};
expj.common.pscript.callConfirm('AG0010010', 'AG0010012button0', 'ZZ07013', okEvent);
};
expj.AG0010010.AG0010012button0.CloseSub2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010012button0.CloseSub2['onClick' + i])) {
        expj.AG0010010.AG0010012button0.CloseSub2['onClick' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010012button0.CloseSub2.executeAllOnDecision = function () {
};
expj.AG0010010.AG0010012button0.CloseSub2.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010012button0-CloseSub2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0010010', 'AG0010012button0', 'CloseSub2', this, 'Button');
    }
  });
  expj.AG0010010.AG0010012button0.CloseSub2.executePScriptOnLoad();
};

expj.AG0010010.AG0010012button0.CloseSub2.executePScriptOnLoad = function () {
  console.log('execute AG0010012button0/CloseSub2.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010012button0-CloseSub2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0010010-AG0010012button0-CloseSub2" name="CloseSub2" class="AG0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
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
  try{expj.AG0010010.AG0010012form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012form1.w_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012form1.h_screenflg.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012form1.w_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012form1.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012form2.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012form2.SPEC.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012form2.MRP_ODR_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012button0.CloseSub2.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012form1.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012view1.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012form2.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010012button0.executeOnLoad();}catch(e){};
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
  expj.AG0010010.AG0010012form1.executeAllOnDecision();
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