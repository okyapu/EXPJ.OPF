<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:45:38 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AL0050\AL0050010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AL0050.*" %>
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
<jsp:useBean id="aAL0050010Control" class="com.nec.jp.orteus.metamorBase.AL0050.AL0050010Control" scope="request"/>
<jsp:useBean id="aAL0050010Struct" class="com.nec.jp.orteus.metamorBase.AL0050.AL0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

負荷シミュレーション
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0050/jsp/AL0050010.jsp,v $
$Author: geng-jia $
$Revision: 1.6 $ $Date: 2017/02/22 02:06:19 $
********************************************************* --%>
<html>
<head>
<title>負荷シミュレーション</title>
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
<script class="expj-script-AL0050010_init">
  // AL0050010名前空間
  expj.AL0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AL0050010" data-screen="AL0050010" data-newdata="<%=aAL0050010Control.isNewData() %>">
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
              <script class="expj-script-AL0050010-AL0050010form1">
expj.AL0050010.AL0050010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AL0050010.AL0050010form1.onLoad0 = function () {
  console.log('AL0050010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;?AL0050010view1/?[eq]SINGLE@*0,*2"
expj.AL0050010.AL0050010form1.onDecision0 = function () {
  console.log('AL0050010form1 script2');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHK;?AL0050010view1/*[eq]NORMAL[and]?AL0050010form1/JOB_ODR_CD[eq]SAME[and]?AL0050010form1/ITEM_CD[eq]SAME[and]?AL0050010form1/PRD_DUE_DATE_FROM[eq]SAME[and]?AL0050010form1/PRD_DUE_DATE_TO[eq]SAME@*1,*2"
expj.AL0050010.AL0050010form1.child0 = function () {
  console.log('AL0050010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010view1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010form1/PRD_DUE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010form1/PRD_DUE_DATE_TO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;UNMASK;_AL0050010button2/LineCopy,_AL0050010button2/LineUpdate,_AL0050010button2/LineDelete"
expj.AL0050010.AL0050010form1.child1 = function () {
  console.log('AL0050010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AL0050010', 'AL0050010form1', '_AL0050010button2/LineCopy');
expj.common.pscript.setUnMaskToReferenceComponent('AL0050010', 'AL0050010form1', '_AL0050010button2/LineUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('AL0050010', 'AL0050010form1', '_AL0050010button2/LineDelete');
};
// script5="child;2;MASK;_AL0050010button2/LineCopy,_AL0050010button2/LineUpdate,_AL0050010button2/LineDelete"
expj.AL0050010.AL0050010form1.child2 = function () {
  console.log('AL0050010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AL0050010', 'AL0050010form1', '_AL0050010button2/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('AL0050010', 'AL0050010form1', '_AL0050010button2/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AL0050010', 'AL0050010form1', '_AL0050010button2/LineDelete');
};
// script6="onDecision;1;CHK;?AL0050010view1/*[eq]NORMAL[and]?AL0050010form1/JOB_ODR_CD[eq]SAME[and]?AL0050010form1/ITEM_CD[eq]SAME[and]?AL0050010form1/PRD_DUE_DATE_FROM[eq]SAME[and]?AL0050010form1/PRD_DUE_DATE_TO[eq]SAME@*3,*4"
expj.AL0050010.AL0050010form1.onDecision1 = function () {
  console.log('AL0050010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010view1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010form1/PRD_DUE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '?AL0050010form1/PRD_DUE_DATE_TO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AL0050010button2/DeleteAll"
expj.AL0050010.AL0050010form1.child3 = function () {
  console.log('AL0050010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AL0050010', 'AL0050010form1', '_AL0050010button2/DeleteAll');
};
// script8="child;4;MASK;_AL0050010button2/DeleteAll"
expj.AL0050010.AL0050010form1.child4 = function () {
  console.log('AL0050010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AL0050010', 'AL0050010form1', '_AL0050010button2/DeleteAll');
};
expj.AL0050010.AL0050010form1.executeAllOnDecision = function () {
  console.log('execute AL0050010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010form1['onDecision' + i])) {
        expj.AL0050010.AL0050010form1['onDecision' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010form1.executeOnLoad = function () {
  expj.AL0050010.AL0050010form1.executePScriptOnLoad();
};

expj.AL0050010.AL0050010form1.executePScriptOnLoad = function () {
  console.log('execute AL0050010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AL0050010.AL0050010form1['onLoad' + i])) {
      expj.AL0050010.AL0050010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AL0050010-AL0050010form1" action="AL0050010Servlet" name="AL0050010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:20px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010form1-JOB_ODR_CD">
expj.AL0050010.AL0050010form1.JOB_ODR_CD = {};
expj.AL0050010.AL0050010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AL0050010form1/JOB_ODR_CD.onDecision');
  expj.AL0050010.AL0050010form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050010form1', 'JOB_ODR_CD', this);
  });
  expj.AL0050010.AL0050010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AL0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010form1-ITEM_CD">
expj.AL0050010.AL0050010form1.ITEM_CD = {};
expj.AL0050010.AL0050010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AL0050010form1/ITEM_CD.onDecision');
  expj.AL0050010.AL0050010form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050010form1', 'ITEM_CD', this);
  });
  expj.AL0050010.AL0050010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050010form1-ITEM_CD" name="ITEM_CD" class="AL0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010form1-PeekerItemCd">
expj.AL0050010.AL0050010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AL0050010form1/ITEM_CD@<%=contextNo%>"
expj.AL0050010.AL0050010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AL0050010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010form1', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AL0050010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AL0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AL0050010.AL0050010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010form1.PeekerItemCd['onClick' + i])) {
        expj.AL0050010.AL0050010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AL0050010.AL0050010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AL0050010.AL0050010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AL0050010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AL0050010-AL0050010form1-PeekerItemCd" class="AL0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010form1-ITEM_NAME">
expj.AL0050010.AL0050010form1.ITEM_NAME = {};
expj.AL0050010.AL0050010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AL0050010form1/ITEM_NAME.onDecision');
  expj.AL0050010.AL0050010form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050010form1', 'ITEM_NAME', this);
  });
  expj.AL0050010.AL0050010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AL0050010.AL0050010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AL0050010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050010form1-ITEM_NAME" name="ITEM_NAME" class="AL0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)%></span><!-- 製造納期 --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010form1-PRD_DUE_DATE_FROM">
expj.AL0050010.AL0050010form1.PRD_DUE_DATE_FROM = {};
expj.AL0050010.AL0050010form1.PRD_DUE_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AL0050010form1/PRD_DUE_DATE_FROM.onDecision');
  expj.AL0050010.AL0050010form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050010form1.PRD_DUE_DATE_FROM.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010form1-PRD_DUE_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050010form1', 'PRD_DUE_DATE_FROM', this);
  });
  expj.AL0050010.AL0050010form1.PRD_DUE_DATE_FROM.executePScriptOnLoad();
};

expj.AL0050010.AL0050010form1.PRD_DUE_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AL0050010form1/PRD_DUE_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010form1-PRD_DUE_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050010form1-PRD_DUE_DATE_FROM" name="PRD_DUE_DATE_FROM" class="AL0050010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getPRD_DUE_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010form1-CalendarPrdDueDateFrom">
expj.AL0050010.AL0050010form1.CalendarPrdDueDateFrom = {};
// script1="onClick;0;CALENDAR;_AL0050010form1/PRD_DUE_DATE_FROM"
expj.AL0050010.AL0050010form1.CalendarPrdDueDateFrom.onClick0 = function () {
  console.log('CalendarPrdDueDateFrom script1');
expj.common.pscript.executeCalendar('AL0050010','AL0050010form1','_AL0050010form1/PRD_DUE_DATE_FROM');
};
expj.AL0050010.AL0050010form1.CalendarPrdDueDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010form1.CalendarPrdDueDateFrom['onClick' + i])) {
        expj.AL0050010.AL0050010form1.CalendarPrdDueDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010form1.CalendarPrdDueDateFrom.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010form1.CalendarPrdDueDateFrom.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010form1-CalendarPrdDueDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010form1', 'CalendarPrdDueDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AL0050010','AL0050010form1','_AL0050010form1/PRD_DUE_DATE_FROM');
  expj.AL0050010.AL0050010form1.CalendarPrdDueDateFrom.executePScriptOnLoad();
};

expj.AL0050010.AL0050010form1.CalendarPrdDueDateFrom.executePScriptOnLoad = function () {
  console.log('execute AL0050010form1/CalendarPrdDueDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010form1-CalendarPrdDueDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AL0050010-AL0050010form1-CalendarPrdDueDateFrom" class="AL0050010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010form1-PRD_DUE_DATE_TO">
expj.AL0050010.AL0050010form1.PRD_DUE_DATE_TO = {};
expj.AL0050010.AL0050010form1.PRD_DUE_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AL0050010form1/PRD_DUE_DATE_TO.onDecision');
  expj.AL0050010.AL0050010form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050010form1.PRD_DUE_DATE_TO.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010form1-PRD_DUE_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050010form1', 'PRD_DUE_DATE_TO', this);
  });
  expj.AL0050010.AL0050010form1.PRD_DUE_DATE_TO.executePScriptOnLoad();
};

expj.AL0050010.AL0050010form1.PRD_DUE_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AL0050010form1/PRD_DUE_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010form1-PRD_DUE_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050010form1-PRD_DUE_DATE_TO" name="PRD_DUE_DATE_TO" class="AL0050010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getPRD_DUE_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010form1-CalendarPrdDueDateTo">
expj.AL0050010.AL0050010form1.CalendarPrdDueDateTo = {};
// script1="onClick;0;CALENDAR;_AL0050010form1/PRD_DUE_DATE_TO"
expj.AL0050010.AL0050010form1.CalendarPrdDueDateTo.onClick0 = function () {
  console.log('CalendarPrdDueDateTo script1');
expj.common.pscript.executeCalendar('AL0050010','AL0050010form1','_AL0050010form1/PRD_DUE_DATE_TO');
};
expj.AL0050010.AL0050010form1.CalendarPrdDueDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010form1.CalendarPrdDueDateTo['onClick' + i])) {
        expj.AL0050010.AL0050010form1.CalendarPrdDueDateTo['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010form1.CalendarPrdDueDateTo.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010form1.CalendarPrdDueDateTo.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010form1-CalendarPrdDueDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010form1', 'CalendarPrdDueDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AL0050010','AL0050010form1','_AL0050010form1/PRD_DUE_DATE_TO');
  expj.AL0050010.AL0050010form1.CalendarPrdDueDateTo.executePScriptOnLoad();
};

expj.AL0050010.AL0050010form1.CalendarPrdDueDateTo.executePScriptOnLoad = function () {
  console.log('execute AL0050010form1/CalendarPrdDueDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010form1-CalendarPrdDueDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AL0050010-AL0050010form1-CalendarPrdDueDateTo" class="AL0050010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0050010-AL0050010form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.geth_PLANT_CD()) %>">
<script class="expj-script-AL0050010-AL0050010form1-h_PLANT_CD">
expj.AL0050010.AL0050010form1.h_PLANT_CD = {};
expj.AL0050010.AL0050010form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AL0050010form1/h_PLANT_CD.onDecision');
  expj.AL0050010.AL0050010form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050010form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050010form1', 'h_PLANT_CD', this);
  });
  expj.AL0050010.AL0050010form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050010form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050010form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010form1-h_PLANT_CD');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AL0050010-AL0050010button1">
expj.AL0050010.AL0050010button1 = {};
expj.AL0050010.AL0050010button1.executeAllOnDecision = function () {
  console.log('execute AL0050010button1.onDecision');
};
expj.AL0050010.AL0050010button1.executeOnLoad = function () {
  expj.AL0050010.AL0050010button1.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button1.executePScriptOnLoad = function () {
  console.log('execute AL0050010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0050010-AL0050010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0050010-AL0050010button1-Select">
expj.AL0050010.AL0050010button1.Select = {};
// script1="onClick;0;CHK;_AL0050010form1/PRD_DUE_DATE_FROM[neq]''[and]_AL0050010form1/PRD_DUE_DATE_TO[neq]''[and]_AL0050010form1/PRD_DUE_DATE_FROM[gt]_AL0050010form1/PRD_DUE_DATE_TO@#AL50013"
expj.AL0050010.AL0050010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010button1', '_AL0050010form1/PRD_DUE_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010button1', '_AL0050010form1/PRD_DUE_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010button1', '_AL0050010form1/PRD_DUE_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050010button1', '_AL0050010form1/PRD_DUE_DATE_TO')))) {
expj.common.pscript.addErrorMessage('AL0050010', 'AL0050010button1', 'AL50013');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0050010form1/*@AL0050010Servlet"
expj.AL0050010.AL0050010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050010button1', '_AL0050010form1/*', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.updateBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AL0050010.AL0050010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010button1.Select['onClick' + i])) {
        expj.AL0050010.AL0050010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010button1.Select.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010button1.Select.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010button1', 'Select', this, 'Button');
    }
  });
  expj.AL0050010.AL0050010button1.Select.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AL0050010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050010button1-Select" name="Select" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AL0050010-AL0050010view1">
expj.AL0050010.AL0050010view1 = {};
expj.AL0050010.AL0050010view1.executeAllOnClick = function () {
};
expj.AL0050010.AL0050010view1.executeAllOnDecision = function () {
  console.log('execute AL0050010view1.onDecision');
};
expj.AL0050010.AL0050010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AL0050010view1", "expj.AL0050010.AL0050010view1.executeAllOnClick");
%>
  expj.AL0050010.AL0050010view1.executePScriptOnLoad();
};

expj.AL0050010.AL0050010view1.executePScriptOnLoad = function () {
  console.log('execute AL0050010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AL0050010-AL0050010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%=TypeConverter.sanitizer(aAL0050010Control.getReadStatusString())%>"></div>
<!-- VIEW END -->
<%
 String AL0050010view1_Id = "AL0050010view1";
 String AL0050010view1_select = "single";
 String AL0050010view1_sortable = "true";
 String AL0050010view1_resize = "true";
 String AL0050010view1_scroll = "true";
 StringBuffer AL0050010view1_HB = new StringBuffer();
 StringBuffer AL0050010view1_DB = new StringBuffer();
%>
<%
 AL0050010view1_select = "single";
 AL0050010view1_sortable = "true";
 AL0050010view1_resize = "true";
 AL0050010view1_scroll = "true";
%>
<%
 AL0050010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AL0050010view1_sortable).append("}").append(",");
%>
     
<%
AL0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0050010view1_sortable).append("}").append(",");
AL0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0050010view1_sortable).append("}").append(",");
AL0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0050010view1_sortable).append("}").append(",");
AL0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb))).append("', 'name':'l_PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0050010view1_sortable).append("}").append(",");
AL0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_1",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AL0050010view1_sortable).append("}").append(",");
AL0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'125px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD_1",rb))).append("', 'name':'l_CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0050010view1_sortable).append("}").append(",");
AL0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'125px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.LOAD_PLAN_COMMENT_1",rb))).append("', 'name':'l_LOAD_PLAN_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AL0050010view1_sortable).append("}").append(",");
AL0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_LOAD_PLAN_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AL0050010view1_sortable).append("}").append(",");
AL0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AL0050010view1_sortable).append("}").append(",");
%>
<%
 int aAL0050010StructLength = aAL0050010Control.getListsize();
 final AL0050010Struct structBackup = aAL0050010Struct;
 aAL0050010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAL0050010StructLength; ++loopCount) {
  if((aAL0050010Struct = (AL0050010Struct) aAL0050010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAL0050010Struct", aAL0050010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AL0050010view1_DB.append("[");
 AL0050010view1_DB.append(loopCount);
 AL0050010view1_DB.append(",").append("'<span id=\"expj-AL0050010-AL0050010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AL0050010-AL0050010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0050010Struct.getl_JOB_ODR_CD())).append("</span>'");
 AL0050010view1_DB.append(",").append("'<span id=\"expj-AL0050010-AL0050010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AL0050010-AL0050010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0050010Struct.getl_ITEM_CD())).append("</span>'");
 AL0050010view1_DB.append(",").append("'<span id=\"expj-AL0050010-AL0050010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AL0050010-AL0050010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0050010Struct.getl_ITEM_NAME())).append("</span>'");
 AL0050010view1_DB.append(",").append("'<span id=\"expj-AL0050010-AL0050010view1-l_PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AL0050010-AL0050010view1-l_PRD_DUE_DATE\" data-name=\"l_PRD_DUE_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAL0050010Struct.getl_PRD_DUE_DATE())).append("</span>'");
 AL0050010view1_DB.append(",").append("'<span id=\"expj-AL0050010-AL0050010view1-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AL0050010-AL0050010view1-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAL0050010Struct.getl_ODR_QTY())).append("</span>'");
 AL0050010view1_DB.append(",").append("'<span id=\"expj-AL0050010-AL0050010view1-l_CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-AL0050010-AL0050010view1-l_CUST_CD\" data-name=\"l_CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0050010Struct.getl_CUST_CD())).append("</span>'");
 AL0050010view1_DB.append(",").append("'<span id=\"expj-AL0050010-AL0050010view1-l_LOAD_PLAN_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AL0050010-AL0050010view1-l_LOAD_PLAN_COMMENT\" data-name=\"l_LOAD_PLAN_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0050010Struct.getl_LOAD_PLAN_COMMENT())).append("</span>'");
 AL0050010view1_DB.append(",").append("'<span id=\"expj-AL0050010-AL0050010view1-l_h_LOAD_PLAN_CD-").append(loopCount).append("\" class=\"expj-label expj-AL0050010-AL0050010view1-l_h_LOAD_PLAN_CD\" data-name=\"l_h_LOAD_PLAN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0050010Struct.getl_h_LOAD_PLAN_CD())).append("</span>'");
 AL0050010view1_DB.append(",").append("'<span id=\"expj-AL0050010-AL0050010view1-l_h_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AL0050010-AL0050010view1-l_h_MODIFY_COUNT\" data-name=\"l_h_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAL0050010Struct.getl_h_MODIFY_COUNT())).append("</span>'");
 AL0050010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAL0050010StructLength) {
   AL0050010view1_DB.append(",");
  }
 }
 aAL0050010Struct = structBackup;
 viewIdList.add(AL0050010view1_Id);
 viewSelectList.add(AL0050010view1_select);
 viewResizeList.add(AL0050010view1_resize);
 viewScrollList.add(AL0050010view1_scroll);
 viewHeaderDataList.add(AL0050010view1_HB);
 viewBodyDataList.add(AL0050010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:525px;"><script class="expj-script-AL0050010-AL0050010button2">
expj.AL0050010.AL0050010button2 = {};
expj.AL0050010.AL0050010button2.executeAllOnDecision = function () {
  console.log('execute AL0050010button2.onDecision');
};
expj.AL0050010.AL0050010button2.executeOnLoad = function () {
  expj.AL0050010.AL0050010button2.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button2.executePScriptOnLoad = function () {
  console.log('execute AL0050010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0050010-AL0050010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:525px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0050010-AL0050010button2-LineInsert">
expj.AL0050010.AL0050010button2.LineInsert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AL0050010form1/*,_AL0050010view1/+@AL0050010Servlet"
expj.AL0050010.AL0050010button2.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050010button2', '_AL0050010form1/*,_AL0050010view1/+', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.changeBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AL0050010.AL0050010button2.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010button2.LineInsert['onClick' + i])) {
        expj.AL0050010.AL0050010button2.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010button2.LineInsert.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010button2.LineInsert.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010button2-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010button2', 'LineInsert', this, 'Button');
    }
  });
  expj.AL0050010.AL0050010button2.LineInsert.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button2.LineInsert.executePScriptOnLoad = function () {
  console.log('execute AL0050010button2/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010button2-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050010button2-LineInsert" name="LineInsert" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010button2-LineUpdate">
expj.AL0050010.AL0050010button2.LineUpdate = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AL0050010form1/*,_AL0050010view1/+@AL0050010Servlet"
expj.AL0050010.AL0050010button2.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050010button2', '_AL0050010form1/*,_AL0050010view1/+', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.changeBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AL0050010.AL0050010button2.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010button2.LineUpdate['onClick' + i])) {
        expj.AL0050010.AL0050010button2.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010button2.LineUpdate.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010button2.LineUpdate.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010button2-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010button2', 'LineUpdate', this, 'Button');
    }
  });
  expj.AL0050010.AL0050010button2.LineUpdate.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button2.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute AL0050010button2/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010button2-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050010button2-LineUpdate" name="LineUpdate" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010button2-LineCopy">
expj.AL0050010.AL0050010button2.LineCopy = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AL0050010form1/*,_AL0050010view1/+@AL0050010Servlet"
expj.AL0050010.AL0050010button2.LineCopy.onClick0 = function () {
  console.log('LineCopy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050010button2', '_AL0050010form1/*,_AL0050010view1/+', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.changeBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AL0050010.AL0050010button2.LineCopy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010button2.LineCopy['onClick' + i])) {
        expj.AL0050010.AL0050010button2.LineCopy['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010button2.LineCopy.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010button2.LineCopy.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010button2-LineCopy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010button2', 'LineCopy', this, 'Button');
    }
  });
  expj.AL0050010.AL0050010button2.LineCopy.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button2.LineCopy.executePScriptOnLoad = function () {
  console.log('execute AL0050010button2/LineCopy.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010button2-LineCopy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050010button2-LineCopy" name="LineCopy" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010button2-LineDelete">
expj.AL0050010.AL0050010button2.LineDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0050010form1/*,_AL0050010view1/+@AL0050010Servlet,,$ZZ07004"
expj.AL0050010.AL0050010button2.LineDelete.onClick0 = function () {
  console.log('LineDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050010button2', '_AL0050010form1/*,_AL0050010view1/+', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.updateBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callConfirm('AL0050010', 'AL0050010button2', 'ZZ07004', okEvent);
};
expj.AL0050010.AL0050010button2.LineDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010button2.LineDelete['onClick' + i])) {
        expj.AL0050010.AL0050010button2.LineDelete['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010button2.LineDelete.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010button2.LineDelete.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010button2-LineDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010button2', 'LineDelete', this, 'Button');
    }
  });
  expj.AL0050010.AL0050010button2.LineDelete.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button2.LineDelete.executePScriptOnLoad = function () {
  console.log('execute AL0050010button2/LineDelete.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010button2-LineDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050010button2-LineDelete" name="LineDelete" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010button2-DeleteAll">
expj.AL0050010.AL0050010button2.DeleteAll = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0050010form1/*@AL0050010Servlet,,$ZZ07014"
expj.AL0050010.AL0050010button2.DeleteAll.onClick0 = function () {
  console.log('DeleteAll script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050010button2', '_AL0050010form1/*', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.updateBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callConfirm('AL0050010', 'AL0050010button2', 'ZZ07014', okEvent);
};
expj.AL0050010.AL0050010button2.DeleteAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010button2.DeleteAll['onClick' + i])) {
        expj.AL0050010.AL0050010button2.DeleteAll['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010button2.DeleteAll.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010button2.DeleteAll.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010button2-DeleteAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010button2', 'DeleteAll', this, 'Button');
    }
  });
  expj.AL0050010.AL0050010button2.DeleteAll.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button2.DeleteAll.executePScriptOnLoad = function () {
  console.log('execute AL0050010button2/DeleteAll.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010button2-DeleteAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050010button2-DeleteAll" name="DeleteAll" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAll",rb)%></button><!-- 全削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 609px);"></div><!--/td-->
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
<span class="version">AL0050010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AL0050010-AL0050010button0">
expj.AL0050010.AL0050010button0 = {};
expj.AL0050010.AL0050010button0.executeAllOnDecision = function () {
  console.log('execute AL0050010button0.onDecision');
};
expj.AL0050010.AL0050010button0.executeOnLoad = function () {
  expj.AL0050010.AL0050010button0.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button0.executePScriptOnLoad = function () {
  console.log('execute AL0050010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0050010-AL0050010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0050010-AL0050010button0-LoadCulculate">
expj.AL0050010.AL0050010button0.LoadCulculate = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AL0050010form1/*,_AL0050010view1/*@AL0050010Servlet,,$ZZ07010"
expj.AL0050010.AL0050010button0.LoadCulculate.onClick0 = function () {
  console.log('LoadCulculate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050010button0', '_AL0050010form1/*,_AL0050010view1/*', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.updateBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callConfirm('AL0050010', 'AL0050010button0', 'ZZ07010', okEvent);
};
expj.AL0050010.AL0050010button0.LoadCulculate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010button0.LoadCulculate['onClick' + i])) {
        expj.AL0050010.AL0050010button0.LoadCulculate['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010button0.LoadCulculate.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010button0.LoadCulculate.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010button0-LoadCulculate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010button0', 'LoadCulculate', this, 'Button');
    }
  });
  expj.AL0050010.AL0050010button0.LoadCulculate.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button0.LoadCulculate.executePScriptOnLoad = function () {
  console.log('execute AL0050010button0/LoadCulculate.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010button0-LoadCulculate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050010button0-LoadCulculate" name="LoadCulculate" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLoadCulculate",rb)%></button><!-- 負荷計算ボタン --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010button0-Clear">
expj.AL0050010.AL0050010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AL0050010Servlet,,$ZZ07008"
expj.AL0050010.AL0050010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050010button0', '', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.updateBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callConfirm('AL0050010', 'AL0050010button0', 'ZZ07008', okEvent);
};
expj.AL0050010.AL0050010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010button0.Clear['onClick' + i])) {
        expj.AL0050010.AL0050010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010button0.Clear.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010button0.Clear.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010button0', 'Clear', this, 'Button');
    }
  });
  expj.AL0050010.AL0050010button0.Clear.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AL0050010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050010button0-Clear" name="Clear" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050010button0-Close">
expj.AL0050010.AL0050010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AL0050010.AL0050010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AL0050010');
};
expj.AL0050010.AL0050010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050010button0.Close['onClick' + i])) {
        expj.AL0050010.AL0050010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050010button0.Close.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050010button0.Close.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050010button0', 'Close', this, 'Button');
    }
  });
  expj.AL0050010.AL0050010button0.Close.executePScriptOnLoad();
};

expj.AL0050010.AL0050010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AL0050010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050010button0-Close" name="Close" class="AL0050010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AL0050010 (END)-->
<%
  MessageStruct msgStruct = aAL0050010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AL0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AL0050010)) {
  expj.common.treeInstanceMap.AL0050010 = {};
}
expj.common.treeInstanceMap.AL0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AL0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AL0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AL0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AL0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AL0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AL0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AL0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AL0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AL0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AL0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0050010)) {
  expj.common.detailDialogMap.AL0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AL0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.AL0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AL0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AL0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AL0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AL0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AL0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AL0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AL0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AL0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AL0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AL0050010)) {
  expj.common.viewInstanceMap.AL0050010 = {};
}
expj.common.viewInstanceMap.AL0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.AL0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AL0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AL0050010.<%=viewId %>.init = function () {
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
    expj.AL0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AL0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AL0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AL0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AL0050010_init">
/**
 * AL0050010用のロード完了時初期化関数
 */
expj.AL0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AL0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AL0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AL0050010');
  expj.common.calendarInstanceMap.AL0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AL0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AL0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AL0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AL0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AL0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AL0050010-<%=detailId %>');
<%
 }
%>
  try{expj.AL0050010.AL0050010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010form1.PRD_DUE_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010form1.CalendarPrdDueDateFrom.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010form1.PRD_DUE_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010form1.CalendarPrdDueDateTo.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button2.LineInsert.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button2.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button2.LineCopy.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button2.LineDelete.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button2.DeleteAll.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button0.LoadCulculate.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010form1.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button1.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010view1.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button2.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AL0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AL0050010', 'AL0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AL0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AL0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.AL0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AL0050010', '<%=request.getContextPath() %>');
};

/**
 * AL0050010の全体onDecision処理
 */
expj.AL0050010.executeAllOnDecision = function () {
  expj.AL0050010.AL0050010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AL0050010_console">
expj.AL0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>