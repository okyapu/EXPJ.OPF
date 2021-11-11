<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:57:10 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KA0040\KA0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KA0040.*" %>
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
<jsp:useBean id="aKA0040010Control" class="com.nec.jp.orteus.metamorBase.KA0040.KA0040010Control" scope="request"/>
<jsp:useBean id="aKA0040010Struct" class="com.nec.jp.orteus.metamorBase.KA0040.KA0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製品単価メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0040/jsp/KA0040010.jsp,v $
$Author: geng-jia $     
$Revision: 1.11 $ $Date: 2017/02/22 02:06:55 $
********************************************************* --%>
<html>
<head>
<title>製品単価メンテナンス</title>
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
<script class="expj-script-KA0040010_init">
  // KA0040010名前空間
  expj.KA0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

<%
// 金額の書式
String costColKind = "OBT_NUMBER_P;14.2;FLOOR;4";
/*if(aKA0040010Struct.getPRICE_ROUND_TYP() != null && aKA0040010Struct.getDECIMAL_FIG() != null
&& "".equals(aKA0040010Struct.getPRICE_ROUND_TYP()) == false && "".equals(aKA0040010Struct.getDECIMAL_FIG()) == false){
    costColKind = Kind.convertNumeric(Kind.NUMBER,Kind.Z,14,2,aKA0040010Struct.getPRICE_ROUND_TYP(),aKA0040010Struct.getDECIMAL_FIG());
}*/
%>


  <div id="expj-business-screen-KA0040010" data-screen="KA0040010" data-newdata="<%=aKA0040010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style=""></div><!--/td-->

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

              <script class="expj-script-KA0040010-KA0040010form1">
expj.KA0040010.KA0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.KA0040010.KA0040010form1.onLoad0 = function () {
  console.log('KA0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.KA0040010.KA0040010form1.onDecision0 = function () {
  console.log('KA0040010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KA0040010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KA0040010button1/select"
expj.KA0040010.KA0040010form1.child0 = function () {
  console.log('KA0040010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button1/select');
};
// script4="child;1;MASK;_KA0040010button1/select"
expj.KA0040010.KA0040010form1.child1 = function () {
  console.log('KA0040010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button1/select');
};
// script5="onDecision;1;CHK;?KA0040010view1/*[eq]NORMAL[or]?KA0040010view1/*[eq]NOT_FOUND[or]?KA0040010view1/*[eq]TOO_MANY@*2,*3"
expj.KA0040010.KA0040010form1.onDecision1 = function () {
  console.log('KA0040010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040010form1', '?KA0040010view1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040010form1', '?KA0040010view1/*'), '[eq]', 'NOT_FOUND') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040010form1', '?KA0040010view1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_KA0040010button2/append"
expj.KA0040010.KA0040010form1.child2 = function () {
  console.log('KA0040010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/append');
};
// script7="child;3;MASK;_KA0040010button2/append"
expj.KA0040010.KA0040010form1.child3 = function () {
  console.log('KA0040010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/append');
};
// script8="onDecision;2;CHK;?KA0040010view1/?[eq]SINGLE@*4,*5"
expj.KA0040010.KA0040010form1.onDecision2 = function () {
  console.log('KA0040010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040010form1', '?KA0040010view1/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;4;UNMASK;_KA0040010button2/modify,_KA0040010button2/copy,_KA0040010button2/erase"
expj.KA0040010.KA0040010form1.child4 = function () {
  console.log('KA0040010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/modify');
expj.common.pscript.setUnMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/copy');
expj.common.pscript.setUnMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/erase');
};
// script10="child;5;MASK;_KA0040010button2/modify,_KA0040010button2/copy,_KA0040010button2/erase"
expj.KA0040010.KA0040010form1.child5 = function () {
  console.log('KA0040010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/copy');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/erase');
};
// script11="onDecision;3;CHK;?KA0040010form1/ITEM_CD[neq]SAME[or]?KA0040010form1/CUST_CD[neq]SAME@*6"
expj.KA0040010.KA0040010form1.onDecision3 = function () {
  console.log('KA0040010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040010form1', '?KA0040010form1/ITEM_CD'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040010form1', '?KA0040010form1/CUST_CD'), '[neq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script12="child;6;MASK;_KA0040010button2/append,_KA0040010button2/modify,_KA0040010button2/copy,_KA0040010button2/erase"
expj.KA0040010.KA0040010form1.child6 = function () {
  console.log('KA0040010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/append');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/copy');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/erase');
};
// script13="onDecision;4;CHK;_KA0040010form1/h_SCREENMOVE_TYP[neq]@*7"
expj.KA0040010.KA0040010form1.onDecision4 = function () {
  console.log('KA0040010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040010form1', '_KA0040010form1/h_SCREENMOVE_TYP'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script14="child;7;MASK;_KA0040010button1/select,_KA0040010button2/append,_KA0040010button2/modify,_KA0040010button2/copy,_KA0040010button2/erase,_KA0040010button0/clear"
expj.KA0040010.KA0040010form1.child7 = function () {
  console.log('KA0040010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button1/select');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/append');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/copy');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button2/erase');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040010form1', '_KA0040010button0/clear');
};
expj.KA0040010.KA0040010form1.executeAllOnDecision = function () {
  console.log('execute KA0040010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040010form1['onDecision' + i])) {
        expj.KA0040010.KA0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040010form1.executeOnLoad = function () {
  expj.KA0040010.KA0040010form1.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KA0040010.KA0040010form1['onLoad' + i])) {
      expj.KA0040010.KA0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KA0040010-KA0040010form1" action="KA0040010Servlet" name="KA0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010form1-ITEM_CD">
expj.KA0040010.KA0040010form1.ITEM_CD = {};
expj.KA0040010.KA0040010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/ITEM_CD.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'ITEM_CD', this);
  });
  expj.KA0040010.KA0040010form1.ITEM_CD.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040010form1-ITEM_CD" name="ITEM_CD" class="KA0040010-focus-move  required-value expj-KA0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010form1-PeekerItemCd">
expj.KA0040010.KA0040010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_KA0040010form1/ITEM_CD@<%=contextNo%>"
expj.KA0040010.KA0040010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0040010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040010form1', '_KA0040010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_07%&%';
parameterValues += 'TARGET_FIELD%=%_KA0040010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0040010.KA0040010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040010form1.PeekerItemCd['onClick' + i])) {
        expj.KA0040010.KA0040010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.KA0040010.KA0040010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0040010-KA0040010form1-PeekerItemCd" class="KA0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010form1-ITEM_NAME">
expj.KA0040010.KA0040010form1.ITEM_NAME = {};
expj.KA0040010.KA0040010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/ITEM_NAME.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'ITEM_NAME', this);
  });
  expj.KA0040010.KA0040010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040010form1-ITEM_NAME" name="ITEM_NAME" class="KA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getITEM_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<input type="hidden" id="expj-KA0040010-KA0040010form1-h_SCREENMOVE_TYP" name="h_SCREENMOVE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0040010Struct.geth_SCREENMOVE_TYP()) %>">
<script class="expj-script-KA0040010-KA0040010form1-h_SCREENMOVE_TYP">
expj.KA0040010.KA0040010form1.h_SCREENMOVE_TYP = {};
expj.KA0040010.KA0040010form1.h_SCREENMOVE_TYP.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/h_SCREENMOVE_TYP.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.h_SCREENMOVE_TYP.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-h_SCREENMOVE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'h_SCREENMOVE_TYP', this);
  });
  expj.KA0040010.KA0040010form1.h_SCREENMOVE_TYP.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.h_SCREENMOVE_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/h_SCREENMOVE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-h_SCREENMOVE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KA0040010-KA0040010form1-h_APPR_ID" name="h_APPR_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0040010Struct.geth_APPR_ID()) %>">
<script class="expj-script-KA0040010-KA0040010form1-h_APPR_ID">
expj.KA0040010.KA0040010form1.h_APPR_ID = {};
expj.KA0040010.KA0040010form1.h_APPR_ID.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/h_APPR_ID.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.h_APPR_ID.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-h_APPR_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'h_APPR_ID', this);
  });
  expj.KA0040010.KA0040010form1.h_APPR_ID.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.h_APPR_ID.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/h_APPR_ID.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-h_APPR_ID');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010form1-CUST_CD">
expj.KA0040010.KA0040010form1.CUST_CD = {};
expj.KA0040010.KA0040010form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/CUST_CD.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'CUST_CD', this);
  });
  expj.KA0040010.KA0040010form1.CUST_CD.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040010form1-CUST_CD" name="CUST_CD" class="KA0040010-focus-move  required-value expj-KA0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010form1-PeekerVendCd">
expj.KA0040010.KA0040010form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_KA0040010form1/CUST_CD@<%=contextNo%>"
expj.KA0040010.KA0040010form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0040010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040010form1', '_KA0040010form1/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KA0040010form1/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0040010.KA0040010form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040010form1.PeekerVendCd['onClick' + i])) {
        expj.KA0040010.KA0040010form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040010form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040010form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040010form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.KA0040010.KA0040010form1.PeekerVendCd.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0040010-KA0040010form1-PeekerVendCd" class="KA0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010form1-CUST_NAME">
expj.KA0040010.KA0040010form1.CUST_NAME = {};
expj.KA0040010.KA0040010form1.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/CUST_NAME.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.CUST_NAME.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'CUST_NAME', this);
  });
  expj.KA0040010.KA0040010form1.CUST_NAME.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040010form1-CUST_NAME" name="CUST_NAME" class="KA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getCUST_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KA0040010-KA0040010form1-PRICE_ROUND_TYP" name="PRICE_ROUND_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getPRICE_ROUND_TYP()) %>">
<script class="expj-script-KA0040010-KA0040010form1-PRICE_ROUND_TYP">
expj.KA0040010.KA0040010form1.PRICE_ROUND_TYP = {};
expj.KA0040010.KA0040010form1.PRICE_ROUND_TYP.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/PRICE_ROUND_TYP.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.PRICE_ROUND_TYP.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-PRICE_ROUND_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'PRICE_ROUND_TYP', this);
  });
  expj.KA0040010.KA0040010form1.PRICE_ROUND_TYP.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.PRICE_ROUND_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/PRICE_ROUND_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-PRICE_ROUND_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUR_CD",rb)%></span><!-- 通貨コード --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010form1-CUR_CD">
expj.KA0040010.KA0040010form1.CUR_CD = {};
expj.KA0040010.KA0040010form1.CUR_CD.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/CUR_CD.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.CUR_CD.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'CUR_CD', this);
  });
  expj.KA0040010.KA0040010form1.CUR_CD.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040010form1-CUR_CD" name="CUR_CD" class="KA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getCUR_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010form1-CUR_NAME">
expj.KA0040010.KA0040010form1.CUR_NAME = {};
expj.KA0040010.KA0040010form1.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/CUR_NAME.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.CUR_NAME.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'CUR_NAME', this);
  });
  expj.KA0040010.KA0040010form1.CUR_NAME.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040010form1-CUR_NAME" name="CUR_NAME" class="KA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getCUR_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<input type="hidden" id="expj-KA0040010-KA0040010form1-h_APR_UNIT_COST" name="h_APR_UNIT_COST" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0040010Struct.geth_APR_UNIT_COST()) %>">
<script class="expj-script-KA0040010-KA0040010form1-h_APR_UNIT_COST">
expj.KA0040010.KA0040010form1.h_APR_UNIT_COST = {};
expj.KA0040010.KA0040010form1.h_APR_UNIT_COST.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/h_APR_UNIT_COST.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.h_APR_UNIT_COST.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-h_APR_UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'h_APR_UNIT_COST', this);
  });
  expj.KA0040010.KA0040010form1.h_APR_UNIT_COST.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.h_APR_UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/h_APR_UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-h_APR_UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KA0040010-KA0040010form1-DECIMAL_FIG" name="DECIMAL_FIG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getDECIMAL_FIG()) %>">
<script class="expj-script-KA0040010-KA0040010form1-DECIMAL_FIG">
expj.KA0040010.KA0040010form1.DECIMAL_FIG = {};
expj.KA0040010.KA0040010form1.DECIMAL_FIG.executeAllOnDecision = function () {
  console.log('execute KA0040010form1/DECIMAL_FIG.onDecision');
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040010form1.DECIMAL_FIG.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010form1-DECIMAL_FIG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040010form1', 'DECIMAL_FIG', this);
  });
  expj.KA0040010.KA0040010form1.DECIMAL_FIG.executePScriptOnLoad();
};

expj.KA0040010.KA0040010form1.DECIMAL_FIG.executePScriptOnLoad = function () {
  console.log('execute KA0040010form1/DECIMAL_FIG.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010form1-DECIMAL_FIG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KA0040010-KA0040010button1">
expj.KA0040010.KA0040010button1 = {};
expj.KA0040010.KA0040010button1.executeAllOnDecision = function () {
  console.log('execute KA0040010button1.onDecision');
};
expj.KA0040010.KA0040010button1.executeOnLoad = function () {
  expj.KA0040010.KA0040010button1.executePScriptOnLoad();
};

expj.KA0040010.KA0040010button1.executePScriptOnLoad = function () {
  console.log('execute KA0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0040010-KA0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0040010-KA0040010button1-select">
expj.KA0040010.KA0040010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0040010form1/*@KA0040010Servlet"
expj.KA0040010.KA0040010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0040010', 'KA0040010button1', '_KA0040010form1/*', 'KA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0040010', response);
expj.common.updateBusinessScreenTab('KA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KA0040010.KA0040010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040010button1.select['onClick' + i])) {
        expj.KA0040010.KA0040010button1.select['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040010button1.select.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040010button1.select.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040010button1', 'select', this, 'Button');
    }
  });
  expj.KA0040010.KA0040010button1.select.executePScriptOnLoad();
};

expj.KA0040010.KA0040010button1.select.executePScriptOnLoad = function () {
  console.log('execute KA0040010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0040010-KA0040010button1-select" name="select" class="KA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-KA0040010-KA0040010view1">
expj.KA0040010.KA0040010view1 = {};
expj.KA0040010.KA0040010view1.executeAllOnClick = function () {
};
expj.KA0040010.KA0040010view1.executeAllOnDecision = function () {
  console.log('execute KA0040010view1.onDecision');
};
expj.KA0040010.KA0040010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KA0040010view1", "expj.KA0040010.KA0040010view1.executeAllOnClick");
%>
  expj.KA0040010.KA0040010view1.executePScriptOnLoad();
};

expj.KA0040010.KA0040010view1.executePScriptOnLoad = function () {
  console.log('execute KA0040010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KA0040010-KA0040010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aKA0040010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String KA0040010view1_Id = "KA0040010view1";
 String KA0040010view1_select = "single";
 String KA0040010view1_sortable = "true";
 String KA0040010view1_resize = "true";
 String KA0040010view1_scroll = "true";
 StringBuffer KA0040010view1_HB = new StringBuffer();
 StringBuffer KA0040010view1_DB = new StringBuffer();
%>
<%
 KA0040010view1_select = "single";
 KA0040010view1_sortable = "true";
 KA0040010view1_resize = "true";
 KA0040010view1_scroll = "true";
%>
<%
 KA0040010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KA0040010view1_sortable).append("}").append(",");
%>
     
<%
KA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'w_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KA0040010view1_sortable).append("}").append(",");
KA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb))).append("', 'name':'p_EFF_PHASE_IN_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KA0040010view1_sortable).append("}").append(",");
KA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb))).append("', 'name':'p_UNIT_COST_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KA0040010view1_sortable).append("}").append(",");
KA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'p_UNIT_COST_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KA0040010view1_sortable).append("}").append(",");
KA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST",rb))).append("', 'name':'p_UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KA0040010view1_sortable).append("}").append(",");
%>
<%
 int aKA0040010StructLength = aKA0040010Control.getListsize();
 final KA0040010Struct structBackup = aKA0040010Struct;
 aKA0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKA0040010StructLength; ++loopCount) {
  if((aKA0040010Struct = (KA0040010Struct) aKA0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKA0040010Struct", aKA0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KA0040010view1_DB.append("[");
 KA0040010view1_DB.append(loopCount);
 KA0040010view1_DB.append(",").append("'<span id=\"expj-KA0040010-KA0040010view1-w_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KA0040010-KA0040010view1-w_MODIFY_COUNT\" data-name=\"w_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKA0040010Struct.getw_MODIFY_COUNT())).append("</span>'");
 KA0040010view1_DB.append(",").append("'<span id=\"expj-KA0040010-KA0040010view1-p_EFF_PHASE_IN_DATE-").append(loopCount).append("\" class=\"expj-label expj-KA0040010-KA0040010view1-p_EFF_PHASE_IN_DATE\" data-name=\"p_EFF_PHASE_IN_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKA0040010Struct.getp_EFF_PHASE_IN_DATE())).append("</span>'");
 KA0040010view1_DB.append(",").append("'<span id=\"expj-KA0040010-KA0040010view1-p_UNIT_COST_NAME-").append(loopCount).append("\" class=\"expj-label expj-KA0040010-KA0040010view1-p_UNIT_COST_NAME\" data-name=\"p_UNIT_COST_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKA0040010Struct.getp_UNIT_COST_NAME())).append("</span>'");
 KA0040010view1_DB.append(",").append("'<span id=\"expj-KA0040010-KA0040010view1-p_UNIT_COST_TYP-").append(loopCount).append("\" class=\"expj-label expj-KA0040010-KA0040010view1-p_UNIT_COST_TYP\" data-name=\"p_UNIT_COST_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKA0040010Struct.getp_UNIT_COST_TYP())).append("</span>'");
 KA0040010view1_DB.append(",").append("'<span id=\"expj-KA0040010-KA0040010view1-p_UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-KA0040010-KA0040010view1-p_UNIT_COST\" data-name=\"p_UNIT_COST\" data-view=\"true\" data-kind=\"").append( costColKind ).append("\">").append(TypeConverter.sanitizer(aKA0040010Struct.getp_UNIT_COST())).append("</span>'");
 KA0040010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKA0040010StructLength) {
   KA0040010view1_DB.append(",");
  }
 }
 aKA0040010Struct = structBackup;
 viewIdList.add(KA0040010view1_Id);
 viewSelectList.add(KA0040010view1_select);
 viewResizeList.add(KA0040010view1_resize);
 viewScrollList.add(KA0040010view1_scroll);
 viewHeaderDataList.add(KA0040010view1_HB);
 viewBodyDataList.add(KA0040010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-KA0040010-KA0040010button2">
expj.KA0040010.KA0040010button2 = {};
expj.KA0040010.KA0040010button2.executeAllOnDecision = function () {
  console.log('execute KA0040010button2.onDecision');
};
expj.KA0040010.KA0040010button2.executeOnLoad = function () {
  expj.KA0040010.KA0040010button2.executePScriptOnLoad();
};

expj.KA0040010.KA0040010button2.executePScriptOnLoad = function () {
  console.log('execute KA0040010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0040010-KA0040010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0040010-KA0040010button2-append">
expj.KA0040010.KA0040010button2.append = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_KA0040010form1/*@KA0040010Servlet"
expj.KA0040010.KA0040010button2.append.onClick0 = function () {
  console.log('append script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0040010', 'KA0040010button2', '_KA0040010form1/*', 'KA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0040010', response);
expj.common.changeBusinessScreenTab('KA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KA0040010.KA0040010button2.append.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040010button2.append['onClick' + i])) {
        expj.KA0040010.KA0040010button2.append['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040010button2.append.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040010button2.append.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010button2-append').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040010button2', 'append', this, 'Button');
    }
  });
  expj.KA0040010.KA0040010button2.append.executePScriptOnLoad();
};

expj.KA0040010.KA0040010button2.append.executePScriptOnLoad = function () {
  console.log('execute KA0040010button2/append.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010button2-append');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0040010-KA0040010button2-append" name="append" class="KA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010button2-modify">
expj.KA0040010.KA0040010button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_KA0040010form1/*,_KA0040010view1/+@KA0040010Servlet"
expj.KA0040010.KA0040010button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0040010', 'KA0040010button2', '_KA0040010form1/*,_KA0040010view1/+', 'KA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0040010', response);
expj.common.changeBusinessScreenTab('KA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KA0040010.KA0040010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040010button2.modify['onClick' + i])) {
        expj.KA0040010.KA0040010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040010button2.modify.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040010button2.modify.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040010button2', 'modify', this, 'Button');
    }
  });
  expj.KA0040010.KA0040010button2.modify.executePScriptOnLoad();
};

expj.KA0040010.KA0040010button2.modify.executePScriptOnLoad = function () {
  console.log('execute KA0040010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0040010-KA0040010button2-modify" name="modify" class="KA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010button2-copy">
expj.KA0040010.KA0040010button2.copy = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_KA0040010form1/*,_KA0040010view1/+@KA0040010Servlet"
expj.KA0040010.KA0040010button2.copy.onClick0 = function () {
  console.log('copy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0040010', 'KA0040010button2', '_KA0040010form1/*,_KA0040010view1/+', 'KA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0040010', response);
expj.common.changeBusinessScreenTab('KA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KA0040010.KA0040010button2.copy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040010button2.copy['onClick' + i])) {
        expj.KA0040010.KA0040010button2.copy['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040010button2.copy.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040010button2.copy.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010button2-copy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040010button2', 'copy', this, 'Button');
    }
  });
  expj.KA0040010.KA0040010button2.copy.executePScriptOnLoad();
};

expj.KA0040010.KA0040010button2.copy.executePScriptOnLoad = function () {
  console.log('execute KA0040010button2/copy.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010button2-copy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0040010-KA0040010button2-copy" name="copy" class="KA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010button2-erase">
expj.KA0040010.KA0040010button2.erase = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0040010form1/*,_KA0040010view1/+@KA0040010Servlet,,$ZZ07004"
expj.KA0040010.KA0040010button2.erase.onClick0 = function () {
  console.log('erase script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0040010', 'KA0040010button2', '_KA0040010form1/*,_KA0040010view1/+', 'KA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0040010', response);
expj.common.updateBusinessScreenTab('KA0040010', contents);
};
expj.common.pscript.callConfirm('KA0040010', 'KA0040010button2', 'ZZ07004', okEvent);
};
expj.KA0040010.KA0040010button2.erase.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040010button2.erase['onClick' + i])) {
        expj.KA0040010.KA0040010button2.erase['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040010button2.erase.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040010button2.erase.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010button2-erase').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040010button2', 'erase', this, 'Button');
    }
  });
  expj.KA0040010.KA0040010button2.erase.executePScriptOnLoad();
};

expj.KA0040010.KA0040010button2.erase.executePScriptOnLoad = function () {
  console.log('execute KA0040010button2/erase.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010button2-erase');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0040010-KA0040010button2-erase" name="erase" class="KA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KA0040010 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KA0040010-KA0040010button0">
expj.KA0040010.KA0040010button0 = {};
expj.KA0040010.KA0040010button0.executeAllOnDecision = function () {
  console.log('execute KA0040010button0.onDecision');
};
expj.KA0040010.KA0040010button0.executeOnLoad = function () {
  expj.KA0040010.KA0040010button0.executePScriptOnLoad();
};

expj.KA0040010.KA0040010button0.executePScriptOnLoad = function () {
  console.log('execute KA0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0040010-KA0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0040010-KA0040010button0-clear">
expj.KA0040010.KA0040010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KA0040010Servlet,,$ZZ07008"
expj.KA0040010.KA0040010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0040010', 'KA0040010button0', '', 'KA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0040010', response);
expj.common.updateBusinessScreenTab('KA0040010', contents);
};
expj.common.pscript.callConfirm('KA0040010', 'KA0040010button0', 'ZZ07008', okEvent);
};
expj.KA0040010.KA0040010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040010button0.clear['onClick' + i])) {
        expj.KA0040010.KA0040010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040010button0.clear.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040010button0.clear.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040010button0', 'clear', this, 'Button');
    }
  });
  expj.KA0040010.KA0040010button0.clear.executePScriptOnLoad();
};

expj.KA0040010.KA0040010button0.clear.executePScriptOnLoad = function () {
  console.log('execute KA0040010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0040010-KA0040010button0-clear" name="clear" class="KA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040010button0-close">
expj.KA0040010.KA0040010button0.close = {};
// script1="onClick;0;CLOSE"
expj.KA0040010.KA0040010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KA0040010');
};
expj.KA0040010.KA0040010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040010button0.close['onClick' + i])) {
        expj.KA0040010.KA0040010button0.close['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040010button0.close.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040010button0.close.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040010button0', 'close', this, 'Button');
    }
  });
  expj.KA0040010.KA0040010button0.close.executePScriptOnLoad();
};

expj.KA0040010.KA0040010button0.close.executePScriptOnLoad = function () {
  console.log('execute KA0040010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0040010-KA0040010button0-close" name="close" class="KA0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KA0040010 (END)-->
<%
MessageStruct msgStruct = aKA0040010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KA0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KA0040010)) {
  expj.common.treeInstanceMap.KA0040010 = {};
}
expj.common.treeInstanceMap.KA0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KA0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KA0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KA0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KA0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KA0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KA0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KA0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KA0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KA0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KA0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0040010)) {
  expj.common.detailDialogMap.KA0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KA0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.KA0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KA0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KA0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KA0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KA0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KA0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KA0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KA0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KA0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KA0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KA0040010)) {
  expj.common.viewInstanceMap.KA0040010 = {};
}
expj.common.viewInstanceMap.KA0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.KA0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KA0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KA0040010.<%=viewId %>.init = function () {
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
    expj.KA0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KA0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KA0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KA0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KA0040010_init">
/**
 * KA0040010用のロード完了時初期化関数
 */
expj.KA0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KA0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KA0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KA0040010');
  expj.common.calendarInstanceMap.KA0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KA0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KA0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KA0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KA0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KA0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KA0040010-<%=detailId %>');
<%
 }
%>
  try{expj.KA0040010.KA0040010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.h_SCREENMOVE_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.h_APPR_ID.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.PRICE_ROUND_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.h_APR_UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.DECIMAL_FIG.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010button1.select.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010button2.append.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010button2.modify.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010button2.copy.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010button2.erase.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010button0.clear.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010button0.close.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010form1.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010button1.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010view1.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010button2.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KA0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KA0040010', 'KA0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KA0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KA0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.KA0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KA0040010', '<%=request.getContextPath() %>');
};

/**
 * KA0040010の全体onDecision処理
 */
expj.KA0040010.executeAllOnDecision = function () {
  expj.KA0040010.KA0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KA0040010_console">
expj.KA0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>