<%-- ***
This file is generated
 GeneratedDate  : Tue Apr 25 18:55:09 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj_WK\OPF\AD0070\AD0070010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0070.*" %>
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
<jsp:useBean id="aAD0070010Control" class="com.nec.jp.orteus.metamorBase.AD0070.AD0070010Control" scope="request"/>
<jsp:useBean id="aAD0070010Struct" class="com.nec.jp.orteus.metamorBase.AD0070.AD0070010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業指示一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0070/jsp/AD0070010.jsp,v $
$Author: xu-jing $	
$Revision: 1.20 $ $Date: 2017/04/27 08:31:04 $
********************************************************* --%>
<html>
<head>
<title>作業指示一覧</title>
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
<script class="expj-script-AD0070010_init">
  // AD0070010名前空間
  expj.AD0070010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AD0070010" data-screen="AD0070010" data-newdata="<%=aAD0070010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-AD0070010-AD0070010form1">
expj.AD0070010.AD0070010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AD0070010.AD0070010form1.onLoad0 = function () {
  console.log('AD0070010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHK;?AD0070010form1/*[eq]NORMAL@*1,*3"
expj.AD0070010.AD0070010form1.onDecision0 = function () {
  console.log('AD0070010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?AD0070010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;1;CHK;?IN_PLANT_CD[eq]SAME[and]?IN_WS_CD[eq]SAME[and]?IN_VEND_CD[eq]SAME[and]?IN_ITEM_CD[eq]SAME[and]?IN_WORK_ODR_CD[eq]SAME[and]?IN_OPR_INST_CD[eq]SAME[and]?IN_JOB_ODR_CD[eq]SAME[and]?IN_OPR_INST_START_DATE_FROM[eq]SAME[and]?IN_OPR_INST_START_DATE_TO[eq]SAME[and]?IN_WORK_ODR_DLV_DATE_FROM[eq]SAME[and]?IN_WORK_ODR_DLV_DATE_TO[eq]SAME[and]?c1_WORK_STS_TYP[eq]SAME[and]?c2_WORK_STS_TYP[eq]SAME[and]?c3_WORK_STS_TYP[eq]SAME[and]?c4_WORK_STS_TYP[eq]SAME[and]?c5_WORK_STS_TYP[eq]SAME[and]?c6_WORK_STS_TYP[eq]SAME@*2,*3"
expj.AD0070010.AD0070010form1.child1 = function () {
  console.log('AD0070010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_WORK_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_OPR_INST_START_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_OPR_INST_START_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_WORK_ODR_DLV_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?IN_WORK_ODR_DLV_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?c1_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?c2_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?c3_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?c4_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?c5_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '?c6_WORK_STS_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;2;UNMASK;_AD0070010button0/CsvOut"
expj.AD0070010.AD0070010form1.child2 = function () {
  console.log('AD0070010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AD0070010', 'AD0070010form1', '_AD0070010button0/CsvOut');
};
// script5="child;3;MASK;_AD0070010button0/CsvOut"
expj.AD0070010.AD0070010form1.child3 = function () {
  console.log('AD0070010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AD0070010', 'AD0070010form1', '_AD0070010button0/CsvOut');
};
// script6="onDecision;1;CHK;_AD0070010form1/TIME_CTRL[eq]true@*4,*5"
expj.AD0070010.AD0070010form1.onDecision1 = function () {
  console.log('AD0070010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;4;UNMASK;_AD0070010form1/IN_OPR_INST_START_TIME_FROM,_AD0070010form1/IN_OPR_INST_START_TIME_TO,_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM,_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO"
expj.AD0070010.AD0070010form1.child4 = function () {
  console.log('AD0070010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO');
expj.common.pscript.setUnMaskToReferenceComponent('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO');
};
// script8="child;5;MASK;_AD0070010form1/IN_OPR_INST_START_TIME_FROM,_AD0070010form1/IN_OPR_INST_START_TIME_TO,_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM,_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO"
expj.AD0070010.AD0070010form1.child5 = function () {
  console.log('AD0070010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM');
expj.common.pscript.setMaskToReferenceComponent('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO');
expj.common.pscript.setMaskToReferenceComponent('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM');
expj.common.pscript.setMaskToReferenceComponent('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO');
};
expj.AD0070010.AD0070010form1.executeAllOnDecision = function () {
  console.log('execute AD0070010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1['onDecision' + i])) {
        expj.AD0070010.AD0070010form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.executeOnLoad = function () {
  expj.AD0070010.AD0070010form1.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1['onLoad' + i])) {
      expj.AD0070010.AD0070010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0070010-AD0070010form1" action="AD0070010Servlet" name="AD0070010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0070010Control.getReadStatusString()) %>" style="height:234px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:234px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:right"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_PLANT_CD">
expj.AD0070010.AD0070010form1.IN_PLANT_CD = {};
expj.AD0070010.AD0070010form1.IN_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_PLANT_CD.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_PLANT_CD.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_PLANT_CD', this);
  });
  expj.AD0070010.AD0070010form1.IN_PLANT_CD.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_PLANT_CD" name="IN_PLANT_CD" class="AD0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-PeekerPlantCd">
expj.AD0070010.AD0070010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AD0070010form1/IN_PLANT_CD@<%=contextNo%>"
expj.AD0070010.AD0070010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0070010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0070010form1/IN_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0070010.AD0070010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.PeekerPlantCd['onClick' + i])) {
        expj.AD0070010.AD0070010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-PeekerPlantCd" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_PLANT_NAME">
expj.AD0070010.AD0070010form1.IN_PLANT_NAME = {};
expj.AD0070010.AD0070010form1.IN_PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_PLANT_NAME.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_PLANT_NAME.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_PLANT_NAME', this);
  });
  expj.AD0070010.AD0070010form1.IN_PLANT_NAME.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_PLANT_NAME" name="IN_PLANT_NAME" class="AD0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_PLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AD0070010-AD0070010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AD0070010-AD0070010form1-DOWNLOAD_FILE">
expj.AD0070010.AD0070010form1.DOWNLOAD_FILE = {};
expj.AD0070010.AD0070010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/DOWNLOAD_FILE.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AD0070010.AD0070010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_WS_CD">
expj.AD0070010.AD0070010form1.IN_WS_CD = {};
expj.AD0070010.AD0070010form1.IN_WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_WS_CD.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_WS_CD.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_WS_CD', this);
  });
  expj.AD0070010.AD0070010form1.IN_WS_CD.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_WS_CD" name="IN_WS_CD" class="AD0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_WS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-PeekerWsCd">
expj.AD0070010.AD0070010form1.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_AD0070010form1/IN_WS_CD@<%=contextNo%>"
expj.AD0070010.AD0070010form1.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0070010';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AD0070010form1/IN_WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0070010.AD0070010form1.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.PeekerWsCd['onClick' + i])) {
        expj.AD0070010.AD0070010form1.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.PeekerWsCd.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.PeekerWsCd.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010form1.PeekerWsCd.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-PeekerWsCd" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_WS_NAME">
expj.AD0070010.AD0070010form1.IN_WS_NAME = {};
expj.AD0070010.AD0070010form1.IN_WS_NAME.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_WS_NAME.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_WS_NAME.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_WS_NAME', this);
  });
  expj.AD0070010.AD0070010form1.IN_WS_NAME.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_WS_NAME" name="IN_WS_NAME" class="AD0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_WS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_VEND_CD">
expj.AD0070010.AD0070010form1.IN_VEND_CD = {};
expj.AD0070010.AD0070010form1.IN_VEND_CD.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_VEND_CD.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_VEND_CD.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_VEND_CD', this);
  });
  expj.AD0070010.AD0070010form1.IN_VEND_CD.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_VEND_CD" name="IN_VEND_CD" class="AD0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_VEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-PeekerVendCd">
expj.AD0070010.AD0070010form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AD0070010form1/IN_VEND_CD@<%=contextNo%>"
expj.AD0070010.AD0070010form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0070010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AD0070010form1/IN_VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0070010.AD0070010form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.PeekerVendCd['onClick' + i])) {
        expj.AD0070010.AD0070010form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010form1.PeekerVendCd.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-PeekerVendCd" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_VEND_NAME">
expj.AD0070010.AD0070010form1.IN_VEND_NAME = {};
expj.AD0070010.AD0070010form1.IN_VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_VEND_NAME.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_VEND_NAME.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_VEND_NAME', this);
  });
  expj.AD0070010.AD0070010form1.IN_VEND_NAME.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_VEND_NAME" name="IN_VEND_NAME" class="AD0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_VEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_ITEM_CD">
expj.AD0070010.AD0070010form1.IN_ITEM_CD = {};
expj.AD0070010.AD0070010form1.IN_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_ITEM_CD.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_ITEM_CD', this);
  });
  expj.AD0070010.AD0070010form1.IN_ITEM_CD.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_ITEM_CD" name="IN_ITEM_CD" class="AD0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-PeekerItemCd">
expj.AD0070010.AD0070010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AD0070010form1/IN_ITEM_CD@<%=contextNo%>"
expj.AD0070010.AD0070010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0070010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0070010form1/IN_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0070010.AD0070010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.PeekerItemCd['onClick' + i])) {
        expj.AD0070010.AD0070010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-PeekerItemCd" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_ITEM_NAME">
expj.AD0070010.AD0070010form1.IN_ITEM_NAME = {};
expj.AD0070010.AD0070010form1.IN_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_ITEM_NAME.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_ITEM_NAME', this);
  });
  expj.AD0070010.AD0070010form1.IN_ITEM_NAME.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_ITEM_NAME" name="IN_ITEM_NAME" class="AD0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_ODR_CD",rb)%></span><!-- 作業計画番号 --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_WORK_ODR_CD">
expj.AD0070010.AD0070010form1.IN_WORK_ODR_CD = {};
expj.AD0070010.AD0070010form1.IN_WORK_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_WORK_ODR_CD.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_WORK_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_WORK_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_WORK_ODR_CD', this);
  });
  expj.AD0070010.AD0070010form1.IN_WORK_ODR_CD.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_WORK_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_WORK_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_WORK_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_WORK_ODR_CD" name="IN_WORK_ODR_CD" class="AD0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_WORK_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-PeekerWorkOdrCd">
expj.AD0070010.AD0070010form1.PeekerWorkOdrCd = {};
// script1="onClick;0;PEEKER;_AD0070010form1/IN_WORK_ODR_CD@<%=contextNo%>"
expj.AD0070010.AD0070010form1.PeekerWorkOdrCd.onClick0 = function () {
  console.log('PeekerWorkOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0070010';
var parameterValues = 'PeekerWorkOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_WORK_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WORK_ODR_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AD0070010form1/IN_WORK_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0070010.AD0070010form1.PeekerWorkOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.PeekerWorkOdrCd['onClick' + i])) {
        expj.AD0070010.AD0070010form1.PeekerWorkOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.PeekerWorkOdrCd.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.PeekerWorkOdrCd.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-PeekerWorkOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'PeekerWorkOdrCd', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010form1.PeekerWorkOdrCd.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.PeekerWorkOdrCd.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/PeekerWorkOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-PeekerWorkOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-PeekerWorkOdrCd" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div></div><div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0721",rb)%></span><!-- ステータス --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-c1_WORK_STS_TYP">
expj.AD0070010.AD0070010form1.c1_WORK_STS_TYP = {};
expj.AD0070010.AD0070010form1.c1_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/c1_WORK_STS_TYP.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.c1_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-c1_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'c1_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AD0070010.AD0070010form1.c1_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.c1_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/c1_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-c1_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c1_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAD0070010Struct.getc1_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAD0070010Struct.getc1_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AD0070010-focus-move" id="expj-AD0070010-AD0070010form1-c1_WORK_STS_TYP"><label for="expj-AD0070010-AD0070010form1-c1_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0722",rb)%></label></div><!--/td-->
<div align="right"></div><div class="div-td" style="width:150px;"></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-c2_WORK_STS_TYP">
expj.AD0070010.AD0070010form1.c2_WORK_STS_TYP = {};
expj.AD0070010.AD0070010form1.c2_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/c2_WORK_STS_TYP.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.c2_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-c2_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'c2_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AD0070010.AD0070010form1.c2_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.c2_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/c2_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-c2_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c2_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAD0070010Struct.getc2_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAD0070010Struct.getc2_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AD0070010-focus-move" id="expj-AD0070010-AD0070010form1-c2_WORK_STS_TYP"><label for="expj-AD0070010-AD0070010form1-c2_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0724",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_CD",rb)%></span><!-- 作業指示番号 --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_OPR_INST_CD">
expj.AD0070010.AD0070010form1.IN_OPR_INST_CD = {};
expj.AD0070010.AD0070010form1.IN_OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_OPR_INST_CD.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_OPR_INST_CD', this);
  });
  expj.AD0070010.AD0070010form1.IN_OPR_INST_CD.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_OPR_INST_CD" name="IN_OPR_INST_CD" class="AD0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_OPR_INST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-PeekerOprInstCd">
expj.AD0070010.AD0070010form1.PeekerOprInstCd = {};
// script1="onClick;0;PEEKER;_AD0070010form1/IN_OPR_INST_CD@<%=contextNo%>"
expj.AD0070010.AD0070010form1.PeekerOprInstCd.onClick0 = function () {
  console.log('PeekerOprInstCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0070010';
var parameterValues = 'PeekerOprInstCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_OPR_INST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%OPR_INST_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AD0070010form1/IN_OPR_INST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0070010.AD0070010form1.PeekerOprInstCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.PeekerOprInstCd['onClick' + i])) {
        expj.AD0070010.AD0070010form1.PeekerOprInstCd['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.PeekerOprInstCd.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.PeekerOprInstCd.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-PeekerOprInstCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'PeekerOprInstCd', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010form1.PeekerOprInstCd.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.PeekerOprInstCd.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/PeekerOprInstCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-PeekerOprInstCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-PeekerOprInstCd" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-c3_WORK_STS_TYP">
expj.AD0070010.AD0070010form1.c3_WORK_STS_TYP = {};
expj.AD0070010.AD0070010form1.c3_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/c3_WORK_STS_TYP.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.c3_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-c3_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'c3_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AD0070010.AD0070010form1.c3_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.c3_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/c3_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-c3_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c3_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAD0070010Struct.getc3_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAD0070010Struct.getc3_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AD0070010-focus-move" id="expj-AD0070010-AD0070010form1-c3_WORK_STS_TYP"><label for="expj-AD0070010-AD0070010form1-c3_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0726",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-c4_WORK_STS_TYP">
expj.AD0070010.AD0070010form1.c4_WORK_STS_TYP = {};
expj.AD0070010.AD0070010form1.c4_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/c4_WORK_STS_TYP.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.c4_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-c4_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'c4_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AD0070010.AD0070010form1.c4_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.c4_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/c4_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-c4_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c4_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAD0070010Struct.getc4_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAD0070010Struct.getc4_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AD0070010-focus-move" id="expj-AD0070010-AD0070010form1-c4_WORK_STS_TYP"><label for="expj-AD0070010-AD0070010form1-c4_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0723",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_JOB_ODR_CD">
expj.AD0070010.AD0070010form1.IN_JOB_ODR_CD = {};
expj.AD0070010.AD0070010form1.IN_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_JOB_ODR_CD.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_JOB_ODR_CD', this);
  });
  expj.AD0070010.AD0070010form1.IN_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_JOB_ODR_CD" name="IN_JOB_ODR_CD" class="AD0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-PeekerJobOdrCd">
expj.AD0070010.AD0070010form1.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AD0070010form1/IN_JOB_ODR_CD@<%=contextNo%>"
expj.AD0070010.AD0070010form1.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0070010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010form1', '_AD0070010form1/IN_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_07%&%';
parameterValues += 'TARGET_FIELD%=%_AD0070010form1/IN_JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0070010.AD0070010form1.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.PeekerJobOdrCd['onClick' + i])) {
        expj.AD0070010.AD0070010form1.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010form1.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-PeekerJobOdrCd" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-c5_WORK_STS_TYP">
expj.AD0070010.AD0070010form1.c5_WORK_STS_TYP = {};
expj.AD0070010.AD0070010form1.c5_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/c5_WORK_STS_TYP.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.c5_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-c5_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'c5_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AD0070010.AD0070010form1.c5_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.c5_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/c5_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-c5_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c5_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAD0070010Struct.getc5_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAD0070010Struct.getc5_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AD0070010-focus-move" id="expj-AD0070010-AD0070010form1-c5_WORK_STS_TYP"><label for="expj-AD0070010-AD0070010form1-c5_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0725",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-c6_WORK_STS_TYP">
expj.AD0070010.AD0070010form1.c6_WORK_STS_TYP = {};
expj.AD0070010.AD0070010form1.c6_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/c6_WORK_STS_TYP.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.c6_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-c6_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'c6_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AD0070010.AD0070010form1.c6_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.c6_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/c6_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-c6_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c6_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAD0070010Struct.getc6_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAD0070010Struct.getc6_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AD0070010-focus-move" id="expj-AD0070010-AD0070010form1-c6_WORK_STS_TYP"><label for="expj-AD0070010-AD0070010form1-c6_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0013",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb)%></span><!-- 製造着手日 --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_OPR_INST_START_DATE_FROM">
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_FROM = {};
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_OPR_INST_START_DATE_FROM.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_FROM.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_OPR_INST_START_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_OPR_INST_START_DATE_FROM', this);
  });
  expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_FROM.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_OPR_INST_START_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_OPR_INST_START_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_OPR_INST_START_DATE_FROM" name="IN_OPR_INST_START_DATE_FROM" class="AD0070010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_OPR_INST_START_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-CalendarOprInstStartDateFrom">
expj.AD0070010.AD0070010form1.CalendarOprInstStartDateFrom = {};
// script1="onClick;0;CALENDAR;_AD0070010form1/IN_OPR_INST_START_DATE_FROM"
expj.AD0070010.AD0070010form1.CalendarOprInstStartDateFrom.onClick0 = function () {
  console.log('CalendarOprInstStartDateFrom script1');
expj.common.pscript.executeCalendar('AD0070010','AD0070010form1','_AD0070010form1/IN_OPR_INST_START_DATE_FROM');
};
expj.AD0070010.AD0070010form1.CalendarOprInstStartDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.CalendarOprInstStartDateFrom['onClick' + i])) {
        expj.AD0070010.AD0070010form1.CalendarOprInstStartDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.CalendarOprInstStartDateFrom.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.CalendarOprInstStartDateFrom.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-CalendarOprInstStartDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'CalendarOprInstStartDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0070010','AD0070010form1','_AD0070010form1/IN_OPR_INST_START_DATE_FROM');
  expj.AD0070010.AD0070010form1.CalendarOprInstStartDateFrom.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.CalendarOprInstStartDateFrom.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/CalendarOprInstStartDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-CalendarOprInstStartDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-CalendarOprInstStartDateFrom" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_OPR_INST_START_TIME_FROM">
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_FROM = {};
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_FROM.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_OPR_INST_START_TIME_FROM.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_FROM.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_OPR_INST_START_TIME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_OPR_INST_START_TIME_FROM', this);
  });
  expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_FROM.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_FROM.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_OPR_INST_START_TIME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_OPR_INST_START_TIME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_OPR_INST_START_TIME_FROM" name="IN_OPR_INST_START_TIME_FROM" class="AD0070010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_OPR_INST_START_TIME_FROM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_OPR_INST_START_DATE_TO">
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_TO = {};
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_OPR_INST_START_DATE_TO.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_TO.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_OPR_INST_START_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_OPR_INST_START_DATE_TO', this);
  });
  expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_TO.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_OPR_INST_START_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_OPR_INST_START_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_OPR_INST_START_DATE_TO" name="IN_OPR_INST_START_DATE_TO" class="AD0070010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_OPR_INST_START_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-CalendarOprInstStartDateTo">
expj.AD0070010.AD0070010form1.CalendarOprInstStartDateTo = {};
// script1="onClick;0;CALENDAR;_AD0070010form1/IN_OPR_INST_START_DATE_TO"
expj.AD0070010.AD0070010form1.CalendarOprInstStartDateTo.onClick0 = function () {
  console.log('CalendarOprInstStartDateTo script1');
expj.common.pscript.executeCalendar('AD0070010','AD0070010form1','_AD0070010form1/IN_OPR_INST_START_DATE_TO');
};
expj.AD0070010.AD0070010form1.CalendarOprInstStartDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.CalendarOprInstStartDateTo['onClick' + i])) {
        expj.AD0070010.AD0070010form1.CalendarOprInstStartDateTo['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.CalendarOprInstStartDateTo.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.CalendarOprInstStartDateTo.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-CalendarOprInstStartDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'CalendarOprInstStartDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0070010','AD0070010form1','_AD0070010form1/IN_OPR_INST_START_DATE_TO');
  expj.AD0070010.AD0070010form1.CalendarOprInstStartDateTo.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.CalendarOprInstStartDateTo.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/CalendarOprInstStartDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-CalendarOprInstStartDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-CalendarOprInstStartDateTo" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_OPR_INST_START_TIME_TO">
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_TO = {};
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_TO.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_OPR_INST_START_TIME_TO.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_TO.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_OPR_INST_START_TIME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_OPR_INST_START_TIME_TO', this);
  });
  expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_TO.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_TO.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_OPR_INST_START_TIME_TO.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_OPR_INST_START_TIME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_OPR_INST_START_TIME_TO" name="IN_OPR_INST_START_TIME_TO" class="AD0070010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_OPR_INST_START_TIME_TO()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_3",rb)%></span><!-- 製造納期 --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_DATE_FROM">
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_FROM = {};
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_FROM.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_WORK_ODR_DLV_DATE_FROM', this);
  });
  expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_FROM.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_DATE_FROM" name="IN_WORK_ODR_DLV_DATE_FROM" class="AD0070010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_WORK_ODR_DLV_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-CalendarWorkOdrDlvDateFrom">
expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateFrom = {};
// script1="onClick;0;CALENDAR;_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM"
expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateFrom.onClick0 = function () {
  console.log('CalendarWorkOdrDlvDateFrom script1');
expj.common.pscript.executeCalendar('AD0070010','AD0070010form1','_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM');
};
expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateFrom['onClick' + i])) {
        expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateFrom.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateFrom.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-CalendarWorkOdrDlvDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'CalendarWorkOdrDlvDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0070010','AD0070010form1','_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM');
  expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateFrom.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateFrom.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/CalendarWorkOdrDlvDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-CalendarWorkOdrDlvDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-CalendarWorkOdrDlvDateFrom" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_TIME_FROM">
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_FROM = {};
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_FROM.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_FROM.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_TIME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_WORK_ODR_DLV_TIME_FROM', this);
  });
  expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_FROM.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_FROM.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_TIME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_TIME_FROM" name="IN_WORK_ODR_DLV_TIME_FROM" class="AD0070010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_WORK_ODR_DLV_TIME_FROM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_DATE_TO">
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_TO = {};
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_WORK_ODR_DLV_DATE_TO.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_TO.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_WORK_ODR_DLV_DATE_TO', this);
  });
  expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_TO.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_WORK_ODR_DLV_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_DATE_TO" name="IN_WORK_ODR_DLV_DATE_TO" class="AD0070010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_WORK_ODR_DLV_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-CalendarWorkOdrDlvDateTo">
expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateTo = {};
// script1="onClick;0;CALENDAR;_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO"
expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateTo.onClick0 = function () {
  console.log('CalendarWorkOdrDlvDateTo script1');
expj.common.pscript.executeCalendar('AD0070010','AD0070010form1','_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO');
};
expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateTo['onClick' + i])) {
        expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateTo['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateTo.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateTo.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-CalendarWorkOdrDlvDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010form1', 'CalendarWorkOdrDlvDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0070010','AD0070010form1','_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO');
  expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateTo.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateTo.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/CalendarWorkOdrDlvDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-CalendarWorkOdrDlvDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0070010-AD0070010form1-CalendarWorkOdrDlvDateTo" class="AD0070010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_TIME_TO">
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_TO = {};
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_TO.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/IN_WORK_ODR_DLV_TIME_TO.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_TO.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_TIME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'IN_WORK_ODR_DLV_TIME_TO', this);
  });
  expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_TO.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_TO.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/IN_WORK_ODR_DLV_TIME_TO.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_TIME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0070010-AD0070010form1-IN_WORK_ODR_DLV_TIME_TO" name="IN_WORK_ODR_DLV_TIME_TO" class="AD0070010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getIN_WORK_ODR_DLV_TIME_TO()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AD0070010-AD0070010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0070010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0070010-AD0070010form1-TIME_CTRL">
expj.AD0070010.AD0070010form1.TIME_CTRL = {};
expj.AD0070010.AD0070010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0070010form1/TIME_CTRL.onDecision');
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
  expj.AD0070010.executeAllOnDecision();
};
expj.AD0070010.AD0070010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0070010', 'AD0070010form1', 'TIME_CTRL', this);
  });
  expj.AD0070010.AD0070010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0070010.AD0070010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0070010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0070010-AD0070010button1">
expj.AD0070010.AD0070010button1 = {};
expj.AD0070010.AD0070010button1.executeAllOnDecision = function () {
  console.log('execute AD0070010button1.onDecision');
};
expj.AD0070010.AD0070010button1.executeOnLoad = function () {
  expj.AD0070010.AD0070010button1.executePScriptOnLoad();
};

expj.AD0070010.AD0070010button1.executePScriptOnLoad = function () {
  console.log('execute AD0070010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0070010-AD0070010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0070010-AD0070010button1-Select">
expj.AD0070010.AD0070010button1.Select = {};
// script1="onClick;0;UNMASK;_AD0070010button0/CsvOut"
expj.AD0070010.AD0070010button1.Select.onClick0 = function () {
  console.log('Select script1');
expj.common.pscript.setUnMaskToReferenceComponent('AD0070010', 'AD0070010button1', '_AD0070010button0/CsvOut');
};
// script2="onClick;1;CHK;_AD0070010form1/TIME_CTRL[eq]true@*0"
expj.AD0070010.AD0070010button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onClick;2;CHK;_AD0070010form1/TIME_CTRL[eq]true@*1"
expj.AD0070010.AD0070010button1.Select.onClick2 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="onClick;3;CHK;_AD0070010form1/TIME_CTRL[eq]true@*2"
expj.AD0070010.AD0070010button1.Select.onClick3 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script5="onClick;4;CHK;_AD0070010form1/TIME_CTRL[eq]true@*3"
expj.AD0070010.AD0070010button1.Select.onClick4 = function () {
  console.log('Select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="onClick;5;CHK;_AD0070010form1/TIME_CTRL[eq]true@*4"
expj.AD0070010.AD0070010button1.Select.onClick5 = function () {
  console.log('Select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="onClick;6;CHK;_AD0070010form1/TIME_CTRL[eq]true@*5"
expj.AD0070010.AD0070010button1.Select.onClick6 = function () {
  console.log('Select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="onClick;7;CHK;_AD0070010form1/TIME_CTRL[eq]true@*6"
expj.AD0070010.AD0070010button1.Select.onClick7 = function () {
  console.log('Select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="onClick;8;CHK;_AD0070010form1/TIME_CTRL[eq]true@*7"
expj.AD0070010.AD0070010button1.Select.onClick8 = function () {
  console.log('Select script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="onClick;9;CHK;_AD0070010form1/TIME_CTRL[eq]true[and]~LEN(_AD0070010form1/IN_OPR_INST_START_TIME_FROM)[eq]3@*8"
expj.AD0070010.AD0070010button1.Select.onClick9 = function () {
  console.log('Select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="onClick;10;CHK;_AD0070010form1/TIME_CTRL[eq]true[and]~LEN(_AD0070010form1/IN_OPR_INST_START_TIME_FROM)[eq]4@*9"
expj.AD0070010.AD0070010button1.Select.onClick10 = function () {
  console.log('Select script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="onClick;11;CHK;_AD0070010form1/TIME_CTRL[eq]true[and]~LEN(_AD0070010form1/IN_OPR_INST_START_TIME_TO)[eq]3@*10"
expj.AD0070010.AD0070010button1.Select.onClick11 = function () {
  console.log('Select script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script13="onClick;12;CHK;_AD0070010form1/TIME_CTRL[eq]true[and]~LEN(_AD0070010form1/IN_OPR_INST_START_TIME_TO)[eq]4@*11"
expj.AD0070010.AD0070010button1.Select.onClick12 = function () {
  console.log('Select script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script14="onClick;13;CHK;_AD0070010form1/TIME_CTRL[eq]true[and]~LEN(_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM)[eq]3@*12"
expj.AD0070010.AD0070010button1.Select.onClick13 = function () {
  console.log('Select script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script15="onClick;14;CHK;_AD0070010form1/TIME_CTRL[eq]true[and]~LEN(_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM)[eq]4@*13"
expj.AD0070010.AD0070010button1.Select.onClick14 = function () {
  console.log('Select script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script16="onClick;15;CHK;_AD0070010form1/TIME_CTRL[eq]true[and]~LEN(_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO)[eq]3@*14"
expj.AD0070010.AD0070010button1.Select.onClick15 = function () {
  console.log('Select script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script17="onClick;16;CHK;_AD0070010form1/TIME_CTRL[eq]true[and]~LEN(_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO)[eq]4@*15"
expj.AD0070010.AD0070010button1.Select.onClick16 = function () {
  console.log('Select script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script18="onClick;17;CHK;_AD0070010form1/IN_OPR_INST_START_DATE_FROM[neq][and]_AD0070010form1/IN_OPR_INST_START_DATE_TO[neq][and]_AD0070010form1/IN_OPR_INST_START_DATE_TO[lt]_AD0070010form1/IN_OPR_INST_START_DATE_FROM@!ZZ05101"
expj.AD0070010.AD0070010button1.Select.onClick17 = function () {
  console.log('Select script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_DATE_TO')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_DATE_FROM')))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'ZZ05101');
}
};
// script19="onClick;18;CHK;_AD0070010form1/TIME_CTRL[eq]true[and]_AD0070010form1/IN_OPR_INST_START_DATE_FROM[eq]_AD0070010form1/IN_OPR_INST_START_DATE_TO@*16"
expj.AD0070010.AD0070010button1.Select.onClick18 = function () {
  console.log('Select script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_DATE_TO'))) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script20="onClick;19;CHK;_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM[neq][and]_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO[neq][and]_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO[lt]_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM@!ZZ05101"
expj.AD0070010.AD0070010button1.Select.onClick19 = function () {
  console.log('Select script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM')))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'ZZ05101');
}
};
// script21="onClick;20;CHK;_AD0070010form1/TIME_CTRL[eq]true[and]_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM[eq]_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO@*18"
expj.AD0070010.AD0070010button1.Select.onClick20 = function () {
  console.log('Select script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO'))) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script22="onClick;21;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0070010form1/*@AD0070010Servlet"
expj.AD0070010.AD0070010button1.Select.onClick21 = function () {
  console.log('Select script22');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0070010', 'AD0070010button1', '_AD0070010form1/*', 'AD0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0070010', response);
expj.common.updateBusinessScreenTab('AD0070010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script23="child;0;CHK;_AD0070010form1/IN_OPR_INST_START_DATE_FROM[eq][and]_AD0070010form1/IN_OPR_INST_START_TIME_FROM[neq]@!AS00051"
expj.AD0070010.AD0070010button1.Select.child0 = function () {
  console.log('Select script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_DATE_FROM'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00051');
}
};
// script24="child;1;CHK;_AD0070010form1/IN_OPR_INST_START_DATE_TO[eq][and]_AD0070010form1/IN_OPR_INST_START_TIME_TO[neq]@!AS00052"
expj.AD0070010.AD0070010button1.Select.child1 = function () {
  console.log('Select script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_DATE_TO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00052');
}
};
// script25="child;2;CHK;_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM[eq][and]_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM[neq]@!AS00053"
expj.AD0070010.AD0070010button1.Select.child2 = function () {
  console.log('Select script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_DATE_FROM'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00053');
}
};
// script26="child;3;CHK;_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO[eq][and]_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO[neq]@!AS00054"
expj.AD0070010.AD0070010button1.Select.child3 = function () {
  console.log('Select script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_DATE_TO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00054');
}
};
// script27="child;4;CHK;~LEN(_AD0070010form1/IN_OPR_INST_START_TIME_FROM)[eq]1[or]~LEN(_AD0070010form1/IN_OPR_INST_START_TIME_FROM)[eq]2@!AS00055"
expj.AD0070010.AD0070010button1.Select.child4 = function () {
  console.log('Select script27');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00055');
}
};
// script28="child;5;CHK;~LEN(_AD0070010form1/IN_OPR_INST_START_TIME_TO)[eq]1[or]~LEN(_AD0070010form1/IN_OPR_INST_START_TIME_TO)[eq]2@!AS00056"
expj.AD0070010.AD0070010button1.Select.child5 = function () {
  console.log('Select script28');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00056');
}
};
// script29="child;6;CHK;~LEN(_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM)[eq]1[or]~LEN(_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM)[eq]2@!AS00057"
expj.AD0070010.AD0070010button1.Select.child6 = function () {
  console.log('Select script29');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00057');
}
};
// script30="child;7;CHK;~LEN(_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO)[eq]1[or]~LEN(_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO)[eq]2@!AS00058"
expj.AD0070010.AD0070010button1.Select.child7 = function () {
  console.log('Select script30');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00058');
}
};
// script31="child;8;CHK;[{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_FROM:1)}*10+{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_FROM:2)}][gte]60@!AS00059"
expj.AD0070010.AD0070010button1.Select.child8 = function () {
  console.log('Select script31');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00059');
}
};
// script32="child;9;CHK;[{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_FROM:0)}*10+{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_FROM:1)}][gte]24[or][{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_FROM:2)}*10+{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_FROM:3)}][gte]60@!AS00059"
expj.AD0070010.AD0070010button1.Select.child9 = function () {
  console.log('Select script32');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00059');
}
};
// script33="child;10;CHK;[{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_TO:1)}*10+{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_TO:2)}][gte]60@!AS00060"
expj.AD0070010.AD0070010button1.Select.child10 = function () {
  console.log('Select script33');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00060');
}
};
// script34="child;11;CHK;[{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_TO:0)}*10+{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_TO:1)}][gte]24[or][{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_TO:2)}*10+{~CHARAT(_AD0070010form1/IN_OPR_INST_START_TIME_TO:3)}][gte]60@!AS00060"
expj.AD0070010.AD0070010button1.Select.child11 = function () {
  console.log('Select script34');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00060');
}
};
// script35="child;12;CHK;[{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM:1)}*10+{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM:2)}][gte]60@!AS00061"
expj.AD0070010.AD0070010button1.Select.child12 = function () {
  console.log('Select script35');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00061');
}
};
// script36="child;13;CHK;[{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM:0)}*10+{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM:1)}][gte]24[or][{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM:2)}*10+{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM:3)}][gte]60@!AS00061"
expj.AD0070010.AD0070010button1.Select.child13 = function () {
  console.log('Select script36');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00061');
}
};
// script37="child;14;CHK;[{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO:1)}*10+{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO:2)}][gte]60@!AS00062"
expj.AD0070010.AD0070010button1.Select.child14 = function () {
  console.log('Select script37');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00062');
}
};
// script38="child;15;CHK;[{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO:0)}*10+{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO:1)}][gte]24[or][{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO:2)}*10+{~CHARAT(_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO:3)}][gte]60@!AS00062"
expj.AD0070010.AD0070010button1.Select.child15 = function () {
  console.log('Select script38');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'AS00062');
}
};
// script39="child;16;CHK;_AD0070010form1/IN_OPR_INST_START_TIME_FROM[neq][and]_AD0070010form1/IN_OPR_INST_START_TIME_TO[neq]@*17"
expj.AD0070010.AD0070010button1.Select.child16 = function () {
  console.log('Select script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script40="child;17;CHK;_AD0070010form1/IN_OPR_INST_START_TIME_FROM[gt]_AD0070010form1/IN_OPR_INST_START_TIME_TO@!ZZ05101"
expj.AD0070010.AD0070010button1.Select.child17 = function () {
  console.log('Select script40');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_OPR_INST_START_TIME_TO')))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'ZZ05101');
}
};
// script41="child;18;CHK;_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM[neq][and]_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO[neq]@*19"
expj.AD0070010.AD0070010button1.Select.child18 = function () {
  console.log('Select script41');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script42="child;19;CHK;_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM[gt]_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO@!ZZ05101"
expj.AD0070010.AD0070010button1.Select.child19 = function () {
  console.log('Select script42');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0070010', 'AD0070010button1', '_AD0070010form1/IN_WORK_ODR_DLV_TIME_TO')))) {
expj.common.pscript.viewErrorMessage('AD0070010', 'AD0070010button1', 'ZZ05101');
}
};
expj.AD0070010.AD0070010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 21; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010button1.Select['onClick' + i])) {
        expj.AD0070010.AD0070010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010button1.Select.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010button1.Select.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010button1', 'Select', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010button1.Select.executePScriptOnLoad();
};

expj.AD0070010.AD0070010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AD0070010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0070010-AD0070010button1-Select" name="Select" class="AD0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0070010-AD0070010view1">
expj.AD0070010.AD0070010view1 = {};
expj.AD0070010.AD0070010view1.executeAllOnClick = function () {
};
expj.AD0070010.AD0070010view1.executeAllOnDecision = function () {
  console.log('execute AD0070010view1.onDecision');
};
expj.AD0070010.AD0070010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0070010view1", "expj.AD0070010.AD0070010view1.executeAllOnClick");
%>
  expj.AD0070010.AD0070010view1.executePScriptOnLoad();
};

expj.AD0070010.AD0070010view1.executePScriptOnLoad = function () {
  console.log('execute AD0070010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0070010-AD0070010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0070010view1_Id = "AD0070010view1";
 String AD0070010view1_select = "single";
 String AD0070010view1_sortable = "true";
 String AD0070010view1_resize = "true";
 String AD0070010view1_scroll = "true";
 StringBuffer AD0070010view1_HB = new StringBuffer();
 StringBuffer AD0070010view1_DB = new StringBuffer();
%>
<%
 AD0070010view1_select = "multi";
 AD0070010view1_sortable = "true";
 AD0070010view1_resize = "true";
 AD0070010view1_scroll = "true";
%>
<%
 AD0070010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
%>
     
<%
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0721",rb))).append("', 'name':'STATUS_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_CD",rb))).append("', 'name':'WORK_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NO_1",rb))).append("', 'name':'PROC_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_CD",rb))).append("', 'name':'WORK_IN_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NAME_1",rb))).append("', 'name':'PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_3",rb))).append("', 'name':'WORK_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_START_DATE",rb))).append("', 'name':'OPR_INST_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_CD",rb))).append("', 'name':'OPR_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_DATE",rb))).append("', 'name':'OPR_INST_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_SLIP_ISS_DATE",rb))).append("', 'name':'OPR_INST_SLIP_ISS_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_QTY",rb))).append("', 'name':'OPR_INST_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0318",rb))).append("', 'name':'SUM_ACPT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0325",rb))).append("', 'name':'SUM_DEFECT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT_1",rb))).append("', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_STS_TYP",rb))).append("', 'name':'WORK_STS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_CMPLT_DATE",rb))).append("', 'name':'WORK_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DRAW_CD",rb))).append("', 'name':'DRAW_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_SPEC",rb))).append("', 'name':'SPEC', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb))).append("', 'name':'JOB_ODR_CANCEL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP_2",rb))).append("', 'name':'OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb))).append("', 'name':'ACPT_INSPC_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_NAME",rb))).append("', 'name':'WS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
AD0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0070010view1_sortable).append("}").append(",");
%>
<%
 int aAD0070010StructLength = aAD0070010Control.getListsize();
 final AD0070010Struct structBackup = aAD0070010Struct;
 aAD0070010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0070010StructLength; ++loopCount) {
  if((aAD0070010Struct = (AD0070010Struct) aAD0070010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0070010Struct", aAD0070010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0070010view1_DB.append("[");
 AD0070010view1_DB.append(loopCount);
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-STATUS_DN-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-STATUS_DN\" data-name=\"STATUS_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getSTATUS_DN())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-PLANT_CD\" data-name=\"PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getPLANT_CD())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-WORK_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-WORK_ODR_CD\" data-name=\"WORK_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getWORK_ODR_CD())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-PROC_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-PROC_NO\" data-name=\"PROC_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getPROC_NO())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-WORK_IN_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-WORK_IN_PROC_CD\" data-name=\"WORK_IN_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getWORK_IN_PROC_CD())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-PROC_NAME\" data-name=\"PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getPROC_NAME())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-WORK_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-WORK_ODR_DLV_DATE\" data-name=\"WORK_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getWORK_ODR_DLV_DATE())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-OPR_INST_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-OPR_INST_START_DATE\" data-name=\"OPR_INST_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getOPR_INST_START_DATE())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-OPR_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-OPR_INST_CD\" data-name=\"OPR_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getOPR_INST_CD())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-PUCH_ODR_CD\" data-name=\"PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getPUCH_ODR_CD())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-OPR_INST_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-OPR_INST_DATE\" data-name=\"OPR_INST_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getOPR_INST_DATE())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-OPR_INST_SLIP_ISS_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-OPR_INST_SLIP_ISS_DATE\" data-name=\"OPR_INST_SLIP_ISS_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getOPR_INST_SLIP_ISS_DATE())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-OPR_INST_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-OPR_INST_QTY\" data-name=\"OPR_INST_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0070010Struct.getOPR_INST_QTY())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-SUM_ACPT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-SUM_ACPT_QTY\" data-name=\"SUM_ACPT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0070010Struct.getSUM_ACPT_QTY())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-SUM_DEFECT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-SUM_DEFECT_QTY\" data-name=\"SUM_DEFECT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0070010Struct.getSUM_DEFECT_QTY())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getSTOCK_UNIT())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-WORK_STS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-WORK_STS_NAME\" data-name=\"WORK_STS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getWORK_STS_NAME())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-WORK_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-WORK_CMPLT_DATE\" data-name=\"WORK_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getWORK_CMPLT_DATE())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getITEM_CD())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getITEM_NAME())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-DRAW_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-DRAW_CD\" data-name=\"DRAW_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getDRAW_CD())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-SPEC-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-SPEC\" data-name=\"SPEC\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getSPEC())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-MRP_ODR_TYP\" data-name=\"MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getMRP_ODR_TYP())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getJOB_ODR_CD())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-JOB_ODR_CANCEL_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-JOB_ODR_CANCEL_NO\" data-name=\"JOB_ODR_CANCEL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getJOB_ODR_CANCEL_NO())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-OUTSIDE_TYP\" data-name=\"OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getOUTSIDE_TYP())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-ACPT_INSPC_TYP-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-ACPT_INSPC_TYP\" data-name=\"ACPT_INSPC_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getACPT_INSPC_TYP())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-WS_CD\" data-name=\"WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getWS_CD())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-WS_NAME\" data-name=\"WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getWS_NAME())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getVEND_CD())).append("</span>'");
 AD0070010view1_DB.append(",").append("'<span id=\"expj-AD0070010-AD0070010view1-VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AD0070010-AD0070010view1-VEND_ANAME\" data-name=\"VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0070010Struct.getVEND_ANAME())).append("</span>'");
 AD0070010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0070010StructLength) {
   AD0070010view1_DB.append(",");
  }
 }
 aAD0070010Struct = structBackup;
 viewIdList.add(AD0070010view1_Id);
 viewSelectList.add(AD0070010view1_select);
 viewResizeList.add(AD0070010view1_resize);
 viewScrollList.add(AD0070010view1_scroll);
 viewHeaderDataList.add(AD0070010view1_HB);
 viewBodyDataList.add(AD0070010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-right" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0070010 Revision: 1.11  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AD0070010-AD0070010button0">
expj.AD0070010.AD0070010button0 = {};
expj.AD0070010.AD0070010button0.executeAllOnDecision = function () {
  console.log('execute AD0070010button0.onDecision');
};
expj.AD0070010.AD0070010button0.executeOnLoad = function () {
  expj.AD0070010.AD0070010button0.executePScriptOnLoad();
};

expj.AD0070010.AD0070010button0.executePScriptOnLoad = function () {
  console.log('execute AD0070010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0070010-AD0070010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0070010-AD0070010button0-CsvOut">
expj.AD0070010.AD0070010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0070010form1/*@AD0070010Servlet,,$ZZ07011"
expj.AD0070010.AD0070010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0070010', 'AD0070010button0', '_AD0070010form1/*', 'AD0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0070010', response);
expj.common.updateBusinessScreenTab('AD0070010', contents);
};
expj.common.pscript.callConfirm('AD0070010', 'AD0070010button0', 'ZZ07011', okEvent);
};
expj.AD0070010.AD0070010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010button0.CsvOut['onClick' + i])) {
        expj.AD0070010.AD0070010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010button0.CsvOut.executePScriptOnLoad();
};

expj.AD0070010.AD0070010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AD0070010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0070010-AD0070010button0-CsvOut" name="CsvOut" class="AD0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010button0-Clear">
expj.AD0070010.AD0070010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0070010form1/*@AD0070010Servlet,,$ZZ07008"
expj.AD0070010.AD0070010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0070010', 'AD0070010button0', '_AD0070010form1/*', 'AD0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0070010', response);
expj.common.updateBusinessScreenTab('AD0070010', contents);
};
expj.common.pscript.callConfirm('AD0070010', 'AD0070010button0', 'ZZ07008', okEvent);
};
expj.AD0070010.AD0070010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010button0.Clear['onClick' + i])) {
        expj.AD0070010.AD0070010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010button0.Clear.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010button0.Clear.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010button0.Clear.executePScriptOnLoad();
};

expj.AD0070010.AD0070010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0070010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0070010-AD0070010button0-Clear" name="Clear" class="AD0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0070010-AD0070010button0-Close">
expj.AD0070010.AD0070010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0070010.AD0070010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0070010');
};
expj.AD0070010.AD0070010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0070010.AD0070010button0.Close['onClick' + i])) {
        expj.AD0070010.AD0070010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0070010.AD0070010button0.Close.executeAllOnDecision = function () {
};
expj.AD0070010.AD0070010button0.Close.executeOnLoad = function () {
  $('#expj-AD0070010-AD0070010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0070010', 'AD0070010button0', 'Close', this, 'Button');
    }
  });
  expj.AD0070010.AD0070010button0.Close.executePScriptOnLoad();
};

expj.AD0070010.AD0070010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0070010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0070010-AD0070010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0070010-AD0070010button0-Close" name="Close" class="AD0070010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0070010 (END)-->
<%
MessageStruct msgStruct = aAD0070010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0070010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0070010)) {
  expj.common.treeInstanceMap.AD0070010 = {};
}
expj.common.treeInstanceMap.AD0070010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0070010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0070010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0070010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0070010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0070010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0070010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0070010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0070010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0070010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0070010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0070010)) {
  expj.common.detailDialogMap.AD0070010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0070010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0070010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0070010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0070010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0070010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0070010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0070010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0070010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0070010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0070010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0070010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0070010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0070010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0070010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0070010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0070010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0070010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0070010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0070010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0070010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0070010)) {
  expj.common.viewInstanceMap.AD0070010 = {};
}
expj.common.viewInstanceMap.AD0070010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0070010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0070010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0070010.<%=viewId %>.init = function () {
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
    expj.AD0070010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0070010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0070010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0070010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0070010_init">
/**
 * AD0070010用のロード完了時初期化関数
 */
expj.AD0070010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0070010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0070010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0070010');
  expj.common.calendarInstanceMap.AD0070010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0070010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0070010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0070010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0070010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0070010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0070010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0070010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0070010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0070010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0070010.AD0070010form1.IN_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_WORK_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.PeekerWorkOdrCd.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.c1_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.c2_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.PeekerOprInstCd.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.c3_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.c4_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.c5_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.c6_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.CalendarOprInstStartDateFrom.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_FROM.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_OPR_INST_START_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.CalendarOprInstStartDateTo.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_OPR_INST_START_TIME_TO.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateFrom.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_FROM.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.CalendarWorkOdrDlvDateTo.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.IN_WORK_ODR_DLV_TIME_TO.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010form1.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010button1.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010view1.executeOnLoad();}catch(e){};
  try{expj.AD0070010.AD0070010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0070010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0070010', 'AD0070010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0070010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0070010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0070010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0070010', '<%=request.getContextPath() %>');
};

/**
 * AD0070010の全体onDecision処理
 */
expj.AD0070010.executeAllOnDecision = function () {
  expj.AD0070010.AD0070010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0070010_console">
expj.AD0070010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>