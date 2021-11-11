<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:34:56 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AE0060\AE0060020iframe.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0060.*" %>
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
<jsp:useBean id="aAE0060020Control" class="com.nec.jp.orteus.metamorBase.AE0060.AE0060020Control" scope="request"/>
<jsp:useBean id="aAE0060020Struct" class="com.nec.jp.orteus.metamorBase.AE0060.AE0060020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

表示変更
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/jsp/AE0060020iframe.jsp,v $
$Author: geng-jia $
$Revision: 1.39 $ $Date: 2017/02/22 02:05:14 $
********************************************************* --%>
<html>
<head>
<title>表示変更</title>
<%@include file="common/expj_v5.jsp" %>
<script>
	var data = "<root>";
	
	function onInitializeOnLoad(){
		setDataGridDataParent("AE0060020",data + "</root>");
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
<script class="expj-script-AE0060020_init">
  // AE0060020名前空間
  expj.AE0060020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
              <%
                List listBackup = aAE0060020Control.getList();
                aAE0060020Control.setList(aAE0060020Control.getIssueList());
              %>

              <script class="expj-script-AE0060020-AE0060020view2">
expj.AE0060020.AE0060020view2 = {};
expj.AE0060020.AE0060020view2.executeAllOnClick = function () {
};
expj.AE0060020.AE0060020view2.executeAllOnDecision = function () {
  console.log('execute AE0060020view2.onDecision');
};
expj.AE0060020.AE0060020view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0060020view2", "expj.AE0060020.AE0060020view2.executeAllOnClick");
%>
  expj.AE0060020.AE0060020view2.executePScriptOnLoad();
};

expj.AE0060020.AE0060020view2.executePScriptOnLoad = function () {
  console.log('execute AE0060020view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0060020-AE0060020view2" class="expj-datagrid-view expj-view-single" style="width:100%;height:184px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0060020view2_Id = "AE0060020view2";
 String AE0060020view2_select = "single";
 String AE0060020view2_sortable = "true";
 String AE0060020view2_resize = "true";
 String AE0060020view2_scroll = "true";
 StringBuffer AE0060020view2_HB = new StringBuffer();
 StringBuffer AE0060020view2_DB = new StringBuffer();
%>
<%
 AE0060020view2_select = "single";
 AE0060020view2_sortable = "true";
 AE0060020view2_resize = "true";
 AE0060020view2_scroll = "true";
%>
<%
 AE0060020view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
%>
    <%
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD_10",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME_3",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'l_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SUPPLIED_ISSUE_GNR_TYP",rb))).append("', 'name':'l_SUPPLIED_GNR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SUPPLIED_ISSUE_QTY",rb))).append("', 'name':'l_SUPPLIED_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0357",rb))).append("', 'name':'l_SUPPLIED_RE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0321",rb))).append("', 'name':'l_TOTAL_ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_STOCK_UNIT2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_ISSUE_DATE_1",rb))).append("', 'name':'l_SUPPLIED_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0356",rb))).append("', 'name':'l_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PART_SUPPLIED_COMMENT",rb))).append("', 'name':'l_PART_SUPPLIED_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_CD",rb))).append("', 'name':'l_ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'l_MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SUPPLIED_UNIT_DENOMINATOR",rb))).append("', 'name':'l_SUPPLIED_UNIT_DENOMINATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SUPPLIED_UNIT_NUMERATOR",rb))).append("', 'name':'l_SUPPLIED_UNIT_NUMERATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
%>
<%
 int aAE0060020StructLength = aAE0060020Control.getListsize();
 final AE0060020Struct structBackup = aAE0060020Struct;
 aAE0060020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0060020StructLength; ++loopCount) {
  if((aAE0060020Struct = (AE0060020Struct) aAE0060020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0060020Struct", aAE0060020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0060020view2_DB.append("[");
 AE0060020view2_DB.append(loopCount);
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_ITEM_CD())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_ITEM_NAME())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_LOT_NO\" data-name=\"l_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_LOT_NO())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_JOB_ODR_CD())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_GNR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_GNR_TYP\" data-name=\"l_SUPPLIED_GNR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_GNR_TYP())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_QTY\" data-name=\"l_SUPPLIED_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_QTY())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_RE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_RE_QTY\" data-name=\"l_SUPPLIED_RE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_RE_QTY())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_TOTAL_ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_TOTAL_ISSUE_QTY\" data-name=\"l_TOTAL_ISSUE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_TOTAL_ISSUE_QTY())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_STOCK_UNIT2-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_STOCK_UNIT2\" data-name=\"l_STOCK_UNIT2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_STOCK_UNIT2())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_DATE\" data-name=\"l_SUPPLIED_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_DATE())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_HAND_QTY\" data-name=\"l_HAND_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_HAND_QTY())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_PART_SUPPLIED_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_PART_SUPPLIED_COMMENT\" data-name=\"l_PART_SUPPLIED_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_PART_SUPPLIED_COMMENT())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_ISSUE_INST_CD\" data-name=\"l_ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_ISSUE_INST_CD())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_MRP_ODR_TYP\" data-name=\"l_MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_MRP_ODR_TYP())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_UNIT_DENOMINATOR-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_UNIT_DENOMINATOR\" data-name=\"l_SUPPLIED_UNIT_DENOMINATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_UNIT_DENOMINATOR())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_UNIT_NUMERATOR-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_UNIT_NUMERATOR\" data-name=\"l_SUPPLIED_UNIT_NUMERATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_UNIT_NUMERATOR())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_UNIT_QTY_TYP\" data-name=\"l_UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_UNIT_QTY_TYP())).append("</span>'");
 AE0060020view2_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0060020StructLength) {
   AE0060020view2_DB.append(",");
  }
 }
 aAE0060020Struct = structBackup;
 viewIdList.add(AE0060020view2_Id);
 viewSelectList.add(AE0060020view2_select);
 viewResizeList.add(AE0060020view2_resize);
 viewScrollList.add(AE0060020view2_scroll);
 viewHeaderDataList.add(AE0060020view2_HB);
 viewBodyDataList.add(AE0060020view2_DB);
%>
<%
}
%>
<%
                aAE0060020Control.setList(listBackup);
%><%
MessageStruct msgStruct = aAE0060020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0060020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0060020)) {
  expj.common.treeInstanceMap.AE0060020 = {};
}
expj.common.treeInstanceMap.AE0060020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0060020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0060020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0060020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0060020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0060020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0060020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0060020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0060020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0060020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0060020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060020)) {
  expj.common.detailDialogMap.AE0060020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0060020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060020.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0060020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0060020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0060020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0060020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0060020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0060020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0060020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0060020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0060020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0060020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0060020)) {
  expj.common.viewInstanceMap.AE0060020 = {};
}
expj.common.viewInstanceMap.AE0060020.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0060020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0060020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0060020.<%=viewId %>.init = function () {
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
    expj.AE0060020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0060020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0060020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0060020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0060020_init">
/**
 * AE0060020用のロード完了時初期化関数
 */
expj.AE0060020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0060020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0060020');
  expj.common.calendarInstanceMap.AE0060020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0060020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0060020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0060020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0060020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0060020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0060020-<%=detailId %>');
<%
 }
%>
  try{expj.AE0060020.AE0060020view2.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0060020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0060020', 'AE0060020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0060020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0060020-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0060020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0060020', '<%=request.getContextPath() %>');
};

/**
 * AE0060020の全体onDecision処理
 */
expj.AE0060020.executeAllOnDecision = function () {
  expj.AE0060020.AE0060020view2.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0060020_console">
expj.AE0060020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>