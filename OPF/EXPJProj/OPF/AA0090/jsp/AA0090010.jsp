<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:22:49 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0090\AA0090010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0090.*" %>
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
<jsp:useBean id="aAA0090010Control" class="com.nec.jp.orteus.metamorBase.AA0090.AA0090010Control" scope="request"/>
<jsp:useBean id="aAA0090010Struct" class="com.nec.jp.orteus.metamorBase.AA0090.AA0090010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

工場メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0090/jsp/AA0090010.jsp,v $
$Author: geng-jia $ 
$Revision: 1.14 $ $Date: 2017/02/22 02:03:56 $
********************************************************* --%>
<html>
<head>
<title>工場メンテナンス</title>
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
<script class="expj-script-AA0090010_init">
  // AA0090010名前空間
  expj.AA0090010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0090010" data-screen="AA0090010" data-newdata="<%=aAA0090010Control.isNewData() %>">
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
              <script class="expj-script-AA0090010-AA0090010form1">
expj.AA0090010.AA0090010form1 = {};
// script1="onLoad;0;CALL;child@0,2"
expj.AA0090010.AA0090010form1.onLoad0 = function () {
  console.log('AA0090010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child2)){this.child2();}
};
// script2="child;0;CHK;?AA0090010form1/*[eq]INITIAL@*1"
expj.AA0090010.AA0090010form1.child0 = function () {
  console.log('AA0090010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090010', 'AA0090010form1', '?AA0090010form1/*'), '[eq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;MASK;_AA0090010button2/update"
expj.AA0090010.AA0090010form1.child1 = function () {
  console.log('AA0090010form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AA0090010', 'AA0090010form1', '_AA0090010button2/update');
};
// script4="onDecision;0;CHK;1[eq]1@*2"
expj.AA0090010.AA0090010form1.onDecision0 = function () {
  console.log('AA0090010form1 script4');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script5="child;2;CHKRQ;A@*3,*4"
expj.AA0090010.AA0090010form1.child2 = function () {
  console.log('AA0090010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AA0090010', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;3;UNMASK;_AA0090010button1/select@*6"
expj.AA0090010.AA0090010form1.child3 = function () {
  console.log('AA0090010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090010', 'AA0090010form1', '_AA0090010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script7="child;4;MASK;_AA0090010button1/select@*5"
expj.AA0090010.AA0090010form1.child4 = function () {
  console.log('AA0090010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0090010', 'AA0090010form1', '_AA0090010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script8="child;5;MASK;_AA0090010button2/update"
expj.AA0090010.AA0090010form1.child5 = function () {
  console.log('AA0090010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0090010', 'AA0090010form1', '_AA0090010button2/update');
};
// script9="child;6;CHK;?AA0090010form1/*[eq]NORMAL@*7"
expj.AA0090010.AA0090010form1.child6 = function () {
  console.log('AA0090010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090010', 'AA0090010form1', '?AA0090010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;7;CHKRQ;B@*8,*10"
expj.AA0090010.AA0090010form1.child7 = function () {
  console.log('AA0090010form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('AA0090010', 'B')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script11="child;8;CHK;_AA0090010form1/PLANT_CD[eq]_AA0090010form1/h_PLANT_CD@*9,*10"
expj.AA0090010.AA0090010form1.child8 = function () {
  console.log('AA0090010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090010', 'AA0090010form1', '_AA0090010form1/PLANT_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0090010', 'AA0090010form1', '_AA0090010form1/h_PLANT_CD'))) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script12="child;9;UNMASK;_AA0090010button2/update"
expj.AA0090010.AA0090010form1.child9 = function () {
  console.log('AA0090010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090010', 'AA0090010form1', '_AA0090010button2/update');
};
// script13="child;10;MASK;_AA0090010button2/update"
expj.AA0090010.AA0090010form1.child10 = function () {
  console.log('AA0090010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AA0090010', 'AA0090010form1', '_AA0090010button2/update');
};
expj.AA0090010.AA0090010form1.executeAllOnDecision = function () {
  console.log('execute AA0090010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090010.AA0090010form1['onDecision' + i])) {
        expj.AA0090010.AA0090010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0090010.AA0090010form1.executeOnLoad = function () {
  expj.AA0090010.AA0090010form1.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form1.executePScriptOnLoad = function () {
  console.log('execute AA0090010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0090010.AA0090010form1['onLoad' + i])) {
      expj.AA0090010.AA0090010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0090010-AA0090010form1" action="AA0090010Servlet" name="AA0090010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0090010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form1-PLANT_CD">
expj.AA0090010.AA0090010form1.PLANT_CD = {};
expj.AA0090010.AA0090010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AA0090010form1/PLANT_CD.onDecision');
  expj.AA0090010.AA0090010form1.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form1', 'PLANT_CD', this);
  });
  expj.AA0090010.AA0090010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AA0090010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form1-PLANT_CD" name="PLANT_CD" class="AA0090010-focus-move  required-value expj-AA0090010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form1-PeekerPlantCd">
expj.AA0090010.AA0090010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AA0090010form1/PLANT_CD@<%=contextNo%>"
expj.AA0090010.AA0090010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0090010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0090010', 'AA0090010form1', '_AA0090010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0090010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0090010.AA0090010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090010.AA0090010form1.PeekerPlantCd['onClick' + i])) {
        expj.AA0090010.AA0090010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AA0090010.AA0090010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AA0090010.AA0090010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090010', 'AA0090010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AA0090010.AA0090010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AA0090010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0090010-AA0090010form1-PeekerPlantCd" class="AA0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0090010-AA0090010form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0090010Control.getLastPLANT_CD()) %>">
<script class="expj-script-AA0090010-AA0090010form1-h_PLANT_CD">
expj.AA0090010.AA0090010form1.h_PLANT_CD = {};
expj.AA0090010.AA0090010form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AA0090010form1/h_PLANT_CD.onDecision');
  expj.AA0090010.AA0090010form1.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form1', 'h_PLANT_CD', this);
  });
  expj.AA0090010.AA0090010form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AA0090010form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form1-h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0090010-AA0090010button1">
expj.AA0090010.AA0090010button1 = {};
expj.AA0090010.AA0090010button1.executeAllOnDecision = function () {
  console.log('execute AA0090010button1.onDecision');
};
expj.AA0090010.AA0090010button1.executeOnLoad = function () {
  expj.AA0090010.AA0090010button1.executePScriptOnLoad();
};

expj.AA0090010.AA0090010button1.executePScriptOnLoad = function () {
  console.log('execute AA0090010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0090010-AA0090010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0090010-AA0090010button1-select">
expj.AA0090010.AA0090010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0090010form1/*@AA0090010Servlet"
expj.AA0090010.AA0090010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0090010', 'AA0090010button1', '_AA0090010form1/*', 'AA0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0090010', response);
expj.common.updateBusinessScreenTab('AA0090010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0090010.AA0090010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090010.AA0090010button1.select['onClick' + i])) {
        expj.AA0090010.AA0090010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0090010.AA0090010button1.select.executeAllOnDecision = function () {
};
expj.AA0090010.AA0090010button1.select.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090010', 'AA0090010button1', 'select', this, 'Button');
    }
  });
  expj.AA0090010.AA0090010button1.select.executePScriptOnLoad();
};

expj.AA0090010.AA0090010button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0090010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0090010-AA0090010button1-select" name="select" class="AA0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0090010-AA0090010form2">
expj.AA0090010.AA0090010form2 = {};
expj.AA0090010.AA0090010form2.executeAllOnDecision = function () {
  console.log('execute AA0090010form2.onDecision');
};
expj.AA0090010.AA0090010form2.executeOnLoad = function () {
  expj.AA0090010.AA0090010form2.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0090010-AA0090010form2" action="AA0090010Servlet" name="AA0090010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_NAME",rb)%></span><!-- 工場名 --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-PLANT_NAME">
expj.AA0090010.AA0090010form2.PLANT_NAME = {};
expj.AA0090010.AA0090010form2.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/PLANT_NAME.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'PLANT_NAME', this);
  });
  expj.AA0090010.AA0090010form2.PLANT_NAME.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-PLANT_NAME" name="PLANT_NAME" class="AA0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getPLANT_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_ANAME",rb)%></span><!-- 工場略称 --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-PLANT_ANAME">
expj.AA0090010.AA0090010form2.PLANT_ANAME = {};
expj.AA0090010.AA0090010form2.PLANT_ANAME.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/PLANT_ANAME.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.PLANT_ANAME.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-PLANT_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'PLANT_ANAME', this);
  });
  expj.AA0090010.AA0090010form2.PLANT_ANAME.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.PLANT_ANAME.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/PLANT_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-PLANT_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-PLANT_ANAME" name="PLANT_ANAME" class="AA0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getPLANT_ANAME()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ZIP_CD",rb)%></span><!-- 郵便番号 --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-ZIP_CD">
expj.AA0090010.AA0090010form2.ZIP_CD = {};
expj.AA0090010.AA0090010form2.ZIP_CD.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/ZIP_CD.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.ZIP_CD.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-ZIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'ZIP_CD', this);
  });
  expj.AA0090010.AA0090010form2.ZIP_CD.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.ZIP_CD.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/ZIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-ZIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-ZIP_CD" name="ZIP_CD" class="AA0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getZIP_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_1",rb)%></span><!-- 住所1 --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-ADDRESS_1">
expj.AA0090010.AA0090010form2.ADDRESS_1 = {};
expj.AA0090010.AA0090010form2.ADDRESS_1.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/ADDRESS_1.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.ADDRESS_1.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-ADDRESS_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'ADDRESS_1', this);
  });
  expj.AA0090010.AA0090010form2.ADDRESS_1.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.ADDRESS_1.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/ADDRESS_1.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-ADDRESS_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-ADDRESS_1" name="ADDRESS_1" class="AA0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getADDRESS_1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_2",rb)%></span><!-- 住所2 --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-ADDRESS_2">
expj.AA0090010.AA0090010form2.ADDRESS_2 = {};
expj.AA0090010.AA0090010form2.ADDRESS_2.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/ADDRESS_2.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.ADDRESS_2.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-ADDRESS_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'ADDRESS_2', this);
  });
  expj.AA0090010.AA0090010form2.ADDRESS_2.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.ADDRESS_2.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/ADDRESS_2.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-ADDRESS_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-ADDRESS_2" name="ADDRESS_2" class="AA0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getADDRESS_2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_K_1",rb)%></span><!-- 住所（カナ）1 --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-ADDRESS_K_1">
expj.AA0090010.AA0090010form2.ADDRESS_K_1 = {};
expj.AA0090010.AA0090010form2.ADDRESS_K_1.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/ADDRESS_K_1.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.ADDRESS_K_1.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-ADDRESS_K_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'ADDRESS_K_1', this);
  });
  expj.AA0090010.AA0090010form2.ADDRESS_K_1.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.ADDRESS_K_1.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/ADDRESS_K_1.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-ADDRESS_K_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-ADDRESS_K_1" name="ADDRESS_K_1" class="AA0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getADDRESS_K_1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_K_2",rb)%></span><!-- 住所（カナ）2 --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-ADDRESS_K_2">
expj.AA0090010.AA0090010form2.ADDRESS_K_2 = {};
expj.AA0090010.AA0090010form2.ADDRESS_K_2.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/ADDRESS_K_2.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.ADDRESS_K_2.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-ADDRESS_K_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'ADDRESS_K_2', this);
  });
  expj.AA0090010.AA0090010form2.ADDRESS_K_2.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.ADDRESS_K_2.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/ADDRESS_K_2.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-ADDRESS_K_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-ADDRESS_K_2" name="ADDRESS_K_2" class="AA0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getADDRESS_K_2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TEL",rb)%></span><!-- 電話番号 --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-TEL">
expj.AA0090010.AA0090010form2.TEL = {};
expj.AA0090010.AA0090010form2.TEL.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/TEL.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.TEL.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-TEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'TEL', this);
  });
  expj.AA0090010.AA0090010form2.TEL.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.TEL.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/TEL.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-TEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-TEL" name="TEL" class="AA0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getTEL()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.FAX",rb)%></span><!-- FAX番号 --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-FAX">
expj.AA0090010.AA0090010form2.FAX = {};
expj.AA0090010.AA0090010form2.FAX.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/FAX.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.FAX.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-FAX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'FAX', this);
  });
  expj.AA0090010.AA0090010form2.FAX.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.FAX.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/FAX.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-FAX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-FAX" name="FAX" class="AA0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getFAX()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CAL_NO",rb)%></span><!-- カレンダ番号 --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-CAL_NO">
expj.AA0090010.AA0090010form2.CAL_NO = {};
expj.AA0090010.AA0090010form2.CAL_NO.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/CAL_NO.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.CAL_NO.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-CAL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'CAL_NO', this);
  });
  expj.AA0090010.AA0090010form2.CAL_NO.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.CAL_NO.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/CAL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-CAL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-CAL_NO" name="CAL_NO" class="AA0090010-focus-move expj-align-right required-value expj-AA0090010-required-B" style="width:150px;" data-kind="OBT_N" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getCAL_NO()) %>" maxlength="6" ></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-PeekerCalNo">
expj.AA0090010.AA0090010form2.PeekerCalNo = {};
// script1="onClick;0;PEEKER;_AA0090010form2/CAL_NO@<%=contextNo%>"
expj.AA0090010.AA0090010form2.PeekerCalNo.onClick0 = function () {
  console.log('PeekerCalNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0090010';
var parameterValues = 'PeekerCalNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0090010', 'AA0090010form2', '_AA0090010form2/CAL_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CAL_NO_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0090010form2/CAL_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0090010.AA0090010form2.PeekerCalNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090010.AA0090010form2.PeekerCalNo['onClick' + i])) {
        expj.AA0090010.AA0090010form2.PeekerCalNo['onClick' + i]();
      }
    }
  }
};
expj.AA0090010.AA0090010form2.PeekerCalNo.executeAllOnDecision = function () {
};
expj.AA0090010.AA0090010form2.PeekerCalNo.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-PeekerCalNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090010', 'AA0090010form2', 'PeekerCalNo', this, 'Button');
    }
  });
  expj.AA0090010.AA0090010form2.PeekerCalNo.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.PeekerCalNo.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/PeekerCalNo.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-PeekerCalNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0090010-AA0090010form2-PeekerCalNo" class="AA0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010form2-CAL_NAME">
expj.AA0090010.AA0090010form2.CAL_NAME = {};
expj.AA0090010.AA0090010form2.CAL_NAME.executeAllOnDecision = function () {
  console.log('execute AA0090010form2/CAL_NAME.onDecision');
  expj.AA0090010.AA0090010form2.executeAllOnDecision();
  expj.AA0090010.executeAllOnDecision();
};
expj.AA0090010.AA0090010form2.CAL_NAME.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010form2-CAL_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090010', 'AA0090010form2', 'CAL_NAME', this);
  });
  expj.AA0090010.AA0090010form2.CAL_NAME.executePScriptOnLoad();
};

expj.AA0090010.AA0090010form2.CAL_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0090010form2/CAL_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010form2-CAL_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-AA0090010-AA0090010form2-CAL_NAME" name="CAL_NAME" class="AA0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090010Struct.getCAL_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0090010-AA0090010button2">
expj.AA0090010.AA0090010button2 = {};
expj.AA0090010.AA0090010button2.executeAllOnDecision = function () {
  console.log('execute AA0090010button2.onDecision');
};
expj.AA0090010.AA0090010button2.executeOnLoad = function () {
  expj.AA0090010.AA0090010button2.executePScriptOnLoad();
};

expj.AA0090010.AA0090010button2.executePScriptOnLoad = function () {
  console.log('execute AA0090010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0090010-AA0090010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0090010-AA0090010button2-update">
expj.AA0090010.AA0090010button2.update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0090010form1/PLANT_CD,_AA0090010form2/*@AA0090010Servlet,,$ZZ07003"
expj.AA0090010.AA0090010button2.update.onClick0 = function () {
  console.log('update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0090010', 'AA0090010button2', '_AA0090010form1/PLANT_CD,_AA0090010form2/*', 'AA0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0090010', response);
expj.common.updateBusinessScreenTab('AA0090010', contents);
};
expj.common.pscript.callConfirm('AA0090010', 'AA0090010button2', 'ZZ07003', okEvent);
};
expj.AA0090010.AA0090010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090010.AA0090010button2.update['onClick' + i])) {
        expj.AA0090010.AA0090010button2.update['onClick' + i]();
      }
    }
  }
};
expj.AA0090010.AA0090010button2.update.executeAllOnDecision = function () {
};
expj.AA0090010.AA0090010button2.update.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090010', 'AA0090010button2', 'update', this, 'Button');
    }
  });
  expj.AA0090010.AA0090010button2.update.executePScriptOnLoad();
};

expj.AA0090010.AA0090010button2.update.executePScriptOnLoad = function () {
  console.log('execute AA0090010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0090010-AA0090010button2-update" name="update" class="AA0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<span class="version">AA0090010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0090010-AA0090010button0">
expj.AA0090010.AA0090010button0 = {};
expj.AA0090010.AA0090010button0.executeAllOnDecision = function () {
  console.log('execute AA0090010button0.onDecision');
};
expj.AA0090010.AA0090010button0.executeOnLoad = function () {
  expj.AA0090010.AA0090010button0.executePScriptOnLoad();
};

expj.AA0090010.AA0090010button0.executePScriptOnLoad = function () {
  console.log('execute AA0090010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0090010-AA0090010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0090010-AA0090010button0-clear">
expj.AA0090010.AA0090010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0090010Servlet,,$ZZ07008"
expj.AA0090010.AA0090010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0090010', 'AA0090010button0', '', 'AA0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0090010', response);
expj.common.updateBusinessScreenTab('AA0090010', contents);
};
expj.common.pscript.callConfirm('AA0090010', 'AA0090010button0', 'ZZ07008', okEvent);
};
expj.AA0090010.AA0090010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090010.AA0090010button0.clear['onClick' + i])) {
        expj.AA0090010.AA0090010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0090010.AA0090010button0.clear.executeAllOnDecision = function () {
};
expj.AA0090010.AA0090010button0.clear.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090010', 'AA0090010button0', 'clear', this, 'Button');
    }
  });
  expj.AA0090010.AA0090010button0.clear.executePScriptOnLoad();
};

expj.AA0090010.AA0090010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0090010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0090010-AA0090010button0-clear" name="clear" class="AA0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0090010-AA0090010button0-close">
expj.AA0090010.AA0090010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0090010.AA0090010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0090010');
};
expj.AA0090010.AA0090010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090010.AA0090010button0.close['onClick' + i])) {
        expj.AA0090010.AA0090010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0090010.AA0090010button0.close.executeAllOnDecision = function () {
};
expj.AA0090010.AA0090010button0.close.executeOnLoad = function () {
  $('#expj-AA0090010-AA0090010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090010', 'AA0090010button0', 'close', this, 'Button');
    }
  });
  expj.AA0090010.AA0090010button0.close.executePScriptOnLoad();
};

expj.AA0090010.AA0090010button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0090010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0090010-AA0090010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0090010-AA0090010button0-close" name="close" class="AA0090010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0090010 (END)-->
<%
MessageStruct msgStruct = aAA0090010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0090010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0090010)) {
  expj.common.treeInstanceMap.AA0090010 = {};
}
expj.common.treeInstanceMap.AA0090010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0090010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0090010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0090010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0090010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0090010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0090010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0090010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0090010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0090010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0090010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0090010)) {
  expj.common.detailDialogMap.AA0090010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0090010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0090010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0090010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0090010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0090010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0090010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0090010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0090010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0090010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0090010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0090010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0090010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0090010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0090010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0090010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0090010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0090010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0090010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0090010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0090010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0090010)) {
  expj.common.viewInstanceMap.AA0090010 = {};
}
expj.common.viewInstanceMap.AA0090010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0090010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0090010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0090010.<%=viewId %>.init = function () {
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
    expj.AA0090010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0090010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0090010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0090010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0090010_init">
/**
 * AA0090010用のロード完了時初期化関数
 */
expj.AA0090010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0090010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0090010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0090010');
  expj.common.calendarInstanceMap.AA0090010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0090010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0090010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0090010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0090010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0090010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0090010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0090010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0090010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0090010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0090010.AA0090010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.PLANT_ANAME.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.ZIP_CD.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.ADDRESS_1.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.ADDRESS_2.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.ADDRESS_K_1.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.ADDRESS_K_2.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.TEL.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.FAX.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.CAL_NO.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.PeekerCalNo.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.CAL_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010button2.update.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form1.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010button1.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010form2.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010button2.executeOnLoad();}catch(e){};
  try{expj.AA0090010.AA0090010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0090010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0090010', 'AA0090010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0090010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0090010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0090010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0090010', '<%=request.getContextPath() %>');
};

/**
 * AA0090010の全体onDecision処理
 */
expj.AA0090010.executeAllOnDecision = function () {
  expj.AA0090010.AA0090010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0090010_console">
expj.AA0090010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>