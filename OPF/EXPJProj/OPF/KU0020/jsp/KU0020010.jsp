<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:02:05 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KU0020\KU0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KU0020.*" %>
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
<jsp:useBean id="aKU0020010Control" class="com.nec.jp.orteus.metamorBase.KU0020.KU0020010Control" scope="request"/>
<jsp:useBean id="aKU0020010Struct" class="com.nec.jp.orteus.metamorBase.KU0020.KU0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出荷関連伝票出力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0020/jsp/KU0020010.jsp,v $
$Author: geng-jia $ 
$Revision: 1.9 $ $Date: 2017/02/22 02:07:25 $
********************************************************* --%>
<html>
<head>
<title>出荷関連伝票出力</title>
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
<script class="expj-script-KU0020010_init">
  // KU0020010名前空間
  expj.KU0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KU0020010" data-screen="KU0020010" data-newdata="<%=aKU0020010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px">
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr expjDynamicHeight" style="">
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);height:100%;">
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">

            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">

            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="height:100%;">
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-KU0020010-KU0020010form1">
expj.KU0020010.KU0020010form1 = {};
expj.KU0020010.KU0020010form1.executeAllOnDecision = function () {
  console.log('execute KU0020010form1.onDecision');
};
expj.KU0020010.KU0020010form1.executeOnLoad = function () {
  expj.KU0020010.KU0020010form1.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0020010-KU0020010form1" action="KU0020010Servlet" name="KU0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKU0020010Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:right"></div>
<div class="div-td" style="width:22px;align:right"></div>
<div class="div-td" style="width:40px;align:right"></div>
<div class="div-td" style="width:22px;align:right"></div>
<div class="div-td" style="width:198px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:38px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:198px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:38px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:198px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:38px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-r1_PrintType">
expj.KU0020010.KU0020010form1.r1_PrintType = {};
// script1="onLoad;0;CALL;onClick@0"
expj.KU0020010.KU0020010form1.r1_PrintType.onLoad0 = function () {
  console.log('r1_PrintType script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.KU0020010.KU0020010form1.r1_PrintType.onClick0 = function () {
  console.log('r1_PrintType script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_DESINATED_SHIP_DATE_FROM,_CalendarDesinatedShipDateFrom,_DESINATED_SHIP_DATE_TO,_CalendarDesinatedShipDateTo,_SLIP_CD_FROM,_PeekerSlipCdFrom,_SLIP_CD_TO,_PeekerSlipCdTo"
expj.KU0020010.KU0020010form1.r1_PrintType.child0 = function () {
  console.log('r1_PrintType script3');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_DESINATED_SHIP_DATE_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_CalendarDesinatedShipDateFrom');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_DESINATED_SHIP_DATE_TO');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_CalendarDesinatedShipDateTo');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_SLIP_CD_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_PeekerSlipCdFrom');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_SLIP_CD_TO');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_PeekerSlipCdTo');
};
expj.KU0020010.KU0020010form1.r1_PrintType.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.r1_PrintType['onClick' + i])) {
        expj.KU0020010.KU0020010form1.r1_PrintType['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010form1.r1_PrintType.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/r1_PrintType.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.r1_PrintType.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-r1_PrintType').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010form1', 'r1_PrintType', this, 'RadioButton');
    }
  });
  expj.KU0020010.KU0020010form1.r1_PrintType.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.r1_PrintType.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/r1_PrintType.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-r1_PrintType');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.r1_PrintType['onLoad' + i])) {
      expj.KU0020010.KU0020010form1.r1_PrintType['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="PrintType" data-name="r1_PrintType" value="true" <%= ("true".equals(TypeConverter.convert(aKU0020010Struct.getr1_PrintType())))?"checked=\"checked\"":"" %> class="" id="expj-KU0020010-KU0020010form1-r1_PrintType" ><label for="expj-KU0020010-KU0020010form1-r1_PrintType"><%=CoreTools.getRBString("Expj.Cmt0604",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:198px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:38px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-r2_PrintType">
expj.KU0020010.KU0020010form1.r2_PrintType = {};
// script1="onLoad;0;CALL;onClick@0"
expj.KU0020010.KU0020010form1.r2_PrintType.onLoad0 = function () {
  console.log('r2_PrintType script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.KU0020010.KU0020010form1.r2_PrintType.onClick0 = function () {
  console.log('r2_PrintType script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;SET;_DESINATED_SHIP_DATE_FROM=,_DESINATED_SHIP_DATE_TO=,_SLIP_CD_FROM=,_SLIP_CD_TO=@*1"
expj.KU0020010.KU0020010form1.r2_PrintType.child0 = function () {
  console.log('r2_PrintType script3');
expj.common.pscript.setReferenceComponentValue('KU0020010', 'KU0020010form1', '_DESINATED_SHIP_DATE_FROM', '');
expj.common.pscript.setReferenceComponentValue('KU0020010', 'KU0020010form1', '_DESINATED_SHIP_DATE_TO', '');
expj.common.pscript.setReferenceComponentValue('KU0020010', 'KU0020010form1', '_SLIP_CD_FROM', '');
expj.common.pscript.setReferenceComponentValue('KU0020010', 'KU0020010form1', '_SLIP_CD_TO', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;MASK;_DESINATED_SHIP_DATE_FROM,_CalendarDesinatedShipDateFrom,_DESINATED_SHIP_DATE_TO,_CalendarDesinatedShipDateTo,_SLIP_CD_FROM,_PeekerSlipCdFrom,_SLIP_CD_TO,_PeekerSlipCdTo"
expj.KU0020010.KU0020010form1.r2_PrintType.child1 = function () {
  console.log('r2_PrintType script4');
expj.common.pscript.setMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_DESINATED_SHIP_DATE_FROM');
expj.common.pscript.setMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_CalendarDesinatedShipDateFrom');
expj.common.pscript.setMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_DESINATED_SHIP_DATE_TO');
expj.common.pscript.setMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_CalendarDesinatedShipDateTo');
expj.common.pscript.setMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_SLIP_CD_FROM');
expj.common.pscript.setMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_PeekerSlipCdFrom');
expj.common.pscript.setMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_SLIP_CD_TO');
expj.common.pscript.setMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_PeekerSlipCdTo');
};
expj.KU0020010.KU0020010form1.r2_PrintType.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.r2_PrintType['onClick' + i])) {
        expj.KU0020010.KU0020010form1.r2_PrintType['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010form1.r2_PrintType.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/r2_PrintType.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.r2_PrintType.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-r2_PrintType').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010form1', 'r2_PrintType', this, 'RadioButton');
    }
  });
  expj.KU0020010.KU0020010form1.r2_PrintType.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.r2_PrintType.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/r2_PrintType.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-r2_PrintType');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.r2_PrintType['onLoad' + i])) {
      expj.KU0020010.KU0020010form1.r2_PrintType['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="PrintType" data-name="r2_PrintType" value="true" <%= ("true".equals(TypeConverter.convert(aKU0020010Struct.getr2_PrintType())))?"checked=\"checked\"":"" %> class="" id="expj-KU0020010-KU0020010form1-r2_PrintType" ><label for="expj-KU0020010-KU0020010form1-r2_PrintType"><%=CoreTools.getRBString("Expj.Cmt0605",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:198px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:38px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-r3_PrintType">
expj.KU0020010.KU0020010form1.r3_PrintType = {};
// script1="onLoad;0;CALL;onClick@0"
expj.KU0020010.KU0020010form1.r3_PrintType.onLoad0 = function () {
  console.log('r3_PrintType script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.KU0020010.KU0020010form1.r3_PrintType.onClick0 = function () {
  console.log('r3_PrintType script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_DESINATED_SHIP_DATE_FROM,_CalendarDesinatedShipDateFrom,_DESINATED_SHIP_DATE_TO,_CalendarDesinatedShipDateTo,_SLIP_CD_FROM,_PeekerSlipCdFrom,_SLIP_CD_TO,_PeekerSlipCdTo"
expj.KU0020010.KU0020010form1.r3_PrintType.child0 = function () {
  console.log('r3_PrintType script3');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_DESINATED_SHIP_DATE_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_CalendarDesinatedShipDateFrom');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_DESINATED_SHIP_DATE_TO');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_CalendarDesinatedShipDateTo');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_SLIP_CD_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_PeekerSlipCdFrom');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_SLIP_CD_TO');
expj.common.pscript.setUnMaskToReferenceComponent('KU0020010', 'KU0020010form1', '_PeekerSlipCdTo');
};
expj.KU0020010.KU0020010form1.r3_PrintType.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.r3_PrintType['onClick' + i])) {
        expj.KU0020010.KU0020010form1.r3_PrintType['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010form1.r3_PrintType.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/r3_PrintType.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.r3_PrintType.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-r3_PrintType').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010form1', 'r3_PrintType', this, 'RadioButton');
    }
  });
  expj.KU0020010.KU0020010form1.r3_PrintType.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.r3_PrintType.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/r3_PrintType.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-r3_PrintType');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.r3_PrintType['onLoad' + i])) {
      expj.KU0020010.KU0020010form1.r3_PrintType['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="PrintType" data-name="r3_PrintType" value="true" <%= ("true".equals(TypeConverter.convert(aKU0020010Struct.getr3_PrintType())))?"checked=\"checked\"":"" %> class="" id="expj-KU0020010-KU0020010form1-r3_PrintType" ><label for="expj-KU0020010-KU0020010form1-r3_PrintType"><%=CoreTools.getRBString("Expj.Cmt0606",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:198px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:38px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:198px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:38px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_SHIP_DATE",rb)%></span><!-- 出荷指定日 --></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-DESINATED_SHIP_DATE_FROM">
expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_FROM = {};
expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/DESINATED_SHIP_DATE_FROM.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_FROM.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-DESINATED_SHIP_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0020010', 'KU0020010form1', 'DESINATED_SHIP_DATE_FROM', this);
  });
  expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_FROM.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/DESINATED_SHIP_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-DESINATED_SHIP_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0020010-KU0020010form1-DESINATED_SHIP_DATE_FROM" name="DESINATED_SHIP_DATE_FROM" class="KU0020010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0020010Struct.getDESINATED_SHIP_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-CalendarDesinatedShipDateFrom">
expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateFrom = {};
// script1="onClick;0;CALENDAR;_KU0020010form1/DESINATED_SHIP_DATE_FROM"
expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateFrom.onClick0 = function () {
  console.log('CalendarDesinatedShipDateFrom script1');
expj.common.pscript.executeCalendar('KU0020010','KU0020010form1','_KU0020010form1/DESINATED_SHIP_DATE_FROM');
};
expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateFrom['onClick' + i])) {
        expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateFrom['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateFrom.executeAllOnDecision = function () {
};
expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateFrom.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-CalendarDesinatedShipDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010form1', 'CalendarDesinatedShipDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0020010','KU0020010form1','_KU0020010form1/DESINATED_SHIP_DATE_FROM');
  expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateFrom.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateFrom.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/CalendarDesinatedShipDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-CalendarDesinatedShipDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0020010-KU0020010form1-CalendarDesinatedShipDateFrom" class="KU0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-DESINATED_SHIP_DATE_TO">
expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_TO = {};
expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_TO.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/DESINATED_SHIP_DATE_TO.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_TO.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-DESINATED_SHIP_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0020010', 'KU0020010form1', 'DESINATED_SHIP_DATE_TO', this);
  });
  expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_TO.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/DESINATED_SHIP_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-DESINATED_SHIP_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0020010-KU0020010form1-DESINATED_SHIP_DATE_TO" name="DESINATED_SHIP_DATE_TO" class="KU0020010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0020010Struct.getDESINATED_SHIP_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-CalendarDesinatedShipDateTo">
expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateTo = {};
// script1="onClick;0;CALENDAR;_KU0020010form1/DESINATED_SHIP_DATE_TO"
expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateTo.onClick0 = function () {
  console.log('CalendarDesinatedShipDateTo script1');
expj.common.pscript.executeCalendar('KU0020010','KU0020010form1','_KU0020010form1/DESINATED_SHIP_DATE_TO');
};
expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateTo['onClick' + i])) {
        expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateTo['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateTo.executeAllOnDecision = function () {
};
expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateTo.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-CalendarDesinatedShipDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010form1', 'CalendarDesinatedShipDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0020010','KU0020010form1','_KU0020010form1/DESINATED_SHIP_DATE_TO');
  expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateTo.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateTo.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/CalendarDesinatedShipDateTo.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-CalendarDesinatedShipDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0020010-KU0020010form1-CalendarDesinatedShipDateTo" class="KU0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:198px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:38px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SLIP_CD",rb)%></span><!-- 伝票番号 --></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-SLIP_CD_FROM">
expj.KU0020010.KU0020010form1.SLIP_CD_FROM = {};
expj.KU0020010.KU0020010form1.SLIP_CD_FROM.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/SLIP_CD_FROM.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.SLIP_CD_FROM.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-SLIP_CD_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0020010', 'KU0020010form1', 'SLIP_CD_FROM', this);
  });
  expj.KU0020010.KU0020010form1.SLIP_CD_FROM.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.SLIP_CD_FROM.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/SLIP_CD_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-SLIP_CD_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0020010-KU0020010form1-SLIP_CD_FROM" name="SLIP_CD_FROM" class="KU0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0020010Struct.getSLIP_CD_FROM()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-PeekerSlipCdFrom">
expj.KU0020010.KU0020010form1.PeekerSlipCdFrom = {};
// script1="onClick;0;PEEKER;_KU0020010form1/SLIP_CD_FROM@<%=contextNo%>"
expj.KU0020010.KU0020010form1.PeekerSlipCdFrom.onClick0 = function () {
  console.log('PeekerSlipCdFrom script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0020010';
var parameterValues = 'PeekerSlipCdFrom%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010form1', '_SLIP_CD_FROM') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%SLIP_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0020010form1/SLIP_CD_FROM%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0020010.KU0020010form1.PeekerSlipCdFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.PeekerSlipCdFrom['onClick' + i])) {
        expj.KU0020010.KU0020010form1.PeekerSlipCdFrom['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010form1.PeekerSlipCdFrom.executeAllOnDecision = function () {
};
expj.KU0020010.KU0020010form1.PeekerSlipCdFrom.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-PeekerSlipCdFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010form1', 'PeekerSlipCdFrom', this, 'Button');
    }
  });
  expj.KU0020010.KU0020010form1.PeekerSlipCdFrom.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.PeekerSlipCdFrom.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/PeekerSlipCdFrom.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-PeekerSlipCdFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0020010-KU0020010form1-PeekerSlipCdFrom" class="KU0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-SLIP_CD_TO">
expj.KU0020010.KU0020010form1.SLIP_CD_TO = {};
expj.KU0020010.KU0020010form1.SLIP_CD_TO.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/SLIP_CD_TO.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.SLIP_CD_TO.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-SLIP_CD_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0020010', 'KU0020010form1', 'SLIP_CD_TO', this);
  });
  expj.KU0020010.KU0020010form1.SLIP_CD_TO.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.SLIP_CD_TO.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/SLIP_CD_TO.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-SLIP_CD_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0020010-KU0020010form1-SLIP_CD_TO" name="SLIP_CD_TO" class="KU0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0020010Struct.getSLIP_CD_TO()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-PeekerSlipCdTo">
expj.KU0020010.KU0020010form1.PeekerSlipCdTo = {};
// script1="onClick;0;PEEKER;_KU0020010form1/SLIP_CD_TO@<%=contextNo%>"
expj.KU0020010.KU0020010form1.PeekerSlipCdTo.onClick0 = function () {
  console.log('PeekerSlipCdTo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0020010';
var parameterValues = 'PeekerSlipCdTo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010form1', '_SLIP_CD_TO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%SLIP_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0020010form1/SLIP_CD_TO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0020010.KU0020010form1.PeekerSlipCdTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.PeekerSlipCdTo['onClick' + i])) {
        expj.KU0020010.KU0020010form1.PeekerSlipCdTo['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010form1.PeekerSlipCdTo.executeAllOnDecision = function () {
};
expj.KU0020010.KU0020010form1.PeekerSlipCdTo.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-PeekerSlipCdTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010form1', 'PeekerSlipCdTo', this, 'Button');
    }
  });
  expj.KU0020010.KU0020010form1.PeekerSlipCdTo.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.PeekerSlipCdTo.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/PeekerSlipCdTo.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-PeekerSlipCdTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0020010-KU0020010form1-PeekerSlipCdTo" class="KU0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:38px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-WH_CD">
expj.KU0020010.KU0020010form1.WH_CD = {};
expj.KU0020010.KU0020010form1.WH_CD.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/WH_CD.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.WH_CD.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0020010', 'KU0020010form1', 'WH_CD', this);
  });
  expj.KU0020010.KU0020010form1.WH_CD.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.WH_CD.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0020010-KU0020010form1-WH_CD" name="WH_CD" class="KU0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0020010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-PeekerWhCd">
expj.KU0020010.KU0020010form1.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_KU0020010form1/WH_CD@<%=contextNo%>"
expj.KU0020010.KU0020010form1.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0020010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010form1', '_') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010form1', '_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0020010form1/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0020010.KU0020010form1.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.PeekerWhCd['onClick' + i])) {
        expj.KU0020010.KU0020010form1.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010form1.PeekerWhCd.executeAllOnDecision = function () {
};
expj.KU0020010.KU0020010form1.PeekerWhCd.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010form1', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.KU0020010.KU0020010form1.PeekerWhCd.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0020010-KU0020010form1-PeekerWhCd" class="KU0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:198px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:38px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-CUST_CD">
expj.KU0020010.KU0020010form1.CUST_CD = {};
expj.KU0020010.KU0020010form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/CUST_CD.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0020010', 'KU0020010form1', 'CUST_CD', this);
  });
  expj.KU0020010.KU0020010form1.CUST_CD.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0020010-KU0020010form1-CUST_CD" name="CUST_CD" class="KU0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0020010Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-PeekerCustCd">
expj.KU0020010.KU0020010form1.PeekerCustCd = {};
// script1="onClick;0;PEEKER;_KU0020010form1/CUST_CD@<%=contextNo%>"
expj.KU0020010.KU0020010form1.PeekerCustCd.onClick0 = function () {
  console.log('PeekerCustCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0020010';
var parameterValues = 'PeekerCustCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010form1', '_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0020010form1/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0020010.KU0020010form1.PeekerCustCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010form1.PeekerCustCd['onClick' + i])) {
        expj.KU0020010.KU0020010form1.PeekerCustCd['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010form1.PeekerCustCd.executeAllOnDecision = function () {
};
expj.KU0020010.KU0020010form1.PeekerCustCd.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-PeekerCustCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010form1', 'PeekerCustCd', this, 'Button');
    }
  });
  expj.KU0020010.KU0020010form1.PeekerCustCd.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.PeekerCustCd.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/PeekerCustCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-PeekerCustCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0020010-KU0020010form1-PeekerCustCd" class="KU0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010form1-c_ReOut">
expj.KU0020010.KU0020010form1.c_ReOut = {};
expj.KU0020010.KU0020010form1.c_ReOut.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/c_ReOut.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.c_ReOut.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-c_ReOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010form1', 'c_ReOut', this, 'CheckBox');
    }
  });
  expj.KU0020010.KU0020010form1.c_ReOut.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.c_ReOut.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/c_ReOut.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-c_ReOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:198px;text-align:left;"><input type="checkbox" name="c_ReOut" value="true" <%= ("true".equals(TypeConverter.convert(aKU0020010Struct.getc_ReOut())) || "1".equals(TypeConverter.convert(aKU0020010Struct.getc_ReOut())))?"checked=\"checked\"":"" %>  class="KU0020010-focus-move" id="expj-KU0020010-KU0020010form1-c_ReOut"><label for="expj-KU0020010-KU0020010form1-c_ReOut"><%=CoreTools.getRBString("Expj.Cmt0203",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KU0020010-KU0020010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0020010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-KU0020010-KU0020010form1-DOWNLOAD_FILE">
expj.KU0020010.KU0020010form1.DOWNLOAD_FILE = {};
expj.KU0020010.KU0020010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute KU0020010form1/DOWNLOAD_FILE.onDecision');
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
  expj.KU0020010.executeAllOnDecision();
};
expj.KU0020010.KU0020010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0020010', 'KU0020010form1', 'DOWNLOAD_FILE', this);
  });
  expj.KU0020010.KU0020010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.KU0020010.KU0020010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute KU0020010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:38px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
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
<span class="version">KU0020010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-KU0020010-KU0020010button0">
expj.KU0020010.KU0020010button0 = {};
expj.KU0020010.KU0020010button0.executeAllOnDecision = function () {
  console.log('execute KU0020010button0.onDecision');
};
expj.KU0020010.KU0020010button0.executeOnLoad = function () {
  expj.KU0020010.KU0020010button0.executePScriptOnLoad();
};

expj.KU0020010.KU0020010button0.executePScriptOnLoad = function () {
  console.log('execute KU0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0020010-KU0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0020010-KU0020010button0-Print">
expj.KU0020010.KU0020010button0.Print = {};
// script1="onClick;0;CHK;_KU0020010form1/DESINATED_SHIP_DATE_FROM[neq][and]_KU0020010form1/DESINATED_SHIP_DATE_TO[neq][and]_KU0020010form1/DESINATED_SHIP_DATE_FROM[gt]_KU0020010form1/DESINATED_SHIP_DATE_TO@#KU01004"
expj.KU0020010.KU0020010button0.Print.onClick0 = function () {
  console.log('Print script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010button0', '_KU0020010form1/DESINATED_SHIP_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010button0', '_KU0020010form1/DESINATED_SHIP_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010button0', '_KU0020010form1/DESINATED_SHIP_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010button0', '_KU0020010form1/DESINATED_SHIP_DATE_TO')))) {
expj.common.pscript.addErrorMessage('KU0020010', 'KU0020010button0', 'KU01004');
}
};
// script2="onClick;1;CHK;_KU0020010form1/SLIP_CD_FROM[neq][and]_KU0020010form1/SLIP_CD_TO[neq][and]_KU0020010form1/SLIP_CD_FROM[gt]_KU0020010form1/SLIP_CD_TO@#KU01005"
expj.KU0020010.KU0020010button0.Print.onClick1 = function () {
  console.log('Print script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010button0', '_KU0020010form1/SLIP_CD_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010button0', '_KU0020010form1/SLIP_CD_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010button0', '_KU0020010form1/SLIP_CD_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0020010', 'KU0020010button0', '_KU0020010form1/SLIP_CD_TO')))) {
expj.common.pscript.addErrorMessage('KU0020010', 'KU0020010button0', 'KU01005');
}
};
// script3="onClick;2;PRINTER;ORTEUS_HASHED=<%=hashed%>,_KU0020010form1/*@KU0020010Servlet:H,H,H"
expj.KU0020010.KU0020010button0.Print.onClick2 = function () {
  console.log('Print script3');
expj.common.pscript.viewPrinterDialog('KU0020010', 'KU0020010button0', '_KU0020010form1/*', 'KU0020010Servlet', 'H,H,H');
};
expj.KU0020010.KU0020010button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010button0.Print['onClick' + i])) {
        expj.KU0020010.KU0020010button0.Print['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010button0.Print.executeAllOnDecision = function () {
};
expj.KU0020010.KU0020010button0.Print.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010button0', 'Print', this, 'Button');
    }
  });
  expj.KU0020010.KU0020010button0.Print.executePScriptOnLoad();
};

expj.KU0020010.KU0020010button0.Print.executePScriptOnLoad = function () {
  console.log('execute KU0020010button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0020010-KU0020010button0-Print" name="Print" class="KU0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 帳票出力ボタン --></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010button0-Clear">
expj.KU0020010.KU0020010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KU0020010Servlet,,$ZZ07008"
expj.KU0020010.KU0020010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0020010', 'KU0020010button0', '', 'KU0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0020010', response);
expj.common.updateBusinessScreenTab('KU0020010', contents);
};
expj.common.pscript.callConfirm('KU0020010', 'KU0020010button0', 'ZZ07008', okEvent);
};
expj.KU0020010.KU0020010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010button0.Clear['onClick' + i])) {
        expj.KU0020010.KU0020010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010button0.Clear.executeAllOnDecision = function () {
};
expj.KU0020010.KU0020010button0.Clear.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010button0', 'Clear', this, 'Button');
    }
  });
  expj.KU0020010.KU0020010button0.Clear.executePScriptOnLoad();
};

expj.KU0020010.KU0020010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KU0020010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0020010-KU0020010button0-Clear" name="Clear" class="KU0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KU0020010-KU0020010button0-Close">
expj.KU0020010.KU0020010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KU0020010.KU0020010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KU0020010');
};
expj.KU0020010.KU0020010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0020010.KU0020010button0.Close['onClick' + i])) {
        expj.KU0020010.KU0020010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KU0020010.KU0020010button0.Close.executeAllOnDecision = function () {
};
expj.KU0020010.KU0020010button0.Close.executeOnLoad = function () {
  $('#expj-KU0020010-KU0020010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0020010', 'KU0020010button0', 'Close', this, 'Button');
    }
  });
  expj.KU0020010.KU0020010button0.Close.executePScriptOnLoad();
};

expj.KU0020010.KU0020010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KU0020010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KU0020010-KU0020010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0020010-KU0020010button0-Close" name="Close" class="KU0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KU0020010 (END)-->
<%
MessageStruct msgStruct = aKU0020010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KU0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KU0020010)) {
  expj.common.treeInstanceMap.KU0020010 = {};
}
expj.common.treeInstanceMap.KU0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KU0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KU0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KU0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KU0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KU0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KU0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KU0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KU0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0020010)) {
  expj.common.detailDialogMap.KU0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KU0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.KU0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KU0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KU0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KU0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KU0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KU0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KU0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KU0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KU0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KU0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KU0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KU0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KU0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KU0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KU0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KU0020010)) {
  expj.common.viewInstanceMap.KU0020010 = {};
}
expj.common.viewInstanceMap.KU0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.KU0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KU0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KU0020010.<%=viewId %>.init = function () {
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
    expj.KU0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KU0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KU0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KU0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KU0020010_init">
/**
 * KU0020010用のロード完了時初期化関数
 */
expj.KU0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KU0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KU0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KU0020010');
  expj.common.calendarInstanceMap.KU0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KU0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KU0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.KU0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KU0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KU0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KU0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KU0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KU0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KU0020010-<%=detailId %>');
<%
 }
%>
  try{expj.KU0020010.KU0020010form1.r1_PrintType.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.r2_PrintType.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.r3_PrintType.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateFrom.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.DESINATED_SHIP_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.CalendarDesinatedShipDateTo.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.SLIP_CD_FROM.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.PeekerSlipCdFrom.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.SLIP_CD_TO.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.PeekerSlipCdTo.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.WH_CD.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.PeekerCustCd.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.c_ReOut.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010button0.Print.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010form1.executeOnLoad();}catch(e){};
  try{expj.KU0020010.KU0020010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KU0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KU0020010', 'KU0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KU0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KU0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.KU0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KU0020010', '<%=request.getContextPath() %>');
};

/**
 * KU0020010の全体onDecision処理
 */
expj.KU0020010.executeAllOnDecision = function () {
  expj.KU0020010.KU0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KU0020010_console">
expj.KU0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>