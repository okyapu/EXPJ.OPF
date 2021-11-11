<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:27:19 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0030\AC0030020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0030.*" %>
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
<jsp:useBean id="aAC0030020Control" class="com.nec.jp.orteus.metamorBase.AC0030.AC0030020Control" scope="request"/>
<jsp:useBean id="aAC0030020Struct" class="com.nec.jp.orteus.metamorBase.AC0030.AC0030020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

オーダ発効（製番）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0030/jsp/AC0030020.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $ $Date: 2017/02/22 02:04:23 $
********************************************************* --%>
<html>
<head>
<title>オーダ発効（製番）</title>
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
<script class="expj-script-AC0030020_init">
  // AC0030020名前空間
  expj.AC0030020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0030020" data-screen="AC0030020" data-newdata="<%=aAC0030020Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr expjDynamicHeight" style=""> 
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);height:100%;"> 
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">
 
            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
 
            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="height:100%;"> 
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-AC0030020-AC0030020form1">
expj.AC0030020.AC0030020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AC0030020.AC0030020form1.onLoad0 = function () {
  console.log('AC0030020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;SET;_AC0030020form1/rdoOutsideTyp=1"
expj.AC0030020.AC0030020form1.onDecision0 = function () {
  console.log('AC0030020form1 script2');
expj.common.pscript.setReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/rdoOutsideTyp', '1');
};
// script3="onDecision;1;SET;_AC0030020form1/rdoEntry1Typ=1"
expj.AC0030020.AC0030020form1.onDecision1 = function () {
  console.log('AC0030020form1 script3');
expj.common.pscript.setReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/rdoEntry1Typ', '1');
};
// script4="onDecision;2;CHKRQ;A@*0,*1"
expj.AC0030020.AC0030020form1.onDecision2 = function () {
  console.log('AC0030020form1 script4');
if (expj.common.pscript.satisfiedRequiredComponent('AC0030020', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script5="child;0;UNMASK;_AC0030020button1/Execute"
expj.AC0030020.AC0030020form1.child0 = function () {
  console.log('AC0030020form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AC0030020', 'AC0030020form1', '_AC0030020button1/Execute');
};
// script6="child;1;MASK;_AC0030020button1/Execute"
expj.AC0030020.AC0030020form1.child1 = function () {
  console.log('AC0030020form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AC0030020', 'AC0030020form1', '_AC0030020button1/Execute');
};
// script7="onDecision;3;CHK;_AC0030020form1/TIME_CTRL[eq]false@*2"
expj.AC0030020.AC0030020form1.onDecision3 = function () {
  console.log('AC0030020form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/TIME_CTRL'), '[eq]', 'false')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script8="child;2;MASK;_AC0030020form1/txtEntryTime@*3"
expj.AC0030020.AC0030020form1.child2 = function () {
  console.log('AC0030020form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AC0030020', 'AC0030020form1', '_AC0030020form1/txtEntryTime');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script9="child;3;SET;_AC0030020form1/txtEntryTime="
expj.AC0030020.AC0030020form1.child3 = function () {
  console.log('AC0030020form1 script9');
expj.common.pscript.setReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/txtEntryTime', '');
};
expj.AC0030020.AC0030020form1.executeAllOnDecision = function () {
  console.log('execute AC0030020form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020form1['onDecision' + i])) {
        expj.AC0030020.AC0030020form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020form1.executeOnLoad = function () {
  expj.AC0030020.AC0030020form1.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0030020.AC0030020form1['onLoad' + i])) {
      expj.AC0030020.AC0030020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0030020-AC0030020form1" action="AC0030020Servlet" name="AC0030020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:42px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:882px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:42px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:42px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-txtJobOdrCd">
expj.AC0030020.AC0030020form1.txtJobOdrCd = {};
expj.AC0030020.AC0030020form1.txtJobOdrCd.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/txtJobOdrCd.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.txtJobOdrCd.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-txtJobOdrCd').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0030020', 'AC0030020form1', 'txtJobOdrCd', this);
  });
  expj.AC0030020.AC0030020form1.txtJobOdrCd.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.txtJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/txtJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-txtJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0030020-AC0030020form1-txtJobOdrCd" name="txtJobOdrCd" class="AC0030020-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAC0030020Struct.gettxtJobOdrCd()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-PeekertxtJobOdrCd">
expj.AC0030020.AC0030020form1.PeekertxtJobOdrCd = {};
// script1="onClick;0;PEEKER;_AC0030020form1/txtJobOdrCd@<%=contextNo%>"
expj.AC0030020.AC0030020form1.PeekertxtJobOdrCd.onClick0 = function () {
  console.log('PeekertxtJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0030020';
var parameterValues = 'PeekertxtJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/txtJobOdrCd') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_11%&%';
parameterValues += 'TARGET_FIELD%=%_AC0030020form1/txtJobOdrCd%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0030020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0030020.AC0030020form1.PeekertxtJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020form1.PeekertxtJobOdrCd['onClick' + i])) {
        expj.AC0030020.AC0030020form1.PeekertxtJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020form1.PeekertxtJobOdrCd.executeAllOnDecision = function () {
};
expj.AC0030020.AC0030020form1.PeekertxtJobOdrCd.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-PeekertxtJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020form1', 'PeekertxtJobOdrCd', this, 'Button');
    }
  });
  expj.AC0030020.AC0030020form1.PeekertxtJobOdrCd.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.PeekertxtJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/PeekertxtJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-PeekertxtJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:42px;text-align:left;"><button type="button" id="expj-AC0030020-AC0030020form1-PeekertxtJobOdrCd" class="AC0030020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:42px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-rdoOutsideTyp1">
expj.AC0030020.AC0030020form1.rdoOutsideTyp1 = {};
// script1="onClick;0;SET;_AC0030020form1/rdoOutsideTyp=1"
expj.AC0030020.AC0030020form1.rdoOutsideTyp1.onClick0 = function () {
  console.log('rdoOutsideTyp1 script1');
expj.common.pscript.setReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/rdoOutsideTyp', '1');
};
expj.AC0030020.AC0030020form1.rdoOutsideTyp1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020form1.rdoOutsideTyp1['onClick' + i])) {
        expj.AC0030020.AC0030020form1.rdoOutsideTyp1['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020form1.rdoOutsideTyp1.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/rdoOutsideTyp1.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.rdoOutsideTyp1.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-rdoOutsideTyp1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020form1', 'rdoOutsideTyp1', this, 'RadioButton');
    }
  });
  expj.AC0030020.AC0030020form1.rdoOutsideTyp1.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.rdoOutsideTyp1.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/rdoOutsideTyp1.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-rdoOutsideTyp1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="GROUP1" data-name="rdoOutsideTyp1" value="true" <%= ("true".equals(TypeConverter.convert(aAC0030020Struct.getrdoOutsideTyp1())))?"checked=\"checked\"":"" %> class="" id="expj-AC0030020-AC0030020form1-rdoOutsideTyp1" ><label for="expj-AC0030020-AC0030020form1-rdoOutsideTyp1"><%=CoreTools.getRBString("Expj.Cmt0220",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:42px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AC0030020-AC0030020form1-rdoOutsideTyp" name="rdoOutsideTyp" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0030020Struct.getrdoOutsideTyp()) %>">
<script class="expj-script-AC0030020-AC0030020form1-rdoOutsideTyp">
expj.AC0030020.AC0030020form1.rdoOutsideTyp = {};
expj.AC0030020.AC0030020form1.rdoOutsideTyp.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/rdoOutsideTyp.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.rdoOutsideTyp.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-rdoOutsideTyp').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0030020', 'AC0030020form1', 'rdoOutsideTyp', this);
  });
  expj.AC0030020.AC0030020form1.rdoOutsideTyp.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.rdoOutsideTyp.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/rdoOutsideTyp.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-rdoOutsideTyp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-rdoOutsideTyp2">
expj.AC0030020.AC0030020form1.rdoOutsideTyp2 = {};
// script1="onClick;0;SET;_AC0030020form1/rdoOutsideTyp=2"
expj.AC0030020.AC0030020form1.rdoOutsideTyp2.onClick0 = function () {
  console.log('rdoOutsideTyp2 script1');
expj.common.pscript.setReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/rdoOutsideTyp', '2');
};
expj.AC0030020.AC0030020form1.rdoOutsideTyp2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020form1.rdoOutsideTyp2['onClick' + i])) {
        expj.AC0030020.AC0030020form1.rdoOutsideTyp2['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020form1.rdoOutsideTyp2.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/rdoOutsideTyp2.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.rdoOutsideTyp2.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-rdoOutsideTyp2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020form1', 'rdoOutsideTyp2', this, 'RadioButton');
    }
  });
  expj.AC0030020.AC0030020form1.rdoOutsideTyp2.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.rdoOutsideTyp2.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/rdoOutsideTyp2.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-rdoOutsideTyp2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="GROUP1" data-name="rdoOutsideTyp2" value="true" <%= ("true".equals(TypeConverter.convert(aAC0030020Struct.getrdoOutsideTyp2())))?"checked=\"checked\"":"" %> class="" id="expj-AC0030020-AC0030020form1-rdoOutsideTyp2" ><label for="expj-AC0030020-AC0030020form1-rdoOutsideTyp2"><%=CoreTools.getRBString("Expj.Cmt0218",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:42px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-rdoOutsideTyp3">
expj.AC0030020.AC0030020form1.rdoOutsideTyp3 = {};
// script1="onClick;0;SET;_AC0030020form1/rdoOutsideTyp=9"
expj.AC0030020.AC0030020form1.rdoOutsideTyp3.onClick0 = function () {
  console.log('rdoOutsideTyp3 script1');
expj.common.pscript.setReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/rdoOutsideTyp', '9');
};
expj.AC0030020.AC0030020form1.rdoOutsideTyp3.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020form1.rdoOutsideTyp3['onClick' + i])) {
        expj.AC0030020.AC0030020form1.rdoOutsideTyp3['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020form1.rdoOutsideTyp3.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/rdoOutsideTyp3.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.rdoOutsideTyp3.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-rdoOutsideTyp3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020form1', 'rdoOutsideTyp3', this, 'RadioButton');
    }
  });
  expj.AC0030020.AC0030020form1.rdoOutsideTyp3.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.rdoOutsideTyp3.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/rdoOutsideTyp3.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-rdoOutsideTyp3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="GROUP1" data-name="rdoOutsideTyp3" value="true" <%= ("true".equals(TypeConverter.convert(aAC0030020Struct.getrdoOutsideTyp3())))?"checked=\"checked\"":"" %> class="" id="expj-AC0030020-AC0030020form1-rdoOutsideTyp3" ><label for="expj-AC0030020-AC0030020form1-rdoOutsideTyp3"><%=CoreTools.getRBString("Expj.Cmt0219",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:42px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:42px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-rdoEntry1Typ1">
expj.AC0030020.AC0030020form1.rdoEntry1Typ1 = {};
// script1="onClick;0;SET;_AC0030020form1/rdoEntry1Typ=1"
expj.AC0030020.AC0030020form1.rdoEntry1Typ1.onClick0 = function () {
  console.log('rdoEntry1Typ1 script1');
expj.common.pscript.setReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/rdoEntry1Typ', '1');
};
expj.AC0030020.AC0030020form1.rdoEntry1Typ1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020form1.rdoEntry1Typ1['onClick' + i])) {
        expj.AC0030020.AC0030020form1.rdoEntry1Typ1['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020form1.rdoEntry1Typ1.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/rdoEntry1Typ1.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.rdoEntry1Typ1.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-rdoEntry1Typ1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020form1', 'rdoEntry1Typ1', this, 'RadioButton');
    }
  });
  expj.AC0030020.AC0030020form1.rdoEntry1Typ1.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.rdoEntry1Typ1.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/rdoEntry1Typ1.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-rdoEntry1Typ1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="GROUP2" data-name="rdoEntry1Typ1" value="true" <%= ("true".equals(TypeConverter.convert(aAC0030020Struct.getrdoEntry1Typ1())))?"checked=\"checked\"":"" %> class="" id="expj-AC0030020-AC0030020form1-rdoEntry1Typ1" ><label for="expj-AC0030020-AC0030020form1-rdoEntry1Typ1"><%=CoreTools.getRBString("Expj.ODR_START_DATE",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:42px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AC0030020-AC0030020form1-rdoEntry1Typ" name="rdoEntry1Typ" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0030020Struct.getrdoEntry1Typ()) %>">
<script class="expj-script-AC0030020-AC0030020form1-rdoEntry1Typ">
expj.AC0030020.AC0030020form1.rdoEntry1Typ = {};
expj.AC0030020.AC0030020form1.rdoEntry1Typ.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/rdoEntry1Typ.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.rdoEntry1Typ.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-rdoEntry1Typ').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0030020', 'AC0030020form1', 'rdoEntry1Typ', this);
  });
  expj.AC0030020.AC0030020form1.rdoEntry1Typ.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.rdoEntry1Typ.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/rdoEntry1Typ.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-rdoEntry1Typ');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-rdoEntry1Typ2">
expj.AC0030020.AC0030020form1.rdoEntry1Typ2 = {};
// script1="onClick;0;SET;_AC0030020form1/rdoEntry1Typ=2"
expj.AC0030020.AC0030020form1.rdoEntry1Typ2.onClick0 = function () {
  console.log('rdoEntry1Typ2 script1');
expj.common.pscript.setReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/rdoEntry1Typ', '2');
};
expj.AC0030020.AC0030020form1.rdoEntry1Typ2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020form1.rdoEntry1Typ2['onClick' + i])) {
        expj.AC0030020.AC0030020form1.rdoEntry1Typ2['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020form1.rdoEntry1Typ2.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/rdoEntry1Typ2.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.rdoEntry1Typ2.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-rdoEntry1Typ2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020form1', 'rdoEntry1Typ2', this, 'RadioButton');
    }
  });
  expj.AC0030020.AC0030020form1.rdoEntry1Typ2.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.rdoEntry1Typ2.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/rdoEntry1Typ2.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-rdoEntry1Typ2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="GROUP2" data-name="rdoEntry1Typ2" value="true" <%= ("true".equals(TypeConverter.convert(aAC0030020Struct.getrdoEntry1Typ2())))?"checked=\"checked\"":"" %> class="" id="expj-AC0030020-AC0030020form1-rdoEntry1Typ2" ><label for="expj-AC0030020-AC0030020form1-rdoEntry1Typ2"><%=CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AC0030020-AC0030020form1-hdnBusinessOprDate" name="hdnBusinessOprDate" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0030020Struct.gethdnBusinessOprDate()) %>">
<script class="expj-script-AC0030020-AC0030020form1-hdnBusinessOprDate">
expj.AC0030020.AC0030020form1.hdnBusinessOprDate = {};
expj.AC0030020.AC0030020form1.hdnBusinessOprDate.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/hdnBusinessOprDate.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.hdnBusinessOprDate.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-hdnBusinessOprDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0030020', 'AC0030020form1', 'hdnBusinessOprDate', this);
  });
  expj.AC0030020.AC0030020form1.hdnBusinessOprDate.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.hdnBusinessOprDate.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/hdnBusinessOprDate.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-hdnBusinessOprDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:42px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-rdoEntry1Typ3">
expj.AC0030020.AC0030020form1.rdoEntry1Typ3 = {};
// script1="onClick;0;SET;_AC0030020form1/rdoEntry1Typ=3"
expj.AC0030020.AC0030020form1.rdoEntry1Typ3.onClick0 = function () {
  console.log('rdoEntry1Typ3 script1');
expj.common.pscript.setReferenceComponentValue('AC0030020', 'AC0030020form1', '_AC0030020form1/rdoEntry1Typ', '3');
};
expj.AC0030020.AC0030020form1.rdoEntry1Typ3.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020form1.rdoEntry1Typ3['onClick' + i])) {
        expj.AC0030020.AC0030020form1.rdoEntry1Typ3['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020form1.rdoEntry1Typ3.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/rdoEntry1Typ3.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.rdoEntry1Typ3.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-rdoEntry1Typ3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020form1', 'rdoEntry1Typ3', this, 'RadioButton');
    }
  });
  expj.AC0030020.AC0030020form1.rdoEntry1Typ3.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.rdoEntry1Typ3.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/rdoEntry1Typ3.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-rdoEntry1Typ3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="GROUP2" data-name="rdoEntry1Typ3" value="true" <%= ("true".equals(TypeConverter.convert(aAC0030020Struct.getrdoEntry1Typ3())))?"checked=\"checked\"":"" %> class="" id="expj-AC0030020-AC0030020form1-rdoEntry1Typ3" ><label for="expj-AC0030020-AC0030020form1-rdoEntry1Typ3"><%=CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:42px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-txtEntryDate">
expj.AC0030020.AC0030020form1.txtEntryDate = {};
expj.AC0030020.AC0030020form1.txtEntryDate.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/txtEntryDate.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.txtEntryDate.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-txtEntryDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0030020', 'AC0030020form1', 'txtEntryDate', this);
  });
  expj.AC0030020.AC0030020form1.txtEntryDate.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.txtEntryDate.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/txtEntryDate.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-txtEntryDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0030020-AC0030020form1-txtEntryDate" name="txtEntryDate" class="AC0030020-focus-move  required-value expj-AC0030020-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0030020Struct.gettxtEntryDate()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-CalendarEntryDate">
expj.AC0030020.AC0030020form1.CalendarEntryDate = {};
// script1="onClick;0;CALENDAR;_AC0030020form1/txtEntryDate"
expj.AC0030020.AC0030020form1.CalendarEntryDate.onClick0 = function () {
  console.log('CalendarEntryDate script1');
expj.common.pscript.executeCalendar('AC0030020','AC0030020form1','_AC0030020form1/txtEntryDate');
};
expj.AC0030020.AC0030020form1.CalendarEntryDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020form1.CalendarEntryDate['onClick' + i])) {
        expj.AC0030020.AC0030020form1.CalendarEntryDate['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020form1.CalendarEntryDate.executeAllOnDecision = function () {
};
expj.AC0030020.AC0030020form1.CalendarEntryDate.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-CalendarEntryDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020form1', 'CalendarEntryDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0030020','AC0030020form1','_AC0030020form1/txtEntryDate');
  expj.AC0030020.AC0030020form1.CalendarEntryDate.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.CalendarEntryDate.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/CalendarEntryDate.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-CalendarEntryDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0030020-AC0030020form1-CalendarEntryDate" class="AC0030020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020form1-txtEntryTime">
expj.AC0030020.AC0030020form1.txtEntryTime = {};
expj.AC0030020.AC0030020form1.txtEntryTime.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/txtEntryTime.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.txtEntryTime.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-txtEntryTime').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0030020', 'AC0030020form1', 'txtEntryTime', this);
  });
  expj.AC0030020.AC0030020form1.txtEntryTime.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.txtEntryTime.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/txtEntryTime.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-txtEntryTime');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AC0030020-AC0030020form1-txtEntryTime" name="txtEntryTime" class="AC0030020-focus-move  " style="width:100%;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0030020Struct.gettxtEntryTime()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:42px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span></div><!--/td-->
<input type="hidden" id="expj-AC0030020-AC0030020form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0030020Struct.getTIME_CTRL()) %>">
<script class="expj-script-AC0030020-AC0030020form1-TIME_CTRL">
expj.AC0030020.AC0030020form1.TIME_CTRL = {};
expj.AC0030020.AC0030020form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AC0030020form1/TIME_CTRL.onDecision');
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
  expj.AC0030020.executeAllOnDecision();
};
expj.AC0030020.AC0030020form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0030020', 'AC0030020form1', 'TIME_CTRL', this);
  });
  expj.AC0030020.AC0030020form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AC0030020.AC0030020form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AC0030020form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:882px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0030020-AC0030020button1">
expj.AC0030020.AC0030020button1 = {};
expj.AC0030020.AC0030020button1.executeAllOnDecision = function () {
  console.log('execute AC0030020button1.onDecision');
};
expj.AC0030020.AC0030020button1.executeOnLoad = function () {
  expj.AC0030020.AC0030020button1.executePScriptOnLoad();
};

expj.AC0030020.AC0030020button1.executePScriptOnLoad = function () {
  console.log('execute AC0030020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0030020-AC0030020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0030020-AC0030020button1-Execute">
expj.AC0030020.AC0030020button1.Execute = {};
// script1="onClick;0;CHK;_AC0030020form1/hdnBusinessOprDate[neq][and]_AC0030020form1/txtEntryDate[lt]_AC0030020form1/hdnBusinessOprDate@#AC50774,*1"
expj.AC0030020.AC0030020button1.Execute.onClick0 = function () {
  console.log('Execute script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0030020', 'AC0030020button1', '_AC0030020form1/hdnBusinessOprDate'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryDate')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0030020', 'AC0030020button1', '_AC0030020form1/hdnBusinessOprDate')))) {
expj.common.pscript.addErrorMessage('AC0030020', 'AC0030020button1', 'AC50774');
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="onClick;1;CHK;~LEN(_AC0030020form1/txtEntryTime)[eq]1[or]~LEN(_AC0030020form1/txtEntryTime)[eq]2@!AS00019"
expj.AC0030020.AC0030020button1.Execute.onClick1 = function () {
  console.log('Execute script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryTime'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryTime'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AC0030020', 'AC0030020button1', 'AS00019');
}
};
// script3="onClick;2;CHK;~LEN(_AC0030020form1/txtEntryTime)[eq]3@*3"
expj.AC0030020.AC0030020button1.Execute.onClick2 = function () {
  console.log('Execute script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryTime'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;3;CHK;[{~CHARAT(_AC0030020form1/txtEntryTime:1)}*10+{~CHARAT(_AC0030020form1/txtEntryTime:2)}][gte]60@!AS00020"
expj.AC0030020.AC0030020button1.Execute.child3 = function () {
  console.log('Execute script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryTime', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryTime', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0030020', 'AC0030020button1', 'AS00020');
}
};
// script5="onClick;4;CHK;~LEN(_AC0030020form1/txtEntryTime)[eq]4@*5"
expj.AC0030020.AC0030020button1.Execute.onClick4 = function () {
  console.log('Execute script5');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryTime'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;5;CHK;[{~CHARAT(_AC0030020form1/txtEntryTime:0)}*10+{~CHARAT(_AC0030020form1/txtEntryTime:1)}][gte]24[or][{~CHARAT(_AC0030020form1/txtEntryTime:2)}*10+{~CHARAT(_AC0030020form1/txtEntryTime:3)}][gte]60@!AS00020"
expj.AC0030020.AC0030020button1.Execute.child5 = function () {
  console.log('Execute script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryTime', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryTime', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryTime', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0030020', 'AC0030020button1', '_AC0030020form1/txtEntryTime', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0030020', 'AC0030020button1', 'AS00020');
}
};
// script7="onClick;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0030020form1/*@AC0030020Servlet,,$ZZ07010"
expj.AC0030020.AC0030020button1.Execute.onClick6 = function () {
  console.log('Execute script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0030020', 'AC0030020button1', '_AC0030020form1/*', 'AC0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0030020', response);
expj.common.updateBusinessScreenTab('AC0030020', contents);
};
expj.common.pscript.callConfirm('AC0030020', 'AC0030020button1', 'ZZ07010', okEvent);
};
expj.AC0030020.AC0030020button1.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020button1.Execute['onClick' + i])) {
        expj.AC0030020.AC0030020button1.Execute['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020button1.Execute.executeAllOnDecision = function () {
};
expj.AC0030020.AC0030020button1.Execute.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020button1-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020button1', 'Execute', this, 'Button');
    }
  });
  expj.AC0030020.AC0030020button1.Execute.executePScriptOnLoad();
};

expj.AC0030020.AC0030020button1.Execute.executePScriptOnLoad = function () {
  console.log('execute AC0030020button1/Execute.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020button1-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:105px;float:none;height:30px;"><button type="button" id="expj-AC0030020-AC0030020button1-Execute" name="Execute" class="AC0030020-focus-move" style="width:px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
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
<span class="version">AC0030020 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AC0030020-AC0030020button0">
expj.AC0030020.AC0030020button0 = {};
expj.AC0030020.AC0030020button0.executeAllOnDecision = function () {
  console.log('execute AC0030020button0.onDecision');
};
expj.AC0030020.AC0030020button0.executeOnLoad = function () {
  expj.AC0030020.AC0030020button0.executePScriptOnLoad();
};

expj.AC0030020.AC0030020button0.executePScriptOnLoad = function () {
  console.log('execute AC0030020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0030020-AC0030020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0030020-AC0030020button0-Clear">
expj.AC0030020.AC0030020button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0030020Servlet,,$ZZ07008"
expj.AC0030020.AC0030020button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0030020', 'AC0030020button0', '', 'AC0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0030020', response);
expj.common.updateBusinessScreenTab('AC0030020', contents);
};
expj.common.pscript.callConfirm('AC0030020', 'AC0030020button0', 'ZZ07008', okEvent);
};
expj.AC0030020.AC0030020button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020button0.Clear['onClick' + i])) {
        expj.AC0030020.AC0030020button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020button0.Clear.executeAllOnDecision = function () {
};
expj.AC0030020.AC0030020button0.Clear.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020button0', 'Clear', this, 'Button');
    }
  });
  expj.AC0030020.AC0030020button0.Clear.executePScriptOnLoad();
};

expj.AC0030020.AC0030020button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AC0030020button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0030020-AC0030020button0-Clear" name="Clear" class="AC0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0030020-AC0030020button0-Close">
expj.AC0030020.AC0030020button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AC0030020.AC0030020button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AC0030020');
};
expj.AC0030020.AC0030020button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0030020.AC0030020button0.Close['onClick' + i])) {
        expj.AC0030020.AC0030020button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AC0030020.AC0030020button0.Close.executeAllOnDecision = function () {
};
expj.AC0030020.AC0030020button0.Close.executeOnLoad = function () {
  $('#expj-AC0030020-AC0030020button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0030020', 'AC0030020button0', 'Close', this, 'Button');
    }
  });
  expj.AC0030020.AC0030020button0.Close.executePScriptOnLoad();
};

expj.AC0030020.AC0030020button0.Close.executePScriptOnLoad = function () {
  console.log('execute AC0030020button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AC0030020-AC0030020button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0030020-AC0030020button0-Close" name="Close" class="AC0030020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0030020 (END)-->
<%
MessageStruct msgStruct = aAC0030020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0030020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0030020)) {
  expj.common.treeInstanceMap.AC0030020 = {};
}
expj.common.treeInstanceMap.AC0030020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0030020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0030020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0030020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0030020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0030020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0030020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0030020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0030020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0030020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0030020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0030020)) {
  expj.common.detailDialogMap.AC0030020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0030020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0030020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0030020.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0030020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0030020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0030020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0030020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0030020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0030020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0030020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0030020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0030020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0030020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0030020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0030020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0030020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0030020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0030020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0030020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0030020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0030020)) {
  expj.common.viewInstanceMap.AC0030020 = {};
}
expj.common.viewInstanceMap.AC0030020.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0030020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0030020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0030020.<%=viewId %>.init = function () {
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
    expj.AC0030020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0030020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0030020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0030020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0030020_init">
/**
 * AC0030020用のロード完了時初期化関数
 */
expj.AC0030020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0030020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0030020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0030020');
  expj.common.calendarInstanceMap.AC0030020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0030020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0030020.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0030020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0030020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0030020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0030020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0030020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0030020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0030020-<%=detailId %>');
<%
 }
%>
  try{expj.AC0030020.AC0030020form1.txtJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.PeekertxtJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.rdoOutsideTyp1.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.rdoOutsideTyp.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.rdoOutsideTyp2.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.rdoOutsideTyp3.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.rdoEntry1Typ1.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.rdoEntry1Typ.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.rdoEntry1Typ2.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.hdnBusinessOprDate.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.rdoEntry1Typ3.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.txtEntryDate.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.CalendarEntryDate.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.txtEntryTime.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020button1.Execute.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020button0.Close.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020form1.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020button1.executeOnLoad();}catch(e){};
  try{expj.AC0030020.AC0030020button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0030020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0030020', 'AC0030020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0030020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0030020-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0030020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0030020', '<%=request.getContextPath() %>');
};

/**
 * AC0030020の全体onDecision処理
 */
expj.AC0030020.executeAllOnDecision = function () {
  expj.AC0030020.AC0030020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0030020_console">
expj.AC0030020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>