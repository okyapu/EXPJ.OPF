<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:27:39 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0060\AC0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0060.*" %>
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
<jsp:useBean id="aAC0060010Control" class="com.nec.jp.orteus.metamorBase.AC0060.AC0060010Control" scope="request"/>
<jsp:useBean id="aAC0060010Struct" class="com.nec.jp.orteus.metamorBase.AC0060.AC0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

外部オーダデマンドメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0060/jsp/AC0060010.jsp,v $
$Author: geng-jia $    
$Revision: 1.17 $ $Date: 2017/02/22 02:04:25 $
********************************************************* --%>
<html>
<head>
<title>外部オーダデマンドメンテナンス</title>
<%@ page import="com.nec.jp.orteus.metamorBase.common01.StockCalculate.MrpData" %>
<%@ page import="com.nec.jp.orteus.metamorBase.common01.StockCalculate.MrpManager" %>
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
<script class="expj-script-AC0060010_init">
  // AC0060010名前空間
  expj.AC0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0060010" data-screen="AC0060010" data-newdata="<%=aAC0060010Control.isNewData() %>">
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
              <script class="expj-script-AC0060010-AC0060010form1">
expj.AC0060010.AC0060010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AC0060010.AC0060010form1.onLoad0 = function () {
  console.log('AC0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*2,*3"
expj.AC0060010.AC0060010form1.onDecision0 = function () {
  console.log('AC0060010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AC0060010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;2;UNMASK;_AC0060010button1/select"
expj.AC0060010.AC0060010form1.child2 = function () {
  console.log('AC0060010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AC0060010', 'AC0060010form1', '_AC0060010button1/select');
};
// script4="child;3;MASK;_AC0060010button1/select"
expj.AC0060010.AC0060010form1.child3 = function () {
  console.log('AC0060010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AC0060010', 'AC0060010form1', '_AC0060010button1/select');
};
// script5="onDecision;1;CHK;?AC0060010form1/*[eq]NORMAL@*4,*9"
expj.AC0060010.AC0060010form1.onDecision1 = function () {
  console.log('AC0060010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0060010', 'AC0060010form1', '?AC0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script6="child;4;CHK;?AC0060010form1/PLANT_CD[eq]SAME[and]?AC0060010form1/ITEM_CD[eq]SAME[and]?AC0060010form1/w_DATE_FROM[eq]SAME[and]?AC0060010form1/w_DATE_TO[eq]SAME@*5,*9"
expj.AC0060010.AC0060010form1.child4 = function () {
  console.log('AC0060010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0060010', 'AC0060010form1', '?AC0060010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0060010', 'AC0060010form1', '?AC0060010form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0060010', 'AC0060010form1', '?AC0060010form1/w_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0060010', 'AC0060010form1', '?AC0060010form1/w_DATE_TO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script7="child;5;CHKRQ;?AC0060010view1/?[eq]SINGLE@*6,*7"
expj.AC0060010.AC0060010form1.child5 = function () {
  console.log('AC0060010form1 script7');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0060010', 'AC0060010form1', '?AC0060010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;6;UNMASK;_AC0060010button2/append,_AC0060010button2/modify"
expj.AC0060010.AC0060010form1.child6 = function () {
  console.log('AC0060010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AC0060010', 'AC0060010form1', '_AC0060010button2/append');
expj.common.pscript.setUnMaskToReferenceComponent('AC0060010', 'AC0060010form1', '_AC0060010button2/modify');
};
// script9="child;7;UNMASK;_AC0060010button2/append@*8"
expj.AC0060010.AC0060010form1.child7 = function () {
  console.log('AC0060010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AC0060010', 'AC0060010form1', '_AC0060010button2/append');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script10="child;8;MASK;_AC0060010button2/modify"
expj.AC0060010.AC0060010form1.child8 = function () {
  console.log('AC0060010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AC0060010', 'AC0060010form1', '_AC0060010button2/modify');
};
// script11="child;9;MASK;_AC0060010button2/append,_AC0060010button2/modify"
expj.AC0060010.AC0060010form1.child9 = function () {
  console.log('AC0060010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AC0060010', 'AC0060010form1', '_AC0060010button2/append');
expj.common.pscript.setMaskToReferenceComponent('AC0060010', 'AC0060010form1', '_AC0060010button2/modify');
};
expj.AC0060010.AC0060010form1.executeAllOnDecision = function () {
  console.log('execute AC0060010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010form1['onDecision' + i])) {
        expj.AC0060010.AC0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010form1.executeOnLoad = function () {
  expj.AC0060010.AC0060010form1.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0060010.AC0060010form1['onLoad' + i])) {
      expj.AC0060010.AC0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0060010-AC0060010form1" action="AC0060010Servlet" name="AC0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0060010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010form1-PLANT_CD">
expj.AC0060010.AC0060010form1.PLANT_CD = {};
expj.AC0060010.AC0060010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AC0060010form1/PLANT_CD.onDecision');
  expj.AC0060010.AC0060010form1.executeAllOnDecision();
  expj.AC0060010.executeAllOnDecision();
};
expj.AC0060010.AC0060010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0060010', 'AC0060010form1', 'PLANT_CD', this);
  });
  expj.AC0060010.AC0060010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0060010-AC0060010form1-PLANT_CD" name="PLANT_CD" class="AC0060010-focus-move  required-value expj-AC0060010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0060010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010form1-PeekerPlantCd">
expj.AC0060010.AC0060010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AC0060010form1/PLANT_CD@<%=contextNo%>"
expj.AC0060010.AC0060010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0060010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0060010', 'AC0060010form1', '_AC0060010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0060010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0060010.AC0060010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010form1.PeekerPlantCd['onClick' + i])) {
        expj.AC0060010.AC0060010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AC0060010.AC0060010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060010', 'AC0060010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AC0060010.AC0060010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0060010-AC0060010form1-PeekerPlantCd" class="AC0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010form1-PLANT_NAME">
expj.AC0060010.AC0060010form1.PLANT_NAME = {};
expj.AC0060010.AC0060010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AC0060010form1/PLANT_NAME.onDecision');
  expj.AC0060010.AC0060010form1.executeAllOnDecision();
  expj.AC0060010.executeAllOnDecision();
};
expj.AC0060010.AC0060010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0060010', 'AC0060010form1', 'PLANT_NAME', this);
  });
  expj.AC0060010.AC0060010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0060010-AC0060010form1-PLANT_NAME" name="PLANT_NAME" class="AC0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0060010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010form1-ITEM_CD">
expj.AC0060010.AC0060010form1.ITEM_CD = {};
expj.AC0060010.AC0060010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0060010form1/ITEM_CD.onDecision');
  expj.AC0060010.AC0060010form1.executeAllOnDecision();
  expj.AC0060010.executeAllOnDecision();
};
expj.AC0060010.AC0060010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0060010', 'AC0060010form1', 'ITEM_CD', this);
  });
  expj.AC0060010.AC0060010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0060010-AC0060010form1-ITEM_CD" name="ITEM_CD" class="AC0060010-focus-move  required-value expj-AC0060010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0060010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010form1-PeekerItemCd">
expj.AC0060010.AC0060010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AC0060010form1/ITEM_CD@<%=contextNo%>"
expj.AC0060010.AC0060010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0060010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0060010', 'AC0060010form1', '_AC0060010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_06%&%';
parameterValues += 'TARGET_FIELD%=%_AC0060010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0060010.AC0060010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010form1.PeekerItemCd['onClick' + i])) {
        expj.AC0060010.AC0060010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AC0060010.AC0060010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060010', 'AC0060010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AC0060010.AC0060010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0060010-AC0060010form1-PeekerItemCd" class="AC0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010form1-ITEM_NAME">
expj.AC0060010.AC0060010form1.ITEM_NAME = {};
expj.AC0060010.AC0060010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AC0060010form1/ITEM_NAME.onDecision');
  expj.AC0060010.AC0060010form1.executeAllOnDecision();
  expj.AC0060010.executeAllOnDecision();
};
expj.AC0060010.AC0060010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0060010', 'AC0060010form1', 'ITEM_NAME', this);
  });
  expj.AC0060010.AC0060010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0060010-AC0060010form1-ITEM_NAME" name="ITEM_NAME" class="AC0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0060010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0420",rb)%></span><!-- 生産計画期間 --></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010form1-w_DATE_FROM">
expj.AC0060010.AC0060010form1.w_DATE_FROM = {};
expj.AC0060010.AC0060010form1.w_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AC0060010form1/w_DATE_FROM.onDecision');
  expj.AC0060010.AC0060010form1.executeAllOnDecision();
  expj.AC0060010.executeAllOnDecision();
};
expj.AC0060010.AC0060010form1.w_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010form1-w_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0060010', 'AC0060010form1', 'w_DATE_FROM', this);
  });
  expj.AC0060010.AC0060010form1.w_DATE_FROM.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.w_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1/w_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010form1-w_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0060010-AC0060010form1-w_DATE_FROM" name="w_DATE_FROM" class="AC0060010-focus-move  required-value expj-AC0060010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0060010Struct.getw_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010form1-CalendarFromDate">
expj.AC0060010.AC0060010form1.CalendarFromDate = {};
// script1="onClick;0;CALENDAR;_AC0060010form1/w_DATE_FROM"
expj.AC0060010.AC0060010form1.CalendarFromDate.onClick0 = function () {
  console.log('CalendarFromDate script1');
expj.common.pscript.executeCalendar('AC0060010','AC0060010form1','_AC0060010form1/w_DATE_FROM');
};
expj.AC0060010.AC0060010form1.CalendarFromDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010form1.CalendarFromDate['onClick' + i])) {
        expj.AC0060010.AC0060010form1.CalendarFromDate['onClick' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010form1.CalendarFromDate.executeAllOnDecision = function () {
};
expj.AC0060010.AC0060010form1.CalendarFromDate.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010form1-CalendarFromDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060010', 'AC0060010form1', 'CalendarFromDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0060010','AC0060010form1','_AC0060010form1/w_DATE_FROM');
  expj.AC0060010.AC0060010form1.CalendarFromDate.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.CalendarFromDate.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1/CalendarFromDate.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010form1-CalendarFromDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0060010-AC0060010form1-CalendarFromDate" class="AC0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010form1-w_DATE_TO">
expj.AC0060010.AC0060010form1.w_DATE_TO = {};
expj.AC0060010.AC0060010form1.w_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AC0060010form1/w_DATE_TO.onDecision');
  expj.AC0060010.AC0060010form1.executeAllOnDecision();
  expj.AC0060010.executeAllOnDecision();
};
expj.AC0060010.AC0060010form1.w_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010form1-w_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0060010', 'AC0060010form1', 'w_DATE_TO', this);
  });
  expj.AC0060010.AC0060010form1.w_DATE_TO.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.w_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1/w_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010form1-w_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0060010-AC0060010form1-w_DATE_TO" name="w_DATE_TO" class="AC0060010-focus-move  required-value expj-AC0060010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0060010Struct.getw_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010form1-CalendarToDate">
expj.AC0060010.AC0060010form1.CalendarToDate = {};
// script1="onClick;0;CALENDAR;_AC0060010form1/w_DATE_TO"
expj.AC0060010.AC0060010form1.CalendarToDate.onClick0 = function () {
  console.log('CalendarToDate script1');
expj.common.pscript.executeCalendar('AC0060010','AC0060010form1','_AC0060010form1/w_DATE_TO');
};
expj.AC0060010.AC0060010form1.CalendarToDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010form1.CalendarToDate['onClick' + i])) {
        expj.AC0060010.AC0060010form1.CalendarToDate['onClick' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010form1.CalendarToDate.executeAllOnDecision = function () {
};
expj.AC0060010.AC0060010form1.CalendarToDate.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010form1-CalendarToDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060010', 'AC0060010form1', 'CalendarToDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0060010','AC0060010form1','_AC0060010form1/w_DATE_TO');
  expj.AC0060010.AC0060010form1.CalendarToDate.executePScriptOnLoad();
};

expj.AC0060010.AC0060010form1.CalendarToDate.executePScriptOnLoad = function () {
  console.log('execute AC0060010form1/CalendarToDate.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010form1-CalendarToDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AC0060010-AC0060010form1-CalendarToDate" class="AC0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AC0060010-AC0060010button1">
expj.AC0060010.AC0060010button1 = {};
expj.AC0060010.AC0060010button1.executeAllOnDecision = function () {
  console.log('execute AC0060010button1.onDecision');
};
expj.AC0060010.AC0060010button1.executeOnLoad = function () {
  expj.AC0060010.AC0060010button1.executePScriptOnLoad();
};

expj.AC0060010.AC0060010button1.executePScriptOnLoad = function () {
  console.log('execute AC0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0060010-AC0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0060010-AC0060010button1-Detail">
expj.AC0060010.AC0060010button1.Detail = {};
// script1="onClick;0;FSHOW;AC0060010float1"
expj.AC0060010.AC0060010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AC0060010', 'AC0060010float1', '');
};
expj.AC0060010.AC0060010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010button1.Detail['onClick' + i])) {
        expj.AC0060010.AC0060010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010button1.Detail.executeAllOnDecision = function () {
};
expj.AC0060010.AC0060010button1.Detail.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060010', 'AC0060010button1', 'Detail', this, 'Button');
    }
  });
  expj.AC0060010.AC0060010button1.Detail.executePScriptOnLoad();
};

expj.AC0060010.AC0060010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AC0060010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0060010-AC0060010button1-Detail" name="Detail" class="AC0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010button1-select">
expj.AC0060010.AC0060010button1.select = {};
// script1="onClick;0;CHK;_AC0060010form1/w_DATE_FROM[gt]_AC0060010form1/w_DATE_TO@!AC10007,*0"
expj.AC0060010.AC0060010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0060010', 'AC0060010button1', '_AC0060010form1/w_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0060010', 'AC0060010button1', '_AC0060010form1/w_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('AC0060010', 'AC0060010button1', 'AC10007');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0060010form1/*@AC0060010Servlet"
expj.AC0060010.AC0060010button1.select.child0 = function () {
  console.log('select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0060010', 'AC0060010button1', '_AC0060010form1/*', 'AC0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0060010', response);
expj.common.updateBusinessScreenTab('AC0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0060010.AC0060010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010button1.select['onClick' + i])) {
        expj.AC0060010.AC0060010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010button1.select.executeAllOnDecision = function () {
};
expj.AC0060010.AC0060010button1.select.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060010', 'AC0060010button1', 'select', this, 'Button');
    }
  });
  expj.AC0060010.AC0060010button1.select.executePScriptOnLoad();
};

expj.AC0060010.AC0060010button1.select.executePScriptOnLoad = function () {
  console.log('execute AC0060010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0060010-AC0060010button1-select" name="select" class="AC0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AC0060010-AC0060010view1">
expj.AC0060010.AC0060010view1 = {};
expj.AC0060010.AC0060010view1.executeAllOnClick = function () {
};
expj.AC0060010.AC0060010view1.executeAllOnDecision = function () {
  console.log('execute AC0060010view1.onDecision');
};
expj.AC0060010.AC0060010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0060010view1", "expj.AC0060010.AC0060010view1.executeAllOnClick");
%>
  expj.AC0060010.AC0060010view1.executePScriptOnLoad();
};

expj.AC0060010.AC0060010view1.executePScriptOnLoad = function () {
  console.log('execute AC0060010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0060010-AC0060010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0060010view1_Id = "AC0060010view1";
 String AC0060010view1_select = "single";
 String AC0060010view1_sortable = "true";
 String AC0060010view1_resize = "true";
 String AC0060010view1_scroll = "true";
 StringBuffer AC0060010view1_HB = new StringBuffer();
 StringBuffer AC0060010view1_DB = new StringBuffer();
%>
<%
 AC0060010view1_select = "single";
 AC0060010view1_sortable = "true";
 AC0060010view1_resize = "true";
 AC0060010view1_scroll = "true";
%>
<%
 AC0060010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
%>
       <%
    String beforeDate = "";
%>
<%
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0057",rb))).append("', 'name':'PlanDate', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0405",rb))).append("', 'name':'FixedDemand', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0403",rb))).append("', 'name':'PlanDemand', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0473",rb))).append("', 'name':'dispDM_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'DM_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0404",rb))).append("', 'name':'FixedOrder', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0400",rb))).append("', 'name':'PlanOrder', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0443",rb))).append("', 'name':'dispODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ODR_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0432",rb))).append("', 'name':'ValidStock', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OD_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'EXT_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'EXTERNAL_DM_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OD_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'EXTERNAL_PLAN_DEL_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'LowerDeploy', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0031",rb))).append("', 'name':'Expect', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0434",rb))).append("', 'name':'EXTERNAL_PLAN_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
AC0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'PlanTime', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0060010view1_sortable).append("}").append(",");
%>
<%
 int aAC0060010StructLength = aAC0060010Control.getListsize();
 final AC0060010Struct structBackup = aAC0060010Struct;
 aAC0060010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0060010StructLength; ++loopCount) {
  if((aAC0060010Struct = (AC0060010Struct) aAC0060010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0060010Struct", aAC0060010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0060010view1_DB.append("[");
 AC0060010view1_DB.append(loopCount);
%> <%
    String canSelect = "false";
    String selColor;
    
    if(AC0060Const.C_RELEASE_YET.equals(TypeConverter.sanitizer(aAC0060010Struct.getIsReleased())))
    {
        canSelect = "true";
    }
    
    if(aAC0060010Struct.getHOLIDAY_FLG().intValue() == AC0060Const.C_WORKDAY){
        selColor = "000000";
    }else{
        selColor = "FF0033";
    }

    String extOderColKind = "OBT_NUMBER;14.1;FLOOR;4"; // 外部オーダ列の書式
    String extDemandColKind = "OBT_NUMBER;14.1;FLOOR;4"; // 外部デマンド列の書式
    String validStockColKind = "OBT_NUMBER;14.1;FLOOR;4"; // 有効在庫列の書式
    String stocksColKind = "OBT_NUMBER;14.1;FLOOR;4"; // 上記以外の数値列の書式
    String dateColKind = "OBT_DATE;TYPE_YMD"; // 日付列の書式

    if(loopCount == 0){
        dateColKind = "";
        stocksColKind = "";
    }
    if(beforeDate.equals(aAC0060010Struct.getPlanDate())){
        stocksColKind = "";
        validStockColKind = "";
    }else{
        beforeDate = aAC0060010Struct.getPlanDate();
    }
    if(AC0060Const.C_KIND_ODER.equals(aAC0060010Struct.getOD_TYP()) == false){
        extOderColKind = "";
    }
    if(AC0060Const.C_KIND_DMD.equals(aAC0060010Struct.getOD_TYP()) == false){
        extDemandColKind = "";
    }

%> <%
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-PlanDate-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-PlanDate\" data-name=\"PlanDate\" data-view=\"true\" data-kind=\"").append( dateColKind ).append("\" data-rowselectable=\"").append( canSelect ).append("\" style=\"color:#").append(selColor).append(";\">").append(TypeConverter.sanitizer(aAC0060010Struct.getPlanDate())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-FixedDemand-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-FixedDemand\" data-name=\"FixedDemand\" data-view=\"true\" data-kind=\"").append( stocksColKind ).append("\">").append(TypeConverter.sanitizer(aAC0060010Struct.getFixedDemand())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-PlanDemand-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-PlanDemand\" data-name=\"PlanDemand\" data-view=\"true\" data-kind=\"").append( stocksColKind ).append("\">").append(TypeConverter.sanitizer(aAC0060010Struct.getPlanDemand())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-dispDM_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-dispDM_QTY\" data-name=\"dispDM_QTY\" data-view=\"true\" data-kind=\"").append( extDemandColKind ).append("\">").append(TypeConverter.sanitizer(aAC0060010Struct.getdispDM_QTY())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-DM_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-DM_QTY\" data-name=\"DM_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getDM_QTY())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-FixedOrder-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-FixedOrder\" data-name=\"FixedOrder\" data-view=\"true\" data-kind=\"").append( stocksColKind ).append("\">").append(TypeConverter.sanitizer(aAC0060010Struct.getFixedOrder())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-PlanOrder-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-PlanOrder\" data-name=\"PlanOrder\" data-view=\"true\" data-kind=\"").append( stocksColKind ).append("\">").append(TypeConverter.sanitizer(aAC0060010Struct.getPlanOrder())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-dispODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-dispODR_QTY\" data-name=\"dispODR_QTY\" data-view=\"true\" data-kind=\"").append( extOderColKind ).append("\">").append(TypeConverter.sanitizer(aAC0060010Struct.getdispODR_QTY())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-ODR_QTY\" data-name=\"ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getODR_QTY())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-ValidStock-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-ValidStock\" data-name=\"ValidStock\" data-view=\"true\" data-kind=\"").append( validStockColKind ).append("\">").append(TypeConverter.sanitizer(aAC0060010Struct.getValidStock())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-OD_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-OD_MODIFY_COUNT\" data-name=\"OD_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getOD_MODIFY_COUNT())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-EXT_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-EXT_MODIFY_COUNT\" data-name=\"EXT_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getEXT_MODIFY_COUNT())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-EXTERNAL_DM_FLG-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-EXTERNAL_DM_FLG\" data-name=\"EXTERNAL_DM_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getEXTERNAL_DM_FLG())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-OD_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-OD_TYP\" data-name=\"OD_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getOD_TYP())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-EXTERNAL_PLAN_DEL_FLG-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-EXTERNAL_PLAN_DEL_FLG\" data-name=\"EXTERNAL_PLAN_DEL_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getEXTERNAL_PLAN_DEL_FLG())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-LowerDeploy-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-LowerDeploy\" data-name=\"LowerDeploy\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getLowerDeploy())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-Expect-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-Expect\" data-name=\"Expect\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getExpect())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-OD_NO\" data-name=\"OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getOD_NO())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-EXTERNAL_PLAN_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-EXTERNAL_PLAN_CD\" data-name=\"EXTERNAL_PLAN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getEXTERNAL_PLAN_CD())).append("</span>'");
 AC0060010view1_DB.append(",").append("'<span id=\"expj-AC0060010-AC0060010view1-PlanTime-").append(loopCount).append("\" class=\"expj-label expj-AC0060010-AC0060010view1-PlanTime\" data-name=\"PlanTime\" data-view=\"true\" data-kind=\"OBT_N;\">").append(TypeConverter.sanitizer(aAC0060010Struct.getPlanTime())).append("</span>'");
 AC0060010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0060010StructLength) {
   AC0060010view1_DB.append(",");
  }
 }
 aAC0060010Struct = structBackup;
 viewIdList.add(AC0060010view1_Id);
 viewSelectList.add(AC0060010view1_select);
 viewResizeList.add(AC0060010view1_resize);
 viewScrollList.add(AC0060010view1_scroll);
 viewHeaderDataList.add(AC0060010view1_HB);
 viewBodyDataList.add(AC0060010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AC0060010-AC0060010button2">
expj.AC0060010.AC0060010button2 = {};
expj.AC0060010.AC0060010button2.executeAllOnDecision = function () {
  console.log('execute AC0060010button2.onDecision');
};
expj.AC0060010.AC0060010button2.executeOnLoad = function () {
  expj.AC0060010.AC0060010button2.executePScriptOnLoad();
};

expj.AC0060010.AC0060010button2.executePScriptOnLoad = function () {
  console.log('execute AC0060010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0060010-AC0060010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0060010-AC0060010button2-append">
expj.AC0060010.AC0060010button2.append = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0060010form1/*@AC0060010Servlet"
expj.AC0060010.AC0060010button2.append.onClick0 = function () {
  console.log('append script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0060010', 'AC0060010button2', '_AC0060010form1/*', 'AC0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0060010', response);
expj.common.changeBusinessScreenTab('AC0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0060010.AC0060010button2.append.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010button2.append['onClick' + i])) {
        expj.AC0060010.AC0060010button2.append['onClick' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010button2.append.executeAllOnDecision = function () {
};
expj.AC0060010.AC0060010button2.append.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010button2-append').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060010', 'AC0060010button2', 'append', this, 'Button');
    }
  });
  expj.AC0060010.AC0060010button2.append.executePScriptOnLoad();
};

expj.AC0060010.AC0060010button2.append.executePScriptOnLoad = function () {
  console.log('execute AC0060010button2/append.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010button2-append');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0060010-AC0060010button2-append" name="append" class="AC0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010button2-modify">
expj.AC0060010.AC0060010button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0060010form1/*,_AC0060010view1/+@AC0060010Servlet"
expj.AC0060010.AC0060010button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0060010', 'AC0060010button2', '_AC0060010form1/*,_AC0060010view1/+', 'AC0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0060010', response);
expj.common.changeBusinessScreenTab('AC0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0060010.AC0060010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010button2.modify['onClick' + i])) {
        expj.AC0060010.AC0060010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010button2.modify.executeAllOnDecision = function () {
};
expj.AC0060010.AC0060010button2.modify.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060010', 'AC0060010button2', 'modify', this, 'Button');
    }
  });
  expj.AC0060010.AC0060010button2.modify.executePScriptOnLoad();
};

expj.AC0060010.AC0060010button2.modify.executePScriptOnLoad = function () {
  console.log('execute AC0060010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0060010-AC0060010button2-modify" name="modify" class="AC0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0060010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AC0060010-AC0060010button0">
expj.AC0060010.AC0060010button0 = {};
expj.AC0060010.AC0060010button0.executeAllOnDecision = function () {
  console.log('execute AC0060010button0.onDecision');
};
expj.AC0060010.AC0060010button0.executeOnLoad = function () {
  expj.AC0060010.AC0060010button0.executePScriptOnLoad();
};

expj.AC0060010.AC0060010button0.executePScriptOnLoad = function () {
  console.log('execute AC0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0060010-AC0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0060010-AC0060010button0-clear">
expj.AC0060010.AC0060010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0060010Servlet,,$ZZ07008"
expj.AC0060010.AC0060010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0060010', 'AC0060010button0', '', 'AC0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0060010', response);
expj.common.updateBusinessScreenTab('AC0060010', contents);
};
expj.common.pscript.callConfirm('AC0060010', 'AC0060010button0', 'ZZ07008', okEvent);
};
expj.AC0060010.AC0060010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010button0.clear['onClick' + i])) {
        expj.AC0060010.AC0060010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010button0.clear.executeAllOnDecision = function () {
};
expj.AC0060010.AC0060010button0.clear.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060010', 'AC0060010button0', 'clear', this, 'Button');
    }
  });
  expj.AC0060010.AC0060010button0.clear.executePScriptOnLoad();
};

expj.AC0060010.AC0060010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AC0060010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0060010-AC0060010button0-clear" name="clear" class="AC0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0060010-AC0060010button0-close">
expj.AC0060010.AC0060010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AC0060010.AC0060010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AC0060010');
};
expj.AC0060010.AC0060010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060010.AC0060010button0.close['onClick' + i])) {
        expj.AC0060010.AC0060010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AC0060010.AC0060010button0.close.executeAllOnDecision = function () {
};
expj.AC0060010.AC0060010button0.close.executeOnLoad = function () {
  $('#expj-AC0060010-AC0060010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060010', 'AC0060010button0', 'close', this, 'Button');
    }
  });
  expj.AC0060010.AC0060010button0.close.executePScriptOnLoad();
};

expj.AC0060010.AC0060010button0.close.executePScriptOnLoad = function () {
  console.log('execute AC0060010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AC0060010-AC0060010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0060010-AC0060010button0-close" name="close" class="AC0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0060010 (END)-->
<script class="expj-script-AC0060010-AC0060010detail1">
expj.AC0060010.AC0060010detail1 = {};
expj.AC0060010.AC0060010detail1.executeAllOnDecision = function () {
  console.log('execute AC0060010detail1.onDecision');
};
expj.AC0060010.AC0060010detail1.executeOnLoad = function () {
  expj.AC0060010.AC0060010detail1.executePScriptOnLoad();
};

expj.AC0060010.AC0060010detail1.executePScriptOnLoad = function () {
  console.log('execute AC0060010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAC0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AC0060010-AC0060010detail1" class="expj-datagird-detail" data-float="AC0060010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AC0060010detail1";
 detailFloat = "AC0060010float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AC0060010detail1_Id = "AC0060010detail1";
 String AC0060010detail1_select = "single";
 String AC0060010detail1_sortable = "true";
 String AC0060010detail1_resize = "true";
 String AC0060010detail1_scroll = "true";
 StringBuffer AC0060010detail1_HB = new StringBuffer();
 StringBuffer AC0060010detail1_DB = new StringBuffer();
%>
<%
 AC0060010detail1_sortable = "false";
 AC0060010detail1_select = "none";
%>
<% AC0060010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AC0060010detail1_sortable).append("}").append(","); %>
<%  AC0060010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AC0060010detail1_sortable).append("}").append(",");
AC0060010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AC0060010detail1_sortable).append("}").append(",");
AC0060010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AC0060010detail1_sortable).append("}").append(",");
 %>
  <% AC0060010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AC0060010-AC0060010detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_SPEC",rb)).append("','").append("<span id=\"expj-AC0060010-AC0060010detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AC0060010-AC0060010detail1-MRP_ODR_NAME\" class=\"expj-label\" data-name=\"MRP_ODR_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getMRP_ODR_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AC0060010-AC0060010detail1-OUTSIDE_NAME\" class=\"expj-label\" data-name=\"OUTSIDE_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getOUTSIDE_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0060010-AC0060010detail1-ITEM_SPOIL\" class=\"expj-label\" data-name=\"ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0060010Struct.getITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AC0060010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AC0060010-AC0060010detail1-UNIT_QTY_NAME\" class=\"expj-label\" data-name=\"UNIT_QTY_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getUNIT_QTY_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.LOT_SIZING_TYP",rb)).append("','").append("<span id=\"expj-AC0060010-AC0060010detail1-LOT_SIZING_NAME\" class=\"expj-label\" data-name=\"LOT_SIZING_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getLOT_SIZING_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.MAX_PERIOD",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0060010-AC0060010detail1-MAX_PERIOD\" class=\"expj-label\" data-name=\"MAX_PERIOD\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAC0060010Struct.getMAX_PERIOD())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.MUL_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0060010-AC0060010detail1-MUL_ODR_QTY\" class=\"expj-label\" data-name=\"MUL_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0060010Struct.getMUL_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0060010-AC0060010detail1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.MAX_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0060010-AC0060010detail1-MAX_ODR_QTY\" class=\"expj-label\" data-name=\"MAX_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0060010Struct.getMAX_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0060010-AC0060010detail1-STOCK_UNIT_1\" class=\"expj-label\" data-name=\"STOCK_UNIT_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.MIN_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0060010-AC0060010detail1-MIN_ODR_QTY\" class=\"expj-label\" data-name=\"MIN_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0060010Struct.getMIN_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0060010-AC0060010detail1-STOCK_UNIT_2\" class=\"expj-label\" data-name=\"STOCK_UNIT_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.SAFETY_STOCK",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0060010-AC0060010detail1-SAFETY_STOCK\" class=\"expj-label\" data-name=\"SAFETY_STOCK\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0060010Struct.getSAFETY_STOCK())).append("</span>").append("</div>','").append("<span id=\"expj-AC0060010-AC0060010detail1-STOCK_UNIT_3\" class=\"expj-label\" data-name=\"STOCK_UNIT_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0060010detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0060010-AC0060010detail1-STOCK_ON_HAND_QTY\" class=\"expj-label\" data-name=\"STOCK_ON_HAND_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0060010Struct.getSTOCK_ON_HAND_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0060010-AC0060010detail1-STOCK_UNIT_4\" class=\"expj-label\" data-name=\"STOCK_UNIT_4\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0060010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AC0060010detail1_Id;
 detailViewSelect = AC0060010detail1_select;
 detailViewResize = AC0060010detail1_resize;
 detailViewScroll = AC0060010detail1_scroll;
 detailViewHeaderData = AC0060010detail1_HB;
 detailViewBodyData = AC0060010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAC0060010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0060010)) {
  expj.common.treeInstanceMap.AC0060010 = {};
}
expj.common.treeInstanceMap.AC0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0060010)) {
  expj.common.detailDialogMap.AC0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0060010)) {
  expj.common.viewInstanceMap.AC0060010 = {};
}
expj.common.viewInstanceMap.AC0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0060010.<%=viewId %>.init = function () {
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
    expj.AC0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0060010_init">
/**
 * AC0060010用のロード完了時初期化関数
 */
expj.AC0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0060010');
  expj.common.calendarInstanceMap.AC0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0060010.AC0060010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010form1.w_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010form1.CalendarFromDate.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010form1.w_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010form1.CalendarToDate.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010button1.select.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010button2.append.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010button2.modify.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010button0.close.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010form1.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010button1.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010view1.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010button2.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010button0.executeOnLoad();}catch(e){};
  try{expj.AC0060010.AC0060010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0060010', 'AC0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0060010', '<%=request.getContextPath() %>');
};

/**
 * AC0060010の全体onDecision処理
 */
expj.AC0060010.executeAllOnDecision = function () {
  expj.AC0060010.AC0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0060010_console">
expj.AC0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>