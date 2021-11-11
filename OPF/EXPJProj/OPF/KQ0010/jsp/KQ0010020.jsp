<%-- ***
This file is generated
 GeneratedDate  : Fri Feb 17 17:53:30 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\KQ0010\KQ0010020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KQ0010.*" %>
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
<jsp:useBean id="aKQ0010020Control" class="com.nec.jp.orteus.metamorBase.KQ0010.KQ0010020Control" scope="request"/>
<jsp:useBean id="aKQ0010020Struct" class="com.nec.jp.orteus.metamorBase.KQ0010.KQ0010020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受注情報修正
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/jsp/KQ0010020.jsp,v $
$Author: geng-jia $    
$Revision: 1.25 $ $Date: 2017/02/22 02:07:10 $
********************************************************* --%>
<html>
<head>
<title>受注情報修正</title>
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
<script class="expj-script-KQ0010020_init">
  // KQ0010020名前空間
  expj.KQ0010020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KQ0010020" data-screen="KQ0010020" data-newdata="<%=aKQ0010020Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style=""></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);"></div><!--/td-->

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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-KQ0010020-KQ0010020form1">
expj.KQ0010020.KQ0010020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.KQ0010020.KQ0010020form1.onLoad0 = function () {
  console.log('KQ0010020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*1,*0"
expj.KQ0010020.KQ0010020form1.onDecision0 = function () {
  console.log('KQ0010020form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0010020', 'A')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;?KQ0010020form1/IN_ODR_NO[eq]SAME[and]?KQ0010020form1/*[eq]NORMAL@*6,*3"
expj.KQ0010020.KQ0010020form1.onDecision1 = function () {
  console.log('KQ0010020form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020form1', '?KQ0010020form1/IN_ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020form1', '?KQ0010020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="onDecision;2;CHK;?KQ0010020form1/IN_ODR_NO[eq]SAME[and]?KQ0010020form1/*[eq]NORMAL@*7,*5"
expj.KQ0010020.KQ0010020form1.onDecision2 = function () {
  console.log('KQ0010020form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020form1', '?KQ0010020form1/IN_ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020form1', '?KQ0010020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;0;MASK;_KQ0010020button1/Select"
expj.KQ0010020.KQ0010020form1.child0 = function () {
  console.log('KQ0010020form1 script6');
expj.common.pscript.setMaskToReferenceComponent('KQ0010020', 'KQ0010020form1', '_KQ0010020button1/Select');
};
// script7="child;1;UNMASK;_KQ0010020button1/Select"
expj.KQ0010020.KQ0010020form1.child1 = function () {
  console.log('KQ0010020form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010020', 'KQ0010020form1', '_KQ0010020button1/Select');
};
// script8="child;2;UNMASK;_KQ0010020button2/Update"
expj.KQ0010020.KQ0010020form1.child2 = function () {
  console.log('KQ0010020form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010020', 'KQ0010020form1', '_KQ0010020button2/Update');
};
// script9="child;3;MASK;_KQ0010020button2/Update"
expj.KQ0010020.KQ0010020form1.child3 = function () {
  console.log('KQ0010020form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KQ0010020', 'KQ0010020form1', '_KQ0010020button2/Update');
};
// script10="child;4;UNMASK;_KQ0010020button2/Delete,_KQ0010020form2/SelectUnitCost"
expj.KQ0010020.KQ0010020form1.child4 = function () {
  console.log('KQ0010020form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010020', 'KQ0010020form1', '_KQ0010020button2/Delete');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010020', 'KQ0010020form1', '_KQ0010020form2/SelectUnitCost');
};
// script11="child;5;MASK;_KQ0010020button2/Delete,_KQ0010020form2/SelectUnitCost"
expj.KQ0010020.KQ0010020form1.child5 = function () {
  console.log('KQ0010020form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KQ0010020', 'KQ0010020form1', '_KQ0010020button2/Delete');
expj.common.pscript.setMaskToReferenceComponent('KQ0010020', 'KQ0010020form1', '_KQ0010020form2/SelectUnitCost');
};
// script12="child;6;CHKRQ;A,B@*2,*3"
expj.KQ0010020.KQ0010020form1.child6 = function () {
  console.log('KQ0010020form1 script12');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0010020', 'A') && expj.common.pscript.satisfiedRequiredComponent('KQ0010020', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script13="child;7;CHKRQ;A@*4,*5"
expj.KQ0010020.KQ0010020form1.child7 = function () {
  console.log('KQ0010020form1 script13');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0010020', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script14="onDecision;3;CHK;_KQ0010020form2/h_APR_ODR[eq]1@*8,*9"
expj.KQ0010020.KQ0010020form1.onDecision3 = function () {
  console.log('KQ0010020form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020form1', '_KQ0010020form2/h_APR_ODR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script15="child;8;UNMASK;_KQ0010020form2/APPR_REMARKS"
expj.KQ0010020.KQ0010020form1.child8 = function () {
  console.log('KQ0010020form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010020', 'KQ0010020form1', '_KQ0010020form2/APPR_REMARKS');
};
// script16="child;9;MASK;_KQ0010020form2/APPR_REMARKS"
expj.KQ0010020.KQ0010020form1.child9 = function () {
  console.log('KQ0010020form1 script16');
expj.common.pscript.setMaskToReferenceComponent('KQ0010020', 'KQ0010020form1', '_KQ0010020form2/APPR_REMARKS');
};
expj.KQ0010020.KQ0010020form1.executeAllOnDecision = function () {
  console.log('execute KQ0010020form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020form1['onDecision' + i])) {
        expj.KQ0010020.KQ0010020form1['onDecision' + i]();
      }
    }
  }
};
expj.KQ0010020.KQ0010020form1.executeOnLoad = function () {
  expj.KQ0010020.KQ0010020form1.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form1.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020form1['onLoad' + i])) {
      expj.KQ0010020.KQ0010020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0010020-KQ0010020form1" action="KQ0010020Servlet" name="KQ0010020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKQ0010020Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:260px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:482px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form1-IN_ODR_NO">
expj.KQ0010020.KQ0010020form1.IN_ODR_NO = {};
expj.KQ0010020.KQ0010020form1.IN_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0010020form1/IN_ODR_NO.onDecision');
  expj.KQ0010020.KQ0010020form1.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form1.IN_ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form1-IN_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form1', 'IN_ODR_NO', this);
  });
  expj.KQ0010020.KQ0010020form1.IN_ODR_NO.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form1.IN_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form1/IN_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form1-IN_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form1-IN_ODR_NO" name="IN_ODR_NO" class="KQ0010020-focus-move  required-value expj-KQ0010020-required-A" style="width:100%;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getIN_ODR_NO()) %>" maxlength="15" ></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form1-ODR_NO_PEEKER">
expj.KQ0010020.KQ0010020form1.ODR_NO_PEEKER = {};
// script1="onClick;0;PEEKER;_KQ0010020form1/IN_ODR_NO@<%=contextNo%>"
expj.KQ0010020.KQ0010020form1.ODR_NO_PEEKER.onClick0 = function () {
  console.log('ODR_NO_PEEKER script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0010020';
var parameterValues = 'ODR_NO_PEEKER%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020form1', '_KQ0010020form1/IN_ODR_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ODR_NO_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0010020form1/IN_ODR_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0010020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0010020.KQ0010020form1.ODR_NO_PEEKER.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020form1.ODR_NO_PEEKER['onClick' + i])) {
        expj.KQ0010020.KQ0010020form1.ODR_NO_PEEKER['onClick' + i]();
      }
    }
  }
};
expj.KQ0010020.KQ0010020form1.ODR_NO_PEEKER.executeAllOnDecision = function () {
};
expj.KQ0010020.KQ0010020form1.ODR_NO_PEEKER.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form1-ODR_NO_PEEKER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010020', 'KQ0010020form1', 'ODR_NO_PEEKER', this, 'Button');
    }
  });
  expj.KQ0010020.KQ0010020form1.ODR_NO_PEEKER.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form1.ODR_NO_PEEKER.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form1/ODR_NO_PEEKER.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form1-ODR_NO_PEEKER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010020-KQ0010020form1-ODR_NO_PEEKER" class="KQ0010020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form1-h_ODR_NO" name="h_ODR_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_ODR_NO()) %>">
<script class="expj-script-KQ0010020-KQ0010020form1-h_ODR_NO">
expj.KQ0010020.KQ0010020form1.h_ODR_NO = {};
expj.KQ0010020.KQ0010020form1.h_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0010020form1/h_ODR_NO.onDecision');
  expj.KQ0010020.KQ0010020form1.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form1.h_ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form1-h_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form1', 'h_ODR_NO', this);
  });
  expj.KQ0010020.KQ0010020form1.h_ODR_NO.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form1.h_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form1/h_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form1-h_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:482px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KQ0010020-KQ0010020button1">
expj.KQ0010020.KQ0010020button1 = {};
expj.KQ0010020.KQ0010020button1.executeAllOnDecision = function () {
  console.log('execute KQ0010020button1.onDecision');
};
expj.KQ0010020.KQ0010020button1.executeOnLoad = function () {
  expj.KQ0010020.KQ0010020button1.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020button1.executePScriptOnLoad = function () {
  console.log('execute KQ0010020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0010020-KQ0010020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0010020-KQ0010020button1-Select">
expj.KQ0010020.KQ0010020button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010020form1/*@KQ0010020Servlet"
expj.KQ0010020.KQ0010020button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010020', 'KQ0010020button1', '_KQ0010020form1/*', 'KQ0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010020', response);
expj.common.updateBusinessScreenTab('KQ0010020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0010020.KQ0010020button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020button1.Select['onClick' + i])) {
        expj.KQ0010020.KQ0010020button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KQ0010020.KQ0010020button1.Select.executeAllOnDecision = function () {
};
expj.KQ0010020.KQ0010020button1.Select.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010020', 'KQ0010020button1', 'Select', this, 'Button');
    }
  });
  expj.KQ0010020.KQ0010020button1.Select.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020button1.Select.executePScriptOnLoad = function () {
  console.log('execute KQ0010020button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010020-KQ0010020button1-Select" name="Select" class="KQ0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style=""></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに上段検索条件用のDataGridを配置する。↓ --><script class="expj-script-KQ0010020-KQ0010020form2">
expj.KQ0010020.KQ0010020form2 = {};
expj.KQ0010020.KQ0010020form2.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2.onDecision');
};
expj.KQ0010020.KQ0010020form2.executeOnLoad = function () {
  expj.KQ0010020.KQ0010020form2.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0010020-KQ0010020form2" action="KQ0010020Servlet" name="KQ0010020form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:110px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ODR_QTY_4",rb)%></span><!-- 受注数量 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-ODR_QTY">
expj.KQ0010020.KQ0010020form2.ODR_QTY = {};
expj.KQ0010020.KQ0010020form2.ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/ODR_QTY.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.ODR_QTY.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'ODR_QTY', this);
  });
  expj.KQ0010020.KQ0010020form2.ODR_QTY.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-ODR_QTY" name="ODR_QTY" class="KQ0010020-focus-move  required-value expj-KQ0010020-required-B" style="width:100%;text-align: right;" data-kind="OBT_NUMBER;14.1;CEIL;4" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getODR_QTY()) %>" maxlength="20" ></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-STOCK_UNIT">
expj.KQ0010020.KQ0010020form2.STOCK_UNIT = {};
expj.KQ0010020.KQ0010020form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/STOCK_UNIT.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'STOCK_UNIT', this);
  });
  expj.KQ0010020.KQ0010020form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-STOCK_UNIT" name="STOCK_UNIT" class="KQ0010020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form2-h_ODR_QTY" name="h_ODR_QTY" class="" data-kind="OBT_NUMBER;14.1;CEIL;4" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_ODR_QTY()) %>">
<script class="expj-script-KQ0010020-KQ0010020form2-h_ODR_QTY">
expj.KQ0010020.KQ0010020form2.h_ODR_QTY = {};
expj.KQ0010020.KQ0010020form2.h_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/h_ODR_QTY.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.h_ODR_QTY.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-h_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'h_ODR_QTY', this);
  });
  expj.KQ0010020.KQ0010020form2.h_ODR_QTY.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.h_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/h_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-h_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form2-h_ALCTED_UNCONFIRM_ODR_QTY" name="h_ALCTED_UNCONFIRM_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_ALCTED_UNCONFIRM_ODR_QTY()) %>">
<script class="expj-script-KQ0010020-KQ0010020form2-h_ALCTED_UNCONFIRM_ODR_QTY">
expj.KQ0010020.KQ0010020form2.h_ALCTED_UNCONFIRM_ODR_QTY = {};
expj.KQ0010020.KQ0010020form2.h_ALCTED_UNCONFIRM_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/h_ALCTED_UNCONFIRM_ODR_QTY.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.h_ALCTED_UNCONFIRM_ODR_QTY.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-h_ALCTED_UNCONFIRM_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'h_ALCTED_UNCONFIRM_ODR_QTY', this);
  });
  expj.KQ0010020.KQ0010020form2.h_ALCTED_UNCONFIRM_ODR_QTY.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.h_ALCTED_UNCONFIRM_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/h_ALCTED_UNCONFIRM_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-h_ALCTED_UNCONFIRM_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-DESINATED_DLV_DATE">
expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE = {};
expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/DESINATED_DLV_DATE.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'DESINATED_DLV_DATE', this);
  });
  expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-DESINATED_DLV_DATE" name="DESINATED_DLV_DATE" class="KQ0010020-focus-move  required-value expj-KQ0010020-required-B" style="width:100%;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getDESINATED_DLV_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-DESINATED_DLV_DATE_CALENDAR">
expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KQ0010020form2/DESINATED_DLV_DATE"
expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE_CALENDAR.onClick0 = function () {
  console.log('DESINATED_DLV_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KQ0010020','KQ0010020form2','_KQ0010020form2/DESINATED_DLV_DATE');
};
expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE_CALENDAR['onClick' + i])) {
        expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-DESINATED_DLV_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010020', 'KQ0010020form2', 'DESINATED_DLV_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0010020','KQ0010020form2','_KQ0010020form2/DESINATED_DLV_DATE');
  expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/DESINATED_DLV_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-DESINATED_DLV_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><button type="button" id="expj-KQ0010020-KQ0010020form2-DESINATED_DLV_DATE_CALENDAR" class="KQ0010020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form2-h_DESINATED_DLV_DATE" name="h_DESINATED_DLV_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_DESINATED_DLV_DATE()) %>">
<script class="expj-script-KQ0010020-KQ0010020form2-h_DESINATED_DLV_DATE">
expj.KQ0010020.KQ0010020form2.h_DESINATED_DLV_DATE = {};
expj.KQ0010020.KQ0010020form2.h_DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/h_DESINATED_DLV_DATE.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.h_DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-h_DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'h_DESINATED_DLV_DATE', this);
  });
  expj.KQ0010020.KQ0010020form2.h_DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.h_DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/h_DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-h_DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SPCL_PRICE_CO",rb)%></span><!-- 特値区分 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-SPCL_PRICE_TYP">
expj.KQ0010020.KQ0010020form2.SPCL_PRICE_TYP = {};
expj.KQ0010020.KQ0010020form2.SPCL_PRICE_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/SPCL_PRICE_TYP.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.SPCL_PRICE_TYP.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-SPCL_PRICE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'SPCL_PRICE_TYP', this);
  });
  expj.KQ0010020.KQ0010020form2.SPCL_PRICE_TYP.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.SPCL_PRICE_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/SPCL_PRICE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-SPCL_PRICE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KQ0010020-KQ0010020form2-SPCL_PRICE_TYP" name='SPCL_PRICE_TYP' class='KQ0010020-focus-move' style='width:260px;'><%  for(int i = 0, size = aKQ0010020Control.getStruct().getList_SPCL_PRICE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKQ0010020Control.getStruct().getList_SPCL_PRICE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKQ0010020Control.getStruct().getList_SPCL_PRICE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKQ0010020Struct.getSPCL_PRICE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form2-h_SPCL_PRICE_TYP" name="h_SPCL_PRICE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_SPCL_PRICE_TYP()) %>">
<script class="expj-script-KQ0010020-KQ0010020form2-h_SPCL_PRICE_TYP">
expj.KQ0010020.KQ0010020form2.h_SPCL_PRICE_TYP = {};
expj.KQ0010020.KQ0010020form2.h_SPCL_PRICE_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/h_SPCL_PRICE_TYP.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.h_SPCL_PRICE_TYP.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-h_SPCL_PRICE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'h_SPCL_PRICE_TYP', this);
  });
  expj.KQ0010020.KQ0010020form2.h_SPCL_PRICE_TYP.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.h_SPCL_PRICE_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/h_SPCL_PRICE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-h_SPCL_PRICE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.UNIT_COST",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-ODR_UNIT_PRICE">
expj.KQ0010020.KQ0010020form2.ODR_UNIT_PRICE = {};
expj.KQ0010020.KQ0010020form2.ODR_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/ODR_UNIT_PRICE.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.ODR_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-ODR_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'ODR_UNIT_PRICE', this);
  });
  expj.KQ0010020.KQ0010020form2.ODR_UNIT_PRICE.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.ODR_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/ODR_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-ODR_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-ODR_UNIT_PRICE" name="ODR_UNIT_PRICE" class="KQ0010020-focus-move  required-value expj-KQ0010020-required-B" style="width:100%;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getODR_UNIT_PRICE()) %>" maxlength="20" ></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-UNIT_NAME">
expj.KQ0010020.KQ0010020form2.UNIT_NAME = {};
expj.KQ0010020.KQ0010020form2.UNIT_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/UNIT_NAME.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.UNIT_NAME.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-UNIT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'UNIT_NAME', this);
  });
  expj.KQ0010020.KQ0010020form2.UNIT_NAME.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.UNIT_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/UNIT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-UNIT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-UNIT_NAME" name="UNIT_NAME" class="KQ0010020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getUNIT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form2-h_ODR_UNIT_PRICE" name="h_ODR_UNIT_PRICE" class="" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_ODR_UNIT_PRICE()) %>">
<script class="expj-script-KQ0010020-KQ0010020form2-h_ODR_UNIT_PRICE">
expj.KQ0010020.KQ0010020form2.h_ODR_UNIT_PRICE = {};
expj.KQ0010020.KQ0010020form2.h_ODR_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/h_ODR_UNIT_PRICE.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.h_ODR_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-h_ODR_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'h_ODR_UNIT_PRICE', this);
  });
  expj.KQ0010020.KQ0010020form2.h_ODR_UNIT_PRICE.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.h_ODR_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/h_ODR_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-h_ODR_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-SelectUnitCost">
expj.KQ0010020.KQ0010020form2.SelectUnitCost = {};
// script1="onClick;0;SET;_ODR_UNIT_PRICE=_h_ODR_UNIT_PRICE"
expj.KQ0010020.KQ0010020form2.SelectUnitCost.onClick0 = function () {
  console.log('SelectUnitCost script1');
expj.common.pscript.setReferenceComponentValue('KQ0010020', 'KQ0010020form2', '_ODR_UNIT_PRICE', expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020form2', '_h_ODR_UNIT_PRICE'));
};
expj.KQ0010020.KQ0010020form2.SelectUnitCost.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020form2.SelectUnitCost['onClick' + i])) {
        expj.KQ0010020.KQ0010020form2.SelectUnitCost['onClick' + i]();
      }
    }
  }
};
expj.KQ0010020.KQ0010020form2.SelectUnitCost.executeAllOnDecision = function () {
};
expj.KQ0010020.KQ0010020form2.SelectUnitCost.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-SelectUnitCost').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010020', 'KQ0010020form2', 'SelectUnitCost', this, 'Button');
    }
  });
  expj.KQ0010020.KQ0010020form2.SelectUnitCost.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.SelectUnitCost.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/SelectUnitCost.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-SelectUnitCost');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:100px;text-align:left;"><button type="button" id="expj-KQ0010020-KQ0010020form2-SelectUnitCost" name="SelectUnitCost" class="KQ0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelectUnitCost",rb)%></button><!-- 単価読込ボタン --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUS_DLV_KEY_CD",rb)%></span><!-- 納品キー番号 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-CUS_DLV_KEY_CD">
expj.KQ0010020.KQ0010020form2.CUS_DLV_KEY_CD = {};
expj.KQ0010020.KQ0010020form2.CUS_DLV_KEY_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/CUS_DLV_KEY_CD.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.CUS_DLV_KEY_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-CUS_DLV_KEY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'CUS_DLV_KEY_CD', this);
  });
  expj.KQ0010020.KQ0010020form2.CUS_DLV_KEY_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.CUS_DLV_KEY_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/CUS_DLV_KEY_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-CUS_DLV_KEY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-CUS_DLV_KEY_CD" name="CUS_DLV_KEY_CD" class="KQ0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUS_DLV_KEY_CD()) %>" maxlength="23" ></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form2-h_CUS_DLV_KEY_CD" name="h_CUS_DLV_KEY_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_CUS_DLV_KEY_CD()) %>">
<script class="expj-script-KQ0010020-KQ0010020form2-h_CUS_DLV_KEY_CD">
expj.KQ0010020.KQ0010020form2.h_CUS_DLV_KEY_CD = {};
expj.KQ0010020.KQ0010020form2.h_CUS_DLV_KEY_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/h_CUS_DLV_KEY_CD.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.h_CUS_DLV_KEY_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-h_CUS_DLV_KEY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'h_CUS_DLV_KEY_CD', this);
  });
  expj.KQ0010020.KQ0010020form2.h_CUS_DLV_KEY_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.h_CUS_DLV_KEY_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/h_CUS_DLV_KEY_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-h_CUS_DLV_KEY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUS_DLV_CD",rb)%></span><!-- 納入番号 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-CUS_DLV_CD">
expj.KQ0010020.KQ0010020form2.CUS_DLV_CD = {};
expj.KQ0010020.KQ0010020form2.CUS_DLV_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/CUS_DLV_CD.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.CUS_DLV_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-CUS_DLV_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'CUS_DLV_CD', this);
  });
  expj.KQ0010020.KQ0010020form2.CUS_DLV_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.CUS_DLV_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/CUS_DLV_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-CUS_DLV_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-CUS_DLV_CD" name="CUS_DLV_CD" class="KQ0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUS_DLV_CD()) %>" maxlength="8" ></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form2-h_CUS_DLV_CD" name="h_CUS_DLV_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_CUS_DLV_CD()) %>">
<script class="expj-script-KQ0010020-KQ0010020form2-h_CUS_DLV_CD">
expj.KQ0010020.KQ0010020form2.h_CUS_DLV_CD = {};
expj.KQ0010020.KQ0010020form2.h_CUS_DLV_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/h_CUS_DLV_CD.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.h_CUS_DLV_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-h_CUS_DLV_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'h_CUS_DLV_CD', this);
  });
  expj.KQ0010020.KQ0010020form2.h_CUS_DLV_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.h_CUS_DLV_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/h_CUS_DLV_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-h_CUS_DLV_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_REMARK",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-REMARKS">
expj.KQ0010020.KQ0010020form2.REMARKS = {};
expj.KQ0010020.KQ0010020form2.REMARKS.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/REMARKS.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.REMARKS.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'REMARKS', this);
  });
  expj.KQ0010020.KQ0010020form2.REMARKS.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.REMARKS.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:282px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-REMARKS" name="REMARKS" class="KQ0010020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getREMARKS()) %>" maxlength="100" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-DLV_LOC_CD">
expj.KQ0010020.KQ0010020form2.DLV_LOC_CD = {};
expj.KQ0010020.KQ0010020form2.DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/DLV_LOC_CD.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'DLV_LOC_CD', this);
  });
  expj.KQ0010020.KQ0010020form2.DLV_LOC_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-DLV_LOC_CD" name="DLV_LOC_CD" class="KQ0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getDLV_LOC_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-PeekerDlvLocCd">
expj.KQ0010020.KQ0010020form2.PeekerDlvLocCd = {};
// script1="onClick;0;PEEKER;_KQ0010020form2/DLV_LOC_CD@<%=contextNo%>"
expj.KQ0010020.KQ0010020form2.PeekerDlvLocCd.onClick0 = function () {
  console.log('PeekerDlvLocCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0010020';
var parameterValues = 'PeekerDlvLocCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020form2', '_KQ0010020form3/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020form2', '_DLV_LOC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%DLV_LOC_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0010020form2/DLV_LOC_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0010020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0010020.KQ0010020form2.PeekerDlvLocCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020form2.PeekerDlvLocCd['onClick' + i])) {
        expj.KQ0010020.KQ0010020form2.PeekerDlvLocCd['onClick' + i]();
      }
    }
  }
};
expj.KQ0010020.KQ0010020form2.PeekerDlvLocCd.executeAllOnDecision = function () {
};
expj.KQ0010020.KQ0010020form2.PeekerDlvLocCd.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-PeekerDlvLocCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010020', 'KQ0010020form2', 'PeekerDlvLocCd', this, 'Button');
    }
  });
  expj.KQ0010020.KQ0010020form2.PeekerDlvLocCd.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.PeekerDlvLocCd.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/PeekerDlvLocCd.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-PeekerDlvLocCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010020-KQ0010020form2-PeekerDlvLocCd" class="KQ0010020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-DLV_LOC_NAME_KANJI">
expj.KQ0010020.KQ0010020form2.DLV_LOC_NAME_KANJI = {};
expj.KQ0010020.KQ0010020form2.DLV_LOC_NAME_KANJI.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/DLV_LOC_NAME_KANJI.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.DLV_LOC_NAME_KANJI.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-DLV_LOC_NAME_KANJI').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'DLV_LOC_NAME_KANJI', this);
  });
  expj.KQ0010020.KQ0010020form2.DLV_LOC_NAME_KANJI.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.DLV_LOC_NAME_KANJI.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/DLV_LOC_NAME_KANJI.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-DLV_LOC_NAME_KANJI');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-DLV_LOC_NAME_KANJI" name="DLV_LOC_NAME_KANJI" class="KQ0010020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getDLV_LOC_NAME_KANJI()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-CUST_ODR_NO">
expj.KQ0010020.KQ0010020form2.CUST_ODR_NO = {};
expj.KQ0010020.KQ0010020form2.CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/CUST_ODR_NO.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'CUST_ODR_NO', this);
  });
  expj.KQ0010020.KQ0010020form2.CUST_ODR_NO.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-CUST_ODR_NO" name="CUST_ODR_NO" class="KQ0010020-focus-move  required-value expj-KQ0010020-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUST_ODR_NO()) %>" maxlength="23" ></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form2-h_DLV_LOC_CD" name="h_DLV_LOC_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_DLV_LOC_CD()) %>">
<script class="expj-script-KQ0010020-KQ0010020form2-h_DLV_LOC_CD">
expj.KQ0010020.KQ0010020form2.h_DLV_LOC_CD = {};
expj.KQ0010020.KQ0010020form2.h_DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/h_DLV_LOC_CD.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.h_DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-h_DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'h_DLV_LOC_CD', this);
  });
  expj.KQ0010020.KQ0010020form2.h_DLV_LOC_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.h_DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/h_DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-h_DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form2-APPR_REMARKS">
expj.KQ0010020.KQ0010020form2.APPR_REMARKS = {};
expj.KQ0010020.KQ0010020form2.APPR_REMARKS.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/APPR_REMARKS.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.APPR_REMARKS.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-APPR_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'APPR_REMARKS', this);
  });
  expj.KQ0010020.KQ0010020form2.APPR_REMARKS.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.APPR_REMARKS.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/APPR_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-APPR_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:282px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form2-APPR_REMARKS" name="APPR_REMARKS" class="KQ0010020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getAPPR_REMARKS()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form2-h_APR_ODR" name="h_APR_ODR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_APR_ODR()) %>">
<script class="expj-script-KQ0010020-KQ0010020form2-h_APR_ODR">
expj.KQ0010020.KQ0010020form2.h_APR_ODR = {};
expj.KQ0010020.KQ0010020form2.h_APR_ODR.executeAllOnDecision = function () {
  console.log('execute KQ0010020form2/h_APR_ODR.onDecision');
  expj.KQ0010020.KQ0010020form2.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form2.h_APR_ODR.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form2-h_APR_ODR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form2', 'h_APR_ODR', this);
  });
  expj.KQ0010020.KQ0010020form2.h_APR_ODR.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form2.h_APR_ODR.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form2/h_APR_ODR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form2-h_APR_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-KQ0010020-KQ0010020button2">
expj.KQ0010020.KQ0010020button2 = {};
expj.KQ0010020.KQ0010020button2.executeAllOnDecision = function () {
  console.log('execute KQ0010020button2.onDecision');
};
expj.KQ0010020.KQ0010020button2.executeOnLoad = function () {
  expj.KQ0010020.KQ0010020button2.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020button2.executePScriptOnLoad = function () {
  console.log('execute KQ0010020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0010020-KQ0010020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0010020-KQ0010020button2-Update">
expj.KQ0010020.KQ0010020button2.Update = {};
// script1="onClick;0;CHK;_KQ0010020form1/IN_ODR_NO[neq]_KQ0010020form1/h_ODR_NO@!ZZ01111"
expj.KQ0010020.KQ0010020button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form1/IN_ODR_NO'), '[neq]', expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form1/h_ODR_NO'))) {
expj.common.pscript.viewErrorMessage('KQ0010020', 'KQ0010020button2', 'ZZ01111');
}
};
// script2="onClick;1;CHK;_KQ0010020form2/ODR_QTY[lte]0@!KQ00022"
expj.KQ0010020.KQ0010020button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KQ0010020', 'KQ0010020button2', 'KQ00022');
}
};
// script3="onClick;2;CHK;_KQ0010020form3/h_ANS_DLV_DATE_EXIST_FLG[eq]Y[and]_KQ0010020form2/h_DLV_LOC_CD[neq]_KQ0010020form2/DLV_LOC_CD@!KQ00316"
expj.KQ0010020.KQ0010020button2.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form3/h_ANS_DLV_DATE_EXIST_FLG'), '[eq]', 'Y') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/h_DLV_LOC_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/DLV_LOC_CD'))) {
expj.common.pscript.viewErrorMessage('KQ0010020', 'KQ0010020button2', 'KQ00316');
}
};
// script4="onClick;3;CHK;_KQ0010020form3/h_ODR_TYP[neq]1[and]_KQ0010020form2/ODR_QTY[lt][{_KQ0010020form2/h_ODR_QTY}-{_KQ0010020form3/h_SHIP_PLAN_REMAIN_QTY}]@!KQ00074"
expj.KQ0010020.KQ0010020button2.Update.onClick3 = function () {
  console.log('Update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form3/h_ODR_TYP'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/ODR_QTY')), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/h_ODR_QTY') + '-' + expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form3/h_SHIP_PLAN_REMAIN_QTY')))) {
expj.common.pscript.viewErrorMessage('KQ0010020', 'KQ0010020button2', 'KQ00074');
}
};
// script5="onClick;4;CHK;_KQ0010020form2/ODR_UNIT_PRICE[lt]0@!KQ00023"
expj.KQ0010020.KQ0010020button2.Update.onClick4 = function () {
  console.log('Update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/ODR_UNIT_PRICE')), '[lt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KQ0010020', 'KQ0010020button2', 'KQ00023');
}
};
// script6="onClick;5;CHK;_KQ0010020form3/h_ODR_TYP[neq]1[and]_KQ0010020form3/h_ANS_DLV_DATE_EXIST_FLG[eq]Y@$KQ00314,*7"
expj.KQ0010020.KQ0010020button2.Update.onClick5 = function () {
  console.log('Update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form3/h_ODR_TYP'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form3/h_ANS_DLV_DATE_EXIST_FLG'), '[eq]', 'Y')) {
expj.common.pscript.addWarningMessage('KQ0010020', 'KQ0010020button2', 'KQ00314');
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script7="onClick;6;CHK;_KQ0010020form3/h_BUSINESS_OPR_DATE[neq][and]_KQ0010020form2/DESINATED_DLV_DATE[lt]_KQ0010020form3/h_BUSINESS_OPR_DATE@$KQ00006,*8"
expj.KQ0010020.KQ0010020button2.Update.onClick6 = function () {
  console.log('Update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form3/h_BUSINESS_OPR_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/DESINATED_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form3/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('KQ0010020', 'KQ0010020button2', 'KQ00006');
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script8="onClick;7;CHK;_KQ0010020form2/SPCL_PRICE_TYP[eq]0[and]_KQ0010020form2/h_ODR_UNIT_PRICE[neq][and][{_KQ0010020form2/h_ODR_UNIT_PRICE}-{_KQ0010020form2/ODR_UNIT_PRICE}][neq]0@$KQ00020,*9"
expj.KQ0010020.KQ0010020button2.Update.onClick7 = function () {
  console.log('Update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/SPCL_PRICE_TYP'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/h_ODR_UNIT_PRICE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/h_ODR_UNIT_PRICE') + '-' + expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form2/ODR_UNIT_PRICE')), '[neq]', '0')) {
expj.common.pscript.addWarningMessage('KQ0010020', 'KQ0010020button2', 'KQ00020');
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script9="onClick;8;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010020form1/*,_KQ0010020form2/*,_KQ0010020form3/*@KQ0010020Servlet,,$ZZ07003"
expj.KQ0010020.KQ0010020button2.Update.onClick8 = function () {
  console.log('Update script9');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010020', 'KQ0010020button2', '_KQ0010020form1/*,_KQ0010020form2/*,_KQ0010020form3/*', 'KQ0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010020', response);
expj.common.updateBusinessScreenTab('KQ0010020', contents);
};
expj.common.pscript.callConfirm('KQ0010020', 'KQ0010020button2', 'ZZ07003', okEvent);
};
expj.KQ0010020.KQ0010020button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 8; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020button2.Update['onClick' + i])) {
        expj.KQ0010020.KQ0010020button2.Update['onClick' + i]();
      }
    }
  }
};
expj.KQ0010020.KQ0010020button2.Update.executeAllOnDecision = function () {
};
expj.KQ0010020.KQ0010020button2.Update.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010020', 'KQ0010020button2', 'Update', this, 'Button');
    }
  });
  expj.KQ0010020.KQ0010020button2.Update.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020button2.Update.executePScriptOnLoad = function () {
  console.log('execute KQ0010020button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010020-KQ0010020button2-Update" name="Update" class="KQ0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020button2-Delete">
expj.KQ0010020.KQ0010020button2.Delete = {};
// script1="onClick;0;CHK;_KQ0010020form1/IN_ODR_NO[neq]_KQ0010020form1/h_ODR_NO@!ZZ01111"
expj.KQ0010020.KQ0010020button2.Delete.onClick0 = function () {
  console.log('Delete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form1/IN_ODR_NO'), '[neq]', expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form1/h_ODR_NO'))) {
expj.common.pscript.viewErrorMessage('KQ0010020', 'KQ0010020button2', 'ZZ01111');
}
};
// script2="onClick;1;CHK;_KQ0010020form3/h_ODR_TYP[eq]3[and]_KQ0010020form3/h_ANS_DLV_DATE_EXIST_FLG[eq]Y@!KQ00050"
expj.KQ0010020.KQ0010020button2.Delete.onClick1 = function () {
  console.log('Delete script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form3/h_ODR_TYP'), '[eq]', '3') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010020', 'KQ0010020button2', '_KQ0010020form3/h_ANS_DLV_DATE_EXIST_FLG'), '[eq]', 'Y')) {
expj.common.pscript.viewErrorMessage('KQ0010020', 'KQ0010020button2', 'KQ00050');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010020form1/*,_KQ0010020form2/*,_KQ0010020form3/*@KQ0010020Servlet,,$ZZ07004"
expj.KQ0010020.KQ0010020button2.Delete.onClick2 = function () {
  console.log('Delete script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010020', 'KQ0010020button2', '_KQ0010020form1/*,_KQ0010020form2/*,_KQ0010020form3/*', 'KQ0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010020', response);
expj.common.updateBusinessScreenTab('KQ0010020', contents);
};
expj.common.pscript.callConfirm('KQ0010020', 'KQ0010020button2', 'ZZ07004', okEvent);
};
expj.KQ0010020.KQ0010020button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020button2.Delete['onClick' + i])) {
        expj.KQ0010020.KQ0010020button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.KQ0010020.KQ0010020button2.Delete.executeAllOnDecision = function () {
};
expj.KQ0010020.KQ0010020button2.Delete.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010020', 'KQ0010020button2', 'Delete', this, 'Button');
    }
  });
  expj.KQ0010020.KQ0010020button2.Delete.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020button2.Delete.executePScriptOnLoad = function () {
  console.log('execute KQ0010020button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010020-KQ0010020button2-Delete" name="Delete" class="KQ0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style=""></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに上段検索条件用のDataGridを配置する。↓ --><script class="expj-script-KQ0010020-KQ0010020form3">
expj.KQ0010020.KQ0010020form3 = {};
expj.KQ0010020.KQ0010020form3.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3.onDecision');
};
expj.KQ0010020.KQ0010020form3.executeOnLoad = function () {
  expj.KQ0010020.KQ0010020form3.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0010020-KQ0010020form3" action="KQ0010020Servlet" name="KQ0010020form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:138px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:138px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:110px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:100px;align:left"></div>
<div class="div-td" style="width:50px;align:left"></div>
<div class="div-td" style="width:50px;align:left"></div>
<div class="div-td" style="width:50px;align:left"></div>
<div class="div-td" style="width:50px;align:left"></div>
<div class="div-td" style="width:50px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-ITEM_CD">
expj.KQ0010020.KQ0010020form3.ITEM_CD = {};
expj.KQ0010020.KQ0010020form3.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/ITEM_CD.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'ITEM_CD', this);
  });
  expj.KQ0010020.KQ0010020form3.ITEM_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-ITEM_CD" name="ITEM_CD" class="KQ0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-ITEM_NAME">
expj.KQ0010020.KQ0010020form3.ITEM_NAME = {};
expj.KQ0010020.KQ0010020form3.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/ITEM_NAME.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'ITEM_NAME', this);
  });
  expj.KQ0010020.KQ0010020form3.ITEM_NAME.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:350px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-ITEM_NAME" name="ITEM_NAME" class="KQ0010020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-CUST_CD">
expj.KQ0010020.KQ0010020form3.CUST_CD = {};
expj.KQ0010020.KQ0010020form3.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/CUST_CD.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.CUST_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'CUST_CD', this);
  });
  expj.KQ0010020.KQ0010020form3.CUST_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-CUST_CD" name="CUST_CD" class="KQ0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-CUST_ANAME">
expj.KQ0010020.KQ0010020form3.CUST_ANAME = {};
expj.KQ0010020.KQ0010020form3.CUST_ANAME.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/CUST_ANAME.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.CUST_ANAME.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-CUST_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'CUST_ANAME', this);
  });
  expj.KQ0010020.KQ0010020form3.CUST_ANAME.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.CUST_ANAME.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/CUST_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-CUST_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:350px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-CUST_ANAME" name="CUST_ANAME" class="KQ0010020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUST_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-CUST_ITEM_CD">
expj.KQ0010020.KQ0010020form3.CUST_ITEM_CD = {};
expj.KQ0010020.KQ0010020form3.CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/CUST_ITEM_CD.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'CUST_ITEM_CD', this);
  });
  expj.KQ0010020.KQ0010020form3.CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-CUST_ITEM_CD" name="CUST_ITEM_CD" class="KQ0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUST_ITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-CUST_ITEM_NAME">
expj.KQ0010020.KQ0010020form3.CUST_ITEM_NAME = {};
expj.KQ0010020.KQ0010020form3.CUST_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/CUST_ITEM_NAME.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.CUST_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-CUST_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'CUST_ITEM_NAME', this);
  });
  expj.KQ0010020.KQ0010020form3.CUST_ITEM_NAME.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.CUST_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/CUST_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-CUST_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:350px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-CUST_ITEM_NAME" name="CUST_ITEM_NAME" class="KQ0010020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUST_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_TYP",rb)%></span><!-- 注文区分 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-ODR_TYP">
expj.KQ0010020.KQ0010020form3.ODR_TYP = {};
expj.KQ0010020.KQ0010020form3.ODR_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/ODR_TYP.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.ODR_TYP.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'ODR_TYP', this);
  });
  expj.KQ0010020.KQ0010020form3.ODR_TYP.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-ODR_TYP" name="ODR_TYP" class="KQ0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getODR_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form3-h_REMAIN_UNCONFIRM_ODR_QTY" name="h_REMAIN_UNCONFIRM_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_REMAIN_UNCONFIRM_ODR_QTY()) %>">
<script class="expj-script-KQ0010020-KQ0010020form3-h_REMAIN_UNCONFIRM_ODR_QTY">
expj.KQ0010020.KQ0010020form3.h_REMAIN_UNCONFIRM_ODR_QTY = {};
expj.KQ0010020.KQ0010020form3.h_REMAIN_UNCONFIRM_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/h_REMAIN_UNCONFIRM_ODR_QTY.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.h_REMAIN_UNCONFIRM_ODR_QTY.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-h_REMAIN_UNCONFIRM_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'h_REMAIN_UNCONFIRM_ODR_QTY', this);
  });
  expj.KQ0010020.KQ0010020form3.h_REMAIN_UNCONFIRM_ODR_QTY.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.h_REMAIN_UNCONFIRM_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/h_REMAIN_UNCONFIRM_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-h_REMAIN_UNCONFIRM_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form3-h_SHIP_PLAN_REMAIN_QTY" name="h_SHIP_PLAN_REMAIN_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_SHIP_PLAN_REMAIN_QTY()) %>">
<script class="expj-script-KQ0010020-KQ0010020form3-h_SHIP_PLAN_REMAIN_QTY">
expj.KQ0010020.KQ0010020form3.h_SHIP_PLAN_REMAIN_QTY = {};
expj.KQ0010020.KQ0010020form3.h_SHIP_PLAN_REMAIN_QTY.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/h_SHIP_PLAN_REMAIN_QTY.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.h_SHIP_PLAN_REMAIN_QTY.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-h_SHIP_PLAN_REMAIN_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'h_SHIP_PLAN_REMAIN_QTY', this);
  });
  expj.KQ0010020.KQ0010020form3.h_SHIP_PLAN_REMAIN_QTY.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.h_SHIP_PLAN_REMAIN_QTY.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/h_SHIP_PLAN_REMAIN_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-h_SHIP_PLAN_REMAIN_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:100px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form3-h_ANS_DLV_DATE_EXIST_FLG" name="h_ANS_DLV_DATE_EXIST_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_ANS_DLV_DATE_EXIST_FLG()) %>">
<script class="expj-script-KQ0010020-KQ0010020form3-h_ANS_DLV_DATE_EXIST_FLG">
expj.KQ0010020.KQ0010020form3.h_ANS_DLV_DATE_EXIST_FLG = {};
expj.KQ0010020.KQ0010020form3.h_ANS_DLV_DATE_EXIST_FLG.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/h_ANS_DLV_DATE_EXIST_FLG.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.h_ANS_DLV_DATE_EXIST_FLG.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-h_ANS_DLV_DATE_EXIST_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'h_ANS_DLV_DATE_EXIST_FLG', this);
  });
  expj.KQ0010020.KQ0010020form3.h_ANS_DLV_DATE_EXIST_FLG.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.h_ANS_DLV_DATE_EXIST_FLG.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/h_ANS_DLV_DATE_EXIST_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-h_ANS_DLV_DATE_EXIST_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form3-h_T_SHIP_ODR_EXIST_FLG" name="h_T_SHIP_ODR_EXIST_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_T_SHIP_ODR_EXIST_FLG()) %>">
<script class="expj-script-KQ0010020-KQ0010020form3-h_T_SHIP_ODR_EXIST_FLG">
expj.KQ0010020.KQ0010020form3.h_T_SHIP_ODR_EXIST_FLG = {};
expj.KQ0010020.KQ0010020form3.h_T_SHIP_ODR_EXIST_FLG.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/h_T_SHIP_ODR_EXIST_FLG.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.h_T_SHIP_ODR_EXIST_FLG.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-h_T_SHIP_ODR_EXIST_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'h_T_SHIP_ODR_EXIST_FLG', this);
  });
  expj.KQ0010020.KQ0010020form3.h_T_SHIP_ODR_EXIST_FLG.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.h_T_SHIP_ODR_EXIST_FLG.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/h_T_SHIP_ODR_EXIST_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-h_T_SHIP_ODR_EXIST_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form3-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-KQ0010020-KQ0010020form3-h_MODIFY_COUNT">
expj.KQ0010020.KQ0010020form3.h_MODIFY_COUNT = {};
expj.KQ0010020.KQ0010020form3.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/h_MODIFY_COUNT.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'h_MODIFY_COUNT', this);
  });
  expj.KQ0010020.KQ0010020form3.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-h_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form3-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-KQ0010020-KQ0010020form3-h_BUSINESS_OPR_DATE">
expj.KQ0010020.KQ0010020form3.h_BUSINESS_OPR_DATE = {};
expj.KQ0010020.KQ0010020form3.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/h_BUSINESS_OPR_DATE.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.KQ0010020.KQ0010020form3.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-h_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KQ0010020-KQ0010020form3-h_ODR_TYP" name="h_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.geth_ODR_TYP()) %>">
<script class="expj-script-KQ0010020-KQ0010020form3-h_ODR_TYP">
expj.KQ0010020.KQ0010020form3.h_ODR_TYP = {};
expj.KQ0010020.KQ0010020form3.h_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/h_ODR_TYP.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.h_ODR_TYP.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-h_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'h_ODR_TYP', this);
  });
  expj.KQ0010020.KQ0010020form3.h_ODR_TYP.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.h_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/h_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-h_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4345",rb)%></span><!-- 受注担当者 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-CUST_CHRG_PSN_CD">
expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_CD = {};
expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/CUST_CHRG_PSN_CD.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-CUST_CHRG_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'CUST_CHRG_PSN_CD', this);
  });
  expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/CUST_CHRG_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-CUST_CHRG_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-CUST_CHRG_PSN_CD" name="CUST_CHRG_PSN_CD" class="KQ0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUST_CHRG_PSN_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-CUST_CHRG_PSN_NAME">
expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_NAME = {};
expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/CUST_CHRG_PSN_NAME.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_NAME.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-CUST_CHRG_PSN_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'CUST_CHRG_PSN_NAME', this);
  });
  expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_NAME.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/CUST_CHRG_PSN_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-CUST_CHRG_PSN_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:350px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-CUST_CHRG_PSN_NAME" name="CUST_CHRG_PSN_NAME" class="KQ0010020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUST_CHRG_PSN_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4346",rb)%></span><!-- 受注担当部門 --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-CUST_CHRG_ORG_CD">
expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_CD = {};
expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/CUST_CHRG_ORG_CD.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_CD.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-CUST_CHRG_ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'CUST_CHRG_ORG_CD', this);
  });
  expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_CD.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/CUST_CHRG_ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-CUST_CHRG_ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-CUST_CHRG_ORG_CD" name="CUST_CHRG_ORG_CD" class="KQ0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUST_CHRG_ORG_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020form3-CUST_CHRG_ORG_NAME">
expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_NAME = {};
expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0010020form3/CUST_CHRG_ORG_NAME.onDecision');
  expj.KQ0010020.KQ0010020form3.executeAllOnDecision();
  expj.KQ0010020.executeAllOnDecision();
};
expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_NAME.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020form3-CUST_CHRG_ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010020', 'KQ0010020form3', 'CUST_CHRG_ORG_NAME', this);
  });
  expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_NAME.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0010020form3/CUST_CHRG_ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020form3-CUST_CHRG_ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:350px;text-align:left;"><input type="text" id="expj-KQ0010020-KQ0010020form3-CUST_CHRG_ORG_NAME" name="CUST_CHRG_ORG_NAME" class="KQ0010020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010020Struct.getCUST_CHRG_ORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"></div><!--/td-->
<div class="expj-td" style=""></div><!--/td-->
<div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KQ0010020 Revision: 1.11  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KQ0010020-KQ0010020button0">
expj.KQ0010020.KQ0010020button0 = {};
expj.KQ0010020.KQ0010020button0.executeAllOnDecision = function () {
  console.log('execute KQ0010020button0.onDecision');
};
expj.KQ0010020.KQ0010020button0.executeOnLoad = function () {
  expj.KQ0010020.KQ0010020button0.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020button0.executePScriptOnLoad = function () {
  console.log('execute KQ0010020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0010020-KQ0010020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0010020-KQ0010020button0-Clear">
expj.KQ0010020.KQ0010020button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KQ0010020Servlet,,$ZZ07008"
expj.KQ0010020.KQ0010020button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010020', 'KQ0010020button0', '', 'KQ0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010020', response);
expj.common.updateBusinessScreenTab('KQ0010020', contents);
};
expj.common.pscript.callConfirm('KQ0010020', 'KQ0010020button0', 'ZZ07008', okEvent);
};
expj.KQ0010020.KQ0010020button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020button0.Clear['onClick' + i])) {
        expj.KQ0010020.KQ0010020button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KQ0010020.KQ0010020button0.Clear.executeAllOnDecision = function () {
};
expj.KQ0010020.KQ0010020button0.Clear.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010020', 'KQ0010020button0', 'Clear', this, 'Button');
    }
  });
  expj.KQ0010020.KQ0010020button0.Clear.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KQ0010020button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010020-KQ0010020button0-Clear" name="Clear" class="KQ0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KQ0010020-KQ0010020button0-Close">
expj.KQ0010020.KQ0010020button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KQ0010020.KQ0010020button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KQ0010020');
};
expj.KQ0010020.KQ0010020button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010020.KQ0010020button0.Close['onClick' + i])) {
        expj.KQ0010020.KQ0010020button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KQ0010020.KQ0010020button0.Close.executeAllOnDecision = function () {
};
expj.KQ0010020.KQ0010020button0.Close.executeOnLoad = function () {
  $('#expj-KQ0010020-KQ0010020button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010020', 'KQ0010020button0', 'Close', this, 'Button');
    }
  });
  expj.KQ0010020.KQ0010020button0.Close.executePScriptOnLoad();
};

expj.KQ0010020.KQ0010020button0.Close.executePScriptOnLoad = function () {
  console.log('execute KQ0010020button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010020-KQ0010020button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010020-KQ0010020button0-Close" name="Close" class="KQ0010020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KQ0010020 (END)-->
<%
MessageStruct msgStruct = aKQ0010020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KQ0010020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KQ0010020)) {
  expj.common.treeInstanceMap.KQ0010020 = {};
}
expj.common.treeInstanceMap.KQ0010020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0010020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KQ0010020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0010020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KQ0010020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KQ0010020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KQ0010020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KQ0010020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KQ0010020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KQ0010020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KQ0010020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010020)) {
  expj.common.detailDialogMap.KQ0010020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KQ0010020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010020.<%=detailId %>)) {
  expj.common.detailDialogMap.KQ0010020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KQ0010020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KQ0010020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KQ0010020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KQ0010020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KQ0010020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KQ0010020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KQ0010020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KQ0010020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KQ0010020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KQ0010020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KQ0010020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KQ0010020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KQ0010020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KQ0010020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KQ0010020)) {
  expj.common.viewInstanceMap.KQ0010020 = {};
}
expj.common.viewInstanceMap.KQ0010020.<%=viewId %> = {};
expj.common.viewInstanceMap.KQ0010020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KQ0010020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KQ0010020.<%=viewId %>.init = function () {
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
    expj.KQ0010020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KQ0010020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KQ0010020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KQ0010020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KQ0010020_init">
/**
 * KQ0010020用のロード完了時初期化関数
 */
expj.KQ0010020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KQ0010020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KQ0010020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KQ0010020');
  expj.common.calendarInstanceMap.KQ0010020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KQ0010020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KQ0010020.<%=detailId %>.init();
  expj.common.detailDialogMap.KQ0010020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KQ0010020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KQ0010020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KQ0010020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KQ0010020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KQ0010020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KQ0010020-<%=detailId %>');
<%
 }
%>
  try{expj.KQ0010020.KQ0010020form1.IN_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form1.ODR_NO_PEEKER.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form1.h_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020button1.Select.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.h_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.h_ALCTED_UNCONFIRM_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.DESINATED_DLV_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.h_DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.SPCL_PRICE_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.h_SPCL_PRICE_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.ODR_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.UNIT_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.h_ODR_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.SelectUnitCost.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.CUS_DLV_KEY_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.h_CUS_DLV_KEY_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.CUS_DLV_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.h_CUS_DLV_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.REMARKS.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.PeekerDlvLocCd.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.DLV_LOC_NAME_KANJI.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.h_DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.APPR_REMARKS.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.h_APR_ODR.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020button2.Update.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020button2.Delete.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.CUST_ANAME.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.CUST_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.h_REMAIN_UNCONFIRM_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.h_SHIP_PLAN_REMAIN_QTY.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.h_ANS_DLV_DATE_EXIST_FLG.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.h_T_SHIP_ODR_EXIST_FLG.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.h_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.CUST_CHRG_PSN_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.CUST_CHRG_ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020button0.Close.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form1.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020button1.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form2.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020button2.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020form3.executeOnLoad();}catch(e){};
  try{expj.KQ0010020.KQ0010020button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KQ0010020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KQ0010020', 'KQ0010020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KQ0010020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KQ0010020-focus-move');
  // 初期フォーカス当てる処理
  $('.KQ0010020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KQ0010020', '<%=request.getContextPath() %>');
};

/**
 * KQ0010020の全体onDecision処理
 */
expj.KQ0010020.executeAllOnDecision = function () {
  expj.KQ0010020.KQ0010020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KQ0010020_console">
expj.KQ0010020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>