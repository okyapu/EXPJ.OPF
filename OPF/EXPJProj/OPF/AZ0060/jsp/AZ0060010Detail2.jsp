<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 13 16:29:53 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0060\AZ0060010Detail2.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AZ0060.*" %>
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
<jsp:useBean id="aAZ0060010Control" class="com.nec.jp.orteus.metamorBase.AZ0060.AZ0060010Control" scope="request"/>
<jsp:useBean id="aAZ0060010Struct" class="com.nec.jp.orteus.metamorBase.AZ0060.AZ0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
詳細
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0060/jsp/AZ0060010Detail2.jsp,v $
$Author: geng-jia $
$Revision: 1.8 $ $Date: 2017/02/22 01:42:14 $
********************************************************* --%>
<html>
<head>
<title>詳細2(JF)</title>
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
<script class="expj-script-AZ0060010_init">
  // AZ0060010名前空間
  expj.AZ0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>


<!-- 品目メンテナンスJF -->
<%
if("AA2010010Servlet".equals(aAZ0060010Control.getScreen_url())){
%>
<body>
<script class="expj-script-AZ0060010-AZ0060010Detail1">
expj.AZ0060010.AZ0060010Detail1 = {};
expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1.onDecision');
};
expj.AZ0060010.AZ0060010Detail1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAZ0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AZ0060010-AZ0060010Detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AZ0060010Detail1";
 detailFloat = "";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String AZ0060010Detail1_Id = "AZ0060010Detail1";
 String AZ0060010Detail1_select = "single";
 String AZ0060010Detail1_sortable = "true";
 String AZ0060010Detail1_resize = "true";
 String AZ0060010Detail1_scroll = "true";
 StringBuffer AZ0060010Detail1_HB = new StringBuffer();
 StringBuffer AZ0060010Detail1_DB = new StringBuffer();
%>
<%
 AZ0060010Detail1_sortable = "false";
 AZ0060010Detail1_select = "none";
%>
<% AZ0060010Detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AZ0060010Detail1_sortable).append("}").append(","); %>
<%  AZ0060010Detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
 %>
  <% AZ0060010Detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ITEM_CD\" class=\"expj-label\" data-name=\"d_OLD_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ITEM_CD\" class=\"expj-label\" data-name=\"d_NEW_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ITEM_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ITEM_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ITEM_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ITEM_NAME\" class=\"expj-label\" data-name=\"d_OLD_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ITEM_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ITEM_NAME\" class=\"expj-label\" data-name=\"d_NEW_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ITEM_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ITEM_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_ITEM_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ITEM_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DRAW_CD\" class=\"expj-label\" data-name=\"d_OLD_DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DRAW_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DRAW_CD\" class=\"expj-label\" data-name=\"d_NEW_DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DRAW_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DRAW_CD_CHANGE\" class=\"expj-label\" data-name=\"d_DRAW_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DRAW_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.HIGH_LEVEL_NO",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_HIGH_LEVEL_NO\" class=\"expj-label\" data-name=\"d_OLD_HIGH_LEVEL_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_HIGH_LEVEL_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_HIGH_LEVEL_NO\" class=\"expj-label\" data-name=\"d_NEW_HIGH_LEVEL_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_HIGH_LEVEL_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_HIGH_LEVEL_NO_CHANGE\" class=\"expj-label\" data-name=\"d_HIGH_LEVEL_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_HIGH_LEVEL_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SPEC\" class=\"expj-label\" data-name=\"d_OLD_SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SPEC())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SPEC\" class=\"expj-label\" data-name=\"d_NEW_SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SPEC())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SPEC_CHANGE\" class=\"expj-label\" data-name=\"d_SPEC_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SPEC_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.ISSUE_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ISSUE_TYP\" class=\"expj-label\" data-name=\"d_OLD_ISSUE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ISSUE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ISSUE_TYP\" class=\"expj-label\" data-name=\"d_NEW_ISSUE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ISSUE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ISSUE_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_ISSUE_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ISSUE_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_QTY_TYP\" class=\"expj-label\" data-name=\"d_OLD_UNIT_QTY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_QTY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_QTY_TYP\" class=\"expj-label\" data-name=\"d_NEW_UNIT_QTY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_QTY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_QTY_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_QTY_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_QTY_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OUTSIDE_TYP\" class=\"expj-label\" data-name=\"d_OLD_OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OUTSIDE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OUTSIDE_TYP\" class=\"expj-label\" data-name=\"d_NEW_OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OUTSIDE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OUTSIDE_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_OUTSIDE_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OUTSIDE_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACPT_INSPC_TYP\" class=\"expj-label\" data-name=\"d_OLD_ACPT_INSPC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACPT_INSPC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACPT_INSPC_TYP\" class=\"expj-label\" data-name=\"d_NEW_ACPT_INSPC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACPT_INSPC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACPT_INSPC_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_ACPT_INSPC_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACPT_INSPC_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.STOCK_UNIT_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_STOCK_UNIT_FLG\" class=\"expj-label\" data-name=\"d_OLD_STOCK_UNIT_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_STOCK_UNIT_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_STOCK_UNIT_FLG\" class=\"expj-label\" data-name=\"d_NEW_STOCK_UNIT_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_STOCK_UNIT_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_STOCK_UNIT_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_STOCK_UNIT_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_STOCK_UNIT_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.PRODUCT_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PRODUCT_TYP\" class=\"expj-label\" data-name=\"d_OLD_PRODUCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PRODUCT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PRODUCT_TYP\" class=\"expj-label\" data-name=\"d_NEW_PRODUCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PRODUCT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PRODUCT_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_PRODUCT_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PRODUCT_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.STOCK_UNIT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_STOCK_UNIT\" class=\"expj-label\" data-name=\"d_OLD_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_STOCK_UNIT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_STOCK_UNIT\" class=\"expj-label\" data-name=\"d_NEW_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_STOCK_UNIT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_STOCK_UNIT_CHANGE\" class=\"expj-label\" data-name=\"d_STOCK_UNIT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_STOCK_UNIT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.ABC_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ABC_TYP\" class=\"expj-label\" data-name=\"d_OLD_ABC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ABC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ABC_TYP\" class=\"expj-label\" data-name=\"d_NEW_ABC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ABC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ABC_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_ABC_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ABC_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OPR_RSLT_TYP\" class=\"expj-label\" data-name=\"d_OLD_OPR_RSLT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OPR_RSLT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OPR_RSLT_TYP\" class=\"expj-label\" data-name=\"d_NEW_OPR_RSLT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OPR_RSLT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OPR_RSLT_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_OPR_RSLT_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OPR_RSLT_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.SPL_ITEM_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SPL_ITEM_TYP\" class=\"expj-label\" data-name=\"d_OLD_SPL_ITEM_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SPL_ITEM_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SPL_ITEM_TYP\" class=\"expj-label\" data-name=\"d_NEW_SPL_ITEM_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SPL_ITEM_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SPL_ITEM_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_SPL_ITEM_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SPL_ITEM_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.ODR_LT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ODR_LT\" class=\"expj-label\" data-name=\"d_OLD_ODR_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ODR_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ODR_LT\" class=\"expj-label\" data-name=\"d_NEW_ODR_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ODR_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ODR_LT_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ODR_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.ISSUE_LT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ISSUE_LT\" class=\"expj-label\" data-name=\"d_OLD_ISSUE_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ISSUE_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ISSUE_LT\" class=\"expj-label\" data-name=\"d_NEW_ISSUE_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ISSUE_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ISSUE_LT_CHANGE\" class=\"expj-label\" data-name=\"d_ISSUE_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ISSUE_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.FIXED_LT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FIXED_LT\" class=\"expj-label\" data-name=\"d_OLD_FIXED_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FIXED_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FIXED_LT\" class=\"expj-label\" data-name=\"d_NEW_FIXED_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FIXED_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FIXED_LT_CHANGE\" class=\"expj-label\" data-name=\"d_FIXED_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FIXED_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.PROP_LOT_SIZE",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PROP_LOT_SIZE\" class=\"expj-label\" data-name=\"d_OLD_PROP_LOT_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PROP_LOT_SIZE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PROP_LOT_SIZE\" class=\"expj-label\" data-name=\"d_NEW_PROP_LOT_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PROP_LOT_SIZE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PROP_LOT_SIZE_CHANGE\" class=\"expj-label\" data-name=\"d_PROP_LOT_SIZE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PROP_LOT_SIZE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.PROP_LT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PROP_LT\" class=\"expj-label\" data-name=\"d_OLD_PROP_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PROP_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PROP_LT\" class=\"expj-label\" data-name=\"d_NEW_PROP_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PROP_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PROP_LT_CHANGE\" class=\"expj-label\" data-name=\"d_PROP_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PROP_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['22','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ITEM_SPOIL\" class=\"expj-label\" data-name=\"d_OLD_ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ITEM_SPOIL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ITEM_SPOIL\" class=\"expj-label\" data-name=\"d_NEW_ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ITEM_SPOIL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ITEM_SPOIL_CHANGE\" class=\"expj-label\" data-name=\"d_ITEM_SPOIL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ITEM_SPOIL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['23','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"d_OLD_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MRP_ODR_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"d_NEW_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MRP_ODR_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MRP_ODR_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_MRP_ODR_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MRP_ODR_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['24','").append(CoreTools.getRBString("Expj.MPS_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MPS_FLG\" class=\"expj-label\" data-name=\"d_OLD_MPS_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MPS_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MPS_FLG\" class=\"expj-label\" data-name=\"d_NEW_MPS_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MPS_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MPS_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_MPS_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MPS_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['25','").append(CoreTools.getRBString("Expj.LOT_SIZING_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_LOT_SIZING_TYP\" class=\"expj-label\" data-name=\"d_OLD_LOT_SIZING_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_LOT_SIZING_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_LOT_SIZING_TYP\" class=\"expj-label\" data-name=\"d_NEW_LOT_SIZING_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_LOT_SIZING_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_LOT_SIZING_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_LOT_SIZING_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_LOT_SIZING_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['26','").append(CoreTools.getRBString("Expj.MAX_PERIOD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MAX_PERIOD\" class=\"expj-label\" data-name=\"d_OLD_MAX_PERIOD\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_P;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MAX_PERIOD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MAX_PERIOD\" class=\"expj-label\" data-name=\"d_NEW_MAX_PERIOD\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_P;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MAX_PERIOD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MAX_PERIOD_CHANGE\" class=\"expj-label\" data-name=\"d_MAX_PERIOD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MAX_PERIOD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['27','").append(CoreTools.getRBString("Expj.MUL_ODR_QTY",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MUL_ODR_QTY\" class=\"expj-label\" data-name=\"d_OLD_MUL_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MUL_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MUL_ODR_QTY\" class=\"expj-label\" data-name=\"d_NEW_MUL_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MUL_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MUL_ODR_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_MUL_ODR_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MUL_ODR_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['28','").append(CoreTools.getRBString("Expj.Cmt4088",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PATTERN_CD\" class=\"expj-label\" data-name=\"d_OLD_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PATTERN_CD\" class=\"expj-label\" data-name=\"d_NEW_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PATTERN_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PATTERN_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PATTERN_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['29','").append(CoreTools.getRBString("Expj.SET_LT_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SET_LT\" class=\"expj-label\" data-name=\"d_OLD_SET_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SET_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SET_LT\" class=\"expj-label\" data-name=\"d_NEW_SET_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SET_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SET_LT_CHANGE\" class=\"expj-label\" data-name=\"d_SET_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SET_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['30','").append(CoreTools.getRBString("Expj.UNIT_WEIGHT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_WEIGHT\" class=\"expj-label\" data-name=\"d_OLD_UNIT_WEIGHT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_WEIGHT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_WEIGHT\" class=\"expj-label\" data-name=\"d_NEW_UNIT_WEIGHT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_WEIGHT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_WEIGHT_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_WEIGHT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_WEIGHT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['31','").append(CoreTools.getRBString("Expj.CLASIFICATION_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CLASIFICATION_CD\" class=\"expj-label\" data-name=\"d_OLD_CLASIFICATION_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CLASIFICATION_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CLASIFICATION_CD\" class=\"expj-label\" data-name=\"d_NEW_CLASIFICATION_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CLASIFICATION_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CLASIFICATION_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CLASIFICATION_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CLASIFICATION_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['32','").append(CoreTools.getRBString("Expj.JANCODE",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_JANCODE\" class=\"expj-label\" data-name=\"d_OLD_JANCODE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_JANCODE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_JANCODE\" class=\"expj-label\" data-name=\"d_NEW_JANCODE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_JANCODE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_JANCODE_CHANGE\" class=\"expj-label\" data-name=\"d_JANCODE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_JANCODE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['33','").append(CoreTools.getRBString("Expj.TAX_CD_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CD_1\" class=\"expj-label\" data-name=\"d_OLD_TAX_CD_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CD_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CD_1\" class=\"expj-label\" data-name=\"d_NEW_TAX_CD_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CD_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CD_1_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CD_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CD_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['34','").append(CoreTools.getRBString("Expj.CAL_NO",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CAL_NO\" class=\"expj-label\" data-name=\"d_OLD_CAL_NO\" data-detailItem=\"true\" data-kind=\"OBT_N\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CAL_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CAL_NO\" class=\"expj-label\" data-name=\"d_NEW_CAL_NO\" data-detailItem=\"true\" data-kind=\"OBT_N\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CAL_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CAL_NO_CHANGE\" class=\"expj-label\" data-name=\"d_CAL_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CAL_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['35','").append(CoreTools.getRBString("Expj.SAFETY_LT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SAFETY_LT\" class=\"expj-label\" data-name=\"d_OLD_SAFETY_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SAFETY_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SAFETY_LT\" class=\"expj-label\" data-name=\"d_NEW_SAFETY_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SAFETY_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SAFETY_LT_CHANGE\" class=\"expj-label\" data-name=\"d_SAFETY_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SAFETY_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['36','").append(CoreTools.getRBString("Expj.SAFETY_STOCK",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SAFETY_STOCK\" class=\"expj-label\" data-name=\"d_OLD_SAFETY_STOCK\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SAFETY_STOCK())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SAFETY_STOCK\" class=\"expj-label\" data-name=\"d_NEW_SAFETY_STOCK\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SAFETY_STOCK())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SAFETY_STOCK_CHANGE\" class=\"expj-label\" data-name=\"d_SAFETY_STOCK_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SAFETY_STOCK_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['37','").append(CoreTools.getRBString("Expj.ODR_POINT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ODR_POINT\" class=\"expj-label\" data-name=\"d_OLD_ODR_POINT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ODR_POINT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ODR_POINT\" class=\"expj-label\" data-name=\"d_NEW_ODR_POINT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ODR_POINT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ODR_POINT_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_POINT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ODR_POINT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['38','").append(CoreTools.getRBString("Expj.Cmt4090",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MAX_STOCK_QTY\" class=\"expj-label\" data-name=\"d_OLD_MAX_STOCK_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MAX_STOCK_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MAX_STOCK_QTY\" class=\"expj-label\" data-name=\"d_NEW_MAX_STOCK_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MAX_STOCK_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MAX_STOCK_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_MAX_STOCK_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MAX_STOCK_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['39','").append(CoreTools.getRBString("Expj.MAX_ODR_QTY",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MAX_ODR_QTY\" class=\"expj-label\" data-name=\"d_OLD_MAX_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MAX_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MAX_ODR_QTY\" class=\"expj-label\" data-name=\"d_NEW_MAX_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MAX_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MAX_ODR_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_MAX_ODR_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MAX_ODR_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['40','").append(CoreTools.getRBString("Expj.MIN_ODR_QTY",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MIN_ODR_QTY\" class=\"expj-label\" data-name=\"d_OLD_MIN_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MIN_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MIN_ODR_QTY\" class=\"expj-label\" data-name=\"d_NEW_MIN_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MIN_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MIN_ODR_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_MIN_ODR_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MIN_ODR_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['41','").append(CoreTools.getRBString("Expj.Cmt4091",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DEPO_TYP\" class=\"expj-label\" data-name=\"d_OLD_DEPO_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DEPO_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DEPO_TYP\" class=\"expj-label\" data-name=\"d_NEW_DEPO_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DEPO_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DEPO_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_DEPO_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DEPO_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['42','").append(CoreTools.getRBString("Expj.FIXED_ODR_QTY",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FIXED_ODR_QTY\" class=\"expj-label\" data-name=\"d_OLD_FIXED_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FIXED_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FIXED_ODR_QTY\" class=\"expj-label\" data-name=\"d_NEW_FIXED_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FIXED_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FIXED_ODR_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_FIXED_ODR_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FIXED_ODR_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['43','").append(CoreTools.getRBString("Expj.STOCK_STATUS",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_STOCK_STATUS\" class=\"expj-label\" data-name=\"d_OLD_STOCK_STATUS\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_STOCK_STATUS())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_STOCK_STATUS\" class=\"expj-label\" data-name=\"d_NEW_STOCK_STATUS\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_STOCK_STATUS())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_STOCK_STATUS_CHANGE\" class=\"expj-label\" data-name=\"d_STOCK_STATUS_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_STOCK_STATUS_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['44','").append(CoreTools.getRBString("Expj.LOT_CTRL_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_LOT_CTRL_FLG\" class=\"expj-label\" data-name=\"d_OLD_LOT_CTRL_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_LOT_CTRL_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_LOT_CTRL_FLG\" class=\"expj-label\" data-name=\"d_NEW_LOT_CTRL_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_LOT_CTRL_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_LOT_CTRL_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_LOT_CTRL_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_LOT_CTRL_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['45','").append(CoreTools.getRBString("Expj.Cmt4092",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_LOT_NUMBERING_TYP\" class=\"expj-label\" data-name=\"d_OLD_LOT_NUMBERING_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_LOT_NUMBERING_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_LOT_NUMBERING_TYP\" class=\"expj-label\" data-name=\"d_NEW_LOT_NUMBERING_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_LOT_NUMBERING_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_LOT_NUMBERING_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_LOT_NUMBERING_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_LOT_NUMBERING_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['46','").append(CoreTools.getRBString("Expj.Cmt4093",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BEST_BEFORE_YEAR\" class=\"expj-label\" data-name=\"d_OLD_BEST_BEFORE_YEAR\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BEST_BEFORE_YEAR())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BEST_BEFORE_YEAR\" class=\"expj-label\" data-name=\"d_NEW_BEST_BEFORE_YEAR\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BEST_BEFORE_YEAR())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BEST_BEFORE_YEAR_CHANGE\" class=\"expj-label\" data-name=\"d_BEST_BEFORE_YEAR_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BEST_BEFORE_YEAR_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['47','").append(CoreTools.getRBString("Expj.Cmt4094",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BEST_BEFORE_MONTH\" class=\"expj-label\" data-name=\"d_OLD_BEST_BEFORE_MONTH\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BEST_BEFORE_MONTH())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BEST_BEFORE_MONTH\" class=\"expj-label\" data-name=\"d_NEW_BEST_BEFORE_MONTH\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BEST_BEFORE_MONTH())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BEST_BEFORE_MONTH_CHANGE\" class=\"expj-label\" data-name=\"d_BEST_BEFORE_MONTH_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BEST_BEFORE_MONTH_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['48','").append(CoreTools.getRBString("Expj.Cmt4095",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BEST_BEFORE_DAY\" class=\"expj-label\" data-name=\"d_OLD_BEST_BEFORE_DAY\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BEST_BEFORE_DAY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BEST_BEFORE_DAY\" class=\"expj-label\" data-name=\"d_NEW_BEST_BEFORE_DAY\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BEST_BEFORE_DAY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BEST_BEFORE_DAY_CHANGE\" class=\"expj-label\" data-name=\"d_BEST_BEFORE_DAY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BEST_BEFORE_DAY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['49','").append(CoreTools.getRBString("Expj.Cmt4096",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SHIP_DEADLINE_YEAR\" class=\"expj-label\" data-name=\"d_OLD_SHIP_DEADLINE_YEAR\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SHIP_DEADLINE_YEAR())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SHIP_DEADLINE_YEAR\" class=\"expj-label\" data-name=\"d_NEW_SHIP_DEADLINE_YEAR\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SHIP_DEADLINE_YEAR())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SHIP_DEADLINE_YEAR_CHANGE\" class=\"expj-label\" data-name=\"d_SHIP_DEADLINE_YEAR_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SHIP_DEADLINE_YEAR_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['50','").append(CoreTools.getRBString("Expj.Cmt4097",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SHIP_DEADLINE_MONTH\" class=\"expj-label\" data-name=\"d_OLD_SHIP_DEADLINE_MONTH\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SHIP_DEADLINE_MONTH())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SHIP_DEADLINE_MONTH\" class=\"expj-label\" data-name=\"d_NEW_SHIP_DEADLINE_MONTH\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SHIP_DEADLINE_MONTH())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SHIP_DEADLINE_MONTH_CHANGE\" class=\"expj-label\" data-name=\"d_SHIP_DEADLINE_MONTH_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SHIP_DEADLINE_MONTH_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['51','").append(CoreTools.getRBString("Expj.Cmt4098",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SHIP_DEADLINE_DAY\" class=\"expj-label\" data-name=\"d_OLD_SHIP_DEADLINE_DAY\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SHIP_DEADLINE_DAY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SHIP_DEADLINE_DAY\" class=\"expj-label\" data-name=\"d_NEW_SHIP_DEADLINE_DAY\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SHIP_DEADLINE_DAY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SHIP_DEADLINE_DAY_CHANGE\" class=\"expj-label\" data-name=\"d_SHIP_DEADLINE_DAY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SHIP_DEADLINE_DAY_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AZ0060010Detail1_Id;
 detailViewSelect = AZ0060010Detail1_select;
 detailViewResize = AZ0060010Detail1_resize;
 detailViewScroll = AZ0060010Detail1_scroll;
 detailViewHeaderData = AZ0060010Detail1_HB;
 detailViewBodyData = AZ0060010Detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAZ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010)) {
  expj.common.detailDialogMap.AZ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
    expj.AZ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0060010_init">
/**
 * AZ0060010用のロード完了時初期化関数
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0060010.AZ0060010Detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010の全体onDecision処理
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- 取引先支払条件メンテナンスJF--><%
if("CA2040010Servlet".equals(aAZ0060010Control.getScreen_url())){
%><body><script class="expj-script-AZ0060010-AZ0060010Detail1">
expj.AZ0060010.AZ0060010Detail1 = {};
expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1.onDecision');
};
expj.AZ0060010.AZ0060010Detail1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAZ0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AZ0060010-AZ0060010Detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AZ0060010Detail1";
 detailFloat = "";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String AZ0060010Detail1_Id = "AZ0060010Detail1";
 String AZ0060010Detail1_select = "single";
 String AZ0060010Detail1_sortable = "true";
 String AZ0060010Detail1_resize = "true";
 String AZ0060010Detail1_scroll = "true";
 StringBuffer AZ0060010Detail1_HB = new StringBuffer();
 StringBuffer AZ0060010Detail1_DB = new StringBuffer();
%>
<%
 AZ0060010Detail1_sortable = "false";
 AZ0060010Detail1_select = "none";
%>
<% AZ0060010Detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AZ0060010Detail1_sortable).append("}").append(","); %>
<%  AZ0060010Detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
 %>
  <% AZ0060010Detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['2','").append("取引先コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("科目コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("補助区分コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SUB_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_SUB_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SUB_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("支払パターンコード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_PATTERN_CD\" class=\"expj-label\" data-name=\"d_OLD_PAY_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_PATTERN_CD\" class=\"expj-label\" data-name=\"d_NEW_PAY_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_PATTERN_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_PATTERN_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_PATTERN_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("条件区分").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_ODR_TYP\" class=\"expj-label\" data-name=\"d_OLD_PAY_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_ODR_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_ODR_TYP\" class=\"expj-label\" data-name=\"d_NEW_PAY_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_ODR_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_ODR_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_ODR_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_ODR_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("端数処理区分").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ROUND_TYP\" class=\"expj-label\" data-name=\"d_OLD_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ROUND_TYP\" class=\"expj-label\" data-name=\"d_NEW_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ROUND_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_ROUND_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ROUND_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("支払方法コード１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_METHOD_CD_1\" class=\"expj-label\" data-name=\"d_OLD_PAY_METHOD_CD_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_METHOD_CD_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_METHOD_CD_1\" class=\"expj-label\" data-name=\"d_NEW_PAY_METHOD_CD_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_METHOD_CD_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_METHOD_CD_1_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_METHOD_CD_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_METHOD_CD_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("支払対象区分１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_TARGET_NAME_1\" class=\"expj-label\" data-name=\"d_OLD_PAY_TARGET_NAME_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_TARGET_NAME_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_TARGET_NAME_1\" class=\"expj-label\" data-name=\"d_NEW_PAY_TARGET_NAME_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_TARGET_NAME_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_TARGET_NAME_1_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_TARGET_NAME_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_TARGET_NAME_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("支払方法名１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_METHOD_1\" class=\"expj-label\" data-name=\"d_OLD_PAY_METHOD_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_METHOD_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_METHOD_1\" class=\"expj-label\" data-name=\"d_NEW_PAY_METHOD_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_METHOD_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_METHOD_1_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_METHOD_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_METHOD_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("支払方法コード２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_METHOD_CD_2\" class=\"expj-label\" data-name=\"d_OLD_PAY_METHOD_CD_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_METHOD_CD_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_METHOD_CD_2\" class=\"expj-label\" data-name=\"d_NEW_PAY_METHOD_CD_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_METHOD_CD_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_METHOD_CD_2_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_METHOD_CD_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_METHOD_CD_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append("支払対象区分２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_TARGET_NAME_2\" class=\"expj-label\" data-name=\"d_OLD_PAY_TARGET_NAME_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_TARGET_NAME_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_TARGET_NAME_2\" class=\"expj-label\" data-name=\"d_NEW_PAY_TARGET_NAME_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_TARGET_NAME_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_TARGET_NAME_2_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_TARGET_NAME_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_TARGET_NAME_2_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AZ0060010Detail1_Id;
 detailViewSelect = AZ0060010Detail1_select;
 detailViewResize = AZ0060010Detail1_resize;
 detailViewScroll = AZ0060010Detail1_scroll;
 detailViewHeaderData = AZ0060010Detail1_HB;
 detailViewBodyData = AZ0060010Detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAZ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010)) {
  expj.common.detailDialogMap.AZ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
    expj.AZ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0060010_init">
/**
 * AZ0060010用のロード完了時初期化関数
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0060010.AZ0060010Detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010の全体onDecision処理
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- 在庫状態メンテナンスJF--><%
if("AA2340010Servlet".equals(aAZ0060010Control.getScreen_url())){
%><body><script class="expj-script-AZ0060010-AZ0060010Detail1">
expj.AZ0060010.AZ0060010Detail1 = {};
expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1.onDecision');
};
expj.AZ0060010.AZ0060010Detail1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAZ0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AZ0060010-AZ0060010Detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AZ0060010Detail1";
 detailFloat = "";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String AZ0060010Detail1_Id = "AZ0060010Detail1";
 String AZ0060010Detail1_select = "single";
 String AZ0060010Detail1_sortable = "true";
 String AZ0060010Detail1_resize = "true";
 String AZ0060010Detail1_scroll = "true";
 StringBuffer AZ0060010Detail1_HB = new StringBuffer();
 StringBuffer AZ0060010Detail1_DB = new StringBuffer();
%>
<%
 AZ0060010Detail1_sortable = "false";
 AZ0060010Detail1_select = "none";
%>
<% AZ0060010Detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AZ0060010Detail1_sortable).append("}").append(","); %>
<%  AZ0060010Detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
 %>
  <% AZ0060010Detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['2','").append("在庫状態").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_STOCK_STATUS\" class=\"expj-label\" data-name=\"d_OLD_STOCK_STATUS\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_STOCK_STATUS())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_STOCK_STATUS\" class=\"expj-label\" data-name=\"d_NEW_STOCK_STATUS\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_STOCK_STATUS())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_STOCK_STATUS_CHANGE\" class=\"expj-label\" data-name=\"d_STOCK_STATUS_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_STOCK_STATUS_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("在庫状態名称").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_STOCK_STATUS_NAME\" class=\"expj-label\" data-name=\"d_OLD_STOCK_STATUS_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_STOCK_STATUS_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_STOCK_STATUS_NAME\" class=\"expj-label\" data-name=\"d_NEW_STOCK_STATUS_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_STOCK_STATUS_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_STOCK_STATUS_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_STOCK_STATUS_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_STOCK_STATUS_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("在庫状態タイプ").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_STOCK_TYP\" class=\"expj-label\" data-name=\"d_OLD_STOCK_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_STOCK_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_STOCK_TYP\" class=\"expj-label\" data-name=\"d_NEW_STOCK_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_STOCK_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_STOCK_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_STOCK_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_STOCK_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("有効在庫区分").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EFF_STOCK_TYP\" class=\"expj-label\" data-name=\"d_OLD_EFF_STOCK_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EFF_STOCK_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EFF_STOCK_TYP\" class=\"expj-label\" data-name=\"d_NEW_EFF_STOCK_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EFF_STOCK_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EFF_STOCK_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_EFF_STOCK_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EFF_STOCK_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("出荷区分").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SHIP_TYP\" class=\"expj-label\" data-name=\"d_OLD_SHIP_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SHIP_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SHIP_TYP\" class=\"expj-label\" data-name=\"d_NEW_SHIP_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SHIP_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SHIP_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_SHIP_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SHIP_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("在庫状態優先順位").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REF_NO\" class=\"expj-label\" data-name=\"d_OLD_REF_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REF_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REF_NO\" class=\"expj-label\" data-name=\"d_NEW_REF_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REF_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REF_NO_CHANGE\" class=\"expj-label\" data-name=\"d_REF_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REF_NO_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AZ0060010Detail1_Id;
 detailViewSelect = AZ0060010Detail1_select;
 detailViewResize = AZ0060010Detail1_resize;
 detailViewScroll = AZ0060010Detail1_scroll;
 detailViewHeaderData = AZ0060010Detail1_HB;
 detailViewBodyData = AZ0060010Detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAZ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010)) {
  expj.common.detailDialogMap.AZ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
    expj.AZ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0060010_init">
/**
 * AZ0060010用のロード完了時初期化関数
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0060010.AZ0060010Detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010の全体onDecision処理
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- 取引先メンテナンスJF--><%
if("CA2020010Servlet".equals(aAZ0060010Control.getScreen_url())){
%><body><script class="expj-script-AZ0060010-AZ0060010Detail1">
expj.AZ0060010.AZ0060010Detail1 = {};
expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1.onDecision');
};
expj.AZ0060010.AZ0060010Detail1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAZ0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AZ0060010-AZ0060010Detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AZ0060010Detail1";
 detailFloat = "";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String AZ0060010Detail1_Id = "AZ0060010Detail1";
 String AZ0060010Detail1_select = "single";
 String AZ0060010Detail1_sortable = "true";
 String AZ0060010Detail1_resize = "true";
 String AZ0060010Detail1_scroll = "true";
 StringBuffer AZ0060010Detail1_HB = new StringBuffer();
 StringBuffer AZ0060010Detail1_DB = new StringBuffer();
%>
<%
 AZ0060010Detail1_sortable = "false";
 AZ0060010Detail1_select = "none";
%>
<% AZ0060010Detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AZ0060010Detail1_sortable).append("}").append(","); %>
<%  AZ0060010Detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
 %>
  <% AZ0060010Detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['2','").append("取引先コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("取引先正式名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_NAME\" class=\"expj-label\" data-name=\"d_OLD_VEND_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_NAME\" class=\"expj-label\" data-name=\"d_NEW_VEND_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("取引先名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_ANAME\" class=\"expj-label\" data-name=\"d_OLD_VEND_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_ANAME\" class=\"expj-label\" data-name=\"d_NEW_VEND_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_ANAME_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_ANAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_ANAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("取引先カナ名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_KNAME\" class=\"expj-label\" data-name=\"d_OLD_VEND_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_KNAME\" class=\"expj-label\" data-name=\"d_NEW_VEND_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("郵便番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ZIP_CD\" class=\"expj-label\" data-name=\"d_OLD_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ZIP_CD\" class=\"expj-label\" data-name=\"d_NEW_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ZIP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ZIP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ZIP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("住所１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("住所２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("住所（カナ）１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("住所（カナ）２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("電話番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TEL\" class=\"expj-label\" data-name=\"d_OLD_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TEL\" class=\"expj-label\" data-name=\"d_NEW_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TEL_CHANGE\" class=\"expj-label\" data-name=\"d_TEL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TEL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append("ＦＡＸ番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FAX\" class=\"expj-label\" data-name=\"d_OLD_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FAX\" class=\"expj-label\" data-name=\"d_NEW_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FAX_CHANGE\" class=\"expj-label\" data-name=\"d_FAX_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FAX_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append("相手先担当部門").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_ORG\" class=\"expj-label\" data-name=\"d_OLD_VEND_ORG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_ORG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_ORG\" class=\"expj-label\" data-name=\"d_NEW_VEND_ORG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_ORG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_ORG_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_ORG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_ORG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append("相手先担当者").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_PERSON\" class=\"expj-label\" data-name=\"d_OLD_VEND_PERSON\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_PERSON())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_PERSON\" class=\"expj-label\" data-name=\"d_NEW_VEND_PERSON\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_PERSON())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_PERSON_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_PERSON_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_PERSON_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append("自社担当部門コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append("自社担当者コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_PERSON_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_PERSON_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_PERSON_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append("備考").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_REM\" class=\"expj-label\" data-name=\"d_OLD_VEND_REM\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_REM())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_REM\" class=\"expj-label\" data-name=\"d_NEW_VEND_REM\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_REM())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_REM_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_REM_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_REM_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AZ0060010Detail1_Id;
 detailViewSelect = AZ0060010Detail1_select;
 detailViewResize = AZ0060010Detail1_resize;
 detailViewScroll = AZ0060010Detail1_scroll;
 detailViewHeaderData = AZ0060010Detail1_HB;
 detailViewBodyData = AZ0060010Detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAZ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010)) {
  expj.common.detailDialogMap.AZ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
    expj.AZ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0060010_init">
/**
 * AZ0060010用のロード完了時初期化関数
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0060010.AZ0060010Detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010の全体onDecision処理
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- 得意先組合せメンテナンスJF--><%
if("KA2130010Servlet".equals(aAZ0060010Control.getScreen_url())){
%><body><script class="expj-script-AZ0060010-AZ0060010Detail1">
expj.AZ0060010.AZ0060010Detail1 = {};
expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1.onDecision');
};
expj.AZ0060010.AZ0060010Detail1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAZ0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AZ0060010-AZ0060010Detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AZ0060010Detail1";
 detailFloat = "";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String AZ0060010Detail1_Id = "AZ0060010Detail1";
 String AZ0060010Detail1_select = "single";
 String AZ0060010Detail1_sortable = "true";
 String AZ0060010Detail1_resize = "true";
 String AZ0060010Detail1_scroll = "true";
 StringBuffer AZ0060010Detail1_HB = new StringBuffer();
 StringBuffer AZ0060010Detail1_DB = new StringBuffer();
%>
<%
 AZ0060010Detail1_sortable = "false";
 AZ0060010Detail1_select = "none";
%>
<% AZ0060010Detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AZ0060010Detail1_sortable).append("}").append(","); %>
<%  AZ0060010Detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
 %>
  <% AZ0060010Detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.DLV_LOC_CD_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DELIVERY_CD\" class=\"expj-label\" data-name=\"d_OLD_DELIVERY_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DELIVERY_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DELIVERY_CD\" class=\"expj-label\" data-name=\"d_NEW_DELIVERY_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DELIVERY_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DELIVERY_CD_CHANGE\" class=\"expj-label\" data-name=\"d_DELIVERY_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DELIVERY_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.BALA_ACCO_PATTERN_NO",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BALA_ACCO_PATTERN_CD\" class=\"expj-label\" data-name=\"d_OLD_BALA_ACCO_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BALA_ACCO_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BALA_ACCO_PATTERN_CD\" class=\"expj-label\" data-name=\"d_NEW_BALA_ACCO_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BALA_ACCO_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BALA_ACCO_PATTERN_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BALA_ACCO_PATTERN_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BALA_ACCO_PATTERN_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.CUST_PRIORITY_REF_NO",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_PRIORITY_REF_NO\" class=\"expj-label\" data-name=\"d_OLD_CUST_PRIORITY_REF_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_PRIORITY_REF_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_PRIORITY_REF_NO\" class=\"expj-label\" data-name=\"d_NEW_CUST_PRIORITY_REF_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_PRIORITY_REF_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_PRIORITY_REF_NO_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_PRIORITY_REF_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_PRIORITY_REF_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.BALA_ACCO_PATTERN_PRIORITY_REF_NO",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO\" class=\"expj-label\" data-name=\"d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO\" class=\"expj-label\" data-name=\"d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE\" class=\"expj-label\" data-name=\"d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.BALA_ACCO_CD_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BALA_ACCO_CD_1\" class=\"expj-label\" data-name=\"d_OLD_BALA_ACCO_CD_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BALA_ACCO_CD_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BALA_ACCO_CD_1\" class=\"expj-label\" data-name=\"d_NEW_BALA_ACCO_CD_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BALA_ACCO_CD_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BALA_ACCO_CD_1_CHANGE\" class=\"expj-label\" data-name=\"d_BALA_ACCO_CD_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BALA_ACCO_CD_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.BALA_ACCO_CD_2",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BALA_ACCO_CD_2\" class=\"expj-label\" data-name=\"d_OLD_BALA_ACCO_CD_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BALA_ACCO_CD_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BALA_ACCO_CD_2\" class=\"expj-label\" data-name=\"d_NEW_BALA_ACCO_CD_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BALA_ACCO_CD_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BALA_ACCO_CD_2_CHANGE\" class=\"expj-label\" data-name=\"d_BALA_ACCO_CD_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BALA_ACCO_CD_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.BALA_ACCO_CD_3",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BALA_ACCO_CD_3\" class=\"expj-label\" data-name=\"d_OLD_BALA_ACCO_CD_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BALA_ACCO_CD_3())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BALA_ACCO_CD_3\" class=\"expj-label\" data-name=\"d_NEW_BALA_ACCO_CD_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BALA_ACCO_CD_3())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BALA_ACCO_CD_3_CHANGE\" class=\"expj-label\" data-name=\"d_BALA_ACCO_CD_3_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BALA_ACCO_CD_3_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AZ0060010Detail1_Id;
 detailViewSelect = AZ0060010Detail1_select;
 detailViewResize = AZ0060010Detail1_resize;
 detailViewScroll = AZ0060010Detail1_scroll;
 detailViewHeaderData = AZ0060010Detail1_HB;
 detailViewBodyData = AZ0060010Detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAZ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010)) {
  expj.common.detailDialogMap.AZ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
    expj.AZ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0060010_init">
/**
 * AZ0060010用のロード完了時初期化関数
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0060010.AZ0060010Detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010の全体onDecision処理
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- 請求条件メンテナンスJF--><%
if("BA2020010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CUST_STL_CTRL".equals(aAZ0060010Control.getTable_name())){
%><body><script class="expj-script-AZ0060010-AZ0060010Detail1">
expj.AZ0060010.AZ0060010Detail1 = {};
expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1.onDecision');
};
expj.AZ0060010.AZ0060010Detail1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAZ0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AZ0060010-AZ0060010Detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AZ0060010Detail1";
 detailFloat = "";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String AZ0060010Detail1_Id = "AZ0060010Detail1";
 String AZ0060010Detail1_select = "single";
 String AZ0060010Detail1_sortable = "true";
 String AZ0060010Detail1_resize = "true";
 String AZ0060010Detail1_scroll = "true";
 StringBuffer AZ0060010Detail1_HB = new StringBuffer();
 StringBuffer AZ0060010Detail1_DB = new StringBuffer();
%>
<%
 AZ0060010Detail1_sortable = "false";
 AZ0060010Detail1_select = "none";
%>
<% AZ0060010Detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AZ0060010Detail1_sortable).append("}").append(","); %>
<%  AZ0060010Detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
 %>
  <% AZ0060010Detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.BILL_ADDRESSEE_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BILL_ADDRESSEE_CD\" class=\"expj-label\" data-name=\"d_OLD_BILL_ADDRESSEE_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BILL_ADDRESSEE_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BILL_ADDRESSEE_CD\" class=\"expj-label\" data-name=\"d_NEW_BILL_ADDRESSEE_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BILL_ADDRESSEE_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BILL_ADDRESSEE_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BILL_ADDRESSEE_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BILL_ADDRESSEE_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("決済条件コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_STL_COND_CD\" class=\"expj-label\" data-name=\"d_OLD_STL_COND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_STL_COND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_STL_COND_CD\" class=\"expj-label\" data-name=\"d_NEW_STL_COND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_STL_COND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_STL_COND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_STL_COND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_STL_COND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("請求部門コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CLAIM_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_CLAIM_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CLAIM_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CLAIM_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_CLAIM_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CLAIM_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CLAIM_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CLAIM_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CLAIM_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("EDI取引区分(請求)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EDI_TRN_BILL_TYP\" class=\"expj-label\" data-name=\"d_OLD_EDI_TRN_BILL_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EDI_TRN_BILL_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EDI_TRN_BILL_TYP\" class=\"expj-label\" data-name=\"d_NEW_EDI_TRN_BILL_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EDI_TRN_BILL_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EDI_TRN_BILL_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_EDI_TRN_BILL_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EDI_TRN_BILL_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("EDI取引区分(入金)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EDI_TRN_RM_TYP\" class=\"expj-label\" data-name=\"d_OLD_EDI_TRN_RM_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EDI_TRN_RM_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EDI_TRN_RM_TYP\" class=\"expj-label\" data-name=\"d_NEW_EDI_TRN_RM_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EDI_TRN_RM_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EDI_TRN_RM_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_EDI_TRN_RM_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EDI_TRN_RM_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("請求残高管理フラグ").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BILL_BALANCE_CTRL_FLG\" class=\"expj-label\" data-name=\"d_OLD_BILL_BALANCE_CTRL_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BILL_BALANCE_CTRL_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BILL_BALANCE_CTRL_FLG\" class=\"expj-label\" data-name=\"d_NEW_BILL_BALANCE_CTRL_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BILL_BALANCE_CTRL_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BILL_BALANCE_CTRL_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_BILL_BALANCE_CTRL_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BILL_BALANCE_CTRL_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("売掛金残高管理フラグ").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_AR_BALANCE_CTRL_FLG\" class=\"expj-label\" data-name=\"d_OLD_AR_BALANCE_CTRL_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_AR_BALANCE_CTRL_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_AR_BALANCE_CTRL_FLG\" class=\"expj-label\" data-name=\"d_NEW_AR_BALANCE_CTRL_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_AR_BALANCE_CTRL_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_AR_BALANCE_CTRL_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_AR_BALANCE_CTRL_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_AR_BALANCE_CTRL_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("回収条件基準金額").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_COLLECTION_STD_AMOUNT\" class=\"expj-label\" data-name=\"d_OLD_COLLECTION_STD_AMOUNT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_COLLECTION_STD_AMOUNT())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_COLLECTION_STD_AMOUNT\" class=\"expj-label\" data-name=\"d_NEW_COLLECTION_STD_AMOUNT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_COLLECTION_STD_AMOUNT())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_COLLECTION_STD_AMOUNT_CHANGE\" class=\"expj-label\" data-name=\"d_COLLECTION_STD_AMOUNT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_COLLECTION_STD_AMOUNT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("入金相殺区分").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_RM_OFFSET_TYP\" class=\"expj-label\" data-name=\"d_OLD_RM_OFFSET_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_RM_OFFSET_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_RM_OFFSET_TYP\" class=\"expj-label\" data-name=\"d_NEW_RM_OFFSET_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_RM_OFFSET_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_RM_OFFSET_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_RM_OFFSET_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_RM_OFFSET_TYP_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AZ0060010Detail1_Id;
 detailViewSelect = AZ0060010Detail1_select;
 detailViewResize = AZ0060010Detail1_resize;
 detailViewScroll = AZ0060010Detail1_scroll;
 detailViewHeaderData = AZ0060010Detail1_HB;
 detailViewBodyData = AZ0060010Detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAZ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010)) {
  expj.common.detailDialogMap.AZ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
    expj.AZ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0060010_init">
/**
 * AZ0060010用のロード完了時初期化関数
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0060010.AZ0060010Detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010の全体onDecision処理
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- 請求条件メンテナンスJF--><%
if("BA2020010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CLAIM_CUST_CTRL".equals(aAZ0060010Control.getTable_name())){
%><body><script class="expj-script-AZ0060010-AZ0060010Detail1">
expj.AZ0060010.AZ0060010Detail1 = {};
expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1.onDecision');
};
expj.AZ0060010.AZ0060010Detail1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAZ0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AZ0060010-AZ0060010Detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AZ0060010Detail1";
 detailFloat = "";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String AZ0060010Detail1_Id = "AZ0060010Detail1";
 String AZ0060010Detail1_select = "single";
 String AZ0060010Detail1_sortable = "true";
 String AZ0060010Detail1_resize = "true";
 String AZ0060010Detail1_scroll = "true";
 StringBuffer AZ0060010Detail1_HB = new StringBuffer();
 StringBuffer AZ0060010Detail1_DB = new StringBuffer();
%>
<%
 AZ0060010Detail1_sortable = "false";
 AZ0060010Detail1_select = "none";
%>
<% AZ0060010Detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AZ0060010Detail1_sortable).append("}").append(","); %>
<%  AZ0060010Detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
 %>
  <% AZ0060010Detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.BILL_ADDRESSEE_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BILL_ADDRESSEE_CD\" class=\"expj-label\" data-name=\"d_OLD_BILL_ADDRESSEE_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BILL_ADDRESSEE_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BILL_ADDRESSEE_CD\" class=\"expj-label\" data-name=\"d_NEW_BILL_ADDRESSEE_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BILL_ADDRESSEE_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BILL_ADDRESSEE_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BILL_ADDRESSEE_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BILL_ADDRESSEE_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("決済条件コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_STL_COND_CD\" class=\"expj-label\" data-name=\"d_OLD_STL_COND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_STL_COND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_STL_COND_CD\" class=\"expj-label\" data-name=\"d_NEW_STL_COND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_STL_COND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_STL_COND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_STL_COND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_STL_COND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("得意先コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_LINE_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_LINE_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_LINE_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_LINE_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_LINE_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_LINE_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_LINE_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_LINE_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_LINE_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AZ0060010Detail1_Id;
 detailViewSelect = AZ0060010Detail1_select;
 detailViewResize = AZ0060010Detail1_resize;
 detailViewScroll = AZ0060010Detail1_scroll;
 detailViewHeaderData = AZ0060010Detail1_HB;
 detailViewBodyData = AZ0060010Detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAZ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010)) {
  expj.common.detailDialogMap.AZ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
    expj.AZ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0060010_init">
/**
 * AZ0060010用のロード完了時初期化関数
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0060010.AZ0060010Detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010の全体onDecision処理
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- 得意先メンテナンス(売掛) メイン画面表示する項目--><%
if("BA2050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CUST".equals(aAZ0060010Control.getTable_name())){
%><body><script class="expj-script-AZ0060010-AZ0060010Detail1">
expj.AZ0060010.AZ0060010Detail1 = {};
expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1.onDecision');
};
expj.AZ0060010.AZ0060010Detail1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAZ0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AZ0060010-AZ0060010Detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AZ0060010Detail1";
 detailFloat = "";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String AZ0060010Detail1_Id = "AZ0060010Detail1";
 String AZ0060010Detail1_select = "single";
 String AZ0060010Detail1_sortable = "true";
 String AZ0060010Detail1_resize = "true";
 String AZ0060010Detail1_scroll = "true";
 StringBuffer AZ0060010Detail1_HB = new StringBuffer();
 StringBuffer AZ0060010Detail1_DB = new StringBuffer();
%>
<%
 AZ0060010Detail1_sortable = "false";
 AZ0060010Detail1_select = "none";
%>
<% AZ0060010Detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AZ0060010Detail1_sortable).append("}").append(","); %>
<%  AZ0060010Detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
 %>
  <% AZ0060010Detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['2','").append("得意先コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("得意先正式名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_FNAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_FNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_FNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_FNAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_FNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_FNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_FNAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_FNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_FNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("得意先名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_NAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_NAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("得意先カナ名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_KNAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_KNAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("得意先英名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_ENAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_ENAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_ENAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_ENAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_ENAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_ENAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_ENAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("得意先略称").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_ANAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_ANAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_ANAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_ANAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_ANAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("代表者役職名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWNER_EXECUTIVE\" class=\"expj-label\" data-name=\"d_OLD_OWNER_EXECUTIVE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWNER_EXECUTIVE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWNER_EXECUTIVE\" class=\"expj-label\" data-name=\"d_NEW_OWNER_EXECUTIVE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWNER_EXECUTIVE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWNER_EXECUTIVE_CHANGE\" class=\"expj-label\" data-name=\"d_OWNER_EXECUTIVE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWNER_EXECUTIVE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("代表者名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWNER_NAME\" class=\"expj-label\" data-name=\"d_OLD_OWNER_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWNER_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWNER_NAME\" class=\"expj-label\" data-name=\"d_NEW_OWNER_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWNER_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWNER_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_OWNER_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWNER_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("請求先フラグ").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BILL_ADDRESSEE_FLG\" class=\"expj-label\" data-name=\"d_OLD_BILL_ADDRESSEE_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BILL_ADDRESSEE_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BILL_ADDRESSEE_FLG\" class=\"expj-label\" data-name=\"d_NEW_BILL_ADDRESSEE_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BILL_ADDRESSEE_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BILL_ADDRESSEE_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_BILL_ADDRESSEE_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BILL_ADDRESSEE_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("入金先フラグ").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_RM_FLG\" class=\"expj-label\" data-name=\"d_OLD_RM_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_RM_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_RM_FLG\" class=\"expj-label\" data-name=\"d_NEW_RM_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_RM_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_RM_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_RM_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_RM_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append("請求サイクル").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CLAIM_CYCLE_TYP\" class=\"expj-label\" data-name=\"d_OLD_CLAIM_CYCLE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CLAIM_CYCLE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CLAIM_CYCLE_TYP\" class=\"expj-label\" data-name=\"d_NEW_CLAIM_CYCLE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CLAIM_CYCLE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CLAIM_CYCLE_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_CLAIM_CYCLE_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CLAIM_CYCLE_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append("仮単価売上計上フラグ").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TEMP_UNIT_PRICE_SALES_FLG\" class=\"expj-label\" data-name=\"d_OLD_TEMP_UNIT_PRICE_SALES_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TEMP_UNIT_PRICE_SALES_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TEMP_UNIT_PRICE_SALES_FLG\" class=\"expj-label\" data-name=\"d_NEW_TEMP_UNIT_PRICE_SALES_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TEMP_UNIT_PRICE_SALES_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TEMP_UNIT_PRICE_SALES_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append("入金入力区分").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_RM_INP_TYP\" class=\"expj-label\" data-name=\"d_OLD_RM_INP_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_RM_INP_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_RM_INP_TYP\" class=\"expj-label\" data-name=\"d_NEW_RM_INP_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_RM_INP_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_RM_INP_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_RM_INP_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_RM_INP_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append("取引停止フラグ").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TRN_STOP_FLG\" class=\"expj-label\" data-name=\"d_OLD_TRN_STOP_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TRN_STOP_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TRN_STOP_FLG\" class=\"expj-label\" data-name=\"d_NEW_TRN_STOP_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TRN_STOP_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TRN_STOP_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_TRN_STOP_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TRN_STOP_FLG_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AZ0060010Detail1_Id;
 detailViewSelect = AZ0060010Detail1_select;
 detailViewResize = AZ0060010Detail1_resize;
 detailViewScroll = AZ0060010Detail1_scroll;
 detailViewHeaderData = AZ0060010Detail1_HB;
 detailViewBodyData = AZ0060010Detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAZ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010)) {
  expj.common.detailDialogMap.AZ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
    expj.AZ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0060010_init">
/**
 * AZ0060010用のロード完了時初期化関数
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0060010.AZ0060010Detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010の全体onDecision処理
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- 得意先メンテナンス(売掛) サッブ画面表示する項目--><%
if("BA2050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CUST_BRANCH".equals(aAZ0060010Control.getTable_name())){
%><body><script class="expj-script-AZ0060010-AZ0060010Detail1">
expj.AZ0060010.AZ0060010Detail1 = {};
expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1.onDecision');
};
expj.AZ0060010.AZ0060010Detail1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAZ0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AZ0060010-AZ0060010Detail1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AZ0060010Detail1";
 detailFloat = "";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String AZ0060010Detail1_Id = "AZ0060010Detail1";
 String AZ0060010Detail1_select = "single";
 String AZ0060010Detail1_sortable = "true";
 String AZ0060010Detail1_resize = "true";
 String AZ0060010Detail1_scroll = "true";
 StringBuffer AZ0060010Detail1_HB = new StringBuffer();
 StringBuffer AZ0060010Detail1_DB = new StringBuffer();
%>
<%
 AZ0060010Detail1_sortable = "false";
 AZ0060010Detail1_select = "none";
%>
<% AZ0060010Detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AZ0060010Detail1_sortable).append("}").append(","); %>
<%  AZ0060010Detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
 %>
  <% AZ0060010Detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['2','").append("得意先コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("支店コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BRANCH_CD\" class=\"expj-label\" data-name=\"d_OLD_BRANCH_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BRANCH_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BRANCH_CD\" class=\"expj-label\" data-name=\"d_NEW_BRANCH_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BRANCH_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BRANCH_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BRANCH_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BRANCH_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("支店正式名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BRANCH_FNAME\" class=\"expj-label\" data-name=\"d_OLD_BRANCH_FNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BRANCH_FNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BRANCH_FNAME\" class=\"expj-label\" data-name=\"d_NEW_BRANCH_FNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BRANCH_FNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BRANCH_FNAME_CHANGE\" class=\"expj-label\" data-name=\"d_BRANCH_FNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BRANCH_FNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("支店名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BRANCH_NAME\" class=\"expj-label\" data-name=\"d_OLD_BRANCH_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BRANCH_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BRANCH_NAME\" class=\"expj-label\" data-name=\"d_NEW_BRANCH_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BRANCH_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BRANCH_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_BRANCH_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BRANCH_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("支店名(カナ)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BRANCH_KNAME\" class=\"expj-label\" data-name=\"d_OLD_BRANCH_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BRANCH_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BRANCH_KNAME\" class=\"expj-label\" data-name=\"d_NEW_BRANCH_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BRANCH_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BRANCH_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_BRANCH_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BRANCH_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("支店名(英名)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BRANCH_ENAME\" class=\"expj-label\" data-name=\"d_OLD_BRANCH_ENAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BRANCH_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BRANCH_ENAME\" class=\"expj-label\" data-name=\"d_NEW_BRANCH_ENAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BRANCH_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BRANCH_ENAME_CHANGE\" class=\"expj-label\" data-name=\"d_BRANCH_ENAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BRANCH_ENAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("支店昇順").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BRANCH_SEQ_CD\" class=\"expj-label\" data-name=\"d_OLD_BRANCH_SEQ_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BRANCH_SEQ_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BRANCH_SEQ_CD\" class=\"expj-label\" data-name=\"d_NEW_BRANCH_SEQ_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BRANCH_SEQ_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BRANCH_SEQ_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BRANCH_SEQ_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BRANCH_SEQ_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("担当者所属部門名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CHARGE_ORG_NAME\" class=\"expj-label\" data-name=\"d_OLD_CHARGE_ORG_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CHARGE_ORG_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CHARGE_ORG_NAME\" class=\"expj-label\" data-name=\"d_NEW_CHARGE_ORG_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CHARGE_ORG_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CHARGE_ORG_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_CHARGE_ORG_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CHARGE_ORG_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("担当者名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CHARGE_PERSON_NAME\" class=\"expj-label\" data-name=\"d_OLD_CHARGE_PERSON_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CHARGE_PERSON_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CHARGE_PERSON_NAME\" class=\"expj-label\" data-name=\"d_NEW_CHARGE_PERSON_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CHARGE_PERSON_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CHARGE_PERSON_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_CHARGE_PERSON_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CHARGE_PERSON_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("郵便番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ZIP_CD\" class=\"expj-label\" data-name=\"d_OLD_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ZIP_CD\" class=\"expj-label\" data-name=\"d_NEW_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ZIP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ZIP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ZIP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append("住所１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append("住所２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append("住所(カナ)１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append("住所(カナ)２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append("電話番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TEL\" class=\"expj-label\" data-name=\"d_OLD_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TEL\" class=\"expj-label\" data-name=\"d_NEW_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TEL_CHANGE\" class=\"expj-label\" data-name=\"d_TEL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TEL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append("ＦＡＸ番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FAX\" class=\"expj-label\" data-name=\"d_OLD_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FAX\" class=\"expj-label\" data-name=\"d_NEW_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FAX_CHANGE\" class=\"expj-label\" data-name=\"d_FAX_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FAX_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['18','").append("ＥＤＩ相手取引先コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EDI_CUST_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_EDI_CUST_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EDI_CUST_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EDI_CUST_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_EDI_CUST_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EDI_CUST_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EDI_CUST_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_EDI_CUST_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EDI_CUST_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['19','").append("ＥＤＩ自社取引先コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EDI_OWN_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_EDI_OWN_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EDI_OWN_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EDI_OWN_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_EDI_OWN_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EDI_OWN_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EDI_OWN_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_EDI_OWN_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EDI_OWN_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['20','").append("備考１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REMARKS_1\" class=\"expj-label\" data-name=\"d_OLD_REMARKS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REMARKS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REMARKS_1\" class=\"expj-label\" data-name=\"d_NEW_REMARKS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REMARKS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REMARKS_1_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REMARKS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['21','").append("備考２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REMARKS_2\" class=\"expj-label\" data-name=\"d_OLD_REMARKS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REMARKS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REMARKS_2\" class=\"expj-label\" data-name=\"d_NEW_REMARKS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REMARKS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REMARKS_2_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REMARKS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['22','").append("備考３").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REMARKS_3\" class=\"expj-label\" data-name=\"d_OLD_REMARKS_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REMARKS_3())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REMARKS_3\" class=\"expj-label\" data-name=\"d_NEW_REMARKS_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REMARKS_3())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REMARKS_3_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_3_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REMARKS_3_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AZ0060010Detail1_Id;
 detailViewSelect = AZ0060010Detail1_select;
 detailViewResize = AZ0060010Detail1_resize;
 detailViewScroll = AZ0060010Detail1_scroll;
 detailViewHeaderData = AZ0060010Detail1_HB;
 detailViewBodyData = AZ0060010Detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAZ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010)) {
  expj.common.detailDialogMap.AZ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
    expj.AZ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0060010_init">
/**
 * AZ0060010用のロード完了時初期化関数
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0060010.AZ0060010Detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010の全体onDecision処理
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%></html>