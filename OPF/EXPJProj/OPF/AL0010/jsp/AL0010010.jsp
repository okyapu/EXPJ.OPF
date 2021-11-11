<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:44:48 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AL0010\AL0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AL0010.*" %>
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
<jsp:useBean id="aAL0010010Control" class="com.nec.jp.orteus.metamorBase.AL0010.AL0010010Control" scope="request"/>
<jsp:useBean id="aAL0010010Struct" class="com.nec.jp.orteus.metamorBase.AL0010.AL0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

資源メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0010/jsp/AL0010010.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:06:15 $
********************************************************* --%>
<html>
<head>
<title>資源メンテナンス</title>
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
<script class="expj-script-AL0010010_init">
  // AL0010010名前空間
  expj.AL0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AL0010010" data-screen="AL0010010" data-newdata="<%=aAL0010010Control.isNewData() %>">
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
              <script class="expj-script-AL0010010-AL0010010form1">
expj.AL0010010.AL0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AL0010010.AL0010010form1.onLoad0 = function () {
  console.log('AL0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AL0010010.AL0010010form1.onDecision0 = function () {
  console.log('AL0010010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AL0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AL0010010button1/Select"
expj.AL0010010.AL0010010form1.child0 = function () {
  console.log('AL0010010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AL0010010', 'AL0010010form1', '_AL0010010button1/Select');
};
// script4="child;1;MASK;_AL0010010button1/Select"
expj.AL0010010.AL0010010form1.child1 = function () {
  console.log('AL0010010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AL0010010', 'AL0010010form1', '_AL0010010button1/Select');
};
// script5="onDecision;1;CHKRQ;A,B@*2,*4"
expj.AL0010010.AL0010010form1.onDecision1 = function () {
  console.log('AL0010010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AL0010010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AL0010010', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?AL0010010form2/*[neq]NORMAL[or]_AL0010010form1/NECK_PROC_CD[neq]_AL0010010form1/h_NECK_PROC_CD@*3,*4"
expj.AL0010010.AL0010010form1.child2 = function () {
  console.log('AL0010010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '?AL0010010form2/*'), '[neq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '_AL0010010form1/NECK_PROC_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '_AL0010010form1/h_NECK_PROC_CD'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AL0010010button2/Insert"
expj.AL0010010.AL0010010form1.child3 = function () {
  console.log('AL0010010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AL0010010', 'AL0010010form1', '_AL0010010button2/Insert');
};
// script8="child;4;MASK;_AL0010010button2/Insert"
expj.AL0010010.AL0010010form1.child4 = function () {
  console.log('AL0010010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AL0010010', 'AL0010010form1', '_AL0010010button2/Insert');
};
// script9="onDecision;2;CHKRQ;B@*5,*7"
expj.AL0010010.AL0010010form1.onDecision2 = function () {
  console.log('AL0010010form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('AL0010010', 'B')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;5;CHK;?AL0010010form2/*[eq]NORMAL[and]_AL0010010form1/NECK_PROC_CD[eq]_AL0010010form1/h_NECK_PROC_CD@*6,*7"
expj.AL0010010.AL0010010form1.child5 = function () {
  console.log('AL0010010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '?AL0010010form2/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '_AL0010010form1/NECK_PROC_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '_AL0010010form1/h_NECK_PROC_CD'))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_AL0010010button2/Update"
expj.AL0010010.AL0010010form1.child6 = function () {
  console.log('AL0010010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AL0010010', 'AL0010010form1', '_AL0010010button2/Update');
};
// script12="child;7;MASK;_AL0010010button2/Update"
expj.AL0010010.AL0010010form1.child7 = function () {
  console.log('AL0010010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AL0010010', 'AL0010010form1', '_AL0010010button2/Update');
};
// script13="onDecision;3;CHK;?AL0010010form2/*[eq]NORMAL[and]_AL0010010form1/NECK_PROC_CD[eq]_AL0010010form1/h_NECK_PROC_CD@*8,*9"
expj.AL0010010.AL0010010form1.onDecision3 = function () {
  console.log('AL0010010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '?AL0010010form2/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '_AL0010010form1/NECK_PROC_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '_AL0010010form1/h_NECK_PROC_CD'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script14="child;8;UNMASK;_AL0010010button2/Delete"
expj.AL0010010.AL0010010form1.child8 = function () {
  console.log('AL0010010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AL0010010', 'AL0010010form1', '_AL0010010button2/Delete');
};
// script15="child;9;MASK;_AL0010010button2/Delete"
expj.AL0010010.AL0010010form1.child9 = function () {
  console.log('AL0010010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AL0010010', 'AL0010010form1', '_AL0010010button2/Delete');
};
expj.AL0010010.AL0010010form1.executeAllOnDecision = function () {
  console.log('execute AL0010010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0010010.AL0010010form1['onDecision' + i])) {
        expj.AL0010010.AL0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.AL0010010.AL0010010form1.executeOnLoad = function () {
  expj.AL0010010.AL0010010form1.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form1.executePScriptOnLoad = function () {
  console.log('execute AL0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AL0010010.AL0010010form1['onLoad' + i])) {
      expj.AL0010010.AL0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AL0010010-AL0010010form1" action="AL0010010Servlet" name="AL0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NECK_PROC_CD",rb)%></span><!-- 制約工程コード --></div><!--/td-->
<script class="expj-script-AL0010010-AL0010010form1-NECK_PROC_CD">
expj.AL0010010.AL0010010form1.NECK_PROC_CD = {};
expj.AL0010010.AL0010010form1.NECK_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AL0010010form1/NECK_PROC_CD.onDecision');
  expj.AL0010010.AL0010010form1.executeAllOnDecision();
  expj.AL0010010.executeAllOnDecision();
};
expj.AL0010010.AL0010010form1.NECK_PROC_CD.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010form1-NECK_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0010010', 'AL0010010form1', 'NECK_PROC_CD', this);
  });
  expj.AL0010010.AL0010010form1.NECK_PROC_CD.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form1.NECK_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AL0010010form1/NECK_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010form1-NECK_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AL0010010-AL0010010form1-NECK_PROC_CD" name="NECK_PROC_CD" class="AL0010010-focus-move  required-value expj-AL0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0010010Struct.getNECK_PROC_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AL0010010-AL0010010form1-h_NECK_PROC_CD" name="h_NECK_PROC_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0010010Struct.geth_NECK_PROC_CD()) %>">
<script class="expj-script-AL0010010-AL0010010form1-h_NECK_PROC_CD">
expj.AL0010010.AL0010010form1.h_NECK_PROC_CD = {};
expj.AL0010010.AL0010010form1.h_NECK_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AL0010010form1/h_NECK_PROC_CD.onDecision');
  expj.AL0010010.AL0010010form1.executeAllOnDecision();
  expj.AL0010010.executeAllOnDecision();
};
expj.AL0010010.AL0010010form1.h_NECK_PROC_CD.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010form1-h_NECK_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0010010', 'AL0010010form1', 'h_NECK_PROC_CD', this);
  });
  expj.AL0010010.AL0010010form1.h_NECK_PROC_CD.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form1.h_NECK_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AL0010010form1/h_NECK_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010form1-h_NECK_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AL0010010-AL0010010form1-PeekerNeckProcCd">
expj.AL0010010.AL0010010form1.PeekerNeckProcCd = {};
// script1="onClick;0;PEEKER;_AL0010010form1/NECK_PROC_CD@<%=contextNo%>"
expj.AL0010010.AL0010010form1.PeekerNeckProcCd.onClick0 = function () {
  console.log('PeekerNeckProcCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AL0010010';
var parameterValues = 'PeekerNeckProcCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '_h_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010form1', '_NECK_PROC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%NECK_PROC_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AL0010010form1/NECK_PROC_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AL0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AL0010010.AL0010010form1.PeekerNeckProcCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0010010.AL0010010form1.PeekerNeckProcCd['onClick' + i])) {
        expj.AL0010010.AL0010010form1.PeekerNeckProcCd['onClick' + i]();
      }
    }
  }
};
expj.AL0010010.AL0010010form1.PeekerNeckProcCd.executeAllOnDecision = function () {
};
expj.AL0010010.AL0010010form1.PeekerNeckProcCd.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010form1-PeekerNeckProcCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0010010', 'AL0010010form1', 'PeekerNeckProcCd', this, 'Button');
    }
  });
  expj.AL0010010.AL0010010form1.PeekerNeckProcCd.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form1.PeekerNeckProcCd.executePScriptOnLoad = function () {
  console.log('execute AL0010010form1/PeekerNeckProcCd.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010form1-PeekerNeckProcCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AL0010010-AL0010010form1-PeekerNeckProcCd" class="AL0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0010010-AL0010010form1-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0010010Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-AL0010010-AL0010010form1-h_MODIFY_COUNT">
expj.AL0010010.AL0010010form1.h_MODIFY_COUNT = {};
expj.AL0010010.AL0010010form1.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AL0010010form1/h_MODIFY_COUNT.onDecision');
  expj.AL0010010.AL0010010form1.executeAllOnDecision();
  expj.AL0010010.executeAllOnDecision();
};
expj.AL0010010.AL0010010form1.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010form1-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0010010', 'AL0010010form1', 'h_MODIFY_COUNT', this);
  });
  expj.AL0010010.AL0010010form1.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form1.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AL0010010form1/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010form1-h_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0010010-AL0010010form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0010010Struct.geth_PLANT_CD()) %>">
<script class="expj-script-AL0010010-AL0010010form1-h_PLANT_CD">
expj.AL0010010.AL0010010form1.h_PLANT_CD = {};
expj.AL0010010.AL0010010form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AL0010010form1/h_PLANT_CD.onDecision');
  expj.AL0010010.AL0010010form1.executeAllOnDecision();
  expj.AL0010010.executeAllOnDecision();
};
expj.AL0010010.AL0010010form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0010010', 'AL0010010form1', 'h_PLANT_CD', this);
  });
  expj.AL0010010.AL0010010form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AL0010010form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010form1-h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AL0010010-AL0010010button1">
expj.AL0010010.AL0010010button1 = {};
expj.AL0010010.AL0010010button1.executeAllOnDecision = function () {
  console.log('execute AL0010010button1.onDecision');
};
expj.AL0010010.AL0010010button1.executeOnLoad = function () {
  expj.AL0010010.AL0010010button1.executePScriptOnLoad();
};

expj.AL0010010.AL0010010button1.executePScriptOnLoad = function () {
  console.log('execute AL0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0010010-AL0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0010010-AL0010010button1-Select">
expj.AL0010010.AL0010010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0010010form1/*@AL0010010Servlet"
expj.AL0010010.AL0010010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0010010', 'AL0010010button1', '_AL0010010form1/*', 'AL0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0010010', response);
expj.common.updateBusinessScreenTab('AL0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AL0010010.AL0010010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0010010.AL0010010button1.Select['onClick' + i])) {
        expj.AL0010010.AL0010010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AL0010010.AL0010010button1.Select.executeAllOnDecision = function () {
};
expj.AL0010010.AL0010010button1.Select.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0010010', 'AL0010010button1', 'Select', this, 'Button');
    }
  });
  expj.AL0010010.AL0010010button1.Select.executePScriptOnLoad();
};

expj.AL0010010.AL0010010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AL0010010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0010010-AL0010010button1-Select" name="Select" class="AL0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AL0010010-AL0010010form2">
expj.AL0010010.AL0010010form2 = {};
expj.AL0010010.AL0010010form2.executeAllOnDecision = function () {
  console.log('execute AL0010010form2.onDecision');
};
expj.AL0010010.AL0010010form2.executeOnLoad = function () {
  expj.AL0010010.AL0010010form2.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form2.executePScriptOnLoad = function () {
  console.log('execute AL0010010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AL0010010-AL0010010form2" action="AL0010010Servlet" name="AL0010010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAL0010010Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NECK_PROC_NAME",rb)%></span><!-- 制約工程名 --></div><!--/td-->
<script class="expj-script-AL0010010-AL0010010form2-NECK_PROC_NAME">
expj.AL0010010.AL0010010form2.NECK_PROC_NAME = {};
expj.AL0010010.AL0010010form2.NECK_PROC_NAME.executeAllOnDecision = function () {
  console.log('execute AL0010010form2/NECK_PROC_NAME.onDecision');
  expj.AL0010010.AL0010010form2.executeAllOnDecision();
  expj.AL0010010.executeAllOnDecision();
};
expj.AL0010010.AL0010010form2.NECK_PROC_NAME.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010form2-NECK_PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0010010', 'AL0010010form2', 'NECK_PROC_NAME', this);
  });
  expj.AL0010010.AL0010010form2.NECK_PROC_NAME.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form2.NECK_PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute AL0010010form2/NECK_PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010form2-NECK_PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AL0010010-AL0010010form2-NECK_PROC_NAME" name="NECK_PROC_NAME" class="AL0010010-focus-move  required-value expj-AL0010010-required-B" style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0010010Struct.getNECK_PROC_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NECK_PROC_CAPA_1",rb)%></span><!-- 能力／日 --></div><!--/td-->
<script class="expj-script-AL0010010-AL0010010form2-NECK_PROC_CAPA">
expj.AL0010010.AL0010010form2.NECK_PROC_CAPA = {};
expj.AL0010010.AL0010010form2.NECK_PROC_CAPA.executeAllOnDecision = function () {
  console.log('execute AL0010010form2/NECK_PROC_CAPA.onDecision');
  expj.AL0010010.AL0010010form2.executeAllOnDecision();
  expj.AL0010010.executeAllOnDecision();
};
expj.AL0010010.AL0010010form2.NECK_PROC_CAPA.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010form2-NECK_PROC_CAPA').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0010010', 'AL0010010form2', 'NECK_PROC_CAPA', this);
  });
  expj.AL0010010.AL0010010form2.NECK_PROC_CAPA.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form2.NECK_PROC_CAPA.executePScriptOnLoad = function () {
  console.log('execute AL0010010form2/NECK_PROC_CAPA.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010form2-NECK_PROC_CAPA');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0010010-AL0010010form2-NECK_PROC_CAPA" name="NECK_PROC_CAPA" class="AL0010010-focus-move  required-value expj-AL0010010-required-B" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;8.1;FLOOR;2" value="<%= TypeConverter.sanitizer(aAL0010010Struct.getNECK_PROC_CAPA()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NECK_PROC_CAPA_UNIT",rb)%></span><!-- 能力単位 --></div><!--/td-->
<script class="expj-script-AL0010010-AL0010010form2-NECK_PROC_CAPA_UNIT">
expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_UNIT = {};
expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_UNIT.executeAllOnDecision = function () {
  console.log('execute AL0010010form2/NECK_PROC_CAPA_UNIT.onDecision');
  expj.AL0010010.AL0010010form2.executeAllOnDecision();
  expj.AL0010010.executeAllOnDecision();
};
expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_UNIT.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010form2-NECK_PROC_CAPA_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0010010', 'AL0010010form2', 'NECK_PROC_CAPA_UNIT', this);
  });
  expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_UNIT.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_UNIT.executePScriptOnLoad = function () {
  console.log('execute AL0010010form2/NECK_PROC_CAPA_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010form2-NECK_PROC_CAPA_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AL0010010-AL0010010form2-NECK_PROC_CAPA_UNIT" name="NECK_PROC_CAPA_UNIT" class="AL0010010-focus-move  required-value expj-AL0010010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0010010Struct.getNECK_PROC_CAPA_UNIT()) %>" maxlength="12" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.NECK_PROC_CAPA_RATE",rb)%></span><!-- 稼働率 --></div><!--/td-->
<script class="expj-script-AL0010010-AL0010010form2-NECK_PROC_CAPA_RATE">
expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_RATE = {};
expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_RATE.executeAllOnDecision = function () {
  console.log('execute AL0010010form2/NECK_PROC_CAPA_RATE.onDecision');
  expj.AL0010010.AL0010010form2.executeAllOnDecision();
  expj.AL0010010.executeAllOnDecision();
};
expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_RATE.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010form2-NECK_PROC_CAPA_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0010010', 'AL0010010form2', 'NECK_PROC_CAPA_RATE', this);
  });
  expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_RATE.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_RATE.executePScriptOnLoad = function () {
  console.log('execute AL0010010form2/NECK_PROC_CAPA_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010form2-NECK_PROC_CAPA_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0010010-AL0010010form2-NECK_PROC_CAPA_RATE" name="NECK_PROC_CAPA_RATE" class="AL0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAL0010010Struct.getNECK_PROC_CAPA_RATE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.NECK_PROC_SHIFT_1",rb)%></span><!-- 稼働時間／日 --></div><!--/td-->
<script class="expj-script-AL0010010-AL0010010form2-NECK_PROC_SHIFT">
expj.AL0010010.AL0010010form2.NECK_PROC_SHIFT = {};
expj.AL0010010.AL0010010form2.NECK_PROC_SHIFT.executeAllOnDecision = function () {
  console.log('execute AL0010010form2/NECK_PROC_SHIFT.onDecision');
  expj.AL0010010.AL0010010form2.executeAllOnDecision();
  expj.AL0010010.executeAllOnDecision();
};
expj.AL0010010.AL0010010form2.NECK_PROC_SHIFT.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010form2-NECK_PROC_SHIFT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0010010', 'AL0010010form2', 'NECK_PROC_SHIFT', this);
  });
  expj.AL0010010.AL0010010form2.NECK_PROC_SHIFT.executePScriptOnLoad();
};

expj.AL0010010.AL0010010form2.NECK_PROC_SHIFT.executePScriptOnLoad = function () {
  console.log('execute AL0010010form2/NECK_PROC_SHIFT.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010form2-NECK_PROC_SHIFT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0010010-AL0010010form2-NECK_PROC_SHIFT" name="NECK_PROC_SHIFT" class="AL0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;2.1;FLOOR;2" value="<%= TypeConverter.sanitizer(aAL0010010Struct.getNECK_PROC_SHIFT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0131",rb)%></span><!-- 時間 --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AL0010010-AL0010010button2">
expj.AL0010010.AL0010010button2 = {};
expj.AL0010010.AL0010010button2.executeAllOnDecision = function () {
  console.log('execute AL0010010button2.onDecision');
};
expj.AL0010010.AL0010010button2.executeOnLoad = function () {
  expj.AL0010010.AL0010010button2.executePScriptOnLoad();
};

expj.AL0010010.AL0010010button2.executePScriptOnLoad = function () {
  console.log('execute AL0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0010010-AL0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0010010-AL0010010button2-Insert">
expj.AL0010010.AL0010010button2.Insert = {};
// script1="onClick;0;CHK;_AL0010010form2/NECK_PROC_CAPA[lte]0@#AL10002"
expj.AL0010010.AL0010010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010button2', '_AL0010010form2/NECK_PROC_CAPA')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AL0010010', 'AL0010010button2', 'AL10002');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0010010form1/*,_AL0010010form2/*@AL0010010Servlet,,$ZZ07001"
expj.AL0010010.AL0010010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0010010', 'AL0010010button2', '_AL0010010form1/*,_AL0010010form2/*', 'AL0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0010010', response);
expj.common.updateBusinessScreenTab('AL0010010', contents);
};
expj.common.pscript.callConfirm('AL0010010', 'AL0010010button2', 'ZZ07001', okEvent);
};
expj.AL0010010.AL0010010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0010010.AL0010010button2.Insert['onClick' + i])) {
        expj.AL0010010.AL0010010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.AL0010010.AL0010010button2.Insert.executeAllOnDecision = function () {
};
expj.AL0010010.AL0010010button2.Insert.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0010010', 'AL0010010button2', 'Insert', this, 'Button');
    }
  });
  expj.AL0010010.AL0010010button2.Insert.executePScriptOnLoad();
};

expj.AL0010010.AL0010010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute AL0010010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0010010-AL0010010button2-Insert" name="Insert" class="AL0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AL0010010-AL0010010button2-Update">
expj.AL0010010.AL0010010button2.Update = {};
// script1="onClick;0;CHK;_AL0010010form2/NECK_PROC_CAPA[lte]0@#AL10002"
expj.AL0010010.AL0010010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0010010', 'AL0010010button2', '_AL0010010form2/NECK_PROC_CAPA')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AL0010010', 'AL0010010button2', 'AL10002');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0010010form1/*,_AL0010010form2/*@AL0010010Servlet,,$ZZ07003"
expj.AL0010010.AL0010010button2.Update.onClick1 = function () {
  console.log('Update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0010010', 'AL0010010button2', '_AL0010010form1/*,_AL0010010form2/*', 'AL0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0010010', response);
expj.common.updateBusinessScreenTab('AL0010010', contents);
};
expj.common.pscript.callConfirm('AL0010010', 'AL0010010button2', 'ZZ07003', okEvent);
};
expj.AL0010010.AL0010010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0010010.AL0010010button2.Update['onClick' + i])) {
        expj.AL0010010.AL0010010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AL0010010.AL0010010button2.Update.executeAllOnDecision = function () {
};
expj.AL0010010.AL0010010button2.Update.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0010010', 'AL0010010button2', 'Update', this, 'Button');
    }
  });
  expj.AL0010010.AL0010010button2.Update.executePScriptOnLoad();
};

expj.AL0010010.AL0010010button2.Update.executePScriptOnLoad = function () {
  console.log('execute AL0010010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0010010-AL0010010button2-Update" name="Update" class="AL0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AL0010010-AL0010010button2-Delete">
expj.AL0010010.AL0010010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0010010form1/*,_AL0010010form2/*@AL0010010Servlet,,$ZZ07004"
expj.AL0010010.AL0010010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0010010', 'AL0010010button2', '_AL0010010form1/*,_AL0010010form2/*', 'AL0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0010010', response);
expj.common.updateBusinessScreenTab('AL0010010', contents);
};
expj.common.pscript.callConfirm('AL0010010', 'AL0010010button2', 'ZZ07004', okEvent);
};
expj.AL0010010.AL0010010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0010010.AL0010010button2.Delete['onClick' + i])) {
        expj.AL0010010.AL0010010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.AL0010010.AL0010010button2.Delete.executeAllOnDecision = function () {
};
expj.AL0010010.AL0010010button2.Delete.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0010010', 'AL0010010button2', 'Delete', this, 'Button');
    }
  });
  expj.AL0010010.AL0010010button2.Delete.executePScriptOnLoad();
};

expj.AL0010010.AL0010010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute AL0010010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0010010-AL0010010button2-Delete" name="Delete" class="AL0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<span class="version">AL0010010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AL0010010-AL0010010button0">
expj.AL0010010.AL0010010button0 = {};
expj.AL0010010.AL0010010button0.executeAllOnDecision = function () {
  console.log('execute AL0010010button0.onDecision');
};
expj.AL0010010.AL0010010button0.executeOnLoad = function () {
  expj.AL0010010.AL0010010button0.executePScriptOnLoad();
};

expj.AL0010010.AL0010010button0.executePScriptOnLoad = function () {
  console.log('execute AL0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0010010-AL0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0010010-AL0010010button0-Clear">
expj.AL0010010.AL0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0010010form1/*@AL0010010Servlet,,$ZZ07008"
expj.AL0010010.AL0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0010010', 'AL0010010button0', '_AL0010010form1/*', 'AL0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0010010', response);
expj.common.updateBusinessScreenTab('AL0010010', contents);
};
expj.common.pscript.callConfirm('AL0010010', 'AL0010010button0', 'ZZ07008', okEvent);
};
expj.AL0010010.AL0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0010010.AL0010010button0.Clear['onClick' + i])) {
        expj.AL0010010.AL0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AL0010010.AL0010010button0.Clear.executeAllOnDecision = function () {
};
expj.AL0010010.AL0010010button0.Clear.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0010010', 'AL0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.AL0010010.AL0010010button0.Clear.executePScriptOnLoad();
};

expj.AL0010010.AL0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AL0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0010010-AL0010010button0-Clear" name="Clear" class="AL0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AL0010010-AL0010010button0-Close">
expj.AL0010010.AL0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AL0010010.AL0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AL0010010');
};
expj.AL0010010.AL0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0010010.AL0010010button0.Close['onClick' + i])) {
        expj.AL0010010.AL0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AL0010010.AL0010010button0.Close.executeAllOnDecision = function () {
};
expj.AL0010010.AL0010010button0.Close.executeOnLoad = function () {
  $('#expj-AL0010010-AL0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0010010', 'AL0010010button0', 'Close', this, 'Button');
    }
  });
  expj.AL0010010.AL0010010button0.Close.executePScriptOnLoad();
};

expj.AL0010010.AL0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AL0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AL0010010-AL0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0010010-AL0010010button0-Close" name="Close" class="AL0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AL0010010 (END)-->
<%
  MessageStruct msgStruct = aAL0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AL0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AL0010010)) {
  expj.common.treeInstanceMap.AL0010010 = {};
}
expj.common.treeInstanceMap.AL0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AL0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AL0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AL0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AL0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AL0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AL0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AL0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AL0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AL0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AL0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0010010)) {
  expj.common.detailDialogMap.AL0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AL0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AL0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AL0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AL0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AL0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AL0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AL0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AL0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AL0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AL0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AL0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AL0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AL0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AL0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AL0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AL0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AL0010010)) {
  expj.common.viewInstanceMap.AL0010010 = {};
}
expj.common.viewInstanceMap.AL0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AL0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AL0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AL0010010.<%=viewId %>.init = function () {
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
    expj.AL0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AL0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AL0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AL0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AL0010010_init">
/**
 * AL0010010用のロード完了時初期化関数
 */
expj.AL0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AL0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AL0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AL0010010');
  expj.common.calendarInstanceMap.AL0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AL0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AL0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AL0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AL0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AL0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AL0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AL0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AL0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AL0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AL0010010.AL0010010form1.NECK_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form1.h_NECK_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form1.PeekerNeckProcCd.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form1.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form2.NECK_PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form2.NECK_PROC_CAPA.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_UNIT.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form2.NECK_PROC_CAPA_RATE.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form2.NECK_PROC_SHIFT.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010button2.Update.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form1.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010button1.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010form2.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010button2.executeOnLoad();}catch(e){};
  try{expj.AL0010010.AL0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AL0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AL0010010', 'AL0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AL0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AL0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.AL0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AL0010010', '<%=request.getContextPath() %>');
};

/**
 * AL0010010の全体onDecision処理
 */
expj.AL0010010.executeAllOnDecision = function () {
  expj.AL0010010.AL0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AL0010010_console">
expj.AL0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>