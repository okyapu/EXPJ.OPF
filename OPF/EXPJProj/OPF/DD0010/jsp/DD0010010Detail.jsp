<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:51:54 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DD0010\DD0010010Detail.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DD0010.*" %>
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
<jsp:useBean id="aDD0010010Control" class="com.nec.jp.orteus.metamorBase.DD0010.DD0010010Control" scope="request"/>
<jsp:useBean id="aDD0010010Struct" class="com.nec.jp.orteus.metamorBase.DD0010.DD0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
詳細
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0010/jsp/DD0010010Detail.jsp,v $
$Author: geng-jia $
$Revision: 1.8 $ $Date: 2017/02/22 02:06:47 $
********************************************************* --%>
<html>
<head>
<title>詳細</title>
<%@include file="common/expj_v5.jsp" %>
<script>
  var data = "<root>";
  
  function onInitializeOnLoad(){
    setDataGridDataParent("DD0010010",data + "</root>");
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
<script class="expj-script-DD0010010_init">
  // DD0010010名前空間
  expj.DD0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<script class="expj-script-DD0010010-DD0010010detail1">
expj.DD0010010.DD0010010detail1 = {};
expj.DD0010010.DD0010010detail1.executeAllOnDecision = function () {
  console.log('execute DD0010010detail1.onDecision');
};
expj.DD0010010.DD0010010detail1.executeOnLoad = function () {
  expj.DD0010010.DD0010010detail1.executePScriptOnLoad();
};

expj.DD0010010.DD0010010detail1.executePScriptOnLoad = function () {
  console.log('execute DD0010010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aDD0010010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-DD0010010-DD0010010detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "DD0010010detail1";
 detailFloat = "";
 detailWidth = 358;
 detailHeight = 323 + 47;
 String DD0010010detail1_Id = "DD0010010detail1";
 String DD0010010detail1_select = "single";
 String DD0010010detail1_sortable = "true";
 String DD0010010detail1_resize = "true";
 String DD0010010detail1_scroll = "true";
 StringBuffer DD0010010detail1_HB = new StringBuffer();
 StringBuffer DD0010010detail1_DB = new StringBuffer();
%>
<%
 DD0010010detail1_sortable = "false";
 DD0010010detail1_select = "none";
%>
<% DD0010010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(DD0010010detail1_sortable).append("}").append(","); %>
<%  DD0010010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(DD0010010detail1_sortable).append("}").append(",");
DD0010010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(DD0010010detail1_sortable).append("}").append(",");
DD0010010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(DD0010010detail1_sortable).append("}").append(",");
 %>
  <% DD0010010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_ITEM_CD\" class=\"expj-label\" data-name=\"d_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_ITEM_NAME\" class=\"expj-label\" data-name=\"d_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.PS_UNIT_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_PS_UNIT_QTY\" class=\"expj-label\" data-name=\"d_PS_UNIT_QTY\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_PS_UNIT_QTY())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.NECESSARY_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_NECESSARY_QTY\" class=\"expj-label\" data-name=\"d_NECESSARY_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_NECESSARY_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_STOCK_UNIT\" class=\"expj-label\" data-name=\"d_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_STOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.PS_INPUT_RATIO",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_PS_INPUT_RATIO\" class=\"expj-label\" data-name=\"d_PS_INPUT_RATIO\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_PS_INPUT_RATIO())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.ITEM_INPUT_RATIO",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_ITEM_INPUT_RATIO\" class=\"expj-label\" data-name=\"d_ITEM_INPUT_RATIO\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_ITEM_INPUT_RATIO())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.TOTAL_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_TOTAL_COST\" class=\"expj-label\" data-name=\"d_TOTAL_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_TOTAL_COST())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.OWN_MATR_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_OWN_MATR_COST\" class=\"expj-label\" data-name=\"d_OWN_MATR_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_OWN_MATR_COST())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d1_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d1_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.TOTAL_MATR_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_TOTAL_MATR_COST\" class=\"expj-label\" data-name=\"d_TOTAL_MATR_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_TOTAL_MATR_COST())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d2_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d2_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.OWN_SBCNT_MATR_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_OWN_SBCNT_MATR_COST\" class=\"expj-label\" data-name=\"d_OWN_SBCNT_MATR_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_OWN_SBCNT_MATR_COST())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d3_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d3_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.TOTAL_SBCNT_MATR_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_TOTAL_SBCNT_MATR_COST\" class=\"expj-label\" data-name=\"d_TOTAL_SBCNT_MATR_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_TOTAL_SBCNT_MATR_COST())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d4_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d4_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.OWN_PROC_COST_SUM_ALL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_OWN_PROC_COST_SUM_ALL\" class=\"expj-label\" data-name=\"d_OWN_PROC_COST_SUM_ALL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_OWN_PROC_COST_SUM_ALL())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d5_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d5_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.TOTAL_PROC_COST_SUM_ALL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_TOTAL_PROC_COST_SUM_ALL\" class=\"expj-label\" data-name=\"d_TOTAL_PROC_COST_SUM_ALL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_TOTAL_PROC_COST_SUM_ALL())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d6_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d6_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_MRP_ODR_TYP_DN\" class=\"expj-label\" data-name=\"d_MRP_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_MRP_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP_4",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_OUTSIDE_TYP_DN\" class=\"expj-label\" data-name=\"d_OUTSIDE_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_OUTSIDE_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP_6",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_PROC_OUTSIDE_TYP_DN\" class=\"expj-label\" data-name=\"d_PROC_OUTSIDE_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_PROC_OUTSIDE_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.CLASIFICATION_CD_1",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_CLASIFICATION_CD\" class=\"expj-label\" data-name=\"d_CLASIFICATION_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_CLASIFICATION_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.CS_PROC_CD",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_CS_PROC_CD\" class=\"expj-label\" data-name=\"d_CS_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_CS_PROC_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.CS_PROC_NAME",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_CS_PROC_NAME\" class=\"expj-label\" data-name=\"d_CS_PROC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_CS_PROC_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.COST_UP_TYP",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_COST_UP_TYP_DN\" class=\"expj-label\" data-name=\"d_COST_UP_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_COST_UP_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.VOLUNT_SPL_FLG",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_VOLUNT_SPL_FLG_DN\" class=\"expj-label\" data-name=\"d_VOLUNT_SPL_FLG_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_VOLUNT_SPL_FLG_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['22','").append(CoreTools.getRBString("Expj.ONEROUS_CONS_FLG",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_ONEROUS_CONS_FLG_DN\" class=\"expj-label\" data-name=\"d_ONEROUS_CONS_FLG_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_ONEROUS_CONS_FLG_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['23','").append(CoreTools.getRBString("Expj.PARENT_ITEM_CD",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_PARENT_ITEM_CD\" class=\"expj-label\" data-name=\"d_PARENT_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_PARENT_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['24','").append(CoreTools.getRBString("Expj.PARENT_ITEM_NAME",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_PARENT_ITEM_NAME\" class=\"expj-label\" data-name=\"d_PARENT_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_PARENT_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = DD0010010detail1_Id;
 detailViewSelect = DD0010010detail1_select;
 detailViewResize = DD0010010detail1_resize;
 detailViewScroll = DD0010010detail1_scroll;
 detailViewHeaderData = DD0010010detail1_HB;
 detailViewBodyData = DD0010010detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aDD0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DD0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DD0010010)) {
  expj.common.treeInstanceMap.DD0010010 = {};
}
expj.common.treeInstanceMap.DD0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DD0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DD0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DD0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DD0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DD0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DD0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DD0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DD0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DD0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DD0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0010010)) {
  expj.common.detailDialogMap.DD0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DD0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.DD0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DD0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DD0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DD0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DD0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DD0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DD0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DD0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DD0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DD0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DD0010010)) {
  expj.common.viewInstanceMap.DD0010010 = {};
}
expj.common.viewInstanceMap.DD0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.DD0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DD0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DD0010010.<%=viewId %>.init = function () {
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
    expj.DD0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DD0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DD0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DD0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DD0010010_init">
/**
 * DD0010010用のロード完了時初期化関数
 */
expj.DD0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DD0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DD0010010');
  expj.common.calendarInstanceMap.DD0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DD0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DD0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DD0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DD0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DD0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DD0010010-<%=detailId %>');
<%
 }
%>
  try{expj.DD0010010.DD0010010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DD0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DD0010010', 'DD0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DD0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DD0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.DD0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DD0010010', '<%=request.getContextPath() %>');
};

/**
 * DD0010010の全体onDecision処理
 */
expj.DD0010010.executeAllOnDecision = function () {
  expj.DD0010010.DD0010010detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-DD0010010_console">
expj.DD0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>