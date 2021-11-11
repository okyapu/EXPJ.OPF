<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:30:33 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0030\AD0030020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0030.*" %>
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
<jsp:useBean id="aAD0030020Control" class="com.nec.jp.orteus.metamorBase.AD0030.AD0030020Control" scope="request"/>
<jsp:useBean id="aAD0030020Struct" class="com.nec.jp.orteus.metamorBase.AD0030.AD0030020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

系列別作業計画メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/jsp/AD0030020.jsp,v $
$Author: geng-jia $	
$Revision: 1.23 $ $Date: 2017/02/22 02:04:43 $
********************************************************* --%>
<html>
<head>
<title>系列別作業計画メンテナンス</title>
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
<script class="expj-script-AD0030020_init">
  // AD0030020名前空間
  expj.AD0030020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AD0030020" data-screen="AD0030020" data-newdata="<%=aAD0030020Control.isNewData() %>">
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
              <script class="expj-script-AD0030020-AD0030020form1">
expj.AD0030020.AD0030020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AD0030020.AD0030020form1.onLoad0 = function () {
  console.log('AD0030020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*3"
expj.AD0030020.AD0030020form1.onDecision0 = function () {
  console.log('AD0030020form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="onDecision;1;CHK;?AD0030020form1/*[neq]NORMAL[and]?AD0030020form1/*[neq]TOO_MANY@*4,*6"
expj.AD0030020.AD0030020form1.onDecision1 = function () {
  console.log('AD0030020form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020form1', '?AD0030020form1/*'), '[neq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020form1', '?AD0030020form1/*'), '[neq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script4="onDecision;2;CHKRQ;?AD0030020view1/?[eq]SINGLE@*7,*5"
expj.AD0030020.AD0030020form1.onDecision2 = function () {
  console.log('AD0030020form1 script4');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020form1', '?AD0030020view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script5="child;0;UNMASK;_AD0030020button1/Select"
expj.AD0030020.AD0030020form1.child0 = function () {
  console.log('AD0030020form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button1/Select');
};
// script6="child;1;UNMASK;_AD0030020button2/LineInsert"
expj.AD0030020.AD0030020form1.child1 = function () {
  console.log('AD0030020form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineInsert');
};
// script7="child;2;UNMASK;_AD0030020button2/LineUpdate,_AD0030020button2/LineCopy,_AD0030020button2/LineDelete"
expj.AD0030020.AD0030020form1.child2 = function () {
  console.log('AD0030020form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineCopy');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineDelete');
};
// script8="child;3;MASK;_AD0030020button1/Select"
expj.AD0030020.AD0030020form1.child3 = function () {
  console.log('AD0030020form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button1/Select');
};
// script9="child;4;MASK;_AD0030020button2/LineInsert"
expj.AD0030020.AD0030020form1.child4 = function () {
  console.log('AD0030020form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineInsert');
};
// script10="child;5;MASK;_AD0030020button2/LineUpdate,_AD0030020button2/LineCopy,_AD0030020button2/LineDelete"
expj.AD0030020.AD0030020form1.child5 = function () {
  console.log('AD0030020form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineDelete');
};
// script11="child;6;CHK;?AD0030020form1/WORK_ODR_CD[eq]SAME@*8,*4"
expj.AD0030020.AD0030020form1.child6 = function () {
  console.log('AD0030020form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020form1', '?AD0030020form1/WORK_ODR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script12="child;7;CHK;?AD0030020form1/WORK_ODR_CD[eq]SAME@*9,*5"
expj.AD0030020.AD0030020form1.child7 = function () {
  console.log('AD0030020form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020form1', '?AD0030020form1/WORK_ODR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script13="child;8;CHK;_AD0030020form2/h_MANHOUR_TYP[eq]1@*4,*1"
expj.AD0030020.AD0030020form1.child8 = function () {
  console.log('AD0030020form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020form1', '_AD0030020form2/h_MANHOUR_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script14="child;9;CHK;_AD0030020form2/h_MANHOUR_TYP[eq]1@*10,*2"
expj.AD0030020.AD0030020form1.child9 = function () {
  console.log('AD0030020form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020form1', '_AD0030020form2/h_MANHOUR_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script15="child;10;UNMASK;_AD0030020button2/LineUpdate@*11"
expj.AD0030020.AD0030020form1.child10 = function () {
  console.log('AD0030020form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineUpdate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script16="child;11;MASK;_AD0030020button2/LineInsert,_AD0030020button2/LineCopy,_AD0030020button2/LineDelete"
expj.AD0030020.AD0030020form1.child11 = function () {
  console.log('AD0030020form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineInsert');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030020form1', '_AD0030020button2/LineDelete');
};
expj.AD0030020.AD0030020form1.executeAllOnDecision = function () {
  console.log('execute AD0030020form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030020form1['onDecision' + i])) {
        expj.AD0030020.AD0030020form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030020form1.executeOnLoad = function () {
  expj.AD0030020.AD0030020form1.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form1.executePScriptOnLoad = function () {
  console.log('execute AD0030020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0030020.AD0030020form1['onLoad' + i])) {
      expj.AD0030020.AD0030020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0030020-AD0030020form1" action="AD0030020Servlet" name="AD0030020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0030020Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WORK_ODR_CD",rb)%></span><!-- 作業計画番号 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form1-WORK_ODR_CD">
expj.AD0030020.AD0030020form1.WORK_ODR_CD = {};
expj.AD0030020.AD0030020form1.WORK_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0030020form1/WORK_ODR_CD.onDecision');
  expj.AD0030020.AD0030020form1.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form1.WORK_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form1-WORK_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form1', 'WORK_ODR_CD', this);
  });
  expj.AD0030020.AD0030020form1.WORK_ODR_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form1.WORK_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030020form1/WORK_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form1-WORK_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form1-WORK_ODR_CD" name="WORK_ODR_CD" class="AD0030020-focus-move  required-value expj-AD0030020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getWORK_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form1-PeekerWorkOdrCd">
expj.AD0030020.AD0030020form1.PeekerWorkOdrCd = {};
// script1="onClick;0;PEEKER;_AD0030020form1/WORK_ODR_CD@<%=contextNo%>"
expj.AD0030020.AD0030020form1.PeekerWorkOdrCd.onClick0 = function () {
  console.log('PeekerWorkOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030020';
var parameterValues = 'PeekerWorkOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0030020', 'PeekerWorkOdrCd', 'SQLPARAM_1', '<%=aAD0030020Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020form1', '_WORK_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WORK_ODR_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030020form1/WORK_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030020.AD0030020form1.PeekerWorkOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030020form1.PeekerWorkOdrCd['onClick' + i])) {
        expj.AD0030020.AD0030020form1.PeekerWorkOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030020form1.PeekerWorkOdrCd.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030020form1.PeekerWorkOdrCd.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form1-PeekerWorkOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030020form1', 'PeekerWorkOdrCd', this, 'Button');
    }
  });
  expj.AD0030020.AD0030020form1.PeekerWorkOdrCd.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form1.PeekerWorkOdrCd.executePScriptOnLoad = function () {
  console.log('execute AD0030020form1/PeekerWorkOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form1-PeekerWorkOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030020-AD0030020form1-PeekerWorkOdrCd" class="AD0030020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0030020-AD0030020button1">
expj.AD0030020.AD0030020button1 = {};
expj.AD0030020.AD0030020button1.executeAllOnDecision = function () {
  console.log('execute AD0030020button1.onDecision');
};
expj.AD0030020.AD0030020button1.executeOnLoad = function () {
  expj.AD0030020.AD0030020button1.executePScriptOnLoad();
};

expj.AD0030020.AD0030020button1.executePScriptOnLoad = function () {
  console.log('execute AD0030020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030020-AD0030020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030020-AD0030020button1-Select">
expj.AD0030020.AD0030020button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030020form1/WORK_ODR_CD@AD0030020Servlet"
expj.AD0030020.AD0030020button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030020', 'AD0030020button1', '_AD0030020form1/WORK_ODR_CD', 'AD0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030020', response);
expj.common.updateBusinessScreenTab('AD0030020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0030020.AD0030020button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030020button1.Select['onClick' + i])) {
        expj.AD0030020.AD0030020button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030020button1.Select.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030020button1.Select.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030020button1', 'Select', this, 'Button');
    }
  });
  expj.AD0030020.AD0030020button1.Select.executePScriptOnLoad();
};

expj.AD0030020.AD0030020button1.Select.executePScriptOnLoad = function () {
  console.log('execute AD0030020button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030020-AD0030020button1-Select" name="Select" class="AD0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0030020-AD0030020view1">
expj.AD0030020.AD0030020view1 = {};
expj.AD0030020.AD0030020view1.executeAllOnClick = function () {
};
expj.AD0030020.AD0030020view1.executeAllOnDecision = function () {
  console.log('execute AD0030020view1.onDecision');
};
expj.AD0030020.AD0030020view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0030020view1", "expj.AD0030020.AD0030020view1.executeAllOnClick");
%>
  expj.AD0030020.AD0030020view1.executePScriptOnLoad();
};

expj.AD0030020.AD0030020view1.executePScriptOnLoad = function () {
  console.log('execute AD0030020view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0030020-AD0030020view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0030020view1_Id = "AD0030020view1";
 String AD0030020view1_select = "single";
 String AD0030020view1_sortable = "true";
 String AD0030020view1_resize = "true";
 String AD0030020view1_scroll = "true";
 StringBuffer AD0030020view1_HB = new StringBuffer();
 StringBuffer AD0030020view1_DB = new StringBuffer();
%>
<%
 AD0030020view1_select = "single";
 AD0030020view1_sortable = "true";
 AD0030020view1_resize = "true";
 AD0030020view1_scroll = "true";
%>
<%
 AD0030020view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
%>
     
<%
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb))).append("', 'name':'WORK_IN_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NAME",rb))).append("', 'name':'PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NO",rb))).append("', 'name':'PROC_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_7",rb))).append("', 'name':'WORK_ODR_DLV_DATE_BY_PROC', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_START_DATE_7",rb))).append("', 'name':'OPR_INST_START_DATE_BY_PROC', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_QTY",rb))).append("', 'name':'OPR_INST_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb))).append("', 'name':'OUTSIDE_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_CD",rb))).append("', 'name':'OPR_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_WORK_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT_BY_ITEM', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT_BY_PROC', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
AD0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT_OPR_INST', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0030020view1_sortable).append("}").append(",");
%>
<%
 int aAD0030020StructLength = aAD0030020Control.getListsize();
 final AD0030020Struct structBackup = aAD0030020Struct;
 aAD0030020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0030020StructLength; ++loopCount) {
  if((aAD0030020Struct = (AD0030020Struct) aAD0030020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0030020Struct", aAD0030020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0030020view1_DB.append("[");
 AD0030020view1_DB.append(loopCount);
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-WORK_IN_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-WORK_IN_PROC_CD\" data-name=\"WORK_IN_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.getWORK_IN_PROC_CD())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-PROC_NAME\" data-name=\"PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.getPROC_NAME())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-PROC_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-PROC_NO\" data-name=\"PROC_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER_Z;6;;\">").append(TypeConverter.sanitizer(aAD0030020Struct.getPROC_NO())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-WORK_ODR_DLV_DATE_BY_PROC-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-WORK_ODR_DLV_DATE_BY_PROC\" data-name=\"WORK_ODR_DLV_DATE_BY_PROC\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.getWORK_ODR_DLV_DATE_BY_PROC())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-OPR_INST_START_DATE_BY_PROC-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-OPR_INST_START_DATE_BY_PROC\" data-name=\"OPR_INST_START_DATE_BY_PROC\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.getOPR_INST_START_DATE_BY_PROC())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-OPR_INST_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-OPR_INST_QTY\" data-name=\"OPR_INST_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aAD0030020Struct.getOPR_INST_QTY())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-OUTSIDE_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-OUTSIDE_TYP_DN\" data-name=\"OUTSIDE_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.getOUTSIDE_TYP_DN())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-OUTSIDE_TYP\" data-name=\"OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.getOUTSIDE_TYP())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-WS_CD\" data-name=\"WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.getWS_CD())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.getVEND_CD())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-OPR_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-OPR_INST_CD\" data-name=\"OPR_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.getOPR_INST_CD())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-h_WORK_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-h_WORK_STS_TYP\" data-name=\"h_WORK_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.geth_WORK_STS_TYP())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-h_OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-h_OD_NO\" data-name=\"h_OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.geth_OD_NO())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-h_MODIFY_COUNT_BY_ITEM-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-h_MODIFY_COUNT_BY_ITEM\" data-name=\"h_MODIFY_COUNT_BY_ITEM\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.geth_MODIFY_COUNT_BY_ITEM())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-h_MODIFY_COUNT_BY_PROC-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-h_MODIFY_COUNT_BY_PROC\" data-name=\"h_MODIFY_COUNT_BY_PROC\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.geth_MODIFY_COUNT_BY_PROC())).append("</span>'");
 AD0030020view1_DB.append(",").append("'<span id=\"expj-AD0030020-AD0030020view1-h_MODIFY_COUNT_OPR_INST-").append(loopCount).append("\" class=\"expj-label expj-AD0030020-AD0030020view1-h_MODIFY_COUNT_OPR_INST\" data-name=\"h_MODIFY_COUNT_OPR_INST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030020Struct.geth_MODIFY_COUNT_OPR_INST())).append("</span>'");
 AD0030020view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0030020StructLength) {
   AD0030020view1_DB.append(",");
  }
 }
 aAD0030020Struct = structBackup;
 viewIdList.add(AD0030020view1_Id);
 viewSelectList.add(AD0030020view1_select);
 viewResizeList.add(AD0030020view1_resize);
 viewScrollList.add(AD0030020view1_scroll);
 viewHeaderDataList.add(AD0030020view1_HB);
 viewBodyDataList.add(AD0030020view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-AD0030020-AD0030020button2">
expj.AD0030020.AD0030020button2 = {};
expj.AD0030020.AD0030020button2.executeAllOnDecision = function () {
  console.log('execute AD0030020button2.onDecision');
};
expj.AD0030020.AD0030020button2.executeOnLoad = function () {
  expj.AD0030020.AD0030020button2.executePScriptOnLoad();
};

expj.AD0030020.AD0030020button2.executePScriptOnLoad = function () {
  console.log('execute AD0030020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030020-AD0030020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030020-AD0030020button2-LineInsert">
expj.AD0030020.AD0030020button2.LineInsert = {};
// script1="onClick;0;CHK;_AD0030020form2/h_WORK_STS_TYP[eq]2@!AD00086"
expj.AD0030020.AD0030020button2.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020button2', '_AD0030020form2/h_WORK_STS_TYP'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030020', 'AD0030020button2', 'AD00086');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0030020form1/*@AD0030020Servlet"
expj.AD0030020.AD0030020button2.LineInsert.onClick1 = function () {
  console.log('LineInsert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030020', 'AD0030020button2', '_AD0030020form1/*', 'AD0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030020', response);
expj.common.changeBusinessScreenTab('AD0030020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0030020.AD0030020button2.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030020button2.LineInsert['onClick' + i])) {
        expj.AD0030020.AD0030020button2.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030020button2.LineInsert.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030020button2.LineInsert.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020button2-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030020button2', 'LineInsert', this, 'Button');
    }
  });
  expj.AD0030020.AD0030020button2.LineInsert.executePScriptOnLoad();
};

expj.AD0030020.AD0030020button2.LineInsert.executePScriptOnLoad = function () {
  console.log('execute AD0030020button2/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020button2-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030020-AD0030020button2-LineInsert" name="LineInsert" class="AD0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020button2-LineUpdate">
expj.AD0030020.AD0030020button2.LineUpdate = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0030020form1/*,_AD0030020view1/+@AD0030020Servlet"
expj.AD0030020.AD0030020button2.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030020', 'AD0030020button2', '_AD0030020form1/*,_AD0030020view1/+', 'AD0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030020', response);
expj.common.changeBusinessScreenTab('AD0030020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0030020.AD0030020button2.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030020button2.LineUpdate['onClick' + i])) {
        expj.AD0030020.AD0030020button2.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030020button2.LineUpdate.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030020button2.LineUpdate.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020button2-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030020button2', 'LineUpdate', this, 'Button');
    }
  });
  expj.AD0030020.AD0030020button2.LineUpdate.executePScriptOnLoad();
};

expj.AD0030020.AD0030020button2.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute AD0030020button2/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020button2-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030020-AD0030020button2-LineUpdate" name="LineUpdate" class="AD0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020button2-LineCopy">
expj.AD0030020.AD0030020button2.LineCopy = {};
// script1="onClick;0;CHK;_AD0030020view1/h_WORK_STS_TYP[eq]2@!AD00086"
expj.AD0030020.AD0030020button2.LineCopy.onClick0 = function () {
  console.log('LineCopy script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020button2', '_AD0030020view1/h_WORK_STS_TYP'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030020', 'AD0030020button2', 'AD00086');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0030020form1/*,_AD0030020view1/+@AD0030020Servlet"
expj.AD0030020.AD0030020button2.LineCopy.onClick1 = function () {
  console.log('LineCopy script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030020', 'AD0030020button2', '_AD0030020form1/*,_AD0030020view1/+', 'AD0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030020', response);
expj.common.changeBusinessScreenTab('AD0030020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0030020.AD0030020button2.LineCopy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030020button2.LineCopy['onClick' + i])) {
        expj.AD0030020.AD0030020button2.LineCopy['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030020button2.LineCopy.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030020button2.LineCopy.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020button2-LineCopy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030020button2', 'LineCopy', this, 'Button');
    }
  });
  expj.AD0030020.AD0030020button2.LineCopy.executePScriptOnLoad();
};

expj.AD0030020.AD0030020button2.LineCopy.executePScriptOnLoad = function () {
  console.log('execute AD0030020button2/LineCopy.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020button2-LineCopy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030020-AD0030020button2-LineCopy" name="LineCopy" class="AD0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020button2-LineDelete">
expj.AD0030020.AD0030020button2.LineDelete = {};
// script1="onClick;0;CHK;_AD0030020view1/h_WORK_STS_TYP[eq]2@!AD00085"
expj.AD0030020.AD0030020button2.LineDelete.onClick0 = function () {
  console.log('LineDelete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030020button2', '_AD0030020view1/h_WORK_STS_TYP'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030020', 'AD0030020button2', 'AD00085');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030020form1/*,_AD0030020form2/*,_AD0030020view1/+@AD0030020Servlet,,$ZZ07004"
expj.AD0030020.AD0030020button2.LineDelete.onClick1 = function () {
  console.log('LineDelete script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030020', 'AD0030020button2', '_AD0030020form1/*,_AD0030020form2/*,_AD0030020view1/+', 'AD0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030020', response);
expj.common.updateBusinessScreenTab('AD0030020', contents);
};
expj.common.pscript.callConfirm('AD0030020', 'AD0030020button2', 'ZZ07004', okEvent);
};
expj.AD0030020.AD0030020button2.LineDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030020button2.LineDelete['onClick' + i])) {
        expj.AD0030020.AD0030020button2.LineDelete['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030020button2.LineDelete.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030020button2.LineDelete.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020button2-LineDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030020button2', 'LineDelete', this, 'Button');
    }
  });
  expj.AD0030020.AD0030020button2.LineDelete.executePScriptOnLoad();
};

expj.AD0030020.AD0030020button2.LineDelete.executePScriptOnLoad = function () {
  console.log('execute AD0030020button2/LineDelete.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020button2-LineDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030020-AD0030020button2-LineDelete" name="LineDelete" class="AD0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 504px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0030020-AD0030020form2">
expj.AD0030020.AD0030020form2 = {};
expj.AD0030020.AD0030020form2.executeAllOnDecision = function () {
  console.log('execute AD0030020form2.onDecision');
};
expj.AD0030020.AD0030020form2.executeOnLoad = function () {
  expj.AD0030020.AD0030020form2.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0030020-AD0030020form2" action="AD0030020Servlet" name="AD0030020form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:142px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:142px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form2-ITEM_CD">
expj.AD0030020.AD0030020form2.ITEM_CD = {};
expj.AD0030020.AD0030020form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/ITEM_CD.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'ITEM_CD', this);
  });
  expj.AD0030020.AD0030020form2.ITEM_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form2-ITEM_CD" name="ITEM_CD" class="AD0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form2-ITEM_NAME">
expj.AD0030020.AD0030020form2.ITEM_NAME = {};
expj.AD0030020.AD0030020form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/ITEM_NAME.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'ITEM_NAME', this);
  });
  expj.AD0030020.AD0030020form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form2-ITEM_NAME" name="ITEM_NAME" class="AD0030020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form2-DRAW_CD">
expj.AD0030020.AD0030020form2.DRAW_CD = {};
expj.AD0030020.AD0030020form2.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/DRAW_CD.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.DRAW_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'DRAW_CD', this);
  });
  expj.AD0030020.AD0030020form2.DRAW_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form2-DRAW_CD" name="DRAW_CD" class="AD0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form2-SPEC">
expj.AD0030020.AD0030020form2.SPEC = {};
expj.AD0030020.AD0030020form2.SPEC.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/SPEC.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.SPEC.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'SPEC', this);
  });
  expj.AD0030020.AD0030020form2.SPEC.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.SPEC.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form2-SPEC" name="SPEC" class="AD0030020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form2-MRP_ODR_TYP_DN">
expj.AD0030020.AD0030020form2.MRP_ODR_TYP_DN = {};
expj.AD0030020.AD0030020form2.MRP_ODR_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/MRP_ODR_TYP_DN.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.MRP_ODR_TYP_DN.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-MRP_ODR_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'MRP_ODR_TYP_DN', this);
  });
  expj.AD0030020.AD0030020form2.MRP_ODR_TYP_DN.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.MRP_ODR_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/MRP_ODR_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-MRP_ODR_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form2-MRP_ODR_TYP_DN" name="MRP_ODR_TYP_DN" class="AD0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getMRP_ODR_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030020form2-MRP_ODR_TYP" name="MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getMRP_ODR_TYP()) %>">
<script class="expj-script-AD0030020-AD0030020form2-MRP_ODR_TYP">
expj.AD0030020.AD0030020form2.MRP_ODR_TYP = {};
expj.AD0030020.AD0030020form2.MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/MRP_ODR_TYP.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'MRP_ODR_TYP', this);
  });
  expj.AD0030020.AD0030020form2.MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form2-JOB_ODR_CD">
expj.AD0030020.AD0030020form2.JOB_ODR_CD = {};
expj.AD0030020.AD0030020form2.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/JOB_ODR_CD.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'JOB_ODR_CD', this);
  });
  expj.AD0030020.AD0030020form2.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form2-JOB_ODR_CD" name="JOB_ODR_CD" class="AD0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getJOB_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030020form2-h_PARENT_OD_NO" name="h_PARENT_OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_PARENT_OD_NO()) %>">
<script class="expj-script-AD0030020-AD0030020form2-h_PARENT_OD_NO">
expj.AD0030020.AD0030020form2.h_PARENT_OD_NO = {};
expj.AD0030020.AD0030020form2.h_PARENT_OD_NO.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/h_PARENT_OD_NO.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.h_PARENT_OD_NO.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-h_PARENT_OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'h_PARENT_OD_NO', this);
  });
  expj.AD0030020.AD0030020form2.h_PARENT_OD_NO.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.h_PARENT_OD_NO.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/h_PARENT_OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-h_PARENT_OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030020form2-h_WORK_STS_TYP" name="h_WORK_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_WORK_STS_TYP()) %>">
<script class="expj-script-AD0030020-AD0030020form2-h_WORK_STS_TYP">
expj.AD0030020.AD0030020form2.h_WORK_STS_TYP = {};
expj.AD0030020.AD0030020form2.h_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/h_WORK_STS_TYP.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.h_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-h_WORK_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'h_WORK_STS_TYP', this);
  });
  expj.AD0030020.AD0030020form2.h_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.h_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/h_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-h_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_6",rb)%></span><!-- 品目別製造納期 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form2-WORK_ODR_DLV_DATE_BY_ITEM">
expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM = {};
expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/WORK_ODR_DLV_DATE_BY_ITEM.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-WORK_ODR_DLV_DATE_BY_ITEM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'WORK_ODR_DLV_DATE_BY_ITEM', this);
  });
  expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/WORK_ODR_DLV_DATE_BY_ITEM.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-WORK_ODR_DLV_DATE_BY_ITEM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form2-WORK_ODR_DLV_DATE_BY_ITEM" name="WORK_ODR_DLV_DATE_BY_ITEM" class="AD0030020-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getWORK_ODR_DLV_DATE_BY_ITEM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form2-WORK_ODR_DLV_DATE_BY_ITEM_TIME">
expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM_TIME = {};
expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/WORK_ODR_DLV_DATE_BY_ITEM_TIME.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM_TIME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-WORK_ODR_DLV_DATE_BY_ITEM_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'WORK_ODR_DLV_DATE_BY_ITEM_TIME', this);
  });
  expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM_TIME.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/WORK_ODR_DLV_DATE_BY_ITEM_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-WORK_ODR_DLV_DATE_BY_ITEM_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form2-WORK_ODR_DLV_DATE_BY_ITEM_TIME" name="WORK_ODR_DLV_DATE_BY_ITEM_TIME" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getWORK_ODR_DLV_DATE_BY_ITEM_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_START_DATE_6",rb)%></span><!-- 品目別製造着手日 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form2-OPR_INST_START_DATE_BY_ITEM">
expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM = {};
expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/OPR_INST_START_DATE_BY_ITEM.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-OPR_INST_START_DATE_BY_ITEM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'OPR_INST_START_DATE_BY_ITEM', this);
  });
  expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/OPR_INST_START_DATE_BY_ITEM.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-OPR_INST_START_DATE_BY_ITEM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form2-OPR_INST_START_DATE_BY_ITEM" name="OPR_INST_START_DATE_BY_ITEM" class="AD0030020-focus-move  " style="width:100%;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getOPR_INST_START_DATE_BY_ITEM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020form2-OPR_INST_START_DATE_BY_ITEM_TIME">
expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM_TIME = {};
expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/OPR_INST_START_DATE_BY_ITEM_TIME.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM_TIME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-OPR_INST_START_DATE_BY_ITEM_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'OPR_INST_START_DATE_BY_ITEM_TIME', this);
  });
  expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM_TIME.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/OPR_INST_START_DATE_BY_ITEM_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-OPR_INST_START_DATE_BY_ITEM_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030020form2-OPR_INST_START_DATE_BY_ITEM_TIME" name="OPR_INST_START_DATE_BY_ITEM_TIME" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getOPR_INST_START_DATE_BY_ITEM_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030020form2-h_MANHOUR_TYP" name="h_MANHOUR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_MANHOUR_TYP()) %>">
<script class="expj-script-AD0030020-AD0030020form2-h_MANHOUR_TYP">
expj.AD0030020.AD0030020form2.h_MANHOUR_TYP = {};
expj.AD0030020.AD0030020form2.h_MANHOUR_TYP.executeAllOnDecision = function () {
  console.log('execute AD0030020form2/h_MANHOUR_TYP.onDecision');
  expj.AD0030020.AD0030020form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030020form2.h_MANHOUR_TYP.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020form2-h_MANHOUR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030020form2', 'h_MANHOUR_TYP', this);
  });
  expj.AD0030020.AD0030020form2.h_MANHOUR_TYP.executePScriptOnLoad();
};

expj.AD0030020.AD0030020form2.h_MANHOUR_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0030020form2/h_MANHOUR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020form2-h_MANHOUR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
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
<span class="version">AD0030020 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AD0030020-AD0030020button0">
expj.AD0030020.AD0030020button0 = {};
expj.AD0030020.AD0030020button0.executeAllOnDecision = function () {
  console.log('execute AD0030020button0.onDecision');
};
expj.AD0030020.AD0030020button0.executeOnLoad = function () {
  expj.AD0030020.AD0030020button0.executePScriptOnLoad();
};

expj.AD0030020.AD0030020button0.executePScriptOnLoad = function () {
  console.log('execute AD0030020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030020-AD0030020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030020-AD0030020button0-Clear">
expj.AD0030020.AD0030020button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030020form1/*@AD0030020Servlet,,$ZZ07008"
expj.AD0030020.AD0030020button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030020', 'AD0030020button0', '_AD0030020form1/*', 'AD0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030020', response);
expj.common.updateBusinessScreenTab('AD0030020', contents);
};
expj.common.pscript.callConfirm('AD0030020', 'AD0030020button0', 'ZZ07008', okEvent);
};
expj.AD0030020.AD0030020button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030020button0.Clear['onClick' + i])) {
        expj.AD0030020.AD0030020button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030020button0.Clear.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030020button0.Clear.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030020button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0030020.AD0030020button0.Clear.executePScriptOnLoad();
};

expj.AD0030020.AD0030020button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0030020button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030020-AD0030020button0-Clear" name="Clear" class="AD0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030020button0-Close">
expj.AD0030020.AD0030020button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0030020.AD0030020button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0030020');
};
expj.AD0030020.AD0030020button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030020button0.Close['onClick' + i])) {
        expj.AD0030020.AD0030020button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030020button0.Close.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030020button0.Close.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030020button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030020button0', 'Close', this, 'Button');
    }
  });
  expj.AD0030020.AD0030020button0.Close.executePScriptOnLoad();
};

expj.AD0030020.AD0030020button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0030020button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030020button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030020-AD0030020button0-Close" name="Close" class="AD0030020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0030020 (END)-->
<%
MessageStruct msgStruct = aAD0030020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0030020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0030020)) {
  expj.common.treeInstanceMap.AD0030020 = {};
}
expj.common.treeInstanceMap.AD0030020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0030020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0030020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0030020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0030020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0030020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0030020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0030020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0030020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0030020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0030020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030020)) {
  expj.common.detailDialogMap.AD0030020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0030020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030020.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0030020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0030020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0030020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0030020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0030020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0030020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0030020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0030020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0030020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0030020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0030020)) {
  expj.common.viewInstanceMap.AD0030020 = {};
}
expj.common.viewInstanceMap.AD0030020.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0030020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0030020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0030020.<%=viewId %>.init = function () {
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
    expj.AD0030020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0030020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0030020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0030020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0030020_init">
/**
 * AD0030020用のロード完了時初期化関数
 */
expj.AD0030020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0030020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0030020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0030020');
  expj.common.calendarInstanceMap.AD0030020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0030020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0030020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0030020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0030020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0030020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0030020-<%=detailId %>');
<%
 }
%>
  try{expj.AD0030020.AD0030020form1.WORK_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form1.PeekerWorkOdrCd.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020button1.Select.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020button2.LineInsert.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020button2.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020button2.LineCopy.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020button2.LineDelete.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.SPEC.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.MRP_ODR_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.h_PARENT_OD_NO.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.h_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.WORK_ODR_DLV_DATE_BY_ITEM_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.OPR_INST_START_DATE_BY_ITEM_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.h_MANHOUR_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form1.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020button1.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020view1.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020button2.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020form2.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030020button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0030020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0030020', 'AD0030020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0030020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0030020-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0030020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0030020', '<%=request.getContextPath() %>');
};

/**
 * AD0030020の全体onDecision処理
 */
expj.AD0030020.executeAllOnDecision = function () {
  expj.AD0030020.AD0030020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0030020_console">
expj.AD0030020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>