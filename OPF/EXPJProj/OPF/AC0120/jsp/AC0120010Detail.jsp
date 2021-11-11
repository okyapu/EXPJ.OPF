<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:29:03 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0120\AC0120010Detail.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0120.*" %>
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
<jsp:useBean id="aAC0120010Control" class="com.nec.jp.orteus.metamorBase.AC0120.AC0120010Control" scope="request"/>
<jsp:useBean id="aAC0120010Struct" class="com.nec.jp.orteus.metamorBase.AC0120.AC0120010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
詳細
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0120/jsp/AC0120010Detail.jsp,v $
$Author: geng-jia $
$Revision: 1.18 $ $Date: 2017/02/22 02:04:33 $
********************************************************* --%>
<html>
<head>
<title>詳細</title>
<%@include file="common/expj_v5.jsp" %>
<script>
    var data = "<root>";

    function onInitializeOnLoad(){
        setDataGridDataParent("AC0120010",data + "</root>");
    }
</script>
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
<script class="expj-script-AC0120010_init">
  // AC0120010名前空間
  expj.AC0120010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<script class="expj-script-AC0120010-AC0120010detailview1">
expj.AC0120010.AC0120010detailview1 = {};
expj.AC0120010.AC0120010detailview1.executeAllOnDecision = function () {
  console.log('execute AC0120010detailview1.onDecision');
};
expj.AC0120010.AC0120010detailview1.executeOnLoad = function () {
  expj.AC0120010.AC0120010detailview1.executePScriptOnLoad();
};

expj.AC0120010.AC0120010detailview1.executePScriptOnLoad = function () {
  console.log('execute AC0120010detailview1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAC0120010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AC0120010-AC0120010detailview1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AC0120010detailview1";
 detailFloat = "";
 detailWidth = 358;
 detailHeight = 372 + 47;
 String AC0120010detailview1_Id = "AC0120010detailview1";
 String AC0120010detailview1_select = "single";
 String AC0120010detailview1_sortable = "true";
 String AC0120010detailview1_resize = "true";
 String AC0120010detailview1_scroll = "true";
 StringBuffer AC0120010detailview1_HB = new StringBuffer();
 StringBuffer AC0120010detailview1_DB = new StringBuffer();
%>
<%
 AC0120010detailview1_sortable = "false";
 AC0120010detailview1_select = "none";
%>
<% AC0120010detailview1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AC0120010detailview1_sortable).append("}").append(","); %>
<%  AC0120010detailview1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AC0120010detailview1_sortable).append("}").append(",");
AC0120010detailview1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AC0120010detailview1_sortable).append("}").append(",");
AC0120010detailview1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AC0120010detailview1_sortable).append("}").append(",");
 %>
  <% AC0120010detailview1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-Detail_ITEM_NAME\" class=\"expj-label\" data-name=\"Detail_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getDetail_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['2','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['3','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-OUTSIDE_TYP_DN\" class=\"expj-label\" data-name=\"OUTSIDE_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getOUTSIDE_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['5','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-ITEM_SPOIL\" class=\"expj-label\" data-name=\"ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;9.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-UNIT_QTY_TYP_DN\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getUNIT_QTY_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['7','").append(CoreTools.getRBString("Expj.DUE_DATE",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-DUE_DATE\" class=\"expj-label\" data-name=\"DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getDUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['8','").append(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-PRD_DUE_DATE\" class=\"expj-label\" data-name=\"PRD_DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getPRD_DUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['9','").append(CoreTools.getRBString("Expj.PRD_START_DATE",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-PRD_START_DATE\" class=\"expj-label\" data-name=\"PRD_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getPRD_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['10','").append(CoreTools.getRBString("Expj.ODR_START_DATE",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-ODR_START_DATE\" class=\"expj-label\" data-name=\"ODR_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getODR_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['11','").append(CoreTools.getRBString("Expj.REQ_PRD_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-DM_QTY\" class=\"expj-label\" data-name=\"DM_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getDM_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0120010-AC0120010detailview1-d2_STOCK_UNIT\" class=\"expj-label\" data-name=\"d2_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['12','").append(CoreTools.getRBString("Expj.ODR_QTY_1",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-ODR_QTY\" class=\"expj-label\" data-name=\"ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0120010-AC0120010detailview1-d3_STOCK_UNIT\" class=\"expj-label\" data-name=\"d3_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['13','").append(CoreTools.getRBString("Expj.ALCD_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-SUM_ALCD_QTY\" class=\"expj-label\" data-name=\"SUM_ALCD_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSUM_ALCD_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0120010-AC0120010detailview1-d4_STOCK_UNIT\" class=\"expj-label\" data-name=\"d4_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['14','").append(CoreTools.getRBString("Expj.ODR_STS_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-ODR_STS_TYP_DN\" class=\"expj-label\" data-name=\"ODR_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getODR_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['15','").append(CoreTools.getRBString("Expj.DM_STS_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-DM_STS_TYP_DN\" class=\"expj-label\" data-name=\"DM_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getDM_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['16','").append(CoreTools.getRBString("Expj.OD_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-OD_TYP_DN\" class=\"expj-label\" data-name=\"OD_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getOD_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['17','").append(CoreTools.getRBString("Expj.OD_GNR_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-OD_GNR_TYP_DN\" class=\"expj-label\" data-name=\"OD_GNR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getOD_GNR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['18','").append(CoreTools.getRBString("Expj.MANHOUR_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-MANHOUR_TYP_DN\" class=\"expj-label\" data-name=\"MANHOUR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getMANHOUR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['19','").append(CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-OPR_RSLT_TYP_DN\" class=\"expj-label\" data-name=\"OPR_RSLT_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getOPR_RSLT_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['20','").append(CoreTools.getRBString("Expj.TOTAL_RCV_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-TOTAL_RCV_QTY\" class=\"expj-label\" data-name=\"TOTAL_RCV_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getTOTAL_RCV_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0120010-AC0120010detailview1-d5_STOCK_UNIT\" class=\"expj-label\" data-name=\"d5_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['21','").append(CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-TOTAL_ISSUE_QTY\" class=\"expj-label\" data-name=\"TOTAL_ISSUE_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getTOTAL_ISSUE_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0120010-AC0120010detailview1-d6_STOCK_UNIT\" class=\"expj-label\" data-name=\"d6_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AC0120010detailview1_Id;
 detailViewSelect = AC0120010detailview1_select;
 detailViewResize = AC0120010detailview1_resize;
 detailViewScroll = AC0120010detailview1_scroll;
 detailViewHeaderData = AC0120010detailview1_HB;
 detailViewBodyData = AC0120010detailview1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAC0120010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0120010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0120010)) {
  expj.common.treeInstanceMap.AC0120010 = {};
}
expj.common.treeInstanceMap.AC0120010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0120010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0120010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0120010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0120010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0120010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010)) {
  expj.common.detailDialogMap.AC0120010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0120010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0120010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0120010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0120010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0120010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0120010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0120010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0120010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0120010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0120010)) {
  expj.common.viewInstanceMap.AC0120010 = {};
}
expj.common.viewInstanceMap.AC0120010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0120010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0120010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0120010.<%=viewId %>.init = function () {
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
    expj.AC0120010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0120010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0120010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0120010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0120010_init">
/**
 * AC0120010用のロード完了時初期化関数
 */
expj.AC0120010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0120010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0120010');
  expj.common.calendarInstanceMap.AC0120010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0120010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0120010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0120010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0120010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0120010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0120010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0120010.AC0120010detailview1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0120010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0120010', 'AC0120010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0120010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0120010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0120010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0120010', '<%=request.getContextPath() %>');
};

/**
 * AC0120010の全体onDecision処理
 */
expj.AC0120010.executeAllOnDecision = function () {
  expj.AC0120010.AC0120010detailview1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0120010_console">
expj.AC0120010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>