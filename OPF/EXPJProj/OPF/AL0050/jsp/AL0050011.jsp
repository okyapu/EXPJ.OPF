<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:45:42 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AL0050\AL0050011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AL0050.*" %>
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
<jsp:useBean id="aAL0050010Control" class="com.nec.jp.orteus.metamorBase.AL0050.AL0050010Control" scope="request"/>
<jsp:useBean id="aAL0050010Struct" class="com.nec.jp.orteus.metamorBase.AL0050.AL0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

負荷シミュレーションサブ１
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0050/jsp/AL0050011.jsp,v $
$Author: geng-jia $
$Revision: 1.6 $ $Date: 2017/02/22 02:06:19 $
********************************************************* --%>
<html>
<head>
<title>負荷シミュレーションサブ１</title>
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
<script class="expj-script-AL0050010_init">
  // AL0050010名前空間
  expj.AL0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

<% String CallButton = aAL0050010Control.getButton(); %>
  <div id="expj-business-screen-AL0050010" data-screen="AL0050011" data-newdata="<%=aAL0050010Control.isNewData() %>">
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
              <script class="expj-script-AL0050010-AL0050011form1">
expj.AL0050010.AL0050011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AL0050010.AL0050011form1.onLoad0 = function () {
  console.log('AL0050011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*2"
expj.AL0050010.AL0050011form1.onDecision0 = function () {
  console.log('AL0050011form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AL0050010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHK;<%=TypeConverter.sanitizer(CallButton)%>[eq]LineInsert[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]LineCopy[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]LineInsert[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]Insert@*1,*2"
expj.AL0050010.AL0050011form1.child0 = function () {
  console.log('AL0050011form1 script3');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'LineInsert') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'LineCopy') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'LineInsert') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'Insert')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;UNMASK;_AL0050011button1/Insert"
expj.AL0050010.AL0050011form1.child1 = function () {
  console.log('AL0050011form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AL0050010', 'AL0050011form1', '_AL0050011button1/Insert');
};
// script5="child;2;MASK;_AL0050011button1/Insert"
expj.AL0050010.AL0050011form1.child2 = function () {
  console.log('AL0050011form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AL0050010', 'AL0050011form1', '_AL0050011button1/Insert');
};
// script6="onDecision;1;CHKRQ;A@*3,*5"
expj.AL0050010.AL0050011form1.onDecision1 = function () {
  console.log('AL0050011form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AL0050010', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHK;<%=TypeConverter.sanitizer(CallButton)%>[eq]LineUpdate[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]Update@*4,*5"
expj.AL0050010.AL0050011form1.child3 = function () {
  console.log('AL0050011form1 script7');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'LineUpdate') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'Update')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AL0050011button1/Update"
expj.AL0050010.AL0050011form1.child4 = function () {
  console.log('AL0050011form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AL0050010', 'AL0050011form1', '_AL0050011button1/Update');
};
// script9="child;5;MASK;_AL0050011button1/Update"
expj.AL0050010.AL0050011form1.child5 = function () {
  console.log('AL0050011form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AL0050010', 'AL0050011form1', '_AL0050011button1/Update');
};
expj.AL0050010.AL0050011form1.executeAllOnDecision = function () {
  console.log('execute AL0050011form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050011form1['onDecision' + i])) {
        expj.AL0050010.AL0050011form1['onDecision' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050011form1.executeOnLoad = function () {
  expj.AL0050010.AL0050011form1.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AL0050010.AL0050011form1['onLoad' + i])) {
      expj.AL0050010.AL0050011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AL0050010-AL0050011form1" action="AL0050010Servlet" name="AL0050011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050011form1-SUB1_JOB_ODR_CD">
expj.AL0050010.AL0050011form1.SUB1_JOB_ODR_CD = {};
expj.AL0050010.AL0050011form1.SUB1_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_JOB_ODR_CD.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_JOB_ODR_CD', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050011form1-SUB1_JOB_ODR_CD" name="SUB1_JOB_ODR_CD" class="AL0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0050010-AL0050011form1-SUB1_h_l_JOB_ODR_CD" name="SUB1_h_l_JOB_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_h_l_JOB_ODR_CD()) %>">
<script class="expj-script-AL0050010-AL0050011form1-SUB1_h_l_JOB_ODR_CD">
expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD = {};
// script1="onLoad;0;CALL;child@0"
expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD.onLoad0 = function () {
  console.log('SUB1_h_l_JOB_ODR_CD script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]@*1,*2"
expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD.child0 = function () {
  console.log('SUB1_h_l_JOB_ODR_CD script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_SUB1_JOB_ODR_CD"
expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD.child1 = function () {
  console.log('SUB1_h_l_JOB_ODR_CD script3');
expj.common.pscript.setUnMaskToReferenceComponent('AL0050010', 'AL0050011form1', '_SUB1_JOB_ODR_CD');
};
// script4="child;2;MASK;_SUB1_JOB_ODR_CD"
expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD.child2 = function () {
  console.log('SUB1_h_l_JOB_ODR_CD script4');
expj.common.pscript.setMaskToReferenceComponent('AL0050010', 'AL0050011form1', '_SUB1_JOB_ODR_CD');
};
expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_h_l_JOB_ODR_CD.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_h_l_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_h_l_JOB_ODR_CD', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_h_l_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_h_l_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD['onLoad' + i])) {
      expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050011form1-SUB1_ITEM_CD">
expj.AL0050010.AL0050011form1.SUB1_ITEM_CD = {};
expj.AL0050010.AL0050011form1.SUB1_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_ITEM_CD.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_ITEM_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_ITEM_CD', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_ITEM_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050011form1-SUB1_ITEM_CD" name="SUB1_ITEM_CD" class="AL0050010-focus-move  required-value expj-AL0050010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AL0050010-AL0050011form1-PeekerSub1ItemCd">
expj.AL0050010.AL0050011form1.PeekerSub1ItemCd = {};
// script1="onClick;0;PEEKER;_AL0050011form1/SUB1_ITEM_CD@<%=contextNo%>"
expj.AL0050010.AL0050011form1.PeekerSub1ItemCd.onClick0 = function () {
  console.log('PeekerSub1ItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AL0050010';
var parameterValues = 'PeekerSub1ItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011form1', '_SUB1_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AL0050011form1/SUB1_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AL0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AL0050010.AL0050011form1.PeekerSub1ItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050011form1.PeekerSub1ItemCd['onClick' + i])) {
        expj.AL0050010.AL0050011form1.PeekerSub1ItemCd['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050011form1.PeekerSub1ItemCd.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050011form1.PeekerSub1ItemCd.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-PeekerSub1ItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050011form1', 'PeekerSub1ItemCd', this, 'Button');
    }
  });
  expj.AL0050010.AL0050011form1.PeekerSub1ItemCd.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.PeekerSub1ItemCd.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/PeekerSub1ItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-PeekerSub1ItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AL0050010-AL0050011form1-PeekerSub1ItemCd" class="AL0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AL0050010-AL0050011form1-SUB1_ITEM_NAME">
expj.AL0050010.AL0050011form1.SUB1_ITEM_NAME = {};
expj.AL0050010.AL0050011form1.SUB1_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_ITEM_NAME.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_ITEM_NAME', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_ITEM_NAME.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050011form1-SUB1_ITEM_NAME" name="SUB1_ITEM_NAME" class="AL0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AL0050010-AL0050011form1-SUB1_h_l_ITEM_CD" name="SUB1_h_l_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_h_l_ITEM_CD()) %>">
<script class="expj-script-AL0050010-AL0050011form1-SUB1_h_l_ITEM_CD">
expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD = {};
// script1="onLoad;0;CALL;child@0"
expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD.onLoad0 = function () {
  console.log('SUB1_h_l_ITEM_CD script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]@*1,*2"
expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD.child0 = function () {
  console.log('SUB1_h_l_ITEM_CD script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_SUB1_ITEM_CD,_PeekerSub1ItemCd"
expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD.child1 = function () {
  console.log('SUB1_h_l_ITEM_CD script3');
expj.common.pscript.setUnMaskToReferenceComponent('AL0050010', 'AL0050011form1', '_SUB1_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AL0050010', 'AL0050011form1', '_PeekerSub1ItemCd');
};
// script4="child;2;MASK;_SUB1_ITEM_CD,_PeekerSub1ItemCd"
expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD.child2 = function () {
  console.log('SUB1_h_l_ITEM_CD script4');
expj.common.pscript.setMaskToReferenceComponent('AL0050010', 'AL0050011form1', '_SUB1_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AL0050010', 'AL0050011form1', '_PeekerSub1ItemCd');
};
expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_h_l_ITEM_CD.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_h_l_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_h_l_ITEM_CD', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_h_l_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_h_l_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD['onLoad' + i])) {
      expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)%></span><!-- 製造納期 --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050011form1-SUB1_PRD_DUE_DATE">
expj.AL0050010.AL0050011form1.SUB1_PRD_DUE_DATE = {};
expj.AL0050010.AL0050011form1.SUB1_PRD_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_PRD_DUE_DATE.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_PRD_DUE_DATE.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_PRD_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_PRD_DUE_DATE', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_PRD_DUE_DATE.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_PRD_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_PRD_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_PRD_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050011form1-SUB1_PRD_DUE_DATE" name="SUB1_PRD_DUE_DATE" class="AL0050010-focus-move  required-value expj-AL0050010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_PRD_DUE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AL0050010-AL0050011form1-CalendarSub1PrdDueDate">
expj.AL0050010.AL0050011form1.CalendarSub1PrdDueDate = {};
// script1="onClick;0;CALENDAR;_AL0050011form1/SUB1_PRD_DUE_DATE"
expj.AL0050010.AL0050011form1.CalendarSub1PrdDueDate.onClick0 = function () {
  console.log('CalendarSub1PrdDueDate script1');
expj.common.pscript.executeCalendar('AL0050010','AL0050011form1','_AL0050011form1/SUB1_PRD_DUE_DATE');
};
expj.AL0050010.AL0050011form1.CalendarSub1PrdDueDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050011form1.CalendarSub1PrdDueDate['onClick' + i])) {
        expj.AL0050010.AL0050011form1.CalendarSub1PrdDueDate['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050011form1.CalendarSub1PrdDueDate.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050011form1.CalendarSub1PrdDueDate.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-CalendarSub1PrdDueDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050011form1', 'CalendarSub1PrdDueDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AL0050010','AL0050011form1','_AL0050011form1/SUB1_PRD_DUE_DATE');
  expj.AL0050010.AL0050011form1.CalendarSub1PrdDueDate.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.CalendarSub1PrdDueDate.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/CalendarSub1PrdDueDate.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-CalendarSub1PrdDueDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AL0050010-AL0050011form1-CalendarSub1PrdDueDate" class="AL0050010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ODR_QTY_1",rb)%></span><!-- 手配数 --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050011form1-SUB1_ODR_QTY">
expj.AL0050010.AL0050011form1.SUB1_ODR_QTY = {};
expj.AL0050010.AL0050011form1.SUB1_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_ODR_QTY.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_ODR_QTY.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_ODR_QTY', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_ODR_QTY.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050011form1-SUB1_ODR_QTY" name="SUB1_ODR_QTY" class="AL0050010-focus-move  required-value expj-AL0050010-required-A" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_ODR_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD_1",rb)%></span><!-- 得意先 --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050011form1-SUB1_CUST_CD">
expj.AL0050010.AL0050011form1.SUB1_CUST_CD = {};
expj.AL0050010.AL0050011form1.SUB1_CUST_CD.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_CUST_CD.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_CUST_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_CUST_CD', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_CUST_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050011form1-SUB1_CUST_CD" name="SUB1_CUST_CD" class="AL0050010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_CUST_CD()) %>" maxlength="50" ></div><!--/td-->
<input type="hidden" id="expj-AL0050010-AL0050011form1-MAIN_h_PLANT_CD" name="MAIN_h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getMAIN_h_PLANT_CD()) %>">
<script class="expj-script-AL0050010-AL0050011form1-MAIN_h_PLANT_CD">
expj.AL0050010.AL0050011form1.MAIN_h_PLANT_CD = {};
expj.AL0050010.AL0050011form1.MAIN_h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/MAIN_h_PLANT_CD.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.MAIN_h_PLANT_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-MAIN_h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'MAIN_h_PLANT_CD', this);
  });
  expj.AL0050010.AL0050011form1.MAIN_h_PLANT_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.MAIN_h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/MAIN_h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-MAIN_h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AL0050010-AL0050011form1-MAIN_h_JOB_ODR_CD" name="MAIN_h_JOB_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getMAIN_h_JOB_ODR_CD()) %>">
<script class="expj-script-AL0050010-AL0050011form1-MAIN_h_JOB_ODR_CD">
expj.AL0050010.AL0050011form1.MAIN_h_JOB_ODR_CD = {};
expj.AL0050010.AL0050011form1.MAIN_h_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/MAIN_h_JOB_ODR_CD.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.MAIN_h_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-MAIN_h_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'MAIN_h_JOB_ODR_CD', this);
  });
  expj.AL0050010.AL0050011form1.MAIN_h_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.MAIN_h_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/MAIN_h_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-MAIN_h_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AL0050010-AL0050011form1-MAIN_h_ITEM_CD" name="MAIN_h_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getMAIN_h_ITEM_CD()) %>">
<script class="expj-script-AL0050010-AL0050011form1-MAIN_h_ITEM_CD">
expj.AL0050010.AL0050011form1.MAIN_h_ITEM_CD = {};
expj.AL0050010.AL0050011form1.MAIN_h_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/MAIN_h_ITEM_CD.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.MAIN_h_ITEM_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-MAIN_h_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'MAIN_h_ITEM_CD', this);
  });
  expj.AL0050010.AL0050011form1.MAIN_h_ITEM_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.MAIN_h_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/MAIN_h_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-MAIN_h_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AL0050010-AL0050011form1-MAIN_h_PRD_DUE_DATE_FROM" name="MAIN_h_PRD_DUE_DATE_FROM" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getMAIN_h_PRD_DUE_DATE_FROM()) %>">
<script class="expj-script-AL0050010-AL0050011form1-MAIN_h_PRD_DUE_DATE_FROM">
expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_FROM = {};
expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/MAIN_h_PRD_DUE_DATE_FROM.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_FROM.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-MAIN_h_PRD_DUE_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'MAIN_h_PRD_DUE_DATE_FROM', this);
  });
  expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_FROM.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/MAIN_h_PRD_DUE_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-MAIN_h_PRD_DUE_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AL0050010-AL0050011form1-MAIN_h_PRD_DUE_DATE_TO" name="MAIN_h_PRD_DUE_DATE_TO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getMAIN_h_PRD_DUE_DATE_TO()) %>">
<script class="expj-script-AL0050010-AL0050011form1-MAIN_h_PRD_DUE_DATE_TO">
expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_TO = {};
expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/MAIN_h_PRD_DUE_DATE_TO.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_TO.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-MAIN_h_PRD_DUE_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'MAIN_h_PRD_DUE_DATE_TO', this);
  });
  expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_TO.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/MAIN_h_PRD_DUE_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-MAIN_h_PRD_DUE_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOAD_PLAN_COMMENT_1",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050011form1-SUB1_LOAD_PLAN_COMMENT">
expj.AL0050010.AL0050011form1.SUB1_LOAD_PLAN_COMMENT = {};
expj.AL0050010.AL0050011form1.SUB1_LOAD_PLAN_COMMENT.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_LOAD_PLAN_COMMENT.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_LOAD_PLAN_COMMENT.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_LOAD_PLAN_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_LOAD_PLAN_COMMENT', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_LOAD_PLAN_COMMENT.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_LOAD_PLAN_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_LOAD_PLAN_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_LOAD_PLAN_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AL0050010-AL0050011form1-SUB1_LOAD_PLAN_COMMENT" name="SUB1_LOAD_PLAN_COMMENT" class="AL0050010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_LOAD_PLAN_COMMENT()) %>" maxlength="50" ></div><!--/td-->
<input type="hidden" id="expj-AL0050010-AL0050011form1-SUB1_h_LOAD_PLAN_CD" name="SUB1_h_LOAD_PLAN_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_h_LOAD_PLAN_CD()) %>">
<script class="expj-script-AL0050010-AL0050011form1-SUB1_h_LOAD_PLAN_CD">
expj.AL0050010.AL0050011form1.SUB1_h_LOAD_PLAN_CD = {};
expj.AL0050010.AL0050011form1.SUB1_h_LOAD_PLAN_CD.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_h_LOAD_PLAN_CD.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_h_LOAD_PLAN_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_h_LOAD_PLAN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_h_LOAD_PLAN_CD', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_h_LOAD_PLAN_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_h_LOAD_PLAN_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_h_LOAD_PLAN_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_h_LOAD_PLAN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AL0050010-AL0050011form1-SUB1_h_PLANT_CD" name="SUB1_h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_h_PLANT_CD()) %>">
<script class="expj-script-AL0050010-AL0050011form1-SUB1_h_PLANT_CD">
expj.AL0050010.AL0050011form1.SUB1_h_PLANT_CD = {};
expj.AL0050010.AL0050011form1.SUB1_h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_h_PLANT_CD.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_h_PLANT_CD.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_h_PLANT_CD', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_h_PLANT_CD.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AL0050010-AL0050011form1-SUB1_h_PRD_DUE_DATE" name="SUB1_h_PRD_DUE_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_h_PRD_DUE_DATE()) %>">
<script class="expj-script-AL0050010-AL0050011form1-SUB1_h_PRD_DUE_DATE">
expj.AL0050010.AL0050011form1.SUB1_h_PRD_DUE_DATE = {};
expj.AL0050010.AL0050011form1.SUB1_h_PRD_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_h_PRD_DUE_DATE.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_h_PRD_DUE_DATE.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_h_PRD_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_h_PRD_DUE_DATE', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_h_PRD_DUE_DATE.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_h_PRD_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_h_PRD_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_h_PRD_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AL0050010-AL0050011form1-SUB1_h_PRD_START_DATE" name="SUB1_h_PRD_START_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_h_PRD_START_DATE()) %>">
<script class="expj-script-AL0050010-AL0050011form1-SUB1_h_PRD_START_DATE">
expj.AL0050010.AL0050011form1.SUB1_h_PRD_START_DATE = {};
expj.AL0050010.AL0050011form1.SUB1_h_PRD_START_DATE.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_h_PRD_START_DATE.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_h_PRD_START_DATE.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_h_PRD_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_h_PRD_START_DATE', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_h_PRD_START_DATE.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_h_PRD_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_h_PRD_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_h_PRD_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AL0050010-AL0050011form1-SUB1_h_ENTRY_BY" name="SUB1_h_ENTRY_BY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_h_ENTRY_BY()) %>">
<script class="expj-script-AL0050010-AL0050011form1-SUB1_h_ENTRY_BY">
expj.AL0050010.AL0050011form1.SUB1_h_ENTRY_BY = {};
expj.AL0050010.AL0050011form1.SUB1_h_ENTRY_BY.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_h_ENTRY_BY.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_h_ENTRY_BY.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_h_ENTRY_BY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_h_ENTRY_BY', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_h_ENTRY_BY.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_h_ENTRY_BY.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_h_ENTRY_BY.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_h_ENTRY_BY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AL0050010-AL0050011form1-SUB1_h_MODIFY_COUNT" name="SUB1_h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAL0050010Struct.getSUB1_h_MODIFY_COUNT()) %>">
<script class="expj-script-AL0050010-AL0050011form1-SUB1_h_MODIFY_COUNT">
expj.AL0050010.AL0050011form1.SUB1_h_MODIFY_COUNT = {};
expj.AL0050010.AL0050011form1.SUB1_h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AL0050011form1/SUB1_h_MODIFY_COUNT.onDecision');
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
  expj.AL0050010.executeAllOnDecision();
};
expj.AL0050010.AL0050011form1.SUB1_h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011form1-SUB1_h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AL0050010', 'AL0050011form1', 'SUB1_h_MODIFY_COUNT', this);
  });
  expj.AL0050010.AL0050011form1.SUB1_h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AL0050010.AL0050011form1.SUB1_h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AL0050011form1/SUB1_h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011form1-SUB1_h_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AL0050010-AL0050011button1">
expj.AL0050010.AL0050011button1 = {};
expj.AL0050010.AL0050011button1.executeAllOnDecision = function () {
  console.log('execute AL0050011button1.onDecision');
};
expj.AL0050010.AL0050011button1.executeOnLoad = function () {
  expj.AL0050010.AL0050011button1.executePScriptOnLoad();
};

expj.AL0050010.AL0050011button1.executePScriptOnLoad = function () {
  console.log('execute AL0050011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0050010-AL0050011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0050010-AL0050011button1-Insert">
expj.AL0050010.AL0050011button1.Insert = {};
// script1="onClick;0;CHK;_AL0050011form1/SUB1_PRD_DUE_DATE[lt]_AL0050011form1/SUB1_h_PRD_DUE_DATE@#AL50015"
expj.AL0050010.AL0050011button1.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011button1', '_AL0050011form1/SUB1_PRD_DUE_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011button1', '_AL0050011form1/SUB1_h_PRD_DUE_DATE')))) {
expj.common.pscript.addErrorMessage('AL0050010', 'AL0050011button1', 'AL50015');
}
};
// script2="onClick;1;CHK;_AL0050011form1/SUB1_PRD_DUE_DATE[gt]~ADDDATE(_AL0050011form1/SUB1_h_PRD_DUE_DATE:180)@#AL50017"
expj.AL0050010.AL0050011button1.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011button1', '_AL0050011form1/SUB1_PRD_DUE_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.ADDDATE('AL0050010', 'AL0050011button1', '_AL0050011form1/SUB1_h_PRD_DUE_DATE', '180')))) {
expj.common.pscript.addErrorMessage('AL0050010', 'AL0050011button1', 'AL50017');
}
};
// script3="onClick;2;CHK;_AL0050011form1/SUB1_ODR_QTY[lte]0@#AL50010"
expj.AL0050010.AL0050011button1.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011button1', '_AL0050011form1/SUB1_ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AL0050010', 'AL0050011button1', 'AL50010');
}
};
// script4="onClick;3;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AL0050011form1/*@AL0050010Servlet,,$ZZ07001"
expj.AL0050010.AL0050011button1.Insert.onClick3 = function () {
  console.log('Insert script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050011button1', '_AL0050011form1/*', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.changeBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callConfirm('AL0050010', 'AL0050011button1', 'ZZ07001', okEvent);
};
expj.AL0050010.AL0050011button1.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050011button1.Insert['onClick' + i])) {
        expj.AL0050010.AL0050011button1.Insert['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050011button1.Insert.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050011button1.Insert.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011button1-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050011button1', 'Insert', this, 'Button');
    }
  });
  expj.AL0050010.AL0050011button1.Insert.executePScriptOnLoad();
};

expj.AL0050010.AL0050011button1.Insert.executePScriptOnLoad = function () {
  console.log('execute AL0050011button1/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011button1-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050011button1-Insert" name="Insert" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AL0050010-AL0050011button1-Update">
expj.AL0050010.AL0050011button1.Update = {};
// script1="onClick;0;CHK;_AL0050011form1/SUB1_PRD_DUE_DATE[lt]_AL0050011form1/SUB1_h_PRD_DUE_DATE@#AL50015"
expj.AL0050010.AL0050011button1.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011button1', '_AL0050011form1/SUB1_PRD_DUE_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011button1', '_AL0050011form1/SUB1_h_PRD_DUE_DATE')))) {
expj.common.pscript.addErrorMessage('AL0050010', 'AL0050011button1', 'AL50015');
}
};
// script2="onClick;1;CHK;_AL0050011form1/SUB1_PRD_DUE_DATE[gt]~ADDDATE(_AL0050011form1/SUB1_h_PRD_DUE_DATE:180)@#AL50017"
expj.AL0050010.AL0050011button1.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011button1', '_AL0050011form1/SUB1_PRD_DUE_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.ADDDATE('AL0050010', 'AL0050011button1', '_AL0050011form1/SUB1_h_PRD_DUE_DATE', '180')))) {
expj.common.pscript.addErrorMessage('AL0050010', 'AL0050011button1', 'AL50017');
}
};
// script3="onClick;2;CHK;_AL0050011form1/SUB1_ODR_QTY[lte]0@#AL50010"
expj.AL0050010.AL0050011button1.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AL0050010', 'AL0050011button1', '_AL0050011form1/SUB1_ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AL0050010', 'AL0050011button1', 'AL50010');
}
};
// script4="onClick;3;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AL0050011form1/*@AL0050010Servlet,,$ZZ07003"
expj.AL0050010.AL0050011button1.Update.onClick3 = function () {
  console.log('Update script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050011button1', '_AL0050011form1/*', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.changeBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callConfirm('AL0050010', 'AL0050011button1', 'ZZ07003', okEvent);
};
expj.AL0050010.AL0050011button1.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050011button1.Update['onClick' + i])) {
        expj.AL0050010.AL0050011button1.Update['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050011button1.Update.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050011button1.Update.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011button1-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050011button1', 'Update', this, 'Button');
    }
  });
  expj.AL0050010.AL0050011button1.Update.executePScriptOnLoad();
};

expj.AL0050010.AL0050011button1.Update.executePScriptOnLoad = function () {
  console.log('execute AL0050011button1/Update.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011button1-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050011button1-Update" name="Update" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AL0050011 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AL0050010-AL0050011button0">
expj.AL0050010.AL0050011button0 = {};
expj.AL0050010.AL0050011button0.executeAllOnDecision = function () {
  console.log('execute AL0050011button0.onDecision');
};
expj.AL0050010.AL0050011button0.executeOnLoad = function () {
  expj.AL0050010.AL0050011button0.executePScriptOnLoad();
};

expj.AL0050010.AL0050011button0.executePScriptOnLoad = function () {
  console.log('execute AL0050011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AL0050010-AL0050011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AL0050010-AL0050011button0-Return">
expj.AL0050010.AL0050011button0.Return = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AL0050011form1/*@AL0050010Servlet,,$ZZ07013"
expj.AL0050010.AL0050011button0.Return.onClick0 = function () {
  console.log('Return script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AL0050010', 'AL0050011button0', '_AL0050011form1/*', 'AL0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AL0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AL0050010', response);
expj.common.changeBusinessScreenTab('AL0050010', contents);
};
expj.common.pscript.callConfirm('AL0050010', 'AL0050011button0', 'ZZ07013', okEvent);
};
expj.AL0050010.AL0050011button0.Return.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AL0050010.AL0050011button0.Return['onClick' + i])) {
        expj.AL0050010.AL0050011button0.Return['onClick' + i]();
      }
    }
  }
};
expj.AL0050010.AL0050011button0.Return.executeAllOnDecision = function () {
};
expj.AL0050010.AL0050011button0.Return.executeOnLoad = function () {
  $('#expj-AL0050010-AL0050011button0-Return').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AL0050010', 'AL0050011button0', 'Return', this, 'Button');
    }
  });
  expj.AL0050010.AL0050011button0.Return.executePScriptOnLoad();
};

expj.AL0050010.AL0050011button0.Return.executePScriptOnLoad = function () {
  console.log('execute AL0050011button0/Return.onLoad');
  var targetComponent = document.getElementById('expj-AL0050010-AL0050011button0-Return');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AL0050010-AL0050011button0-Return" name="Return" class="AL0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AL0050010 (END)-->
<%
  MessageStruct msgStruct = aAL0050010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AL0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AL0050010)) {
  expj.common.treeInstanceMap.AL0050010 = {};
}
expj.common.treeInstanceMap.AL0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AL0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AL0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AL0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AL0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AL0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AL0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AL0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AL0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AL0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AL0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0050010)) {
  expj.common.detailDialogMap.AL0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AL0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.AL0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AL0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AL0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AL0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AL0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AL0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AL0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AL0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AL0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AL0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AL0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AL0050010)) {
  expj.common.viewInstanceMap.AL0050010 = {};
}
expj.common.viewInstanceMap.AL0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.AL0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AL0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AL0050010.<%=viewId %>.init = function () {
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
    expj.AL0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AL0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AL0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AL0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AL0050010_init">
/**
 * AL0050010用のロード完了時初期化関数
 */
expj.AL0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AL0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AL0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AL0050010');
  expj.common.calendarInstanceMap.AL0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AL0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AL0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AL0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AL0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AL0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AL0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AL0050010-<%=detailId %>');
<%
 }
%>
  try{expj.AL0050010.AL0050011form1.SUB1_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_h_l_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.PeekerSub1ItemCd.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_h_l_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_PRD_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.CalendarSub1PrdDueDate.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.MAIN_h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.MAIN_h_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.MAIN_h_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.MAIN_h_PRD_DUE_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_LOAD_PLAN_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_h_LOAD_PLAN_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_h_PRD_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_h_PRD_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_h_ENTRY_BY.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.SUB1_h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011button1.Insert.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011button1.Update.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011button0.Return.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011form1.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011button1.executeOnLoad();}catch(e){};
  try{expj.AL0050010.AL0050011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AL0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AL0050010', 'AL0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AL0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AL0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.AL0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AL0050010', '<%=request.getContextPath() %>');
};

/**
 * AL0050010の全体onDecision処理
 */
expj.AL0050010.executeAllOnDecision = function () {
  expj.AL0050010.AL0050011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AL0050010_console">
expj.AL0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>