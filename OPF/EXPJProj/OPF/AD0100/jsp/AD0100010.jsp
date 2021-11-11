<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:32:21 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0100\AD0100010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0100.*" %>
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
<jsp:useBean id="aAD0100010Control" class="com.nec.jp.orteus.metamorBase.AD0100.AD0100010Control" scope="request"/>
<jsp:useBean id="aAD0100010Struct" class="com.nec.jp.orteus.metamorBase.AD0100.AD0100010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出来高作業指示強制完了　
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0100/jsp/AD0100010.jsp,v $
$Author: geng-jia $
$Revision: 1.2 $ $Date: 2017/02/22 02:04:57 $
********************************************************* --%>
<html>
<head>
<title>出来高作業指示強制完了</title>
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
<script class="expj-script-AD0100010_init">
  // AD0100010名前空間
  expj.AD0100010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AD0100010" data-screen="AD0100010" data-newdata="<%=aAD0100010Control.isNewData() %>">
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
              <!-- 1段目のDataGrid配置↓ -->
              <script class="expj-script-AD0100010-AD0100010form1">
expj.AD0100010.AD0100010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AD0100010.AD0100010form1.onLoad0 = function () {
  console.log('AD0100010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHK;?AD0100010form1/*[eq]NORMAL[and]?ITEM_CD[eq]SAME[and]?WS_CD[eq]SAME[and]?PRD_START_DATE_FROM[eq]SAME[and]?PRD_START_DATE_FROM_TIME[eq]SAME[and]?PRD_START_DATE_TO[eq]SAME[and]?PRD_START_DATE_TO_TIME[eq]SAME[and]?PRD_DUE_DATE_FROM[eq]SAME[and]?PRD_DUE_DATE_FROM_TIME[eq]SAME[and]?PRD_DUE_DATE_TO[eq]SAME[and]?PRD_DUE_DATE_TO_TIME[eq]SAME@*0,*1"
expj.AD0100010.AD0100010form1.onDecision0 = function () {
  console.log('AD0100010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?AD0100010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?PRD_START_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?PRD_START_DATE_FROM_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?PRD_START_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?PRD_START_DATE_TO_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?PRD_DUE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?PRD_DUE_DATE_FROM_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?PRD_DUE_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?PRD_DUE_DATE_TO_TIME'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AD0100010button2/CheckAll,_AD0100010button2/CheckClear@*2"
expj.AD0100010.AD0100010form1.child0 = function () {
  console.log('AD0100010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010button2/CheckClear');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;1;MASK;_AD0100010button2/Choice_Compulsion_Completion,_AD0100010button2/CheckAll,_AD0100010button2/CheckClear"
expj.AD0100010.AD0100010form1.child1 = function () {
  console.log('AD0100010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010button2/Choice_Compulsion_Completion');
expj.common.pscript.setMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010button2/CheckClear');
};
// script5="child;2;CHKRQ;?AD0100010view1/?[eq]SINGLE@*3,*4"
expj.AD0100010.AD0100010form1.child2 = function () {
  console.log('AD0100010form1 script5');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?AD0100010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;3;UNMASK;_AD0100010button2/Choice_Compulsion_Completion"
expj.AD0100010.AD0100010form1.child3 = function () {
  console.log('AD0100010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010button2/Choice_Compulsion_Completion');
};
// script7="child;4;CHKRQ;?AD0100010view1/?[eq]MULTI@*5,*6"
expj.AD0100010.AD0100010form1.child4 = function () {
  console.log('AD0100010form1 script7');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '?AD0100010view1/?'), '[eq]', 'MULTI'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;5;UNMASK;_AD0100010button2/Choice_Compulsion_Completion"
expj.AD0100010.AD0100010form1.child5 = function () {
  console.log('AD0100010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010button2/Choice_Compulsion_Completion');
};
// script9="child;6;MASK;_AD0100010button2/Choice_Compulsion_Completion"
expj.AD0100010.AD0100010form1.child6 = function () {
  console.log('AD0100010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010button2/Choice_Compulsion_Completion');
};
// script10="onDecision;1;CHK;_AD0100010form1/TIME_CTRL[eq]true@*7,*8"
expj.AD0100010.AD0100010form1.onDecision1 = function () {
  console.log('AD0100010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;7;UNMASK;_AD0100010form1/PRD_START_DATE_FROM_TIME,_AD0100010form1/PRD_START_DATE_TO_TIME,_AD0100010form1/PRD_DUE_DATE_FROM_TIME,_AD0100010form1/PRD_DUE_DATE_TO_TIME"
expj.AD0100010.AD0100010form1.child7 = function () {
  console.log('AD0100010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010form1/PRD_START_DATE_FROM_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010form1/PRD_START_DATE_TO_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME');
};
// script12="child;8;MASK;_AD0100010form1/PRD_START_DATE_FROM_TIME,_AD0100010form1/PRD_START_DATE_TO_TIME,_AD0100010form1/PRD_DUE_DATE_FROM_TIME,_AD0100010form1/PRD_DUE_DATE_TO_TIME"
expj.AD0100010.AD0100010form1.child8 = function () {
  console.log('AD0100010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010form1/PRD_START_DATE_FROM_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010form1/PRD_START_DATE_TO_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0100010', 'AD0100010form1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME');
};
expj.AD0100010.AD0100010form1.executeAllOnDecision = function () {
  console.log('execute AD0100010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010form1['onDecision' + i])) {
        expj.AD0100010.AD0100010form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010form1.executeOnLoad = function () {
  expj.AD0100010.AD0100010form1.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0100010.AD0100010form1['onLoad' + i])) {
      expj.AD0100010.AD0100010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0100010-AD0100010form1" action="AD0100010Servlet" name="AD0100010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0100010Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:66px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-ITEM_CD">
expj.AD0100010.AD0100010form1.ITEM_CD = {};
expj.AD0100010.AD0100010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/ITEM_CD.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'ITEM_CD', this);
  });
  expj.AD0100010.AD0100010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-ITEM_CD" name="ITEM_CD" class="AD0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-PeekerItemCd">
expj.AD0100010.AD0100010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AD0100010form1/ITEM_CD@<%=contextNo%>"
expj.AD0100010.AD0100010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0100010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '_AD0100010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AD0100010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0100010.AD0100010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010form1.PeekerItemCd['onClick' + i])) {
        expj.AD0100010.AD0100010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AD0100010.AD0100010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0100010-AD0100010form1-PeekerItemCd" class="AD0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-ITEM_NAME">
expj.AD0100010.AD0100010form1.ITEM_NAME = {};
expj.AD0100010.AD0100010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/ITEM_NAME.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'ITEM_NAME', this);
  });
  expj.AD0100010.AD0100010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:342px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-ITEM_NAME" name="ITEM_NAME" class="AD0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-WS_CD">
expj.AD0100010.AD0100010form1.WS_CD = {};
expj.AD0100010.AD0100010form1.WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/WS_CD.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.WS_CD.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'WS_CD', this);
  });
  expj.AD0100010.AD0100010form1.WS_CD.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-WS_CD" name="WS_CD" class="AD0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-PeekerWsCode">
expj.AD0100010.AD0100010form1.PeekerWsCode = {};
// script1="onClick;0;PEEKER;_AD0100010form1/WS_CD@<%=contextNo%>"
expj.AD0100010.AD0100010form1.PeekerWsCode.onClick0 = function () {
  console.log('PeekerWsCode script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0100010';
var parameterValues = 'PeekerWsCode%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0100010', 'PeekerWsCode', 'SQLPARAM_1', '<%=aAD0100010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010form1', '_AD0100010form1/WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0100010form1/WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0100010.AD0100010form1.PeekerWsCode.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010form1.PeekerWsCode['onClick' + i])) {
        expj.AD0100010.AD0100010form1.PeekerWsCode['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010form1.PeekerWsCode.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010form1.PeekerWsCode.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-PeekerWsCode').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010form1', 'PeekerWsCode', this, 'Button');
    }
  });
  expj.AD0100010.AD0100010form1.PeekerWsCode.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.PeekerWsCode.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/PeekerWsCode.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-PeekerWsCode');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0100010-AD0100010form1-PeekerWsCode" class="AD0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-WS_NAME">
expj.AD0100010.AD0100010form1.WS_NAME = {};
expj.AD0100010.AD0100010form1.WS_NAME.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/WS_NAME.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.WS_NAME.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'WS_NAME', this);
  });
  expj.AD0100010.AD0100010form1.WS_NAME.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:342px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-WS_NAME" name="WS_NAME" class="AD0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getWS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRD_START_DATE",rb)%></span><!-- 製造着手日 --></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-PRD_START_DATE_FROM">
expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM = {};
expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/PRD_START_DATE_FROM.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-PRD_START_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'PRD_START_DATE_FROM', this);
  });
  expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/PRD_START_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-PRD_START_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-PRD_START_DATE_FROM" name="PRD_START_DATE_FROM" class="AD0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getPRD_START_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-CalendarProdStartDateFrom">
expj.AD0100010.AD0100010form1.CalendarProdStartDateFrom = {};
// script1="onClick;0;CALENDAR;_AD0100010form1/PRD_START_DATE_FROM@<%=contextNo%>"
expj.AD0100010.AD0100010form1.CalendarProdStartDateFrom.onClick0 = function () {
  console.log('CalendarProdStartDateFrom script1');
expj.common.pscript.executeCalendar('AD0100010','AD0100010form1','_AD0100010form1/PRD_START_DATE_FROM');
};
expj.AD0100010.AD0100010form1.CalendarProdStartDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010form1.CalendarProdStartDateFrom['onClick' + i])) {
        expj.AD0100010.AD0100010form1.CalendarProdStartDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010form1.CalendarProdStartDateFrom.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010form1.CalendarProdStartDateFrom.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-CalendarProdStartDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010form1', 'CalendarProdStartDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0100010','AD0100010form1','_AD0100010form1/PRD_START_DATE_FROM');
  expj.AD0100010.AD0100010form1.CalendarProdStartDateFrom.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.CalendarProdStartDateFrom.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/CalendarProdStartDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-CalendarProdStartDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0100010-AD0100010form1-CalendarProdStartDateFrom" class="AD0100010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-PRD_START_DATE_FROM_TIME">
expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM_TIME = {};
expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM_TIME.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/PRD_START_DATE_FROM_TIME.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM_TIME.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-PRD_START_DATE_FROM_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'PRD_START_DATE_FROM_TIME', this);
  });
  expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM_TIME.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/PRD_START_DATE_FROM_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-PRD_START_DATE_FROM_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-PRD_START_DATE_FROM_TIME" name="PRD_START_DATE_FROM_TIME" class="AD0100010-focus-move  " style="width:88px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getPRD_START_DATE_FROM_TIME()) %>" maxlength="4" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-PRD_START_DATE_TO">
expj.AD0100010.AD0100010form1.PRD_START_DATE_TO = {};
expj.AD0100010.AD0100010form1.PRD_START_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/PRD_START_DATE_TO.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.PRD_START_DATE_TO.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-PRD_START_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'PRD_START_DATE_TO', this);
  });
  expj.AD0100010.AD0100010form1.PRD_START_DATE_TO.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.PRD_START_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/PRD_START_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-PRD_START_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-PRD_START_DATE_TO" name="PRD_START_DATE_TO" class="AD0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getPRD_START_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-CalendarProdStartDateTo">
expj.AD0100010.AD0100010form1.CalendarProdStartDateTo = {};
// script1="onClick;0;CALENDAR;_AD0100010form1/PRD_START_DATE_TO@<%=contextNo%>"
expj.AD0100010.AD0100010form1.CalendarProdStartDateTo.onClick0 = function () {
  console.log('CalendarProdStartDateTo script1');
expj.common.pscript.executeCalendar('AD0100010','AD0100010form1','_AD0100010form1/PRD_START_DATE_TO');
};
expj.AD0100010.AD0100010form1.CalendarProdStartDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010form1.CalendarProdStartDateTo['onClick' + i])) {
        expj.AD0100010.AD0100010form1.CalendarProdStartDateTo['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010form1.CalendarProdStartDateTo.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010form1.CalendarProdStartDateTo.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-CalendarProdStartDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010form1', 'CalendarProdStartDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0100010','AD0100010form1','_AD0100010form1/PRD_START_DATE_TO');
  expj.AD0100010.AD0100010form1.CalendarProdStartDateTo.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.CalendarProdStartDateTo.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/CalendarProdStartDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-CalendarProdStartDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0100010-AD0100010form1-CalendarProdStartDateTo" class="AD0100010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-PRD_START_DATE_TO_TIME">
expj.AD0100010.AD0100010form1.PRD_START_DATE_TO_TIME = {};
expj.AD0100010.AD0100010form1.PRD_START_DATE_TO_TIME.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/PRD_START_DATE_TO_TIME.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.PRD_START_DATE_TO_TIME.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-PRD_START_DATE_TO_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'PRD_START_DATE_TO_TIME', this);
  });
  expj.AD0100010.AD0100010form1.PRD_START_DATE_TO_TIME.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.PRD_START_DATE_TO_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/PRD_START_DATE_TO_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-PRD_START_DATE_TO_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-PRD_START_DATE_TO_TIME" name="PRD_START_DATE_TO_TIME" class="AD0100010-focus-move  " style="width:88px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getPRD_START_DATE_TO_TIME()) %>" maxlength="4" disabled></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)%></span><!-- 製造納期 --></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-PRD_DUE_DATE_FROM">
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM = {};
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/PRD_DUE_DATE_FROM.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-PRD_DUE_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'PRD_DUE_DATE_FROM', this);
  });
  expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/PRD_DUE_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-PRD_DUE_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-PRD_DUE_DATE_FROM" name="PRD_DUE_DATE_FROM" class="AD0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getPRD_DUE_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-CalendarPrdDueDateFrom">
expj.AD0100010.AD0100010form1.CalendarPrdDueDateFrom = {};
// script1="onClick;0;CALENDAR;_AD0100010form1/PRD_DUE_DATE_FROM@<%=contextNo%>"
expj.AD0100010.AD0100010form1.CalendarPrdDueDateFrom.onClick0 = function () {
  console.log('CalendarPrdDueDateFrom script1');
expj.common.pscript.executeCalendar('AD0100010','AD0100010form1','_AD0100010form1/PRD_DUE_DATE_FROM');
};
expj.AD0100010.AD0100010form1.CalendarPrdDueDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010form1.CalendarPrdDueDateFrom['onClick' + i])) {
        expj.AD0100010.AD0100010form1.CalendarPrdDueDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010form1.CalendarPrdDueDateFrom.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010form1.CalendarPrdDueDateFrom.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-CalendarPrdDueDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010form1', 'CalendarPrdDueDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0100010','AD0100010form1','_AD0100010form1/PRD_DUE_DATE_FROM');
  expj.AD0100010.AD0100010form1.CalendarPrdDueDateFrom.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.CalendarPrdDueDateFrom.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/CalendarPrdDueDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-CalendarPrdDueDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0100010-AD0100010form1-CalendarPrdDueDateFrom" class="AD0100010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-PRD_DUE_DATE_FROM_TIME">
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM_TIME = {};
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM_TIME.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/PRD_DUE_DATE_FROM_TIME.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM_TIME.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-PRD_DUE_DATE_FROM_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'PRD_DUE_DATE_FROM_TIME', this);
  });
  expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM_TIME.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/PRD_DUE_DATE_FROM_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-PRD_DUE_DATE_FROM_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-PRD_DUE_DATE_FROM_TIME" name="PRD_DUE_DATE_FROM_TIME" class="AD0100010-focus-move  " style="width:88px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getPRD_DUE_DATE_FROM_TIME()) %>" maxlength="4" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-PRD_DUE_DATE_TO">
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO = {};
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/PRD_DUE_DATE_TO.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-PRD_DUE_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'PRD_DUE_DATE_TO', this);
  });
  expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/PRD_DUE_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-PRD_DUE_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-PRD_DUE_DATE_TO" name="PRD_DUE_DATE_TO" class="AD0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getPRD_DUE_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-CalendarPrdDueDateTo">
expj.AD0100010.AD0100010form1.CalendarPrdDueDateTo = {};
// script1="onClick;0;CALENDAR;_AD0100010form1/PRD_DUE_DATE_TO@<%=contextNo%>"
expj.AD0100010.AD0100010form1.CalendarPrdDueDateTo.onClick0 = function () {
  console.log('CalendarPrdDueDateTo script1');
expj.common.pscript.executeCalendar('AD0100010','AD0100010form1','_AD0100010form1/PRD_DUE_DATE_TO');
};
expj.AD0100010.AD0100010form1.CalendarPrdDueDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010form1.CalendarPrdDueDateTo['onClick' + i])) {
        expj.AD0100010.AD0100010form1.CalendarPrdDueDateTo['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010form1.CalendarPrdDueDateTo.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010form1.CalendarPrdDueDateTo.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-CalendarPrdDueDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010form1', 'CalendarPrdDueDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0100010','AD0100010form1','_AD0100010form1/PRD_DUE_DATE_TO');
  expj.AD0100010.AD0100010form1.CalendarPrdDueDateTo.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.CalendarPrdDueDateTo.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/CalendarPrdDueDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-CalendarPrdDueDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0100010-AD0100010form1-CalendarPrdDueDateTo" class="AD0100010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010form1-PRD_DUE_DATE_TO_TIME">
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO_TIME = {};
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO_TIME.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/PRD_DUE_DATE_TO_TIME.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO_TIME.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-PRD_DUE_DATE_TO_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'PRD_DUE_DATE_TO_TIME', this);
  });
  expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO_TIME.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/PRD_DUE_DATE_TO_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-PRD_DUE_DATE_TO_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AD0100010-AD0100010form1-PRD_DUE_DATE_TO_TIME" name="PRD_DUE_DATE_TO_TIME" class="AD0100010-focus-move  " style="width:88px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getPRD_DUE_DATE_TO_TIME()) %>" maxlength="4" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0100010-AD0100010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0100010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0100010-AD0100010form1-TIME_CTRL">
expj.AD0100010.AD0100010form1.TIME_CTRL = {};
expj.AD0100010.AD0100010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0100010form1/TIME_CTRL.onDecision');
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
  expj.AD0100010.executeAllOnDecision();
};
expj.AD0100010.AD0100010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0100010', 'AD0100010form1', 'TIME_CTRL', this);
  });
  expj.AD0100010.AD0100010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0100010.AD0100010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0100010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- 1段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0100010-AD0100010button1">
expj.AD0100010.AD0100010button1 = {};
expj.AD0100010.AD0100010button1.executeAllOnDecision = function () {
  console.log('execute AD0100010button1.onDecision');
};
expj.AD0100010.AD0100010button1.executeOnLoad = function () {
  expj.AD0100010.AD0100010button1.executePScriptOnLoad();
};

expj.AD0100010.AD0100010button1.executePScriptOnLoad = function () {
  console.log('execute AD0100010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0100010-AD0100010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0100010-AD0100010button1-Select">
expj.AD0100010.AD0100010button1.Select = {};
// script1="onClick;0;CHK;_AD0100010form1/TIME_CTRL[eq]true@*0"
expj.AD0100010.AD0100010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_AD0100010form1/TIME_CTRL[eq]true@*1"
expj.AD0100010.AD0100010button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_AD0100010form1/TIME_CTRL[eq]true@*2"
expj.AD0100010.AD0100010button1.Select.onClick2 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onClick;3;CHK;_AD0100010form1/TIME_CTRL[eq]true@*3"
expj.AD0100010.AD0100010button1.Select.onClick3 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onClick;4;CHK;_AD0100010form1/TIME_CTRL[eq]true@*4"
expj.AD0100010.AD0100010button1.Select.onClick4 = function () {
  console.log('Select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onClick;5;CHK;_AD0100010form1/TIME_CTRL[eq]true@*5"
expj.AD0100010.AD0100010button1.Select.onClick5 = function () {
  console.log('Select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="onClick;6;CHK;_AD0100010form1/TIME_CTRL[eq]true@*6"
expj.AD0100010.AD0100010button1.Select.onClick6 = function () {
  console.log('Select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="onClick;7;CHK;_AD0100010form1/TIME_CTRL[eq]true@*7"
expj.AD0100010.AD0100010button1.Select.onClick7 = function () {
  console.log('Select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="onClick;8;CHK;_AD0100010form1/TIME_CTRL[eq]true[and]~LEN(_AD0100010form1/PRD_START_DATE_FROM_TIME)[eq]3@*8"
expj.AD0100010.AD0100010button1.Select.onClick8 = function () {
  console.log('Select script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="onClick;9;CHK;_AD0100010form1/TIME_CTRL[eq]true[and]~LEN(_AD0100010form1/PRD_START_DATE_FROM_TIME)[eq]4@*12"
expj.AD0100010.AD0100010button1.Select.onClick9 = function () {
  console.log('Select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script11="onClick;10;CHK;_AD0100010form1/TIME_CTRL[eq]true[and]~LEN(_AD0100010form1/PRD_START_DATE_TO_TIME)[eq]3@*9"
expj.AD0100010.AD0100010button1.Select.onClick10 = function () {
  console.log('Select script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="onClick;11;CHK;_AD0100010form1/TIME_CTRL[eq]true[and]~LEN(_AD0100010form1/PRD_START_DATE_TO_TIME)[eq]4@*13"
expj.AD0100010.AD0100010button1.Select.onClick11 = function () {
  console.log('Select script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script13="onClick;12;CHK;_AD0100010form1/TIME_CTRL[eq]true[and]~LEN(_AD0100010form1/PRD_DUE_DATE_FROM_TIME)[eq]3@*10"
expj.AD0100010.AD0100010button1.Select.onClick12 = function () {
  console.log('Select script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script14="onClick;13;CHK;_AD0100010form1/TIME_CTRL[eq]true[and]~LEN(_AD0100010form1/PRD_DUE_DATE_FROM_TIME)[eq]4@*14"
expj.AD0100010.AD0100010button1.Select.onClick13 = function () {
  console.log('Select script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script15="onClick;14;CHK;_AD0100010form1/TIME_CTRL[eq]true[and]~LEN(_AD0100010form1/PRD_DUE_DATE_TO_TIME)[eq]3@*11"
expj.AD0100010.AD0100010button1.Select.onClick14 = function () {
  console.log('Select script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="onClick;15;CHK;_AD0100010form1/TIME_CTRL[eq]true[and]~LEN(_AD0100010form1/PRD_DUE_DATE_TO_TIME)[eq]4@*15"
expj.AD0100010.AD0100010button1.Select.onClick15 = function () {
  console.log('Select script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script17="onClick;16;CHK;_AD0100010form1/PRD_DUE_DATE_FROM[neq][and]_AD0100010form1/PRD_DUE_DATE_TO[neq][and]_AD0100010form1/PRD_DUE_DATE_TO[lt]_AD0100010form1/PRD_DUE_DATE_FROM@!ZZ05101"
expj.AD0100010.AD0100010button1.Select.onClick16 = function () {
  console.log('Select script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM')))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'ZZ05101');
}
};
// script18="onClick;17;CHK;_AD0100010form1/PRD_START_DATE_FROM[neq][and]_AD0100010form1/PRD_START_DATE_TO[neq][and]_AD0100010form1/PRD_START_DATE_TO[lt]_AD0100010form1/PRD_START_DATE_FROM@!ZZ05101"
expj.AD0100010.AD0100010button1.Select.onClick17 = function () {
  console.log('Select script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM')))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'ZZ05101');
}
};
// script19="onClick;18;CHK;_AD0100010form1/TIME_CTRL[eq]true[and]_AD0100010form1/PRD_DUE_DATE_FROM[eq]_AD0100010form1/PRD_DUE_DATE_TO@*16"
expj.AD0100010.AD0100010button1.Select.onClick18 = function () {
  console.log('Select script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO'))) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script20="onClick;19;CHK;_AD0100010form1/TIME_CTRL[eq]true[and]_AD0100010form1/PRD_START_DATE_FROM[eq]_AD0100010form1/PRD_START_DATE_TO@*18"
expj.AD0100010.AD0100010button1.Select.onClick19 = function () {
  console.log('Select script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO'))) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script21="onClick;20;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0100010form1/*@AD0100010Servlet,,"
expj.AD0100010.AD0100010button1.Select.onClick20 = function () {
  console.log('Select script21');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0100010', 'AD0100010button1', '_AD0100010form1/*', 'AD0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0100010', response);
expj.common.updateBusinessScreenTab('AD0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script22="child;0;CHK;_AD0100010form1/PRD_START_DATE_FROM[eq][and]_AD0100010form1/PRD_START_DATE_FROM_TIME[neq]@!AS00051"
expj.AD0100010.AD0100010button1.Select.child0 = function () {
  console.log('Select script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00051');
}
};
// script23="child;1;CHK;_AD0100010form1/PRD_START_DATE_TO[eq][and]_AD0100010form1/PRD_START_DATE_TO_TIME[neq]@!AS00052"
expj.AD0100010.AD0100010button1.Select.child1 = function () {
  console.log('Select script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00052');
}
};
// script24="child;2;CHK;_AD0100010form1/PRD_DUE_DATE_FROM[eq][and]_AD0100010form1/PRD_DUE_DATE_FROM_TIME[neq]@!AS00053"
expj.AD0100010.AD0100010button1.Select.child2 = function () {
  console.log('Select script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00053');
}
};
// script25="child;3;CHK;_AD0100010form1/PRD_DUE_DATE_TO[eq][and]_AD0100010form1/PRD_DUE_DATE_TO_TIME[neq]@!AS00054"
expj.AD0100010.AD0100010button1.Select.child3 = function () {
  console.log('Select script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00054');
}
};
// script26="child;4;CHK;~LEN(_AD0100010form1/PRD_START_DATE_FROM_TIME)[eq]1[or]~LEN(_AD0100010form1/PRD_START_DATE_FROM_TIME)[eq]2@!AS00055"
expj.AD0100010.AD0100010button1.Select.child4 = function () {
  console.log('Select script26');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00055');
}
};
// script27="child;5;CHK;~LEN(_AD0100010form1/PRD_START_DATE_TO_TIME)[eq]1[or]~LEN(_AD0100010form1/PRD_START_DATE_TO_TIME)[eq]2@!AS00056"
expj.AD0100010.AD0100010button1.Select.child5 = function () {
  console.log('Select script27');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00056');
}
};
// script28="child;6;CHK;~LEN(_AD0100010form1/PRD_DUE_DATE_FROM_TIME)[eq]1[or]~LEN(_AD0100010form1/PRD_DUE_DATE_FROM_TIME)[eq]2@!AS00057"
expj.AD0100010.AD0100010button1.Select.child6 = function () {
  console.log('Select script28');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00057');
}
};
// script29="child;7;CHK;~LEN(_AD0100010form1/PRD_DUE_DATE_TO_TIME)[eq]1[or]~LEN(_AD0100010form1/PRD_DUE_DATE_TO_TIME)[eq]2@!AS00058"
expj.AD0100010.AD0100010button1.Select.child7 = function () {
  console.log('Select script29');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00058');
}
};
// script30="child;8;CHK;[{~CHARAT(_AD0100010form1/PRD_START_DATE_FROM_TIME:1)}*10+{~CHARAT(_AD0100010form1/PRD_START_DATE_FROM_TIME:2)}][gte]60@!AS00059"
expj.AD0100010.AD0100010button1.Select.child8 = function () {
  console.log('Select script30');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00059');
}
};
// script31="child;9;CHK;[{~CHARAT(_AD0100010form1/PRD_START_DATE_TO_TIME:1)}*10+{~CHARAT(_AD0100010form1/PRD_START_DATE_TO_TIME:2)}][gte]60@!AS00060"
expj.AD0100010.AD0100010button1.Select.child9 = function () {
  console.log('Select script31');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00060');
}
};
// script32="child;10;CHK;[{~CHARAT(_AD0100010form1/PRD_DUE_DATE_FROM_TIME:1)}*10+{~CHARAT(_AD0100010form1/PRD_DUE_DATE_FROM_TIME:2)}][gte]60@!AS00061"
expj.AD0100010.AD0100010button1.Select.child10 = function () {
  console.log('Select script32');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00061');
}
};
// script33="child;11;CHK;[{~CHARAT(_AD0100010form1/PRD_DUE_DATE_TO_TIME:1)}*10+{~CHARAT(_AD0100010form1/PRD_DUE_DATE_TO_TIME:2)}][gte]60@!AS00062"
expj.AD0100010.AD0100010button1.Select.child11 = function () {
  console.log('Select script33');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00062');
}
};
// script34="child;12;CHK;[{~CHARAT(_AD0100010form1/PRD_START_DATE_FROM_TIME:0)}*10+{~CHARAT(_AD0100010form1/PRD_START_DATE_FROM_TIME:1)}][gte]24[or][{~CHARAT(_AD0100010form1/PRD_START_DATE_FROM_TIME:2)}*10+{~CHARAT(_AD0100010form1/PRD_START_DATE_FROM_TIME:3)}][gte]60@!AS00059"
expj.AD0100010.AD0100010button1.Select.child12 = function () {
  console.log('Select script34');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00059');
}
};
// script35="child;13;CHK;[{~CHARAT(_AD0100010form1/PRD_START_DATE_TO_TIME:0)}*10+{~CHARAT(_AD0100010form1/PRD_START_DATE_TO_TIME:1)}][gte]24[or][{~CHARAT(_AD0100010form1/PRD_START_DATE_TO_TIME:2)}*10+{~CHARAT(_AD0100010form1/PRD_START_DATE_TO_TIME:3)}][gte]60@!AS00060"
expj.AD0100010.AD0100010button1.Select.child13 = function () {
  console.log('Select script35');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00060');
}
};
// script36="child;14;CHK;[{~CHARAT(_AD0100010form1/PRD_DUE_DATE_FROM_TIME:0)}*10+{~CHARAT(_AD0100010form1/PRD_DUE_DATE_FROM_TIME:1)}][gte]24[or][{~CHARAT(_AD0100010form1/PRD_DUE_DATE_FROM_TIME:2)}*10+{~CHARAT(_AD0100010form1/PRD_DUE_DATE_FROM_TIME:3)}][gte]60@!AS00061"
expj.AD0100010.AD0100010button1.Select.child14 = function () {
  console.log('Select script36');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00061');
}
};
// script37="child;15;CHK;[{~CHARAT(_AD0100010form1/PRD_DUE_DATE_TO_TIME:0)}*10+{~CHARAT(_AD0100010form1/PRD_DUE_DATE_TO_TIME:1)}][gte]24[or][{~CHARAT(_AD0100010form1/PRD_DUE_DATE_TO_TIME:2)}*10+{~CHARAT(_AD0100010form1/PRD_DUE_DATE_TO_TIME:3)}][gte]60@!AS00062"
expj.AD0100010.AD0100010button1.Select.child15 = function () {
  console.log('Select script37');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'AS00062');
}
};
// script38="child;16;CHK;_AD0100010form1/PRD_DUE_DATE_FROM[neq][and]_AD0100010form1/PRD_DUE_DATE_TO[neq]@*17"
expj.AD0100010.AD0100010button1.Select.child16 = function () {
  console.log('Select script38');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script39="child;17;CHK;_AD0100010form1/PRD_DUE_DATE_FROM_TIME[gt]_AD0100010form1/PRD_DUE_DATE_TO_TIME@!ZZ05101"
expj.AD0100010.AD0100010button1.Select.child17 = function () {
  console.log('Select script39');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_FROM_TIME')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_DUE_DATE_TO_TIME')))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'ZZ05101');
}
};
// script40="child;18;CHK;_AD0100010form1/PRD_START_DATE_FROM[neq][and]_AD0100010form1/PRD_START_DATE_TO[neq]@*19"
expj.AD0100010.AD0100010button1.Select.child18 = function () {
  console.log('Select script40');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script41="child;19;CHK;_AD0100010form1/PRD_START_DATE_FROM_TIME[gt]_AD0100010form1/PRD_START_DATE_TO_TIME@!ZZ05101"
expj.AD0100010.AD0100010button1.Select.child19 = function () {
  console.log('Select script41');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_FROM_TIME')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0100010', 'AD0100010button1', '_AD0100010form1/PRD_START_DATE_TO_TIME')))) {
expj.common.pscript.viewErrorMessage('AD0100010', 'AD0100010button1', 'ZZ05101');
}
};
expj.AD0100010.AD0100010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 20; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010button1.Select['onClick' + i])) {
        expj.AD0100010.AD0100010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010button1.Select.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010button1.Select.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010button1', 'Select', this, 'Button');
    }
  });
  expj.AD0100010.AD0100010button1.Select.executePScriptOnLoad();
};

expj.AD0100010.AD0100010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AD0100010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0100010-AD0100010button1-Select" name="Select" class="AD0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- 2段目のDataGrid配置↓ --><script class="expj-script-AD0100010-AD0100010view1">
expj.AD0100010.AD0100010view1 = {};
expj.AD0100010.AD0100010view1.executeAllOnClick = function () {
};
expj.AD0100010.AD0100010view1.executeAllOnDecision = function () {
  console.log('execute AD0100010view1.onDecision');
};
expj.AD0100010.AD0100010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0100010view1", "expj.AD0100010.AD0100010view1.executeAllOnClick");
%>
  expj.AD0100010.AD0100010view1.executePScriptOnLoad();
};

expj.AD0100010.AD0100010view1.executePScriptOnLoad = function () {
  console.log('execute AD0100010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0100010-AD0100010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0100010view1_Id = "AD0100010view1";
 String AD0100010view1_select = "single";
 String AD0100010view1_sortable = "true";
 String AD0100010view1_resize = "true";
 String AD0100010view1_scroll = "true";
 StringBuffer AD0100010view1_HB = new StringBuffer();
 StringBuffer AD0100010view1_DB = new StringBuffer();
%>
<%
 AD0100010view1_select = "multi";
 AD0100010view1_sortable = "true";
 AD0100010view1_resize = "true";
 AD0100010view1_scroll = "true";
%>
<%
 AD0100010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
%>
     
<%
AD0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'l_WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_NAME",rb))).append("', 'name':'l_WS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb))).append("', 'name':'l_OPR_INST_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb))).append("', 'name':'l_PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_QTY",rb))).append("', 'name':'l_OPR_INST_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_QTY_1",rb))).append("', 'name':'l_RCV_QTY_1', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'175px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_CD",rb))).append("', 'name':'l_WORK_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_l_ODR_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
AD0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_l_OPR_INST_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0100010view1_sortable).append("}").append(",");
%>
<%
 int aAD0100010StructLength = aAD0100010Control.getListsize();
 final AD0100010Struct structBackup = aAD0100010Struct;
 aAD0100010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0100010StructLength; ++loopCount) {
  if((aAD0100010Struct = (AD0100010Struct) aAD0100010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0100010Struct", aAD0100010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0100010view1_DB.append("[");
 AD0100010view1_DB.append(loopCount);
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0100010Struct.getl_ITEM_CD())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0100010Struct.getl_ITEM_NAME())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-l_WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-l_WS_CD\" data-name=\"l_WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0100010Struct.getl_WS_CD())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-l_WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-l_WS_NAME\" data-name=\"l_WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0100010Struct.getl_WS_NAME())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-l_OPR_INST_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-l_OPR_INST_START_DATE\" data-name=\"l_OPR_INST_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0100010Struct.getl_OPR_INST_START_DATE())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-l_PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-l_PRD_DUE_DATE\" data-name=\"l_PRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0100010Struct.getl_PRD_DUE_DATE())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-l_OPR_INST_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-l_OPR_INST_QTY\" data-name=\"l_OPR_INST_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0100010Struct.getl_OPR_INST_QTY())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-l_RCV_QTY_1-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-l_RCV_QTY_1\" data-name=\"l_RCV_QTY_1\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0100010Struct.getl_RCV_QTY_1())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-l_WORK_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-l_WORK_ODR_CD\" data-name=\"l_WORK_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0100010Struct.getl_WORK_ODR_CD())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-h_l_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-h_l_ODR_NO\" data-name=\"h_l_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0100010Struct.geth_l_ODR_NO())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-h_l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-h_l_MODIFY_COUNT\" data-name=\"h_l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0100010Struct.geth_l_MODIFY_COUNT())).append("</span>'");
 AD0100010view1_DB.append(",").append("'<span id=\"expj-AD0100010-AD0100010view1-h_l_OPR_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0100010-AD0100010view1-h_l_OPR_INST_CD\" data-name=\"h_l_OPR_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0100010Struct.geth_l_OPR_INST_CD())).append("</span>'");
 AD0100010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0100010StructLength) {
   AD0100010view1_DB.append(",");
  }
 }
 aAD0100010Struct = structBackup;
 viewIdList.add(AD0100010view1_Id);
 viewSelectList.add(AD0100010view1_select);
 viewResizeList.add(AD0100010view1_resize);
 viewScrollList.add(AD0100010view1_scroll);
 viewHeaderDataList.add(AD0100010view1_HB);
 viewBodyDataList.add(AD0100010view1_DB);
%>
<%
}
%>
<!-- 2段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AD0100010-AD0100010button2">
expj.AD0100010.AD0100010button2 = {};
expj.AD0100010.AD0100010button2.executeAllOnDecision = function () {
  console.log('execute AD0100010button2.onDecision');
};
expj.AD0100010.AD0100010button2.executeOnLoad = function () {
  expj.AD0100010.AD0100010button2.executePScriptOnLoad();
};

expj.AD0100010.AD0100010button2.executePScriptOnLoad = function () {
  console.log('execute AD0100010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0100010-AD0100010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0100010-AD0100010button2-Choice_Compulsion_Completion">
expj.AD0100010.AD0100010button2.Choice_Compulsion_Completion = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0100010view1/+,_AD0100010form1/*@AD0100010Servlet,,"
expj.AD0100010.AD0100010button2.Choice_Compulsion_Completion.onClick0 = function () {
  console.log('Choice_Compulsion_Completion script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0100010', 'AD0100010button2', '_AD0100010view1/+,_AD0100010form1/*', 'AD0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0100010', response);
expj.common.updateBusinessScreenTab('AD0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0100010.AD0100010button2.Choice_Compulsion_Completion.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010button2.Choice_Compulsion_Completion['onClick' + i])) {
        expj.AD0100010.AD0100010button2.Choice_Compulsion_Completion['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010button2.Choice_Compulsion_Completion.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010button2.Choice_Compulsion_Completion.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010button2-Choice_Compulsion_Completion').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010button2', 'Choice_Compulsion_Completion', this, 'Button');
    }
  });
  expj.AD0100010.AD0100010button2.Choice_Compulsion_Completion.executePScriptOnLoad();
};

expj.AD0100010.AD0100010button2.Choice_Compulsion_Completion.executePScriptOnLoad = function () {
  console.log('execute AD0100010button2/Choice_Compulsion_Completion.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010button2-Choice_Compulsion_Completion');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0100010-AD0100010button2-Choice_Compulsion_Completion" name="Choice_Compulsion_Completion" class="AD0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnChoice_Compulsion_Completion",rb)%></button><!-- 選択強制完了ボタン --></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010button2-CheckAll">
expj.AD0100010.AD0100010button2.CheckAll = {};
// script1="onClick;0;DGSALL;AD0100010view1"
expj.AD0100010.AD0100010button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('AD0100010', 'AD0100010view1');
};
expj.AD0100010.AD0100010button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010button2.CheckAll['onClick' + i])) {
        expj.AD0100010.AD0100010button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010button2.CheckAll.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010button2.CheckAll.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010button2', 'CheckAll', this, 'Button');
    }
  });
  expj.AD0100010.AD0100010button2.CheckAll.executePScriptOnLoad();
};

expj.AD0100010.AD0100010button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute AD0100010button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0100010-AD0100010button2-CheckAll" name="CheckAll" class="AD0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010button2-CheckClear">
expj.AD0100010.AD0100010button2.CheckClear = {};
// script1="onClick;0;DGSCANCEL;AD0100010view1"
expj.AD0100010.AD0100010button2.CheckClear.onClick0 = function () {
  console.log('CheckClear script1');
expj.common.pscript.unselectVIEWAllRow('AD0100010', 'AD0100010view1');
};
expj.AD0100010.AD0100010button2.CheckClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010button2.CheckClear['onClick' + i])) {
        expj.AD0100010.AD0100010button2.CheckClear['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010button2.CheckClear.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010button2.CheckClear.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010button2-CheckClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010button2', 'CheckClear', this, 'Button');
    }
  });
  expj.AD0100010.AD0100010button2.CheckClear.executePScriptOnLoad();
};

expj.AD0100010.AD0100010button2.CheckClear.executePScriptOnLoad = function () {
  console.log('execute AD0100010button2/CheckClear.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010button2-CheckClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0100010-AD0100010button2-CheckClear" name="CheckClear" class="AD0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
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
<span class="version">AD0100010 Revision: 1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AD0100010-AD0100010button0">
expj.AD0100010.AD0100010button0 = {};
expj.AD0100010.AD0100010button0.executeAllOnDecision = function () {
  console.log('execute AD0100010button0.onDecision');
};
expj.AD0100010.AD0100010button0.executeOnLoad = function () {
  expj.AD0100010.AD0100010button0.executePScriptOnLoad();
};

expj.AD0100010.AD0100010button0.executePScriptOnLoad = function () {
  console.log('execute AD0100010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0100010-AD0100010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0100010-AD0100010button0-Clear">
expj.AD0100010.AD0100010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AD0100010Servlet,,$ZZ07008"
expj.AD0100010.AD0100010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0100010', 'AD0100010button0', '', 'AD0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0100010', response);
expj.common.updateBusinessScreenTab('AD0100010', contents);
};
expj.common.pscript.callConfirm('AD0100010', 'AD0100010button0', 'ZZ07008', okEvent);
};
expj.AD0100010.AD0100010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010button0.Clear['onClick' + i])) {
        expj.AD0100010.AD0100010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010button0.Clear.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010button0.Clear.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0100010.AD0100010button0.Clear.executePScriptOnLoad();
};

expj.AD0100010.AD0100010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0100010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0100010-AD0100010button0-Clear" name="Clear" class="AD0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0100010-AD0100010button0-Close">
expj.AD0100010.AD0100010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0100010.AD0100010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0100010');
};
expj.AD0100010.AD0100010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0100010.AD0100010button0.Close['onClick' + i])) {
        expj.AD0100010.AD0100010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0100010.AD0100010button0.Close.executeAllOnDecision = function () {
};
expj.AD0100010.AD0100010button0.Close.executeOnLoad = function () {
  $('#expj-AD0100010-AD0100010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0100010', 'AD0100010button0', 'Close', this, 'Button');
    }
  });
  expj.AD0100010.AD0100010button0.Close.executePScriptOnLoad();
};

expj.AD0100010.AD0100010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0100010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0100010-AD0100010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0100010-AD0100010button0-Close" name="Close" class="AD0100010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0100010 (END)-->
<%
MessageStruct msgStruct = aAD0100010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0100010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0100010)) {
  expj.common.treeInstanceMap.AD0100010 = {};
}
expj.common.treeInstanceMap.AD0100010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0100010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0100010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0100010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0100010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0100010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0100010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0100010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0100010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0100010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0100010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0100010)) {
  expj.common.detailDialogMap.AD0100010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0100010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0100010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0100010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0100010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0100010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0100010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0100010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0100010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0100010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0100010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0100010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0100010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0100010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0100010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0100010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0100010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0100010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0100010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0100010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0100010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0100010)) {
  expj.common.viewInstanceMap.AD0100010 = {};
}
expj.common.viewInstanceMap.AD0100010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0100010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0100010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0100010.<%=viewId %>.init = function () {
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
    expj.AD0100010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0100010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0100010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0100010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0100010_init">
/**
 * AD0100010用のロード完了時初期化関数
 */
expj.AD0100010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0100010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0100010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0100010');
  expj.common.calendarInstanceMap.AD0100010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0100010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0100010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0100010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0100010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0100010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0100010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0100010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0100010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0100010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0100010.AD0100010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.PeekerWsCode.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.CalendarProdStartDateFrom.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.PRD_START_DATE_FROM_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.PRD_START_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.CalendarProdStartDateTo.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.PRD_START_DATE_TO_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.CalendarPrdDueDateFrom.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.PRD_DUE_DATE_FROM_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.CalendarPrdDueDateTo.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.PRD_DUE_DATE_TO_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010button2.Choice_Compulsion_Completion.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010button2.CheckClear.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010form1.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010button1.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010view1.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010button2.executeOnLoad();}catch(e){};
  try{expj.AD0100010.AD0100010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0100010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0100010', 'AD0100010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0100010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0100010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0100010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0100010', '<%=request.getContextPath() %>');
};

/**
 * AD0100010の全体onDecision処理
 */
expj.AD0100010.executeAllOnDecision = function () {
  expj.AD0100010.AD0100010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0100010_console">
expj.AD0100010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>