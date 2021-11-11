<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:49:10 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DA0010\DA0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DA0010.*" %>
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
<jsp:useBean id="aDA0010010Control" class="com.nec.jp.orteus.metamorBase.DA0010.DA0010010Control" scope="request"/>
<jsp:useBean id="aDA0010010Struct" class="com.nec.jp.orteus.metamorBase.DA0010.DA0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

工程マスタメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0010/jsp/DA0010010.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:06:34 $
********************************************************* --%>
<html>
<head>
<title>工程マスタメンテナンス</title>
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
<script class="expj-script-DA0010010_init">
  // DA0010010名前空間
  expj.DA0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DA0010010" data-screen="DA0010010" data-newdata="<%=aDA0010010Control.isNewData() %>">
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
            <script class="expj-script-DA0010010-DA0010010form1">
expj.DA0010010.DA0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.DA0010010.DA0010010form1.onLoad0 = function () {
  console.log('DA0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DA0010010.DA0010010form1.onDecision0 = function () {
  console.log('DA0010010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DA0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DA0010010button1/Select"
expj.DA0010010.DA0010010form1.child0 = function () {
  console.log('DA0010010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button1/Select');
};
// script4="child;1;MASK;_DA0010010button1/Select"
expj.DA0010010.DA0010010form1.child1 = function () {
  console.log('DA0010010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button1/Select');
};
// script5="onDecision;1;CHK;?DA0010010form1/*[neq]INITIAL@*2,*4"
expj.DA0010010.DA0010010form1.onDecision1 = function () {
  console.log('DA0010010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?DA0010010form1/*'), '[neq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;_DispDeleteFlg[neq]true[and]?PLANT_CD[eq]SAME[and]?w_CS_PROC_CD[eq]SAME[and]?w_WS_CD[eq]SAME[and]?DispDeleteFlg[eq]SAME@*3,*4"
expj.DA0010010.DA0010010form1.child2 = function () {
  console.log('DA0010010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '_DispDeleteFlg'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?w_CS_PROC_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?w_WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?DispDeleteFlg'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_DA0010010button2/LineInsert"
expj.DA0010010.DA0010010form1.child3 = function () {
  console.log('DA0010010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button2/LineInsert');
};
// script8="child;4;MASK;_DA0010010button2/LineInsert"
expj.DA0010010.DA0010010form1.child4 = function () {
  console.log('DA0010010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button2/LineInsert');
};
// script9="onDecision;2;CHKRQ;?DA0010010view1/?[eq]SINGLE@*5,*7"
expj.DA0010010.DA0010010form1.onDecision2 = function () {
  console.log('DA0010010form1 script9');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?DA0010010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;5;CHK;_DispDeleteFlg[neq]true[and]?PLANT_CD[eq]SAME[and]?w_CS_PROC_CD[eq]SAME[and]?w_WS_CD[eq]SAME[and]?DispDeleteFlg[eq]SAME@*6,*7"
expj.DA0010010.DA0010010form1.child5 = function () {
  console.log('DA0010010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '_DispDeleteFlg'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?w_CS_PROC_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?w_WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?DispDeleteFlg'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_DA0010010button2/LineUpdate,_DA0010010button2/LineCopy,_DA0010010button2/LineDelete"
expj.DA0010010.DA0010010form1.child6 = function () {
  console.log('DA0010010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button2/LineUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button2/LineCopy');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button2/LineDelete');
};
// script12="child;7;MASK;_DA0010010button2/LineUpdate,_DA0010010button2/LineCopy,_DA0010010button2/LineDelete"
expj.DA0010010.DA0010010form1.child7 = function () {
  console.log('DA0010010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button2/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button2/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button2/LineDelete');
};
// script13="onDecision;3;CHKRQ;?DA0010010view1/?[eq]SINGLE@*8,*10"
expj.DA0010010.DA0010010form1.onDecision3 = function () {
  console.log('DA0010010form1 script13');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?DA0010010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script14="child;8;CHK;_DispDeleteFlg[eq]true[and]?PLANT_CD[eq]SAME[and]?w_CS_PROC_CD[eq]SAME[and]?w_WS_CD[eq]SAME[and]?DispDeleteFlg[eq]SAME@*9,*10"
expj.DA0010010.DA0010010form1.child8 = function () {
  console.log('DA0010010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '_DispDeleteFlg'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?w_CS_PROC_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?w_WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '?DispDeleteFlg'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script15="child;9;UNMASK;_DA0010010button2/LineCancelDelete"
expj.DA0010010.DA0010010form1.child9 = function () {
  console.log('DA0010010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button2/LineCancelDelete');
};
// script16="child;10;MASK;_DA0010010button2/LineCancelDelete"
expj.DA0010010.DA0010010form1.child10 = function () {
  console.log('DA0010010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010010form1', '_DA0010010button2/LineCancelDelete');
};
expj.DA0010010.DA0010010form1.executeAllOnDecision = function () {
  console.log('execute DA0010010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010010form1['onDecision' + i])) {
        expj.DA0010010.DA0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010010form1.executeOnLoad = function () {
  expj.DA0010010.DA0010010form1.executePScriptOnLoad();
};

expj.DA0010010.DA0010010form1.executePScriptOnLoad = function () {
  console.log('execute DA0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DA0010010.DA0010010form1['onLoad' + i])) {
      expj.DA0010010.DA0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0010010-DA0010010form1" action="DA0010010Servlet" name="DA0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDA0010010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010form1-PLANT_CD">
expj.DA0010010.DA0010010form1.PLANT_CD = {};
expj.DA0010010.DA0010010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DA0010010form1/PLANT_CD.onDecision');
  expj.DA0010010.DA0010010form1.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010010form1', 'PLANT_CD', this);
  });
  expj.DA0010010.DA0010010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DA0010010.DA0010010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DA0010010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010010form1-PLANT_CD" name="PLANT_CD" class="DA0010010-focus-move  required-value expj-DA0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010form1-PeekerPlantCd">
expj.DA0010010.DA0010010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DA0010010form1/PLANT_CD:_DA0010010form1/PLANT_NAME@<%=contextNo%>"
expj.DA0010010.DA0010010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0010010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0010010form1/PLANT_CD:_DA0010010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0010010.DA0010010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010010form1.PeekerPlantCd['onClick' + i])) {
        expj.DA0010010.DA0010010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DA0010010.DA0010010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DA0010010.DA0010010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DA0010010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0010010-DA0010010form1-PeekerPlantCd" class="DA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010form1-PLANT_NAME">
expj.DA0010010.DA0010010form1.PLANT_NAME = {};
expj.DA0010010.DA0010010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DA0010010form1/PLANT_NAME.onDecision');
  expj.DA0010010.DA0010010form1.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010010form1', 'PLANT_NAME', this);
  });
  expj.DA0010010.DA0010010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DA0010010.DA0010010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0010010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010010form1-PLANT_NAME" name="PLANT_NAME" class="DA0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CS_PROC_CD",rb)%></span><!-- 工程コード --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010form1-w_CS_PROC_CD">
expj.DA0010010.DA0010010form1.w_CS_PROC_CD = {};
expj.DA0010010.DA0010010form1.w_CS_PROC_CD.executeAllOnDecision = function () {
  console.log('execute DA0010010form1/w_CS_PROC_CD.onDecision');
  expj.DA0010010.DA0010010form1.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010010form1.w_CS_PROC_CD.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010form1-w_CS_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010010form1', 'w_CS_PROC_CD', this);
  });
  expj.DA0010010.DA0010010form1.w_CS_PROC_CD.executePScriptOnLoad();
};

expj.DA0010010.DA0010010form1.w_CS_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute DA0010010form1/w_CS_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010form1-w_CS_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010010form1-w_CS_PROC_CD" name="w_CS_PROC_CD" class="DA0010010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getw_CS_PROC_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010form1-w_WS_CD">
expj.DA0010010.DA0010010form1.w_WS_CD = {};
expj.DA0010010.DA0010010form1.w_WS_CD.executeAllOnDecision = function () {
  console.log('execute DA0010010form1/w_WS_CD.onDecision');
  expj.DA0010010.DA0010010form1.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010010form1.w_WS_CD.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010form1-w_WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010010form1', 'w_WS_CD', this);
  });
  expj.DA0010010.DA0010010form1.w_WS_CD.executePScriptOnLoad();
};

expj.DA0010010.DA0010010form1.w_WS_CD.executePScriptOnLoad = function () {
  console.log('execute DA0010010form1/w_WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010form1-w_WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010010form1-w_WS_CD" name="w_WS_CD" class="DA0010010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getw_WS_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010form1-DispDeleteFlg">
expj.DA0010010.DA0010010form1.DispDeleteFlg = {};
expj.DA0010010.DA0010010form1.DispDeleteFlg.executeAllOnDecision = function () {
  console.log('execute DA0010010form1/DispDeleteFlg.onDecision');
  expj.DA0010010.DA0010010form1.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010010form1.DispDeleteFlg.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010form1-DispDeleteFlg').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010010form1', 'DispDeleteFlg', this, 'CheckBox');
    }
  });
  expj.DA0010010.DA0010010form1.DispDeleteFlg.executePScriptOnLoad();
};

expj.DA0010010.DA0010010form1.DispDeleteFlg.executePScriptOnLoad = function () {
  console.log('execute DA0010010form1/DispDeleteFlg.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010form1-DispDeleteFlg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="DispDeleteFlg" value="true" <%= ("true".equals(TypeConverter.convert(aDA0010010Struct.getDispDeleteFlg())) || "1".equals(TypeConverter.convert(aDA0010010Struct.getDispDeleteFlg())))?"checked=\"checked\"":"" %>  class="DA0010010-focus-move" id="expj-DA0010010-DA0010010form1-DispDeleteFlg"><label for="expj-DA0010010-DA0010010form1-DispDeleteFlg"><%=CoreTools.getRBString("Expj.Cmt0252",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DA0010010-DA0010010button1">
expj.DA0010010.DA0010010button1 = {};
expj.DA0010010.DA0010010button1.executeAllOnDecision = function () {
  console.log('execute DA0010010button1.onDecision');
};
expj.DA0010010.DA0010010button1.executeOnLoad = function () {
  expj.DA0010010.DA0010010button1.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button1.executePScriptOnLoad = function () {
  console.log('execute DA0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0010010-DA0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0010010-DA0010010button1-Select">
expj.DA0010010.DA0010010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0010010form1/*@DA0010010Servlet,,"
expj.DA0010010.DA0010010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0010010', 'DA0010010button1', '_DA0010010form1/*', 'DA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0010010', response);
expj.common.updateBusinessScreenTab('DA0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0010010.DA0010010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010010button1.Select['onClick' + i])) {
        expj.DA0010010.DA0010010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010010button1.Select.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010010button1.Select.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010010button1', 'Select', this, 'Button');
    }
  });
  expj.DA0010010.DA0010010button1.Select.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DA0010010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010010button1-Select" name="Select" class="DA0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-DA0010010-DA0010010view1">
expj.DA0010010.DA0010010view1 = {};
expj.DA0010010.DA0010010view1.executeAllOnClick = function () {
};
expj.DA0010010.DA0010010view1.executeAllOnDecision = function () {
  console.log('execute DA0010010view1.onDecision');
};
expj.DA0010010.DA0010010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("DA0010010view1", "expj.DA0010010.DA0010010view1.executeAllOnClick");
%>
  expj.DA0010010.DA0010010view1.executePScriptOnLoad();
};

expj.DA0010010.DA0010010view1.executePScriptOnLoad = function () {
  console.log('execute DA0010010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-DA0010010-DA0010010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String DA0010010view1_Id = "DA0010010view1";
 String DA0010010view1_select = "single";
 String DA0010010view1_sortable = "true";
 String DA0010010view1_resize = "true";
 String DA0010010view1_scroll = "true";
 StringBuffer DA0010010view1_HB = new StringBuffer();
 StringBuffer DA0010010view1_DB = new StringBuffer();
%>
<%
 DA0010010view1_select = "single";
 DA0010010view1_sortable = "true";
 DA0010010view1_resize = "true";
 DA0010010view1_scroll = "true";
%>
<%
 DA0010010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(DA0010010view1_sortable).append("}").append(",");
%>
     
<%
DA0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CS_PROC_CD",rb))).append("', 'name':'l_CS_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0010010view1_sortable).append("}").append(",");
DA0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CS_PROC_NAME",rb))).append("', 'name':'l_CS_PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0010010view1_sortable).append("}").append(",");
DA0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'l_WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0010010view1_sortable).append("}").append(",");
DA0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_NAME",rb))).append("', 'name':'l_WS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0010010view1_sortable).append("}").append(",");
DA0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP_6",rb))).append("', 'name':'l_OUTSIDE_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0010010view1_sortable).append("}").append(",");
DA0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0010010view1_sortable).append("}").append(",");
DA0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_ANAME",rb))).append("', 'name':'l_VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0010010view1_sortable).append("}").append(",");
DA0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(DA0010010view1_sortable).append("}").append(",");
%>
<%
 int aDA0010010StructLength = aDA0010010Control.getListsize();
 final DA0010010Struct structBackup = aDA0010010Struct;
 aDA0010010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aDA0010010StructLength; ++loopCount) {
  if((aDA0010010Struct = (DA0010010Struct) aDA0010010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aDA0010010Struct", aDA0010010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 DA0010010view1_DB.append("[");
 DA0010010view1_DB.append(loopCount);
 DA0010010view1_DB.append(",").append("'<span id=\"expj-DA0010010-DA0010010view1-l_CS_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-DA0010010-DA0010010view1-l_CS_PROC_CD\" data-name=\"l_CS_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0010010Struct.getl_CS_PROC_CD())).append("</span>'");
 DA0010010view1_DB.append(",").append("'<span id=\"expj-DA0010010-DA0010010view1-l_CS_PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-DA0010010-DA0010010view1-l_CS_PROC_NAME\" data-name=\"l_CS_PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0010010Struct.getl_CS_PROC_NAME())).append("</span>'");
 DA0010010view1_DB.append(",").append("'<span id=\"expj-DA0010010-DA0010010view1-l_WS_CD-").append(loopCount).append("\" class=\"expj-label expj-DA0010010-DA0010010view1-l_WS_CD\" data-name=\"l_WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0010010Struct.getl_WS_CD())).append("</span>'");
 DA0010010view1_DB.append(",").append("'<span id=\"expj-DA0010010-DA0010010view1-l_WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-DA0010010-DA0010010view1-l_WS_NAME\" data-name=\"l_WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0010010Struct.getl_WS_NAME())).append("</span>'");
 DA0010010view1_DB.append(",").append("'<span id=\"expj-DA0010010-DA0010010view1-l_OUTSIDE_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-DA0010010-DA0010010view1-l_OUTSIDE_TYP_DN\" data-name=\"l_OUTSIDE_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0010010Struct.getl_OUTSIDE_TYP_DN())).append("</span>'");
 DA0010010view1_DB.append(",").append("'<span id=\"expj-DA0010010-DA0010010view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-DA0010010-DA0010010view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0010010Struct.getl_VEND_CD())).append("</span>'");
 DA0010010view1_DB.append(",").append("'<span id=\"expj-DA0010010-DA0010010view1-l_VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-DA0010010-DA0010010view1-l_VEND_ANAME\" data-name=\"l_VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0010010Struct.getl_VEND_ANAME())).append("</span>'");
 DA0010010view1_DB.append(",").append("'<span id=\"expj-DA0010010-DA0010010view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-DA0010010-DA0010010view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0010010Struct.getl_MODIFY_COUNT())).append("</span>'");
 DA0010010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aDA0010010StructLength) {
   DA0010010view1_DB.append(",");
  }
 }
 aDA0010010Struct = structBackup;
 viewIdList.add(DA0010010view1_Id);
 viewSelectList.add(DA0010010view1_select);
 viewResizeList.add(DA0010010view1_resize);
 viewScrollList.add(DA0010010view1_scroll);
 viewHeaderDataList.add(DA0010010view1_HB);
 viewBodyDataList.add(DA0010010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:525px;"><script class="expj-script-DA0010010-DA0010010button2">
expj.DA0010010.DA0010010button2 = {};
expj.DA0010010.DA0010010button2.executeAllOnDecision = function () {
  console.log('execute DA0010010button2.onDecision');
};
expj.DA0010010.DA0010010button2.executeOnLoad = function () {
  expj.DA0010010.DA0010010button2.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button2.executePScriptOnLoad = function () {
  console.log('execute DA0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0010010-DA0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:525px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0010010-DA0010010button2-LineInsert">
expj.DA0010010.DA0010010button2.LineInsert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0010010form1/*@DA0010010Servlet,,"
expj.DA0010010.DA0010010button2.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0010010', 'DA0010010button2', '_DA0010010form1/*', 'DA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0010010', response);
expj.common.changeBusinessScreenTab('DA0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0010010.DA0010010button2.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010010button2.LineInsert['onClick' + i])) {
        expj.DA0010010.DA0010010button2.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010010button2.LineInsert.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010010button2.LineInsert.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010button2-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010010button2', 'LineInsert', this, 'Button');
    }
  });
  expj.DA0010010.DA0010010button2.LineInsert.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button2.LineInsert.executePScriptOnLoad = function () {
  console.log('execute DA0010010button2/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010button2-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010010button2-LineInsert" name="LineInsert" class="DA0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010button2-LineUpdate">
expj.DA0010010.DA0010010button2.LineUpdate = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0010010form1/*,_DA0010010view1/+@DA0010010Servlet,,"
expj.DA0010010.DA0010010button2.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0010010', 'DA0010010button2', '_DA0010010form1/*,_DA0010010view1/+', 'DA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0010010', response);
expj.common.changeBusinessScreenTab('DA0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0010010.DA0010010button2.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010010button2.LineUpdate['onClick' + i])) {
        expj.DA0010010.DA0010010button2.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010010button2.LineUpdate.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010010button2.LineUpdate.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010button2-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010010button2', 'LineUpdate', this, 'Button');
    }
  });
  expj.DA0010010.DA0010010button2.LineUpdate.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button2.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute DA0010010button2/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010button2-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010010button2-LineUpdate" name="LineUpdate" class="DA0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010button2-LineCopy">
expj.DA0010010.DA0010010button2.LineCopy = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0010010form1/*,_DA0010010view1/+@DA0010010Servlet,,"
expj.DA0010010.DA0010010button2.LineCopy.onClick0 = function () {
  console.log('LineCopy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0010010', 'DA0010010button2', '_DA0010010form1/*,_DA0010010view1/+', 'DA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0010010', response);
expj.common.changeBusinessScreenTab('DA0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0010010.DA0010010button2.LineCopy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010010button2.LineCopy['onClick' + i])) {
        expj.DA0010010.DA0010010button2.LineCopy['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010010button2.LineCopy.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010010button2.LineCopy.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010button2-LineCopy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010010button2', 'LineCopy', this, 'Button');
    }
  });
  expj.DA0010010.DA0010010button2.LineCopy.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button2.LineCopy.executePScriptOnLoad = function () {
  console.log('execute DA0010010button2/LineCopy.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010button2-LineCopy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010010button2-LineCopy" name="LineCopy" class="DA0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010button2-LineDelete">
expj.DA0010010.DA0010010button2.LineDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0010010form1/*,_DA0010010view1/+@DA0010010Servlet,,$ZZ07007"
expj.DA0010010.DA0010010button2.LineDelete.onClick0 = function () {
  console.log('LineDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0010010', 'DA0010010button2', '_DA0010010form1/*,_DA0010010view1/+', 'DA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0010010', response);
expj.common.updateBusinessScreenTab('DA0010010', contents);
};
expj.common.pscript.callConfirm('DA0010010', 'DA0010010button2', 'ZZ07007', okEvent);
};
expj.DA0010010.DA0010010button2.LineDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010010button2.LineDelete['onClick' + i])) {
        expj.DA0010010.DA0010010button2.LineDelete['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010010button2.LineDelete.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010010button2.LineDelete.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010button2-LineDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010010button2', 'LineDelete', this, 'Button');
    }
  });
  expj.DA0010010.DA0010010button2.LineDelete.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button2.LineDelete.executePScriptOnLoad = function () {
  console.log('execute DA0010010button2/LineDelete.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010button2-LineDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010010button2-LineDelete" name="LineDelete" class="DA0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010button2-LineCancelDelete">
expj.DA0010010.DA0010010button2.LineCancelDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0010010form1/*,_DA0010010view1/+@DA0010010Servlet,,$ZZ07016"
expj.DA0010010.DA0010010button2.LineCancelDelete.onClick0 = function () {
  console.log('LineCancelDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0010010', 'DA0010010button2', '_DA0010010form1/*,_DA0010010view1/+', 'DA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0010010', response);
expj.common.updateBusinessScreenTab('DA0010010', contents);
};
expj.common.pscript.callConfirm('DA0010010', 'DA0010010button2', 'ZZ07016', okEvent);
};
expj.DA0010010.DA0010010button2.LineCancelDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010010button2.LineCancelDelete['onClick' + i])) {
        expj.DA0010010.DA0010010button2.LineCancelDelete['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010010button2.LineCancelDelete.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010010button2.LineCancelDelete.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010button2-LineCancelDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010010button2', 'LineCancelDelete', this, 'Button');
    }
  });
  expj.DA0010010.DA0010010button2.LineCancelDelete.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button2.LineCancelDelete.executePScriptOnLoad = function () {
  console.log('execute DA0010010button2/LineCancelDelete.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010button2-LineCancelDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010010button2-LineCancelDelete" name="LineCancelDelete" class="DA0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCancelDelete",rb)%></button><!-- 行削除取消ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 609px);"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">DA0010010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-DA0010010-DA0010010button0">
expj.DA0010010.DA0010010button0 = {};
expj.DA0010010.DA0010010button0.executeAllOnDecision = function () {
  console.log('execute DA0010010button0.onDecision');
};
expj.DA0010010.DA0010010button0.executeOnLoad = function () {
  expj.DA0010010.DA0010010button0.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button0.executePScriptOnLoad = function () {
  console.log('execute DA0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0010010-DA0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0010010-DA0010010button0-Clear">
expj.DA0010010.DA0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DA0010010Servlet,,$ZZ07008"
expj.DA0010010.DA0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0010010', 'DA0010010button0', '', 'DA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0010010', response);
expj.common.updateBusinessScreenTab('DA0010010', contents);
};
expj.common.pscript.callConfirm('DA0010010', 'DA0010010button0', 'ZZ07008', okEvent);
};
expj.DA0010010.DA0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010010button0.Clear['onClick' + i])) {
        expj.DA0010010.DA0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010010button0.Clear.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010010button0.Clear.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.DA0010010.DA0010010button0.Clear.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DA0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010010button0-Clear" name="Clear" class="DA0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010010button0-Close">
expj.DA0010010.DA0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DA0010010.DA0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DA0010010');
};
expj.DA0010010.DA0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010010button0.Close['onClick' + i])) {
        expj.DA0010010.DA0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010010button0.Close.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010010button0.Close.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010010button0', 'Close', this, 'Button');
    }
  });
  expj.DA0010010.DA0010010button0.Close.executePScriptOnLoad();
};

expj.DA0010010.DA0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DA0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010010button0-Close" name="Close" class="DA0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DA0010010 (END)-->
<%
MessageStruct msgStruct = aDA0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DA0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DA0010010)) {
  expj.common.treeInstanceMap.DA0010010 = {};
}
expj.common.treeInstanceMap.DA0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DA0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DA0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DA0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DA0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DA0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DA0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DA0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DA0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DA0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DA0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0010010)) {
  expj.common.detailDialogMap.DA0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DA0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.DA0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DA0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DA0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DA0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DA0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DA0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DA0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DA0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DA0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DA0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DA0010010)) {
  expj.common.viewInstanceMap.DA0010010 = {};
}
expj.common.viewInstanceMap.DA0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.DA0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DA0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DA0010010.<%=viewId %>.init = function () {
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
    expj.DA0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DA0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DA0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DA0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DA0010010_init">
/**
 * DA0010010用のロード完了時初期化関数
 */
expj.DA0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DA0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DA0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DA0010010');
  expj.common.calendarInstanceMap.DA0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DA0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DA0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DA0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DA0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DA0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DA0010010-<%=detailId %>');
<%
 }
%>
  try{expj.DA0010010.DA0010010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010form1.w_CS_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010form1.w_WS_CD.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010form1.DispDeleteFlg.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button2.LineInsert.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button2.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button2.LineCopy.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button2.LineDelete.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button2.LineCancelDelete.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010form1.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button1.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010view1.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button2.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DA0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DA0010010', 'DA0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DA0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DA0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.DA0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DA0010010', '<%=request.getContextPath() %>');
};

/**
 * DA0010010の全体onDecision処理
 */
expj.DA0010010.executeAllOnDecision = function () {
  expj.DA0010010.DA0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DA0010010_console">
expj.DA0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>