<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:39:25 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0070\AF0070010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0070.*" %>
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
<jsp:useBean id="aAF0070010Control" class="com.nec.jp.orteus.metamorBase.AF0070.AF0070010Control" scope="request"/>
<jsp:useBean id="aAF0070010Struct" class="com.nec.jp.orteus.metamorBase.AF0070.AF0070010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

�]��݌ɐU�֓���
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0070/jsp/AF0070010.jsp,v $
$Author: geng-jia $    
$Revision: 1.7 $ $Date: 2017/02/22 02:05:47 $
$******************************************************** --%>
<html>
<head>
<title>�]��݌ɐU�֓���</title>
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
<script class="expj-script-AF0070010_init">
  // AF0070010���O���
  expj.AF0070010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AF0070010" data-screen="AF0070010" data-newdata="<%=aAF0070010Control.isNewData() %>">
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
              <script class="expj-script-AF0070010-AF0070010form1">
expj.AF0070010.AF0070010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AF0070010.AF0070010form1.onLoad0 = function () {
  console.log('AF0070010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*2"
expj.AF0070010.AF0070010form1.onDecision0 = function () {
  console.log('AF0070010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AF0070010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;UNMASK;_AF0070010button1/select@*1"
expj.AF0070010.AF0070010form1.child0 = function () {
  console.log('AF0070010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0070010', 'AF0070010form1', '_AF0070010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;MASK;_AF0070010button2/modify"
expj.AF0070010.AF0070010form1.child1 = function () {
  console.log('AF0070010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AF0070010', 'AF0070010form1', '_AF0070010button2/modify');
};
// script5="child;2;MASK;_AF0070010button1/select@*3"
expj.AF0070010.AF0070010form1.child2 = function () {
  console.log('AF0070010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0070010', 'AF0070010form1', '_AF0070010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script6="child;3;MASK;_AF0070010button2/modify"
expj.AF0070010.AF0070010form1.child3 = function () {
  console.log('AF0070010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AF0070010', 'AF0070010form1', '_AF0070010button2/modify');
};
// script7="onDecision;1;CHK;?AF0070010form1/w_ITEM_CD[eq]SAME[and]?AF0070010form1/w_JOB_ODR_CD[eq]SAME[and]?AF0070010form1/w_WH_CD[eq]SAME[and]?AF0070010form1/*[eq]NORMAL@*4"
expj.AF0070010.AF0070010form1.onDecision1 = function () {
  console.log('AF0070010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0070010', 'AF0070010form1', '?AF0070010form1/w_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0070010', 'AF0070010form1', '?AF0070010form1/w_JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0070010', 'AF0070010form1', '?AF0070010form1/w_WH_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0070010', 'AF0070010form1', '?AF0070010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;4;UNMASK;_AF0070010button1/select@*5"
expj.AF0070010.AF0070010form1.child4 = function () {
  console.log('AF0070010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AF0070010', 'AF0070010form1', '_AF0070010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script9="child;5;CHKRQ;?AF0070010view1/?[eq]SINGLE@*6,*7"
expj.AF0070010.AF0070010form1.child5 = function () {
  console.log('AF0070010form1 script9');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0070010', 'AF0070010form1', '?AF0070010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;6;UNMASK;_AF0070010button2/modify"
expj.AF0070010.AF0070010form1.child6 = function () {
  console.log('AF0070010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AF0070010', 'AF0070010form1', '_AF0070010button2/modify');
};
// script11="child;7;MASK;_AF0070010button2/modify"
expj.AF0070010.AF0070010form1.child7 = function () {
  console.log('AF0070010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AF0070010', 'AF0070010form1', '_AF0070010button2/modify');
};
expj.AF0070010.AF0070010form1.executeAllOnDecision = function () {
  console.log('execute AF0070010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0070010.AF0070010form1['onDecision' + i])) {
        expj.AF0070010.AF0070010form1['onDecision' + i]();
      }
    }
  }
};
expj.AF0070010.AF0070010form1.executeOnLoad = function () {
  expj.AF0070010.AF0070010form1.executePScriptOnLoad();
};

expj.AF0070010.AF0070010form1.executePScriptOnLoad = function () {
  console.log('execute AF0070010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0070010.AF0070010form1['onLoad' + i])) {
      expj.AF0070010.AF0070010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0070010-AF0070010form1" action="AF0070010Servlet" name="AF0070010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAF0070010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- �i�ڔԍ� --></div><!--/td-->
<script class="expj-script-AF0070010-AF0070010form1-w_ITEM_CD">
expj.AF0070010.AF0070010form1.w_ITEM_CD = {};
expj.AF0070010.AF0070010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AF0070010form1/w_ITEM_CD.onDecision');
  expj.AF0070010.AF0070010form1.executeAllOnDecision();
  expj.AF0070010.executeAllOnDecision();
};
expj.AF0070010.AF0070010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AF0070010-AF0070010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0070010', 'AF0070010form1', 'w_ITEM_CD', this);
  });
  expj.AF0070010.AF0070010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AF0070010.AF0070010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AF0070010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0070010-AF0070010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0070010-AF0070010form1-w_ITEM_CD" name="w_ITEM_CD" class="AF0070010-focus-move  required-value expj-AF0070010-required-A" style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAF0070010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0070010-AF0070010form1-Peekerw_ITEM_CD">
expj.AF0070010.AF0070010form1.Peekerw_ITEM_CD = {};
// script1="onClick;0;PEEKER;_AF0070010form1/w_ITEM_CD@<%=contextNo%>"
expj.AF0070010.AF0070010form1.Peekerw_ITEM_CD.onClick0 = function () {
  console.log('Peekerw_ITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0070010';
var parameterValues = 'Peekerw_ITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0070010', 'AF0070010form1', '_AF0070010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0070010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0070010.AF0070010form1.Peekerw_ITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0070010.AF0070010form1.Peekerw_ITEM_CD['onClick' + i])) {
        expj.AF0070010.AF0070010form1.Peekerw_ITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.AF0070010.AF0070010form1.Peekerw_ITEM_CD.executeAllOnDecision = function () {
};
expj.AF0070010.AF0070010form1.Peekerw_ITEM_CD.executeOnLoad = function () {
  $('#expj-AF0070010-AF0070010form1-Peekerw_ITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0070010', 'AF0070010form1', 'Peekerw_ITEM_CD', this, 'Button');
    }
  });
  expj.AF0070010.AF0070010form1.Peekerw_ITEM_CD.executePScriptOnLoad();
};

expj.AF0070010.AF0070010form1.Peekerw_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AF0070010form1/Peekerw_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0070010-AF0070010form1-Peekerw_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0070010-AF0070010form1-Peekerw_ITEM_CD" class="AF0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- �i���C���h�J�[�h�w��j --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- ���� --></div><!--/td-->
<script class="expj-script-AF0070010-AF0070010form1-w_JOB_ODR_CD">
expj.AF0070010.AF0070010form1.w_JOB_ODR_CD = {};
expj.AF0070010.AF0070010form1.w_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0070010form1/w_JOB_ODR_CD.onDecision');
  expj.AF0070010.AF0070010form1.executeAllOnDecision();
  expj.AF0070010.executeAllOnDecision();
};
expj.AF0070010.AF0070010form1.w_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0070010-AF0070010form1-w_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0070010', 'AF0070010form1', 'w_JOB_ODR_CD', this);
  });
  expj.AF0070010.AF0070010form1.w_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AF0070010.AF0070010form1.w_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0070010form1/w_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0070010-AF0070010form1-w_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0070010-AF0070010form1-w_JOB_ODR_CD" name="w_JOB_ODR_CD" class="AF0070010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAF0070010Struct.getw_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0070010-AF0070010form1-Peekerw_JOB_ODR_CD">
expj.AF0070010.AF0070010form1.Peekerw_JOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AF0070010form1/w_JOB_ODR_CD@<%=contextNo%>"
expj.AF0070010.AF0070010form1.Peekerw_JOB_ODR_CD.onClick0 = function () {
  console.log('Peekerw_JOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0070010';
var parameterValues = 'Peekerw_JOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0070010', 'AF0070010form1', '_AF0070010form1/w_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0070010', 'AF0070010form1', '_AF0070010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AF0070010form1/w_JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0070010.AF0070010form1.Peekerw_JOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0070010.AF0070010form1.Peekerw_JOB_ODR_CD['onClick' + i])) {
        expj.AF0070010.AF0070010form1.Peekerw_JOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AF0070010.AF0070010form1.Peekerw_JOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AF0070010.AF0070010form1.Peekerw_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0070010-AF0070010form1-Peekerw_JOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0070010', 'AF0070010form1', 'Peekerw_JOB_ODR_CD', this, 'Button');
    }
  });
  expj.AF0070010.AF0070010form1.Peekerw_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AF0070010.AF0070010form1.Peekerw_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0070010form1/Peekerw_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0070010-AF0070010form1-Peekerw_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0070010-AF0070010form1-Peekerw_JOB_ODR_CD" class="AF0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- �i���C���h�J�[�h�w��j --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- �ۊǋ�R�[�h --></div><!--/td-->
<script class="expj-script-AF0070010-AF0070010form1-w_WH_CD">
expj.AF0070010.AF0070010form1.w_WH_CD = {};
expj.AF0070010.AF0070010form1.w_WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0070010form1/w_WH_CD.onDecision');
  expj.AF0070010.AF0070010form1.executeAllOnDecision();
  expj.AF0070010.executeAllOnDecision();
};
expj.AF0070010.AF0070010form1.w_WH_CD.executeOnLoad = function () {
  $('#expj-AF0070010-AF0070010form1-w_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0070010', 'AF0070010form1', 'w_WH_CD', this);
  });
  expj.AF0070010.AF0070010form1.w_WH_CD.executePScriptOnLoad();
};

expj.AF0070010.AF0070010form1.w_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0070010form1/w_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0070010-AF0070010form1-w_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0070010-AF0070010form1-w_WH_CD" name="w_WH_CD" class="AF0070010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAF0070010Struct.getw_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0070010-AF0070010form1-Peekerw_WH_CD">
expj.AF0070010.AF0070010form1.Peekerw_WH_CD = {};
// script1="onClick;0;PEEKER;_AF0070010form1/w_WH_CD@<%=contextNo%>"
expj.AF0070010.AF0070010form1.Peekerw_WH_CD.onClick0 = function () {
  console.log('Peekerw_WH_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0070010';
var parameterValues = 'Peekerw_WH_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0070010', 'AF0070010form1', '_AF0070010form1/w_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0070010form1/w_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0070010.AF0070010form1.Peekerw_WH_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0070010.AF0070010form1.Peekerw_WH_CD['onClick' + i])) {
        expj.AF0070010.AF0070010form1.Peekerw_WH_CD['onClick' + i]();
      }
    }
  }
};
expj.AF0070010.AF0070010form1.Peekerw_WH_CD.executeAllOnDecision = function () {
};
expj.AF0070010.AF0070010form1.Peekerw_WH_CD.executeOnLoad = function () {
  $('#expj-AF0070010-AF0070010form1-Peekerw_WH_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0070010', 'AF0070010form1', 'Peekerw_WH_CD', this, 'Button');
    }
  });
  expj.AF0070010.AF0070010form1.Peekerw_WH_CD.executePScriptOnLoad();
};

expj.AF0070010.AF0070010form1.Peekerw_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0070010form1/Peekerw_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0070010-AF0070010form1-Peekerw_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0070010-AF0070010form1-Peekerw_WH_CD" class="AF0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- �i���C���h�J�[�h�w��j --></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0070010-AF0070010button1">
expj.AF0070010.AF0070010button1 = {};
expj.AF0070010.AF0070010button1.executeAllOnDecision = function () {
  console.log('execute AF0070010button1.onDecision');
};
expj.AF0070010.AF0070010button1.executeOnLoad = function () {
  expj.AF0070010.AF0070010button1.executePScriptOnLoad();
};

expj.AF0070010.AF0070010button1.executePScriptOnLoad = function () {
  console.log('execute AF0070010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0070010-AF0070010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0070010-AF0070010button1-select">
expj.AF0070010.AF0070010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0070010form1/*@AF0070010Servlet"
expj.AF0070010.AF0070010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0070010', 'AF0070010button1', '_AF0070010form1/*', 'AF0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0070010', response);
expj.common.updateBusinessScreenTab('AF0070010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0070010.AF0070010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0070010.AF0070010button1.select['onClick' + i])) {
        expj.AF0070010.AF0070010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AF0070010.AF0070010button1.select.executeAllOnDecision = function () {
};
expj.AF0070010.AF0070010button1.select.executeOnLoad = function () {
  $('#expj-AF0070010-AF0070010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0070010', 'AF0070010button1', 'select', this, 'Button');
    }
  });
  expj.AF0070010.AF0070010button1.select.executePScriptOnLoad();
};

expj.AF0070010.AF0070010button1.select.executePScriptOnLoad = function () {
  console.log('execute AF0070010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AF0070010-AF0070010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0070010-AF0070010button1-select" name="select" class="AF0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- �Ǎ��{�^�� --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AF0070010-AF0070010view1">
expj.AF0070010.AF0070010view1 = {};
expj.AF0070010.AF0070010view1.executeAllOnClick = function () {
};
expj.AF0070010.AF0070010view1.executeAllOnDecision = function () {
  console.log('execute AF0070010view1.onDecision');
};
expj.AF0070010.AF0070010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AF0070010view1", "expj.AF0070010.AF0070010view1.executeAllOnClick");
%>
  expj.AF0070010.AF0070010view1.executePScriptOnLoad();
};

expj.AF0070010.AF0070010view1.executePScriptOnLoad = function () {
  console.log('execute AF0070010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AF0070010-AF0070010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AF0070010view1_Id = "AF0070010view1";
 String AF0070010view1_select = "single";
 String AF0070010view1_sortable = "true";
 String AF0070010view1_resize = "true";
 String AF0070010view1_scroll = "true";
 StringBuffer AF0070010view1_HB = new StringBuffer();
 StringBuffer AF0070010view1_DB = new StringBuffer();
%>
<%
 AF0070010view1_select = "single";
 AF0070010view1_sortable = "true";
 AF0070010view1_resize = "true";
 AF0070010view1_scroll = "true";
%>
<%
 AF0070010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
%>
 </span>    
<%
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'JOB_ODR_DETAIL_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MRP_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_3",rb))).append("', 'name':'w_WH_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0350",rb))).append("', 'name':'ALC_POS_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0351",rb))).append("', 'name':'RCV_ISSUE_POS_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DRAW_CD",rb))).append("', 'name':'DRAW_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_SPEC",rb))).append("', 'name':'SPEC', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'w_UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
AF0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0070010view1_sortable).append("}").append(",");
%>
<%
 int aAF0070010StructLength = aAF0070010Control.getListsize();
 final AF0070010Struct structBackup = aAF0070010Struct;
 aAF0070010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAF0070010StructLength; ++loopCount) {
  if((aAF0070010Struct = (AF0070010Struct) aAF0070010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAF0070010Struct", aAF0070010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AF0070010view1_DB.append("[");
 AF0070010view1_DB.append(loopCount);
 AF0070010view1_DB.append(",''");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getITEM_CD())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getITEM_NAME())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getJOB_ODR_CD())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-JOB_ODR_DETAIL_NO-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-JOB_ODR_DETAIL_NO\" data-name=\"JOB_ODR_DETAIL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getJOB_ODR_DETAIL_NO())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getWH_CD())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-MRP_FLG-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-MRP_FLG\" data-name=\"MRP_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getMRP_FLG())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getWH_NAME())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-w_WH_STOCK_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-w_WH_STOCK_QTY\" data-name=\"w_WH_STOCK_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0070010Struct.getw_WH_STOCK_QTY())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-ALC_POS_STOCK_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-ALC_POS_STOCK_QTY\" data-name=\"ALC_POS_STOCK_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0070010Struct.getALC_POS_STOCK_QTY())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-RCV_ISSUE_POS_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-RCV_ISSUE_POS_QTY\" data-name=\"RCV_ISSUE_POS_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0070010Struct.getRCV_ISSUE_POS_QTY())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-DRAW_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-DRAW_CD\" data-name=\"DRAW_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getDRAW_CD())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-SPEC-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-SPEC\" data-name=\"SPEC\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getSPEC())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-w_UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-w_UNIT_QTY_TYP\" data-name=\"w_UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getw_UNIT_QTY_TYP())).append("</span>'");
 AF0070010view1_DB.append(",").append("'<span id=\"expj-AF0070010-AF0070010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AF0070010-AF0070010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0070010Struct.getSTOCK_UNIT())).append("</span>'");
 AF0070010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAF0070010StructLength) {
   AF0070010view1_DB.append(",");
  }
 }
 aAF0070010Struct = structBackup;
 viewIdList.add(AF0070010view1_Id);
 viewSelectList.add(AF0070010view1_select);
 viewResizeList.add(AF0070010view1_resize);
 viewScrollList.add(AF0070010view1_scroll);
 viewHeaderDataList.add(AF0070010view1_HB);
 viewBodyDataList.add(AF0070010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0070010-AF0070010button2">
expj.AF0070010.AF0070010button2 = {};
expj.AF0070010.AF0070010button2.executeAllOnDecision = function () {
  console.log('execute AF0070010button2.onDecision');
};
expj.AF0070010.AF0070010button2.executeOnLoad = function () {
  expj.AF0070010.AF0070010button2.executePScriptOnLoad();
};

expj.AF0070010.AF0070010button2.executePScriptOnLoad = function () {
  console.log('execute AF0070010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0070010-AF0070010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0070010-AF0070010button2-modify">
expj.AF0070010.AF0070010button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AF0070010form1/*,_AF0070010view1/+@AF0070010Servlet"
expj.AF0070010.AF0070010button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0070010', 'AF0070010button2', '_AF0070010form1/*,_AF0070010view1/+', 'AF0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0070010', response);
expj.common.changeBusinessScreenTab('AF0070010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0070010.AF0070010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0070010.AF0070010button2.modify['onClick' + i])) {
        expj.AF0070010.AF0070010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.AF0070010.AF0070010button2.modify.executeAllOnDecision = function () {
};
expj.AF0070010.AF0070010button2.modify.executeOnLoad = function () {
  $('#expj-AF0070010-AF0070010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0070010', 'AF0070010button2', 'modify', this, 'Button');
    }
  });
  expj.AF0070010.AF0070010button2.modify.executePScriptOnLoad();
};

expj.AF0070010.AF0070010button2.modify.executePScriptOnLoad = function () {
  console.log('execute AF0070010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-AF0070010-AF0070010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0070010-AF0070010button2-modify" name="modify" class="AF0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- �s�C���{�^�� --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AF0070010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AF0070010-AF0070010button0">
expj.AF0070010.AF0070010button0 = {};
expj.AF0070010.AF0070010button0.executeAllOnDecision = function () {
  console.log('execute AF0070010button0.onDecision');
};
expj.AF0070010.AF0070010button0.executeOnLoad = function () {
  expj.AF0070010.AF0070010button0.executePScriptOnLoad();
};

expj.AF0070010.AF0070010button0.executePScriptOnLoad = function () {
  console.log('execute AF0070010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0070010-AF0070010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0070010-AF0070010button0-clear">
expj.AF0070010.AF0070010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AF0070010Servlet,,$ZZ07008"
expj.AF0070010.AF0070010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0070010', 'AF0070010button0', '', 'AF0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0070010', response);
expj.common.updateBusinessScreenTab('AF0070010', contents);
};
expj.common.pscript.callConfirm('AF0070010', 'AF0070010button0', 'ZZ07008', okEvent);
};
expj.AF0070010.AF0070010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0070010.AF0070010button0.clear['onClick' + i])) {
        expj.AF0070010.AF0070010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AF0070010.AF0070010button0.clear.executeAllOnDecision = function () {
};
expj.AF0070010.AF0070010button0.clear.executeOnLoad = function () {
  $('#expj-AF0070010-AF0070010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0070010', 'AF0070010button0', 'clear', this, 'Button');
    }
  });
  expj.AF0070010.AF0070010button0.clear.executePScriptOnLoad();
};

expj.AF0070010.AF0070010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AF0070010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AF0070010-AF0070010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0070010-AF0070010button0-clear" name="clear" class="AF0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- �N���A�{�^�� --></div><!--/td-->
<script class="expj-script-AF0070010-AF0070010button0-close">
expj.AF0070010.AF0070010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AF0070010.AF0070010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AF0070010');
};
expj.AF0070010.AF0070010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0070010.AF0070010button0.close['onClick' + i])) {
        expj.AF0070010.AF0070010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AF0070010.AF0070010button0.close.executeAllOnDecision = function () {
};
expj.AF0070010.AF0070010button0.close.executeOnLoad = function () {
  $('#expj-AF0070010-AF0070010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0070010', 'AF0070010button0', 'close', this, 'Button');
    }
  });
  expj.AF0070010.AF0070010button0.close.executePScriptOnLoad();
};

expj.AF0070010.AF0070010button0.close.executePScriptOnLoad = function () {
  console.log('execute AF0070010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AF0070010-AF0070010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0070010-AF0070010button0-close" name="close" class="AF0070010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- ����{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0070010 (END)-->
<%
MessageStruct msgStruct = aAF0070010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AF0070010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0070010)) {
  expj.common.treeInstanceMap.AF0070010 = {};
}
expj.common.treeInstanceMap.AF0070010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AF0070010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AF0070010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AF0070010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
expj.common.treeInstanceMap.AF0070010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0070010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0070010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0070010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0070010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0070010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js�錾
 if (detailId != null) {
%>
<script class="expj-script-AF0070010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0070010)) {
  expj.common.detailDialogMap.AF0070010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0070010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0070010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0070010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0070010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0070010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0070010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0070010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0070010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0070010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0070010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0070010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AF0070010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0070010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
  expj.common.detailDialogMap.AF0070010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0070010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0070010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0070010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0070010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0070010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS�錾(END)

//VIEW JS�錾
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-AF0070010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0070010)) {
  expj.common.viewInstanceMap.AF0070010 = {};
}
expj.common.viewInstanceMap.AF0070010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0070010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0070010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0070010.<%=viewId %>.init = function () {
  // DataGrid(VIEW)�̃{�f�B�f�[�^
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)�̃w�b�_�[�f�[�^
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
    expj.AF0070010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0070010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0070010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0070010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0070010_init">
/**
 * AF0070010�p�̃��[�h�������������֐�
 */
expj.AF0070010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0070010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AF0070010');
  //��DataGridTable�ɓ��I�����ݒ�
  expj.common.setExpjDynamicHeight('AF0070010');
  expj.common.calendarInstanceMap.AF0070010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AF0070010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AF0070010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0070010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0070010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0070010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0070010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0070010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0070010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0070010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0070010.AF0070010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010form1.Peekerw_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010form1.w_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010form1.Peekerw_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010form1.w_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010form1.Peekerw_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010button1.select.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010button2.modify.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010button0.close.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010form1.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010button1.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010view1.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010button2.executeOnLoad();}catch(e){};
  try{expj.AF0070010.AF0070010button0.executeOnLoad();}catch(e){};
  // �R���\�[���o��
  expj.AF0070010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0070010', 'AF0070010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0070010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AF0070010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AF0070010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AF0070010', '<%=request.getContextPath() %>');
};

/**
 * AF0070010�̑S��onDecision����
 */
expj.AF0070010.executeAllOnDecision = function () {
  expj.AF0070010.AF0070010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0070010_console">
expj.AF0070010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>