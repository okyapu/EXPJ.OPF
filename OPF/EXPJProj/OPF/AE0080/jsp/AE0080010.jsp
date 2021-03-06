<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:35:26 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AE0080\AE0080010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0080.*" %>
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
<jsp:useBean id="aAE0080010Control" class="com.nec.jp.orteus.metamorBase.AE0080.AE0080010Control" scope="request"/>
<jsp:useBean id="aAE0080010Struct" class="com.nec.jp.orteus.metamorBase.AE0080.AE0080010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

EDI注文取消データ作成
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0080/jsp/AE0080010.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $　$Date: 2017/02/22 02:05:19 $
********************************************************* --%>
<html>
<head>
<title>EDI注文取消データ作成</title>
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
<script class="expj-script-AE0080010_init">
  // AE0080010名前空間
  expj.AE0080010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0080010" data-screen="AE0080010" data-newdata="<%=aAE0080010Control.isNewData() %>">
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
              <script class="expj-script-AE0080010-AE0080010form1">
expj.AE0080010.AE0080010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AE0080010.AE0080010form1.onLoad0 = function () {
  console.log('AE0080010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0080010.AE0080010form1.onDecision0 = function () {
  console.log('AE0080010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0080010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0080010button1/Select"
expj.AE0080010.AE0080010form1.child0 = function () {
  console.log('AE0080010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0080010', 'AE0080010form1', '_AE0080010button1/Select');
};
// script4="child;1;MASK;_AE0080010button1/Select"
expj.AE0080010.AE0080010form1.child1 = function () {
  console.log('AE0080010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0080010', 'AE0080010form1', '_AE0080010button1/Select');
};
// script5="onDecision;1;CHKRQ;?AE0080010view1/?[neq]NOT_SELECTED@*2,*4"
expj.AE0080010.AE0080010form1.onDecision1 = function () {
  console.log('AE0080010form1 script5');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?AE0080010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?PLANT_CD[eq]SAME[and]?PUCH_ODR_START_DATE_FROM[eq]SAME[and]?PUCH_ODR_START_DATE_TO[eq]SAME[and]?PUCH_ODR_DLV_DATE_FROM[eq]SAME[and]?PUCH_ODR_DLV_DATE_TO[eq]SAME[and]?ACPT_DATE_FROM[eq]SAME[and]?ACPT_DATE_TO[eq]SAME[and]?PUCH_ODR_CD[eq]SAME[and]?JOB_ODR_CD[eq]SAME[and]?VEND_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?PUCH_ODR_PERSON[eq]SAME[and]?ReOutputFlg[eq]SAME[and]?AE0080010form1/*[eq]NORMAL@*3,*4"
expj.AE0080010.AE0080010form1.child2 = function () {
  console.log('AE0080010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_START_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_START_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_DLV_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_DLV_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?ACPT_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?ACPT_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_PERSON'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?ReOutputFlg'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?AE0080010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AE0080010button2/Insert"
expj.AE0080010.AE0080010form1.child3 = function () {
  console.log('AE0080010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AE0080010', 'AE0080010form1', '_AE0080010button2/Insert');
};
// script8="child;4;MASK;_AE0080010button2/Insert"
expj.AE0080010.AE0080010form1.child4 = function () {
  console.log('AE0080010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AE0080010', 'AE0080010form1', '_AE0080010button2/Insert');
};
// script9="onDecision;2;CHK;?PLANT_CD[eq]SAME[and]?PUCH_ODR_START_DATE_FROM[eq]SAME[and]?PUCH_ODR_START_DATE_TO[eq]SAME[and]?PUCH_ODR_DLV_DATE_FROM[eq]SAME[and]?PUCH_ODR_DLV_DATE_TO[eq]SAME[and]?ACPT_DATE_FROM[eq]SAME[and]?ACPT_DATE_TO[eq]SAME[and]?PUCH_ODR_CD[eq]SAME[and]?JOB_ODR_CD[eq]SAME[and]?VEND_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?PUCH_ODR_PERSON[eq]SAME[and]?ReOutputFlg[eq]SAME[and]?AE0080010form1/*[eq]NORMAL@*5,*6"
expj.AE0080010.AE0080010form1.onDecision2 = function () {
  console.log('AE0080010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_START_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_START_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_DLV_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_DLV_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?ACPT_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?ACPT_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?PUCH_ODR_PERSON'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?ReOutputFlg'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '?AE0080010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;UNMASK;_AE0080010button2/CheckAll,_AE0080010button2/UncheckAll"
expj.AE0080010.AE0080010form1.child5 = function () {
  console.log('AE0080010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AE0080010', 'AE0080010form1', '_AE0080010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('AE0080010', 'AE0080010form1', '_AE0080010button2/UncheckAll');
};
// script11="child;6;MASK;_AE0080010button2/CheckAll,_AE0080010button2/UncheckAll"
expj.AE0080010.AE0080010form1.child6 = function () {
  console.log('AE0080010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AE0080010', 'AE0080010form1', '_AE0080010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AE0080010', 'AE0080010form1', '_AE0080010button2/UncheckAll');
};
expj.AE0080010.AE0080010form1.executeAllOnDecision = function () {
  console.log('execute AE0080010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1['onDecision' + i])) {
        expj.AE0080010.AE0080010form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.executeOnLoad = function () {
  expj.AE0080010.AE0080010form1.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1['onLoad' + i])) {
      expj.AE0080010.AE0080010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0080010-AE0080010form1" action="AE0080010Servlet" name="AE0080010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0080010Control.getReadStatusString()) %>" style="height:211px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:211px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PLANT_CD">
expj.AE0080010.AE0080010form1.PLANT_CD = {};
expj.AE0080010.AE0080010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/PLANT_CD.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'PLANT_CD', this);
  });
  expj.AE0080010.AE0080010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-PLANT_CD" name="PLANT_CD" class="AE0080010-focus-move  required-value expj-AE0080010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PeekerPlantCd">
expj.AE0080010.AE0080010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AE0080010form1/PLANT_CD@<%=contextNo%>"
expj.AE0080010.AE0080010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0080010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0080010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0080010.AE0080010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.PeekerPlantCd['onClick' + i])) {
        expj.AE0080010.AE0080010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-PeekerPlantCd" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PLANT_NAME">
expj.AE0080010.AE0080010form1.PLANT_NAME = {};
expj.AE0080010.AE0080010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/PLANT_NAME.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'PLANT_NAME', this);
  });
  expj.AE0080010.AE0080010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-PLANT_NAME" name="PLANT_NAME" class="AE0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_START_DATE_1",rb)%></span><!-- 発注予定日 --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PUCH_ODR_START_DATE_FROM">
expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_FROM = {};
expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/PUCH_ODR_START_DATE_FROM.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_FROM.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PUCH_ODR_START_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'PUCH_ODR_START_DATE_FROM', this);
  });
  expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_FROM.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PUCH_ODR_START_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PUCH_ODR_START_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-PUCH_ODR_START_DATE_FROM" name="PUCH_ODR_START_DATE_FROM" class="AE0080010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getPUCH_ODR_START_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-CalendarPuchOdrStartDateFrom">
expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateFrom = {};
// script1="onClick;0;CALENDAR;_AE0080010form1/PUCH_ODR_START_DATE_FROM"
expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateFrom.onClick0 = function () {
  console.log('CalendarPuchOdrStartDateFrom script1');
expj.common.pscript.executeCalendar('AE0080010','AE0080010form1','_AE0080010form1/PUCH_ODR_START_DATE_FROM');
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateFrom['onClick' + i])) {
        expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateFrom.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateFrom.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-CalendarPuchOdrStartDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'CalendarPuchOdrStartDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0080010','AE0080010form1','_AE0080010form1/PUCH_ODR_START_DATE_FROM');
  expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateFrom.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateFrom.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/CalendarPuchOdrStartDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-CalendarPuchOdrStartDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-CalendarPuchOdrStartDateFrom" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- 〜 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PUCH_ODR_START_DATE_TO">
expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_TO = {};
expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/PUCH_ODR_START_DATE_TO.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_TO.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PUCH_ODR_START_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'PUCH_ODR_START_DATE_TO', this);
  });
  expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_TO.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PUCH_ODR_START_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PUCH_ODR_START_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-PUCH_ODR_START_DATE_TO" name="PUCH_ODR_START_DATE_TO" class="AE0080010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getPUCH_ODR_START_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-CalendarPuchOdrStartDateTo">
expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateTo = {};
// script1="onClick;0;CALENDAR;_AE0080010form1/PUCH_ODR_START_DATE_TO"
expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateTo.onClick0 = function () {
  console.log('CalendarPuchOdrStartDateTo script1');
expj.common.pscript.executeCalendar('AE0080010','AE0080010form1','_AE0080010form1/PUCH_ODR_START_DATE_TO');
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateTo['onClick' + i])) {
        expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateTo['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateTo.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateTo.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-CalendarPuchOdrStartDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'CalendarPuchOdrStartDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0080010','AE0080010form1','_AE0080010form1/PUCH_ODR_START_DATE_TO');
  expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateTo.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateTo.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/CalendarPuchOdrStartDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-CalendarPuchOdrStartDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-CalendarPuchOdrStartDateTo" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-ReOutputFlg">
expj.AE0080010.AE0080010form1.ReOutputFlg = {};
expj.AE0080010.AE0080010form1.ReOutputFlg.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/ReOutputFlg.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.ReOutputFlg.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-ReOutputFlg').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'ReOutputFlg', this, 'CheckBox');
    }
  });
  expj.AE0080010.AE0080010form1.ReOutputFlg.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.ReOutputFlg.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/ReOutputFlg.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-ReOutputFlg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="ReOutputFlg" value="true" <%= ("true".equals(TypeConverter.convert(aAE0080010Struct.getReOutputFlg())) || "1".equals(TypeConverter.convert(aAE0080010Struct.getReOutputFlg())))?"checked=\"checked\"":"" %>  class="AE0080010-focus-move" id="expj-AE0080010-AE0080010form1-ReOutputFlg"><label for="expj-AE0080010-AE0080010form1-ReOutputFlg"><%=CoreTools.getRBString("Expj.Cmt0203",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb)%></span><!-- 発注納期 --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PUCH_ODR_DLV_DATE_FROM">
expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_FROM = {};
expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/PUCH_ODR_DLV_DATE_FROM.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_FROM.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PUCH_ODR_DLV_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'PUCH_ODR_DLV_DATE_FROM', this);
  });
  expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_FROM.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PUCH_ODR_DLV_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PUCH_ODR_DLV_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-PUCH_ODR_DLV_DATE_FROM" name="PUCH_ODR_DLV_DATE_FROM" class="AE0080010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getPUCH_ODR_DLV_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-CalendarPuchOdrDlvDateFrom">
expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateFrom = {};
// script1="onClick;0;CALENDAR;_AE0080010form1/PUCH_ODR_DLV_DATE_FROM"
expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateFrom.onClick0 = function () {
  console.log('CalendarPuchOdrDlvDateFrom script1');
expj.common.pscript.executeCalendar('AE0080010','AE0080010form1','_AE0080010form1/PUCH_ODR_DLV_DATE_FROM');
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateFrom['onClick' + i])) {
        expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateFrom.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateFrom.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-CalendarPuchOdrDlvDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'CalendarPuchOdrDlvDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0080010','AE0080010form1','_AE0080010form1/PUCH_ODR_DLV_DATE_FROM');
  expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateFrom.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateFrom.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/CalendarPuchOdrDlvDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-CalendarPuchOdrDlvDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-CalendarPuchOdrDlvDateFrom" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- 〜 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PUCH_ODR_DLV_DATE_TO">
expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_TO = {};
expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/PUCH_ODR_DLV_DATE_TO.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_TO.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PUCH_ODR_DLV_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'PUCH_ODR_DLV_DATE_TO', this);
  });
  expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_TO.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PUCH_ODR_DLV_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PUCH_ODR_DLV_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-PUCH_ODR_DLV_DATE_TO" name="PUCH_ODR_DLV_DATE_TO" class="AE0080010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getPUCH_ODR_DLV_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-CalendarPuchOdrDlvDateTo">
expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateTo = {};
// script1="onClick;0;CALENDAR;_AE0080010form1/PUCH_ODR_DLV_DATE_TO"
expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateTo.onClick0 = function () {
  console.log('CalendarPuchOdrDlvDateTo script1');
expj.common.pscript.executeCalendar('AE0080010','AE0080010form1','_AE0080010form1/PUCH_ODR_DLV_DATE_TO');
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateTo['onClick' + i])) {
        expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateTo['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateTo.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateTo.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-CalendarPuchOdrDlvDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'CalendarPuchOdrDlvDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0080010','AE0080010form1','_AE0080010form1/PUCH_ODR_DLV_DATE_TO');
  expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateTo.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateTo.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/CalendarPuchOdrDlvDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-CalendarPuchOdrDlvDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-CalendarPuchOdrDlvDateTo" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_CANCEL_DATE",rb)%></span><!-- 注文取消日 --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-ACPT_DATE_FROM">
expj.AE0080010.AE0080010form1.ACPT_DATE_FROM = {};
expj.AE0080010.AE0080010form1.ACPT_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/ACPT_DATE_FROM.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.ACPT_DATE_FROM.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-ACPT_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'ACPT_DATE_FROM', this);
  });
  expj.AE0080010.AE0080010form1.ACPT_DATE_FROM.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.ACPT_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/ACPT_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-ACPT_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-ACPT_DATE_FROM" name="ACPT_DATE_FROM" class="AE0080010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getACPT_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-AcptDateFrom">
expj.AE0080010.AE0080010form1.AcptDateFrom = {};
// script1="onClick;0;CALENDAR;_AE0080010form1/ACPT_DATE_FROM"
expj.AE0080010.AE0080010form1.AcptDateFrom.onClick0 = function () {
  console.log('AcptDateFrom script1');
expj.common.pscript.executeCalendar('AE0080010','AE0080010form1','_AE0080010form1/ACPT_DATE_FROM');
};
expj.AE0080010.AE0080010form1.AcptDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.AcptDateFrom['onClick' + i])) {
        expj.AE0080010.AE0080010form1.AcptDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.AcptDateFrom.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.AcptDateFrom.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-AcptDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'AcptDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0080010','AE0080010form1','_AE0080010form1/ACPT_DATE_FROM');
  expj.AE0080010.AE0080010form1.AcptDateFrom.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.AcptDateFrom.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/AcptDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-AcptDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-AcptDateFrom" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- 〜 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-ACPT_DATE_TO">
expj.AE0080010.AE0080010form1.ACPT_DATE_TO = {};
expj.AE0080010.AE0080010form1.ACPT_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/ACPT_DATE_TO.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.ACPT_DATE_TO.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-ACPT_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'ACPT_DATE_TO', this);
  });
  expj.AE0080010.AE0080010form1.ACPT_DATE_TO.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.ACPT_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/ACPT_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-ACPT_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-ACPT_DATE_TO" name="ACPT_DATE_TO" class="AE0080010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getACPT_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-AcptDateTo">
expj.AE0080010.AE0080010form1.AcptDateTo = {};
// script1="onClick;0;CALENDAR;_AE0080010form1/ACPT_DATE_TO"
expj.AE0080010.AE0080010form1.AcptDateTo.onClick0 = function () {
  console.log('AcptDateTo script1');
expj.common.pscript.executeCalendar('AE0080010','AE0080010form1','_AE0080010form1/ACPT_DATE_TO');
};
expj.AE0080010.AE0080010form1.AcptDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.AcptDateTo['onClick' + i])) {
        expj.AE0080010.AE0080010form1.AcptDateTo['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.AcptDateTo.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.AcptDateTo.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-AcptDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'AcptDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0080010','AE0080010form1','_AE0080010form1/ACPT_DATE_TO');
  expj.AE0080010.AE0080010form1.AcptDateTo.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.AcptDateTo.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/AcptDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-AcptDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-AcptDateTo" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PUCH_ODR_CD">
expj.AE0080010.AE0080010form1.PUCH_ODR_CD = {};
expj.AE0080010.AE0080010form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/PUCH_ODR_CD.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0080010.AE0080010form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PeekerPuchOdrDd">
expj.AE0080010.AE0080010form1.PeekerPuchOdrDd = {};
// script1="onClick;0;PEEKER;_AE0080010form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AE0080010.AE0080010form1.PeekerPuchOdrDd.onClick0 = function () {
  console.log('PeekerPuchOdrDd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0080010';
var parameterValues = 'PeekerPuchOdrDd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '_PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_16%&%';
parameterValues += 'TARGET_FIELD%=%_AE0080010form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0080010.AE0080010form1.PeekerPuchOdrDd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.PeekerPuchOdrDd['onClick' + i])) {
        expj.AE0080010.AE0080010form1.PeekerPuchOdrDd['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.PeekerPuchOdrDd.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.PeekerPuchOdrDd.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PeekerPuchOdrDd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'PeekerPuchOdrDd', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010form1.PeekerPuchOdrDd.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PeekerPuchOdrDd.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PeekerPuchOdrDd.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PeekerPuchOdrDd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-PeekerPuchOdrDd" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-JOB_ODR_CD">
expj.AE0080010.AE0080010form1.JOB_ODR_CD = {};
expj.AE0080010.AE0080010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/JOB_ODR_CD.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'JOB_ODR_CD', this);
  });
  expj.AE0080010.AE0080010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AE0080010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-VEND_CD">
expj.AE0080010.AE0080010form1.VEND_CD = {};
expj.AE0080010.AE0080010form1.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/VEND_CD.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.VEND_CD.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'VEND_CD', this);
  });
  expj.AE0080010.AE0080010form1.VEND_CD.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-VEND_CD" name="VEND_CD" class="AE0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PeekerVendCd">
expj.AE0080010.AE0080010form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AE0080010form1/VEND_CD@<%=contextNo%>"
expj.AE0080010.AE0080010form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0080010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AE0080010form1/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0080010.AE0080010form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.PeekerVendCd['onClick' + i])) {
        expj.AE0080010.AE0080010form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010form1.PeekerVendCd.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-PeekerVendCd" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-VEND_NAME">
expj.AE0080010.AE0080010form1.VEND_NAME = {};
expj.AE0080010.AE0080010form1.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/VEND_NAME.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.VEND_NAME.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'VEND_NAME', this);
  });
  expj.AE0080010.AE0080010form1.VEND_NAME.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-VEND_NAME" name="VEND_NAME" class="AE0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getVEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-ITEM_CD">
expj.AE0080010.AE0080010form1.ITEM_CD = {};
expj.AE0080010.AE0080010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/ITEM_CD.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'ITEM_CD', this);
  });
  expj.AE0080010.AE0080010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-ITEM_CD" name="ITEM_CD" class="AE0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PeekerItemCd">
expj.AE0080010.AE0080010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AE0080010form1/ITEM_CD@<%=contextNo%>"
expj.AE0080010.AE0080010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0080010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0080010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0080010.AE0080010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.PeekerItemCd['onClick' + i])) {
        expj.AE0080010.AE0080010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-PeekerItemCd" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-ITEM_NAME">
expj.AE0080010.AE0080010form1.ITEM_NAME = {};
expj.AE0080010.AE0080010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/ITEM_NAME.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'ITEM_NAME', this);
  });
  expj.AE0080010.AE0080010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-ITEM_NAME" name="ITEM_NAME" class="AE0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_PERSON",rb)%></span><!-- 発注担当者コード --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PUCH_ODR_PERSON">
expj.AE0080010.AE0080010form1.PUCH_ODR_PERSON = {};
expj.AE0080010.AE0080010form1.PUCH_ODR_PERSON.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/PUCH_ODR_PERSON.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.PUCH_ODR_PERSON.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PUCH_ODR_PERSON').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'PUCH_ODR_PERSON', this);
  });
  expj.AE0080010.AE0080010form1.PUCH_ODR_PERSON.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PUCH_ODR_PERSON.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PUCH_ODR_PERSON.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PUCH_ODR_PERSON');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-PUCH_ODR_PERSON" name="PUCH_ODR_PERSON" class="AE0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getPUCH_ODR_PERSON()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-PeekerPuchOdrPerson">
expj.AE0080010.AE0080010form1.PeekerPuchOdrPerson = {};
// script1="onClick;0;PEEKER;_AE0080010form1/PUCH_ODR_PERSON@<%=contextNo%>"
expj.AE0080010.AE0080010form1.PeekerPuchOdrPerson.onClick0 = function () {
  console.log('PeekerPuchOdrPerson script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0080010';
var parameterValues = 'PeekerPuchOdrPerson%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010form1', '_PUCH_ODR_PERSON') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0080010form1/PUCH_ODR_PERSON%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0080010.AE0080010form1.PeekerPuchOdrPerson.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010form1.PeekerPuchOdrPerson['onClick' + i])) {
        expj.AE0080010.AE0080010form1.PeekerPuchOdrPerson['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010form1.PeekerPuchOdrPerson.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010form1.PeekerPuchOdrPerson.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-PeekerPuchOdrPerson').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010form1', 'PeekerPuchOdrPerson', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010form1.PeekerPuchOdrPerson.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.PeekerPuchOdrPerson.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/PeekerPuchOdrPerson.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-PeekerPuchOdrPerson');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0080010-AE0080010form1-PeekerPuchOdrPerson" class="AE0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010form1-USER_NAME">
expj.AE0080010.AE0080010form1.USER_NAME = {};
expj.AE0080010.AE0080010form1.USER_NAME.executeAllOnDecision = function () {
  console.log('execute AE0080010form1/USER_NAME.onDecision');
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
  expj.AE0080010.executeAllOnDecision();
};
expj.AE0080010.AE0080010form1.USER_NAME.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010form1-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0080010', 'AE0080010form1', 'USER_NAME', this);
  });
  expj.AE0080010.AE0080010form1.USER_NAME.executePScriptOnLoad();
};

expj.AE0080010.AE0080010form1.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0080010form1/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010form1-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0080010-AE0080010form1-USER_NAME" name="USER_NAME" class="AE0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0080010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0080010-AE0080010button1">
expj.AE0080010.AE0080010button1 = {};
expj.AE0080010.AE0080010button1.executeAllOnDecision = function () {
  console.log('execute AE0080010button1.onDecision');
};
expj.AE0080010.AE0080010button1.executeOnLoad = function () {
  expj.AE0080010.AE0080010button1.executePScriptOnLoad();
};

expj.AE0080010.AE0080010button1.executePScriptOnLoad = function () {
  console.log('execute AE0080010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0080010-AE0080010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0080010-AE0080010button1-Select">
expj.AE0080010.AE0080010button1.Select = {};
// script1="onClick;0;CHK;_AE0080010form1/PUCH_ODR_START_DATE_FROM[neq][and]_AE0080010form1/PUCH_ODR_START_DATE_TO[neq]@*0"
expj.AE0080010.AE0080010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/PUCH_ODR_START_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/PUCH_ODR_START_DATE_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AE0080010form1/PUCH_ODR_START_DATE_FROM[gt]_AE0080010form1/PUCH_ODR_START_DATE_TO@#AE00082"
expj.AE0080010.AE0080010button1.Select.child0 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/PUCH_ODR_START_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/PUCH_ODR_START_DATE_TO')))) {
expj.common.pscript.addErrorMessage('AE0080010', 'AE0080010button1', 'AE00082');
}
};
// script3="onClick;1;CHK;_AE0080010form1/PUCH_ODR_DLV_DATE_FROM[neq][and]_AE0080010form1/PUCH_ODR_DLV_DATE_TO[neq]@*1"
expj.AE0080010.AE0080010button1.Select.onClick1 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/PUCH_ODR_DLV_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/PUCH_ODR_DLV_DATE_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;_AE0080010form1/PUCH_ODR_DLV_DATE_FROM[gt]_AE0080010form1/PUCH_ODR_DLV_DATE_TO@#AE00083"
expj.AE0080010.AE0080010button1.Select.child1 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/PUCH_ODR_DLV_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/PUCH_ODR_DLV_DATE_TO')))) {
expj.common.pscript.addErrorMessage('AE0080010', 'AE0080010button1', 'AE00083');
}
};
// script5="onClick;2;CHK;_AE0080010form1/ACPT_DATE_FROM[neq][and]_AE0080010form1/ACPT_DATE_TO[neq]@*2"
expj.AE0080010.AE0080010button1.Select.onClick2 = function () {
  console.log('Select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/ACPT_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/ACPT_DATE_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;2;CHK;_AE0080010form1/ACPT_DATE_FROM[gt]_AE0080010form1/ACPT_DATE_TO@#AE00084"
expj.AE0080010.AE0080010button1.Select.child2 = function () {
  console.log('Select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/ACPT_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/ACPT_DATE_TO')))) {
expj.common.pscript.addErrorMessage('AE0080010', 'AE0080010button1', 'AE00084');
}
};
// script7="onClick;3;CHK;_AE0080010form1/ODR_CANCEL_SLIP_ISS_DATE_FROM[neq][and]_AE0080010form1/ODR_CANCEL_SLIP_ISS_DATE_TO[neq]@*3"
expj.AE0080010.AE0080010button1.Select.onClick3 = function () {
  console.log('Select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/ODR_CANCEL_SLIP_ISS_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/ODR_CANCEL_SLIP_ISS_DATE_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script8="child;3;CHK;_AE0080010form1/ODR_CANCEL_SLIP_ISS_DATE_FROM[gt]_AE0080010form1/ODR_CANCEL_SLIP_ISS_DATE_TO@#AE00085"
expj.AE0080010.AE0080010button1.Select.child3 = function () {
  console.log('Select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/ODR_CANCEL_SLIP_ISS_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0080010', 'AE0080010button1', '_AE0080010form1/ODR_CANCEL_SLIP_ISS_DATE_TO')))) {
expj.common.pscript.addErrorMessage('AE0080010', 'AE0080010button1', 'AE00085');
}
};
// script9="onClick;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0080010form1/*@AE0080010Servlet"
expj.AE0080010.AE0080010button1.Select.onClick4 = function () {
  console.log('Select script9');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0080010', 'AE0080010button1', '_AE0080010form1/*', 'AE0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0080010', response);
expj.common.updateBusinessScreenTab('AE0080010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0080010.AE0080010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010button1.Select['onClick' + i])) {
        expj.AE0080010.AE0080010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010button1.Select.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010button1.Select.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010button1', 'Select', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010button1.Select.executePScriptOnLoad();
};

expj.AE0080010.AE0080010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0080010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0080010-AE0080010button1-Select" name="Select" class="AE0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AE0080010-AE0080010view1">
expj.AE0080010.AE0080010view1 = {};
expj.AE0080010.AE0080010view1.executeAllOnClick = function () {
};
expj.AE0080010.AE0080010view1.executeAllOnDecision = function () {
  console.log('execute AE0080010view1.onDecision');
};
expj.AE0080010.AE0080010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0080010view1", "expj.AE0080010.AE0080010view1.executeAllOnClick");
%>
  expj.AE0080010.AE0080010view1.executePScriptOnLoad();
};

expj.AE0080010.AE0080010view1.executePScriptOnLoad = function () {
  console.log('execute AE0080010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0080010-AE0080010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0080010view1_Id = "AE0080010view1";
 String AE0080010view1_select = "single";
 String AE0080010view1_sortable = "true";
 String AE0080010view1_resize = "true";
 String AE0080010view1_scroll = "true";
 StringBuffer AE0080010view1_HB = new StringBuffer();
 StringBuffer AE0080010view1_DB = new StringBuffer();
%>
<%
 AE0080010view1_select = "multi";
 AE0080010view1_sortable = "true";
 AE0080010view1_resize = "true";
 AE0080010view1_scroll = "true";
%>
<%
 AE0080010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
%>
     
<%
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'l_PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_START_DATE_1",rb))).append("', 'name':'l_PUCH_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb))).append("', 'name':'l_PUCH_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb))).append("', 'name':'l_PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_SLIP_ISS_DATE",rb))).append("', 'name':'l_PUCH_ODR_SLIP_ISS_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_CANCEL_DATE",rb))).append("', 'name':'l_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_CANCEL_SLIP_ISS_DATE",rb))).append("', 'name':'l_ODR_CANCEL_SLIP_ISS_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'l_PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'l_VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_PERSON",rb))).append("', 'name':'l_PUCH_ODR_PERSON', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_PERSON_1",rb))).append("', 'name':'l_USER_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_CANCEL_CAUSE_CD",rb))).append("', 'name':'l_ODR_CANCEL_CAUSE_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_COMMENT",rb))).append("', 'name':'l_ACPT_RSLT_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
AE0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0080010view1_sortable).append("}").append(",");
%>
<%
 int aAE0080010StructLength = aAE0080010Control.getListsize();
 final AE0080010Struct structBackup = aAE0080010Struct;
 aAE0080010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0080010StructLength; ++loopCount) {
  if((aAE0080010Struct = (AE0080010Struct) aAE0080010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0080010Struct", aAE0080010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0080010view1_DB.append("[");
 AE0080010view1_DB.append(loopCount);
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_PLANT_CD\" data-name=\"l_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_PLANT_CD())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_PUCH_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_PUCH_ODR_START_DATE\" data-name=\"l_PUCH_ODR_START_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_PUCH_ODR_START_DATE())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_PUCH_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_PUCH_ODR_DLV_DATE\" data-name=\"l_PUCH_ODR_DLV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_PUCH_ODR_DLV_DATE())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_PUCH_ODR_QTY\" data-name=\"l_PUCH_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_PUCH_ODR_QTY())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_STOCK_UNIT())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_PUCH_ODR_SLIP_ISS_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_PUCH_ODR_SLIP_ISS_DATE\" data-name=\"l_PUCH_ODR_SLIP_ISS_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_PUCH_ODR_SLIP_ISS_DATE())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_ACPT_DATE\" data-name=\"l_ACPT_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_ACPT_DATE())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_ODR_CANCEL_SLIP_ISS_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_ODR_CANCEL_SLIP_ISS_DATE\" data-name=\"l_ODR_CANCEL_SLIP_ISS_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_ODR_CANCEL_SLIP_ISS_DATE())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_PUCH_ODR_CD\" data-name=\"l_PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_PUCH_ODR_CD())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_JOB_ODR_CD())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_VEND_CD())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_VEND_ANAME\" data-name=\"l_VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_VEND_ANAME())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_ITEM_CD())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_ITEM_NAME())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_PUCH_ODR_PERSON-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_PUCH_ODR_PERSON\" data-name=\"l_PUCH_ODR_PERSON\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_PUCH_ODR_PERSON())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_USER_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_USER_NAME\" data-name=\"l_USER_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_USER_NAME())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_ODR_CANCEL_CAUSE_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_ODR_CANCEL_CAUSE_CD\" data-name=\"l_ODR_CANCEL_CAUSE_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_ODR_CANCEL_CAUSE_CD())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_ACPT_RSLT_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_ACPT_RSLT_COMMENT\" data-name=\"l_ACPT_RSLT_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_ACPT_RSLT_COMMENT())).append("</span>'");
 AE0080010view1_DB.append(",").append("'<span id=\"expj-AE0080010-AE0080010view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0080010-AE0080010view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0080010Struct.getl_MODIFY_COUNT())).append("</span>'");
 AE0080010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0080010StructLength) {
   AE0080010view1_DB.append(",");
  }
 }
 aAE0080010Struct = structBackup;
 viewIdList.add(AE0080010view1_Id);
 viewSelectList.add(AE0080010view1_select);
 viewResizeList.add(AE0080010view1_resize);
 viewScrollList.add(AE0080010view1_scroll);
 viewHeaderDataList.add(AE0080010view1_HB);
 viewBodyDataList.add(AE0080010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AE0080010-AE0080010button2">
expj.AE0080010.AE0080010button2 = {};
expj.AE0080010.AE0080010button2.executeAllOnDecision = function () {
  console.log('execute AE0080010button2.onDecision');
};
expj.AE0080010.AE0080010button2.executeOnLoad = function () {
  expj.AE0080010.AE0080010button2.executePScriptOnLoad();
};

expj.AE0080010.AE0080010button2.executePScriptOnLoad = function () {
  console.log('execute AE0080010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0080010-AE0080010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0080010-AE0080010button2-Insert">
expj.AE0080010.AE0080010button2.Insert = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0080010form1/*,_AE0080010view1/+@AE0080010Servlet,,$ZZ07001"
expj.AE0080010.AE0080010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0080010', 'AE0080010button2', '_AE0080010form1/*,_AE0080010view1/+', 'AE0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0080010', response);
expj.common.updateBusinessScreenTab('AE0080010', contents);
};
expj.common.pscript.callConfirm('AE0080010', 'AE0080010button2', 'ZZ07001', okEvent);
};
expj.AE0080010.AE0080010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010button2.Insert['onClick' + i])) {
        expj.AE0080010.AE0080010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010button2.Insert.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010button2.Insert.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010button2', 'Insert', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010button2.Insert.executePScriptOnLoad();
};

expj.AE0080010.AE0080010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute AE0080010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0080010-AE0080010button2-Insert" name="Insert" class="AE0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsertAssort",rb)%></button><!-- 選択登録ボタン --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010button2-CheckAll">
expj.AE0080010.AE0080010button2.CheckAll = {};
// script1="onClick;0;DGSALL;AE0080010view1"
expj.AE0080010.AE0080010button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('AE0080010', 'AE0080010view1');
};
expj.AE0080010.AE0080010button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010button2.CheckAll['onClick' + i])) {
        expj.AE0080010.AE0080010button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010button2.CheckAll.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010button2.CheckAll.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010button2', 'CheckAll', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010button2.CheckAll.executePScriptOnLoad();
};

expj.AE0080010.AE0080010button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute AE0080010button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0080010-AE0080010button2-CheckAll" name="CheckAll" class="AE0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010button2-UncheckAll">
expj.AE0080010.AE0080010button2.UncheckAll = {};
// script1="onClick;0;DGSCANCEL;AE0080010view1"
expj.AE0080010.AE0080010button2.UncheckAll.onClick0 = function () {
  console.log('UncheckAll script1');
expj.common.pscript.unselectVIEWAllRow('AE0080010', 'AE0080010view1');
};
expj.AE0080010.AE0080010button2.UncheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010button2.UncheckAll['onClick' + i])) {
        expj.AE0080010.AE0080010button2.UncheckAll['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010button2.UncheckAll.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010button2.UncheckAll.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010button2-UncheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010button2', 'UncheckAll', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010button2.UncheckAll.executePScriptOnLoad();
};

expj.AE0080010.AE0080010button2.UncheckAll.executePScriptOnLoad = function () {
  console.log('execute AE0080010button2/UncheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010button2-UncheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0080010-AE0080010button2-UncheckAll" name="UncheckAll" class="AE0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
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
<span class="version">AE0080010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AE0080010-AE0080010button0">
expj.AE0080010.AE0080010button0 = {};
expj.AE0080010.AE0080010button0.executeAllOnDecision = function () {
  console.log('execute AE0080010button0.onDecision');
};
expj.AE0080010.AE0080010button0.executeOnLoad = function () {
  expj.AE0080010.AE0080010button0.executePScriptOnLoad();
};

expj.AE0080010.AE0080010button0.executePScriptOnLoad = function () {
  console.log('execute AE0080010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0080010-AE0080010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0080010-AE0080010button0-Clear">
expj.AE0080010.AE0080010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0080010Servlet,,$ZZ07008"
expj.AE0080010.AE0080010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0080010', 'AE0080010button0', '', 'AE0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0080010', response);
expj.common.updateBusinessScreenTab('AE0080010', contents);
};
expj.common.pscript.callConfirm('AE0080010', 'AE0080010button0', 'ZZ07008', okEvent);
};
expj.AE0080010.AE0080010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010button0.Clear['onClick' + i])) {
        expj.AE0080010.AE0080010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010button0.Clear.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010button0.Clear.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010button0.Clear.executePScriptOnLoad();
};

expj.AE0080010.AE0080010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0080010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0080010-AE0080010button0-Clear" name="Clear" class="AE0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0080010-AE0080010button0-Close">
expj.AE0080010.AE0080010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0080010.AE0080010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0080010');
};
expj.AE0080010.AE0080010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0080010.AE0080010button0.Close['onClick' + i])) {
        expj.AE0080010.AE0080010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0080010.AE0080010button0.Close.executeAllOnDecision = function () {
};
expj.AE0080010.AE0080010button0.Close.executeOnLoad = function () {
  $('#expj-AE0080010-AE0080010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0080010', 'AE0080010button0', 'Close', this, 'Button');
    }
  });
  expj.AE0080010.AE0080010button0.Close.executePScriptOnLoad();
};

expj.AE0080010.AE0080010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0080010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0080010-AE0080010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0080010-AE0080010button0-Close" name="Close" class="AE0080010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0080010 (END)-->
<%
MessageStruct msgStruct = aAE0080010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0080010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0080010)) {
  expj.common.treeInstanceMap.AE0080010 = {};
}
expj.common.treeInstanceMap.AE0080010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0080010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0080010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0080010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0080010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0080010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0080010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0080010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0080010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0080010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0080010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0080010)) {
  expj.common.detailDialogMap.AE0080010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0080010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0080010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0080010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0080010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0080010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0080010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0080010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0080010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0080010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0080010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0080010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0080010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0080010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0080010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0080010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0080010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0080010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0080010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0080010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0080010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0080010)) {
  expj.common.viewInstanceMap.AE0080010 = {};
}
expj.common.viewInstanceMap.AE0080010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0080010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0080010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0080010.<%=viewId %>.init = function () {
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
    expj.AE0080010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0080010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0080010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0080010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0080010_init">
/**
 * AE0080010用のロード完了時初期化関数
 */
expj.AE0080010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0080010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0080010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0080010');
  expj.common.calendarInstanceMap.AE0080010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0080010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0080010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0080010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0080010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0080010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0080010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0080010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0080010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0080010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0080010.AE0080010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateFrom.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PUCH_ODR_START_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.CalendarPuchOdrStartDateTo.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.ReOutputFlg.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateFrom.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PUCH_ODR_DLV_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.CalendarPuchOdrDlvDateTo.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.ACPT_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.AcptDateFrom.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.ACPT_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.AcptDateTo.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PeekerPuchOdrDd.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PUCH_ODR_PERSON.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.PeekerPuchOdrPerson.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010button2.UncheckAll.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010form1.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010button1.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010view1.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010button2.executeOnLoad();}catch(e){};
  try{expj.AE0080010.AE0080010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0080010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0080010', 'AE0080010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0080010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0080010-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0080010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0080010', '<%=request.getContextPath() %>');
};

/**
 * AE0080010の全体onDecision処理
 */
expj.AE0080010.executeAllOnDecision = function () {
  expj.AE0080010.AE0080010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0080010_console">
expj.AE0080010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>