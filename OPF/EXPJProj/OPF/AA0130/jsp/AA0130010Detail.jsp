<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:23:50 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0130\AA0130010Detail.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0130.*" %>
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
<jsp:useBean id="aAA0130010Control" class="com.nec.jp.orteus.metamorBase.AA0130.AA0130010Control" scope="request"/>
<jsp:useBean id="aAA0130010Struct" class="com.nec.jp.orteus.metamorBase.AA0130.AA0130010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

?ڍ?
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0130/jsp/AA0130010Detail.jsp,v $
$Author: geng-jia $
$Revision: 1.15 $ $Date: 2017/02/22 02:04:02 $
********************************************************* --%>
<html>
<head>
<title>?ڍ?</title>
<%@include file="common/expj_v5.jsp" %>
<script>
	var data = "<root>";
	
	function onInitializeOnLoad(){
		setDataGridDataParent("AA0130010",data + "</root>");
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
<script class="expj-script-AA0130010_init">
  // AA0130010???O????
  expj.AA0130010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <script class="expj-script-AA0130010-AA0130010detailview1">
expj.AA0130010.AA0130010detailview1 = {};
expj.AA0130010.AA0130010detailview1.executeAllOnDecision = function () {
  console.log('execute AA0130010detailview1.onDecision');
};
expj.AA0130010.AA0130010detailview1.executeOnLoad = function () {
  expj.AA0130010.AA0130010detailview1.executePScriptOnLoad();
};

expj.AA0130010.AA0130010detailview1.executePScriptOnLoad = function () {
  console.log('execute AA0130010detailview1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAA0130010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AA0130010-AA0130010detailview1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AA0130010detailview1";
 detailFloat = "";
 detailWidth = 358;
 detailHeight = 363 + 47;
 String AA0130010detailview1_Id = "AA0130010detailview1";
 String AA0130010detailview1_select = "single";
 String AA0130010detailview1_sortable = "true";
 String AA0130010detailview1_resize = "true";
 String AA0130010detailview1_scroll = "true";
 StringBuffer AA0130010detailview1_HB = new StringBuffer();
 StringBuffer AA0130010detailview1_DB = new StringBuffer();
%>
<%
 AA0130010detailview1_sortable = "false";
 AA0130010detailview1_select = "none";
%>
<% AA0130010detailview1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AA0130010detailview1_sortable).append("}").append(","); %>
<%  AA0130010detailview1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AA0130010detailview1_sortable).append("}").append(",");
AA0130010detailview1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AA0130010detailview1_sortable).append("}").append(",");
AA0130010detailview1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AA0130010detailview1_sortable).append("}").append(",");
 %>
  <% AA0130010detailview1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-DetParent_ITEM_CD\" class=\"expj-label\" data-name=\"DetParent_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDetParent_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-DetParent_ITEM_NAME\" class=\"expj-label\" data-name=\"DetParent_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDetParent_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-DetParent_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"DetParent_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDetParent_MRP_ODR_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP_4",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-DetParent_OUTSIDE_TYP\" class=\"expj-label\" data-name=\"DetParent_OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDetParent_OUTSIDE_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['5','").append(CoreTools.getRBString("Expj.COMP_ITEM_CD_1",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-DetComp_ITEM_CD\" class=\"expj-label\" data-name=\"DetComp_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDetComp_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['6','").append(CoreTools.getRBString("Expj.ITEM_NAME_1",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-DetComp_ITEM_NAME\" class=\"expj-label\" data-name=\"DetComp_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDetComp_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['7','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP_1",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-DetComp_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"DetComp_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDetComp_MRP_ODR_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['8','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP_5",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-DetComp_OUTSIDE_TYP\" class=\"expj-label\" data-name=\"DetComp_OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDetComp_OUTSIDE_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['9','").append(CoreTools.getRBString("Expj.PS_EDITION",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_PS_EDITION\" class=\"expj-label\" data-name=\"Det_PS_EDITION\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_PS_EDITION())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['10','").append(CoreTools.getRBString("Expj.PS_UNIT_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_PS_UNIT_QTY\" class=\"expj-label\" data-name=\"Det_PS_UNIT_QTY\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_PS_UNIT_QTY())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['11','").append(CoreTools.getRBString("Expj.STOCK_UNIT",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_STOCK_UNIT\" class=\"expj-label\" data-name=\"Det_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_STOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['12','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"Det_EFF_PHASE_IN_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['13','").append(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_EFF_PHASE_OUT_DATE\" class=\"expj-label\" data-name=\"Det_EFF_PHASE_OUT_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_EFF_PHASE_OUT_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['14','").append(CoreTools.getRBString("Expj.PS_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_PS_SPOIL\" class=\"expj-label\" data-name=\"Det_PS_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_PS_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['15','").append(CoreTools.getRBString("Expj.CONS_TYP",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_CONS_TYP\" class=\"expj-label\" data-name=\"Det_CONS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_CONS_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['16','").append(CoreTools.getRBString("Expj.PS_LT_FLG",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_PS_LT_FLG\" class=\"expj-label\" data-name=\"Det_PS_LT_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_PS_LT_FLG())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['17','").append(CoreTools.getRBString("Expj.PS_FIXED_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_PS_FIXED_LT\" class=\"expj-label\" data-name=\"Det_PS_FIXED_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_PS_FIXED_LT())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['18','").append(CoreTools.getRBString("Expj.PS_PROP_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_PS_PROP_LT\" class=\"expj-label\" data-name=\"Det_PS_PROP_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_PS_PROP_LT())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['19','").append(CoreTools.getRBString("Expj.PS_PROP_LOT_SIZE",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_PS_PROP_LOT_SIZE\" class=\"expj-label\" data-name=\"Det_PS_PROP_LOT_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_PS_PROP_LOT_SIZE())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['20','").append(CoreTools.getRBString("Expj.PS_REF_NO",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_PS_REF_NO\" class=\"expj-label\" data-name=\"Det_PS_REF_NO\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_PS_REF_NO())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['21','").append(CoreTools.getRBString("Expj.COST_UP_TYP_2",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_COST_UP_TYP\" class=\"expj-label\" data-name=\"Det_COST_UP_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_COST_UP_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['22','").append(CoreTools.getRBString("Expj.MRP_EXP_TYP_2",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_MRP_EXP_TYP\" class=\"expj-label\" data-name=\"Det_MRP_EXP_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_MRP_EXP_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0130010detailview1_DB.append("['23','").append(CoreTools.getRBString("Expj.MANHOUR_TYP_1",rb)).append("','").append("<span id=\"expj-AA0130010-AA0130010detailview1-Det_MANHOUR_TYP\" class=\"expj-label\" data-name=\"Det_MANHOUR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0130010Struct.getDet_MANHOUR_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AA0130010detailview1_Id;
 detailViewSelect = AA0130010detailview1_select;
 detailViewResize = AA0130010detailview1_resize;
 detailViewScroll = AA0130010detailview1_scroll;
 detailViewHeaderData = AA0130010detailview1_HB;
 detailViewBodyData = AA0130010detailview1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAA0130010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS?錾
 if (treeId != null) {
%>
<script class="expj-script-AA0130010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0130010)) {
  expj.common.treeInstanceMap.AA0130010 = {};
}
expj.common.treeInstanceMap.AA0130010.<%=treeId %> = {};
// TREE?̃C???X?^???X???ۑ??????ϐ?
expj.common.treeInstanceMap.AA0130010.<%=treeId %>.treeInstance = null;
// ?I?𒆂?Node???ۑ??????ϐ?
expj.common.treeInstanceMap.AA0130010.<%=treeId %>.gPrevSelectedNode = null;
// ?R???e?L?X?g???j???[?̃C???X?^???X???ۑ??????ϐ?
expj.common.treeInstanceMap.AA0130010.<%=treeId %>.contextData = null;
// ?c???[?̃m?[?h???I?????ꂽ???ɏ??????????֐?
expj.common.treeInstanceMap.AA0130010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0130010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0130010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0130010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0130010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0130010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js?錾
 if (detailId != null) {
%>
<script class="expj-script-AA0130010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130010)) {
  expj.common.detailDialogMap.AA0130010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0130010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0130010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0130010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0130010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)??VIEW?{?f?B?f?[?^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)??VIEW?w?b?_?[?f?[?^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0130010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)??VIEW????
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0130010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // ?ڍ׃E?B???h?E?̏?????
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0130010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0130010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0130010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0130010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS?錾(END)

//VIEW JS?錾
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-AA0130010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0130010)) {
  expj.common.viewInstanceMap.AA0130010 = {};
}
expj.common.viewInstanceMap.AA0130010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0130010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0130010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0130010.<%=viewId %>.init = function () {
  // DataGrid(VIEW)?̃{?f?B?f?[?^
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)?̃w?b?_?[?f?[?^
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
    expj.AA0130010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0130010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0130010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0130010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0130010_init">
/**
 * AA0130010?p?̃??[?h?????????????֐?
 */
expj.AA0130010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0130010');
  //?{?^???Ȃ??{?^???s?G???A?폜????
  expj.common.arrangeDatagridButtonArea('AA0130010');
  expj.common.calendarInstanceMap.AA0130010 = {};
<%
 if (treeId != null) {
%>
  // TREE?̏?????
  expj.common.treeInstanceMap.AA0130010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)?p?̏?????
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)?̏?????
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0130010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0130010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0130010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0130010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0130010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0130010.AA0130010detailview1.executeOnLoad();}catch(e){};
  // ?R???\?[???o??
  expj.AA0130010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0130010', 'AA0130010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0130010');  
  // ?L?[?ɂ????t?H?[?J?X?ړ??ݒ?
  expj.common.ui.setupFocusMove('.AA0130010-focus-move');
  // ?????t?H?[?J?X???Ă鏈??
  $('.AA0130010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ?t?@?C???_?E?????[?h????
  expj.common.executeFileDownLoad('AA0130010', '<%=request.getContextPath() %>');
};

/**
 * AA0130010?̑S??onDecision????
 */
expj.AA0130010.executeAllOnDecision = function () {
  expj.AA0130010.AA0130010detailview1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0130010_console">
expj.AA0130010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // ?R???\?[???o??
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>