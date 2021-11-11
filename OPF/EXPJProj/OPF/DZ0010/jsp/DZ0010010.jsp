<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:56:50 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DZ0010\DZ0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DZ0010.*" %>
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
<jsp:useBean id="aDZ0010010Control" class="com.nec.jp.orteus.metamorBase.DZ0010.DZ0010010Control" scope="request"/>
<jsp:useBean id="aDZ0010010Struct" class="com.nec.jp.orteus.metamorBase.DZ0010.DZ0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

原価管理パラメータメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DZ0010/jsp/DZ0010010.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:06:53 $
********************************************************* --%>
<html>
<head>
<title>原価管理パラメータメンテナンス</title>
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
<script class="expj-script-DZ0010010_init">
  // DZ0010010名前空間
  expj.DZ0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-DZ0010010" data-screen="DZ0010010" data-newdata="<%=aDZ0010010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px">
      <div class="expj-td" style=""></div><!--/td-->

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
              <script class="expj-script-DZ0010010-DZ0010010form1">
expj.DZ0010010.DZ0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.DZ0010010.DZ0010010form1.onLoad0 = function () {
  console.log('DZ0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DZ0010010.DZ0010010form1.onDecision0 = function () {
  console.log('DZ0010010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DZ0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DZ0010010button1/Select"
expj.DZ0010010.DZ0010010form1.child0 = function () {
  console.log('DZ0010010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DZ0010010', 'DZ0010010form1', '_DZ0010010button1/Select');
};
// script4="child;1;MASK;_DZ0010010button1/Select"
expj.DZ0010010.DZ0010010form1.child1 = function () {
  console.log('DZ0010010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DZ0010010', 'DZ0010010form1', '_DZ0010010button1/Select');
};
// script5="onDecision;1;CHKRQ;A,B@*2,*4"
expj.DZ0010010.DZ0010010form1.onDecision1 = function () {
  console.log('DZ0010010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('DZ0010010', 'A') && expj.common.pscript.satisfiedRequiredComponent('DZ0010010', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;_PLANT_CD[neq]_h_PLANT_CD@*3,*4"
expj.DZ0010010.DZ0010010form1.child2 = function () {
  console.log('DZ0010010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010form1', '_PLANT_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010form1', '_h_PLANT_CD'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_DZ0010010button2/Insert"
expj.DZ0010010.DZ0010010form1.child3 = function () {
  console.log('DZ0010010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('DZ0010010', 'DZ0010010form1', '_DZ0010010button2/Insert');
};
// script8="child;4;MASK;_DZ0010010button2/Insert"
expj.DZ0010010.DZ0010010form1.child4 = function () {
  console.log('DZ0010010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('DZ0010010', 'DZ0010010form1', '_DZ0010010button2/Insert');
};
// script9="onDecision;2;CHK;?DZ0010010form1/*[eq]NORMAL@*5,*8"
expj.DZ0010010.DZ0010010form1.onDecision2 = function () {
  console.log('DZ0010010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010form1', '?DZ0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;5;CHKRQ;A,B@*6,*8"
expj.DZ0010010.DZ0010010form1.child5 = function () {
  console.log('DZ0010010form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('DZ0010010', 'A') && expj.common.pscript.satisfiedRequiredComponent('DZ0010010', 'B')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;6;CHK;_PLANT_CD[eq]_h_PLANT_CD@*7,*8"
expj.DZ0010010.DZ0010010form1.child6 = function () {
  console.log('DZ0010010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010form1', '_PLANT_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010form1', '_h_PLANT_CD'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_DZ0010010button2/Update"
expj.DZ0010010.DZ0010010form1.child7 = function () {
  console.log('DZ0010010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('DZ0010010', 'DZ0010010form1', '_DZ0010010button2/Update');
};
// script13="child;8;MASK;_DZ0010010button2/Update"
expj.DZ0010010.DZ0010010form1.child8 = function () {
  console.log('DZ0010010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('DZ0010010', 'DZ0010010form1', '_DZ0010010button2/Update');
};
expj.DZ0010010.DZ0010010form1.executeAllOnDecision = function () {
  console.log('execute DZ0010010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DZ0010010.DZ0010010form1['onDecision' + i])) {
        expj.DZ0010010.DZ0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.DZ0010010.DZ0010010form1.executeOnLoad = function () {
  expj.DZ0010010.DZ0010010form1.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form1.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DZ0010010.DZ0010010form1['onLoad' + i])) {
      expj.DZ0010010.DZ0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DZ0010010-DZ0010010form1" action="DZ0010010Servlet" name="DZ0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDZ0010010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form1-PLANT_CD">
expj.DZ0010010.DZ0010010form1.PLANT_CD = {};
expj.DZ0010010.DZ0010010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DZ0010010form1/PLANT_CD.onDecision');
  expj.DZ0010010.DZ0010010form1.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form1', 'PLANT_CD', this);
  });
  expj.DZ0010010.DZ0010010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form1-PLANT_CD" name="PLANT_CD" class="DZ0010010-focus-move  required-value expj-DZ0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<input type="hidden" id="expj-DZ0010010-DZ0010010form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.geth_PLANT_CD()) %>">
<script class="expj-script-DZ0010010-DZ0010010form1-h_PLANT_CD">
expj.DZ0010010.DZ0010010form1.h_PLANT_CD = {};
expj.DZ0010010.DZ0010010form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DZ0010010form1/h_PLANT_CD.onDecision');
  expj.DZ0010010.DZ0010010form1.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form1', 'h_PLANT_CD', this);
  });
  expj.DZ0010010.DZ0010010form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form1-h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-DZ0010010-DZ0010010form1-PeekerPlantCd">
expj.DZ0010010.DZ0010010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DZ0010010form1/PLANT_CD:_DZ0010010form1/PLANT_NAME@<%=contextNo%>"
expj.DZ0010010.DZ0010010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DZ0010010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DZ0010010form1/PLANT_CD:_DZ0010010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DZ0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DZ0010010.DZ0010010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DZ0010010.DZ0010010form1.PeekerPlantCd['onClick' + i])) {
        expj.DZ0010010.DZ0010010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DZ0010010.DZ0010010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DZ0010010.DZ0010010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DZ0010010', 'DZ0010010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DZ0010010.DZ0010010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DZ0010010-DZ0010010form1-PeekerPlantCd" class="DZ0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form1-PLANT_NAME">
expj.DZ0010010.DZ0010010form1.PLANT_NAME = {};
expj.DZ0010010.DZ0010010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DZ0010010form1/PLANT_NAME.onDecision');
  expj.DZ0010010.DZ0010010form1.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form1', 'PLANT_NAME', this);
  });
  expj.DZ0010010.DZ0010010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form1-PLANT_NAME" name="PLANT_NAME" class="DZ0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DZ0010010-DZ0010010button1">
expj.DZ0010010.DZ0010010button1 = {};
expj.DZ0010010.DZ0010010button1.executeAllOnDecision = function () {
  console.log('execute DZ0010010button1.onDecision');
};
expj.DZ0010010.DZ0010010button1.executeOnLoad = function () {
  expj.DZ0010010.DZ0010010button1.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010button1.executePScriptOnLoad = function () {
  console.log('execute DZ0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DZ0010010-DZ0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DZ0010010-DZ0010010button1-Select">
expj.DZ0010010.DZ0010010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DZ0010010form1/*@DZ0010010Servlet"
expj.DZ0010010.DZ0010010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DZ0010010', 'DZ0010010button1', '_DZ0010010form1/*', 'DZ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DZ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DZ0010010', response);
expj.common.updateBusinessScreenTab('DZ0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DZ0010010.DZ0010010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DZ0010010.DZ0010010button1.Select['onClick' + i])) {
        expj.DZ0010010.DZ0010010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DZ0010010.DZ0010010button1.Select.executeAllOnDecision = function () {
};
expj.DZ0010010.DZ0010010button1.Select.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DZ0010010', 'DZ0010010button1', 'Select', this, 'Button');
    }
  });
  expj.DZ0010010.DZ0010010button1.Select.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DZ0010010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DZ0010010-DZ0010010button1-Select" name="Select" class="DZ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-DZ0010010-DZ0010010form2">
expj.DZ0010010.DZ0010010form2 = {};
expj.DZ0010010.DZ0010010form2.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2.onDecision');
};
expj.DZ0010010.DZ0010010form2.executeOnLoad = function () {
  expj.DZ0010010.DZ0010010form2.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DZ0010010-DZ0010010form2" action="DZ0010010Servlet" name="DZ0010010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CURRENT_YEAR",rb)%></span><!-- 当年度 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-CURRENT_YEAR">
expj.DZ0010010.DZ0010010form2.CURRENT_YEAR = {};
expj.DZ0010010.DZ0010010form2.CURRENT_YEAR.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/CURRENT_YEAR.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.CURRENT_YEAR.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-CURRENT_YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'CURRENT_YEAR', this);
  });
  expj.DZ0010010.DZ0010010form2.CURRENT_YEAR.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.CURRENT_YEAR.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/CURRENT_YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-CURRENT_YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-CURRENT_YEAR" name="CURRENT_YEAR" class="DZ0010010-focus-move expj-align-right required-value expj-DZ0010010-required-B" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getCURRENT_YEAR()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CURRENT_MONTH",rb)%></span><!-- 当月度 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-CURRENT_MONTH">
expj.DZ0010010.DZ0010010form2.CURRENT_MONTH = {};
expj.DZ0010010.DZ0010010form2.CURRENT_MONTH.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/CURRENT_MONTH.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.CURRENT_MONTH.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-CURRENT_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'CURRENT_MONTH', this);
  });
  expj.DZ0010010.DZ0010010form2.CURRENT_MONTH.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.CURRENT_MONTH.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/CURRENT_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-CURRENT_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-CURRENT_MONTH" name="CURRENT_MONTH" class="DZ0010010-focus-move expj-align-right required-value expj-DZ0010010-required-B" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getCURRENT_MONTH()) %>" maxlength="2" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TERM",rb)%></span><!-- 期 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-TERM">
expj.DZ0010010.DZ0010010form2.TERM = {};
expj.DZ0010010.DZ0010010form2.TERM.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/TERM.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.TERM.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-TERM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'TERM', this);
  });
  expj.DZ0010010.DZ0010010form2.TERM.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.TERM.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/TERM.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-TERM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-TERM" name="TERM" class="DZ0010010-focus-move expj-align-right required-value expj-DZ0010010-required-B" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getTERM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HALF_TERM_TYP",rb)%></span><!-- 半期区分 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-HALF_TERM_TYP">
expj.DZ0010010.DZ0010010form2.HALF_TERM_TYP = {};
expj.DZ0010010.DZ0010010form2.HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/HALF_TERM_TYP.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-HALF_TERM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'HALF_TERM_TYP', this);
  });
  expj.DZ0010010.DZ0010010form2.HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DZ0010010-DZ0010010form2-HALF_TERM_TYP" name='HALF_TERM_TYP' class='DZ0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDZ0010010Control.getStruct().getList_HALF_TERM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDZ0010010Control.getStruct().getList_HALF_TERM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDZ0010010Control.getStruct().getList_HALF_TERM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDZ0010010Struct.getHALF_TERM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.START_MONTH",rb)%></span><!-- 年度開始月 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-START_MONTH">
expj.DZ0010010.DZ0010010form2.START_MONTH = {};
expj.DZ0010010.DZ0010010form2.START_MONTH.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/START_MONTH.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.START_MONTH.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-START_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'START_MONTH', this);
  });
  expj.DZ0010010.DZ0010010form2.START_MONTH.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.START_MONTH.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/START_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-START_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-START_MONTH" name="START_MONTH" class="DZ0010010-focus-move expj-align-right required-value expj-DZ0010010-required-B" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getSTART_MONTH()) %>" maxlength="2" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0710",rb)%></span><!-- 月 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ORG_CD_1",rb)%></span><!-- 規定値部門コード --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-ORG_CD">
expj.DZ0010010.DZ0010010form2.ORG_CD = {};
expj.DZ0010010.DZ0010010form2.ORG_CD.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/ORG_CD.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.ORG_CD.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'ORG_CD', this);
  });
  expj.DZ0010010.DZ0010010form2.ORG_CD.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.ORG_CD.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-ORG_CD" name="ORG_CD" class="DZ0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getORG_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-PeekerOrgCd">
expj.DZ0010010.DZ0010010form2.PeekerOrgCd = {};
// script1="onClick;0;PEEKER;_DZ0010010form2/ORG_CD:_DZ0010010form2/ORG_NAME@<%=contextNo%>"
expj.DZ0010010.DZ0010010form2.PeekerOrgCd.onClick0 = function () {
  console.log('PeekerOrgCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DZ0010010';
var parameterValues = 'PeekerOrgCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010form2', '_ORG_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DZ0010010form2/ORG_CD:_DZ0010010form2/ORG_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DZ0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DZ0010010.DZ0010010form2.PeekerOrgCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DZ0010010.DZ0010010form2.PeekerOrgCd['onClick' + i])) {
        expj.DZ0010010.DZ0010010form2.PeekerOrgCd['onClick' + i]();
      }
    }
  }
};
expj.DZ0010010.DZ0010010form2.PeekerOrgCd.executeAllOnDecision = function () {
};
expj.DZ0010010.DZ0010010form2.PeekerOrgCd.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-PeekerOrgCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DZ0010010', 'DZ0010010form2', 'PeekerOrgCd', this, 'Button');
    }
  });
  expj.DZ0010010.DZ0010010form2.PeekerOrgCd.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.PeekerOrgCd.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/PeekerOrgCd.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-PeekerOrgCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DZ0010010-DZ0010010form2-PeekerOrgCd" class="DZ0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-ORG_NAME">
expj.DZ0010010.DZ0010010form2.ORG_NAME = {};
expj.DZ0010010.DZ0010010form2.ORG_NAME.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/ORG_NAME.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.ORG_NAME.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'ORG_NAME', this);
  });
  expj.DZ0010010.DZ0010010form2.ORG_NAME.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-ORG_NAME" name="ORG_NAME" class="DZ0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PC_FLG",rb)%></span><!-- 生産管理導入フラグ --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-PC_FLG">
expj.DZ0010010.DZ0010010form2.PC_FLG = {};
expj.DZ0010010.DZ0010010form2.PC_FLG.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/PC_FLG.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.PC_FLG.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-PC_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'PC_FLG', this);
  });
  expj.DZ0010010.DZ0010010form2.PC_FLG.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.PC_FLG.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/PC_FLG.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-PC_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DZ0010010-DZ0010010form2-PC_FLG" name='PC_FLG' class='DZ0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDZ0010010Control.getStruct().getList_PC_FLG_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDZ0010010Control.getStruct().getList_PC_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aDZ0010010Control.getStruct().getList_PC_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDZ0010010Struct.getPC_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.M_CS_PROC_PRIORITY_TYP",rb)%></span><!-- 工程マスタ優先区分 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-M_CS_PROC_PRIORITY_TYP">
expj.DZ0010010.DZ0010010form2.M_CS_PROC_PRIORITY_TYP = {};
expj.DZ0010010.DZ0010010form2.M_CS_PROC_PRIORITY_TYP.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/M_CS_PROC_PRIORITY_TYP.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.M_CS_PROC_PRIORITY_TYP.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-M_CS_PROC_PRIORITY_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'M_CS_PROC_PRIORITY_TYP', this);
  });
  expj.DZ0010010.DZ0010010form2.M_CS_PROC_PRIORITY_TYP.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.M_CS_PROC_PRIORITY_TYP.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/M_CS_PROC_PRIORITY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-M_CS_PROC_PRIORITY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DZ0010010-DZ0010010form2-M_CS_PROC_PRIORITY_TYP" name='M_CS_PROC_PRIORITY_TYP' class='DZ0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDZ0010010Control.getStruct().getList_M_CS_PROC_PRIORITY_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDZ0010010Control.getStruct().getList_M_CS_PROC_PRIORITY_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDZ0010010Control.getStruct().getList_M_CS_PROC_PRIORITY_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDZ0010010Struct.getM_CS_PROC_PRIORITY_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.M_CS_PROC_PERIOD",rb)%></span><!-- 工程マスタ保持期間 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-M_CS_PROC_PERIOD">
expj.DZ0010010.DZ0010010form2.M_CS_PROC_PERIOD = {};
expj.DZ0010010.DZ0010010form2.M_CS_PROC_PERIOD.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/M_CS_PROC_PERIOD.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.M_CS_PROC_PERIOD.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-M_CS_PROC_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'M_CS_PROC_PERIOD', this);
  });
  expj.DZ0010010.DZ0010010form2.M_CS_PROC_PERIOD.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.M_CS_PROC_PERIOD.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/M_CS_PROC_PERIOD.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-M_CS_PROC_PERIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-M_CS_PROC_PERIOD" name="M_CS_PROC_PERIOD" class="DZ0010010-focus-move expj-align-right required-value expj-DZ0010010-required-B" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getM_CS_PROC_PERIOD()) %>" maxlength="2" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0133",rb)%></span><!-- ヶ月 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.M_PROC_COST_PRIORITY_TYP",rb)%></span><!-- 加工費マスタ優先区分 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-M_PROC_COST_PRIORITY_TYP">
expj.DZ0010010.DZ0010010form2.M_PROC_COST_PRIORITY_TYP = {};
expj.DZ0010010.DZ0010010form2.M_PROC_COST_PRIORITY_TYP.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/M_PROC_COST_PRIORITY_TYP.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.M_PROC_COST_PRIORITY_TYP.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-M_PROC_COST_PRIORITY_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'M_PROC_COST_PRIORITY_TYP', this);
  });
  expj.DZ0010010.DZ0010010form2.M_PROC_COST_PRIORITY_TYP.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.M_PROC_COST_PRIORITY_TYP.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/M_PROC_COST_PRIORITY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-M_PROC_COST_PRIORITY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DZ0010010-DZ0010010form2-M_PROC_COST_PRIORITY_TYP" name='M_PROC_COST_PRIORITY_TYP' class='DZ0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDZ0010010Control.getStruct().getList_M_PROC_COST_PRIORITY_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDZ0010010Control.getStruct().getList_M_PROC_COST_PRIORITY_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDZ0010010Control.getStruct().getList_M_PROC_COST_PRIORITY_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDZ0010010Struct.getM_PROC_COST_PRIORITY_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.M_PROC_COST_PERIOD",rb)%></span><!-- 加工費マスタ保持期間 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-M_PROC_COST_PERIOD">
expj.DZ0010010.DZ0010010form2.M_PROC_COST_PERIOD = {};
expj.DZ0010010.DZ0010010form2.M_PROC_COST_PERIOD.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/M_PROC_COST_PERIOD.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.M_PROC_COST_PERIOD.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-M_PROC_COST_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'M_PROC_COST_PERIOD', this);
  });
  expj.DZ0010010.DZ0010010form2.M_PROC_COST_PERIOD.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.M_PROC_COST_PERIOD.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/M_PROC_COST_PERIOD.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-M_PROC_COST_PERIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-M_PROC_COST_PERIOD" name="M_PROC_COST_PERIOD" class="DZ0010010-focus-move expj-align-right required-value expj-DZ0010010-required-B" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getM_PROC_COST_PERIOD()) %>" maxlength="2" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0133",rb)%></span><!-- ヶ月 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.M_CS_PUCH_PRIORITY_TYP",rb)%></span><!-- 購入品マスタ優先区分 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-M_CS_PUCH_PRIORITY_TYP">
expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PRIORITY_TYP = {};
expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PRIORITY_TYP.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/M_CS_PUCH_PRIORITY_TYP.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PRIORITY_TYP.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-M_CS_PUCH_PRIORITY_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'M_CS_PUCH_PRIORITY_TYP', this);
  });
  expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PRIORITY_TYP.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PRIORITY_TYP.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/M_CS_PUCH_PRIORITY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-M_CS_PUCH_PRIORITY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DZ0010010-DZ0010010form2-M_CS_PUCH_PRIORITY_TYP" name='M_CS_PUCH_PRIORITY_TYP' class='DZ0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDZ0010010Control.getStruct().getList_M_CS_PUCH_PRIORITY_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDZ0010010Control.getStruct().getList_M_CS_PUCH_PRIORITY_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDZ0010010Control.getStruct().getList_M_CS_PUCH_PRIORITY_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDZ0010010Struct.getM_CS_PUCH_PRIORITY_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.M_CS_PUCH_PERIOD",rb)%></span><!-- 購入品マスタ保持期間 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-M_CS_PUCH_PERIOD">
expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PERIOD = {};
expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PERIOD.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/M_CS_PUCH_PERIOD.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PERIOD.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-M_CS_PUCH_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'M_CS_PUCH_PERIOD', this);
  });
  expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PERIOD.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PERIOD.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/M_CS_PUCH_PERIOD.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-M_CS_PUCH_PERIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-M_CS_PUCH_PERIOD" name="M_CS_PUCH_PERIOD" class="DZ0010010-focus-move expj-align-right required-value expj-DZ0010010-required-B" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getM_CS_PUCH_PERIOD()) %>" maxlength="2" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0133",rb)%></span><!-- ヶ月 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CS_MAST_IF_PERIOD",rb)%></span><!-- 原価基準情報IF保持期間 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-CS_MAST_IF_PERIOD">
expj.DZ0010010.DZ0010010form2.CS_MAST_IF_PERIOD = {};
expj.DZ0010010.DZ0010010form2.CS_MAST_IF_PERIOD.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/CS_MAST_IF_PERIOD.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.CS_MAST_IF_PERIOD.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-CS_MAST_IF_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'CS_MAST_IF_PERIOD', this);
  });
  expj.DZ0010010.DZ0010010form2.CS_MAST_IF_PERIOD.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.CS_MAST_IF_PERIOD.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/CS_MAST_IF_PERIOD.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-CS_MAST_IF_PERIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-CS_MAST_IF_PERIOD" name="CS_MAST_IF_PERIOD" class="DZ0010010-focus-move expj-align-right required-value expj-DZ0010010-required-B" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getCS_MAST_IF_PERIOD()) %>" maxlength="2" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0133",rb)%></span><!-- ヶ月 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CS_CALC_TRN_PERIOD",rb)%></span><!-- 原価計算トラン保持期間 --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010form2-CS_CALC_TRN_PERIOD">
expj.DZ0010010.DZ0010010form2.CS_CALC_TRN_PERIOD = {};
expj.DZ0010010.DZ0010010form2.CS_CALC_TRN_PERIOD.executeAllOnDecision = function () {
  console.log('execute DZ0010010form2/CS_CALC_TRN_PERIOD.onDecision');
  expj.DZ0010010.DZ0010010form2.executeAllOnDecision();
  expj.DZ0010010.executeAllOnDecision();
};
expj.DZ0010010.DZ0010010form2.CS_CALC_TRN_PERIOD.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010form2-CS_CALC_TRN_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DZ0010010', 'DZ0010010form2', 'CS_CALC_TRN_PERIOD', this);
  });
  expj.DZ0010010.DZ0010010form2.CS_CALC_TRN_PERIOD.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010form2.CS_CALC_TRN_PERIOD.executePScriptOnLoad = function () {
  console.log('execute DZ0010010form2/CS_CALC_TRN_PERIOD.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010form2-CS_CALC_TRN_PERIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DZ0010010-DZ0010010form2-CS_CALC_TRN_PERIOD" name="CS_CALC_TRN_PERIOD" class="DZ0010010-focus-move expj-align-right required-value expj-DZ0010010-required-B" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_P;3" value="<%= TypeConverter.sanitizer(aDZ0010010Struct.getCS_CALC_TRN_PERIOD()) %>" maxlength="3" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0134",rb)%></span><!-- 年間 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-DZ0010010-DZ0010010button2">
expj.DZ0010010.DZ0010010button2 = {};
expj.DZ0010010.DZ0010010button2.executeAllOnDecision = function () {
  console.log('execute DZ0010010button2.onDecision');
};
expj.DZ0010010.DZ0010010button2.executeOnLoad = function () {
  expj.DZ0010010.DZ0010010button2.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010button2.executePScriptOnLoad = function () {
  console.log('execute DZ0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DZ0010010-DZ0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DZ0010010-DZ0010010button2-Insert">
expj.DZ0010010.DZ0010010button2.Insert = {};
// script1="onClick;0;CHK;_DZ0010010form2/CURRENT_MONTH[lt]1[or]_DZ0010010form2/CURRENT_MONTH[gt]12@#DZ01101"
expj.DZ0010010.DZ0010010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010button2', '_DZ0010010form2/CURRENT_MONTH')), '[lt]', expj.common.pscript.convertNumber('1')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010button2', '_DZ0010010form2/CURRENT_MONTH')), '[gt]', expj.common.pscript.convertNumber('12'))) {
expj.common.pscript.addErrorMessage('DZ0010010', 'DZ0010010button2', 'DZ01101');
}
};
// script2="onClick;1;CHK;_DZ0010010form2/START_MONTH[lt]1[or]_DZ0010010form2/START_MONTH[gt]12@#DZ01102"
expj.DZ0010010.DZ0010010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010button2', '_DZ0010010form2/START_MONTH')), '[lt]', expj.common.pscript.convertNumber('1')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010button2', '_DZ0010010form2/START_MONTH')), '[gt]', expj.common.pscript.convertNumber('12'))) {
expj.common.pscript.addErrorMessage('DZ0010010', 'DZ0010010button2', 'DZ01102');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DZ0010010form1/*,_DZ0010010form2/*@DZ0010010Servlet,,$ZZ07001"
expj.DZ0010010.DZ0010010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DZ0010010', 'DZ0010010button2', '_DZ0010010form1/*,_DZ0010010form2/*', 'DZ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DZ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DZ0010010', response);
expj.common.updateBusinessScreenTab('DZ0010010', contents);
};
expj.common.pscript.callConfirm('DZ0010010', 'DZ0010010button2', 'ZZ07001', okEvent);
};
expj.DZ0010010.DZ0010010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DZ0010010.DZ0010010button2.Insert['onClick' + i])) {
        expj.DZ0010010.DZ0010010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.DZ0010010.DZ0010010button2.Insert.executeAllOnDecision = function () {
};
expj.DZ0010010.DZ0010010button2.Insert.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DZ0010010', 'DZ0010010button2', 'Insert', this, 'Button');
    }
  });
  expj.DZ0010010.DZ0010010button2.Insert.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute DZ0010010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DZ0010010-DZ0010010button2-Insert" name="Insert" class="DZ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010button2-Update">
expj.DZ0010010.DZ0010010button2.Update = {};
// script1="onClick;0;CHK;_DZ0010010form2/CURRENT_MONTH[lt]1[or]_DZ0010010form2/CURRENT_MONTH[gt]12@#DZ01101"
expj.DZ0010010.DZ0010010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010button2', '_DZ0010010form2/CURRENT_MONTH')), '[lt]', expj.common.pscript.convertNumber('1')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010button2', '_DZ0010010form2/CURRENT_MONTH')), '[gt]', expj.common.pscript.convertNumber('12'))) {
expj.common.pscript.addErrorMessage('DZ0010010', 'DZ0010010button2', 'DZ01101');
}
};
// script2="onClick;1;CHK;_DZ0010010form2/START_MONTH[lt]1[or]_DZ0010010form2/START_MONTH[gt]12@#DZ01102"
expj.DZ0010010.DZ0010010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010button2', '_DZ0010010form2/START_MONTH')), '[lt]', expj.common.pscript.convertNumber('1')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DZ0010010', 'DZ0010010button2', '_DZ0010010form2/START_MONTH')), '[gt]', expj.common.pscript.convertNumber('12'))) {
expj.common.pscript.addErrorMessage('DZ0010010', 'DZ0010010button2', 'DZ01102');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DZ0010010form1/*,_DZ0010010form2/*@DZ0010010Servlet,,$ZZ07003"
expj.DZ0010010.DZ0010010button2.Update.onClick2 = function () {
  console.log('Update script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DZ0010010', 'DZ0010010button2', '_DZ0010010form1/*,_DZ0010010form2/*', 'DZ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DZ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DZ0010010', response);
expj.common.updateBusinessScreenTab('DZ0010010', contents);
};
expj.common.pscript.callConfirm('DZ0010010', 'DZ0010010button2', 'ZZ07003', okEvent);
};
expj.DZ0010010.DZ0010010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DZ0010010.DZ0010010button2.Update['onClick' + i])) {
        expj.DZ0010010.DZ0010010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.DZ0010010.DZ0010010button2.Update.executeAllOnDecision = function () {
};
expj.DZ0010010.DZ0010010button2.Update.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DZ0010010', 'DZ0010010button2', 'Update', this, 'Button');
    }
  });
  expj.DZ0010010.DZ0010010button2.Update.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010button2.Update.executePScriptOnLoad = function () {
  console.log('execute DZ0010010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DZ0010010-DZ0010010button2-Update" name="Update" class="DZ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">DZ0010010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-DZ0010010-DZ0010010button0">
expj.DZ0010010.DZ0010010button0 = {};
expj.DZ0010010.DZ0010010button0.executeAllOnDecision = function () {
  console.log('execute DZ0010010button0.onDecision');
};
expj.DZ0010010.DZ0010010button0.executeOnLoad = function () {
  expj.DZ0010010.DZ0010010button0.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010button0.executePScriptOnLoad = function () {
  console.log('execute DZ0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DZ0010010-DZ0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DZ0010010-DZ0010010button0-Clear">
expj.DZ0010010.DZ0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DZ0010010Servlet,,$ZZ07008"
expj.DZ0010010.DZ0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DZ0010010', 'DZ0010010button0', '', 'DZ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DZ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DZ0010010', response);
expj.common.updateBusinessScreenTab('DZ0010010', contents);
};
expj.common.pscript.callConfirm('DZ0010010', 'DZ0010010button0', 'ZZ07008', okEvent);
};
expj.DZ0010010.DZ0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DZ0010010.DZ0010010button0.Clear['onClick' + i])) {
        expj.DZ0010010.DZ0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DZ0010010.DZ0010010button0.Clear.executeAllOnDecision = function () {
};
expj.DZ0010010.DZ0010010button0.Clear.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DZ0010010', 'DZ0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.DZ0010010.DZ0010010button0.Clear.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DZ0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DZ0010010-DZ0010010button0-Clear" name="Clear" class="DZ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-DZ0010010-DZ0010010button0-Close">
expj.DZ0010010.DZ0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DZ0010010.DZ0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DZ0010010');
};
expj.DZ0010010.DZ0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DZ0010010.DZ0010010button0.Close['onClick' + i])) {
        expj.DZ0010010.DZ0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DZ0010010.DZ0010010button0.Close.executeAllOnDecision = function () {
};
expj.DZ0010010.DZ0010010button0.Close.executeOnLoad = function () {
  $('#expj-DZ0010010-DZ0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DZ0010010', 'DZ0010010button0', 'Close', this, 'Button');
    }
  });
  expj.DZ0010010.DZ0010010button0.Close.executePScriptOnLoad();
};

expj.DZ0010010.DZ0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DZ0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DZ0010010-DZ0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DZ0010010-DZ0010010button0-Close" name="Close" class="DZ0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DZ0010010 (END)-->
<%
MessageStruct msgStruct = aDZ0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DZ0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DZ0010010)) {
  expj.common.treeInstanceMap.DZ0010010 = {};
}
expj.common.treeInstanceMap.DZ0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DZ0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DZ0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DZ0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DZ0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DZ0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DZ0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DZ0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DZ0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DZ0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DZ0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DZ0010010)) {
  expj.common.detailDialogMap.DZ0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DZ0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DZ0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DZ0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.DZ0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DZ0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DZ0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DZ0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DZ0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DZ0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DZ0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DZ0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DZ0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DZ0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DZ0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DZ0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DZ0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DZ0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DZ0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DZ0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DZ0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DZ0010010)) {
  expj.common.viewInstanceMap.DZ0010010 = {};
}
expj.common.viewInstanceMap.DZ0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.DZ0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DZ0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DZ0010010.<%=viewId %>.init = function () {
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
    expj.DZ0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DZ0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DZ0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DZ0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DZ0010010_init">
/**
 * DZ0010010用のロード完了時初期化関数
 */
expj.DZ0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DZ0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DZ0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DZ0010010');
  expj.common.calendarInstanceMap.DZ0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DZ0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DZ0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.DZ0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DZ0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DZ0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DZ0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DZ0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DZ0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DZ0010010-<%=detailId %>');
<%
 }
%>
  try{expj.DZ0010010.DZ0010010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.CURRENT_YEAR.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.CURRENT_MONTH.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.TERM.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.START_MONTH.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.ORG_CD.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.PeekerOrgCd.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.PC_FLG.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.M_CS_PROC_PRIORITY_TYP.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.M_CS_PROC_PERIOD.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.M_PROC_COST_PRIORITY_TYP.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.M_PROC_COST_PERIOD.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PRIORITY_TYP.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.M_CS_PUCH_PERIOD.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.CS_MAST_IF_PERIOD.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.CS_CALC_TRN_PERIOD.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010button2.Update.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form1.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010button1.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010form2.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010button2.executeOnLoad();}catch(e){};
  try{expj.DZ0010010.DZ0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DZ0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DZ0010010', 'DZ0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DZ0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DZ0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.DZ0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DZ0010010', '<%=request.getContextPath() %>');
};

/**
 * DZ0010010の全体onDecision処理
 */
expj.DZ0010010.executeAllOnDecision = function () {
  expj.DZ0010010.DZ0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DZ0010010_console">
expj.DZ0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>