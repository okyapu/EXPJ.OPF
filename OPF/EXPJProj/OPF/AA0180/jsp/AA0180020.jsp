<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:25:35 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0180\AA0180020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0180.*" %>
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
<jsp:useBean id="aAA0180020Control" class="com.nec.jp.orteus.metamorBase.AA0180.AA0180020Control" scope="request"/>
<jsp:useBean id="aAA0180020Struct" class="com.nec.jp.orteus.metamorBase.AA0180.AA0180020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

���i�\���R�s�[�o�^
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0180/jsp/AA0180020.jsp,v $
$Author: geng-jia $    
$Revision: 1.6 $ $Date: 2017/02/22 02:04:14 $
********************************************************* --%>
<html>
<head>
<title>���i�\���R�s�[�o�^</title>
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
<script class="expj-script-AA0180020_init">
  // AA0180020���O���
  expj.AA0180020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0180020" data-screen="AA0180020" data-newdata="<%=aAA0180020Control.isNewData() %>">
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
              <script class="expj-script-AA0180020-AA0180020form1">
expj.AA0180020.AA0180020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AA0180020.AA0180020form1.onLoad0 = function () {
  console.log('AA0180020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A[or]B@*0,*1"
expj.AA0180020.AA0180020form1.onDecision0 = function () {
  console.log('AA0180020form1 script2');
if ((expj.common.pscript.satisfiedRequiredComponent('AA0180020', 'A') || expj.common.pscript.satisfiedRequiredComponent('AA0180020', 'B'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0180020button1/Select"
expj.AA0180020.AA0180020form1.child0 = function () {
  console.log('AA0180020form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_AA0180020button1/Select');
};
// script4="child;1;MASK;_AA0180020button1/Select"
expj.AA0180020.AA0180020form1.child1 = function () {
  console.log('AA0180020form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_AA0180020button1/Select');
};
// script5="onDecision;1;CHK;?AA0180020view3/*[eq]NORMAL[and]?AA0180020form1/FrUp_ITEM_CD[eq]SAME[and]?AA0180020form1/TargetDate[eq]SAME[and]?AA0180020form1/DEVELOP_TYP[eq]SAME@*2,*3"
expj.AA0180020.AA0180020form1.onDecision1 = function () {
  console.log('AA0180020form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '?AA0180020view3/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '?AA0180020form1/FrUp_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '?AA0180020form1/TargetDate'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '?AA0180020form1/DEVELOP_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AA0180020button2/CheckAll,_AA0180020button2/CheckClear"
expj.AA0180020.AA0180020form1.child2 = function () {
  console.log('AA0180020form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_AA0180020button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_AA0180020button2/CheckClear');
};
// script7="child;3;MASK;_AA0180020button2/CheckAll,_AA0180020button2/CheckClear"
expj.AA0180020.AA0180020form1.child3 = function () {
  console.log('AA0180020form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_AA0180020button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_AA0180020button2/CheckClear');
};
// script8="onDecision;2;CHKRQ;A,B,?AA0180020view3/?[neq]NOT_SELECTED@*4,*6"
expj.AA0180020.AA0180020form1.onDecision2 = function () {
  console.log('AA0180020form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('AA0180020', 'A') && expj.common.pscript.satisfiedRequiredComponent('AA0180020', 'B') && (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '?AA0180020view3/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;4;CHK;?AA0180020view3/*[eq]NORMAL[and]?AA0180020form1/FrUp_ITEM_CD[eq]SAME[and]?AA0180020form1/ToUp_ITEM_CD[eq]SAME[and]?AA0180020form1/TargetDate[eq]SAME[and]?AA0180020form1/DEVELOP_TYP[eq]SAME@*5,*6"
expj.AA0180020.AA0180020form1.child4 = function () {
  console.log('AA0180020form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '?AA0180020view3/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '?AA0180020form1/FrUp_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '?AA0180020form1/ToUp_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '?AA0180020form1/TargetDate'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '?AA0180020form1/DEVELOP_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;UNMASK;_AA0180020button2/Update"
expj.AA0180020.AA0180020form1.child5 = function () {
  console.log('AA0180020form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_AA0180020button2/Update');
};
// script11="child;6;MASK;_AA0180020button2/Update"
expj.AA0180020.AA0180020form1.child6 = function () {
  console.log('AA0180020form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_AA0180020button2/Update');
};
expj.AA0180020.AA0180020form1.executeAllOnDecision = function () {
  console.log('execute AA0180020form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180020.AA0180020form1['onDecision' + i])) {
        expj.AA0180020.AA0180020form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0180020.AA0180020form1.executeOnLoad = function () {
  expj.AA0180020.AA0180020form1.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0180020.AA0180020form1['onLoad' + i])) {
      expj.AA0180020.AA0180020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0180020-AA0180020form1" action="AA0180020Servlet" name="AA0180020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_7",rb)%></span><!-- �R�s�[���i�ڔԍ� --></div><!--/td-->
<script class="expj-script-AA0180020-AA0180020form1-FrUp_ITEM_CD">
expj.AA0180020.AA0180020form1.FrUp_ITEM_CD = {};
expj.AA0180020.AA0180020form1.FrUp_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0180020form1/FrUp_ITEM_CD.onDecision');
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020form1.FrUp_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-FrUp_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180020', 'AA0180020form1', 'FrUp_ITEM_CD', this);
  });
  expj.AA0180020.AA0180020form1.FrUp_ITEM_CD.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.FrUp_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/FrUp_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-FrUp_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0180020-AA0180020form1-FrUp_ITEM_CD" name="FrUp_ITEM_CD" class="AA0180020-focus-move  required-value expj-AA0180020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0180020Struct.getFrUp_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0180020-AA0180020form1-h_FrUp_ITEM_CD" name="h_FrUp_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0180020Struct.geth_FrUp_ITEM_CD()) %>">
<script class="expj-script-AA0180020-AA0180020form1-h_FrUp_ITEM_CD">
expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD.onLoad0 = function () {
  console.log('h_FrUp_ITEM_CD script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]@*1,*2"
expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD.child0 = function () {
  console.log('h_FrUp_ITEM_CD script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_FrUp_ITEM_CD,_PeekerFrUpItemCd"
expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD.child1 = function () {
  console.log('h_FrUp_ITEM_CD script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_FrUp_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_PeekerFrUpItemCd');
};
// script4="child;2;MASK;_FrUp_ITEM_CD,_PeekerFrUpItemCd"
expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD.child2 = function () {
  console.log('h_FrUp_ITEM_CD script4');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_FrUp_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_PeekerFrUpItemCd');
};
expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0180020form1/h_FrUp_ITEM_CD.onDecision');
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-h_FrUp_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180020', 'AA0180020form1', 'h_FrUp_ITEM_CD', this);
  });
  expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/h_FrUp_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-h_FrUp_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD['onLoad' + i])) {
      expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0180020-AA0180020form1-PeekerFrUpItemCd">
expj.AA0180020.AA0180020form1.PeekerFrUpItemCd = {};
// script1="onClick;0;PEEKER;_AA0180020form1/FrUp_ITEM_CD@<%=contextNo%>"
expj.AA0180020.AA0180020form1.PeekerFrUpItemCd.onClick0 = function () {
  console.log('PeekerFrUpItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0180020';
var parameterValues = 'PeekerFrUpItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '_AA0180020form1/FrUp_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0180020form1/FrUp_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0180020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0180020.AA0180020form1.PeekerFrUpItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180020.AA0180020form1.PeekerFrUpItemCd['onClick' + i])) {
        expj.AA0180020.AA0180020form1.PeekerFrUpItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0180020.AA0180020form1.PeekerFrUpItemCd.executeAllOnDecision = function () {
};
expj.AA0180020.AA0180020form1.PeekerFrUpItemCd.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-PeekerFrUpItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180020', 'AA0180020form1', 'PeekerFrUpItemCd', this, 'Button');
    }
  });
  expj.AA0180020.AA0180020form1.PeekerFrUpItemCd.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.PeekerFrUpItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/PeekerFrUpItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-PeekerFrUpItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0180020-AA0180020form1-PeekerFrUpItemCd" class="AA0180020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0180020-AA0180020form1-FrUp_ITEM_NAME">
expj.AA0180020.AA0180020form1.FrUp_ITEM_NAME = {};
expj.AA0180020.AA0180020form1.FrUp_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0180020form1/FrUp_ITEM_NAME.onDecision');
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020form1.FrUp_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-FrUp_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180020', 'AA0180020form1', 'FrUp_ITEM_NAME', this);
  });
  expj.AA0180020.AA0180020form1.FrUp_ITEM_NAME.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.FrUp_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/FrUp_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-FrUp_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0180020-AA0180020form1-FrUp_ITEM_NAME" name="FrUp_ITEM_NAME" class="AA0180020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0180020Struct.getFrUp_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_8",rb)%></span><!-- �R�s�[��i�ڔԍ� --></div><!--/td-->
<script class="expj-script-AA0180020-AA0180020form1-ToUp_ITEM_CD">
expj.AA0180020.AA0180020form1.ToUp_ITEM_CD = {};
expj.AA0180020.AA0180020form1.ToUp_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0180020form1/ToUp_ITEM_CD.onDecision');
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020form1.ToUp_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-ToUp_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180020', 'AA0180020form1', 'ToUp_ITEM_CD', this);
  });
  expj.AA0180020.AA0180020form1.ToUp_ITEM_CD.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.ToUp_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/ToUp_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-ToUp_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0180020-AA0180020form1-ToUp_ITEM_CD" name="ToUp_ITEM_CD" class="AA0180020-focus-move  required-value expj-AA0180020-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0180020Struct.getToUp_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0180020-AA0180020form1-h_ToUp_ITEM_CD" name="h_ToUp_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0180020Struct.geth_ToUp_ITEM_CD()) %>">
<script class="expj-script-AA0180020-AA0180020form1-h_ToUp_ITEM_CD">
expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD.onLoad0 = function () {
  console.log('h_ToUp_ITEM_CD script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]@*1,*2"
expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD.child0 = function () {
  console.log('h_ToUp_ITEM_CD script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_ToUp_ITEM_CD,_PeekerToUpItemCd"
expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD.child1 = function () {
  console.log('h_ToUp_ITEM_CD script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_ToUp_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_PeekerToUpItemCd');
};
// script4="child;2;MASK;_ToUp_ITEM_CD,_PeekerToUpItemCd"
expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD.child2 = function () {
  console.log('h_ToUp_ITEM_CD script4');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_ToUp_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_PeekerToUpItemCd');
};
expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0180020form1/h_ToUp_ITEM_CD.onDecision');
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-h_ToUp_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180020', 'AA0180020form1', 'h_ToUp_ITEM_CD', this);
  });
  expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/h_ToUp_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-h_ToUp_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD['onLoad' + i])) {
      expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0180020-AA0180020form1-PeekerToUpItemCd">
expj.AA0180020.AA0180020form1.PeekerToUpItemCd = {};
// script1="onClick;0;PEEKER;_AA0180020form1/ToUp_ITEM_CD@<%=contextNo%>"
expj.AA0180020.AA0180020form1.PeekerToUpItemCd.onClick0 = function () {
  console.log('PeekerToUpItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0180020';
var parameterValues = 'PeekerToUpItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '_ToUp_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0180020form1/ToUp_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0180020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0180020.AA0180020form1.PeekerToUpItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180020.AA0180020form1.PeekerToUpItemCd['onClick' + i])) {
        expj.AA0180020.AA0180020form1.PeekerToUpItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0180020.AA0180020form1.PeekerToUpItemCd.executeAllOnDecision = function () {
};
expj.AA0180020.AA0180020form1.PeekerToUpItemCd.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-PeekerToUpItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180020', 'AA0180020form1', 'PeekerToUpItemCd', this, 'Button');
    }
  });
  expj.AA0180020.AA0180020form1.PeekerToUpItemCd.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.PeekerToUpItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/PeekerToUpItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-PeekerToUpItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0180020-AA0180020form1-PeekerToUpItemCd" class="AA0180020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0180020-AA0180020form1-ToUp_ITEM_NAME">
expj.AA0180020.AA0180020form1.ToUp_ITEM_NAME = {};
expj.AA0180020.AA0180020form1.ToUp_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0180020form1/ToUp_ITEM_NAME.onDecision');
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020form1.ToUp_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-ToUp_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180020', 'AA0180020form1', 'ToUp_ITEM_NAME', this);
  });
  expj.AA0180020.AA0180020form1.ToUp_ITEM_NAME.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.ToUp_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/ToUp_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-ToUp_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0180020-AA0180020form1-ToUp_ITEM_NAME" name="ToUp_ITEM_NAME" class="AA0180020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0180020Struct.getToUp_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_3",rb)%></span><!-- �Ώۓ��t --></div><!--/td-->
<script class="expj-script-AA0180020-AA0180020form1-TargetDate">
expj.AA0180020.AA0180020form1.TargetDate = {};
expj.AA0180020.AA0180020form1.TargetDate.executeAllOnDecision = function () {
  console.log('execute AA0180020form1/TargetDate.onDecision');
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020form1.TargetDate.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-TargetDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180020', 'AA0180020form1', 'TargetDate', this);
  });
  expj.AA0180020.AA0180020form1.TargetDate.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.TargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/TargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-TargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0180020-AA0180020form1-TargetDate" name="TargetDate" class="AA0180020-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0180020Struct.getTargetDate()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0180020-AA0180020form1-CalendarTargetDate">
expj.AA0180020.AA0180020form1.CalendarTargetDate = {};
// script1="onClick;0;CALENDAR;_AA0180020form1/TargetDate"
expj.AA0180020.AA0180020form1.CalendarTargetDate.onClick0 = function () {
  console.log('CalendarTargetDate script1');
expj.common.pscript.executeCalendar('AA0180020','AA0180020form1','_AA0180020form1/TargetDate');
};
expj.AA0180020.AA0180020form1.CalendarTargetDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180020.AA0180020form1.CalendarTargetDate['onClick' + i])) {
        expj.AA0180020.AA0180020form1.CalendarTargetDate['onClick' + i]();
      }
    }
  }
};
expj.AA0180020.AA0180020form1.CalendarTargetDate.executeAllOnDecision = function () {
};
expj.AA0180020.AA0180020form1.CalendarTargetDate.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-CalendarTargetDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180020', 'AA0180020form1', 'CalendarTargetDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0180020','AA0180020form1','_AA0180020form1/TargetDate');
  expj.AA0180020.AA0180020form1.CalendarTargetDate.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.CalendarTargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/CalendarTargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-CalendarTargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0180020-AA0180020form1-CalendarTargetDate" class="AA0180020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-AA0180020-AA0180020form1-h_TargetDate" name="h_TargetDate" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0180020Struct.geth_TargetDate()) %>">
<script class="expj-script-AA0180020-AA0180020form1-h_TargetDate">
expj.AA0180020.AA0180020form1.h_TargetDate = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0180020.AA0180020form1.h_TargetDate.onLoad0 = function () {
  console.log('h_TargetDate script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]@*1,*2"
expj.AA0180020.AA0180020form1.h_TargetDate.child0 = function () {
  console.log('h_TargetDate script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_TargetDate,_CalendarTargetDate"
expj.AA0180020.AA0180020form1.h_TargetDate.child1 = function () {
  console.log('h_TargetDate script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_TargetDate');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_CalendarTargetDate');
};
// script4="child;2;MASK;_TargetDate,_CalendarTargetDate"
expj.AA0180020.AA0180020form1.h_TargetDate.child2 = function () {
  console.log('h_TargetDate script4');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_TargetDate');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_CalendarTargetDate');
};
expj.AA0180020.AA0180020form1.h_TargetDate.executeAllOnDecision = function () {
  console.log('execute AA0180020form1/h_TargetDate.onDecision');
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020form1.h_TargetDate.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-h_TargetDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180020', 'AA0180020form1', 'h_TargetDate', this);
  });
  expj.AA0180020.AA0180020form1.h_TargetDate.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.h_TargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/h_TargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-h_TargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0180020.AA0180020form1.h_TargetDate['onLoad' + i])) {
      expj.AA0180020.AA0180020form1.h_TargetDate['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0017",rb)%></span><!-- �W�J�敪 --></div><!--/td-->
<script class="expj-script-AA0180020-AA0180020form1-DEVELOP_TYP">
expj.AA0180020.AA0180020form1.DEVELOP_TYP = {};
expj.AA0180020.AA0180020form1.DEVELOP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0180020form1/DEVELOP_TYP.onDecision');
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020form1.DEVELOP_TYP.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-DEVELOP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0180020', 'AA0180020form1', 'DEVELOP_TYP', this);
  });
  expj.AA0180020.AA0180020form1.DEVELOP_TYP.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.DEVELOP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/DEVELOP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-DEVELOP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0180020-AA0180020form1-DEVELOP_TYP" name='DEVELOP_TYP' class='AA0180020-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0180020Control.getStruct().getList_DEVELOP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0180020Control.getStruct().getList_DEVELOP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0180020Control.getStruct().getList_DEVELOP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0180020Struct.getDEVELOP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-AA0180020-AA0180020form1-h_DEVELOP_TYP" name="h_DEVELOP_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0180020Struct.geth_DEVELOP_TYP()) %>">
<script class="expj-script-AA0180020-AA0180020form1-h_DEVELOP_TYP">
expj.AA0180020.AA0180020form1.h_DEVELOP_TYP = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0180020.AA0180020form1.h_DEVELOP_TYP.onLoad0 = function () {
  console.log('h_DEVELOP_TYP script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]@*1,*2"
expj.AA0180020.AA0180020form1.h_DEVELOP_TYP.child0 = function () {
  console.log('h_DEVELOP_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_DEVELOP_TYP"
expj.AA0180020.AA0180020form1.h_DEVELOP_TYP.child1 = function () {
  console.log('h_DEVELOP_TYP script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_DEVELOP_TYP');
};
// script4="child;2;MASK;_DEVELOP_TYP"
expj.AA0180020.AA0180020form1.h_DEVELOP_TYP.child2 = function () {
  console.log('h_DEVELOP_TYP script4');
expj.common.pscript.setMaskToReferenceComponent('AA0180020', 'AA0180020form1', '_DEVELOP_TYP');
};
expj.AA0180020.AA0180020form1.h_DEVELOP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0180020form1/h_DEVELOP_TYP.onDecision');
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020form1.h_DEVELOP_TYP.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020form1-h_DEVELOP_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180020', 'AA0180020form1', 'h_DEVELOP_TYP', this);
  });
  expj.AA0180020.AA0180020form1.h_DEVELOP_TYP.executePScriptOnLoad();
};

expj.AA0180020.AA0180020form1.h_DEVELOP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0180020form1/h_DEVELOP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020form1-h_DEVELOP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0180020.AA0180020form1.h_DEVELOP_TYP['onLoad' + i])) {
      expj.AA0180020.AA0180020form1.h_DEVELOP_TYP['onLoad' + i]();
    }
  }
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0180020-AA0180020button1">
expj.AA0180020.AA0180020button1 = {};
expj.AA0180020.AA0180020button1.executeAllOnDecision = function () {
  console.log('execute AA0180020button1.onDecision');
};
expj.AA0180020.AA0180020button1.executeOnLoad = function () {
  expj.AA0180020.AA0180020button1.executePScriptOnLoad();
};

expj.AA0180020.AA0180020button1.executePScriptOnLoad = function () {
  console.log('execute AA0180020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0180020-AA0180020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0180020-AA0180020button1-Select">
expj.AA0180020.AA0180020button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0180020form1/*@AA0180020Servlet"
expj.AA0180020.AA0180020button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180020', 'AA0180020button1', '_AA0180020form1/*', 'AA0180020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180020', response);
expj.common.updateBusinessScreenTab('AA0180020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0180020.AA0180020button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180020.AA0180020button1.Select['onClick' + i])) {
        expj.AA0180020.AA0180020button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AA0180020.AA0180020button1.Select.executeAllOnDecision = function () {
};
expj.AA0180020.AA0180020button1.Select.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180020', 'AA0180020button1', 'Select', this, 'Button');
    }
  });
  expj.AA0180020.AA0180020button1.Select.executePScriptOnLoad();
};

expj.AA0180020.AA0180020button1.Select.executePScriptOnLoad = function () {
  console.log('execute AA0180020button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180020-AA0180020button1-Select" name="Select" class="AA0180020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- �Ǎ��{�^�� --></div><!--/td-->
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
<div class="expj-td "></div><!--/td-->
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;">
<div class="expj-td frame04" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);float:left;"><script class="expj-script-AA0180020-AA0180020view1">
expj.AA0180020.AA0180020view1 = {};
expj.AA0180020.AA0180020view1.executeAllOnClick = function () {
};
expj.AA0180020.AA0180020view1.executeAllOnDecision = function () {
  console.log('execute AA0180020view1.onDecision');
};
expj.AA0180020.AA0180020view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0180020view1", "expj.AA0180020.AA0180020view1.executeAllOnClick");
%>
  expj.AA0180020.AA0180020view1.executePScriptOnLoad();
};

expj.AA0180020.AA0180020view1.executePScriptOnLoad = function () {
  console.log('execute AA0180020view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0180020-AA0180020view1" class="expj-datagrid-view expj-view-noselect expj-view-headeronly" style="width:100%;height:23px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0180020view1_Id = "AA0180020view1";
 String AA0180020view1_select = "single";
 String AA0180020view1_sortable = "true";
 String AA0180020view1_resize = "true";
 String AA0180020view1_scroll = "true";
 StringBuffer AA0180020view1_HB = new StringBuffer();
 StringBuffer AA0180020view1_DB = new StringBuffer();
%>
<%
 AA0180020view1_select = "none";
 AA0180020view1_sortable = "false";
 AA0180020view1_resize = "false";
 AA0180020view1_scroll = "false";
%>
<%
 AA0180020view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0180020view1_sortable).append("}").append(",");
%>
 
<%
AA0180020view1_HB.append("{'visible':true, 'type':'string', 'width':'453px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0224",rb))).append("', 'name':'', 'class':'expj-tooltip ', 'sortable':").append(AA0180020view1_sortable).append("}").append(",");
%>
<%
 int aAA0180020StructLength = aAA0180020Control.getListsize();
 final AA0180020Struct structBackup = aAA0180020Struct;
 aAA0180020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0180020StructLength; ++loopCount) {
  if((aAA0180020Struct = (AA0180020Struct) aAA0180020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0180020Struct", aAA0180020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
if (loopCount + 1 < aAA0180020StructLength) {
  }
 }
 aAA0180020Struct = structBackup;
 viewIdList.add(AA0180020view1_Id);
 viewSelectList.add(AA0180020view1_select);
 viewResizeList.add(AA0180020view1_resize);
 viewScrollList.add(AA0180020view1_scroll);
 viewHeaderDataList.add(AA0180020view1_HB);
 viewBodyDataList.add(AA0180020view1_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td widthLinePartition" style="height:23px;float:left;"></div><!--/td-->
<div class="expj-td frame04" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);float:left;"><script class="expj-script-AA0180020-AA0180020view2">
expj.AA0180020.AA0180020view2 = {};
expj.AA0180020.AA0180020view2.executeAllOnClick = function () {
};
expj.AA0180020.AA0180020view2.executeAllOnDecision = function () {
  console.log('execute AA0180020view2.onDecision');
};
expj.AA0180020.AA0180020view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0180020view2", "expj.AA0180020.AA0180020view2.executeAllOnClick");
%>
  expj.AA0180020.AA0180020view2.executePScriptOnLoad();
};

expj.AA0180020.AA0180020view2.executePScriptOnLoad = function () {
  console.log('execute AA0180020view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0180020-AA0180020view2" class="expj-datagrid-view expj-view-noselect expj-view-headeronly" style="width:100%;height:23px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0180020view2_Id = "AA0180020view2";
 String AA0180020view2_select = "single";
 String AA0180020view2_sortable = "true";
 String AA0180020view2_resize = "true";
 String AA0180020view2_scroll = "true";
 StringBuffer AA0180020view2_HB = new StringBuffer();
 StringBuffer AA0180020view2_DB = new StringBuffer();
%>
<%
 AA0180020view2_select = "none";
 AA0180020view2_sortable = "false";
 AA0180020view2_resize = "false";
 AA0180020view2_scroll = "false";
%>
<%
 AA0180020view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0180020view2_sortable).append("}").append(",");
%>
 
<%
AA0180020view2_HB.append("{'visible':true, 'type':'string', 'width':'453px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0225",rb))).append("', 'name':'', 'class':'expj-tooltip ', 'sortable':").append(AA0180020view2_sortable).append("}").append(",");
%>
<%
 int aAA0180020StructLength = aAA0180020Control.getListsize();
 final AA0180020Struct structBackup = aAA0180020Struct;
 aAA0180020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0180020StructLength; ++loopCount) {
  if((aAA0180020Struct = (AA0180020Struct) aAA0180020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0180020Struct", aAA0180020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
if (loopCount + 1 < aAA0180020StructLength) {
  }
 }
 aAA0180020Struct = structBackup;
 viewIdList.add(AA0180020view2_Id);
 viewSelectList.add(AA0180020view2_select);
 viewResizeList.add(AA0180020view2_resize);
 viewScrollList.add(AA0180020view2_scroll);
 viewHeaderDataList.add(AA0180020view2_HB);
 viewBodyDataList.add(AA0180020view2_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;float:left;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);height:calc(100% - 23px);float:left;"><script class="expj-script-AA0180020-AA0180020view3">
expj.AA0180020.AA0180020view3 = {};
expj.AA0180020.AA0180020view3.executeAllOnClick = function () {
};
expj.AA0180020.AA0180020view3.executeAllOnDecision = function () {
  console.log('execute AA0180020view3.onDecision');
};
expj.AA0180020.AA0180020view3.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0180020view3", "expj.AA0180020.AA0180020view3.executeAllOnClick");
%>
  expj.AA0180020.AA0180020view3.executePScriptOnLoad();
};

expj.AA0180020.AA0180020view3.executePScriptOnLoad = function () {
  console.log('execute AA0180020view3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0180020-AA0180020view3" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAA0180020Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AA0180020view3_Id = "AA0180020view3";
 String AA0180020view3_select = "single";
 String AA0180020view3_sortable = "true";
 String AA0180020view3_resize = "true";
 String AA0180020view3_scroll = "true";
 StringBuffer AA0180020view3_HB = new StringBuffer();
 StringBuffer AA0180020view3_DB = new StringBuffer();
%>
<%
 AA0180020view3_select = "multi";
 AA0180020view3_sortable = "true";
 AA0180020view3_resize = "true";
 AA0180020view3_scroll = "true";
%>
<%
 AA0180020view3_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0180020view3_sortable).append("}").append(",");
%>
 
   <script class="expj-script-AA0180020-AA0180020view3-h_Fr_MODIFY_COUNT">
expj.AA0180020.AA0180020view3.h_Fr_MODIFY_COUNT = {};
expj.AA0180020.AA0180020view3.h_Fr_MODIFY_COUNT.executeAllOnClick = function () {
};
expj.AA0180020.AA0180020view3.h_Fr_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0180020view3/h_Fr_MODIFY_COUNT.onDecision');
  expj.AA0180020.AA0180020view3.executeAllOnDecision();
  expj.AA0180020.executeAllOnDecision();
};
expj.AA0180020.AA0180020view3.h_Fr_MODIFY_COUNT.executeOnLoad = function () {
  $('.expj-AA0180020-AA0180020view3-h_Fr_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180020', 'AA0180020view3', 'h_Fr_MODIFY_COUNT', this);
  });
  expj.AA0180020.AA0180020view3.h_Fr_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0180020.AA0180020view3.h_Fr_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0180020view3/h_Fr_MODIFY_COUNT.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>

<%
AA0180020view3_HB.append("{'visible':true, 'type':'string', 'width':'116px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'FrLo_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0180020view3_sortable).append("}").append(",");
AA0180020view3_HB.append("{'visible':true, 'type':'string', 'width':'35px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_EDITION_3",rb))).append("', 'name':'Fr_PS_EDITION', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0180020view3_sortable).append("}").append(",");
AA0180020view3_HB.append("{'visible':true, 'type':'string', 'width':'148px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'FrLo_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0180020view3_sortable).append("}").append(",");
AA0180020view3_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb))).append("', 'name':'Fr_EFF_PHASE_IN_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0180020view3_sortable).append("}").append(",");
AA0180020view3_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE",rb))).append("', 'name':'Fr_EFF_PHASE_OUT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0180020view3_sortable).append("}").append(",");
AA0180020view3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_Fr_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0180020view3_sortable).append("}").append(",");
%>
<%
 int aAA0180020StructLength = aAA0180020Control.getListsize();
 final AA0180020Struct structBackup = aAA0180020Struct;
 aAA0180020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0180020StructLength; ++loopCount) {
  if((aAA0180020Struct = (AA0180020Struct) aAA0180020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0180020Struct", aAA0180020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0180020view3_DB.append("[");
 AA0180020view3_DB.append(loopCount);
 AA0180020view3_DB.append(",").append("'<span id=\"expj-AA0180020-AA0180020view3-FrLo_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0180020-AA0180020view3-FrLo_ITEM_CD\" data-name=\"FrLo_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0180020Struct.getFrLo_ITEM_CD())).append("</span>'");
 AA0180020view3_DB.append(",").append("'<span id=\"expj-AA0180020-AA0180020view3-Fr_PS_EDITION-").append(loopCount).append("\" class=\"expj-label expj-AA0180020-AA0180020view3-Fr_PS_EDITION\" data-name=\"Fr_PS_EDITION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0180020Struct.getFr_PS_EDITION())).append("</span>'");
 AA0180020view3_DB.append(",").append("'<span id=\"expj-AA0180020-AA0180020view3-FrLo_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0180020-AA0180020view3-FrLo_ITEM_NAME\" data-name=\"FrLo_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0180020Struct.getFrLo_ITEM_NAME())).append("</span>'");
 AA0180020view3_DB.append(",").append("'<span id=\"expj-AA0180020-AA0180020view3-Fr_EFF_PHASE_IN_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0180020-AA0180020view3-Fr_EFF_PHASE_IN_DATE\" data-name=\"Fr_EFF_PHASE_IN_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0180020Struct.getFr_EFF_PHASE_IN_DATE())).append("</span>'");
 AA0180020view3_DB.append(",").append("'<span id=\"expj-AA0180020-AA0180020view3-Fr_EFF_PHASE_OUT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0180020-AA0180020view3-Fr_EFF_PHASE_OUT_DATE\" data-name=\"Fr_EFF_PHASE_OUT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0180020Struct.getFr_EFF_PHASE_OUT_DATE())).append("</span>'");
 AA0180020view3_DB.append(",").append("'<input type=\"text\" id=\"expj-AA0180020-AA0180020view3-h_Fr_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-AA0180020-AA0180020view3-h_Fr_MODIFY_COUNT AA0180020-focus-move\" data-name=\"h_Fr_MODIFY_COUNT\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAA0180020Struct.geth_Fr_MODIFY_COUNT())).append("\">'");
 AA0180020view3_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0180020StructLength) {
   AA0180020view3_DB.append(",");
  }
 }
 aAA0180020Struct = structBackup;
 viewIdList.add(AA0180020view3_Id);
 viewSelectList.add(AA0180020view3_select);
 viewResizeList.add(AA0180020view3_resize);
 viewScrollList.add(AA0180020view3_scroll);
 viewHeaderDataList.add(AA0180020view3_HB);
 viewBodyDataList.add(AA0180020view3_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="float:left;"></div><!--/td-->
<div class="expj-td widthLinePartition" style="height:calc(100% - 23px);float:left;"></div><!--/td-->
<div class="expj-td frame04" style="float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);height:calc(100% - 23px);float:left;"><script class="expj-script-AA0180020-AA0180020view4">
expj.AA0180020.AA0180020view4 = {};
expj.AA0180020.AA0180020view4.executeAllOnClick = function () {
};
expj.AA0180020.AA0180020view4.executeAllOnDecision = function () {
  console.log('execute AA0180020view4.onDecision');
};
expj.AA0180020.AA0180020view4.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0180020view4", "expj.AA0180020.AA0180020view4.executeAllOnClick");
%>
  expj.AA0180020.AA0180020view4.executePScriptOnLoad();
};

expj.AA0180020.AA0180020view4.executePScriptOnLoad = function () {
  console.log('execute AA0180020view4.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0180020-AA0180020view4" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0180020view4_Id = "AA0180020view4";
 String AA0180020view4_select = "single";
 String AA0180020view4_sortable = "true";
 String AA0180020view4_resize = "true";
 String AA0180020view4_scroll = "true";
 StringBuffer AA0180020view4_HB = new StringBuffer();
 StringBuffer AA0180020view4_DB = new StringBuffer();
%>
<%
 AA0180020view4_select = "none";
 AA0180020view4_sortable = "true";
 AA0180020view4_resize = "true";
 AA0180020view4_scroll = "true";
%>
<%
 AA0180020view4_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0180020view4_sortable).append("}").append(",");
%>
 
    <%
                  List listBackup = aAA0180020Control.getList();
                  aAA0180020Control.setList(aAA0180020Control.getToList());
                %>
 <%
AA0180020view4_HB.append("{'visible':true, 'type':'string', 'width':'116px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ToLo_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0180020view4_sortable).append("}").append(",");
AA0180020view4_HB.append("{'visible':true, 'type':'string', 'width':'35px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_EDITION_3",rb))).append("', 'name':'To_PS_EDITION', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0180020view4_sortable).append("}").append(",");
AA0180020view4_HB.append("{'visible':true, 'type':'string', 'width':'148px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ToLo_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0180020view4_sortable).append("}").append(",");
AA0180020view4_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb))).append("', 'name':'To_EFF_PHASE_IN_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0180020view4_sortable).append("}").append(",");
AA0180020view4_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE",rb))).append("', 'name':'To_EFF_PHASE_OUT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0180020view4_sortable).append("}").append(",");
%>
<%
 int aAA0180020StructLength = aAA0180020Control.getListsize();
 final AA0180020Struct structBackup = aAA0180020Struct;
 aAA0180020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0180020StructLength; ++loopCount) {
  if((aAA0180020Struct = (AA0180020Struct) aAA0180020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0180020Struct", aAA0180020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0180020view4_DB.append("[");
 AA0180020view4_DB.append(loopCount);
 AA0180020view4_DB.append(",").append("'<span id=\"expj-AA0180020-AA0180020view4-ToLo_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0180020-AA0180020view4-ToLo_ITEM_CD\" data-name=\"ToLo_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0180020Struct.getToLo_ITEM_CD())).append("</span>'");
 AA0180020view4_DB.append(",").append("'<span id=\"expj-AA0180020-AA0180020view4-To_PS_EDITION-").append(loopCount).append("\" class=\"expj-label expj-AA0180020-AA0180020view4-To_PS_EDITION\" data-name=\"To_PS_EDITION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0180020Struct.getTo_PS_EDITION())).append("</span>'");
 AA0180020view4_DB.append(",").append("'<span id=\"expj-AA0180020-AA0180020view4-ToLo_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0180020-AA0180020view4-ToLo_ITEM_NAME\" data-name=\"ToLo_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0180020Struct.getToLo_ITEM_NAME())).append("</span>'");
 AA0180020view4_DB.append(",").append("'<span id=\"expj-AA0180020-AA0180020view4-To_EFF_PHASE_IN_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0180020-AA0180020view4-To_EFF_PHASE_IN_DATE\" data-name=\"To_EFF_PHASE_IN_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0180020Struct.getTo_EFF_PHASE_IN_DATE())).append("</span>'");
 AA0180020view4_DB.append(",").append("'<span id=\"expj-AA0180020-AA0180020view4-To_EFF_PHASE_OUT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0180020-AA0180020view4-To_EFF_PHASE_OUT_DATE\" data-name=\"To_EFF_PHASE_OUT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0180020Struct.getTo_EFF_PHASE_OUT_DATE())).append("</span>'");
 AA0180020view4_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0180020StructLength) {
   AA0180020view4_DB.append(",");
  }
 }
 aAA0180020Struct = structBackup;
 viewIdList.add(AA0180020view4_Id);
 viewSelectList.add(AA0180020view4_select);
 viewResizeList.add(AA0180020view4_resize);
 viewScrollList.add(AA0180020view4_scroll);
 viewHeaderDataList.add(AA0180020view4_HB);
 viewBodyDataList.add(AA0180020view4_DB);
%>
 <%
                  aAA0180020Control.setList(listBackup);
                %>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="float:left;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field two-view-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area for-two-button" style="width:315px;height:32px;"><script class="expj-script-AA0180020-AA0180020button2">
expj.AA0180020.AA0180020button2 = {};
expj.AA0180020.AA0180020button2.executeAllOnDecision = function () {
  console.log('execute AA0180020button2.onDecision');
};
expj.AA0180020.AA0180020button2.executeOnLoad = function () {
  expj.AA0180020.AA0180020button2.executePScriptOnLoad();
};

expj.AA0180020.AA0180020button2.executePScriptOnLoad = function () {
  console.log('execute AA0180020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0180020-AA0180020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0180020-AA0180020button2-Update">
expj.AA0180020.AA0180020button2.Update = {};
// script1="onClick;0;CHK;_AA0180020form1/FrUp_ITEM_CD[eq]_AA0180020form1/ToUp_ITEM_CD@#AA00051"
expj.AA0180020.AA0180020button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020button2', '_AA0180020form1/FrUp_ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0180020', 'AA0180020button2', '_AA0180020form1/ToUp_ITEM_CD'))) {
expj.common.pscript.addErrorMessage('AA0180020', 'AA0180020button2', 'AA00051');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0180020form1/*,_AA0180020view3/+@AA0180020Servlet,,$ZZ07003"
expj.AA0180020.AA0180020button2.Update.onClick1 = function () {
  console.log('Update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180020', 'AA0180020button2', '_AA0180020form1/*,_AA0180020view3/+', 'AA0180020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180020', response);
expj.common.updateBusinessScreenTab('AA0180020', contents);
};
expj.common.pscript.callConfirm('AA0180020', 'AA0180020button2', 'ZZ07003', okEvent);
};
expj.AA0180020.AA0180020button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180020.AA0180020button2.Update['onClick' + i])) {
        expj.AA0180020.AA0180020button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AA0180020.AA0180020button2.Update.executeAllOnDecision = function () {
};
expj.AA0180020.AA0180020button2.Update.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180020', 'AA0180020button2', 'Update', this, 'Button');
    }
  });
  expj.AA0180020.AA0180020button2.Update.executePScriptOnLoad();
};

expj.AA0180020.AA0180020button2.Update.executePScriptOnLoad = function () {
  console.log('execute AA0180020button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180020-AA0180020button2-Update" name="Update" class="AA0180020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- �X�V�{�^�� --></div><!--/td-->
<script class="expj-script-AA0180020-AA0180020button2-CheckAll">
expj.AA0180020.AA0180020button2.CheckAll = {};
// script1="onClick;0;DGSALL;AA0180020view3"
expj.AA0180020.AA0180020button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('AA0180020', 'AA0180020view3');
};
expj.AA0180020.AA0180020button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180020.AA0180020button2.CheckAll['onClick' + i])) {
        expj.AA0180020.AA0180020button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.AA0180020.AA0180020button2.CheckAll.executeAllOnDecision = function () {
};
expj.AA0180020.AA0180020button2.CheckAll.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180020', 'AA0180020button2', 'CheckAll', this, 'Button');
    }
  });
  expj.AA0180020.AA0180020button2.CheckAll.executePScriptOnLoad();
};

expj.AA0180020.AA0180020button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute AA0180020button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180020-AA0180020button2-CheckAll" name="CheckAll" class="AA0180020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- �S�I���{�^�� --></div><!--/td-->
<script class="expj-script-AA0180020-AA0180020button2-CheckClear">
expj.AA0180020.AA0180020button2.CheckClear = {};
// script1="onClick;0;DGSCANCEL;AA0180020view3"
expj.AA0180020.AA0180020button2.CheckClear.onClick0 = function () {
  console.log('CheckClear script1');
expj.common.pscript.unselectVIEWAllRow('AA0180020', 'AA0180020view3');
};
expj.AA0180020.AA0180020button2.CheckClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180020.AA0180020button2.CheckClear['onClick' + i])) {
        expj.AA0180020.AA0180020button2.CheckClear['onClick' + i]();
      }
    }
  }
};
expj.AA0180020.AA0180020button2.CheckClear.executeAllOnDecision = function () {
};
expj.AA0180020.AA0180020button2.CheckClear.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020button2-CheckClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180020', 'AA0180020button2', 'CheckClear', this, 'Button');
    }
  });
  expj.AA0180020.AA0180020button2.CheckClear.executePScriptOnLoad();
};

expj.AA0180020.AA0180020button2.CheckClear.executePScriptOnLoad = function () {
  console.log('execute AA0180020button2/CheckClear.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020button2-CheckClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180020-AA0180020button2-CheckClear" name="CheckClear" class="AA0180020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- �S�����{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(50vw - 103px - 315px);height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell widthLinePartition widthResizeLinePartition" style="height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area for-two-button" style="width:px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame17 button-area-right" style="width:60px;height:32px;"></div><!--/td-->
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
<span class="version">AA0180020 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0180020-AA0180020button0">
expj.AA0180020.AA0180020button0 = {};
expj.AA0180020.AA0180020button0.executeAllOnDecision = function () {
  console.log('execute AA0180020button0.onDecision');
};
expj.AA0180020.AA0180020button0.executeOnLoad = function () {
  expj.AA0180020.AA0180020button0.executePScriptOnLoad();
};

expj.AA0180020.AA0180020button0.executePScriptOnLoad = function () {
  console.log('execute AA0180020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0180020-AA0180020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0180020-AA0180020button0-Clear">
expj.AA0180020.AA0180020button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0180020form1/*@AA0180020Servlet,,$ZZ07008"
expj.AA0180020.AA0180020button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180020', 'AA0180020button0', '_AA0180020form1/*', 'AA0180020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180020', response);
expj.common.updateBusinessScreenTab('AA0180020', contents);
};
expj.common.pscript.callConfirm('AA0180020', 'AA0180020button0', 'ZZ07008', okEvent);
};
expj.AA0180020.AA0180020button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180020.AA0180020button0.Clear['onClick' + i])) {
        expj.AA0180020.AA0180020button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AA0180020.AA0180020button0.Clear.executeAllOnDecision = function () {
};
expj.AA0180020.AA0180020button0.Clear.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180020', 'AA0180020button0', 'Clear', this, 'Button');
    }
  });
  expj.AA0180020.AA0180020button0.Clear.executePScriptOnLoad();
};

expj.AA0180020.AA0180020button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AA0180020button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180020-AA0180020button0-Clear" name="Clear" class="AA0180020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- �N���A�{�^�� --></div><!--/td-->
<script class="expj-script-AA0180020-AA0180020button0-Close">
expj.AA0180020.AA0180020button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AA0180020.AA0180020button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AA0180020');
};
expj.AA0180020.AA0180020button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180020.AA0180020button0.Close['onClick' + i])) {
        expj.AA0180020.AA0180020button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0180020.AA0180020button0.Close.executeAllOnDecision = function () {
};
expj.AA0180020.AA0180020button0.Close.executeOnLoad = function () {
  $('#expj-AA0180020-AA0180020button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180020', 'AA0180020button0', 'Close', this, 'Button');
    }
  });
  expj.AA0180020.AA0180020button0.Close.executePScriptOnLoad();
};

expj.AA0180020.AA0180020button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0180020button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0180020-AA0180020button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180020-AA0180020button0-Close" name="Close" class="AA0180020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- ����{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0180020 (END)-->
<%
  MessageStruct msgStruct = aAA0180020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AA0180020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0180020)) {
  expj.common.treeInstanceMap.AA0180020 = {};
}
expj.common.treeInstanceMap.AA0180020.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AA0180020.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AA0180020.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AA0180020.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
expj.common.treeInstanceMap.AA0180020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0180020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0180020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0180020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0180020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0180020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js�錾
 if (detailId != null) {
%>
<script class="expj-script-AA0180020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0180020)) {
  expj.common.detailDialogMap.AA0180020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0180020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0180020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0180020.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0180020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0180020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0180020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0180020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0180020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0180020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0180020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0180020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AA0180020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0180020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
  expj.common.detailDialogMap.AA0180020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0180020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0180020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0180020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0180020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0180020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS�錾(END)

//VIEW JS�錾
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-AA0180020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0180020)) {
  expj.common.viewInstanceMap.AA0180020 = {};
}
expj.common.viewInstanceMap.AA0180020.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0180020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0180020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0180020.<%=viewId %>.init = function () {
  // DataGrid(VIEW)�̃{�f�B�f�[�^
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)�̃w�b�_�[�f�[�^
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
    expj.AA0180020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0180020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0180020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0180020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0180020_init">
/**
 * AA0180020�p�̃��[�h�������������֐�
 */
expj.AA0180020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0180020');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AA0180020');
  //��DataGridTable�ɓ��I�����ݒ�
  expj.common.setExpjDynamicHeight('AA0180020');
  expj.common.calendarInstanceMap.AA0180020 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AA0180020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AA0180020.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0180020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0180020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0180020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0180020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0180020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0180020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0180020-<%=detailId %>');
<%
 }
%>
  try{expj.AA0180020.AA0180020form1.FrUp_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.h_FrUp_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.PeekerFrUpItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.FrUp_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.ToUp_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.h_ToUp_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.PeekerToUpItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.ToUp_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.TargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.CalendarTargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.h_TargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.DEVELOP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.h_DEVELOP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020button1.Select.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020view3.h_Fr_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020button2.Update.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020button2.CheckClear.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020form1.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020button1.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020view1.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020view2.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020view3.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020view4.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020button2.executeOnLoad();}catch(e){};
  try{expj.AA0180020.AA0180020button0.executeOnLoad();}catch(e){};
  // �R���\�[���o��
  expj.AA0180020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0180020', 'AA0180020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0180020');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AA0180020-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AA0180020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AA0180020', '<%=request.getContextPath() %>');
};

/**
 * AA0180020�̑S��onDecision����
 */
expj.AA0180020.executeAllOnDecision = function () {
  expj.AA0180020.AA0180020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0180020_console">
expj.AA0180020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>