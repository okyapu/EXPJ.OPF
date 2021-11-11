<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 13 16:29:50 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0060\AZ0060010Detail.html
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
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0060/jsp/AZ0060010Detail.jsp,v $
$Author: geng-jia $
$Revision: 1.13 $ $Date: 2017/02/22 01:42:12 $
********************************************************* --%>
<html>
<head>
<title>詳細1</title>
<%@include file="common/expj_v5.jsp" %>
<script>
  var data = "<root>";

  function onInitializeOnLoad(){
	setDataGridDataParent("AZ0060010",data + "</root>");
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
<script class="expj-script-AZ0060010_init">
  // AZ0060010名前空間
  expj.AZ0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<!-- 利用者メンテナンス-->
<%
	if("AA0090030Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.USER_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_USER_CD\" class=\"expj-label\" data-name=\"d_OLD_USER_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_USER_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_USER_CD\" class=\"expj-label\" data-name=\"d_NEW_USER_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_USER_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_USER_CD_CHANGE\" class=\"expj-label\" data-name=\"d_USER_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_USER_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.USER_NAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_USER_NAME\" class=\"expj-label\" data-name=\"d_OLD_USER_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_USER_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_USER_NAME\" class=\"expj-label\" data-name=\"d_NEW_USER_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_USER_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_USER_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_USER_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_USER_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.PLANT_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PLANT_CD\" class=\"expj-label\" data-name=\"d_OLD_PLANT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PLANT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PLANT_CD\" class=\"expj-label\" data-name=\"d_NEW_PLANT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PLANT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PLANT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PLANT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PLANT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.ORG_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SECTION_CD\" class=\"expj-label\" data-name=\"d_OLD_SECTION_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SECTION_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SECTION_CD\" class=\"expj-label\" data-name=\"d_NEW_SECTION_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SECTION_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SECTION_CD_CHANGE\" class=\"expj-label\" data-name=\"d_SECTION_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SECTION_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <script class="expj-script-AZ0060010-AZ0060010Detail1-d_OLD_PASSWORD">
expj.AZ0060010.AZ0060010Detail1.d_OLD_PASSWORD = {};
expj.AZ0060010.AZ0060010Detail1.d_OLD_PASSWORD.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1/d_OLD_PASSWORD.onDecision');
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
  expj.AZ0060010.executeAllOnDecision();
};
expj.AZ0060010.AZ0060010Detail1.d_OLD_PASSWORD.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010Detail1-d_OLD_PASSWORD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0060010', 'AZ0060010Detail1', 'd_OLD_PASSWORD', this);
  });
  expj.AZ0060010.AZ0060010Detail1.d_OLD_PASSWORD.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.d_OLD_PASSWORD.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1/d_OLD_PASSWORD.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010Detail1-d_OLD_PASSWORD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AZ0060010-AZ0060010Detail1-d_NEW_PASSWORD">
expj.AZ0060010.AZ0060010Detail1.d_NEW_PASSWORD = {};
expj.AZ0060010.AZ0060010Detail1.d_NEW_PASSWORD.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1/d_NEW_PASSWORD.onDecision');
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
  expj.AZ0060010.executeAllOnDecision();
};
expj.AZ0060010.AZ0060010Detail1.d_NEW_PASSWORD.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010Detail1-d_NEW_PASSWORD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0060010', 'AZ0060010Detail1', 'd_NEW_PASSWORD', this);
  });
  expj.AZ0060010.AZ0060010Detail1.d_NEW_PASSWORD.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.d_NEW_PASSWORD.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1/d_NEW_PASSWORD.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010Detail1-d_NEW_PASSWORD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.PASSWORD",rb)).append("','").append("<input type=\"password\" id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PASSWORD\" data-detailItem=\"true\" name=\"d_OLD_PASSWORD\" class=\" \" style=\"width:100%;\" data-kind=\"\" value=\"").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PASSWORD())).append("\"").append(" maxlength=\"2147483647\" >").append("','").append("<input type=\"password\" id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PASSWORD\" data-detailItem=\"true\" name=\"d_NEW_PASSWORD\" class=\" \" style=\"width:100%;\" data-kind=\"\" value=\"").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PASSWORD())).append("\"").append(" maxlength=\"2147483647\" >").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PASSWORD_CHANGE\" class=\"expj-label\" data-name=\"d_PASSWORD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PASSWORD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.Cmt3161",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_APPR_POWER_TYP\" class=\"expj-label\" data-name=\"d_OLD_APPR_POWER_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_APPR_POWER_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_APPR_POWER_TYP\" class=\"expj-label\" data-name=\"d_NEW_APPR_POWER_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_APPR_POWER_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_APPR_POWER_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_APPR_POWER_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_APPR_POWER_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.EMAIL",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.LOCALE",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_LOCALE\" class=\"expj-label\" data-name=\"d_OLD_LOCALE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_LOCALE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_LOCALE\" class=\"expj-label\" data-name=\"d_NEW_LOCALE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_LOCALE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_LOCALE_CHANGE\" class=\"expj-label\" data-name=\"d_LOCALE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_LOCALE_CHANGE())).append("</span>").append("']").append(",");%>
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
  try{expj.AZ0060010.AZ0060010Detail1.d_OLD_PASSWORD.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010Detail1.d_NEW_PASSWORD.executeOnLoad();}catch(e){};
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
if("KA0040010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_OLD_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_NEW_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EFF_PHASE_IN_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_EFF_PHASE_IN_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EFF_PHASE_IN_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 支給品単価メンテナンス --><%
if("AA0040030Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_OLD_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_NEW_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EFF_PHASE_IN_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_EFF_PHASE_IN_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EFF_PHASE_IN_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.ONEROUS_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ONEROUS_FLG\" class=\"expj-label\" data-name=\"d_OLD_ONEROUS_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ONEROUS_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ONEROUS_FLG\" class=\"expj-label\" data-name=\"d_NEW_ONEROUS_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ONEROUS_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ONEROUS_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_ONEROUS_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ONEROUS_FLG_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 外注単価メンテナンス、メイン画面--><%
if("AA0040020Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_SBCNT_UNIT_COST_H".equals(aAZ0060010Control.getTable_name())){
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
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.PROC_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PROC_CD\" class=\"expj-label\" data-name=\"d_OLD_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PROC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PROC_CD\" class=\"expj-label\" data-name=\"d_NEW_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PROC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PROC_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PROC_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PROC_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.VEND_ITEM_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_ITEM_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_ITEM_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_ITEM_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_ITEM_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_ITEM_CD_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 外注単価メンテナンス、サッブ画面--><%
if("AA0040020Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_SBCNT_UNIT_COST".equals(aAZ0060010Control.getTable_name())){
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
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.PROC_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PROC_CD\" class=\"expj-label\" data-name=\"d_OLD_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PROC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PROC_CD\" class=\"expj-label\" data-name=\"d_NEW_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PROC_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PROC_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PROC_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PROC_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_OLD_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_NEW_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EFF_PHASE_IN_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_EFF_PHASE_IN_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EFF_PHASE_IN_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;ROUND;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;ROUND;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.PROCESSING_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PROCESSING_COST\" class=\"expj-label\" data-name=\"d_OLD_PROCESSING_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PROCESSING_COST())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PROCESSING_COST\" class=\"expj-label\" data-name=\"d_NEW_PROCESSING_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PROCESSING_COST())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PROCESSING_COST_CHANGE\" class=\"expj-label\" data-name=\"d_PROCESSING_COST_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PROCESSING_COST_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.MATERIAL_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MATERIAL_COST\" class=\"expj-label\" data-name=\"d_OLD_MATERIAL_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MATERIAL_COST())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MATERIAL_COST\" class=\"expj-label\" data-name=\"d_NEW_MATERIAL_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MATERIAL_COST())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MATERIAL_COST_CHANGE\" class=\"expj-label\" data-name=\"d_MATERIAL_COST_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MATERIAL_COST_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OTHER_OVERHEADS\" class=\"expj-label\" data-name=\"d_OLD_OTHER_OVERHEADS\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OTHER_OVERHEADS())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OTHER_OVERHEADS\" class=\"expj-label\" data-name=\"d_NEW_OTHER_OVERHEADS\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OTHER_OVERHEADS())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OTHER_OVERHEADS_CHANGE\" class=\"expj-label\" data-name=\"d_OTHER_OVERHEADS_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OTHER_OVERHEADS_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 為替レート情報メンテナンス--><%
if("AA0120010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("通貨コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUR_CD\" class=\"expj-label\" data-name=\"d_OLD_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUR_CD\" class=\"expj-label\" data-name=\"d_NEW_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUR_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUR_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUR_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("為替種別").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_TYP\" class=\"expj-label\" data-name=\"d_OLD_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_TYP\" class=\"expj-label\" data-name=\"d_NEW_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("為替予約コード").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_RESERVE_CD\" class=\"expj-label\" data-name=\"d_OLD_EXCH_RESERVE_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_RESERVE_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_RESERVE_CD\" class=\"expj-label\" data-name=\"d_NEW_EXCH_RESERVE_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_RESERVE_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_RESERVE_CD_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_RESERVE_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_RESERVE_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("為替開始日付").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_START_DATE\" class=\"expj-label\" data-name=\"d_OLD_EXCH_START_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_START_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_START_DATE\" class=\"expj-label\" data-name=\"d_NEW_EXCH_START_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_START_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_START_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_START_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_START_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("為替レート").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_RATE\" class=\"expj-label\" data-name=\"d_OLD_EXCH_RATE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_RATE())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_RATE\" class=\"expj-label\" data-name=\"d_NEW_EXCH_RATE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_RATE())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_RATE_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_RATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_RATE_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 購入単価メンテナンス メイン画面--><%
if("AA0040010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_PUCH_UNIT_COST_H".equals(aAZ0060010Control.getTable_name())){
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
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.PUCH_PRIORITY_REF_NO_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PUCH_PRIORITY_REF_NO\" class=\"expj-label\" data-name=\"d_OLD_PUCH_PRIORITY_REF_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PUCH_PRIORITY_REF_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PUCH_PRIORITY_REF_NO\" class=\"expj-label\" data-name=\"d_NEW_PUCH_PRIORITY_REF_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PUCH_PRIORITY_REF_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PUCH_PRIORITY_REF_NO_CHANGE\" class=\"expj-label\" data-name=\"d_PUCH_PRIORITY_REF_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PUCH_PRIORITY_REF_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.VEND_ITEM_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_ITEM_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_ITEM_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_ITEM_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_ITEM_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_ITEM_CD_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 購入単価メンテナンス サッブ画面表示する項目--><%
if("AA0040010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_PUCH_UNIT_COST".equals(aAZ0060010Control.getTable_name())){
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
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_OLD_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_NEW_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EFF_PHASE_IN_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_EFF_PHASE_IN_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EFF_PHASE_IN_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.PUCH_SIZE",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PUCH_SIZE\" class=\"expj-label\" data-name=\"d_OLD_PUCH_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PUCH_SIZE())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PUCH_SIZE\" class=\"expj-label\" data-name=\"d_NEW_PUCH_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PUCH_SIZE())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PUCH_SIZE_CHANGE\" class=\"expj-label\" data-name=\"d_PUCH_SIZE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PUCH_SIZE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;ROUND;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;ROUND;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.PROCESSING_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PROCESSING_COST\" class=\"expj-label\" data-name=\"d_OLD_PROCESSING_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PROCESSING_COST())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PROCESSING_COST\" class=\"expj-label\" data-name=\"d_NEW_PROCESSING_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PROCESSING_COST())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PROCESSING_COST_CHANGE\" class=\"expj-label\" data-name=\"d_PROCESSING_COST_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PROCESSING_COST_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.MATERIAL_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MATERIAL_COST\" class=\"expj-label\" data-name=\"d_OLD_MATERIAL_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MATERIAL_COST())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MATERIAL_COST\" class=\"expj-label\" data-name=\"d_NEW_MATERIAL_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MATERIAL_COST())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MATERIAL_COST_CHANGE\" class=\"expj-label\" data-name=\"d_MATERIAL_COST_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MATERIAL_COST_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OTHER_OVERHEADS\" class=\"expj-label\" data-name=\"d_OLD_OTHER_OVERHEADS\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OTHER_OVERHEADS())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OTHER_OVERHEADS\" class=\"expj-label\" data-name=\"d_NEW_OTHER_OVERHEADS\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OTHER_OVERHEADS())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OTHER_OVERHEADS_CHANGE\" class=\"expj-label\" data-name=\"d_OTHER_OVERHEADS_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OTHER_OVERHEADS_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 取引先メンテナンス--><%
if("AA0070010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.VEND_NAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_NAME\" class=\"expj-label\" data-name=\"d_OLD_VEND_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_NAME\" class=\"expj-label\" data-name=\"d_NEW_VEND_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.VEND_ANAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_ANAME\" class=\"expj-label\" data-name=\"d_OLD_VEND_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_ANAME\" class=\"expj-label\" data-name=\"d_NEW_VEND_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_ANAME_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_ANAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_ANAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.ZIP_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ZIP_CD\" class=\"expj-label\" data-name=\"d_OLD_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ZIP_CD\" class=\"expj-label\" data-name=\"d_NEW_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ZIP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ZIP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ZIP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.ADDRESS_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.ADDRESS_2",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.ADDRESS_K_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.ADDRESS_K_2",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.TEL",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TEL\" class=\"expj-label\" data-name=\"d_OLD_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TEL\" class=\"expj-label\" data-name=\"d_NEW_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TEL_CHANGE\" class=\"expj-label\" data-name=\"d_TEL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TEL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.FAX",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FAX\" class=\"expj-label\" data-name=\"d_OLD_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FAX\" class=\"expj-label\" data-name=\"d_NEW_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FAX_CHANGE\" class=\"expj-label\" data-name=\"d_FAX_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FAX_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.EMAIL",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EMAIL\" class=\"expj-label\" data-name=\"d_OLD_EMAIL\" data-detailItem=\"true\" data-kind=\"OBT_WILD;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EMAIL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EMAIL\" class=\"expj-label\" data-name=\"d_NEW_EMAIL\" data-detailItem=\"true\" data-kind=\"OBT_WILD;\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EMAIL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EMAIL_CHANGE\" class=\"expj-label\" data-name=\"d_EMAIL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EMAIL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.VEND_ORG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_ORG\" class=\"expj-label\" data-name=\"d_OLD_VEND_ORG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_ORG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_ORG\" class=\"expj-label\" data-name=\"d_NEW_VEND_ORG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_ORG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_ORG_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_ORG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_ORG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.VEND_PERSON",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_PERSON\" class=\"expj-label\" data-name=\"d_OLD_VEND_PERSON\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_PERSON())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_PERSON\" class=\"expj-label\" data-name=\"d_NEW_VEND_PERSON\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_PERSON())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_PERSON_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_PERSON_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_PERSON_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.OWN_ORG_CD_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.OWN_ORG_NAME_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_ORG_NAME\" class=\"expj-label\" data-name=\"d_OLD_OWN_ORG_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_ORG_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_ORG_NAME\" class=\"expj-label\" data-name=\"d_NEW_OWN_ORG_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_ORG_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_ORG_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_ORG_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_ORG_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.OWN_PERSON_CD_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_PERSON_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_PERSON_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_PERSON_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.ROUND_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ROUND_TYP\" class=\"expj-label\" data-name=\"d_OLD_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ROUND_TYP\" class=\"expj-label\" data-name=\"d_NEW_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ROUND_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_ROUND_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ROUND_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.TAX_CD_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CD\" class=\"expj-label\" data-name=\"d_OLD_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CD\" class=\"expj-label\" data-name=\"d_NEW_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.TAX_APPLY_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_APPLY_TYP\" class=\"expj-label\" data-name=\"d_OLD_TAX_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_APPLY_TYP\" class=\"expj-label\" data-name=\"d_NEW_TAX_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_APPLY_TYP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_APPLY_TYP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_APPLY_TYP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.TAX_CALC_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CALC_TYP\" class=\"expj-label\" data-name=\"d_OLD_TAX_CALC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CALC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CALC_TYP\" class=\"expj-label\" data-name=\"d_NEW_TAX_CALC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CALC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CALC_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CALC_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CALC_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['22','").append(CoreTools.getRBString("Expj.INSPC_ACPT_APP_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_INSPC_ACPT_APP_TYP\" class=\"expj-label\" data-name=\"d_OLD_INSPC_ACPT_APP_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_INSPC_ACPT_APP_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_INSPC_ACPT_APP_TYP\" class=\"expj-label\" data-name=\"d_NEW_INSPC_ACPT_APP_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_INSPC_ACPT_APP_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_INSPC_ACPT_APP_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_INSPC_ACPT_APP_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_INSPC_ACPT_APP_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['23','").append(CoreTools.getRBString("Expj.VEND_REM",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_REM\" class=\"expj-label\" data-name=\"d_OLD_VEND_REM\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_REM())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_REM\" class=\"expj-label\" data-name=\"d_NEW_VEND_REM\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_REM())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_REM_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_REM_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_REM_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['24','").append(CoreTools.getRBString("Expj.CUR_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUR_CD\" class=\"expj-label\" data-name=\"d_OLD_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUR_CD\" class=\"expj-label\" data-name=\"d_NEW_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUR_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUR_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUR_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['25','").append(CoreTools.getRBString("Expj.EXCH_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_TYP\" class=\"expj-label\" data-name=\"d_OLD_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_TYP\" class=\"expj-label\" data-name=\"d_NEW_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['26','").append(CoreTools.getRBString("Expj.IMPORT_TRN_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_IMPORT_TRN_TYP\" class=\"expj-label\" data-name=\"d_OLD_IMPORT_TRN_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_IMPORT_TRN_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_IMPORT_TRN_TYP\" class=\"expj-label\" data-name=\"d_NEW_IMPORT_TRN_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_IMPORT_TRN_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_IMPORT_TRN_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_IMPORT_TRN_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_IMPORT_TRN_TYP_CHANGE())).append("</span>").append("']").append(",");%>
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
%><!-- 得意先メンテナンス--><%
if("KA0100010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.CUST_NAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_NAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_NAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.CUST_ANAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_ANAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_ANAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_ANAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_ANAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_ANAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.CUST_KNAME",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_KNAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_KNAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.OWN_ORG_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.OWN_PERSON_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_PERSON_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_PERSON_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_PERSON_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.CUR_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUR_CD\" class=\"expj-label\" data-name=\"d_OLD_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUR_CD\" class=\"expj-label\" data-name=\"d_NEW_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUR_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUR_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUR_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.INSPC_ACPT_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_INSPC_ACPT_TYP\" class=\"expj-label\" data-name=\"d_OLD_INSPC_ACPT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_INSPC_ACPT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_INSPC_ACPT_TYP\" class=\"expj-label\" data-name=\"d_NEW_INSPC_ACPT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_INSPC_ACPT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_INSPC_ACPT_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_INSPC_ACPT_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_INSPC_ACPT_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.EXCH_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_TYP\" class=\"expj-label\" data-name=\"d_OLD_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_TYP\" class=\"expj-label\" data-name=\"d_NEW_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.TAX_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CD\" class=\"expj-label\" data-name=\"d_OLD_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CD\" class=\"expj-label\" data-name=\"d_NEW_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.TAX_CALC_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CALC_TYP\" class=\"expj-label\" data-name=\"d_OLD_TAX_CALC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CALC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CALC_TYP\" class=\"expj-label\" data-name=\"d_NEW_TAX_CALC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CALC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CALC_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CALC_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CALC_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.TAX_APPLY_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_APPLY_TYP\" class=\"expj-label\" data-name=\"d_OLD_TAX_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_APPLY_TYP\" class=\"expj-label\" data-name=\"d_NEW_TAX_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_APPLY_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_APPLY_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_APPLY_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.DETAIL_ROUND_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DETAIL_ROUND_TYP\" class=\"expj-label\" data-name=\"d_OLD_DETAIL_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DETAIL_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DETAIL_ROUND_TYP\" class=\"expj-label\" data-name=\"d_NEW_DETAIL_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DETAIL_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DETAIL_ROUND_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_DETAIL_ROUND_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DETAIL_ROUND_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.EDI_CUST_VEND_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EDI_CUST_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_EDI_CUST_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EDI_CUST_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EDI_CUST_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_EDI_CUST_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EDI_CUST_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EDI_CUST_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_EDI_CUST_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EDI_CUST_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.PARTIAL_SHIP_INST_FLG",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PARTIAL_SHIP_INST_FLG\" class=\"expj-label\" data-name=\"d_OLD_PARTIAL_SHIP_INST_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PARTIAL_SHIP_INST_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PARTIAL_SHIP_INST_FLG\" class=\"expj-label\" data-name=\"d_NEW_PARTIAL_SHIP_INST_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PARTIAL_SHIP_INST_FLG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PARTIAL_SHIP_INST_FLG_CHANGE\" class=\"expj-label\" data-name=\"d_PARTIAL_SHIP_INST_FLG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PARTIAL_SHIP_INST_FLG_CHANGE())).append("</span>").append("']").append(",");%>
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
%><jsp:include page="AZ0060010Detail5.jsp" flush="true"/><jsp:include page="AZ0060010Detail4.jsp" flush="true"/><jsp:include page="AZ0060010Detail3.jsp" flush="true"/><jsp:include page="AZ0060010Detail2.jsp" flush="true"/></html>