<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:44:58 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AL0020\AL0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AL0020.*" %>
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
<jsp:useBean id="aAL0020010Control" class="com.nec.jp.orteus.metamorBase.AL0020.AL0020010Control" scope="request"/>
<jsp:useBean id="aAL0020010Struct" class="com.nec.jp.orteus.metamorBase.AL0020.AL0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

制約工程メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0020/jsp/AL0020010.jsp,v $
$Author: geng-jia $    
$Revision: 1.8 $ $Date: 2017/02/22 02:06:16 $
********************************************************* --%>
<html>
<head>
<title>制約工程メンテナンス</title>
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
<script class="expj-script-AL0020010_init">
  // AL0020010名前空間
  expj.AL0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AL0020010" data-screen="AL0020010" data-newdata="<%=aAL0020010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr" style=""> 
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);"> <div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">
 
            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
 
            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="">
              <script class="expj-script-AL0020010-AL0020010form1">
expj.AL0020010.AL0020010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AL0020010.AL0020010form1.onLoad0 = function () {
  console.log('AL0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AL0020010.AL0020010form1.onDecision0 = function () {
  console.log('AL0020010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AL0020010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AL0020010button1/Select"
expj.AL0020010.AL0020010form1.child0 = function () {
  console.log('AL0020010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AL0020010', 'AL0020010form1', '_AL0020010button1/Select');
};
// script4="child;1;MASK;_AL0020010button1/Select"
expj.AL0020010.AL0020010form1.child1 = function () {
  console.log('AL0020010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AL0020010', 'AL0020010form1', '_AL0020010button1/Select');
};
// script5="onDecision;1;CHKRQ;A@*2,*4"
expj.AL0020010.AL0020010form1.onDecision1 = function () {
  console.log('AL0020010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AL0020010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?AL0020010form2/*[neq]NORMAL[or]_AL0020010form1/ITEM_CD[neq]_AL0020010form1/h_ITEM_CD[or]_AL0020010form1/NECK_PROC_CD[neq]_AL0020010form1/h_NECK_PROC_CD@*3,*4"
expj.AL0020010.AL0020010form1.child2 = function () {
  console.log('AL0020010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '?AL0020010form2/*'), '[neq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_AL0020010form1/ITEM_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_AL0020010form1/h_ITEM_CD')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_AL0020010form1/NECK_PROC_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_AL0020010form1/h_NECK_PROC_CD'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AL0020010button2/Insert"
expj.AL0020010.AL0020010form1.child3 = function () {
  console.log('AL0020010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AL0020010', 'AL0020010form1', '_AL0020010button2/Insert');
};
// script8="child;4;MASK;_AL0020010button2/Insert"
expj.AL0020010.AL0020010form1.child4 = function () {
  console.log('AL0020010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AL0020010', 'AL0020010form1', '_AL0020010button2/Insert');
};
// script9="onDecision;2;CHK;?AL0020010form2/*[eq]NORMAL[and]_AL0020010form1/ITEM_CD[eq]_AL0020010form1/h_ITEM_CD[and]_AL0020010form1/NECK_PROC_CD[eq]_AL0020010form1/h_NECK_PROC_CD@*5,*6"
expj.AL0020010.AL0020010form1.onDecision2 = function () {
  console.log('AL0020010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '?AL0020010form2/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_AL0020010form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_AL0020010form1/h_ITEM_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_AL0020010form1/NECK_PROC_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_AL0020010form1/h_NECK_PROC_CD'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;UNMASK;_AL0020010button2/Update,_AL0020010button2/Delete"
expj.AL0020010.AL0020010form1.child5 = function () {
  console.log('AL0020010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AL0020010', 'AL0020010form1', '_AL0020010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('AL0020010', 'AL0020010form1', '_AL0020010button2/Delete');
};
// script11="child;6;MASK;_AL0020010button2/Update,_AL0020010button2/Delete"
expj.AL0020010.AL0020010form1.child6 = function () {
  console.log('AL0020010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AL0020010', 'AL0020010form1', '_AL0020010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('AL0020010', 'AL0020010form1', '_AL0020010button2/Delete');
};
expj.AL0020010.AL0020010form1.executeAllOnDecision = function () {
  console.log('execute AL0020010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0020010.AL0020010form1['onDecision' + i])) {
        expj.AL0020010.AL0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.AL0020010.AL0020010form1.executeOnLoad = function () {
  expj.AL0020010.AL0020010form1.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AL0020010.AL0020010form1['onLoad' + i])) {
      expj.AL0020010.AL0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AL0020010-AL0020010form1" action="AL0020010Servlet" name="AL0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010form1-ITEM_CD">
expj.AL0020010.AL0020010form1.ITEM_CD = {};
expj.AL0020010.AL0020010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AL0020010form1/ITEM_CD.onDecision');
  expj.AL0020010.AL0020010form1.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form1', 'ITEM_CD', this);
  });
  expj.AL0020010.AL0020010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AL0020010-AL0020010form1-ITEM_CD" name="ITEM_CD" class="AL0020010-focus-move  required-value expj-AL0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0020010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AL0020010-AL0020010form1-h_ITEM_CD" name="h_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0020010Struct.geth_ITEM_CD()) %>">
<script class="expj-script-AL0020010-AL0020010form1-h_ITEM_CD">
expj.AL0020010.AL0020010form1.h_ITEM_CD = {};
expj.AL0020010.AL0020010form1.h_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AL0020010form1/h_ITEM_CD.onDecision');
  expj.AL0020010.AL0020010form1.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form1.h_ITEM_CD.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form1-h_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form1', 'h_ITEM_CD', this);
  });
  expj.AL0020010.AL0020010form1.h_ITEM_CD.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.h_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1/h_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form1-h_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AL0020010-AL0020010form1-PeekerItemCd">
expj.AL0020010.AL0020010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AL0020010form1/ITEM_CD@<%=contextNo%>"
expj.AL0020010.AL0020010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AL0020010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AL0020010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AL0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AL0020010.AL0020010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0020010.AL0020010form1.PeekerItemCd['onClick' + i])) {
        expj.AL0020010.AL0020010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AL0020010.AL0020010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AL0020010.AL0020010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0020010', 'AL0020010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AL0020010.AL0020010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AL0020010-AL0020010form1-PeekerItemCd" class="AL0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010form1-ITEM_NAME">
expj.AL0020010.AL0020010form1.ITEM_NAME = {};
expj.AL0020010.AL0020010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AL0020010form1/ITEM_NAME.onDecision');
  expj.AL0020010.AL0020010form1.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form1', 'ITEM_NAME', this);
  });
  expj.AL0020010.AL0020010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AL0020010-AL0020010form1-ITEM_NAME" name="ITEM_NAME" class="AL0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0020010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NECK_PROC_CD",rb)%></span><!-- 制約工程コード --></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010form1-NECK_PROC_CD">
expj.AL0020010.AL0020010form1.NECK_PROC_CD = {};
expj.AL0020010.AL0020010form1.NECK_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AL0020010form1/NECK_PROC_CD.onDecision');
  expj.AL0020010.AL0020010form1.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form1.NECK_PROC_CD.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form1-NECK_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form1', 'NECK_PROC_CD', this);
  });
  expj.AL0020010.AL0020010form1.NECK_PROC_CD.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.NECK_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1/NECK_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form1-NECK_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AL0020010-AL0020010form1-NECK_PROC_CD" name="NECK_PROC_CD" class="AL0020010-focus-move  required-value expj-AL0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0020010Struct.getNECK_PROC_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AL0020010-AL0020010form1-h_NECK_PROC_CD" name="h_NECK_PROC_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0020010Struct.geth_NECK_PROC_CD()) %>">
<script class="expj-script-AL0020010-AL0020010form1-h_NECK_PROC_CD">
expj.AL0020010.AL0020010form1.h_NECK_PROC_CD = {};
expj.AL0020010.AL0020010form1.h_NECK_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AL0020010form1/h_NECK_PROC_CD.onDecision');
  expj.AL0020010.AL0020010form1.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form1.h_NECK_PROC_CD.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form1-h_NECK_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form1', 'h_NECK_PROC_CD', this);
  });
  expj.AL0020010.AL0020010form1.h_NECK_PROC_CD.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.h_NECK_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1/h_NECK_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form1-h_NECK_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AL0020010-AL0020010form1-PeekerNeckProcCd">
expj.AL0020010.AL0020010form1.PeekerNeckProcCd = {};
// script1="onClick;0;PEEKER;_AL0020010form1/NECK_PROC_CD@<%=contextNo%>"
expj.AL0020010.AL0020010form1.PeekerNeckProcCd.onClick0 = function () {
  console.log('PeekerNeckProcCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AL0020010';
var parameterValues = 'PeekerNeckProcCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_h_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010form1', '_NECK_PROC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%NECK_PROC_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AL0020010form1/NECK_PROC_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AL0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AL0020010.AL0020010form1.PeekerNeckProcCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0020010.AL0020010form1.PeekerNeckProcCd['onClick' + i])) {
        expj.AL0020010.AL0020010form1.PeekerNeckProcCd['onClick' + i]();
      }
    }
  }
};
expj.AL0020010.AL0020010form1.PeekerNeckProcCd.executeAllOnDecision = function () {
};
expj.AL0020010.AL0020010form1.PeekerNeckProcCd.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form1-PeekerNeckProcCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0020010', 'AL0020010form1', 'PeekerNeckProcCd', this, 'Button');
    }
  });
  expj.AL0020010.AL0020010form1.PeekerNeckProcCd.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.PeekerNeckProcCd.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1/PeekerNeckProcCd.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form1-PeekerNeckProcCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AL0020010-AL0020010form1-PeekerNeckProcCd" class="AL0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010form1-NECK_PROC_NAME">
expj.AL0020010.AL0020010form1.NECK_PROC_NAME = {};
expj.AL0020010.AL0020010form1.NECK_PROC_NAME.executeAllOnDecision = function () {
  console.log('execute AL0020010form1/NECK_PROC_NAME.onDecision');
  expj.AL0020010.AL0020010form1.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form1.NECK_PROC_NAME.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form1-NECK_PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form1', 'NECK_PROC_NAME', this);
  });
  expj.AL0020010.AL0020010form1.NECK_PROC_NAME.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.NECK_PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1/NECK_PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form1-NECK_PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AL0020010-AL0020010form1-NECK_PROC_NAME" name="NECK_PROC_NAME" class="AL0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0020010Struct.getNECK_PROC_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AL0020010-AL0020010form1-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0020010Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-AL0020010-AL0020010form1-h_MODIFY_COUNT">
expj.AL0020010.AL0020010form1.h_MODIFY_COUNT = {};
expj.AL0020010.AL0020010form1.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AL0020010form1/h_MODIFY_COUNT.onDecision');
  expj.AL0020010.AL0020010form1.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form1.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form1-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form1', 'h_MODIFY_COUNT', this);
  });
  expj.AL0020010.AL0020010form1.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form1-h_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0020010-AL0020010form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0020010Struct.geth_PLANT_CD()) %>">
<script class="expj-script-AL0020010-AL0020010form1-h_PLANT_CD">
expj.AL0020010.AL0020010form1.h_PLANT_CD = {};
expj.AL0020010.AL0020010form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AL0020010form1/h_PLANT_CD.onDecision');
  expj.AL0020010.AL0020010form1.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form1', 'h_PLANT_CD', this);
  });
  expj.AL0020010.AL0020010form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AL0020010form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form1-h_PLANT_CD');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AL0020010-AL0020010button1">
expj.AL0020010.AL0020010button1 = {};
expj.AL0020010.AL0020010button1.executeAllOnDecision = function () {
  console.log('execute AL0020010button1.onDecision');
};
expj.AL0020010.AL0020010button1.executeOnLoad = function () {
  expj.AL0020010.AL0020010button1.executePScriptOnLoad();
};

expj.AL0020010.AL0020010button1.executePScriptOnLoad = function () {
  console.log('execute AL0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0020010-AL0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0020010-AL0020010button1-Detail">
expj.AL0020010.AL0020010button1.Detail = {};
// script1="onClick;0;FSHOW;AL0020010float1"
expj.AL0020010.AL0020010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AL0020010', 'AL0020010float1', '');
};
expj.AL0020010.AL0020010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0020010.AL0020010button1.Detail['onClick' + i])) {
        expj.AL0020010.AL0020010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AL0020010.AL0020010button1.Detail.executeAllOnDecision = function () {
};
expj.AL0020010.AL0020010button1.Detail.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0020010', 'AL0020010button1', 'Detail', this, 'Button');
    }
  });
  expj.AL0020010.AL0020010button1.Detail.executePScriptOnLoad();
};

expj.AL0020010.AL0020010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AL0020010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0020010-AL0020010button1-Detail" name="Detail" class="AL0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010button1-Select">
expj.AL0020010.AL0020010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0020010form1/*@AL0020010Servlet"
expj.AL0020010.AL0020010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0020010', 'AL0020010button1', '_AL0020010form1/*', 'AL0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0020010', response);
expj.common.updateBusinessScreenTab('AL0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AL0020010.AL0020010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0020010.AL0020010button1.Select['onClick' + i])) {
        expj.AL0020010.AL0020010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AL0020010.AL0020010button1.Select.executeAllOnDecision = function () {
};
expj.AL0020010.AL0020010button1.Select.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0020010', 'AL0020010button1', 'Select', this, 'Button');
    }
  });
  expj.AL0020010.AL0020010button1.Select.executePScriptOnLoad();
};

expj.AL0020010.AL0020010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AL0020010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0020010-AL0020010button1-Select" name="Select" class="AL0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AL0020010-AL0020010form2">
expj.AL0020010.AL0020010form2 = {};
expj.AL0020010.AL0020010form2.executeAllOnDecision = function () {
  console.log('execute AL0020010form2.onDecision');
};
expj.AL0020010.AL0020010form2.executeOnLoad = function () {
  expj.AL0020010.AL0020010form2.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form2.executePScriptOnLoad = function () {
  console.log('execute AL0020010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AL0020010-AL0020010form2" action="AL0020010Servlet" name="AL0020010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%=TypeConverter.sanitizer(aAL0020010Control.getReadStatusString())%>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_START_IDLE_DATE",rb)%></span><!-- 着手アイドルタイム --></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010form2-PROC_START_IDLE_DATE">
expj.AL0020010.AL0020010form2.PROC_START_IDLE_DATE = {};
expj.AL0020010.AL0020010form2.PROC_START_IDLE_DATE.executeAllOnDecision = function () {
  console.log('execute AL0020010form2/PROC_START_IDLE_DATE.onDecision');
  expj.AL0020010.AL0020010form2.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form2.PROC_START_IDLE_DATE.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form2-PROC_START_IDLE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form2', 'PROC_START_IDLE_DATE', this);
  });
  expj.AL0020010.AL0020010form2.PROC_START_IDLE_DATE.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form2.PROC_START_IDLE_DATE.executePScriptOnLoad = function () {
  console.log('execute AL0020010form2/PROC_START_IDLE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form2-PROC_START_IDLE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0020010-AL0020010form2-PROC_START_IDLE_DATE" name="PROC_START_IDLE_DATE" class="AL0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAL0020010Struct.getPROC_START_IDLE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.UNIT_LOAD_1",rb)%></span><!-- 負荷／個 --></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010form2-UNIT_LOAD">
expj.AL0020010.AL0020010form2.UNIT_LOAD = {};
expj.AL0020010.AL0020010form2.UNIT_LOAD.executeAllOnDecision = function () {
  console.log('execute AL0020010form2/UNIT_LOAD.onDecision');
  expj.AL0020010.AL0020010form2.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form2.UNIT_LOAD.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form2-UNIT_LOAD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form2', 'UNIT_LOAD', this);
  });
  expj.AL0020010.AL0020010form2.UNIT_LOAD.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form2.UNIT_LOAD.executePScriptOnLoad = function () {
  console.log('execute AL0020010form2/UNIT_LOAD.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form2-UNIT_LOAD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0020010-AL0020010form2-UNIT_LOAD" name="UNIT_LOAD" class="AL0020010-focus-move  required-value expj-AL0020010-required-B" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;4.1;FLOOR;2" value="<%= TypeConverter.sanitizer(aAL0020010Struct.getUNIT_LOAD()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NECK_PROC_LT",rb)%></span><!-- リードタイム --></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010form2-NECK_PROC_LT">
expj.AL0020010.AL0020010form2.NECK_PROC_LT = {};
expj.AL0020010.AL0020010form2.NECK_PROC_LT.executeAllOnDecision = function () {
  console.log('execute AL0020010form2/NECK_PROC_LT.onDecision');
  expj.AL0020010.AL0020010form2.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form2.NECK_PROC_LT.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form2-NECK_PROC_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0020010', 'AL0020010form2', 'NECK_PROC_LT', this);
  });
  expj.AL0020010.AL0020010form2.NECK_PROC_LT.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form2.NECK_PROC_LT.executePScriptOnLoad = function () {
  console.log('execute AL0020010form2/NECK_PROC_LT.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form2-NECK_PROC_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0020010-AL0020010form2-NECK_PROC_LT" name="NECK_PROC_LT" class="AL0020010-focus-move  required-value expj-AL0020010-required-B" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_P;6" value="<%= TypeConverter.sanitizer(aAL0020010Struct.getNECK_PROC_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOAD_ASSIGN_TYP",rb)%></span><!-- 負荷割付区分 --></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010form2-LOAD_ASSIGN_TYP">
expj.AL0020010.AL0020010form2.LOAD_ASSIGN_TYP = {};
expj.AL0020010.AL0020010form2.LOAD_ASSIGN_TYP.executeAllOnDecision = function () {
  console.log('execute AL0020010form2/LOAD_ASSIGN_TYP.onDecision');
  expj.AL0020010.AL0020010form2.executeAllOnDecision();
  expj.AL0020010.executeAllOnDecision();
};
expj.AL0020010.AL0020010form2.LOAD_ASSIGN_TYP.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010form2-LOAD_ASSIGN_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AL0020010', 'AL0020010form2', 'LOAD_ASSIGN_TYP', this);
  });
  expj.AL0020010.AL0020010form2.LOAD_ASSIGN_TYP.executePScriptOnLoad();
};

expj.AL0020010.AL0020010form2.LOAD_ASSIGN_TYP.executePScriptOnLoad = function () {
  console.log('execute AL0020010form2/LOAD_ASSIGN_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010form2-LOAD_ASSIGN_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AL0020010-AL0020010form2-LOAD_ASSIGN_TYP" name='LOAD_ASSIGN_TYP' class='AL0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAL0020010Control.getStruct().getList_LOAD_ASSIGN_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAL0020010Control.getStruct().getList_LOAD_ASSIGN_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAL0020010Control.getStruct().getList_LOAD_ASSIGN_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAL0020010Struct.getLOAD_ASSIGN_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AL0020010-AL0020010button2">
expj.AL0020010.AL0020010button2 = {};
expj.AL0020010.AL0020010button2.executeAllOnDecision = function () {
  console.log('execute AL0020010button2.onDecision');
};
expj.AL0020010.AL0020010button2.executeOnLoad = function () {
  expj.AL0020010.AL0020010button2.executePScriptOnLoad();
};

expj.AL0020010.AL0020010button2.executePScriptOnLoad = function () {
  console.log('execute AL0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0020010-AL0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0020010-AL0020010button2-Insert">
expj.AL0020010.AL0020010button2.Insert = {};
// script1="onClick;0;CHK;_AL0020010form2/UNIT_LOAD[lte]0@#AL20003"
expj.AL0020010.AL0020010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010button2', '_AL0020010form2/UNIT_LOAD')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AL0020010', 'AL0020010button2', 'AL20003');
}
};
// script2="onClick;1;CHK;_AL0020010form2/NECK_PROC_LT[lte]0@#AL20004"
expj.AL0020010.AL0020010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010button2', '_AL0020010form2/NECK_PROC_LT')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AL0020010', 'AL0020010button2', 'AL20004');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0020010form1/*,_AL0020010form2/*,_AL0020010detail1/*@AL0020010Servlet,,$ZZ07001"
expj.AL0020010.AL0020010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0020010', 'AL0020010button2', '_AL0020010form1/*,_AL0020010form2/*,_AL0020010detail1/*', 'AL0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0020010', response);
expj.common.updateBusinessScreenTab('AL0020010', contents);
};
expj.common.pscript.callConfirm('AL0020010', 'AL0020010button2', 'ZZ07001', okEvent);
};
expj.AL0020010.AL0020010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0020010.AL0020010button2.Insert['onClick' + i])) {
        expj.AL0020010.AL0020010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.AL0020010.AL0020010button2.Insert.executeAllOnDecision = function () {
};
expj.AL0020010.AL0020010button2.Insert.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0020010', 'AL0020010button2', 'Insert', this, 'Button');
    }
  });
  expj.AL0020010.AL0020010button2.Insert.executePScriptOnLoad();
};

expj.AL0020010.AL0020010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute AL0020010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0020010-AL0020010button2-Insert" name="Insert" class="AL0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010button2-Update">
expj.AL0020010.AL0020010button2.Update = {};
// script1="onClick;0;CHK;_AL0020010form2/UNIT_LOAD[lte]0@#AL20003"
expj.AL0020010.AL0020010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010button2', '_AL0020010form2/UNIT_LOAD')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AL0020010', 'AL0020010button2', 'AL20003');
}
};
// script2="onClick;1;CHK;_AL0020010form2/NECK_PROC_LT[lte]0@#AL20004"
expj.AL0020010.AL0020010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0020010', 'AL0020010button2', '_AL0020010form2/NECK_PROC_LT')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AL0020010', 'AL0020010button2', 'AL20004');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0020010form1/*,_AL0020010form2/*,_AL0020010detail1/*@AL0020010Servlet,,$ZZ07003"
expj.AL0020010.AL0020010button2.Update.onClick2 = function () {
  console.log('Update script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0020010', 'AL0020010button2', '_AL0020010form1/*,_AL0020010form2/*,_AL0020010detail1/*', 'AL0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0020010', response);
expj.common.updateBusinessScreenTab('AL0020010', contents);
};
expj.common.pscript.callConfirm('AL0020010', 'AL0020010button2', 'ZZ07003', okEvent);
};
expj.AL0020010.AL0020010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0020010.AL0020010button2.Update['onClick' + i])) {
        expj.AL0020010.AL0020010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AL0020010.AL0020010button2.Update.executeAllOnDecision = function () {
};
expj.AL0020010.AL0020010button2.Update.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0020010', 'AL0020010button2', 'Update', this, 'Button');
    }
  });
  expj.AL0020010.AL0020010button2.Update.executePScriptOnLoad();
};

expj.AL0020010.AL0020010button2.Update.executePScriptOnLoad = function () {
  console.log('execute AL0020010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0020010-AL0020010button2-Update" name="Update" class="AL0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010button2-Delete">
expj.AL0020010.AL0020010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0020010form1/*,_AL0020010form2/*,_AL0020010detail1/*@AL0020010Servlet,,$ZZ07004"
expj.AL0020010.AL0020010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0020010', 'AL0020010button2', '_AL0020010form1/*,_AL0020010form2/*,_AL0020010detail1/*', 'AL0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0020010', response);
expj.common.updateBusinessScreenTab('AL0020010', contents);
};
expj.common.pscript.callConfirm('AL0020010', 'AL0020010button2', 'ZZ07004', okEvent);
};
expj.AL0020010.AL0020010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0020010.AL0020010button2.Delete['onClick' + i])) {
        expj.AL0020010.AL0020010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.AL0020010.AL0020010button2.Delete.executeAllOnDecision = function () {
};
expj.AL0020010.AL0020010button2.Delete.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0020010', 'AL0020010button2', 'Delete', this, 'Button');
    }
  });
  expj.AL0020010.AL0020010button2.Delete.executePScriptOnLoad();
};

expj.AL0020010.AL0020010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute AL0020010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0020010-AL0020010button2-Delete" name="Delete" class="AL0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AL0020010-AL0020010view1">
expj.AL0020010.AL0020010view1 = {};
expj.AL0020010.AL0020010view1.executeAllOnClick = function () {
};
expj.AL0020010.AL0020010view1.executeAllOnDecision = function () {
  console.log('execute AL0020010view1.onDecision');
};
expj.AL0020010.AL0020010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AL0020010view1", "expj.AL0020010.AL0020010view1.executeAllOnClick");
%>
  expj.AL0020010.AL0020010view1.executePScriptOnLoad();
};

expj.AL0020010.AL0020010view1.executePScriptOnLoad = function () {
  console.log('execute AL0020010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AL0020010-AL0020010view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AL0020010view1_Id = "AL0020010view1";
 String AL0020010view1_select = "single";
 String AL0020010view1_sortable = "true";
 String AL0020010view1_resize = "true";
 String AL0020010view1_scroll = "true";
 StringBuffer AL0020010view1_HB = new StringBuffer();
 StringBuffer AL0020010view1_DB = new StringBuffer();
%>
<%
 AL0020010view1_select = "none";
 AL0020010view1_sortable = "true";
 AL0020010view1_resize = "true";
 AL0020010view1_scroll = "true";
%>
<%
 AL0020010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AL0020010view1_sortable).append("}").append(",");
%>
     
<%
AL0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'140px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_CD",rb))).append("', 'name':'PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0020010view1_sortable).append("}").append(",");
AL0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'284px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NAME",rb))).append("', 'name':'PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0020010view1_sortable).append("}").append(",");
AL0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'135px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0020010view1_sortable).append("}").append(",");
AL0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb))).append("', 'name':'OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0020010view1_sortable).append("}").append(",");
AL0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.FIXED_LT",rb))).append("', 'name':'FIXED_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AL0020010view1_sortable).append("}").append(",");
AL0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'135px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SAFETY_LT",rb))).append("', 'name':'SAFETY_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AL0020010view1_sortable).append("}").append(",");
%>
<%
 int aAL0020010StructLength = aAL0020010Control.getListsize();
 final AL0020010Struct structBackup = aAL0020010Struct;
 aAL0020010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAL0020010StructLength; ++loopCount) {
  if((aAL0020010Struct = (AL0020010Struct) aAL0020010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAL0020010Struct", aAL0020010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AL0020010view1_DB.append("[");
 AL0020010view1_DB.append(loopCount);
 AL0020010view1_DB.append(",").append("'<span id=\"expj-AL0020010-AL0020010view1-PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AL0020010-AL0020010view1-PROC_CD\" data-name=\"PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getPROC_CD())).append("</span>'");
 AL0020010view1_DB.append(",").append("'<span id=\"expj-AL0020010-AL0020010view1-PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AL0020010-AL0020010view1-PROC_NAME\" data-name=\"PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getPROC_NAME())).append("</span>'");
 AL0020010view1_DB.append(",").append("'<span id=\"expj-AL0020010-AL0020010view1-WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AL0020010-AL0020010view1-WS_CD\" data-name=\"WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getWS_CD())).append("</span>'");
 AL0020010view1_DB.append(",").append("'<span id=\"expj-AL0020010-AL0020010view1-OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AL0020010-AL0020010view1-OUTSIDE_TYP\" data-name=\"OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getOUTSIDE_TYP())).append("</span>'");
 AL0020010view1_DB.append(",").append("'<span id=\"expj-AL0020010-AL0020010view1-FIXED_LT-").append(loopCount).append("\" class=\"expj-label expj-AL0020010-AL0020010view1-FIXED_LT\" data-name=\"FIXED_LT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getFIXED_LT())).append("</span>'");
 AL0020010view1_DB.append(",").append("'<span id=\"expj-AL0020010-AL0020010view1-SAFETY_LT-").append(loopCount).append("\" class=\"expj-label expj-AL0020010-AL0020010view1-SAFETY_LT\" data-name=\"SAFETY_LT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getSAFETY_LT())).append("</span>'");
 AL0020010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAL0020010StructLength) {
   AL0020010view1_DB.append(",");
  }
 }
 aAL0020010Struct = structBackup;
 viewIdList.add(AL0020010view1_Id);
 viewSelectList.add(AL0020010view1_select);
 viewResizeList.add(AL0020010view1_resize);
 viewScrollList.add(AL0020010view1_scroll);
 viewHeaderDataList.add(AL0020010view1_HB);
 viewBodyDataList.add(AL0020010view1_DB);
%>
<%
}
%>
</div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AL0020010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AL0020010-AL0020010button0">
expj.AL0020010.AL0020010button0 = {};
expj.AL0020010.AL0020010button0.executeAllOnDecision = function () {
  console.log('execute AL0020010button0.onDecision');
};
expj.AL0020010.AL0020010button0.executeOnLoad = function () {
  expj.AL0020010.AL0020010button0.executePScriptOnLoad();
};

expj.AL0020010.AL0020010button0.executePScriptOnLoad = function () {
  console.log('execute AL0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0020010-AL0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0020010-AL0020010button0-Clear">
expj.AL0020010.AL0020010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0020010form1/*@AL0020010Servlet,,$ZZ07008"
expj.AL0020010.AL0020010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0020010', 'AL0020010button0', '_AL0020010form1/*', 'AL0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0020010', response);
expj.common.updateBusinessScreenTab('AL0020010', contents);
};
expj.common.pscript.callConfirm('AL0020010', 'AL0020010button0', 'ZZ07008', okEvent);
};
expj.AL0020010.AL0020010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0020010.AL0020010button0.Clear['onClick' + i])) {
        expj.AL0020010.AL0020010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AL0020010.AL0020010button0.Clear.executeAllOnDecision = function () {
};
expj.AL0020010.AL0020010button0.Clear.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0020010', 'AL0020010button0', 'Clear', this, 'Button');
    }
  });
  expj.AL0020010.AL0020010button0.Clear.executePScriptOnLoad();
};

expj.AL0020010.AL0020010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AL0020010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0020010-AL0020010button0-Clear" name="Clear" class="AL0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AL0020010-AL0020010button0-Close">
expj.AL0020010.AL0020010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AL0020010.AL0020010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AL0020010');
};
expj.AL0020010.AL0020010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0020010.AL0020010button0.Close['onClick' + i])) {
        expj.AL0020010.AL0020010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AL0020010.AL0020010button0.Close.executeAllOnDecision = function () {
};
expj.AL0020010.AL0020010button0.Close.executeOnLoad = function () {
  $('#expj-AL0020010-AL0020010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0020010', 'AL0020010button0', 'Close', this, 'Button');
    }
  });
  expj.AL0020010.AL0020010button0.Close.executePScriptOnLoad();
};

expj.AL0020010.AL0020010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AL0020010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AL0020010-AL0020010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0020010-AL0020010button0-Close" name="Close" class="AL0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AL0020010 (END)-->
<script class="expj-script-AL0020010-AL0020010detail1">
expj.AL0020010.AL0020010detail1 = {};
expj.AL0020010.AL0020010detail1.executeAllOnDecision = function () {
  console.log('execute AL0020010detail1.onDecision');
};
expj.AL0020010.AL0020010detail1.executeOnLoad = function () {
  expj.AL0020010.AL0020010detail1.executePScriptOnLoad();
};

expj.AL0020010.AL0020010detail1.executePScriptOnLoad = function () {
  console.log('execute AL0020010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAL0020010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AL0020010-AL0020010detail1" class="expj-datagird-detail" data-float="AL0020010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AL0020010detail1";
 detailFloat = "AL0020010float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AL0020010detail1_Id = "AL0020010detail1";
 String AL0020010detail1_select = "single";
 String AL0020010detail1_sortable = "true";
 String AL0020010detail1_resize = "true";
 String AL0020010detail1_scroll = "true";
 StringBuffer AL0020010detail1_HB = new StringBuffer();
 StringBuffer AL0020010detail1_DB = new StringBuffer();
%>
<%
 AL0020010detail1_sortable = "false";
 AL0020010detail1_select = "none";
%>
<% AL0020010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AL0020010detail1_sortable).append("}").append(","); %>
<%  AL0020010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AL0020010detail1_sortable).append("}").append(",");
AL0020010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AL0020010detail1_sortable).append("}").append(",");
AL0020010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AL0020010detail1_sortable).append("}").append(",");
 %>
  <% AL0020010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.NECK_PROC_CAPA_1",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AL0020010-AL0020010detail1-det_NECK_PROC_CAPA\" class=\"expj-label\" data-name=\"det_NECK_PROC_CAPA\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;8.1;FLOOR;2\">").append(TypeConverter.sanitizer(aAL0020010Struct.getdet_NECK_PROC_CAPA())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AL0020010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.NECK_PROC_CAPA_UNIT",rb)).append("','").append("<span id=\"expj-AL0020010-AL0020010detail1-det_NECK_PROC_CAPA_UNIT\" class=\"expj-label\" data-name=\"det_NECK_PROC_CAPA_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getdet_NECK_PROC_CAPA_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AL0020010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AL0020010-AL0020010detail1-det_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"det_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getdet_MRP_ODR_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AL0020010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AL0020010-AL0020010detail1-det_OUTSIDE_TYP\" class=\"expj-label\" data-name=\"det_OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getdet_OUTSIDE_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AL0020010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.ODR_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AL0020010-AL0020010detail1-det_ODR_LT\" class=\"expj-label\" data-name=\"det_ODR_LT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getdet_ODR_LT())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0110",rb)).append("']").append(",");%>
 <% AL0020010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.FIXED_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AL0020010-AL0020010detail1-det_FIXED_LT\" class=\"expj-label\" data-name=\"det_FIXED_LT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getdet_FIXED_LT())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0110",rb)).append("']").append(",");%>
 <% AL0020010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.SAFETY_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AL0020010-AL0020010detail1-det_SAFETY_LT\" class=\"expj-label\" data-name=\"det_SAFETY_LT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getdet_SAFETY_LT())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0110",rb)).append("']").append(",");%>
 <% AL0020010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.ISSUE_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AL0020010-AL0020010detail1-det_ISSUE_LT\" class=\"expj-label\" data-name=\"det_ISSUE_LT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAL0020010Struct.getdet_ISSUE_LT())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0110",rb)).append("']").append(",");%>
<%
 detailViewId = AL0020010detail1_Id;
 detailViewSelect = AL0020010detail1_select;
 detailViewResize = AL0020010detail1_resize;
 detailViewScroll = AL0020010detail1_scroll;
 detailViewHeaderData = AL0020010detail1_HB;
 detailViewBodyData = AL0020010detail1_DB;
%>
<%
}
%>
<%
  MessageStruct msgStruct = aAL0020010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AL0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AL0020010)) {
  expj.common.treeInstanceMap.AL0020010 = {};
}
expj.common.treeInstanceMap.AL0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AL0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AL0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AL0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AL0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AL0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AL0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AL0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AL0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AL0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AL0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0020010)) {
  expj.common.detailDialogMap.AL0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AL0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AL0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AL0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AL0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AL0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AL0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AL0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AL0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AL0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AL0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AL0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AL0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AL0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AL0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AL0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AL0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AL0020010)) {
  expj.common.viewInstanceMap.AL0020010 = {};
}
expj.common.viewInstanceMap.AL0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AL0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AL0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AL0020010.<%=viewId %>.init = function () {
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
    expj.AL0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AL0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AL0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AL0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AL0020010_init">
/**
 * AL0020010用のロード完了時初期化関数
 */
expj.AL0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AL0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AL0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AL0020010');
  expj.common.calendarInstanceMap.AL0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AL0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AL0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AL0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AL0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AL0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AL0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AL0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AL0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AL0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AL0020010.AL0020010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form1.h_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form1.NECK_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form1.h_NECK_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form1.PeekerNeckProcCd.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form1.NECK_PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form1.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form2.PROC_START_IDLE_DATE.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form2.UNIT_LOAD.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form2.NECK_PROC_LT.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form2.LOAD_ASSIGN_TYP.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010button2.Update.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form1.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010button1.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010form2.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010button2.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010view1.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010button0.executeOnLoad();}catch(e){};
  try{expj.AL0020010.AL0020010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AL0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AL0020010', 'AL0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AL0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AL0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AL0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AL0020010', '<%=request.getContextPath() %>');
};

/**
 * AL0020010の全体onDecision処理
 */
expj.AL0020010.executeAllOnDecision = function () {
  expj.AL0020010.AL0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AL0020010_console">
expj.AL0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>