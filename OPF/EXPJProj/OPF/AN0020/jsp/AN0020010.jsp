<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:46:13 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AN0020\AN0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AN0020.*" %>
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
<jsp:useBean id="aAN0020010Control" class="com.nec.jp.orteus.metamorBase.AN0020.AN0020010Control" scope="request"/>
<jsp:useBean id="aAN0020010Struct" class="com.nec.jp.orteus.metamorBase.AN0020.AN0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

負荷グラフパラメータメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0020/jsp/AN0020010.jsp,v $
$Author: geng-jia $
$Revision: 1.6 $ $Date: 2017/02/22 02:06:21 $
********************************************************* --%>
<html>
<head>
<title>負荷グラフパラメータメンテナンス</title>
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
<script class="expj-script-AN0020010_init">
  // AN0020010名前空間
  expj.AN0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AN0020010" data-screen="AN0020010" data-newdata="<%=aAN0020010Control.isNewData() %>">
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
              <script class="expj-script-AN0020010-AN0020010form1">
expj.AN0020010.AN0020010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AN0020010.AN0020010form1.onLoad0 = function () {
  console.log('AN0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AN0020010.AN0020010form1.onDecision0 = function () {
  console.log('AN0020010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AN0020010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AN0020010button1/Select"
expj.AN0020010.AN0020010form1.child0 = function () {
  console.log('AN0020010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AN0020010', 'AN0020010form1', '_AN0020010button1/Select');
};
// script4="child;1;MASK;_AN0020010button1/Select"
expj.AN0020010.AN0020010form1.child1 = function () {
  console.log('AN0020010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AN0020010', 'AN0020010form1', '_AN0020010button1/Select');
};
// script5="onDecision;1;CHKRQ;A@*2,*4"
expj.AN0020010.AN0020010form1.onDecision1 = function () {
  console.log('AN0020010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AN0020010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?AN0020010form2/*[eq]NORMAL[and]?AN0020010form1/PLANT_CD[eq]SAME[and]?AN0020010form1/CHART_CD[eq]SAME@*3,*4"
expj.AN0020010.AN0020010form1.child2 = function () {
  console.log('AN0020010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010form1', '?AN0020010form2/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010form1', '?AN0020010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010form1', '?AN0020010form1/CHART_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AN0020010button2/Update"
expj.AN0020010.AN0020010form1.child3 = function () {
  console.log('AN0020010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AN0020010', 'AN0020010form1', '_AN0020010button2/Update');
};
// script8="child;4;MASK;_AN0020010button2/Update"
expj.AN0020010.AN0020010form1.child4 = function () {
  console.log('AN0020010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AN0020010', 'AN0020010form1', '_AN0020010button2/Update');
};
expj.AN0020010.AN0020010form1.executeAllOnDecision = function () {
  console.log('execute AN0020010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0020010.AN0020010form1['onDecision' + i])) {
        expj.AN0020010.AN0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.AN0020010.AN0020010form1.executeOnLoad = function () {
  expj.AN0020010.AN0020010form1.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form1.executePScriptOnLoad = function () {
  console.log('execute AN0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AN0020010.AN0020010form1['onLoad' + i])) {
      expj.AN0020010.AN0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AN0020010-AN0020010form1" action="AN0020010Servlet" name="AN0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form1-PLANT_CD">
expj.AN0020010.AN0020010form1.PLANT_CD = {};
expj.AN0020010.AN0020010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AN0020010form1/PLANT_CD.onDecision');
  expj.AN0020010.AN0020010form1.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form1', 'PLANT_CD', this);
  });
  expj.AN0020010.AN0020010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AN0020010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form1-PLANT_CD" name="PLANT_CD" class="AN0020010-focus-move  required-value expj-AN0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form1-PeekerPlantCd">
expj.AN0020010.AN0020010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AN0020010form1/PLANT_CD@<%=contextNo%>"
expj.AN0020010.AN0020010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AN0020010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AN0020010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AN0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AN0020010.AN0020010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0020010.AN0020010form1.PeekerPlantCd['onClick' + i])) {
        expj.AN0020010.AN0020010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AN0020010.AN0020010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AN0020010.AN0020010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0020010', 'AN0020010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AN0020010.AN0020010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AN0020010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AN0020010-AN0020010form1-PeekerPlantCd" class="AN0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form1-PLANT_NAME">
expj.AN0020010.AN0020010form1.PLANT_NAME = {};
expj.AN0020010.AN0020010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AN0020010form1/PLANT_NAME.onDecision');
  expj.AN0020010.AN0020010form1.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form1', 'PLANT_NAME', this);
  });
  expj.AN0020010.AN0020010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AN0020010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form1-PLANT_NAME" name="PLANT_NAME" class="AN0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AN0020010-AN0020010form1-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAN0020010Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-AN0020010-AN0020010form1-h_MODIFY_COUNT">
expj.AN0020010.AN0020010form1.h_MODIFY_COUNT = {};
expj.AN0020010.AN0020010form1.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AN0020010form1/h_MODIFY_COUNT.onDecision');
  expj.AN0020010.AN0020010form1.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form1.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form1-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form1', 'h_MODIFY_COUNT', this);
  });
  expj.AN0020010.AN0020010form1.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form1.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AN0020010form1/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form1-h_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CHART_CD",rb)%></span><!-- グラフ番号 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form1-CHART_CD">
expj.AN0020010.AN0020010form1.CHART_CD = {};
expj.AN0020010.AN0020010form1.CHART_CD.executeAllOnDecision = function () {
  console.log('execute AN0020010form1/CHART_CD.onDecision');
  expj.AN0020010.AN0020010form1.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form1.CHART_CD.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form1-CHART_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form1', 'CHART_CD', this);
  });
  expj.AN0020010.AN0020010form1.CHART_CD.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form1.CHART_CD.executePScriptOnLoad = function () {
  console.log('execute AN0020010form1/CHART_CD.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form1-CHART_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form1-CHART_CD" name="CHART_CD" class="AN0020010-focus-move  required-value expj-AN0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form1-PeekerChartCd">
expj.AN0020010.AN0020010form1.PeekerChartCd = {};
// script1="onClick;0;PEEKER;_AN0020010form1/CHART_CD@<%=contextNo%>"
expj.AN0020010.AN0020010form1.PeekerChartCd.onClick0 = function () {
  console.log('PeekerChartCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AN0020010';
var parameterValues = 'PeekerChartCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010form1', '_CHART_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CHART_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AN0020010form1/CHART_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AN0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AN0020010.AN0020010form1.PeekerChartCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0020010.AN0020010form1.PeekerChartCd['onClick' + i])) {
        expj.AN0020010.AN0020010form1.PeekerChartCd['onClick' + i]();
      }
    }
  }
};
expj.AN0020010.AN0020010form1.PeekerChartCd.executeAllOnDecision = function () {
};
expj.AN0020010.AN0020010form1.PeekerChartCd.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form1-PeekerChartCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0020010', 'AN0020010form1', 'PeekerChartCd', this, 'Button');
    }
  });
  expj.AN0020010.AN0020010form1.PeekerChartCd.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form1.PeekerChartCd.executePScriptOnLoad = function () {
  console.log('execute AN0020010form1/PeekerChartCd.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form1-PeekerChartCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AN0020010-AN0020010form1-PeekerChartCd" class="AN0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form1-CHART_NAME">
expj.AN0020010.AN0020010form1.CHART_NAME = {};
expj.AN0020010.AN0020010form1.CHART_NAME.executeAllOnDecision = function () {
  console.log('execute AN0020010form1/CHART_NAME.onDecision');
  expj.AN0020010.AN0020010form1.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form1.CHART_NAME.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form1-CHART_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form1', 'CHART_NAME', this);
  });
  expj.AN0020010.AN0020010form1.CHART_NAME.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form1.CHART_NAME.executePScriptOnLoad = function () {
  console.log('execute AN0020010form1/CHART_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form1-CHART_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form1-CHART_NAME" name="CHART_NAME" class="AN0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AN0020010-AN0020010button1">
expj.AN0020010.AN0020010button1 = {};
expj.AN0020010.AN0020010button1.executeAllOnDecision = function () {
  console.log('execute AN0020010button1.onDecision');
};
expj.AN0020010.AN0020010button1.executeOnLoad = function () {
  expj.AN0020010.AN0020010button1.executePScriptOnLoad();
};

expj.AN0020010.AN0020010button1.executePScriptOnLoad = function () {
  console.log('execute AN0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0020010-AN0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0020010-AN0020010button1-Select">
expj.AN0020010.AN0020010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0020010form1/*@AN0020010Servlet"
expj.AN0020010.AN0020010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0020010', 'AN0020010button1', '_AN0020010form1/*', 'AN0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0020010', response);
expj.common.updateBusinessScreenTab('AN0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AN0020010.AN0020010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0020010.AN0020010button1.Select['onClick' + i])) {
        expj.AN0020010.AN0020010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AN0020010.AN0020010button1.Select.executeAllOnDecision = function () {
};
expj.AN0020010.AN0020010button1.Select.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0020010', 'AN0020010button1', 'Select', this, 'Button');
    }
  });
  expj.AN0020010.AN0020010button1.Select.executePScriptOnLoad();
};

expj.AN0020010.AN0020010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AN0020010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0020010-AN0020010button1-Select" name="Select" class="AN0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AN0020010-AN0020010form2">
expj.AN0020010.AN0020010form2 = {};
expj.AN0020010.AN0020010form2.executeAllOnDecision = function () {
  console.log('execute AN0020010form2.onDecision');
};
expj.AN0020010.AN0020010form2.executeOnLoad = function () {
  expj.AN0020010.AN0020010form2.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AN0020010-AN0020010form2" action="AN0020010Servlet" name="AN0020010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAN0020010Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:40px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:108px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CHART_TYP",rb)%></span><!-- グラフ種類 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_TYP">
expj.AN0020010.AN0020010form2.CHART_TYP = {};
expj.AN0020010.AN0020010form2.CHART_TYP.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_TYP.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_TYP.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_TYP', this);
  });
  expj.AN0020010.AN0020010form2.CHART_TYP.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_TYP.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AN0020010-AN0020010form2-CHART_TYP" name='CHART_TYP' class='AN0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAN0020010Control.getStruct().getList_CHART_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAN0020010Control.getStruct().getList_CHART_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAN0020010Control.getStruct().getList_CHART_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAN0020010Struct.getCHART_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:108px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DIMENSION_TYP",rb)%></span><!-- 次元 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-DIMENSION_TYP">
expj.AN0020010.AN0020010form2.DIMENSION_TYP = {};
expj.AN0020010.AN0020010form2.DIMENSION_TYP.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/DIMENSION_TYP.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.DIMENSION_TYP.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-DIMENSION_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AN0020010', 'AN0020010form2', 'DIMENSION_TYP', this);
  });
  expj.AN0020010.AN0020010form2.DIMENSION_TYP.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.DIMENSION_TYP.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/DIMENSION_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-DIMENSION_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AN0020010-AN0020010form2-DIMENSION_TYP" name='DIMENSION_TYP' class='AN0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAN0020010Control.getStruct().getList_DIMENSION_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAN0020010Control.getStruct().getList_DIMENSION_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAN0020010Control.getStruct().getList_DIMENSION_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAN0020010Struct.getDIMENSION_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:108px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.MAX_SCALE_RATE",rb)%></span><!-- 負荷量軸最大値 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-MAX_SCALE_RATE">
expj.AN0020010.AN0020010form2.MAX_SCALE_RATE = {};
expj.AN0020010.AN0020010form2.MAX_SCALE_RATE.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/MAX_SCALE_RATE.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.MAX_SCALE_RATE.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-MAX_SCALE_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'MAX_SCALE_RATE', this);
  });
  expj.AN0020010.AN0020010form2.MAX_SCALE_RATE.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.MAX_SCALE_RATE.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/MAX_SCALE_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-MAX_SCALE_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-MAX_SCALE_RATE" name="MAX_SCALE_RATE" class="AN0020010-focus-move  required-value expj-AN0020010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;2.1;FLOOR;1" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getMAX_SCALE_RATE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:108px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SCALE_STEP",rb)%></span><!-- 負荷量罫線表示スパン --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-SCALE_STEP">
expj.AN0020010.AN0020010form2.SCALE_STEP = {};
expj.AN0020010.AN0020010form2.SCALE_STEP.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/SCALE_STEP.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.SCALE_STEP.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-SCALE_STEP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'SCALE_STEP', this);
  });
  expj.AN0020010.AN0020010form2.SCALE_STEP.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.SCALE_STEP.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/SCALE_STEP.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-SCALE_STEP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-SCALE_STEP" name="SCALE_STEP" class="AN0020010-focus-move  required-value expj-AN0020010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getSCALE_STEP()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:108px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HIGH_LOAD",rb)%></span><!-- 最高負荷率 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-HIGH_LOAD">
expj.AN0020010.AN0020010form2.HIGH_LOAD = {};
expj.AN0020010.AN0020010form2.HIGH_LOAD.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/HIGH_LOAD.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.HIGH_LOAD.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-HIGH_LOAD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'HIGH_LOAD', this);
  });
  expj.AN0020010.AN0020010form2.HIGH_LOAD.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.HIGH_LOAD.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/HIGH_LOAD.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-HIGH_LOAD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-HIGH_LOAD" name="HIGH_LOAD" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getHIGH_LOAD()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:108px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MIDDLE_LOAD",rb)%></span><!-- 標準負荷率 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-MIDDLE_LOAD">
expj.AN0020010.AN0020010form2.MIDDLE_LOAD = {};
expj.AN0020010.AN0020010form2.MIDDLE_LOAD.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/MIDDLE_LOAD.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.MIDDLE_LOAD.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-MIDDLE_LOAD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'MIDDLE_LOAD', this);
  });
  expj.AN0020010.AN0020010form2.MIDDLE_LOAD.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.MIDDLE_LOAD.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/MIDDLE_LOAD.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-MIDDLE_LOAD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-MIDDLE_LOAD" name="MIDDLE_LOAD" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getMIDDLE_LOAD()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:108px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOW_LOAD",rb)%></span><!-- 最低負荷率 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-LOW_LOAD">
expj.AN0020010.AN0020010form2.LOW_LOAD = {};
expj.AN0020010.AN0020010form2.LOW_LOAD.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/LOW_LOAD.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.LOW_LOAD.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-LOW_LOAD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'LOW_LOAD', this);
  });
  expj.AN0020010.AN0020010form2.LOW_LOAD.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.LOW_LOAD.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/LOW_LOAD.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-LOW_LOAD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-LOW_LOAD" name="LOW_LOAD" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getLOW_LOAD()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:108px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0461",rb)%></span><!-- R --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0462",rb)%></span><!-- G --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:108px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0463",rb)%></span><!-- B --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.BACKGROUNDCOLOR",rb)%></span><!-- 背景色 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-BACKGROUNDCOLOR_R">
expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_R = {};
expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_R.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/BACKGROUNDCOLOR_R.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_R.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-BACKGROUNDCOLOR_R').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'BACKGROUNDCOLOR_R', this);
  });
  expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_R.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_R.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/BACKGROUNDCOLOR_R.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-BACKGROUNDCOLOR_R');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-BACKGROUNDCOLOR_R" name="BACKGROUNDCOLOR_R" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getBACKGROUNDCOLOR_R()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-BACKGROUNDCOLOR_G">
expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_G = {};
expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_G.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/BACKGROUNDCOLOR_G.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_G.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-BACKGROUNDCOLOR_G').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'BACKGROUNDCOLOR_G', this);
  });
  expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_G.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_G.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/BACKGROUNDCOLOR_G.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-BACKGROUNDCOLOR_G');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-BACKGROUNDCOLOR_G" name="BACKGROUNDCOLOR_G" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getBACKGROUNDCOLOR_G()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-BACKGROUNDCOLOR_B">
expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_B = {};
expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_B.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/BACKGROUNDCOLOR_B.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_B.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-BACKGROUNDCOLOR_B').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'BACKGROUNDCOLOR_B', this);
  });
  expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_B.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_B.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/BACKGROUNDCOLOR_B.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-BACKGROUNDCOLOR_B');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-BACKGROUNDCOLOR_B" name="BACKGROUNDCOLOR_B" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getBACKGROUNDCOLOR_B()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CHART_COLOR0",rb)%></span><!-- グラフ色0 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR0_R">
expj.AN0020010.AN0020010form2.CHART_COLOR0_R = {};
expj.AN0020010.AN0020010form2.CHART_COLOR0_R.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR0_R.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR0_R.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR0_R').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR0_R', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR0_R.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR0_R.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR0_R.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR0_R');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR0_R" name="CHART_COLOR0_R" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR0_R()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR0_G">
expj.AN0020010.AN0020010form2.CHART_COLOR0_G = {};
expj.AN0020010.AN0020010form2.CHART_COLOR0_G.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR0_G.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR0_G.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR0_G').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR0_G', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR0_G.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR0_G.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR0_G.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR0_G');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR0_G" name="CHART_COLOR0_G" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR0_G()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR0_B">
expj.AN0020010.AN0020010form2.CHART_COLOR0_B = {};
expj.AN0020010.AN0020010form2.CHART_COLOR0_B.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR0_B.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR0_B.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR0_B').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR0_B', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR0_B.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR0_B.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR0_B.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR0_B');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR0_B" name="CHART_COLOR0_B" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR0_B()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CHART_COLOR1",rb)%></span><!-- グラフ色1 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR1_R">
expj.AN0020010.AN0020010form2.CHART_COLOR1_R = {};
expj.AN0020010.AN0020010form2.CHART_COLOR1_R.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR1_R.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR1_R.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR1_R').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR1_R', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR1_R.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR1_R.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR1_R.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR1_R');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR1_R" name="CHART_COLOR1_R" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR1_R()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR1_G">
expj.AN0020010.AN0020010form2.CHART_COLOR1_G = {};
expj.AN0020010.AN0020010form2.CHART_COLOR1_G.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR1_G.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR1_G.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR1_G').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR1_G', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR1_G.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR1_G.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR1_G.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR1_G');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR1_G" name="CHART_COLOR1_G" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR1_G()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR1_B">
expj.AN0020010.AN0020010form2.CHART_COLOR1_B = {};
expj.AN0020010.AN0020010form2.CHART_COLOR1_B.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR1_B.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR1_B.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR1_B').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR1_B', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR1_B.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR1_B.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR1_B.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR1_B');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR1_B" name="CHART_COLOR1_B" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR1_B()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CHART_COLOR2",rb)%></span><!-- グラフ色2 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR2_R">
expj.AN0020010.AN0020010form2.CHART_COLOR2_R = {};
expj.AN0020010.AN0020010form2.CHART_COLOR2_R.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR2_R.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR2_R.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR2_R').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR2_R', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR2_R.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR2_R.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR2_R.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR2_R');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR2_R" name="CHART_COLOR2_R" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR2_R()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR2_G">
expj.AN0020010.AN0020010form2.CHART_COLOR2_G = {};
expj.AN0020010.AN0020010form2.CHART_COLOR2_G.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR2_G.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR2_G.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR2_G').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR2_G', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR2_G.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR2_G.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR2_G.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR2_G');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR2_G" name="CHART_COLOR2_G" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR2_G()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR2_B">
expj.AN0020010.AN0020010form2.CHART_COLOR2_B = {};
expj.AN0020010.AN0020010form2.CHART_COLOR2_B.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR2_B.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR2_B.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR2_B').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR2_B', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR2_B.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR2_B.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR2_B.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR2_B');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR2_B" name="CHART_COLOR2_B" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR2_B()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CHART_COLOR9",rb)%></span><!-- グラフ色9 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR9_R">
expj.AN0020010.AN0020010form2.CHART_COLOR9_R = {};
expj.AN0020010.AN0020010form2.CHART_COLOR9_R.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR9_R.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR9_R.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR9_R').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR9_R', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR9_R.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR9_R.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR9_R.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR9_R');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR9_R" name="CHART_COLOR9_R" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR9_R()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR9_G">
expj.AN0020010.AN0020010form2.CHART_COLOR9_G = {};
expj.AN0020010.AN0020010form2.CHART_COLOR9_G.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR9_G.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR9_G.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR9_G').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR9_G', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR9_G.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR9_G.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR9_G.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR9_G');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR9_G" name="CHART_COLOR9_G" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR9_G()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-CHART_COLOR9_B">
expj.AN0020010.AN0020010form2.CHART_COLOR9_B = {};
expj.AN0020010.AN0020010form2.CHART_COLOR9_B.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/CHART_COLOR9_B.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.CHART_COLOR9_B.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-CHART_COLOR9_B').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'CHART_COLOR9_B', this);
  });
  expj.AN0020010.AN0020010form2.CHART_COLOR9_B.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.CHART_COLOR9_B.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/CHART_COLOR9_B.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-CHART_COLOR9_B');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-CHART_COLOR9_B" name="CHART_COLOR9_B" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getCHART_COLOR9_B()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HIGH_LOAD_COLOR",rb)%></span><!-- 最高負荷色 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_R">
expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_R = {};
expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_R.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/HIGH_LOAD_COLOR_R.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_R.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_R').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'HIGH_LOAD_COLOR_R', this);
  });
  expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_R.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_R.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/HIGH_LOAD_COLOR_R.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_R');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_R" name="HIGH_LOAD_COLOR_R" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getHIGH_LOAD_COLOR_R()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_G">
expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_G = {};
expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_G.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/HIGH_LOAD_COLOR_G.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_G.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_G').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'HIGH_LOAD_COLOR_G', this);
  });
  expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_G.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_G.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/HIGH_LOAD_COLOR_G.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_G');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_G" name="HIGH_LOAD_COLOR_G" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getHIGH_LOAD_COLOR_G()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_B">
expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_B = {};
expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_B.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/HIGH_LOAD_COLOR_B.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_B.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_B').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'HIGH_LOAD_COLOR_B', this);
  });
  expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_B.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_B.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/HIGH_LOAD_COLOR_B.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_B');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-HIGH_LOAD_COLOR_B" name="HIGH_LOAD_COLOR_B" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getHIGH_LOAD_COLOR_B()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MIDDLE_LOAD_COLOR",rb)%></span><!-- 標準負荷色 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_R">
expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_R = {};
expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_R.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/MIDDLE_LOAD_COLOR_R.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_R.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_R').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'MIDDLE_LOAD_COLOR_R', this);
  });
  expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_R.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_R.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/MIDDLE_LOAD_COLOR_R.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_R');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_R" name="MIDDLE_LOAD_COLOR_R" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getMIDDLE_LOAD_COLOR_R()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_G">
expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_G = {};
expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_G.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/MIDDLE_LOAD_COLOR_G.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_G.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_G').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'MIDDLE_LOAD_COLOR_G', this);
  });
  expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_G.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_G.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/MIDDLE_LOAD_COLOR_G.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_G');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_G" name="MIDDLE_LOAD_COLOR_G" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getMIDDLE_LOAD_COLOR_G()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_B">
expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_B = {};
expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_B.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/MIDDLE_LOAD_COLOR_B.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_B.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_B').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'MIDDLE_LOAD_COLOR_B', this);
  });
  expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_B.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_B.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/MIDDLE_LOAD_COLOR_B.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_B');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-MIDDLE_LOAD_COLOR_B" name="MIDDLE_LOAD_COLOR_B" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getMIDDLE_LOAD_COLOR_B()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOW_LOAD_COLOR",rb)%></span><!-- 最低負荷色 --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-LOW_LOAD_COLOR_R">
expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_R = {};
expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_R.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/LOW_LOAD_COLOR_R.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_R.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-LOW_LOAD_COLOR_R').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'LOW_LOAD_COLOR_R', this);
  });
  expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_R.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_R.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/LOW_LOAD_COLOR_R.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-LOW_LOAD_COLOR_R');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-LOW_LOAD_COLOR_R" name="LOW_LOAD_COLOR_R" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getLOW_LOAD_COLOR_R()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-LOW_LOAD_COLOR_G">
expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_G = {};
expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_G.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/LOW_LOAD_COLOR_G.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_G.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-LOW_LOAD_COLOR_G').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'LOW_LOAD_COLOR_G', this);
  });
  expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_G.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_G.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/LOW_LOAD_COLOR_G.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-LOW_LOAD_COLOR_G');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-LOW_LOAD_COLOR_G" name="LOW_LOAD_COLOR_G" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getLOW_LOAD_COLOR_G()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010form2-LOW_LOAD_COLOR_B">
expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_B = {};
expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_B.executeAllOnDecision = function () {
  console.log('execute AN0020010form2/LOW_LOAD_COLOR_B.onDecision');
  expj.AN0020010.AN0020010form2.executeAllOnDecision();
  expj.AN0020010.executeAllOnDecision();
};
expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_B.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010form2-LOW_LOAD_COLOR_B').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0020010', 'AN0020010form2', 'LOW_LOAD_COLOR_B', this);
  });
  expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_B.executePScriptOnLoad();
};

expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_B.executePScriptOnLoad = function () {
  console.log('execute AN0020010form2/LOW_LOAD_COLOR_B.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010form2-LOW_LOAD_COLOR_B');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-AN0020010-AN0020010form2-LOW_LOAD_COLOR_B" name="LOW_LOAD_COLOR_B" class="AN0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAN0020010Struct.getLOW_LOAD_COLOR_B()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AN0020010-AN0020010button2">
expj.AN0020010.AN0020010button2 = {};
expj.AN0020010.AN0020010button2.executeAllOnDecision = function () {
  console.log('execute AN0020010button2.onDecision');
};
expj.AN0020010.AN0020010button2.executeOnLoad = function () {
  expj.AN0020010.AN0020010button2.executePScriptOnLoad();
};

expj.AN0020010.AN0020010button2.executePScriptOnLoad = function () {
  console.log('execute AN0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0020010-AN0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0020010-AN0020010button2-Update">
expj.AN0020010.AN0020010button2.Update = {};
// script1="onClick;0;CHK;_AN0020010form2/MAX_SCALE_RATE[lte]0@#AN02030"
expj.AN0020010.AN0020010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/MAX_SCALE_RATE')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02030');
}
};
// script2="onClick;1;CHK;_AN0020010form2/SCALE_STEP[lt]1@#AN02031"
expj.AN0020010.AN0020010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/SCALE_STEP')), '[lt]', expj.common.pscript.convertNumber('1'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02031');
}
};
// script3="onClick;2;CHK;_AN0020010form2/BACKGROUNDCOLOR_R[gt]255@#AN02035"
expj.AN0020010.AN0020010button2.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/BACKGROUNDCOLOR_R')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02035');
}
};
// script4="onClick;3;CHK;_AN0020010form2/BACKGROUNDCOLOR_G[gt]255@#AN02036"
expj.AN0020010.AN0020010button2.Update.onClick3 = function () {
  console.log('Update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/BACKGROUNDCOLOR_G')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02036');
}
};
// script5="onClick;4;CHK;_AN0020010form2/BACKGROUNDCOLOR_B[gt]255@#AN02037"
expj.AN0020010.AN0020010button2.Update.onClick4 = function () {
  console.log('Update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/BACKGROUNDCOLOR_B')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02037');
}
};
// script6="onClick;5;CHK;_AN0020010form2/CHART_COLOR0_R[gt]255@#AN02038"
expj.AN0020010.AN0020010button2.Update.onClick5 = function () {
  console.log('Update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR0_R')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02038');
}
};
// script7="onClick;6;CHK;_AN0020010form2/CHART_COLOR0_G[gt]255@#AN02039"
expj.AN0020010.AN0020010button2.Update.onClick6 = function () {
  console.log('Update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR0_G')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02039');
}
};
// script8="onClick;7;CHK;_AN0020010form2/CHART_COLOR0_B[gt]255@#AN02040"
expj.AN0020010.AN0020010button2.Update.onClick7 = function () {
  console.log('Update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR0_B')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02040');
}
};
// script9="onClick;8;CHK;_AN0020010form2/CHART_COLOR1_R[gt]255@#AN02041"
expj.AN0020010.AN0020010button2.Update.onClick8 = function () {
  console.log('Update script9');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR1_R')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02041');
}
};
// script10="onClick;9;CHK;_AN0020010form2/CHART_COLOR1_G[gt]255@#AN02042"
expj.AN0020010.AN0020010button2.Update.onClick9 = function () {
  console.log('Update script10');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR1_G')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02042');
}
};
// script11="onClick;10;CHK;_AN0020010form2/CHART_COLOR1_B[gt]255@#AN02043"
expj.AN0020010.AN0020010button2.Update.onClick10 = function () {
  console.log('Update script11');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR1_B')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02043');
}
};
// script12="onClick;11;CHK;_AN0020010form2/CHART_COLOR2_R[gt]255@#AN02044"
expj.AN0020010.AN0020010button2.Update.onClick11 = function () {
  console.log('Update script12');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR2_R')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02044');
}
};
// script13="onClick;12;CHK;_AN0020010form2/CHART_COLOR2_G[gt]255@#AN02045"
expj.AN0020010.AN0020010button2.Update.onClick12 = function () {
  console.log('Update script13');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR2_G')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02045');
}
};
// script14="onClick;13;CHK;_AN0020010form2/CHART_COLOR2_B[gt]255@#AN02046"
expj.AN0020010.AN0020010button2.Update.onClick13 = function () {
  console.log('Update script14');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR2_B')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02046');
}
};
// script15="onClick;14;CHK;_AN0020010form2/CHART_COLOR9_R[gt]255@#AN02047"
expj.AN0020010.AN0020010button2.Update.onClick14 = function () {
  console.log('Update script15');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR9_R')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02047');
}
};
// script16="onClick;15;CHK;_AN0020010form2/CHART_COLOR9_G[gt]255@#AN02048"
expj.AN0020010.AN0020010button2.Update.onClick15 = function () {
  console.log('Update script16');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR9_G')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02048');
}
};
// script17="onClick;16;CHK;_AN0020010form2/CHART_COLOR9_B[gt]255@#AN02049"
expj.AN0020010.AN0020010button2.Update.onClick16 = function () {
  console.log('Update script17');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/CHART_COLOR9_B')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02049');
}
};
// script18="onClick;17;CHK;_AN0020010form2/HIGH_LOAD_COLOR_R[gt]255@#AN02050"
expj.AN0020010.AN0020010button2.Update.onClick17 = function () {
  console.log('Update script18');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/HIGH_LOAD_COLOR_R')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02050');
}
};
// script19="onClick;18;CHK;_AN0020010form2/HIGH_LOAD_COLOR_G[gt]255@#AN02051"
expj.AN0020010.AN0020010button2.Update.onClick18 = function () {
  console.log('Update script19');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/HIGH_LOAD_COLOR_G')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02051');
}
};
// script20="onClick;19;CHK;_AN0020010form2/HIGH_LOAD_COLOR_B[gt]255@#AN02052"
expj.AN0020010.AN0020010button2.Update.onClick19 = function () {
  console.log('Update script20');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/HIGH_LOAD_COLOR_B')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02052');
}
};
// script21="onClick;20;CHK;_AN0020010form2/MIDDLE_LOAD_COLOR_R[gt]255@#AN02053"
expj.AN0020010.AN0020010button2.Update.onClick20 = function () {
  console.log('Update script21');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/MIDDLE_LOAD_COLOR_R')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02053');
}
};
// script22="onClick;21;CHK;_AN0020010form2/MIDDLE_LOAD_COLOR_G[gt]255@#AN02054"
expj.AN0020010.AN0020010button2.Update.onClick21 = function () {
  console.log('Update script22');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/MIDDLE_LOAD_COLOR_G')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02054');
}
};
// script23="onClick;22;CHK;_AN0020010form2/MIDDLE_LOAD_COLOR_B[gt]255@#AN02055"
expj.AN0020010.AN0020010button2.Update.onClick22 = function () {
  console.log('Update script23');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/MIDDLE_LOAD_COLOR_B')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02055');
}
};
// script24="onClick;23;CHK;_AN0020010form2/LOW_LOAD_COLOR_R[gt]255@#AN02056"
expj.AN0020010.AN0020010button2.Update.onClick23 = function () {
  console.log('Update script24');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/LOW_LOAD_COLOR_R')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02056');
}
};
// script25="onClick;24;CHK;_AN0020010form2/LOW_LOAD_COLOR_G[gt]255@#AN02057"
expj.AN0020010.AN0020010button2.Update.onClick24 = function () {
  console.log('Update script25');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/LOW_LOAD_COLOR_G')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02057');
}
};
// script26="onClick;25;CHK;_AN0020010form2/LOW_LOAD_COLOR_B[gt]255@#AN02058"
expj.AN0020010.AN0020010button2.Update.onClick25 = function () {
  console.log('Update script26');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AN0020010', 'AN0020010button2', '_AN0020010form2/LOW_LOAD_COLOR_B')), '[gt]', expj.common.pscript.convertNumber('255'))) {
expj.common.pscript.addErrorMessage('AN0020010', 'AN0020010button2', 'AN02058');
}
};
// script27="onClick;26;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0020010form1/*,_AN0020010form2/*@AN0020010Servlet,,$ZZ07003"
expj.AN0020010.AN0020010button2.Update.onClick26 = function () {
  console.log('Update script27');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0020010', 'AN0020010button2', '_AN0020010form1/*,_AN0020010form2/*', 'AN0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0020010', response);
expj.common.updateBusinessScreenTab('AN0020010', contents);
};
expj.common.pscript.callConfirm('AN0020010', 'AN0020010button2', 'ZZ07003', okEvent);
};
expj.AN0020010.AN0020010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 26; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0020010.AN0020010button2.Update['onClick' + i])) {
        expj.AN0020010.AN0020010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AN0020010.AN0020010button2.Update.executeAllOnDecision = function () {
};
expj.AN0020010.AN0020010button2.Update.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0020010', 'AN0020010button2', 'Update', this, 'Button');
    }
  });
  expj.AN0020010.AN0020010button2.Update.executePScriptOnLoad();
};

expj.AN0020010.AN0020010button2.Update.executePScriptOnLoad = function () {
  console.log('execute AN0020010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0020010-AN0020010button2-Update" name="Update" class="AN0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AN0020010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AN0020010-AN0020010button0">
expj.AN0020010.AN0020010button0 = {};
expj.AN0020010.AN0020010button0.executeAllOnDecision = function () {
  console.log('execute AN0020010button0.onDecision');
};
expj.AN0020010.AN0020010button0.executeOnLoad = function () {
  expj.AN0020010.AN0020010button0.executePScriptOnLoad();
};

expj.AN0020010.AN0020010button0.executePScriptOnLoad = function () {
  console.log('execute AN0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0020010-AN0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0020010-AN0020010button0-Clear">
expj.AN0020010.AN0020010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0020010form1/*@AN0020010Servlet,,$ZZ07008"
expj.AN0020010.AN0020010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0020010', 'AN0020010button0', '_AN0020010form1/*', 'AN0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0020010', response);
expj.common.updateBusinessScreenTab('AN0020010', contents);
};
expj.common.pscript.callConfirm('AN0020010', 'AN0020010button0', 'ZZ07008', okEvent);
};
expj.AN0020010.AN0020010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0020010.AN0020010button0.Clear['onClick' + i])) {
        expj.AN0020010.AN0020010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AN0020010.AN0020010button0.Clear.executeAllOnDecision = function () {
};
expj.AN0020010.AN0020010button0.Clear.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0020010', 'AN0020010button0', 'Clear', this, 'Button');
    }
  });
  expj.AN0020010.AN0020010button0.Clear.executePScriptOnLoad();
};

expj.AN0020010.AN0020010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AN0020010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0020010-AN0020010button0-Clear" name="Clear" class="AN0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AN0020010-AN0020010button0-Close">
expj.AN0020010.AN0020010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AN0020010.AN0020010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AN0020010');
};
expj.AN0020010.AN0020010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0020010.AN0020010button0.Close['onClick' + i])) {
        expj.AN0020010.AN0020010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AN0020010.AN0020010button0.Close.executeAllOnDecision = function () {
};
expj.AN0020010.AN0020010button0.Close.executeOnLoad = function () {
  $('#expj-AN0020010-AN0020010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0020010', 'AN0020010button0', 'Close', this, 'Button');
    }
  });
  expj.AN0020010.AN0020010button0.Close.executePScriptOnLoad();
};

expj.AN0020010.AN0020010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AN0020010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AN0020010-AN0020010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0020010-AN0020010button0-Close" name="Close" class="AN0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AN0020010 (END)-->
<%
  MessageStruct msgStruct = aAN0020010Control.getMsgStruct(); 
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AN0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AN0020010)) {
  expj.common.treeInstanceMap.AN0020010 = {};
}
expj.common.treeInstanceMap.AN0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AN0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AN0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AN0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AN0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AN0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AN0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AN0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AN0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0020010)) {
  expj.common.detailDialogMap.AN0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AN0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AN0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AN0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AN0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AN0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AN0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AN0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AN0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AN0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AN0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AN0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AN0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AN0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AN0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AN0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AN0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AN0020010)) {
  expj.common.viewInstanceMap.AN0020010 = {};
}
expj.common.viewInstanceMap.AN0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AN0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AN0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AN0020010.<%=viewId %>.init = function () {
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
    expj.AN0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AN0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AN0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AN0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AN0020010_init">
/**
 * AN0020010用のロード完了時初期化関数
 */
expj.AN0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AN0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AN0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AN0020010');
  expj.common.calendarInstanceMap.AN0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AN0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AN0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AN0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AN0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AN0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AN0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AN0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AN0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AN0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AN0020010.AN0020010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form1.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form1.CHART_CD.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form1.PeekerChartCd.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form1.CHART_NAME.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_TYP.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.DIMENSION_TYP.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.MAX_SCALE_RATE.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.SCALE_STEP.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.HIGH_LOAD.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.MIDDLE_LOAD.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.LOW_LOAD.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_R.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_G.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.BACKGROUNDCOLOR_B.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR0_R.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR0_G.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR0_B.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR1_R.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR1_G.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR1_B.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR2_R.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR2_G.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR2_B.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR9_R.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR9_G.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.CHART_COLOR9_B.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_R.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_G.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.HIGH_LOAD_COLOR_B.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_R.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_G.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.MIDDLE_LOAD_COLOR_B.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_R.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_G.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.LOW_LOAD_COLOR_B.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010button2.Update.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form1.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010button1.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010form2.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010button2.executeOnLoad();}catch(e){};
  try{expj.AN0020010.AN0020010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AN0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AN0020010', 'AN0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AN0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AN0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AN0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AN0020010', '<%=request.getContextPath() %>');
};

/**
 * AN0020010の全体onDecision処理
 */
expj.AN0020010.executeAllOnDecision = function () {
  expj.AN0020010.AN0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AN0020010_console">
expj.AN0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>