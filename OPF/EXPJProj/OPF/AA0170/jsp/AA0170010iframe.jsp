<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:24:58 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0170\AA0170010iframe.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0170.*" %>
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
<jsp:useBean id="aAA0170010Control" class="com.nec.jp.orteus.metamorBase.AA0170.AA0170010Control" scope="request"/>
<jsp:useBean id="aAA0170010Struct" class="com.nec.jp.orteus.metamorBase.AA0170.AA0170010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

表示変更
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0170/jsp/AA0170010iframe.jsp,v $
$Author: geng-jia $
$Revision: 1.4 $ $Date: 2017/02/22 02:04:10 $
********************************************************* --%>
<html>
<head>
<title>表示変更</title>
<%@include file="common/expj_v5.jsp" %>
<script>
	var data = "<root>";
	
	function onInitializeOnLoad(){
		setDataGridDataParent("AA0170010",data + "</root>");
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
<script class="expj-script-AA0170010_init">
  // AA0170010名前空間
  expj.AA0170010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
              <%
                List listBackup = aAA0170010Control.getList();
                aAA0170010Control.setList(aAA0170010Control.getProcedureList());
              %>
                   <script class="expj-script-AA0170010-AA0170010view2">
expj.AA0170010.AA0170010view2 = {};
expj.AA0170010.AA0170010view2.executeAllOnClick = function () {
};
expj.AA0170010.AA0170010view2.executeAllOnDecision = function () {
  console.log('execute AA0170010view2.onDecision');
};
expj.AA0170010.AA0170010view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0170010view2", "expj.AA0170010.AA0170010view2.executeAllOnClick");
%>
  expj.AA0170010.AA0170010view2.executePScriptOnLoad();
};

expj.AA0170010.AA0170010view2.executePScriptOnLoad = function () {
  console.log('execute AA0170010view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0170010-AA0170010view2" class="expj-datagrid-view expj-view-single" style="width:100%;height:173px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0170010view2_Id = "AA0170010view2";
 String AA0170010view2_select = "single";
 String AA0170010view2_sortable = "true";
 String AA0170010view2_resize = "true";
 String AA0170010view2_scroll = "true";
 StringBuffer AA0170010view2_HB = new StringBuffer();
 StringBuffer AA0170010view2_DB = new StringBuffer();
%>
<%
 AA0170010view2_select = "single";
 AA0170010view2_sortable = "true";
 AA0170010view2_resize = "true";
 AA0170010view2_scroll = "true";
%>
<%
 AA0170010view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
%>
    <%
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_CD",rb))).append("', 'name':'pr_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NAME",rb))).append("', 'name':'pr_PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NO",rb))).append("', 'name':'pr_PROC_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP_1",rb))).append("', 'name':'pr_OUTSIDE_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'pr_WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'pr_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb))).append("', 'name':'pr_ACPT_INSPC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.FIXED_LT_1",rb))).append("', 'name':'pr_FIXED_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROP_LT_1",rb))).append("', 'name':'pr_PROP_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROP_LOT_SIZE_1",rb))).append("', 'name':'pr_PROP_LOT_SIZE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SAFETY_LT_1",rb))).append("', 'name':'pr_SAFETY_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPOIL",rb))).append("', 'name':'pr_SPOIL', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STANDARD_COST",rb))).append("', 'name':'pr_STANDARD_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_ACPT_INSPC_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_WS_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_VEND_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_ITEM_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_PLANT_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_PS_EDITION', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
%>
<%
 int aAA0170010StructLength = aAA0170010Control.getListsize();
 final AA0170010Struct structBackup = aAA0170010Struct;
 aAA0170010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0170010StructLength; ++loopCount) {
  if((aAA0170010Struct = (AA0170010Struct) aAA0170010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0170010Struct", aAA0170010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0170010view2_DB.append("[");
 AA0170010view2_DB.append(loopCount);
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PROC_CD\" data-name=\"pr_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PROC_CD())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PROC_NAME\" data-name=\"pr_PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PROC_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PROC_NO-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PROC_NO\" data-name=\"pr_PROC_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PROC_NO())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_OUTSIDE_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_OUTSIDE_NAME\" data-name=\"pr_OUTSIDE_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_OUTSIDE_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_WS_CD\" data-name=\"pr_WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_WS_CD())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_VEND_CD\" data-name=\"pr_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_VEND_CD())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_ACPT_INSPC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_ACPT_INSPC_NAME\" data-name=\"pr_ACPT_INSPC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_ACPT_INSPC_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_FIXED_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_FIXED_LT\" data-name=\"pr_FIXED_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_FIXED_LT())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PROP_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PROP_LT\" data-name=\"pr_PROP_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PROP_LT())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PROP_LOT_SIZE-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PROP_LOT_SIZE\" data-name=\"pr_PROP_LOT_SIZE\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PROP_LOT_SIZE())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_SAFETY_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_SAFETY_LT\" data-name=\"pr_SAFETY_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_SAFETY_LT())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_SPOIL-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_SPOIL\" data-name=\"pr_SPOIL\" data-view=\"true\" data-kind=\"OBT_NUMBER;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_SPOIL())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_STANDARD_COST-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_STANDARD_COST\" data-name=\"pr_STANDARD_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_STANDARD_COST())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_OUTSIDE_TYP\" data-name=\"pr_OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_OUTSIDE_TYP())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_ACPT_INSPC_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_ACPT_INSPC_TYP\" data-name=\"pr_ACPT_INSPC_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_ACPT_INSPC_TYP())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_MODIFY_COUNT\" data-name=\"pr_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_MODIFY_COUNT())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_WS_NAME\" data-name=\"pr_WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_WS_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_VEND_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_VEND_NAME\" data-name=\"pr_VEND_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_VEND_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_ITEM_CD\" data-name=\"pr_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_ITEM_CD())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_ITEM_NAME\" data-name=\"pr_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_ITEM_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_STOCK_UNIT\" data-name=\"pr_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_STOCK_UNIT())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PLANT_CD\" data-name=\"pr_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PLANT_CD())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PS_EDITION-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PS_EDITION\" data-name=\"pr_PS_EDITION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PS_EDITION())).append("</span>'");
 AA0170010view2_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0170010StructLength) {
   AA0170010view2_DB.append(",");
  }
 }
 aAA0170010Struct = structBackup;
 viewIdList.add(AA0170010view2_Id);
 viewSelectList.add(AA0170010view2_select);
 viewResizeList.add(AA0170010view2_resize);
 viewScrollList.add(AA0170010view2_scroll);
 viewHeaderDataList.add(AA0170010view2_HB);
 viewBodyDataList.add(AA0170010view2_DB);
%>
<%
}
%>
<%
                aAA0170010Control.setList(listBackup);
%><%
MessageStruct msgStruct = aAA0170010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0170010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0170010)) {
  expj.common.treeInstanceMap.AA0170010 = {};
}
expj.common.treeInstanceMap.AA0170010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0170010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0170010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0170010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0170010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0170010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010)) {
  expj.common.detailDialogMap.AA0170010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0170010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0170010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0170010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0170010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0170010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0170010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0170010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0170010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0170010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0170010)) {
  expj.common.viewInstanceMap.AA0170010 = {};
}
expj.common.viewInstanceMap.AA0170010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0170010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0170010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0170010.<%=viewId %>.init = function () {
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
    expj.AA0170010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0170010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0170010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0170010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0170010_init">
/**
 * AA0170010用のロード完了時初期化関数
 */
expj.AA0170010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0170010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0170010');
  expj.common.calendarInstanceMap.AA0170010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0170010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0170010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0170010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0170010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0170010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0170010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0170010.AA0170010view2.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0170010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0170010', 'AA0170010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0170010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0170010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0170010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0170010', '<%=request.getContextPath() %>');
};

/**
 * AA0170010の全体onDecision処理
 */
expj.AA0170010.executeAllOnDecision = function () {
  expj.AA0170010.AA0170010view2.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0170010_console">
expj.AA0170010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>