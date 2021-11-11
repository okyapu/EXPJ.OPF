<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:04:18 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0060\AE0060030.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0060.*" %>
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
<jsp:useBean id="aAE0060030Control" class="com.nec.jp.orteus.metamorBase.AE0060.AE0060030Control" scope="request"/>
<jsp:useBean id="aAE0060030Struct" class="com.nec.jp.orteus.metamorBase.AE0060.AE0060030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

検査実績入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/jsp/AE0060030.jsp,v $
$Author: geng-jia $ 
$Revision: 1.40 $ $Date: 2017/02/22 02:05:16 $
********************************************************* --%>
<html>
<head>
<title>検査実績入力</title>
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
<script class="expj-script-AE0060030_init">
  // AE0060030名前空間
  expj.AE0060030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0060030" data-screen="AE0060030" data-newdata="<%=aAE0060030Control.isNewData() %>">
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
              <script class="expj-script-AE0060030-AE0060030form1">
expj.AE0060030.AE0060030form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AE0060030.AE0060030form1.onLoad0 = function () {
  console.log('AE0060030form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0060030.AE0060030form1.onDecision0 = function () {
  console.log('AE0060030form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0060030', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0060030button1/Select"
expj.AE0060030.AE0060030form1.child0 = function () {
  console.log('AE0060030form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060030', 'AE0060030form1', '_AE0060030button1/Select');
};
// script4="child;1;MASK;_AE0060030button1/Select"
expj.AE0060030.AE0060030form1.child1 = function () {
  console.log('AE0060030form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0060030', 'AE0060030form1', '_AE0060030button1/Select');
};
// script5="onDecision;1;CHK;_AE0060030form2/ACPT_STS_TYP[neq]2[and]_PUCH_ODR_CD[eq]_h_PUCH_ODR_CD[and]_ACPT_NO[eq]_h_ACPT_NO[and]?AE0060030form1/*[eq]NORMAL@*2,*4"
expj.AE0060030.AE0060030form1.onDecision1 = function () {
  console.log('AE0060030form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_AE0060030form2/ACPT_STS_TYP'), '[neq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_PUCH_ODR_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_h_PUCH_ODR_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_ACPT_NO'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_h_ACPT_NO')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '?AE0060030form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHKRQ;A,B@*3,*4"
expj.AE0060030.AE0060030form1.child2 = function () {
  console.log('AE0060030form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AE0060030', 'A') && expj.common.pscript.satisfiedRequiredComponent('AE0060030', 'B')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AE0060030button2/Update"
expj.AE0060030.AE0060030form1.child3 = function () {
  console.log('AE0060030form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060030', 'AE0060030form1', '_AE0060030button2/Update');
};
// script8="child;4;MASK;_AE0060030button2/Update"
expj.AE0060030.AE0060030form1.child4 = function () {
  console.log('AE0060030form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AE0060030', 'AE0060030form1', '_AE0060030button2/Update');
};
// script9="onDecision;2;CHK;_AE0060030form2/ACPT_STS_TYP[eq]2[and]_PUCH_ODR_CD[eq]_h_PUCH_ODR_CD[and]_ACPT_NO[eq]_h_ACPT_NO[and]?AE0060030form1/*[eq]NORMAL@*5,*6"
expj.AE0060030.AE0060030form1.onDecision2 = function () {
  console.log('AE0060030form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_AE0060030form2/ACPT_STS_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_PUCH_ODR_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_h_PUCH_ODR_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_ACPT_NO'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_h_ACPT_NO')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '?AE0060030form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;UNMASK;_AE0060030button0/CancelComplete"
expj.AE0060030.AE0060030form1.child5 = function () {
  console.log('AE0060030form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060030', 'AE0060030form1', '_AE0060030button0/CancelComplete');
};
// script11="child;6;MASK;_AE0060030button0/CancelComplete"
expj.AE0060030.AE0060030form1.child6 = function () {
  console.log('AE0060030form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AE0060030', 'AE0060030form1', '_AE0060030button0/CancelComplete');
};
expj.AE0060030.AE0060030form1.executeAllOnDecision = function () {
  console.log('execute AE0060030form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030form1['onDecision' + i])) {
        expj.AE0060030.AE0060030form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0060030.AE0060030form1.executeOnLoad = function () {
  expj.AE0060030.AE0060030form1.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0060030.AE0060030form1['onLoad' + i])) {
      expj.AE0060030.AE0060030form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0060030-AE0060030form1" action="AE0060030Servlet" name="AE0060030form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0060030Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form1-PUCH_ODR_CD">
expj.AE0060030.AE0060030form1.PUCH_ODR_CD = {};
expj.AE0060030.AE0060030form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0060030form1/PUCH_ODR_CD.onDecision');
  expj.AE0060030.AE0060030form1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0060030.AE0060030form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0060030-focus-move  required-value expj-AE0060030-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form1-h_PUCH_ODR_CD" name="h_PUCH_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.geth_PUCH_ODR_CD()) %>">
<script class="expj-script-AE0060030-AE0060030form1-h_PUCH_ODR_CD">
expj.AE0060030.AE0060030form1.h_PUCH_ODR_CD = {};
expj.AE0060030.AE0060030form1.h_PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0060030form1/h_PUCH_ODR_CD.onDecision');
  expj.AE0060030.AE0060030form1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form1.h_PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form1-h_PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form1', 'h_PUCH_ODR_CD', this);
  });
  expj.AE0060030.AE0060030form1.h_PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.h_PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1/h_PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form1-h_PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AE0060030-AE0060030form1-PeekerPuchOdrCd">
expj.AE0060030.AE0060030form1.PeekerPuchOdrCd = {};
// script1="onClick;0;PEEKER;_AE0060030form1/PUCH_ODR_CD:_AE0060030form1/ACPT_NO@<%=contextNo%>"
expj.AE0060030.AE0060030form1.PeekerPuchOdrCd.onClick0 = function () {
  console.log('PeekerPuchOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0060030';
var parameterValues = 'PeekerPuchOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AE0060030', 'PeekerPuchOdrCd', 'SQLPARAM_1', '<%=aAE0060030Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form1', '_PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_13%&%';
parameterValues += 'TARGET_FIELD%=%_AE0060030form1/PUCH_ODR_CD:_AE0060030form1/ACPT_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0060030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0060030.AE0060030form1.PeekerPuchOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030form1.PeekerPuchOdrCd['onClick' + i])) {
        expj.AE0060030.AE0060030form1.PeekerPuchOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AE0060030.AE0060030form1.PeekerPuchOdrCd.executeAllOnDecision = function () {
};
expj.AE0060030.AE0060030form1.PeekerPuchOdrCd.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form1-PeekerPuchOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060030', 'AE0060030form1', 'PeekerPuchOdrCd', this, 'Button');
    }
  });
  expj.AE0060030.AE0060030form1.PeekerPuchOdrCd.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.PeekerPuchOdrCd.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1/PeekerPuchOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form1-PeekerPuchOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060030-AE0060030form1-PeekerPuchOdrCd" class="AE0060030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form1-ACPT_MODIFY_COUNT" name="ACPT_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getACPT_MODIFY_COUNT()) %>">
<script class="expj-script-AE0060030-AE0060030form1-ACPT_MODIFY_COUNT">
expj.AE0060030.AE0060030form1.ACPT_MODIFY_COUNT = {};
expj.AE0060030.AE0060030form1.ACPT_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AE0060030form1/ACPT_MODIFY_COUNT.onDecision');
  expj.AE0060030.AE0060030form1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form1.ACPT_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form1-ACPT_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form1', 'ACPT_MODIFY_COUNT', this);
  });
  expj.AE0060030.AE0060030form1.ACPT_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.ACPT_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1/ACPT_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form1-ACPT_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACPT_NO",rb)%></span><!-- 受入回数 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form1-ACPT_NO">
expj.AE0060030.AE0060030form1.ACPT_NO = {};
expj.AE0060030.AE0060030form1.ACPT_NO.executeAllOnDecision = function () {
  console.log('execute AE0060030form1/ACPT_NO.onDecision');
  expj.AE0060030.AE0060030form1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form1.ACPT_NO.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form1-ACPT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form1', 'ACPT_NO', this);
  });
  expj.AE0060030.AE0060030form1.ACPT_NO.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.ACPT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1/ACPT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form1-ACPT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form1-ACPT_NO" name="ACPT_NO" class="AE0060030-focus-move  required-value expj-AE0060030-required-A" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_P;6" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getACPT_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form1-h_ACPT_NO" name="h_ACPT_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.geth_ACPT_NO()) %>">
<script class="expj-script-AE0060030-AE0060030form1-h_ACPT_NO">
expj.AE0060030.AE0060030form1.h_ACPT_NO = {};
expj.AE0060030.AE0060030form1.h_ACPT_NO.executeAllOnDecision = function () {
  console.log('execute AE0060030form1/h_ACPT_NO.onDecision');
  expj.AE0060030.AE0060030form1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form1.h_ACPT_NO.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form1-h_ACPT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form1', 'h_ACPT_NO', this);
  });
  expj.AE0060030.AE0060030form1.h_ACPT_NO.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.h_ACPT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1/h_ACPT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form1-h_ACPT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form1-THIS_MONTH" name="THIS_MONTH" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getTHIS_MONTH()) %>">
<script class="expj-script-AE0060030-AE0060030form1-THIS_MONTH">
expj.AE0060030.AE0060030form1.THIS_MONTH = {};
expj.AE0060030.AE0060030form1.THIS_MONTH.executeAllOnDecision = function () {
  console.log('execute AE0060030form1/THIS_MONTH.onDecision');
  expj.AE0060030.AE0060030form1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form1.THIS_MONTH.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form1-THIS_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form1', 'THIS_MONTH', this);
  });
  expj.AE0060030.AE0060030form1.THIS_MONTH.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.THIS_MONTH.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1/THIS_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form1-THIS_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form1-INSTALL_FLG" name="INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getINSTALL_FLG()) %>">
<script class="expj-script-AE0060030-AE0060030form1-INSTALL_FLG">
expj.AE0060030.AE0060030form1.INSTALL_FLG = {};
expj.AE0060030.AE0060030form1.INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute AE0060030form1/INSTALL_FLG.onDecision');
  expj.AE0060030.AE0060030form1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form1.INSTALL_FLG.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form1-INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form1', 'INSTALL_FLG', this);
  });
  expj.AE0060030.AE0060030form1.INSTALL_FLG.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1/INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form1-INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form1-INSPC_MODIFY_COUNT" name="INSPC_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getINSPC_MODIFY_COUNT()) %>">
<script class="expj-script-AE0060030-AE0060030form1-INSPC_MODIFY_COUNT">
expj.AE0060030.AE0060030form1.INSPC_MODIFY_COUNT = {};
expj.AE0060030.AE0060030form1.INSPC_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AE0060030form1/INSPC_MODIFY_COUNT.onDecision');
  expj.AE0060030.AE0060030form1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form1.INSPC_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form1-INSPC_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form1', 'INSPC_MODIFY_COUNT', this);
  });
  expj.AE0060030.AE0060030form1.INSPC_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.INSPC_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1/INSPC_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form1-INSPC_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form1-PUCH_ODR_MODIFY_COUNT" name="PUCH_ODR_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getPUCH_ODR_MODIFY_COUNT()) %>">
<script class="expj-script-AE0060030-AE0060030form1-PUCH_ODR_MODIFY_COUNT">
expj.AE0060030.AE0060030form1.PUCH_ODR_MODIFY_COUNT = {};
expj.AE0060030.AE0060030form1.PUCH_ODR_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AE0060030form1/PUCH_ODR_MODIFY_COUNT.onDecision');
  expj.AE0060030.AE0060030form1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form1.PUCH_ODR_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form1-PUCH_ODR_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form1', 'PUCH_ODR_MODIFY_COUNT', this);
  });
  expj.AE0060030.AE0060030form1.PUCH_ODR_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form1.PUCH_ODR_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AE0060030form1/PUCH_ODR_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form1-PUCH_ODR_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0060030-AE0060030button1">
expj.AE0060030.AE0060030button1 = {};
expj.AE0060030.AE0060030button1.executeAllOnDecision = function () {
  console.log('execute AE0060030button1.onDecision');
};
expj.AE0060030.AE0060030button1.executeOnLoad = function () {
  expj.AE0060030.AE0060030button1.executePScriptOnLoad();
};

expj.AE0060030.AE0060030button1.executePScriptOnLoad = function () {
  console.log('execute AE0060030button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060030-AE0060030button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060030-AE0060030button1-Detail">
expj.AE0060030.AE0060030button1.Detail = {};
// script1="onClick;0;FSHOW;AE0060030float1"
expj.AE0060030.AE0060030button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AE0060030', 'AE0060030float1', '');
};
expj.AE0060030.AE0060030button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030button1.Detail['onClick' + i])) {
        expj.AE0060030.AE0060030button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AE0060030.AE0060030button1.Detail.executeAllOnDecision = function () {
};
expj.AE0060030.AE0060030button1.Detail.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060030', 'AE0060030button1', 'Detail', this, 'Button');
    }
  });
  expj.AE0060030.AE0060030button1.Detail.executePScriptOnLoad();
};

expj.AE0060030.AE0060030button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AE0060030button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060030-AE0060030button1-Detail" name="Detail" class="AE0060030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030button1-Select">
expj.AE0060030.AE0060030button1.Select = {};
// script1="onClick;0;CHK;_AE0060030form1/ACPT_NO[lte]0@#AE05021"
expj.AE0060030.AE0060030button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button1', '_AE0060030form1/ACPT_NO')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0060030', 'AE0060030button1', 'AE05021');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060030form1/*@AE0060030Servlet"
expj.AE0060030.AE0060030button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060030', 'AE0060030button1', '_AE0060030form1/*', 'AE0060030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060030', response);
expj.common.updateBusinessScreenTab('AE0060030', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0060030.AE0060030button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030button1.Select['onClick' + i])) {
        expj.AE0060030.AE0060030button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0060030.AE0060030button1.Select.executeAllOnDecision = function () {
};
expj.AE0060030.AE0060030button1.Select.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060030', 'AE0060030button1', 'Select', this, 'Button');
    }
  });
  expj.AE0060030.AE0060030button1.Select.executePScriptOnLoad();
};

expj.AE0060030.AE0060030button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0060030button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060030-AE0060030button1-Select" name="Select" class="AE0060030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0060030-AE0060030form2">
expj.AE0060030.AE0060030form2 = {};
expj.AE0060030.AE0060030form2.executeAllOnDecision = function () {
  console.log('execute AE0060030form2.onDecision');
};
expj.AE0060030.AE0060030form2.executeOnLoad = function () {
  expj.AE0060030.AE0060030form2.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0060030-AE0060030form2" action="AE0060030Servlet" name="AE0060030form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:211px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:211px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-ITEM_CD_M">
expj.AE0060030.AE0060030form2.ITEM_CD_M = {};
expj.AE0060030.AE0060030form2.ITEM_CD_M.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/ITEM_CD_M.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.ITEM_CD_M.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-ITEM_CD_M').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'ITEM_CD_M', this);
  });
  expj.AE0060030.AE0060030form2.ITEM_CD_M.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.ITEM_CD_M.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/ITEM_CD_M.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-ITEM_CD_M');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-ITEM_CD_M" name="ITEM_CD_M" class="AE0060030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getITEM_CD_M()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-ITEM_NAME_M">
expj.AE0060030.AE0060030form2.ITEM_NAME_M = {};
expj.AE0060030.AE0060030form2.ITEM_NAME_M.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/ITEM_NAME_M.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.ITEM_NAME_M.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-ITEM_NAME_M').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'ITEM_NAME_M', this);
  });
  expj.AE0060030.AE0060030form2.ITEM_NAME_M.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.ITEM_NAME_M.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/ITEM_NAME_M.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-ITEM_NAME_M');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-ITEM_NAME_M" name="ITEM_NAME_M" class="AE0060030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getITEM_NAME_M()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_QTY_2",rb)%></span><!-- 受入数 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-ACPT_QTY">
expj.AE0060030.AE0060030form2.ACPT_QTY = {};
expj.AE0060030.AE0060030form2.ACPT_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/ACPT_QTY.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.ACPT_QTY.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-ACPT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'ACPT_QTY', this);
  });
  expj.AE0060030.AE0060030form2.ACPT_QTY.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.ACPT_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/ACPT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-ACPT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-ACPT_QTY" name="ACPT_QTY" class="AE0060030-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAE0060030Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getACPT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-d2_STOCK_UNIT">
expj.AE0060030.AE0060030form2.d2_STOCK_UNIT = {};
expj.AE0060030.AE0060030form2.d2_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/d2_STOCK_UNIT.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.d2_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-d2_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'd2_STOCK_UNIT', this);
  });
  expj.AE0060030.AE0060030form2.d2_STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.d2_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/d2_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-d2_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-d2_STOCK_UNIT" name="d2_STOCK_UNIT" class="AE0060030-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_STS_TYP_2",rb)%></span><!-- 検査完了区分 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-ACPT_STS_TYP_DN">
expj.AE0060030.AE0060030form2.ACPT_STS_TYP_DN = {};
expj.AE0060030.AE0060030form2.ACPT_STS_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/ACPT_STS_TYP_DN.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.ACPT_STS_TYP_DN.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-ACPT_STS_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'ACPT_STS_TYP_DN', this);
  });
  expj.AE0060030.AE0060030form2.ACPT_STS_TYP_DN.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.ACPT_STS_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/ACPT_STS_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-ACPT_STS_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-ACPT_STS_TYP_DN" name="ACPT_STS_TYP_DN" class="AE0060030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getACPT_STS_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form2-ACPT_STS_TYP" name="ACPT_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getACPT_STS_TYP()) %>">
<script class="expj-script-AE0060030-AE0060030form2-ACPT_STS_TYP">
expj.AE0060030.AE0060030form2.ACPT_STS_TYP = {};
expj.AE0060030.AE0060030form2.ACPT_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/ACPT_STS_TYP.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.ACPT_STS_TYP.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-ACPT_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'ACPT_STS_TYP', this);
  });
  expj.AE0060030.AE0060030form2.ACPT_STS_TYP.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.ACPT_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/ACPT_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-ACPT_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_QTY_4",rb)%></span><!-- 検査済数 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-INSPECTED_QTY">
expj.AE0060030.AE0060030form2.INSPECTED_QTY = {};
// script1="onDecision;0;SET;_DEFECTED_QTY=[{_INSPECTED_QTY}-{_ACCEPTED_QTY}]"
expj.AE0060030.AE0060030form2.INSPECTED_QTY.onDecision0 = function () {
  console.log('INSPECTED_QTY script1');
expj.common.pscript.setReferenceComponentValue('AE0060030', 'AE0060030form2', '_DEFECTED_QTY', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form2', '_INSPECTED_QTY') + '-' + expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form2', '_ACCEPTED_QTY')));
};
expj.AE0060030.AE0060030form2.INSPECTED_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/INSPECTED_QTY.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030form2.INSPECTED_QTY['onDecision' + i])) {
        expj.AE0060030.AE0060030form2.INSPECTED_QTY['onDecision' + i]();
      }
    }
  }
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.INSPECTED_QTY.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-INSPECTED_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'INSPECTED_QTY', this);
  });
  expj.AE0060030.AE0060030form2.INSPECTED_QTY.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.INSPECTED_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/INSPECTED_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-INSPECTED_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-INSPECTED_QTY" name="INSPECTED_QTY" class="AE0060030-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAE0060030Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getINSPECTED_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-d3_STOCK_UNIT">
expj.AE0060030.AE0060030form2.d3_STOCK_UNIT = {};
expj.AE0060030.AE0060030form2.d3_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/d3_STOCK_UNIT.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.d3_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-d3_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'd3_STOCK_UNIT', this);
  });
  expj.AE0060030.AE0060030form2.d3_STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.d3_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/d3_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-d3_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-d3_STOCK_UNIT" name="d3_STOCK_UNIT" class="AE0060030-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form2-h_INSPECTED_QTY" name="h_INSPECTED_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.geth_INSPECTED_QTY()) %>">
<script class="expj-script-AE0060030-AE0060030form2-h_INSPECTED_QTY">
expj.AE0060030.AE0060030form2.h_INSPECTED_QTY = {};
expj.AE0060030.AE0060030form2.h_INSPECTED_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/h_INSPECTED_QTY.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.h_INSPECTED_QTY.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-h_INSPECTED_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'h_INSPECTED_QTY', this);
  });
  expj.AE0060030.AE0060030form2.h_INSPECTED_QTY.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.h_INSPECTED_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/h_INSPECTED_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-h_INSPECTED_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-c_COMPLETE">
expj.AE0060030.AE0060030form2.c_COMPLETE = {};
expj.AE0060030.AE0060030form2.c_COMPLETE.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/c_COMPLETE.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.c_COMPLETE.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-c_COMPLETE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060030', 'AE0060030form2', 'c_COMPLETE', this, 'CheckBox');
    }
  });
  expj.AE0060030.AE0060030form2.c_COMPLETE.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.c_COMPLETE.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/c_COMPLETE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-c_COMPLETE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_COMPLETE" value="true" <%= ("true".equals(TypeConverter.convert(aAE0060030Struct.getc_COMPLETE())) || "1".equals(TypeConverter.convert(aAE0060030Struct.getc_COMPLETE())))?"checked=\"checked\"":"" %>  class="AE0060030-focus-move" id="expj-AE0060030-AE0060030form2-c_COMPLETE"><label for="expj-AE0060030-AE0060030form2-c_COMPLETE"><%=CoreTools.getRBString("Expj.ACPT_STS_TYP_1",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form2-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-AE0060030-AE0060030form2-BUSINESS_OPR_DATE">
expj.AE0060030.AE0060030form2.BUSINESS_OPR_DATE = {};
expj.AE0060030.AE0060030form2.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/BUSINESS_OPR_DATE.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'BUSINESS_OPR_DATE', this);
  });
  expj.AE0060030.AE0060030form2.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACCEPTED_QTY",rb)%></span><!-- 合格数 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-ACCEPTED_QTY">
expj.AE0060030.AE0060030form2.ACCEPTED_QTY = {};
// script1="onDecision;0;SET;_DEFECTED_QTY=[{_INSPECTED_QTY}-{_ACCEPTED_QTY}]"
expj.AE0060030.AE0060030form2.ACCEPTED_QTY.onDecision0 = function () {
  console.log('ACCEPTED_QTY script1');
expj.common.pscript.setReferenceComponentValue('AE0060030', 'AE0060030form2', '_DEFECTED_QTY', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form2', '_INSPECTED_QTY') + '-' + expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030form2', '_ACCEPTED_QTY')));
};
expj.AE0060030.AE0060030form2.ACCEPTED_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/ACCEPTED_QTY.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030form2.ACCEPTED_QTY['onDecision' + i])) {
        expj.AE0060030.AE0060030form2.ACCEPTED_QTY['onDecision' + i]();
      }
    }
  }
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.ACCEPTED_QTY.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-ACCEPTED_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'ACCEPTED_QTY', this);
  });
  expj.AE0060030.AE0060030form2.ACCEPTED_QTY.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.ACCEPTED_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/ACCEPTED_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-ACCEPTED_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-ACCEPTED_QTY" name="ACCEPTED_QTY" class="AE0060030-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAE0060030Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getACCEPTED_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-d4_STOCK_UNIT">
expj.AE0060030.AE0060030form2.d4_STOCK_UNIT = {};
expj.AE0060030.AE0060030form2.d4_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/d4_STOCK_UNIT.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.d4_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-d4_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'd4_STOCK_UNIT', this);
  });
  expj.AE0060030.AE0060030form2.d4_STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.d4_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/d4_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-d4_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-d4_STOCK_UNIT" name="d4_STOCK_UNIT" class="AE0060030-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEFECT_QTY",rb)%></span><!-- 不良数 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-DEFECTED_QTY">
expj.AE0060030.AE0060030form2.DEFECTED_QTY = {};
expj.AE0060030.AE0060030form2.DEFECTED_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/DEFECTED_QTY.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.DEFECTED_QTY.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-DEFECTED_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'DEFECTED_QTY', this);
  });
  expj.AE0060030.AE0060030form2.DEFECTED_QTY.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.DEFECTED_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/DEFECTED_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-DEFECTED_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-DEFECTED_QTY" name="DEFECTED_QTY" class="AE0060030-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAE0060030Struct.getUNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getDEFECTED_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-d5_STOCK_UNIT">
expj.AE0060030.AE0060030form2.d5_STOCK_UNIT = {};
expj.AE0060030.AE0060030form2.d5_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/d5_STOCK_UNIT.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.d5_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-d5_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'd5_STOCK_UNIT', this);
  });
  expj.AE0060030.AE0060030form2.d5_STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.d5_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/d5_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-d5_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-d5_STOCK_UNIT" name="d5_STOCK_UNIT" class="AE0060030-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form2-ACPT_DATE" name="ACPT_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getACPT_DATE()) %>">
<script class="expj-script-AE0060030-AE0060030form2-ACPT_DATE">
expj.AE0060030.AE0060030form2.ACPT_DATE = {};
expj.AE0060030.AE0060030form2.ACPT_DATE.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/ACPT_DATE.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.ACPT_DATE.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-ACPT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'ACPT_DATE', this);
  });
  expj.AE0060030.AE0060030form2.ACPT_DATE.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.ACPT_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/ACPT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-ACPT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.INSPEC_DATE",rb)%></span><!-- 検査日 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-INSPEC_DATE">
expj.AE0060030.AE0060030form2.INSPEC_DATE = {};
expj.AE0060030.AE0060030form2.INSPEC_DATE.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/INSPEC_DATE.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.INSPEC_DATE.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-INSPEC_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'INSPEC_DATE', this);
  });
  expj.AE0060030.AE0060030form2.INSPEC_DATE.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.INSPEC_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/INSPEC_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-INSPEC_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-INSPEC_DATE" name="INSPEC_DATE" class="AE0060030-focus-move  required-value expj-AE0060030-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getINSPEC_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-CalendarInspecDate">
expj.AE0060030.AE0060030form2.CalendarInspecDate = {};
// script1="onClick;0;CALENDAR;_AE0060030form2/INSPEC_DATE"
expj.AE0060030.AE0060030form2.CalendarInspecDate.onClick0 = function () {
  console.log('CalendarInspecDate script1');
expj.common.pscript.executeCalendar('AE0060030','AE0060030form2','_AE0060030form2/INSPEC_DATE');
};
expj.AE0060030.AE0060030form2.CalendarInspecDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030form2.CalendarInspecDate['onClick' + i])) {
        expj.AE0060030.AE0060030form2.CalendarInspecDate['onClick' + i]();
      }
    }
  }
};
expj.AE0060030.AE0060030form2.CalendarInspecDate.executeAllOnDecision = function () {
};
expj.AE0060030.AE0060030form2.CalendarInspecDate.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-CalendarInspecDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060030', 'AE0060030form2', 'CalendarInspecDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0060030','AE0060030form2','_AE0060030form2/INSPEC_DATE');
  expj.AE0060030.AE0060030form2.CalendarInspecDate.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.CalendarInspecDate.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/CalendarInspecDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-CalendarInspecDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060030-AE0060030form2-CalendarInspecDate" class="AE0060030-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-AE0060030-AE0060030form2-h_INSPEC_DATE" name="h_INSPEC_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060030Struct.geth_INSPEC_DATE()) %>">
<script class="expj-script-AE0060030-AE0060030form2-h_INSPEC_DATE">
expj.AE0060030.AE0060030form2.h_INSPEC_DATE = {};
expj.AE0060030.AE0060030form2.h_INSPEC_DATE.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/h_INSPEC_DATE.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.h_INSPEC_DATE.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-h_INSPEC_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'h_INSPEC_DATE', this);
  });
  expj.AE0060030.AE0060030form2.h_INSPEC_DATE.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.h_INSPEC_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/h_INSPEC_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-h_INSPEC_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EXCH_RATE",rb)%></span><!-- 為替レート --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-EXCH_RATE">
expj.AE0060030.AE0060030form2.EXCH_RATE = {};
expj.AE0060030.AE0060030form2.EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/EXCH_RATE.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.EXCH_RATE.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'EXCH_RATE', this);
  });
  expj.AE0060030.AE0060030form2.EXCH_RATE.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-EXCH_RATE" name="EXCH_RATE" class="AE0060030-focus-move  required-value expj-AE0060030-required-B" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.2;FLOOR;6" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getEXCH_RATE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_LOT_NO",rb)%></span><!-- メーカロット番号 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-VEND_LOT_NO">
expj.AE0060030.AE0060030form2.VEND_LOT_NO = {};
expj.AE0060030.AE0060030form2.VEND_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/VEND_LOT_NO.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.VEND_LOT_NO.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-VEND_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'VEND_LOT_NO', this);
  });
  expj.AE0060030.AE0060030form2.VEND_LOT_NO.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.VEND_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/VEND_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-VEND_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-VEND_LOT_NO" name="VEND_LOT_NO" class="AE0060030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getVEND_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-LOT_NO">
expj.AE0060030.AE0060030form2.LOT_NO = {};
expj.AE0060030.AE0060030form2.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/LOT_NO.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.LOT_NO.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'LOT_NO', this);
  });
  expj.AE0060030.AE0060030form2.LOT_NO.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-LOT_NO" name="LOT_NO" class="AE0060030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getLOT_NO()) %>" maxlength="25" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INSPEC_RSLT_COMMENT_1",rb)%></span><!-- 検査備考 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-INSPEC_RSLT_COMMENT">
expj.AE0060030.AE0060030form2.INSPEC_RSLT_COMMENT = {};
expj.AE0060030.AE0060030form2.INSPEC_RSLT_COMMENT.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/INSPEC_RSLT_COMMENT.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.INSPEC_RSLT_COMMENT.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-INSPEC_RSLT_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'INSPEC_RSLT_COMMENT', this);
  });
  expj.AE0060030.AE0060030form2.INSPEC_RSLT_COMMENT.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.INSPEC_RSLT_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/INSPEC_RSLT_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-INSPEC_RSLT_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-INSPEC_RSLT_COMMENT" name="INSPEC_RSLT_COMMENT" class="AE0060030-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getINSPEC_RSLT_COMMENT()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD_2",rb)%></span><!-- 受入場所 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-WH_CD">
expj.AE0060030.AE0060030form2.WH_CD = {};
expj.AE0060030.AE0060030form2.WH_CD.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/WH_CD.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.WH_CD.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'WH_CD', this);
  });
  expj.AE0060030.AE0060030form2.WH_CD.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-WH_CD" name="WH_CD" class="AE0060030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getWH_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-WH_NAME">
expj.AE0060030.AE0060030form2.WH_NAME = {};
expj.AE0060030.AE0060030form2.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/WH_NAME.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.WH_NAME.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'WH_NAME', this);
  });
  expj.AE0060030.AE0060030form2.WH_NAME.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-WH_NAME" name="WH_NAME" class="AE0060030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INSPC_WH_CD",rb)%></span><!-- 検査待ち保管区 --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-INSPC_WH_CD">
expj.AE0060030.AE0060030form2.INSPC_WH_CD = {};
expj.AE0060030.AE0060030form2.INSPC_WH_CD.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/INSPC_WH_CD.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.INSPC_WH_CD.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-INSPC_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'INSPC_WH_CD', this);
  });
  expj.AE0060030.AE0060030form2.INSPC_WH_CD.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.INSPC_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/INSPC_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-INSPC_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-INSPC_WH_CD" name="INSPC_WH_CD" class="AE0060030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getINSPC_WH_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030form2-INSPC_WH_NAME">
expj.AE0060030.AE0060030form2.INSPC_WH_NAME = {};
expj.AE0060030.AE0060030form2.INSPC_WH_NAME.executeAllOnDecision = function () {
  console.log('execute AE0060030form2/INSPC_WH_NAME.onDecision');
  expj.AE0060030.AE0060030form2.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030form2.INSPC_WH_NAME.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030form2-INSPC_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030form2', 'INSPC_WH_NAME', this);
  });
  expj.AE0060030.AE0060030form2.INSPC_WH_NAME.executePScriptOnLoad();
};

expj.AE0060030.AE0060030form2.INSPC_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0060030form2/INSPC_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030form2-INSPC_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0060030-AE0060030form2-INSPC_WH_NAME" name="INSPC_WH_NAME" class="AE0060030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060030Struct.getINSPC_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style="width:calc(100% - 24px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0060030-AE0060030view1">
expj.AE0060030.AE0060030view1 = {};
expj.AE0060030.AE0060030view1.executeAllOnClick = function () {
};
expj.AE0060030.AE0060030view1.executeAllOnDecision = function () {
  console.log('execute AE0060030view1.onDecision');
};
expj.AE0060030.AE0060030view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0060030view1", "expj.AE0060030.AE0060030view1.executeAllOnClick");
%>
  expj.AE0060030.AE0060030view1.executePScriptOnLoad();
};

expj.AE0060030.AE0060030view1.executePScriptOnLoad = function () {
  console.log('execute AE0060030view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0060030-AE0060030view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0060030view1_Id = "AE0060030view1";
 String AE0060030view1_select = "single";
 String AE0060030view1_sortable = "true";
 String AE0060030view1_resize = "true";
 String AE0060030view1_scroll = "true";
 StringBuffer AE0060030view1_HB = new StringBuffer();
 StringBuffer AE0060030view1_DB = new StringBuffer();
%>
<%
 AE0060030view1_select = "none";
 AE0060030view1_sortable = "true";
 AE0060030view1_resize = "true";
 AE0060030view1_scroll = "true";
%>
<%
 AE0060030view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0060030view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AE0060030-AE0060030view1-l_DEFECT_CAUSE_CD">
expj.AE0060030.AE0060030view1.l_DEFECT_CAUSE_CD = {};
expj.AE0060030.AE0060030view1.l_DEFECT_CAUSE_CD.executeAllOnClick = function () {
};
expj.AE0060030.AE0060030view1.l_DEFECT_CAUSE_CD.executeAllOnDecision = function () {
  console.log('execute AE0060030view1/l_DEFECT_CAUSE_CD.onDecision');
  expj.AE0060030.AE0060030view1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030view1.l_DEFECT_CAUSE_CD.executeOnLoad = function () {
  $('.expj-AE0060030-AE0060030view1-l_DEFECT_CAUSE_CD').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AE0060030', 'AE0060030view1', 'l_DEFECT_CAUSE_CD', this);
  });
  expj.AE0060030.AE0060030view1.l_DEFECT_CAUSE_CD.executePScriptOnLoad();
};

expj.AE0060030.AE0060030view1.l_DEFECT_CAUSE_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060030view1/l_DEFECT_CAUSE_CD.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AE0060030-AE0060030view1-l_DEFECT_INSPC_QTY">
expj.AE0060030.AE0060030view1.l_DEFECT_INSPC_QTY = {};
expj.AE0060030.AE0060030view1.l_DEFECT_INSPC_QTY.executeAllOnClick = function () {
};
expj.AE0060030.AE0060030view1.l_DEFECT_INSPC_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060030view1/l_DEFECT_INSPC_QTY.onDecision');
  expj.AE0060030.AE0060030view1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030view1.l_DEFECT_INSPC_QTY.executeOnLoad = function () {
  $('.expj-AE0060030-AE0060030view1-l_DEFECT_INSPC_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030view1', 'l_DEFECT_INSPC_QTY', this);
  });
  expj.AE0060030.AE0060030view1.l_DEFECT_INSPC_QTY.executePScriptOnLoad();
};

expj.AE0060030.AE0060030view1.l_DEFECT_INSPC_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060030view1/l_DEFECT_INSPC_QTY.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AE0060030-AE0060030view1-l_DEFECT_COMMENT">
expj.AE0060030.AE0060030view1.l_DEFECT_COMMENT = {};
expj.AE0060030.AE0060030view1.l_DEFECT_COMMENT.executeAllOnClick = function () {
};
expj.AE0060030.AE0060030view1.l_DEFECT_COMMENT.executeAllOnDecision = function () {
  console.log('execute AE0060030view1/l_DEFECT_COMMENT.onDecision');
  expj.AE0060030.AE0060030view1.executeAllOnDecision();
  expj.AE0060030.executeAllOnDecision();
};
expj.AE0060030.AE0060030view1.l_DEFECT_COMMENT.executeOnLoad = function () {
  $('.expj-AE0060030-AE0060030view1-l_DEFECT_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060030', 'AE0060030view1', 'l_DEFECT_COMMENT', this);
  });
  expj.AE0060030.AE0060030view1.l_DEFECT_COMMENT.executePScriptOnLoad();
};

expj.AE0060030.AE0060030view1.l_DEFECT_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AE0060030view1/l_DEFECT_COMMENT.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AE0060030view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEFECT_CAUSE_CD",rb))).append("', 'name':'l_DEFECT_CAUSE_CD', 'class':'expj-tooltip expj-view-cell-combobox', 'sortable':").append(AE0060030view1_sortable).append("}").append(",");
AE0060030view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEFECT_INSPC_QTY_2",rb))).append("', 'name':'l_DEFECT_INSPC_QTY', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AE0060030view1_sortable).append("}").append(",");
AE0060030view1_HB.append("{'visible':true, 'type':'string', 'width':'400px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEFECT_COMMENT_1",rb))).append("', 'name':'l_DEFECT_COMMENT', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(AE0060030view1_sortable).append("}").append(",");
%>
<%
 int aAE0060030StructLength = aAE0060030Control.getListsize();
 final AE0060030Struct structBackup = aAE0060030Struct;
 aAE0060030Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0060030StructLength; ++loopCount) {
  if((aAE0060030Struct = (AE0060030Struct) aAE0060030Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0060030Struct", aAE0060030Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0060030view1_DB.append("[");
 AE0060030view1_DB.append(loopCount);
 AE0060030view1_DB.append(",").append("'<select id=\"expj-AE0060030-AE0060030view1-l_DEFECT_CAUSE_CD-").append(loopCount).append("\" class=\"expj-AE0060030-AE0060030view1-l_DEFECT_CAUSE_CD AE0060030-focus-move\" data-name=\"l_DEFECT_CAUSE_CD\" data-view=\"true\">"); for(int i = 0, size = aAE0060030Control.getStruct().getList_l_DEFECT_CAUSE_CD_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAE0060030Control.getStruct().getList_l_DEFECT_CAUSE_CD_name().get(i));    String val = TypeConverter.sanitizer((String)aAE0060030Control.getStruct().getList_l_DEFECT_CAUSE_CD_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAE0060030Struct.getl_DEFECT_CAUSE_CD()))) ? " selected" : "";    AE0060030view1_DB.append("<option value=\"").append(val).append("\"").append( selected ).append(">").append(name).append("</option>");  } AE0060030view1_DB.append("</select>'");
 AE0060030view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AE0060030-AE0060030view1-l_DEFECT_INSPC_QTY-").append(loopCount).append("\" class=\"expj-AE0060030-AE0060030view1-l_DEFECT_INSPC_QTY AE0060030-focus-move\" data-name=\"l_DEFECT_INSPC_QTY\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append(Kind.convertNumeric(structBackup.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAE0060030Struct.getl_DEFECT_INSPC_QTY())).append("\">'");
 AE0060030view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AE0060030-AE0060030view1-l_DEFECT_COMMENT-").append(loopCount).append("\" class=\"expj-AE0060030-AE0060030view1-l_DEFECT_COMMENT AE0060030-focus-move\" data-name=\"l_DEFECT_COMMENT\" data-view=\"true\" maxlength=\"80\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAE0060030Struct.getl_DEFECT_COMMENT())).append("\">'");
 AE0060030view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0060030StructLength) {
   AE0060030view1_DB.append(",");
  }
 }
 aAE0060030Struct = structBackup;
 viewIdList.add(AE0060030view1_Id);
 viewSelectList.add(AE0060030view1_select);
 viewResizeList.add(AE0060030view1_resize);
 viewScrollList.add(AE0060030view1_scroll);
 viewHeaderDataList.add(AE0060030view1_HB);
 viewBodyDataList.add(AE0060030view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:769px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 853px);"><script class="expj-script-AE0060030-AE0060030button2">
expj.AE0060030.AE0060030button2 = {};
expj.AE0060030.AE0060030button2.executeAllOnDecision = function () {
  console.log('execute AE0060030button2.onDecision');
};
expj.AE0060030.AE0060030button2.executeOnLoad = function () {
  expj.AE0060030.AE0060030button2.executePScriptOnLoad();
};

expj.AE0060030.AE0060030button2.executePScriptOnLoad = function () {
  console.log('execute AE0060030button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060030-AE0060030button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060030-AE0060030button2-Update">
expj.AE0060030.AE0060030button2.Update = {};
// script1="onClick;0;CHK;_AE0060030form2/ACPT_QTY[lt]_AE0060030form2/INSPECTED_QTY@#AE05016"
expj.AE0060030.AE0060030button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/ACPT_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/INSPECTED_QTY')))) {
expj.common.pscript.addErrorMessage('AE0060030', 'AE0060030button2', 'AE05016');
}
};
// script2="onClick;1;CHK;_AE0060030form2/INSPECTED_QTY[lt]_AE0060030form2/ACCEPTED_QTY@#AE05015"
expj.AE0060030.AE0060030button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/INSPECTED_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/ACCEPTED_QTY')))) {
expj.common.pscript.addErrorMessage('AE0060030', 'AE0060030button2', 'AE05015');
}
};
// script3="onClick;2;CHK;_AE0060030detail1/UNIT_QTY_TYP[eq]1@*0,*1"
expj.AE0060030.AE0060030button2.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030detail1/UNIT_QTY_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;0;COLCHKT;AE0060030view1:_l_DEFECT_CAUSE_CD[neq]0[and]_l_DEFECT_INSPC_QTY[lte]0@#AE05033"
expj.AE0060030.AE0060030button2.Update.child0 = function () {
  console.log('Update script4');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AE0060030', 'AE0060030view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_DEFECT_CAUSE_CD, '[neq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(cell.l_DEFECT_INSPC_QTY), '[lte]', expj.common.pscript.convertNumber('0'))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('AE0060030', 'AE0060030button2', 'AE05033');
}
};
// script5="child;1;COLCHKT;AE0060030view1:_l_DEFECT_CAUSE_CD[neq]0[and]_l_DEFECT_INSPC_QTY[lte]0@#AE05032"
expj.AE0060030.AE0060030button2.Update.child1 = function () {
  console.log('Update script5');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AE0060030', 'AE0060030view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_DEFECT_CAUSE_CD, '[neq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(cell.l_DEFECT_INSPC_QTY), '[lte]', expj.common.pscript.convertNumber('0'))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('AE0060030', 'AE0060030button2', 'AE05032');
}
};
// script6="onClick;3;COLCHKT;AE0060030view1:_l_DEFECT_CAUSE_CD[eq]0[and]_l_DEFECT_INSPC_QTY[gt]0@#AE05039"
expj.AE0060030.AE0060030button2.Update.onClick3 = function () {
  console.log('Update script6');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AE0060030', 'AE0060030view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_DEFECT_CAUSE_CD, '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(cell.l_DEFECT_INSPC_QTY), '[gt]', expj.common.pscript.convertNumber('0'))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('AE0060030', 'AE0060030button2', 'AE05039');
}
};
// script7="onClick;4;CHK;~COLSUM(_AE0060030view1/l_DEFECT_INSPC_QTY)[gt]_AE0060030form2/DEFECTED_QTY@#AE00175"
expj.AE0060030.AE0060030button2.Update.onClick4 = function () {
  console.log('Update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.COLSUM('AE0060030', 'AE0060030button2', '_AE0060030view1/l_DEFECT_INSPC_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/DEFECTED_QTY')))) {
expj.common.pscript.addErrorMessage('AE0060030', 'AE0060030button2', 'AE00175');
}
};
// script8="onClick;5;CHK;~COLSUM(_AE0060030view1/l_DEFECT_INSPC_QTY)[lt]_AE0060030form2/DEFECTED_QTY@$AE00174"
expj.AE0060030.AE0060030button2.Update.onClick5 = function () {
  console.log('Update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.COLSUM('AE0060030', 'AE0060030button2', '_AE0060030view1/l_DEFECT_INSPC_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/DEFECTED_QTY')))) {
expj.common.pscript.addWarningMessage('AE0060030', 'AE0060030button2', 'AE00174');
}
};
// script9="onClick;6;CHK;_AE0060030form2/BUSINESS_OPR_DATE[lt]_AE0060030form2/INSPEC_DATE@#AE05038"
expj.AE0060030.AE0060030button2.Update.onClick6 = function () {
  console.log('Update script9');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/BUSINESS_OPR_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/INSPEC_DATE')))) {
expj.common.pscript.addErrorMessage('AE0060030', 'AE0060030button2', 'AE05038');
}
};
// script10="onClick;7;CHK;_AE0060030form2/INSPEC_DATE[lt]_AE0060030form2/ACPT_DATE@#AE05077"
expj.AE0060030.AE0060030button2.Update.onClick7 = function () {
  console.log('Update script10');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/INSPEC_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/ACPT_DATE')))) {
expj.common.pscript.addErrorMessage('AE0060030', 'AE0060030button2', 'AE05077');
}
};
// script11="onClick;8;CHK;_AE0060030form2/c_COMPLETE[eq]true[and]_AE0060030form2/INSPECTED_QTY[lt]_AE0060030form2/ACPT_QTY@$AE05046"
expj.AE0060030.AE0060030button2.Update.onClick8 = function () {
  console.log('Update script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/c_COMPLETE'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/INSPECTED_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/ACPT_QTY')))) {
expj.common.pscript.addWarningMessage('AE0060030', 'AE0060030button2', 'AE05046');
}
};
// script12="onClick;9;CHK;_AE0060030form1/INSTALL_FLG[eq]1[and]_AE0060030form2/c_COMPLETE[eq]true[and]_AE0060030form2/INSPECTED_QTY[numneq]_AE0060030form2/ACCEPTED_QTY[and]_AE0060030/INSPECTED_QTY[gte]0@*2"
expj.AE0060030.AE0060030button2.Update.onClick9 = function () {
  console.log('Update script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form1/INSTALL_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/c_COMPLETE'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/INSPECTED_QTY')), '[numneq]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form2/ACCEPTED_QTY'))) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030/INSPECTED_QTY')), '[gte]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script13="child;2;CHK;_AE0060030detail1/SPL_ITEM_TYP[neq]2[and]_AE0060030form1/THIS_MONTH[gt]~TO_YYYY_MM(_AE0060030form2/INSPEC_DATE)@$AE00129"
expj.AE0060030.AE0060030button2.Update.child2 = function () {
  console.log('Update script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030detail1/SPL_ITEM_TYP'), '[neq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button2', '_AE0060030form1/THIS_MONTH')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('AE0060030', 'AE0060030button2', '_AE0060030form2/INSPEC_DATE')))) {
expj.common.pscript.addWarningMessage('AE0060030', 'AE0060030button2', 'AE00129');
}
};
// script14="onClick;10;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060030form1/*,_AE0060030form2/*,_AE0060030view1/*,_AE0060030detail1/*@AE0060030Servlet,,$ZZ07003"
expj.AE0060030.AE0060030button2.Update.onClick10 = function () {
  console.log('Update script14');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060030', 'AE0060030button2', '_AE0060030form1/*,_AE0060030form2/*,_AE0060030view1/*,_AE0060030detail1/*', 'AE0060030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060030', response);
expj.common.updateBusinessScreenTab('AE0060030', contents);
};
expj.common.pscript.callConfirm('AE0060030', 'AE0060030button2', 'ZZ07003', okEvent);
};
expj.AE0060030.AE0060030button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030button2.Update['onClick' + i])) {
        expj.AE0060030.AE0060030button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AE0060030.AE0060030button2.Update.executeAllOnDecision = function () {
};
expj.AE0060030.AE0060030button2.Update.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060030', 'AE0060030button2', 'Update', this, 'Button');
    }
  });
  expj.AE0060030.AE0060030button2.Update.executePScriptOnLoad();
};

expj.AE0060030.AE0060030button2.Update.executePScriptOnLoad = function () {
  console.log('execute AE0060030button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060030-AE0060030button2-Update" name="Update" class="AE0060030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0060030 Revision: 1.15  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AE0060030-AE0060030button0">
expj.AE0060030.AE0060030button0 = {};
expj.AE0060030.AE0060030button0.executeAllOnDecision = function () {
  console.log('execute AE0060030button0.onDecision');
};
expj.AE0060030.AE0060030button0.executeOnLoad = function () {
  expj.AE0060030.AE0060030button0.executePScriptOnLoad();
};

expj.AE0060030.AE0060030button0.executePScriptOnLoad = function () {
  console.log('execute AE0060030button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060030-AE0060030button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060030-AE0060030button0-CancelComplete">
expj.AE0060030.AE0060030button0.CancelComplete = {};
// script1="onClick;0;CHK;_AE0060030form2/ACPT_STS_TYP[neq]2@!AE05010"
expj.AE0060030.AE0060030button0.CancelComplete.onClick0 = function () {
  console.log('CancelComplete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060030', 'AE0060030button0', '_AE0060030form2/ACPT_STS_TYP'), '[neq]', '2')) {
expj.common.pscript.viewErrorMessage('AE0060030', 'AE0060030button0', 'AE05010');
}
};
// script2="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060030form1/*,_AE0060030form2/*,_AE0060030detail1/*@AE0060030Servlet,,$AE05011"
expj.AE0060030.AE0060030button0.CancelComplete.onClick2 = function () {
  console.log('CancelComplete script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060030', 'AE0060030button0', '_AE0060030form1/*,_AE0060030form2/*,_AE0060030detail1/*', 'AE0060030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060030', response);
expj.common.updateBusinessScreenTab('AE0060030', contents);
};
expj.common.pscript.callConfirm('AE0060030', 'AE0060030button0', 'AE05011', okEvent);
};
expj.AE0060030.AE0060030button0.CancelComplete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030button0.CancelComplete['onClick' + i])) {
        expj.AE0060030.AE0060030button0.CancelComplete['onClick' + i]();
      }
    }
  }
};
expj.AE0060030.AE0060030button0.CancelComplete.executeAllOnDecision = function () {
};
expj.AE0060030.AE0060030button0.CancelComplete.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030button0-CancelComplete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060030', 'AE0060030button0', 'CancelComplete', this, 'Button');
    }
  });
  expj.AE0060030.AE0060030button0.CancelComplete.executePScriptOnLoad();
};

expj.AE0060030.AE0060030button0.CancelComplete.executePScriptOnLoad = function () {
  console.log('execute AE0060030button0/CancelComplete.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030button0-CancelComplete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060030-AE0060030button0-CancelComplete" name="CancelComplete" class="AE0060030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelComplete",rb)%></button><!-- 完了解除ボタン --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030button0-Clear">
expj.AE0060030.AE0060030button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0060030Servlet,,$ZZ07008"
expj.AE0060030.AE0060030button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060030', 'AE0060030button0', '', 'AE0060030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060030', response);
expj.common.updateBusinessScreenTab('AE0060030', contents);
};
expj.common.pscript.callConfirm('AE0060030', 'AE0060030button0', 'ZZ07008', okEvent);
};
expj.AE0060030.AE0060030button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030button0.Clear['onClick' + i])) {
        expj.AE0060030.AE0060030button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0060030.AE0060030button0.Clear.executeAllOnDecision = function () {
};
expj.AE0060030.AE0060030button0.Clear.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060030', 'AE0060030button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0060030.AE0060030button0.Clear.executePScriptOnLoad();
};

expj.AE0060030.AE0060030button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0060030button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060030-AE0060030button0-Clear" name="Clear" class="AE0060030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0060030-AE0060030button0-Close">
expj.AE0060030.AE0060030button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0060030.AE0060030button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0060030');
};
expj.AE0060030.AE0060030button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060030.AE0060030button0.Close['onClick' + i])) {
        expj.AE0060030.AE0060030button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0060030.AE0060030button0.Close.executeAllOnDecision = function () {
};
expj.AE0060030.AE0060030button0.Close.executeOnLoad = function () {
  $('#expj-AE0060030-AE0060030button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060030', 'AE0060030button0', 'Close', this, 'Button');
    }
  });
  expj.AE0060030.AE0060030button0.Close.executePScriptOnLoad();
};

expj.AE0060030.AE0060030button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0060030button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0060030-AE0060030button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060030-AE0060030button0-Close" name="Close" class="AE0060030-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0060030 (END)-->
<script class="expj-script-AE0060030-AE0060030detail1">
expj.AE0060030.AE0060030detail1 = {};
expj.AE0060030.AE0060030detail1.executeAllOnDecision = function () {
  console.log('execute AE0060030detail1.onDecision');
};
expj.AE0060030.AE0060030detail1.executeOnLoad = function () {
  expj.AE0060030.AE0060030detail1.executePScriptOnLoad();
};

expj.AE0060030.AE0060030detail1.executePScriptOnLoad = function () {
  console.log('execute AE0060030detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAE0060030Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AE0060030-AE0060030detail1" class="expj-datagird-detail" data-float="AE0060030float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AE0060030detail1";
 detailFloat = "AE0060030float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AE0060030detail1_Id = "AE0060030detail1";
 String AE0060030detail1_select = "single";
 String AE0060030detail1_sortable = "true";
 String AE0060030detail1_resize = "true";
 String AE0060030detail1_scroll = "true";
 StringBuffer AE0060030detail1_HB = new StringBuffer();
 StringBuffer AE0060030detail1_DB = new StringBuffer();
%>
<%
 AE0060030detail1_sortable = "false";
 AE0060030detail1_select = "none";
%>
<% AE0060030detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AE0060030detail1_sortable).append("}").append(","); %>
<%  AE0060030detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AE0060030detail1_sortable).append("}").append(",");
AE0060030detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AE0060030detail1_sortable).append("}").append(",");
AE0060030detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AE0060030detail1_sortable).append("}").append(",");
AE0060030detail1_HB.append("{'visible':true,'width':'0px','title':'','name':'col4', 'class':'expj-detail-cell-hidden','sortable':").append(AE0060030detail1_sortable).append("}").append(",");
 %>
  <% AE0060030detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-ITEM_CD\" class=\"expj-label\" data-name=\"ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getITEM_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-ITEM_NAME\" class=\"expj-label\" data-name=\"ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getITEM_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.JOB_ODR_CD",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-JOB_ODR_CD\" class=\"expj-label\" data-name=\"JOB_ODR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getJOB_ODR_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getDRAW_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getSPEC())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-UNIT_QTY_TYP_DN\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getUNIT_QTY_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-UNIT_QTY_TYP\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getUNIT_QTY_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-VEND_CD\" class=\"expj-label\" data-name=\"VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getVEND_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.VEND_NAME",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-VEND_NAME\" class=\"expj-label\" data-name=\"VEND_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getVEND_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0060030-AE0060030detail1-PUCH_ODR_QTY\" class=\"expj-label\" data-name=\"PUCH_ODR_QTY\" data-detailItem=\"true\" data-kind=\"").append(Kind.convertNumeric(aAE0060030Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAE0060030Struct.getPUCH_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0060030-AE0060030detail1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getSTOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.ACPT_QTY_5",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0060030-AE0060030detail1-SUM_ACPT_QTY\" class=\"expj-label\" data-name=\"SUM_ACPT_QTY\" data-detailItem=\"true\" data-kind=\"").append(Kind.convertNumeric(aAE0060030Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAE0060030Struct.getSUM_ACPT_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0060030-AE0060030detail1-d1_STOCK_UNIT\" class=\"expj-label\" data-name=\"d1_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getSTOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.INSPC_CMPLT_FLG",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-INSPC_CMPLT_FLG_DN\" class=\"expj-label\" data-name=\"INSPC_CMPLT_FLG_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getINSPC_CMPLT_FLG_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-INSPC_CMPLT_FLG\" class=\"expj-label\" data-name=\"INSPC_CMPLT_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getINSPC_CMPLT_FLG())).append("</span>").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.PUCH_ODR_INST_DATE_1",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-PUCH_ODR_SLIP_ISS_DATE\" class=\"expj-label\" data-name=\"PUCH_ODR_SLIP_ISS_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060030Struct.getPUCH_ODR_SLIP_ISS_DATE())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-PUCH_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"PUCH_ODR_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060030Struct.getPUCH_ODR_DLV_DATE())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.CONFIRM_DLV_DATE_1",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-CONFIRM_DLV_DATE\" class=\"expj-label\" data-name=\"CONFIRM_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060030Struct.getCONFIRM_DLV_DATE())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-WORK_IN_PROC_CD\" class=\"expj-label\" data-name=\"WORK_IN_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getWORK_IN_PROC_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.PROC_NAME",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-PROC_NAME\" class=\"expj-label\" data-name=\"PROC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getPROC_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.PUCH_ODR_PERSON",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-PUCH_ODR_PERSON\" class=\"expj-label\" data-name=\"PUCH_ODR_PERSON\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getPUCH_ODR_PERSON())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.USER_NAME",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-USER_NAME\" class=\"expj-label\" data-name=\"USER_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getUSER_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.PUCH_ODR_STS_TYP",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-PUCH_ODR_STS_TYP_DN\" class=\"expj-label\" data-name=\"PUCH_ODR_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getPUCH_ODR_STS_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-PUCH_ODR_STS_TYP\" class=\"expj-label\" data-name=\"PUCH_ODR_STS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getPUCH_ODR_STS_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.SPL_ITEM_TYP",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-SPL_ITEM_TYP_DN\" class=\"expj-label\" data-name=\"SPL_ITEM_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getSPL_ITEM_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-SPL_ITEM_TYP\" class=\"expj-label\" data-name=\"SPL_ITEM_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getSPL_ITEM_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-ACPT_INSPC_TYP_DN\" class=\"expj-label\" data-name=\"ACPT_INSPC_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getACPT_INSPC_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-ACPT_INSPC_TYP\" class=\"expj-label\" data-name=\"ACPT_INSPC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getACPT_INSPC_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['22','").append(CoreTools.getRBString("Expj.PRODUCT_TYP",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-PRODUCT_TYP_DN\" class=\"expj-label\" data-name=\"PRODUCT_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getPRODUCT_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-PRODUCT_TYP\" class=\"expj-label\" data-name=\"PRODUCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getPRODUCT_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['23','").append(CoreTools.getRBString("Expj.NON_NO_ITEM_FLG",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-NON_NO_ITEM_FLG_DN\" class=\"expj-label\" data-name=\"NON_NO_ITEM_FLG_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getNON_NO_ITEM_FLG_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-NON_NO_ITEM_FLG\" class=\"expj-label\" data-name=\"NON_NO_ITEM_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getNON_NO_ITEM_FLG())).append("</span>").append("']").append(",");%>
 <% AE0060030detail1_DB.append("['24','").append(CoreTools.getRBString("Expj.PUCH_ODR_COMMENT",rb)).append("','").append("<span id=\"expj-AE0060030-AE0060030detail1-PUCH_ODR_COMMENT\" class=\"expj-label\" data-name=\"PUCH_ODR_COMMENT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060030Struct.getPUCH_ODR_COMMENT())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AE0060030detail1_Id;
 detailViewSelect = AE0060030detail1_select;
 detailViewResize = AE0060030detail1_resize;
 detailViewScroll = AE0060030detail1_scroll;
 detailViewHeaderData = AE0060030detail1_HB;
 detailViewBodyData = AE0060030detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAE0060030Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0060030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0060030)) {
  expj.common.treeInstanceMap.AE0060030 = {};
}
expj.common.treeInstanceMap.AE0060030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0060030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0060030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0060030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0060030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0060030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0060030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0060030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0060030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0060030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0060030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060030)) {
  expj.common.detailDialogMap.AE0060030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0060030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060030.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0060030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0060030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0060030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0060030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0060030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0060030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0060030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0060030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0060030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0060030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0060030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0060030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0060030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0060030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0060030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0060030)) {
  expj.common.viewInstanceMap.AE0060030 = {};
}
expj.common.viewInstanceMap.AE0060030.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0060030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0060030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0060030.<%=viewId %>.init = function () {
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
    expj.AE0060030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0060030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0060030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0060030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0060030_init">
/**
 * AE0060030用のロード完了時初期化関数
 */
expj.AE0060030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0060030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0060030');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0060030');
  expj.common.calendarInstanceMap.AE0060030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0060030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0060030.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0060030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0060030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0060030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0060030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0060030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0060030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0060030-<%=detailId %>');
<%
 }
%>
  try{expj.AE0060030.AE0060030form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form1.h_PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form1.PeekerPuchOdrCd.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form1.ACPT_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form1.ACPT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form1.h_ACPT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form1.THIS_MONTH.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form1.INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form1.INSPC_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form1.PUCH_ODR_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.ITEM_CD_M.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.ITEM_NAME_M.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.ACPT_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.d2_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.ACPT_STS_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.ACPT_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.INSPECTED_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.d3_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.h_INSPECTED_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.c_COMPLETE.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.ACCEPTED_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.d4_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.DEFECTED_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.d5_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.ACPT_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.INSPEC_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.CalendarInspecDate.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.h_INSPEC_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.VEND_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.INSPEC_RSLT_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.INSPC_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.INSPC_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030view1.l_DEFECT_CAUSE_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030view1.l_DEFECT_INSPC_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030view1.l_DEFECT_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030button2.Update.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030button0.CancelComplete.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form1.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030button1.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030form2.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030view1.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030button2.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030button0.executeOnLoad();}catch(e){};
  try{expj.AE0060030.AE0060030detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0060030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0060030', 'AE0060030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0060030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0060030-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0060030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0060030', '<%=request.getContextPath() %>');
};

/**
 * AE0060030の全体onDecision処理
 */
expj.AE0060030.executeAllOnDecision = function () {
  expj.AE0060030.AE0060030form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0060030_console">
expj.AE0060030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>