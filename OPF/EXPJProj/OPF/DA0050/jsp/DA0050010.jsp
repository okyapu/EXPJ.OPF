<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:49:56 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DA0050\DA0050010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DA0050.*" %>
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
<jsp:useBean id="aDA0050010Control" class="com.nec.jp.orteus.metamorBase.DA0050.DA0050010Control" scope="request"/>
<jsp:useBean id="aDA0050010Struct" class="com.nec.jp.orteus.metamorBase.DA0050.DA0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

加工費分類マスタメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0050/jsp/DA0050010.jsp,v $
$Author: geng-jia $
$Revision: 1.6 $ $Date: 2017/02/22 02:06:40 $
********************************************************* --%>
<html>
<head>
<title>加工費分類マスタメンテナンス</title>
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
<script class="expj-script-DA0050010_init">
  // DA0050010名前空間
  expj.DA0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DA0050010" data-screen="DA0050010" data-newdata="<%=aDA0050010Control.isNewData() %>">
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
            <script class="expj-script-DA0050010-DA0050010form1">
expj.DA0050010.DA0050010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.DA0050010.DA0050010form1.onLoad0 = function () {
  console.log('DA0050010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DA0050010.DA0050010form1.onDecision0 = function () {
  console.log('DA0050010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DA0050010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DA0050010button1/Select"
expj.DA0050010.DA0050010form1.child0 = function () {
  console.log('DA0050010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DA0050010', 'DA0050010form1', '_DA0050010button1/Select');
};
// script4="child;1;MASK;_DA0050010button1/Select"
expj.DA0050010.DA0050010form1.child1 = function () {
  console.log('DA0050010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DA0050010', 'DA0050010form1', '_DA0050010button1/Select');
};
// script5="onDecision;1;CHKRQ;A,B@*2,*4"
expj.DA0050010.DA0050010form1.onDecision1 = function () {
  console.log('DA0050010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('DA0050010', 'A') && expj.common.pscript.satisfiedRequiredComponent('DA0050010', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;_PLANT_CD[neq]_h_PLANT_CD[or]_PROC_COST_CLS_CD[neq]_h_PROC_COST_CLS_CD@*3,*4"
expj.DA0050010.DA0050010form1.child2 = function () {
  console.log('DA0050010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_PLANT_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_h_PLANT_CD')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_PROC_COST_CLS_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_h_PROC_COST_CLS_CD'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_DA0050010button2/Insert"
expj.DA0050010.DA0050010form1.child3 = function () {
  console.log('DA0050010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('DA0050010', 'DA0050010form1', '_DA0050010button2/Insert');
};
// script8="child;4;MASK;_DA0050010button2/Insert"
expj.DA0050010.DA0050010form1.child4 = function () {
  console.log('DA0050010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('DA0050010', 'DA0050010form1', '_DA0050010button2/Insert');
};
// script9="onDecision;2;CHK;?DA0050010form1/*[eq]NORMAL@*5,*8"
expj.DA0050010.DA0050010form1.onDecision2 = function () {
  console.log('DA0050010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '?DA0050010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;5;CHKRQ;A,B@*6,*8"
expj.DA0050010.DA0050010form1.child5 = function () {
  console.log('DA0050010form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('DA0050010', 'A') && expj.common.pscript.satisfiedRequiredComponent('DA0050010', 'B')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;6;CHK;_PLANT_CD[eq]_h_PLANT_CD[and]_PROC_COST_CLS_CD[eq]_h_PROC_COST_CLS_CD@*7,*8"
expj.DA0050010.DA0050010form1.child6 = function () {
  console.log('DA0050010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_PLANT_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_h_PLANT_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_PROC_COST_CLS_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_h_PROC_COST_CLS_CD'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_DA0050010button2/Update,_DA0050010button2/Delete"
expj.DA0050010.DA0050010form1.child7 = function () {
  console.log('DA0050010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('DA0050010', 'DA0050010form1', '_DA0050010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('DA0050010', 'DA0050010form1', '_DA0050010button2/Delete');
};
// script13="child;8;MASK;_DA0050010button2/Update,_DA0050010button2/Delete"
expj.DA0050010.DA0050010form1.child8 = function () {
  console.log('DA0050010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('DA0050010', 'DA0050010form1', '_DA0050010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('DA0050010', 'DA0050010form1', '_DA0050010button2/Delete');
};
expj.DA0050010.DA0050010form1.executeAllOnDecision = function () {
  console.log('execute DA0050010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0050010.DA0050010form1['onDecision' + i])) {
        expj.DA0050010.DA0050010form1['onDecision' + i]();
      }
    }
  }
};
expj.DA0050010.DA0050010form1.executeOnLoad = function () {
  expj.DA0050010.DA0050010form1.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form1.executePScriptOnLoad = function () {
  console.log('execute DA0050010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DA0050010.DA0050010form1['onLoad' + i])) {
      expj.DA0050010.DA0050010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0050010-DA0050010form1" action="DA0050010Servlet" name="DA0050010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDA0050010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<script class="expj-script-DA0050010-DA0050010form1-PLANT_CD">
expj.DA0050010.DA0050010form1.PLANT_CD = {};
expj.DA0050010.DA0050010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DA0050010form1/PLANT_CD.onDecision');
  expj.DA0050010.DA0050010form1.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form1', 'PLANT_CD', this);
  });
  expj.DA0050010.DA0050010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DA0050010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form1-PLANT_CD" name="PLANT_CD" class="DA0050010-focus-move  required-value expj-DA0050010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<input type="hidden" id="expj-DA0050010-DA0050010form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0050010Struct.geth_PLANT_CD()) %>">
<script class="expj-script-DA0050010-DA0050010form1-h_PLANT_CD">
expj.DA0050010.DA0050010form1.h_PLANT_CD = {};
expj.DA0050010.DA0050010form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DA0050010form1/h_PLANT_CD.onDecision');
  expj.DA0050010.DA0050010form1.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form1', 'h_PLANT_CD', this);
  });
  expj.DA0050010.DA0050010form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DA0050010form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form1-h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-DA0050010-DA0050010form1-PeekerPlantCd">
expj.DA0050010.DA0050010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DA0050010form1/PLANT_CD:_DA0050010form1/PLANT_NAME@<%=contextNo%>"
expj.DA0050010.DA0050010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0050010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0050010form1/PLANT_CD:_DA0050010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0050010.DA0050010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0050010.DA0050010form1.PeekerPlantCd['onClick' + i])) {
        expj.DA0050010.DA0050010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DA0050010.DA0050010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DA0050010.DA0050010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0050010', 'DA0050010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DA0050010.DA0050010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DA0050010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0050010-DA0050010form1-PeekerPlantCd" class="DA0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form1-PLANT_NAME">
expj.DA0050010.DA0050010form1.PLANT_NAME = {};
expj.DA0050010.DA0050010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form1/PLANT_NAME.onDecision');
  expj.DA0050010.DA0050010form1.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form1', 'PLANT_NAME', this);
  });
  expj.DA0050010.DA0050010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form1-PLANT_NAME" name="PLANT_NAME" class="DA0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROC_COST_CLS_CD",rb)%></span><!-- 加工費分類コード --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form1-PROC_COST_CLS_CD">
expj.DA0050010.DA0050010form1.PROC_COST_CLS_CD = {};
expj.DA0050010.DA0050010form1.PROC_COST_CLS_CD.executeAllOnDecision = function () {
  console.log('execute DA0050010form1/PROC_COST_CLS_CD.onDecision');
  expj.DA0050010.DA0050010form1.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form1.PROC_COST_CLS_CD.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form1-PROC_COST_CLS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form1', 'PROC_COST_CLS_CD', this);
  });
  expj.DA0050010.DA0050010form1.PROC_COST_CLS_CD.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form1.PROC_COST_CLS_CD.executePScriptOnLoad = function () {
  console.log('execute DA0050010form1/PROC_COST_CLS_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form1-PROC_COST_CLS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form1-PROC_COST_CLS_CD" name="PROC_COST_CLS_CD" class="DA0050010-focus-move  required-value expj-DA0050010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_CLS_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-DA0050010-DA0050010form1-h_PROC_COST_CLS_CD" name="h_PROC_COST_CLS_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0050010Struct.geth_PROC_COST_CLS_CD()) %>">
<script class="expj-script-DA0050010-DA0050010form1-h_PROC_COST_CLS_CD">
expj.DA0050010.DA0050010form1.h_PROC_COST_CLS_CD = {};
expj.DA0050010.DA0050010form1.h_PROC_COST_CLS_CD.executeAllOnDecision = function () {
  console.log('execute DA0050010form1/h_PROC_COST_CLS_CD.onDecision');
  expj.DA0050010.DA0050010form1.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form1.h_PROC_COST_CLS_CD.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form1-h_PROC_COST_CLS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form1', 'h_PROC_COST_CLS_CD', this);
  });
  expj.DA0050010.DA0050010form1.h_PROC_COST_CLS_CD.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form1.h_PROC_COST_CLS_CD.executePScriptOnLoad = function () {
  console.log('execute DA0050010form1/h_PROC_COST_CLS_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form1-h_PROC_COST_CLS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-DA0050010-DA0050010form1-PeekerProcCostClsCd">
expj.DA0050010.DA0050010form1.PeekerProcCostClsCd = {};
// script1="onClick;0;PEEKER;_DA0050010form1/PROC_COST_CLS_CD@<%=contextNo%>"
expj.DA0050010.DA0050010form1.PeekerProcCostClsCd.onClick0 = function () {
  console.log('PeekerProcCostClsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0050010';
var parameterValues = 'PeekerProcCostClsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0050010', 'DA0050010form1', '_PROC_COST_CLS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROC_COST_CLS_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0050010form1/PROC_COST_CLS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0050010.DA0050010form1.PeekerProcCostClsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0050010.DA0050010form1.PeekerProcCostClsCd['onClick' + i])) {
        expj.DA0050010.DA0050010form1.PeekerProcCostClsCd['onClick' + i]();
      }
    }
  }
};
expj.DA0050010.DA0050010form1.PeekerProcCostClsCd.executeAllOnDecision = function () {
};
expj.DA0050010.DA0050010form1.PeekerProcCostClsCd.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form1-PeekerProcCostClsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0050010', 'DA0050010form1', 'PeekerProcCostClsCd', this, 'Button');
    }
  });
  expj.DA0050010.DA0050010form1.PeekerProcCostClsCd.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form1.PeekerProcCostClsCd.executePScriptOnLoad = function () {
  console.log('execute DA0050010form1/PeekerProcCostClsCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form1-PeekerProcCostClsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0050010-DA0050010form1-PeekerProcCostClsCd" class="DA0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DA0050010-DA0050010button1">
expj.DA0050010.DA0050010button1 = {};
expj.DA0050010.DA0050010button1.executeAllOnDecision = function () {
  console.log('execute DA0050010button1.onDecision');
};
expj.DA0050010.DA0050010button1.executeOnLoad = function () {
  expj.DA0050010.DA0050010button1.executePScriptOnLoad();
};

expj.DA0050010.DA0050010button1.executePScriptOnLoad = function () {
  console.log('execute DA0050010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0050010-DA0050010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0050010-DA0050010button1-Select">
expj.DA0050010.DA0050010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0050010form1/*@DA0050010Servlet"
expj.DA0050010.DA0050010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0050010', 'DA0050010button1', '_DA0050010form1/*', 'DA0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0050010', response);
expj.common.updateBusinessScreenTab('DA0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0050010.DA0050010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0050010.DA0050010button1.Select['onClick' + i])) {
        expj.DA0050010.DA0050010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DA0050010.DA0050010button1.Select.executeAllOnDecision = function () {
};
expj.DA0050010.DA0050010button1.Select.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0050010', 'DA0050010button1', 'Select', this, 'Button');
    }
  });
  expj.DA0050010.DA0050010button1.Select.executePScriptOnLoad();
};

expj.DA0050010.DA0050010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DA0050010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0050010-DA0050010button1-Select" name="Select" class="DA0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-DA0050010-DA0050010form2">
expj.DA0050010.DA0050010form2 = {};
expj.DA0050010.DA0050010form2.executeAllOnDecision = function () {
  console.log('execute DA0050010form2.onDecision');
};
expj.DA0050010.DA0050010form2.executeOnLoad = function () {
  expj.DA0050010.DA0050010form2.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0050010-DA0050010form2" action="DA0050010Servlet" name="DA0050010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROC_COST_CLS_NAME",rb)%></span><!-- 加工費分類名 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_CLS_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_CLS_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_CLS_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_CLS_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_CLS_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_CLS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_CLS_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_CLS_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_CLS_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_CLS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_CLS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_CLS_NAME" name="PROC_COST_CLS_NAME" class="DA0050010-focus-move  required-value expj-DA0050010-required-B" style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_CLS_NAME()) %>" maxlength="40" ></div><!--/td-->
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
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0483",rb)%></span><!-- 【加工費名称】 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0484",rb)%></span><!-- 【加工費略称】 --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROC_COST_01",rb)%></span><!-- 加工費01 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_01_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_01_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_01_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_01_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_01_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_01_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_01_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_01_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_01_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_01_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_01_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_01_NAME" name="PROC_COST_01_NAME" class="DA0050010-focus-move  required-value expj-DA0050010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_01_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_01_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_01_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_01_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_01_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_01_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_01_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_01_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_01_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_01_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_01_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_01_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_01_ANAME" name="PROC_COST_01_ANAME" class="DA0050010-focus-move  required-value expj-DA0050010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_01_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_02",rb)%></span><!-- 加工費02 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_02_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_02_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_02_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_02_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_02_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_02_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_02_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_02_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_02_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_02_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_02_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_02_NAME" name="PROC_COST_02_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_02_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_02_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_02_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_02_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_02_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_02_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_02_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_02_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_02_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_02_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_02_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_02_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_02_ANAME" name="PROC_COST_02_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_02_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_03",rb)%></span><!-- 加工費03 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_03_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_03_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_03_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_03_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_03_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_03_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_03_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_03_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_03_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_03_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_03_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_03_NAME" name="PROC_COST_03_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_03_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_03_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_03_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_03_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_03_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_03_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_03_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_03_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_03_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_03_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_03_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_03_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_03_ANAME" name="PROC_COST_03_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_03_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_04",rb)%></span><!-- 加工費04 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_04_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_04_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_04_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_04_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_04_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_04_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_04_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_04_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_04_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_04_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_04_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_04_NAME" name="PROC_COST_04_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_04_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_04_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_04_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_04_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_04_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_04_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_04_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_04_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_04_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_04_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_04_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_04_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_04_ANAME" name="PROC_COST_04_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_04_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_05",rb)%></span><!-- 加工費05 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_05_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_05_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_05_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_05_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_05_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_05_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_05_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_05_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_05_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_05_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_05_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_05_NAME" name="PROC_COST_05_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_05_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_05_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_05_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_05_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_05_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_05_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_05_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_05_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_05_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_05_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_05_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_05_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_05_ANAME" name="PROC_COST_05_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_05_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_06",rb)%></span><!-- 加工費06 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_06_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_06_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_06_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_06_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_06_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_06_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_06_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_06_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_06_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_06_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_06_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_06_NAME" name="PROC_COST_06_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_06_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_06_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_06_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_06_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_06_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_06_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_06_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_06_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_06_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_06_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_06_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_06_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_06_ANAME" name="PROC_COST_06_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_06_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_07",rb)%></span><!-- 加工費07 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_07_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_07_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_07_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_07_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_07_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_07_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_07_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_07_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_07_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_07_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_07_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_07_NAME" name="PROC_COST_07_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_07_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_07_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_07_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_07_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_07_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_07_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_07_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_07_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_07_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_07_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_07_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_07_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_07_ANAME" name="PROC_COST_07_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_07_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_08",rb)%></span><!-- 加工費08 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_08_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_08_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_08_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_08_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_08_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_08_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_08_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_08_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_08_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_08_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_08_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_08_NAME" name="PROC_COST_08_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_08_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_08_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_08_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_08_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_08_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_08_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_08_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_08_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_08_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_08_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_08_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_08_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_08_ANAME" name="PROC_COST_08_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_08_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_09",rb)%></span><!-- 加工費09 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_09_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_09_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_09_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_09_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_09_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_09_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_09_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_09_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_09_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_09_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_09_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_09_NAME" name="PROC_COST_09_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_09_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_09_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_09_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_09_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_09_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_09_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_09_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_09_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_09_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_09_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_09_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_09_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_09_ANAME" name="PROC_COST_09_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_09_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_10",rb)%></span><!-- 加工費10 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_10_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_10_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_10_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_10_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_10_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_10_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_10_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_10_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_10_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_10_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_10_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_10_NAME" name="PROC_COST_10_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_10_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_10_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_10_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_10_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_10_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_10_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_10_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_10_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_10_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_10_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_10_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_10_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_10_ANAME" name="PROC_COST_10_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_10_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_11",rb)%></span><!-- 加工費11 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_11_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_11_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_11_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_11_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_11_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_11_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_11_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_11_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_11_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_11_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_11_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_11_NAME" name="PROC_COST_11_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_11_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_11_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_11_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_11_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_11_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_11_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_11_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_11_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_11_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_11_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_11_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_11_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_11_ANAME" name="PROC_COST_11_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_11_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_12",rb)%></span><!-- 加工費12 --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_12_NAME">
expj.DA0050010.DA0050010form2.PROC_COST_12_NAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_12_NAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_12_NAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_12_NAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_12_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_12_NAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_12_NAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_12_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_12_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_12_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_12_NAME" name="PROC_COST_12_NAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_12_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010form2-PROC_COST_12_ANAME">
expj.DA0050010.DA0050010form2.PROC_COST_12_ANAME = {};
expj.DA0050010.DA0050010form2.PROC_COST_12_ANAME.executeAllOnDecision = function () {
  console.log('execute DA0050010form2/PROC_COST_12_ANAME.onDecision');
  expj.DA0050010.DA0050010form2.executeAllOnDecision();
  expj.DA0050010.executeAllOnDecision();
};
expj.DA0050010.DA0050010form2.PROC_COST_12_ANAME.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010form2-PROC_COST_12_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0050010', 'DA0050010form2', 'PROC_COST_12_ANAME', this);
  });
  expj.DA0050010.DA0050010form2.PROC_COST_12_ANAME.executePScriptOnLoad();
};

expj.DA0050010.DA0050010form2.PROC_COST_12_ANAME.executePScriptOnLoad = function () {
  console.log('execute DA0050010form2/PROC_COST_12_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010form2-PROC_COST_12_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0050010-DA0050010form2-PROC_COST_12_ANAME" name="PROC_COST_12_ANAME" class="DA0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0050010Struct.getPROC_COST_12_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-DA0050010-DA0050010button2">
expj.DA0050010.DA0050010button2 = {};
expj.DA0050010.DA0050010button2.executeAllOnDecision = function () {
  console.log('execute DA0050010button2.onDecision');
};
expj.DA0050010.DA0050010button2.executeOnLoad = function () {
  expj.DA0050010.DA0050010button2.executePScriptOnLoad();
};

expj.DA0050010.DA0050010button2.executePScriptOnLoad = function () {
  console.log('execute DA0050010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0050010-DA0050010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0050010-DA0050010button2-Insert">
expj.DA0050010.DA0050010button2.Insert = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0050010form1/*,_DA0050010form2/*@DA0050010Servlet,,$ZZ07001"
expj.DA0050010.DA0050010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0050010', 'DA0050010button2', '_DA0050010form1/*,_DA0050010form2/*', 'DA0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0050010', response);
expj.common.updateBusinessScreenTab('DA0050010', contents);
};
expj.common.pscript.callConfirm('DA0050010', 'DA0050010button2', 'ZZ07001', okEvent);
};
expj.DA0050010.DA0050010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0050010.DA0050010button2.Insert['onClick' + i])) {
        expj.DA0050010.DA0050010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.DA0050010.DA0050010button2.Insert.executeAllOnDecision = function () {
};
expj.DA0050010.DA0050010button2.Insert.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0050010', 'DA0050010button2', 'Insert', this, 'Button');
    }
  });
  expj.DA0050010.DA0050010button2.Insert.executePScriptOnLoad();
};

expj.DA0050010.DA0050010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute DA0050010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0050010-DA0050010button2-Insert" name="Insert" class="DA0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010button2-Update">
expj.DA0050010.DA0050010button2.Update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0050010form1/*,_DA0050010form2/+@DA0050010Servlet,,$ZZ07003"
expj.DA0050010.DA0050010button2.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0050010', 'DA0050010button2', '_DA0050010form1/*,_DA0050010form2/+', 'DA0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0050010', response);
expj.common.updateBusinessScreenTab('DA0050010', contents);
};
expj.common.pscript.callConfirm('DA0050010', 'DA0050010button2', 'ZZ07003', okEvent);
};
expj.DA0050010.DA0050010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0050010.DA0050010button2.Update['onClick' + i])) {
        expj.DA0050010.DA0050010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.DA0050010.DA0050010button2.Update.executeAllOnDecision = function () {
};
expj.DA0050010.DA0050010button2.Update.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0050010', 'DA0050010button2', 'Update', this, 'Button');
    }
  });
  expj.DA0050010.DA0050010button2.Update.executePScriptOnLoad();
};

expj.DA0050010.DA0050010button2.Update.executePScriptOnLoad = function () {
  console.log('execute DA0050010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0050010-DA0050010button2-Update" name="Update" class="DA0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010button2-Delete">
expj.DA0050010.DA0050010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0050010form1/*,_DA0050010form2/*@DA0050010Servlet,,$ZZ07004"
expj.DA0050010.DA0050010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0050010', 'DA0050010button2', '_DA0050010form1/*,_DA0050010form2/*', 'DA0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0050010', response);
expj.common.updateBusinessScreenTab('DA0050010', contents);
};
expj.common.pscript.callConfirm('DA0050010', 'DA0050010button2', 'ZZ07004', okEvent);
};
expj.DA0050010.DA0050010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0050010.DA0050010button2.Delete['onClick' + i])) {
        expj.DA0050010.DA0050010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.DA0050010.DA0050010button2.Delete.executeAllOnDecision = function () {
};
expj.DA0050010.DA0050010button2.Delete.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0050010', 'DA0050010button2', 'Delete', this, 'Button');
    }
  });
  expj.DA0050010.DA0050010button2.Delete.executePScriptOnLoad();
};

expj.DA0050010.DA0050010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute DA0050010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0050010-DA0050010button2-Delete" name="Delete" class="DA0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<span class="version">DA0050010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-DA0050010-DA0050010button0">
expj.DA0050010.DA0050010button0 = {};
expj.DA0050010.DA0050010button0.executeAllOnDecision = function () {
  console.log('execute DA0050010button0.onDecision');
};
expj.DA0050010.DA0050010button0.executeOnLoad = function () {
  expj.DA0050010.DA0050010button0.executePScriptOnLoad();
};

expj.DA0050010.DA0050010button0.executePScriptOnLoad = function () {
  console.log('execute DA0050010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0050010-DA0050010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0050010-DA0050010button0-Clear">
expj.DA0050010.DA0050010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DA0050010Servlet,,$ZZ07008"
expj.DA0050010.DA0050010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0050010', 'DA0050010button0', '', 'DA0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0050010', response);
expj.common.updateBusinessScreenTab('DA0050010', contents);
};
expj.common.pscript.callConfirm('DA0050010', 'DA0050010button0', 'ZZ07008', okEvent);
};
expj.DA0050010.DA0050010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0050010.DA0050010button0.Clear['onClick' + i])) {
        expj.DA0050010.DA0050010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DA0050010.DA0050010button0.Clear.executeAllOnDecision = function () {
};
expj.DA0050010.DA0050010button0.Clear.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0050010', 'DA0050010button0', 'Clear', this, 'Button');
    }
  });
  expj.DA0050010.DA0050010button0.Clear.executePScriptOnLoad();
};

expj.DA0050010.DA0050010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DA0050010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0050010-DA0050010button0-Clear" name="Clear" class="DA0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-DA0050010-DA0050010button0-Close">
expj.DA0050010.DA0050010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DA0050010.DA0050010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DA0050010');
};
expj.DA0050010.DA0050010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0050010.DA0050010button0.Close['onClick' + i])) {
        expj.DA0050010.DA0050010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DA0050010.DA0050010button0.Close.executeAllOnDecision = function () {
};
expj.DA0050010.DA0050010button0.Close.executeOnLoad = function () {
  $('#expj-DA0050010-DA0050010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0050010', 'DA0050010button0', 'Close', this, 'Button');
    }
  });
  expj.DA0050010.DA0050010button0.Close.executePScriptOnLoad();
};

expj.DA0050010.DA0050010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DA0050010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DA0050010-DA0050010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0050010-DA0050010button0-Close" name="Close" class="DA0050010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DA0050010 (END)-->
<%
MessageStruct msgStruct = aDA0050010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DA0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DA0050010)) {
  expj.common.treeInstanceMap.DA0050010 = {};
}
expj.common.treeInstanceMap.DA0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DA0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DA0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DA0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DA0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DA0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DA0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DA0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DA0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DA0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DA0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0050010)) {
  expj.common.detailDialogMap.DA0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DA0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.DA0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DA0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DA0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DA0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DA0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DA0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DA0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DA0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DA0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DA0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DA0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DA0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DA0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DA0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DA0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DA0050010)) {
  expj.common.viewInstanceMap.DA0050010 = {};
}
expj.common.viewInstanceMap.DA0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.DA0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DA0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DA0050010.<%=viewId %>.init = function () {
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
    expj.DA0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DA0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DA0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DA0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DA0050010_init">
/**
 * DA0050010用のロード完了時初期化関数
 */
expj.DA0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DA0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DA0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DA0050010');
  expj.common.calendarInstanceMap.DA0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DA0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DA0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.DA0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DA0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DA0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DA0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DA0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DA0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DA0050010-<%=detailId %>');
<%
 }
%>
  try{expj.DA0050010.DA0050010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form1.PROC_COST_CLS_CD.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form1.h_PROC_COST_CLS_CD.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form1.PeekerProcCostClsCd.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_CLS_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_01_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_01_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_02_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_02_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_03_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_03_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_04_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_04_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_05_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_05_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_06_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_06_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_07_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_07_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_08_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_08_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_09_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_09_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_10_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_10_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_11_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_11_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_12_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.PROC_COST_12_ANAME.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010button2.Update.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form1.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010button1.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010form2.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010button2.executeOnLoad();}catch(e){};
  try{expj.DA0050010.DA0050010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DA0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DA0050010', 'DA0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DA0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DA0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.DA0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DA0050010', '<%=request.getContextPath() %>');
};

/**
 * DA0050010の全体onDecision処理
 */
expj.DA0050010.executeAllOnDecision = function () {
  expj.DA0050010.DA0050010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DA0050010_console">
expj.DA0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>