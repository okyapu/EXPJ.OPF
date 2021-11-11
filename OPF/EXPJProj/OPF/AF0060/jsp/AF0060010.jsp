<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:39:11 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0060\AF0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0060.*" %>
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
<jsp:useBean id="aAF0060010Control" class="com.nec.jp.orteus.metamorBase.AF0060.AF0060010Control" scope="request"/>
<jsp:useBean id="aAF0060010Struct" class="com.nec.jp.orteus.metamorBase.AF0060.AF0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

保管区移動入庫実績入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0060/jsp/AF0060010.jsp,v $
$Author: geng-jia $	
$Revision: 1.20 $ $Date: 2017/02/22 02:05:45 $
********************************************************* --%>
<html>
<head>
<title>保管区移動入庫実績入力</title>
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
<script class="expj-script-AF0060010_init">
  // AF0060010名前空間
  expj.AF0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AF0060010" data-screen="AF0060010" data-newdata="<%=aAF0060010Control.isNewData() %>">
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
              <script class="expj-script-AF0060010-AF0060010form1">
expj.AF0060010.AF0060010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AF0060010.AF0060010form1.onLoad0 = function () {
  console.log('AF0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*2"
expj.AF0060010.AF0060010form1.onDecision0 = function () {
  console.log('AF0060010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AF0060010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;UNMASK;_AF0060010button1/select@*1"
expj.AF0060010.AF0060010form1.child0 = function () {
  console.log('AF0060010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;MASK;_AF0060010button2/modify,_AF0060010button0/CancelCompleteChoice"
expj.AF0060010.AF0060010form1.child1 = function () {
  console.log('AF0060010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button0/CancelCompleteChoice');
};
// script5="child;2;MASK;_AF0060010button1/select@*3"
expj.AF0060010.AF0060010form1.child2 = function () {
  console.log('AF0060010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script6="child;3;MASK;_AF0060010button2/modify,_AF0060010button0/CancelCompleteChoice"
expj.AF0060010.AF0060010form1.child3 = function () {
  console.log('AF0060010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button0/CancelCompleteChoice');
};
// script7="onDecision;1;CHK;?AF0060010form1/RCV_WH_CD[eq]?AF0060010form1/h_RCV_WH_CD[and]?AF0060010form1/TRANSPORT_CMPLT_TYP[eq]SAME[and]?AF0060010form1/*[eq]NORMAL@*4"
expj.AF0060010.AF0060010form1.onDecision1 = function () {
  console.log('AF0060010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '?AF0060010form1/RCV_WH_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '?AF0060010form1/h_RCV_WH_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '?AF0060010form1/TRANSPORT_CMPLT_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '?AF0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;4;UNMASK;_AF0060010button1/select@*5"
expj.AF0060010.AF0060010form1.child4 = function () {
  console.log('AF0060010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script9="child;5;CHKRQ;?AF0060010view1/?[eq]SINGLE@*6,*7"
expj.AF0060010.AF0060010form1.child5 = function () {
  console.log('AF0060010form1 script9');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '?AF0060010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;6;UNMASK;_AF0060010button2/modify"
expj.AF0060010.AF0060010form1.child6 = function () {
  console.log('AF0060010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button2/modify');
};
// script11="child;7;MASK;_AF0060010button2/modify"
expj.AF0060010.AF0060010form1.child7 = function () {
  console.log('AF0060010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button2/modify');
};
// script12="onDecision;2;CHK;?AF0060010form1/RCV_WH_CD[eq]?AF0060010form1/h_RCV_WH_CD[and]?AF0060010form1/TRANSPORT_CMPLT_TYP[eq]SAME[and]?AF0060010form1/*[eq]NORMAL@*8"
expj.AF0060010.AF0060010form1.onDecision2 = function () {
  console.log('AF0060010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '?AF0060010form1/RCV_WH_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '?AF0060010form1/h_RCV_WH_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '?AF0060010form1/TRANSPORT_CMPLT_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '?AF0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script13="child;8;CHK;_AF0060010form1/hid_TRANSPORT_CMPLT_TYP[eq]1@*9,*11"
expj.AF0060010.AF0060010form1.child8 = function () {
  console.log('AF0060010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '_AF0060010form1/hid_TRANSPORT_CMPLT_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script14="child;9;CHKRQ;?AF0060010view1/?[eq]SINGLE@*10,*11"
expj.AF0060010.AF0060010form1.child9 = function () {
  console.log('AF0060010form1 script14');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '?AF0060010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script15="child;10;UNMASK;_AF0060010button0/CancelCompleteChoice"
expj.AF0060010.AF0060010form1.child10 = function () {
  console.log('AF0060010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button0/CancelCompleteChoice');
};
// script16="child;11;MASK;_AF0060010button0/CancelCompleteChoice"
expj.AF0060010.AF0060010form1.child11 = function () {
  console.log('AF0060010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AF0060010', 'AF0060010form1', '_AF0060010button0/CancelCompleteChoice');
};
expj.AF0060010.AF0060010form1.executeAllOnDecision = function () {
  console.log('execute AF0060010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060010form1['onDecision' + i])) {
        expj.AF0060010.AF0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060010form1.executeOnLoad = function () {
  expj.AF0060010.AF0060010form1.executePScriptOnLoad();
};

expj.AF0060010.AF0060010form1.executePScriptOnLoad = function () {
  console.log('execute AF0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0060010.AF0060010form1['onLoad' + i])) {
      expj.AF0060010.AF0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0060010-AF0060010form1" action="AF0060010Servlet" name="AF0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAF0060010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.RCV_WH_CD",rb)%></span><!-- 入庫保管区コード --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060010form1-RCV_WH_CD">
expj.AF0060010.AF0060010form1.RCV_WH_CD = {};
expj.AF0060010.AF0060010form1.RCV_WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0060010form1/RCV_WH_CD.onDecision');
  expj.AF0060010.AF0060010form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060010form1.RCV_WH_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010form1-RCV_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060010form1', 'RCV_WH_CD', this);
  });
  expj.AF0060010.AF0060010form1.RCV_WH_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060010form1.RCV_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060010form1/RCV_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010form1-RCV_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060010form1-RCV_WH_CD" name="RCV_WH_CD" class="AF0060010-focus-move  required-value expj-AF0060010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AF0060010-AF0060010form1-RCV_PLANT_CD" name="RCV_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_PLANT_CD()) %>">
<script class="expj-script-AF0060010-AF0060010form1-RCV_PLANT_CD">
expj.AF0060010.AF0060010form1.RCV_PLANT_CD = {};
expj.AF0060010.AF0060010form1.RCV_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AF0060010form1/RCV_PLANT_CD.onDecision');
  expj.AF0060010.AF0060010form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060010form1.RCV_PLANT_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010form1-RCV_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060010form1', 'RCV_PLANT_CD', this);
  });
  expj.AF0060010.AF0060010form1.RCV_PLANT_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060010form1.RCV_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060010form1/RCV_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010form1-RCV_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AF0060010-AF0060010form1-RCV_PLANT_NAME" name="RCV_PLANT_NAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_PLANT_NAME()) %>">
<script class="expj-script-AF0060010-AF0060010form1-RCV_PLANT_NAME">
expj.AF0060010.AF0060010form1.RCV_PLANT_NAME = {};
expj.AF0060010.AF0060010form1.RCV_PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AF0060010form1/RCV_PLANT_NAME.onDecision');
  expj.AF0060010.AF0060010form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060010form1.RCV_PLANT_NAME.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010form1-RCV_PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060010form1', 'RCV_PLANT_NAME', this);
  });
  expj.AF0060010.AF0060010form1.RCV_PLANT_NAME.executePScriptOnLoad();
};

expj.AF0060010.AF0060010form1.RCV_PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0060010form1/RCV_PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010form1-RCV_PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AF0060010-AF0060010form1-PeekerRcvWhCd">
expj.AF0060010.AF0060010form1.PeekerRcvWhCd = {};
// script1="onClick;0;PEEKER;_AF0060010form1/RCV_WH_CD@<%=contextNo%>"
expj.AF0060010.AF0060010form1.PeekerRcvWhCd.onClick0 = function () {
  console.log('PeekerRcvWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0060010';
var parameterValues = 'PeekerRcvWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0060010', 'PeekerRcvWhCd', 'SQLPARAM_1', '<%=aAF0060010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0060010', 'AF0060010form1', '_AF0060010form1/RCV_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0060010form1/RCV_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0060010.AF0060010form1.PeekerRcvWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060010form1.PeekerRcvWhCd['onClick' + i])) {
        expj.AF0060010.AF0060010form1.PeekerRcvWhCd['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060010form1.PeekerRcvWhCd.executeAllOnDecision = function () {
};
expj.AF0060010.AF0060010form1.PeekerRcvWhCd.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010form1-PeekerRcvWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060010form1', 'PeekerRcvWhCd', this, 'Button');
    }
  });
  expj.AF0060010.AF0060010form1.PeekerRcvWhCd.executePScriptOnLoad();
};

expj.AF0060010.AF0060010form1.PeekerRcvWhCd.executePScriptOnLoad = function () {
  console.log('execute AF0060010form1/PeekerRcvWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010form1-PeekerRcvWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0060010-AF0060010form1-PeekerRcvWhCd" class="AF0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0060010-AF0060010form1-RCV_WH_NAME">
expj.AF0060010.AF0060010form1.RCV_WH_NAME = {};
expj.AF0060010.AF0060010form1.RCV_WH_NAME.executeAllOnDecision = function () {
  console.log('execute AF0060010form1/RCV_WH_NAME.onDecision');
  expj.AF0060010.AF0060010form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060010form1.RCV_WH_NAME.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010form1-RCV_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060010form1', 'RCV_WH_NAME', this);
  });
  expj.AF0060010.AF0060010form1.RCV_WH_NAME.executePScriptOnLoad();
};

expj.AF0060010.AF0060010form1.RCV_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0060010form1/RCV_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010form1-RCV_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0060010-AF0060010form1-RCV_WH_NAME" name="RCV_WH_NAME" class="AF0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0060010Struct.getRCV_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AF0060010-AF0060010form1-h_RCV_WH_CD" name="h_RCV_WH_CD" class="" data-kind="" maxlength="2147483647" value="">
<script class="expj-script-AF0060010-AF0060010form1-h_RCV_WH_CD">
expj.AF0060010.AF0060010form1.h_RCV_WH_CD = {};
expj.AF0060010.AF0060010form1.h_RCV_WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0060010form1/h_RCV_WH_CD.onDecision');
  expj.AF0060010.AF0060010form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060010form1.h_RCV_WH_CD.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010form1-h_RCV_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060010form1', 'h_RCV_WH_CD', this);
  });
  expj.AF0060010.AF0060010form1.h_RCV_WH_CD.executePScriptOnLoad();
};

expj.AF0060010.AF0060010form1.h_RCV_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0060010form1/h_RCV_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010form1-h_RCV_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TRANSPORT_CMPLT_TYP",rb)%></span><!-- 積送完了フラグ --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060010form1-TRANSPORT_CMPLT_TYP">
expj.AF0060010.AF0060010form1.TRANSPORT_CMPLT_TYP = {};
expj.AF0060010.AF0060010form1.TRANSPORT_CMPLT_TYP.executeAllOnDecision = function () {
  console.log('execute AF0060010form1/TRANSPORT_CMPLT_TYP.onDecision');
  expj.AF0060010.AF0060010form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060010form1.TRANSPORT_CMPLT_TYP.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010form1-TRANSPORT_CMPLT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0060010', 'AF0060010form1', 'TRANSPORT_CMPLT_TYP', this);
  });
  expj.AF0060010.AF0060010form1.TRANSPORT_CMPLT_TYP.executePScriptOnLoad();
};

expj.AF0060010.AF0060010form1.TRANSPORT_CMPLT_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0060010form1/TRANSPORT_CMPLT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010form1-TRANSPORT_CMPLT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0060010-AF0060010form1-TRANSPORT_CMPLT_TYP" name='TRANSPORT_CMPLT_TYP' class='AF0060010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0060010Control.getStruct().getList_TRANSPORT_CMPLT_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0060010Control.getStruct().getList_TRANSPORT_CMPLT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0060010Control.getStruct().getList_TRANSPORT_CMPLT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0060010Struct.getTRANSPORT_CMPLT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-AF0060010-AF0060010form1-hid_TRANSPORT_CMPLT_TYP" name="hid_TRANSPORT_CMPLT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.gethid_TRANSPORT_CMPLT_TYP()) %>">
<script class="expj-script-AF0060010-AF0060010form1-hid_TRANSPORT_CMPLT_TYP">
expj.AF0060010.AF0060010form1.hid_TRANSPORT_CMPLT_TYP = {};
expj.AF0060010.AF0060010form1.hid_TRANSPORT_CMPLT_TYP.executeAllOnDecision = function () {
  console.log('execute AF0060010form1/hid_TRANSPORT_CMPLT_TYP.onDecision');
  expj.AF0060010.AF0060010form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060010form1.hid_TRANSPORT_CMPLT_TYP.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010form1-hid_TRANSPORT_CMPLT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060010form1', 'hid_TRANSPORT_CMPLT_TYP', this);
  });
  expj.AF0060010.AF0060010form1.hid_TRANSPORT_CMPLT_TYP.executePScriptOnLoad();
};

expj.AF0060010.AF0060010form1.hid_TRANSPORT_CMPLT_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0060010form1/hid_TRANSPORT_CMPLT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010form1-hid_TRANSPORT_CMPLT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<input type="hidden" id="expj-AF0060010-AF0060010form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0060010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AF0060010-AF0060010form1-h_lotCtrl">
expj.AF0060010.AF0060010form1.h_lotCtrl = {};
expj.AF0060010.AF0060010form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AF0060010form1/h_lotCtrl.onDecision');
  expj.AF0060010.AF0060010form1.executeAllOnDecision();
  expj.AF0060010.executeAllOnDecision();
};
expj.AF0060010.AF0060010form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0060010', 'AF0060010form1', 'h_lotCtrl', this);
  });
  expj.AF0060010.AF0060010form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AF0060010.AF0060010form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AF0060010form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010form1-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0060010-AF0060010button1">
expj.AF0060010.AF0060010button1 = {};
expj.AF0060010.AF0060010button1.executeAllOnDecision = function () {
  console.log('execute AF0060010button1.onDecision');
};
expj.AF0060010.AF0060010button1.executeOnLoad = function () {
  expj.AF0060010.AF0060010button1.executePScriptOnLoad();
};

expj.AF0060010.AF0060010button1.executePScriptOnLoad = function () {
  console.log('execute AF0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0060010-AF0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0060010-AF0060010button1-select">
expj.AF0060010.AF0060010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0060010form1/*@AF0060010Servlet"
expj.AF0060010.AF0060010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0060010', 'AF0060010button1', '_AF0060010form1/*', 'AF0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0060010', response);
expj.common.updateBusinessScreenTab('AF0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0060010.AF0060010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060010button1.select['onClick' + i])) {
        expj.AF0060010.AF0060010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060010button1.select.executeAllOnDecision = function () {
};
expj.AF0060010.AF0060010button1.select.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060010button1', 'select', this, 'Button');
    }
  });
  expj.AF0060010.AF0060010button1.select.executePScriptOnLoad();
};

expj.AF0060010.AF0060010button1.select.executePScriptOnLoad = function () {
  console.log('execute AF0060010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0060010-AF0060010button1-select" name="select" class="AF0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AF0060010-AF0060010view1">
expj.AF0060010.AF0060010view1 = {};
expj.AF0060010.AF0060010view1.executeAllOnClick = function () {
};
expj.AF0060010.AF0060010view1.executeAllOnDecision = function () {
  console.log('execute AF0060010view1.onDecision');
};
expj.AF0060010.AF0060010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AF0060010view1", "expj.AF0060010.AF0060010view1.executeAllOnClick");
%>
  expj.AF0060010.AF0060010view1.executePScriptOnLoad();
};

expj.AF0060010.AF0060010view1.executePScriptOnLoad = function () {
  console.log('execute AF0060010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AF0060010-AF0060010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AF0060010view1_Id = "AF0060010view1";
 String AF0060010view1_select = "single";
 String AF0060010view1_sortable = "true";
 String AF0060010view1_resize = "true";
 String AF0060010view1_scroll = "true";
 StringBuffer AF0060010view1_HB = new StringBuffer();
 StringBuffer AF0060010view1_DB = new StringBuffer();
%>
<%
 AF0060010view1_select = "single";
 AF0060010view1_sortable = "true";
 AF0060010view1_resize = "true";
 AF0060010view1_scroll = "true";
%>
<%
 AF0060010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
%>
     
<%
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'w_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TRANSPORT_SLIP_CD",rb))).append("', 'name':'TRANSPORT_SLIP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'w_UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_QTY_1",rb))).append("', 'name':'ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_QTY",rb))).append("', 'name':'RCV_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0426",rb))).append("', 'name':'w_LEAVE_RCV_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_DATE",rb))).append("', 'name':'RCV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'0px', 'title':'', 'name':'w_WH_STOCK_ON_HAND_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0306",rb))).append("', 'name':'w_TOTAL_STOCK_ON_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'VEND_LOT_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_ANAME",rb))).append("', 'name':'VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_PLANT_CD_1",rb))).append("', 'name':'ISSUE_PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_NAME_1",rb))).append("', 'name':'ISSUE_PLANT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_WH_CD",rb))).append("', 'name':'ISSUE_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME_3",rb))).append("', 'name':'ISSUE_WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_DATE",rb))).append("', 'name':'ISSUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'DRAW_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'SPEC', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'RCV_ISSUE_COMMENT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
AF0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ISSUE_COMMENT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0060010view1_sortable).append("}").append(",");
%>
<%
 int aAF0060010StructLength = aAF0060010Control.getListsize();
 final AF0060010Struct structBackup = aAF0060010Struct;
 aAF0060010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAF0060010StructLength; ++loopCount) {
  if((aAF0060010Struct = (AF0060010Struct) aAF0060010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAF0060010Struct", aAF0060010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AF0060010view1_DB.append("[");
 AF0060010view1_DB.append(loopCount);
 AF0060010view1_DB.append(",''");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-w_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-w_MODIFY_COUNT\" data-name=\"w_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getw_MODIFY_COUNT())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-TRANSPORT_SLIP_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-TRANSPORT_SLIP_CD\" data-name=\"TRANSPORT_SLIP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getTRANSPORT_SLIP_CD())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getJOB_ODR_CD())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getITEM_CD())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getITEM_NAME())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-LOT_NO\" data-name=\"LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getLOT_NO())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getSTOCK_UNIT())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-w_UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-w_UNIT_QTY_TYP\" data-name=\"w_UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getw_UNIT_QTY_TYP())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-ISSUE_QTY\" data-name=\"ISSUE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0060010Struct.getISSUE_QTY())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-RCV_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-RCV_QTY\" data-name=\"RCV_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0060010Struct.getRCV_QTY())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-w_LEAVE_RCV_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-w_LEAVE_RCV_QTY\" data-name=\"w_LEAVE_RCV_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0060010Struct.getw_LEAVE_RCV_QTY())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-RCV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-RCV_DATE\" data-name=\"RCV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAF0060010Struct.getRCV_DATE())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-w_WH_STOCK_ON_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-w_WH_STOCK_ON_HAND_QTY\" data-name=\"w_WH_STOCK_ON_HAND_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0060010Struct.getw_WH_STOCK_ON_HAND_QTY())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-w_TOTAL_STOCK_ON_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-w_TOTAL_STOCK_ON_HAND_QTY\" data-name=\"w_TOTAL_STOCK_ON_HAND_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0060010Struct.getw_TOTAL_STOCK_ON_HAND_QTY())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getVEND_CD())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-VEND_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-VEND_LOT_NO\" data-name=\"VEND_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getVEND_LOT_NO())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-VEND_ANAME\" data-name=\"VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getVEND_ANAME())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-ISSUE_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-ISSUE_PLANT_CD\" data-name=\"ISSUE_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getISSUE_PLANT_CD())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-ISSUE_PLANT_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-ISSUE_PLANT_NAME\" data-name=\"ISSUE_PLANT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getISSUE_PLANT_NAME())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-ISSUE_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-ISSUE_WH_CD\" data-name=\"ISSUE_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getISSUE_WH_CD())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-ISSUE_WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-ISSUE_WH_NAME\" data-name=\"ISSUE_WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getISSUE_WH_NAME())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-ISSUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-ISSUE_DATE\" data-name=\"ISSUE_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAF0060010Struct.getISSUE_DATE())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-DRAW_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-DRAW_CD\" data-name=\"DRAW_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getDRAW_CD())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-SPEC-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-SPEC\" data-name=\"SPEC\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getSPEC())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-RCV_ISSUE_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-RCV_ISSUE_COMMENT\" data-name=\"RCV_ISSUE_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getRCV_ISSUE_COMMENT())).append("</span>'");
 AF0060010view1_DB.append(",").append("'<span id=\"expj-AF0060010-AF0060010view1-ISSUE_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AF0060010-AF0060010view1-ISSUE_COMMENT\" data-name=\"ISSUE_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0060010Struct.getISSUE_COMMENT())).append("</span>'");
 AF0060010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAF0060010StructLength) {
   AF0060010view1_DB.append(",");
  }
 }
 aAF0060010Struct = structBackup;
 viewIdList.add(AF0060010view1_Id);
 viewSelectList.add(AF0060010view1_select);
 viewResizeList.add(AF0060010view1_resize);
 viewScrollList.add(AF0060010view1_scroll);
 viewHeaderDataList.add(AF0060010view1_HB);
 viewBodyDataList.add(AF0060010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0060010-AF0060010button2">
expj.AF0060010.AF0060010button2 = {};
expj.AF0060010.AF0060010button2.executeAllOnDecision = function () {
  console.log('execute AF0060010button2.onDecision');
};
expj.AF0060010.AF0060010button2.executeOnLoad = function () {
  expj.AF0060010.AF0060010button2.executePScriptOnLoad();
};

expj.AF0060010.AF0060010button2.executePScriptOnLoad = function () {
  console.log('execute AF0060010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0060010-AF0060010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0060010-AF0060010button2-modify">
expj.AF0060010.AF0060010button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AF0060010form1/*,_AF0060010view1/+@AF0060010Servlet"
expj.AF0060010.AF0060010button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0060010', 'AF0060010button2', '_AF0060010form1/*,_AF0060010view1/+', 'AF0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0060010', response);
expj.common.changeBusinessScreenTab('AF0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0060010.AF0060010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060010button2.modify['onClick' + i])) {
        expj.AF0060010.AF0060010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060010button2.modify.executeAllOnDecision = function () {
};
expj.AF0060010.AF0060010button2.modify.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060010button2', 'modify', this, 'Button');
    }
  });
  expj.AF0060010.AF0060010button2.modify.executePScriptOnLoad();
};

expj.AF0060010.AF0060010button2.modify.executePScriptOnLoad = function () {
  console.log('execute AF0060010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0060010-AF0060010button2-modify" name="modify" class="AF0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AF0060010 Revision: 1.11  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AF0060010-AF0060010button0">
expj.AF0060010.AF0060010button0 = {};
expj.AF0060010.AF0060010button0.executeAllOnDecision = function () {
  console.log('execute AF0060010button0.onDecision');
};
expj.AF0060010.AF0060010button0.executeOnLoad = function () {
  expj.AF0060010.AF0060010button0.executePScriptOnLoad();
};

expj.AF0060010.AF0060010button0.executePScriptOnLoad = function () {
  console.log('execute AF0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0060010-AF0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:305px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0060010-AF0060010button0-CancelCompleteChoice">
expj.AF0060010.AF0060010button0.CancelCompleteChoice = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0060010form1/*,_AF0060010view1/+@AF0060010Servlet,,$AE05011"
expj.AF0060010.AF0060010button0.CancelCompleteChoice.onClick0 = function () {
  console.log('CancelCompleteChoice script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0060010', 'AF0060010button0', '_AF0060010form1/*,_AF0060010view1/+', 'AF0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0060010', response);
expj.common.updateBusinessScreenTab('AF0060010', contents);
};
expj.common.pscript.callConfirm('AF0060010', 'AF0060010button0', 'AE05011', okEvent);
};
expj.AF0060010.AF0060010button0.CancelCompleteChoice.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060010button0.CancelCompleteChoice['onClick' + i])) {
        expj.AF0060010.AF0060010button0.CancelCompleteChoice['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060010button0.CancelCompleteChoice.executeAllOnDecision = function () {
};
expj.AF0060010.AF0060010button0.CancelCompleteChoice.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010button0-CancelCompleteChoice').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060010button0', 'CancelCompleteChoice', this, 'Button');
    }
  });
  expj.AF0060010.AF0060010button0.CancelCompleteChoice.executePScriptOnLoad();
};

expj.AF0060010.AF0060010button0.CancelCompleteChoice.executePScriptOnLoad = function () {
  console.log('execute AF0060010button0/CancelCompleteChoice.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010button0-CancelCompleteChoice');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0060010-AF0060010button0-CancelCompleteChoice" name="CancelCompleteChoice" class="AF0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelCompleteChoice",rb)%></button><!-- 選択完了解除ボタン --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060010button0-clear">
expj.AF0060010.AF0060010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AF0060010Servlet,,$ZZ07008"
expj.AF0060010.AF0060010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0060010', 'AF0060010button0', '', 'AF0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0060010', response);
expj.common.updateBusinessScreenTab('AF0060010', contents);
};
expj.common.pscript.callConfirm('AF0060010', 'AF0060010button0', 'ZZ07008', okEvent);
};
expj.AF0060010.AF0060010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060010button0.clear['onClick' + i])) {
        expj.AF0060010.AF0060010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060010button0.clear.executeAllOnDecision = function () {
};
expj.AF0060010.AF0060010button0.clear.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060010button0', 'clear', this, 'Button');
    }
  });
  expj.AF0060010.AF0060010button0.clear.executePScriptOnLoad();
};

expj.AF0060010.AF0060010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AF0060010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0060010-AF0060010button0-clear" name="clear" class="AF0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AF0060010-AF0060010button0-close">
expj.AF0060010.AF0060010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AF0060010.AF0060010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AF0060010');
};
expj.AF0060010.AF0060010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0060010.AF0060010button0.close['onClick' + i])) {
        expj.AF0060010.AF0060010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AF0060010.AF0060010button0.close.executeAllOnDecision = function () {
};
expj.AF0060010.AF0060010button0.close.executeOnLoad = function () {
  $('#expj-AF0060010-AF0060010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0060010', 'AF0060010button0', 'close', this, 'Button');
    }
  });
  expj.AF0060010.AF0060010button0.close.executePScriptOnLoad();
};

expj.AF0060010.AF0060010button0.close.executePScriptOnLoad = function () {
  console.log('execute AF0060010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AF0060010-AF0060010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0060010-AF0060010button0-close" name="close" class="AF0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0060010 (END)-->
<%
MessageStruct msgStruct = aAF0060010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0060010)) {
  expj.common.treeInstanceMap.AF0060010 = {};
}
expj.common.treeInstanceMap.AF0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0060010)) {
  expj.common.detailDialogMap.AF0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AF0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0060010)) {
  expj.common.viewInstanceMap.AF0060010 = {};
}
expj.common.viewInstanceMap.AF0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0060010.<%=viewId %>.init = function () {
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
    expj.AF0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0060010_init">
/**
 * AF0060010用のロード完了時初期化関数
 */
expj.AF0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0060010');
  expj.common.calendarInstanceMap.AF0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0060010.AF0060010form1.RCV_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010form1.RCV_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010form1.RCV_PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010form1.PeekerRcvWhCd.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010form1.RCV_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010form1.h_RCV_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010form1.TRANSPORT_CMPLT_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010form1.hid_TRANSPORT_CMPLT_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010button1.select.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010button2.modify.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010button0.CancelCompleteChoice.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010button0.close.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010form1.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010button1.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010view1.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010button2.executeOnLoad();}catch(e){};
  try{expj.AF0060010.AF0060010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0060010', 'AF0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0060010', '<%=request.getContextPath() %>');
};

/**
 * AF0060010の全体onDecision処理
 */
expj.AF0060010.executeAllOnDecision = function () {
  expj.AF0060010.AF0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0060010_console">
expj.AF0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>