<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:46:43 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AN0050\AN0050010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AN0050.*" %>
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
<jsp:useBean id="aAN0050010Control" class="com.nec.jp.orteus.metamorBase.AN0050.AN0050010Control" scope="request"/>
<jsp:useBean id="aAN0050010Struct" class="com.nec.jp.orteus.metamorBase.AN0050.AN0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

一覧表示件数メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0050/jsp/AN0050010.jsp,v $
$Author: geng-jia $
$Revision: 1.9 $ $Date: 2017/02/22 02:06:24 $
********************************************************* --%>
<html>
<head>
<title>一覧表示件数メンテナンス</title>
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
<script class="expj-script-AN0050010_init">
  // AN0050010名前空間
  expj.AN0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AN0050010" data-screen="AN0050010" data-newdata="<%=aAN0050010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px">
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr" style="">
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);">
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">

            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">

            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="">
              <script class="expj-script-AN0050010-AN0050010form1">
expj.AN0050010.AN0050010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AN0050010.AN0050010form1.onLoad0 = function () {
  console.log('AN0050010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;?AN0050010view1/*[eq]NORMAL[and]?AN0050010form1/SERVLET_CD[eq]SAME[and]?AN0050010form1/DISPLAY_CD[eq]SAME@*0,*1"
expj.AN0050010.AN0050010form1.onDecision0 = function () {
  console.log('AN0050010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0050010', 'AN0050010form1', '?AN0050010view1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0050010', 'AN0050010form1', '?AN0050010form1/SERVLET_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0050010', 'AN0050010form1', '?AN0050010form1/DISPLAY_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AN0050010button2/Update"
expj.AN0050010.AN0050010form1.child0 = function () {
  console.log('AN0050010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AN0050010', 'AN0050010form1', '_AN0050010button2/Update');
};
// script4="child;1;MASK;_AN0050010button2/Update"
expj.AN0050010.AN0050010form1.child1 = function () {
  console.log('AN0050010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AN0050010', 'AN0050010form1', '_AN0050010button2/Update');
};
expj.AN0050010.AN0050010form1.executeAllOnDecision = function () {
  console.log('execute AN0050010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0050010.AN0050010form1['onDecision' + i])) {
        expj.AN0050010.AN0050010form1['onDecision' + i]();
      }
    }
  }
};
expj.AN0050010.AN0050010form1.executeOnLoad = function () {
  expj.AN0050010.AN0050010form1.executePScriptOnLoad();
};

expj.AN0050010.AN0050010form1.executePScriptOnLoad = function () {
  console.log('execute AN0050010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AN0050010.AN0050010form1['onLoad' + i])) {
      expj.AN0050010.AN0050010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AN0050010-AN0050010form1" action="AN0050010Servlet" name="AN0050010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SERVLET_CD",rb)%></span><!-- 処理コード --></div><!--/td-->
<script class="expj-script-AN0050010-AN0050010form1-SERVLET_CD">
expj.AN0050010.AN0050010form1.SERVLET_CD = {};
expj.AN0050010.AN0050010form1.SERVLET_CD.executeAllOnDecision = function () {
  console.log('execute AN0050010form1/SERVLET_CD.onDecision');
  expj.AN0050010.AN0050010form1.executeAllOnDecision();
  expj.AN0050010.executeAllOnDecision();
};
expj.AN0050010.AN0050010form1.SERVLET_CD.executeOnLoad = function () {
  $('#expj-AN0050010-AN0050010form1-SERVLET_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0050010', 'AN0050010form1', 'SERVLET_CD', this);
  });
  expj.AN0050010.AN0050010form1.SERVLET_CD.executePScriptOnLoad();
};

expj.AN0050010.AN0050010form1.SERVLET_CD.executePScriptOnLoad = function () {
  console.log('execute AN0050010form1/SERVLET_CD.onLoad');
  var targetComponent = document.getElementById('expj-AN0050010-AN0050010form1-SERVLET_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AN0050010-AN0050010form1-SERVLET_CD" name="SERVLET_CD" class="AN0050010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAN0050010Struct.getSERVLET_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DISPLAY_CD",rb)%></span><!-- 表示番号 --></div><!--/td-->
<script class="expj-script-AN0050010-AN0050010form1-DISPLAY_CD">
expj.AN0050010.AN0050010form1.DISPLAY_CD = {};
expj.AN0050010.AN0050010form1.DISPLAY_CD.executeAllOnDecision = function () {
  console.log('execute AN0050010form1/DISPLAY_CD.onDecision');
  expj.AN0050010.AN0050010form1.executeAllOnDecision();
  expj.AN0050010.executeAllOnDecision();
};
expj.AN0050010.AN0050010form1.DISPLAY_CD.executeOnLoad = function () {
  $('#expj-AN0050010-AN0050010form1-DISPLAY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0050010', 'AN0050010form1', 'DISPLAY_CD', this);
  });
  expj.AN0050010.AN0050010form1.DISPLAY_CD.executePScriptOnLoad();
};

expj.AN0050010.AN0050010form1.DISPLAY_CD.executePScriptOnLoad = function () {
  console.log('execute AN0050010form1/DISPLAY_CD.onLoad');
  var targetComponent = document.getElementById('expj-AN0050010-AN0050010form1-DISPLAY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0050010-AN0050010form1-DISPLAY_CD" name="DISPLAY_CD" class="AN0050010-focus-move expj-align-right " style="width:150px;" data-kind="OBT_N" value="<%= TypeConverter.sanitizer(aAN0050010Struct.getDISPLAY_CD()) %>" maxlength="6" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AN0050010-AN0050010button1">
expj.AN0050010.AN0050010button1 = {};
expj.AN0050010.AN0050010button1.executeAllOnDecision = function () {
  console.log('execute AN0050010button1.onDecision');
};
expj.AN0050010.AN0050010button1.executeOnLoad = function () {
  expj.AN0050010.AN0050010button1.executePScriptOnLoad();
};

expj.AN0050010.AN0050010button1.executePScriptOnLoad = function () {
  console.log('execute AN0050010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0050010-AN0050010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0050010-AN0050010button1-Select">
expj.AN0050010.AN0050010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0050010form1/*@AN0050010Servlet"
expj.AN0050010.AN0050010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0050010', 'AN0050010button1', '_AN0050010form1/*', 'AN0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0050010', response);
expj.common.updateBusinessScreenTab('AN0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AN0050010.AN0050010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0050010.AN0050010button1.Select['onClick' + i])) {
        expj.AN0050010.AN0050010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AN0050010.AN0050010button1.Select.executeAllOnDecision = function () {
};
expj.AN0050010.AN0050010button1.Select.executeOnLoad = function () {
  $('#expj-AN0050010-AN0050010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0050010', 'AN0050010button1', 'Select', this, 'Button');
    }
  });
  expj.AN0050010.AN0050010button1.Select.executePScriptOnLoad();
};

expj.AN0050010.AN0050010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AN0050010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AN0050010-AN0050010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0050010-AN0050010button1-Select" name="Select" class="AN0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AN0050010-AN0050010view1">
expj.AN0050010.AN0050010view1 = {};
expj.AN0050010.AN0050010view1.executeAllOnClick = function () {
};
expj.AN0050010.AN0050010view1.executeAllOnDecision = function () {
  console.log('execute AN0050010view1.onDecision');
};
expj.AN0050010.AN0050010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AN0050010view1", "expj.AN0050010.AN0050010view1.executeAllOnClick");
%>
  expj.AN0050010.AN0050010view1.executePScriptOnLoad();
};

expj.AN0050010.AN0050010view1.executePScriptOnLoad = function () {
  console.log('execute AN0050010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AN0050010-AN0050010view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAN0050010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AN0050010view1_Id = "AN0050010view1";
 String AN0050010view1_select = "single";
 String AN0050010view1_sortable = "true";
 String AN0050010view1_resize = "true";
 String AN0050010view1_scroll = "true";
 StringBuffer AN0050010view1_HB = new StringBuffer();
 StringBuffer AN0050010view1_DB = new StringBuffer();
%>
<%
 AN0050010view1_select = "none";
 AN0050010view1_sortable = "false";
 AN0050010view1_resize = "true";
 AN0050010view1_scroll = "true";
%>
<%
 AN0050010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AN0050010view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AN0050010-AN0050010view1-MAX_DISPLAY_ROWNUM">
expj.AN0050010.AN0050010view1.MAX_DISPLAY_ROWNUM = {};
expj.AN0050010.AN0050010view1.MAX_DISPLAY_ROWNUM.executeAllOnClick = function () {
};
expj.AN0050010.AN0050010view1.MAX_DISPLAY_ROWNUM.executeAllOnDecision = function () {
  console.log('execute AN0050010view1/MAX_DISPLAY_ROWNUM.onDecision');
  expj.AN0050010.AN0050010view1.executeAllOnDecision();
  expj.AN0050010.executeAllOnDecision();
};
expj.AN0050010.AN0050010view1.MAX_DISPLAY_ROWNUM.executeOnLoad = function () {
  $('.expj-AN0050010-AN0050010view1-MAX_DISPLAY_ROWNUM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0050010', 'AN0050010view1', 'MAX_DISPLAY_ROWNUM', this);
  });
  expj.AN0050010.AN0050010view1.MAX_DISPLAY_ROWNUM.executePScriptOnLoad();
};

expj.AN0050010.AN0050010view1.MAX_DISPLAY_ROWNUM.executePScriptOnLoad = function () {
  console.log('execute AN0050010view1/MAX_DISPLAY_ROWNUM.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AN0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SERVLET_CD",rb))).append("', 'name':'l_SERVLET_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AN0050010view1_sortable).append("}").append(",");
AN0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DISPLAY_CD",rb))).append("', 'name':'l_DISPLAY_CD', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AN0050010view1_sortable).append("}").append(",");
AN0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MAX_DISPLAY_ROWNUM",rb))).append("', 'name':'MAX_DISPLAY_ROWNUM', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AN0050010view1_sortable).append("}").append(",");
AN0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'460px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SCREEN_COMMENT",rb))).append("', 'name':'SCREEN_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AN0050010view1_sortable).append("}").append(",");
AN0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'460px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SCREEN_COMMENT_EN",rb))).append("', 'name':'SCREEN_COMMENT_EN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AN0050010view1_sortable).append("}").append(",");
AN0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MAX_DISPLAY_ROWNUM', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0050010view1_sortable).append("}").append(",");
AN0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0050010view1_sortable).append("}").append(",");
%>
<%
 int aAN0050010StructLength = aAN0050010Control.getListsize();
 final AN0050010Struct structBackup = aAN0050010Struct;
 aAN0050010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAN0050010StructLength; ++loopCount) {
  if((aAN0050010Struct = (AN0050010Struct) aAN0050010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAN0050010Struct", aAN0050010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AN0050010view1_DB.append("[");
 AN0050010view1_DB.append(loopCount);
 AN0050010view1_DB.append(",").append("'<span id=\"expj-AN0050010-AN0050010view1-l_SERVLET_CD-").append(loopCount).append("\" class=\"expj-label expj-AN0050010-AN0050010view1-l_SERVLET_CD\" data-name=\"l_SERVLET_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0050010Struct.getl_SERVLET_CD())).append("</span>'");
 AN0050010view1_DB.append(",").append("'<span id=\"expj-AN0050010-AN0050010view1-l_DISPLAY_CD-").append(loopCount).append("\" class=\"expj-label expj-AN0050010-AN0050010view1-l_DISPLAY_CD\" data-name=\"l_DISPLAY_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0050010Struct.getl_DISPLAY_CD())).append("</span>'");
 AN0050010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AN0050010-AN0050010view1-MAX_DISPLAY_ROWNUM-").append(loopCount).append("\" class=\"expj-AN0050010-AN0050010view1-MAX_DISPLAY_ROWNUM AN0050010-focus-move\" data-name=\"MAX_DISPLAY_ROWNUM\" data-view=\"true\" style=\"text-align:right;\" maxlength=\"2147483647\" data-kind=\"").append("OBT_INTEGER_Z;14").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAN0050010Struct.getMAX_DISPLAY_ROWNUM())).append("\">'");
 AN0050010view1_DB.append(",").append("'<span id=\"expj-AN0050010-AN0050010view1-SCREEN_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AN0050010-AN0050010view1-SCREEN_COMMENT\" data-name=\"SCREEN_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0050010Struct.getSCREEN_COMMENT())).append("</span>'");
 AN0050010view1_DB.append(",").append("'<span id=\"expj-AN0050010-AN0050010view1-SCREEN_COMMENT_EN-").append(loopCount).append("\" class=\"expj-label expj-AN0050010-AN0050010view1-SCREEN_COMMENT_EN\" data-name=\"SCREEN_COMMENT_EN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0050010Struct.getSCREEN_COMMENT_EN())).append("</span>'");
 AN0050010view1_DB.append(",").append("'<span id=\"expj-AN0050010-AN0050010view1-h_MAX_DISPLAY_ROWNUM-").append(loopCount).append("\" class=\"expj-label expj-AN0050010-AN0050010view1-h_MAX_DISPLAY_ROWNUM\" data-name=\"h_MAX_DISPLAY_ROWNUM\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0050010Struct.geth_MAX_DISPLAY_ROWNUM())).append("</span>'");
 AN0050010view1_DB.append(",").append("'<span id=\"expj-AN0050010-AN0050010view1-h_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AN0050010-AN0050010view1-h_MODIFY_COUNT\" data-name=\"h_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0050010Struct.geth_MODIFY_COUNT())).append("</span>'");
 AN0050010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAN0050010StructLength) {
   AN0050010view1_DB.append(",");
  }
 }
 aAN0050010Struct = structBackup;
 viewIdList.add(AN0050010view1_Id);
 viewSelectList.add(AN0050010view1_select);
 viewResizeList.add(AN0050010view1_resize);
 viewScrollList.add(AN0050010view1_scroll);
 viewHeaderDataList.add(AN0050010view1_HB);
 viewBodyDataList.add(AN0050010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AN0050010-AN0050010button2">
expj.AN0050010.AN0050010button2 = {};
expj.AN0050010.AN0050010button2.executeAllOnDecision = function () {
  console.log('execute AN0050010button2.onDecision');
};
expj.AN0050010.AN0050010button2.executeOnLoad = function () {
  expj.AN0050010.AN0050010button2.executePScriptOnLoad();
};

expj.AN0050010.AN0050010button2.executePScriptOnLoad = function () {
  console.log('execute AN0050010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0050010-AN0050010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0050010-AN0050010button2-Update">
expj.AN0050010.AN0050010button2.Update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0050010form1/*,_AN0050010view1/*@AN0050010Servlet,,$ZZ07003"
expj.AN0050010.AN0050010button2.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0050010', 'AN0050010button2', '_AN0050010form1/*,_AN0050010view1/*', 'AN0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0050010', response);
expj.common.updateBusinessScreenTab('AN0050010', contents);
};
expj.common.pscript.callConfirm('AN0050010', 'AN0050010button2', 'ZZ07003', okEvent);
};
expj.AN0050010.AN0050010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0050010.AN0050010button2.Update['onClick' + i])) {
        expj.AN0050010.AN0050010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AN0050010.AN0050010button2.Update.executeAllOnDecision = function () {
};
expj.AN0050010.AN0050010button2.Update.executeOnLoad = function () {
  $('#expj-AN0050010-AN0050010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0050010', 'AN0050010button2', 'Update', this, 'Button');
    }
  });
  expj.AN0050010.AN0050010button2.Update.executePScriptOnLoad();
};

expj.AN0050010.AN0050010button2.Update.executePScriptOnLoad = function () {
  console.log('execute AN0050010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AN0050010-AN0050010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0050010-AN0050010button2-Update" name="Update" class="AN0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AN0050010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AN0050010-AN0050010button0">
expj.AN0050010.AN0050010button0 = {};
expj.AN0050010.AN0050010button0.executeAllOnDecision = function () {
  console.log('execute AN0050010button0.onDecision');
};
expj.AN0050010.AN0050010button0.executeOnLoad = function () {
  expj.AN0050010.AN0050010button0.executePScriptOnLoad();
};

expj.AN0050010.AN0050010button0.executePScriptOnLoad = function () {
  console.log('execute AN0050010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0050010-AN0050010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0050010-AN0050010button0-Clear">
expj.AN0050010.AN0050010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0050010form1/*@AN0050010Servlet,,$ZZ07008"
expj.AN0050010.AN0050010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0050010', 'AN0050010button0', '_AN0050010form1/*', 'AN0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0050010', response);
expj.common.updateBusinessScreenTab('AN0050010', contents);
};
expj.common.pscript.callConfirm('AN0050010', 'AN0050010button0', 'ZZ07008', okEvent);
};
expj.AN0050010.AN0050010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0050010.AN0050010button0.Clear['onClick' + i])) {
        expj.AN0050010.AN0050010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AN0050010.AN0050010button0.Clear.executeAllOnDecision = function () {
};
expj.AN0050010.AN0050010button0.Clear.executeOnLoad = function () {
  $('#expj-AN0050010-AN0050010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0050010', 'AN0050010button0', 'Clear', this, 'Button');
    }
  });
  expj.AN0050010.AN0050010button0.Clear.executePScriptOnLoad();
};

expj.AN0050010.AN0050010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AN0050010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AN0050010-AN0050010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0050010-AN0050010button0-Clear" name="Clear" class="AN0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AN0050010-AN0050010button0-Close">
expj.AN0050010.AN0050010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AN0050010.AN0050010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AN0050010');
};
expj.AN0050010.AN0050010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0050010.AN0050010button0.Close['onClick' + i])) {
        expj.AN0050010.AN0050010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AN0050010.AN0050010button0.Close.executeAllOnDecision = function () {
};
expj.AN0050010.AN0050010button0.Close.executeOnLoad = function () {
  $('#expj-AN0050010-AN0050010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0050010', 'AN0050010button0', 'Close', this, 'Button');
    }
  });
  expj.AN0050010.AN0050010button0.Close.executePScriptOnLoad();
};

expj.AN0050010.AN0050010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AN0050010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AN0050010-AN0050010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0050010-AN0050010button0-Close" name="Close" class="AN0050010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AN0050010 (END)-->
<%
  MessageStruct msgStruct = aAN0050010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AN0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AN0050010)) {
  expj.common.treeInstanceMap.AN0050010 = {};
}
expj.common.treeInstanceMap.AN0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AN0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AN0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AN0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AN0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AN0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AN0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AN0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AN0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0050010)) {
  expj.common.detailDialogMap.AN0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AN0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.AN0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AN0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AN0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AN0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AN0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AN0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AN0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AN0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AN0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AN0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AN0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AN0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AN0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AN0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AN0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AN0050010)) {
  expj.common.viewInstanceMap.AN0050010 = {};
}
expj.common.viewInstanceMap.AN0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.AN0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AN0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AN0050010.<%=viewId %>.init = function () {
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
    expj.AN0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AN0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AN0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AN0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AN0050010_init">
/**
 * AN0050010用のロード完了時初期化関数
 */
expj.AN0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AN0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AN0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AN0050010');
  expj.common.calendarInstanceMap.AN0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AN0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AN0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.AN0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AN0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AN0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AN0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AN0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AN0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AN0050010-<%=detailId %>');
<%
 }
%>
  try{expj.AN0050010.AN0050010form1.SERVLET_CD.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010form1.DISPLAY_CD.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010view1.MAX_DISPLAY_ROWNUM.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010button2.Update.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010form1.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010button1.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010view1.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010button2.executeOnLoad();}catch(e){};
  try{expj.AN0050010.AN0050010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AN0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AN0050010', 'AN0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AN0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AN0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.AN0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AN0050010', '<%=request.getContextPath() %>');
};

/**
 * AN0050010の全体onDecision処理
 */
expj.AN0050010.executeAllOnDecision = function () {
  expj.AN0050010.AN0050010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AN0050010_console">
expj.AN0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>