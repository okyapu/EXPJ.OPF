<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:01:28 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KR0080\KR0080010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KR0080.*" %>
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
<jsp:useBean id="aKR0080010Control" class="com.nec.jp.orteus.metamorBase.KR0080.KR0080010Control" scope="request"/>
<jsp:useBean id="aKR0080010Struct" class="com.nec.jp.orteus.metamorBase.KR0080.KR0080010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

役務実績登録
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0080/jsp/KR0080010.jsp,v $
$Author: geng-jia $	
$Revision: 1.3 $　$Date: 2017/02/22 02:07:22 $
********************************************************* --%>
<html>
<head>
<title>役務実績登録</title>
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
<script class="expj-script-KR0080010_init">
  // KR0080010名前空間
  expj.KR0080010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KR0080010" data-screen="KR0080010" data-newdata="<%=aKR0080010Control.isNewData() %>">
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
			  <script class="expj-script-KR0080010-KR0080010form1">
expj.KR0080010.KR0080010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.KR0080010.KR0080010form1.onLoad0 = function () {
  console.log('KR0080010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.KR0080010.KR0080010form1.onDecision0 = function () {
  console.log('KR0080010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KR0080010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KR0080010button1/Select@*2"
expj.KR0080010.KR0080010form1.child0 = function () {
  console.log('KR0080010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button1/Select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;1;MASK;_KR0080010button1/Select@*3"
expj.KR0080010.KR0080010form1.child1 = function () {
  console.log('KR0080010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button1/Select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;2;CHKRQ;B@*4,*3"
expj.KR0080010.KR0080010form1.child2 = function () {
  console.log('KR0080010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('KR0080010', 'B')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;3;MASK;_KR0080010button2/Insert,_KR0080010button2/Update,_KR0080010button2/Delete"
expj.KR0080010.KR0080010form1.child3 = function () {
  console.log('KR0080010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Insert');
expj.common.pscript.setMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Delete');
};
// script7="child;4;CHK;?KR0080010form1/*[eq]NORMAL@*5,*7"
expj.KR0080010.KR0080010form1.child4 = function () {
  console.log('KR0080010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form1', '?KR0080010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;5;MASK;_KR0080010button2/Insert@*6"
expj.KR0080010.KR0080010form1.child5 = function () {
  console.log('KR0080010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script9="child;6;UNMASK;_KR0080010button2/Update,_KR0080010button2/Delete"
expj.KR0080010.KR0080010form1.child6 = function () {
  console.log('KR0080010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Delete');
};
// script10="child;7;MASK;_KR0080010button2/Update,_KR0080010button2/Delete@*8"
expj.KR0080010.KR0080010form1.child7 = function () {
  console.log('KR0080010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Delete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script11="child;8;UNMASK;_KR0080010button2/Insert"
expj.KR0080010.KR0080010form1.child8 = function () {
  console.log('KR0080010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Insert');
};
// script12="onDecision;1;CHK;?KR0080010form1/*[eq]NORMAL@*9,*10"
expj.KR0080010.KR0080010form1.onDecision1 = function () {
  console.log('KR0080010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form1', '?KR0080010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script13="child;9;CHK;_KR0080010form2/JOB_ODR_COMP_FLG[eq]true@*10,*11"
expj.KR0080010.KR0080010form1.child9 = function () {
  console.log('KR0080010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form1', '_KR0080010form2/JOB_ODR_COMP_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script14="child;10;MASK;_KR0080010button2/Delete"
expj.KR0080010.KR0080010form1.child10 = function () {
  console.log('KR0080010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Delete');
};
// script15="child;11;UNMASK;_KR0080010button2/Delete"
expj.KR0080010.KR0080010form1.child11 = function () {
  console.log('KR0080010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('KR0080010', 'KR0080010form1', '_KR0080010button2/Delete');
};
// script16="onDecision;2;CHK;_KR0080010form2/SALES_UNIT_PRICE[numneq]_KR0080010form2/h_SALES_UNIT_PRICE@*12"
expj.KR0080010.KR0080010form1.onDecision2 = function () {
  console.log('KR0080010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form1', '_KR0080010form2/SALES_UNIT_PRICE')), '[numneq]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form1', '_KR0080010form2/h_SALES_UNIT_PRICE')))) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script17="child;12;SET;_KR0080010form2/h_SALES_UNIT_PRICE=_KR0080010form2/SALES_UNIT_PRICE@*13"
expj.KR0080010.KR0080010form1.child12 = function () {
  console.log('KR0080010form1 script17');
expj.common.pscript.setReferenceComponentValue('KR0080010', 'KR0080010form1', '_KR0080010form2/h_SALES_UNIT_PRICE', expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form1', '_KR0080010form2/SALES_UNIT_PRICE'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script18="child;13;SET;_KR0080010form2/SALES_AMOUNT=[{_KR0080010form2/SALES_QTY}*{_KR0080010form2/SALES_UNIT_PRICE}]"
expj.KR0080010.KR0080010form1.child13 = function () {
  console.log('KR0080010form1 script18');
expj.common.pscript.setReferenceComponentValue('KR0080010', 'KR0080010form1', '_KR0080010form2/SALES_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form1', '_KR0080010form2/SALES_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form1', '_KR0080010form2/SALES_UNIT_PRICE')));
};
expj.KR0080010.KR0080010form1.executeAllOnDecision = function () {
  console.log('execute KR0080010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010form1['onDecision' + i])) {
        expj.KR0080010.KR0080010form1['onDecision' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010form1.executeOnLoad = function () {
  expj.KR0080010.KR0080010form1.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form1.executePScriptOnLoad = function () {
  console.log('execute KR0080010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KR0080010.KR0080010form1['onLoad' + i])) {
      expj.KR0080010.KR0080010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KR0080010-KR0080010form1" action="KR0080010Servlet" name="KR0080010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKR0080010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form1-ODR_NO">
expj.KR0080010.KR0080010form1.ODR_NO = {};
expj.KR0080010.KR0080010form1.ODR_NO.executeAllOnDecision = function () {
  console.log('execute KR0080010form1/ODR_NO.onDecision');
  expj.KR0080010.KR0080010form1.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form1.ODR_NO.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form1-ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form1', 'ODR_NO', this);
  });
  expj.KR0080010.KR0080010form1.ODR_NO.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form1.ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KR0080010form1/ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form1-ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form1-ODR_NO" name="ODR_NO" class="KR0080010-focus-move  required-value expj-KR0080010-required-A" style="width:260px;" data-kind="OBT_AN;" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getODR_NO()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form1-PeekerOdrNo">
expj.KR0080010.KR0080010form1.PeekerOdrNo = {};
// script1="onClick;0;PEEKER;_KR0080010form1/ODR_NO@<%=contextNo%>"
expj.KR0080010.KR0080010form1.PeekerOdrNo.onClick0 = function () {
  console.log('PeekerOdrNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0080010';
var parameterValues = 'PeekerOdrNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form1', '_KR0080010form1/ODR_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_SLIP_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_KR0080010form1/ODR_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0080010.KR0080010form1.PeekerOdrNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010form1.PeekerOdrNo['onClick' + i])) {
        expj.KR0080010.KR0080010form1.PeekerOdrNo['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010form1.PeekerOdrNo.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010form1.PeekerOdrNo.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form1-PeekerOdrNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010form1', 'PeekerOdrNo', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010form1.PeekerOdrNo.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form1.PeekerOdrNo.executePScriptOnLoad = function () {
  console.log('execute KR0080010form1/PeekerOdrNo.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form1-PeekerOdrNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0080010-KR0080010form1-PeekerOdrNo" class="KR0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KR0080010-KR0080010button1">
expj.KR0080010.KR0080010button1 = {};
expj.KR0080010.KR0080010button1.executeAllOnDecision = function () {
  console.log('execute KR0080010button1.onDecision');
};
expj.KR0080010.KR0080010button1.executeOnLoad = function () {
  expj.KR0080010.KR0080010button1.executePScriptOnLoad();
};

expj.KR0080010.KR0080010button1.executePScriptOnLoad = function () {
  console.log('execute KR0080010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0080010-KR0080010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0080010-KR0080010button1-Select">
expj.KR0080010.KR0080010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0080010form1/*,_KR0080010form2/*@KR0080010Servlet"
expj.KR0080010.KR0080010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0080010', 'KR0080010button1', '_KR0080010form1/*,_KR0080010form2/*', 'KR0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0080010', response);
expj.common.updateBusinessScreenTab('KR0080010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KR0080010.KR0080010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010button1.Select['onClick' + i])) {
        expj.KR0080010.KR0080010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010button1.Select.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010button1.Select.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010button1', 'Select', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010button1.Select.executePScriptOnLoad();
};

expj.KR0080010.KR0080010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KR0080010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0080010-KR0080010button1-Select" name="Select" class="KR0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KR0080010-KR0080010form2">
expj.KR0080010.KR0080010form2 = {};
expj.KR0080010.KR0080010form2.executeAllOnDecision = function () {
  console.log('execute KR0080010form2.onDecision');
};
expj.KR0080010.KR0080010form2.executeOnLoad = function () {
  expj.KR0080010.KR0080010form2.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KR0080010-KR0080010form2" action="KR0080010Servlet" name="KR0080010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SLIP_CD",rb)%></span><!-- 伝票番号 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-SLIP_CD">
expj.KR0080010.KR0080010form2.SLIP_CD = {};
expj.KR0080010.KR0080010form2.SLIP_CD.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/SLIP_CD.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.SLIP_CD.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-SLIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'SLIP_CD', this);
  });
  expj.KR0080010.KR0080010form2.SLIP_CD.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.SLIP_CD.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/SLIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-SLIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-SLIP_CD" name="SLIP_CD" class="KR0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getSLIP_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-JOB_ODR_COMP_FLG">
expj.KR0080010.KR0080010form2.JOB_ODR_COMP_FLG = {};
expj.KR0080010.KR0080010form2.JOB_ODR_COMP_FLG.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/JOB_ODR_COMP_FLG.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.JOB_ODR_COMP_FLG.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-JOB_ODR_COMP_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010form2', 'JOB_ODR_COMP_FLG', this, 'CheckBox');
    }
  });
  expj.KR0080010.KR0080010form2.JOB_ODR_COMP_FLG.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.JOB_ODR_COMP_FLG.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/JOB_ODR_COMP_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-JOB_ODR_COMP_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="JOB_ODR_COMP_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aKR0080010Struct.getJOB_ODR_COMP_FLG())) || "".equals(TypeConverter.convert(aKR0080010Struct.getJOB_ODR_COMP_FLG())))?"checked=\"checked\"": "" %> class="KR0080010-focus-move" id="expj-KR0080010-KR0080010form2-JOB_ODR_COMP_FLG"><label for="expj-KR0080010-KR0080010form2-JOB_ODR_COMP_FLG"><%=CoreTools.getRBString("Expj.JOB_ODR_COMP_FLG",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KR0080010-KR0080010form2-h_SALES_SEQ_NO" name="h_SALES_SEQ_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0080010Struct.geth_SALES_SEQ_NO()) %>">
<script class="expj-script-KR0080010-KR0080010form2-h_SALES_SEQ_NO">
expj.KR0080010.KR0080010form2.h_SALES_SEQ_NO = {};
expj.KR0080010.KR0080010form2.h_SALES_SEQ_NO.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/h_SALES_SEQ_NO.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.h_SALES_SEQ_NO.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-h_SALES_SEQ_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'h_SALES_SEQ_NO', this);
  });
  expj.KR0080010.KR0080010form2.h_SALES_SEQ_NO.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.h_SALES_SEQ_NO.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/h_SALES_SEQ_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-h_SALES_SEQ_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CD",rb)%></span><!-- 案件番号 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-PROJECT_CD">
expj.KR0080010.KR0080010form2.PROJECT_CD = {};
expj.KR0080010.KR0080010form2.PROJECT_CD.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/PROJECT_CD.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.PROJECT_CD.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-PROJECT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'PROJECT_CD', this);
  });
  expj.KR0080010.KR0080010form2.PROJECT_CD.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.PROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/PROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-PROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-PROJECT_CD" name="PROJECT_CD" class="KR0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getPROJECT_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-PROJECT_NAME">
expj.KR0080010.KR0080010form2.PROJECT_NAME = {};
expj.KR0080010.KR0080010form2.PROJECT_NAME.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/PROJECT_NAME.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.PROJECT_NAME.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-PROJECT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'PROJECT_NAME', this);
  });
  expj.KR0080010.KR0080010form2.PROJECT_NAME.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.PROJECT_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/PROJECT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-PROJECT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-PROJECT_NAME" name="PROJECT_NAME" class="KR0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getPROJECT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KR0080010-KR0080010form2-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-KR0080010-KR0080010form2-BUSINESS_OPR_DATE">
expj.KR0080010.KR0080010form2.BUSINESS_OPR_DATE = {};
expj.KR0080010.KR0080010form2.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/BUSINESS_OPR_DATE.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'BUSINESS_OPR_DATE', this);
  });
  expj.KR0080010.KR0080010form2.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATE_NO",rb)%></span><!-- 見積番号 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-ESTIMATE_NO">
expj.KR0080010.KR0080010form2.ESTIMATE_NO = {};
expj.KR0080010.KR0080010form2.ESTIMATE_NO.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/ESTIMATE_NO.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.ESTIMATE_NO.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-ESTIMATE_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'ESTIMATE_NO', this);
  });
  expj.KR0080010.KR0080010form2.ESTIMATE_NO.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.ESTIMATE_NO.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/ESTIMATE_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-ESTIMATE_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-ESTIMATE_NO" name="ESTIMATE_NO" class="KR0080010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getESTIMATE_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DETAIL_NO",rb)%></span><!-- 明細番号 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-DETAIL_NO">
expj.KR0080010.KR0080010form2.DETAIL_NO = {};
expj.KR0080010.KR0080010form2.DETAIL_NO.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/DETAIL_NO.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.DETAIL_NO.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-DETAIL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'DETAIL_NO', this);
  });
  expj.KR0080010.KR0080010form2.DETAIL_NO.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.DETAIL_NO.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/DETAIL_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-DETAIL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-DETAIL_NO" name="DETAIL_NO" class="KR0080010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getDETAIL_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KR0080010-KR0080010form2-SALSE_MODIFY_COUNT" name="SALSE_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getSALSE_MODIFY_COUNT()) %>">
<script class="expj-script-KR0080010-KR0080010form2-SALSE_MODIFY_COUNT">
expj.KR0080010.KR0080010form2.SALSE_MODIFY_COUNT = {};
expj.KR0080010.KR0080010form2.SALSE_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/SALSE_MODIFY_COUNT.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.SALSE_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-SALSE_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'SALSE_MODIFY_COUNT', this);
  });
  expj.KR0080010.KR0080010form2.SALSE_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.SALSE_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/SALSE_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-SALSE_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_NAME",rb)%></span><!-- 品目名 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-ITEM_NAME">
expj.KR0080010.KR0080010form2.ITEM_NAME = {};
expj.KR0080010.KR0080010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/ITEM_NAME.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'ITEM_NAME', this);
  });
  expj.KR0080010.KR0080010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:602px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-ITEM_NAME" name="ITEM_NAME" class="KR0080010-focus-move  " style="width:602px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KR0080010-KR0080010form2-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-KR0080010-KR0080010form2-MODIFY_COUNT">
expj.KR0080010.KR0080010form2.MODIFY_COUNT = {};
expj.KR0080010.KR0080010form2.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/MODIFY_COUNT.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'MODIFY_COUNT', this);
  });
  expj.KR0080010.KR0080010form2.MODIFY_COUNT.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SALES_DATE",rb)%></span><!-- 売上計上日 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-SALES_DATE">
expj.KR0080010.KR0080010form2.SALES_DATE = {};
expj.KR0080010.KR0080010form2.SALES_DATE.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/SALES_DATE.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.SALES_DATE.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-SALES_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'SALES_DATE', this);
  });
  expj.KR0080010.KR0080010form2.SALES_DATE.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.SALES_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/SALES_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-SALES_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-SALES_DATE" name="SALES_DATE" class="KR0080010-focus-move  required-value expj-KR0080010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getSALES_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-CalendarSalesDate">
expj.KR0080010.KR0080010form2.CalendarSalesDate = {};
// script1="onClick;0;CALENDAR;_KR0080010form2/SALES_DATE"
expj.KR0080010.KR0080010form2.CalendarSalesDate.onClick0 = function () {
  console.log('CalendarSalesDate script1');
expj.common.pscript.executeCalendar('KR0080010','KR0080010form2','_KR0080010form2/SALES_DATE');
};
expj.KR0080010.KR0080010form2.CalendarSalesDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010form2.CalendarSalesDate['onClick' + i])) {
        expj.KR0080010.KR0080010form2.CalendarSalesDate['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010form2.CalendarSalesDate.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010form2.CalendarSalesDate.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-CalendarSalesDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010form2', 'CalendarSalesDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KR0080010','KR0080010form2','_KR0080010form2/SALES_DATE');
  expj.KR0080010.KR0080010form2.CalendarSalesDate.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.CalendarSalesDate.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/CalendarSalesDate.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-CalendarSalesDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0080010-KR0080010form2-CalendarSalesDate" class="KR0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KR0080010-KR0080010form2-UNSTOCK_MODIFY_COUNT" name="UNSTOCK_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getUNSTOCK_MODIFY_COUNT()) %>">
<script class="expj-script-KR0080010-KR0080010form2-UNSTOCK_MODIFY_COUNT">
expj.KR0080010.KR0080010form2.UNSTOCK_MODIFY_COUNT = {};
expj.KR0080010.KR0080010form2.UNSTOCK_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/UNSTOCK_MODIFY_COUNT.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.UNSTOCK_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-UNSTOCK_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'UNSTOCK_MODIFY_COUNT', this);
  });
  expj.KR0080010.KR0080010form2.UNSTOCK_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.UNSTOCK_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/UNSTOCK_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-UNSTOCK_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SALES_DEPT_CD",rb)%></span><!-- 売上計上部門コード --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-SALES_DEPT_CD">
expj.KR0080010.KR0080010form2.SALES_DEPT_CD = {};
expj.KR0080010.KR0080010form2.SALES_DEPT_CD.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/SALES_DEPT_CD.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.SALES_DEPT_CD.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-SALES_DEPT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'SALES_DEPT_CD', this);
  });
  expj.KR0080010.KR0080010form2.SALES_DEPT_CD.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.SALES_DEPT_CD.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/SALES_DEPT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-SALES_DEPT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-SALES_DEPT_CD" name="SALES_DEPT_CD" class="KR0080010-focus-move  required-value expj-KR0080010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getSALES_DEPT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-PeekerSalesDeptCd">
expj.KR0080010.KR0080010form2.PeekerSalesDeptCd = {};
// script1="onClick;0;PEEKER;_KR0080010form2/SALES_DEPT_CD@<%=contextNo%>"
expj.KR0080010.KR0080010form2.PeekerSalesDeptCd.onClick0 = function () {
  console.log('PeekerSalesDeptCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0080010';
var parameterValues = 'PeekerSalesDeptCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form2', '_KR0080010form2/SALES_DEPT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KR0080010form2/SALES_DEPT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0080010.KR0080010form2.PeekerSalesDeptCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010form2.PeekerSalesDeptCd['onClick' + i])) {
        expj.KR0080010.KR0080010form2.PeekerSalesDeptCd['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010form2.PeekerSalesDeptCd.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010form2.PeekerSalesDeptCd.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-PeekerSalesDeptCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010form2', 'PeekerSalesDeptCd', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010form2.PeekerSalesDeptCd.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.PeekerSalesDeptCd.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/PeekerSalesDeptCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-PeekerSalesDeptCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0080010-KR0080010form2-PeekerSalesDeptCd" class="KR0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-SALES_DEPT_NAME">
expj.KR0080010.KR0080010form2.SALES_DEPT_NAME = {};
expj.KR0080010.KR0080010form2.SALES_DEPT_NAME.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/SALES_DEPT_NAME.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.SALES_DEPT_NAME.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-SALES_DEPT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'SALES_DEPT_NAME', this);
  });
  expj.KR0080010.KR0080010form2.SALES_DEPT_NAME.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.SALES_DEPT_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/SALES_DEPT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-SALES_DEPT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-SALES_DEPT_NAME" name="SALES_DEPT_NAME" class="KR0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getSALES_DEPT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KR0080010-KR0080010form2-h_INSTALL_FLG" name="h_INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0080010Struct.geth_INSTALL_FLG()) %>">
<script class="expj-script-KR0080010-KR0080010form2-h_INSTALL_FLG">
expj.KR0080010.KR0080010form2.h_INSTALL_FLG = {};
expj.KR0080010.KR0080010form2.h_INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/h_INSTALL_FLG.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.h_INSTALL_FLG.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-h_INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'h_INSTALL_FLG', this);
  });
  expj.KR0080010.KR0080010form2.h_INSTALL_FLG.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.h_INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/h_INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-h_INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_CHRG_PSN_CD",rb)%></span><!-- 営業担当者コード --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-CUST_CHRG_PSN_CD">
expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_CD = {};
expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/CUST_CHRG_PSN_CD.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_CD.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-CUST_CHRG_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'CUST_CHRG_PSN_CD', this);
  });
  expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_CD.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/CUST_CHRG_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-CUST_CHRG_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-CUST_CHRG_PSN_CD" name="CUST_CHRG_PSN_CD" class="KR0080010-focus-move  required-value expj-KR0080010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getCUST_CHRG_PSN_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-PeekerCustChrgPsnCd">
expj.KR0080010.KR0080010form2.PeekerCustChrgPsnCd = {};
// script1="onClick;0;PEEKER;_KR0080010form2/CUST_CHRG_PSN_CD@<%=contextNo%>"
expj.KR0080010.KR0080010form2.PeekerCustChrgPsnCd.onClick0 = function () {
  console.log('PeekerCustChrgPsnCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0080010';
var parameterValues = 'PeekerCustChrgPsnCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form2', '_KR0080010form2/CUST_CHRG_PSN_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KR0080010form2/CUST_CHRG_PSN_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0080010.KR0080010form2.PeekerCustChrgPsnCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010form2.PeekerCustChrgPsnCd['onClick' + i])) {
        expj.KR0080010.KR0080010form2.PeekerCustChrgPsnCd['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010form2.PeekerCustChrgPsnCd.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010form2.PeekerCustChrgPsnCd.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-PeekerCustChrgPsnCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010form2', 'PeekerCustChrgPsnCd', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010form2.PeekerCustChrgPsnCd.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.PeekerCustChrgPsnCd.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/PeekerCustChrgPsnCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-PeekerCustChrgPsnCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0080010-KR0080010form2-PeekerCustChrgPsnCd" class="KR0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-CUST_CHRG_PSN_NAME">
expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_NAME = {};
expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_NAME.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/CUST_CHRG_PSN_NAME.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_NAME.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-CUST_CHRG_PSN_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'CUST_CHRG_PSN_NAME', this);
  });
  expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_NAME.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/CUST_CHRG_PSN_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-CUST_CHRG_PSN_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-CUST_CHRG_PSN_NAME" name="CUST_CHRG_PSN_NAME" class="KR0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getCUST_CHRG_PSN_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KR0080010-KR0080010form2-h_CTL_SEQ_CD" name="h_CTL_SEQ_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0080010Struct.geth_CTL_SEQ_CD()) %>">
<script class="expj-script-KR0080010-KR0080010form2-h_CTL_SEQ_CD">
expj.KR0080010.KR0080010form2.h_CTL_SEQ_CD = {};
expj.KR0080010.KR0080010form2.h_CTL_SEQ_CD.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/h_CTL_SEQ_CD.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.h_CTL_SEQ_CD.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-h_CTL_SEQ_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'h_CTL_SEQ_CD', this);
  });
  expj.KR0080010.KR0080010form2.h_CTL_SEQ_CD.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.h_CTL_SEQ_CD.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/h_CTL_SEQ_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-h_CTL_SEQ_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_QTY",rb)%></span><!-- 売上実績数量 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-SALES_QTY">
expj.KR0080010.KR0080010form2.SALES_QTY = {};
expj.KR0080010.KR0080010form2.SALES_QTY.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/SALES_QTY.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.SALES_QTY.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-SALES_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'SALES_QTY', this);
  });
  expj.KR0080010.KR0080010form2.SALES_QTY.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.SALES_QTY.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/SALES_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-SALES_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-SALES_QTY" name="SALES_QTY" class="KR0080010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getSALES_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-STOCK_UNIT">
expj.KR0080010.KR0080010form2.STOCK_UNIT = {};
expj.KR0080010.KR0080010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/STOCK_UNIT.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'STOCK_UNIT', this);
  });
  expj.KR0080010.KR0080010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-STOCK_UNIT" name="STOCK_UNIT" class="KR0080010-focus-move  " style="width:100px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KR0080010-KR0080010form2-AI_AR_IF_FLG" name="AI_AR_IF_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getAI_AR_IF_FLG()) %>">
<script class="expj-script-KR0080010-KR0080010form2-AI_AR_IF_FLG">
expj.KR0080010.KR0080010form2.AI_AR_IF_FLG = {};
expj.KR0080010.KR0080010form2.AI_AR_IF_FLG.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/AI_AR_IF_FLG.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.AI_AR_IF_FLG.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-AI_AR_IF_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'AI_AR_IF_FLG', this);
  });
  expj.KR0080010.KR0080010form2.AI_AR_IF_FLG.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.AI_AR_IF_FLG.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/AI_AR_IF_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-AI_AR_IF_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_UNIT_PRICE",rb)%></span><!-- 売上単価 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-SALES_UNIT_PRICE">
expj.KR0080010.KR0080010form2.SALES_UNIT_PRICE = {};
expj.KR0080010.KR0080010form2.SALES_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/SALES_UNIT_PRICE.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.SALES_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-SALES_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'SALES_UNIT_PRICE', this);
  });
  expj.KR0080010.KR0080010form2.SALES_UNIT_PRICE.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.SALES_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/SALES_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-SALES_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-SALES_UNIT_PRICE" name="SALES_UNIT_PRICE" class="KR0080010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getSALES_UNIT_PRICE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-CUR_UNIT">
expj.KR0080010.KR0080010form2.CUR_UNIT = {};
expj.KR0080010.KR0080010form2.CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/CUR_UNIT.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.CUR_UNIT.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'CUR_UNIT', this);
  });
  expj.KR0080010.KR0080010form2.CUR_UNIT.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-CUR_UNIT" name="CUR_UNIT" class="KR0080010-focus-move  " style="width:100px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getCUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KR0080010-KR0080010form2-h_SALES_UNIT_PRICE" name="h_SALES_UNIT_PRICE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0080010Struct.geth_SALES_UNIT_PRICE()) %>">
<script class="expj-script-KR0080010-KR0080010form2-h_SALES_UNIT_PRICE">
expj.KR0080010.KR0080010form2.h_SALES_UNIT_PRICE = {};
expj.KR0080010.KR0080010form2.h_SALES_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/h_SALES_UNIT_PRICE.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.h_SALES_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-h_SALES_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'h_SALES_UNIT_PRICE', this);
  });
  expj.KR0080010.KR0080010form2.h_SALES_UNIT_PRICE.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.h_SALES_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/h_SALES_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-h_SALES_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_AMOUNT",rb)%></span><!-- 売上金額 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-SALES_AMOUNT">
expj.KR0080010.KR0080010form2.SALES_AMOUNT = {};
expj.KR0080010.KR0080010form2.SALES_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/SALES_AMOUNT.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.SALES_AMOUNT.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-SALES_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'SALES_AMOUNT', this);
  });
  expj.KR0080010.KR0080010form2.SALES_AMOUNT.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.SALES_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/SALES_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-SALES_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-SALES_AMOUNT" name="SALES_AMOUNT" class="KR0080010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getSALES_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_AMOUNT_YEN",rb)%></span><!-- 売上金額（邦貨) --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-SALES_AMOUNT_YEN">
expj.KR0080010.KR0080010form2.SALES_AMOUNT_YEN = {};
expj.KR0080010.KR0080010form2.SALES_AMOUNT_YEN.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/SALES_AMOUNT_YEN.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.SALES_AMOUNT_YEN.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-SALES_AMOUNT_YEN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'SALES_AMOUNT_YEN', this);
  });
  expj.KR0080010.KR0080010form2.SALES_AMOUNT_YEN.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.SALES_AMOUNT_YEN.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/SALES_AMOUNT_YEN.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-SALES_AMOUNT_YEN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-SALES_AMOUNT_YEN" name="SALES_AMOUNT_YEN" class="KR0080010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getSALES_AMOUNT_YEN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TAX_CD_1",rb)%></span><!-- 消費税コード --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-TAX_CD">
expj.KR0080010.KR0080010form2.TAX_CD = {};
expj.KR0080010.KR0080010form2.TAX_CD.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/TAX_CD.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.TAX_CD.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'TAX_CD', this);
  });
  expj.KR0080010.KR0080010form2.TAX_CD.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.TAX_CD.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-TAX_CD" name="TAX_CD" class="KR0080010-focus-move  required-value expj-KR0080010-required-B" style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getTAX_CD()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-PeekerTaxCd">
expj.KR0080010.KR0080010form2.PeekerTaxCd = {};
// script1="onClick;0;PEEKER;_KR0080010form2/TAX_CD@<%=contextNo%>"
expj.KR0080010.KR0080010form2.PeekerTaxCd.onClick0 = function () {
  console.log('PeekerTaxCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0080010';
var parameterValues = 'PeekerTaxCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form2', '_KR0080010form2/TAX_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%TAX_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KR0080010form2/TAX_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0080010.KR0080010form2.PeekerTaxCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010form2.PeekerTaxCd['onClick' + i])) {
        expj.KR0080010.KR0080010form2.PeekerTaxCd['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010form2.PeekerTaxCd.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010form2.PeekerTaxCd.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-PeekerTaxCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010form2', 'PeekerTaxCd', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010form2.PeekerTaxCd.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.PeekerTaxCd.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/PeekerTaxCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-PeekerTaxCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0080010-KR0080010form2-PeekerTaxCd" class="KR0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARKS",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-REMARKS">
expj.KR0080010.KR0080010form2.REMARKS = {};
expj.KR0080010.KR0080010form2.REMARKS.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/REMARKS.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.REMARKS.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'REMARKS', this);
  });
  expj.KR0080010.KR0080010form2.REMARKS.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.REMARKS.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-REMARKS" name="REMARKS" class="KR0080010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getREMARKS()) %>" maxlength="100" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_DATE_3",rb)%></span><!-- 作業日 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-WORK_DATE">
expj.KR0080010.KR0080010form2.WORK_DATE = {};
expj.KR0080010.KR0080010form2.WORK_DATE.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/WORK_DATE.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.WORK_DATE.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-WORK_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'WORK_DATE', this);
  });
  expj.KR0080010.KR0080010form2.WORK_DATE.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.WORK_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/WORK_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-WORK_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-WORK_DATE" name="WORK_DATE" class="KR0080010-focus-move  required-value expj-KR0080010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getWORK_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-CalendarWorkDate">
expj.KR0080010.KR0080010form2.CalendarWorkDate = {};
// script1="onClick;0;CALENDAR;_KR0080010form2/WORK_DATE"
expj.KR0080010.KR0080010form2.CalendarWorkDate.onClick0 = function () {
  console.log('CalendarWorkDate script1');
expj.common.pscript.executeCalendar('KR0080010','KR0080010form2','_KR0080010form2/WORK_DATE');
};
expj.KR0080010.KR0080010form2.CalendarWorkDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010form2.CalendarWorkDate['onClick' + i])) {
        expj.KR0080010.KR0080010form2.CalendarWorkDate['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010form2.CalendarWorkDate.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010form2.CalendarWorkDate.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-CalendarWorkDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010form2', 'CalendarWorkDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KR0080010','KR0080010form2','_KR0080010form2/WORK_DATE');
  expj.KR0080010.KR0080010form2.CalendarWorkDate.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.CalendarWorkDate.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/CalendarWorkDate.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-CalendarWorkDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0080010-KR0080010form2-CalendarWorkDate" class="KR0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_TIME",rb)%></span><!-- 作業時間 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-WORK_TIME">
expj.KR0080010.KR0080010form2.WORK_TIME = {};
expj.KR0080010.KR0080010form2.WORK_TIME.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/WORK_TIME.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.WORK_TIME.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-WORK_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'WORK_TIME', this);
  });
  expj.KR0080010.KR0080010form2.WORK_TIME.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.WORK_TIME.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/WORK_TIME.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-WORK_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-WORK_TIME" name="WORK_TIME" class="KR0080010-focus-move  required-value expj-KR0080010-required-B" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getWORK_TIME()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WAGE",rb)%></span><!-- 賃率 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-PAY_RATE">
expj.KR0080010.KR0080010form2.PAY_RATE = {};
expj.KR0080010.KR0080010form2.PAY_RATE.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/PAY_RATE.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.PAY_RATE.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-PAY_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'PAY_RATE', this);
  });
  expj.KR0080010.KR0080010form2.PAY_RATE.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.PAY_RATE.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/PAY_RATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-PAY_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-PAY_RATE" name="PAY_RATE" class="KR0080010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getPAY_RATE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:110px;"><span class="input-name "><%=CoreTools.getRBString("Expj.6702",rb)%></span><!-- （邦貨入力） --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_PERSON_CD",rb)%></span><!-- 作業担当者コード --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-WORK_PERSON_CD">
expj.KR0080010.KR0080010form2.WORK_PERSON_CD = {};
expj.KR0080010.KR0080010form2.WORK_PERSON_CD.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/WORK_PERSON_CD.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.WORK_PERSON_CD.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-WORK_PERSON_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'WORK_PERSON_CD', this);
  });
  expj.KR0080010.KR0080010form2.WORK_PERSON_CD.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.WORK_PERSON_CD.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/WORK_PERSON_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-WORK_PERSON_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-WORK_PERSON_CD" name="WORK_PERSON_CD" class="KR0080010-focus-move  " style="width:260px;" data-kind="OBT_AN;" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getWORK_PERSON_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-PeekerWorkPersonCd">
expj.KR0080010.KR0080010form2.PeekerWorkPersonCd = {};
// script1="onClick;0;PEEKER;_KR0080010form2/WORK_PERSON_CD@<%=contextNo%>"
expj.KR0080010.KR0080010form2.PeekerWorkPersonCd.onClick0 = function () {
  console.log('PeekerWorkPersonCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0080010';
var parameterValues = 'PeekerWorkPersonCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010form2', '_KR0080010form2/WORK_PERSON_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KR0080010form2/WORK_PERSON_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0080010.KR0080010form2.PeekerWorkPersonCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010form2.PeekerWorkPersonCd['onClick' + i])) {
        expj.KR0080010.KR0080010form2.PeekerWorkPersonCd['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010form2.PeekerWorkPersonCd.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010form2.PeekerWorkPersonCd.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-PeekerWorkPersonCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010form2', 'PeekerWorkPersonCd', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010form2.PeekerWorkPersonCd.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.PeekerWorkPersonCd.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/PeekerWorkPersonCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-PeekerWorkPersonCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0080010-KR0080010form2-PeekerWorkPersonCd" class="KR0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-WORK_PERSON_NAME">
expj.KR0080010.KR0080010form2.WORK_PERSON_NAME = {};
expj.KR0080010.KR0080010form2.WORK_PERSON_NAME.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/WORK_PERSON_NAME.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.WORK_PERSON_NAME.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-WORK_PERSON_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'WORK_PERSON_NAME', this);
  });
  expj.KR0080010.KR0080010form2.WORK_PERSON_NAME.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.WORK_PERSON_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/WORK_PERSON_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-WORK_PERSON_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-WORK_PERSON_NAME" name="WORK_PERSON_NAME" class="KR0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getWORK_PERSON_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_REMARKS",rb)%></span><!-- 作業備考 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-WORK_REMARKS">
expj.KR0080010.KR0080010form2.WORK_REMARKS = {};
expj.KR0080010.KR0080010form2.WORK_REMARKS.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/WORK_REMARKS.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.WORK_REMARKS.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-WORK_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'WORK_REMARKS', this);
  });
  expj.KR0080010.KR0080010form2.WORK_REMARKS.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.WORK_REMARKS.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/WORK_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-WORK_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-WORK_REMARKS" name="WORK_REMARKS" class="KR0080010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getWORK_REMARKS()) %>" maxlength="100" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-CUST_CD">
expj.KR0080010.KR0080010form2.CUST_CD = {};
expj.KR0080010.KR0080010form2.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/CUST_CD.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.CUST_CD.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'CUST_CD', this);
  });
  expj.KR0080010.KR0080010form2.CUST_CD.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-CUST_CD" name="CUST_CD" class="KR0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getCUST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-CUST_NAME">
expj.KR0080010.KR0080010form2.CUST_NAME = {};
expj.KR0080010.KR0080010form2.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/CUST_NAME.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.CUST_NAME.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'CUST_NAME', this);
  });
  expj.KR0080010.KR0080010form2.CUST_NAME.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-CUST_NAME" name="CUST_NAME" class="KR0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getCUST_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-ITEM_CD">
expj.KR0080010.KR0080010form2.ITEM_CD = {};
expj.KR0080010.KR0080010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/ITEM_CD.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'ITEM_CD', this);
  });
  expj.KR0080010.KR0080010form2.ITEM_CD.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-ITEM_CD" name="ITEM_CD" class="KR0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-ITEM_NAME_1">
expj.KR0080010.KR0080010form2.ITEM_NAME_1 = {};
expj.KR0080010.KR0080010form2.ITEM_NAME_1.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/ITEM_NAME_1.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.ITEM_NAME_1.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-ITEM_NAME_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'ITEM_NAME_1', this);
  });
  expj.KR0080010.KR0080010form2.ITEM_NAME_1.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.ITEM_NAME_1.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/ITEM_NAME_1.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-ITEM_NAME_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-ITEM_NAME_1" name="ITEM_NAME_1" class="KR0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getITEM_NAME_1()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-CUST_ODR_NO">
expj.KR0080010.KR0080010form2.CUST_ODR_NO = {};
expj.KR0080010.KR0080010form2.CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/CUST_ODR_NO.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'CUST_ODR_NO', this);
  });
  expj.KR0080010.KR0080010form2.CUST_ODR_NO.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-CUST_ODR_NO" name="CUST_ODR_NO" class="KR0080010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getCUST_ODR_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010form2-DESINATED_DLV_DATE">
expj.KR0080010.KR0080010form2.DESINATED_DLV_DATE = {};
expj.KR0080010.KR0080010form2.DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KR0080010form2/DESINATED_DLV_DATE.onDecision');
  expj.KR0080010.KR0080010form2.executeAllOnDecision();
  expj.KR0080010.executeAllOnDecision();
};
expj.KR0080010.KR0080010form2.DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010form2-DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0080010', 'KR0080010form2', 'DESINATED_DLV_DATE', this);
  });
  expj.KR0080010.KR0080010form2.DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KR0080010.KR0080010form2.DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0080010form2/DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010form2-DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0080010-KR0080010form2-DESINATED_DLV_DATE" name="DESINATED_DLV_DATE" class="KR0080010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKR0080010Struct.getDESINATED_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-KR0080010-KR0080010button2">
expj.KR0080010.KR0080010button2 = {};
expj.KR0080010.KR0080010button2.executeAllOnDecision = function () {
  console.log('execute KR0080010button2.onDecision');
};
expj.KR0080010.KR0080010button2.executeOnLoad = function () {
  expj.KR0080010.KR0080010button2.executePScriptOnLoad();
};

expj.KR0080010.KR0080010button2.executePScriptOnLoad = function () {
  console.log('execute KR0080010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0080010-KR0080010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0080010-KR0080010button2-Insert">
expj.KR0080010.KR0080010button2.Insert = {};
// script1="onClick;0;CHK;_KR0080010form2/SALES_AMOUNT[numeq]0@!KU01002"
expj.KR0080010.KR0080010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/SALES_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KU01002');
}
};
// script2="onClick;1;CHK;~TO_YYYY_MM(_KR0080010form2/SALES_DATE)[lt]~TO_YYYY_MM(_KR0080010form2/BUSINESS_OPR_DATE)@!KU02010"
expj.KR0080010.KR0080010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0080010', 'KR0080010button2', '_KR0080010form2/SALES_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0080010', 'KR0080010button2', '_KR0080010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KU02010');
}
};
// script3="onClick;2;CHK;_KR0080010form2/SALES_DATE[gt]_KR0080010form2/BUSINESS_OPR_DATE@!KR10024"
expj.KR0080010.KR0080010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/SALES_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KR10024');
}
};
// script4="onClick;3;CHK;_KR0080010form2/WORK_DATE[gt]_KR0080010form2/BUSINESS_OPR_DATE@!KM00037"
expj.KR0080010.KR0080010button2.Insert.onClick3 = function () {
  console.log('Insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/WORK_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KM00037');
}
};
// script5="onClick;4;CHK;_KR0080010form2/WORK_TIME[numeq]0@!KM00026"
expj.KR0080010.KR0080010button2.Insert.onClick4 = function () {
  console.log('Insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/WORK_TIME')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KM00026');
}
};
// script6="onClick;5;CHK;_KR0080010form2/PAY_RATE[numeq]0@!KM00029"
expj.KR0080010.KR0080010button2.Insert.onClick5 = function () {
  console.log('Insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/PAY_RATE')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KM00029');
}
};
// script7="onClick;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0080010form1/*,_KR0080010form2/*@KR0080010Servlet,,$ZZ07001"
expj.KR0080010.KR0080010button2.Insert.onClick6 = function () {
  console.log('Insert script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0080010', 'KR0080010button2', '_KR0080010form1/*,_KR0080010form2/*', 'KR0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0080010', response);
expj.common.updateBusinessScreenTab('KR0080010', contents);
};
expj.common.pscript.callConfirm('KR0080010', 'KR0080010button2', 'ZZ07001', okEvent);
};
expj.KR0080010.KR0080010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010button2.Insert['onClick' + i])) {
        expj.KR0080010.KR0080010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010button2.Insert.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010button2.Insert.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010button2', 'Insert', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010button2.Insert.executePScriptOnLoad();
};

expj.KR0080010.KR0080010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute KR0080010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0080010-KR0080010button2-Insert" name="Insert" class="KR0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010button2-Update">
expj.KR0080010.KR0080010button2.Update = {};
// script1="onClick;0;CHK;_KR0080010form2/SALES_AMOUNT[numeq]0@!KU01002"
expj.KR0080010.KR0080010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/SALES_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KU01002');
}
};
// script2="onClick;1;CHK;~TO_YYYY_MM(_KR0080010form2/SALES_DATE)[lt]~TO_YYYY_MM(_KR0080010form2/BUSINESS_OPR_DATE)@!KU02010"
expj.KR0080010.KR0080010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0080010', 'KR0080010button2', '_KR0080010form2/SALES_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0080010', 'KR0080010button2', '_KR0080010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KU02010');
}
};
// script3="onClick;2;CHK;_KR0080010form2/SALES_DATE[gt]_KR0080010form2/BUSINESS_OPR_DATE@!KR10024"
expj.KR0080010.KR0080010button2.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/SALES_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KR10024');
}
};
// script4="onClick;3;CHK;_KR0080010form2/WORK_DATE[gt]_KR0080010form2/BUSINESS_OPR_DATE@!KM00037"
expj.KR0080010.KR0080010button2.Update.onClick3 = function () {
  console.log('Update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/WORK_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KM00037');
}
};
// script5="onClick;4;CHK;_KR0080010form2/WORK_TIME[numeq]0@!KM00026"
expj.KR0080010.KR0080010button2.Update.onClick4 = function () {
  console.log('Update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/WORK_TIME')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KM00026');
}
};
// script6="onClick;5;CHK;_KR0080010form2/PAY_RATE[numeq]0@!KM00029"
expj.KR0080010.KR0080010button2.Update.onClick5 = function () {
  console.log('Update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0080010', 'KR0080010button2', '_KR0080010form2/PAY_RATE')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0080010', 'KR0080010button2', 'KM00029');
}
};
// script7="onClick;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0080010form1/*,_KR0080010form2/*@KR0080010Servlet,,$ZZ07003"
expj.KR0080010.KR0080010button2.Update.onClick6 = function () {
  console.log('Update script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0080010', 'KR0080010button2', '_KR0080010form1/*,_KR0080010form2/*', 'KR0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0080010', response);
expj.common.updateBusinessScreenTab('KR0080010', contents);
};
expj.common.pscript.callConfirm('KR0080010', 'KR0080010button2', 'ZZ07003', okEvent);
};
expj.KR0080010.KR0080010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010button2.Update['onClick' + i])) {
        expj.KR0080010.KR0080010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010button2.Update.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010button2.Update.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010button2', 'Update', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010button2.Update.executePScriptOnLoad();
};

expj.KR0080010.KR0080010button2.Update.executePScriptOnLoad = function () {
  console.log('execute KR0080010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0080010-KR0080010button2-Update" name="Update" class="KR0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010button2-Delete">
expj.KR0080010.KR0080010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0080010form1/*,_KR0080010form2/*@KR0080010Servlet,,$ZZ07004"
expj.KR0080010.KR0080010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0080010', 'KR0080010button2', '_KR0080010form1/*,_KR0080010form2/*', 'KR0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0080010', response);
expj.common.updateBusinessScreenTab('KR0080010', contents);
};
expj.common.pscript.callConfirm('KR0080010', 'KR0080010button2', 'ZZ07004', okEvent);
};
expj.KR0080010.KR0080010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010button2.Delete['onClick' + i])) {
        expj.KR0080010.KR0080010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010button2.Delete.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010button2.Delete.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010button2', 'Delete', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010button2.Delete.executePScriptOnLoad();
};

expj.KR0080010.KR0080010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute KR0080010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0080010-KR0080010button2-Delete" name="Delete" class="KR0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KR0080010 Revision: 1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KR0080010-KR0080010button0">
expj.KR0080010.KR0080010button0 = {};
expj.KR0080010.KR0080010button0.executeAllOnDecision = function () {
  console.log('execute KR0080010button0.onDecision');
};
expj.KR0080010.KR0080010button0.executeOnLoad = function () {
  expj.KR0080010.KR0080010button0.executePScriptOnLoad();
};

expj.KR0080010.KR0080010button0.executePScriptOnLoad = function () {
  console.log('execute KR0080010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0080010-KR0080010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0080010-KR0080010button0-Clear">
expj.KR0080010.KR0080010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KR0080010Servlet,,$ZZ07008"
expj.KR0080010.KR0080010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0080010', 'KR0080010button0', '', 'KR0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0080010', response);
expj.common.updateBusinessScreenTab('KR0080010', contents);
};
expj.common.pscript.callConfirm('KR0080010', 'KR0080010button0', 'ZZ07008', okEvent);
};
expj.KR0080010.KR0080010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010button0.Clear['onClick' + i])) {
        expj.KR0080010.KR0080010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010button0.Clear.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010button0.Clear.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010button0', 'Clear', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010button0.Clear.executePScriptOnLoad();
};

expj.KR0080010.KR0080010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KR0080010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0080010-KR0080010button0-Clear" name="Clear" class="KR0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KR0080010-KR0080010button0-Close">
expj.KR0080010.KR0080010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KR0080010.KR0080010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KR0080010');
};
expj.KR0080010.KR0080010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0080010.KR0080010button0.Close['onClick' + i])) {
        expj.KR0080010.KR0080010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KR0080010.KR0080010button0.Close.executeAllOnDecision = function () {
};
expj.KR0080010.KR0080010button0.Close.executeOnLoad = function () {
  $('#expj-KR0080010-KR0080010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0080010', 'KR0080010button0', 'Close', this, 'Button');
    }
  });
  expj.KR0080010.KR0080010button0.Close.executePScriptOnLoad();
};

expj.KR0080010.KR0080010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KR0080010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KR0080010-KR0080010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0080010-KR0080010button0-Close" name="Close" class="KR0080010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KR0080010 (END)-->
<%
MessageStruct msgStruct = aKR0080010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KR0080010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KR0080010)) {
  expj.common.treeInstanceMap.KR0080010 = {};
}
expj.common.treeInstanceMap.KR0080010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KR0080010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KR0080010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KR0080010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KR0080010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KR0080010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KR0080010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KR0080010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KR0080010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KR0080010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KR0080010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0080010)) {
  expj.common.detailDialogMap.KR0080010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0080010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KR0080010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0080010.<%=detailId %>)) {
  expj.common.detailDialogMap.KR0080010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0080010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KR0080010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0080010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KR0080010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KR0080010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KR0080010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KR0080010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KR0080010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KR0080010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KR0080010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KR0080010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KR0080010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KR0080010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KR0080010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KR0080010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KR0080010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KR0080010)) {
  expj.common.viewInstanceMap.KR0080010 = {};
}
expj.common.viewInstanceMap.KR0080010.<%=viewId %> = {};
expj.common.viewInstanceMap.KR0080010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KR0080010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KR0080010.<%=viewId %>.init = function () {
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
    expj.KR0080010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KR0080010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KR0080010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KR0080010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KR0080010_init">
/**
 * KR0080010用のロード完了時初期化関数
 */
expj.KR0080010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KR0080010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KR0080010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KR0080010');
  expj.common.calendarInstanceMap.KR0080010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KR0080010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KR0080010.<%=detailId %>.init();
  expj.common.detailDialogMap.KR0080010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KR0080010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KR0080010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KR0080010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KR0080010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KR0080010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KR0080010-<%=detailId %>');
<%
 }
%>
  try{expj.KR0080010.KR0080010form1.ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form1.PeekerOdrNo.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.SLIP_CD.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.JOB_ODR_COMP_FLG.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.h_SALES_SEQ_NO.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.PROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.PROJECT_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.ESTIMATE_NO.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.DETAIL_NO.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.SALSE_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.SALES_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.CalendarSalesDate.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.UNSTOCK_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.SALES_DEPT_CD.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.PeekerSalesDeptCd.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.SALES_DEPT_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.h_INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.PeekerCustChrgPsnCd.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.CUST_CHRG_PSN_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.h_CTL_SEQ_CD.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.SALES_QTY.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.AI_AR_IF_FLG.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.SALES_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.h_SALES_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.SALES_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.SALES_AMOUNT_YEN.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.TAX_CD.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.PeekerTaxCd.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.REMARKS.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.WORK_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.CalendarWorkDate.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.WORK_TIME.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.PAY_RATE.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.WORK_PERSON_CD.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.PeekerWorkPersonCd.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.WORK_PERSON_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.WORK_REMARKS.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.ITEM_NAME_1.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010button2.Update.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form1.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010button1.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010form2.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010button2.executeOnLoad();}catch(e){};
  try{expj.KR0080010.KR0080010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KR0080010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KR0080010', 'KR0080010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KR0080010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KR0080010-focus-move');
  // 初期フォーカス当てる処理
  $('.KR0080010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KR0080010', '<%=request.getContextPath() %>');
};

/**
 * KR0080010の全体onDecision処理
 */
expj.KR0080010.executeAllOnDecision = function () {
  expj.KR0080010.KR0080010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KR0080010_console">
expj.KR0080010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>