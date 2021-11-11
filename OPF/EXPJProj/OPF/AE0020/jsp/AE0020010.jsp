<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:02:28 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0020\AE0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0020.*" %>
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
<jsp:useBean id="aAE0020010Control" class="com.nec.jp.orteus.metamorBase.AE0020.AE0020010Control" scope="request"/>
<jsp:useBean id="aAE0020010Struct" class="com.nec.jp.orteus.metamorBase.AE0020.AE0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

発注計画（製番品目選択）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0020/jsp/AE0020010.jsp,v $
$Author: geng-jia $
$Revision: 1.19 $ $Date: 2017/02/22 02:05:04 $
********************************************************* --%>
<html>
<head>
<title>発注計画（製番品目選択）</title>
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
<script class="expj-script-AE0020010_init">
  // AE0020010名前空間
  expj.AE0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<% ScreenMoveUtil su = new ScreenMoveUtil("AE0020020Servlet", so); %>

  <div id="expj-business-screen-AE0020010" data-screen="AE0020010" data-newdata="<%=aAE0020010Control.isNewData() %>">
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
              <script class="expj-script-AE0020010-AE0020010form1">
expj.AE0020010.AE0020010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AE0020010.AE0020010form1.onLoad0 = function () {
  console.log('AE0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0020010.AE0020010form1.onDecision0 = function () {
  console.log('AE0020010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0020010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0020010button1/Select"
expj.AE0020010.AE0020010form1.child0 = function () {
  console.log('AE0020010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020010', 'AE0020010form1', '_AE0020010button1/Select');
};
// script4="child;1;MASK;_AE0020010button1/Select"
expj.AE0020010.AE0020010form1.child1 = function () {
  console.log('AE0020010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0020010', 'AE0020010form1', '_AE0020010button1/Select');
};
// script5="onDecision;1;CHK;?AE0020010form1/*[eq]NORMAL@*2,*5"
expj.AE0020010.AE0020010form1.onDecision1 = function () {
  console.log('AE0020010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010form1', '?AE0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;2;CHK;?PLANT_CD[eq]SAME[and]?JOB_ODR_CD[eq]SAME[and]?JOB_ODR_CANCEL_NO[eq]SAME@*3,*5"
expj.AE0020010.AE0020010form1.child2 = function () {
  console.log('AE0020010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010form1', '?JOB_ODR_CANCEL_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHKRQ;?AE0020010tree1/*[eq]SELECTED@*4,*5"
expj.AE0020010.AE0020010form1.child3 = function () {
  console.log('AE0020010form1 script7');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010form1', '?AE0020010tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AE0020010button2/Maintenance"
expj.AE0020010.AE0020010form1.child4 = function () {
  console.log('AE0020010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020010', 'AE0020010form1', '_AE0020010button2/Maintenance');
};
// script9="child;5;MASK;_AE0020010button2/Maintenance"
expj.AE0020010.AE0020010form1.child5 = function () {
  console.log('AE0020010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AE0020010', 'AE0020010form1', '_AE0020010button2/Maintenance');
};
expj.AE0020010.AE0020010form1.executeAllOnDecision = function () {
  console.log('execute AE0020010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020010.AE0020010form1['onDecision' + i])) {
        expj.AE0020010.AE0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0020010.AE0020010form1.executeOnLoad = function () {
  expj.AE0020010.AE0020010form1.executePScriptOnLoad();
};

expj.AE0020010.AE0020010form1.executePScriptOnLoad = function () {
  console.log('execute AE0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0020010.AE0020010form1['onLoad' + i])) {
      expj.AE0020010.AE0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0020010-AE0020010form1" action="AE0020010Servlet" name="AE0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0020010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AE0020010-AE0020010form1-PLANT_CD">
expj.AE0020010.AE0020010form1.PLANT_CD = {};
expj.AE0020010.AE0020010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AE0020010form1/PLANT_CD.onDecision');
  expj.AE0020010.AE0020010form1.executeAllOnDecision();
  expj.AE0020010.executeAllOnDecision();
};
expj.AE0020010.AE0020010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020010', 'AE0020010form1', 'PLANT_CD', this);
  });
  expj.AE0020010.AE0020010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AE0020010.AE0020010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020010-AE0020010form1-PLANT_CD" name="PLANT_CD" class="AE0020010-focus-move  required-value expj-AE0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AE0020010-AE0020010form1-PeekerPlantCd">
expj.AE0020010.AE0020010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AE0020010form1/PLANT_CD@<%=contextNo%>"
expj.AE0020010.AE0020010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0020010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0020010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0020010.AE0020010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020010.AE0020010form1.PeekerPlantCd['onClick' + i])) {
        expj.AE0020010.AE0020010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AE0020010.AE0020010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AE0020010.AE0020010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020010', 'AE0020010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AE0020010.AE0020010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AE0020010.AE0020010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AE0020010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0020010-AE0020010form1-PeekerPlantCd" class="AE0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0020010-AE0020010form1-PLANT_NAME">
expj.AE0020010.AE0020010form1.PLANT_NAME = {};
expj.AE0020010.AE0020010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AE0020010form1/PLANT_NAME.onDecision');
  expj.AE0020010.AE0020010form1.executeAllOnDecision();
  expj.AE0020010.executeAllOnDecision();
};
expj.AE0020010.AE0020010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020010', 'AE0020010form1', 'PLANT_NAME', this);
  });
  expj.AE0020010.AE0020010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AE0020010.AE0020010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0020010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0020010-AE0020010form1-PLANT_NAME" name="PLANT_NAME" class="AE0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AE0020010-AE0020010form1-JOB_ODR_CD">
expj.AE0020010.AE0020010form1.JOB_ODR_CD = {};
expj.AE0020010.AE0020010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0020010form1/JOB_ODR_CD.onDecision');
  expj.AE0020010.AE0020010form1.executeAllOnDecision();
  expj.AE0020010.executeAllOnDecision();
};
expj.AE0020010.AE0020010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020010', 'AE0020010form1', 'JOB_ODR_CD', this);
  });
  expj.AE0020010.AE0020010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0020010.AE0020010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020010-AE0020010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AE0020010-focus-move  required-value expj-AE0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0020010-AE0020010form1-PeekerJobOdrCd">
expj.AE0020010.AE0020010form1.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AE0020010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AE0020010.AE0020010form1.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0020010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010form1', '_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0020010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0020010.AE0020010form1.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020010.AE0020010form1.PeekerJobOdrCd['onClick' + i])) {
        expj.AE0020010.AE0020010form1.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AE0020010.AE0020010form1.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AE0020010.AE0020010form1.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010form1-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020010', 'AE0020010form1', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AE0020010.AE0020010form1.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AE0020010.AE0020010form1.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AE0020010form1/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010form1-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0020010-AE0020010form1-PeekerJobOdrCd" class="AE0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AE0020010-AE0020010form1-JOB_ODR_CANCEL_NO">
expj.AE0020010.AE0020010form1.JOB_ODR_CANCEL_NO = {};
expj.AE0020010.AE0020010form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AE0020010form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AE0020010.AE0020010form1.executeAllOnDecision();
  expj.AE0020010.executeAllOnDecision();
};
expj.AE0020010.AE0020010form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020010', 'AE0020010form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AE0020010.AE0020010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AE0020010.AE0020010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AE0020010form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020010-AE0020010form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AE0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAE0020010Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0018",rb)%></span><!-- 初期展開レベル --></div><!--/td-->
<script class="expj-script-AE0020010-AE0020010form1-InitLevel">
expj.AE0020010.AE0020010form1.InitLevel = {};
expj.AE0020010.AE0020010form1.InitLevel.executeAllOnDecision = function () {
  console.log('execute AE0020010form1/InitLevel.onDecision');
  expj.AE0020010.AE0020010form1.executeAllOnDecision();
  expj.AE0020010.executeAllOnDecision();
};
expj.AE0020010.AE0020010form1.InitLevel.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010form1-InitLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020010', 'AE0020010form1', 'InitLevel', this);
  });
  expj.AE0020010.AE0020010form1.InitLevel.executePScriptOnLoad();
};

expj.AE0020010.AE0020010form1.InitLevel.executePScriptOnLoad = function () {
  console.log('execute AE0020010form1/InitLevel.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010form1-InitLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020010-AE0020010form1-InitLevel" name="InitLevel" class="AE0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;8" value="<%= TypeConverter.sanitizer(aAE0020010Struct.getInitLevel()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0020010-AE0020010button1">
expj.AE0020010.AE0020010button1 = {};
expj.AE0020010.AE0020010button1.executeAllOnDecision = function () {
  console.log('execute AE0020010button1.onDecision');
};
expj.AE0020010.AE0020010button1.executeOnLoad = function () {
  expj.AE0020010.AE0020010button1.executePScriptOnLoad();
};

expj.AE0020010.AE0020010button1.executePScriptOnLoad = function () {
  console.log('execute AE0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0020010-AE0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0020010-AE0020010button1-Select">
expj.AE0020010.AE0020010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0020010form1/*@AE0020010Servlet"
expj.AE0020010.AE0020010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020010', 'AE0020010button1', '_AE0020010form1/*', 'AE0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020010', response);
expj.common.updateBusinessScreenTab('AE0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0020010.AE0020010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020010.AE0020010button1.Select['onClick' + i])) {
        expj.AE0020010.AE0020010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0020010.AE0020010button1.Select.executeAllOnDecision = function () {
};
expj.AE0020010.AE0020010button1.Select.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020010', 'AE0020010button1', 'Select', this, 'Button');
    }
  });
  expj.AE0020010.AE0020010button1.Select.executePScriptOnLoad();
};

expj.AE0020010.AE0020010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0020010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020010-AE0020010button1-Select" name="Select" class="AE0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0020010-AE0020010tree1">
expj.AE0020010.AE0020010tree1 = {};
// script1="onClick;0;FSHOW;AE0020010float1@138"
expj.AE0020010.AE0020010tree1.onClick0 = function () {
  console.log('AE0020010tree1 script1');
expj.common.pscript.showDetailWindow('AE0020010', 'AE0020010float1', '138');
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ShowDetail=ACT,SUBMIT_BUTTON_TYPE=0,_AE0020010form1/*,_AE0020010tree1/+@AE0020010Servlet"
expj.AE0020010.AE0020010tree1.onClick1 = function () {
  console.log('AE0020010tree1 script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020010', 'AE0020010tree1', 'ShowDetail=ACT,SUBMIT_BUTTON_TYPE=0,_AE0020010form1/*,_AE0020010tree1/+', 'AE0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020010', response);
expj.common.updateBusinessScreenTab('AE0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script3="onDmyOpen;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,AddTree=ACT,_AE0020010tree1/+@AE0020010Servlet"
expj.AE0020010.AE0020010tree1.onDmyOpen0 = function () {
  console.log('AE0020010tree1 script3');
var params = expj.common.pscript.createParameter('AE0020010', 'AE0020010tree1', 'AddTree=ACT,_AE0020010tree1/+', 'AE0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
return params;
};
expj.AE0020010.AE0020010tree1.setContextAll = function () {
  var controlData = [
  ];
  var contextData = [
  ];
  var beforeFunc = function (event, ui) {
    expj.common.changeStateTreeContext(expj.common.treeInstanceMap.AE0020010.AE0020010tree1.gPrevSelectedNode, ui);
  };
  expj.common.createTreeContextInstance('#expj-AE0020010-AE0020010tree1-wrapper', '#expj-AE0020010-AE0020010tree1', contextData, controlData, beforeFunc);
};
expj.AE0020010.AE0020010tree1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020010.AE0020010tree1['onClick' + i])) {
        expj.AE0020010.AE0020010tree1['onClick' + i]();
      }
    }
  }
};
expj.AE0020010.AE0020010tree1.executeAllOnDecision = function () {
  console.log('execute AE0020010tree1.onDecision');
};
expj.AE0020010.AE0020010tree1.executeOnLoad = function () {
<%
    treeClickEvent.put("AE0020010tree1", "expj.AE0020010.AE0020010tree1.executeAllOnClick");
%>
  expj.AE0020010.AE0020010tree1.setContextAll();
  expj.AE0020010.AE0020010tree1.executePScriptOnLoad();
};

expj.AE0020010.AE0020010tree1.executePScriptOnLoad = function () {
  console.log('execute AE0020010tree1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
if(aAE0020010Control.isNewData() == true){
%>
<div id="expj-AE0020010-AE0020010tree1-wrapper" class="expj-datagrid-tree" style="width:100%; height:100%; overflow:auto;background-color:#FFFFFF;">
<div id="expj-AE0020010-AE0020010tree1" data-orftype="Tree" data-mode="TREE" class="hasmenu" style="background-color:#FFFFFF;">
</div><!--Tree-->
</div>
<%
 treeId = "AE0020010tree1";
 treeXmlData = aAE0020010Control.getFlashTreeXML();
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0020010-AE0020010button2">
expj.AE0020010.AE0020010button2 = {};
expj.AE0020010.AE0020010button2.executeAllOnDecision = function () {
  console.log('execute AE0020010button2.onDecision');
};
expj.AE0020010.AE0020010button2.executeOnLoad = function () {
  expj.AE0020010.AE0020010button2.executePScriptOnLoad();
};

expj.AE0020010.AE0020010button2.executePScriptOnLoad = function () {
  console.log('execute AE0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0020010-AE0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0020010-AE0020010button2-Maintenance">
expj.AE0020010.AE0020010button2.Maintenance = {};
// script1="onClick;0;CHK;_AE0020010tree1/MRP_TYP[eq]3@#AE01008"
expj.AE0020010.AE0020010button2.Maintenance.onClick0 = function () {
  console.log('Maintenance script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010button2', '_AE0020010tree1/MRP_TYP'), '[eq]', '3')) {
expj.common.pscript.addErrorMessage('AE0020010', 'AE0020010button2', 'AE01008');
}
};
// script2="onClick;1;CHK;_AE0020010tree1/MRP_ODR_TYP[eq]8@#AE01004"
expj.AE0020010.AE0020010button2.Maintenance.onClick1 = function () {
  console.log('Maintenance script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010button2', '_AE0020010tree1/MRP_ODR_TYP'), '[eq]', '8')) {
expj.common.pscript.addErrorMessage('AE0020010', 'AE0020010button2', 'AE01004');
}
};
// script3="onClick;2;CHK;_AE0020010tree1/ODR_STS_TYP[eq]0@#AE01002"
expj.AE0020010.AE0020010button2.Maintenance.onClick2 = function () {
  console.log('Maintenance script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010button2', '_AE0020010tree1/ODR_STS_TYP'), '[eq]', '0')) {
expj.common.pscript.addErrorMessage('AE0020010', 'AE0020010button2', 'AE01002');
}
};
// script4="onClick;3;CHK;_AE0020010tree1/ODR_STS_TYP[eq]1@#AE01003"
expj.AE0020010.AE0020010button2.Maintenance.onClick3 = function () {
  console.log('Maintenance script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010button2', '_AE0020010tree1/ODR_STS_TYP'), '[eq]', '1')) {
expj.common.pscript.addErrorMessage('AE0020010', 'AE0020010button2', 'AE01003');
}
};
// script5="onClick;4;CHK;_AE0020010tree1/MANHOUR_TYP[eq]1@#AE00171"
expj.AE0020010.AE0020010button2.Maintenance.onClick4 = function () {
  console.log('Maintenance script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020010', 'AE0020010button2', '_AE0020010tree1/MANHOUR_TYP'), '[eq]', '1')) {
expj.common.pscript.addErrorMessage('AE0020010', 'AE0020010button2', 'AE00171');
}
};
// script6="onClick;5;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AE0020010tree1/+@AE0020020Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AE0020010.AE0020010button2.Maintenance.onClick5 = function () {
  console.log('Maintenance script6');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020010', 'AE0020010button2', '_AE0020010tree1/+', 'AE0020020Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AE0020020Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AE0020020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AE0020010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0020010.AE0020010button2.Maintenance.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020010.AE0020010button2.Maintenance['onClick' + i])) {
        expj.AE0020010.AE0020010button2.Maintenance['onClick' + i]();
      }
    }
  }
};
expj.AE0020010.AE0020010button2.Maintenance.executeAllOnDecision = function () {
};
expj.AE0020010.AE0020010button2.Maintenance.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010button2-Maintenance').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020010', 'AE0020010button2', 'Maintenance', this, 'Button');
    }
  });
  expj.AE0020010.AE0020010button2.Maintenance.executePScriptOnLoad();
};

expj.AE0020010.AE0020010button2.Maintenance.executePScriptOnLoad = function () {
  console.log('execute AE0020010button2/Maintenance.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010button2-Maintenance');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020010-AE0020010button2-Maintenance" name="Maintenance" class="AE0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnMaintenance",rb)%></button><!-- メンテナンスボタン --></div><!--/td-->
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
<span class="version">AE0020010 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AE0020010-AE0020010button0">
expj.AE0020010.AE0020010button0 = {};
expj.AE0020010.AE0020010button0.executeAllOnDecision = function () {
  console.log('execute AE0020010button0.onDecision');
};
expj.AE0020010.AE0020010button0.executeOnLoad = function () {
  expj.AE0020010.AE0020010button0.executePScriptOnLoad();
};

expj.AE0020010.AE0020010button0.executePScriptOnLoad = function () {
  console.log('execute AE0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0020010-AE0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0020010-AE0020010button0-Clear">
expj.AE0020010.AE0020010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0020010Servlet,,$ZZ07008"
expj.AE0020010.AE0020010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020010', 'AE0020010button0', '', 'AE0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020010', response);
expj.common.updateBusinessScreenTab('AE0020010', contents);
};
expj.common.pscript.callConfirm('AE0020010', 'AE0020010button0', 'ZZ07008', okEvent);
};
expj.AE0020010.AE0020010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020010.AE0020010button0.Clear['onClick' + i])) {
        expj.AE0020010.AE0020010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0020010.AE0020010button0.Clear.executeAllOnDecision = function () {
};
expj.AE0020010.AE0020010button0.Clear.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020010', 'AE0020010button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0020010.AE0020010button0.Clear.executePScriptOnLoad();
};

expj.AE0020010.AE0020010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0020010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020010-AE0020010button0-Clear" name="Clear" class="AE0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0020010-AE0020010button0-Close">
expj.AE0020010.AE0020010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0020010.AE0020010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0020010');
};
expj.AE0020010.AE0020010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020010.AE0020010button0.Close['onClick' + i])) {
        expj.AE0020010.AE0020010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0020010.AE0020010button0.Close.executeAllOnDecision = function () {
};
expj.AE0020010.AE0020010button0.Close.executeOnLoad = function () {
  $('#expj-AE0020010-AE0020010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020010', 'AE0020010button0', 'Close', this, 'Button');
    }
  });
  expj.AE0020010.AE0020010button0.Close.executePScriptOnLoad();
};

expj.AE0020010.AE0020010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0020010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0020010-AE0020010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020010-AE0020010button0-Close" name="Close" class="AE0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0020010 (END)-->
<script class="expj-script-AE0020010-AE0020010detailview1">
expj.AE0020010.AE0020010detailview1 = {};
expj.AE0020010.AE0020010detailview1.executeAllOnDecision = function () {
  console.log('execute AE0020010detailview1.onDecision');
};
expj.AE0020010.AE0020010detailview1.executeOnLoad = function () {
  expj.AE0020010.AE0020010detailview1.executePScriptOnLoad();
};

expj.AE0020010.AE0020010detailview1.executePScriptOnLoad = function () {
  console.log('execute AE0020010detailview1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAE0020010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AE0020010-AE0020010detailview1" class="expj-datagird-detail" data-float="AE0020010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AE0020010detailview1";
 detailFloat = "AE0020010float1";
 detailWidth = 358;
 detailHeight = 345 + 47;
 String AE0020010detailview1_Id = "AE0020010detailview1";
 String AE0020010detailview1_select = "single";
 String AE0020010detailview1_sortable = "true";
 String AE0020010detailview1_resize = "true";
 String AE0020010detailview1_scroll = "true";
 StringBuffer AE0020010detailview1_HB = new StringBuffer();
 StringBuffer AE0020010detailview1_DB = new StringBuffer();
%>
<%
 AE0020010detailview1_sortable = "false";
 AE0020010detailview1_select = "none";
%>
<% AE0020010detailview1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AE0020010detailview1_sortable).append("}").append(","); %>
<%  AE0020010detailview1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AE0020010detailview1_sortable).append("}").append(",");
AE0020010detailview1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AE0020010detailview1_sortable).append("}").append(",");
AE0020010detailview1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AE0020010detailview1_sortable).append("}").append(",");
 %>
  <% AE0020010detailview1_DB.append("['1','").append(CoreTools.getRBString("Expj.JOB_ODR_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-JOB_ODR_TYP_DN\" class=\"expj-label\" data-name=\"JOB_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getJOB_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['2','").append(CoreTools.getRBString("Expj.ALC_GRP_CD",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-ALC_GRP_CD\" class=\"expj-label\" data-name=\"ALC_GRP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getALC_GRP_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['3','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['4','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['5','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-OUTSIDE_TYP_DN\" class=\"expj-label\" data-name=\"OUTSIDE_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getOUTSIDE_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['6','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-MRP_ODR_TYP_DN\" class=\"expj-label\" data-name=\"MRP_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getMRP_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['7','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-ITEM_SPOIL\" class=\"expj-label\" data-name=\"ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;9.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['8','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-UNIT_QTY_TYP_DN\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getUNIT_QTY_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['9','").append(CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-JOB_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"JOB_ODR_DLV_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getJOB_ODR_DLV_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['10','").append(CoreTools.getRBString("Expj.DUE_DATE",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-DUE_DATE\" class=\"expj-label\" data-name=\"DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getDUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['11','").append(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-PRD_DUE_DATE\" class=\"expj-label\" data-name=\"PRD_DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getPRD_DUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['12','").append(CoreTools.getRBString("Expj.PRD_START_DATE",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-PRD_START_DATE\" class=\"expj-label\" data-name=\"PRD_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getPRD_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['13','").append(CoreTools.getRBString("Expj.ODR_START_DATE",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-ODR_START_DATE\" class=\"expj-label\" data-name=\"ODR_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getODR_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['14','").append(CoreTools.getRBString("Expj.PUCH_ODR_QTY_2",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-SUM_PUCH_ODR_QTY\" class=\"expj-label\" data-name=\"SUM_PUCH_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSUM_PUCH_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0020010-AE0020010detailview1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['15','").append(CoreTools.getRBString("Expj.OPR_INST_QTY_1",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-SUM_OPR_INST_QTY\" class=\"expj-label\" data-name=\"SUM_OPR_INST_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSUM_OPR_INST_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0020010-AE0020010detailview1-d1_STOCK_UNIT\" class=\"expj-label\" data-name=\"d1_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['16','").append(CoreTools.getRBString("Expj.ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-ODR_QTY\" class=\"expj-label\" data-name=\"ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0020010-AE0020010detailview1-d2_STOCK_UNIT\" class=\"expj-label\" data-name=\"d2_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['17','").append(CoreTools.getRBString("Expj.DM_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-DM_QTY\" class=\"expj-label\" data-name=\"DM_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getDM_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0020010-AE0020010detailview1-d3_STOCK_UNIT\" class=\"expj-label\" data-name=\"d3_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['18','").append(CoreTools.getRBString("Expj.ALCD_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020010-AE0020010detailview1-SUM_ALCD_QTY\" class=\"expj-label\" data-name=\"SUM_ALCD_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSUM_ALCD_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0020010-AE0020010detailview1-d4_STOCK_UNIT\" class=\"expj-label\" data-name=\"d4_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['19','").append(CoreTools.getRBString("Expj.ODR_STS_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-ODR_STS_TYP_DN\" class=\"expj-label\" data-name=\"ODR_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getODR_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020010detailview1_DB.append("['20','").append(CoreTools.getRBString("Expj.DM_STS_TYP",rb)).append("','").append("<span id=\"expj-AE0020010-AE0020010detailview1-DM_STS_TYP_DN\" class=\"expj-label\" data-name=\"DM_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020010Struct.getDM_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AE0020010detailview1_Id;
 detailViewSelect = AE0020010detailview1_select;
 detailViewResize = AE0020010detailview1_resize;
 detailViewScroll = AE0020010detailview1_scroll;
 detailViewHeaderData = AE0020010detailview1_HB;
 detailViewBodyData = AE0020010detailview1_DB;
%>
<%
}
%>
<% MessageStruct msgStruct = aAE0020010Control.getMsgStruct(); %><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0020010)) {
  expj.common.treeInstanceMap.AE0020010 = {};
}
expj.common.treeInstanceMap.AE0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = expj.AE0020010.AE0020010tree1.onDmyOpen0;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020010)) {
  expj.common.detailDialogMap.AE0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0020010)) {
  expj.common.viewInstanceMap.AE0020010 = {};
}
expj.common.viewInstanceMap.AE0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0020010.<%=viewId %>.init = function () {
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
    expj.AE0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0020010_init">
/**
 * AE0020010用のロード完了時初期化関数
 */
expj.AE0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0020010');
  expj.common.calendarInstanceMap.AE0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0020010.AE0020010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010form1.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010form1.InitLevel.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010button2.Maintenance.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010form1.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010button1.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010tree1.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010button2.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010button0.executeOnLoad();}catch(e){};
  try{expj.AE0020010.AE0020010detailview1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0020010', 'AE0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0020010', '<%=request.getContextPath() %>');
};

/**
 * AE0020010の全体onDecision処理
 */
expj.AE0020010.executeAllOnDecision = function () {
  expj.AE0020010.AE0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0020010_console">
expj.AE0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>