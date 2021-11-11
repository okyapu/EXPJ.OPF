<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 13 16:29:56 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0060\AZ0060010Detail3.html
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
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0060/jsp/AZ0060010Detail3.jsp,v $
$Author: geng-jia $
$Revision: 1.3 $ $Date: 2017/02/22 01:42:15 $
********************************************************* --%>
<html>
<head>
<title>詳細3(JF)</title>
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

<!-- 納品場所メンテナンスJa -->
<%
if("KA1040010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.CNCNTRT_DLV_LOC_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CNCNTRT_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_OLD_CNCNTRT_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CNCNTRT_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CNCNTRT_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_NEW_CNCNTRT_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CNCNTRT_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CNCNTRT_DLV_LOC_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CNCNTRT_DLV_LOC_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CNCNTRT_DLV_LOC_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.SHIP_CTL_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SHIP_CTL_TYP\" class=\"expj-label\" data-name=\"d_OLD_SHIP_CTL_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SHIP_CTL_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SHIP_CTL_TYP\" class=\"expj-label\" data-name=\"d_NEW_SHIP_CTL_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SHIP_CTL_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SHIP_CTL_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_SHIP_CTL_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SHIP_CTL_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.DLV_SLIP_ISS_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DLV_SLIP_ISS_FLG\" class=\"expj-label\" data-name=\"d_OLD_DLV_SLIP_ISS_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DLV_SLIP_ISS_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DLV_SLIP_ISS_FLG\" class=\"expj-label\" data-name=\"d_NEW_DLV_SLIP_ISS_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DLV_SLIP_ISS_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DLV_SLIP_ISS_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_DLV_SLIP_ISS_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DLV_SLIP_ISS_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.IDENT_CARD_F_ISS_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_IDENT_CARD_F_ISS_TYP\" class=\"expj-label\" data-name=\"d_OLD_IDENT_CARD_F_ISS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_IDENT_CARD_F_ISS_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_IDENT_CARD_F_ISS_TYP\" class=\"expj-label\" data-name=\"d_NEW_IDENT_CARD_F_ISS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_IDENT_CARD_F_ISS_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_IDENT_CARD_F_ISS_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_IDENT_CARD_F_ISS_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_IDENT_CARD_F_ISS_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.IDENT_CARD_F_FORMAT_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_IDENT_CARD_F_FORMAT_TYP\" class=\"expj-label\" data-name=\"d_OLD_IDENT_CARD_F_FORMAT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_IDENT_CARD_F_FORMAT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_IDENT_CARD_F_FORMAT_TYP\" class=\"expj-label\" data-name=\"d_NEW_IDENT_CARD_F_FORMAT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_IDENT_CARD_F_FORMAT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_IDENT_CARD_F_FORMAT_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_IDENT_CARD_F_FORMAT_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_IDENT_CARD_F_FORMAT_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.SHIP_FIX_TERM",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SHIP_FIX_TERM\" class=\"expj-label\" data-name=\"d_OLD_SHIP_FIX_TERM\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;2;;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SHIP_FIX_TERM())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SHIP_FIX_TERM\" class=\"expj-label\" data-name=\"d_NEW_SHIP_FIX_TERM\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;2;;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SHIP_FIX_TERM())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SHIP_FIX_TERM_CHANGE\" class=\"expj-label\" data-name=\"d_SHIP_FIX_TERM_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SHIP_FIX_TERM_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.MASS_PRODUCT_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MASS_PRODUCT_TYP\" class=\"expj-label\" data-name=\"d_OLD_MASS_PRODUCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MASS_PRODUCT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MASS_PRODUCT_TYP\" class=\"expj-label\" data-name=\"d_NEW_MASS_PRODUCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MASS_PRODUCT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MASS_PRODUCT_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_MASS_PRODUCT_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MASS_PRODUCT_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.DECISION_REPLACE_PTN",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DECISION_REPLACE_PTN\" class=\"expj-label\" data-name=\"d_OLD_DECISION_REPLACE_PTN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DECISION_REPLACE_PTN())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DECISION_REPLACE_PTN\" class=\"expj-label\" data-name=\"d_NEW_DECISION_REPLACE_PTN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DECISION_REPLACE_PTN())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DECISION_REPLACE_PTN_CHANGE\" class=\"expj-label\" data-name=\"d_DECISION_REPLACE_PTN_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DECISION_REPLACE_PTN_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['22','").append(CoreTools.getRBString("Expj.SHIP_RSLT_APPLY_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SHIP_RSLT_APPLY_TYP\" class=\"expj-label\" data-name=\"d_OLD_SHIP_RSLT_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SHIP_RSLT_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SHIP_RSLT_APPLY_TYP\" class=\"expj-label\" data-name=\"d_NEW_SHIP_RSLT_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SHIP_RSLT_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SHIP_RSLT_APPLY_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_SHIP_RSLT_APPLY_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SHIP_RSLT_APPLY_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['23','").append(CoreTools.getRBString("Expj.CNCNTRT_SHIP_RSLT_APPLY_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP\" class=\"expj-label\" data-name=\"d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP\" class=\"expj-label\" data-name=\"d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['24','").append(CoreTools.getRBString("Expj.NEXT_DLV_SHIFT_EFF_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_NEXT_DLV_SHIFT_EFF_FLG\" class=\"expj-label\" data-name=\"d_OLD_NEXT_DLV_SHIFT_EFF_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_NEXT_DLV_SHIFT_EFF_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_NEXT_DLV_SHIFT_EFF_FLG\" class=\"expj-label\" data-name=\"d_NEW_NEXT_DLV_SHIFT_EFF_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_NEXT_DLV_SHIFT_EFF_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEXT_DLV_SHIFT_EFF_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['25','").append(CoreTools.getRBString("Expj.UNCNFM_PLAN_AVG_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNCNFM_PLAN_AVG_FLG\" class=\"expj-label\" data-name=\"d_OLD_UNCNFM_PLAN_AVG_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNCNFM_PLAN_AVG_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNCNFM_PLAN_AVG_FLG\" class=\"expj-label\" data-name=\"d_NEW_UNCNFM_PLAN_AVG_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNCNFM_PLAN_AVG_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNCNFM_PLAN_AVG_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_UNCNFM_PLAN_AVG_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNCNFM_PLAN_AVG_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['26','").append(CoreTools.getRBString("Expj.TRANSPORT_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TRANSPORT_CD\" class=\"expj-label\" data-name=\"d_OLD_TRANSPORT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TRANSPORT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TRANSPORT_CD\" class=\"expj-label\" data-name=\"d_NEW_TRANSPORT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TRANSPORT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TRANSPORT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TRANSPORT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TRANSPORT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['27','").append(CoreTools.getRBString("Expj.CNCNTRT_TRANS_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CNCNTRT_TRANS_LT\" class=\"expj-label\" data-name=\"d_OLD_CNCNTRT_TRANS_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6;;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CNCNTRT_TRANS_LT())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CNCNTRT_TRANS_LT\" class=\"expj-label\" data-name=\"d_NEW_CNCNTRT_TRANS_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6;;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CNCNTRT_TRANS_LT())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CNCNTRT_TRANS_LT_CHANGE\" class=\"expj-label\" data-name=\"d_CNCNTRT_TRANS_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CNCNTRT_TRANS_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['28','").append(CoreTools.getRBString("Expj.CUST_TRANS_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_TRANS_LT\" class=\"expj-label\" data-name=\"d_OLD_CUST_TRANS_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6;;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_TRANS_LT())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_TRANS_LT\" class=\"expj-label\" data-name=\"d_NEW_CUST_TRANS_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6;;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_TRANS_LT())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_TRANS_LT_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_TRANS_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_TRANS_LT_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 得意先指定納品場所メンテナンスJa --><%
if("KA1080010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.CUST_DESINATED_DLV_LOC_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_DESINATED_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_DESINATED_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_DESINATED_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_DESINATED_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_DESINATED_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_DESINATED_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_DESINATED_DLV_LOC_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_DESINATED_DLV_LOC_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_DESINATED_DLV_LOC_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.DLV_LOC_OPTION_CHANGE_VALUE",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DLV_LOC_OPTION_CHANGE_VALUE\" class=\"expj-label\" data-name=\"d_OLD_DLV_LOC_OPTION_CHANGE_VALUE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DLV_LOC_OPTION_CHANGE_VALUE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DLV_LOC_OPTION_CHANGE_VALUE\" class=\"expj-label\" data-name=\"d_NEW_DLV_LOC_OPTION_CHANGE_VALUE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DLV_LOC_OPTION_CHANGE_VALUE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE\" class=\"expj-label\" data-name=\"d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.CUST_DESINATED_DLV_LOC_NAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_DESINATED_DLV_LOC_NAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_DESINATED_DLV_LOC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_DESINATED_DLV_LOC_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_DESINATED_DLV_LOC_NAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_DESINATED_DLV_LOC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_DESINATED_DLV_LOC_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_DESINATED_DLV_LOC_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_DESINATED_DLV_LOC_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_DESINATED_DLV_LOC_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.CUST_DESINATED_DLV_LOC_KNAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_DESINATED_DLV_LOC_KNAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_DESINATED_DLV_LOC_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_DESINATED_DLV_LOC_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_DESINATED_DLV_LOC_KNAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_DESINATED_DLV_LOC_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_DESINATED_DLV_LOC_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_DESINATED_DLV_LOC_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.CUST_DESINATED_DLV_LOC_ENAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_DESINATED_DLV_LOC_ENAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_DESINATED_DLV_LOC_ENAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_DESINATED_DLV_LOC_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_DESINATED_DLV_LOC_ENAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_DESINATED_DLV_LOC_ENAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_DESINATED_DLV_LOC_ENAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_DESINATED_DLV_LOC_ENAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.ZIP_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ZIP_CD\" class=\"expj-label\" data-name=\"d_OLD_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ZIP_CD\" class=\"expj-label\" data-name=\"d_NEW_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ZIP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ZIP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ZIP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.ADDRESS_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.ADDRESS_2",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.ADDRESS_K_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.ADDRESS_K_2",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.TEL",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TEL\" class=\"expj-label\" data-name=\"d_OLD_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TEL\" class=\"expj-label\" data-name=\"d_NEW_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TEL_CHANGE\" class=\"expj-label\" data-name=\"d_TEL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TEL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.FAX",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FAX\" class=\"expj-label\" data-name=\"d_OLD_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FAX\" class=\"expj-label\" data-name=\"d_NEW_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FAX_CHANGE\" class=\"expj-label\" data-name=\"d_FAX_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FAX_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.FINAL_DLV_LOC_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_OLD_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_NEW_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DLV_LOC_CD_CHANGE\" class=\"expj-label\" data-name=\"d_DLV_LOC_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DLV_LOC_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.REMARKS_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REMARKS_1\" class=\"expj-label\" data-name=\"d_OLD_REMARKS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REMARKS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REMARKS_1\" class=\"expj-label\" data-name=\"d_NEW_REMARKS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REMARKS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REMARKS_1_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REMARKS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.REMARKS_2",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REMARKS_2\" class=\"expj-label\" data-name=\"d_OLD_REMARKS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REMARKS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REMARKS_2\" class=\"expj-label\" data-name=\"d_NEW_REMARKS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REMARKS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REMARKS_2_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REMARKS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.REMARKS_3",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REMARKS_3\" class=\"expj-label\" data-name=\"d_OLD_REMARKS_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REMARKS_3())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REMARKS_3\" class=\"expj-label\" data-name=\"d_NEW_REMARKS_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REMARKS_3())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REMARKS_3_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_3_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REMARKS_3_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 品目メンテナンス --><%
if("AA0010010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.PKG_UNIT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PKG_UNIT\" class=\"expj-label\" data-name=\"d_OLD_PKG_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PKG_UNIT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PKG_UNIT\" class=\"expj-label\" data-name=\"d_NEW_PKG_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PKG_UNIT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PKG_UNIT_CHANGE\" class=\"expj-label\" data-name=\"d_PKG_UNIT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PKG_UNIT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OPR_RSLT_TYP\" class=\"expj-label\" data-name=\"d_OLD_OPR_RSLT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OPR_RSLT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OPR_RSLT_TYP\" class=\"expj-label\" data-name=\"d_NEW_OPR_RSLT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OPR_RSLT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OPR_RSLT_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_OPR_RSLT_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OPR_RSLT_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.PKG_UNIT_QTY",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PKG_UNIT_QTY\" class=\"expj-label\" data-name=\"d_OLD_PKG_UNIT_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PKG_UNIT_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PKG_UNIT_QTY\" class=\"expj-label\" data-name=\"d_NEW_PKG_UNIT_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PKG_UNIT_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PKG_UNIT_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_PKG_UNIT_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PKG_UNIT_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.SPL_ITEM_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SPL_ITEM_TYP\" class=\"expj-label\" data-name=\"d_OLD_SPL_ITEM_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SPL_ITEM_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SPL_ITEM_TYP\" class=\"expj-label\" data-name=\"d_NEW_SPL_ITEM_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SPL_ITEM_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SPL_ITEM_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_SPL_ITEM_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SPL_ITEM_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.ODR_LT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ODR_LT\" class=\"expj-label\" data-name=\"d_OLD_ODR_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ODR_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ODR_LT\" class=\"expj-label\" data-name=\"d_NEW_ODR_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ODR_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ODR_LT_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ODR_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.ISSUE_LT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ISSUE_LT\" class=\"expj-label\" data-name=\"d_OLD_ISSUE_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ISSUE_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ISSUE_LT\" class=\"expj-label\" data-name=\"d_NEW_ISSUE_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ISSUE_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ISSUE_LT_CHANGE\" class=\"expj-label\" data-name=\"d_ISSUE_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ISSUE_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.FIXED_LT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FIXED_LT\" class=\"expj-label\" data-name=\"d_OLD_FIXED_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FIXED_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FIXED_LT\" class=\"expj-label\" data-name=\"d_NEW_FIXED_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FIXED_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FIXED_LT_CHANGE\" class=\"expj-label\" data-name=\"d_FIXED_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FIXED_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['22','").append(CoreTools.getRBString("Expj.PROP_LOT_SIZE",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PROP_LOT_SIZE\" class=\"expj-label\" data-name=\"d_OLD_PROP_LOT_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PROP_LOT_SIZE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PROP_LOT_SIZE\" class=\"expj-label\" data-name=\"d_NEW_PROP_LOT_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PROP_LOT_SIZE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PROP_LOT_SIZE_CHANGE\" class=\"expj-label\" data-name=\"d_PROP_LOT_SIZE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PROP_LOT_SIZE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['23','").append(CoreTools.getRBString("Expj.PROP_LT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PROP_LT\" class=\"expj-label\" data-name=\"d_OLD_PROP_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PROP_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PROP_LT\" class=\"expj-label\" data-name=\"d_NEW_PROP_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PROP_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PROP_LT_CHANGE\" class=\"expj-label\" data-name=\"d_PROP_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PROP_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['24','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ITEM_SPOIL\" class=\"expj-label\" data-name=\"d_OLD_ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ITEM_SPOIL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ITEM_SPOIL\" class=\"expj-label\" data-name=\"d_NEW_ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ITEM_SPOIL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ITEM_SPOIL_CHANGE\" class=\"expj-label\" data-name=\"d_ITEM_SPOIL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ITEM_SPOIL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['25','").append(CoreTools.getRBString("Expj.SAFETY_LT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SAFETY_LT\" class=\"expj-label\" data-name=\"d_OLD_SAFETY_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SAFETY_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SAFETY_LT\" class=\"expj-label\" data-name=\"d_NEW_SAFETY_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SAFETY_LT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SAFETY_LT_CHANGE\" class=\"expj-label\" data-name=\"d_SAFETY_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SAFETY_LT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['26','").append(CoreTools.getRBString("Expj.SAFETY_STOCK",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SAFETY_STOCK\" class=\"expj-label\" data-name=\"d_OLD_SAFETY_STOCK\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SAFETY_STOCK())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SAFETY_STOCK\" class=\"expj-label\" data-name=\"d_NEW_SAFETY_STOCK\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SAFETY_STOCK())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SAFETY_STOCK_CHANGE\" class=\"expj-label\" data-name=\"d_SAFETY_STOCK_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SAFETY_STOCK_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['27','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"d_OLD_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MRP_ODR_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"d_NEW_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MRP_ODR_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MRP_ODR_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_MRP_ODR_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MRP_ODR_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['28','").append(CoreTools.getRBString("Expj.MANHOUR_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MANHOUR_TYP\" class=\"expj-label\" data-name=\"d_OLD_MANHOUR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MANHOUR_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MANHOUR_TYP\" class=\"expj-label\" data-name=\"d_NEW_MANHOUR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MANHOUR_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MANHOUR_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_MANHOUR_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MANHOUR_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['29','").append(CoreTools.getRBString("Expj.LOT_SIZING_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_LOT_SIZING_TYP\" class=\"expj-label\" data-name=\"d_OLD_LOT_SIZING_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_LOT_SIZING_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_LOT_SIZING_TYP\" class=\"expj-label\" data-name=\"d_NEW_LOT_SIZING_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_LOT_SIZING_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_LOT_SIZING_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_LOT_SIZING_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_LOT_SIZING_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['30','").append(CoreTools.getRBString("Expj.MPS_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MPS_FLG\" class=\"expj-label\" data-name=\"d_OLD_MPS_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MPS_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MPS_FLG\" class=\"expj-label\" data-name=\"d_NEW_MPS_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MPS_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MPS_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_MPS_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MPS_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['31','").append(CoreTools.getRBString("Expj.MAX_PERIOD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MAX_PERIOD\" class=\"expj-label\" data-name=\"d_OLD_MAX_PERIOD\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_P;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MAX_PERIOD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MAX_PERIOD\" class=\"expj-label\" data-name=\"d_NEW_MAX_PERIOD\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_P;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MAX_PERIOD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MAX_PERIOD_CHANGE\" class=\"expj-label\" data-name=\"d_MAX_PERIOD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MAX_PERIOD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['32','").append(CoreTools.getRBString("Expj.FIXED_ODR_QTY",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FIXED_ODR_QTY\" class=\"expj-label\" data-name=\"d_OLD_FIXED_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FIXED_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FIXED_ODR_QTY\" class=\"expj-label\" data-name=\"d_NEW_FIXED_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FIXED_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FIXED_ODR_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_FIXED_ODR_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FIXED_ODR_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['33','").append(CoreTools.getRBString("Expj.MAX_ODR_QTY",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MAX_ODR_QTY\" class=\"expj-label\" data-name=\"d_OLD_MAX_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MAX_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MAX_ODR_QTY\" class=\"expj-label\" data-name=\"d_NEW_MAX_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MAX_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MAX_ODR_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_MAX_ODR_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MAX_ODR_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['34','").append(CoreTools.getRBString("Expj.MIN_ODR_QTY",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MIN_ODR_QTY\" class=\"expj-label\" data-name=\"d_OLD_MIN_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MIN_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MIN_ODR_QTY\" class=\"expj-label\" data-name=\"d_NEW_MIN_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MIN_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MIN_ODR_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_MIN_ODR_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MIN_ODR_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['35','").append(CoreTools.getRBString("Expj.ODR_POINT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ODR_POINT\" class=\"expj-label\" data-name=\"d_OLD_ODR_POINT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ODR_POINT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ODR_POINT\" class=\"expj-label\" data-name=\"d_NEW_ODR_POINT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ODR_POINT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ODR_POINT_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_POINT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ODR_POINT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['36','").append(CoreTools.getRBString("Expj.MUL_ODR_QTY",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MUL_ODR_QTY\" class=\"expj-label\" data-name=\"d_OLD_MUL_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MUL_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MUL_ODR_QTY\" class=\"expj-label\" data-name=\"d_NEW_MUL_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MUL_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MUL_ODR_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_MUL_ODR_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MUL_ODR_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['37','").append(CoreTools.getRBString("Expj.CLASIFICATION_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CLASIFICATION_CD\" class=\"expj-label\" data-name=\"d_OLD_CLASIFICATION_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CLASIFICATION_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CLASIFICATION_CD\" class=\"expj-label\" data-name=\"d_NEW_CLASIFICATION_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CLASIFICATION_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CLASIFICATION_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CLASIFICATION_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CLASIFICATION_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['38','").append(CoreTools.getRBString("Expj.UNIT_WEIGHT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_WEIGHT\" class=\"expj-label\" data-name=\"d_OLD_UNIT_WEIGHT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_WEIGHT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_WEIGHT\" class=\"expj-label\" data-name=\"d_NEW_UNIT_WEIGHT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_WEIGHT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_WEIGHT_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_WEIGHT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_WEIGHT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['39','").append(CoreTools.getRBString("Expj.TAX_CD_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CD\" class=\"expj-label\" data-name=\"d_OLD_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CD\" class=\"expj-label\" data-name=\"d_NEW_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['40','").append(CoreTools.getRBString("Expj.CAL_NO",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CAL_NO\" class=\"expj-label\" data-name=\"d_OLD_CAL_NO\" data-detailItem=\"true\" data-kind=\"OBT_N\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CAL_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CAL_NO\" class=\"expj-label\" data-name=\"d_NEW_CAL_NO\" data-detailItem=\"true\" data-kind=\"OBT_N\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CAL_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CAL_NO_CHANGE\" class=\"expj-label\" data-name=\"d_CAL_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CAL_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['41','").append(CoreTools.getRBString("Expj.Cmt4091",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DEPO_TYP\" class=\"expj-label\" data-name=\"d_OLD_DEPO_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DEPO_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DEPO_TYP\" class=\"expj-label\" data-name=\"d_NEW_DEPO_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DEPO_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DEPO_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_DEPO_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DEPO_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['42','").append(CoreTools.getRBString("Expj.Cmt5070",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BEST_BEFORE_YEAR\" class=\"expj-label\" data-name=\"d_OLD_BEST_BEFORE_YEAR\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BEST_BEFORE_YEAR())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BEST_BEFORE_YEAR\" class=\"expj-label\" data-name=\"d_NEW_BEST_BEFORE_YEAR\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BEST_BEFORE_YEAR())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BEST_BEFORE_YEAR_CHANGE\" class=\"expj-label\" data-name=\"d_BEST_BEFORE_YEAR_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BEST_BEFORE_YEAR_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['43','").append(CoreTools.getRBString("Expj.LOT_CTRL_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_LOT_CTRL_FLG\" class=\"expj-label\" data-name=\"d_OLD_LOT_CTRL_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_LOT_CTRL_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_LOT_CTRL_FLG\" class=\"expj-label\" data-name=\"d_NEW_LOT_CTRL_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_LOT_CTRL_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_LOT_CTRL_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_LOT_CTRL_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_LOT_CTRL_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['44','").append(CoreTools.getRBString("Expj.Cmt5071",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BEST_BEFORE_MONTH\" class=\"expj-label\" data-name=\"d_OLD_BEST_BEFORE_MONTH\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BEST_BEFORE_MONTH())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BEST_BEFORE_MONTH\" class=\"expj-label\" data-name=\"d_NEW_BEST_BEFORE_MONTH\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BEST_BEFORE_MONTH())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BEST_BEFORE_MONTH_CHANGE\" class=\"expj-label\" data-name=\"d_BEST_BEFORE_MONTH_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BEST_BEFORE_MONTH_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['45','").append(CoreTools.getRBString("Expj.Cmt4092",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_LOT_NUMBERING_TYP\" class=\"expj-label\" data-name=\"d_OLD_LOT_NUMBERING_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_LOT_NUMBERING_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_LOT_NUMBERING_TYP\" class=\"expj-label\" data-name=\"d_NEW_LOT_NUMBERING_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_LOT_NUMBERING_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_LOT_NUMBERING_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_LOT_NUMBERING_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_LOT_NUMBERING_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['46','").append(CoreTools.getRBString("Expj.Cmt5072",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BEST_BEFORE_DAY\" class=\"expj-label\" data-name=\"d_OLD_BEST_BEFORE_DAY\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BEST_BEFORE_DAY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BEST_BEFORE_DAY\" class=\"expj-label\" data-name=\"d_NEW_BEST_BEFORE_DAY\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BEST_BEFORE_DAY())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BEST_BEFORE_DAY_CHANGE\" class=\"expj-label\" data-name=\"d_BEST_BEFORE_DAY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BEST_BEFORE_DAY_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 得意先メンテナンスJF--><%
if("KA2100010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.CUST_FNAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_FNAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_FNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_FNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_FNAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_FNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_FNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_FNAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_FNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_FNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.CUST_NAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_NAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_NAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.CUST_ANAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_ANAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_ANAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_ANAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_ANAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_ANAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.CUST_KNAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_KNAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_KNAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.CUST_GRP_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_GRP_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_GRP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_GRP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_GRP_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_GRP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_GRP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_GRP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_GRP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_GRP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.CUST_DLV_LOC_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_DLV_LOC_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_DLV_LOC_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_DLV_LOC_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.OWN_ORG_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.OWN_PERSON_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_PERSON_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_PERSON_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_PERSON_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.CUR_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUR_CD\" class=\"expj-label\" data-name=\"d_OLD_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUR_CD\" class=\"expj-label\" data-name=\"d_NEW_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUR_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUR_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUR_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.INSPC_ACPT_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_INSPC_ACPT_TYP\" class=\"expj-label\" data-name=\"d_OLD_INSPC_ACPT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_INSPC_ACPT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_INSPC_ACPT_TYP\" class=\"expj-label\" data-name=\"d_NEW_INSPC_ACPT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_INSPC_ACPT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_INSPC_ACPT_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_INSPC_ACPT_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_INSPC_ACPT_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.EXCH_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_TYP\" class=\"expj-label\" data-name=\"d_OLD_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_TYP\" class=\"expj-label\" data-name=\"d_NEW_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.TAX_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CD\" class=\"expj-label\" data-name=\"d_OLD_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CD\" class=\"expj-label\" data-name=\"d_NEW_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.TAX_CALC_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CALC_TYP\" class=\"expj-label\" data-name=\"d_OLD_TAX_CALC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CALC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CALC_TYP\" class=\"expj-label\" data-name=\"d_NEW_TAX_CALC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CALC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CALC_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CALC_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CALC_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.TAX_APPLY_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_APPLY_TYP\" class=\"expj-label\" data-name=\"d_OLD_TAX_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_APPLY_TYP\" class=\"expj-label\" data-name=\"d_NEW_TAX_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_APPLY_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_APPLY_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_APPLY_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.DETAIL_ROUND_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DETAIL_ROUND_TYP\" class=\"expj-label\" data-name=\"d_OLD_DETAIL_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DETAIL_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DETAIL_ROUND_TYP\" class=\"expj-label\" data-name=\"d_NEW_DETAIL_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DETAIL_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DETAIL_ROUND_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_DETAIL_ROUND_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DETAIL_ROUND_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.Cmt4170",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_FLG\" class=\"expj-label\" data-name=\"d_OLD_CUST_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_FLG\" class=\"expj-label\" data-name=\"d_NEW_CUST_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.DELIVERY_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DELIVERY_FLG\" class=\"expj-label\" data-name=\"d_OLD_DELIVERY_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DELIVERY_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DELIVERY_FLG\" class=\"expj-label\" data-name=\"d_NEW_DELIVERY_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DELIVERY_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DELIVERY_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_DELIVERY_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DELIVERY_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.BALA_ACCO_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BALA_ACCO_FLG\" class=\"expj-label\" data-name=\"d_OLD_BALA_ACCO_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BALA_ACCO_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BALA_ACCO_FLG\" class=\"expj-label\" data-name=\"d_NEW_BALA_ACCO_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BALA_ACCO_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BALA_ACCO_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_BALA_ACCO_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BALA_ACCO_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.UNIT_COST_USE_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST_USE_TYP\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST_USE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST_USE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST_USE_TYP\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST_USE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST_USE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_USE_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_USE_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_USE_TYP_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 納品場所メンテナンスJF--><%
if("KA2100020Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.DLV_LOC_CD_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
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
 <% AZ0060010Detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.Cmt4131",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BUSINESS_WH_FLG\" class=\"expj-label\" data-name=\"d_OLD_BUSINESS_WH_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BUSINESS_WH_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BUSINESS_WH_FLG\" class=\"expj-label\" data-name=\"d_NEW_BUSINESS_WH_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BUSINESS_WH_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BUSINESS_WH_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_BUSINESS_WH_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BUSINESS_WH_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.Cmt4038",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_REPRESENT_FLG\" class=\"expj-label\" data-name=\"d_OLD_REPRESENT_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_REPRESENT_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_REPRESENT_FLG\" class=\"expj-label\" data-name=\"d_NEW_REPRESENT_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_REPRESENT_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_REPRESENT_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_REPRESENT_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_REPRESENT_FLG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.TRANSPORT_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TRANSPORT_CD\" class=\"expj-label\" data-name=\"d_OLD_TRANSPORT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TRANSPORT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TRANSPORT_CD\" class=\"expj-label\" data-name=\"d_NEW_TRANSPORT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TRANSPORT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TRANSPORT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TRANSPORT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TRANSPORT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.SHIP_WH_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SHIP_WH_CD\" class=\"expj-label\" data-name=\"d_OLD_SHIP_WH_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SHIP_WH_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SHIP_WH_CD\" class=\"expj-label\" data-name=\"d_NEW_SHIP_WH_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SHIP_WH_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SHIP_WH_CD_CHANGE\" class=\"expj-label\" data-name=\"d_SHIP_WH_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SHIP_WH_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.TRANSPORT_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TRANSPORT_LT\" class=\"expj-label\" data-name=\"d_OLD_TRANSPORT_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TRANSPORT_LT())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TRANSPORT_LT\" class=\"expj-label\" data-name=\"d_NEW_TRANSPORT_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TRANSPORT_LT())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TRANSPORT_LT_CHANGE\" class=\"expj-label\" data-name=\"d_TRANSPORT_LT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TRANSPORT_LT_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 製品単価メンテナンス--><%
if("KA2040010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ITEM_CD\" class=\"expj-label\" data-name=\"d_OLD_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ITEM_CD\" class=\"expj-label\" data-name=\"d_NEW_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ITEM_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ITEM_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ITEM_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.SPCL_PRICE_CO",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SPCL_PRICE_TYP\" class=\"expj-label\" data-name=\"d_OLD_SPCL_PRICE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SPCL_PRICE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SPCL_PRICE_TYP\" class=\"expj-label\" data-name=\"d_NEW_SPCL_PRICE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SPCL_PRICE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SPCL_PRICE_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_SPCL_PRICE_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SPCL_PRICE_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_CD\" class=\"expj-label\" data-name=\"d_OLD_UNIT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_CD\" class=\"expj-label\" data-name=\"d_NEW_UNIT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_OLD_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_NEW_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EFF_PHASE_IN_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_EFF_PHASE_IN_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EFF_PHASE_IN_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EFF_PHASE_OUT_DATE\" class=\"expj-label\" data-name=\"d_OLD_EFF_PHASE_OUT_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EFF_PHASE_OUT_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EFF_PHASE_OUT_DATE\" class=\"expj-label\" data-name=\"d_NEW_EFF_PHASE_OUT_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EFF_PHASE_OUT_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EFF_PHASE_OUT_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_EFF_PHASE_OUT_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EFF_PHASE_OUT_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.COMM_SIZE",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SALE_SIZE\" class=\"expj-label\" data-name=\"d_OLD_SALE_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SALE_SIZE())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SALE_SIZE\" class=\"expj-label\" data-name=\"d_NEW_SALE_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;4;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SALE_SIZE())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SALE_SIZE_CHANGE\" class=\"expj-label\" data-name=\"d_SALE_SIZE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SALE_SIZE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_TYP_CHANGE())).append("</span>").append("']").append(",");%>
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