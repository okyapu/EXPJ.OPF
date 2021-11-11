<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:00:13 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KQ0080\KQ0080010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KQ0080.*" %>
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
<jsp:useBean id="aKQ0080010Control" class="com.nec.jp.orteus.metamorBase.KQ0080.KQ0080010Control" scope="request"/>
<jsp:useBean id="aKQ0080010Struct" class="com.nec.jp.orteus.metamorBase.KQ0080.KQ0080010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受注製番紐付
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0080/jsp/KQ0080010.jsp,v $
$Author: geng-jia $    
$Revision: 1.7 $ $Date: 2017/02/22 02:07:14 $
********************************************************* --%>
<html>
<head>
<title>受注製番紐付</title>
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
<script class="expj-script-KQ0080010_init">
  // KQ0080010名前空間
  expj.KQ0080010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-KQ0080010" data-screen="KQ0080010" data-newdata="<%=aKQ0080010Control.isNewData() %>">
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
            <script class="expj-script-KQ0080010-KQ0080010form1">
expj.KQ0080010.KQ0080010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.KQ0080010.KQ0080010form1.onLoad0 = function () {
  console.log('KQ0080010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.KQ0080010.KQ0080010form1.onDecision0 = function () {
  console.log('KQ0080010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0080010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KQ0080010button1/Select"
expj.KQ0080010.KQ0080010form1.child0 = function () {
  console.log('KQ0080010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0080010', 'KQ0080010form1', '_KQ0080010button1/Select');
};
// script4="child;1;MASK;_KQ0080010button1/Select"
expj.KQ0080010.KQ0080010form1.child1 = function () {
  console.log('KQ0080010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KQ0080010', 'KQ0080010form1', '_KQ0080010button1/Select');
};
// script5="onDecision;1;CHK;_KQ0080010form1/r1_JOB_ODR_SET_FLG[eq]true@*2,*3"
expj.KQ0080010.KQ0080010form1.onDecision1 = function () {
  console.log('KQ0080010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010form1/r1_JOB_ODR_SET_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;SET;_KQ0080010form1/h_JOB_ODR_SET_FLG=0"
expj.KQ0080010.KQ0080010form1.child2 = function () {
  console.log('KQ0080010form1 script6');
expj.common.pscript.setReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010form1/h_JOB_ODR_SET_FLG', '0');
};
// script7="child;3;SET;_KQ0080010form1/h_JOB_ODR_SET_FLG=1"
expj.KQ0080010.KQ0080010form1.child3 = function () {
  console.log('KQ0080010form1 script7');
expj.common.pscript.setReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010form1/h_JOB_ODR_SET_FLG', '1');
};
// script8="onDecision;2;CHK;?KQ0080010form1/w_ITEM_CD[eq]SAME[and]?KQ0080010view3/*[eq]NORMAL[and]?KQ0080010view3/?[neq]NOT_SELECTED[and]?KQ0080010view4/?[eq]SINGLE[and]_KQ0080010view3/l1_JOB_ODR_CD[eq]@*4,*5"
expj.KQ0080010.KQ0080010form1.onDecision2 = function () {
  console.log('KQ0080010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '?KQ0080010form1/w_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '?KQ0080010view3/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '?KQ0080010view3/?'), '[neq]', 'NOT_SELECTED') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '?KQ0080010view4/?'), '[eq]', 'SINGLE') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010view3/l1_JOB_ODR_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;4;UNMASK;_KQ0080010button2/Insert"
expj.KQ0080010.KQ0080010form1.child4 = function () {
  console.log('KQ0080010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0080010', 'KQ0080010form1', '_KQ0080010button2/Insert');
};
// script10="child;5;MASK;_KQ0080010button2/Insert"
expj.KQ0080010.KQ0080010form1.child5 = function () {
  console.log('KQ0080010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('KQ0080010', 'KQ0080010form1', '_KQ0080010button2/Insert');
};
// script11="onDecision;3;CHK;?KQ0080010form1/w_ITEM_CD[eq]SAME[and]?KQ0080010view3/*[eq]NORMAL[and]?KQ0080010view3/?[neq]NOT_SELECTED[and]_KQ0080010view3/l1_JOB_ODR_CD[neq]@*6,*7"
expj.KQ0080010.KQ0080010form1.onDecision3 = function () {
  console.log('KQ0080010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '?KQ0080010form1/w_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '?KQ0080010view3/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '?KQ0080010view3/?'), '[neq]', 'NOT_SELECTED') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010view3/l1_JOB_ODR_CD'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script12="child;6;UNMASK;_KQ0080010button2/Delete"
expj.KQ0080010.KQ0080010form1.child6 = function () {
  console.log('KQ0080010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0080010', 'KQ0080010form1', '_KQ0080010button2/Delete');
};
// script13="child;7;MASK;_KQ0080010button2/Delete"
expj.KQ0080010.KQ0080010form1.child7 = function () {
  console.log('KQ0080010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('KQ0080010', 'KQ0080010form1', '_KQ0080010button2/Delete');
};
// script14="onDecision;4;CHK;?KQ0080010form1/w_ITEM_CD[eq]SAME[and]?KQ0080010view4/*[eq]NORMAL[and]?KQ0080010view4/?[eq]SINGLE[and]_KQ0080010view4/l2_h_JOB_ODR_CD[neq]@*8,*9"
expj.KQ0080010.KQ0080010form1.onDecision4 = function () {
  console.log('KQ0080010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '?KQ0080010form1/w_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '?KQ0080010view4/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '?KQ0080010view4/?'), '[eq]', 'SINGLE') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010view4/l2_h_JOB_ODR_CD'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script15="child;8;UNMASK;_KQ0080010button3/LineDelete"
expj.KQ0080010.KQ0080010form1.child8 = function () {
  console.log('KQ0080010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0080010', 'KQ0080010form1', '_KQ0080010button3/LineDelete');
};
// script16="child;9;MASK;_KQ0080010button3/LineDelete"
expj.KQ0080010.KQ0080010form1.child9 = function () {
  console.log('KQ0080010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('KQ0080010', 'KQ0080010form1', '_KQ0080010button3/LineDelete');
};
// script17="onDecision;5;CHK;_KQ0080010form1/c_JOB_ODR_STS_TYP[eq]true@*10,*11"
expj.KQ0080010.KQ0080010form1.onDecision5 = function () {
  console.log('KQ0080010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010form1/c_JOB_ODR_STS_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script18="child;10;SET;_KQ0080010form1/h_JOB_ODR_STS_TYP="
expj.KQ0080010.KQ0080010form1.child10 = function () {
  console.log('KQ0080010form1 script18');
expj.common.pscript.setReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010form1/h_JOB_ODR_STS_TYP', '');
};
// script19="child;11;SET;_KQ0080010form1/h_JOB_ODR_STS_TYP=9"
expj.KQ0080010.KQ0080010form1.child11 = function () {
  console.log('KQ0080010form1 script19');
expj.common.pscript.setReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010form1/h_JOB_ODR_STS_TYP', '9');
};
expj.KQ0080010.KQ0080010form1.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010form1['onDecision' + i])) {
        expj.KQ0080010.KQ0080010form1['onDecision' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010form1.executeOnLoad = function () {
  expj.KQ0080010.KQ0080010form1.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010form1['onLoad' + i])) {
      expj.KQ0080010.KQ0080010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0080010-KQ0080010form1" action="KQ0080010Servlet" name="KQ0080010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:142px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:142px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-w_PLANT_CD">
expj.KQ0080010.KQ0080010form1.w_PLANT_CD = {};
expj.KQ0080010.KQ0080010form1.w_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/w_PLANT_CD.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.w_PLANT_CD.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-w_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'w_PLANT_CD', this);
  });
  expj.KQ0080010.KQ0080010form1.w_PLANT_CD.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.w_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/w_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-w_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0080010-KQ0080010form1-w_PLANT_CD" name="w_PLANT_CD" class="KQ0080010-focus-move  " style="width:260px;" data-kind="OBT_AN;" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.getw_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-Peekerw_PLANT_CD">
expj.KQ0080010.KQ0080010form1.Peekerw_PLANT_CD = {};
// script1="onClick;0;PEEKER;_KQ0080010form1/w_PLANT_CD@<%=contextNo%>"
expj.KQ0080010.KQ0080010form1.Peekerw_PLANT_CD.onClick0 = function () {
  console.log('Peekerw_PLANT_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0080010';
var parameterValues = 'Peekerw_PLANT_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0080010form1/w_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0080010.KQ0080010form1.Peekerw_PLANT_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010form1.Peekerw_PLANT_CD['onClick' + i])) {
        expj.KQ0080010.KQ0080010form1.Peekerw_PLANT_CD['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010form1.Peekerw_PLANT_CD.executeAllOnDecision = function () {
};
expj.KQ0080010.KQ0080010form1.Peekerw_PLANT_CD.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-Peekerw_PLANT_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010form1', 'Peekerw_PLANT_CD', this, 'Button');
    }
  });
  expj.KQ0080010.KQ0080010form1.Peekerw_PLANT_CD.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.Peekerw_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/Peekerw_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-Peekerw_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0080010-KQ0080010form1-Peekerw_PLANT_CD" class="KQ0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-PLANT_NAME">
expj.KQ0080010.KQ0080010form1.PLANT_NAME = {};
expj.KQ0080010.KQ0080010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/PLANT_NAME.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'PLANT_NAME', this);
  });
  expj.KQ0080010.KQ0080010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KQ0080010-KQ0080010form1-PLANT_NAME" name="PLANT_NAME" class="KQ0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KQ0080010-KQ0080010form1-h_COMPANY_CD" name="h_COMPANY_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.geth_COMPANY_CD()) %>">
<script class="expj-script-KQ0080010-KQ0080010form1-h_COMPANY_CD">
expj.KQ0080010.KQ0080010form1.h_COMPANY_CD = {};
expj.KQ0080010.KQ0080010form1.h_COMPANY_CD.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/h_COMPANY_CD.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.h_COMPANY_CD.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-h_COMPANY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'h_COMPANY_CD', this);
  });
  expj.KQ0080010.KQ0080010form1.h_COMPANY_CD.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.h_COMPANY_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/h_COMPANY_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-h_COMPANY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KQ0080010-KQ0080010form1-h_JOB_ODR_DLV_DATE" name="h_JOB_ODR_DLV_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.geth_JOB_ODR_DLV_DATE()) %>">
<script class="expj-script-KQ0080010-KQ0080010form1-h_JOB_ODR_DLV_DATE">
expj.KQ0080010.KQ0080010form1.h_JOB_ODR_DLV_DATE = {};
expj.KQ0080010.KQ0080010form1.h_JOB_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/h_JOB_ODR_DLV_DATE.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.h_JOB_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-h_JOB_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'h_JOB_ODR_DLV_DATE', this);
  });
  expj.KQ0080010.KQ0080010form1.h_JOB_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.h_JOB_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/h_JOB_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-h_JOB_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt3096",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-w_ITEM_CD">
expj.KQ0080010.KQ0080010form1.w_ITEM_CD = {};
expj.KQ0080010.KQ0080010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/w_ITEM_CD.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'w_ITEM_CD', this);
  });
  expj.KQ0080010.KQ0080010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0080010-KQ0080010form1-w_ITEM_CD" name="w_ITEM_CD" class="KQ0080010-focus-move  required-value expj-KQ0080010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-Peekerw_ITEM_CD">
expj.KQ0080010.KQ0080010form1.Peekerw_ITEM_CD = {};
// script1="onClick;0;PEEKER;_KQ0080010form1/w_ITEM_CD@<%=contextNo%>"
expj.KQ0080010.KQ0080010form1.Peekerw_ITEM_CD.onClick0 = function () {
  console.log('Peekerw_ITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0080010';
var parameterValues = 'Peekerw_ITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010form1', '_KQ0080010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_05%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0080010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0080010.KQ0080010form1.Peekerw_ITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010form1.Peekerw_ITEM_CD['onClick' + i])) {
        expj.KQ0080010.KQ0080010form1.Peekerw_ITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010form1.Peekerw_ITEM_CD.executeAllOnDecision = function () {
};
expj.KQ0080010.KQ0080010form1.Peekerw_ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-Peekerw_ITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010form1', 'Peekerw_ITEM_CD', this, 'Button');
    }
  });
  expj.KQ0080010.KQ0080010form1.Peekerw_ITEM_CD.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.Peekerw_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/Peekerw_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-Peekerw_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0080010-KQ0080010form1-Peekerw_ITEM_CD" class="KQ0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-ITEM_NAME">
expj.KQ0080010.KQ0080010form1.ITEM_NAME = {};
expj.KQ0080010.KQ0080010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/ITEM_NAME.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'ITEM_NAME', this);
  });
  expj.KQ0080010.KQ0080010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KQ0080010-KQ0080010form1-ITEM_NAME" name="ITEM_NAME" class="KQ0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KQ0080010-KQ0080010form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.geth_PLANT_CD()) %>">
<script class="expj-script-KQ0080010-KQ0080010form1-h_PLANT_CD">
expj.KQ0080010.KQ0080010form1.h_PLANT_CD = {};
expj.KQ0080010.KQ0080010form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/h_PLANT_CD.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'h_PLANT_CD', this);
  });
  expj.KQ0080010.KQ0080010form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-w_DATE_FROM">
expj.KQ0080010.KQ0080010form1.w_DATE_FROM = {};
expj.KQ0080010.KQ0080010form1.w_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/w_DATE_FROM.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.w_DATE_FROM.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-w_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'w_DATE_FROM', this);
  });
  expj.KQ0080010.KQ0080010form1.w_DATE_FROM.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.w_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/w_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-w_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0080010-KQ0080010form1-w_DATE_FROM" name="w_DATE_FROM" class="KQ0080010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.getw_DATE_FROM()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-Calendarw_DATE_FROM">
expj.KQ0080010.KQ0080010form1.Calendarw_DATE_FROM = {};
// script1="onClick;0;CALENDAR;_KQ0080010form1/w_DATE_FROM@<%=contextNo%>"
expj.KQ0080010.KQ0080010form1.Calendarw_DATE_FROM.onClick0 = function () {
  console.log('Calendarw_DATE_FROM script1');
expj.common.pscript.executeCalendar('KQ0080010','KQ0080010form1','_KQ0080010form1/w_DATE_FROM');
};
expj.KQ0080010.KQ0080010form1.Calendarw_DATE_FROM.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010form1.Calendarw_DATE_FROM['onClick' + i])) {
        expj.KQ0080010.KQ0080010form1.Calendarw_DATE_FROM['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010form1.Calendarw_DATE_FROM.executeAllOnDecision = function () {
};
expj.KQ0080010.KQ0080010form1.Calendarw_DATE_FROM.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-Calendarw_DATE_FROM').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010form1', 'Calendarw_DATE_FROM', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0080010','KQ0080010form1','_KQ0080010form1/w_DATE_FROM');
  expj.KQ0080010.KQ0080010form1.Calendarw_DATE_FROM.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.Calendarw_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/Calendarw_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-Calendarw_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0080010-KQ0080010form1-Calendarw_DATE_FROM" class="KQ0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-w_DATE_TO">
expj.KQ0080010.KQ0080010form1.w_DATE_TO = {};
expj.KQ0080010.KQ0080010form1.w_DATE_TO.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/w_DATE_TO.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.w_DATE_TO.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-w_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'w_DATE_TO', this);
  });
  expj.KQ0080010.KQ0080010form1.w_DATE_TO.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.w_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/w_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-w_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0080010-KQ0080010form1-w_DATE_TO" name="w_DATE_TO" class="KQ0080010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.getw_DATE_TO()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-Calendarw_DATE_TO">
expj.KQ0080010.KQ0080010form1.Calendarw_DATE_TO = {};
// script1="onClick;0;CALENDAR;_KQ0080010form1/w_DATE_TO@<%=contextNo%>"
expj.KQ0080010.KQ0080010form1.Calendarw_DATE_TO.onClick0 = function () {
  console.log('Calendarw_DATE_TO script1');
expj.common.pscript.executeCalendar('KQ0080010','KQ0080010form1','_KQ0080010form1/w_DATE_TO');
};
expj.KQ0080010.KQ0080010form1.Calendarw_DATE_TO.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010form1.Calendarw_DATE_TO['onClick' + i])) {
        expj.KQ0080010.KQ0080010form1.Calendarw_DATE_TO['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010form1.Calendarw_DATE_TO.executeAllOnDecision = function () {
};
expj.KQ0080010.KQ0080010form1.Calendarw_DATE_TO.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-Calendarw_DATE_TO').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010form1', 'Calendarw_DATE_TO', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0080010','KQ0080010form1','_KQ0080010form1/w_DATE_TO');
  expj.KQ0080010.KQ0080010form1.Calendarw_DATE_TO.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.Calendarw_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/Calendarw_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-Calendarw_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-KQ0080010-KQ0080010form1-Calendarw_DATE_TO" class="KQ0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-w_CUST_CD">
expj.KQ0080010.KQ0080010form1.w_CUST_CD = {};
expj.KQ0080010.KQ0080010form1.w_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/w_CUST_CD.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.w_CUST_CD.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-w_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'w_CUST_CD', this);
  });
  expj.KQ0080010.KQ0080010form1.w_CUST_CD.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.w_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/w_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-w_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0080010-KQ0080010form1-w_CUST_CD" name="w_CUST_CD" class="KQ0080010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.getw_CUST_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-r1_JOB_ODR_SET_FLG">
expj.KQ0080010.KQ0080010form1.r1_JOB_ODR_SET_FLG = {};
expj.KQ0080010.KQ0080010form1.r1_JOB_ODR_SET_FLG.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/r1_JOB_ODR_SET_FLG.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.r1_JOB_ODR_SET_FLG.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-r1_JOB_ODR_SET_FLG').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010form1', 'r1_JOB_ODR_SET_FLG', this, 'RadioButton');
    }
  });
  expj.KQ0080010.KQ0080010form1.r1_JOB_ODR_SET_FLG.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.r1_JOB_ODR_SET_FLG.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/r1_JOB_ODR_SET_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-r1_JOB_ODR_SET_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="JOB_ODR_SET_FLG" data-name="r1_JOB_ODR_SET_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0080010Struct.getr1_JOB_ODR_SET_FLG())) || "".equals(TypeConverter.convert(aKQ0080010Struct.getr1_JOB_ODR_SET_FLG())))?"checked=\"checked\"": "" %> class="" id="expj-KQ0080010-KQ0080010form1-r1_JOB_ODR_SET_FLG" ><label for="expj-KQ0080010-KQ0080010form1-r1_JOB_ODR_SET_FLG"><%=CoreTools.getRBString("Expj.Cmt3158",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-w_ODR_NO">
expj.KQ0080010.KQ0080010form1.w_ODR_NO = {};
expj.KQ0080010.KQ0080010form1.w_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/w_ODR_NO.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.w_ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-w_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'w_ODR_NO', this);
  });
  expj.KQ0080010.KQ0080010form1.w_ODR_NO.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.w_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/w_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-w_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0080010-KQ0080010form1-w_ODR_NO" name="w_ODR_NO" class="KQ0080010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.getw_ODR_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-r2_JOB_ODR_SET_FLG">
expj.KQ0080010.KQ0080010form1.r2_JOB_ODR_SET_FLG = {};
expj.KQ0080010.KQ0080010form1.r2_JOB_ODR_SET_FLG.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/r2_JOB_ODR_SET_FLG.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.r2_JOB_ODR_SET_FLG.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-r2_JOB_ODR_SET_FLG').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010form1', 'r2_JOB_ODR_SET_FLG', this, 'RadioButton');
    }
  });
  expj.KQ0080010.KQ0080010form1.r2_JOB_ODR_SET_FLG.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.r2_JOB_ODR_SET_FLG.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/r2_JOB_ODR_SET_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-r2_JOB_ODR_SET_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="JOB_ODR_SET_FLG" data-name="r2_JOB_ODR_SET_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0080010Struct.getr2_JOB_ODR_SET_FLG())))?"checked=\"checked\"":"" %> class="" id="expj-KQ0080010-KQ0080010form1-r2_JOB_ODR_SET_FLG" ><label for="expj-KQ0080010-KQ0080010form1-r2_JOB_ODR_SET_FLG"><%=CoreTools.getRBString("Expj.Cmt3159",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KQ0080010-KQ0080010form1-h_JOB_ODR_SET_FLG" name="h_JOB_ODR_SET_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.geth_JOB_ODR_SET_FLG()) %>">
<script class="expj-script-KQ0080010-KQ0080010form1-h_JOB_ODR_SET_FLG">
expj.KQ0080010.KQ0080010form1.h_JOB_ODR_SET_FLG = {};
expj.KQ0080010.KQ0080010form1.h_JOB_ODR_SET_FLG.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/h_JOB_ODR_SET_FLG.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.h_JOB_ODR_SET_FLG.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-h_JOB_ODR_SET_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'h_JOB_ODR_SET_FLG', this);
  });
  expj.KQ0080010.KQ0080010form1.h_JOB_ODR_SET_FLG.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.h_JOB_ODR_SET_FLG.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/h_JOB_ODR_SET_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-h_JOB_ODR_SET_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-w_JOB_ODR_CD">
expj.KQ0080010.KQ0080010form1.w_JOB_ODR_CD = {};
expj.KQ0080010.KQ0080010form1.w_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/w_JOB_ODR_CD.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.w_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-w_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'w_JOB_ODR_CD', this);
  });
  expj.KQ0080010.KQ0080010form1.w_JOB_ODR_CD.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.w_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/w_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-w_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0080010-KQ0080010form1-w_JOB_ODR_CD" name="w_JOB_ODR_CD" class="KQ0080010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.getw_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010form1-c_JOB_ODR_STS_TYP">
expj.KQ0080010.KQ0080010form1.c_JOB_ODR_STS_TYP = {};
expj.KQ0080010.KQ0080010form1.c_JOB_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/c_JOB_ODR_STS_TYP.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.c_JOB_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-c_JOB_ODR_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010form1', 'c_JOB_ODR_STS_TYP', this, 'CheckBox');
    }
  });
  expj.KQ0080010.KQ0080010form1.c_JOB_ODR_STS_TYP.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.c_JOB_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/c_JOB_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-c_JOB_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0080010Struct.getc_JOB_ODR_STS_TYP())) || "1".equals(TypeConverter.convert(aKQ0080010Struct.getc_JOB_ODR_STS_TYP())))?"checked=\"checked\"":"" %>  class="KQ0080010-focus-move" id="expj-KQ0080010-KQ0080010form1-c_JOB_ODR_STS_TYP"><label for="expj-KQ0080010-KQ0080010form1-c_JOB_ODR_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt3157",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KQ0080010-KQ0080010form1-h_JOB_ODR_STS_TYP" name="h_JOB_ODR_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0080010Struct.geth_JOB_ODR_STS_TYP()) %>">
<script class="expj-script-KQ0080010-KQ0080010form1-h_JOB_ODR_STS_TYP">
expj.KQ0080010.KQ0080010form1.h_JOB_ODR_STS_TYP = {};
expj.KQ0080010.KQ0080010form1.h_JOB_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0080010form1/h_JOB_ODR_STS_TYP.onDecision');
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
  expj.KQ0080010.executeAllOnDecision();
};
expj.KQ0080010.KQ0080010form1.h_JOB_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010form1-h_JOB_ODR_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0080010', 'KQ0080010form1', 'h_JOB_ODR_STS_TYP', this);
  });
  expj.KQ0080010.KQ0080010form1.h_JOB_ODR_STS_TYP.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010form1.h_JOB_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0080010form1/h_JOB_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010form1-h_JOB_ODR_STS_TYP');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KQ0080010-KQ0080010button1">
expj.KQ0080010.KQ0080010button1 = {};
expj.KQ0080010.KQ0080010button1.executeAllOnDecision = function () {
  console.log('execute KQ0080010button1.onDecision');
};
expj.KQ0080010.KQ0080010button1.executeOnLoad = function () {
  expj.KQ0080010.KQ0080010button1.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010button1.executePScriptOnLoad = function () {
  console.log('execute KQ0080010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0080010-KQ0080010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0080010-KQ0080010button1-Select">
expj.KQ0080010.KQ0080010button1.Select = {};
// script1="onClick;0;CHK;_KQ0080010form1/w_DATE_FROM[neq][and]_KQ0080010form1/w_DATE_TO[neq][and]_KQ0080010form1/w_DATE_FROM[gt]_KQ0080010form1/w_DATE_TO@!KQ10317"
expj.KQ0080010.KQ0080010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010button1', '_KQ0080010form1/w_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010button1', '_KQ0080010form1/w_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010button1', '_KQ0080010form1/w_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010button1', '_KQ0080010form1/w_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('KQ0080010', 'KQ0080010button1', 'KQ10317');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0080010form1/*@KQ0080010Servlet"
expj.KQ0080010.KQ0080010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0080010', 'KQ0080010button1', '_KQ0080010form1/*', 'KQ0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0080010', response);
expj.common.updateBusinessScreenTab('KQ0080010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0080010.KQ0080010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010button1.Select['onClick' + i])) {
        expj.KQ0080010.KQ0080010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010button1.Select.executeAllOnDecision = function () {
};
expj.KQ0080010.KQ0080010button1.Select.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010button1', 'Select', this, 'Button');
    }
  });
  expj.KQ0080010.KQ0080010button1.Select.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KQ0080010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0080010-KQ0080010button1-Select" name="Select" class="KQ0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td "></div><!--/td-->
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;">
<div class="expj-td frame04" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);float:left;"><script class="expj-script-KQ0080010-KQ0080010view1">
expj.KQ0080010.KQ0080010view1 = {};
expj.KQ0080010.KQ0080010view1.executeAllOnClick = function () {
};
expj.KQ0080010.KQ0080010view1.executeAllOnDecision = function () {
  console.log('execute KQ0080010view1.onDecision');
};
expj.KQ0080010.KQ0080010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KQ0080010view1", "expj.KQ0080010.KQ0080010view1.executeAllOnClick");
%>
  expj.KQ0080010.KQ0080010view1.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010view1.executePScriptOnLoad = function () {
  console.log('execute KQ0080010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KQ0080010-KQ0080010view1" class="expj-datagrid-view expj-view-noselect expj-view-headeronly" style="width:100%;height:23px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String KQ0080010view1_Id = "KQ0080010view1";
 String KQ0080010view1_select = "single";
 String KQ0080010view1_sortable = "true";
 String KQ0080010view1_resize = "true";
 String KQ0080010view1_scroll = "true";
 StringBuffer KQ0080010view1_HB = new StringBuffer();
 StringBuffer KQ0080010view1_DB = new StringBuffer();
%>
<%
 KQ0080010view1_select = "none";
 KQ0080010view1_sortable = "false";
 KQ0080010view1_resize = "false";
 KQ0080010view1_scroll = "false";
%>
<%
 KQ0080010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KQ0080010view1_sortable).append("}").append(",");
%>
 
<%
KQ0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'628px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3155",rb))).append("', 'name':'', 'class':'expj-tooltip ', 'sortable':").append(KQ0080010view1_sortable).append("}").append(",");
%>
<%
 int aKQ0080010StructLength = aKQ0080010Control.getListsize();
 final KQ0080010Struct structBackup = aKQ0080010Struct;
 aKQ0080010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKQ0080010StructLength; ++loopCount) {
  if((aKQ0080010Struct = (KQ0080010Struct) aKQ0080010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKQ0080010Struct", aKQ0080010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
if (loopCount + 1 < aKQ0080010StructLength) {
  }
 }
 aKQ0080010Struct = structBackup;
 viewIdList.add(KQ0080010view1_Id);
 viewSelectList.add(KQ0080010view1_select);
 viewResizeList.add(KQ0080010view1_resize);
 viewScrollList.add(KQ0080010view1_scroll);
 viewHeaderDataList.add(KQ0080010view1_HB);
 viewBodyDataList.add(KQ0080010view1_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td widthLinePartition" style="height:23px;float:left;"></div><!--/td-->
<div class="expj-td frame04" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);float:left;"><script class="expj-script-KQ0080010-KQ0080010view2">
expj.KQ0080010.KQ0080010view2 = {};
expj.KQ0080010.KQ0080010view2.executeAllOnClick = function () {
};
expj.KQ0080010.KQ0080010view2.executeAllOnDecision = function () {
  console.log('execute KQ0080010view2.onDecision');
};
expj.KQ0080010.KQ0080010view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("KQ0080010view2", "expj.KQ0080010.KQ0080010view2.executeAllOnClick");
%>
  expj.KQ0080010.KQ0080010view2.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010view2.executePScriptOnLoad = function () {
  console.log('execute KQ0080010view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KQ0080010-KQ0080010view2" class="expj-datagrid-view expj-view-noselect expj-view-headeronly" style="width:100%;height:23px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String KQ0080010view2_Id = "KQ0080010view2";
 String KQ0080010view2_select = "single";
 String KQ0080010view2_sortable = "true";
 String KQ0080010view2_resize = "true";
 String KQ0080010view2_scroll = "true";
 StringBuffer KQ0080010view2_HB = new StringBuffer();
 StringBuffer KQ0080010view2_DB = new StringBuffer();
%>
<%
 KQ0080010view2_select = "none";
 KQ0080010view2_sortable = "false";
 KQ0080010view2_resize = "false";
 KQ0080010view2_scroll = "false";
%>
<%
 KQ0080010view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KQ0080010view2_sortable).append("}").append(",");
%>
 
<%
KQ0080010view2_HB.append("{'visible':true, 'type':'string', 'width':'628px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3156",rb))).append("', 'name':'', 'class':'expj-tooltip ', 'sortable':").append(KQ0080010view2_sortable).append("}").append(",");
%>
<%
 int aKQ0080010StructLength = aKQ0080010Control.getListsize();
 final KQ0080010Struct structBackup = aKQ0080010Struct;
 aKQ0080010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKQ0080010StructLength; ++loopCount) {
  if((aKQ0080010Struct = (KQ0080010Struct) aKQ0080010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKQ0080010Struct", aKQ0080010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
if (loopCount + 1 < aKQ0080010StructLength) {
  }
 }
 aKQ0080010Struct = structBackup;
 viewIdList.add(KQ0080010view2_Id);
 viewSelectList.add(KQ0080010view2_select);
 viewResizeList.add(KQ0080010view2_resize);
 viewScrollList.add(KQ0080010view2_scroll);
 viewHeaderDataList.add(KQ0080010view2_HB);
 viewBodyDataList.add(KQ0080010view2_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;float:left;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);height:calc(100% - 23px);float:left;"><script class="expj-script-KQ0080010-KQ0080010view3">
expj.KQ0080010.KQ0080010view3 = {};
expj.KQ0080010.KQ0080010view3.executeAllOnClick = function () {
};
expj.KQ0080010.KQ0080010view3.executeAllOnDecision = function () {
  console.log('execute KQ0080010view3.onDecision');
};
expj.KQ0080010.KQ0080010view3.executeOnLoad = function () {
<%
    viewSelectEvent.put("KQ0080010view3", "expj.KQ0080010.KQ0080010view3.executeAllOnClick");
%>
  expj.KQ0080010.KQ0080010view3.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010view3.executePScriptOnLoad = function () {
  console.log('execute KQ0080010view3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KQ0080010-KQ0080010view3" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aKQ0080010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String KQ0080010view3_Id = "KQ0080010view3";
 String KQ0080010view3_select = "single";
 String KQ0080010view3_sortable = "true";
 String KQ0080010view3_resize = "true";
 String KQ0080010view3_scroll = "true";
 StringBuffer KQ0080010view3_HB = new StringBuffer();
 StringBuffer KQ0080010view3_DB = new StringBuffer();
%>
<%
 KQ0080010view3_select = "multi";
 KQ0080010view3_sortable = "true";
 KQ0080010view3_resize = "true";
 KQ0080010view3_scroll = "true";
%>
<%
 KQ0080010view3_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KQ0080010view3_sortable).append("}").append(",");
%>
 
   
<%
KQ0080010view3_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ORD_CD",rb))).append("', 'name':'l1_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view3_sortable).append("}").append(",");
KQ0080010view3_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'l1_DESINATED_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view3_sortable).append("}").append(",");
KQ0080010view3_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_4",rb))).append("', 'name':'l1_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0080010view3_sortable).append("}").append(",");
KQ0080010view3_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0695",rb))).append("', 'name':'l1_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view3_sortable).append("}").append(",");
KQ0080010view3_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'l1_CUST_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view3_sortable).append("}").append(",");
KQ0080010view3_HB.append("{'visible':true, 'type':'string', 'width':'240px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3160",rb))).append("', 'name':'l1_DLV_LOC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view3_sortable).append("}").append(",");
KQ0080010view3_HB.append("{'visible':true, 'type':'string', 'width':'240px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6852",rb))).append("', 'name':'l1_ODR_STATUS_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view3_sortable).append("}").append(",");
KQ0080010view3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l1_PLANT_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0080010view3_sortable).append("}").append(",");
KQ0080010view3_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append("").append("', 'name':'l1_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view3_sortable).append("}").append(",");
%>
<%
 int aKQ0080010StructLength = aKQ0080010Control.getListsize();
 final KQ0080010Struct structBackup = aKQ0080010Struct;
 aKQ0080010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKQ0080010StructLength; ++loopCount) {
  if((aKQ0080010Struct = (KQ0080010Struct) aKQ0080010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKQ0080010Struct", aKQ0080010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KQ0080010view3_DB.append("[");
 KQ0080010view3_DB.append(loopCount);
 KQ0080010view3_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view3-l1_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view3-l1_ODR_NO\" data-name=\"l1_ODR_NO\" data-view=\"true\" data-kind=\"OBT_AN;\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl1_ODR_NO())).append("</span>'");
 KQ0080010view3_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view3-l1_DESINATED_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view3-l1_DESINATED_DLV_DATE\" data-name=\"l1_DESINATED_DLV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl1_DESINATED_DLV_DATE())).append("</span>'");
 KQ0080010view3_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view3-l1_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view3-l1_ODR_QTY\" data-name=\"l1_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;18.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl1_ODR_QTY())).append("</span>'");
 KQ0080010view3_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view3-l1_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view3-l1_JOB_ODR_CD\" data-name=\"l1_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl1_JOB_ODR_CD())).append("</span>'");
 KQ0080010view3_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view3-l1_CUST_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view3-l1_CUST_NAME\" data-name=\"l1_CUST_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl1_CUST_NAME())).append("</span>'");
 KQ0080010view3_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view3-l1_DLV_LOC_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view3-l1_DLV_LOC_NAME\" data-name=\"l1_DLV_LOC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl1_DLV_LOC_NAME())).append("</span>'");
 KQ0080010view3_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view3-l1_ODR_STATUS_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view3-l1_ODR_STATUS_TYP\" data-name=\"l1_ODR_STATUS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl1_ODR_STATUS_TYP())).append("</span>'");
 KQ0080010view3_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view3-l1_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view3-l1_PLANT_CD\" data-name=\"l1_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl1_PLANT_CD())).append("</span>'");
 KQ0080010view3_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view3-l1_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view3-l1_MODIFY_COUNT\" data-name=\"l1_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl1_MODIFY_COUNT())).append("</span>'");
 KQ0080010view3_DB.append("]");
%>
<%
if (loopCount + 1 < aKQ0080010StructLength) {
   KQ0080010view3_DB.append(",");
  }
 }
 aKQ0080010Struct = structBackup;
 viewIdList.add(KQ0080010view3_Id);
 viewSelectList.add(KQ0080010view3_select);
 viewResizeList.add(KQ0080010view3_resize);
 viewScrollList.add(KQ0080010view3_scroll);
 viewHeaderDataList.add(KQ0080010view3_HB);
 viewBodyDataList.add(KQ0080010view3_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="float:left;"></div><!--/td-->
<div class="expj-td widthLinePartition" style="height:calc(100% - 23px);float:left;"></div><!--/td-->
<div class="expj-td frame04" style="float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);height:calc(100% - 23px);float:left;"><script class="expj-script-KQ0080010-KQ0080010view4">
expj.KQ0080010.KQ0080010view4 = {};
// script1="onClick;0;SET;_KQ0080010form1/h_JOB_ODR_DLV_DATE=_KQ0080010view4/l2_JOB_ODR_DLV_DATE,_KQ0080010form1/h_PLANT_CD=_KQ0080010view4/l2_PLANT_CD"
expj.KQ0080010.KQ0080010view4.onClick0 = function () {
  console.log('KQ0080010view4 script1');
expj.common.pscript.setReferenceComponentValue('KQ0080010', 'KQ0080010view4', '_KQ0080010form1/h_JOB_ODR_DLV_DATE', expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010view4', '_KQ0080010view4/l2_JOB_ODR_DLV_DATE'));
expj.common.pscript.setReferenceComponentValue('KQ0080010', 'KQ0080010view4', '_KQ0080010form1/h_PLANT_CD', expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010view4', '_KQ0080010view4/l2_PLANT_CD'));
};
expj.KQ0080010.KQ0080010view4.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010view4['onClick' + i])) {
        expj.KQ0080010.KQ0080010view4['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010view4.executeAllOnDecision = function () {
  console.log('execute KQ0080010view4.onDecision');
};
expj.KQ0080010.KQ0080010view4.executeOnLoad = function () {
<%
    viewSelectEvent.put("KQ0080010view4", "expj.KQ0080010.KQ0080010view4.executeAllOnClick");
%>
  expj.KQ0080010.KQ0080010view4.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010view4.executePScriptOnLoad = function () {
  console.log('execute KQ0080010view4.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KQ0080010-KQ0080010view4" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aKQ0080010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String KQ0080010view4_Id = "KQ0080010view4";
 String KQ0080010view4_select = "single";
 String KQ0080010view4_sortable = "true";
 String KQ0080010view4_resize = "true";
 String KQ0080010view4_scroll = "true";
 StringBuffer KQ0080010view4_HB = new StringBuffer();
 StringBuffer KQ0080010view4_DB = new StringBuffer();
%>
<%
 KQ0080010view4_select = "single";
 KQ0080010view4_sortable = "true";
 KQ0080010view4_resize = "true";
 KQ0080010view4_scroll = "true";
%>
<%
 KQ0080010view4_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KQ0080010view4_sortable).append("}").append(",");
%>
 
    <%
			  	List list = aKQ0080010Control.getList();
				aKQ0080010Control.setList(aKQ0080010Control.getJob_odrlist());
			  %>
 <%
KQ0080010view4_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0695",rb))).append("', 'name':'l2_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view4_sortable).append("}").append(",");
KQ0080010view4_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb))).append("', 'name':'l2_JOB_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view4_sortable).append("}").append(",");
KQ0080010view4_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_QTY_1",rb))).append("', 'name':'l2_JOB_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0080010view4_sortable).append("}").append(",");
KQ0080010view4_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0300",rb))).append("', 'name':'l2_ALCD_ENABLE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0080010view4_sortable).append("}").append(",");
KQ0080010view4_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_STS_TYP",rb))).append("', 'name':'l2_JOB_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view4_sortable).append("}").append(",");
KQ0080010view4_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0037",rb))).append("', 'name':'l2_PLANT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0080010view4_sortable).append("}").append(",");
KQ0080010view4_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l2_PLANT_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0080010view4_sortable).append("}").append(",");
KQ0080010view4_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l2_h_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0080010view4_sortable).append("}").append(",");
%>
<%
 int aKQ0080010StructLength = aKQ0080010Control.getListsize();
 final KQ0080010Struct structBackup = aKQ0080010Struct;
 aKQ0080010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKQ0080010StructLength; ++loopCount) {
  if((aKQ0080010Struct = (KQ0080010Struct) aKQ0080010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKQ0080010Struct", aKQ0080010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KQ0080010view4_DB.append("[");
 KQ0080010view4_DB.append(loopCount);
 KQ0080010view4_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view4-l2_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view4-l2_JOB_ODR_CD\" data-name=\"l2_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl2_JOB_ODR_CD())).append("</span>'");
 KQ0080010view4_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view4-l2_JOB_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view4-l2_JOB_ODR_DLV_DATE\" data-name=\"l2_JOB_ODR_DLV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl2_JOB_ODR_DLV_DATE())).append("</span>'");
 KQ0080010view4_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view4-l2_JOB_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view4-l2_JOB_ODR_QTY\" data-name=\"l2_JOB_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;18.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl2_JOB_ODR_QTY())).append("</span>'");
 KQ0080010view4_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view4-l2_ALCD_ENABLE_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view4-l2_ALCD_ENABLE_QTY\" data-name=\"l2_ALCD_ENABLE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;18.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl2_ALCD_ENABLE_QTY())).append("</span>'");
 KQ0080010view4_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view4-l2_JOB_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view4-l2_JOB_ODR_STS_TYP\" data-name=\"l2_JOB_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl2_JOB_ODR_STS_TYP())).append("</span>'");
 KQ0080010view4_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view4-l2_PLANT_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view4-l2_PLANT_NAME\" data-name=\"l2_PLANT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl2_PLANT_NAME())).append("</span>'");
 KQ0080010view4_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view4-l2_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view4-l2_PLANT_CD\" data-name=\"l2_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl2_PLANT_CD())).append("</span>'");
 KQ0080010view4_DB.append(",").append("'<span id=\"expj-KQ0080010-KQ0080010view4-l2_h_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0080010-KQ0080010view4-l2_h_JOB_ODR_CD\" data-name=\"l2_h_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0080010Struct.getl2_h_JOB_ODR_CD())).append("</span>'");
 KQ0080010view4_DB.append("]");
%>
<%
if (loopCount + 1 < aKQ0080010StructLength) {
   KQ0080010view4_DB.append(",");
  }
 }
 aKQ0080010Struct = structBackup;
 viewIdList.add(KQ0080010view4_Id);
 viewSelectList.add(KQ0080010view4_select);
 viewResizeList.add(KQ0080010view4_resize);
 viewScrollList.add(KQ0080010view4_scroll);
 viewHeaderDataList.add(KQ0080010view4_HB);
 viewBodyDataList.add(KQ0080010view4_DB);
%>
 <%
			  	aKQ0080010Control.setList(list);
			  %>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="float:left;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field two-view-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area for-two-button" style="width:210px;height:32px;"><script class="expj-script-KQ0080010-KQ0080010button2">
expj.KQ0080010.KQ0080010button2 = {};
expj.KQ0080010.KQ0080010button2.executeAllOnDecision = function () {
  console.log('execute KQ0080010button2.onDecision');
};
expj.KQ0080010.KQ0080010button2.executeOnLoad = function () {
  expj.KQ0080010.KQ0080010button2.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010button2.executePScriptOnLoad = function () {
  console.log('execute KQ0080010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0080010-KQ0080010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
 <script class="expj-script-KQ0080010-KQ0080010button2-Insert">
expj.KQ0080010.KQ0080010button2.Insert = {};
// script1="onClick;0;SELCHKT;KQ0080010view3:_l1_PLANT_CD[neq]_KQ0080010form1/h_PLANT_CD@!KQ00329"
expj.KQ0080010.KQ0080010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KQ0080010', 'KQ0080010view3');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l1_PLANT_CD, '[neq]', expj.common.pscript.getReferenceComponentValue('KQ0080010', 'KQ0080010button2', '_KQ0080010form1/h_PLANT_CD'))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.viewErrorMessage('KQ0080010', 'KQ0080010button2', 'KQ00329');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0080010form1/*,_KQ0080010view3/+,_KQ0080010view4/+@KQ0080010Servlet,,$ZZ07001"
expj.KQ0080010.KQ0080010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0080010', 'KQ0080010button2', '_KQ0080010form1/*,_KQ0080010view3/+,_KQ0080010view4/+', 'KQ0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0080010', response);
expj.common.updateBusinessScreenTab('KQ0080010', contents);
};
expj.common.pscript.callConfirm('KQ0080010', 'KQ0080010button2', 'ZZ07001', okEvent);
};
expj.KQ0080010.KQ0080010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010button2.Insert['onClick' + i])) {
        expj.KQ0080010.KQ0080010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010button2.Insert.executeAllOnDecision = function () {
};
expj.KQ0080010.KQ0080010button2.Insert.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010button2', 'Insert', this, 'Button');
    }
  });
  expj.KQ0080010.KQ0080010button2.Insert.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute KQ0080010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0080010-KQ0080010button2-Insert" name="Insert" class="KQ0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsertAssort",rb)%></button><!-- 選択登録ボタン --></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010button2-Delete">
expj.KQ0080010.KQ0080010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0080010form1/*,_KQ0080010view3/+,_KQ0080010view4/+@KQ0080010Servlet,,$ZZ07004"
expj.KQ0080010.KQ0080010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0080010', 'KQ0080010button2', '_KQ0080010form1/*,_KQ0080010view3/+,_KQ0080010view4/+', 'KQ0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0080010', response);
expj.common.updateBusinessScreenTab('KQ0080010', contents);
};
expj.common.pscript.callConfirm('KQ0080010', 'KQ0080010button2', 'ZZ07004', okEvent);
};
expj.KQ0080010.KQ0080010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010button2.Delete['onClick' + i])) {
        expj.KQ0080010.KQ0080010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010button2.Delete.executeAllOnDecision = function () {
};
expj.KQ0080010.KQ0080010button2.Delete.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010button2', 'Delete', this, 'Button');
    }
  });
  expj.KQ0080010.KQ0080010button2.Delete.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute KQ0080010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0080010-KQ0080010button2-Delete" name="Delete" class="KQ0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAssort_1",rb)%></button><!-- 選択削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(50vw - 103px - 210px);height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell widthLinePartition widthResizeLinePartition" style="height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area for-two-button" style="width:105px;height:32px;"><script class="expj-script-KQ0080010-KQ0080010button3">
expj.KQ0080010.KQ0080010button3 = {};
expj.KQ0080010.KQ0080010button3.executeAllOnDecision = function () {
  console.log('execute KQ0080010button3.onDecision');
};
expj.KQ0080010.KQ0080010button3.executeOnLoad = function () {
  expj.KQ0080010.KQ0080010button3.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010button3.executePScriptOnLoad = function () {
  console.log('execute KQ0080010button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0080010-KQ0080010button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0080010-KQ0080010button3-LineDelete">
expj.KQ0080010.KQ0080010button3.LineDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0080010form1/*,_KQ0080010view3/+,_KQ0080010view4/+@KQ0080010Servlet,,$ZZ07004"
expj.KQ0080010.KQ0080010button3.LineDelete.onClick0 = function () {
  console.log('LineDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0080010', 'KQ0080010button3', '_KQ0080010form1/*,_KQ0080010view3/+,_KQ0080010view4/+', 'KQ0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0080010', response);
expj.common.updateBusinessScreenTab('KQ0080010', contents);
};
expj.common.pscript.callConfirm('KQ0080010', 'KQ0080010button3', 'ZZ07004', okEvent);
};
expj.KQ0080010.KQ0080010button3.LineDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010button3.LineDelete['onClick' + i])) {
        expj.KQ0080010.KQ0080010button3.LineDelete['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010button3.LineDelete.executeAllOnDecision = function () {
};
expj.KQ0080010.KQ0080010button3.LineDelete.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010button3-LineDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010button3', 'LineDelete', this, 'Button');
    }
  });
  expj.KQ0080010.KQ0080010button3.LineDelete.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010button3.LineDelete.executePScriptOnLoad = function () {
  console.log('execute KQ0080010button3/LineDelete.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010button3-LineDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0080010-KQ0080010button3-LineDelete" name="LineDelete" class="KQ0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame17 button-area-right" style="width:60px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:calc(50vw - 103px - 105px);height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;height:32px;"></div><!--/td-->
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
<span class="version">KQ0080010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KQ0080010-KQ0080010button0">
expj.KQ0080010.KQ0080010button0 = {};
expj.KQ0080010.KQ0080010button0.executeAllOnDecision = function () {
  console.log('execute KQ0080010button0.onDecision');
};
expj.KQ0080010.KQ0080010button0.executeOnLoad = function () {
  expj.KQ0080010.KQ0080010button0.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010button0.executePScriptOnLoad = function () {
  console.log('execute KQ0080010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0080010-KQ0080010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0080010-KQ0080010button0-Clear">
expj.KQ0080010.KQ0080010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0080010form1/*@KQ0080010Servlet,,$ZZ07008"
expj.KQ0080010.KQ0080010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0080010', 'KQ0080010button0', '_KQ0080010form1/*', 'KQ0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0080010', response);
expj.common.updateBusinessScreenTab('KQ0080010', contents);
};
expj.common.pscript.callConfirm('KQ0080010', 'KQ0080010button0', 'ZZ07008', okEvent);
};
expj.KQ0080010.KQ0080010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010button0.Clear['onClick' + i])) {
        expj.KQ0080010.KQ0080010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010button0.Clear.executeAllOnDecision = function () {
};
expj.KQ0080010.KQ0080010button0.Clear.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010button0', 'Clear', this, 'Button');
    }
  });
  expj.KQ0080010.KQ0080010button0.Clear.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KQ0080010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0080010-KQ0080010button0-Clear" name="Clear" class="KQ0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KQ0080010-KQ0080010button0-Close">
expj.KQ0080010.KQ0080010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KQ0080010.KQ0080010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KQ0080010');
};
expj.KQ0080010.KQ0080010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0080010.KQ0080010button0.Close['onClick' + i])) {
        expj.KQ0080010.KQ0080010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KQ0080010.KQ0080010button0.Close.executeAllOnDecision = function () {
};
expj.KQ0080010.KQ0080010button0.Close.executeOnLoad = function () {
  $('#expj-KQ0080010-KQ0080010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0080010', 'KQ0080010button0', 'Close', this, 'Button');
    }
  });
  expj.KQ0080010.KQ0080010button0.Close.executePScriptOnLoad();
};

expj.KQ0080010.KQ0080010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KQ0080010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KQ0080010-KQ0080010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0080010-KQ0080010button0-Close" name="Close" class="KQ0080010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KQ0080010 (END)-->
<%
  MessageStruct msgStruct = aKQ0080010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KQ0080010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KQ0080010)) {
  expj.common.treeInstanceMap.KQ0080010 = {};
}
expj.common.treeInstanceMap.KQ0080010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0080010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KQ0080010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0080010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KQ0080010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KQ0080010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KQ0080010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KQ0080010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KQ0080010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KQ0080010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KQ0080010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0080010)) {
  expj.common.detailDialogMap.KQ0080010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0080010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KQ0080010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0080010.<%=detailId %>)) {
  expj.common.detailDialogMap.KQ0080010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0080010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KQ0080010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0080010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KQ0080010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KQ0080010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KQ0080010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KQ0080010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KQ0080010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KQ0080010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KQ0080010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KQ0080010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KQ0080010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KQ0080010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KQ0080010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KQ0080010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KQ0080010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KQ0080010)) {
  expj.common.viewInstanceMap.KQ0080010 = {};
}
expj.common.viewInstanceMap.KQ0080010.<%=viewId %> = {};
expj.common.viewInstanceMap.KQ0080010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KQ0080010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KQ0080010.<%=viewId %>.init = function () {
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
    expj.KQ0080010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KQ0080010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KQ0080010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KQ0080010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KQ0080010_init">
/**
 * KQ0080010用のロード完了時初期化関数
 */
expj.KQ0080010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KQ0080010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KQ0080010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KQ0080010');
  expj.common.calendarInstanceMap.KQ0080010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KQ0080010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KQ0080010.<%=detailId %>.init();
  expj.common.detailDialogMap.KQ0080010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KQ0080010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KQ0080010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KQ0080010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KQ0080010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KQ0080010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KQ0080010-<%=detailId %>');
<%
 }
%>
  try{expj.KQ0080010.KQ0080010form1.w_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.Peekerw_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.h_COMPANY_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.h_JOB_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.Peekerw_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.w_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.Calendarw_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.w_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.Calendarw_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.w_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.r1_JOB_ODR_SET_FLG.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.w_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.r2_JOB_ODR_SET_FLG.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.h_JOB_ODR_SET_FLG.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.w_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.c_JOB_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.h_JOB_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010button3.LineDelete.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010form1.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010button1.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010view1.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010view2.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010view3.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010view4.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010button2.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010button3.executeOnLoad();}catch(e){};
  try{expj.KQ0080010.KQ0080010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KQ0080010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KQ0080010', 'KQ0080010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KQ0080010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KQ0080010-focus-move');
  // 初期フォーカス当てる処理
  $('.KQ0080010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KQ0080010', '<%=request.getContextPath() %>');
};

/**
 * KQ0080010の全体onDecision処理
 */
expj.KQ0080010.executeAllOnDecision = function () {
  expj.KQ0080010.KQ0080010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KQ0080010_console">
expj.KQ0080010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>