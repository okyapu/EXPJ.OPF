<%-- ***
This file is generated
 GeneratedDate  : Thu Apr 27 13:33:18 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj_WK\OPF\KQ0100\KQ0100010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KQ0100.*" %>
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
<jsp:useBean id="aKQ0100010Control" class="com.nec.jp.orteus.metamorBase.KQ0100.KQ0100010Control" scope="request"/>
<jsp:useBean id="aKQ0100010Struct" class="com.nec.jp.orteus.metamorBase.KQ0100.KQ0100010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受注消費税率変更
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0100/jsp/KQ0100010.jsp,v $
$Author: xu-jing $	
$Revision: 1.5 $　$Date: 2017/04/27 09:36:50 $
********************************************************* --%>
<html>
<head>
<title>受注消費税率変更</title>
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
<script class="expj-script-KQ0100010_init">
  // KQ0100010名前空間
  expj.KQ0100010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KQ0100010" data-screen="KQ0100010" data-newdata="<%=aKQ0100010Control.isNewData() %>">
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
              <script class="expj-script-KQ0100010-KQ0100010form1">
expj.KQ0100010.KQ0100010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.KQ0100010.KQ0100010form1.onLoad0 = function () {
  console.log('KQ0100010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHK;_KQ0100010form1/r_SEL_PTN1[eq]true@*0"
expj.KQ0100010.KQ0100010form1.onDecision0 = function () {
  console.log('KQ0100010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/r_SEL_PTN1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;_KQ0100010form1/r_SEL_PTN2[eq]true@*1"
expj.KQ0100010.KQ0100010form1.onDecision1 = function () {
  console.log('KQ0100010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/r_SEL_PTN2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="onDecision;2;CHK;_KQ0100010form1/r_SEL_PTN1[eq]true@*2"
expj.KQ0100010.KQ0100010form1.onDecision2 = function () {
  console.log('KQ0100010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/r_SEL_PTN1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script5="onDecision;3;CHK;_KQ0100010form1/r_SEL_PTN2[eq]true@*3"
expj.KQ0100010.KQ0100010form1.onDecision3 = function () {
  console.log('KQ0100010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/r_SEL_PTN2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;0;MASK;_KQ0100010form1/SLIP_CD,_KQ0100010form1/PeekerSlipCd"
expj.KQ0100010.KQ0100010form1.child0 = function () {
  console.log('KQ0100010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/SLIP_CD');
expj.common.pscript.setMaskToReferenceComponent('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/PeekerSlipCd');
};
// script7="child;1;MASK;_KQ0100010form1/ODR_NO,_KQ0100010form1/PeekerOrdNo"
expj.KQ0100010.KQ0100010form1.child1 = function () {
  console.log('KQ0100010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/ODR_NO');
expj.common.pscript.setMaskToReferenceComponent('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/PeekerOrdNo');
};
// script8="child;2;CHKRQ;A@*4,*5"
expj.KQ0100010.KQ0100010form1.child2 = function () {
  console.log('KQ0100010form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0100010', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;3;CHKRQ;B@*4,*5"
expj.KQ0100010.KQ0100010form1.child3 = function () {
  console.log('KQ0100010form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0100010', 'B')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="child;4;UNMASK;_KQ0100010button1/select"
expj.KQ0100010.KQ0100010form1.child4 = function () {
  console.log('KQ0100010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0100010', 'KQ0100010form1', '_KQ0100010button1/select');
};
// script11="child;5;MASK;_KQ0100010button1/select"
expj.KQ0100010.KQ0100010form1.child5 = function () {
  console.log('KQ0100010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KQ0100010', 'KQ0100010form1', '_KQ0100010button1/select');
};
expj.KQ0100010.KQ0100010form1.executeAllOnDecision = function () {
  console.log('execute KQ0100010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010form1['onDecision' + i])) {
        expj.KQ0100010.KQ0100010form1['onDecision' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010form1.executeOnLoad = function () {
  expj.KQ0100010.KQ0100010form1.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form1.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010form1['onLoad' + i])) {
      expj.KQ0100010.KQ0100010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0100010-KQ0100010form1" action="KQ0100010Servlet" name="KQ0100010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKQ0100010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:75px;align:"></div>
<div class="div-td" style="width:75px;align:"></div>
<div class="div-td" style="width:110px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:260px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form1-ODR_NO">
expj.KQ0100010.KQ0100010form1.ODR_NO = {};
expj.KQ0100010.KQ0100010form1.ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0100010form1/ODR_NO.onDecision');
  expj.KQ0100010.KQ0100010form1.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form1.ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form1-ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form1', 'ODR_NO', this);
  });
  expj.KQ0100010.KQ0100010form1.ODR_NO.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form1.ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form1/ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form1-ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form1-ODR_NO" name="ODR_NO" class="KQ0100010-focus-move  required-value expj-KQ0100010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getODR_NO()) %>" maxlength="15" ></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form1-PeekerOrdNo">
expj.KQ0100010.KQ0100010form1.PeekerOrdNo = {};
// script1="onClick;0;PEEKER;_KQ0100010form1/ODR_NO@<%=contextNo%>"
expj.KQ0100010.KQ0100010form1.PeekerOrdNo.onClick0 = function () {
  console.log('PeekerOrdNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0100010';
var parameterValues = 'PeekerOrdNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/ODR_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ODR_NO_05%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0100010form1/ODR_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0100010.KQ0100010form1.PeekerOrdNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010form1.PeekerOrdNo['onClick' + i])) {
        expj.KQ0100010.KQ0100010form1.PeekerOrdNo['onClick' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010form1.PeekerOrdNo.executeAllOnDecision = function () {
};
expj.KQ0100010.KQ0100010form1.PeekerOrdNo.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form1-PeekerOrdNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0100010', 'KQ0100010form1', 'PeekerOrdNo', this, 'Button');
    }
  });
  expj.KQ0100010.KQ0100010form1.PeekerOrdNo.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form1.PeekerOrdNo.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form1/PeekerOrdNo.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form1-PeekerOrdNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0100010-KQ0100010form1-PeekerOrdNo" class="KQ0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-KQ0100010-KQ0100010form1-h_UPDATE_FLG" name="h_UPDATE_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.geth_UPDATE_FLG()) %>">
<script class="expj-script-KQ0100010-KQ0100010form1-h_UPDATE_FLG">
expj.KQ0100010.KQ0100010form1.h_UPDATE_FLG = {};
expj.KQ0100010.KQ0100010form1.h_UPDATE_FLG.executeAllOnDecision = function () {
  console.log('execute KQ0100010form1/h_UPDATE_FLG.onDecision');
  expj.KQ0100010.KQ0100010form1.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form1.h_UPDATE_FLG.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form1-h_UPDATE_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form1', 'h_UPDATE_FLG', this);
  });
  expj.KQ0100010.KQ0100010form1.h_UPDATE_FLG.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form1.h_UPDATE_FLG.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form1/h_UPDATE_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form1-h_UPDATE_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form1-r_SEL_PTN1">
expj.KQ0100010.KQ0100010form1.r_SEL_PTN1 = {};
// script1="onClick;0;UNMASK;_KQ0100010form1/ODR_NO,_KQ0100010form1/PeekerOrdNo"
expj.KQ0100010.KQ0100010form1.r_SEL_PTN1.onClick0 = function () {
  console.log('r_SEL_PTN1 script1');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/ODR_NO');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/PeekerOrdNo');
};
// script2="onClick;1;SET;_KQ0100010form1/SLIP_CD="
expj.KQ0100010.KQ0100010form1.r_SEL_PTN1.onClick1 = function () {
  console.log('r_SEL_PTN1 script2');
expj.common.pscript.setReferenceComponentValue('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/SLIP_CD', '');
};
expj.KQ0100010.KQ0100010form1.r_SEL_PTN1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010form1.r_SEL_PTN1['onClick' + i])) {
        expj.KQ0100010.KQ0100010form1.r_SEL_PTN1['onClick' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010form1.r_SEL_PTN1.executeAllOnDecision = function () {
  console.log('execute KQ0100010form1/r_SEL_PTN1.onDecision');
  expj.KQ0100010.KQ0100010form1.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form1.r_SEL_PTN1.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form1-r_SEL_PTN1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0100010', 'KQ0100010form1', 'r_SEL_PTN1', this, 'RadioButton');
    }
  });
  expj.KQ0100010.KQ0100010form1.r_SEL_PTN1.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form1.r_SEL_PTN1.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form1/r_SEL_PTN1.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form1-r_SEL_PTN1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="radio" name="r_SEL_PTN0" data-name="r_SEL_PTN1" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0100010Struct.getr_SEL_PTN1())) || "".equals(TypeConverter.convert(aKQ0100010Struct.getr_SEL_PTN1())))?"checked=\"checked\"": "" %> class="" id="expj-KQ0100010-KQ0100010form1-r_SEL_PTN1" ><label for="expj-KQ0100010-KQ0100010form1-r_SEL_PTN1"><%=CoreTools.getRBString("Expj.SALES_ODR_DATA",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SLIP_CD",rb)%></span><!-- 伝票番号 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form1-SLIP_CD">
expj.KQ0100010.KQ0100010form1.SLIP_CD = {};
expj.KQ0100010.KQ0100010form1.SLIP_CD.executeAllOnDecision = function () {
  console.log('execute KQ0100010form1/SLIP_CD.onDecision');
  expj.KQ0100010.KQ0100010form1.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form1.SLIP_CD.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form1-SLIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form1', 'SLIP_CD', this);
  });
  expj.KQ0100010.KQ0100010form1.SLIP_CD.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form1.SLIP_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form1/SLIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form1-SLIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form1-SLIP_CD" name="SLIP_CD" class="KQ0100010-focus-move  required-value expj-KQ0100010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getSLIP_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form1-PeekerSlipCd">
expj.KQ0100010.KQ0100010form1.PeekerSlipCd = {};
// script1="onClick;0;PEEKER;_KQ0100010form1/SLIP_CD@<%=contextNo%>"
expj.KQ0100010.KQ0100010form1.PeekerSlipCd.onClick0 = function () {
  console.log('PeekerSlipCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0100010';
var parameterValues = 'PeekerSlipCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/SLIP_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%SLIP_CD_23%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0100010form1/SLIP_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0100010.KQ0100010form1.PeekerSlipCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010form1.PeekerSlipCd['onClick' + i])) {
        expj.KQ0100010.KQ0100010form1.PeekerSlipCd['onClick' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010form1.PeekerSlipCd.executeAllOnDecision = function () {
};
expj.KQ0100010.KQ0100010form1.PeekerSlipCd.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form1-PeekerSlipCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0100010', 'KQ0100010form1', 'PeekerSlipCd', this, 'Button');
    }
  });
  expj.KQ0100010.KQ0100010form1.PeekerSlipCd.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form1.PeekerSlipCd.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form1/PeekerSlipCd.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form1-PeekerSlipCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0100010-KQ0100010form1-PeekerSlipCd" class="KQ0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-KQ0100010-KQ0100010form1-h_ODR_NO" name="h_ODR_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.geth_ODR_NO()) %>">
<script class="expj-script-KQ0100010-KQ0100010form1-h_ODR_NO">
expj.KQ0100010.KQ0100010form1.h_ODR_NO = {};
expj.KQ0100010.KQ0100010form1.h_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0100010form1/h_ODR_NO.onDecision');
  expj.KQ0100010.KQ0100010form1.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form1.h_ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form1-h_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form1', 'h_ODR_NO', this);
  });
  expj.KQ0100010.KQ0100010form1.h_ODR_NO.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form1.h_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form1/h_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form1-h_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form1-r_SEL_PTN2">
expj.KQ0100010.KQ0100010form1.r_SEL_PTN2 = {};
// script1="onClick;0;UNMASK;_KQ0100010form1/SLIP_CD,_KQ0100010form1/PeekerSlipCd"
expj.KQ0100010.KQ0100010form1.r_SEL_PTN2.onClick0 = function () {
  console.log('r_SEL_PTN2 script1');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/SLIP_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/PeekerSlipCd');
};
// script2="onClick;1;SET;_KQ0100010form1/ODR_NO="
expj.KQ0100010.KQ0100010form1.r_SEL_PTN2.onClick1 = function () {
  console.log('r_SEL_PTN2 script2');
expj.common.pscript.setReferenceComponentValue('KQ0100010', 'KQ0100010form1', '_KQ0100010form1/ODR_NO', '');
};
expj.KQ0100010.KQ0100010form1.r_SEL_PTN2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010form1.r_SEL_PTN2['onClick' + i])) {
        expj.KQ0100010.KQ0100010form1.r_SEL_PTN2['onClick' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010form1.r_SEL_PTN2.executeAllOnDecision = function () {
  console.log('execute KQ0100010form1/r_SEL_PTN2.onDecision');
  expj.KQ0100010.KQ0100010form1.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form1.r_SEL_PTN2.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form1-r_SEL_PTN2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0100010', 'KQ0100010form1', 'r_SEL_PTN2', this, 'RadioButton');
    }
  });
  expj.KQ0100010.KQ0100010form1.r_SEL_PTN2.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form1.r_SEL_PTN2.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form1/r_SEL_PTN2.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form1-r_SEL_PTN2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="radio" name="r_SEL_PTN0" data-name="r_SEL_PTN2" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0100010Struct.getr_SEL_PTN2())))?"checked=\"checked\"":"" %> class="" id="expj-KQ0100010-KQ0100010form1-r_SEL_PTN2" ><label for="expj-KQ0100010-KQ0100010form1-r_SEL_PTN2"><%=CoreTools.getRBString("Expj.SHIP_INFO",rb)%></label></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KQ0100010-KQ0100010button1">
expj.KQ0100010.KQ0100010button1 = {};
expj.KQ0100010.KQ0100010button1.executeAllOnDecision = function () {
  console.log('execute KQ0100010button1.onDecision');
};
expj.KQ0100010.KQ0100010button1.executeOnLoad = function () {
  expj.KQ0100010.KQ0100010button1.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010button1.executePScriptOnLoad = function () {
  console.log('execute KQ0100010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0100010-KQ0100010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0100010-KQ0100010button1-select">
expj.KQ0100010.KQ0100010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0100010form1/*@KQ0100010Servlet"
expj.KQ0100010.KQ0100010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0100010', 'KQ0100010button1', '_KQ0100010form1/*', 'KQ0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0100010', response);
expj.common.updateBusinessScreenTab('KQ0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0100010.KQ0100010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010button1.select['onClick' + i])) {
        expj.KQ0100010.KQ0100010button1.select['onClick' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010button1.select.executeAllOnDecision = function () {
};
expj.KQ0100010.KQ0100010button1.select.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0100010', 'KQ0100010button1', 'select', this, 'Button');
    }
  });
  expj.KQ0100010.KQ0100010button1.select.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010button1.select.executePScriptOnLoad = function () {
  console.log('execute KQ0100010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0100010-KQ0100010button1-select" name="select" class="KQ0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><script class="expj-script-KQ0100010-KQ0100010form2">
expj.KQ0100010.KQ0100010form2 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.KQ0100010.KQ0100010form2.onLoad0 = function () {
  console.log('KQ0100010form2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;MASK;_KQ0100010button2/update"
expj.KQ0100010.KQ0100010form2.onDecision0 = function () {
  console.log('KQ0100010form2 script2');
expj.common.pscript.setMaskToReferenceComponent('KQ0100010', 'KQ0100010form2', '_KQ0100010button2/update');
};
// script3="onDecision;1;CHK;?KQ0100010form1/*[eq]NORMAL[and]_KQ0100010form1/h_UPDATE_FLG[eq]0@*0"
expj.KQ0100010.KQ0100010form2.onDecision1 = function () {
  console.log('KQ0100010form2 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form2', '?KQ0100010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form2', '_KQ0100010form1/h_UPDATE_FLG'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script4="child;0;CHKRQ;C@*1"
expj.KQ0100010.KQ0100010form2.child0 = function () {
  console.log('KQ0100010form2 script4');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0100010', 'C')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script5="child;1;CHK;?KQ0100010form1/ODR_NO[eq]SAME[and]?KQ0100010form1/SLIP_CD[eq]SAME@*2"
expj.KQ0100010.KQ0100010form2.child1 = function () {
  console.log('KQ0100010form2 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form2', '?KQ0100010form1/ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form2', '?KQ0100010form1/SLIP_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;2;UNMASK;_KQ0100010button2/update"
expj.KQ0100010.KQ0100010form2.child2 = function () {
  console.log('KQ0100010form2 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0100010', 'KQ0100010form2', '_KQ0100010button2/update');
};
expj.KQ0100010.KQ0100010form2.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010form2['onDecision' + i])) {
        expj.KQ0100010.KQ0100010form2['onDecision' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010form2.executeOnLoad = function () {
  expj.KQ0100010.KQ0100010form2.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010form2['onLoad' + i])) {
      expj.KQ0100010.KQ0100010form2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0100010-KQ0100010form2" action="KQ0100010Servlet" name="KQ0100010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKQ0100010Control.getReadStatusString()) %>" style="height:188px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:188px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-CUST_ODR_NO">
expj.KQ0100010.KQ0100010form2.CUST_ODR_NO = {};
expj.KQ0100010.KQ0100010form2.CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/CUST_ODR_NO.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'CUST_ODR_NO', this);
  });
  expj.KQ0100010.KQ0100010form2.CUST_ODR_NO.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-CUST_ODR_NO" name="CUST_ODR_NO" class="KQ0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getCUST_ODR_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TAX_CD_1",rb)%></span><!-- 消費税コード --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-TAX_CD">
expj.KQ0100010.KQ0100010form2.TAX_CD = {};
expj.KQ0100010.KQ0100010form2.TAX_CD.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/TAX_CD.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.TAX_CD.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'TAX_CD', this);
  });
  expj.KQ0100010.KQ0100010form2.TAX_CD.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.TAX_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-TAX_CD" name="TAX_CD" class="KQ0100010-focus-move  required-value expj-KQ0100010-required-C" style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getTAX_CD()) %>" maxlength="3" ></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-PeekerTaxCd">
expj.KQ0100010.KQ0100010form2.PeekerTaxCd = {};
// script1="onClick;0;PEEKER;_KQ0100010form2/TAX_CD@<%=contextNo%>"
expj.KQ0100010.KQ0100010form2.PeekerTaxCd.onClick0 = function () {
  console.log('PeekerTaxCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0100010';
var parameterValues = 'PeekerTaxCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010form2', '_KQ0100010form2/TAX_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%TAX_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0100010form2/TAX_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0100010.KQ0100010form2.PeekerTaxCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010form2.PeekerTaxCd['onClick' + i])) {
        expj.KQ0100010.KQ0100010form2.PeekerTaxCd['onClick' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010form2.PeekerTaxCd.executeAllOnDecision = function () {
};
expj.KQ0100010.KQ0100010form2.PeekerTaxCd.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-PeekerTaxCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0100010', 'KQ0100010form2', 'PeekerTaxCd', this, 'Button');
    }
  });
  expj.KQ0100010.KQ0100010form2.PeekerTaxCd.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.PeekerTaxCd.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/PeekerTaxCd.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-PeekerTaxCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0100010-KQ0100010form2-PeekerTaxCd" class="KQ0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3096",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-ITEM_CD">
expj.KQ0100010.KQ0100010form2.ITEM_CD = {};
expj.KQ0100010.KQ0100010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/ITEM_CD.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'ITEM_CD', this);
  });
  expj.KQ0100010.KQ0100010form2.ITEM_CD.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-ITEM_CD" name="ITEM_CD" class="KQ0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-ITEM_NAME">
expj.KQ0100010.KQ0100010form2.ITEM_NAME = {};
expj.KQ0100010.KQ0100010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/ITEM_NAME.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'ITEM_NAME', this);
  });
  expj.KQ0100010.KQ0100010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-ITEM_NAME" name="ITEM_NAME" class="KQ0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KQ0100010-KQ0100010form2-h_CURRNCY_CD" name="h_CURRNCY_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.geth_CURRNCY_CD()) %>">
<script class="expj-script-KQ0100010-KQ0100010form2-h_CURRNCY_CD">
expj.KQ0100010.KQ0100010form2.h_CURRNCY_CD = {};
expj.KQ0100010.KQ0100010form2.h_CURRNCY_CD.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/h_CURRNCY_CD.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.h_CURRNCY_CD.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-h_CURRNCY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'h_CURRNCY_CD', this);
  });
  expj.KQ0100010.KQ0100010form2.h_CURRNCY_CD.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.h_CURRNCY_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/h_CURRNCY_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-h_CURRNCY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KQ0100010-KQ0100010form2-h_TRANSPORT_LT" name="h_TRANSPORT_LT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.geth_TRANSPORT_LT()) %>">
<script class="expj-script-KQ0100010-KQ0100010form2-h_TRANSPORT_LT">
expj.KQ0100010.KQ0100010form2.h_TRANSPORT_LT = {};
expj.KQ0100010.KQ0100010form2.h_TRANSPORT_LT.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/h_TRANSPORT_LT.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.h_TRANSPORT_LT.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-h_TRANSPORT_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'h_TRANSPORT_LT', this);
  });
  expj.KQ0100010.KQ0100010form2.h_TRANSPORT_LT.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.h_TRANSPORT_LT.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/h_TRANSPORT_LT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-h_TRANSPORT_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-CUST_CD">
expj.KQ0100010.KQ0100010form2.CUST_CD = {};
expj.KQ0100010.KQ0100010form2.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/CUST_CD.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.CUST_CD.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'CUST_CD', this);
  });
  expj.KQ0100010.KQ0100010form2.CUST_CD.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-CUST_CD" name="CUST_CD" class="KQ0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getCUST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-CUST_NAME">
expj.KQ0100010.KQ0100010form2.CUST_NAME = {};
expj.KQ0100010.KQ0100010form2.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/CUST_NAME.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.CUST_NAME.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'CUST_NAME', this);
  });
  expj.KQ0100010.KQ0100010form2.CUST_NAME.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-CUST_NAME" name="CUST_NAME" class="KQ0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getCUST_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KQ0100010-KQ0100010form2-h_EXCH_TYP" name="h_EXCH_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.geth_EXCH_TYP()) %>">
<script class="expj-script-KQ0100010-KQ0100010form2-h_EXCH_TYP">
expj.KQ0100010.KQ0100010form2.h_EXCH_TYP = {};
expj.KQ0100010.KQ0100010form2.h_EXCH_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/h_EXCH_TYP.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.h_EXCH_TYP.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-h_EXCH_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'h_EXCH_TYP', this);
  });
  expj.KQ0100010.KQ0100010form2.h_EXCH_TYP.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.h_EXCH_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/h_EXCH_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-h_EXCH_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KQ0100010-KQ0100010form2-h_TAX_CD" name="h_TAX_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.geth_TAX_CD()) %>">
<script class="expj-script-KQ0100010-KQ0100010form2-h_TAX_CD">
expj.KQ0100010.KQ0100010form2.h_TAX_CD = {};
expj.KQ0100010.KQ0100010form2.h_TAX_CD.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/h_TAX_CD.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.h_TAX_CD.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-h_TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'h_TAX_CD', this);
  });
  expj.KQ0100010.KQ0100010form2.h_TAX_CD.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.h_TAX_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/h_TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-h_TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-CUST_ITEM_CD">
expj.KQ0100010.KQ0100010form2.CUST_ITEM_CD = {};
expj.KQ0100010.KQ0100010form2.CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/CUST_ITEM_CD.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'CUST_ITEM_CD', this);
  });
  expj.KQ0100010.KQ0100010form2.CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-CUST_ITEM_CD" name="CUST_ITEM_CD" class="KQ0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getCUST_ITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-CUST_ITEM_NAME">
expj.KQ0100010.KQ0100010form2.CUST_ITEM_NAME = {};
expj.KQ0100010.KQ0100010form2.CUST_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/CUST_ITEM_NAME.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.CUST_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-CUST_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'CUST_ITEM_NAME', this);
  });
  expj.KQ0100010.KQ0100010form2.CUST_ITEM_NAME.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.CUST_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/CUST_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-CUST_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-CUST_ITEM_NAME" name="CUST_ITEM_NAME" class="KQ0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getCUST_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KQ0100010-KQ0100010form2-h_PRICE_ROUND_TYP" name="h_PRICE_ROUND_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.geth_PRICE_ROUND_TYP()) %>">
<script class="expj-script-KQ0100010-KQ0100010form2-h_PRICE_ROUND_TYP">
expj.KQ0100010.KQ0100010form2.h_PRICE_ROUND_TYP = {};
expj.KQ0100010.KQ0100010form2.h_PRICE_ROUND_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/h_PRICE_ROUND_TYP.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.h_PRICE_ROUND_TYP.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-h_PRICE_ROUND_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'h_PRICE_ROUND_TYP', this);
  });
  expj.KQ0100010.KQ0100010form2.h_PRICE_ROUND_TYP.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.h_PRICE_ROUND_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/h_PRICE_ROUND_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-h_PRICE_ROUND_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KQ0100010-KQ0100010form2-h_SLIP_CTRL_GRP" name="h_SLIP_CTRL_GRP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.geth_SLIP_CTRL_GRP()) %>">
<script class="expj-script-KQ0100010-KQ0100010form2-h_SLIP_CTRL_GRP">
expj.KQ0100010.KQ0100010form2.h_SLIP_CTRL_GRP = {};
expj.KQ0100010.KQ0100010form2.h_SLIP_CTRL_GRP.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/h_SLIP_CTRL_GRP.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.h_SLIP_CTRL_GRP.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-h_SLIP_CTRL_GRP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'h_SLIP_CTRL_GRP', this);
  });
  expj.KQ0100010.KQ0100010form2.h_SLIP_CTRL_GRP.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.h_SLIP_CTRL_GRP.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/h_SLIP_CTRL_GRP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-h_SLIP_CTRL_GRP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INSPC_ACPT_TYP",rb)%></span><!-- 検収区分 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-INSPC_ACPT_TYP">
expj.KQ0100010.KQ0100010form2.INSPC_ACPT_TYP = {};
expj.KQ0100010.KQ0100010form2.INSPC_ACPT_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/INSPC_ACPT_TYP.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.INSPC_ACPT_TYP.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-INSPC_ACPT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'INSPC_ACPT_TYP', this);
  });
  expj.KQ0100010.KQ0100010form2.INSPC_ACPT_TYP.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.INSPC_ACPT_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/INSPC_ACPT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-INSPC_ACPT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-INSPC_ACPT_TYP" name="INSPC_ACPT_TYP" class="KQ0100010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getINSPC_ACPT_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KQ0100010-KQ0100010form2-h_INSPC_ACPT_TYP" name="h_INSPC_ACPT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.geth_INSPC_ACPT_TYP()) %>">
<script class="expj-script-KQ0100010-KQ0100010form2-h_INSPC_ACPT_TYP">
expj.KQ0100010.KQ0100010form2.h_INSPC_ACPT_TYP = {};
expj.KQ0100010.KQ0100010form2.h_INSPC_ACPT_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/h_INSPC_ACPT_TYP.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.h_INSPC_ACPT_TYP.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-h_INSPC_ACPT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'h_INSPC_ACPT_TYP', this);
  });
  expj.KQ0100010.KQ0100010form2.h_INSPC_ACPT_TYP.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.h_INSPC_ACPT_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/h_INSPC_ACPT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-h_INSPC_ACPT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt1557",rb)%></span><!-- 受注数量 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-ODR_QTY">
expj.KQ0100010.KQ0100010form2.ODR_QTY = {};
expj.KQ0100010.KQ0100010form2.ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/ODR_QTY.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.ODR_QTY.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'ODR_QTY', this);
  });
  expj.KQ0100010.KQ0100010form2.ODR_QTY.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-ODR_QTY" name="ODR_QTY" class="KQ0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;CEIL;4" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getODR_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb)%></span><!-- 受注日 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-ODR_ACPT_DATE">
expj.KQ0100010.KQ0100010form2.ODR_ACPT_DATE = {};
expj.KQ0100010.KQ0100010form2.ODR_ACPT_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/ODR_ACPT_DATE.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.ODR_ACPT_DATE.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-ODR_ACPT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'ODR_ACPT_DATE', this);
  });
  expj.KQ0100010.KQ0100010form2.ODR_ACPT_DATE.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.ODR_ACPT_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/ODR_ACPT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-ODR_ACPT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-ODR_ACPT_DATE" name="ODR_ACPT_DATE" class="KQ0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getODR_ACPT_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACTUAL_UNIT_PRICE",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-ODR_UNIT_PRICE">
expj.KQ0100010.KQ0100010form2.ODR_UNIT_PRICE = {};
expj.KQ0100010.KQ0100010form2.ODR_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/ODR_UNIT_PRICE.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.ODR_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-ODR_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'ODR_UNIT_PRICE', this);
  });
  expj.KQ0100010.KQ0100010form2.ODR_UNIT_PRICE.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.ODR_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/ODR_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-ODR_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-ODR_UNIT_PRICE" name="ODR_UNIT_PRICE" class="KQ0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getODR_UNIT_PRICE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-ODR_UNIT_CD">
expj.KQ0100010.KQ0100010form2.ODR_UNIT_CD = {};
expj.KQ0100010.KQ0100010form2.ODR_UNIT_CD.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/ODR_UNIT_CD.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.ODR_UNIT_CD.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-ODR_UNIT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'ODR_UNIT_CD', this);
  });
  expj.KQ0100010.KQ0100010form2.ODR_UNIT_CD.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.ODR_UNIT_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/ODR_UNIT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-ODR_UNIT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:100px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-ODR_UNIT_CD" name="ODR_UNIT_CD" class="KQ0100010-focus-move  " style="width:100px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getODR_UNIT_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SCDL_SHIP_DATE",rb)%></span><!-- 出荷予定日 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-SHIP_DLV_DATE">
expj.KQ0100010.KQ0100010form2.SHIP_DLV_DATE = {};
expj.KQ0100010.KQ0100010form2.SHIP_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/SHIP_DLV_DATE.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.SHIP_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-SHIP_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'SHIP_DLV_DATE', this);
  });
  expj.KQ0100010.KQ0100010form2.SHIP_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.SHIP_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/SHIP_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-SHIP_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-SHIP_DLV_DATE" name="SHIP_DLV_DATE" class="KQ0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getSHIP_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_AMOUNT",rb)%></span><!-- 受注金額 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-ODR_AMOUNT">
expj.KQ0100010.KQ0100010form2.ODR_AMOUNT = {};
expj.KQ0100010.KQ0100010form2.ODR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/ODR_AMOUNT.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.ODR_AMOUNT.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-ODR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'ODR_AMOUNT', this);
  });
  expj.KQ0100010.KQ0100010form2.ODR_AMOUNT.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.ODR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/ODR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-ODR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-ODR_AMOUNT" name="ODR_AMOUNT" class="KQ0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getODR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-ODR_AMOUNT_UNIT_CD">
expj.KQ0100010.KQ0100010form2.ODR_AMOUNT_UNIT_CD = {};
expj.KQ0100010.KQ0100010form2.ODR_AMOUNT_UNIT_CD.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/ODR_AMOUNT_UNIT_CD.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.ODR_AMOUNT_UNIT_CD.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-ODR_AMOUNT_UNIT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'ODR_AMOUNT_UNIT_CD', this);
  });
  expj.KQ0100010.KQ0100010form2.ODR_AMOUNT_UNIT_CD.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.ODR_AMOUNT_UNIT_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/ODR_AMOUNT_UNIT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-ODR_AMOUNT_UNIT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:100px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-ODR_AMOUNT_UNIT_CD" name="ODR_AMOUNT_UNIT_CD" class="KQ0100010-focus-move  " style="width:100px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getODR_AMOUNT_UNIT_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010form2-DESINATED_DLV_DATE">
expj.KQ0100010.KQ0100010form2.DESINATED_DLV_DATE = {};
expj.KQ0100010.KQ0100010form2.DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/DESINATED_DLV_DATE.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'DESINATED_DLV_DATE', this);
  });
  expj.KQ0100010.KQ0100010form2.DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0100010-KQ0100010form2-DESINATED_DLV_DATE" name="DESINATED_DLV_DATE" class="KQ0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.getDESINATED_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-KQ0100010-KQ0100010form2-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0100010Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-KQ0100010-KQ0100010form2-h_MODIFY_COUNT">
expj.KQ0100010.KQ0100010form2.h_MODIFY_COUNT = {};
expj.KQ0100010.KQ0100010form2.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KQ0100010form2/h_MODIFY_COUNT.onDecision');
  expj.KQ0100010.KQ0100010form2.executeAllOnDecision();
  expj.KQ0100010.executeAllOnDecision();
};
expj.KQ0100010.KQ0100010form2.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010form2-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0100010', 'KQ0100010form2', 'h_MODIFY_COUNT', this);
  });
  expj.KQ0100010.KQ0100010form2.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form2.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form2/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010form2-h_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KQ0100010-KQ0100010button2">
expj.KQ0100010.KQ0100010button2 = {};
expj.KQ0100010.KQ0100010button2.executeAllOnDecision = function () {
  console.log('execute KQ0100010button2.onDecision');
};
expj.KQ0100010.KQ0100010button2.executeOnLoad = function () {
  expj.KQ0100010.KQ0100010button2.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010button2.executePScriptOnLoad = function () {
  console.log('execute KQ0100010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0100010-KQ0100010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0100010-KQ0100010button2-update">
expj.KQ0100010.KQ0100010button2.update = {};
// script1="onClick;0;CHK;_KQ0100010form2/TAX_CD[eq]_KQ0100010form2/h_TAX_CD@!KQ00339"
expj.KQ0100010.KQ0100010button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010button2', '_KQ0100010form2/TAX_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('KQ0100010', 'KQ0100010button2', '_KQ0100010form2/h_TAX_CD'))) {
expj.common.pscript.viewErrorMessage('KQ0100010', 'KQ0100010button2', 'KQ00339');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0100010form1/*,_KQ0100010form2/*,_KQ0100010form3/*@KQ0100010Servlet,,$ZZ07003"
expj.KQ0100010.KQ0100010button2.update.onClick1 = function () {
  console.log('update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0100010', 'KQ0100010button2', '_KQ0100010form1/*,_KQ0100010form2/*,_KQ0100010form3/*', 'KQ0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0100010', response);
expj.common.updateBusinessScreenTab('KQ0100010', contents);
};
expj.common.pscript.callConfirm('KQ0100010', 'KQ0100010button2', 'ZZ07003', okEvent);
};
expj.KQ0100010.KQ0100010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010button2.update['onClick' + i])) {
        expj.KQ0100010.KQ0100010button2.update['onClick' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010button2.update.executeAllOnDecision = function () {
};
expj.KQ0100010.KQ0100010button2.update.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0100010', 'KQ0100010button2', 'update', this, 'Button');
    }
  });
  expj.KQ0100010.KQ0100010button2.update.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010button2.update.executePScriptOnLoad = function () {
  console.log('execute KQ0100010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0100010-KQ0100010button2-update" name="update" class="KQ0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-KQ0100010-KQ0100010form3">
expj.KQ0100010.KQ0100010form3 = {};
expj.KQ0100010.KQ0100010form3.executeAllOnClick = function () {
};
expj.KQ0100010.KQ0100010form3.executeAllOnDecision = function () {
  console.log('execute KQ0100010form3.onDecision');
};
expj.KQ0100010.KQ0100010form3.executeOnLoad = function () {
<%
    viewSelectEvent.put("KQ0100010form3", "expj.KQ0100010.KQ0100010form3.executeAllOnClick");
%>
  expj.KQ0100010.KQ0100010form3.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010form3.executePScriptOnLoad = function () {
  console.log('execute KQ0100010form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KQ0100010-KQ0100010form3" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String KQ0100010form3_Id = "KQ0100010form3";
 String KQ0100010form3_select = "single";
 String KQ0100010form3_sortable = "true";
 String KQ0100010form3_resize = "true";
 String KQ0100010form3_scroll = "true";
 StringBuffer KQ0100010form3_HB = new StringBuffer();
 StringBuffer KQ0100010form3_DB = new StringBuffer();
%>
<%
 KQ0100010form3_select = "none";
 KQ0100010form3_sortable = "true";
 KQ0100010form3_resize = "true";
 KQ0100010form3_scroll = "true";
%>
<%
 KQ0100010form3_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
%>
      
<%
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0721",rb))).append("', 'name':'l_STATUS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_STATUS_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PART_DLV_SEQ_NO",rb))).append("', 'name':'l_PART_DLV_SEQ_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SLIP_CD",rb))).append("', 'name':'l_SHIP_ODR_SLIP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_SHIP_DATE",rb))).append("', 'name':'l_DESINATED_SHIP_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'180px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SCDL_DLV_DATE_ODR",rb))).append("', 'name':'l_ODR_SCDL_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_DATE",rb))).append("', 'name':'l_SHIP_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'180px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SCDL_DLV_DATE_SHIP",rb))).append("', 'name':'l_SHIP_SCDL_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_DATE",rb))).append("', 'name':'l_SALES_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_SHIP_ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_SALES_AMOUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_AI_AR_IF_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_TAX_DESINATED_SHIP_DATE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_SHIP_ODR_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_SALES_SEQ_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_SALES_SLIP_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_SHIP_ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_UPDATE_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_SHIP_SEQ_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_INSPC_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_AR_INSPC_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_AR_SALES_AMOUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_AR_TRN_INSPC_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
KQ0100010form3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_AR_TRN_SALES_AMOUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0100010form3_sortable).append("}").append(",");
%>
<%
 int aKQ0100010StructLength = aKQ0100010Control.getListsize();
 final KQ0100010Struct structBackup = aKQ0100010Struct;
 aKQ0100010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKQ0100010StructLength; ++loopCount) {
  if((aKQ0100010Struct = (KQ0100010Struct) aKQ0100010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKQ0100010Struct", aKQ0100010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KQ0100010form3_DB.append("[");
 KQ0100010form3_DB.append(loopCount);
%> <%
				        String bgcolor = "";
						if (aKQ0100010Struct.getl_h_UPDATE_FLG() == "1"){
							bgcolor="FFCCCC";
						} else {
							bgcolor = "";
						}
				    %> <%
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_STATUS-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_STATUS\" data-name=\"l_STATUS\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_STATUS())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_STATUS_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_STATUS_CD\" data-name=\"l_h_STATUS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_STATUS_CD())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_PART_DLV_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_PART_DLV_SEQ_NO\" data-name=\"l_PART_DLV_SEQ_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_PART_DLV_SEQ_NO())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_SHIP_ODR_SLIP_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_SHIP_ODR_SLIP_CD\" data-name=\"l_SHIP_ODR_SLIP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_SHIP_ODR_SLIP_CD())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_DESINATED_SHIP_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_DESINATED_SHIP_DATE\" data-name=\"l_DESINATED_SHIP_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_DESINATED_SHIP_DATE())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_ODR_SCDL_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_ODR_SCDL_DLV_DATE\" data-name=\"l_ODR_SCDL_DLV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_ODR_SCDL_DLV_DATE())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_SHIP_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_SHIP_DATE\" data-name=\"l_SHIP_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_SHIP_DATE())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_SHIP_SCDL_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_SHIP_SCDL_DLV_DATE\" data-name=\"l_SHIP_SCDL_DLV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_SHIP_SCDL_DLV_DATE())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_SALES_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_SALES_DATE\" data-name=\"l_SALES_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_SALES_DATE())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_JOB_ODR_CD())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_SHIP_ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_SHIP_ODR_AMOUNT\" data-name=\"l_h_SHIP_ODR_AMOUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_SHIP_ODR_AMOUNT())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_SALES_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_SALES_AMOUNT\" data-name=\"l_h_SALES_AMOUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_SALES_AMOUNT())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_AI_AR_IF_FLG-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_AI_AR_IF_FLG\" data-name=\"l_h_AI_AR_IF_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_AI_AR_IF_FLG())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_TAX_DESINATED_SHIP_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_TAX_DESINATED_SHIP_DATE\" data-name=\"l_h_TAX_DESINATED_SHIP_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_TAX_DESINATED_SHIP_DATE())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_SHIP_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_SHIP_ODR_NO\" data-name=\"l_h_SHIP_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_SHIP_ODR_NO())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_SALES_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_SALES_SEQ_NO\" data-name=\"l_h_SALES_SEQ_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_SALES_SEQ_NO())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_SALES_SLIP_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_SALES_SLIP_CD\" data-name=\"l_h_SALES_SLIP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_SALES_SLIP_CD())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_SHIP_ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_SHIP_ODR_AMOUNT\" data-name=\"l_h_SHIP_ODR_AMOUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_SHIP_ODR_AMOUNT())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_UPDATE_FLG-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_UPDATE_FLG\" data-name=\"l_h_UPDATE_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_UPDATE_FLG())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_SHIP_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_SHIP_SEQ_NO\" data-name=\"l_h_SHIP_SEQ_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_SHIP_SEQ_NO())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_INSPC_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_INSPC_ACPT_DATE\" data-name=\"l_h_INSPC_ACPT_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_INSPC_ACPT_DATE())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_AR_INSPC_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_AR_INSPC_ACPT_DATE\" data-name=\"l_h_AR_INSPC_ACPT_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_AR_INSPC_ACPT_DATE())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_AR_SALES_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_AR_SALES_AMOUNT\" data-name=\"l_h_AR_SALES_AMOUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_AR_SALES_AMOUNT())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_AR_TRN_INSPC_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_AR_TRN_INSPC_ACPT_DATE\" data-name=\"l_h_AR_TRN_INSPC_ACPT_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_AR_TRN_INSPC_ACPT_DATE())).append("</span>'");
 KQ0100010form3_DB.append(",").append("'<span id=\"expj-KQ0100010-KQ0100010form3-l_h_AR_TRN_SALES_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KQ0100010-KQ0100010form3-l_h_AR_TRN_SALES_AMOUNT\" data-name=\"l_h_AR_TRN_SALES_AMOUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0100010Struct.getl_h_AR_TRN_SALES_AMOUNT())).append("</span>'");
 KQ0100010form3_DB.append("]");
%>
<%
if (loopCount + 1 < aKQ0100010StructLength) {
   KQ0100010form3_DB.append(",");
  }
 }
 aKQ0100010Struct = structBackup;
 viewIdList.add(KQ0100010form3_Id);
 viewSelectList.add(KQ0100010form3_select);
 viewResizeList.add(KQ0100010form3_resize);
 viewScrollList.add(KQ0100010form3_scroll);
 viewHeaderDataList.add(KQ0100010form3_HB);
 viewBodyDataList.add(KQ0100010form3_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-right" style="width:60px;"></div><!--/td-->
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
<span class="version">KQ0100010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KQ0100010-KQ0100010button0">
expj.KQ0100010.KQ0100010button0 = {};
expj.KQ0100010.KQ0100010button0.executeAllOnDecision = function () {
  console.log('execute KQ0100010button0.onDecision');
};
expj.KQ0100010.KQ0100010button0.executeOnLoad = function () {
  expj.KQ0100010.KQ0100010button0.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010button0.executePScriptOnLoad = function () {
  console.log('execute KQ0100010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0100010-KQ0100010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0100010-KQ0100010button0-clear">
expj.KQ0100010.KQ0100010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KQ0100010Servlet,,$ZZ07008"
expj.KQ0100010.KQ0100010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0100010', 'KQ0100010button0', '', 'KQ0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0100010', response);
expj.common.updateBusinessScreenTab('KQ0100010', contents);
};
expj.common.pscript.callConfirm('KQ0100010', 'KQ0100010button0', 'ZZ07008', okEvent);
};
expj.KQ0100010.KQ0100010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010button0.clear['onClick' + i])) {
        expj.KQ0100010.KQ0100010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010button0.clear.executeAllOnDecision = function () {
};
expj.KQ0100010.KQ0100010button0.clear.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0100010', 'KQ0100010button0', 'clear', this, 'Button');
    }
  });
  expj.KQ0100010.KQ0100010button0.clear.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010button0.clear.executePScriptOnLoad = function () {
  console.log('execute KQ0100010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0100010-KQ0100010button0-clear" name="clear" class="KQ0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KQ0100010-KQ0100010button0-close">
expj.KQ0100010.KQ0100010button0.close = {};
// script1="onClick;0;CLOSE"
expj.KQ0100010.KQ0100010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KQ0100010');
};
expj.KQ0100010.KQ0100010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0100010.KQ0100010button0.close['onClick' + i])) {
        expj.KQ0100010.KQ0100010button0.close['onClick' + i]();
      }
    }
  }
};
expj.KQ0100010.KQ0100010button0.close.executeAllOnDecision = function () {
};
expj.KQ0100010.KQ0100010button0.close.executeOnLoad = function () {
  $('#expj-KQ0100010-KQ0100010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0100010', 'KQ0100010button0', 'close', this, 'Button');
    }
  });
  expj.KQ0100010.KQ0100010button0.close.executePScriptOnLoad();
};

expj.KQ0100010.KQ0100010button0.close.executePScriptOnLoad = function () {
  console.log('execute KQ0100010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KQ0100010-KQ0100010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0100010-KQ0100010button0-close" name="close" class="KQ0100010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KQ0100010 (END)-->
<%
MessageStruct msgStruct = aKQ0100010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KQ0100010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KQ0100010)) {
  expj.common.treeInstanceMap.KQ0100010 = {};
}
expj.common.treeInstanceMap.KQ0100010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0100010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KQ0100010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0100010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KQ0100010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KQ0100010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KQ0100010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KQ0100010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KQ0100010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KQ0100010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KQ0100010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0100010)) {
  expj.common.detailDialogMap.KQ0100010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0100010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KQ0100010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0100010.<%=detailId %>)) {
  expj.common.detailDialogMap.KQ0100010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0100010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KQ0100010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0100010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KQ0100010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KQ0100010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KQ0100010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KQ0100010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KQ0100010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KQ0100010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KQ0100010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KQ0100010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KQ0100010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KQ0100010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KQ0100010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KQ0100010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KQ0100010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KQ0100010)) {
  expj.common.viewInstanceMap.KQ0100010 = {};
}
expj.common.viewInstanceMap.KQ0100010.<%=viewId %> = {};
expj.common.viewInstanceMap.KQ0100010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KQ0100010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KQ0100010.<%=viewId %>.init = function () {
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
    expj.KQ0100010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KQ0100010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KQ0100010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KQ0100010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KQ0100010_init">
/**
 * KQ0100010用のロード完了時初期化関数
 */
expj.KQ0100010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KQ0100010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KQ0100010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KQ0100010');
  expj.common.calendarInstanceMap.KQ0100010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KQ0100010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KQ0100010.<%=detailId %>.init();
  expj.common.detailDialogMap.KQ0100010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KQ0100010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KQ0100010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KQ0100010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KQ0100010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KQ0100010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KQ0100010-<%=detailId %>');
<%
 }
%>
  try{expj.KQ0100010.KQ0100010form1.ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form1.PeekerOrdNo.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form1.h_UPDATE_FLG.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form1.r_SEL_PTN1.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form1.SLIP_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form1.PeekerSlipCd.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form1.h_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form1.r_SEL_PTN2.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010button1.select.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.TAX_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.PeekerTaxCd.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.h_CURRNCY_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.h_TRANSPORT_LT.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.h_EXCH_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.h_TAX_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.CUST_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.h_PRICE_ROUND_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.h_SLIP_CTRL_GRP.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.INSPC_ACPT_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.h_INSPC_ACPT_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.ODR_ACPT_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.ODR_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.ODR_UNIT_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.SHIP_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.ODR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.ODR_AMOUNT_UNIT_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010button2.update.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010button0.clear.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010button0.close.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form1.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010button1.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form2.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010button2.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010form3.executeOnLoad();}catch(e){};
  try{expj.KQ0100010.KQ0100010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KQ0100010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KQ0100010', 'KQ0100010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KQ0100010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KQ0100010-focus-move');
  // 初期フォーカス当てる処理
  $('.KQ0100010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KQ0100010', '<%=request.getContextPath() %>');
};

/**
 * KQ0100010の全体onDecision処理
 */
expj.KQ0100010.executeAllOnDecision = function () {
  expj.KQ0100010.KQ0100010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KQ0100010_console">
expj.KQ0100010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>