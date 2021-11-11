<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:35:54 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AE0090\AE0090040Detail.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0090.*" %>
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
<jsp:useBean id="aAE0090040Control" class="com.nec.jp.orteus.metamorBase.AE0090.AE0090040Control" scope="request"/>
<jsp:useBean id="aAE0090040Struct" class="com.nec.jp.orteus.metamorBase.AE0090.AE0090040Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

詳細
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/jsp/AE0090040Detail.jsp,v $
$Author: geng-jia $
$Revision: 1.12 $ $Date: 2017/02/22 02:05:21 $
********************************************************* --%>
<html>
<head>
<title>詳細</title>
<%@include file="common/expj_v5.jsp" %>
<script>
	var data = "<root>";
	
	function onInitializeOnLoad(){
		setDataGridDataParent("AE0090040",data + "</root>");
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
<script class="expj-script-AE0090040_init">
  // AE0090040名前空間
  expj.AE0090040 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <script class="expj-script-AE0090040-AE0090040detailview1">
expj.AE0090040.AE0090040detailview1 = {};
expj.AE0090040.AE0090040detailview1.executeAllOnDecision = function () {
  console.log('execute AE0090040detailview1.onDecision');
};
expj.AE0090040.AE0090040detailview1.executeOnLoad = function () {
  expj.AE0090040.AE0090040detailview1.executePScriptOnLoad();
};

expj.AE0090040.AE0090040detailview1.executePScriptOnLoad = function () {
  console.log('execute AE0090040detailview1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAE0090040Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AE0090040-AE0090040detailview1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AE0090040detailview1";
 detailFloat = "";
 detailWidth = 358;
 detailHeight = 323 + 47;
 String AE0090040detailview1_Id = "AE0090040detailview1";
 String AE0090040detailview1_select = "single";
 String AE0090040detailview1_sortable = "true";
 String AE0090040detailview1_resize = "true";
 String AE0090040detailview1_scroll = "true";
 StringBuffer AE0090040detailview1_HB = new StringBuffer();
 StringBuffer AE0090040detailview1_DB = new StringBuffer();
%>
<%
 AE0090040detailview1_sortable = "false";
 AE0090040detailview1_select = "none";
%>
<% AE0090040detailview1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AE0090040detailview1_sortable).append("}").append(","); %>
<%  AE0090040detailview1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AE0090040detailview1_sortable).append("}").append(",");
AE0090040detailview1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AE0090040detailview1_sortable).append("}").append(",");
AE0090040detailview1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AE0090040detailview1_sortable).append("}").append(",");
 %>
  <% AE0090040detailview1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Parent_ITEM_CD\" class=\"expj-label\" data-name=\"Det_Parent_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Parent_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Parent_ITEM_NAME\" class=\"expj-label\" data-name=\"Det_Parent_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Parent_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['3','").append(CoreTools.getRBString("Expj.COMP_ITEM_CD_1",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_ITEM_CD\" class=\"expj-label\" data-name=\"Det_Comp_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['4','").append(CoreTools.getRBString("Expj.ITEM_NAME_1",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_ITEM_NAME\" class=\"expj-label\" data-name=\"Det_Comp_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['5','").append(CoreTools.getRBString("Expj.PS_UNIT_QTY_1",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_Need_QTY\" class=\"expj-label\" data-name=\"Det_Comp_Need_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;ROUND;4\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_Need_QTY())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['6','").append(CoreTools.getRBString("Expj.Cmt3076",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_ONHAND_QTY\" class=\"expj-label\" data-name=\"Det_Comp_ONHAND_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_ONHAND_QTY())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['7','").append(CoreTools.getRBString("Expj.Cmt3138",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-RECEIPT_SCHEDULES_NUMBER1\" class=\"expj-label\" data-name=\"RECEIPT_SCHEDULES_NUMBER1\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090040Struct.getRECEIPT_SCHEDULES_NUMBER1())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['8','").append(CoreTools.getRBString("Expj.Cmt3139",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-RECEIPT_SCHEDULES_NUMBER2\" class=\"expj-label\" data-name=\"RECEIPT_SCHEDULES_NUMBER2\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090040Struct.getRECEIPT_SCHEDULES_NUMBER2())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['9','").append(CoreTools.getRBString("Expj.STOCK_UNIT",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_STOCK_UNIT\" class=\"expj-label\" data-name=\"Det_Comp_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_STOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['10','").append(CoreTools.getRBString("Expj.Cmt3141",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_PRODUCT_TYP\" class=\"expj-label\" data-name=\"Det_Comp_PRODUCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_PRODUCT_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['11','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP_5",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_OUTSIDE_TYP\" class=\"expj-label\" data-name=\"Det_Comp_OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_OUTSIDE_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['12','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP_1",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"Det_Comp_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_MRP_ODR_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['13','").append(CoreTools.getRBString("Expj.PS_UNIT_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_PS_UNIT_QTY\" class=\"expj-label\" data-name=\"Det_Comp_PS_UNIT_QTY\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_PS_UNIT_QTY())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['14','").append(CoreTools.getRBString("Expj.Cmt1505",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_ITEM_SPOIL\" class=\"expj-label\" data-name=\"Det_Comp_ITEM_SPOIL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_ITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['15','").append(CoreTools.getRBString("Expj.PS_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_PS_SPOIL\" class=\"expj-label\" data-name=\"Det_Comp_PS_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_PS_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['16','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"Det_Comp_EFF_PHASE_IN_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['17','").append(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_EFF_PHASE_OUT_DATE\" class=\"expj-label\" data-name=\"Det_Comp_EFF_PHASE_OUT_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_EFF_PHASE_OUT_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0090040detailview1_DB.append("['18','").append(CoreTools.getRBString("Expj.CONS_TYP",rb)).append("','").append("<span id=\"expj-AE0090040-AE0090040detailview1-Det_Comp_CONS_TYP\" class=\"expj-label\" data-name=\"Det_Comp_CONS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0090040Struct.getDet_Comp_CONS_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AE0090040detailview1_Id;
 detailViewSelect = AE0090040detailview1_select;
 detailViewResize = AE0090040detailview1_resize;
 detailViewScroll = AE0090040detailview1_scroll;
 detailViewHeaderData = AE0090040detailview1_HB;
 detailViewBodyData = AE0090040detailview1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAE0090040Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0090040-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0090040)) {
  expj.common.treeInstanceMap.AE0090040 = {};
}
expj.common.treeInstanceMap.AE0090040.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0090040.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0090040.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0090040.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0090040.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0090040.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0090040.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0090040.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0090040.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0090040-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0090040-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090040)) {
  expj.common.detailDialogMap.AE0090040 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090040._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0090040._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090040.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0090040.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090040.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090040.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0090040.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0090040.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0090040-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0090040-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0090040-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0090040.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0090040.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0090040._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0090040-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0090040)) {
  expj.common.viewInstanceMap.AE0090040 = {};
}
expj.common.viewInstanceMap.AE0090040.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0090040.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0090040.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0090040.<%=viewId %>.init = function () {
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
    expj.AE0090040.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0090040.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0090040-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0090040-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0090040_init">
/**
 * AE0090040用のロード完了時初期化関数
 */
expj.AE0090040.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0090040');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0090040');
  expj.common.calendarInstanceMap.AE0090040 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0090040.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0090040.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0090040.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0090040');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0090040');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0090040-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0090040-<%=detailId %>');
<%
 }
%>
  try{expj.AE0090040.AE0090040detailview1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0090040.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0090040', 'AE0090040');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0090040');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0090040-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0090040-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0090040', '<%=request.getContextPath() %>');
};

/**
 * AE0090040の全体onDecision処理
 */
expj.AE0090040.executeAllOnDecision = function () {
  expj.AE0090040.AE0090040detailview1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0090040_console">
expj.AE0090040.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>