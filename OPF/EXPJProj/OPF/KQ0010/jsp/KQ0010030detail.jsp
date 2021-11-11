<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:59:42 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KQ0010\KQ0010030detail.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KQ0010.*" %>
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
<jsp:useBean id="aKQ0010030Control" class="com.nec.jp.orteus.metamorBase.KQ0010.KQ0010030Control" scope="request"/>
<jsp:useBean id="aKQ0010030Struct" class="com.nec.jp.orteus.metamorBase.KQ0010.KQ0010030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

明細
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/jsp/KQ0010030detail.jsp,v $
$Author: geng-jia $	
$Revision: 1.11 $　$Date: 2017/02/22 02:07:12 $
********************************************************* --%>
<html>
<head>
<title>明細</title>
<%@include file="common/expj_v5.jsp" %>
<script>
  var data = "<root>";

  function onInitializeOnLoad(){
	setDataGridDataParent("KQ0010030",data + "</root>");
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
<script class="expj-script-KQ0010030_init">
  // KQ0010030名前空間
  expj.KQ0010030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <script class="expj-script-KQ0010030-KQ0010030detail1">
expj.KQ0010030.KQ0010030detail1 = {};
expj.KQ0010030.KQ0010030detail1.executeAllOnDecision = function () {
  console.log('execute KQ0010030detail1.onDecision');
};
expj.KQ0010030.KQ0010030detail1.executeOnLoad = function () {
  expj.KQ0010030.KQ0010030detail1.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030detail1.executePScriptOnLoad = function () {
  console.log('execute KQ0010030detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aKQ0010030Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-KQ0010030-KQ0010030detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "KQ0010030detail1";
 detailFloat = "";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String KQ0010030detail1_Id = "KQ0010030detail1";
 String KQ0010030detail1_select = "single";
 String KQ0010030detail1_sortable = "true";
 String KQ0010030detail1_resize = "true";
 String KQ0010030detail1_scroll = "true";
 StringBuffer KQ0010030detail1_HB = new StringBuffer();
 StringBuffer KQ0010030detail1_DB = new StringBuffer();
%>
<%
 KQ0010030detail1_sortable = "false";
 KQ0010030detail1_select = "none";
%>
<% KQ0010030detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(KQ0010030detail1_sortable).append("}").append(","); %>
<%  KQ0010030detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(KQ0010030detail1_sortable).append("}").append(",");
KQ0010030detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(KQ0010030detail1_sortable).append("}").append(",");
KQ0010030detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(KQ0010030detail1_sortable).append("}").append(",");
KQ0010030detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(KQ0010030detail1_sortable).append("}").append(",");
 %>
  <% KQ0010030detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_ODR_NO\" class=\"expj-label\" data-name=\"d_OLD_ODR_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_ODR_NO())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_ODR_NO\" class=\"expj-label\" data-name=\"d_NEW_ODR_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_ODR_NO())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_ODR_NO_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_ODR_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.ODR_TYP",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_ODR_TYP\" class=\"expj-label\" data-name=\"d_OLD_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_ODR_TYP())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_ODR_TYP\" class=\"expj-label\" data-name=\"d_NEW_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_ODR_TYP())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_ODR_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_ODR_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.CUST_ODR_NO",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_CUST_ODR_NO\" class=\"expj-label\" data-name=\"d_OLD_CUST_ODR_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_CUST_ODR_NO())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_CUST_ODR_NO\" class=\"expj-label\" data-name=\"d_NEW_CUST_ODR_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_CUST_ODR_NO())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_CUST_ODR_NO_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_ODR_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_CUST_ODR_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_CUST_ITEM_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_CUST_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_CUST_ITEM_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_CUST_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_CUST_ITEM_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_ITEM_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_CUST_ITEM_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.DLV_LOC_CD",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_OLD_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_NEW_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_DLV_LOC_CD_CHANGE\" class=\"expj-label\" data-name=\"d_DLV_LOC_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_DLV_LOC_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.ODR_QTY_4",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_ODR_QTY\" class=\"expj-label\" data-name=\"d_OLD_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_ODR_QTY\" class=\"expj-label\" data-name=\"d_NEW_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_ODR_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_ODR_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_DESINATED_DLV_DATE\" class=\"expj-label\" data-name=\"d_OLD_DESINATED_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_DESINATED_DLV_DATE())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_DESINATED_DLV_DATE\" class=\"expj-label\" data-name=\"d_NEW_DESINATED_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_DESINATED_DLV_DATE())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_DESINATED_DLV_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_DESINATED_DLV_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_DESINATED_DLV_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.SPCL_PRICE_CO",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_SPCL_PRICE_TYP\" class=\"expj-label\" data-name=\"d_OLD_SPCL_PRICE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_SPCL_PRICE_TYP())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_SPCL_PRICE_TYP\" class=\"expj-label\" data-name=\"d_NEW_SPCL_PRICE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_SPCL_PRICE_TYP())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_SPCL_PRICE_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_SPCL_PRICE_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_SPCL_PRICE_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_ODR_UNIT_PRICE\" class=\"expj-label\" data-name=\"d_OLD_ODR_UNIT_PRICE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_ODR_UNIT_PRICE())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_ODR_UNIT_PRICE\" class=\"expj-label\" data-name=\"d_NEW_ODR_UNIT_PRICE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_ODR_UNIT_PRICE())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_ODR_UNIT_PRICE_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_UNIT_PRICE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_ODR_UNIT_PRICE_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.SHIP_REMARK",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_REMARKS\" class=\"expj-label\" data-name=\"d_OLD_REMARKS\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_REMARKS())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_REMARKS\" class=\"expj-label\" data-name=\"d_NEW_REMARKS\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_REMARKS())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_REMARKS_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_REMARKS_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = KQ0010030detail1_Id;
 detailViewSelect = KQ0010030detail1_select;
 detailViewResize = KQ0010030detail1_resize;
 detailViewScroll = KQ0010030detail1_scroll;
 detailViewHeaderData = KQ0010030detail1_HB;
 detailViewBodyData = KQ0010030detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aKQ0010030Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KQ0010030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KQ0010030)) {
  expj.common.treeInstanceMap.KQ0010030 = {};
}
expj.common.treeInstanceMap.KQ0010030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KQ0010030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KQ0010030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KQ0010030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KQ0010030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010030)) {
  expj.common.detailDialogMap.KQ0010030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KQ0010030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010030.<%=detailId %>)) {
  expj.common.detailDialogMap.KQ0010030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KQ0010030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KQ0010030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KQ0010030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KQ0010030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KQ0010030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KQ0010030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KQ0010030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KQ0010030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KQ0010030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KQ0010030)) {
  expj.common.viewInstanceMap.KQ0010030 = {};
}
expj.common.viewInstanceMap.KQ0010030.<%=viewId %> = {};
expj.common.viewInstanceMap.KQ0010030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KQ0010030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KQ0010030.<%=viewId %>.init = function () {
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
    expj.KQ0010030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KQ0010030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KQ0010030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KQ0010030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KQ0010030_init">
/**
 * KQ0010030用のロード完了時初期化関数
 */
expj.KQ0010030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KQ0010030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KQ0010030');
  expj.common.calendarInstanceMap.KQ0010030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.init();
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KQ0010030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KQ0010030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KQ0010030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KQ0010030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KQ0010030-<%=detailId %>');
<%
 }
%>
  try{expj.KQ0010030.KQ0010030detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KQ0010030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KQ0010030', 'KQ0010030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KQ0010030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KQ0010030-focus-move');
  // 初期フォーカス当てる処理
  $('.KQ0010030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KQ0010030', '<%=request.getContextPath() %>');
};

/**
 * KQ0010030の全体onDecision処理
 */
expj.KQ0010030.executeAllOnDecision = function () {
  expj.KQ0010030.KQ0010030detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-KQ0010030_console">
expj.KQ0010030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>