<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 13 16:29:58 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0060\AZ0060010Detail4.html
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
�ڍ�
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0060/jsp/AZ0060010Detail4.jsp,v $
$Author: geng-jia $
$Revision: 1.1 $ $Date: 2017/02/22 01:42:16 $
********************************************************* --%>
<html>
<head>
<title>�ڍ�4(JF)</title>
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
  // AZ0060010���O���
  expj.AZ0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>

<!--��s���������e�i���X -->
<%
if("BZ0110010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("�����Ǘ��R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_B_ACCT_CTRL_CD\" class=\"expj-label\" data-name=\"d_OLD_B_ACCT_CTRL_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_B_ACCT_CTRL_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_B_ACCT_CTRL_CD\" class=\"expj-label\" data-name=\"d_NEW_B_ACCT_CTRL_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_B_ACCT_CTRL_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_B_ACCT_CTRL_CD_CHANGE\" class=\"expj-label\" data-name=\"d_B_ACCT_CTRL_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_B_ACCT_CTRL_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("�����Ǘ�����").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_B_ACCT_MNG_NAME\" class=\"expj-label\" data-name=\"d_OLD_B_ACCT_MNG_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_B_ACCT_MNG_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_B_ACCT_MNG_NAME\" class=\"expj-label\" data-name=\"d_NEW_B_ACCT_MNG_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_B_ACCT_MNG_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_B_ACCT_MNG_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_B_ACCT_MNG_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_B_ACCT_MNG_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("��s�R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_CD\" class=\"expj-label\" data-name=\"d_OLD_BANK_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_CD\" class=\"expj-label\" data-name=\"d_NEW_BANK_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("��s�x�X�R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_BR_CD\" class=\"expj-label\" data-name=\"d_OLD_BANK_BR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_BR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_BR_CD\" class=\"expj-label\" data-name=\"d_NEW_BANK_BR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_BR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_BR_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_BR_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_BR_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("�������").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_B_ACCT_TYP_CD\" class=\"expj-label\" data-name=\"d_OLD_B_ACCT_TYP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_B_ACCT_TYP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_B_ACCT_TYP_CD\" class=\"expj-label\" data-name=\"d_NEW_B_ACCT_TYP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_B_ACCT_TYP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_B_ACCT_TYP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_B_ACCT_TYP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_B_ACCT_TYP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("�����ԍ�").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_B_ACCT_NO\" class=\"expj-label\" data-name=\"d_OLD_B_ACCT_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_B_ACCT_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_B_ACCT_NO\" class=\"expj-label\" data-name=\"d_NEW_B_ACCT_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_B_ACCT_NO())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_B_ACCT_NO_CHANGE\" class=\"expj-label\" data-name=\"d_B_ACCT_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_B_ACCT_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("��������").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_B_ACCT_NAME\" class=\"expj-label\" data-name=\"d_OLD_B_ACCT_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_B_ACCT_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_B_ACCT_NAME\" class=\"expj-label\" data-name=\"d_NEW_B_ACCT_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_B_ACCT_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_B_ACCT_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_B_ACCT_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_B_ACCT_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("�e�a�f�[�^�敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FB_DATA_TYP\" class=\"expj-label\" data-name=\"d_OLD_FB_DATA_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FB_DATA_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FB_DATA_TYP\" class=\"expj-label\" data-name=\"d_NEW_FB_DATA_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FB_DATA_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FB_DATA_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_FB_DATA_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FB_DATA_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("�U���˗��l�R�[�h").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TRF_REQUEST_CD\" class=\"expj-label\" data-name=\"d_OLD_TRF_REQUEST_CD\" data-detailItem=\"true\" data-kind=\"OBT_N;10\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TRF_REQUEST_CD())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TRF_REQUEST_CD\" class=\"expj-label\" data-name=\"d_NEW_TRF_REQUEST_CD\" data-detailItem=\"true\" data-kind=\"OBT_N;10\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TRF_REQUEST_CD())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TRF_REQUEST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TRF_REQUEST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TRF_REQUEST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("��������(�e�a)").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_B_ACCT_FB_NAME\" class=\"expj-label\" data-name=\"d_OLD_B_ACCT_FB_NAME\" data-detailItem=\"true\" data-kind=\"OBT_TELMO\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_B_ACCT_FB_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_B_ACCT_FB_NAME\" class=\"expj-label\" data-name=\"d_NEW_B_ACCT_FB_NAME\" data-detailItem=\"true\" data-kind=\"OBT_TELMO\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_B_ACCT_FB_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_B_ACCT_FB_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_B_ACCT_FB_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_B_ACCT_FB_NAME_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- �ĕ]���בփ��[�g�����e�i���X--><%
if("BZ0210010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("�ʉ݃R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUR_CD\" class=\"expj-label\" data-name=\"d_OLD_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUR_CD\" class=\"expj-label\" data-name=\"d_NEW_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUR_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUR_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUR_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("�ב֎��").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_TYP\" class=\"expj-label\" data-name=\"d_OLD_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_TYP\" class=\"expj-label\" data-name=\"d_NEW_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("�ב֗\��R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_RESERVE_CD\" class=\"expj-label\" data-name=\"d_OLD_EXCH_RESERVE_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_RESERVE_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_RESERVE_CD\" class=\"expj-label\" data-name=\"d_NEW_EXCH_RESERVE_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_RESERVE_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_RESERVE_CD_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_RESERVE_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_RESERVE_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("�ב֊J�n���t").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_START_DATE\" class=\"expj-label\" data-name=\"d_OLD_EXCH_START_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_START_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_START_DATE\" class=\"expj-label\" data-name=\"d_NEW_EXCH_START_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_START_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_START_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_START_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_START_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("�בփ��[�g").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_RATE\" class=\"expj-label\" data-name=\"d_OLD_EXCH_RATE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_RATE())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_RATE\" class=\"expj-label\" data-name=\"d_NEW_EXCH_RATE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;6\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_RATE())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_RATE_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_RATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_RATE_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- �Ȗڃ����e�i���X--><%
if("BZ0250010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("�ȖڃR�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("�⏕�敪�R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SUB_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_SUB_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SUB_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("���n�敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PRIMITIVE_TYP\" class=\"expj-label\" data-name=\"d_OLD_PRIMITIVE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PRIMITIVE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PRIMITIVE_TYP\" class=\"expj-label\" data-name=\"d_NEW_PRIMITIVE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PRIMITIVE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PRIMITIVE_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_PRIMITIVE_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PRIMITIVE_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("�Ȗږ�").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACCT_NAME\" class=\"expj-label\" data-name=\"d_OLD_ACCT_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACCT_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACCT_NAME\" class=\"expj-label\" data-name=\"d_NEW_ACCT_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACCT_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACCT_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_ACCT_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACCT_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("�Ȗڗ���").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACCT_ANAME\" class=\"expj-label\" data-name=\"d_OLD_ACCT_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACCT_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACCT_ANAME\" class=\"expj-label\" data-name=\"d_NEW_ACCT_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACCT_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACCT_ANAME_CHANGE\" class=\"expj-label\" data-name=\"d_ACCT_ANAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACCT_ANAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("�Ȗږ��i���p�J�i�j").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACCT_KNAME\" class=\"expj-label\" data-name=\"d_OLD_ACCT_KNAME\" data-detailItem=\"true\" data-kind=\"OBT_ANK3_SPC\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACCT_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACCT_KNAME\" class=\"expj-label\" data-name=\"d_NEW_ACCT_KNAME\" data-detailItem=\"true\" data-kind=\"OBT_ANK3_SPC\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACCT_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACCT_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_ACCT_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACCT_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("�ݎ؋敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DR_CR_TYP\" class=\"expj-label\" data-name=\"d_OLD_DR_CR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DR_CR_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DR_CR_TYP\" class=\"expj-label\" data-name=\"d_NEW_DR_CR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DR_CR_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DR_CR_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_DR_CR_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DR_CR_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("�Ȗڋ敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACCT_TYP\" class=\"expj-label\" data-name=\"d_OLD_ACCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACCT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACCT_TYP\" class=\"expj-label\" data-name=\"d_NEW_ACCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACCT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACCT_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_ACCT_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACCT_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("�⏕�敪����l").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SUB_ACCT_TYP_DEFAULT\" class=\"expj-label\" data-name=\"d_OLD_SUB_ACCT_TYP_DEFAULT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SUB_ACCT_TYP_DEFAULT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SUB_ACCT_TYP_DEFAULT\" class=\"expj-label\" data-name=\"d_NEW_SUB_ACCT_TYP_DEFAULT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SUB_ACCT_TYP_DEFAULT())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SUB_ACCT_TYP_DEFAULT_CHANGE\" class=\"expj-label\" data-name=\"d_SUB_ACCT_TYP_DEFAULT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SUB_ACCT_TYP_DEFAULT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("��������敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_INTERNAL_TRN_TYP\" class=\"expj-label\" data-name=\"d_OLD_INTERNAL_TRN_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_INTERNAL_TRN_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_INTERNAL_TRN_TYP\" class=\"expj-label\" data-name=\"d_NEW_INTERNAL_TRN_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_INTERNAL_TRN_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_INTERNAL_TRN_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_INTERNAL_TRN_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_INTERNAL_TRN_TYP_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- ��s�萔�������e�i���X--><%
if("BZ0270010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("��s�R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_BANK_CD\" class=\"expj-label\" data-name=\"d_OLD_BANK_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_BANK_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_BANK_CD\" class=\"expj-label\" data-name=\"d_NEW_BANK_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_BANK_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_BANK_CD_CHANGE\" class=\"expj-label\" data-name=\"d_BANK_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_BANK_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("�U����敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TRF_TYP\" class=\"expj-label\" data-name=\"d_OLD_TRF_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TRF_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TRF_TYP\" class=\"expj-label\" data-name=\"d_NEW_TRF_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TRF_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TRF_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_TRF_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TRF_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("�U�����e�敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CONTENTS_TYP\" class=\"expj-label\" data-name=\"d_OLD_CONTENTS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CONTENTS_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CONTENTS_TYP\" class=\"expj-label\" data-name=\"d_NEW_CONTENTS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CONTENTS_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CONTENTS_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_CONTENTS_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CONTENTS_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("�U�����敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_INFO_TYP\" class=\"expj-label\" data-name=\"d_OLD_INFO_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_INFO_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_INFO_TYP\" class=\"expj-label\" data-name=\"d_NEW_INFO_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_INFO_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_INFO_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_INFO_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_INFO_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("�L���J�n��").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VALID_START_DATE\" class=\"expj-label\" data-name=\"d_OLD_VALID_START_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VALID_START_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VALID_START_DATE\" class=\"expj-label\" data-name=\"d_NEW_VALID_START_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VALID_START_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VALID_START_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_VALID_START_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VALID_START_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("�L���I����").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VALID_END_DATE\" class=\"expj-label\" data-name=\"d_OLD_VALID_END_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VALID_END_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VALID_END_DATE\" class=\"expj-label\" data-name=\"d_NEW_VALID_END_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VALID_END_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VALID_END_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_VALID_END_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VALID_END_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("�������z").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MIN_AMOUNT\" class=\"expj-label\" data-name=\"d_OLD_MIN_AMOUNT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MIN_AMOUNT())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MIN_AMOUNT\" class=\"expj-label\" data-name=\"d_NEW_MIN_AMOUNT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MIN_AMOUNT())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MIN_AMOUNT_CHANGE\" class=\"expj-label\" data-name=\"d_MIN_AMOUNT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MIN_AMOUNT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("������z").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_MAX_AMOUNT\" class=\"expj-label\" data-name=\"d_OLD_MAX_AMOUNT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_MAX_AMOUNT())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_MAX_AMOUNT\" class=\"expj-label\" data-name=\"d_NEW_MAX_AMOUNT\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_MAX_AMOUNT())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_MAX_AMOUNT_CHANGE\" class=\"expj-label\" data-name=\"d_MAX_AMOUNT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_MAX_AMOUNT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("�U���萔��").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TRF_FEE\" class=\"expj-label\" data-name=\"d_OLD_TRF_FEE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TRF_FEE())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TRF_FEE\" class=\"expj-label\" data-name=\"d_NEW_TRF_FEE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TRF_FEE())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TRF_FEE_CHANGE\" class=\"expj-label\" data-name=\"d_TRF_FEE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TRF_FEE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("����ŃR�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CD\" class=\"expj-label\" data-name=\"d_OLD_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CD\" class=\"expj-label\" data-name=\"d_NEW_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CD_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- ����惁���e�i���X--><%
if("CA0020010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("�����R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("����搳����").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_NAME\" class=\"expj-label\" data-name=\"d_OLD_VEND_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_NAME\" class=\"expj-label\" data-name=\"d_NEW_VEND_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("����於").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_ANAME\" class=\"expj-label\" data-name=\"d_OLD_VEND_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_ANAME\" class=\"expj-label\" data-name=\"d_NEW_VEND_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_ANAME_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_ANAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_ANAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("�����J�i��").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_KNAME\" class=\"expj-label\" data-name=\"d_OLD_VEND_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_KNAME\" class=\"expj-label\" data-name=\"d_NEW_VEND_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("�X�֔ԍ�").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ZIP_CD\" class=\"expj-label\" data-name=\"d_OLD_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ZIP_CD\" class=\"expj-label\" data-name=\"d_NEW_ZIP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ZIP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ZIP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ZIP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ZIP_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("�Z���P").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("�Z���Q").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("�Z���i�J�i�j�P").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_1\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_1_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("�Z���i�J�i�j�Q").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_OLD_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ADDRESS_K_2\" class=\"expj-label\" data-name=\"d_NEW_ADDRESS_K_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ADDRESS_K_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ADDRESS_K_2_CHANGE\" class=\"expj-label\" data-name=\"d_ADDRESS_K_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ADDRESS_K_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("�d�b�ԍ�").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TEL\" class=\"expj-label\" data-name=\"d_OLD_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TEL\" class=\"expj-label\" data-name=\"d_NEW_TEL\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TEL())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TEL_CHANGE\" class=\"expj-label\" data-name=\"d_TEL_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TEL_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append("�e�`�w�ԍ�").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_FAX\" class=\"expj-label\" data-name=\"d_OLD_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_FAX\" class=\"expj-label\" data-name=\"d_NEW_FAX\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_FAX())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_FAX_CHANGE\" class=\"expj-label\" data-name=\"d_FAX_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_FAX_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append("�����S������").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_ORG\" class=\"expj-label\" data-name=\"d_OLD_VEND_ORG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_ORG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_ORG\" class=\"expj-label\" data-name=\"d_NEW_VEND_ORG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_ORG())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_ORG_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_ORG_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_ORG_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append("�����S����").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_PERSON\" class=\"expj-label\" data-name=\"d_OLD_VEND_PERSON\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_PERSON())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_PERSON\" class=\"expj-label\" data-name=\"d_NEW_VEND_PERSON\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_PERSON())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_PERSON_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_PERSON_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_PERSON_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append("���ВS������R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append("���ВS���҃R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_PERSON_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_PERSON_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_PERSON_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append("���l").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_REM\" class=\"expj-label\" data-name=\"d_OLD_VEND_REM\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_REM())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_REM\" class=\"expj-label\" data-name=\"d_NEW_VEND_REM\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_REM())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_REM_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_REM_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_REM_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- �����x�����������e�i���X--><%
if("CA0040010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("�����R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_VEND_CD\" class=\"expj-label\" data-name=\"d_OLD_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_VEND_CD\" class=\"expj-label\" data-name=\"d_NEW_VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_VEND_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_VEND_CD_CHANGE\" class=\"expj-label\" data-name=\"d_VEND_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_VEND_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("�ȖڃR�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("�⏕�敪�R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SUB_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_SUB_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SUB_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("�x���p�^�[���R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_PATTERN_CD\" class=\"expj-label\" data-name=\"d_OLD_PAY_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_PATTERN_CD\" class=\"expj-label\" data-name=\"d_NEW_PAY_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_PATTERN_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_PATTERN_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_PATTERN_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("�[�������敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ROUND_TYP\" class=\"expj-label\" data-name=\"d_OLD_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ROUND_TYP\" class=\"expj-label\" data-name=\"d_NEW_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ROUND_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_ROUND_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ROUND_TYP_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- �x�����@�����e�i���X --><%
if("CA0060010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("�x�����@�R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_METHOD_CD\" class=\"expj-label\" data-name=\"d_OLD_PAY_METHOD_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_METHOD_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_METHOD_CD\" class=\"expj-label\" data-name=\"d_NEW_PAY_METHOD_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_METHOD_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_METHOD_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_METHOD_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_METHOD_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("�x�����@").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_METHOD\" class=\"expj-label\" data-name=\"d_OLD_PAY_METHOD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_METHOD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_METHOD\" class=\"expj-label\" data-name=\"d_NEW_PAY_METHOD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_METHOD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_METHOD_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_METHOD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_METHOD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("�ȖڃR�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("�⏕�敪�R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SUB_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_SUB_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SUB_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("�x���Ώ�").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_TARGET_TYP\" class=\"expj-label\" data-name=\"d_OLD_PAY_TARGET_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_TARGET_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_TARGET_TYP\" class=\"expj-label\" data-name=\"d_NEW_PAY_TARGET_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_TARGET_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_TARGET_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_TARGET_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_TARGET_TYP_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- �x���p�^�[�������e�i���X --><%
if("CA0080010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("�x���p�^�[���R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_PATTERN_CD\" class=\"expj-label\" data-name=\"d_OLD_PAY_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_PATTERN_CD\" class=\"expj-label\" data-name=\"d_NEW_PAY_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_PATTERN_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_PATTERN_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_PATTERN_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("�x���p�^�[����").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_PATTERN_NAME\" class=\"expj-label\" data-name=\"d_OLD_PAY_PATTERN_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_PATTERN_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_PATTERN_NAME\" class=\"expj-label\" data-name=\"d_NEW_PAY_PATTERN_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_PATTERN_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_PATTERN_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_PATTERN_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_PATTERN_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("�����敪").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_ODR_TYP\" class=\"expj-label\" data-name=\"d_OLD_PAY_ODR_TYP\" data-detailItem=\"true\" data-kind=\"OBT_N\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_ODR_TYP())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_ODR_TYP\" class=\"expj-label\" data-name=\"d_NEW_PAY_ODR_TYP\" data-detailItem=\"true\" data-kind=\"OBT_N\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_ODR_TYP())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_ODR_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_ODR_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_ODR_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("�x�����@�R�[�h�P").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_METHOD_CD_1\" class=\"expj-label\" data-name=\"d_OLD_PAY_METHOD_CD_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_METHOD_CD_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_METHOD_CD_1\" class=\"expj-label\" data-name=\"d_NEW_PAY_METHOD_CD_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_METHOD_CD_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_METHOD_CD_1_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_METHOD_CD_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_METHOD_CD_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("�x�����@�R�[�h�Q").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_METHOD_CD_2\" class=\"expj-label\" data-name=\"d_OLD_PAY_METHOD_CD_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_METHOD_CD_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_METHOD_CD_2\" class=\"expj-label\" data-name=\"d_NEW_PAY_METHOD_CD_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_METHOD_CD_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_METHOD_CD_2_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_METHOD_CD_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_METHOD_CD_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("����z").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_STD_AMOUNT\" class=\"expj-label\" data-name=\"d_OLD_STD_AMOUNT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;14\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_STD_AMOUNT())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_STD_AMOUNT\" class=\"expj-label\" data-name=\"d_NEW_STD_AMOUNT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;14\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_STD_AMOUNT())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_STD_AMOUNT_CHANGE\" class=\"expj-label\" data-name=\"d_STD_AMOUNT_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_STD_AMOUNT_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("�����P").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_RATIO_1\" class=\"expj-label\" data-name=\"d_OLD_RATIO_1\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;3\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_RATIO_1())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_RATIO_1\" class=\"expj-label\" data-name=\"d_NEW_RATIO_1\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;3\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_RATIO_1())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_RATIO_1_CHANGE\" class=\"expj-label\" data-name=\"d_RATIO_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_RATIO_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("�����Q").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_RATIO_2\" class=\"expj-label\" data-name=\"d_OLD_RATIO_2\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;3\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_RATIO_2())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_RATIO_2\" class=\"expj-label\" data-name=\"d_NEW_RATIO_2\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;3\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_RATIO_2())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_RATIO_2_CHANGE\" class=\"expj-label\" data-name=\"d_RATIO_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_RATIO_2_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- ���p�Ҍ����Ǘ������e�i���X --><%
if("CA0100010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("���p�҃R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_USER_CD\" class=\"expj-label\" data-name=\"d_OLD_USER_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_USER_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_USER_CD\" class=\"expj-label\" data-name=\"d_NEW_USER_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_USER_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_USER_CD_CHANGE\" class=\"expj-label\" data-name=\"d_USER_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_USER_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("��������R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("�`�[�Ǘ�����R�[�h�i�K��l�j").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SLIP_CTRL_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_SLIP_CTRL_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SLIP_CTRL_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SLIP_CTRL_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_SLIP_CTRL_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SLIP_CTRL_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SLIP_CTRL_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_SLIP_CTRL_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SLIP_CTRL_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("�x�����ߊǗ�����R�[�h�i�K��l�j").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CLOSING_CTRL_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_CLOSING_CTRL_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CLOSING_CTRL_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CLOSING_CTRL_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_CLOSING_CTRL_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CLOSING_CTRL_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CLOSING_CTRL_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CLOSING_CTRL_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CLOSING_CTRL_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("�x���v�Z�Ǘ�����R�[�h�i�K��l�j").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_CALC_CTRL_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_PAY_CALC_CTRL_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_CALC_CTRL_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_CALC_CTRL_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_PAY_CALC_CTRL_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_CALC_CTRL_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_CALC_CTRL_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_CALC_CTRL_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_CALC_CTRL_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("�x���m��Ǘ�����R�[�h�i�K��l�j").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PAY_FIX_CTRL_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_PAY_FIX_CTRL_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PAY_FIX_CTRL_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PAY_FIX_CTRL_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_PAY_FIX_CTRL_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PAY_FIX_CTRL_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PAY_FIX_CTRL_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PAY_FIX_CTRL_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PAY_FIX_CTRL_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- ���|�d��p�^�[�������e�i���X --><%
if("CA0120010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['2','").append("�p�^�[���R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PATTERN_CD\" class=\"expj-label\" data-name=\"d_OLD_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PATTERN_CD\" class=\"expj-label\" data-name=\"d_NEW_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PATTERN_CD_CHANGE\" class=\"expj-label\" data-name=\"d_PATTERN_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PATTERN_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append("���ނP").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CLASS_1\" class=\"expj-label\" data-name=\"d_OLD_CLASS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CLASS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CLASS_1\" class=\"expj-label\" data-name=\"d_NEW_CLASS_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CLASS_1())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CLASS_1_CHANGE\" class=\"expj-label\" data-name=\"d_CLASS_1_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CLASS_1_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append("���ނQ").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CLASS_2\" class=\"expj-label\" data-name=\"d_OLD_CLASS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CLASS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CLASS_2\" class=\"expj-label\" data-name=\"d_NEW_CLASS_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CLASS_2())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CLASS_2_CHANGE\" class=\"expj-label\" data-name=\"d_CLASS_2_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CLASS_2_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append("���ނR").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CLASS_3\" class=\"expj-label\" data-name=\"d_OLD_CLASS_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CLASS_3())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CLASS_3\" class=\"expj-label\" data-name=\"d_NEW_CLASS_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CLASS_3())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CLASS_3_CHANGE\" class=\"expj-label\" data-name=\"d_CLASS_3_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CLASS_3_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append("���|�d��p�^�[����").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_AUTO_JNL_NAME\" class=\"expj-label\" data-name=\"d_OLD_AUTO_JNL_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_AUTO_JNL_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_AUTO_JNL_NAME\" class=\"expj-label\" data-name=\"d_NEW_AUTO_JNL_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_AUTO_JNL_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_AUTO_JNL_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_AUTO_JNL_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_AUTO_JNL_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append("�ؕ��ȖڃR�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DR_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_DR_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DR_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DR_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_DR_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DR_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DR_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_DR_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DR_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append("�ؕ��⏕�敪�R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DR_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_DR_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DR_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DR_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_DR_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DR_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DR_SUB_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_DR_SUB_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DR_SUB_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append("�ؕ�����ݒ�敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DR_ORG_TYP\" class=\"expj-label\" data-name=\"d_OLD_DR_ORG_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DR_ORG_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DR_ORG_TYP\" class=\"expj-label\" data-name=\"d_NEW_DR_ORG_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DR_ORG_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DR_ORG_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_DR_ORG_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DR_ORG_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append("�ؕ�����R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DR_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_DR_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DR_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DR_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_DR_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DR_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DR_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_DR_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DR_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append("�ݕ��ȖڃR�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CR_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_CR_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CR_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CR_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_CR_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CR_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CR_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CR_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CR_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append("�ݕ��⏕�敪�R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CR_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_OLD_CR_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CR_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CR_SUB_ACCT_CD\" class=\"expj-label\" data-name=\"d_NEW_CR_SUB_ACCT_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CR_SUB_ACCT_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CR_SUB_ACCT_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CR_SUB_ACCT_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CR_SUB_ACCT_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append("�ݕ�����ݒ�敪").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CR_ORG_TYP\" class=\"expj-label\" data-name=\"d_OLD_CR_ORG_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CR_ORG_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CR_ORG_TYP\" class=\"expj-label\" data-name=\"d_NEW_CR_ORG_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CR_ORG_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CR_ORG_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_CR_ORG_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CR_ORG_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append("�ݕ�����R�[�h").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CR_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_CR_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CR_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CR_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_CR_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CR_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CR_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CR_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CR_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append("�`�[��ށi��ʉ�v�j").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACCT_SLIP_NUM\" class=\"expj-label\" data-name=\"d_OLD_ACCT_SLIP_NUM\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;2\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACCT_SLIP_NUM())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACCT_SLIP_NUM\" class=\"expj-label\" data-name=\"d_NEW_ACCT_SLIP_NUM\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER_Z;2\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACCT_SLIP_NUM())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACCT_SLIP_NUM_CHANGE\" class=\"expj-label\" data-name=\"d_ACCT_SLIP_NUM_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACCT_SLIP_NUM_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['16','").append("�p�^�[���R�[�h�i��ʉ�v�j").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_ACCT_JNL_PATTERN_CD\" class=\"expj-label\" data-name=\"d_OLD_ACCT_JNL_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_ACCT_JNL_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_ACCT_JNL_PATTERN_CD\" class=\"expj-label\" data-name=\"d_NEW_ACCT_JNL_PATTERN_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_ACCT_JNL_PATTERN_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_ACCT_JNL_PATTERN_CD_CHANGE\" class=\"expj-label\" data-name=\"d_ACCT_JNL_PATTERN_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_ACCT_JNL_PATTERN_CD_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- �̔��P�������e�i���XJa --><%
if("KA1020010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.PURPOSE_UNIT_PRICE_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_PURPOSE_UNIT_PRICE_TYP\" class=\"expj-label\" data-name=\"d_OLD_PURPOSE_UNIT_PRICE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_PURPOSE_UNIT_PRICE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_PURPOSE_UNIT_PRICE_TYP\" class=\"expj-label\" data-name=\"d_NEW_PURPOSE_UNIT_PRICE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_PURPOSE_UNIT_PRICE_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_PURPOSE_UNIT_PRICE_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_PURPOSE_UNIT_PRICE_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_PURPOSE_UNIT_PRICE_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_OLD_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"d_NEW_EFF_PHASE_IN_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EFF_PHASE_IN_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_EFF_PHASE_IN_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EFF_PHASE_IN_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.SBCNT_SIZE",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SALES_UNIT_SIZE\" class=\"expj-label\" data-name=\"d_OLD_SALES_UNIT_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SALES_UNIT_SIZE())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SALES_UNIT_SIZE\" class=\"expj-label\" data-name=\"d_NEW_SALES_UNIT_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SALES_UNIT_SIZE())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SALES_UNIT_SIZE_CHANGE\" class=\"expj-label\" data-name=\"d_SALES_UNIT_SIZE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SALES_UNIT_SIZE_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_OLD_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_UNIT_COST_TYP\" class=\"expj-label\" data-name=\"d_NEW_UNIT_COST_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_UNIT_COST_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_UNIT_COST_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_UNIT_COST_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_UNIT_COST_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_SALES_UNIT_COST\" class=\"expj-label\" data-name=\"d_OLD_SALES_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_SALES_UNIT_COST())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_SALES_UNIT_COST\" class=\"expj-label\" data-name=\"d_NEW_SALES_UNIT_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_SALES_UNIT_COST())).append("</span>").append("</div>','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_SALES_UNIT_COST_CHANGE\" class=\"expj-label\" data-name=\"d_SALES_UNIT_COST_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_SALES_UNIT_COST_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%><!-- ���Ӑ惁���e�i���XJa --><%
if("KA1030010Servlet".equals(aAZ0060010Control.getScreen_url())){
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
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.CUST_NAME_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_NAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_NAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_NAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_NAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_NAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_NAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.CUST_ANAME_2",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_ANAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_ANAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_ANAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_ANAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_ANAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_ANAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.CUST_KNAME_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_KNAME\" class=\"expj-label\" data-name=\"d_OLD_CUST_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_KNAME\" class=\"expj-label\" data-name=\"d_NEW_CUST_KNAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_KNAME())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_KNAME_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_KNAME_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_KNAME_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.OWN_ORG_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_ORG_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_ORG_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_ORG_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_ORG_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_ORG_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_ORG_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.OWN_PERSON_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_OLD_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_OWN_PERSON_CD\" class=\"expj-label\" data-name=\"d_NEW_OWN_PERSON_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_OWN_PERSON_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OWN_PERSON_CD_CHANGE\" class=\"expj-label\" data-name=\"d_OWN_PERSON_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OWN_PERSON_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.CUR_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUR_CD\" class=\"expj-label\" data-name=\"d_OLD_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUR_CD\" class=\"expj-label\" data-name=\"d_NEW_CUR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUR_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUR_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUR_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUR_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.INSPC_ACPT_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_INSPC_ACPT_TYP\" class=\"expj-label\" data-name=\"d_OLD_INSPC_ACPT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_INSPC_ACPT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_INSPC_ACPT_TYP\" class=\"expj-label\" data-name=\"d_NEW_INSPC_ACPT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_INSPC_ACPT_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_INSPC_ACPT_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_INSPC_ACPT_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_INSPC_ACPT_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.EXCH_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_EXCH_TYP\" class=\"expj-label\" data-name=\"d_OLD_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_EXCH_TYP\" class=\"expj-label\" data-name=\"d_NEW_EXCH_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_EXCH_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_EXCH_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_EXCH_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_EXCH_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.TAX_CD_1",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CD\" class=\"expj-label\" data-name=\"d_OLD_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CD\" class=\"expj-label\" data-name=\"d_NEW_TAX_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CD_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.TAX_CALC_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_CALC_TYP\" class=\"expj-label\" data-name=\"d_OLD_TAX_CALC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_CALC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_CALC_TYP\" class=\"expj-label\" data-name=\"d_NEW_TAX_CALC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_CALC_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_CALC_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_CALC_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_CALC_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.TAX_APPLY_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_TAX_APPLY_TYP\" class=\"expj-label\" data-name=\"d_OLD_TAX_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_TAX_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_TAX_APPLY_TYP\" class=\"expj-label\" data-name=\"d_NEW_TAX_APPLY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_TAX_APPLY_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_TAX_APPLY_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_TAX_APPLY_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_TAX_APPLY_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.DETAIL_ROUND_TYP",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_DETAIL_ROUND_TYP\" class=\"expj-label\" data-name=\"d_OLD_DETAIL_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_DETAIL_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_DETAIL_ROUND_TYP\" class=\"expj-label\" data-name=\"d_NEW_DETAIL_ROUND_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_DETAIL_ROUND_TYP())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_DETAIL_ROUND_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_DETAIL_ROUND_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_DETAIL_ROUND_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.CUST_GRP_CD",rb)).append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_OLD_CUST_GRP_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_GRP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_OLD_CUST_GRP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_NEW_CUST_GRP_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_GRP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_NEW_CUST_GRP_CD())).append("</span>").append("','").append("<span id=\"expj-AZ0060010-AZ0060010Detail1-d_CUST_GRP_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_GRP_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getd_CUST_GRP_CD_CHANGE())).append("</span>").append("']").append(",");%>
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
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
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

//DETAIL Js�錾
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
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
 * AZ0060010�p�̃��[�h�������������֐�
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
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
  // �R���\�[���o��
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010�̑S��onDecision����
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body><%
}
%></html>