<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:31:09 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0040\AD0040010iframe.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0040.*" %>
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
<jsp:useBean id="aAD0040010Control" class="com.nec.jp.orteus.metamorBase.AD0040.AD0040010Control" scope="request"/>
<jsp:useBean id="aAD0040010Struct" class="com.nec.jp.orteus.metamorBase.AD0040.AD0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

表示変更
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0040/jsp/AD0040010iframe.jsp,v $
$Author: geng-jia $
$Revision: 1.25 $ $Date: 2017/02/22 02:04:47 $
********************************************************* --%>
<html>
<head>
<title>表示変更</title>
<%@include file="common/expj_v5.jsp" %>
<script>
	var data = "<root>";
	
	function onInitializeOnLoad(){
		setDataGridDataParent("AD0040010",data + "</root>");
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
<script class="expj-script-AD0040010_init">
  // AD0040010名前空間
  expj.AD0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
              <%
                List listBackup = aAD0040010Control.getList();
                aAD0040010Control.setList(aAD0040010Control.getIssueList());
              %>
              <script class="expj-script-AD0040010-AD0040010view2">
expj.AD0040010.AD0040010view2 = {};
expj.AD0040010.AD0040010view2.executeAllOnClick = function () {
};
expj.AD0040010.AD0040010view2.executeAllOnDecision = function () {
  console.log('execute AD0040010view2.onDecision');
};
expj.AD0040010.AD0040010view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0040010view2", "expj.AD0040010.AD0040010view2.executeAllOnClick");
%>
  expj.AD0040010.AD0040010view2.executePScriptOnLoad();
};

expj.AD0040010.AD0040010view2.executePScriptOnLoad = function () {
  console.log('execute AD0040010view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0040010-AD0040010view2" class="expj-datagrid-view expj-view-single" style="width:100%;height:156px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0040010view2_Id = "AD0040010view2";
 String AD0040010view2_select = "single";
 String AD0040010view2_sortable = "true";
 String AD0040010view2_resize = "true";
 String AD0040010view2_scroll = "true";
 StringBuffer AD0040010view2_HB = new StringBuffer();
 StringBuffer AD0040010view2_DB = new StringBuffer();
%>
<%
 AD0040010view2_select = "single";
 AD0040010view2_sortable = "true";
 AD0040010view2_resize = "true";
 AD0040010view2_scroll = "true";
%>
<%
 AD0040010view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
%>
    <%
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PARTIAL_PRD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD_5",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME_2",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'l_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_TYP",rb))).append("', 'name':'ISSUE_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_ISSUE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0320",rb))).append("', 'name':'TEMP_PLAN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0321",rb))).append("', 'name':'TEMP_USEOVER_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0322",rb))).append("', 'name':'TEMP_PLANOUT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0323",rb))).append("', 'name':'TEMP_USE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_UNIT_NUMERATOR_2",rb))).append("', 'name':'h_ISSUE_INST_UNIT_NUMERATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_UNIT_DENOMINATOR_2",rb))).append("', 'name':'h_ISSUE_INST_UNIT_DENOMINATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ISSUE_INST_UNIT_FRACTION', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
%>
<%
 int aAD0040010StructLength = aAD0040010Control.getListsize();
 final AD0040010Struct structBackup = aAD0040010Struct;
 aAD0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0040010StructLength; ++loopCount) {
  if((aAD0040010Struct = (AD0040010Struct) aAD0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0040010Struct", aAD0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0040010view2_DB.append("[");
 AD0040010view2_DB.append(loopCount);
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-l_PARTIAL_PRD_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-l_PARTIAL_PRD_NO\" data-name=\"l_PARTIAL_PRD_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER_P;6\">").append(TypeConverter.sanitizer(aAD0040010Struct.getl_PARTIAL_PRD_NO())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getl_ITEM_CD())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getl_ITEM_NAME())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-l_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-l_LOT_NO\" data-name=\"l_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getl_LOT_NO())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-ISSUE_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-ISSUE_TYP_DN\" data-name=\"ISSUE_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getISSUE_TYP_DN())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-h_ISSUE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-h_ISSUE_TYP\" data-name=\"h_ISSUE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.geth_ISSUE_TYP())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-TEMP_PLAN_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-TEMP_PLAN_QTY\" data-name=\"TEMP_PLAN_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0040010Struct.getTEMP_PLAN_QTY())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-TEMP_USEOVER_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-TEMP_USEOVER_QTY\" data-name=\"TEMP_USEOVER_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0040010Struct.getTEMP_USEOVER_QTY())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-TEMP_PLANOUT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-TEMP_PLANOUT_QTY\" data-name=\"TEMP_PLANOUT_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0040010Struct.getTEMP_PLANOUT_QTY())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-TEMP_USE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-TEMP_USE_QTY\" data-name=\"TEMP_USE_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0040010Struct.getTEMP_USE_QTY())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-h_ISSUE_INST_UNIT_NUMERATOR-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-h_ISSUE_INST_UNIT_NUMERATOR\" data-name=\"h_ISSUE_INST_UNIT_NUMERATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aAD0040010Struct.geth_ISSUE_INST_UNIT_NUMERATOR())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-h_ISSUE_INST_UNIT_DENOMINATOR-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-h_ISSUE_INST_UNIT_DENOMINATOR\" data-name=\"h_ISSUE_INST_UNIT_DENOMINATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aAD0040010Struct.geth_ISSUE_INST_UNIT_DENOMINATOR())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-ISSUE_INST_UNIT_FRACTION-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-ISSUE_INST_UNIT_FRACTION\" data-name=\"ISSUE_INST_UNIT_FRACTION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getISSUE_INST_UNIT_FRACTION())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-h_ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-h_ISSUE_INST_CD\" data-name=\"h_ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.geth_ISSUE_INST_CD())).append("</span>'");
 AD0040010view2_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0040010StructLength) {
   AD0040010view2_DB.append(",");
  }
 }
 aAD0040010Struct = structBackup;
 viewIdList.add(AD0040010view2_Id);
 viewSelectList.add(AD0040010view2_select);
 viewResizeList.add(AD0040010view2_resize);
 viewScrollList.add(AD0040010view2_scroll);
 viewHeaderDataList.add(AD0040010view2_HB);
 viewBodyDataList.add(AD0040010view2_DB);
%>
<%
}
%>
<%
                aAD0040010Control.setList(listBackup);
%><%
MessageStruct msgStruct = aAD0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0040010)) {
  expj.common.treeInstanceMap.AD0040010 = {};
}
expj.common.treeInstanceMap.AD0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010)) {
  expj.common.detailDialogMap.AD0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0040010)) {
  expj.common.viewInstanceMap.AD0040010 = {};
}
expj.common.viewInstanceMap.AD0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0040010.<%=viewId %>.init = function () {
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
    expj.AD0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0040010_init">
/**
 * AD0040010用のロード完了時初期化関数
 */
expj.AD0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0040010');
  expj.common.calendarInstanceMap.AD0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0040010.AD0040010view2.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0040010', 'AD0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0040010', '<%=request.getContextPath() %>');
};

/**
 * AD0040010の全体onDecision処理
 */
expj.AD0040010.executeAllOnDecision = function () {
  expj.AD0040010.AD0040010view2.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0040010_console">
expj.AD0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>