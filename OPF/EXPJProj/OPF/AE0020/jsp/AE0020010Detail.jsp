<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:33:45 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AE0020\AE0020010Detail.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0020.*" %>
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
<jsp:useBean id="aAE0020010Control" class="com.nec.jp.orteus.metamorBase.AE0020.AE0020010Control" scope="request"/>
<jsp:useBean id="aAE0020010Struct" class="com.nec.jp.orteus.metamorBase.AE0020.AE0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
詳細
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0020/jsp/AE0020010Detail.jsp,v $
$Author: geng-jia $
$Revision: 1.19 $ $Date: 2017/02/22 02:05:05 $
********************************************************* --%>
<html>
<head>
<title>詳細</title>
<%@include file="common/expj_v5.jsp" %>
<script>
	var data = "<root>";
	
	function onInitializeOnLoad(){
		setDataGridDataParent("AE0020010",data + "</root>");
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
<script class="expj-script-AE0020010_init">
  // AE0020010名前空間
  expj.AE0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<script class="expj-script-AE0020010-AE0020010detailview1">
expj.AE0020010.AE0020010detailview1 = {};
expj.AE0020010.AE0020010detailview1.executeAllOnDecision = function () {
  console.log('execute AE0020010detailview1.onDecision');
};
expj.AE0020010.AE0020010detailview1.executeOnLoad = function () {
  expj.AE0020010.AE0020010detailview1.executePScriptOnLoad();
};

expj.AE0020010.AE0020010detailview1.executePScriptOnLoad = function () {
  console.log('execute AE0020010detailview1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAE0020010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AE0020010-AE0020010detailview1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AE0020010detailview1";
 detailFloat = "";
 detailWidth = 358;
 detailHeight = 372 + 47;
 String AE0020010detailview1_Id = "AE0020010detailview1";
 String AE0020010detailview1_select = "single";
 String AE0020010detailview1_sortable = "true";
 String AE0020010detailview1_resize = "true";
 String AE0020010detailview1_scroll = "true";
 StringBuffer AE0020010detailview1_HB = new StringBuffer();
 StringBuffer AE0020010detailview1_DB = new StringBuffer();
%>
<%
 AE0020010detailview1_sortable = "false";
 AE0020010detailview1_select = "none";
%>
<% AE0020010detailview1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AE0020010detailview1_sortable).append("}").append(","); %>
<%  AE0020010detailview1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AE0020010detailview1_sortable).append("}").append(",");
AE0020010detailview1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AE0020010detailview1_sortable).append("}").append(",");
AE0020010detailview1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AE0020010detailview1_sortable).append("}").append(",");
 %>
  <% AE0020010detailview1_DB.append("['1','").append(CoreTools.getRBString("Expj.JOB_ODR_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-JOB_ODR_TYP_DN\" class=\"expj-label\" data-name=\"JOB_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getJOB_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['2','").append(CoreTools.getRBString("Expj.ALC_GRP_CD",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-ALC_GRP_CD\" class=\"expj-label\" data-name=\"ALC_GRP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getALC_GRP_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['3','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['4','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['5','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-OUTSIDE_TYP_DN\" class=\"expj-label\" data-name=\"OUTSIDE_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getOUTSIDE_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['6','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-MRP_ODR_TYP_DN\" class=\"expj-label\" data-name=\"MRP_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getMRP_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['7','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-ITEM_SPOIL\" class=\"expj-label\" data-name=\"ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;9.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['8','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-UNIT_QTY_TYP_DN\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getUNIT_QTY_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['9','").append(CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-JOB_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"JOB_ODR_DLV_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getJOB_ODR_DLV_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['10','").append(CoreTools.getRBString("Expj.DUE_DATE",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-DUE_DATE\" class=\"expj-label\" data-name=\"DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getDUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['11','").append(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-PRD_DUE_DATE\" class=\"expj-label\" data-name=\"PRD_DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getPRD_DUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['12','").append(CoreTools.getRBString("Expj.PRD_START_DATE",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-PRD_START_DATE\" class=\"expj-label\" data-name=\"PRD_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getPRD_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['13','").append(CoreTools.getRBString("Expj.ODR_START_DATE",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-ODR_START_DATE\" class=\"expj-label\" data-name=\"ODR_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getODR_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['14','").append(CoreTools.getRBString("Expj.PUCH_ODR_QTY_2",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-SUM_PUCH_ODR_QTY\" class=\"expj-label\" data-name=\"SUM_PUCH_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSUM_PUCH_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0020010-AE0020010detailview1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['15','").append(CoreTools.getRBString("Expj.OPR_INST_QTY_1",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-SUM_OPR_INST_QTY\" class=\"expj-label\" data-name=\"SUM_OPR_INST_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSUM_OPR_INST_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0020010-AE0020010detailview1-d1_STOCK_UNIT\" class=\"expj-label\" data-name=\"d1_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['16','").append(CoreTools.getRBString("Expj.ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-ODR_QTY\" class=\"expj-label\" data-name=\"ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0020010-AE0020010detailview1-d2_STOCK_UNIT\" class=\"expj-label\" data-name=\"d2_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['17','").append(CoreTools.getRBString("Expj.DM_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-DM_QTY\" class=\"expj-label\" data-name=\"DM_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getDM_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0020010-AE0020010detailview1-d3_STOCK_UNIT\" class=\"expj-label\" data-name=\"d3_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['18','").append(CoreTools.getRBString("Expj.ALCD_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-SUM_ALCD_QTY\" class=\"expj-label\" data-name=\"SUM_ALCD_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSUM_ALCD_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0020010-AE0020010detailview1-d4_STOCK_UNIT\" class=\"expj-label\" data-name=\"d4_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['19','").append(CoreTools.getRBString("Expj.ODR_STS_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-ODR_STS_TYP_DN\" class=\"expj-label\" data-name=\"ODR_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getODR_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['20','").append(CoreTools.getRBString("Expj.DM_STS_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-DM_STS_TYP_DN\" class=\"expj-label\" data-name=\"DM_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getDM_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AE0020010detailview1_Id;
 detailViewSelect = AE0020010detailview1_select;
 detailViewResize = AE0020010detailview1_resize;
 detailViewScroll = AE0020010detailview1_scroll;
 detailViewHeaderData = AE0020010detailview1_HB;
 detailViewBodyData = AE0020010detailview1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAE0020010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0020010)) {
  expj.common.treeInstanceMap.AE0020010 = {};
}
expj.common.treeInstanceMap.AE0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020010)) {
  expj.common.detailDialogMap.AE0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0020010)) {
  expj.common.viewInstanceMap.AE0020010 = {};
}
expj.common.viewInstanceMap.AE0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0020010.<%=viewId %>.init = function () {
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
    expj.AE0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0020010_init">
/**
 * AE0020010用のロード完了時初期化関数
 */
expj.AE0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0020010');
  expj.common.calendarInstanceMap.AE0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0020010.AE0020010detailview1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0020010', 'AE0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0020010', '<%=request.getContextPath() %>');
};

/**
 * AE0020010の全体onDecision処理
 */
expj.AE0020010.executeAllOnDecision = function () {
  expj.AE0020010.AE0020010detailview1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0020010_console">
expj.AE0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>