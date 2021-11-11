<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:52:21 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DD0030\DD0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DD0030.*" %>
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
<jsp:useBean id="aDD0030010Control" class="com.nec.jp.orteus.metamorBase.DD0030.DD0030010Control" scope="request"/>
<jsp:useBean id="aDD0030010Struct" class="com.nec.jp.orteus.metamorBase.DD0030.DD0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

標準原価計算書出力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0030/jsp/DD0030010.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $　$Date: 2017/02/22 02:06:49 $
********************************************************* --%>
<html>
<head>
<title>標準原価計算書出力</title>
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
<script class="expj-script-DD0030010_init">
  // DD0030010名前空間
  expj.DD0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-DD0030010" data-screen="DD0030010" data-newdata="<%=aDD0030010Control.isNewData() %>">
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
              <script class="expj-script-DD0030010-DD0030010form1">
expj.DD0030010.DD0030010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.DD0030010.DD0030010form1.onLoad0 = function () {
  console.log('DD0030010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DD0030010.DD0030010form1.onDecision0 = function () {
  console.log('DD0030010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DD0030010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DD0030010button1/Select,_DD0030010button0/Print"
expj.DD0030010.DD0030010form1.child0 = function () {
  console.log('DD0030010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DD0030010', 'DD0030010form1', '_DD0030010button1/Select');
expj.common.pscript.setUnMaskToReferenceComponent('DD0030010', 'DD0030010form1', '_DD0030010button0/Print');
};
// script4="child;1;MASK;_DD0030010button1/Select,_DD0030010button0/Print"
expj.DD0030010.DD0030010form1.child1 = function () {
  console.log('DD0030010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DD0030010', 'DD0030010form1', '_DD0030010button1/Select');
expj.common.pscript.setMaskToReferenceComponent('DD0030010', 'DD0030010form1', '_DD0030010button0/Print');
};
// script5="onDecision;1;CHK;?PLANT_CD[eq]SAME[and]?YEAR[eq]SAME[and]?HALF_TERM_TYP[eq]SAME[and]?ROOT_ITEM_CD[eq]SAME[and]?CLASIFICATION_CD[eq]SAME[and]?DD0030010form1/*[eq]NORMAL@*2,*3"
expj.DD0030010.DD0030010form1.onDecision1 = function () {
  console.log('DD0030010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?YEAR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?HALF_TERM_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?ROOT_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?CLASIFICATION_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?DD0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_DD0030010button2/CheckAll,_DD0030010button2/CheckClear"
expj.DD0030010.DD0030010form1.child2 = function () {
  console.log('DD0030010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('DD0030010', 'DD0030010form1', '_DD0030010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('DD0030010', 'DD0030010form1', '_DD0030010button2/CheckClear');
};
// script7="child;3;MASK;_DD0030010button2/CheckAll,_DD0030010button2/CheckClear"
expj.DD0030010.DD0030010form1.child3 = function () {
  console.log('DD0030010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('DD0030010', 'DD0030010form1', '_DD0030010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('DD0030010', 'DD0030010form1', '_DD0030010button2/CheckClear');
};
// script8="onDecision;2;CHK;?PLANT_CD[eq]SAME[and]?YEAR[eq]SAME[and]?HALF_TERM_TYP[eq]SAME[and]?ROOT_ITEM_CD[eq]SAME[and]?CLASIFICATION_CD[eq]SAME@*4,*6"
expj.DD0030010.DD0030010form1.onDecision2 = function () {
  console.log('DD0030010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?YEAR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?HALF_TERM_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?ROOT_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?CLASIFICATION_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;4;CHK;?DD0030010form1/*[eq]NORMAL@*5,*6"
expj.DD0030010.DD0030010form1.child4 = function () {
  console.log('DD0030010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '?DD0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;UNMASK;_DD0030010button0/CsvOut"
expj.DD0030010.DD0030010form1.child5 = function () {
  console.log('DD0030010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('DD0030010', 'DD0030010form1', '_DD0030010button0/CsvOut');
};
// script11="child;6;MASK;_DD0030010button0/CsvOut"
expj.DD0030010.DD0030010form1.child6 = function () {
  console.log('DD0030010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('DD0030010', 'DD0030010form1', '_DD0030010button0/CsvOut');
};
expj.DD0030010.DD0030010form1.executeAllOnDecision = function () {
  console.log('execute DD0030010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0030010.DD0030010form1['onDecision' + i])) {
        expj.DD0030010.DD0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.DD0030010.DD0030010form1.executeOnLoad = function () {
  expj.DD0030010.DD0030010form1.executePScriptOnLoad();
};

expj.DD0030010.DD0030010form1.executePScriptOnLoad = function () {
  console.log('execute DD0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DD0030010.DD0030010form1['onLoad' + i])) {
      expj.DD0030010.DD0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DD0030010-DD0030010form1" action="DD0030010Servlet" name="DD0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDD0030010Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010form1-PLANT_CD">
expj.DD0030010.DD0030010form1.PLANT_CD = {};
expj.DD0030010.DD0030010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DD0030010form1/PLANT_CD.onDecision');
  expj.DD0030010.DD0030010form1.executeAllOnDecision();
  expj.DD0030010.executeAllOnDecision();
};
expj.DD0030010.DD0030010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0030010', 'DD0030010form1', 'PLANT_CD', this);
  });
  expj.DD0030010.DD0030010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DD0030010.DD0030010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DD0030010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DD0030010-DD0030010form1-PLANT_CD" name="PLANT_CD" class="DD0030010-focus-move  required-value expj-DD0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDD0030010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010form1-PeekerPlantCd">
expj.DD0030010.DD0030010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DD0030010form1/PLANT_CD:_DD0030010form1/PLANT_NAME@<%=contextNo%>"
expj.DD0030010.DD0030010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DD0030010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DD0030010form1/PLANT_CD:_DD0030010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DD0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DD0030010.DD0030010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0030010.DD0030010form1.PeekerPlantCd['onClick' + i])) {
        expj.DD0030010.DD0030010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DD0030010.DD0030010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DD0030010.DD0030010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0030010', 'DD0030010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DD0030010.DD0030010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DD0030010.DD0030010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DD0030010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DD0030010-DD0030010form1-PeekerPlantCd" class="DD0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010form1-PLANT_NAME">
expj.DD0030010.DD0030010form1.PLANT_NAME = {};
expj.DD0030010.DD0030010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DD0030010form1/PLANT_NAME.onDecision');
  expj.DD0030010.DD0030010form1.executeAllOnDecision();
  expj.DD0030010.executeAllOnDecision();
};
expj.DD0030010.DD0030010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0030010', 'DD0030010form1', 'PLANT_NAME', this);
  });
  expj.DD0030010.DD0030010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DD0030010.DD0030010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DD0030010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DD0030010-DD0030010form1-PLANT_NAME" name="PLANT_NAME" class="DD0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDD0030010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.YEAR",rb)%></span><!-- 年度 --></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010form1-YEAR">
expj.DD0030010.DD0030010form1.YEAR = {};
expj.DD0030010.DD0030010form1.YEAR.executeAllOnDecision = function () {
  console.log('execute DD0030010form1/YEAR.onDecision');
  expj.DD0030010.DD0030010form1.executeAllOnDecision();
  expj.DD0030010.executeAllOnDecision();
};
expj.DD0030010.DD0030010form1.YEAR.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010form1-YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0030010', 'DD0030010form1', 'YEAR', this);
  });
  expj.DD0030010.DD0030010form1.YEAR.executePScriptOnLoad();
};

expj.DD0030010.DD0030010form1.YEAR.executePScriptOnLoad = function () {
  console.log('execute DD0030010form1/YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010form1-YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DD0030010-DD0030010form1-YEAR" name="YEAR" class="DD0030010-focus-move expj-align-right required-value expj-DD0030010-required-A" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDD0030010Struct.getYEAR()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HALF_TERM_TYP",rb)%></span><!-- 半期区分 --></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010form1-HALF_TERM_TYP">
expj.DD0030010.DD0030010form1.HALF_TERM_TYP = {};
expj.DD0030010.DD0030010form1.HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DD0030010form1/HALF_TERM_TYP.onDecision');
  expj.DD0030010.DD0030010form1.executeAllOnDecision();
  expj.DD0030010.executeAllOnDecision();
};
expj.DD0030010.DD0030010form1.HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010form1-HALF_TERM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DD0030010', 'DD0030010form1', 'HALF_TERM_TYP', this);
  });
  expj.DD0030010.DD0030010form1.HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DD0030010.DD0030010form1.HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DD0030010form1/HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010form1-HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DD0030010-DD0030010form1-HALF_TERM_TYP" name='HALF_TERM_TYP' class='DD0030010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDD0030010Control.getStruct().getList_HALF_TERM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDD0030010Control.getStruct().getList_HALF_TERM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDD0030010Control.getStruct().getList_HALF_TERM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDD0030010Struct.getHALF_TERM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ROOT_ITEM_CD",rb)%></span><!-- 最上位品目番号 --></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010form1-ROOT_ITEM_CD">
expj.DD0030010.DD0030010form1.ROOT_ITEM_CD = {};
expj.DD0030010.DD0030010form1.ROOT_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute DD0030010form1/ROOT_ITEM_CD.onDecision');
  expj.DD0030010.DD0030010form1.executeAllOnDecision();
  expj.DD0030010.executeAllOnDecision();
};
expj.DD0030010.DD0030010form1.ROOT_ITEM_CD.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010form1-ROOT_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0030010', 'DD0030010form1', 'ROOT_ITEM_CD', this);
  });
  expj.DD0030010.DD0030010form1.ROOT_ITEM_CD.executePScriptOnLoad();
};

expj.DD0030010.DD0030010form1.ROOT_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute DD0030010form1/ROOT_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010form1-ROOT_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DD0030010-DD0030010form1-ROOT_ITEM_CD" name="ROOT_ITEM_CD" class="DD0030010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aDD0030010Struct.getROOT_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CLASIFICATION_CD_1",rb)%></span><!-- 品目管理コード --></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010form1-CLASIFICATION_CD">
expj.DD0030010.DD0030010form1.CLASIFICATION_CD = {};
expj.DD0030010.DD0030010form1.CLASIFICATION_CD.executeAllOnDecision = function () {
  console.log('execute DD0030010form1/CLASIFICATION_CD.onDecision');
  expj.DD0030010.DD0030010form1.executeAllOnDecision();
  expj.DD0030010.executeAllOnDecision();
};
expj.DD0030010.DD0030010form1.CLASIFICATION_CD.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010form1-CLASIFICATION_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0030010', 'DD0030010form1', 'CLASIFICATION_CD', this);
  });
  expj.DD0030010.DD0030010form1.CLASIFICATION_CD.executePScriptOnLoad();
};

expj.DD0030010.DD0030010form1.CLASIFICATION_CD.executePScriptOnLoad = function () {
  console.log('execute DD0030010form1/CLASIFICATION_CD.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010form1-CLASIFICATION_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DD0030010-DD0030010form1-CLASIFICATION_CD" name="CLASIFICATION_CD" class="DD0030010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aDD0030010Struct.getCLASIFICATION_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-DD0030010-DD0030010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDD0030010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-DD0030010-DD0030010form1-DOWNLOAD_FILE">
expj.DD0030010.DD0030010form1.DOWNLOAD_FILE = {};
expj.DD0030010.DD0030010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute DD0030010form1/DOWNLOAD_FILE.onDecision');
  expj.DD0030010.DD0030010form1.executeAllOnDecision();
  expj.DD0030010.executeAllOnDecision();
};
expj.DD0030010.DD0030010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0030010', 'DD0030010form1', 'DOWNLOAD_FILE', this);
  });
  expj.DD0030010.DD0030010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.DD0030010.DD0030010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute DD0030010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010form1-DOWNLOAD_FILE');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DD0030010-DD0030010button1">
expj.DD0030010.DD0030010button1 = {};
expj.DD0030010.DD0030010button1.executeAllOnDecision = function () {
  console.log('execute DD0030010button1.onDecision');
};
expj.DD0030010.DD0030010button1.executeOnLoad = function () {
  expj.DD0030010.DD0030010button1.executePScriptOnLoad();
};

expj.DD0030010.DD0030010button1.executePScriptOnLoad = function () {
  console.log('execute DD0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DD0030010-DD0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DD0030010-DD0030010button1-Select">
expj.DD0030010.DD0030010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DD0030010form1/*@DD0030010Servlet"
expj.DD0030010.DD0030010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DD0030010', 'DD0030010button1', '_DD0030010form1/*', 'DD0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DD0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DD0030010', response);
expj.common.updateBusinessScreenTab('DD0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DD0030010.DD0030010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0030010.DD0030010button1.Select['onClick' + i])) {
        expj.DD0030010.DD0030010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DD0030010.DD0030010button1.Select.executeAllOnDecision = function () {
};
expj.DD0030010.DD0030010button1.Select.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0030010', 'DD0030010button1', 'Select', this, 'Button');
    }
  });
  expj.DD0030010.DD0030010button1.Select.executePScriptOnLoad();
};

expj.DD0030010.DD0030010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DD0030010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0030010-DD0030010button1-Select" name="Select" class="DD0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-DD0030010-DD0030010view1">
expj.DD0030010.DD0030010view1 = {};
expj.DD0030010.DD0030010view1.executeAllOnClick = function () {
};
expj.DD0030010.DD0030010view1.executeAllOnDecision = function () {
  console.log('execute DD0030010view1.onDecision');
};
expj.DD0030010.DD0030010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("DD0030010view1", "expj.DD0030010.DD0030010view1.executeAllOnClick");
%>
  expj.DD0030010.DD0030010view1.executePScriptOnLoad();
};

expj.DD0030010.DD0030010view1.executePScriptOnLoad = function () {
  console.log('execute DD0030010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-DD0030010-DD0030010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String DD0030010view1_Id = "DD0030010view1";
 String DD0030010view1_select = "single";
 String DD0030010view1_sortable = "true";
 String DD0030010view1_resize = "true";
 String DD0030010view1_scroll = "true";
 StringBuffer DD0030010view1_HB = new StringBuffer();
 StringBuffer DD0030010view1_DB = new StringBuffer();
%>
<%
 DD0030010view1_select = "multi";
 DD0030010view1_sortable = "true";
 DD0030010view1_resize = "true";
 DD0030010view1_scroll = "true";
%>
<%
 DD0030010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
%>
     
<%
DD0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ROOT_ITEM_CD",rb))).append("', 'name':'l_ROOT_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ROOT_ITEM_NAME",rb))).append("', 'name':'l_ROOT_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NECESSARY_QTY",rb))).append("', 'name':'l_NECESSARY_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_INPUT_RATIO",rb))).append("', 'name':'l_ITEM_INPUT_RATIO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_COST",rb))).append("', 'name':'l_TOTAL_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_MATR_COST",rb))).append("', 'name':'l_TOTAL_MATR_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_SBCNT_MATR_COST",rb))).append("', 'name':'l_TOTAL_SBCNT_MATR_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_PROC_COST_SUM_ALL",rb))).append("', 'name':'l_TOTAL_PROC_COST_SUM_ALL', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_UNIT",rb))).append("', 'name':'l_HOME_CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CLASIFICATION_CD_1",rb))).append("', 'name':'l_CLASIFICATION_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CS_PROC_CD",rb))).append("', 'name':'l_CS_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
DD0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CS_PROC_NAME",rb))).append("', 'name':'l_CS_PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DD0030010view1_sortable).append("}").append(",");
%>
<%
 int aDD0030010StructLength = aDD0030010Control.getListsize();
 final DD0030010Struct structBackup = aDD0030010Struct;
 aDD0030010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aDD0030010StructLength; ++loopCount) {
  if((aDD0030010Struct = (DD0030010Struct) aDD0030010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aDD0030010Struct", aDD0030010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 DD0030010view1_DB.append("[");
 DD0030010view1_DB.append(loopCount);
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_ROOT_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_ROOT_ITEM_CD\" data-name=\"l_ROOT_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_ROOT_ITEM_CD())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_ROOT_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_ROOT_ITEM_NAME\" data-name=\"l_ROOT_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_ROOT_ITEM_NAME())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_NECESSARY_QTY-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_NECESSARY_QTY\" data-name=\"l_NECESSARY_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_NECESSARY_QTY())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_STOCK_UNIT())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_ITEM_INPUT_RATIO-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_ITEM_INPUT_RATIO\" data-name=\"l_ITEM_INPUT_RATIO\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_ITEM_INPUT_RATIO())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_TOTAL_COST-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_TOTAL_COST\" data-name=\"l_TOTAL_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_TOTAL_COST())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_TOTAL_MATR_COST-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_TOTAL_MATR_COST\" data-name=\"l_TOTAL_MATR_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_TOTAL_MATR_COST())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_TOTAL_SBCNT_MATR_COST-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_TOTAL_SBCNT_MATR_COST\" data-name=\"l_TOTAL_SBCNT_MATR_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_TOTAL_SBCNT_MATR_COST())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_TOTAL_PROC_COST_SUM_ALL-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_TOTAL_PROC_COST_SUM_ALL\" data-name=\"l_TOTAL_PROC_COST_SUM_ALL\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_TOTAL_PROC_COST_SUM_ALL())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_HOME_CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_HOME_CUR_UNIT\" data-name=\"l_HOME_CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_HOME_CUR_UNIT())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_CLASIFICATION_CD-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_CLASIFICATION_CD\" data-name=\"l_CLASIFICATION_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_CLASIFICATION_CD())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_CS_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_CS_PROC_CD\" data-name=\"l_CS_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_CS_PROC_CD())).append("</span>'");
 DD0030010view1_DB.append(",").append("'<span id=\"expj-DD0030010-DD0030010view1-l_CS_PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-DD0030010-DD0030010view1-l_CS_PROC_NAME\" data-name=\"l_CS_PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aDD0030010Struct.getl_CS_PROC_NAME())).append("</span>'");
 DD0030010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aDD0030010StructLength) {
   DD0030010view1_DB.append(",");
  }
 }
 aDD0030010Struct = structBackup;
 viewIdList.add(DD0030010view1_Id);
 viewSelectList.add(DD0030010view1_select);
 viewResizeList.add(DD0030010view1_resize);
 viewScrollList.add(DD0030010view1_scroll);
 viewHeaderDataList.add(DD0030010view1_HB);
 viewBodyDataList.add(DD0030010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-DD0030010-DD0030010button2">
expj.DD0030010.DD0030010button2 = {};
expj.DD0030010.DD0030010button2.executeAllOnDecision = function () {
  console.log('execute DD0030010button2.onDecision');
};
expj.DD0030010.DD0030010button2.executeOnLoad = function () {
  expj.DD0030010.DD0030010button2.executePScriptOnLoad();
};

expj.DD0030010.DD0030010button2.executePScriptOnLoad = function () {
  console.log('execute DD0030010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DD0030010-DD0030010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DD0030010-DD0030010button2-CheckAll">
expj.DD0030010.DD0030010button2.CheckAll = {};
// script1="onClick;0;DGSALL;DD0030010view1"
expj.DD0030010.DD0030010button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('DD0030010', 'DD0030010view1');
};
expj.DD0030010.DD0030010button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0030010.DD0030010button2.CheckAll['onClick' + i])) {
        expj.DD0030010.DD0030010button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.DD0030010.DD0030010button2.CheckAll.executeAllOnDecision = function () {
};
expj.DD0030010.DD0030010button2.CheckAll.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0030010', 'DD0030010button2', 'CheckAll', this, 'Button');
    }
  });
  expj.DD0030010.DD0030010button2.CheckAll.executePScriptOnLoad();
};

expj.DD0030010.DD0030010button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute DD0030010button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0030010-DD0030010button2-CheckAll" name="CheckAll" class="DD0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010button2-CheckClear">
expj.DD0030010.DD0030010button2.CheckClear = {};
// script1="onClick;0;DGSCANCEL;DD0030010view1"
expj.DD0030010.DD0030010button2.CheckClear.onClick0 = function () {
  console.log('CheckClear script1');
expj.common.pscript.unselectVIEWAllRow('DD0030010', 'DD0030010view1');
};
expj.DD0030010.DD0030010button2.CheckClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0030010.DD0030010button2.CheckClear['onClick' + i])) {
        expj.DD0030010.DD0030010button2.CheckClear['onClick' + i]();
      }
    }
  }
};
expj.DD0030010.DD0030010button2.CheckClear.executeAllOnDecision = function () {
};
expj.DD0030010.DD0030010button2.CheckClear.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010button2-CheckClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0030010', 'DD0030010button2', 'CheckClear', this, 'Button');
    }
  });
  expj.DD0030010.DD0030010button2.CheckClear.executePScriptOnLoad();
};

expj.DD0030010.DD0030010button2.CheckClear.executePScriptOnLoad = function () {
  console.log('execute DD0030010button2/CheckClear.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010button2-CheckClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0030010-DD0030010button2-CheckClear" name="CheckClear" class="DD0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 410px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">DD0030010 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-DD0030010-DD0030010button0">
expj.DD0030010.DD0030010button0 = {};
expj.DD0030010.DD0030010button0.executeAllOnDecision = function () {
  console.log('execute DD0030010button0.onDecision');
};
expj.DD0030010.DD0030010button0.executeOnLoad = function () {
  expj.DD0030010.DD0030010button0.executePScriptOnLoad();
};

expj.DD0030010.DD0030010button0.executePScriptOnLoad = function () {
  console.log('execute DD0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DD0030010-DD0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DD0030010-DD0030010button0-Print">
expj.DD0030010.DD0030010button0.Print = {};
// script1="onClick;0;CHK;?DD0030010form1/*[eq]NORMAL@*0,*2"
expj.DD0030010.DD0030010button0.Print.onClick0 = function () {
  console.log('Print script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010button0', '?DD0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script2="child;0;CHK;?DD0030010form1/PLANT_CD[eq]SAME[and]?DD0030010form1/YEAR[eq]SAME[and]?DD0030010form1/HALF_TERM_TYP[eq]SAME[and]?DD0030010form1/ROOT_ITEM_CD[eq]SAME[and]?DD0030010form1/CLASIFICATION_CD[eq]SAME@*1,*2"
expj.DD0030010.DD0030010button0.Print.child0 = function () {
  console.log('Print script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010button0', '?DD0030010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010button0', '?DD0030010form1/YEAR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010button0', '?DD0030010form1/HALF_TERM_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010button0', '?DD0030010form1/ROOT_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010button0', '?DD0030010form1/CLASIFICATION_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;CHK;?DD0030010view1/?[eq]NOT_SELECTED@*3,*4"
expj.DD0030010.DD0030010button0.Print.child1 = function () {
  console.log('Print script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0030010', 'DD0030010button0', '?DD0030010view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script4="child;2;PRINTER;ORTEUS_HASHED=<%=hashed%>,_DD0030010form1/*@DD0030010Servlet:C,M,M"
expj.DD0030010.DD0030010button0.Print.child2 = function () {
  console.log('Print script4');
expj.common.pscript.viewPrinterDialog('DD0030010', 'DD0030010button0', '_DD0030010form1/*', 'DD0030010Servlet', 'C,M,M');
};
// script5="child;3;PRINTER;ORTEUS_HASHED=<%=hashed%>,_DD0030010form1/*,_DD0030010view1/*@DD0030010Servlet:U,C,M"
expj.DD0030010.DD0030010button0.Print.child3 = function () {
  console.log('Print script5');
expj.common.pscript.viewPrinterDialog('DD0030010', 'DD0030010button0', '_DD0030010form1/*,_DD0030010view1/*', 'DD0030010Servlet', 'U,C,M');
};
// script6="child;4;PRINTER;ORTEUS_HASHED=<%=hashed%>,_DD0030010form1/*,_DD0030010view1/#@DD0030010Servlet:U,U,C"
expj.DD0030010.DD0030010button0.Print.child4 = function () {
  console.log('Print script6');
expj.common.pscript.viewPrinterDialog('DD0030010', 'DD0030010button0', '_DD0030010form1/*,_DD0030010view1/#', 'DD0030010Servlet', 'U,U,C');
};
expj.DD0030010.DD0030010button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0030010.DD0030010button0.Print['onClick' + i])) {
        expj.DD0030010.DD0030010button0.Print['onClick' + i]();
      }
    }
  }
};
expj.DD0030010.DD0030010button0.Print.executeAllOnDecision = function () {
};
expj.DD0030010.DD0030010button0.Print.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0030010', 'DD0030010button0', 'Print', this, 'Button');
    }
  });
  expj.DD0030010.DD0030010button0.Print.executePScriptOnLoad();
};

expj.DD0030010.DD0030010button0.Print.executePScriptOnLoad = function () {
  console.log('execute DD0030010button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0030010-DD0030010button0-Print" name="Print" class="DD0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 帳票出力ボタン --></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010button0-CsvOut">
expj.DD0030010.DD0030010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DD0030010form1/*@DD0030010Servlet,,$ZZ07011"
expj.DD0030010.DD0030010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DD0030010', 'DD0030010button0', '_DD0030010form1/*', 'DD0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DD0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DD0030010', response);
expj.common.updateBusinessScreenTab('DD0030010', contents);
};
expj.common.pscript.callConfirm('DD0030010', 'DD0030010button0', 'ZZ07011', okEvent);
};
expj.DD0030010.DD0030010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0030010.DD0030010button0.CsvOut['onClick' + i])) {
        expj.DD0030010.DD0030010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.DD0030010.DD0030010button0.CsvOut.executeAllOnDecision = function () {
};
expj.DD0030010.DD0030010button0.CsvOut.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0030010', 'DD0030010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.DD0030010.DD0030010button0.CsvOut.executePScriptOnLoad();
};

expj.DD0030010.DD0030010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute DD0030010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0030010-DD0030010button0-CsvOut" name="CsvOut" class="DD0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010button0-Clear">
expj.DD0030010.DD0030010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DD0030010Servlet,,$ZZ07008"
expj.DD0030010.DD0030010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DD0030010', 'DD0030010button0', '', 'DD0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DD0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DD0030010', response);
expj.common.updateBusinessScreenTab('DD0030010', contents);
};
expj.common.pscript.callConfirm('DD0030010', 'DD0030010button0', 'ZZ07008', okEvent);
};
expj.DD0030010.DD0030010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0030010.DD0030010button0.Clear['onClick' + i])) {
        expj.DD0030010.DD0030010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DD0030010.DD0030010button0.Clear.executeAllOnDecision = function () {
};
expj.DD0030010.DD0030010button0.Clear.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0030010', 'DD0030010button0', 'Clear', this, 'Button');
    }
  });
  expj.DD0030010.DD0030010button0.Clear.executePScriptOnLoad();
};

expj.DD0030010.DD0030010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DD0030010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0030010-DD0030010button0-Clear" name="Clear" class="DD0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-DD0030010-DD0030010button0-Close">
expj.DD0030010.DD0030010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DD0030010.DD0030010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DD0030010');
};
expj.DD0030010.DD0030010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0030010.DD0030010button0.Close['onClick' + i])) {
        expj.DD0030010.DD0030010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DD0030010.DD0030010button0.Close.executeAllOnDecision = function () {
};
expj.DD0030010.DD0030010button0.Close.executeOnLoad = function () {
  $('#expj-DD0030010-DD0030010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0030010', 'DD0030010button0', 'Close', this, 'Button');
    }
  });
  expj.DD0030010.DD0030010button0.Close.executePScriptOnLoad();
};

expj.DD0030010.DD0030010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DD0030010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DD0030010-DD0030010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0030010-DD0030010button0-Close" name="Close" class="DD0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DD0030010 (END)-->
<%
MessageStruct msgStruct = aDD0030010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DD0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DD0030010)) {
  expj.common.treeInstanceMap.DD0030010 = {};
}
expj.common.treeInstanceMap.DD0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DD0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DD0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DD0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DD0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DD0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DD0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DD0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DD0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DD0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DD0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0030010)) {
  expj.common.detailDialogMap.DD0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DD0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.DD0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DD0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DD0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DD0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DD0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DD0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DD0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DD0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DD0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DD0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DD0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DD0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DD0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DD0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DD0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DD0030010)) {
  expj.common.viewInstanceMap.DD0030010 = {};
}
expj.common.viewInstanceMap.DD0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.DD0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DD0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DD0030010.<%=viewId %>.init = function () {
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
    expj.DD0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DD0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DD0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DD0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DD0030010_init">
/**
 * DD0030010用のロード完了時初期化関数
 */
expj.DD0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DD0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DD0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DD0030010');
  expj.common.calendarInstanceMap.DD0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DD0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DD0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.DD0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DD0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DD0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DD0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DD0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DD0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DD0030010-<%=detailId %>');
<%
 }
%>
  try{expj.DD0030010.DD0030010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010form1.YEAR.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010form1.HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010form1.ROOT_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010form1.CLASIFICATION_CD.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010button2.CheckClear.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010button0.Print.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010form1.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010button1.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010view1.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010button2.executeOnLoad();}catch(e){};
  try{expj.DD0030010.DD0030010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DD0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DD0030010', 'DD0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DD0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DD0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.DD0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DD0030010', '<%=request.getContextPath() %>');
};

/**
 * DD0030010の全体onDecision処理
 */
expj.DD0030010.executeAllOnDecision = function () {
  expj.DD0030010.DD0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DD0030010_console">
expj.DD0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>