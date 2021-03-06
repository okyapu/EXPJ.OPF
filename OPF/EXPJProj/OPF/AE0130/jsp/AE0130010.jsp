<%-- ***
This file is generated
 GeneratedDate  : Fri Feb 17 11:14:28 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AE0130\AE0130010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0130.*" %>
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
<jsp:useBean id="aAE0130010Control" class="com.nec.jp.orteus.metamorBase.AE0130.AE0130010Control" scope="request"/>
<jsp:useBean id="aAE0130010Struct" class="com.nec.jp.orteus.metamorBase.AE0130.AE0130010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

購入返品実績一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0130/jsp/AE0130010.jsp,v $
$Author: geng-jia $	
$Revision: 1.16 $　$Date: 2017/02/22 02:05:27 $
********************************************************* --%>
<html>
<head>
<title>購入返品実績一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AE0120010Servlet", so);
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
<script class="expj-script-AE0130010_init">
  // AE0130010名前空間
  expj.AE0130010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0130010" data-screen="AE0130010" data-newdata="<%=aAE0130010Control.isNewData() %>">
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
              <script class="expj-script-AE0130010-AE0130010form1">
expj.AE0130010.AE0130010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AE0130010.AE0130010form1.onLoad0 = function () {
  console.log('AE0130010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0130010.AE0130010form1.onDecision0 = function () {
  console.log('AE0130010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0130010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0130010button1/Select"
expj.AE0130010.AE0130010form1.child0 = function () {
  console.log('AE0130010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0130010', 'AE0130010form1', '_AE0130010button1/Select');
};
// script4="child;1;MASK;_AE0130010button1/Select"
expj.AE0130010.AE0130010form1.child1 = function () {
  console.log('AE0130010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0130010', 'AE0130010form1', '_AE0130010button1/Select');
};
// script5="onDecision;1;CHKRQ;?AE0130010view1/?[neq]NOT_SELECTED@*2,*4"
expj.AE0130010.AE0130010form1.onDecision1 = function () {
  console.log('AE0130010form1 script5');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?AE0130010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?PLANT_CD[eq]SAME[and]?PUCH_RTN_DATE_FROM[eq]SAME[and]?PUCH_RTN_DATE_TO[eq]SAME[and]?JOB_ODR_CD[eq]SAME[and]?VEND_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?PUCH_ODR_PERSON[eq]SAME[and]?WH_CD[eq]SAME[and]?PUCH_ODR_CD[eq]SAME[and]?r1_RTN_DEL_FLG[eq]SAME[and]?r2_RTN_DEL_FLG[eq]SAME[and]?r3_RTN_DEL_FLG[eq]SAME@*3,*4"
expj.AE0130010.AE0130010form1.child2 = function () {
  console.log('AE0130010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?PUCH_RTN_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?PUCH_RTN_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?PUCH_ODR_PERSON'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?WH_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?r1_RTN_DEL_FLG'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?r2_RTN_DEL_FLG'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?r3_RTN_DEL_FLG'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AE0130010button2/PuchOdrRtnRsltInput"
expj.AE0130010.AE0130010form1.child3 = function () {
  console.log('AE0130010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AE0130010', 'AE0130010form1', '_AE0130010button2/PuchOdrRtnRsltInput');
};
// script8="child;4;MASK;_AE0130010button2/PuchOdrRtnRsltInput"
expj.AE0130010.AE0130010form1.child4 = function () {
  console.log('AE0130010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AE0130010', 'AE0130010form1', '_AE0130010button2/PuchOdrRtnRsltInput');
};
// script9="onDecision;2;CHK;?AE0130010form1/*[eq]NORMAL@*5,*7"
expj.AE0130010.AE0130010form1.onDecision2 = function () {
  console.log('AE0130010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?AE0130010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;5;CHK;?PLANT_CD[eq]SAME[and]?PUCH_RTN_DATE_FROM[eq]SAME[and]?PUCH_RTN_DATE_TO[eq]SAME[and]?JOB_ODR_CD[eq]SAME[and]?VEND_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?PUCH_ODR_PERSON[eq]SAME[and]?WH_CD[eq]SAME[and]?PUCH_ODR_CD[eq]SAME[and]?r1_RTN_DEL_FLG[eq]SAME[and]?r2_RTN_DEL_FLG[eq]SAME[and]?r3_RTN_DEL_FLG[eq]SAME@*6,*7"
expj.AE0130010.AE0130010form1.child5 = function () {
  console.log('AE0130010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?PUCH_RTN_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?PUCH_RTN_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?PUCH_ODR_PERSON'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?WH_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?r1_RTN_DEL_FLG'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?r2_RTN_DEL_FLG'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '?r3_RTN_DEL_FLG'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_AE0130010button0/CsvOut"
expj.AE0130010.AE0130010form1.child6 = function () {
  console.log('AE0130010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AE0130010', 'AE0130010form1', '_AE0130010button0/CsvOut');
};
// script12="child;7;MASK;_AE0130010button0/CsvOut"
expj.AE0130010.AE0130010form1.child7 = function () {
  console.log('AE0130010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AE0130010', 'AE0130010form1', '_AE0130010button0/CsvOut');
};
// script13="onLoad;1;CALL;child@8"
expj.AE0130010.AE0130010form1.onLoad1 = function () {
  console.log('AE0130010form1 script13');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child8)){this.child8();}
};
// script14="child;8;CHK;_AE0130010form1/h_lotCtrl[eq]true@,*9"
expj.AE0130010.AE0130010form1.child8 = function () {
  console.log('AE0130010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_AE0130010form1/h_lotCtrl'), '[eq]', 'true')) {

} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script15="child;9;COLSET;_AE0130010view1/l_LOT_NO="
expj.AE0130010.AE0130010form1.child9 = function () {
  console.log('AE0130010form1 script15');
expj.common.pscript.setVIEWColumn('AE0130010', 'AE0130010form1', '_AE0130010view1/l_LOT_NO', '');
};
expj.AE0130010.AE0130010form1.executeAllOnDecision = function () {
  console.log('execute AE0130010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1['onDecision' + i])) {
        expj.AE0130010.AE0130010form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010form1.executeOnLoad = function () {
  expj.AE0130010.AE0130010form1.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1['onLoad' + i])) {
      expj.AE0130010.AE0130010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0130010-AE0130010form1" action="AE0130010Servlet" name="AE0130010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0130010Control.getReadStatusString()) %>" style="height:188px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:188px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PLANT_CD">
expj.AE0130010.AE0130010form1.PLANT_CD = {};
expj.AE0130010.AE0130010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/PLANT_CD.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'PLANT_CD', this);
  });
  expj.AE0130010.AE0130010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-PLANT_CD" name="PLANT_CD" class="AE0130010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PeekerPlantCd">
expj.AE0130010.AE0130010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AE0130010form1/PLANT_CD@<%=contextNo%>"
expj.AE0130010.AE0130010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0130010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0130010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0130010.AE0130010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1.PeekerPlantCd['onClick' + i])) {
        expj.AE0130010.AE0130010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0130010-AE0130010form1-PeekerPlantCd" class="AE0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PLANT_NAME">
expj.AE0130010.AE0130010form1.PLANT_NAME = {};
expj.AE0130010.AE0130010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/PLANT_NAME.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'PLANT_NAME', this);
  });
  expj.AE0130010.AE0130010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-PLANT_NAME" name="PLANT_NAME" class="AE0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_DATE_2",rb)%></span><!-- 返品日 --></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PUCH_RTN_DATE_FROM">
expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_FROM = {};
expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/PUCH_RTN_DATE_FROM.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_FROM.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PUCH_RTN_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'PUCH_RTN_DATE_FROM', this);
  });
  expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_FROM.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PUCH_RTN_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PUCH_RTN_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-PUCH_RTN_DATE_FROM" name="PUCH_RTN_DATE_FROM" class="AE0130010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getPUCH_RTN_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-CalendarPUCH_RTN_DATE_FROM">
expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_FROM = {};
// script1="onClick;0;CALENDAR;_AE0130010form1/PUCH_RTN_DATE_FROM"
expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_FROM.onClick0 = function () {
  console.log('CalendarPUCH_RTN_DATE_FROM script1');
expj.common.pscript.executeCalendar('AE0130010','AE0130010form1','_AE0130010form1/PUCH_RTN_DATE_FROM');
};
expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_FROM.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_FROM['onClick' + i])) {
        expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_FROM['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_FROM.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_FROM.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-CalendarPUCH_RTN_DATE_FROM').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'CalendarPUCH_RTN_DATE_FROM', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0130010','AE0130010form1','_AE0130010form1/PUCH_RTN_DATE_FROM');
  expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_FROM.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/CalendarPUCH_RTN_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-CalendarPUCH_RTN_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0130010-AE0130010form1-CalendarPUCH_RTN_DATE_FROM" class="AE0130010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- 〜 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PUCH_RTN_DATE_TO">
expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_TO = {};
expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/PUCH_RTN_DATE_TO.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_TO.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PUCH_RTN_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'PUCH_RTN_DATE_TO', this);
  });
  expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_TO.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PUCH_RTN_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PUCH_RTN_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-PUCH_RTN_DATE_TO" name="PUCH_RTN_DATE_TO" class="AE0130010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getPUCH_RTN_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-CalendarPUCH_RTN_DATE_TO">
expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_TO = {};
// script1="onClick;0;CALENDAR;_AE0130010form1/PUCH_RTN_DATE_TO"
expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_TO.onClick0 = function () {
  console.log('CalendarPUCH_RTN_DATE_TO script1');
expj.common.pscript.executeCalendar('AE0130010','AE0130010form1','_AE0130010form1/PUCH_RTN_DATE_TO');
};
expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_TO.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_TO['onClick' + i])) {
        expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_TO['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_TO.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_TO.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-CalendarPUCH_RTN_DATE_TO').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'CalendarPUCH_RTN_DATE_TO', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0130010','AE0130010form1','_AE0130010form1/PUCH_RTN_DATE_TO');
  expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_TO.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/CalendarPUCH_RTN_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-CalendarPUCH_RTN_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0130010-AE0130010form1-CalendarPUCH_RTN_DATE_TO" class="AE0130010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AE0130010-AE0130010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AE0130010-AE0130010form1-DOWNLOAD_FILE">
expj.AE0130010.AE0130010form1.DOWNLOAD_FILE = {};
expj.AE0130010.AE0130010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/DOWNLOAD_FILE.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AE0130010.AE0130010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-JOB_ODR_CD">
expj.AE0130010.AE0130010form1.JOB_ODR_CD = {};
expj.AE0130010.AE0130010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/JOB_ODR_CD.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'JOB_ODR_CD', this);
  });
  expj.AE0130010.AE0130010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AE0130010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PeekerJOB_ODR_CD">
expj.AE0130010.AE0130010form1.PeekerJOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AE0130010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AE0130010.AE0130010form1.PeekerJOB_ODR_CD.onClick0 = function () {
  console.log('PeekerJOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0130010';
var parameterValues = 'PeekerJOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_AE0130010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_AE0130010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_AE0130010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AE0130010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0130010.AE0130010form1.PeekerJOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1.PeekerJOB_ODR_CD['onClick' + i])) {
        expj.AE0130010.AE0130010form1.PeekerJOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010form1.PeekerJOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010form1.PeekerJOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PeekerJOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'PeekerJOB_ODR_CD', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010form1.PeekerJOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PeekerJOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PeekerJOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PeekerJOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0130010-AE0130010form1-PeekerJOB_ODR_CD" class="AE0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AE0130010-AE0130010form1-RTN_DEL_FLG" name="RTN_DEL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getRTN_DEL_FLG()) %>">
<script class="expj-script-AE0130010-AE0130010form1-RTN_DEL_FLG">
expj.AE0130010.AE0130010form1.RTN_DEL_FLG = {};
expj.AE0130010.AE0130010form1.RTN_DEL_FLG.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/RTN_DEL_FLG.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.RTN_DEL_FLG.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-RTN_DEL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'RTN_DEL_FLG', this);
  });
  expj.AE0130010.AE0130010form1.RTN_DEL_FLG.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.RTN_DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/RTN_DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-RTN_DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-VEND_CD">
expj.AE0130010.AE0130010form1.VEND_CD = {};
expj.AE0130010.AE0130010form1.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/VEND_CD.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.VEND_CD.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'VEND_CD', this);
  });
  expj.AE0130010.AE0130010form1.VEND_CD.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-VEND_CD" name="VEND_CD" class="AE0130010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PeekerCurCd">
expj.AE0130010.AE0130010form1.PeekerCurCd = {};
// script1="onClick;0;PEEKER;_AE0130010form1/VEND_CD@<%=contextNo%>"
expj.AE0130010.AE0130010form1.PeekerCurCd.onClick0 = function () {
  console.log('PeekerCurCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0130010';
var parameterValues = 'PeekerCurCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AE0130010form1/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0130010.AE0130010form1.PeekerCurCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1.PeekerCurCd['onClick' + i])) {
        expj.AE0130010.AE0130010form1.PeekerCurCd['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010form1.PeekerCurCd.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010form1.PeekerCurCd.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PeekerCurCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'PeekerCurCd', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010form1.PeekerCurCd.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PeekerCurCd.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PeekerCurCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PeekerCurCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0130010-AE0130010form1-PeekerCurCd" class="AE0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-VEND_NAME">
expj.AE0130010.AE0130010form1.VEND_NAME = {};
expj.AE0130010.AE0130010form1.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/VEND_NAME.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.VEND_NAME.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'VEND_NAME', this);
  });
  expj.AE0130010.AE0130010form1.VEND_NAME.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-VEND_NAME" name="VEND_NAME" class="AE0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getVEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-ITEM_CD">
expj.AE0130010.AE0130010form1.ITEM_CD = {};
expj.AE0130010.AE0130010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/ITEM_CD.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'ITEM_CD', this);
  });
  expj.AE0130010.AE0130010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-ITEM_CD" name="ITEM_CD" class="AE0130010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PeekerItemCd">
expj.AE0130010.AE0130010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AE0130010form1/ITEM_CD@<%=contextNo%>"
expj.AE0130010.AE0130010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0130010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0130010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0130010.AE0130010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1.PeekerItemCd['onClick' + i])) {
        expj.AE0130010.AE0130010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0130010-AE0130010form1-PeekerItemCd" class="AE0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-ITEM_NAME">
expj.AE0130010.AE0130010form1.ITEM_NAME = {};
expj.AE0130010.AE0130010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/ITEM_NAME.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'ITEM_NAME', this);
  });
  expj.AE0130010.AE0130010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-ITEM_NAME" name="ITEM_NAME" class="AE0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getITEM_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0056",rb)%></span><!-- 表示対象 --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_PERSON_2",rb)%></span><!-- 担当者コード --></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PUCH_ODR_PERSON">
expj.AE0130010.AE0130010form1.PUCH_ODR_PERSON = {};
expj.AE0130010.AE0130010form1.PUCH_ODR_PERSON.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/PUCH_ODR_PERSON.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.PUCH_ODR_PERSON.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PUCH_ODR_PERSON').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'PUCH_ODR_PERSON', this);
  });
  expj.AE0130010.AE0130010form1.PUCH_ODR_PERSON.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PUCH_ODR_PERSON.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PUCH_ODR_PERSON.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PUCH_ODR_PERSON');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-PUCH_ODR_PERSON" name="PUCH_ODR_PERSON" class="AE0130010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getPUCH_ODR_PERSON()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PeekerUserCd">
expj.AE0130010.AE0130010form1.PeekerUserCd = {};
// script1="onClick;0;PEEKER;_AE0130010form1/PUCH_ODR_PERSON@<%=contextNo%>"
expj.AE0130010.AE0130010form1.PeekerUserCd.onClick0 = function () {
  console.log('PeekerUserCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0130010';
var parameterValues = 'PeekerUserCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_PUCH_ODR_PERSON') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0130010form1/PUCH_ODR_PERSON%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0130010.AE0130010form1.PeekerUserCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1.PeekerUserCd['onClick' + i])) {
        expj.AE0130010.AE0130010form1.PeekerUserCd['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010form1.PeekerUserCd.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010form1.PeekerUserCd.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PeekerUserCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'PeekerUserCd', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010form1.PeekerUserCd.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PeekerUserCd.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PeekerUserCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PeekerUserCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0130010-AE0130010form1-PeekerUserCd" class="AE0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-USER_NAME">
expj.AE0130010.AE0130010form1.USER_NAME = {};
expj.AE0130010.AE0130010form1.USER_NAME.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/USER_NAME.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.USER_NAME.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'USER_NAME', this);
  });
  expj.AE0130010.AE0130010form1.USER_NAME.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-USER_NAME" name="USER_NAME" class="AE0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getUSER_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-r1_RTN_DEL_FLG">
expj.AE0130010.AE0130010form1.r1_RTN_DEL_FLG = {};
expj.AE0130010.AE0130010form1.r1_RTN_DEL_FLG.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/r1_RTN_DEL_FLG.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.r1_RTN_DEL_FLG.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-r1_RTN_DEL_FLG').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'r1_RTN_DEL_FLG', this, 'RadioButton');
    }
  });
  expj.AE0130010.AE0130010form1.r1_RTN_DEL_FLG.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.r1_RTN_DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/r1_RTN_DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-r1_RTN_DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="radio" name="RTN_DEL_FLG" data-name="r1_RTN_DEL_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAE0130010Struct.getr1_RTN_DEL_FLG())))?"checked=\"checked\"":"" %> class="" id="expj-AE0130010-AE0130010form1-r1_RTN_DEL_FLG" ><label for="expj-AE0130010-AE0130010form1-r1_RTN_DEL_FLG"><%=CoreTools.getRBString("Expj.BtnReturnGoods",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD_11",rb)%></span><!-- 返品元保管区コード --></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-WH_CD">
expj.AE0130010.AE0130010form1.WH_CD = {};
expj.AE0130010.AE0130010form1.WH_CD.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/WH_CD.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.WH_CD.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'WH_CD', this);
  });
  expj.AE0130010.AE0130010form1.WH_CD.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-WH_CD" name="WH_CD" class="AE0130010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PeekerWhCd">
expj.AE0130010.AE0130010form1.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AE0130010form1/WH_CD@<%=contextNo%>"
expj.AE0130010.AE0130010form1.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0130010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_13%&%';
parameterValues += 'TARGET_FIELD%=%_AE0130010form1/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0130010.AE0130010form1.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1.PeekerWhCd['onClick' + i])) {
        expj.AE0130010.AE0130010form1.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010form1.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010form1.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010form1.PeekerWhCd.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0130010-AE0130010form1-PeekerWhCd" class="AE0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-WH_NAME">
expj.AE0130010.AE0130010form1.WH_NAME = {};
expj.AE0130010.AE0130010form1.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/WH_NAME.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.WH_NAME.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'WH_NAME', this);
  });
  expj.AE0130010.AE0130010form1.WH_NAME.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-WH_NAME" name="WH_NAME" class="AE0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getWH_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-r2_RTN_DEL_FLG">
expj.AE0130010.AE0130010form1.r2_RTN_DEL_FLG = {};
expj.AE0130010.AE0130010form1.r2_RTN_DEL_FLG.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/r2_RTN_DEL_FLG.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.r2_RTN_DEL_FLG.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-r2_RTN_DEL_FLG').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'r2_RTN_DEL_FLG', this, 'RadioButton');
    }
  });
  expj.AE0130010.AE0130010form1.r2_RTN_DEL_FLG.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.r2_RTN_DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/r2_RTN_DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-r2_RTN_DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="radio" name="RTN_DEL_FLG" data-name="r2_RTN_DEL_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAE0130010Struct.getr2_RTN_DEL_FLG())))?"checked=\"checked\"":"" %> class="" id="expj-AE0130010-AE0130010form1-r2_RTN_DEL_FLG" ><label for="expj-AE0130010-AE0130010form1-r2_RTN_DEL_FLG"><%=CoreTools.getRBString("Expj.Cmt0747",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_CD_2",rb)%></span><!-- 購入返品番号 --></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PUCH_ODR_CD">
expj.AE0130010.AE0130010form1.PUCH_ODR_CD = {};
expj.AE0130010.AE0130010form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/PUCH_ODR_CD.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0130010.AE0130010form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0130010-AE0130010form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0130010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0130010Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-PeekerPuchOdrCd">
expj.AE0130010.AE0130010form1.PeekerPuchOdrCd = {};
// script1="onClick;0;PEEKER;_AE0130010form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AE0130010.AE0130010form1.PeekerPuchOdrCd.onClick0 = function () {
  console.log('PeekerPuchOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0130010';
var parameterValues = 'PeekerPuchOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010form1', '_PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_18%&%';
parameterValues += 'TARGET_FIELD%=%_AE0130010form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0130010.AE0130010form1.PeekerPuchOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010form1.PeekerPuchOdrCd['onClick' + i])) {
        expj.AE0130010.AE0130010form1.PeekerPuchOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010form1.PeekerPuchOdrCd.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010form1.PeekerPuchOdrCd.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-PeekerPuchOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'PeekerPuchOdrCd', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010form1.PeekerPuchOdrCd.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.PeekerPuchOdrCd.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/PeekerPuchOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-PeekerPuchOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0130010-AE0130010form1-PeekerPuchOdrCd" class="AE0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AE0130010-AE0130010form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0130010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AE0130010-AE0130010form1-h_lotCtrl">
expj.AE0130010.AE0130010form1.h_lotCtrl = {};
expj.AE0130010.AE0130010form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/h_lotCtrl.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0130010', 'AE0130010form1', 'h_lotCtrl', this);
  });
  expj.AE0130010.AE0130010form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010form1-r3_RTN_DEL_FLG">
expj.AE0130010.AE0130010form1.r3_RTN_DEL_FLG = {};
expj.AE0130010.AE0130010form1.r3_RTN_DEL_FLG.executeAllOnDecision = function () {
  console.log('execute AE0130010form1/r3_RTN_DEL_FLG.onDecision');
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
  expj.AE0130010.executeAllOnDecision();
};
expj.AE0130010.AE0130010form1.r3_RTN_DEL_FLG.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010form1-r3_RTN_DEL_FLG').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010form1', 'r3_RTN_DEL_FLG', this, 'RadioButton');
    }
  });
  expj.AE0130010.AE0130010form1.r3_RTN_DEL_FLG.executePScriptOnLoad();
};

expj.AE0130010.AE0130010form1.r3_RTN_DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0130010form1/r3_RTN_DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010form1-r3_RTN_DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="radio" name="RTN_DEL_FLG" data-name="r3_RTN_DEL_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAE0130010Struct.getr3_RTN_DEL_FLG())))?"checked=\"checked\"":"" %> class="" id="expj-AE0130010-AE0130010form1-r3_RTN_DEL_FLG" ><label for="expj-AE0130010-AE0130010form1-r3_RTN_DEL_FLG"><%=CoreTools.getRBString("Expj.Cmt0045",rb)%></label></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0130010-AE0130010button1">
expj.AE0130010.AE0130010button1 = {};
expj.AE0130010.AE0130010button1.executeAllOnDecision = function () {
  console.log('execute AE0130010button1.onDecision');
};
expj.AE0130010.AE0130010button1.executeOnLoad = function () {
  expj.AE0130010.AE0130010button1.executePScriptOnLoad();
};

expj.AE0130010.AE0130010button1.executePScriptOnLoad = function () {
  console.log('execute AE0130010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0130010-AE0130010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0130010-AE0130010button1-Select">
expj.AE0130010.AE0130010button1.Select = {};
// script1="onClick;0;CHK;_AE0130010form1/PUCH_RTN_DATE_FROM[neq]''[and]_AE0130010form1/PUCH_RTN_DATE_TO[neq]''@*1,*2"
expj.AE0130010.AE0130010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010button1', '_AE0130010form1/PUCH_RTN_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010button1', '_AE0130010form1/PUCH_RTN_DATE_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script2="child;1;CHK;_AE0130010form1/PUCH_RTN_DATE_FROM[gt]_AE0130010form1/PUCH_RTN_DATE_TO@!ZZ05101,*2"
expj.AE0130010.AE0130010button1.Select.child1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010button1', '_AE0130010form1/PUCH_RTN_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0130010', 'AE0130010button1', '_AE0130010form1/PUCH_RTN_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('AE0130010', 'AE0130010button1', 'ZZ05101');
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script5="child;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0130010form1/*@AE0130010Servlet"
expj.AE0130010.AE0130010button1.Select.child2 = function () {
  console.log('Select script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0130010', 'AE0130010button1', '_AE0130010form1/*', 'AE0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0130010', response);
expj.common.updateBusinessScreenTab('AE0130010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0130010.AE0130010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010button1.Select['onClick' + i])) {
        expj.AE0130010.AE0130010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010button1.Select.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010button1.Select.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010button1', 'Select', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010button1.Select.executePScriptOnLoad();
};

expj.AE0130010.AE0130010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0130010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0130010-AE0130010button1-Select" name="Select" class="AE0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AE0130010-AE0130010view1">
expj.AE0130010.AE0130010view1 = {};
expj.AE0130010.AE0130010view1.executeAllOnClick = function () {
};
expj.AE0130010.AE0130010view1.executeAllOnDecision = function () {
  console.log('execute AE0130010view1.onDecision');
};
expj.AE0130010.AE0130010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0130010view1", "expj.AE0130010.AE0130010view1.executeAllOnClick");
%>
  expj.AE0130010.AE0130010view1.executePScriptOnLoad();
};

expj.AE0130010.AE0130010view1.executePScriptOnLoad = function () {
  console.log('execute AE0130010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0130010-AE0130010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0130010view1_Id = "AE0130010view1";
 String AE0130010view1_select = "single";
 String AE0130010view1_sortable = "true";
 String AE0130010view1_resize = "true";
 String AE0130010view1_scroll = "true";
 StringBuffer AE0130010view1_HB = new StringBuffer();
 StringBuffer AE0130010view1_DB = new StringBuffer();
%>
<%
 AE0130010view1_select = "single";
 AE0130010view1_sortable = "true";
 AE0130010view1_resize = "true";
 AE0130010view1_scroll = "true";
%>
<%
 AE0130010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
%>
 <p></p>    
<%
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'l_PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD_2",rb))).append("', 'name':'l_PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'160px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'l_VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'170px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'l_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INV_CTRL_FLG",rb))).append("', 'name':'l_INV_CTRL_FLG_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_PERSON_2",rb))).append("', 'name':'l_PUCH_ODR_PERSON', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_DATE_2",rb))).append("', 'name':'l_PUCH_RTN_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_QTY_3",rb))).append("', 'name':'l_PUCH_RTN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD_11",rb))).append("', 'name':'l_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME_6",rb))).append("', 'name':'l_WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_LOT_NO",rb))).append("', 'name':'l_VEND_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb))).append("', 'name':'l_UNIT_COST_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACTUAL_UNIT_PRICE",rb))).append("', 'name':'l_UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROCESSING_COST",rb))).append("', 'name':'l_PROCESSING_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MATERIAL_COST",rb))).append("', 'name':'l_MATERIAL_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb))).append("', 'name':'l_OTHER_OVERHEADS', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_3",rb))).append("', 'name':'l_PUCH_ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SAVING_AMOUNT",rb))).append("', 'name':'l_DISC_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NET_AMOUNT",rb))).append("', 'name':'l_NET_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RETURNED_CAUSE_CD",rb))).append("', 'name':'l_PUCH_RTN_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RATE_JUDGE_DATE",rb))).append("', 'name':'l_RATE_JUDGE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXCH_RATE",rb))).append("', 'name':'l_EXCH_RATE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TAX_RATE_1",rb))).append("', 'name':'l_TAX_RATE_1', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TAX_RATE_2",rb))).append("', 'name':'l_TAX_RATE_2', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TAX_RATE_3",rb))).append("', 'name':'l_TAX_RATE_3', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0707",rb))).append("', 'name':'l_TAX_AMOUNT_1', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0708",rb))).append("', 'name':'l_TAX_AMOUNT_2', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0709",rb))).append("', 'name':'l_TAX_AMOUNT_3', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX",rb))).append("', 'name':'l_AMOUNT_INCLUDE_TAX', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.HOME_CUR_AMOUNT",rb))).append("', 'name':'l_HOME_CUR_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TAX_CD_1",rb))).append("', 'name':'l_TAX_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TAX_ROUND_TYP",rb))).append("', 'name':'l_TAX_ROUND_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RTN_DEL_FLG",rb))).append("', 'name':'l_RTN_DEL_FLG_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
AE0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RTN_DEL_DATE",rb))).append("', 'name':'l_RTN_DEL_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0130010view1_sortable).append("}").append(",");
%>
<%
 int aAE0130010StructLength = aAE0130010Control.getListsize();
 final AE0130010Struct structBackup = aAE0130010Struct;
 aAE0130010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0130010StructLength; ++loopCount) {
  if((aAE0130010Struct = (AE0130010Struct) aAE0130010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0130010Struct", aAE0130010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0130010view1_DB.append("[");
 AE0130010view1_DB.append(loopCount);
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_PLANT_CD\" data-name=\"l_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_PLANT_CD())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_PUCH_ODR_CD\" data-name=\"l_PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_PUCH_ODR_CD())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_VEND_CD())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_VEND_ANAME\" data-name=\"l_VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_VEND_ANAME())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_ITEM_CD())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_ITEM_NAME())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_LOT_NO\" data-name=\"l_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_LOT_NO())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_JOB_ODR_CD())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_INV_CTRL_FLG_DN-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_INV_CTRL_FLG_DN\" data-name=\"l_INV_CTRL_FLG_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_INV_CTRL_FLG_DN())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_PUCH_ODR_PERSON-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_PUCH_ODR_PERSON\" data-name=\"l_PUCH_ODR_PERSON\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_PUCH_ODR_PERSON())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_PUCH_RTN_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_PUCH_RTN_DATE\" data-name=\"l_PUCH_RTN_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_PUCH_RTN_DATE())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_PUCH_RTN_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_PUCH_RTN_QTY\" data-name=\"l_PUCH_RTN_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_PUCH_RTN_QTY())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_WH_CD\" data-name=\"l_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_WH_CD())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_WH_NAME\" data-name=\"l_WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_WH_NAME())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_VEND_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_VEND_LOT_NO\" data-name=\"l_VEND_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_VEND_LOT_NO())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_UNIT_COST_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_UNIT_COST_TYP_DN\" data-name=\"l_UNIT_COST_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_UNIT_COST_TYP_DN())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_UNIT_COST\" data-name=\"l_UNIT_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_UNIT_COST())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_PROCESSING_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_PROCESSING_COST\" data-name=\"l_PROCESSING_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_PROCESSING_COST())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_MATERIAL_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_MATERIAL_COST\" data-name=\"l_MATERIAL_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_MATERIAL_COST())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_OTHER_OVERHEADS-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_OTHER_OVERHEADS\" data-name=\"l_OTHER_OVERHEADS\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_OTHER_OVERHEADS())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_PUCH_ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_PUCH_ODR_AMOUNT\" data-name=\"l_PUCH_ODR_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_PUCH_ODR_AMOUNT())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_DISC_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_DISC_AMOUNT\" data-name=\"l_DISC_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_DISC_AMOUNT())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_NET_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_NET_AMOUNT\" data-name=\"l_NET_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_NET_AMOUNT())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_PUCH_RTN_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_PUCH_RTN_COMMENT\" data-name=\"l_PUCH_RTN_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_PUCH_RTN_COMMENT())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_RATE_JUDGE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_RATE_JUDGE_DATE\" data-name=\"l_RATE_JUDGE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_RATE_JUDGE_DATE())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_EXCH_RATE-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_EXCH_RATE\" data-name=\"l_EXCH_RATE\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_EXCH_RATE())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_TAX_RATE_1-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_TAX_RATE_1\" data-name=\"l_TAX_RATE_1\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_TAX_RATE_1())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_TAX_RATE_2-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_TAX_RATE_2\" data-name=\"l_TAX_RATE_2\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_TAX_RATE_2())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_TAX_RATE_3-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_TAX_RATE_3\" data-name=\"l_TAX_RATE_3\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_TAX_RATE_3())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_TAX_AMOUNT_1-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_TAX_AMOUNT_1\" data-name=\"l_TAX_AMOUNT_1\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_TAX_AMOUNT_1())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_TAX_AMOUNT_2-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_TAX_AMOUNT_2\" data-name=\"l_TAX_AMOUNT_2\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_TAX_AMOUNT_2())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_TAX_AMOUNT_3-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_TAX_AMOUNT_3\" data-name=\"l_TAX_AMOUNT_3\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_TAX_AMOUNT_3())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_AMOUNT_INCLUDE_TAX-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_AMOUNT_INCLUDE_TAX\" data-name=\"l_AMOUNT_INCLUDE_TAX\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_AMOUNT_INCLUDE_TAX())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_HOME_CUR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_HOME_CUR_AMOUNT\" data-name=\"l_HOME_CUR_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_HOME_CUR_AMOUNT())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_TAX_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_TAX_CD\" data-name=\"l_TAX_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_TAX_CD())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_TAX_ROUND_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_TAX_ROUND_TYP_DN\" data-name=\"l_TAX_ROUND_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_TAX_ROUND_TYP_DN())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_RTN_DEL_FLG_DN-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_RTN_DEL_FLG_DN\" data-name=\"l_RTN_DEL_FLG_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_RTN_DEL_FLG_DN())).append("</span>'");
 AE0130010view1_DB.append(",").append("'<span id=\"expj-AE0130010-AE0130010view1-l_RTN_DEL_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0130010-AE0130010view1-l_RTN_DEL_DATE\" data-name=\"l_RTN_DEL_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0130010Struct.getl_RTN_DEL_DATE())).append("</span>'");
 AE0130010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0130010StructLength) {
   AE0130010view1_DB.append(",");
  }
 }
 aAE0130010Struct = structBackup;
 viewIdList.add(AE0130010view1_Id);
 viewSelectList.add(AE0130010view1_select);
 viewResizeList.add(AE0130010view1_resize);
 viewScrollList.add(AE0130010view1_scroll);
 viewHeaderDataList.add(AE0130010view1_HB);
 viewBodyDataList.add(AE0130010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0130010-AE0130010button2">
expj.AE0130010.AE0130010button2 = {};
expj.AE0130010.AE0130010button2.executeAllOnDecision = function () {
  console.log('execute AE0130010button2.onDecision');
};
expj.AE0130010.AE0130010button2.executeOnLoad = function () {
  expj.AE0130010.AE0130010button2.executePScriptOnLoad();
};

expj.AE0130010.AE0130010button2.executePScriptOnLoad = function () {
  console.log('execute AE0130010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0130010-AE0130010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0130010-AE0130010button2-PuchOdrRtnRsltInput">
expj.AE0130010.AE0130010button2.PuchOdrRtnRsltInput = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AE0130010view1/+@AE0120010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AE0130010.AE0130010button2.PuchOdrRtnRsltInput.onClick0 = function () {
  console.log('PuchOdrRtnRsltInput script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0130010', 'AE0130010button2', '_AE0130010view1/+', 'AE0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AE0120010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AE0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AE0130010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0130010.AE0130010button2.PuchOdrRtnRsltInput.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010button2.PuchOdrRtnRsltInput['onClick' + i])) {
        expj.AE0130010.AE0130010button2.PuchOdrRtnRsltInput['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010button2.PuchOdrRtnRsltInput.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010button2.PuchOdrRtnRsltInput.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010button2-PuchOdrRtnRsltInput').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010button2', 'PuchOdrRtnRsltInput', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010button2.PuchOdrRtnRsltInput.executePScriptOnLoad();
};

expj.AE0130010.AE0130010button2.PuchOdrRtnRsltInput.executePScriptOnLoad = function () {
  console.log('execute AE0130010button2/PuchOdrRtnRsltInput.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010button2-PuchOdrRtnRsltInput');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0130010-AE0130010button2-PuchOdrRtnRsltInput" name="PuchOdrRtnRsltInput" class="AE0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPuchOdrRtnRsltEntry",rb)%></button><!-- 購入返品実績入力ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0130010 Revision: 1.9  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AE0130010-AE0130010button0">
expj.AE0130010.AE0130010button0 = {};
expj.AE0130010.AE0130010button0.executeAllOnDecision = function () {
  console.log('execute AE0130010button0.onDecision');
};
expj.AE0130010.AE0130010button0.executeOnLoad = function () {
  expj.AE0130010.AE0130010button0.executePScriptOnLoad();
};

expj.AE0130010.AE0130010button0.executePScriptOnLoad = function () {
  console.log('execute AE0130010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0130010-AE0130010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0130010-AE0130010button0-CsvOut">
expj.AE0130010.AE0130010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0130010form1/*@AE0130010Servlet,,$ZZ07011"
expj.AE0130010.AE0130010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0130010', 'AE0130010button0', '_AE0130010form1/*', 'AE0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0130010', response);
expj.common.updateBusinessScreenTab('AE0130010', contents);
};
expj.common.pscript.callConfirm('AE0130010', 'AE0130010button0', 'ZZ07011', okEvent);
};
expj.AE0130010.AE0130010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010button0.CsvOut['onClick' + i])) {
        expj.AE0130010.AE0130010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010button0.CsvOut.executePScriptOnLoad();
};

expj.AE0130010.AE0130010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AE0130010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0130010-AE0130010button0-CsvOut" name="CsvOut" class="AE0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010button0-Clear">
expj.AE0130010.AE0130010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0130010Servlet,,$ZZ07008"
expj.AE0130010.AE0130010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0130010', 'AE0130010button0', '', 'AE0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0130010', response);
expj.common.updateBusinessScreenTab('AE0130010', contents);
};
expj.common.pscript.callConfirm('AE0130010', 'AE0130010button0', 'ZZ07008', okEvent);
};
expj.AE0130010.AE0130010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010button0.Clear['onClick' + i])) {
        expj.AE0130010.AE0130010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010button0.Clear.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010button0.Clear.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010button0.Clear.executePScriptOnLoad();
};

expj.AE0130010.AE0130010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0130010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0130010-AE0130010button0-Clear" name="Clear" class="AE0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0130010-AE0130010button0-Close">
expj.AE0130010.AE0130010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0130010.AE0130010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0130010');
};
expj.AE0130010.AE0130010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0130010.AE0130010button0.Close['onClick' + i])) {
        expj.AE0130010.AE0130010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0130010.AE0130010button0.Close.executeAllOnDecision = function () {
};
expj.AE0130010.AE0130010button0.Close.executeOnLoad = function () {
  $('#expj-AE0130010-AE0130010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0130010', 'AE0130010button0', 'Close', this, 'Button');
    }
  });
  expj.AE0130010.AE0130010button0.Close.executePScriptOnLoad();
};

expj.AE0130010.AE0130010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0130010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0130010-AE0130010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0130010-AE0130010button0-Close" name="Close" class="AE0130010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0130010 (END)-->
<%
MessageStruct msgStruct = aAE0130010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0130010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0130010)) {
  expj.common.treeInstanceMap.AE0130010 = {};
}
expj.common.treeInstanceMap.AE0130010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0130010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0130010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0130010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0130010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0130010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0130010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0130010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0130010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0130010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0130010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0130010)) {
  expj.common.detailDialogMap.AE0130010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0130010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0130010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0130010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0130010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0130010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0130010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0130010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0130010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0130010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0130010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0130010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0130010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0130010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0130010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0130010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0130010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0130010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0130010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0130010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0130010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0130010)) {
  expj.common.viewInstanceMap.AE0130010 = {};
}
expj.common.viewInstanceMap.AE0130010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0130010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0130010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0130010.<%=viewId %>.init = function () {
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
    expj.AE0130010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0130010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0130010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0130010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0130010_init">
/**
 * AE0130010用のロード完了時初期化関数
 */
expj.AE0130010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0130010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0130010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0130010');
  expj.common.calendarInstanceMap.AE0130010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0130010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0130010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0130010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0130010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0130010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0130010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0130010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0130010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0130010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0130010.AE0130010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PUCH_RTN_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.CalendarPUCH_RTN_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PeekerJOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.RTN_DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PeekerCurCd.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PUCH_ODR_PERSON.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PeekerUserCd.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.r1_RTN_DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.r2_RTN_DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.PeekerPuchOdrCd.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.r3_RTN_DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010button2.PuchOdrRtnRsltInput.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010form1.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010button1.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010view1.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010button2.executeOnLoad();}catch(e){};
  try{expj.AE0130010.AE0130010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0130010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0130010', 'AE0130010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0130010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0130010-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0130010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0130010', '<%=request.getContextPath() %>');
};

/**
 * AE0130010の全体onDecision処理
 */
expj.AE0130010.executeAllOnDecision = function () {
  expj.AE0130010.AE0130010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0130010_console">
expj.AE0130010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>