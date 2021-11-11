<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:26:38 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AB0020\AB0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AB0020.*" %>
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
<jsp:useBean id="aAB0020010Control" class="com.nec.jp.orteus.metamorBase.AB0020.AB0020010Control" scope="request"/>
<jsp:useBean id="aAB0020010Struct" class="com.nec.jp.orteus.metamorBase.AB0020.AB0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

生産計画メンテナンス（製番）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AB0020/jsp/AB0020010.jsp,v $
$Author: geng-jia $    
$Revision: 1.27 $ $Date: 2017/02/22 02:04:20 $
********************************************************* --%>
<html>
<head>
<title>生産計画メンテナンス（製番）</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AG0050010Servlet", so);
%>

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
<script class="expj-script-AB0020010_init">
  // AB0020010名前空間
  expj.AB0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AB0020010" data-screen="AB0020010" data-newdata="<%=aAB0020010Control.isNewData() %>">
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
              <script class="expj-script-AB0020010-AB0020010form1">
expj.AB0020010.AB0020010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AB0020010.AB0020010form1.onLoad0 = function () {
  console.log('AB0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*2,*3"
expj.AB0020010.AB0020010form1.onDecision0 = function () {
  console.log('AB0020010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AB0020010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;2;UNMASK;_AB0020010button1/select,_AB0020010button0/ScrmovToTimeInOut"
expj.AB0020010.AB0020010form1.child2 = function () {
  console.log('AB0020010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button1/select');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button0/ScrmovToTimeInOut');
};
// script4="child;3;MASK;_AB0020010button1/select,_AB0020010button0/ScrmovToTimeInOut"
expj.AB0020010.AB0020010form1.child3 = function () {
  console.log('AB0020010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button1/select');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button0/ScrmovToTimeInOut');
};
// script5="onDecision;1;CHK;?AB0020010form1/*[eq]NORMAL@*4,*9"
expj.AB0020010.AB0020010form1.onDecision1 = function () {
  console.log('AB0020010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010form1', '?AB0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script6="child;4;CHK;?AB0020010form1/PLANT_CD[eq]SAME[and]?AB0020010form1/ITEM_CD[eq]SAME[and]?AB0020010form1/w_DATE_FROM[eq]SAME[and]?AB0020010form1/w_DATE_TO[eq]SAME@*5,*9"
expj.AB0020010.AB0020010form1.child4 = function () {
  console.log('AB0020010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010form1', '?AB0020010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010form1', '?AB0020010form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010form1', '?AB0020010form1/w_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010form1', '?AB0020010form1/w_DATE_TO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script7="child;5;CHKRQ;?AB0020010view1/?[eq]SINGLE@*6,*7"
expj.AB0020010.AB0020010form1.child5 = function () {
  console.log('AB0020010form1 script7');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010form1', '?AB0020010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;6;UNMASK;_AB0020010button2/append,_AB0020010button2/modify"
expj.AB0020010.AB0020010form1.child6 = function () {
  console.log('AB0020010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button2/append');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button2/modify');
};
// script9="child;7;UNMASK;_AB0020010button2/append@*8"
expj.AB0020010.AB0020010form1.child7 = function () {
  console.log('AB0020010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button2/append');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script10="child;8;MASK;_AB0020010button2/modify"
expj.AB0020010.AB0020010form1.child8 = function () {
  console.log('AB0020010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button2/modify');
};
// script11="child;9;MASK;_AB0020010button2/append,_AB0020010button2/modify"
expj.AB0020010.AB0020010form1.child9 = function () {
  console.log('AB0020010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button2/append');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button2/modify');
};
// script12="onDecision;2;CHK;_AB0020010form1/OPTION_ID[eq]JF*@*10,"
expj.AB0020010.AB0020010form1.onDecision2 = function () {
  console.log('AB0020010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010form1', '_AB0020010form1/OPTION_ID'), '[eq]', 'JF*')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script13="child;10;MASK;_AB0020010button0/ScrmovToTimeInOut"
expj.AB0020010.AB0020010form1.child10 = function () {
  console.log('AB0020010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020010form1', '_AB0020010button0/ScrmovToTimeInOut');
};
expj.AB0020010.AB0020010form1.executeAllOnDecision = function () {
  console.log('execute AB0020010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010form1['onDecision' + i])) {
        expj.AB0020010.AB0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010form1.executeOnLoad = function () {
  expj.AB0020010.AB0020010form1.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AB0020010.AB0020010form1['onLoad' + i])) {
      expj.AB0020010.AB0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AB0020010-AB0020010form1" action="AB0020010Servlet" name="AB0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAB0020010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010form1-PLANT_CD">
expj.AB0020010.AB0020010form1.PLANT_CD = {};
expj.AB0020010.AB0020010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AB0020010form1/PLANT_CD.onDecision');
  expj.AB0020010.AB0020010form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020010form1', 'PLANT_CD', this);
  });
  expj.AB0020010.AB0020010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020010form1-PLANT_CD" name="PLANT_CD" class="AB0020010-focus-move  required-value expj-AB0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010form1-PeekerPlantCd">
expj.AB0020010.AB0020010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AB0020010form1/PLANT_CD@<%=contextNo%>"
expj.AB0020010.AB0020010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AB0020010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010form1', '_AB0020010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AB0020010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AB0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AB0020010.AB0020010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010form1.PeekerPlantCd['onClick' + i])) {
        expj.AB0020010.AB0020010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AB0020010.AB0020010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AB0020010-AB0020010form1-PeekerPlantCd" class="AB0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010form1-PLANT_NAME">
expj.AB0020010.AB0020010form1.PLANT_NAME = {};
expj.AB0020010.AB0020010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AB0020010form1/PLANT_NAME.onDecision');
  expj.AB0020010.AB0020010form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020010form1', 'PLANT_NAME', this);
  });
  expj.AB0020010.AB0020010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020010form1-PLANT_NAME" name="PLANT_NAME" class="AB0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010form1-ITEM_CD">
expj.AB0020010.AB0020010form1.ITEM_CD = {};
expj.AB0020010.AB0020010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AB0020010form1/ITEM_CD.onDecision');
  expj.AB0020010.AB0020010form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020010form1', 'ITEM_CD', this);
  });
  expj.AB0020010.AB0020010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020010form1-ITEM_CD" name="ITEM_CD" class="AB0020010-focus-move  required-value expj-AB0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010form1-PeekerItemCd">
expj.AB0020010.AB0020010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AB0020010form1/ITEM_CD@<%=contextNo%>"
expj.AB0020010.AB0020010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AB0020010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010form1', '_AB0020010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_11%&%';
parameterValues += 'TARGET_FIELD%=%_AB0020010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AB0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AB0020010.AB0020010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010form1.PeekerItemCd['onClick' + i])) {
        expj.AB0020010.AB0020010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AB0020010.AB0020010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AB0020010-AB0020010form1-PeekerItemCd" class="AB0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010form1-ITEM_NAME">
expj.AB0020010.AB0020010form1.ITEM_NAME = {};
expj.AB0020010.AB0020010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AB0020010form1/ITEM_NAME.onDecision');
  expj.AB0020010.AB0020010form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020010form1', 'ITEM_NAME', this);
  });
  expj.AB0020010.AB0020010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020010form1-ITEM_NAME" name="ITEM_NAME" class="AB0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020010form1-OPTION_ID" name="OPTION_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getOPTION_ID()) %>">
<script class="expj-script-AB0020010-AB0020010form1-OPTION_ID">
expj.AB0020010.AB0020010form1.OPTION_ID = {};
expj.AB0020010.AB0020010form1.OPTION_ID.executeAllOnDecision = function () {
  console.log('execute AB0020010form1/OPTION_ID.onDecision');
  expj.AB0020010.AB0020010form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020010form1.OPTION_ID.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-OPTION_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020010form1', 'OPTION_ID', this);
  });
  expj.AB0020010.AB0020010form1.OPTION_ID.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.OPTION_ID.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/OPTION_ID.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-OPTION_ID');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0420",rb)%></span><!-- 生産計画期間 --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010form1-w_DATE_FROM">
expj.AB0020010.AB0020010form1.w_DATE_FROM = {};
expj.AB0020010.AB0020010form1.w_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AB0020010form1/w_DATE_FROM.onDecision');
  expj.AB0020010.AB0020010form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020010form1.w_DATE_FROM.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-w_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020010form1', 'w_DATE_FROM', this);
  });
  expj.AB0020010.AB0020010form1.w_DATE_FROM.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.w_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/w_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-w_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020010form1-w_DATE_FROM" name="w_DATE_FROM" class="AB0020010-focus-move  required-value expj-AB0020010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getw_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010form1-Calendarw_DATE_FROM">
expj.AB0020010.AB0020010form1.Calendarw_DATE_FROM = {};
// script1="onClick;0;CALENDAR;_AB0020010form1/w_DATE_FROM"
expj.AB0020010.AB0020010form1.Calendarw_DATE_FROM.onClick0 = function () {
  console.log('Calendarw_DATE_FROM script1');
expj.common.pscript.executeCalendar('AB0020010','AB0020010form1','_AB0020010form1/w_DATE_FROM');
};
expj.AB0020010.AB0020010form1.Calendarw_DATE_FROM.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010form1.Calendarw_DATE_FROM['onClick' + i])) {
        expj.AB0020010.AB0020010form1.Calendarw_DATE_FROM['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010form1.Calendarw_DATE_FROM.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010form1.Calendarw_DATE_FROM.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-Calendarw_DATE_FROM').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010form1', 'Calendarw_DATE_FROM', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AB0020010','AB0020010form1','_AB0020010form1/w_DATE_FROM');
  expj.AB0020010.AB0020010form1.Calendarw_DATE_FROM.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.Calendarw_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/Calendarw_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-Calendarw_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AB0020010-AB0020010form1-Calendarw_DATE_FROM" class="AB0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010form1-w_DATE_TO">
expj.AB0020010.AB0020010form1.w_DATE_TO = {};
expj.AB0020010.AB0020010form1.w_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AB0020010form1/w_DATE_TO.onDecision');
  expj.AB0020010.AB0020010form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020010form1.w_DATE_TO.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-w_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020010form1', 'w_DATE_TO', this);
  });
  expj.AB0020010.AB0020010form1.w_DATE_TO.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.w_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/w_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-w_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020010form1-w_DATE_TO" name="w_DATE_TO" class="AB0020010-focus-move  required-value expj-AB0020010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getw_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010form1-Calendarw_DATE_TO">
expj.AB0020010.AB0020010form1.Calendarw_DATE_TO = {};
// script1="onClick;0;CALENDAR;_AB0020010form1/w_DATE_TO"
expj.AB0020010.AB0020010form1.Calendarw_DATE_TO.onClick0 = function () {
  console.log('Calendarw_DATE_TO script1');
expj.common.pscript.executeCalendar('AB0020010','AB0020010form1','_AB0020010form1/w_DATE_TO');
};
expj.AB0020010.AB0020010form1.Calendarw_DATE_TO.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010form1.Calendarw_DATE_TO['onClick' + i])) {
        expj.AB0020010.AB0020010form1.Calendarw_DATE_TO['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010form1.Calendarw_DATE_TO.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010form1.Calendarw_DATE_TO.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-Calendarw_DATE_TO').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010form1', 'Calendarw_DATE_TO', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AB0020010','AB0020010form1','_AB0020010form1/w_DATE_TO');
  expj.AB0020010.AB0020010form1.Calendarw_DATE_TO.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.Calendarw_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/Calendarw_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-Calendarw_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AB0020010-AB0020010form1-Calendarw_DATE_TO" class="AB0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020010form1-SYS_INSTALL_OPTIONS" name="SYS_INSTALL_OPTIONS" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getSYS_INSTALL_OPTIONS()) %>">
<script class="expj-script-AB0020010-AB0020010form1-SYS_INSTALL_OPTIONS">
expj.AB0020010.AB0020010form1.SYS_INSTALL_OPTIONS = {};
expj.AB0020010.AB0020010form1.SYS_INSTALL_OPTIONS.executeAllOnDecision = function () {
  console.log('execute AB0020010form1/SYS_INSTALL_OPTIONS.onDecision');
  expj.AB0020010.AB0020010form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020010form1.SYS_INSTALL_OPTIONS.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010form1-SYS_INSTALL_OPTIONS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020010form1', 'SYS_INSTALL_OPTIONS', this);
  });
  expj.AB0020010.AB0020010form1.SYS_INSTALL_OPTIONS.executePScriptOnLoad();
};

expj.AB0020010.AB0020010form1.SYS_INSTALL_OPTIONS.executePScriptOnLoad = function () {
  console.log('execute AB0020010form1/SYS_INSTALL_OPTIONS.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010form1-SYS_INSTALL_OPTIONS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AB0020010-AB0020010button1">
expj.AB0020010.AB0020010button1 = {};
expj.AB0020010.AB0020010button1.executeAllOnDecision = function () {
  console.log('execute AB0020010button1.onDecision');
};
expj.AB0020010.AB0020010button1.executeOnLoad = function () {
  expj.AB0020010.AB0020010button1.executePScriptOnLoad();
};

expj.AB0020010.AB0020010button1.executePScriptOnLoad = function () {
  console.log('execute AB0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AB0020010-AB0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AB0020010-AB0020010button1-Detail">
expj.AB0020010.AB0020010button1.Detail = {};
// script1="onClick;0;FSHOW;AB0020010float1"
expj.AB0020010.AB0020010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AB0020010', 'AB0020010float1', '');
};
expj.AB0020010.AB0020010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010button1.Detail['onClick' + i])) {
        expj.AB0020010.AB0020010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010button1.Detail.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010button1.Detail.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010button1', 'Detail', this, 'Button');
    }
  });
  expj.AB0020010.AB0020010button1.Detail.executePScriptOnLoad();
};

expj.AB0020010.AB0020010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AB0020010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0020010-AB0020010button1-Detail" name="Detail" class="AB0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010button1-select">
expj.AB0020010.AB0020010button1.select = {};
// script1="onClick;0;CHK;_AB0020010form1/w_DATE_FROM[gt]_AB0020010form1/w_DATE_TO@!AB00005,*0"
expj.AB0020010.AB0020010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010button1', '_AB0020010form1/w_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020010button1', '_AB0020010form1/w_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('AB0020010', 'AB0020010button1', 'AB00005');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AB0020010form1/*@AB0020010Servlet"
expj.AB0020010.AB0020010button1.select.child0 = function () {
  console.log('select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0020010', 'AB0020010button1', '_AB0020010form1/*', 'AB0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0020010', response);
expj.common.updateBusinessScreenTab('AB0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AB0020010.AB0020010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010button1.select['onClick' + i])) {
        expj.AB0020010.AB0020010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010button1.select.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010button1.select.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010button1', 'select', this, 'Button');
    }
  });
  expj.AB0020010.AB0020010button1.select.executePScriptOnLoad();
};

expj.AB0020010.AB0020010button1.select.executePScriptOnLoad = function () {
  console.log('execute AB0020010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0020010-AB0020010button1-select" name="select" class="AB0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AB0020010-AB0020010view1">
expj.AB0020010.AB0020010view1 = {};
expj.AB0020010.AB0020010view1.executeAllOnClick = function () {
};
expj.AB0020010.AB0020010view1.executeAllOnDecision = function () {
  console.log('execute AB0020010view1.onDecision');
};
expj.AB0020010.AB0020010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AB0020010view1", "expj.AB0020010.AB0020010view1.executeAllOnClick");
%>
  expj.AB0020010.AB0020010view1.executePScriptOnLoad();
};

expj.AB0020010.AB0020010view1.executePScriptOnLoad = function () {
  console.log('execute AB0020010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AB0020010-AB0020010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AB0020010view1_Id = "AB0020010view1";
 String AB0020010view1_select = "single";
 String AB0020010view1_sortable = "true";
 String AB0020010view1_resize = "true";
 String AB0020010view1_scroll = "true";
 StringBuffer AB0020010view1_HB = new StringBuffer();
 StringBuffer AB0020010view1_DB = new StringBuffer();
%>
<%
 AB0020010view1_select = "single";
 AB0020010view1_sortable = "true";
 AB0020010view1_resize = "true";
 AB0020010view1_scroll = "true";
%>
<%
 AB0020010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
%>
      
<%
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.LIMIT",rb))).append("', 'name':'JOB_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_TYP",rb))).append("', 'name':'JOB_ODR_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'JOB_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLAN_TYP",rb))).append("', 'name':'PLAN_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'PLAN_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_1",rb))).append("', 'name':'JOB_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'JOB_ODR_EXP_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'JOB_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALC_GRP_CD",rb))).append("', 'name':'ALC_GRP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'JOB_ODR_DEL_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REQ_PRD_QTY_1",rb))).append("', 'name':'ALCD_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0300",rb))).append("', 'name':'ALCD_ENABLE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_STS_TYP",rb))).append("', 'name':'JOB_ODR_STS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
AB0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0031",rb))).append("', 'name':'JobOdrExpect', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0020010view1_sortable).append("}").append(",");
%>
<%
 int aAB0020010StructLength = aAB0020010Control.getListsize();
 final AB0020010Struct structBackup = aAB0020010Struct;
 aAB0020010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAB0020010StructLength; ++loopCount) {
  if((aAB0020010Struct = (AB0020010Struct) aAB0020010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAB0020010Struct", aAB0020010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AB0020010view1_DB.append("[");
 AB0020010view1_DB.append(loopCount);
%> <%
    String canSelect = "false";
    String selColor = "000000";
    String ColKind = "OBT_NUMBER;14.1;FLOOR;4";
    int sts_val = 0;
    if(aAB0020010Struct.getJOB_ODR_STS_TYP() != null) {
    	sts_val = aAB0020010Struct.getJOB_ODR_STS_TYP().intValue();
    }
    
    if(aAB0020010Struct.getJOB_ODR_CD() != null && 
    sts_val != 5 &&
    sts_val != 9 )
    {
        canSelect = "true";
    }
    
    if(aAB0020010Struct.getHOLIDAY_FLG().intValue() == 1){
    	selColor = "FF0033";
    }
    
    if(aAB0020010Struct.getJOB_ODR_CD() == null ) {
    	ColKind ="";
    }
%> <%
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\" data-rowselectable=\"").append( canSelect ).append("\">").append(TypeConverter.sanitizer(aAB0020010Struct.getMODIFY_COUNT())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-JOB_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-JOB_ODR_DLV_DATE\" data-name=\"JOB_ODR_DLV_DATE\" data-view=\"true\" style=\"color:#").append(selColor).append(";\">").append(TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_DLV_DATE())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-JOB_ODR_NAME-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-JOB_ODR_NAME\" data-name=\"JOB_ODR_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_NAME())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-JOB_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-JOB_ODR_TYP\" data-name=\"JOB_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_TYP())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-PLAN_NAME-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-PLAN_NAME\" data-name=\"PLAN_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getPLAN_NAME())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-PLAN_TYP-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-PLAN_TYP\" data-name=\"PLAN_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getPLAN_TYP())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-JOB_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-JOB_ODR_QTY\" data-name=\"JOB_ODR_QTY\" data-view=\"true\" data-kind=\"").append( ColKind ).append("\">").append(TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_QTY())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-JOB_ODR_EXP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-JOB_ODR_EXP_TYP\" data-name=\"JOB_ODR_EXP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_EXP_TYP())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_CD())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-JOB_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-JOB_ODR_STS_TYP\" data-name=\"JOB_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_STS_TYP())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-ALC_GRP_CD-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-ALC_GRP_CD\" data-name=\"ALC_GRP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getALC_GRP_CD())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-JOB_ODR_DEL_FLG-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-JOB_ODR_DEL_FLG\" data-name=\"JOB_ODR_DEL_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_DEL_FLG())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-ALCD_QTY-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-ALCD_QTY\" data-name=\"ALCD_QTY\" data-view=\"true\" data-kind=\"").append( ColKind ).append("\">").append(TypeConverter.sanitizer(aAB0020010Struct.getALCD_QTY())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-ALCD_ENABLE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-ALCD_ENABLE_QTY\" data-name=\"ALCD_ENABLE_QTY\" data-view=\"true\" data-kind=\"").append( ColKind ).append("\">").append(TypeConverter.sanitizer(aAB0020010Struct.getALCD_ENABLE_QTY())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-JOB_ODR_STS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-JOB_ODR_STS_NAME\" data-name=\"JOB_ODR_STS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_STS_NAME())).append("</span>'");
 AB0020010view1_DB.append(",").append("'<span id=\"expj-AB0020010-AB0020010view1-JobOdrExpect-").append(loopCount).append("\" class=\"expj-label expj-AB0020010-AB0020010view1-JobOdrExpect\" data-name=\"JobOdrExpect\" data-view=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getJobOdrExpect())).append("</span>'");
 AB0020010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAB0020010StructLength) {
   AB0020010view1_DB.append(",");
  }
 }
 aAB0020010Struct = structBackup;
 viewIdList.add(AB0020010view1_Id);
 viewSelectList.add(AB0020010view1_select);
 viewResizeList.add(AB0020010view1_resize);
 viewScrollList.add(AB0020010view1_scroll);
 viewHeaderDataList.add(AB0020010view1_HB);
 viewBodyDataList.add(AB0020010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AB0020010-AB0020010button2">
expj.AB0020010.AB0020010button2 = {};
expj.AB0020010.AB0020010button2.executeAllOnDecision = function () {
  console.log('execute AB0020010button2.onDecision');
};
expj.AB0020010.AB0020010button2.executeOnLoad = function () {
  expj.AB0020010.AB0020010button2.executePScriptOnLoad();
};

expj.AB0020010.AB0020010button2.executePScriptOnLoad = function () {
  console.log('execute AB0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AB0020010-AB0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AB0020010-AB0020010button2-append">
expj.AB0020010.AB0020010button2.append = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AB0020010form1/*@AB0020010Servlet"
expj.AB0020010.AB0020010button2.append.onClick0 = function () {
  console.log('append script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0020010', 'AB0020010button2', '_AB0020010form1/*', 'AB0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0020010', response);
expj.common.changeBusinessScreenTab('AB0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AB0020010.AB0020010button2.append.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010button2.append['onClick' + i])) {
        expj.AB0020010.AB0020010button2.append['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010button2.append.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010button2.append.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010button2-append').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010button2', 'append', this, 'Button');
    }
  });
  expj.AB0020010.AB0020010button2.append.executePScriptOnLoad();
};

expj.AB0020010.AB0020010button2.append.executePScriptOnLoad = function () {
  console.log('execute AB0020010button2/append.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010button2-append');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0020010-AB0020010button2-append" name="append" class="AB0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010button2-modify">
expj.AB0020010.AB0020010button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AB0020010form1/*,_AB0020010view1/+@AB0020010Servlet"
expj.AB0020010.AB0020010button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0020010', 'AB0020010button2', '_AB0020010form1/*,_AB0020010view1/+', 'AB0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0020010', response);
expj.common.changeBusinessScreenTab('AB0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AB0020010.AB0020010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010button2.modify['onClick' + i])) {
        expj.AB0020010.AB0020010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010button2.modify.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010button2.modify.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010button2', 'modify', this, 'Button');
    }
  });
  expj.AB0020010.AB0020010button2.modify.executePScriptOnLoad();
};

expj.AB0020010.AB0020010button2.modify.executePScriptOnLoad = function () {
  console.log('execute AB0020010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0020010-AB0020010button2-modify" name="modify" class="AB0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AB0020010 Revision: 1.15  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AB0020010-AB0020010button0">
expj.AB0020010.AB0020010button0 = {};
expj.AB0020010.AB0020010button0.executeAllOnDecision = function () {
  console.log('execute AB0020010button0.onDecision');
};
expj.AB0020010.AB0020010button0.executeOnLoad = function () {
  expj.AB0020010.AB0020010button0.executePScriptOnLoad();
};

expj.AB0020010.AB0020010button0.executePScriptOnLoad = function () {
  console.log('execute AB0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AB0020010-AB0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AB0020010-AB0020010button0-ScrmovToTimeInOut">
expj.AB0020010.AB0020010button0.ScrmovToTimeInOut = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AB0020010form1/PLANT_CD,_AB0020010form1/ITEM_CD@AG0050010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AB0020010.AB0020010button0.ScrmovToTimeInOut.onClick0 = function () {
  console.log('ScrmovToTimeInOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0020010', 'AB0020010button0', '_AB0020010form1/PLANT_CD,_AB0020010form1/ITEM_CD', 'AG0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AG0050010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AG0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AB0020010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AB0020010.AB0020010button0.ScrmovToTimeInOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010button0.ScrmovToTimeInOut['onClick' + i])) {
        expj.AB0020010.AB0020010button0.ScrmovToTimeInOut['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010button0.ScrmovToTimeInOut.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010button0.ScrmovToTimeInOut.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010button0-ScrmovToTimeInOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010button0', 'ScrmovToTimeInOut', this, 'Button');
    }
  });
  expj.AB0020010.AB0020010button0.ScrmovToTimeInOut.executePScriptOnLoad();
};

expj.AB0020010.AB0020010button0.ScrmovToTimeInOut.executePScriptOnLoad = function () {
  console.log('execute AB0020010button0/ScrmovToTimeInOut.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010button0-ScrmovToTimeInOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0020010-AB0020010button0-ScrmovToTimeInOut" name="ScrmovToTimeInOut" class="AB0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnTimeInOut",rb)%></button><!-- 時系列入出庫予定一覧ボタン --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010button0-clear">
expj.AB0020010.AB0020010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AB0020010Servlet,,$ZZ07008"
expj.AB0020010.AB0020010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0020010', 'AB0020010button0', '', 'AB0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0020010', response);
expj.common.updateBusinessScreenTab('AB0020010', contents);
};
expj.common.pscript.callConfirm('AB0020010', 'AB0020010button0', 'ZZ07008', okEvent);
};
expj.AB0020010.AB0020010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010button0.clear['onClick' + i])) {
        expj.AB0020010.AB0020010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010button0.clear.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010button0.clear.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010button0', 'clear', this, 'Button');
    }
  });
  expj.AB0020010.AB0020010button0.clear.executePScriptOnLoad();
};

expj.AB0020010.AB0020010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AB0020010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0020010-AB0020010button0-clear" name="clear" class="AB0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020010button0-Close">
expj.AB0020010.AB0020010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AB0020010.AB0020010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AB0020010');
};
expj.AB0020010.AB0020010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020010button0.Close['onClick' + i])) {
        expj.AB0020010.AB0020010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020010button0.Close.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020010button0.Close.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020010button0', 'Close', this, 'Button');
    }
  });
  expj.AB0020010.AB0020010button0.Close.executePScriptOnLoad();
};

expj.AB0020010.AB0020010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AB0020010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0020010-AB0020010button0-Close" name="Close" class="AB0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AB0020010 (END)-->
<script class="expj-script-AB0020010-AB0020010detail1">
expj.AB0020010.AB0020010detail1 = {};
expj.AB0020010.AB0020010detail1.executeAllOnDecision = function () {
  console.log('execute AB0020010detail1.onDecision');
};
expj.AB0020010.AB0020010detail1.executeOnLoad = function () {
  expj.AB0020010.AB0020010detail1.executePScriptOnLoad();
};

expj.AB0020010.AB0020010detail1.executePScriptOnLoad = function () {
  console.log('execute AB0020010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAB0020010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AB0020010-AB0020010detail1" class="expj-datagird-detail" data-float="AB0020010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AB0020010detail1";
 detailFloat = "AB0020010float1";
 detailWidth = 358;
 detailHeight = 196 + 47;
 String AB0020010detail1_Id = "AB0020010detail1";
 String AB0020010detail1_select = "single";
 String AB0020010detail1_sortable = "true";
 String AB0020010detail1_resize = "true";
 String AB0020010detail1_scroll = "true";
 StringBuffer AB0020010detail1_HB = new StringBuffer();
 StringBuffer AB0020010detail1_DB = new StringBuffer();
%>
<%
 AB0020010detail1_sortable = "false";
 AB0020010detail1_select = "none";
%>
<% AB0020010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AB0020010detail1_sortable).append("}").append(","); %>
<%  AB0020010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AB0020010detail1_sortable).append("}").append(",");
AB0020010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AB0020010detail1_sortable).append("}").append(",");
AB0020010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AB0020010detail1_sortable).append("}").append(",");
 %>
   <%
        aAB0020010Struct = null;
        aAB0020010Struct=(AB0020010Struct)aAB0020010Control.getKeyStruct();
    %>
 <% AB0020010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AB0020010-AB0020010detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0020010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_SPEC",rb)).append("','").append("<span id=\"expj-AB0020010-AB0020010detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0020010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AB0020010-AB0020010detail1-MRP_ODR_NAME\" class=\"expj-label\" data-name=\"MRP_ODR_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getMRP_ODR_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0020010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AB0020010-AB0020010detail1-OUTSIDE_NAME\" class=\"expj-label\" data-name=\"OUTSIDE_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getOUTSIDE_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0020010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AB0020010-AB0020010detail1-ITEM_SPOIL\" class=\"expj-label\" data-name=\"ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAB0020010Struct.getITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AB0020010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AB0020010-AB0020010detail1-UNIT_QTY_NAME\" class=\"expj-label\" data-name=\"UNIT_QTY_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getUNIT_QTY_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0020010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.MUL_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AB0020010-AB0020010detail1-MUL_ODR_QTY\" class=\"expj-label\" data-name=\"MUL_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAB0020010Struct.getMUL_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AB0020010-AB0020010detail1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AB0020010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.Cmt0442",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AB0020010-AB0020010detail1-HAND_STOCK\" class=\"expj-label\" data-name=\"HAND_STOCK\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAB0020010Struct.getHAND_STOCK())).append("</span>").append("</div>','").append("<span id=\"expj-AB0020010-AB0020010detail1-STOCK_UNIT_1\" class=\"expj-label\" data-name=\"STOCK_UNIT_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0020010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AB0020010detail1_Id;
 detailViewSelect = AB0020010detail1_select;
 detailViewResize = AB0020010detail1_resize;
 detailViewScroll = AB0020010detail1_scroll;
 detailViewHeaderData = AB0020010detail1_HB;
 detailViewBodyData = AB0020010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAB0020010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AB0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AB0020010)) {
  expj.common.treeInstanceMap.AB0020010 = {};
}
expj.common.treeInstanceMap.AB0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AB0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AB0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AB0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AB0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AB0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AB0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AB0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AB0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AB0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AB0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0020010)) {
  expj.common.detailDialogMap.AB0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AB0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AB0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AB0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AB0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AB0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AB0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AB0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AB0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AB0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AB0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AB0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AB0020010)) {
  expj.common.viewInstanceMap.AB0020010 = {};
}
expj.common.viewInstanceMap.AB0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AB0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AB0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AB0020010.<%=viewId %>.init = function () {
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
    expj.AB0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AB0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AB0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AB0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AB0020010_init">
/**
 * AB0020010用のロード完了時初期化関数
 */
expj.AB0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AB0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AB0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AB0020010');
  expj.common.calendarInstanceMap.AB0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AB0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AB0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AB0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AB0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AB0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AB0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AB0020010.AB0020010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.OPTION_ID.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.w_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.Calendarw_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.w_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.Calendarw_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.SYS_INSTALL_OPTIONS.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010button1.select.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010button2.append.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010button2.modify.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010button0.ScrmovToTimeInOut.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010form1.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010button1.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010view1.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010button2.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010button0.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AB0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AB0020010', 'AB0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AB0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AB0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AB0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AB0020010', '<%=request.getContextPath() %>');
};

/**
 * AB0020010の全体onDecision処理
 */
expj.AB0020010.executeAllOnDecision = function () {
  expj.AB0020010.AB0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AB0020010_console">
expj.AB0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>