<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 19:15:03 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KM0050\KM0050010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KM0050.*" %>
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
<jsp:useBean id="aKM0050010Control" class="com.nec.jp.orteus.metamorBase.KM0050.KM0050010Control" scope="request"/>
<jsp:useBean id="aKM0050010Struct" class="com.nec.jp.orteus.metamorBase.KM0050.KM0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

案件進捗
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0050/jsp/KM0050010.jsp,v $
$Author: geng-jia $	
$Revision: 1.3 $　$Date: 2017/02/22 02:07:05 $
********************************************************* --%>
<html>
<head>
<title>案件進捗</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AJ0020010Servlet", so);
%>

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
<script class="expj-script-KM0050010_init">
  // KM0050010名前空間
  expj.KM0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  

  <div id="expj-business-screen-KM0050010" data-screen="KM0050010" data-newdata="<%=aKM0050010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr" style=""> 
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);">      <div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2-->
        <div class="expj-tr" style="width:100%;height:0px;display:none;">

          <div class="expj-td frame01"></div><!--/td-->

          <div class="expj-td frame02"></div><!--/td-->

          <div class="expj-td frame03"></div><!--/td-->

        </div><!--/tr-->

        <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">

          <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

          <div class="expj-td frame05" style=""><!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-KM0050010-KM0050010form1">
expj.KM0050010.KM0050010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.KM0050010.KM0050010form1.onLoad0 = function () {
  console.log('KM0050010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.KM0050010.KM0050010form1.onDecision0 = function () {
  console.log('KM0050010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KM0050010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KM0050010button1/Select"
expj.KM0050010.KM0050010form1.child0 = function () {
  console.log('KM0050010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button1/Select');
};
// script4="child;1;MASK;_KM0050010button1/Select"
expj.KM0050010.KM0050010form1.child1 = function () {
  console.log('KM0050010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button1/Select');
};
// script5="onDecision;1;MASK;_KM0050010form1/CALCULATION_DATE,_KM0050010form1/PROJECT_NAME"
expj.KM0050010.KM0050010form1.onDecision1 = function () {
  console.log('KM0050010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010form1/CALCULATION_DATE');
expj.common.pscript.setMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010form1/PROJECT_NAME');
};
// script6="onDecision;2;CHK;?KM0050010form1/*[eq]NORMAL@*4,*3"
expj.KM0050010.KM0050010form1.onDecision2 = function () {
  console.log('KM0050010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0050010', 'KM0050010form1', '?KM0050010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script7="child;2;UNMASK;_KM0050010button0/CSVOut,_KM0050010button1/TotalShow,_KM0050010button1/Recalculation,_KM0050010button2/OtherRegister"
expj.KM0050010.KM0050010form1.child2 = function () {
  console.log('KM0050010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button0/CSVOut');
expj.common.pscript.setUnMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button1/TotalShow');
expj.common.pscript.setUnMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button1/Recalculation');
expj.common.pscript.setUnMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button2/OtherRegister');
};
// script8="child;3;MASK;_KM0050010button0/CSVOut,_KM0050010button1/TotalShow,_KM0050010button1/Recalculation,_KM0050010button2/OtherRegister"
expj.KM0050010.KM0050010form1.child3 = function () {
  console.log('KM0050010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button0/CSVOut');
expj.common.pscript.setMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button1/TotalShow');
expj.common.pscript.setMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button1/Recalculation');
expj.common.pscript.setMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button2/OtherRegister');
};
// script9="child;4;CHK;?KM0050010form1/PROJECT_CD[eq]SAME@*2,*3"
expj.KM0050010.KM0050010form1.child4 = function () {
  console.log('KM0050010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0050010', 'KM0050010form1', '?KM0050010form1/PROJECT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script10="onDecision;3;CHK;?KM0050010view1/?[eq]NOT_SELECTED@*5"
expj.KM0050010.KM0050010form1.onDecision3 = function () {
  console.log('KM0050010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0050010', 'KM0050010form1', '?KM0050010view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script11="child;5;MASK;_KM0050010button2/JobOdrProgress"
expj.KM0050010.KM0050010form1.child5 = function () {
  console.log('KM0050010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button2/JobOdrProgress');
};
// script12="onDecision;4;CHK;?KM0050010view1/?[eq]SINGLE@*6"
expj.KM0050010.KM0050010form1.onDecision4 = function () {
  console.log('KM0050010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0050010', 'KM0050010form1', '?KM0050010view1/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script13="child;6;CHK;_KM0050010view1/l_JOB_ODR_CD[neq]@*7,*8"
expj.KM0050010.KM0050010form1.child6 = function () {
  console.log('KM0050010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0050010', 'KM0050010form1', '_KM0050010view1/l_JOB_ODR_CD'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script14="child;7;UNMASK;_KM0050010button2/JobOdrProgress"
expj.KM0050010.KM0050010form1.child7 = function () {
  console.log('KM0050010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button2/JobOdrProgress');
};
// script15="child;8;MASK;_KM0050010button2/JobOdrProgress"
expj.KM0050010.KM0050010form1.child8 = function () {
  console.log('KM0050010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('KM0050010', 'KM0050010form1', '_KM0050010button2/JobOdrProgress');
};
expj.KM0050010.KM0050010form1.executeAllOnDecision = function () {
  console.log('execute KM0050010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0050010.KM0050010form1['onDecision' + i])) {
        expj.KM0050010.KM0050010form1['onDecision' + i]();
      }
    }
  }
};
expj.KM0050010.KM0050010form1.executeOnLoad = function () {
  expj.KM0050010.KM0050010form1.executePScriptOnLoad();
};

expj.KM0050010.KM0050010form1.executePScriptOnLoad = function () {
  console.log('execute KM0050010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KM0050010.KM0050010form1['onLoad' + i])) {
      expj.KM0050010.KM0050010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0050010-KM0050010form1" action="KM0050010Servlet" name="KM0050010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKM0050010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROJECT_CD",rb)%></span><!-- 案件番号 --></div><!--/td-->
<script class="expj-script-KM0050010-KM0050010form1-PROJECT_CD">
expj.KM0050010.KM0050010form1.PROJECT_CD = {};
expj.KM0050010.KM0050010form1.PROJECT_CD.executeAllOnDecision = function () {
  console.log('execute KM0050010form1/PROJECT_CD.onDecision');
  expj.KM0050010.KM0050010form1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010form1.PROJECT_CD.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010form1-PROJECT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010form1', 'PROJECT_CD', this);
  });
  expj.KM0050010.KM0050010form1.PROJECT_CD.executePScriptOnLoad();
};

expj.KM0050010.KM0050010form1.PROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0050010form1/PROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010form1-PROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0050010-KM0050010form1-PROJECT_CD" name="PROJECT_CD" class="KM0050010-focus-move  required-value expj-KM0050010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0050010Struct.getPROJECT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0050010-KM0050010form1-PeekerProjectCd">
expj.KM0050010.KM0050010form1.PeekerProjectCd = {};
// script1="onClick;0;PEEKER;_KM0050010form1/PROJECT_CD@<%=contextNo%>"
expj.KM0050010.KM0050010form1.PeekerProjectCd.onClick0 = function () {
  console.log('PeekerProjectCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0050010';
var parameterValues = 'PeekerProjectCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0050010', 'KM0050010form1', '_KM0050010form1/PROJECT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROJECT_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_KM0050010form1/PROJECT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0050010.KM0050010form1.PeekerProjectCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0050010.KM0050010form1.PeekerProjectCd['onClick' + i])) {
        expj.KM0050010.KM0050010form1.PeekerProjectCd['onClick' + i]();
      }
    }
  }
};
expj.KM0050010.KM0050010form1.PeekerProjectCd.executeAllOnDecision = function () {
};
expj.KM0050010.KM0050010form1.PeekerProjectCd.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010form1-PeekerProjectCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0050010', 'KM0050010form1', 'PeekerProjectCd', this, 'Button');
    }
  });
  expj.KM0050010.KM0050010form1.PeekerProjectCd.executePScriptOnLoad();
};

expj.KM0050010.KM0050010form1.PeekerProjectCd.executePScriptOnLoad = function () {
  console.log('execute KM0050010form1/PeekerProjectCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010form1-PeekerProjectCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0050010-KM0050010form1-PeekerProjectCd" class="KM0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0050010-KM0050010form1-PROJECT_NAME">
expj.KM0050010.KM0050010form1.PROJECT_NAME = {};
expj.KM0050010.KM0050010form1.PROJECT_NAME.executeAllOnDecision = function () {
  console.log('execute KM0050010form1/PROJECT_NAME.onDecision');
  expj.KM0050010.KM0050010form1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010form1.PROJECT_NAME.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010form1-PROJECT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010form1', 'PROJECT_NAME', this);
  });
  expj.KM0050010.KM0050010form1.PROJECT_NAME.executePScriptOnLoad();
};

expj.KM0050010.KM0050010form1.PROJECT_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0050010form1/PROJECT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010form1-PROJECT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0050010-KM0050010form1-PROJECT_NAME" name="PROJECT_NAME" class="KM0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0050010Struct.getPROJECT_NAME()) %>" maxlength="100" ></div><!--/td-->
<input type="hidden" id="expj-KM0050010-KM0050010form1-ESTIMATE_NO" name="ESTIMATE_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0050010Struct.getESTIMATE_NO()) %>">
<script class="expj-script-KM0050010-KM0050010form1-ESTIMATE_NO">
expj.KM0050010.KM0050010form1.ESTIMATE_NO = {};
expj.KM0050010.KM0050010form1.ESTIMATE_NO.executeAllOnDecision = function () {
  console.log('execute KM0050010form1/ESTIMATE_NO.onDecision');
  expj.KM0050010.KM0050010form1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010form1.ESTIMATE_NO.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010form1-ESTIMATE_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010form1', 'ESTIMATE_NO', this);
  });
  expj.KM0050010.KM0050010form1.ESTIMATE_NO.executePScriptOnLoad();
};

expj.KM0050010.KM0050010form1.ESTIMATE_NO.executePScriptOnLoad = function () {
  console.log('execute KM0050010form1/ESTIMATE_NO.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010form1-ESTIMATE_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KM0050010-KM0050010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0050010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-KM0050010-KM0050010form1-DOWNLOAD_FILE">
expj.KM0050010.KM0050010form1.DOWNLOAD_FILE = {};
expj.KM0050010.KM0050010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute KM0050010form1/DOWNLOAD_FILE.onDecision');
  expj.KM0050010.KM0050010form1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010form1', 'DOWNLOAD_FILE', this);
  });
  expj.KM0050010.KM0050010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.KM0050010.KM0050010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute KM0050010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TOTAL_DATE",rb)%></span><!-- 集計日時 --></div><!--/td-->
<script class="expj-script-KM0050010-KM0050010form1-CALCULATION_DATE">
expj.KM0050010.KM0050010form1.CALCULATION_DATE = {};
expj.KM0050010.KM0050010form1.CALCULATION_DATE.executeAllOnDecision = function () {
  console.log('execute KM0050010form1/CALCULATION_DATE.onDecision');
  expj.KM0050010.KM0050010form1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010form1.CALCULATION_DATE.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010form1-CALCULATION_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010form1', 'CALCULATION_DATE', this);
  });
  expj.KM0050010.KM0050010form1.CALCULATION_DATE.executePScriptOnLoad();
};

expj.KM0050010.KM0050010form1.CALCULATION_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0050010form1/CALCULATION_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010form1-CALCULATION_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0050010-KM0050010form1-CALCULATION_DATE" name="CALCULATION_DATE" class="KM0050010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMDTIME" value="<%= TypeConverter.sanitizer(aKM0050010Struct.getCALCULATION_DATE()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-KM0050010-KM0050010form1-PJ_MODIFY_COUNT" name="PJ_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0050010Struct.getPJ_MODIFY_COUNT()) %>">
<script class="expj-script-KM0050010-KM0050010form1-PJ_MODIFY_COUNT">
expj.KM0050010.KM0050010form1.PJ_MODIFY_COUNT = {};
expj.KM0050010.KM0050010form1.PJ_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KM0050010form1/PJ_MODIFY_COUNT.onDecision');
  expj.KM0050010.KM0050010form1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010form1.PJ_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010form1-PJ_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010form1', 'PJ_MODIFY_COUNT', this);
  });
  expj.KM0050010.KM0050010form1.PJ_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KM0050010.KM0050010form1.PJ_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KM0050010form1/PJ_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010form1-PJ_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-KM0050010-KM0050010button1">
expj.KM0050010.KM0050010button1 = {};
expj.KM0050010.KM0050010button1.executeAllOnDecision = function () {
  console.log('execute KM0050010button1.onDecision');
};
expj.KM0050010.KM0050010button1.executeOnLoad = function () {
  expj.KM0050010.KM0050010button1.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button1.executePScriptOnLoad = function () {
  console.log('execute KM0050010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0050010-KM0050010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0050010-KM0050010button1-TotalShow">
expj.KM0050010.KM0050010button1.TotalShow = {};
// script1="onClick;0;FSHOW;KM0050010float1"
expj.KM0050010.KM0050010button1.TotalShow.onClick0 = function () {
  console.log('TotalShow script1');
expj.common.pscript.showDetailWindow('KM0050010', 'KM0050010float1', '');
};
expj.KM0050010.KM0050010button1.TotalShow.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0050010.KM0050010button1.TotalShow['onClick' + i])) {
        expj.KM0050010.KM0050010button1.TotalShow['onClick' + i]();
      }
    }
  }
};
expj.KM0050010.KM0050010button1.TotalShow.executeAllOnDecision = function () {
};
expj.KM0050010.KM0050010button1.TotalShow.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010button1-TotalShow').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0050010', 'KM0050010button1', 'TotalShow', this, 'Button');
    }
  });
  expj.KM0050010.KM0050010button1.TotalShow.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button1.TotalShow.executePScriptOnLoad = function () {
  console.log('execute KM0050010button1/TotalShow.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010button1-TotalShow');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0050010-KM0050010button1-TotalShow" name="TotalShow" class="KM0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnTOTAL_SHOW",rb)%></button><!-- 合計表示ボタン --></div><!--/td-->
<script class="expj-script-KM0050010-KM0050010button1-Recalculation">
expj.KM0050010.KM0050010button1.Recalculation = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0050010form1/*@KM0050010Servlet"
expj.KM0050010.KM0050010button1.Recalculation.onClick0 = function () {
  console.log('Recalculation script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0050010', 'KM0050010button1', '_KM0050010form1/*', 'KM0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0050010', response);
expj.common.updateBusinessScreenTab('KM0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0050010.KM0050010button1.Recalculation.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0050010.KM0050010button1.Recalculation['onClick' + i])) {
        expj.KM0050010.KM0050010button1.Recalculation['onClick' + i]();
      }
    }
  }
};
expj.KM0050010.KM0050010button1.Recalculation.executeAllOnDecision = function () {
};
expj.KM0050010.KM0050010button1.Recalculation.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010button1-Recalculation').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0050010', 'KM0050010button1', 'Recalculation', this, 'Button');
    }
  });
  expj.KM0050010.KM0050010button1.Recalculation.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button1.Recalculation.executePScriptOnLoad = function () {
  console.log('execute KM0050010button1/Recalculation.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010button1-Recalculation');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0050010-KM0050010button1-Recalculation" name="Recalculation" class="KM0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnRECALCULATION",rb)%></button><!-- 再計算ボタン --></div><!--/td-->
<script class="expj-script-KM0050010-KM0050010button1-Select">
expj.KM0050010.KM0050010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0050010form1/*@KM0050010Servlet"
expj.KM0050010.KM0050010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0050010', 'KM0050010button1', '_KM0050010form1/*', 'KM0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0050010', response);
expj.common.updateBusinessScreenTab('KM0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0050010.KM0050010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0050010.KM0050010button1.Select['onClick' + i])) {
        expj.KM0050010.KM0050010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KM0050010.KM0050010button1.Select.executeAllOnDecision = function () {
};
expj.KM0050010.KM0050010button1.Select.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0050010', 'KM0050010button1', 'Select', this, 'Button');
    }
  });
  expj.KM0050010.KM0050010button1.Select.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KM0050010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0050010-KM0050010button1-Select" name="Select" class="KM0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KM0050010-KM0050010view1">
expj.KM0050010.KM0050010view1 = {};
expj.KM0050010.KM0050010view1.executeAllOnClick = function () {
};
expj.KM0050010.KM0050010view1.executeAllOnDecision = function () {
  console.log('execute KM0050010view1.onDecision');
};
expj.KM0050010.KM0050010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KM0050010view1", "expj.KM0050010.KM0050010view1.executeAllOnClick");
%>
  expj.KM0050010.KM0050010view1.executePScriptOnLoad();
};

expj.KM0050010.KM0050010view1.executePScriptOnLoad = function () {
  console.log('execute KM0050010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KM0050010-KM0050010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%=TypeConverter.sanitizer(aKM0050010Control.getReadStatus())%>"></div>
<!-- VIEW END -->
<%
 String KM0050010view1_Id = "KM0050010view1";
 String KM0050010view1_select = "single";
 String KM0050010view1_sortable = "true";
 String KM0050010view1_resize = "true";
 String KM0050010view1_scroll = "true";
 StringBuffer KM0050010view1_HB = new StringBuffer();
 StringBuffer KM0050010view1_DB = new StringBuffer();
%>
<%
 KM0050010view1_select = "single";
 KM0050010view1_sortable = "false";
 KM0050010view1_resize = "true";
 KM0050010view1_scroll = "true";
%>
<%
 KM0050010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
%>
     <script class="expj-script-KM0050010-KM0050010view1-ES_COST_ETC">
expj.KM0050010.KM0050010view1.ES_COST_ETC = {};
expj.KM0050010.KM0050010view1.ES_COST_ETC.executeAllOnClick = function () {
};
expj.KM0050010.KM0050010view1.ES_COST_ETC.executeAllOnDecision = function () {
  console.log('execute KM0050010view1/ES_COST_ETC.onDecision');
  expj.KM0050010.KM0050010view1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010view1.ES_COST_ETC.executeOnLoad = function () {
  $('.expj-KM0050010-KM0050010view1-ES_COST_ETC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010view1', 'ES_COST_ETC', this);
  });
  expj.KM0050010.KM0050010view1.ES_COST_ETC.executePScriptOnLoad();
};

expj.KM0050010.KM0050010view1.ES_COST_ETC.executePScriptOnLoad = function () {
  console.log('execute KM0050010view1/ES_COST_ETC.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KM0050010-KM0050010view1-l_JOB_ODR_CANCEL_NO">
expj.KM0050010.KM0050010view1.l_JOB_ODR_CANCEL_NO = {};
expj.KM0050010.KM0050010view1.l_JOB_ODR_CANCEL_NO.executeAllOnClick = function () {
};
expj.KM0050010.KM0050010view1.l_JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute KM0050010view1/l_JOB_ODR_CANCEL_NO.onDecision');
  expj.KM0050010.KM0050010view1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010view1.l_JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('.expj-KM0050010-KM0050010view1-l_JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010view1', 'l_JOB_ODR_CANCEL_NO', this);
  });
  expj.KM0050010.KM0050010view1.l_JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.KM0050010.KM0050010view1.l_JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute KM0050010view1/l_JOB_ODR_CANCEL_NO.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KM0050010-KM0050010view1-l_PLANT_CD">
expj.KM0050010.KM0050010view1.l_PLANT_CD = {};
expj.KM0050010.KM0050010view1.l_PLANT_CD.executeAllOnClick = function () {
};
expj.KM0050010.KM0050010view1.l_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute KM0050010view1/l_PLANT_CD.onDecision');
  expj.KM0050010.KM0050010view1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010view1.l_PLANT_CD.executeOnLoad = function () {
  $('.expj-KM0050010-KM0050010view1-l_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010view1', 'l_PLANT_CD', this);
  });
  expj.KM0050010.KM0050010view1.l_PLANT_CD.executePScriptOnLoad();
};

expj.KM0050010.KM0050010view1.l_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0050010view1/l_PLANT_CD.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KM0050010-KM0050010view1-ODR_AMOUNT">
expj.KM0050010.KM0050010view1.ODR_AMOUNT = {};
expj.KM0050010.KM0050010view1.ODR_AMOUNT.executeAllOnClick = function () {
};
expj.KM0050010.KM0050010view1.ODR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KM0050010view1/ODR_AMOUNT.onDecision');
  expj.KM0050010.KM0050010view1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010view1.ODR_AMOUNT.executeOnLoad = function () {
  $('.expj-KM0050010-KM0050010view1-ODR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010view1', 'ODR_AMOUNT', this);
  });
  expj.KM0050010.KM0050010view1.ODR_AMOUNT.executePScriptOnLoad();
};

expj.KM0050010.KM0050010view1.ODR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KM0050010view1/ODR_AMOUNT.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KM0050010-KM0050010view1-ODR_QTY">
expj.KM0050010.KM0050010view1.ODR_QTY = {};
expj.KM0050010.KM0050010view1.ODR_QTY.executeAllOnClick = function () {
};
expj.KM0050010.KM0050010view1.ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KM0050010view1/ODR_QTY.onDecision');
  expj.KM0050010.KM0050010view1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010view1.ODR_QTY.executeOnLoad = function () {
  $('.expj-KM0050010-KM0050010view1-ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010view1', 'ODR_QTY', this);
  });
  expj.KM0050010.KM0050010view1.ODR_QTY.executePScriptOnLoad();
};

expj.KM0050010.KM0050010view1.ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KM0050010view1/ODR_QTY.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KM0050010-KM0050010view1-ODR_UNIT_PRICE">
expj.KM0050010.KM0050010view1.ODR_UNIT_PRICE = {};
expj.KM0050010.KM0050010view1.ODR_UNIT_PRICE.executeAllOnClick = function () {
};
expj.KM0050010.KM0050010view1.ODR_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KM0050010view1/ODR_UNIT_PRICE.onDecision');
  expj.KM0050010.KM0050010view1.executeAllOnDecision();
  expj.KM0050010.executeAllOnDecision();
};
expj.KM0050010.KM0050010view1.ODR_UNIT_PRICE.executeOnLoad = function () {
  $('.expj-KM0050010-KM0050010view1-ODR_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0050010', 'KM0050010view1', 'ODR_UNIT_PRICE', this);
  });
  expj.KM0050010.KM0050010view1.ODR_UNIT_PRICE.executePScriptOnLoad();
};

expj.KM0050010.KM0050010view1.ODR_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KM0050010view1/ODR_UNIT_PRICE.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'TYP_NUM', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_DETAL_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_ES_COST_ETC', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_COST_PROGRESS', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0065",rb))).append("', 'name':'TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'50px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DETAIL_NO",rb))).append("', 'name':'DETAL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ARRANGE_ITEMS_SPECIES",rb))).append("', 'name':'ESTIMATE_TYPE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_AMOUNT",rb))).append("', 'name':'l_ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROGRESS",rb))).append("', 'name':'PROGRESS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'50px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROFIT_RATIO",rb))).append("', 'name':'PROFIT_RATIO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0033",rb))).append("', 'name':'ITEM_TOTAL_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MATERIAL_COST",rb))).append("', 'name':'ES_COST_MATERIAL', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROCESSING_COST",rb))).append("', 'name':'ES_COST_PROCESS', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SBCNT_COST",rb))).append("', 'name':'ES_COST_OUTSOUCE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb))).append("', 'name':'ES_COST_ETC', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SERVICE_COST",rb))).append("', 'name':'ES_COST_SERVICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.QTY",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'UNIT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_UNIT_PRICE",rb))).append("', 'name':'l_ODR_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'DESINATED_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_CANCEL_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PLANT_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ODR_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ODR_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
KM0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ODR_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0050010view1_sortable).append("}").append(",");
%>
<%
 int aKM0050010StructLength = aKM0050010Control.getListsize();
 final KM0050010Struct structBackup = aKM0050010Struct;
 aKM0050010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKM0050010StructLength; ++loopCount) {
  if((aKM0050010Struct = (KM0050010Struct) aKM0050010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKM0050010Struct", aKM0050010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KM0050010view1_DB.append("[");
 KM0050010view1_DB.append(loopCount);
%> <%
String bgcolor = "";
String bgcolorProcess = "";

if ("1".equals(aKM0050010Struct.getTYP_NUM())) {
    bgcolor="BFBFBF";
	if ("0".equals(aKM0050010Struct.geth_COST_PROGRESS())) {
		bgcolorProcess="FFFF99";
	} else if ("1".equals(aKM0050010Struct.geth_COST_PROGRESS())) {
		bgcolorProcess="A9EA9E";
	} else if ("2".equals(aKM0050010Struct.geth_COST_PROGRESS())) {
		bgcolorProcess="ADD8E6";
	} else {
		bgcolorProcess="BFBFBF";
	}
}
String etceditable = "false";
if ("2".equals(aKM0050010Struct.getTYP_NUM())) {
	etceditable = "true";
}
String minusColorProfit = "";
String minusColorTotal = "";
String minusColorMaterial = "";
String minusColorProcess = "";
String minusColorOutsouce = "";
String minusColorEtc = "";
String minusColorService = "";
if (!"2".equals(aKM0050010Struct.getTYP_NUM()) && aKM0050010Struct.getPROFIT_RATIO().startsWith("-")) {
	minusColorProfit = "FF0000";
}
if (aKM0050010Struct.getITEM_TOTAL_COST().startsWith("-")) {
	minusColorTotal = "FF0000";
}
if (aKM0050010Struct.getES_COST_MATERIAL().startsWith("-")) {
	minusColorMaterial = "FF0000";
}
if (aKM0050010Struct.getES_COST_PROCESS().startsWith("-")) {
	minusColorProcess = "FF0000";
}
if (aKM0050010Struct.getES_COST_OUTSOUCE().startsWith("-")) {
	minusColorOutsouce = "FF0000";
}
if (aKM0050010Struct.getES_COST_ETC().startsWith("-")) {
	minusColorEtc = "FF0000";
}
if (aKM0050010Struct.getES_COST_SERVICE().startsWith("-")) {
	minusColorService = "FF0000";
}
%> <%
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-TYP_NUM-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-TYP_NUM\" data-name=\"TYP_NUM\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0050010Struct.getTYP_NUM())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0050010Struct.getMODIFY_COUNT())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-h_DETAL_NO-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-h_DETAL_NO\" data-name=\"h_DETAL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0050010Struct.geth_DETAL_NO())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-h_ES_COST_ETC-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-h_ES_COST_ETC\" data-name=\"h_ES_COST_ETC\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0050010Struct.geth_ES_COST_ETC())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-h_COST_PROGRESS-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-h_COST_PROGRESS\" data-name=\"h_COST_PROGRESS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0050010Struct.geth_COST_PROGRESS())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-TYP\" data-name=\"TYP\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getTYP())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-DETAL_NO-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-DETAL_NO\" data-name=\"DETAL_NO\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getDETAL_NO())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-ESTIMATE_TYPE-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-ESTIMATE_TYPE\" data-name=\"ESTIMATE_TYPE\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getESTIMATE_TYPE())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-CUST_ITEM_CD\" data-name=\"CUST_ITEM_CD\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getCUST_ITEM_CD())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getITEM_NAME())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-l_ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-l_ODR_AMOUNT\" data-name=\"l_ODR_AMOUNT\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getl_ODR_AMOUNT())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-PROGRESS-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-PROGRESS\" data-name=\"PROGRESS\" data-view=\"true\" data-bgcolor=\"").append(bgcolorProcess).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getPROGRESS())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-PROFIT_RATIO-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-PROFIT_RATIO\" data-name=\"PROFIT_RATIO\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\" data-kind=\"OBT_WILD\" style=\"color:#").append(minusColorProfit).append(";\">").append(TypeConverter.sanitizer(aKM0050010Struct.getPROFIT_RATIO())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-ITEM_TOTAL_COST-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-ITEM_TOTAL_COST\" data-name=\"ITEM_TOTAL_COST\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\" data-kind=\"OBT_NUMBER;14.2;CEIL;4\" style=\"color:#").append(minusColorTotal).append(";\">").append(TypeConverter.sanitizer(aKM0050010Struct.getITEM_TOTAL_COST())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-ES_COST_MATERIAL-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-ES_COST_MATERIAL\" data-name=\"ES_COST_MATERIAL\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\" data-kind=\"OBT_NUMBER;14.2;CEIL;4\" style=\"color:#").append(minusColorMaterial).append(";\">").append(TypeConverter.sanitizer(aKM0050010Struct.getES_COST_MATERIAL())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-ES_COST_PROCESS-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-ES_COST_PROCESS\" data-name=\"ES_COST_PROCESS\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\" data-kind=\"OBT_NUMBER;14.2;CEIL;4\" style=\"color:#").append(minusColorProcess).append(";\">").append(TypeConverter.sanitizer(aKM0050010Struct.getES_COST_PROCESS())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-ES_COST_OUTSOUCE-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-ES_COST_OUTSOUCE\" data-name=\"ES_COST_OUTSOUCE\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\" data-kind=\"OBT_NUMBER;14.2;CEIL;4\" style=\"color:#").append(minusColorOutsouce).append(";\">").append(TypeConverter.sanitizer(aKM0050010Struct.getES_COST_OUTSOUCE())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-KM0050010-KM0050010view1-ES_COST_ETC-").append(loopCount).append("\" class=\"expj-KM0050010-KM0050010view1-ES_COST_ETC KM0050010-focus-move\" data-name=\"ES_COST_ETC\" data-view=\"true\" style=\"text-align:right; color:#").append(minusColorEtc).append(";\" maxlength=\"2147483647\"  data-bgcolor=\"").append(bgcolor).append("\" data-kind=\"").append("OBT_NUMBER_Z;14.2;CEIL;4").append("\"").append("false".equals(etceditable) ? " disabled=\"disabled\"" : "").append(" value=\"").append(TypeConverter.sanitizer(aKM0050010Struct.getES_COST_ETC())).append("\">'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-ES_COST_SERVICE-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-ES_COST_SERVICE\" data-name=\"ES_COST_SERVICE\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\" data-kind=\"OBT_NUMBER;14.2;CEIL;4\" style=\"color:#").append(minusColorService).append(";\">").append(TypeConverter.sanitizer(aKM0050010Struct.getES_COST_SERVICE())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getl_ODR_QTY())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-UNIT_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-UNIT_CD\" data-name=\"UNIT_CD\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getUNIT_CD())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-l_ODR_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-l_ODR_UNIT_PRICE\" data-name=\"l_ODR_UNIT_PRICE\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getl_ODR_UNIT_PRICE())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-DESINATED_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-DESINATED_DLV_DATE\" data-name=\"DESINATED_DLV_DATE\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getDESINATED_DLV_DATE())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<span id=\"expj-KM0050010-KM0050010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0050010-KM0050010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKM0050010Struct.getl_JOB_ODR_CD())).append("</span>'");
 KM0050010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-KM0050010-KM0050010view1-l_JOB_ODR_CANCEL_NO-").append(loopCount).append("\" class=\"expj-KM0050010-KM0050010view1-l_JOB_ODR_CANCEL_NO KM0050010-focus-move\" data-name=\"l_JOB_ODR_CANCEL_NO\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aKM0050010Struct.getl_JOB_ODR_CANCEL_NO())).append("\">'");
 KM0050010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-KM0050010-KM0050010view1-l_PLANT_CD-").append(loopCount).append("\" class=\"expj-KM0050010-KM0050010view1-l_PLANT_CD KM0050010-focus-move\" data-name=\"l_PLANT_CD\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aKM0050010Struct.getl_PLANT_CD())).append("\">'");
 KM0050010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-KM0050010-KM0050010view1-ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-KM0050010-KM0050010view1-ODR_AMOUNT KM0050010-focus-move\" data-name=\"ODR_AMOUNT\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aKM0050010Struct.getODR_AMOUNT())).append("\">'");
 KM0050010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-KM0050010-KM0050010view1-ODR_QTY-").append(loopCount).append("\" class=\"expj-KM0050010-KM0050010view1-ODR_QTY KM0050010-focus-move\" data-name=\"ODR_QTY\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aKM0050010Struct.getODR_QTY())).append("\">'");
 KM0050010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-KM0050010-KM0050010view1-ODR_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-KM0050010-KM0050010view1-ODR_UNIT_PRICE KM0050010-focus-move\" data-name=\"ODR_UNIT_PRICE\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aKM0050010Struct.getODR_UNIT_PRICE())).append("\">'");
 KM0050010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKM0050010StructLength) {
   KM0050010view1_DB.append(",");
  }
 }
 aKM0050010Struct = structBackup;
 viewIdList.add(KM0050010view1_Id);
 viewSelectList.add(KM0050010view1_select);
 viewResizeList.add(KM0050010view1_resize);
 viewScrollList.add(KM0050010view1_scroll);
 viewHeaderDataList.add(KM0050010view1_HB);
 viewBodyDataList.add(KM0050010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-KM0050010-KM0050010button2">
expj.KM0050010.KM0050010button2 = {};
expj.KM0050010.KM0050010button2.executeAllOnDecision = function () {
  console.log('execute KM0050010button2.onDecision');
};
expj.KM0050010.KM0050010button2.executeOnLoad = function () {
  expj.KM0050010.KM0050010button2.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button2.executePScriptOnLoad = function () {
  console.log('execute KM0050010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0050010-KM0050010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0050010-KM0050010button2-OtherRegister">
expj.KM0050010.KM0050010button2.OtherRegister = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0050010form1/*,_KM0050010view1/*@KM0050010Servlet,,$ZZ07003"
expj.KM0050010.KM0050010button2.OtherRegister.onClick0 = function () {
  console.log('OtherRegister script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0050010', 'KM0050010button2', '_KM0050010form1/*,_KM0050010view1/*', 'KM0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0050010', response);
expj.common.updateBusinessScreenTab('KM0050010', contents);
};
expj.common.pscript.callConfirm('KM0050010', 'KM0050010button2', 'ZZ07003', okEvent);
};
expj.KM0050010.KM0050010button2.OtherRegister.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0050010.KM0050010button2.OtherRegister['onClick' + i])) {
        expj.KM0050010.KM0050010button2.OtherRegister['onClick' + i]();
      }
    }
  }
};
expj.KM0050010.KM0050010button2.OtherRegister.executeAllOnDecision = function () {
};
expj.KM0050010.KM0050010button2.OtherRegister.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010button2-OtherRegister').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0050010', 'KM0050010button2', 'OtherRegister', this, 'Button');
    }
  });
  expj.KM0050010.KM0050010button2.OtherRegister.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button2.OtherRegister.executePScriptOnLoad = function () {
  console.log('execute KM0050010button2/OtherRegister.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010button2-OtherRegister');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0050010-KM0050010button2-OtherRegister" name="OtherRegister" class="KM0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnOTHER_REGISTER",rb)%></button><!-- その他経費登録ボタン --></div><!--/td-->
<script class="expj-script-KM0050010-KM0050010button2-JobOdrProgress">
expj.KM0050010.KM0050010button2.JobOdrProgress = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KM0050010view1/+@AJ0020010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.KM0050010.KM0050010button2.JobOdrProgress.onClick0 = function () {
  console.log('JobOdrProgress script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0050010', 'KM0050010button2', '_KM0050010view1/+', 'AJ0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AJ0020010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AJ0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'KM0050010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0050010.KM0050010button2.JobOdrProgress.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0050010.KM0050010button2.JobOdrProgress['onClick' + i])) {
        expj.KM0050010.KM0050010button2.JobOdrProgress['onClick' + i]();
      }
    }
  }
};
expj.KM0050010.KM0050010button2.JobOdrProgress.executeAllOnDecision = function () {
};
expj.KM0050010.KM0050010button2.JobOdrProgress.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010button2-JobOdrProgress').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0050010', 'KM0050010button2', 'JobOdrProgress', this, 'Button');
    }
  });
  expj.KM0050010.KM0050010button2.JobOdrProgress.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button2.JobOdrProgress.executePScriptOnLoad = function () {
  console.log('execute KM0050010button2/JobOdrProgress.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010button2-JobOdrProgress');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0050010-KM0050010button2-JobOdrProgress" name="JobOdrProgress" class="KM0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnJobOdrProgress",rb)%></button><!-- 製番別進捗ボタン --></div><!--/td-->
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
<span class="version">KM0050010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-KM0050010-KM0050010button0">
expj.KM0050010.KM0050010button0 = {};
expj.KM0050010.KM0050010button0.executeAllOnDecision = function () {
  console.log('execute KM0050010button0.onDecision');
};
expj.KM0050010.KM0050010button0.executeOnLoad = function () {
  expj.KM0050010.KM0050010button0.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button0.executePScriptOnLoad = function () {
  console.log('execute KM0050010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0050010-KM0050010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0050010-KM0050010button0-CSVOut">
expj.KM0050010.KM0050010button0.CSVOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0050010form1/*@KM0050010Servlet,,$ZZ07011"
expj.KM0050010.KM0050010button0.CSVOut.onClick0 = function () {
  console.log('CSVOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0050010', 'KM0050010button0', '_KM0050010form1/*', 'KM0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0050010', response);
expj.common.updateBusinessScreenTab('KM0050010', contents);
};
expj.common.pscript.callConfirm('KM0050010', 'KM0050010button0', 'ZZ07011', okEvent);
};
expj.KM0050010.KM0050010button0.CSVOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0050010.KM0050010button0.CSVOut['onClick' + i])) {
        expj.KM0050010.KM0050010button0.CSVOut['onClick' + i]();
      }
    }
  }
};
expj.KM0050010.KM0050010button0.CSVOut.executeAllOnDecision = function () {
};
expj.KM0050010.KM0050010button0.CSVOut.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010button0-CSVOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0050010', 'KM0050010button0', 'CSVOut', this, 'Button');
    }
  });
  expj.KM0050010.KM0050010button0.CSVOut.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button0.CSVOut.executePScriptOnLoad = function () {
  console.log('execute KM0050010button0/CSVOut.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010button0-CSVOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0050010-KM0050010button0-CSVOut" name="CSVOut" class="KM0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-KM0050010-KM0050010button0-Clear">
expj.KM0050010.KM0050010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KM0050010Servlet,,$ZZ07008"
expj.KM0050010.KM0050010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0050010', 'KM0050010button0', '', 'KM0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0050010', response);
expj.common.updateBusinessScreenTab('KM0050010', contents);
};
expj.common.pscript.callConfirm('KM0050010', 'KM0050010button0', 'ZZ07008', okEvent);
};
expj.KM0050010.KM0050010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0050010.KM0050010button0.Clear['onClick' + i])) {
        expj.KM0050010.KM0050010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KM0050010.KM0050010button0.Clear.executeAllOnDecision = function () {
};
expj.KM0050010.KM0050010button0.Clear.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0050010', 'KM0050010button0', 'Clear', this, 'Button');
    }
  });
  expj.KM0050010.KM0050010button0.Clear.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KM0050010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0050010-KM0050010button0-Clear" name="Clear" class="KM0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KM0050010-KM0050010button0-Close">
expj.KM0050010.KM0050010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KM0050010.KM0050010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KM0050010');
};
expj.KM0050010.KM0050010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0050010.KM0050010button0.Close['onClick' + i])) {
        expj.KM0050010.KM0050010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KM0050010.KM0050010button0.Close.executeAllOnDecision = function () {
};
expj.KM0050010.KM0050010button0.Close.executeOnLoad = function () {
  $('#expj-KM0050010-KM0050010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0050010', 'KM0050010button0', 'Close', this, 'Button');
    }
  });
  expj.KM0050010.KM0050010button0.Close.executePScriptOnLoad();
};

expj.KM0050010.KM0050010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KM0050010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KM0050010-KM0050010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0050010-KM0050010button0-Close" name="Close" class="KM0050010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KM0050010 (END)-->
<script class="expj-script-KM0050010-KM0050010detail1">
expj.KM0050010.KM0050010detail1 = {};
expj.KM0050010.KM0050010detail1.executeAllOnDecision = function () {
  console.log('execute KM0050010detail1.onDecision');
};
expj.KM0050010.KM0050010detail1.executeOnLoad = function () {
  expj.KM0050010.KM0050010detail1.executePScriptOnLoad();
};

expj.KM0050010.KM0050010detail1.executePScriptOnLoad = function () {
  console.log('execute KM0050010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aKM0050010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-KM0050010-KM0050010detail1" class="expj-datagird-detail" data-float="KM0050010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "KM0050010detail1";
 detailFloat = "KM0050010float1";
 detailWidth = 520;
 detailHeight = 200 + 47;
 String KM0050010detail1_Id = "KM0050010detail1";
 String KM0050010detail1_select = "single";
 String KM0050010detail1_sortable = "true";
 String KM0050010detail1_resize = "true";
 String KM0050010detail1_scroll = "true";
 StringBuffer KM0050010detail1_HB = new StringBuffer();
 StringBuffer KM0050010detail1_DB = new StringBuffer();
%>
<%
 KM0050010detail1_sortable = "false";
 KM0050010detail1_select = "none";
%>
<% KM0050010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(KM0050010detail1_sortable).append("}").append(","); %>
<%  KM0050010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-','sortable':").append(KM0050010detail1_sortable).append("}").append(",");
KM0050010detail1_HB.append("{'visible':true,'width':'80px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(KM0050010detail1_sortable).append("}").append(",");
KM0050010detail1_HB.append("{'visible':true,'width':'80px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(KM0050010detail1_sortable).append("}").append(",");
KM0050010detail1_HB.append("{'visible':true,'width':'80px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(KM0050010detail1_sortable).append("}").append(",");
KM0050010detail1_HB.append("{'visible':true,'width':'80px','title':'','name':'col5','class':'expj-detail-cell expj-align-','sortable':").append(KM0050010detail1_sortable).append("}").append(",");
KM0050010detail1_HB.append("{'visible':true,'width':'80px','title':'','name':'col6','class':'expj-detail-cell expj-align-','sortable':").append(KM0050010detail1_sortable).append("}").append(",");
 %>
  <% KM0050010detail1_DB.append("['1','").append("").append("','").append(CoreTools.getRBString("Expj.Cmt6687",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt0725",rb)).append("','").append(CoreTools.getRBString("Expj.Prospects",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt6713",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt6714",rb)).append("']").append(",");%>
 <% KM0050010detail1_DB.append("['2','<div class=\"expj-align-right\">").append(CoreTools.getRBString("Expj.Cmt6712",rb)).append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-ODR_AMOUNT_W\" class=\"expj-label\" data-name=\"ODR_AMOUNT_W\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getODR_AMOUNT_W())).append("</span>").append("</div>','").append("").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% KM0050010detail1_DB.append("['3','<div class=\"expj-align-right\">").append(CoreTools.getRBString("Expj.Cmt6711",rb)).append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-ITEM_TOTAL_COST_W\" class=\"expj-label\" data-name=\"ITEM_TOTAL_COST_W\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getITEM_TOTAL_COST_W())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-ITEM_TOTAL_COST_T\" class=\"expj-label\" data-name=\"ITEM_TOTAL_COST_T\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getITEM_TOTAL_COST_T())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-ITEM_TOTAL_COST_P\" class=\"expj-label\" data-name=\"ITEM_TOTAL_COST_P\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getITEM_TOTAL_COST_P())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-ITEM_TOTAL_COST_D\" class=\"expj-label\" data-name=\"ITEM_TOTAL_COST_D\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getITEM_TOTAL_COST_D())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-ITEM_TOTAL_COST_D2\" class=\"expj-label\" data-name=\"ITEM_TOTAL_COST_D2\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getITEM_TOTAL_COST_D2())).append("</span>").append("</div>']").append(",");%>
 <% KM0050010detail1_DB.append("['4','").append("").append("','").append("").append("','").append("").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% KM0050010detail1_DB.append("['5','<div class=\"expj-align-right\">").append(CoreTools.getRBString("Expj.MATERIAL_COST",rb)).append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-MATERIAL_COST_W\" class=\"expj-label\" data-name=\"MATERIAL_COST_W\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getMATERIAL_COST_W())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-MATERIAL_COST_T\" class=\"expj-label\" data-name=\"MATERIAL_COST_T\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getMATERIAL_COST_T())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-MATERIAL_COST_P\" class=\"expj-label\" data-name=\"MATERIAL_COST_P\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getMATERIAL_COST_P())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-MATERIAL_COST_D\" class=\"expj-label\" data-name=\"MATERIAL_COST_D\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getMATERIAL_COST_D())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-MATERIAL_COST_D2\" class=\"expj-label\" data-name=\"MATERIAL_COST_D2\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getMATERIAL_COST_D2())).append("</span>").append("</div>']").append(",");%>
 <% KM0050010detail1_DB.append("['6','<div class=\"expj-align-right\">").append(CoreTools.getRBString("Expj.PROCESSING_COST",rb)).append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-PROCESSING_COST_W\" class=\"expj-label\" data-name=\"PROCESSING_COST_W\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getPROCESSING_COST_W())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-PROCESSING_COST_T\" class=\"expj-label\" data-name=\"PROCESSING_COST_T\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getPROCESSING_COST_T())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-PROCESSING_COST_P\" class=\"expj-label\" data-name=\"PROCESSING_COST_P\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getPROCESSING_COST_P())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-PROCESSING_COST_D\" class=\"expj-label\" data-name=\"PROCESSING_COST_D\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getPROCESSING_COST_D())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-PROCESSING_COST_D2\" class=\"expj-label\" data-name=\"PROCESSING_COST_D2\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getPROCESSING_COST_D2())).append("</span>").append("</div>']").append(",");%>
 <% KM0050010detail1_DB.append("['7','<div class=\"expj-align-right\">").append(CoreTools.getRBString("Expj.SBCNT_COST",rb)).append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-SBCNT_COST_W\" class=\"expj-label\" data-name=\"SBCNT_COST_W\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getSBCNT_COST_W())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-SBCNT_COST_T\" class=\"expj-label\" data-name=\"SBCNT_COST_T\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getSBCNT_COST_T())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-SBCNT_COST_P\" class=\"expj-label\" data-name=\"SBCNT_COST_P\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getSBCNT_COST_P())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-SBCNT_COST_D\" class=\"expj-label\" data-name=\"SBCNT_COST_D\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getSBCNT_COST_D())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-SBCNT_COST_D2\" class=\"expj-label\" data-name=\"SBCNT_COST_D2\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getSBCNT_COST_D2())).append("</span>").append("</div>']").append(",");%>
 <% KM0050010detail1_DB.append("['8','<div class=\"expj-align-right\">").append(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb)).append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-OTHER_OVERHEADS_W\" class=\"expj-label\" data-name=\"OTHER_OVERHEADS_W\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getOTHER_OVERHEADS_W())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-OTHER_OVERHEADS_T\" class=\"expj-label\" data-name=\"OTHER_OVERHEADS_T\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getOTHER_OVERHEADS_T())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-OTHER_OVERHEADS_P\" class=\"expj-label\" data-name=\"OTHER_OVERHEADS_P\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getOTHER_OVERHEADS_P())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-OTHER_OVERHEADS_D\" class=\"expj-label\" data-name=\"OTHER_OVERHEADS_D\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getOTHER_OVERHEADS_D())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-OTHER_OVERHEADS_D2\" class=\"expj-label\" data-name=\"OTHER_OVERHEADS_D2\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getOTHER_OVERHEADS_D2())).append("</span>").append("</div>']").append(",");%>
 <% KM0050010detail1_DB.append("['9','<div class=\"expj-align-right\">").append(CoreTools.getRBString("Expj.SERVICE_COST",rb)).append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-SERVICE_COST_W\" class=\"expj-label\" data-name=\"SERVICE_COST_W\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getSERVICE_COST_W())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-SERVICE_COST_T\" class=\"expj-label\" data-name=\"SERVICE_COST_T\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getSERVICE_COST_T())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-SERVICE_COST_P\" class=\"expj-label\" data-name=\"SERVICE_COST_P\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getSERVICE_COST_P())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-SERVICE_COST_D\" class=\"expj-label\" data-name=\"SERVICE_COST_D\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getSERVICE_COST_D())).append("</span>").append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-SERVICE_COST_D2\" class=\"expj-label\" data-name=\"SERVICE_COST_D2\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKM0050010Struct.getSERVICE_COST_D2())).append("</span>").append("</div>']").append(",");%>
 <% KM0050010detail1_DB.append("['10','<div class=\"expj-align-right\">").append(CoreTools.getRBString("Expj.PROFIT_RATIO",rb)).append("</div>','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-PROFIT_RATIO_W\" class=\"expj-label\" data-name=\"PROFIT_RATIO_W\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKM0050010Struct.getPROFIT_RATIO_W())).append("</span>").append("</div>','").append("").append("','<div class=\"expj-align-right\">").append("<span id=\"expj-KM0050010-KM0050010detail1-PROFIT_RATIO_P\" class=\"expj-label\" data-name=\"PROFIT_RATIO_P\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKM0050010Struct.getPROFIT_RATIO_P())).append("</span>").append("</div>','").append("").append("','").append("").append("']").append(",");%>
<%
 detailViewId = KM0050010detail1_Id;
 detailViewSelect = KM0050010detail1_select;
 detailViewResize = KM0050010detail1_resize;
 detailViewScroll = KM0050010detail1_scroll;
 detailViewHeaderData = KM0050010detail1_HB;
 detailViewBodyData = KM0050010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aKM0050010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KM0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KM0050010)) {
  expj.common.treeInstanceMap.KM0050010 = {};
}
expj.common.treeInstanceMap.KM0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KM0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KM0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KM0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KM0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KM0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KM0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KM0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KM0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0050010)) {
  expj.common.detailDialogMap.KM0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KM0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.KM0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KM0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KM0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KM0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KM0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KM0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KM0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KM0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KM0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KM0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KM0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KM0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KM0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KM0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KM0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KM0050010)) {
  expj.common.viewInstanceMap.KM0050010 = {};
}
expj.common.viewInstanceMap.KM0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.KM0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KM0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KM0050010.<%=viewId %>.init = function () {
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
    expj.KM0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KM0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KM0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KM0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KM0050010_init">
/**
 * KM0050010用のロード完了時初期化関数
 */
expj.KM0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KM0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KM0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KM0050010');
  expj.common.calendarInstanceMap.KM0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KM0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KM0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.KM0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KM0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KM0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KM0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KM0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KM0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KM0050010-<%=detailId %>');
<%
 }
%>
  try{expj.KM0050010.KM0050010form1.PROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010form1.PeekerProjectCd.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010form1.PROJECT_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010form1.ESTIMATE_NO.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010form1.CALCULATION_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010form1.PJ_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button1.TotalShow.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button1.Recalculation.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010view1.ES_COST_ETC.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010view1.l_JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010view1.l_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010view1.ODR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010view1.ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010view1.ODR_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button2.OtherRegister.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button2.JobOdrProgress.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button0.CSVOut.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010form1.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button1.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010view1.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button2.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010button0.executeOnLoad();}catch(e){};
  try{expj.KM0050010.KM0050010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KM0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KM0050010', 'KM0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KM0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KM0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.KM0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KM0050010', '<%=request.getContextPath() %>');
};

/**
 * KM0050010の全体onDecision処理
 */
expj.KM0050010.executeAllOnDecision = function () {
  expj.KM0050010.KM0050010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KM0050010_console">
expj.KM0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>