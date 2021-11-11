<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:01:54 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KU0010\KU0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KU0010.*" %>
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
<jsp:useBean id="aKU0010010Control" class="com.nec.jp.orteus.metamorBase.KU0010.KU0010010Control" scope="request"/>
<jsp:useBean id="aKU0010010Struct" class="com.nec.jp.orteus.metamorBase.KU0010.KU0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出荷指示メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/jsp/KU0010010.jsp,v $
$Author: geng-jia $	
$Revision: 1.24 $ $Date: 2017/02/22 02:07:24 $
********************************************************* --%>
<html>
<head>
<title>出荷指示メンテナンス</title>
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
<script class="expj-script-KU0010010_init">
  // KU0010010名前空間
  expj.KU0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KU0010010" data-screen="KU0010010" data-newdata="<%=aKU0010010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
<!--one start -->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

<!--one end -->

<!--two start -->
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
              <script class="expj-script-KU0010010-KU0010010form1">
expj.KU0010010.KU0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.KU0010010.KU0010010form1.onLoad0 = function () {
  console.log('KU0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHK;_KU0010010form1/r_SEL_PTN1[eq]true@*0"
expj.KU0010010.KU0010010form1.onDecision0 = function () {
  console.log('KU0010010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/r_SEL_PTN1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;_KU0010010form1/r_SEL_PTN2[eq]true@*1"
expj.KU0010010.KU0010010form1.onDecision1 = function () {
  console.log('KU0010010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/r_SEL_PTN2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="onDecision;2;CHK;_KU0010010form1/r_SEL_PTN1[eq]true@*2"
expj.KU0010010.KU0010010form1.onDecision2 = function () {
  console.log('KU0010010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/r_SEL_PTN1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script5="onDecision;3;CHK;_KU0010010form1/r_SEL_PTN2[eq]true@*3"
expj.KU0010010.KU0010010form1.onDecision3 = function () {
  console.log('KU0010010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/r_SEL_PTN2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;0;MASK;_KU0010010form1/g_SLIP_CD,_KU0010010form1/PeekerSlipCd"
expj.KU0010010.KU0010010form1.child0 = function () {
  console.log('KU0010010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/g_SLIP_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/PeekerSlipCd');
};
// script7="child;1;MASK;_KU0010010form1/g_ODR_NO,_KU0010010form1/g_PART_DLV_SEQ_NO,_KU0010010form1/PeekerOrdCd,_KU0010010form2/g_DESINATED_SHIP_DATE,_KU0010010form2/PeekerShipDate,_KU0010010form2/g_REST_SHIP_ODR_QTY2,_KU0010010form2/g_WH_CD,_KU0010010form2/PeekerWhCd"
expj.KU0010010.KU0010010form1.child1 = function () {
  console.log('KU0010010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/g_ODR_NO');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/g_PART_DLV_SEQ_NO');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/PeekerOrdCd');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/g_DESINATED_SHIP_DATE');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/PeekerShipDate');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/g_REST_SHIP_ODR_QTY2');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/g_WH_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/PeekerWhCd');
};
// script8="child;2;CHKRQ;A@*4,*5"
expj.KU0010010.KU0010010form1.child2 = function () {
  console.log('KU0010010form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('KU0010010', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;3;CHKRQ;B@*4,*5"
expj.KU0010010.KU0010010form1.child3 = function () {
  console.log('KU0010010form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('KU0010010', 'B')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="child;4;UNMASK;_KU0010010button1/search"
expj.KU0010010.KU0010010form1.child4 = function () {
  console.log('KU0010010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010button1/search');
};
// script11="child;5;MASK;_KU0010010button1/search"
expj.KU0010010.KU0010010form1.child5 = function () {
  console.log('KU0010010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010button1/search');
};
expj.KU0010010.KU0010010form1.executeAllOnDecision = function () {
  console.log('execute KU0010010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form1['onDecision' + i])) {
        expj.KU0010010.KU0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010form1.executeOnLoad = function () {
  expj.KU0010010.KU0010010form1.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form1.executePScriptOnLoad = function () {
  console.log('execute KU0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form1['onLoad' + i])) {
      expj.KU0010010.KU0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0010010-KU0010010form1" action="KU0010010Servlet" name="KU0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKU0010010Control.getReadStatusString()) %>" style="height:69px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:69px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form1-g_ODR_NO">
expj.KU0010010.KU0010010form1.g_ODR_NO = {};
expj.KU0010010.KU0010010form1.g_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KU0010010form1/g_ODR_NO.onDecision');
  expj.KU0010010.KU0010010form1.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form1.g_ODR_NO.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form1-g_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form1', 'g_ODR_NO', this);
  });
  expj.KU0010010.KU0010010form1.g_ODR_NO.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form1.g_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KU0010010form1/g_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form1-g_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form1-g_ODR_NO" name="g_ODR_NO" class="KU0010010-focus-move  required-value expj-KU0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_ODR_NO()) %>" maxlength="15" ></div><!--/td-->
<input type="hidden" id="expj-KU0010010-KU0010010form1-k_MODE" name="k_MODE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getk_MODE()) %>">
<script class="expj-script-KU0010010-KU0010010form1-k_MODE">
expj.KU0010010.KU0010010form1.k_MODE = {};
expj.KU0010010.KU0010010form1.k_MODE.executeAllOnDecision = function () {
  console.log('execute KU0010010form1/k_MODE.onDecision');
  expj.KU0010010.KU0010010form1.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form1.k_MODE.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form1-k_MODE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form1', 'k_MODE', this);
  });
  expj.KU0010010.KU0010010form1.k_MODE.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form1.k_MODE.executePScriptOnLoad = function () {
  console.log('execute KU0010010form1/k_MODE.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form1-k_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KU0010010-KU0010010form1-PeekerOrdCd">
expj.KU0010010.KU0010010form1.PeekerOrdCd = {};
// script1="onClick;0;PEEKER;_KU0010010form1/g_ODR_NO:_KU0010010form1/g_PART_DLV_SEQ_NO@<%=contextNo%>"
expj.KU0010010.KU0010010form1.PeekerOrdCd.onClick0 = function () {
  console.log('PeekerOrdCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0010010';
var parameterValues = 'PeekerOrdCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/g_ODR_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ODR_NO_02%&%';
parameterValues += 'TARGET_FIELD%=%_KU0010010form1/g_ODR_NO:_KU0010010form1/g_PART_DLV_SEQ_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0010010.KU0010010form1.PeekerOrdCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form1.PeekerOrdCd['onClick' + i])) {
        expj.KU0010010.KU0010010form1.PeekerOrdCd['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010form1.PeekerOrdCd.executeAllOnDecision = function () {
};
expj.KU0010010.KU0010010form1.PeekerOrdCd.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form1-PeekerOrdCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010form1', 'PeekerOrdCd', this, 'Button');
    }
  });
  expj.KU0010010.KU0010010form1.PeekerOrdCd.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form1.PeekerOrdCd.executePScriptOnLoad = function () {
  console.log('execute KU0010010form1/PeekerOrdCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form1-PeekerOrdCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0010010-KU0010010form1-PeekerOrdCd" class="KU0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-KU0010010-KU0010010form1-h_RESULT" name="h_RESULT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.geth_RESULT()) %>">
<script class="expj-script-KU0010010-KU0010010form1-h_RESULT">
expj.KU0010010.KU0010010form1.h_RESULT = {};
expj.KU0010010.KU0010010form1.h_RESULT.executeAllOnDecision = function () {
  console.log('execute KU0010010form1/h_RESULT.onDecision');
  expj.KU0010010.KU0010010form1.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form1.h_RESULT.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form1-h_RESULT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form1', 'h_RESULT', this);
  });
  expj.KU0010010.KU0010010form1.h_RESULT.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form1.h_RESULT.executePScriptOnLoad = function () {
  console.log('execute KU0010010form1/h_RESULT.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form1-h_RESULT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form1-r_SEL_PTN1">
expj.KU0010010.KU0010010form1.r_SEL_PTN1 = {};
// script1="onClick;0;UNMASK;_KU0010010form1/g_ODR_NO,_KU0010010form1/g_PART_DLV_SEQ_NO,_KU0010010form1/PeekerOrdCd,_KU0010010form2/g_DESINATED_SHIP_DATE,_KU0010010form2/PeekerShipDate,_KU0010010form2/g_REST_SHIP_ODR_QTY2,_KU0010010form2/g_WH_CD,_KU0010010form2/PeekerWhCd,_KU0010010form1/g_SLIP_CD,_KU0010010form1/PeekerSlipCd"
expj.KU0010010.KU0010010form1.r_SEL_PTN1.onClick0 = function () {
  console.log('r_SEL_PTN1 script1');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/g_ODR_NO');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/g_PART_DLV_SEQ_NO');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/PeekerOrdCd');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/g_DESINATED_SHIP_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/PeekerShipDate');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/g_REST_SHIP_ODR_QTY2');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/g_WH_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/PeekerWhCd');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/g_SLIP_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/PeekerSlipCd');
};
// script2="onClick;1;SET;_KU0010010form1/h_RESULT=NG,_KU0010010form1/g_SLIP_CD=,_KU0010010form1/g_ODR_NO=,_KU0010010form1/g_PART_DLV_SEQ_NO=1,_KU0010010form2/g_REST_SHIP_ODR_QTY2=0,_KU0010010form2/g_REST_SHIP_ODR_QTY=0,_KU0010010form2/h_REST_SHIP_ODR_QTY=0,_KU0010010form2/g_WH_CD=,_KU0010010form2/g_DESINATED_SHIP_DATE=,_KU0010010form3/g_CUST_ANAME=,_KU0010010form3/g_CUST_ITEM_CD=,_KU0010010form3/g_ITEM_CD=,_KU0010010form2/g_DIRECT_DLV_FLG=false"
expj.KU0010010.KU0010010form1.r_SEL_PTN1.onClick1 = function () {
  console.log('r_SEL_PTN1 script2');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/h_RESULT', 'NG');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/g_SLIP_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/g_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/g_PART_DLV_SEQ_NO', '1');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_REST_SHIP_ODR_QTY2', '0');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_REST_SHIP_ODR_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/h_REST_SHIP_ODR_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_WH_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_DESINATED_SHIP_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_CUST_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_DIRECT_DLV_FLG', 'false');
};
// script3="onClick;2;SET;_KU0010010form2/g_STOCK_UNIT=,_KU0010010form2/g_STOCK_UNIT2=,_KU0010010form2/g_WH_NAME=,_KU0010010form3/g_CUST_CD=,_KU0010010form3/g_CUST_ITEM_NAME=,_KU0010010form3/g_ITEM_NAME=,_KU0010010form3/g_CUST_ODR_NO=,_KU0010010form2/c_JOB_ODR_CD=false,_KU0010010form2/g_JOB_ODR_CD=,_KU0010010form3/h_MRP_ODR_TYP="
expj.KU0010010.KU0010010form1.r_SEL_PTN1.onClick2 = function () {
  console.log('r_SEL_PTN1 script3');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_STOCK_UNIT', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_STOCK_UNIT2', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_WH_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_CUST_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_CUST_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_CUST_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/c_JOB_ODR_CD', 'false');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_JOB_ODR_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/h_MRP_ODR_TYP', '');
};
expj.KU0010010.KU0010010form1.r_SEL_PTN1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form1.r_SEL_PTN1['onClick' + i])) {
        expj.KU0010010.KU0010010form1.r_SEL_PTN1['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010form1.r_SEL_PTN1.executeAllOnDecision = function () {
  console.log('execute KU0010010form1/r_SEL_PTN1.onDecision');
  expj.KU0010010.KU0010010form1.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form1.r_SEL_PTN1.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form1-r_SEL_PTN1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010form1', 'r_SEL_PTN1', this, 'RadioButton');
    }
  });
  expj.KU0010010.KU0010010form1.r_SEL_PTN1.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form1.r_SEL_PTN1.executePScriptOnLoad = function () {
  console.log('execute KU0010010form1/r_SEL_PTN1.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form1-r_SEL_PTN1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"><input type="radio" name="r_SEL_PTN" data-name="r_SEL_PTN1" value="true" <%= ("true".equals(TypeConverter.convert(aKU0010010Struct.getr_SEL_PTN1())) || "".equals(TypeConverter.convert(aKU0010010Struct.getr_SEL_PTN1())))?"checked=\"checked\"": "" %> class="" id="expj-KU0010010-KU0010010form1-r_SEL_PTN1" ><label for="expj-KU0010010-KU0010010form1-r_SEL_PTN1"><%=CoreTools.getRBString("Expj.Cmt0478",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PART_DLV_SEQ_NO",rb)%></span><!-- 分納項番 --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form1-g_PART_DLV_SEQ_NO">
expj.KU0010010.KU0010010form1.g_PART_DLV_SEQ_NO = {};
expj.KU0010010.KU0010010form1.g_PART_DLV_SEQ_NO.executeAllOnDecision = function () {
  console.log('execute KU0010010form1/g_PART_DLV_SEQ_NO.onDecision');
  expj.KU0010010.KU0010010form1.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form1.g_PART_DLV_SEQ_NO.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form1-g_PART_DLV_SEQ_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form1', 'g_PART_DLV_SEQ_NO', this);
  });
  expj.KU0010010.KU0010010form1.g_PART_DLV_SEQ_NO.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form1.g_PART_DLV_SEQ_NO.executePScriptOnLoad = function () {
  console.log('execute KU0010010form1/g_PART_DLV_SEQ_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form1-g_PART_DLV_SEQ_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form1-g_PART_DLV_SEQ_NO" name="g_PART_DLV_SEQ_NO" class="KU0010010-focus-move  required-value expj-KU0010010-required-A" style="width:260px;text-align: right;" data-kind="OBT_INTEGER_P;5" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_PART_DLV_SEQ_NO()) %>" maxlength="5" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form1-r_SEL_PTN2">
expj.KU0010010.KU0010010form1.r_SEL_PTN2 = {};
// script1="onClick;0;UNMASK;_KU0010010form1/g_ODR_NO,_KU0010010form1/g_PART_DLV_SEQ_NO,_KU0010010form1/PeekerOrdCd,_KU0010010form2/g_DESINATED_SHIP_DATE,_KU0010010form2/PeekerShipDate,_KU0010010form2/g_REST_SHIP_ODR_QTY2,_KU0010010form2/g_WH_CD,_KU0010010form2/PeekerWhCd,_KU0010010form1/g_SLIP_CD,_KU0010010form1/PeekerSlipCd"
expj.KU0010010.KU0010010form1.r_SEL_PTN2.onClick0 = function () {
  console.log('r_SEL_PTN2 script1');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/g_ODR_NO');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/g_PART_DLV_SEQ_NO');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/PeekerOrdCd');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/g_DESINATED_SHIP_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/PeekerShipDate');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/g_REST_SHIP_ODR_QTY2');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/g_WH_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form2/PeekerWhCd');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/g_SLIP_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form1', '_KU0010010form1/PeekerSlipCd');
};
// script2="onClick;1;SET;_KU0010010form1/h_RESULT=NG,_KU0010010form1/g_SLIP_CD=,_KU0010010form1/g_ODR_NO=,_KU0010010form1/g_PART_DLV_SEQ_NO=1,_KU0010010form2/g_REST_SHIP_ODR_QTY2=0,_KU0010010form2/g_REST_SHIP_ODR_QTY=0,_KU0010010form2/h_REST_SHIP_ODR_QTY=0,_KU0010010form2/g_WH_CD=,_KU0010010form2/g_DESINATED_SHIP_DATE=,_KU0010010form3/g_CUST_ANAME=,_KU0010010form3/g_CUST_ITEM_CD=,_KU0010010form3/g_ITEM_CD=,_KU0010010form2/g_DIRECT_DLV_FLG=false"
expj.KU0010010.KU0010010form1.r_SEL_PTN2.onClick1 = function () {
  console.log('r_SEL_PTN2 script2');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/h_RESULT', 'NG');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/g_SLIP_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/g_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/g_PART_DLV_SEQ_NO', '1');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_REST_SHIP_ODR_QTY2', '0');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_REST_SHIP_ODR_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/h_REST_SHIP_ODR_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_WH_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_DESINATED_SHIP_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_CUST_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_DIRECT_DLV_FLG', 'false');
};
// script3="onClick;2;SET;_KU0010010form2/g_STOCK_UNIT=,_KU0010010form2/g_STOCK_UNIT2=,_KU0010010form2/g_WH_NAME=,_KU0010010form3/g_CUST_CD=,_KU0010010form3/g_CUST_ITEM_NAME=,_KU0010010form3/g_ITEM_NAME=,_KU0010010form3/g_CUST_ODR_NO=,_KU0010010form2/c_JOB_ODR_CD=false,_KU0010010form2/g_JOB_ODR_CD=,_KU0010010form3/h_MRP_ODR_TYP="
expj.KU0010010.KU0010010form1.r_SEL_PTN2.onClick2 = function () {
  console.log('r_SEL_PTN2 script3');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_STOCK_UNIT', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_STOCK_UNIT2', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_WH_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_CUST_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_CUST_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/g_CUST_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/c_JOB_ODR_CD', 'false');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form2/g_JOB_ODR_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form3/h_MRP_ODR_TYP', '');
};
expj.KU0010010.KU0010010form1.r_SEL_PTN2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form1.r_SEL_PTN2['onClick' + i])) {
        expj.KU0010010.KU0010010form1.r_SEL_PTN2['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010form1.r_SEL_PTN2.executeAllOnDecision = function () {
  console.log('execute KU0010010form1/r_SEL_PTN2.onDecision');
  expj.KU0010010.KU0010010form1.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form1.r_SEL_PTN2.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form1-r_SEL_PTN2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010form1', 'r_SEL_PTN2', this, 'RadioButton');
    }
  });
  expj.KU0010010.KU0010010form1.r_SEL_PTN2.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form1.r_SEL_PTN2.executePScriptOnLoad = function () {
  console.log('execute KU0010010form1/r_SEL_PTN2.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form1-r_SEL_PTN2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"><input type="radio" name="r_SEL_PTN" data-name="r_SEL_PTN2" value="true" <%= ("true".equals(TypeConverter.convert(aKU0010010Struct.getr_SEL_PTN2())))?"checked=\"checked\"":"" %> class="" id="expj-KU0010010-KU0010010form1-r_SEL_PTN2" ><label for="expj-KU0010010-KU0010010form1-r_SEL_PTN2"><%=CoreTools.getRBString("Expj.Cmt0456",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SLIP_CD",rb)%></span><!-- 伝票番号 --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form1-g_SLIP_CD">
expj.KU0010010.KU0010010form1.g_SLIP_CD = {};
expj.KU0010010.KU0010010form1.g_SLIP_CD.executeAllOnDecision = function () {
  console.log('execute KU0010010form1/g_SLIP_CD.onDecision');
  expj.KU0010010.KU0010010form1.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form1.g_SLIP_CD.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form1-g_SLIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form1', 'g_SLIP_CD', this);
  });
  expj.KU0010010.KU0010010form1.g_SLIP_CD.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form1.g_SLIP_CD.executePScriptOnLoad = function () {
  console.log('execute KU0010010form1/g_SLIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form1-g_SLIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form1-g_SLIP_CD" name="g_SLIP_CD" class="KU0010010-focus-move  required-value expj-KU0010010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_SLIP_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form1-PeekerSlipCd">
expj.KU0010010.KU0010010form1.PeekerSlipCd = {};
// script1="onClick;0;PEEKER;_KU0010010form1/g_SLIP_CD@<%=contextNo%>"
expj.KU0010010.KU0010010form1.PeekerSlipCd.onClick0 = function () {
  console.log('PeekerSlipCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0010010';
var parameterValues = 'PeekerSlipCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form1', '_KU0010010form1/g_SLIP_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%SLIP_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0010010form1/g_SLIP_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0010010.KU0010010form1.PeekerSlipCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form1.PeekerSlipCd['onClick' + i])) {
        expj.KU0010010.KU0010010form1.PeekerSlipCd['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010form1.PeekerSlipCd.executeAllOnDecision = function () {
};
expj.KU0010010.KU0010010form1.PeekerSlipCd.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form1-PeekerSlipCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010form1', 'PeekerSlipCd', this, 'Button');
    }
  });
  expj.KU0010010.KU0010010form1.PeekerSlipCd.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form1.PeekerSlipCd.executePScriptOnLoad = function () {
  console.log('execute KU0010010form1/PeekerSlipCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form1-PeekerSlipCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0010010-KU0010010form1-PeekerSlipCd" class="KU0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KU0010010-KU0010010button1">
expj.KU0010010.KU0010010button1 = {};
expj.KU0010010.KU0010010button1.executeAllOnDecision = function () {
  console.log('execute KU0010010button1.onDecision');
};
expj.KU0010010.KU0010010button1.executeOnLoad = function () {
  expj.KU0010010.KU0010010button1.executePScriptOnLoad();
};

expj.KU0010010.KU0010010button1.executePScriptOnLoad = function () {
  console.log('execute KU0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0010010-KU0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0010010-KU0010010button1-search">
expj.KU0010010.KU0010010button1.search = {};
// script1="onClick;0;SET;_KU0010010form2/g_DESINATED_SHIP_DATE=,_KU0010010form2/g_REST_SHIP_ODR_QTY2=0,_KU0010010form2/h_REST_SHIP_ODR_QTY=,_KU0010010form2/h_PARTIAL_SHIP_INST_FLG=,_KU0010010form2/g_REST_SHIP_ODR_QTY=0,_KU0010010form2/g_WH_CD=,_KU0010010form2/g_DIRECT_DLV_FLG=,_KU0010010form3/g_CUST_ANAME=,_KU0010010form3/h_CUST_ANAME=,_KU0010010form3/g_CUST_ITEM_CD=,_KU0010010form3/h_CUST_ITEM_CD=,_KU0010010form3/g_ITEM_CD=,_KU0010010form3/h_ITEM_CD=,_KU0010010form3/h_AP_SECRTY_TYP=,_KU0010010form3/h_MODFIY_CNT=,_KU0010010form2/c_JOB_ODR_CD=false,_KU0010010form2/g_JOB_ODR_CD="
expj.KU0010010.KU0010010button1.search.onClick0 = function () {
  console.log('search script1');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form2/g_DESINATED_SHIP_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form2/g_REST_SHIP_ODR_QTY2', '0');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form2/h_REST_SHIP_ODR_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form2/h_PARTIAL_SHIP_INST_FLG', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form2/g_REST_SHIP_ODR_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form2/g_WH_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form2/g_DIRECT_DLV_FLG', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form3/h_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form3/g_CUST_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form3/h_CUST_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form3/g_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form3/h_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form3/h_AP_SECRTY_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form3/h_MODFIY_CNT', '');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form2/c_JOB_ODR_CD', 'false');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form2/g_JOB_ODR_CD', '');
};
// script2="onClick;1;SET;_KU0010010form1/k_MODE=SEARCH,_KU0010010form1/h_RESULT=NG"
expj.KU0010010.KU0010010button1.search.onClick1 = function () {
  console.log('search script2');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form1/k_MODE', 'SEARCH');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010button1', '_KU0010010form1/h_RESULT', 'NG');
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0010010form1/*,_KU0010010form2/*,_KU0010010form3/*@KU0010010Servlet"
expj.KU0010010.KU0010010button1.search.onClick2 = function () {
  console.log('search script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0010010', 'KU0010010button1', '_KU0010010form1/*,_KU0010010form2/*,_KU0010010form3/*', 'KU0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0010010', response);
expj.common.updateBusinessScreenTab('KU0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0010010.KU0010010button1.search.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010button1.search['onClick' + i])) {
        expj.KU0010010.KU0010010button1.search['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010button1.search.executeAllOnDecision = function () {
};
expj.KU0010010.KU0010010button1.search.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010button1-search').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010button1', 'search', this, 'Button');
    }
  });
  expj.KU0010010.KU0010010button1.search.executePScriptOnLoad();
};

expj.KU0010010.KU0010010button1.search.executePScriptOnLoad = function () {
  console.log('execute KU0010010button1/search.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010button1-search');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0010010-KU0010010button1-search" name="search" class="KU0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<!--two end --><!--four start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--four end --><!--five start --><div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに中段検索条件用のDataGridを配置する。↓ --><script class="expj-script-KU0010010-KU0010010form2">
expj.KU0010010.KU0010010form2 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.KU0010010.KU0010010form2.onLoad0 = function () {
  console.log('KU0010010form2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;MASK;_KU0010010button2/insert,_KU0010010button2/torikeshi"
expj.KU0010010.KU0010010form2.onDecision0 = function () {
  console.log('KU0010010form2 script2');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010button2/torikeshi');
};
// script3="onDecision;1;CHK;_KU0010010form1/h_RESULT[eq]OK@*0"
expj.KU0010010.KU0010010form2.onDecision1 = function () {
  console.log('KU0010010form2 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form1/h_RESULT'), '[eq]', 'OK')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script4="child;0;CHK;_KU0010010form1/r_SEL_PTN1[eq]true@*1,*6"
expj.KU0010010.KU0010010form2.child0 = function () {
  console.log('KU0010010form2 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form1/r_SEL_PTN1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script5="child;1;CHK;_KU0010010form2/c_JOB_ODR_CD[eq]true@*2,*3"
expj.KU0010010.KU0010010form2.child1 = function () {
  console.log('KU0010010form2 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form2/c_JOB_ODR_CD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;CHKRQ;A,C,D@*4"
expj.KU0010010.KU0010010form2.child2 = function () {
  console.log('KU0010010form2 script6');
if (expj.common.pscript.satisfiedRequiredComponent('KU0010010', 'A') && expj.common.pscript.satisfiedRequiredComponent('KU0010010', 'C') && expj.common.pscript.satisfiedRequiredComponent('KU0010010', 'D')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;CHKRQ;A,C@*4"
expj.KU0010010.KU0010010form2.child3 = function () {
  console.log('KU0010010form2 script7');
if (expj.common.pscript.satisfiedRequiredComponent('KU0010010', 'A') && expj.common.pscript.satisfiedRequiredComponent('KU0010010', 'C')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;4;CHK;?KU0010010form1/g_ODR_NO[eq]SAME[and]?KU0010010form1/g_PART_DLV_SEQ_NO[eq]SAME@*5"
expj.KU0010010.KU0010010form2.child4 = function () {
  console.log('KU0010010form2 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '?KU0010010form1/g_ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '?KU0010010form1/g_PART_DLV_SEQ_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;5;UNMASK;_KU0010010button2/insert"
expj.KU0010010.KU0010010form2.child5 = function () {
  console.log('KU0010010form2 script9');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010button2/insert');
};
// script10="child;6;CHKRQ;B@*7"
expj.KU0010010.KU0010010form2.child6 = function () {
  console.log('KU0010010form2 script10');
if (expj.common.pscript.satisfiedRequiredComponent('KU0010010', 'B')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;7;CHK;?KU0010010form1/g_SLIP_CD[eq]SAME@*8"
expj.KU0010010.KU0010010form2.child7 = function () {
  console.log('KU0010010form2 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '?KU0010010form1/g_SLIP_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;8;UNMASK;_KU0010010button2/torikeshi"
expj.KU0010010.KU0010010form2.child8 = function () {
  console.log('KU0010010form2 script12');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010button2/torikeshi');
};
// script13="onDecision;2;CHK;_KU0010010form3/h_MRP_ODR_TYP[eq]1[or]_KU0010010form3/h_MRP_ODR_TYP[eq]2@*9,*10"
expj.KU0010010.KU0010010form2.onDecision2 = function () {
  console.log('KU0010010form2 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form3/h_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form3/h_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script14="child;9;UNMASK;_KU0010010form2/c_JOB_ODR_CD"
expj.KU0010010.KU0010010form2.child9 = function () {
  console.log('KU0010010form2 script14');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010form2/c_JOB_ODR_CD');
};
// script15="child;10;MASK;_KU0010010form2/c_JOB_ODR_CD@*11"
expj.KU0010010.KU0010010form2.child10 = function () {
  console.log('KU0010010form2 script15');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010form2/c_JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script16="child;11;SET;_KU0010010form2/c_JOB_ODR_CD=false"
expj.KU0010010.KU0010010form2.child11 = function () {
  console.log('KU0010010form2 script16');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form2/c_JOB_ODR_CD', 'false');
};
// script17="onDecision;3;CHK;_KU0010010form2/c_JOB_ODR_CD[eq]true@*12,*13"
expj.KU0010010.KU0010010form2.onDecision3 = function () {
  console.log('KU0010010form2 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form2/c_JOB_ODR_CD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script18="child;12;UNMASK;_KU0010010form2/g_JOB_ODR_CD,_KU0010010form2/PeekerJobOdrCd"
expj.KU0010010.KU0010010form2.child12 = function () {
  console.log('KU0010010form2 script18');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010form2/g_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010form2/PeekerJobOdrCd');
};
// script19="child;13;MASK;_KU0010010form2/g_JOB_ODR_CD,_KU0010010form2/PeekerJobOdrCd"
expj.KU0010010.KU0010010form2.child13 = function () {
  console.log('KU0010010form2 script19');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010form2/g_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010form2/PeekerJobOdrCd');
};
expj.KU0010010.KU0010010form2.executeAllOnDecision = function () {
  console.log('execute KU0010010form2.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form2['onDecision' + i])) {
        expj.KU0010010.KU0010010form2['onDecision' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010form2.executeOnLoad = function () {
  expj.KU0010010.KU0010010form2.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form2['onLoad' + i])) {
      expj.KU0010010.KU0010010form2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0010010-KU0010010form2" action="KU0010010Servlet" name="KU0010010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:110px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.DESINATED_SHIP_DATE",rb)%></span><!-- 出荷指定日 --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-g_DESINATED_SHIP_DATE">
expj.KU0010010.KU0010010form2.g_DESINATED_SHIP_DATE = {};
expj.KU0010010.KU0010010form2.g_DESINATED_SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/g_DESINATED_SHIP_DATE.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.g_DESINATED_SHIP_DATE.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-g_DESINATED_SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'g_DESINATED_SHIP_DATE', this);
  });
  expj.KU0010010.KU0010010form2.g_DESINATED_SHIP_DATE.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.g_DESINATED_SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/g_DESINATED_SHIP_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-g_DESINATED_SHIP_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form2-g_DESINATED_SHIP_DATE" name="g_DESINATED_SHIP_DATE" class="KU0010010-focus-move  required-value expj-KU0010010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_DESINATED_SHIP_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-PeekerShipDate">
expj.KU0010010.KU0010010form2.PeekerShipDate = {};
// script1="onClick;0;CALENDAR;_KU0010010form2/g_DESINATED_SHIP_DATE@<%=contextNo%>"
expj.KU0010010.KU0010010form2.PeekerShipDate.onClick0 = function () {
  console.log('PeekerShipDate script1');
expj.common.pscript.executeCalendar('KU0010010','KU0010010form2','_KU0010010form2/g_DESINATED_SHIP_DATE');
};
expj.KU0010010.KU0010010form2.PeekerShipDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form2.PeekerShipDate['onClick' + i])) {
        expj.KU0010010.KU0010010form2.PeekerShipDate['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010form2.PeekerShipDate.executeAllOnDecision = function () {
};
expj.KU0010010.KU0010010form2.PeekerShipDate.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-PeekerShipDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010form2', 'PeekerShipDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0010010','KU0010010form2','_KU0010010form2/g_DESINATED_SHIP_DATE');
  expj.KU0010010.KU0010010form2.PeekerShipDate.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.PeekerShipDate.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/PeekerShipDate.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-PeekerShipDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0010010-KU0010010form2-PeekerShipDate" class="KU0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SHIP_ODR_QTY",rb)%></span><!-- 出荷指定数量 --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-g_REST_SHIP_ODR_QTY2">
expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY2 = {};
expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY2.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/g_REST_SHIP_ODR_QTY2.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY2.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-g_REST_SHIP_ODR_QTY2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'g_REST_SHIP_ODR_QTY2', this);
  });
  expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY2.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY2.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/g_REST_SHIP_ODR_QTY2.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-g_REST_SHIP_ODR_QTY2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form2-g_REST_SHIP_ODR_QTY2" name="g_REST_SHIP_ODR_QTY2" class="KU0010010-focus-move  required-value expj-KU0010010-required-C" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;CEIL;4" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_REST_SHIP_ODR_QTY2()) %>" maxlength="19" ></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-g_STOCK_UNIT">
expj.KU0010010.KU0010010form2.g_STOCK_UNIT = {};
expj.KU0010010.KU0010010form2.g_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/g_STOCK_UNIT.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.g_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-g_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'g_STOCK_UNIT', this);
  });
  expj.KU0010010.KU0010010form2.g_STOCK_UNIT.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.g_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/g_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-g_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form2-g_STOCK_UNIT" name="g_STOCK_UNIT" class="KU0010010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_STOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KU0010010-KU0010010form2-h_REST_SHIP_ODR_QTY" name="h_REST_SHIP_ODR_QTY" class="" data-kind="OBT_NUMBER_Z;18.1;CEIL;4" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.geth_REST_SHIP_ODR_QTY()) %>">
<script class="expj-script-KU0010010-KU0010010form2-h_REST_SHIP_ODR_QTY">
expj.KU0010010.KU0010010form2.h_REST_SHIP_ODR_QTY = {};
expj.KU0010010.KU0010010form2.h_REST_SHIP_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/h_REST_SHIP_ODR_QTY.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.h_REST_SHIP_ODR_QTY.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-h_REST_SHIP_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'h_REST_SHIP_ODR_QTY', this);
  });
  expj.KU0010010.KU0010010form2.h_REST_SHIP_ODR_QTY.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.h_REST_SHIP_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/h_REST_SHIP_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-h_REST_SHIP_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KU0010010-KU0010010form2-h_PARTIAL_SHIP_INST_FLG" name="h_PARTIAL_SHIP_INST_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.geth_PARTIAL_SHIP_INST_FLG()) %>">
<script class="expj-script-KU0010010-KU0010010form2-h_PARTIAL_SHIP_INST_FLG">
expj.KU0010010.KU0010010form2.h_PARTIAL_SHIP_INST_FLG = {};
expj.KU0010010.KU0010010form2.h_PARTIAL_SHIP_INST_FLG.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/h_PARTIAL_SHIP_INST_FLG.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.h_PARTIAL_SHIP_INST_FLG.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-h_PARTIAL_SHIP_INST_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'h_PARTIAL_SHIP_INST_FLG', this);
  });
  expj.KU0010010.KU0010010form2.h_PARTIAL_SHIP_INST_FLG.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.h_PARTIAL_SHIP_INST_FLG.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/h_PARTIAL_SHIP_INST_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-h_PARTIAL_SHIP_INST_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REST_SHIP_ODR_QTY",rb)%></span><!-- 出荷指示残数量 --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-g_REST_SHIP_ODR_QTY">
expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY = {};
expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/g_REST_SHIP_ODR_QTY.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-g_REST_SHIP_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'g_REST_SHIP_ODR_QTY', this);
  });
  expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/g_REST_SHIP_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-g_REST_SHIP_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form2-g_REST_SHIP_ODR_QTY" name="g_REST_SHIP_ODR_QTY" class="KU0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;18.1;ROUND;4" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_REST_SHIP_ODR_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-g_STOCK_UNIT2">
expj.KU0010010.KU0010010form2.g_STOCK_UNIT2 = {};
expj.KU0010010.KU0010010form2.g_STOCK_UNIT2.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/g_STOCK_UNIT2.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.g_STOCK_UNIT2.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-g_STOCK_UNIT2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'g_STOCK_UNIT2', this);
  });
  expj.KU0010010.KU0010010form2.g_STOCK_UNIT2.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.g_STOCK_UNIT2.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/g_STOCK_UNIT2.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-g_STOCK_UNIT2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form2-g_STOCK_UNIT2" name="g_STOCK_UNIT2" class="KU0010010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_STOCK_UNIT2()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-g_WH_CD">
expj.KU0010010.KU0010010form2.g_WH_CD = {};
expj.KU0010010.KU0010010form2.g_WH_CD.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/g_WH_CD.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.g_WH_CD.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-g_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'g_WH_CD', this);
  });
  expj.KU0010010.KU0010010form2.g_WH_CD.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.g_WH_CD.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/g_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-g_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form2-g_WH_CD" name="g_WH_CD" class="KU0010010-focus-move  required-value expj-KU0010010-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-PeekerWhCd">
expj.KU0010010.KU0010010form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_KU0010010form2/g_WH_CD@<%=contextNo%>"
expj.KU0010010.KU0010010form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0010010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form3/g_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form2/g_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_12%&%';
parameterValues += 'TARGET_FIELD%=%_KU0010010form2/g_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0010010.KU0010010form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form2.PeekerWhCd['onClick' + i])) {
        expj.KU0010010.KU0010010form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.KU0010010.KU0010010form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.KU0010010.KU0010010form2.PeekerWhCd.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0010010-KU0010010form2-PeekerWhCd" class="KU0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-g_WH_NAME">
expj.KU0010010.KU0010010form2.g_WH_NAME = {};
expj.KU0010010.KU0010010form2.g_WH_NAME.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/g_WH_NAME.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.g_WH_NAME.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-g_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'g_WH_NAME', this);
  });
  expj.KU0010010.KU0010010form2.g_WH_NAME.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.g_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/g_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-g_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form2-g_WH_NAME" name="g_WH_NAME" class="KU0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-g_JOB_ODR_CD">
expj.KU0010010.KU0010010form2.g_JOB_ODR_CD = {};
expj.KU0010010.KU0010010form2.g_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/g_JOB_ODR_CD.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.g_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-g_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'g_JOB_ODR_CD', this);
  });
  expj.KU0010010.KU0010010form2.g_JOB_ODR_CD.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.g_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/g_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-g_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form2-g_JOB_ODR_CD" name="g_JOB_ODR_CD" class="KU0010010-focus-move  required-value expj-KU0010010-required-D" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KU0010010-KU0010010form2-h_JOB_ODR_CD" name="h_JOB_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.geth_JOB_ODR_CD()) %>">
<script class="expj-script-KU0010010-KU0010010form2-h_JOB_ODR_CD">
expj.KU0010010.KU0010010form2.h_JOB_ODR_CD = {};
expj.KU0010010.KU0010010form2.h_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/h_JOB_ODR_CD.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.h_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-h_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form2', 'h_JOB_ODR_CD', this);
  });
  expj.KU0010010.KU0010010form2.h_JOB_ODR_CD.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.h_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/h_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-h_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KU0010010-KU0010010form2-PeekerJobOdrCd">
expj.KU0010010.KU0010010form2.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_KU0010010form2/g_JOB_ODR_CD@<%=contextNo%>"
expj.KU0010010.KU0010010form2.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0010010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form3/g_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form2/g_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form2/g_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_09%&%';
parameterValues += 'TARGET_FIELD%=%_KU0010010form2/g_JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0010010.KU0010010form2.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form2.PeekerJobOdrCd['onClick' + i])) {
        expj.KU0010010.KU0010010form2.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010form2.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.KU0010010.KU0010010form2.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010form2', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.KU0010010.KU0010010form2.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0010010-KU0010010form2-PeekerJobOdrCd" class="KU0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-c_JOB_ODR_CD">
expj.KU0010010.KU0010010form2.c_JOB_ODR_CD = {};
// script1="onClick;0;UNMASK;_KU0010010form2/g_JOB_ODR_CD,_KU0010010form2/PeekerJobOdrCd"
expj.KU0010010.KU0010010form2.c_JOB_ODR_CD.onClick0 = function () {
  console.log('c_JOB_ODR_CD script1');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010form2/g_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0010010', 'KU0010010form2', '_KU0010010form2/PeekerJobOdrCd');
};
// script2="onClick;1;SET;_KU0010010form2/g_JOB_ODR_CD="
expj.KU0010010.KU0010010form2.c_JOB_ODR_CD.onClick1 = function () {
  console.log('c_JOB_ODR_CD script2');
expj.common.pscript.setReferenceComponentValue('KU0010010', 'KU0010010form2', '_KU0010010form2/g_JOB_ODR_CD', '');
};
expj.KU0010010.KU0010010form2.c_JOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010form2.c_JOB_ODR_CD['onClick' + i])) {
        expj.KU0010010.KU0010010form2.c_JOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010form2.c_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/c_JOB_ODR_CD.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.c_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-c_JOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010form2', 'c_JOB_ODR_CD', this, 'CheckBox');
    }
  });
  expj.KU0010010.KU0010010form2.c_JOB_ODR_CD.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.c_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/c_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-c_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_CD" value="true" <%= ("true".equals(TypeConverter.convert(aKU0010010Struct.getc_JOB_ODR_CD())) || "1".equals(TypeConverter.convert(aKU0010010Struct.getc_JOB_ODR_CD())))?"checked=\"checked\"":"" %>  class="KU0010010-focus-move" id="expj-KU0010010-KU0010010form2-c_JOB_ODR_CD"><label for="expj-KU0010010-KU0010010form2-c_JOB_ODR_CD"><%=CoreTools.getRBString("Expj.Cmt0210",rb)%></label></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form2-g_DIRECT_DLV_FLG">
expj.KU0010010.KU0010010form2.g_DIRECT_DLV_FLG = {};
expj.KU0010010.KU0010010form2.g_DIRECT_DLV_FLG.executeAllOnDecision = function () {
  console.log('execute KU0010010form2/g_DIRECT_DLV_FLG.onDecision');
  expj.KU0010010.KU0010010form2.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form2.g_DIRECT_DLV_FLG.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form2-g_DIRECT_DLV_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010form2', 'g_DIRECT_DLV_FLG', this, 'CheckBox');
    }
  });
  expj.KU0010010.KU0010010form2.g_DIRECT_DLV_FLG.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form2.g_DIRECT_DLV_FLG.executePScriptOnLoad = function () {
  console.log('execute KU0010010form2/g_DIRECT_DLV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form2-g_DIRECT_DLV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="g_DIRECT_DLV_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aKU0010010Struct.getg_DIRECT_DLV_FLG())) || "1".equals(TypeConverter.convert(aKU0010010Struct.getg_DIRECT_DLV_FLG())))?"checked=\"checked\"":"" %>  class="KU0010010-focus-move" id="expj-KU0010010-KU0010010form2-g_DIRECT_DLV_FLG"><label for="expj-KU0010010-KU0010010form2-g_DIRECT_DLV_FLG"><%=CoreTools.getRBString("Expj.DIRECT_DLV_FLG",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに中段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-KU0010010-KU0010010button2">
expj.KU0010010.KU0010010button2 = {};
expj.KU0010010.KU0010010button2.executeAllOnDecision = function () {
  console.log('execute KU0010010button2.onDecision');
};
expj.KU0010010.KU0010010button2.executeOnLoad = function () {
  expj.KU0010010.KU0010010button2.executePScriptOnLoad();
};

expj.KU0010010.KU0010010button2.executePScriptOnLoad = function () {
  console.log('execute KU0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0010010-KU0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0010010-KU0010010button2-insert">
expj.KU0010010.KU0010010button2.insert = {};
// script1="onClick;0;CHK;_KU0010010form2/h_PARTIAL_SHIP_INST_FLG[eq]0[and]_KU0010010form2/h_REST_SHIP_ODR_QTY[neq]_KU0010010form2/g_REST_SHIP_ODR_QTY2@$KU00087"
expj.KU0010010.KU0010010button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010button2', '_KU0010010form2/h_PARTIAL_SHIP_INST_FLG'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010button2', '_KU0010010form2/h_REST_SHIP_ODR_QTY'), '[neq]', expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010button2', '_KU0010010form2/g_REST_SHIP_ODR_QTY2'))) {
expj.common.pscript.addWarningMessage('KU0010010', 'KU0010010button2', 'KU00087');
}
};
// script2="onClick;1;CHK;_KU0010010form2/g_JOB_ODR_CD[neq][and]_KU0010010form2/h_JOB_ODR_CD[neq]@*0,*2"
expj.KU0010010.KU0010010button2.insert.onClick1 = function () {
  console.log('insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010button2', '_KU0010010form2/g_JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010button2', '_KU0010010form2/h_JOB_ODR_CD'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHK;_KU0010010form2/g_JOB_ODR_CD[neq]_KU0010010form2/h_JOB_ODR_CD@*1,*2"
expj.KU0010010.KU0010010button2.insert.child0 = function () {
  console.log('insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010button2', '_KU0010010form2/g_JOB_ODR_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('KU0010010', 'KU0010010button2', '_KU0010010form2/h_JOB_ODR_CD'))) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;CFMPUT;_KU0010010button2/insert=YES:2@KU02016"
expj.KU0010010.KU0010010button2.insert.child1 = function () {
  console.log('insert script4');
var yesFunc = function () {
expj.KU0010010.KU0010010button2.insert.child2();
};
var noFunc = function () {
};
expj.common.pscript.executeConfirmPut('KU0010010', 'KU0010010button2', '_KU0010010button2/insert', 'KU02016', yesFunc, noFunc);
};
// script5="child;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0010010form1/*,_KU0010010form2/*,_KU0010010form3/*@KU0010010Servlet,,$ZZ07001"
expj.KU0010010.KU0010010button2.insert.child2 = function () {
  console.log('insert script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0010010', 'KU0010010button2', '_KU0010010form1/*,_KU0010010form2/*,_KU0010010form3/*', 'KU0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0010010', response);
expj.common.updateBusinessScreenTab('KU0010010', contents);
};
expj.common.pscript.callConfirm('KU0010010', 'KU0010010button2', 'ZZ07001', okEvent);
};
expj.KU0010010.KU0010010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010button2.insert['onClick' + i])) {
        expj.KU0010010.KU0010010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010button2.insert.executeAllOnDecision = function () {
};
expj.KU0010010.KU0010010button2.insert.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010button2', 'insert', this, 'Button');
    }
  });
  expj.KU0010010.KU0010010button2.insert.executePScriptOnLoad();
};

expj.KU0010010.KU0010010button2.insert.executePScriptOnLoad = function () {
  console.log('execute KU0010010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0010010-KU0010010button2-insert" name="insert" class="KU0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010button2-torikeshi">
expj.KU0010010.KU0010010button2.torikeshi = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0010010form1/*,_KU0010010form2/*,_KU0010010form3/*@KU0010010Servlet,,$ZZ07004"
expj.KU0010010.KU0010010button2.torikeshi.onClick0 = function () {
  console.log('torikeshi script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0010010', 'KU0010010button2', '_KU0010010form1/*,_KU0010010form2/*,_KU0010010form3/*', 'KU0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0010010', response);
expj.common.updateBusinessScreenTab('KU0010010', contents);
};
expj.common.pscript.callConfirm('KU0010010', 'KU0010010button2', 'ZZ07004', okEvent);
};
expj.KU0010010.KU0010010button2.torikeshi.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010button2.torikeshi['onClick' + i])) {
        expj.KU0010010.KU0010010button2.torikeshi['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010button2.torikeshi.executeAllOnDecision = function () {
};
expj.KU0010010.KU0010010button2.torikeshi.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010button2-torikeshi').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010button2', 'torikeshi', this, 'Button');
    }
  });
  expj.KU0010010.KU0010010button2.torikeshi.executePScriptOnLoad();
};

expj.KU0010010.KU0010010button2.torikeshi.executePScriptOnLoad = function () {
  console.log('execute KU0010010button2/torikeshi.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010button2-torikeshi');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0010010-KU0010010button2-torikeshi" name="torikeshi" class="KU0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<!--five end --><!--six start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--six end --><!--elevent start --><div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KU0010010-KU0010010form3">
expj.KU0010010.KU0010010form3 = {};
expj.KU0010010.KU0010010form3.executeAllOnDecision = function () {
  console.log('execute KU0010010form3.onDecision');
};
expj.KU0010010.KU0010010form3.executeOnLoad = function () {
  expj.KU0010010.KU0010010form3.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0010010-KU0010010form3" action="KU0010010Servlet" name="KU0010010form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:260px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:320px;align:"></div>
<div class="div-td" style="align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form3-g_CUST_CD">
expj.KU0010010.KU0010010form3.g_CUST_CD = {};
expj.KU0010010.KU0010010form3.g_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/g_CUST_CD.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.g_CUST_CD.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-g_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'g_CUST_CD', this);
  });
  expj.KU0010010.KU0010010form3.g_CUST_CD.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.g_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/g_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-g_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form3-g_CUST_CD" name="g_CUST_CD" class="KU0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_CUST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form3-g_CUST_ANAME">
expj.KU0010010.KU0010010form3.g_CUST_ANAME = {};
expj.KU0010010.KU0010010form3.g_CUST_ANAME.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/g_CUST_ANAME.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.g_CUST_ANAME.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-g_CUST_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'g_CUST_ANAME', this);
  });
  expj.KU0010010.KU0010010form3.g_CUST_ANAME.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.g_CUST_ANAME.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/g_CUST_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-g_CUST_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form3-g_CUST_ANAME" name="g_CUST_ANAME" class="KU0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_CUST_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KU0010010-KU0010010form3-h_CUST_ANAME" name="h_CUST_ANAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.geth_CUST_ANAME()) %>">
<script class="expj-script-KU0010010-KU0010010form3-h_CUST_ANAME">
expj.KU0010010.KU0010010form3.h_CUST_ANAME = {};
expj.KU0010010.KU0010010form3.h_CUST_ANAME.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/h_CUST_ANAME.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.h_CUST_ANAME.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-h_CUST_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'h_CUST_ANAME', this);
  });
  expj.KU0010010.KU0010010form3.h_CUST_ANAME.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.h_CUST_ANAME.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/h_CUST_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-h_CUST_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form3-g_CUST_ITEM_CD">
expj.KU0010010.KU0010010form3.g_CUST_ITEM_CD = {};
expj.KU0010010.KU0010010form3.g_CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/g_CUST_ITEM_CD.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.g_CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-g_CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'g_CUST_ITEM_CD', this);
  });
  expj.KU0010010.KU0010010form3.g_CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.g_CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/g_CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-g_CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form3-g_CUST_ITEM_CD" name="g_CUST_ITEM_CD" class="KU0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_CUST_ITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form3-g_CUST_ITEM_NAME">
expj.KU0010010.KU0010010form3.g_CUST_ITEM_NAME = {};
expj.KU0010010.KU0010010form3.g_CUST_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/g_CUST_ITEM_NAME.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.g_CUST_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-g_CUST_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'g_CUST_ITEM_NAME', this);
  });
  expj.KU0010010.KU0010010form3.g_CUST_ITEM_NAME.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.g_CUST_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/g_CUST_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-g_CUST_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form3-g_CUST_ITEM_NAME" name="g_CUST_ITEM_NAME" class="KU0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_CUST_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KU0010010-KU0010010form3-h_CUST_ITEM_CD" name="h_CUST_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.geth_CUST_ITEM_CD()) %>">
<script class="expj-script-KU0010010-KU0010010form3-h_CUST_ITEM_CD">
expj.KU0010010.KU0010010form3.h_CUST_ITEM_CD = {};
expj.KU0010010.KU0010010form3.h_CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/h_CUST_ITEM_CD.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.h_CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-h_CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'h_CUST_ITEM_CD', this);
  });
  expj.KU0010010.KU0010010form3.h_CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.h_CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/h_CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-h_CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KU0010010-KU0010010form3-h_MODIFY_CNT" name="h_MODIFY_CNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.geth_MODIFY_CNT()) %>">
<script class="expj-script-KU0010010-KU0010010form3-h_MODIFY_CNT">
expj.KU0010010.KU0010010form3.h_MODIFY_CNT = {};
expj.KU0010010.KU0010010form3.h_MODIFY_CNT.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/h_MODIFY_CNT.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.h_MODIFY_CNT.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-h_MODIFY_CNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'h_MODIFY_CNT', this);
  });
  expj.KU0010010.KU0010010form3.h_MODIFY_CNT.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.h_MODIFY_CNT.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/h_MODIFY_CNT.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-h_MODIFY_CNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form3-g_ITEM_CD">
expj.KU0010010.KU0010010form3.g_ITEM_CD = {};
expj.KU0010010.KU0010010form3.g_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/g_ITEM_CD.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.g_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-g_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'g_ITEM_CD', this);
  });
  expj.KU0010010.KU0010010form3.g_ITEM_CD.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.g_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/g_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-g_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form3-g_ITEM_CD" name="g_ITEM_CD" class="KU0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_ITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form3-g_ITEM_NAME">
expj.KU0010010.KU0010010form3.g_ITEM_NAME = {};
expj.KU0010010.KU0010010form3.g_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/g_ITEM_NAME.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.g_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-g_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'g_ITEM_NAME', this);
  });
  expj.KU0010010.KU0010010form3.g_ITEM_NAME.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.g_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/g_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-g_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form3-g_ITEM_NAME" name="g_ITEM_NAME" class="KU0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KU0010010-KU0010010form3-h_ITEM_CD" name="h_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.geth_ITEM_CD()) %>">
<script class="expj-script-KU0010010-KU0010010form3-h_ITEM_CD">
expj.KU0010010.KU0010010form3.h_ITEM_CD = {};
expj.KU0010010.KU0010010form3.h_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/h_ITEM_CD.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.h_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-h_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'h_ITEM_CD', this);
  });
  expj.KU0010010.KU0010010form3.h_ITEM_CD.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.h_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/h_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-h_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KU0010010-KU0010010form3-h_AP_SECRTY_TYP" name="h_AP_SECRTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.geth_AP_SECRTY_TYP()) %>">
<script class="expj-script-KU0010010-KU0010010form3-h_AP_SECRTY_TYP">
expj.KU0010010.KU0010010form3.h_AP_SECRTY_TYP = {};
expj.KU0010010.KU0010010form3.h_AP_SECRTY_TYP.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/h_AP_SECRTY_TYP.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.h_AP_SECRTY_TYP.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-h_AP_SECRTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'h_AP_SECRTY_TYP', this);
  });
  expj.KU0010010.KU0010010form3.h_AP_SECRTY_TYP.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.h_AP_SECRTY_TYP.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/h_AP_SECRTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-h_AP_SECRTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010form3-g_CUST_ODR_NO">
expj.KU0010010.KU0010010form3.g_CUST_ODR_NO = {};
expj.KU0010010.KU0010010form3.g_CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/g_CUST_ODR_NO.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.g_CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-g_CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'g_CUST_ODR_NO', this);
  });
  expj.KU0010010.KU0010010form3.g_CUST_ODR_NO.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.g_CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/g_CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-g_CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0010010-KU0010010form3-g_CUST_ODR_NO" name="g_CUST_ODR_NO" class="KU0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0010010Struct.getg_CUST_ODR_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KU0010010-KU0010010form3-h_MRP_ODR_TYP" name="h_MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0010010Struct.geth_MRP_ODR_TYP()) %>">
<script class="expj-script-KU0010010-KU0010010form3-h_MRP_ODR_TYP">
expj.KU0010010.KU0010010form3.h_MRP_ODR_TYP = {};
expj.KU0010010.KU0010010form3.h_MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute KU0010010form3/h_MRP_ODR_TYP.onDecision');
  expj.KU0010010.KU0010010form3.executeAllOnDecision();
  expj.KU0010010.executeAllOnDecision();
};
expj.KU0010010.KU0010010form3.h_MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010form3-h_MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0010010', 'KU0010010form3', 'h_MRP_ODR_TYP', this);
  });
  expj.KU0010010.KU0010010form3.h_MRP_ODR_TYP.executePScriptOnLoad();
};

expj.KU0010010.KU0010010form3.h_MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute KU0010010form3/h_MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010form3-h_MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
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
<!--elevent end --><!--eight start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--eight end --><!--nine start --><div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KU0010010 Revision: 1.12  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KU0010010-KU0010010button0">
expj.KU0010010.KU0010010button0 = {};
expj.KU0010010.KU0010010button0.executeAllOnDecision = function () {
  console.log('execute KU0010010button0.onDecision');
};
expj.KU0010010.KU0010010button0.executeOnLoad = function () {
  expj.KU0010010.KU0010010button0.executePScriptOnLoad();
};

expj.KU0010010.KU0010010button0.executePScriptOnLoad = function () {
  console.log('execute KU0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0010010-KU0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0010010-KU0010010button0-clear">
expj.KU0010010.KU0010010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0010010form1/r_SEL_PTN1,_KU0010010form1/r_SEL_PTN2@KU0010010Servlet,,$ZZ07008"
expj.KU0010010.KU0010010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0010010', 'KU0010010button0', '_KU0010010form1/r_SEL_PTN1,_KU0010010form1/r_SEL_PTN2', 'KU0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0010010', response);
expj.common.updateBusinessScreenTab('KU0010010', contents);
};
expj.common.pscript.callConfirm('KU0010010', 'KU0010010button0', 'ZZ07008', okEvent);
};
expj.KU0010010.KU0010010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010button0.clear['onClick' + i])) {
        expj.KU0010010.KU0010010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010button0.clear.executeAllOnDecision = function () {
};
expj.KU0010010.KU0010010button0.clear.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010button0', 'clear', this, 'Button');
    }
  });
  expj.KU0010010.KU0010010button0.clear.executePScriptOnLoad();
};

expj.KU0010010.KU0010010button0.clear.executePScriptOnLoad = function () {
  console.log('execute KU0010010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0010010-KU0010010button0-clear" name="clear" class="KU0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KU0010010-KU0010010button0-close">
expj.KU0010010.KU0010010button0.close = {};
// script1="onClick;0;CLOSE"
expj.KU0010010.KU0010010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KU0010010');
};
expj.KU0010010.KU0010010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0010010.KU0010010button0.close['onClick' + i])) {
        expj.KU0010010.KU0010010button0.close['onClick' + i]();
      }
    }
  }
};
expj.KU0010010.KU0010010button0.close.executeAllOnDecision = function () {
};
expj.KU0010010.KU0010010button0.close.executeOnLoad = function () {
  $('#expj-KU0010010-KU0010010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0010010', 'KU0010010button0', 'close', this, 'Button');
    }
  });
  expj.KU0010010.KU0010010button0.close.executePScriptOnLoad();
};

expj.KU0010010.KU0010010button0.close.executePScriptOnLoad = function () {
  console.log('execute KU0010010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KU0010010-KU0010010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0010010-KU0010010button0-close" name="close" class="KU0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
<!--nine end --></div><!-- /table1 -->
</div><!-- expj-business-screen-KU0010010 (END)-->
<%
MessageStruct msgStruct = aKU0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KU0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KU0010010)) {
  expj.common.treeInstanceMap.KU0010010 = {};
}
expj.common.treeInstanceMap.KU0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KU0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KU0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KU0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KU0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KU0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KU0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KU0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KU0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0010010)) {
  expj.common.detailDialogMap.KU0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KU0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.KU0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KU0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KU0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KU0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KU0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KU0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KU0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KU0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KU0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KU0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KU0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KU0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KU0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KU0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KU0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KU0010010)) {
  expj.common.viewInstanceMap.KU0010010 = {};
}
expj.common.viewInstanceMap.KU0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.KU0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KU0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KU0010010.<%=viewId %>.init = function () {
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
    expj.KU0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KU0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KU0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KU0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KU0010010_init">
/**
 * KU0010010用のロード完了時初期化関数
 */
expj.KU0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KU0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KU0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KU0010010');
  expj.common.calendarInstanceMap.KU0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KU0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KU0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.KU0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KU0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KU0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KU0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KU0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KU0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KU0010010-<%=detailId %>');
<%
 }
%>
  try{expj.KU0010010.KU0010010form1.g_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form1.k_MODE.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form1.PeekerOrdCd.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form1.h_RESULT.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form1.r_SEL_PTN1.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form1.g_PART_DLV_SEQ_NO.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form1.r_SEL_PTN2.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form1.g_SLIP_CD.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form1.PeekerSlipCd.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010button1.search.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.g_DESINATED_SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.PeekerShipDate.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY2.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.g_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.h_REST_SHIP_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.h_PARTIAL_SHIP_INST_FLG.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.g_REST_SHIP_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.g_STOCK_UNIT2.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.g_WH_CD.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.g_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.g_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.h_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.c_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.g_DIRECT_DLV_FLG.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010button2.insert.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010button2.torikeshi.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.g_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.g_CUST_ANAME.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.h_CUST_ANAME.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.g_CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.g_CUST_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.h_CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.h_MODIFY_CNT.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.g_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.g_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.h_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.h_AP_SECRTY_TYP.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.g_CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.h_MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010button0.clear.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010button0.close.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form1.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010button1.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form2.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010button2.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010form3.executeOnLoad();}catch(e){};
  try{expj.KU0010010.KU0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KU0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KU0010010', 'KU0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KU0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KU0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.KU0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KU0010010', '<%=request.getContextPath() %>');
};

/**
 * KU0010010の全体onDecision処理
 */
expj.KU0010010.executeAllOnDecision = function () {
  expj.KU0010010.KU0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KU0010010_console">
expj.KU0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>