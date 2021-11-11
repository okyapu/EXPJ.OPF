<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:41:22 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AG0040\AG0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AG0040.*" %>
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
<jsp:useBean id="aAG0040010Control" class="com.nec.jp.orteus.metamorBase.AG0040.AG0040010Control" scope="request"/>
<jsp:useBean id="aAG0040010Struct" class="com.nec.jp.orteus.metamorBase.AG0040.AG0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

在庫一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0040/jsp/AG0040010.jsp,v $
$Author: geng-jia $	
$Revision: 1.20 $ $Date: 2017/02/22 02:05:59 $
********************************************************* --%>
<html>
<head>
<title>在庫一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%ScreenMoveUtil su = new ScreenMoveUtil("AG0010010Servlet", so);%>

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
<script class="expj-script-AG0040010_init">
  // AG0040010名前空間
  expj.AG0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AG0040010" data-screen="AG0040010" data-newdata="<%=aAG0040010Control.isNewData() %>">
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
              <script class="expj-script-AG0040010-AG0040010form1">
expj.AG0040010.AG0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AG0040010.AG0040010form1.onLoad0 = function () {
  console.log('AG0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;?AG0040010view1/?[neq]NOT_SELECTED@*0,*2"
expj.AG0040010.AG0040010form1.onDecision0 = function () {
  console.log('AG0040010form1 script2');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?AG0040010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHK;?IN_PLANT_CD[eq]SAME[and]?IN_WH_CD[eq]SAME[and]?IN_VEND_CD[eq]SAME[and]?IN_JOB_ODR_CD[eq]SAME[and]?IN_ITEM_CD[eq]SAME[and]?IN_LOT_NO[eq]SAME[and]?c1_VIEW_TYP[eq]SAME[and]?c2_VIEW_TYP[eq]SAME[and]?c3_VIEW_TYP[eq]SAME@*1,*2"
expj.AG0040010.AG0040010form1.child0 = function () {
  console.log('AG0040010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_WH_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_LOT_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?c1_VIEW_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?c2_VIEW_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?c3_VIEW_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;UNMASK;_AG0040010button3/JobOdrAlc"
expj.AG0040010.AG0040010form1.child1 = function () {
  console.log('AG0040010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010button3/JobOdrAlc');
};
// script5="child;2;MASK;_AG0040010button3/JobOdrAlc,_AG0040010button3/LotOdrAlc"
expj.AG0040010.AG0040010form1.child2 = function () {
  console.log('AG0040010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010button3/JobOdrAlc');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010button3/LotOdrAlc');
};
// script6="onDecision;1;CHK;?AG0040010form1/*[eq]NORMAL[or]?AG0040010form1/*[eq]TOO_MANY@*3,*5"
expj.AG0040010.AG0040010form1.onDecision1 = function () {
  console.log('AG0040010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?AG0040010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?AG0040010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHK;?IN_PLANT_CD[eq]SAME[and]?IN_WH_CD[eq]SAME[and]?IN_VEND_CD[eq]SAME[and]?IN_JOB_ODR_CD[eq]SAME[and]?IN_ITEM_CD[eq]SAME[and]?IN_LOT_NO[eq]SAME[and]?c1_VIEW_TYP[eq]SAME[and]?c2_VIEW_TYP[eq]SAME[and]?c3_VIEW_TYP[eq]SAME@*4,*5"
expj.AG0040010.AG0040010form1.child3 = function () {
  console.log('AG0040010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_WH_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?IN_LOT_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?c1_VIEW_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?c2_VIEW_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?c3_VIEW_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AG0040010button0/CsvOut"
expj.AG0040010.AG0040010form1.child4 = function () {
  console.log('AG0040010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010button0/CsvOut');
};
// script9="child;5;MASK;_AG0040010button0/CsvOut,_AG0040010button3/LotOdrAlc"
expj.AG0040010.AG0040010form1.child5 = function () {
  console.log('AG0040010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010button0/CsvOut');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010button3/LotOdrAlc');
};
// script10="onLoad;1;CALL;child@6"
expj.AG0040010.AG0040010form1.onLoad1 = function () {
  console.log('AG0040010form1 script10');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child6)){this.child6();}
};
// script11="child;6;CHK;_AG0040010form1/h_lotCtrl[eq]true@,*7"
expj.AG0040010.AG0040010form1.child6 = function () {
  console.log('AG0040010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/h_lotCtrl'), '[eq]', 'true')) {

} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script12="onDecision;2;SELCHKT;AG0040010view1:_l_LOT_NO[neq]@*8,*10"
expj.AG0040010.AG0040010form1.onDecision2 = function () {
  console.log('AG0040010form1 script12');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AG0040010', 'AG0040010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_LOT_NO, '[neq]', '')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script13="child;7;MASK;_AG0040010button3/LotOdrAlc,_AG0040010form1/c3_VIEW_TYP"
expj.AG0040010.AG0040010form1.child7 = function () {
  console.log('AG0040010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010button3/LotOdrAlc');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010form1/c3_VIEW_TYP');
};
// script14="child;8;CHK;_AG0040010form1/c3_VIEW_TYP[eq]true@*9,*10"
expj.AG0040010.AG0040010form1.child8 = function () {
  console.log('AG0040010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/c3_VIEW_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script15="child;9;UNMASK;_AG0040010button3/LotOdrAlc@*11"
expj.AG0040010.AG0040010form1.child9 = function () {
  console.log('AG0040010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010button3/LotOdrAlc');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script16="child;10;MASK;_AG0040010button3/LotOdrAlc@*11"
expj.AG0040010.AG0040010form1.child10 = function () {
  console.log('AG0040010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010button3/LotOdrAlc');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script17="child;11;CHK;?AG0040010form1/*[eq]NORMAL[or]?AG0040010form1/*[eq]TOO_MANY@*3,*5"
expj.AG0040010.AG0040010form1.child11 = function () {
  console.log('AG0040010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?AG0040010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?AG0040010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script18="onDecision;3;CHK;?AG0040010form1/*[eq]TOO_MANY@*12"
expj.AG0040010.AG0040010form1.onDecision3 = function () {
  console.log('AG0040010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '?AG0040010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script19="child;12;MASK;_AG0040010button0/CsvOut"
expj.AG0040010.AG0040010form1.child12 = function () {
  console.log('AG0040010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_AG0040010button0/CsvOut');
};
expj.AG0040010.AG0040010form1.executeAllOnDecision = function () {
  console.log('execute AG0040010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010form1['onDecision' + i])) {
        expj.AG0040010.AG0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010form1.executeOnLoad = function () {
  expj.AG0040010.AG0040010form1.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AG0040010.AG0040010form1['onLoad' + i])) {
      expj.AG0040010.AG0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0040010-AG0040010form1" action="AG0040010Servlet" name="AG0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAG0040010Control.getReadStatusString()) %>" style="height:165px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:165px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:center"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-IN_PLANT_CD">
expj.AG0040010.AG0040010form1.IN_PLANT_CD = {};
expj.AG0040010.AG0040010form1.IN_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/IN_PLANT_CD.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.IN_PLANT_CD.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-IN_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'IN_PLANT_CD', this);
  });
  expj.AG0040010.AG0040010form1.IN_PLANT_CD.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.IN_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/IN_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-IN_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0040010-AG0040010form1-IN_PLANT_CD" name="IN_PLANT_CD" class="AG0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getIN_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-PeekerPlantCd">
expj.AG0040010.AG0040010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AG0040010form1/IN_PLANT_CD@<%=contextNo%>"
expj.AG0040010.AG0040010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0040010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AG0040010form1/IN_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0040010.AG0040010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010form1.PeekerPlantCd['onClick' + i])) {
        expj.AG0040010.AG0040010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0040010-AG0040010form1-PeekerPlantCd" class="AG0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-IN_PLANT_NAME">
expj.AG0040010.AG0040010form1.IN_PLANT_NAME = {};
expj.AG0040010.AG0040010form1.IN_PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/IN_PLANT_NAME.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.IN_PLANT_NAME.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-IN_PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'IN_PLANT_NAME', this);
  });
  expj.AG0040010.AG0040010form1.IN_PLANT_NAME.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.IN_PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/IN_PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-IN_PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0040010-AG0040010form1-IN_PLANT_NAME" name="IN_PLANT_NAME" class="AG0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getIN_PLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AG0040010-AG0040010form1-tempLot" name="tempLot" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0040010Struct.gettempLot()) %>">
<script class="expj-script-AG0040010-AG0040010form1-tempLot">
expj.AG0040010.AG0040010form1.tempLot = {};
expj.AG0040010.AG0040010form1.tempLot.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/tempLot.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.tempLot.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-tempLot').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'tempLot', this);
  });
  expj.AG0040010.AG0040010form1.tempLot.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.tempLot.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/tempLot.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-tempLot');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-IN_WH_CD">
expj.AG0040010.AG0040010form1.IN_WH_CD = {};
expj.AG0040010.AG0040010form1.IN_WH_CD.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/IN_WH_CD.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.IN_WH_CD.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-IN_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'IN_WH_CD', this);
  });
  expj.AG0040010.AG0040010form1.IN_WH_CD.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.IN_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/IN_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-IN_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0040010-AG0040010form1-IN_WH_CD" name="IN_WH_CD" class="AG0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getIN_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-PeekerWhCd">
expj.AG0040010.AG0040010form1.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AG0040010form1/IN_WH_CD@<%=contextNo%>"
expj.AG0040010.AG0040010form1.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0040010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AG0040010form1/IN_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0040010.AG0040010form1.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010form1.PeekerWhCd['onClick' + i])) {
        expj.AG0040010.AG0040010form1.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010form1.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010form1.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010form1', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010form1.PeekerWhCd.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0040010-AG0040010form1-PeekerWhCd" class="AG0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-IN_WH_NAME">
expj.AG0040010.AG0040010form1.IN_WH_NAME = {};
expj.AG0040010.AG0040010form1.IN_WH_NAME.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/IN_WH_NAME.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.IN_WH_NAME.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-IN_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'IN_WH_NAME', this);
  });
  expj.AG0040010.AG0040010form1.IN_WH_NAME.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.IN_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/IN_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-IN_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0040010-AG0040010form1-IN_WH_NAME" name="IN_WH_NAME" class="AG0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getIN_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-IN_VEND_CD">
expj.AG0040010.AG0040010form1.IN_VEND_CD = {};
expj.AG0040010.AG0040010form1.IN_VEND_CD.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/IN_VEND_CD.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.IN_VEND_CD.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-IN_VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'IN_VEND_CD', this);
  });
  expj.AG0040010.AG0040010form1.IN_VEND_CD.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.IN_VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/IN_VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-IN_VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0040010-AG0040010form1-IN_VEND_CD" name="IN_VEND_CD" class="AG0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getIN_VEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-PeekerVendCd">
expj.AG0040010.AG0040010form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AG0040010form1/IN_VEND_CD@<%=contextNo%>"
expj.AG0040010.AG0040010form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0040010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AG0040010form1/IN_VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0040010.AG0040010form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010form1.PeekerVendCd['onClick' + i])) {
        expj.AG0040010.AG0040010form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010form1.PeekerVendCd.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0040010-AG0040010form1-PeekerVendCd" class="AG0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-IN_VEND_NAME">
expj.AG0040010.AG0040010form1.IN_VEND_NAME = {};
expj.AG0040010.AG0040010form1.IN_VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/IN_VEND_NAME.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.IN_VEND_NAME.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-IN_VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'IN_VEND_NAME', this);
  });
  expj.AG0040010.AG0040010form1.IN_VEND_NAME.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.IN_VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/IN_VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-IN_VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0040010-AG0040010form1-IN_VEND_NAME" name="IN_VEND_NAME" class="AG0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getIN_VEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-IN_JOB_ODR_CD">
expj.AG0040010.AG0040010form1.IN_JOB_ODR_CD = {};
expj.AG0040010.AG0040010form1.IN_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/IN_JOB_ODR_CD.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.IN_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-IN_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'IN_JOB_ODR_CD', this);
  });
  expj.AG0040010.AG0040010form1.IN_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.IN_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/IN_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-IN_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0040010-AG0040010form1-IN_JOB_ODR_CD" name="IN_JOB_ODR_CD" class="AG0040010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getIN_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-PeekerIN_JOB_ODR_CD">
expj.AG0040010.AG0040010form1.PeekerIN_JOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AG0040010form1/IN_JOB_ODR_CD@<%=contextNo%>"
expj.AG0040010.AG0040010form1.PeekerIN_JOB_ODR_CD.onClick0 = function () {
  console.log('PeekerIN_JOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0040010';
var parameterValues = 'PeekerIN_JOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AG0040010form1/IN_JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0040010.AG0040010form1.PeekerIN_JOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010form1.PeekerIN_JOB_ODR_CD['onClick' + i])) {
        expj.AG0040010.AG0040010form1.PeekerIN_JOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010form1.PeekerIN_JOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010form1.PeekerIN_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-PeekerIN_JOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010form1', 'PeekerIN_JOB_ODR_CD', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010form1.PeekerIN_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.PeekerIN_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/PeekerIN_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-PeekerIN_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0040010-AG0040010form1-PeekerIN_JOB_ODR_CD" class="AG0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-IN_ITEM_CD">
expj.AG0040010.AG0040010form1.IN_ITEM_CD = {};
expj.AG0040010.AG0040010form1.IN_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/IN_ITEM_CD.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.IN_ITEM_CD.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-IN_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'IN_ITEM_CD', this);
  });
  expj.AG0040010.AG0040010form1.IN_ITEM_CD.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.IN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/IN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-IN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0040010-AG0040010form1-IN_ITEM_CD" name="IN_ITEM_CD" class="AG0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getIN_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-PeekerItemCd">
expj.AG0040010.AG0040010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AG0040010form1/IN_ITEM_CD@<%=contextNo%>"
expj.AG0040010.AG0040010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0040010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AG0040010form1/IN_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0040010.AG0040010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010form1.PeekerItemCd['onClick' + i])) {
        expj.AG0040010.AG0040010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0040010-AG0040010form1-PeekerItemCd" class="AG0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-IN_ITEM_NAME">
expj.AG0040010.AG0040010form1.IN_ITEM_NAME = {};
expj.AG0040010.AG0040010form1.IN_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/IN_ITEM_NAME.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.IN_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-IN_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'IN_ITEM_NAME', this);
  });
  expj.AG0040010.AG0040010form1.IN_ITEM_NAME.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.IN_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/IN_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-IN_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0040010-AG0040010form1-IN_ITEM_NAME" name="IN_ITEM_NAME" class="AG0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getIN_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AG0040010-AG0040010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AG0040010-AG0040010form1-DOWNLOAD_FILE">
expj.AG0040010.AG0040010form1.DOWNLOAD_FILE = {};
expj.AG0040010.AG0040010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/DOWNLOAD_FILE.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AG0040010.AG0040010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-IN_LOT_NO">
expj.AG0040010.AG0040010form1.IN_LOT_NO = {};
expj.AG0040010.AG0040010form1.IN_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/IN_LOT_NO.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.IN_LOT_NO.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-IN_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'IN_LOT_NO', this);
  });
  expj.AG0040010.AG0040010form1.IN_LOT_NO.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.IN_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/IN_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-IN_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0040010-AG0040010form1-IN_LOT_NO" name="IN_LOT_NO" class="AG0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0040010Struct.getIN_LOT_NO()) %>" maxlength="25" disabled></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-PeekerLotNo">
expj.AG0040010.AG0040010form1.PeekerLotNo = {};
// script1="onClick;0;PEEKER;_AG0040010form1/IN_LOT_NO@<%=contextNo%>"
expj.AG0040010.AG0040010form1.PeekerLotNo.onClick0 = function () {
  console.log('PeekerLotNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0040010';
var parameterValues = 'PeekerLotNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_AG0040010form1/IN_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_12%&%';
parameterValues += 'TARGET_FIELD%=%_AG0040010form1/IN_LOT_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0040010.AG0040010form1.PeekerLotNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010form1.PeekerLotNo['onClick' + i])) {
        expj.AG0040010.AG0040010form1.PeekerLotNo['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010form1.PeekerLotNo.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010form1.PeekerLotNo.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-PeekerLotNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010form1', 'PeekerLotNo', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010form1.PeekerLotNo.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.PeekerLotNo.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/PeekerLotNo.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-PeekerLotNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0040010-AG0040010form1-PeekerLotNo" class="AG0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0056",rb)%></span><!-- 表示対象 --></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-c1_VIEW_TYP">
expj.AG0040010.AG0040010form1.c1_VIEW_TYP = {};
expj.AG0040010.AG0040010form1.c1_VIEW_TYP.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/c1_VIEW_TYP.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.c1_VIEW_TYP.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-c1_VIEW_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010form1', 'c1_VIEW_TYP', this, 'CheckBox');
    }
  });
  expj.AG0040010.AG0040010form1.c1_VIEW_TYP.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.c1_VIEW_TYP.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/c1_VIEW_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-c1_VIEW_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c1_VIEW_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAG0040010Struct.getc1_VIEW_TYP())) || "1".equals(TypeConverter.convert(aAG0040010Struct.getc1_VIEW_TYP())))?"checked=\"checked\"":"" %>  class="AG0040010-focus-move" id="expj-AG0040010-AG0040010form1-c1_VIEW_TYP"><label for="expj-AG0040010-AG0040010form1-c1_VIEW_TYP"><%=CoreTools.getRBString("Expj.Cmt0705",rb)%></label></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-c2_VIEW_TYP">
expj.AG0040010.AG0040010form1.c2_VIEW_TYP = {};
expj.AG0040010.AG0040010form1.c2_VIEW_TYP.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/c2_VIEW_TYP.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.c2_VIEW_TYP.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-c2_VIEW_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010form1', 'c2_VIEW_TYP', this, 'CheckBox');
    }
  });
  expj.AG0040010.AG0040010form1.c2_VIEW_TYP.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.c2_VIEW_TYP.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/c2_VIEW_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-c2_VIEW_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c2_VIEW_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAG0040010Struct.getc2_VIEW_TYP())) || "1".equals(TypeConverter.convert(aAG0040010Struct.getc2_VIEW_TYP())))?"checked=\"checked\"":"" %>  class="AG0040010-focus-move" id="expj-AG0040010-AG0040010form1-c2_VIEW_TYP"><label for="expj-AG0040010-AG0040010form1-c2_VIEW_TYP"><%=CoreTools.getRBString("Expj.Cmt0706",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010form1-c3_VIEW_TYP">
expj.AG0040010.AG0040010form1.c3_VIEW_TYP = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.onLoad0 = function () {
  console.log('c3_VIEW_TYP script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_c3_VIEW_TYP[eq]true@*0,*3"
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.onClick0 = function () {
  console.log('c3_VIEW_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0040010', 'AG0040010form1', '_c3_VIEW_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;0;MASK;_IN_JOB_ODR_CD,_PeekerIN_JOB_ODR_CD@*1"
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.child0 = function () {
  console.log('c3_VIEW_TYP script3');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_IN_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_PeekerIN_JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;SET;_IN_JOB_ODR_CD=@*2"
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.child1 = function () {
  console.log('c3_VIEW_TYP script4');
expj.common.pscript.setReferenceComponentValue('AG0040010', 'AG0040010form1', '_IN_JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;UNMASK;_IN_LOT_NO,_PeekerLotNo"
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.child2 = function () {
  console.log('c3_VIEW_TYP script5');
expj.common.pscript.setUnMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_IN_LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_PeekerLotNo');
};
// script6="child;3;UNMASK;_IN_JOB_ODR_CD,_PeekerIN_JOB_ODR_CD@*4"
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.child3 = function () {
  console.log('c3_VIEW_TYP script6');
expj.common.pscript.setUnMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_IN_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_PeekerIN_JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script7="child;4;MASK;_IN_LOT_NO,_PeekerLotNo@*5"
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.child4 = function () {
  console.log('c3_VIEW_TYP script7');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_IN_LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AG0040010', 'AG0040010form1', '_PeekerLotNo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script8="child;5;SET;_IN_LOT_NO="
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.child5 = function () {
  console.log('c3_VIEW_TYP script8');
expj.common.pscript.setReferenceComponentValue('AG0040010', 'AG0040010form1', '_IN_LOT_NO', '');
};
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010form1.c3_VIEW_TYP['onClick' + i])) {
        expj.AG0040010.AG0040010form1.c3_VIEW_TYP['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/c3_VIEW_TYP.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.c3_VIEW_TYP.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-c3_VIEW_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010form1', 'c3_VIEW_TYP', this, 'CheckBox');
    }
  });
  expj.AG0040010.AG0040010form1.c3_VIEW_TYP.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.c3_VIEW_TYP.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/c3_VIEW_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-c3_VIEW_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AG0040010.AG0040010form1.c3_VIEW_TYP['onLoad' + i])) {
      expj.AG0040010.AG0040010form1.c3_VIEW_TYP['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c3_VIEW_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAG0040010Struct.getc3_VIEW_TYP())) || "1".equals(TypeConverter.convert(aAG0040010Struct.getc3_VIEW_TYP())))?"checked=\"checked\"":"" %>  class="AG0040010-focus-move" id="expj-AG0040010-AG0040010form1-c3_VIEW_TYP"><label for="expj-AG0040010-AG0040010form1-c3_VIEW_TYP"><%=CoreTools.getRBString("Expj.Cmt4206",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AG0040010-AG0040010form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0040010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AG0040010-AG0040010form1-h_lotCtrl">
expj.AG0040010.AG0040010form1.h_lotCtrl = {};
expj.AG0040010.AG0040010form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AG0040010form1/h_lotCtrl.onDecision');
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
  expj.AG0040010.executeAllOnDecision();
};
expj.AG0040010.AG0040010form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0040010', 'AG0040010form1', 'h_lotCtrl', this);
  });
  expj.AG0040010.AG0040010form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AG0040010.AG0040010form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AG0040010form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010form1-h_lotCtrl');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AG0040010-AG0040010button1">
expj.AG0040010.AG0040010button1 = {};
expj.AG0040010.AG0040010button1.executeAllOnDecision = function () {
  console.log('execute AG0040010button1.onDecision');
};
expj.AG0040010.AG0040010button1.executeOnLoad = function () {
  expj.AG0040010.AG0040010button1.executePScriptOnLoad();
};

expj.AG0040010.AG0040010button1.executePScriptOnLoad = function () {
  console.log('execute AG0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0040010-AG0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0040010-AG0040010button1-Select">
expj.AG0040010.AG0040010button1.Select = {};
// script1="onClick;0;UNMASK;_AG0040010button3/JobOdrAlc"
expj.AG0040010.AG0040010button1.Select.onClick0 = function () {
  console.log('Select script1');
expj.common.pscript.setUnMaskToReferenceComponent('AG0040010', 'AG0040010button1', '_AG0040010button3/JobOdrAlc');
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AG0040010form1/*@AG0040010Servlet"
expj.AG0040010.AG0040010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0040010', 'AG0040010button1', '_AG0040010form1/*', 'AG0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0040010', response);
expj.common.updateBusinessScreenTab('AG0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AG0040010.AG0040010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010button1.Select['onClick' + i])) {
        expj.AG0040010.AG0040010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010button1.Select.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010button1.Select.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010button1', 'Select', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010button1.Select.executePScriptOnLoad();
};

expj.AG0040010.AG0040010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AG0040010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0040010-AG0040010button1-Select" name="Select" class="AG0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AG0040010-AG0040010view1">
expj.AG0040010.AG0040010view1 = {};
expj.AG0040010.AG0040010view1.executeAllOnClick = function () {
};
expj.AG0040010.AG0040010view1.executeAllOnDecision = function () {
  console.log('execute AG0040010view1.onDecision');
};
expj.AG0040010.AG0040010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AG0040010view1", "expj.AG0040010.AG0040010view1.executeAllOnClick");
%>
  expj.AG0040010.AG0040010view1.executePScriptOnLoad();
};

expj.AG0040010.AG0040010view1.executePScriptOnLoad = function () {
  console.log('execute AG0040010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AG0040010-AG0040010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AG0040010view1_Id = "AG0040010view1";
 String AG0040010view1_select = "single";
 String AG0040010view1_sortable = "true";
 String AG0040010view1_resize = "true";
 String AG0040010view1_scroll = "true";
 StringBuffer AG0040010view1_HB = new StringBuffer();
 StringBuffer AG0040010view1_DB = new StringBuffer();
%>
<%
 AG0040010view1_select = "single";
 AG0040010view1_sortable = "true";
 AG0040010view1_resize = "true";
 AG0040010view1_scroll = "true";
%>
<%
 AG0040010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
%>
     
<%
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'35px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'95px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'95px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_FLG",rb))).append("', 'name':'MRP_FLG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'95px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'95px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'95px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'l_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY",rb))).append("', 'name':'STOCK_ON_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEFECT_QTY",rb))).append("', 'name':'DEFECT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRVS_DAYEND_STOCK_QTY",rb))).append("', 'name':'PRVS_DAYEND_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRVS_MONTHEND_STOCK_QTY",rb))).append("', 'name':'PRVS_MONTHEND_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT_1",rb))).append("', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
AG0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONS_TYP",rb))).append("', 'name':'SUPPLY_KBN_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0040010view1_sortable).append("}").append(",");
%>
<%
 int aAG0040010StructLength = aAG0040010Control.getListsize();
 final AG0040010Struct structBackup = aAG0040010Struct;
 aAG0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAG0040010StructLength; ++loopCount) {
  if((aAG0040010Struct = (AG0040010Struct) aAG0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAG0040010Struct", aAG0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AG0040010view1_DB.append("[");
 AG0040010view1_DB.append(loopCount);
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-PLANT_CD\" data-name=\"PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getPLANT_CD())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getWH_CD())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getWH_NAME())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-MRP_FLG-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-MRP_FLG\" data-name=\"MRP_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getMRP_FLG())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getVEND_CD())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-VEND_ANAME\" data-name=\"VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getVEND_ANAME())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getITEM_CD())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getITEM_NAME())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-l_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-l_LOT_NO\" data-name=\"l_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getl_LOT_NO())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getJOB_ODR_CD())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-STOCK_ON_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-STOCK_ON_HAND_QTY\" data-name=\"STOCK_ON_HAND_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0040010Struct.getSTOCK_ON_HAND_QTY())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-DEFECT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-DEFECT_QTY\" data-name=\"DEFECT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0040010Struct.getDEFECT_QTY())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-PRVS_DAYEND_STOCK_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-PRVS_DAYEND_STOCK_QTY\" data-name=\"PRVS_DAYEND_STOCK_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0040010Struct.getPRVS_DAYEND_STOCK_QTY())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-PRVS_MONTHEND_STOCK_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-PRVS_MONTHEND_STOCK_QTY\" data-name=\"PRVS_MONTHEND_STOCK_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0040010Struct.getPRVS_MONTHEND_STOCK_QTY())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getSTOCK_UNIT())).append("</span>'");
 AG0040010view1_DB.append(",").append("'<span id=\"expj-AG0040010-AG0040010view1-SUPPLY_KBN_DN-").append(loopCount).append("\" class=\"expj-label expj-AG0040010-AG0040010view1-SUPPLY_KBN_DN\" data-name=\"SUPPLY_KBN_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0040010Struct.getSUPPLY_KBN_DN())).append("</span>'");
 AG0040010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAG0040010StructLength) {
   AG0040010view1_DB.append(",");
  }
 }
 aAG0040010Struct = structBackup;
 viewIdList.add(AG0040010view1_Id);
 viewSelectList.add(AG0040010view1_select);
 viewResizeList.add(AG0040010view1_resize);
 viewScrollList.add(AG0040010view1_scroll);
 viewHeaderDataList.add(AG0040010view1_HB);
 viewBodyDataList.add(AG0040010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AG0040010-AG0040010button3">
expj.AG0040010.AG0040010button3 = {};
expj.AG0040010.AG0040010button3.executeAllOnDecision = function () {
  console.log('execute AG0040010button3.onDecision');
};
expj.AG0040010.AG0040010button3.executeOnLoad = function () {
  expj.AG0040010.AG0040010button3.executePScriptOnLoad();
};

expj.AG0040010.AG0040010button3.executePScriptOnLoad = function () {
  console.log('execute AG0040010button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0040010-AG0040010button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0040010-AG0040010button3-JobOdrAlc">
expj.AG0040010.AG0040010button3.JobOdrAlc = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AG0040010view1/+@AG0010010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AG0040010.AG0040010button3.JobOdrAlc.onClick0 = function () {
  console.log('JobOdrAlc script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0040010', 'AG0040010button3', '_AG0040010view1/+', 'AG0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AG0010010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AG0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AG0040010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AG0040010.AG0040010button3.JobOdrAlc.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010button3.JobOdrAlc['onClick' + i])) {
        expj.AG0040010.AG0040010button3.JobOdrAlc['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010button3.JobOdrAlc.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010button3.JobOdrAlc.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010button3-JobOdrAlc').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010button3', 'JobOdrAlc', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010button3.JobOdrAlc.executePScriptOnLoad();
};

expj.AG0040010.AG0040010button3.JobOdrAlc.executePScriptOnLoad = function () {
  console.log('execute AG0040010button3/JobOdrAlc.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010button3-JobOdrAlc');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0040010-AG0040010button3-JobOdrAlc" name="JobOdrAlc" class="AG0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnStockInquiry",rb)%></button><!-- 在庫照会ボタン --></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010button3-LotOdrAlc">
expj.AG0040010.AG0040010button3.LotOdrAlc = {};
// script1="onClick;0;SET;_AG0040010form1/tempLot=1"
expj.AG0040010.AG0040010button3.LotOdrAlc.onClick0 = function () {
  console.log('LotOdrAlc script1');
expj.common.pscript.setReferenceComponentValue('AG0040010', 'AG0040010button3', '_AG0040010form1/tempLot', '1');
};
// script2="onClick;1;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AG0040010view1/+,_AG0040010form1/tempLot@AG0010010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AG0040010.AG0040010button3.LotOdrAlc.onClick1 = function () {
  console.log('LotOdrAlc script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0040010', 'AG0040010button3', '_AG0040010view1/+,_AG0040010form1/tempLot', 'AG0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AG0010010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AG0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AG0040010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AG0040010.AG0040010button3.LotOdrAlc.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010button3.LotOdrAlc['onClick' + i])) {
        expj.AG0040010.AG0040010button3.LotOdrAlc['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010button3.LotOdrAlc.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010button3.LotOdrAlc.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010button3-LotOdrAlc').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010button3', 'LotOdrAlc', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010button3.LotOdrAlc.executePScriptOnLoad();
};

expj.AG0040010.AG0040010button3.LotOdrAlc.executePScriptOnLoad = function () {
  console.log('execute AG0040010button3/LotOdrAlc.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010button3-LotOdrAlc');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0040010-AG0040010button3-LotOdrAlc" name="LotOdrAlc" class="AG0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLotStock",rb)%></button><!-- ロット別在庫参照ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AG0040010 Revision: 1.16  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AG0040010-AG0040010button0">
expj.AG0040010.AG0040010button0 = {};
expj.AG0040010.AG0040010button0.executeAllOnDecision = function () {
  console.log('execute AG0040010button0.onDecision');
};
expj.AG0040010.AG0040010button0.executeOnLoad = function () {
  expj.AG0040010.AG0040010button0.executePScriptOnLoad();
};

expj.AG0040010.AG0040010button0.executePScriptOnLoad = function () {
  console.log('execute AG0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0040010-AG0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0040010-AG0040010button0-CsvOut">
expj.AG0040010.AG0040010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AG0040010form1/*,_AG0040010view1/+@AG0040010Servlet,,$ZZ07011"
expj.AG0040010.AG0040010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0040010', 'AG0040010button0', '_AG0040010form1/*,_AG0040010view1/+', 'AG0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0040010', response);
expj.common.updateBusinessScreenTab('AG0040010', contents);
};
expj.common.pscript.callConfirm('AG0040010', 'AG0040010button0', 'ZZ07011', okEvent);
};
expj.AG0040010.AG0040010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010button0.CsvOut['onClick' + i])) {
        expj.AG0040010.AG0040010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010button0.CsvOut.executePScriptOnLoad();
};

expj.AG0040010.AG0040010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AG0040010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0040010-AG0040010button0-CsvOut" name="CsvOut" class="AG0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010button0-Clear">
expj.AG0040010.AG0040010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AG0040010form1/*@AG0040010Servlet,,$ZZ07008"
expj.AG0040010.AG0040010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0040010', 'AG0040010button0', '_AG0040010form1/*', 'AG0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0040010', response);
expj.common.updateBusinessScreenTab('AG0040010', contents);
};
expj.common.pscript.callConfirm('AG0040010', 'AG0040010button0', 'ZZ07008', okEvent);
};
expj.AG0040010.AG0040010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010button0.Clear['onClick' + i])) {
        expj.AG0040010.AG0040010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010button0.Clear.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010button0.Clear.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010button0', 'Clear', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010button0.Clear.executePScriptOnLoad();
};

expj.AG0040010.AG0040010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AG0040010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0040010-AG0040010button0-Clear" name="Clear" class="AG0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AG0040010-AG0040010button0-Close">
expj.AG0040010.AG0040010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AG0040010.AG0040010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AG0040010');
};
expj.AG0040010.AG0040010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0040010.AG0040010button0.Close['onClick' + i])) {
        expj.AG0040010.AG0040010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AG0040010.AG0040010button0.Close.executeAllOnDecision = function () {
};
expj.AG0040010.AG0040010button0.Close.executeOnLoad = function () {
  $('#expj-AG0040010-AG0040010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0040010', 'AG0040010button0', 'Close', this, 'Button');
    }
  });
  expj.AG0040010.AG0040010button0.Close.executePScriptOnLoad();
};

expj.AG0040010.AG0040010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AG0040010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AG0040010-AG0040010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0040010-AG0040010button0-Close" name="Close" class="AG0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AG0040010 (END)-->
<%
MessageStruct msgStruct = aAG0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AG0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AG0040010)) {
  expj.common.treeInstanceMap.AG0040010 = {};
}
expj.common.treeInstanceMap.AG0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AG0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AG0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AG0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AG0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AG0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AG0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AG0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AG0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0040010)) {
  expj.common.detailDialogMap.AG0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AG0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AG0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AG0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AG0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AG0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AG0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AG0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AG0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AG0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AG0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AG0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AG0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AG0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AG0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AG0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AG0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AG0040010)) {
  expj.common.viewInstanceMap.AG0040010 = {};
}
expj.common.viewInstanceMap.AG0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AG0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AG0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AG0040010.<%=viewId %>.init = function () {
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
    expj.AG0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AG0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AG0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AG0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AG0040010_init">
/**
 * AG0040010用のロード完了時初期化関数
 */
expj.AG0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AG0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AG0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AG0040010');
  expj.common.calendarInstanceMap.AG0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AG0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AG0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AG0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AG0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AG0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AG0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AG0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AG0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AG0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AG0040010.AG0040010form1.IN_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.IN_PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.tempLot.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.IN_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.IN_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.IN_VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.IN_VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.IN_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.PeekerIN_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.IN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.IN_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.IN_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.PeekerLotNo.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.c1_VIEW_TYP.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.c2_VIEW_TYP.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.c3_VIEW_TYP.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010button3.JobOdrAlc.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010button3.LotOdrAlc.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010form1.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010button1.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010view1.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010button3.executeOnLoad();}catch(e){};
  try{expj.AG0040010.AG0040010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AG0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AG0040010', 'AG0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AG0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AG0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AG0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AG0040010', '<%=request.getContextPath() %>');
};

/**
 * AG0040010の全体onDecision処理
 */
expj.AG0040010.executeAllOnDecision = function () {
  expj.AG0040010.AG0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AG0040010_console">
expj.AG0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>