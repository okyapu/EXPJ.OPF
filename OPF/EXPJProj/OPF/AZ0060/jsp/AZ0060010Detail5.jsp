<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 13 16:30:01 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0060\AZ0060010Detail5.html
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
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0060/jsp/AZ0060010Detail5.jsp,v $
$Author: geng-jia $
$Revision: 1.1 $ $Date: 2017/02/22 01:42:17 $
********************************************************* --%>
<html>
<head>
<title>詳細5(JF)</title>
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

<!-- 得意先納品場所メンテナンス-->
<%
if("KA0100020Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.DLV_LOC_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_OLD_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_NEW_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DLV_LOC_CD_CHANGE\" class=\"expj-label\" data-name=\"d_DLV_LOC_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DLV_LOC_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.DLV_LOC_NAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DLV_LOC_NAME\" class=\"expj-label\" data-name=\"d_OLD_DLV_LOC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DLV_LOC_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DLV_LOC_NAME\" class=\"expj-label\" data-name=\"d_NEW_DLV_LOC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DLV_LOC_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DLV_LOC_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_DLV_LOC_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DLV_LOC_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.DLV_LOC_KNAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DLV_LOC_KNAME\" class=\"expj-label\" data-name=\"d_OLD_DLV_LOC_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DLV_LOC_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DLV_LOC_KNAME\" class=\"expj-label\" data-name=\"d_NEW_DLV_LOC_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DLV_LOC_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DLV_LOC_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_DLV_LOC_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DLV_LOC_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.DLV_LOC_ENAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DLV_LOC_ENAME\" class=\"expj-label\" data-name=\"d_OLD_DLV_LOC_ENAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DLV_LOC_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DLV_LOC_ENAME\" class=\"expj-label\" data-name=\"d_NEW_DLV_LOC_ENAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DLV_LOC_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DLV_LOC_ENAME_CHANGE\" class=\"expj-label\" data-name=\"d_DLV_LOC_ENAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DLV_LOC_ENAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.ZIP_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ZIP_CD\" class=\"expj-label\" data-name=\"d_OLD_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ZIP_CD\" class=\"expj-label\" data-name=\"d_NEW_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ZIP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ZIP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ZIP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.ADDRESS_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.ADDRESS_2",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.ADDRESS_K_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.ADDRESS_K_2",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.TEL",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TEL\" class=\"expj-label\" data-name=\"d_OLD_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TEL\" class=\"expj-label\" data-name=\"d_NEW_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TEL_CHANGE\" class=\"expj-label\" data-name=\"d_TEL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TEL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.FAX",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FAX\" class=\"expj-label\" data-name=\"d_OLD_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FAX\" class=\"expj-label\" data-name=\"d_NEW_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FAX_CHANGE\" class=\"expj-label\" data-name=\"d_FAX_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FAX_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.TRANSPORT_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TRANSPORT_CD\" class=\"expj-label\" data-name=\"d_OLD_TRANSPORT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TRANSPORT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TRANSPORT_CD\" class=\"expj-label\" data-name=\"d_NEW_TRANSPORT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TRANSPORT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TRANSPORT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TRANSPORT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TRANSPORT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.DEPO_WH_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DEPO_WH_CD\" class=\"expj-label\" data-name=\"d_OLD_DEPO_WH_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DEPO_WH_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DEPO_WH_CD\" class=\"expj-label\" data-name=\"d_NEW_DEPO_WH_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DEPO_WH_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DEPO_WH_CD_CHANGE\" class=\"expj-label\" data-name=\"d_DEPO_WH_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DEPO_WH_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.SHIP_WH_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SHIP_WH_CD\" class=\"expj-label\" data-name=\"d_OLD_SHIP_WH_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SHIP_WH_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SHIP_WH_CD\" class=\"expj-label\" data-name=\"d_NEW_SHIP_WH_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SHIP_WH_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SHIP_WH_CD_CHANGE\" class=\"expj-label\" data-name=\"d_SHIP_WH_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SHIP_WH_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.TRANSPORT_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TRANSPORT_LT\" class=\"expj-label\" data-name=\"d_OLD_TRANSPORT_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TRANSPORT_LT())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TRANSPORT_LT\" class=\"expj-label\" data-name=\"d_NEW_TRANSPORT_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TRANSPORT_LT())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TRANSPORT_LT_CHANGE\" class=\"expj-label\" data-name=\"d_TRANSPORT_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TRANSPORT_LT_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 請求条件メンテナンス　＆請求条件データ一括登録  メイン画面表示する項目--><%
if(("BA0020010Servlet".equals(aAZ0060010Control.getScreen_url()) || "BA0040010Servlet".equals(aAZ0060010Control.getScreen_url())) && "M_CUST_STL_CTRL".equals(aAZ0060010Control.getTable_name())){
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
%><!-- 請求条件メンテナンス　＆請求条件データ一括登録  サッブ画面表示する項目--><%
if(("BA0020010Servlet".equals(aAZ0060010Control.getScreen_url()) || "BA0040010Servlet".equals(aAZ0060010Control.getScreen_url())) && "M_CLAIM_CUST_CTRL".equals(aAZ0060010Control.getTable_name())){
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
%><!-- 得意先メンテナンス メイン画面表示する項目--><%
if("BA0050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CUST".equals(aAZ0060010Control.getTable_name())){
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
 <% AZ0060010Detail1_DB.append("['10','").append("自社担当部門コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("自社担当者コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_PERSON_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_PERSON_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_PERSON_CD_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 得意先メンテナンス サッブ画面表示する項目--><%
if("BA0050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CUST_BRANCH".equals(aAZ0060010Control.getTable_name())){
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
 <% AZ0060010Detail1_DB.append("['18','").append("自社担当部門コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['19','").append("自社担当者コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_PERSON_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_PERSON_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_PERSON_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['20','").append("ＥＤＩ相手取引先コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EDI_CUST_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_EDI_CUST_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EDI_CUST_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EDI_CUST_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_EDI_CUST_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EDI_CUST_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EDI_CUST_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_EDI_CUST_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EDI_CUST_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['21','").append("ＥＤＩ自社取引先コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EDI_OWN_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_EDI_OWN_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EDI_OWN_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EDI_OWN_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_EDI_OWN_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EDI_OWN_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EDI_OWN_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_EDI_OWN_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EDI_OWN_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['22','").append("備考１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REMARKS_1\" class=\"expj-label\" data-name=\"d_OLD_REMARKS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REMARKS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REMARKS_1\" class=\"expj-label\" data-name=\"d_NEW_REMARKS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REMARKS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REMARKS_1_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REMARKS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['23','").append("備考２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REMARKS_2\" class=\"expj-label\" data-name=\"d_OLD_REMARKS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REMARKS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REMARKS_2\" class=\"expj-label\" data-name=\"d_NEW_REMARKS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REMARKS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REMARKS_2_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REMARKS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['24','").append("備考３").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REMARKS_3\" class=\"expj-label\" data-name=\"d_OLD_REMARKS_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REMARKS_3())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REMARKS_3\" class=\"expj-label\" data-name=\"d_NEW_REMARKS_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REMARKS_3())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REMARKS_3_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_3_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REMARKS_3_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 会社メンテナンス--><%
if("BZ0010010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("会社コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_COMPANY_CD\" class=\"expj-label\" data-name=\"d_OLD_COMPANY_CD\" data-detailItem=\"true\" data-kind=\"OBT_AN\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_COMPANY_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_COMPANY_CD\" class=\"expj-label\" data-name=\"d_NEW_COMPANY_CD\" data-detailItem=\"true\" data-kind=\"OBT_AN\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_COMPANY_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_COMPANY_CD_CHANGE\" class=\"expj-label\" data-name=\"d_COMPANY_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_COMPANY_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("会社正式名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_COMPANY_FNAME\" class=\"expj-label\" data-name=\"d_OLD_COMPANY_FNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_COMPANY_FNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_COMPANY_FNAME\" class=\"expj-label\" data-name=\"d_NEW_COMPANY_FNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_COMPANY_FNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_COMPANY_FNAME_CHANGE\" class=\"expj-label\" data-name=\"d_COMPANY_FNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_COMPANY_FNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("会社名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_COMPANY_NAME\" class=\"expj-label\" data-name=\"d_OLD_COMPANY_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_COMPANY_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_COMPANY_NAME\" class=\"expj-label\" data-name=\"d_NEW_COMPANY_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_COMPANY_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_COMPANY_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_COMPANY_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_COMPANY_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("会社名(カナ)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_COMPANY_KNAME\" class=\"expj-label\" data-name=\"d_OLD_COMPANY_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_COMPANY_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_COMPANY_KNAME\" class=\"expj-label\" data-name=\"d_NEW_COMPANY_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_COMPANY_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_COMPANY_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_COMPANY_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_COMPANY_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("会社名(英名)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_COMPANY_ENAME\" class=\"expj-label\" data-name=\"d_OLD_COMPANY_ENAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_COMPANY_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_COMPANY_ENAME\" class=\"expj-label\" data-name=\"d_NEW_COMPANY_ENAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_COMPANY_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_COMPANY_ENAME_CHANGE\" class=\"expj-label\" data-name=\"d_COMPANY_ENAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_COMPANY_ENAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("郵便番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ZIP_CD\" class=\"expj-label\" data-name=\"d_OLD_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ZIP_CD\" class=\"expj-label\" data-name=\"d_NEW_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ZIP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ZIP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ZIP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("住所１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("住所２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("住所(カナ)１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("住所(カナ)２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append("電話番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TEL\" class=\"expj-label\" data-name=\"d_OLD_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TEL\" class=\"expj-label\" data-name=\"d_NEW_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TEL_CHANGE\" class=\"expj-label\" data-name=\"d_TEL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TEL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append("ＦＡＸ番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FAX\" class=\"expj-label\" data-name=\"d_OLD_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FAX\" class=\"expj-label\" data-name=\"d_NEW_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FAX_CHANGE\" class=\"expj-label\" data-name=\"d_FAX_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FAX_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 利用者所属会社メンテナンス--><%
if("BZ0020010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("利用者コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_USER_CD\" class=\"expj-label\" data-name=\"d_OLD_USER_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_USER_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_USER_CD\" class=\"expj-label\" data-name=\"d_NEW_USER_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_USER_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_USER_CD_CHANGE\" class=\"expj-label\" data-name=\"d_USER_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_USER_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("会社コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_COMPANY_CD\" class=\"expj-label\" data-name=\"d_OLD_COMPANY_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_COMPANY_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_COMPANY_CD\" class=\"expj-label\" data-name=\"d_NEW_COMPANY_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_COMPANY_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_COMPANY_CD_CHANGE\" class=\"expj-label\" data-name=\"d_COMPANY_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_COMPANY_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("利用者区分").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_USER_TYP\" class=\"expj-label\" data-name=\"d_OLD_USER_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_USER_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_USER_TYP\" class=\"expj-label\" data-name=\"d_NEW_USER_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_USER_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_USER_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_USER_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_USER_TYP_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 銀行メンテナンス メイン画面表示する項目--><%
if("BZ0050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_BANK_H".equals(aAZ0060010Control.getTable_name())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("銀行コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_CD\" class=\"expj-label\" data-name=\"d_OLD_BANK_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_CD\" class=\"expj-label\" data-name=\"d_NEW_BANK_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("銀行名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_NAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_NAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("銀行略名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_ANAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_ANAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_ANAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_ANAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_ANAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("銀行名(半角カナ)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_KNAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_KNAME\" data-detailItem=\"true\" data-kind=\"OBT_ANK3_SPC\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_KNAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_KNAME\" data-detailItem=\"true\" data-kind=\"OBT_ANK3_SPC\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("銀行名(英名)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_ENAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_ENAME\" data-detailItem=\"true\" data-kind=\"OBT_AN_SPC\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_ENAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_ENAME\" data-detailItem=\"true\" data-kind=\"OBT_AN_SPC\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_ENAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_ENAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_ENAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("銀行名(ＦＢ)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_FB_NAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_FB_NAME\" data-detailItem=\"true\" data-kind=\"OBT_TELMO\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_FB_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_FB_NAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_FB_NAME\" data-detailItem=\"true\" data-kind=\"OBT_TELMO\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_FB_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_FB_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_FB_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_FB_NAME_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 銀行メンテナンス サッブ画面表示する項目--><%
if("BZ0050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_BANK".equals(aAZ0060010Control.getTable_name())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("銀行コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_CD\" class=\"expj-label\" data-name=\"d_OLD_BANK_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_CD\" class=\"expj-label\" data-name=\"d_NEW_BANK_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("銀行支店コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_BR_CD\" class=\"expj-label\" data-name=\"d_OLD_BANK_BR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_BR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_BR_CD\" class=\"expj-label\" data-name=\"d_NEW_BANK_BR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_BR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_BR_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_BR_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_BR_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("カレンダ番号").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CAL_NO\" class=\"expj-label\" data-name=\"d_OLD_CAL_NO\" data-detailItem=\"true\" data-kind=\"OBT_N\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CAL_NO())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CAL_NO\" class=\"expj-label\" data-name=\"d_NEW_CAL_NO\" data-detailItem=\"true\" data-kind=\"OBT_N\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CAL_NO())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CAL_NO_CHANGE\" class=\"expj-label\" data-name=\"d_CAL_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CAL_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("銀行支店名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_BR_NAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_BR_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_BR_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_BR_NAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_BR_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_BR_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_BR_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_BR_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_BR_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("銀行支店略名").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_BR_ANAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_BR_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_BR_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_BR_ANAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_BR_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_BR_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_BR_ANAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_BR_ANAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_BR_ANAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("銀行支店名(半角カナ)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_BR_KNAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_BR_KNAME\" data-detailItem=\"true\" data-kind=\"OBT_ANK3_SPC\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_BR_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_BR_KNAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_BR_KNAME\" data-detailItem=\"true\" data-kind=\"OBT_ANK3_SPC\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_BR_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_BR_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_BR_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_BR_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("銀行支店名(英名)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_BR_ENAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_BR_ENAME\" data-detailItem=\"true\" data-kind=\"OBT_AN_SPC\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_BR_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_BR_ENAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_BR_ENAME\" data-detailItem=\"true\" data-kind=\"OBT_AN_SPC\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_BR_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_BR_ENAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_BR_ENAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_BR_ENAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("銀行支店名(ＦＢ)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_BR_FB_NAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_BR_FB_NAME\" data-detailItem=\"true\" data-kind=\"OBT_TELMO\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_BR_FB_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_BR_FB_NAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_BR_FB_NAME\" data-detailItem=\"true\" data-kind=\"OBT_TELMO\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_BR_FB_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_BR_FB_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_BR_FB_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_BR_FB_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("銀行支店名称").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_BR_CNAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_BR_CNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_BR_CNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_BR_CNAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_BR_CNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_BR_CNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_BR_CNAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_BR_CNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_BR_CNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("銀行支店名称(英名)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_BR_ECNAME\" class=\"expj-label\" data-name=\"d_OLD_BANK_BR_ECNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_BR_ECNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_BR_ECNAME\" class=\"expj-label\" data-name=\"d_NEW_BANK_BR_ECNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_BR_ECNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_BR_ECNAME_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_BR_ECNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_BR_ECNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append("郵便番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ZIP_CD\" class=\"expj-label\" data-name=\"d_OLD_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ZIP_CD\" class=\"expj-label\" data-name=\"d_NEW_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ZIP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ZIP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ZIP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append("住所１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append("住所２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append("住所(カナ)１").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append("住所(カナ)２").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append("電話番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TEL\" class=\"expj-label\" data-name=\"d_OLD_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TEL\" class=\"expj-label\" data-name=\"d_NEW_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TEL_CHANGE\" class=\"expj-label\" data-name=\"d_TEL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TEL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['18','").append("ＦＡＸ番号").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FAX\" class=\"expj-label\" data-name=\"d_OLD_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FAX\" class=\"expj-label\" data-name=\"d_NEW_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FAX_CHANGE\" class=\"expj-label\" data-name=\"d_FAX_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FAX_CHANGE())).append("</span>").append("']").append(",");%>
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