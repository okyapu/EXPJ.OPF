<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:30:11 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0020\AD0020010Detail.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0020.*" %>
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
<jsp:useBean id="aAD0020010Control" class="com.nec.jp.orteus.metamorBase.AD0020.AD0020010Control" scope="request"/>
<jsp:useBean id="aAD0020010Struct" class="com.nec.jp.orteus.metamorBase.AD0020.AD0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
�ڍ�
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0020/jsp/AD0020010Detail.jsp,v $
$Author: geng-jia $	
$Revision: 1.11 $ $Date: 2017/02/22 02:04:41 $
********************************************************* --%>
<html>
<head>
<title>�ڍ�</title>
<%@include file="common/expj_v5.jsp" %>
<script>
	var data = "<root>";
	
	function onInitializeOnLoad(){
		setDataGridDataParent("AD0020010",data + "</root>");
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
<script class="expj-script-AD0020010_init">
  // AD0020010���O���
  expj.AD0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<script class="expj-script-AD0020010-AD0020010detailview1">
expj.AD0020010.AD0020010detailview1 = {};
expj.AD0020010.AD0020010detailview1.executeAllOnDecision = function () {
  console.log('execute AD0020010detailview1.onDecision');
};
expj.AD0020010.AD0020010detailview1.executeOnLoad = function () {
  expj.AD0020010.AD0020010detailview1.executePScriptOnLoad();
};

expj.AD0020010.AD0020010detailview1.executePScriptOnLoad = function () {
  console.log('execute AD0020010detailview1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAD0020010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AD0020010-AD0020010detailview1" class="expj-datagird-detail" data-float="" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AD0020010detailview1";
 detailFloat = "";
 detailWidth = 358;
 detailHeight = 372 + 47;
 String AD0020010detailview1_Id = "AD0020010detailview1";
 String AD0020010detailview1_select = "single";
 String AD0020010detailview1_sortable = "true";
 String AD0020010detailview1_resize = "true";
 String AD0020010detailview1_scroll = "true";
 StringBuffer AD0020010detailview1_HB = new StringBuffer();
 StringBuffer AD0020010detailview1_DB = new StringBuffer();
%>
<%
 AD0020010detailview1_sortable = "false";
 AD0020010detailview1_select = "none";
%>
<% AD0020010detailview1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AD0020010detailview1_sortable).append("}").append(","); %>
<%  AD0020010detailview1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AD0020010detailview1_sortable).append("}").append(",");
AD0020010detailview1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AD0020010detailview1_sortable).append("}").append(",");
AD0020010detailview1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AD0020010detailview1_sortable).append("}").append(",");
 %>
  <% AD0020010detailview1_DB.append("['1','").append(CoreTools.getRBString("Expj.JOB_ODR_TYP",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-JOB_ODR_TYP_DN\" class=\"expj-label\" data-name=\"JOB_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getJOB_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['2','").append(CoreTools.getRBString("Expj.ALC_GRP_CD",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-ALC_GRP_CD\" class=\"expj-label\" data-name=\"ALC_GRP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getALC_GRP_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['3','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['4','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['5','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-OUTSIDE_TYP_DN\" class=\"expj-label\" data-name=\"OUTSIDE_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getOUTSIDE_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['6','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-MRP_ODR_TYP_DN\" class=\"expj-label\" data-name=\"MRP_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getMRP_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['7','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AD0020010-AD0020010detailview1-ITEM_SPOIL\" class=\"expj-label\" data-name=\"ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;9.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0020010Struct.getITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['8','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-UNIT_QTY_TYP_DN\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getUNIT_QTY_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['9','").append(CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-JOB_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"JOB_ODR_DLV_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getJOB_ODR_DLV_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['10','").append(CoreTools.getRBString("Expj.DUE_DATE",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-DUE_DATE\" class=\"expj-label\" data-name=\"DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getDUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['11','").append(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-PRD_DUE_DATE\" class=\"expj-label\" data-name=\"PRD_DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getPRD_DUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['12','").append(CoreTools.getRBString("Expj.PRD_START_DATE",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-PRD_START_DATE\" class=\"expj-label\" data-name=\"PRD_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getPRD_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['13','").append(CoreTools.getRBString("Expj.ODR_START_DATE",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-ODR_START_DATE\" class=\"expj-label\" data-name=\"ODR_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getODR_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['14','").append(CoreTools.getRBString("Expj.OPR_INST_QTY_1",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AD0020010-AD0020010detailview1-SUM_OPR_INST_QTY\" class=\"expj-label\" data-name=\"SUM_OPR_INST_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0020010Struct.getSUM_OPR_INST_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AD0020010-AD0020010detailview1-d1_STOCK_UNIT\" class=\"expj-label\" data-name=\"d1_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['15','").append(CoreTools.getRBString("Expj.PUCH_ODR_QTY_2",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AD0020010-AD0020010detailview1-SUM_PUCH_ODR_QTY\" class=\"expj-label\" data-name=\"SUM_PUCH_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0020010Struct.getSUM_PUCH_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AD0020010-AD0020010detailview1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['16','").append(CoreTools.getRBString("Expj.ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AD0020010-AD0020010detailview1-ODR_QTY\" class=\"expj-label\" data-name=\"ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0020010Struct.getODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AD0020010-AD0020010detailview1-d2_STOCK_UNIT\" class=\"expj-label\" data-name=\"d2_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['17','").append(CoreTools.getRBString("Expj.DM_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AD0020010-AD0020010detailview1-DM_QTY\" class=\"expj-label\" data-name=\"DM_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0020010Struct.getDM_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AD0020010-AD0020010detailview1-d3_STOCK_UNIT\" class=\"expj-label\" data-name=\"d3_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['18','").append(CoreTools.getRBString("Expj.ALCD_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AD0020010-AD0020010detailview1-SUM_ALCD_QTY\" class=\"expj-label\" data-name=\"SUM_ALCD_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0020010Struct.getSUM_ALCD_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AD0020010-AD0020010detailview1-d4_STOCK_UNIT\" class=\"expj-label\" data-name=\"d4_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['19','").append(CoreTools.getRBString("Expj.ODR_STS_TYP",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-ODR_STS_TYP_DN\" class=\"expj-label\" data-name=\"ODR_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getODR_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0020010detailview1_DB.append("['20','").append(CoreTools.getRBString("Expj.DM_STS_TYP",rb)).append("','").append("<span id=\"expj-AD0020010-AD0020010detailview1-DM_STS_TYP_DN\" class=\"expj-label\" data-name=\"DM_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0020010Struct.getDM_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AD0020010detailview1_Id;
 detailViewSelect = AD0020010detailview1_select;
 detailViewResize = AD0020010detailview1_resize;
 detailViewScroll = AD0020010detailview1_scroll;
 detailViewHeaderData = AD0020010detailview1_HB;
 detailViewBodyData = AD0020010detailview1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAD0020010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AD0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0020010)) {
  expj.common.treeInstanceMap.AD0020010 = {};
}
expj.common.treeInstanceMap.AD0020010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AD0020010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AD0020010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AD0020010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
expj.common.treeInstanceMap.AD0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js�錾
 if (detailId != null) {
%>
<script class="expj-script-AD0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020010)) {
  expj.common.detailDialogMap.AD0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AD0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
  expj.common.detailDialogMap.AD0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS�錾(END)

//VIEW JS�錾
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-AD0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0020010)) {
  expj.common.viewInstanceMap.AD0020010 = {};
}
expj.common.viewInstanceMap.AD0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0020010.<%=viewId %>.init = function () {
  // DataGrid(VIEW)�̃{�f�B�f�[�^
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)�̃w�b�_�[�f�[�^
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
    expj.AD0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0020010_init">
/**
 * AD0020010�p�̃��[�h�������������֐�
 */
expj.AD0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0020010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AD0020010');
  expj.common.calendarInstanceMap.AD0020010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AD0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AD0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0020010.AD0020010detailview1.executeOnLoad();}catch(e){};
  // �R���\�[���o��
  expj.AD0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0020010', 'AD0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0020010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AD0020010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AD0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AD0020010', '<%=request.getContextPath() %>');
};

/**
 * AD0020010�̑S��onDecision����
 */
expj.AD0020010.executeAllOnDecision = function () {
  expj.AD0020010.AD0020010detailview1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0020010_console">
expj.AD0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>