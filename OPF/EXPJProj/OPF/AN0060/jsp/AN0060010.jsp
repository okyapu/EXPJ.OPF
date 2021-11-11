<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:09:37 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AN0060\AN0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AN0060.*" %>
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
<jsp:useBean id="aAN0060010Control" class="com.nec.jp.orteus.metamorBase.AN0060.AN0060010Control" scope="request"/>
<jsp:useBean id="aAN0060010Struct" class="com.nec.jp.orteus.metamorBase.AN0060.AN0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

コンボボックスデータパラメータメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0060/jsp/AN0060010.jsp,v $
$Author: geng-jia $
$Revision: 1.9 $ $Date: 2017/02/22 02:06:25 $
********************************************************* --%>
<html>
<head>
<title>コンボボックスデータパラメータメンテナンス</title>
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
<script class="expj-script-AN0060010_init">
  // AN0060010名前空間
  expj.AN0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AN0060010" data-screen="AN0060010" data-newdata="<%=aAN0060010Control.isNewData() %>">
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
              <script class="expj-script-AN0060010-AN0060010form1">
expj.AN0060010.AN0060010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AN0060010.AN0060010form1.onLoad0 = function () {
  console.log('AN0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AN0060010.AN0060010form1.onDecision0 = function () {
  console.log('AN0060010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AN0060010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AN0060010button1/Select"
expj.AN0060010.AN0060010form1.child0 = function () {
  console.log('AN0060010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AN0060010', 'AN0060010form1', '_AN0060010button1/Select');
};
// script4="child;1;MASK;_AN0060010button1/Select"
expj.AN0060010.AN0060010form1.child1 = function () {
  console.log('AN0060010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AN0060010', 'AN0060010form1', '_AN0060010button1/Select');
};
// script5="onDecision;1;CHKRQ;A,B@*2,*4"
expj.AN0060010.AN0060010form1.onDecision1 = function () {
  console.log('AN0060010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AN0060010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AN0060010', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?AN0060010view1/*[neq]NORMAL@*3,*4"
expj.AN0060010.AN0060010form1.child2 = function () {
  console.log('AN0060010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0060010', 'AN0060010form1', '?AN0060010view1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AN0060010button2/InsertAll"
expj.AN0060010.AN0060010form1.child3 = function () {
  console.log('AN0060010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AN0060010', 'AN0060010form1', '_AN0060010button2/InsertAll');
};
// script8="child;4;MASK;_AN0060010button2/InsertAll"
expj.AN0060010.AN0060010form1.child4 = function () {
  console.log('AN0060010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AN0060010', 'AN0060010form1', '_AN0060010button2/InsertAll');
};
// script9="onDecision;2;CHKRQ;B@*5,*7"
expj.AN0060010.AN0060010form1.onDecision2 = function () {
  console.log('AN0060010form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('AN0060010', 'B')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;5;CHK;?AN0060010view1/*[eq]NORMAL[and]?AN0060010form1/TYPE_CD[eq]SAME@*6,*7"
expj.AN0060010.AN0060010form1.child5 = function () {
  console.log('AN0060010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0060010', 'AN0060010form1', '?AN0060010view1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0060010', 'AN0060010form1', '?AN0060010form1/TYPE_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_AN0060010button2/UpdateAll"
expj.AN0060010.AN0060010form1.child6 = function () {
  console.log('AN0060010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AN0060010', 'AN0060010form1', '_AN0060010button2/UpdateAll');
};
// script12="child;7;MASK;_AN0060010button2/UpdateAll"
expj.AN0060010.AN0060010form1.child7 = function () {
  console.log('AN0060010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AN0060010', 'AN0060010form1', '_AN0060010button2/UpdateAll');
};
// script13="onDecision;3;CHKRQ;?AN0060010view1/?[neq]NOT_SELECTED@*8,*10"
expj.AN0060010.AN0060010form1.onDecision3 = function () {
  console.log('AN0060010form1 script13');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0060010', 'AN0060010form1', '?AN0060010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script14="child;8;CHK;?AN0060010view1/*[eq]NORMAL[and]?AN0060010form1/TYPE_CD[eq]SAME@*9,*10"
expj.AN0060010.AN0060010form1.child8 = function () {
  console.log('AN0060010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0060010', 'AN0060010form1', '?AN0060010view1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0060010', 'AN0060010form1', '?AN0060010form1/TYPE_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script15="child;9;UNMASK;_AN0060010button2/DeleteAssort"
expj.AN0060010.AN0060010form1.child9 = function () {
  console.log('AN0060010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AN0060010', 'AN0060010form1', '_AN0060010button2/DeleteAssort');
};
// script16="child;10;MASK;_AN0060010button2/DeleteAssort"
expj.AN0060010.AN0060010form1.child10 = function () {
  console.log('AN0060010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AN0060010', 'AN0060010form1', '_AN0060010button2/DeleteAssort');
};
expj.AN0060010.AN0060010form1.executeAllOnDecision = function () {
  console.log('execute AN0060010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0060010.AN0060010form1['onDecision' + i])) {
        expj.AN0060010.AN0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.AN0060010.AN0060010form1.executeOnLoad = function () {
  expj.AN0060010.AN0060010form1.executePScriptOnLoad();
};

expj.AN0060010.AN0060010form1.executePScriptOnLoad = function () {
  console.log('execute AN0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AN0060010.AN0060010form1['onLoad' + i])) {
      expj.AN0060010.AN0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AN0060010-AN0060010form1" action="AN0060010Servlet" name="AN0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:38px;align:left"></div>
<div class="div-td" style="width:132px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NAME_2",rb)%></span><!-- コンボボックスコード --></div><!--/td-->
<script class="expj-script-AN0060010-AN0060010form1-TYPE_CD">
expj.AN0060010.AN0060010form1.TYPE_CD = {};
expj.AN0060010.AN0060010form1.TYPE_CD.executeAllOnDecision = function () {
  console.log('execute AN0060010form1/TYPE_CD.onDecision');
  expj.AN0060010.AN0060010form1.executeAllOnDecision();
  expj.AN0060010.executeAllOnDecision();
};
expj.AN0060010.AN0060010form1.TYPE_CD.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010form1-TYPE_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0060010', 'AN0060010form1', 'TYPE_CD', this);
  });
  expj.AN0060010.AN0060010form1.TYPE_CD.executePScriptOnLoad();
};

expj.AN0060010.AN0060010form1.TYPE_CD.executePScriptOnLoad = function () {
  console.log('execute AN0060010form1/TYPE_CD.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010form1-TYPE_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AN0060010-AN0060010form1-TYPE_CD" name="TYPE_CD" class="AN0060010-focus-move  required-value expj-AN0060010-required-A" style="width:320px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAN0060010Struct.getTYPE_CD()) %>" maxlength="32" ></div><!--/td-->
<script class="expj-script-AN0060010-AN0060010form1-PeekerName">
expj.AN0060010.AN0060010form1.PeekerName = {};
// script1="onClick;0;PEEKER;_AN0060010form1/TYPE_CD@<%=contextNo%>"
expj.AN0060010.AN0060010form1.PeekerName.onClick0 = function () {
  console.log('PeekerName script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AN0060010';
var parameterValues = 'PeekerName%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AN0060010', 'AN0060010form1', '_TYPE_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%NAME_01%&%';
parameterValues += 'TARGET_FIELD%=%_AN0060010form1/TYPE_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AN0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AN0060010.AN0060010form1.PeekerName.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0060010.AN0060010form1.PeekerName['onClick' + i])) {
        expj.AN0060010.AN0060010form1.PeekerName['onClick' + i]();
      }
    }
  }
};
expj.AN0060010.AN0060010form1.PeekerName.executeAllOnDecision = function () {
};
expj.AN0060010.AN0060010form1.PeekerName.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010form1-PeekerName').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0060010', 'AN0060010form1', 'PeekerName', this, 'Button');
    }
  });
  expj.AN0060010.AN0060010form1.PeekerName.executePScriptOnLoad();
};

expj.AN0060010.AN0060010form1.PeekerName.executePScriptOnLoad = function () {
  console.log('execute AN0060010form1/PeekerName.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010form1-PeekerName');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:132px;text-align:left;"><button type="button" id="expj-AN0060010-AN0060010form1-PeekerName" class="AN0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AN0060010-AN0060010button1">
expj.AN0060010.AN0060010button1 = {};
expj.AN0060010.AN0060010button1.executeAllOnDecision = function () {
  console.log('execute AN0060010button1.onDecision');
};
expj.AN0060010.AN0060010button1.executeOnLoad = function () {
  expj.AN0060010.AN0060010button1.executePScriptOnLoad();
};

expj.AN0060010.AN0060010button1.executePScriptOnLoad = function () {
  console.log('execute AN0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0060010-AN0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0060010-AN0060010button1-Select">
expj.AN0060010.AN0060010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0060010form1/*@AN0060010Servlet"
expj.AN0060010.AN0060010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0060010', 'AN0060010button1', '_AN0060010form1/*', 'AN0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0060010', response);
expj.common.updateBusinessScreenTab('AN0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AN0060010.AN0060010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0060010.AN0060010button1.Select['onClick' + i])) {
        expj.AN0060010.AN0060010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AN0060010.AN0060010button1.Select.executeAllOnDecision = function () {
};
expj.AN0060010.AN0060010button1.Select.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0060010', 'AN0060010button1', 'Select', this, 'Button');
    }
  });
  expj.AN0060010.AN0060010button1.Select.executePScriptOnLoad();
};

expj.AN0060010.AN0060010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AN0060010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0060010-AN0060010button1-Select" name="Select" class="AN0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><script class="expj-script-AN0060010-AN0060010form2">
expj.AN0060010.AN0060010form2 = {};
expj.AN0060010.AN0060010form2.executeAllOnDecision = function () {
  console.log('execute AN0060010form2.onDecision');
};
expj.AN0060010.AN0060010form2.executeOnLoad = function () {
  expj.AN0060010.AN0060010form2.executePScriptOnLoad();
};

expj.AN0060010.AN0060010form2.executePScriptOnLoad = function () {
  console.log('execute AN0060010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AN0060010-AN0060010form2" action="AN0060010Servlet" name="AN0060010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TYPE_NAME",rb)%></span><!-- コンボボックス名称 --></div><!--/td-->
<script class="expj-script-AN0060010-AN0060010form2-TYPE_NAME">
expj.AN0060010.AN0060010form2.TYPE_NAME = {};
expj.AN0060010.AN0060010form2.TYPE_NAME.executeAllOnDecision = function () {
  console.log('execute AN0060010form2/TYPE_NAME.onDecision');
  expj.AN0060010.AN0060010form2.executeAllOnDecision();
  expj.AN0060010.executeAllOnDecision();
};
expj.AN0060010.AN0060010form2.TYPE_NAME.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010form2-TYPE_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0060010', 'AN0060010form2', 'TYPE_NAME', this);
  });
  expj.AN0060010.AN0060010form2.TYPE_NAME.executePScriptOnLoad();
};

expj.AN0060010.AN0060010form2.TYPE_NAME.executePScriptOnLoad = function () {
  console.log('execute AN0060010form2/TYPE_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010form2-TYPE_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AN0060010-AN0060010form2-TYPE_NAME" name="TYPE_NAME" class="AN0060010-focus-move  required-value expj-AN0060010-required-B" style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAN0060010Struct.getTYPE_NAME()) %>" maxlength="64" ></div><!--/td-->
<input type="hidden" id="expj-AN0060010-AN0060010form2-h_INSERTABLE_TYP" name="h_INSERTABLE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAN0060010Struct.geth_INSERTABLE_TYP()) %>">
<script class="expj-script-AN0060010-AN0060010form2-h_INSERTABLE_TYP">
expj.AN0060010.AN0060010form2.h_INSERTABLE_TYP = {};
expj.AN0060010.AN0060010form2.h_INSERTABLE_TYP.executeAllOnDecision = function () {
  console.log('execute AN0060010form2/h_INSERTABLE_TYP.onDecision');
  expj.AN0060010.AN0060010form2.executeAllOnDecision();
  expj.AN0060010.executeAllOnDecision();
};
expj.AN0060010.AN0060010form2.h_INSERTABLE_TYP.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010form2-h_INSERTABLE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0060010', 'AN0060010form2', 'h_INSERTABLE_TYP', this);
  });
  expj.AN0060010.AN0060010form2.h_INSERTABLE_TYP.executePScriptOnLoad();
};

expj.AN0060010.AN0060010form2.h_INSERTABLE_TYP.executePScriptOnLoad = function () {
  console.log('execute AN0060010form2/h_INSERTABLE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010form2-h_INSERTABLE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AN0060010-AN0060010form2-h_TYPE_NAME" name="h_TYPE_NAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAN0060010Struct.geth_TYPE_NAME()) %>">
<script class="expj-script-AN0060010-AN0060010form2-h_TYPE_NAME">
expj.AN0060010.AN0060010form2.h_TYPE_NAME = {};
expj.AN0060010.AN0060010form2.h_TYPE_NAME.executeAllOnDecision = function () {
  console.log('execute AN0060010form2/h_TYPE_NAME.onDecision');
  expj.AN0060010.AN0060010form2.executeAllOnDecision();
  expj.AN0060010.executeAllOnDecision();
};
expj.AN0060010.AN0060010form2.h_TYPE_NAME.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010form2-h_TYPE_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0060010', 'AN0060010form2', 'h_TYPE_NAME', this);
  });
  expj.AN0060010.AN0060010form2.h_TYPE_NAME.executePScriptOnLoad();
};

expj.AN0060010.AN0060010form2.h_TYPE_NAME.executePScriptOnLoad = function () {
  console.log('execute AN0060010form2/h_TYPE_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010form2-h_TYPE_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:calc(100% - 23px);"><script class="expj-script-AN0060010-AN0060010view1">
expj.AN0060010.AN0060010view1 = {};
expj.AN0060010.AN0060010view1.executeAllOnClick = function () {
};
expj.AN0060010.AN0060010view1.executeAllOnDecision = function () {
  console.log('execute AN0060010view1.onDecision');
};
expj.AN0060010.AN0060010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AN0060010view1", "expj.AN0060010.AN0060010view1.executeAllOnClick");
%>
  expj.AN0060010.AN0060010view1.executePScriptOnLoad();
};

expj.AN0060010.AN0060010view1.executePScriptOnLoad = function () {
  console.log('execute AN0060010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AN0060010-AN0060010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%=TypeConverter.sanitizer(aAN0060010Control.getReadStatusString())%>"></div>
<!-- VIEW END -->
<%
 String AN0060010view1_Id = "AN0060010view1";
 String AN0060010view1_select = "single";
 String AN0060010view1_sortable = "true";
 String AN0060010view1_resize = "true";
 String AN0060010view1_scroll = "true";
 StringBuffer AN0060010view1_HB = new StringBuffer();
 StringBuffer AN0060010view1_DB = new StringBuffer();
%>
<%
 AN0060010view1_select = "multi";
 AN0060010view1_sortable = "false";
 AN0060010view1_resize = "true";
 AN0060010view1_scroll = "true";
%>
<%
 AN0060010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AN0060010view1_sortable).append("}").append(",");
%>
     <script class="expj-script-AN0060010-AN0060010view1-l_VALUE">
expj.AN0060010.AN0060010view1.l_VALUE = {};
expj.AN0060010.AN0060010view1.l_VALUE.executeAllOnClick = function () {
};
expj.AN0060010.AN0060010view1.l_VALUE.executeAllOnDecision = function () {
  console.log('execute AN0060010view1/l_VALUE.onDecision');
  expj.AN0060010.AN0060010view1.executeAllOnDecision();
  expj.AN0060010.executeAllOnDecision();
};
expj.AN0060010.AN0060010view1.l_VALUE.executeOnLoad = function () {
  $('.expj-AN0060010-AN0060010view1-l_VALUE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0060010', 'AN0060010view1', 'l_VALUE', this);
  });
  expj.AN0060010.AN0060010view1.l_VALUE.executePScriptOnLoad();
};

expj.AN0060010.AN0060010view1.l_VALUE.executePScriptOnLoad = function () {
  console.log('execute AN0060010view1/l_VALUE.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AN0060010-AN0060010view1-l_DISPLAY_NAME">
expj.AN0060010.AN0060010view1.l_DISPLAY_NAME = {};
expj.AN0060010.AN0060010view1.l_DISPLAY_NAME.executeAllOnClick = function () {
};
expj.AN0060010.AN0060010view1.l_DISPLAY_NAME.executeAllOnDecision = function () {
  console.log('execute AN0060010view1/l_DISPLAY_NAME.onDecision');
  expj.AN0060010.AN0060010view1.executeAllOnDecision();
  expj.AN0060010.executeAllOnDecision();
};
expj.AN0060010.AN0060010view1.l_DISPLAY_NAME.executeOnLoad = function () {
  $('.expj-AN0060010-AN0060010view1-l_DISPLAY_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0060010', 'AN0060010view1', 'l_DISPLAY_NAME', this);
  });
  expj.AN0060010.AN0060010view1.l_DISPLAY_NAME.executePScriptOnLoad();
};

expj.AN0060010.AN0060010view1.l_DISPLAY_NAME.executePScriptOnLoad = function () {
  console.log('execute AN0060010view1/l_DISPLAY_NAME.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AN0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VALUE",rb))).append("', 'name':'l_VALUE', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AN0060010view1_sortable).append("}").append(",");
AN0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'813px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DISPLAY_NAME",rb))).append("', 'name':'l_DISPLAY_NAME', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(AN0060010view1_sortable).append("}").append(",");
AN0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_CHANGEABLE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0060010view1_sortable).append("}").append(",");
AN0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_DISPLAY_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0060010view1_sortable).append("}").append(",");
AN0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0060010view1_sortable).append("}").append(",");
%>
<%
 int aAN0060010StructLength = aAN0060010Control.getListsize();
 final AN0060010Struct structBackup = aAN0060010Struct;
 aAN0060010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAN0060010StructLength; ++loopCount) {
  if((aAN0060010Struct = (AN0060010Struct) aAN0060010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAN0060010Struct", aAN0060010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AN0060010view1_DB.append("[");
 AN0060010view1_DB.append(loopCount);
%> <%
                    String insertableFlg;
                    String editableFlg;
                    String selectableFlg;
                    if (aAN0060010Struct.getl_h_DISPLAY_NAME() == null || aAN0060010Struct.getl_h_DISPLAY_NAME().equals("") == true) {
                      // 空行の場合（隠し表示説明が空値でないことで判定）
                      insertableFlg = "true";
                    } else {
                      // 空行でない場合
                      insertableFlg = "false";
                    }
                    if (aAN0060010Struct.getl_h_CHANGEABLE_TYP().equals("2") == true) {
                      // 変更禁止の場合
                      editableFlg = "false";
                    } else {
                      // 変更可能の場合
                      editableFlg = "true";
                    }
                    if (aAN0060010Struct.getl_h_DISPLAY_NAME() != null && aAN0060010Struct.getl_h_DISPLAY_NAME().equals("") == false
                        && aAN0060010Struct.getl_h_CHANGEABLE_TYP().equals("0") == true)
                    {
                      // 空行でなく、かつ、変更可能の場合
                      selectableFlg = "true";
                    } else {
                      // 空行であるか、または、変更禁止の場合
                      selectableFlg = "false";
                    }
                  %> <%
 AN0060010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AN0060010-AN0060010view1-l_VALUE-").append(loopCount).append("\" class=\"expj-AN0060010-AN0060010view1-l_VALUE AN0060010-focus-move\" data-name=\"l_VALUE\" data-view=\"true\" maxlength=\"2\"  data-rowselectable=\"").append(selectableFlg).append("\"data-kind=\"").append("OBT_N").append("\"").append("false".equals(insertableFlg) ? " disabled=\"disabled\"" : "").append(" value=\"").append(TypeConverter.sanitizer(aAN0060010Struct.getl_VALUE())).append("\">'");
 AN0060010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AN0060010-AN0060010view1-l_DISPLAY_NAME-").append(loopCount).append("\" class=\"expj-AN0060010-AN0060010view1-l_DISPLAY_NAME AN0060010-focus-move\" data-name=\"l_DISPLAY_NAME\" data-view=\"true\" maxlength=\"64\" data-kind=\"").append("").append("\"").append("false".equals(editableFlg) ? " disabled=\"disabled\"" : "").append(" value=\"").append(TypeConverter.sanitizer(aAN0060010Struct.getl_DISPLAY_NAME())).append("\">'");
 AN0060010view1_DB.append(",").append("'<span id=\"expj-AN0060010-AN0060010view1-l_h_CHANGEABLE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AN0060010-AN0060010view1-l_h_CHANGEABLE_TYP\" data-name=\"l_h_CHANGEABLE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0060010Struct.getl_h_CHANGEABLE_TYP())).append("</span>'");
 AN0060010view1_DB.append(",").append("'<span id=\"expj-AN0060010-AN0060010view1-l_h_DISPLAY_NAME-").append(loopCount).append("\" class=\"expj-label expj-AN0060010-AN0060010view1-l_h_DISPLAY_NAME\" data-name=\"l_h_DISPLAY_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0060010Struct.getl_h_DISPLAY_NAME())).append("</span>'");
 AN0060010view1_DB.append(",").append("'<span id=\"expj-AN0060010-AN0060010view1-l_h_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AN0060010-AN0060010view1-l_h_MODIFY_COUNT\" data-name=\"l_h_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0060010Struct.getl_h_MODIFY_COUNT())).append("</span>'");
 AN0060010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAN0060010StructLength) {
   AN0060010view1_DB.append(",");
  }
 }
 aAN0060010Struct = structBackup;
 viewIdList.add(AN0060010view1_Id);
 viewSelectList.add(AN0060010view1_select);
 viewResizeList.add(AN0060010view1_resize);
 viewScrollList.add(AN0060010view1_scroll);
 viewHeaderDataList.add(AN0060010view1_HB);
 viewBodyDataList.add(AN0060010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AN0060010-AN0060010button2">
expj.AN0060010.AN0060010button2 = {};
expj.AN0060010.AN0060010button2.executeAllOnDecision = function () {
  console.log('execute AN0060010button2.onDecision');
};
expj.AN0060010.AN0060010button2.executeOnLoad = function () {
  expj.AN0060010.AN0060010button2.executePScriptOnLoad();
};

expj.AN0060010.AN0060010button2.executePScriptOnLoad = function () {
  console.log('execute AN0060010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0060010-AN0060010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0060010-AN0060010button2-InsertAll">
expj.AN0060010.AN0060010button2.InsertAll = {};
// script1="onClick;0;COLCHK;AN0060010view1:_l_VALUE[eq]''[and]_l_DISPLAY_NAME[eq]''@#AN06007"
expj.AN0060010.AN0060010button2.InsertAll.onClick0 = function () {
  console.log('InsertAll script1');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AN0060010', 'AN0060010view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.l_VALUE, '[eq]', '') && expj.common.pscript.evaluate(cell.l_DISPLAY_NAME, '[eq]', ''))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('AN0060010', 'AN0060010button2', 'AN06007');
}
};
// script2="onClick;1;COLCHKT;AN0060010view1:_l_VALUE[eq]''[and]_l_DISPLAY_NAME[neq]''@#AN06008"
expj.AN0060010.AN0060010button2.InsertAll.onClick1 = function () {
  console.log('InsertAll script2');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AN0060010', 'AN0060010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_VALUE, '[eq]', '') && expj.common.pscript.evaluate(cell.l_DISPLAY_NAME, '[neq]', '')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('AN0060010', 'AN0060010button2', 'AN06008');
}
};
// script3="onClick;2;COLCHKT;AN0060010view1:_l_VALUE[neq]''[and]_l_DISPLAY_NAME[eq]''@$AN06010"
expj.AN0060010.AN0060010button2.InsertAll.onClick2 = function () {
  console.log('InsertAll script3');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AN0060010', 'AN0060010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_VALUE, '[neq]', '') && expj.common.pscript.evaluate(cell.l_DISPLAY_NAME, '[eq]', '')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addWarningMessage('AN0060010', 'AN0060010button2', 'AN06010');
}
};
// script4="onClick;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0060010form1/*,_AN0060010form2/*,_AN0060010view1/*@AN0060010Servlet,,$ZZ07001"
expj.AN0060010.AN0060010button2.InsertAll.onClick3 = function () {
  console.log('InsertAll script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0060010', 'AN0060010button2', '_AN0060010form1/*,_AN0060010form2/*,_AN0060010view1/*', 'AN0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0060010', response);
expj.common.updateBusinessScreenTab('AN0060010', contents);
};
expj.common.pscript.callConfirm('AN0060010', 'AN0060010button2', 'ZZ07001', okEvent);
};
expj.AN0060010.AN0060010button2.InsertAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0060010.AN0060010button2.InsertAll['onClick' + i])) {
        expj.AN0060010.AN0060010button2.InsertAll['onClick' + i]();
      }
    }
  }
};
expj.AN0060010.AN0060010button2.InsertAll.executeAllOnDecision = function () {
};
expj.AN0060010.AN0060010button2.InsertAll.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010button2-InsertAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0060010', 'AN0060010button2', 'InsertAll', this, 'Button');
    }
  });
  expj.AN0060010.AN0060010button2.InsertAll.executePScriptOnLoad();
};

expj.AN0060010.AN0060010button2.InsertAll.executePScriptOnLoad = function () {
  console.log('execute AN0060010button2/InsertAll.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010button2-InsertAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0060010-AN0060010button2-InsertAll" name="InsertAll" class="AN0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsertAll",rb)%></button><!-- 一括登録ボタン --></div><!--/td-->
<script class="expj-script-AN0060010-AN0060010button2-UpdateAll">
expj.AN0060010.AN0060010button2.UpdateAll = {};
// script1="onClick;0;COLCHKT;AN0060010view1:_l_VALUE[eq]''[and]_l_DISPLAY_NAME[neq]''@#AN06008"
expj.AN0060010.AN0060010button2.UpdateAll.onClick0 = function () {
  console.log('UpdateAll script1');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AN0060010', 'AN0060010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_VALUE, '[eq]', '') && expj.common.pscript.evaluate(cell.l_DISPLAY_NAME, '[neq]', '')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('AN0060010', 'AN0060010button2', 'AN06008');
}
};
// script2="onClick;1;COLCHKT;AN0060010view1:_l_VALUE[neq]''[and]_l_DISPLAY_NAME[eq]''@$AN06010"
expj.AN0060010.AN0060010button2.UpdateAll.onClick1 = function () {
  console.log('UpdateAll script2');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AN0060010', 'AN0060010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_VALUE, '[neq]', '') && expj.common.pscript.evaluate(cell.l_DISPLAY_NAME, '[eq]', '')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addWarningMessage('AN0060010', 'AN0060010button2', 'AN06010');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0060010form1/*,_AN0060010form2/*,_AN0060010view1/*@AN0060010Servlet,,$ZZ07003"
expj.AN0060010.AN0060010button2.UpdateAll.onClick2 = function () {
  console.log('UpdateAll script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0060010', 'AN0060010button2', '_AN0060010form1/*,_AN0060010form2/*,_AN0060010view1/*', 'AN0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0060010', response);
expj.common.updateBusinessScreenTab('AN0060010', contents);
};
expj.common.pscript.callConfirm('AN0060010', 'AN0060010button2', 'ZZ07003', okEvent);
};
expj.AN0060010.AN0060010button2.UpdateAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0060010.AN0060010button2.UpdateAll['onClick' + i])) {
        expj.AN0060010.AN0060010button2.UpdateAll['onClick' + i]();
      }
    }
  }
};
expj.AN0060010.AN0060010button2.UpdateAll.executeAllOnDecision = function () {
};
expj.AN0060010.AN0060010button2.UpdateAll.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010button2-UpdateAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0060010', 'AN0060010button2', 'UpdateAll', this, 'Button');
    }
  });
  expj.AN0060010.AN0060010button2.UpdateAll.executePScriptOnLoad();
};

expj.AN0060010.AN0060010button2.UpdateAll.executePScriptOnLoad = function () {
  console.log('execute AN0060010button2/UpdateAll.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010button2-UpdateAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0060010-AN0060010button2-UpdateAll" name="UpdateAll" class="AN0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdateAll",rb)%></button><!-- 一括更新ボタン --></div><!--/td-->
<script class="expj-script-AN0060010-AN0060010button2-DeleteAssort">
expj.AN0060010.AN0060010button2.DeleteAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0060010form1/*,_AN0060010form2/*,_AN0060010view1/*@AN0060010Servlet,,$ZZ07004"
expj.AN0060010.AN0060010button2.DeleteAssort.onClick0 = function () {
  console.log('DeleteAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0060010', 'AN0060010button2', '_AN0060010form1/*,_AN0060010form2/*,_AN0060010view1/*', 'AN0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0060010', response);
expj.common.updateBusinessScreenTab('AN0060010', contents);
};
expj.common.pscript.callConfirm('AN0060010', 'AN0060010button2', 'ZZ07004', okEvent);
};
expj.AN0060010.AN0060010button2.DeleteAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0060010.AN0060010button2.DeleteAssort['onClick' + i])) {
        expj.AN0060010.AN0060010button2.DeleteAssort['onClick' + i]();
      }
    }
  }
};
expj.AN0060010.AN0060010button2.DeleteAssort.executeAllOnDecision = function () {
};
expj.AN0060010.AN0060010button2.DeleteAssort.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010button2-DeleteAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0060010', 'AN0060010button2', 'DeleteAssort', this, 'Button');
    }
  });
  expj.AN0060010.AN0060010button2.DeleteAssort.executePScriptOnLoad();
};

expj.AN0060010.AN0060010button2.DeleteAssort.executePScriptOnLoad = function () {
  console.log('execute AN0060010button2/DeleteAssort.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010button2-DeleteAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0060010-AN0060010button2-DeleteAssort" name="DeleteAssort" class="AN0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAssort_1",rb)%></button><!-- 選択削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AN0060010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AN0060010-AN0060010button0">
expj.AN0060010.AN0060010button0 = {};
expj.AN0060010.AN0060010button0.executeAllOnDecision = function () {
  console.log('execute AN0060010button0.onDecision');
};
expj.AN0060010.AN0060010button0.executeOnLoad = function () {
  expj.AN0060010.AN0060010button0.executePScriptOnLoad();
};

expj.AN0060010.AN0060010button0.executePScriptOnLoad = function () {
  console.log('execute AN0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0060010-AN0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0060010-AN0060010button0-Clear">
expj.AN0060010.AN0060010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AN0060010Servlet,,$ZZ07008"
expj.AN0060010.AN0060010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0060010', 'AN0060010button0', '', 'AN0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0060010', response);
expj.common.updateBusinessScreenTab('AN0060010', contents);
};
expj.common.pscript.callConfirm('AN0060010', 'AN0060010button0', 'ZZ07008', okEvent);
};
expj.AN0060010.AN0060010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0060010.AN0060010button0.Clear['onClick' + i])) {
        expj.AN0060010.AN0060010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AN0060010.AN0060010button0.Clear.executeAllOnDecision = function () {
};
expj.AN0060010.AN0060010button0.Clear.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0060010', 'AN0060010button0', 'Clear', this, 'Button');
    }
  });
  expj.AN0060010.AN0060010button0.Clear.executePScriptOnLoad();
};

expj.AN0060010.AN0060010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AN0060010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0060010-AN0060010button0-Clear" name="Clear" class="AN0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AN0060010-AN0060010button0-Close">
expj.AN0060010.AN0060010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AN0060010.AN0060010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AN0060010');
};
expj.AN0060010.AN0060010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0060010.AN0060010button0.Close['onClick' + i])) {
        expj.AN0060010.AN0060010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AN0060010.AN0060010button0.Close.executeAllOnDecision = function () {
};
expj.AN0060010.AN0060010button0.Close.executeOnLoad = function () {
  $('#expj-AN0060010-AN0060010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0060010', 'AN0060010button0', 'Close', this, 'Button');
    }
  });
  expj.AN0060010.AN0060010button0.Close.executePScriptOnLoad();
};

expj.AN0060010.AN0060010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AN0060010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AN0060010-AN0060010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0060010-AN0060010button0-Close" name="Close" class="AN0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AN0060010 (END)-->
<%
  MessageStruct msgStruct = aAN0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AN0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AN0060010)) {
  expj.common.treeInstanceMap.AN0060010 = {};
}
expj.common.treeInstanceMap.AN0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AN0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AN0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AN0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AN0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AN0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AN0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AN0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AN0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0060010)) {
  expj.common.detailDialogMap.AN0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AN0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AN0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AN0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AN0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AN0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AN0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AN0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AN0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AN0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AN0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AN0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AN0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AN0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AN0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AN0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AN0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AN0060010)) {
  expj.common.viewInstanceMap.AN0060010 = {};
}
expj.common.viewInstanceMap.AN0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AN0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AN0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AN0060010.<%=viewId %>.init = function () {
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
    expj.AN0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AN0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AN0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AN0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AN0060010_init">
/**
 * AN0060010用のロード完了時初期化関数
 */
expj.AN0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AN0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AN0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AN0060010');
  expj.common.calendarInstanceMap.AN0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AN0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AN0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AN0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AN0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AN0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AN0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AN0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AN0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AN0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AN0060010.AN0060010form1.TYPE_CD.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010form1.PeekerName.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010form2.TYPE_NAME.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010form2.h_INSERTABLE_TYP.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010form2.h_TYPE_NAME.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010view1.l_VALUE.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010view1.l_DISPLAY_NAME.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010button2.InsertAll.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010button2.UpdateAll.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010button2.DeleteAssort.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010form1.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010button1.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010form2.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010view1.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010button2.executeOnLoad();}catch(e){};
  try{expj.AN0060010.AN0060010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AN0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AN0060010', 'AN0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AN0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AN0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AN0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AN0060010', '<%=request.getContextPath() %>');
};

/**
 * AN0060010の全体onDecision処理
 */
expj.AN0060010.executeAllOnDecision = function () {
  expj.AN0060010.AN0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AN0060010_console">
expj.AN0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>