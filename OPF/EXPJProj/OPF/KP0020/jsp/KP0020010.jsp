<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:58:55 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KP0020\KP0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KP0020.*" %>
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
<jsp:useBean id="aKP0020010Control" class="com.nec.jp.orteus.metamorBase.KP0020.KP0020010Control" scope="request"/>
<jsp:useBean id="aKP0020010Struct" class="com.nec.jp.orteus.metamorBase.KP0020.KP0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

販売所要計画情報修正
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0020/jsp/KP0020010.jsp,v $
$Author: geng-jia $	
$Revision: 1.17 $　$Date: 2017/02/22 02:07:07 $
********************************************************* --%>
<html>
<head>
<title>販売所要計画情報修正</title>
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
<script class="expj-script-KP0020010_init">
  // KP0020010名前空間
  expj.KP0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KP0020010" data-screen="KP0020010" data-newdata="<%=aKP0020010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-KP0020010-KP0020010form1">
expj.KP0020010.KP0020010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.KP0020010.KP0020010form1.onLoad0 = function () {
  console.log('KP0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHKRQ;C@*1,*0"
expj.KP0020010.KP0020010form1.onDecision0 = function () {
  console.log('KP0020010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KP0020010', 'C')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;?KP0020010form1/IN_SALES_PLAN_CD[eq]SAME[and]?KP0020010form1/*[eq]NORMAL@*3,*2"
expj.KP0020010.KP0020010form1.onDecision1 = function () {
  console.log('KP0020010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0020010', 'KP0020010form1', '?KP0020010form1/IN_SALES_PLAN_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0020010', 'KP0020010form1', '?KP0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onDecision;2;CHK;_KP0020010form2/IN_PLN_TERM_TYP[neq]2@*5"
expj.KP0020010.KP0020010form1.onDecision2 = function () {
  console.log('KP0020010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0020010', 'KP0020010form1', '_KP0020010form2/IN_PLN_TERM_TYP'), '[neq]', '2')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script5="onDecision;3;CHK;_KP0020010form2/IN_PLN_TERM_TYP[eq]2@*6,*7"
expj.KP0020010.KP0020010form1.onDecision3 = function () {
  console.log('KP0020010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0020010', 'KP0020010form1', '_KP0020010form2/IN_PLN_TERM_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script6="onDecision;4;CHK;_KP0020010form2/IN_PLN_TERM_TYP[eq]2@*8"
expj.KP0020010.KP0020010form1.onDecision4 = function () {
  console.log('KP0020010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0020010', 'KP0020010form1', '_KP0020010form2/IN_PLN_TERM_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script7="child;0;MASK;_KP0020010button1/Select"
expj.KP0020010.KP0020010form1.child0 = function () {
  console.log('KP0020010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('KP0020010', 'KP0020010form1', '_KP0020010button1/Select');
};
// script8="child;1;UNMASK;_KP0020010button1/Select"
expj.KP0020010.KP0020010form1.child1 = function () {
  console.log('KP0020010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('KP0020010', 'KP0020010form1', '_KP0020010button1/Select');
};
// script9="child;2;MASK;_KP0020010button2/Update,_KP0020010button2/Delete"
expj.KP0020010.KP0020010form1.child2 = function () {
  console.log('KP0020010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KP0020010', 'KP0020010form1', '_KP0020010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KP0020010', 'KP0020010form1', '_KP0020010button2/Delete');
};
// script10="child;3;CHKRQ;A@*4,*2"
expj.KP0020010.KP0020010form1.child3 = function () {
  console.log('KP0020010form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('KP0020010', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script11="child;4;UNMASK;_KP0020010button2/Update,_KP0020010button2/Delete"
expj.KP0020010.KP0020010form1.child4 = function () {
  console.log('KP0020010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('KP0020010', 'KP0020010form1', '_KP0020010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('KP0020010', 'KP0020010form1', '_KP0020010button2/Delete');
};
// script12="child;5;SET;_KP0020010form2/IN_PLN_END_DATE="
expj.KP0020010.KP0020010form1.child5 = function () {
  console.log('KP0020010form1 script12');
expj.common.pscript.setReferenceComponentValue('KP0020010', 'KP0020010form1', '_KP0020010form2/IN_PLN_END_DATE', '');
};
// script13="child;6;UNMASK;_KP0020010form2/IN_PLN_END_DATE,_KP0020010form2/CalendarIN_PLN_END_DATE"
expj.KP0020010.KP0020010form1.child6 = function () {
  console.log('KP0020010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KP0020010', 'KP0020010form1', '_KP0020010form2/IN_PLN_END_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KP0020010', 'KP0020010form1', '_KP0020010form2/CalendarIN_PLN_END_DATE');
};
// script14="child;7;MASK;_KP0020010form2/IN_PLN_END_DATE,_KP0020010form2/CalendarIN_PLN_END_DATE"
expj.KP0020010.KP0020010form1.child7 = function () {
  console.log('KP0020010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('KP0020010', 'KP0020010form1', '_KP0020010form2/IN_PLN_END_DATE');
expj.common.pscript.setMaskToReferenceComponent('KP0020010', 'KP0020010form1', '_KP0020010form2/CalendarIN_PLN_END_DATE');
};
// script15="child;8;CHKRQ;B@*4,*2"
expj.KP0020010.KP0020010form1.child8 = function () {
  console.log('KP0020010form1 script15');
if (expj.common.pscript.satisfiedRequiredComponent('KP0020010', 'B')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
expj.KP0020010.KP0020010form1.executeAllOnDecision = function () {
  console.log('execute KP0020010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0020010.KP0020010form1['onDecision' + i])) {
        expj.KP0020010.KP0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.KP0020010.KP0020010form1.executeOnLoad = function () {
  expj.KP0020010.KP0020010form1.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form1.executePScriptOnLoad = function () {
  console.log('execute KP0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KP0020010.KP0020010form1['onLoad' + i])) {
      expj.KP0020010.KP0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KP0020010-KP0020010form1" action="KP0020010Servlet" name="KP0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKP0020010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SALES_PLAN_CD",rb)%></span><!-- 販売所要計画番号 --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form1-IN_SALES_PLAN_CD">
expj.KP0020010.KP0020010form1.IN_SALES_PLAN_CD = {};
expj.KP0020010.KP0020010form1.IN_SALES_PLAN_CD.executeAllOnDecision = function () {
  console.log('execute KP0020010form1/IN_SALES_PLAN_CD.onDecision');
  expj.KP0020010.KP0020010form1.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form1.IN_SALES_PLAN_CD.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form1-IN_SALES_PLAN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form1', 'IN_SALES_PLAN_CD', this);
  });
  expj.KP0020010.KP0020010form1.IN_SALES_PLAN_CD.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form1.IN_SALES_PLAN_CD.executePScriptOnLoad = function () {
  console.log('execute KP0020010form1/IN_SALES_PLAN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form1-IN_SALES_PLAN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form1-IN_SALES_PLAN_CD" name="IN_SALES_PLAN_CD" class="KP0020010-focus-move  required-value expj-KP0020010-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getIN_SALES_PLAN_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form1-SALES_PLAN_CD">
expj.KP0020010.KP0020010form1.SALES_PLAN_CD = {};
// script1="onClick;0;PEEKER;_KP0020010form1/IN_SALES_PLAN_CD@<%=contextNo%>"
expj.KP0020010.KP0020010form1.SALES_PLAN_CD.onClick0 = function () {
  console.log('SALES_PLAN_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KP0020010';
var parameterValues = 'SALES_PLAN_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KP0020010', 'KP0020010form1', '_IN_SALES_PLAN_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%SALES_PLAN_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KP0020010form1/IN_SALES_PLAN_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KP0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KP0020010.KP0020010form1.SALES_PLAN_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0020010.KP0020010form1.SALES_PLAN_CD['onClick' + i])) {
        expj.KP0020010.KP0020010form1.SALES_PLAN_CD['onClick' + i]();
      }
    }
  }
};
expj.KP0020010.KP0020010form1.SALES_PLAN_CD.executeAllOnDecision = function () {
};
expj.KP0020010.KP0020010form1.SALES_PLAN_CD.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form1-SALES_PLAN_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0020010', 'KP0020010form1', 'SALES_PLAN_CD', this, 'Button');
    }
  });
  expj.KP0020010.KP0020010form1.SALES_PLAN_CD.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form1.SALES_PLAN_CD.executePScriptOnLoad = function () {
  console.log('execute KP0020010form1/SALES_PLAN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form1-SALES_PLAN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0020010-KP0020010form1-SALES_PLAN_CD" class="KP0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KP0020010-KP0020010button1">
expj.KP0020010.KP0020010button1 = {};
expj.KP0020010.KP0020010button1.executeAllOnDecision = function () {
  console.log('execute KP0020010button1.onDecision');
};
expj.KP0020010.KP0020010button1.executeOnLoad = function () {
  expj.KP0020010.KP0020010button1.executePScriptOnLoad();
};

expj.KP0020010.KP0020010button1.executePScriptOnLoad = function () {
  console.log('execute KP0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KP0020010-KP0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KP0020010-KP0020010button1-Select">
expj.KP0020010.KP0020010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KP0020010form1/*@KP0020010Servlet"
expj.KP0020010.KP0020010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0020010', 'KP0020010button1', '_KP0020010form1/*', 'KP0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0020010', response);
expj.common.updateBusinessScreenTab('KP0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KP0020010.KP0020010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0020010.KP0020010button1.Select['onClick' + i])) {
        expj.KP0020010.KP0020010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KP0020010.KP0020010button1.Select.executeAllOnDecision = function () {
};
expj.KP0020010.KP0020010button1.Select.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0020010', 'KP0020010button1', 'Select', this, 'Button');
    }
  });
  expj.KP0020010.KP0020010button1.Select.executePScriptOnLoad();
};

expj.KP0020010.KP0020010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KP0020010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0020010-KP0020010button1-Select" name="Select" class="KP0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KP0020010-KP0020010form2">
expj.KP0020010.KP0020010form2 = {};
expj.KP0020010.KP0020010form2.executeAllOnDecision = function () {
  console.log('execute KP0020010form2.onDecision');
};
expj.KP0020010.KP0020010form2.executeOnLoad = function () {
  expj.KP0020010.KP0020010form2.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form2.executePScriptOnLoad = function () {
  console.log('execute KP0020010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KP0020010-KP0020010form2" action="KP0020010Servlet" name="KP0020010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:center"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form2-chkADD_TO_OD">
expj.KP0020010.KP0020010form2.chkADD_TO_OD = {};
expj.KP0020010.KP0020010form2.chkADD_TO_OD.executeAllOnDecision = function () {
  console.log('execute KP0020010form2/chkADD_TO_OD.onDecision');
  expj.KP0020010.KP0020010form2.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form2.chkADD_TO_OD.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form2-chkADD_TO_OD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0020010', 'KP0020010form2', 'chkADD_TO_OD', this, 'CheckBox');
    }
  });
  expj.KP0020010.KP0020010form2.chkADD_TO_OD.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form2.chkADD_TO_OD.executePScriptOnLoad = function () {
  console.log('execute KP0020010form2/chkADD_TO_OD.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form2-chkADD_TO_OD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="chkADD_TO_OD" value="true" <%= ("true".equals(TypeConverter.convert(aKP0020010Struct.getchkADD_TO_OD())) || "1".equals(TypeConverter.convert(aKP0020010Struct.getchkADD_TO_OD())))?"checked=\"checked\"":"" %>  class="KP0020010-focus-move" id="expj-KP0020010-KP0020010form2-chkADD_TO_OD"><label for="expj-KP0020010-KP0020010form2-chkADD_TO_OD"><%=CoreTools.getRBString("Expj.Cmt0272",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLN_QTY",rb)%></span><!-- 計画数 --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form2-IN_PLN_QTY">
expj.KP0020010.KP0020010form2.IN_PLN_QTY = {};
expj.KP0020010.KP0020010form2.IN_PLN_QTY.executeAllOnDecision = function () {
  console.log('execute KP0020010form2/IN_PLN_QTY.onDecision');
  expj.KP0020010.KP0020010form2.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form2.IN_PLN_QTY.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form2-IN_PLN_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form2', 'IN_PLN_QTY', this);
  });
  expj.KP0020010.KP0020010form2.IN_PLN_QTY.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form2.IN_PLN_QTY.executePScriptOnLoad = function () {
  console.log('execute KP0020010form2/IN_PLN_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form2-IN_PLN_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form2-IN_PLN_QTY" name="IN_PLN_QTY" class="KP0020010-focus-move  required-value expj-KP0020010-required-A" style="width:100%;text-align: right;" data-kind="OBT_NUMBER_Z;14.0;CEIL;4" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getIN_PLN_QTY()) %>" maxlength="19" ></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form2-STOCK_UNIT">
expj.KP0020010.KP0020010form2.STOCK_UNIT = {};
expj.KP0020010.KP0020010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute KP0020010form2/STOCK_UNIT.onDecision');
  expj.KP0020010.KP0020010form2.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form2', 'STOCK_UNIT', this);
  });
  expj.KP0020010.KP0020010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute KP0020010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form2-STOCK_UNIT" name="STOCK_UNIT" class="KP0020010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getSTOCK_UNIT()) %>" maxlength="35" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLN_TERM_TYP",rb)%></span><!-- 計画期間タイプ --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form2-IN_PLN_TERM_TYP">
expj.KP0020010.KP0020010form2.IN_PLN_TERM_TYP = {};
expj.KP0020010.KP0020010form2.IN_PLN_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute KP0020010form2/IN_PLN_TERM_TYP.onDecision');
  expj.KP0020010.KP0020010form2.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form2.IN_PLN_TERM_TYP.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form2-IN_PLN_TERM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KP0020010', 'KP0020010form2', 'IN_PLN_TERM_TYP', this);
  });
  expj.KP0020010.KP0020010form2.IN_PLN_TERM_TYP.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form2.IN_PLN_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute KP0020010form2/IN_PLN_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form2-IN_PLN_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KP0020010-KP0020010form2-IN_PLN_TERM_TYP" name='IN_PLN_TERM_TYP' class='KP0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKP0020010Control.getStruct().getList_IN_PLN_TERM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKP0020010Control.getStruct().getList_IN_PLN_TERM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKP0020010Control.getStruct().getList_IN_PLN_TERM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKP0020010Struct.getIN_PLN_TERM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0746",rb)%></span><!-- 計画期間 --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form2-IN_PLN_STR_DATE">
expj.KP0020010.KP0020010form2.IN_PLN_STR_DATE = {};
expj.KP0020010.KP0020010form2.IN_PLN_STR_DATE.executeAllOnDecision = function () {
  console.log('execute KP0020010form2/IN_PLN_STR_DATE.onDecision');
  expj.KP0020010.KP0020010form2.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form2.IN_PLN_STR_DATE.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form2-IN_PLN_STR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form2', 'IN_PLN_STR_DATE', this);
  });
  expj.KP0020010.KP0020010form2.IN_PLN_STR_DATE.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form2.IN_PLN_STR_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0020010form2/IN_PLN_STR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form2-IN_PLN_STR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form2-IN_PLN_STR_DATE" name="IN_PLN_STR_DATE" class="KP0020010-focus-move  required-value expj-KP0020010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getIN_PLN_STR_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form2-CalendarIN_PLN_STR_DATE">
expj.KP0020010.KP0020010form2.CalendarIN_PLN_STR_DATE = {};
// script1="onClick;0;CALENDAR;_KP0020010form2/IN_PLN_STR_DATE"
expj.KP0020010.KP0020010form2.CalendarIN_PLN_STR_DATE.onClick0 = function () {
  console.log('CalendarIN_PLN_STR_DATE script1');
expj.common.pscript.executeCalendar('KP0020010','KP0020010form2','_KP0020010form2/IN_PLN_STR_DATE');
};
expj.KP0020010.KP0020010form2.CalendarIN_PLN_STR_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0020010.KP0020010form2.CalendarIN_PLN_STR_DATE['onClick' + i])) {
        expj.KP0020010.KP0020010form2.CalendarIN_PLN_STR_DATE['onClick' + i]();
      }
    }
  }
};
expj.KP0020010.KP0020010form2.CalendarIN_PLN_STR_DATE.executeAllOnDecision = function () {
};
expj.KP0020010.KP0020010form2.CalendarIN_PLN_STR_DATE.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form2-CalendarIN_PLN_STR_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0020010', 'KP0020010form2', 'CalendarIN_PLN_STR_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KP0020010','KP0020010form2','_KP0020010form2/IN_PLN_STR_DATE');
  expj.KP0020010.KP0020010form2.CalendarIN_PLN_STR_DATE.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form2.CalendarIN_PLN_STR_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0020010form2/CalendarIN_PLN_STR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form2-CalendarIN_PLN_STR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0020010-KP0020010form2-CalendarIN_PLN_STR_DATE" class="KP0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form2-IN_PLN_END_DATE">
expj.KP0020010.KP0020010form2.IN_PLN_END_DATE = {};
expj.KP0020010.KP0020010form2.IN_PLN_END_DATE.executeAllOnDecision = function () {
  console.log('execute KP0020010form2/IN_PLN_END_DATE.onDecision');
  expj.KP0020010.KP0020010form2.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form2.IN_PLN_END_DATE.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form2-IN_PLN_END_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form2', 'IN_PLN_END_DATE', this);
  });
  expj.KP0020010.KP0020010form2.IN_PLN_END_DATE.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form2.IN_PLN_END_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0020010form2/IN_PLN_END_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form2-IN_PLN_END_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form2-IN_PLN_END_DATE" name="IN_PLN_END_DATE" class="KP0020010-focus-move  required-value expj-KP0020010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getIN_PLN_END_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form2-CalendarIN_PLN_END_DATE">
expj.KP0020010.KP0020010form2.CalendarIN_PLN_END_DATE = {};
// script1="onClick;0;CALENDAR;_KP0020010form2/IN_PLN_END_DATE"
expj.KP0020010.KP0020010form2.CalendarIN_PLN_END_DATE.onClick0 = function () {
  console.log('CalendarIN_PLN_END_DATE script1');
expj.common.pscript.executeCalendar('KP0020010','KP0020010form2','_KP0020010form2/IN_PLN_END_DATE');
};
expj.KP0020010.KP0020010form2.CalendarIN_PLN_END_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0020010.KP0020010form2.CalendarIN_PLN_END_DATE['onClick' + i])) {
        expj.KP0020010.KP0020010form2.CalendarIN_PLN_END_DATE['onClick' + i]();
      }
    }
  }
};
expj.KP0020010.KP0020010form2.CalendarIN_PLN_END_DATE.executeAllOnDecision = function () {
};
expj.KP0020010.KP0020010form2.CalendarIN_PLN_END_DATE.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form2-CalendarIN_PLN_END_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0020010', 'KP0020010form2', 'CalendarIN_PLN_END_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KP0020010','KP0020010form2','_KP0020010form2/IN_PLN_END_DATE');
  expj.KP0020010.KP0020010form2.CalendarIN_PLN_END_DATE.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form2.CalendarIN_PLN_END_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0020010form2/CalendarIN_PLN_END_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form2-CalendarIN_PLN_END_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0020010-KP0020010form2-CalendarIN_PLN_END_DATE" class="KP0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-KP0020010-KP0020010button2">
expj.KP0020010.KP0020010button2 = {};
expj.KP0020010.KP0020010button2.executeAllOnDecision = function () {
  console.log('execute KP0020010button2.onDecision');
};
expj.KP0020010.KP0020010button2.executeOnLoad = function () {
  expj.KP0020010.KP0020010button2.executePScriptOnLoad();
};

expj.KP0020010.KP0020010button2.executePScriptOnLoad = function () {
  console.log('execute KP0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KP0020010-KP0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KP0020010-KP0020010button2-Update">
expj.KP0020010.KP0020010button2.Update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KP0020010form1/*,_KP0020010form2/*,_KP0020010form3/*@KP0020010Servlet,,$ZZ07003"
expj.KP0020010.KP0020010button2.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0020010', 'KP0020010button2', '_KP0020010form1/*,_KP0020010form2/*,_KP0020010form3/*', 'KP0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0020010', response);
expj.common.updateBusinessScreenTab('KP0020010', contents);
};
expj.common.pscript.callConfirm('KP0020010', 'KP0020010button2', 'ZZ07003', okEvent);
};
expj.KP0020010.KP0020010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0020010.KP0020010button2.Update['onClick' + i])) {
        expj.KP0020010.KP0020010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.KP0020010.KP0020010button2.Update.executeAllOnDecision = function () {
};
expj.KP0020010.KP0020010button2.Update.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0020010', 'KP0020010button2', 'Update', this, 'Button');
    }
  });
  expj.KP0020010.KP0020010button2.Update.executePScriptOnLoad();
};

expj.KP0020010.KP0020010button2.Update.executePScriptOnLoad = function () {
  console.log('execute KP0020010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0020010-KP0020010button2-Update" name="Update" class="KP0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010button2-Delete">
expj.KP0020010.KP0020010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KP0020010form1/*,_KP0020010form2/*,_KP0020010form3/*@KP0020010Servlet,,$ZZ07004"
expj.KP0020010.KP0020010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0020010', 'KP0020010button2', '_KP0020010form1/*,_KP0020010form2/*,_KP0020010form3/*', 'KP0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0020010', response);
expj.common.updateBusinessScreenTab('KP0020010', contents);
};
expj.common.pscript.callConfirm('KP0020010', 'KP0020010button2', 'ZZ07004', okEvent);
};
expj.KP0020010.KP0020010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0020010.KP0020010button2.Delete['onClick' + i])) {
        expj.KP0020010.KP0020010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.KP0020010.KP0020010button2.Delete.executeAllOnDecision = function () {
};
expj.KP0020010.KP0020010button2.Delete.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0020010', 'KP0020010button2', 'Delete', this, 'Button');
    }
  });
  expj.KP0020010.KP0020010button2.Delete.executePScriptOnLoad();
};

expj.KP0020010.KP0020010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute KP0020010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0020010-KP0020010button2-Delete" name="Delete" class="KP0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KP0020010-KP0020010form3">
expj.KP0020010.KP0020010form3 = {};
expj.KP0020010.KP0020010form3.executeAllOnDecision = function () {
  console.log('execute KP0020010form3.onDecision');
};
expj.KP0020010.KP0020010form3.executeOnLoad = function () {
  expj.KP0020010.KP0020010form3.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form3.executePScriptOnLoad = function () {
  console.log('execute KP0020010form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KP0020010-KP0020010form3" action="KP0020010Servlet" name="KP0020010form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:115px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:115px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form3-CUST_CD">
expj.KP0020010.KP0020010form3.CUST_CD = {};
expj.KP0020010.KP0020010form3.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KP0020010form3/CUST_CD.onDecision');
  expj.KP0020010.KP0020010form3.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form3.CUST_CD.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form3-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form3', 'CUST_CD', this);
  });
  expj.KP0020010.KP0020010form3.CUST_CD.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form3.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KP0020010form3/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form3-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form3-CUST_CD" name="CUST_CD" class="KP0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getCUST_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form3-CUST_ANAME">
expj.KP0020010.KP0020010form3.CUST_ANAME = {};
expj.KP0020010.KP0020010form3.CUST_ANAME.executeAllOnDecision = function () {
  console.log('execute KP0020010form3/CUST_ANAME.onDecision');
  expj.KP0020010.KP0020010form3.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form3.CUST_ANAME.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form3-CUST_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form3', 'CUST_ANAME', this);
  });
  expj.KP0020010.KP0020010form3.CUST_ANAME.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form3.CUST_ANAME.executePScriptOnLoad = function () {
  console.log('execute KP0020010form3/CUST_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form3-CUST_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form3-CUST_ANAME" name="CUST_ANAME" class="KP0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getCUST_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form3-CUST_ITEM_CD">
expj.KP0020010.KP0020010form3.CUST_ITEM_CD = {};
expj.KP0020010.KP0020010form3.CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KP0020010form3/CUST_ITEM_CD.onDecision');
  expj.KP0020010.KP0020010form3.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form3.CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form3-CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form3', 'CUST_ITEM_CD', this);
  });
  expj.KP0020010.KP0020010form3.CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form3.CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KP0020010form3/CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form3-CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form3-CUST_ITEM_CD" name="CUST_ITEM_CD" class="KP0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getCUST_ITEM_CD()) %>" maxlength="35" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form3-CUST_ITEM_NAME">
expj.KP0020010.KP0020010form3.CUST_ITEM_NAME = {};
expj.KP0020010.KP0020010form3.CUST_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KP0020010form3/CUST_ITEM_NAME.onDecision');
  expj.KP0020010.KP0020010form3.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form3.CUST_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form3-CUST_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form3', 'CUST_ITEM_NAME', this);
  });
  expj.KP0020010.KP0020010form3.CUST_ITEM_NAME.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form3.CUST_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KP0020010form3/CUST_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form3-CUST_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form3-CUST_ITEM_NAME" name="CUST_ITEM_NAME" class="KP0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getCUST_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form3-ITEM_CD">
expj.KP0020010.KP0020010form3.ITEM_CD = {};
expj.KP0020010.KP0020010form3.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KP0020010form3/ITEM_CD.onDecision');
  expj.KP0020010.KP0020010form3.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form3.ITEM_CD.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form3-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form3', 'ITEM_CD', this);
  });
  expj.KP0020010.KP0020010form3.ITEM_CD.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form3.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KP0020010form3/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form3-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form3-ITEM_CD" name="ITEM_CD" class="KP0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form3-ITEM_NAME">
expj.KP0020010.KP0020010form3.ITEM_NAME = {};
expj.KP0020010.KP0020010form3.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KP0020010form3/ITEM_NAME.onDecision');
  expj.KP0020010.KP0020010form3.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form3.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form3-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form3', 'ITEM_NAME', this);
  });
  expj.KP0020010.KP0020010form3.ITEM_NAME.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form3.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KP0020010form3/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form3-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form3-ITEM_NAME" name="ITEM_NAME" class="KP0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form3-DLV_LOC_CD">
expj.KP0020010.KP0020010form3.DLV_LOC_CD = {};
expj.KP0020010.KP0020010form3.DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KP0020010form3/DLV_LOC_CD.onDecision');
  expj.KP0020010.KP0020010form3.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form3.DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form3-DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form3', 'DLV_LOC_CD', this);
  });
  expj.KP0020010.KP0020010form3.DLV_LOC_CD.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form3.DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KP0020010form3/DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form3-DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form3-DLV_LOC_CD" name="DLV_LOC_CD" class="KP0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getDLV_LOC_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form3-DLV_LOC_NAME">
expj.KP0020010.KP0020010form3.DLV_LOC_NAME = {};
expj.KP0020010.KP0020010form3.DLV_LOC_NAME.executeAllOnDecision = function () {
  console.log('execute KP0020010form3/DLV_LOC_NAME.onDecision');
  expj.KP0020010.KP0020010form3.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form3.DLV_LOC_NAME.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form3-DLV_LOC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form3', 'DLV_LOC_NAME', this);
  });
  expj.KP0020010.KP0020010form3.DLV_LOC_NAME.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form3.DLV_LOC_NAME.executePScriptOnLoad = function () {
  console.log('execute KP0020010form3/DLV_LOC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form3-DLV_LOC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form3-DLV_LOC_NAME" name="DLV_LOC_NAME" class="KP0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getDLV_LOC_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLN_CD",rb)%></span><!-- EDI計画番号 --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010form3-PLN_CD">
expj.KP0020010.KP0020010form3.PLN_CD = {};
expj.KP0020010.KP0020010form3.PLN_CD.executeAllOnDecision = function () {
  console.log('execute KP0020010form3/PLN_CD.onDecision');
  expj.KP0020010.KP0020010form3.executeAllOnDecision();
  expj.KP0020010.executeAllOnDecision();
};
expj.KP0020010.KP0020010form3.PLN_CD.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010form3-PLN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0020010', 'KP0020010form3', 'PLN_CD', this);
  });
  expj.KP0020010.KP0020010form3.PLN_CD.executePScriptOnLoad();
};

expj.KP0020010.KP0020010form3.PLN_CD.executePScriptOnLoad = function () {
  console.log('execute KP0020010form3/PLN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010form3-PLN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0020010-KP0020010form3-PLN_CD" name="PLN_CD" class="KP0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0020010Struct.getPLN_CD()) %>" maxlength="35" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-left" style="width:60px;"></div><!--/td-->
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
<span class="version">KP0020010 Revision: 1.9  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KP0020010-KP0020010button0">
expj.KP0020010.KP0020010button0 = {};
expj.KP0020010.KP0020010button0.executeAllOnDecision = function () {
  console.log('execute KP0020010button0.onDecision');
};
expj.KP0020010.KP0020010button0.executeOnLoad = function () {
  expj.KP0020010.KP0020010button0.executePScriptOnLoad();
};

expj.KP0020010.KP0020010button0.executePScriptOnLoad = function () {
  console.log('execute KP0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KP0020010-KP0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KP0020010-KP0020010button0-Clear">
expj.KP0020010.KP0020010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KP0020010Servlet,,$ZZ07008"
expj.KP0020010.KP0020010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0020010', 'KP0020010button0', '', 'KP0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0020010', response);
expj.common.updateBusinessScreenTab('KP0020010', contents);
};
expj.common.pscript.callConfirm('KP0020010', 'KP0020010button0', 'ZZ07008', okEvent);
};
expj.KP0020010.KP0020010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0020010.KP0020010button0.Clear['onClick' + i])) {
        expj.KP0020010.KP0020010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KP0020010.KP0020010button0.Clear.executeAllOnDecision = function () {
};
expj.KP0020010.KP0020010button0.Clear.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0020010', 'KP0020010button0', 'Clear', this, 'Button');
    }
  });
  expj.KP0020010.KP0020010button0.Clear.executePScriptOnLoad();
};

expj.KP0020010.KP0020010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KP0020010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0020010-KP0020010button0-Clear" name="Clear" class="KP0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KP0020010-KP0020010button0-Close">
expj.KP0020010.KP0020010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KP0020010.KP0020010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KP0020010');
};
expj.KP0020010.KP0020010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0020010.KP0020010button0.Close['onClick' + i])) {
        expj.KP0020010.KP0020010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KP0020010.KP0020010button0.Close.executeAllOnDecision = function () {
};
expj.KP0020010.KP0020010button0.Close.executeOnLoad = function () {
  $('#expj-KP0020010-KP0020010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0020010', 'KP0020010button0', 'Close', this, 'Button');
    }
  });
  expj.KP0020010.KP0020010button0.Close.executePScriptOnLoad();
};

expj.KP0020010.KP0020010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KP0020010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KP0020010-KP0020010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0020010-KP0020010button0-Close" name="Close" class="KP0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KP0020010 (END)-->
<%
MessageStruct msgStruct = aKP0020010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KP0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KP0020010)) {
  expj.common.treeInstanceMap.KP0020010 = {};
}
expj.common.treeInstanceMap.KP0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KP0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KP0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KP0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KP0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KP0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KP0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KP0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KP0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KP0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KP0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0020010)) {
  expj.common.detailDialogMap.KP0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KP0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.KP0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KP0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KP0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KP0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KP0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KP0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KP0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KP0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KP0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KP0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KP0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KP0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KP0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KP0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KP0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KP0020010)) {
  expj.common.viewInstanceMap.KP0020010 = {};
}
expj.common.viewInstanceMap.KP0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.KP0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KP0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KP0020010.<%=viewId %>.init = function () {
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
    expj.KP0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KP0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KP0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KP0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KP0020010_init">
/**
 * KP0020010用のロード完了時初期化関数
 */
expj.KP0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KP0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KP0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KP0020010');
  expj.common.calendarInstanceMap.KP0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KP0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KP0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.KP0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KP0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KP0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KP0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KP0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KP0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KP0020010-<%=detailId %>');
<%
 }
%>
  try{expj.KP0020010.KP0020010form1.IN_SALES_PLAN_CD.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form1.SALES_PLAN_CD.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form2.chkADD_TO_OD.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form2.IN_PLN_QTY.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form2.IN_PLN_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form2.IN_PLN_STR_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form2.CalendarIN_PLN_STR_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form2.IN_PLN_END_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form2.CalendarIN_PLN_END_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010button2.Update.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form3.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form3.CUST_ANAME.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form3.CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form3.CUST_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form3.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form3.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form3.DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form3.DLV_LOC_NAME.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form3.PLN_CD.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form1.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010button1.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form2.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010button2.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010form3.executeOnLoad();}catch(e){};
  try{expj.KP0020010.KP0020010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KP0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KP0020010', 'KP0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KP0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KP0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.KP0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KP0020010', '<%=request.getContextPath() %>');
};

/**
 * KP0020010の全体onDecision処理
 */
expj.KP0020010.executeAllOnDecision = function () {
  expj.KP0020010.KP0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KP0020010_console">
expj.KP0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>