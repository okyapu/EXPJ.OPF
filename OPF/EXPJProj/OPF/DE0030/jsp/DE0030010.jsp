<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:56:27 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DE0030\DE0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DE0030.*" %>
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
<jsp:useBean id="aDE0030010Control" class="com.nec.jp.orteus.metamorBase.DE0030.DE0030010Control" scope="request"/>
<jsp:useBean id="aDE0030010Struct" class="com.nec.jp.orteus.metamorBase.DE0030.DE0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

原価基準情報インタフェース削除実行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DE0030/jsp/DE0030010.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:06:51 $
********************************************************* --%>
<html>
<head>
<title>原価基準情報インタフェース削除実行</title>
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
<script class="expj-script-DE0030010_init">
  // DE0030010名前空間
  expj.DE0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DE0030010" data-screen="DE0030010" data-newdata="<%=aDE0030010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
  <div class="expj-tr" style="height:5px">
    <div class="expj-td" style=""></div><!--/td-->

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
            <script class="expj-script-DE0030010-DE0030010form1">
expj.DE0030010.DE0030010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.DE0030010.DE0030010form1.onLoad0 = function () {
  console.log('DE0030010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DE0030010.DE0030010form1.onDecision0 = function () {
  console.log('DE0030010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DE0030010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DE0030010button1/Select"
expj.DE0030010.DE0030010form1.child0 = function () {
  console.log('DE0030010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DE0030010', 'DE0030010form1', '_DE0030010button1/Select');
};
// script4="child;1;MASK;_DE0030010button1/Select"
expj.DE0030010.DE0030010form1.child1 = function () {
  console.log('DE0030010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DE0030010', 'DE0030010form1', '_DE0030010button1/Select');
};
// script5="onDecision;1;CHK;?DE0030010form1/*[eq]NORMAL@*2,*5"
expj.DE0030010.DE0030010form1.onDecision1 = function () {
  console.log('DE0030010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DE0030010', 'DE0030010form1', '?DE0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;2;CHKRQ;A,B@*3,*5"
expj.DE0030010.DE0030010form1.child2 = function () {
  console.log('DE0030010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('DE0030010', 'A') && expj.common.pscript.satisfiedRequiredComponent('DE0030010', 'B')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHK;?PLANT_CD[eq]SAME@*4,*5"
expj.DE0030010.DE0030010form1.child3 = function () {
  console.log('DE0030010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DE0030010', 'DE0030010form1', '?PLANT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_DE0030010button2/Execute"
expj.DE0030010.DE0030010form1.child4 = function () {
  console.log('DE0030010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('DE0030010', 'DE0030010form1', '_DE0030010button2/Execute');
};
// script9="child;5;MASK;_DE0030010button2/Execute"
expj.DE0030010.DE0030010form1.child5 = function () {
  console.log('DE0030010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('DE0030010', 'DE0030010form1', '_DE0030010button2/Execute');
};
expj.DE0030010.DE0030010form1.executeAllOnDecision = function () {
  console.log('execute DE0030010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DE0030010.DE0030010form1['onDecision' + i])) {
        expj.DE0030010.DE0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.DE0030010.DE0030010form1.executeOnLoad = function () {
  expj.DE0030010.DE0030010form1.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form1.executePScriptOnLoad = function () {
  console.log('execute DE0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DE0030010.DE0030010form1['onLoad' + i])) {
      expj.DE0030010.DE0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DE0030010-DE0030010form1" action="DE0030010Servlet" name="DE0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDE0030010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-DE0030010-DE0030010form1-PLANT_CD">
expj.DE0030010.DE0030010form1.PLANT_CD = {};
expj.DE0030010.DE0030010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DE0030010form1/PLANT_CD.onDecision');
  expj.DE0030010.DE0030010form1.executeAllOnDecision();
  expj.DE0030010.executeAllOnDecision();
};
expj.DE0030010.DE0030010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DE0030010', 'DE0030010form1', 'PLANT_CD', this);
  });
  expj.DE0030010.DE0030010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DE0030010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DE0030010-DE0030010form1-PLANT_CD" name="PLANT_CD" class="DE0030010-focus-move  required-value expj-DE0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDE0030010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-DE0030010-DE0030010form1-PeekerPlantCd">
expj.DE0030010.DE0030010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DE0030010form1/PLANT_CD:_DE0030010form1/PLANT_NAME@<%=contextNo%>"
expj.DE0030010.DE0030010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DE0030010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DE0030010', 'DE0030010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DE0030010form1/PLANT_CD:_DE0030010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DE0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DE0030010.DE0030010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DE0030010.DE0030010form1.PeekerPlantCd['onClick' + i])) {
        expj.DE0030010.DE0030010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DE0030010.DE0030010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DE0030010.DE0030010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DE0030010', 'DE0030010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DE0030010.DE0030010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DE0030010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DE0030010-DE0030010form1-PeekerPlantCd" class="DE0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DE0030010-DE0030010form1-PLANT_NAME">
expj.DE0030010.DE0030010form1.PLANT_NAME = {};
expj.DE0030010.DE0030010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DE0030010form1/PLANT_NAME.onDecision');
  expj.DE0030010.DE0030010form1.executeAllOnDecision();
  expj.DE0030010.executeAllOnDecision();
};
expj.DE0030010.DE0030010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DE0030010', 'DE0030010form1', 'PLANT_NAME', this);
  });
  expj.DE0030010.DE0030010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DE0030010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DE0030010-DE0030010form1-PLANT_NAME" name="PLANT_NAME" class="DE0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDE0030010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DE0030010-DE0030010button1">
expj.DE0030010.DE0030010button1 = {};
expj.DE0030010.DE0030010button1.executeAllOnDecision = function () {
  console.log('execute DE0030010button1.onDecision');
};
expj.DE0030010.DE0030010button1.executeOnLoad = function () {
  expj.DE0030010.DE0030010button1.executePScriptOnLoad();
};

expj.DE0030010.DE0030010button1.executePScriptOnLoad = function () {
  console.log('execute DE0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DE0030010-DE0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DE0030010-DE0030010button1-Select">
expj.DE0030010.DE0030010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DE0030010form1/*@DE0030010Servlet"
expj.DE0030010.DE0030010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DE0030010', 'DE0030010button1', '_DE0030010form1/*', 'DE0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DE0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DE0030010', response);
expj.common.updateBusinessScreenTab('DE0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DE0030010.DE0030010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DE0030010.DE0030010button1.Select['onClick' + i])) {
        expj.DE0030010.DE0030010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DE0030010.DE0030010button1.Select.executeAllOnDecision = function () {
};
expj.DE0030010.DE0030010button1.Select.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DE0030010', 'DE0030010button1', 'Select', this, 'Button');
    }
  });
  expj.DE0030010.DE0030010button1.Select.executePScriptOnLoad();
};

expj.DE0030010.DE0030010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DE0030010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DE0030010-DE0030010button1-Select" name="Select" class="DE0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-DE0030010-DE0030010form2">
expj.DE0030010.DE0030010form2 = {};
expj.DE0030010.DE0030010form2.executeAllOnDecision = function () {
  console.log('execute DE0030010form2.onDecision');
};
expj.DE0030010.DE0030010form2.executeOnLoad = function () {
  expj.DE0030010.DE0030010form2.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form2.executePScriptOnLoad = function () {
  console.log('execute DE0030010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DE0030010-DE0030010form2" action="DE0030010Servlet" name="DE0030010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.COST_TYP",rb)%></span><!-- 原価種別 --></div><!--/td-->
<script class="expj-script-DE0030010-DE0030010form2-COST_TYP">
expj.DE0030010.DE0030010form2.COST_TYP = {};
expj.DE0030010.DE0030010form2.COST_TYP.executeAllOnDecision = function () {
  console.log('execute DE0030010form2/COST_TYP.onDecision');
  expj.DE0030010.DE0030010form2.executeAllOnDecision();
  expj.DE0030010.executeAllOnDecision();
};
expj.DE0030010.DE0030010form2.COST_TYP.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010form2-COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DE0030010', 'DE0030010form2', 'COST_TYP', this);
  });
  expj.DE0030010.DE0030010form2.COST_TYP.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form2.COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DE0030010form2/COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010form2-COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DE0030010-DE0030010form2-COST_TYP" name='COST_TYP' class='DE0030010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDE0030010Control.getStruct().getList_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDE0030010Control.getStruct().getList_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDE0030010Control.getStruct().getList_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDE0030010Struct.getCOST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CS_MAST_IF_PERIOD",rb)%></span><!-- 原価基準情報IF保持期間 --></div><!--/td-->
<script class="expj-script-DE0030010-DE0030010form2-CS_MAST_IF_PERIOD">
expj.DE0030010.DE0030010form2.CS_MAST_IF_PERIOD = {};
expj.DE0030010.DE0030010form2.CS_MAST_IF_PERIOD.executeAllOnDecision = function () {
  console.log('execute DE0030010form2/CS_MAST_IF_PERIOD.onDecision');
  expj.DE0030010.DE0030010form2.executeAllOnDecision();
  expj.DE0030010.executeAllOnDecision();
};
expj.DE0030010.DE0030010form2.CS_MAST_IF_PERIOD.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010form2-CS_MAST_IF_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DE0030010', 'DE0030010form2', 'CS_MAST_IF_PERIOD', this);
  });
  expj.DE0030010.DE0030010form2.CS_MAST_IF_PERIOD.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form2.CS_MAST_IF_PERIOD.executePScriptOnLoad = function () {
  console.log('execute DE0030010form2/CS_MAST_IF_PERIOD.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010form2-CS_MAST_IF_PERIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DE0030010-DE0030010form2-CS_MAST_IF_PERIOD" name="CS_MAST_IF_PERIOD" class="DE0030010-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aDE0030010Struct.getCS_MAST_IF_PERIOD()) %>" maxlength="2" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0133",rb)%></span><!-- ヶ月 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0491",rb)%></span><!-- 【削除対象】 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-DE0030010-DE0030010form2-c_DeleteItemCsProcIf">
expj.DE0030010.DE0030010form2.c_DeleteItemCsProcIf = {};
expj.DE0030010.DE0030010form2.c_DeleteItemCsProcIf.executeAllOnDecision = function () {
  console.log('execute DE0030010form2/c_DeleteItemCsProcIf.onDecision');
  expj.DE0030010.DE0030010form2.executeAllOnDecision();
  expj.DE0030010.executeAllOnDecision();
};
expj.DE0030010.DE0030010form2.c_DeleteItemCsProcIf.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010form2-c_DeleteItemCsProcIf').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DE0030010', 'DE0030010form2', 'c_DeleteItemCsProcIf', this, 'CheckBox');
    }
  });
  expj.DE0030010.DE0030010form2.c_DeleteItemCsProcIf.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form2.c_DeleteItemCsProcIf.executePScriptOnLoad = function () {
  console.log('execute DE0030010form2/c_DeleteItemCsProcIf.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010form2-c_DeleteItemCsProcIf');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_DeleteItemCsProcIf" value="true" <%= ("true".equals(TypeConverter.convert(aDE0030010Struct.getc_DeleteItemCsProcIf())) || "1".equals(TypeConverter.convert(aDE0030010Struct.getc_DeleteItemCsProcIf())))?"checked=\"checked\"":"" %>  class="DE0030010-focus-move" id="expj-DE0030010-DE0030010form2-c_DeleteItemCsProcIf"><label for="expj-DE0030010-DE0030010form2-c_DeleteItemCsProcIf"><%=CoreTools.getRBString("Expj.T_ITEM_CS_PROC_IF",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-DE0030010-DE0030010form2-c_DeleteProcCostIf">
expj.DE0030010.DE0030010form2.c_DeleteProcCostIf = {};
expj.DE0030010.DE0030010form2.c_DeleteProcCostIf.executeAllOnDecision = function () {
  console.log('execute DE0030010form2/c_DeleteProcCostIf.onDecision');
  expj.DE0030010.DE0030010form2.executeAllOnDecision();
  expj.DE0030010.executeAllOnDecision();
};
expj.DE0030010.DE0030010form2.c_DeleteProcCostIf.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010form2-c_DeleteProcCostIf').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DE0030010', 'DE0030010form2', 'c_DeleteProcCostIf', this, 'CheckBox');
    }
  });
  expj.DE0030010.DE0030010form2.c_DeleteProcCostIf.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form2.c_DeleteProcCostIf.executePScriptOnLoad = function () {
  console.log('execute DE0030010form2/c_DeleteProcCostIf.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010form2-c_DeleteProcCostIf');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_DeleteProcCostIf" value="true" <%= ("true".equals(TypeConverter.convert(aDE0030010Struct.getc_DeleteProcCostIf())) || "1".equals(TypeConverter.convert(aDE0030010Struct.getc_DeleteProcCostIf())))?"checked=\"checked\"":"" %>  class="DE0030010-focus-move" id="expj-DE0030010-DE0030010form2-c_DeleteProcCostIf"><label for="expj-DE0030010-DE0030010form2-c_DeleteProcCostIf"><%=CoreTools.getRBString("Expj.T_PROC_COST_IF",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-DE0030010-DE0030010form2-c_DeleteCsPuchIf">
expj.DE0030010.DE0030010form2.c_DeleteCsPuchIf = {};
expj.DE0030010.DE0030010form2.c_DeleteCsPuchIf.executeAllOnDecision = function () {
  console.log('execute DE0030010form2/c_DeleteCsPuchIf.onDecision');
  expj.DE0030010.DE0030010form2.executeAllOnDecision();
  expj.DE0030010.executeAllOnDecision();
};
expj.DE0030010.DE0030010form2.c_DeleteCsPuchIf.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010form2-c_DeleteCsPuchIf').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DE0030010', 'DE0030010form2', 'c_DeleteCsPuchIf', this, 'CheckBox');
    }
  });
  expj.DE0030010.DE0030010form2.c_DeleteCsPuchIf.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form2.c_DeleteCsPuchIf.executePScriptOnLoad = function () {
  console.log('execute DE0030010form2/c_DeleteCsPuchIf.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010form2-c_DeleteCsPuchIf');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_DeleteCsPuchIf" value="true" <%= ("true".equals(TypeConverter.convert(aDE0030010Struct.getc_DeleteCsPuchIf())) || "1".equals(TypeConverter.convert(aDE0030010Struct.getc_DeleteCsPuchIf())))?"checked=\"checked\"":"" %>  class="DE0030010-focus-move" id="expj-DE0030010-DE0030010form2-c_DeleteCsPuchIf"><label for="expj-DE0030010-DE0030010form2-c_DeleteCsPuchIf"><%=CoreTools.getRBString("Expj.T_CS_PUCH_IF",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-DE0030010-DE0030010form2-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDE0030010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-DE0030010-DE0030010form2-MODIFY_COUNT">
expj.DE0030010.DE0030010form2.MODIFY_COUNT = {};
expj.DE0030010.DE0030010form2.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute DE0030010form2/MODIFY_COUNT.onDecision');
  expj.DE0030010.DE0030010form2.executeAllOnDecision();
  expj.DE0030010.executeAllOnDecision();
};
expj.DE0030010.DE0030010form2.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010form2-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DE0030010', 'DE0030010form2', 'MODIFY_COUNT', this);
  });
  expj.DE0030010.DE0030010form2.MODIFY_COUNT.executePScriptOnLoad();
};

expj.DE0030010.DE0030010form2.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute DE0030010form2/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010form2-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DE0030010-DE0030010button2">
expj.DE0030010.DE0030010button2 = {};
expj.DE0030010.DE0030010button2.executeAllOnDecision = function () {
  console.log('execute DE0030010button2.onDecision');
};
expj.DE0030010.DE0030010button2.executeOnLoad = function () {
  expj.DE0030010.DE0030010button2.executePScriptOnLoad();
};

expj.DE0030010.DE0030010button2.executePScriptOnLoad = function () {
  console.log('execute DE0030010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DE0030010-DE0030010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DE0030010-DE0030010button2-Execute">
expj.DE0030010.DE0030010button2.Execute = {};
// script1="onClick;0;CHK;_DE0030010form2/c_DeleteItemCsProcIf[neq]true[and]_DE0030010form2/c_DeleteProcCostIf[neq]true[and]_DE0030010form2/c_DeleteCsPuchIf[neq]true@#DE02001"
expj.DE0030010.DE0030010button2.Execute.onClick0 = function () {
  console.log('Execute script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DE0030010', 'DE0030010button2', '_DE0030010form2/c_DeleteItemCsProcIf'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DE0030010', 'DE0030010button2', '_DE0030010form2/c_DeleteProcCostIf'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DE0030010', 'DE0030010button2', '_DE0030010form2/c_DeleteCsPuchIf'), '[neq]', 'true')) {
expj.common.pscript.addErrorMessage('DE0030010', 'DE0030010button2', 'DE02001');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DE0030010form1/*,_DE0030010form2/*@DE0030010Servlet,,$ZZ07010"
expj.DE0030010.DE0030010button2.Execute.onClick1 = function () {
  console.log('Execute script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DE0030010', 'DE0030010button2', '_DE0030010form1/*,_DE0030010form2/*', 'DE0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DE0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DE0030010', response);
expj.common.updateBusinessScreenTab('DE0030010', contents);
};
expj.common.pscript.callConfirm('DE0030010', 'DE0030010button2', 'ZZ07010', okEvent);
};
expj.DE0030010.DE0030010button2.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DE0030010.DE0030010button2.Execute['onClick' + i])) {
        expj.DE0030010.DE0030010button2.Execute['onClick' + i]();
      }
    }
  }
};
expj.DE0030010.DE0030010button2.Execute.executeAllOnDecision = function () {
};
expj.DE0030010.DE0030010button2.Execute.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010button2-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DE0030010', 'DE0030010button2', 'Execute', this, 'Button');
    }
  });
  expj.DE0030010.DE0030010button2.Execute.executePScriptOnLoad();
};

expj.DE0030010.DE0030010button2.Execute.executePScriptOnLoad = function () {
  console.log('execute DE0030010button2/Execute.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010button2-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DE0030010-DE0030010button2-Execute" name="Execute" class="DE0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">DE0030010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-DE0030010-DE0030010button0">
expj.DE0030010.DE0030010button0 = {};
expj.DE0030010.DE0030010button0.executeAllOnDecision = function () {
  console.log('execute DE0030010button0.onDecision');
};
expj.DE0030010.DE0030010button0.executeOnLoad = function () {
  expj.DE0030010.DE0030010button0.executePScriptOnLoad();
};

expj.DE0030010.DE0030010button0.executePScriptOnLoad = function () {
  console.log('execute DE0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DE0030010-DE0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DE0030010-DE0030010button0-Clear">
expj.DE0030010.DE0030010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DE0030010Servlet,,$ZZ07008"
expj.DE0030010.DE0030010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DE0030010', 'DE0030010button0', '', 'DE0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DE0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DE0030010', response);
expj.common.updateBusinessScreenTab('DE0030010', contents);
};
expj.common.pscript.callConfirm('DE0030010', 'DE0030010button0', 'ZZ07008', okEvent);
};
expj.DE0030010.DE0030010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DE0030010.DE0030010button0.Clear['onClick' + i])) {
        expj.DE0030010.DE0030010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DE0030010.DE0030010button0.Clear.executeAllOnDecision = function () {
};
expj.DE0030010.DE0030010button0.Clear.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DE0030010', 'DE0030010button0', 'Clear', this, 'Button');
    }
  });
  expj.DE0030010.DE0030010button0.Clear.executePScriptOnLoad();
};

expj.DE0030010.DE0030010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DE0030010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DE0030010-DE0030010button0-Clear" name="Clear" class="DE0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-DE0030010-DE0030010button0-Close">
expj.DE0030010.DE0030010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DE0030010.DE0030010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DE0030010');
};
expj.DE0030010.DE0030010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DE0030010.DE0030010button0.Close['onClick' + i])) {
        expj.DE0030010.DE0030010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DE0030010.DE0030010button0.Close.executeAllOnDecision = function () {
};
expj.DE0030010.DE0030010button0.Close.executeOnLoad = function () {
  $('#expj-DE0030010-DE0030010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DE0030010', 'DE0030010button0', 'Close', this, 'Button');
    }
  });
  expj.DE0030010.DE0030010button0.Close.executePScriptOnLoad();
};

expj.DE0030010.DE0030010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DE0030010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DE0030010-DE0030010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DE0030010-DE0030010button0-Close" name="Close" class="DE0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DE0030010 (END)-->
<%
MessageStruct msgStruct = aDE0030010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DE0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DE0030010)) {
  expj.common.treeInstanceMap.DE0030010 = {};
}
expj.common.treeInstanceMap.DE0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DE0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DE0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DE0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DE0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DE0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DE0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DE0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DE0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DE0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DE0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DE0030010)) {
  expj.common.detailDialogMap.DE0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DE0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DE0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DE0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.DE0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DE0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DE0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DE0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DE0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DE0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DE0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DE0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DE0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DE0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DE0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DE0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DE0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DE0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DE0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DE0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DE0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DE0030010)) {
  expj.common.viewInstanceMap.DE0030010 = {};
}
expj.common.viewInstanceMap.DE0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.DE0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DE0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DE0030010.<%=viewId %>.init = function () {
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
    expj.DE0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DE0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DE0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DE0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DE0030010_init">
/**
 * DE0030010用のロード完了時初期化関数
 */
expj.DE0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DE0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DE0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DE0030010');
  expj.common.calendarInstanceMap.DE0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DE0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DE0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.DE0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DE0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DE0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DE0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DE0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DE0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DE0030010-<%=detailId %>');
<%
 }
%>
  try{expj.DE0030010.DE0030010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010form2.COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010form2.CS_MAST_IF_PERIOD.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010form2.c_DeleteItemCsProcIf.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010form2.c_DeleteProcCostIf.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010form2.c_DeleteCsPuchIf.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010form2.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010button2.Execute.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010form1.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010button1.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010form2.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010button2.executeOnLoad();}catch(e){};
  try{expj.DE0030010.DE0030010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DE0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DE0030010', 'DE0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DE0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DE0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.DE0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DE0030010', '<%=request.getContextPath() %>');
};

/**
 * DE0030010の全体onDecision処理
 */
expj.DE0030010.executeAllOnDecision = function () {
  expj.DE0030010.DE0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DE0030010_console">
expj.DE0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>