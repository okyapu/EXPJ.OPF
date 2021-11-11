<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:31:06 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0040\AD0040012.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0040.*" %>
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
<jsp:useBean id="aAD0040010Control" class="com.nec.jp.orteus.metamorBase.AD0040.AD0040010Control" scope="request"/>
<jsp:useBean id="aAD0040010Struct" class="com.nec.jp.orteus.metamorBase.AD0040.AD0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業実績メンテナンスサブ２
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0040/jsp/AD0040012.jsp,v $
$Author: geng-jia $	
$Revision: 1.29 $ $Date: 2017/02/22 02:04:49 $
********************************************************* --%>
<html>
<head>
<title>作業実績メンテナンスサブ２</title>
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
<script class="expj-script-AD0040010_init">
  // AD0040010名前空間
  expj.AD0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
 <% String callButton = aAD0040010Control.getButton(); %>

  <div id="expj-business-screen-AD0040010" data-screen="AD0040012" data-newdata="<%=aAD0040010Control.isNewData() %>">
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
              <script class="expj-script-AD0040010-AD0040012form1">
expj.AD0040010.AD0040012form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.AD0040010.AD0040012form1.onLoad0 = function () {
  console.log('AD0040012form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHKRQ;A,B@*0,*2"
expj.AD0040010.AD0040012form1.onDecision0 = function () {
  console.log('AD0040012form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AD0040010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AD0040010', 'B')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHK;<%=TypeConverter.sanitizer(callButton)%>[eq]UseParts[or]<%=TypeConverter.sanitizer(callButton)%>[eq]Insert12@*1,*2"
expj.AD0040010.AD0040012form1.child0 = function () {
  console.log('AD0040012form1 script3');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'UseParts') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'Insert12')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;UNMASK;_AD0040012button1/Insert12"
expj.AD0040010.AD0040012form1.child1 = function () {
  console.log('AD0040012form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_AD0040012button1/Insert12');
};
// script5="child;2;MASK;_AD0040012button1/Insert12"
expj.AD0040010.AD0040012form1.child2 = function () {
  console.log('AD0040012form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_AD0040012button1/Insert12');
};
// script6="onDecision;1;CHKRQ;B@*3,*5"
expj.AD0040010.AD0040012form1.onDecision1 = function () {
  console.log('AD0040012form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AD0040010', 'B')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHK;<%=TypeConverter.sanitizer(callButton)%>[eq]NoUserParts[or]<%=TypeConverter.sanitizer(callButton)%>[eq]Update12@*4,*5"
expj.AD0040010.AD0040012form1.child3 = function () {
  console.log('AD0040012form1 script7');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'NoUserParts') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'Update12')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AD0040012button1/Update12"
expj.AD0040010.AD0040012form1.child4 = function () {
  console.log('AD0040012form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_AD0040012button1/Update12');
};
// script9="child;5;MASK;_AD0040012button1/Update12"
expj.AD0040010.AD0040012form1.child5 = function () {
  console.log('AD0040012form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_AD0040012button1/Update12');
};
// script10="onDecision;2;CHK;<%=TypeConverter.sanitizer(callButton)%>[eq]UseParts[or]<%=TypeConverter.sanitizer(callButton)%>[eq]Insert12@*6,*7"
expj.AD0040010.AD0040012form1.onDecision2 = function () {
  console.log('AD0040012form1 script10');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'UseParts') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'Insert12')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_ITEM_CD,_PeekerItemCd"
expj.AD0040010.AD0040012form1.child6 = function () {
  console.log('AD0040012form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_PeekerItemCd');
};
// script12="child;7;MASK;_ITEM_CD,_PeekerItemCd"
expj.AD0040010.AD0040012form1.child7 = function () {
  console.log('AD0040012form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_PeekerItemCd');
};
// script13="onDecision;3;CHK;_AD0040012form1/TIME_CTRL[eq]true@*8,*9"
expj.AD0040010.AD0040012form1.onDecision3 = function () {
  console.log('AD0040012form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_AD0040012form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script14="child;8;UNMASK;_AD0040012form1/RCV_ISSUE_TIME"
expj.AD0040010.AD0040012form1.child8 = function () {
  console.log('AD0040012form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_AD0040012form1/RCV_ISSUE_TIME');
};
// script15="child;9;MASK;_AD0040012form1/RCV_ISSUE_TIME"
expj.AD0040010.AD0040012form1.child9 = function () {
  console.log('AD0040012form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_AD0040012form1/RCV_ISSUE_TIME');
};
// script16="onDecision;4;CHK;_AD0040012form1/h_SYS_LOT_CTRL_FLG[eq]true@*10,*13"
expj.AD0040010.AD0040012form1.onDecision4 = function () {
  console.log('AD0040012form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_AD0040012form1/h_SYS_LOT_CTRL_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script17="child;10;CHK;<%=TypeConverter.sanitizer(callButton)%>[eq]UseParts[or]<%=TypeConverter.sanitizer(callButton)%>[eq]Insert12@*11,*12"
expj.AD0040010.AD0040012form1.child10 = function () {
  console.log('AD0040012form1 script17');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'UseParts') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'Insert12')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script18="child;11;UNMASK;_LOT_NO,_PeekerLotNo"
expj.AD0040010.AD0040012form1.child11 = function () {
  console.log('AD0040012form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_PeekerLotNo');
};
// script19="child;12;CHK;_AD0040012form1/h_LOT_NO[eq]@*11,*13"
expj.AD0040010.AD0040012form1.child12 = function () {
  console.log('AD0040012form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_AD0040012form1/h_LOT_NO'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script20="child;13;MASK;_LOT_NO,_PeekerLotNo"
expj.AD0040010.AD0040012form1.child13 = function () {
  console.log('AD0040012form1 script20');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040012form1', '_PeekerLotNo');
};
// script21="onDecision;5;SET;_d1_STOCK_UNIT=_STOCK_UNIT,_d2_STOCK_UNIT=_STOCK_UNIT,_d3_STOCK_UNIT=_STOCK_UNIT"
expj.AD0040010.AD0040012form1.onDecision5 = function () {
  console.log('AD0040012form1 script21');
expj.common.pscript.setReferenceComponentValue('AD0040010', 'AD0040012form1', '_d1_STOCK_UNIT', expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_STOCK_UNIT'));
expj.common.pscript.setReferenceComponentValue('AD0040010', 'AD0040012form1', '_d2_STOCK_UNIT', expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_STOCK_UNIT'));
expj.common.pscript.setReferenceComponentValue('AD0040010', 'AD0040012form1', '_d3_STOCK_UNIT', expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_STOCK_UNIT'));
};
expj.AD0040010.AD0040012form1.executeAllOnDecision = function () {
  console.log('execute AD0040012form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040012form1['onDecision' + i])) {
        expj.AD0040010.AD0040012form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040012form1.executeOnLoad = function () {
  expj.AD0040010.AD0040012form1.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0040010.AD0040012form1['onLoad' + i])) {
      expj.AD0040010.AD0040012form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0040010-AD0040012form1" action="AD0040010Servlet" name="AD0040012form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_5",rb)%></span><!-- 子品目番号 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-ITEM_CD">
expj.AD0040010.AD0040012form1.ITEM_CD = {};
expj.AD0040010.AD0040012form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/ITEM_CD.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'ITEM_CD', this);
  });
  expj.AD0040010.AD0040012form1.ITEM_CD.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-ITEM_CD" name="ITEM_CD" class="AD0040010-focus-move  required-value expj-AD0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-PeekerItemCd">
expj.AD0040010.AD0040012form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AD0040012form1/ITEM_CD@<%=contextNo%>"
expj.AD0040010.AD0040012form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0040010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AD0040012form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0040010.AD0040012form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040012form1.PeekerItemCd['onClick' + i])) {
        expj.AD0040010.AD0040012form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040012form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040012form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040012form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AD0040010.AD0040012form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0040010-AD0040012form1-PeekerItemCd" class="AD0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-ITEM_NAME">
expj.AD0040010.AD0040012form1.ITEM_NAME = {};
expj.AD0040010.AD0040012form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/ITEM_NAME.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'ITEM_NAME', this);
  });
  expj.AD0040010.AD0040012form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-ITEM_NAME" name="ITEM_NAME" class="AD0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD_4",rb)%></span><!-- 使用元保管区 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-WH_CD">
expj.AD0040010.AD0040012form1.WH_CD = {};
expj.AD0040010.AD0040012form1.WH_CD.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/WH_CD.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.WH_CD.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'WH_CD', this);
  });
  expj.AD0040010.AD0040012form1.WH_CD.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-WH_CD" name="WH_CD" class="AD0040010-focus-move  required-value expj-AD0040010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-PeekerWhCd">
expj.AD0040010.AD0040012form1.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AD0040012form1/WH_CD@<%=contextNo%>"
expj.AD0040010.AD0040012form1.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0040010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0040010', 'PeekerWhCd', 'SQLPARAM_1', '<%=aAD0040010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0040012form1/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0040010.AD0040012form1.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040012form1.PeekerWhCd['onClick' + i])) {
        expj.AD0040010.AD0040012form1.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040012form1.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040012form1.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040012form1', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AD0040010.AD0040012form1.PeekerWhCd.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0040010-AD0040012form1-PeekerWhCd" class="AD0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-WH_NAME">
expj.AD0040010.AD0040012form1.WH_NAME = {};
expj.AD0040010.AD0040012form1.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/WH_NAME.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.WH_NAME.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'WH_NAME', this);
  });
  expj.AD0040010.AD0040012form1.WH_NAME.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-WH_NAME" name="WH_NAME" class="AD0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD_1",rb)%></span><!-- 使用元製番 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-JOB_ODR_CD">
expj.AD0040010.AD0040012form1.JOB_ODR_CD = {};
expj.AD0040010.AD0040012form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/JOB_ODR_CD.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'JOB_ODR_CD', this);
  });
  expj.AD0040010.AD0040012form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AD0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-PeekerJobOdrCd">
expj.AD0040010.AD0040012form1.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AD0040012form1/JOB_ODR_CD@<%=contextNo%>"
expj.AD0040010.AD0040012form1.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0040010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0040010', 'PeekerJobOdrCd', 'SQLPARAM_1', '<%=aAD0040010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AD0040012form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0040010.AD0040012form1.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040012form1.PeekerJobOdrCd['onClick' + i])) {
        expj.AD0040010.AD0040012form1.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040012form1.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040012form1.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040012form1', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AD0040010.AD0040012form1.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0040010-AD0040012form1-PeekerJobOdrCd" class="AD0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0320",rb)%></span><!-- 計画使用数量 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-TEMP_PLAN_QTY">
expj.AD0040010.AD0040012form1.TEMP_PLAN_QTY = {};
expj.AD0040010.AD0040012form1.TEMP_PLAN_QTY.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/TEMP_PLAN_QTY.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.TEMP_PLAN_QTY.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-TEMP_PLAN_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'TEMP_PLAN_QTY', this);
  });
  expj.AD0040010.AD0040012form1.TEMP_PLAN_QTY.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.TEMP_PLAN_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/TEMP_PLAN_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-TEMP_PLAN_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-TEMP_PLAN_QTY" name="TEMP_PLAN_QTY" class="AD0040010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getTEMP_PLAN_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-STOCK_UNIT">
expj.AD0040010.AD0040012form1.STOCK_UNIT = {};
expj.AD0040010.AD0040012form1.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/STOCK_UNIT.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'STOCK_UNIT', this);
  });
  expj.AD0040010.AD0040012form1.STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-STOCK_UNIT" name="STOCK_UNIT" class="AD0040010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0321",rb)%></span><!-- 使用済数量 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-TEMP_USEOVER_QTY">
expj.AD0040010.AD0040012form1.TEMP_USEOVER_QTY = {};
expj.AD0040010.AD0040012form1.TEMP_USEOVER_QTY.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/TEMP_USEOVER_QTY.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.TEMP_USEOVER_QTY.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-TEMP_USEOVER_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'TEMP_USEOVER_QTY', this);
  });
  expj.AD0040010.AD0040012form1.TEMP_USEOVER_QTY.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.TEMP_USEOVER_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/TEMP_USEOVER_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-TEMP_USEOVER_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-TEMP_USEOVER_QTY" name="TEMP_USEOVER_QTY" class="AD0040010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getTEMP_USEOVER_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-d1_STOCK_UNIT">
expj.AD0040010.AD0040012form1.d1_STOCK_UNIT = {};
expj.AD0040010.AD0040012form1.d1_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/d1_STOCK_UNIT.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.d1_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-d1_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'd1_STOCK_UNIT', this);
  });
  expj.AD0040010.AD0040012form1.d1_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.d1_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/d1_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-d1_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-d1_STOCK_UNIT" name="d1_STOCK_UNIT" class="AD0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0322",rb)%></span><!-- 計画外使用済数量 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-TEMP_PLANOUT_QTY">
expj.AD0040010.AD0040012form1.TEMP_PLANOUT_QTY = {};
expj.AD0040010.AD0040012form1.TEMP_PLANOUT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/TEMP_PLANOUT_QTY.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.TEMP_PLANOUT_QTY.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-TEMP_PLANOUT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'TEMP_PLANOUT_QTY', this);
  });
  expj.AD0040010.AD0040012form1.TEMP_PLANOUT_QTY.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.TEMP_PLANOUT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/TEMP_PLANOUT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-TEMP_PLANOUT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-TEMP_PLANOUT_QTY" name="TEMP_PLANOUT_QTY" class="AD0040010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getTEMP_PLANOUT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-d2_STOCK_UNIT">
expj.AD0040010.AD0040012form1.d2_STOCK_UNIT = {};
expj.AD0040010.AD0040012form1.d2_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/d2_STOCK_UNIT.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.d2_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-d2_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'd2_STOCK_UNIT', this);
  });
  expj.AD0040010.AD0040012form1.d2_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.d2_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/d2_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-d2_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-d2_STOCK_UNIT" name="d2_STOCK_UNIT" class="AD0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0323",rb)%></span><!-- 更新使用数量 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-TEMP_USE_QTY">
expj.AD0040010.AD0040012form1.TEMP_USE_QTY = {};
expj.AD0040010.AD0040012form1.TEMP_USE_QTY.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/TEMP_USE_QTY.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.TEMP_USE_QTY.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-TEMP_USE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'TEMP_USE_QTY', this);
  });
  expj.AD0040010.AD0040012form1.TEMP_USE_QTY.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.TEMP_USE_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/TEMP_USE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-TEMP_USE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-TEMP_USE_QTY" name="TEMP_USE_QTY" class="AD0040010-focus-move  required-value expj-AD0040010-required-B" style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getTEMP_USE_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-d3_STOCK_UNIT">
expj.AD0040010.AD0040012form1.d3_STOCK_UNIT = {};
expj.AD0040010.AD0040012form1.d3_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/d3_STOCK_UNIT.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.d3_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-d3_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'd3_STOCK_UNIT', this);
  });
  expj.AD0040010.AD0040012form1.d3_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.d3_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/d3_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-d3_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-d3_STOCK_UNIT" name="d3_STOCK_UNIT" class="AD0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.RCV_ISSUE_DATE_1",rb)%></span><!-- 使用日 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-RCV_ISSUE_DATE">
expj.AD0040010.AD0040012form1.RCV_ISSUE_DATE = {};
expj.AD0040010.AD0040012form1.RCV_ISSUE_DATE.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/RCV_ISSUE_DATE.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.RCV_ISSUE_DATE.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-RCV_ISSUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'RCV_ISSUE_DATE', this);
  });
  expj.AD0040010.AD0040012form1.RCV_ISSUE_DATE.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.RCV_ISSUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/RCV_ISSUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-RCV_ISSUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-RCV_ISSUE_DATE" name="RCV_ISSUE_DATE" class="AD0040010-focus-move  required-value expj-AD0040010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getRCV_ISSUE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-CalendarRcvIssueDate">
expj.AD0040010.AD0040012form1.CalendarRcvIssueDate = {};
// script1="onClick;0;CALENDAR;_AD0040012form1/RCV_ISSUE_DATE"
expj.AD0040010.AD0040012form1.CalendarRcvIssueDate.onClick0 = function () {
  console.log('CalendarRcvIssueDate script1');
expj.common.pscript.executeCalendar('AD0040010','AD0040012form1','_AD0040012form1/RCV_ISSUE_DATE');
};
expj.AD0040010.AD0040012form1.CalendarRcvIssueDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040012form1.CalendarRcvIssueDate['onClick' + i])) {
        expj.AD0040010.AD0040012form1.CalendarRcvIssueDate['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040012form1.CalendarRcvIssueDate.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040012form1.CalendarRcvIssueDate.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-CalendarRcvIssueDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040012form1', 'CalendarRcvIssueDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0040010','AD0040012form1','_AD0040012form1/RCV_ISSUE_DATE');
  expj.AD0040010.AD0040012form1.CalendarRcvIssueDate.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.CalendarRcvIssueDate.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/CalendarRcvIssueDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-CalendarRcvIssueDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0040010-AD0040012form1-CalendarRcvIssueDate" class="AD0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-RCV_ISSUE_TIME">
expj.AD0040010.AD0040012form1.RCV_ISSUE_TIME = {};
expj.AD0040010.AD0040012form1.RCV_ISSUE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/RCV_ISSUE_TIME.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.RCV_ISSUE_TIME.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-RCV_ISSUE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'RCV_ISSUE_TIME', this);
  });
  expj.AD0040010.AD0040012form1.RCV_ISSUE_TIME.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.RCV_ISSUE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/RCV_ISSUE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-RCV_ISSUE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-RCV_ISSUE_TIME" name="RCV_ISSUE_TIME" class="AD0040010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getRCV_ISSUE_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-LOT_NO">
expj.AD0040010.AD0040012form1.LOT_NO = {};
expj.AD0040010.AD0040012form1.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/LOT_NO.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.LOT_NO.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'LOT_NO', this);
  });
  expj.AD0040010.AD0040012form1.LOT_NO.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-LOT_NO" name="LOT_NO" class="AD0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getLOT_NO()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040012form1-h_SYS_LOT_CTRL_FLG" name="h_SYS_LOT_CTRL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_SYS_LOT_CTRL_FLG()) %>">
<script class="expj-script-AD0040010-AD0040012form1-h_SYS_LOT_CTRL_FLG">
expj.AD0040010.AD0040012form1.h_SYS_LOT_CTRL_FLG = {};
expj.AD0040010.AD0040012form1.h_SYS_LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/h_SYS_LOT_CTRL_FLG.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.h_SYS_LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-h_SYS_LOT_CTRL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'h_SYS_LOT_CTRL_FLG', this);
  });
  expj.AD0040010.AD0040012form1.h_SYS_LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.h_SYS_LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/h_SYS_LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-h_SYS_LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0040010-AD0040012form1-PeekerLotNo">
expj.AD0040010.AD0040012form1.PeekerLotNo = {};
// script1="onClick;0;PEEKER;_AD0040012form1/LOT_NO::@<%=contextNo%>"
expj.AD0040010.AD0040012form1.PeekerLotNo.onClick0 = function () {
  console.log('PeekerLotNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0040010';
var parameterValues = 'PeekerLotNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_AD0040012form1/LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_AD0040012form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012form1', '_AD0040012form1/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_12%&%';
parameterValues += 'TARGET_FIELD%=%_AD0040012form1/LOT_NO::%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0040010.AD0040012form1.PeekerLotNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040012form1.PeekerLotNo['onClick' + i])) {
        expj.AD0040010.AD0040012form1.PeekerLotNo['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040012form1.PeekerLotNo.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040012form1.PeekerLotNo.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-PeekerLotNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040012form1', 'PeekerLotNo', this, 'Button');
    }
  });
  expj.AD0040010.AD0040012form1.PeekerLotNo.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.PeekerLotNo.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/PeekerLotNo.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-PeekerLotNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0040010-AD0040012form1-PeekerLotNo" class="AD0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_LOT_NO_1",rb)%></span><!-- 製造ロット番号 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-VEND_LOT_NO">
expj.AD0040010.AD0040012form1.VEND_LOT_NO = {};
expj.AD0040010.AD0040012form1.VEND_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/VEND_LOT_NO.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.VEND_LOT_NO.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-VEND_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'VEND_LOT_NO', this);
  });
  expj.AD0040010.AD0040012form1.VEND_LOT_NO.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.VEND_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/VEND_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-VEND_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-VEND_LOT_NO" name="VEND_LOT_NO" class="AD0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getVEND_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040012form1-h_LOT_NO" name="h_LOT_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_LOT_NO()) %>">
<script class="expj-script-AD0040010-AD0040012form1-h_LOT_NO">
expj.AD0040010.AD0040012form1.h_LOT_NO = {};
expj.AD0040010.AD0040012form1.h_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/h_LOT_NO.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.h_LOT_NO.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-h_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'h_LOT_NO', this);
  });
  expj.AD0040010.AD0040012form1.h_LOT_NO.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.h_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/h_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-h_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.RCV_ISSUE_COMMENT_2",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-RCV_ISSUE_COMMENT">
expj.AD0040010.AD0040012form1.RCV_ISSUE_COMMENT = {};
expj.AD0040010.AD0040012form1.RCV_ISSUE_COMMENT.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/RCV_ISSUE_COMMENT.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.RCV_ISSUE_COMMENT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-RCV_ISSUE_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'RCV_ISSUE_COMMENT', this);
  });
  expj.AD0040010.AD0040012form1.RCV_ISSUE_COMMENT.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.RCV_ISSUE_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/RCV_ISSUE_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-RCV_ISSUE_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-RCV_ISSUE_COMMENT" name="RCV_ISSUE_COMMENT" class="AD0040010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getRCV_ISSUE_COMMENT()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP_4",rb)%></span><!-- 手配区分 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-MRP_ODR_TYP_DN">
expj.AD0040010.AD0040012form1.MRP_ODR_TYP_DN = {};
expj.AD0040010.AD0040012form1.MRP_ODR_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/MRP_ODR_TYP_DN.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.MRP_ODR_TYP_DN.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-MRP_ODR_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'MRP_ODR_TYP_DN', this);
  });
  expj.AD0040010.AD0040012form1.MRP_ODR_TYP_DN.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.MRP_ODR_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/MRP_ODR_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-MRP_ODR_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-MRP_ODR_TYP_DN" name="MRP_ODR_TYP_DN" class="AD0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getMRP_ODR_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040012form1-MRP_ODR_TYP" name="MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getMRP_ODR_TYP()) %>">
<script class="expj-script-AD0040010-AD0040012form1-MRP_ODR_TYP">
expj.AD0040010.AD0040012form1.MRP_ODR_TYP = {};
expj.AD0040010.AD0040012form1.MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/MRP_ODR_TYP.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'MRP_ODR_TYP', this);
  });
  expj.AD0040010.AD0040012form1.MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_TYP_2",rb)%></span><!-- 出庫指示出庫区分 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012form1-ISSUE_TYP_DN">
expj.AD0040010.AD0040012form1.ISSUE_TYP_DN = {};
expj.AD0040010.AD0040012form1.ISSUE_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/ISSUE_TYP_DN.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.ISSUE_TYP_DN.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-ISSUE_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'ISSUE_TYP_DN', this);
  });
  expj.AD0040010.AD0040012form1.ISSUE_TYP_DN.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.ISSUE_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/ISSUE_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-ISSUE_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040012form1-ISSUE_TYP_DN" name="ISSUE_TYP_DN" class="AD0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getISSUE_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040012form1-h_ISSUE_TYP" name="h_ISSUE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_ISSUE_TYP()) %>">
<script class="expj-script-AD0040010-AD0040012form1-h_ISSUE_TYP">
expj.AD0040010.AD0040012form1.h_ISSUE_TYP = {};
expj.AD0040010.AD0040012form1.h_ISSUE_TYP.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/h_ISSUE_TYP.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.h_ISSUE_TYP.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-h_ISSUE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'h_ISSUE_TYP', this);
  });
  expj.AD0040010.AD0040012form1.h_ISSUE_TYP.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.h_ISSUE_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/h_ISSUE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-h_ISSUE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0040010-AD0040012form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0040010-AD0040012form1-TIME_CTRL">
expj.AD0040010.AD0040012form1.TIME_CTRL = {};
expj.AD0040010.AD0040012form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/TIME_CTRL.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'TIME_CTRL', this);
  });
  expj.AD0040010.AD0040012form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0040010-AD0040012form1-h_ITEM_MODIFY_COUNT" name="h_ITEM_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_ITEM_MODIFY_COUNT()) %>">
<script class="expj-script-AD0040010-AD0040012form1-h_ITEM_MODIFY_COUNT">
expj.AD0040010.AD0040012form1.h_ITEM_MODIFY_COUNT = {};
expj.AD0040010.AD0040012form1.h_ITEM_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/h_ITEM_MODIFY_COUNT.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.h_ITEM_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-h_ITEM_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'h_ITEM_MODIFY_COUNT', this);
  });
  expj.AD0040010.AD0040012form1.h_ITEM_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.h_ITEM_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/h_ITEM_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-h_ITEM_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040012form1-IN_OPR_INST_CD" name="IN_OPR_INST_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getIN_OPR_INST_CD()) %>">
<script class="expj-script-AD0040010-AD0040012form1-IN_OPR_INST_CD">
expj.AD0040010.AD0040012form1.IN_OPR_INST_CD = {};
expj.AD0040010.AD0040012form1.IN_OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/IN_OPR_INST_CD.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.IN_OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-IN_OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'IN_OPR_INST_CD', this);
  });
  expj.AD0040010.AD0040012form1.IN_OPR_INST_CD.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.IN_OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/IN_OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-IN_OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040012form1-PARTIAL_PRD_NO" name="PARTIAL_PRD_NO" class="" data-kind="OBT_INTEGER_P;6" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getPARTIAL_PRD_NO()) %>">
<script class="expj-script-AD0040010-AD0040012form1-PARTIAL_PRD_NO">
expj.AD0040010.AD0040012form1.PARTIAL_PRD_NO = {};
expj.AD0040010.AD0040012form1.PARTIAL_PRD_NO.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/PARTIAL_PRD_NO.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.PARTIAL_PRD_NO.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-PARTIAL_PRD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'PARTIAL_PRD_NO', this);
  });
  expj.AD0040010.AD0040012form1.PARTIAL_PRD_NO.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.PARTIAL_PRD_NO.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/PARTIAL_PRD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-PARTIAL_PRD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040012form1-h_ISSUE_INST_CD" name="h_ISSUE_INST_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_ISSUE_INST_CD()) %>">
<script class="expj-script-AD0040010-AD0040012form1-h_ISSUE_INST_CD">
expj.AD0040010.AD0040012form1.h_ISSUE_INST_CD = {};
expj.AD0040010.AD0040012form1.h_ISSUE_INST_CD.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/h_ISSUE_INST_CD.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.h_ISSUE_INST_CD.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-h_ISSUE_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'h_ISSUE_INST_CD', this);
  });
  expj.AD0040010.AD0040012form1.h_ISSUE_INST_CD.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.h_ISSUE_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/h_ISSUE_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-h_ISSUE_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040012form1-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-AD0040010-AD0040012form1-h_BUSINESS_OPR_DATE">
expj.AD0040010.AD0040012form1.h_BUSINESS_OPR_DATE = {};
expj.AD0040010.AD0040012form1.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0040012form1/h_BUSINESS_OPR_DATE.onDecision');
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040012form1.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012form1-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040012form1', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.AD0040010.AD0040012form1.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AD0040010.AD0040012form1.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0040012form1/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012form1-h_BUSINESS_OPR_DATE');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AD0040010-AD0040012button1">
expj.AD0040010.AD0040012button1 = {};
expj.AD0040010.AD0040012button1.executeAllOnDecision = function () {
  console.log('execute AD0040012button1.onDecision');
};
expj.AD0040010.AD0040012button1.executeOnLoad = function () {
  expj.AD0040010.AD0040012button1.executePScriptOnLoad();
};

expj.AD0040010.AD0040012button1.executePScriptOnLoad = function () {
  console.log('execute AD0040012button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0040010-AD0040012button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0040010-AD0040012button1-Insert12">
expj.AD0040010.AD0040012button1.Insert12 = {};
// script1="onClick;0;CHK;_AD0040012form1/h_BUSINESS_OPR_DATE[lt]_AD0040012form1/RCV_ISSUE_DATE@#AD30773"
expj.AD0040010.AD0040012button1.Insert12.onClick0 = function () {
  console.log('Insert12 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/h_BUSINESS_OPR_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_DATE')))) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040012button1', 'AD30773');
}
};
// script2="onClick;1;CHK;_AD0040012form1/TEMP_USE_QTY[numeq]0@#AD00030"
expj.AD0040010.AD0040012button1.Insert12.onClick1 = function () {
  console.log('Insert12 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/TEMP_USE_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040012button1', 'AD00030');
}
};
// script3="onClick;2;CHK;_AD0040012form1/TIME_CTRL[eq]true@*0"
expj.AD0040010.AD0040012button1.Insert12.onClick2 = function () {
  console.log('Insert12 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script4="onClick;3;CHK;_AD0040012form1/TIME_CTRL[eq]true[and]~LEN(_AD0040012form1/RCV_ISSUE_TIME)[eq]3@*1"
expj.AD0040010.AD0040012button1.Insert12.onClick3 = function () {
  console.log('Insert12 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script5="onClick;4;CHK;_AD0040012form1/TIME_CTRL[eq]true[and]~LEN(_AD0040012form1/RCV_ISSUE_TIME)[eq]4@*2"
expj.AD0040010.AD0040012button1.Insert12.onClick4 = function () {
  console.log('Insert12 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="onClick;5;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0040012form1/*@AD0040010Servlet,,$ZZ07001"
expj.AD0040010.AD0040012button1.Insert12.onClick5 = function () {
  console.log('Insert12 script6');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040012button1', '_AD0040012form1/*', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.changeBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callConfirm('AD0040010', 'AD0040012button1', 'ZZ07001', okEvent);
};
// script7="child;0;CHK;~LEN(_AD0040012form1/RCV_ISSUE_TIME)[eq]1[or]~LEN(_AD0040012form1/RCV_ISSUE_TIME)[eq]2@#AS00045"
expj.AD0040010.AD0040012button1.Insert12.child0 = function () {
  console.log('Insert12 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040012button1', 'AS00045');
}
};
// script8="child;1;CHK;[{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:1)}*10+{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:2)}][gte]60@#AS00046"
expj.AD0040010.AD0040012button1.Insert12.child1 = function () {
  console.log('Insert12 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040012button1', 'AS00046');
}
};
// script9="child;2;CHK;[{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:0)}*10+{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:1)}][gte]24[or][{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:2)}*10+{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:3)}][gte]60@#AS00046"
expj.AD0040010.AD0040012button1.Insert12.child2 = function () {
  console.log('Insert12 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040012button1', 'AS00046');
}
};
expj.AD0040010.AD0040012button1.Insert12.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040012button1.Insert12['onClick' + i])) {
        expj.AD0040010.AD0040012button1.Insert12['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040012button1.Insert12.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040012button1.Insert12.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012button1-Insert12').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040012button1', 'Insert12', this, 'Button');
    }
  });
  expj.AD0040010.AD0040012button1.Insert12.executePScriptOnLoad();
};

expj.AD0040010.AD0040012button1.Insert12.executePScriptOnLoad = function () {
  console.log('execute AD0040012button1/Insert12.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012button1-Insert12');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040012button1-Insert12" name="Insert12" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040012button1-Update12">
expj.AD0040010.AD0040012button1.Update12 = {};
// script1="onClick;0;CHK;_AD0040012form1/h_BUSINESS_OPR_DATE[lt]_AD0040012form1/RCV_ISSUE_DATE@#AD30773"
expj.AD0040010.AD0040012button1.Update12.onClick0 = function () {
  console.log('Update12 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/h_BUSINESS_OPR_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_DATE')))) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040012button1', 'AD30773');
}
};
// script2="onClick;1;CHK;_AD0040012form1/TEMP_USE_QTY[numeq]0@#AD00030"
expj.AD0040010.AD0040012button1.Update12.onClick1 = function () {
  console.log('Update12 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/TEMP_USE_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040012button1', 'AD00030');
}
};
// script3="onClick;2;CHK;_AD0040012form1/TIME_CTRL[eq]true@*0"
expj.AD0040010.AD0040012button1.Update12.onClick2 = function () {
  console.log('Update12 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script4="onClick;3;CHK;_AD0040012form1/TIME_CTRL[eq]true[and]~LEN(_AD0040012form1/RCV_ISSUE_TIME)[eq]3@*1"
expj.AD0040010.AD0040012button1.Update12.onClick3 = function () {
  console.log('Update12 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script5="onClick;4;CHK;_AD0040012form1/TIME_CTRL[eq]true[and]~LEN(_AD0040012form1/RCV_ISSUE_TIME)[eq]4@*2"
expj.AD0040010.AD0040012button1.Update12.onClick4 = function () {
  console.log('Update12 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040012button1', '_AD0040012form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="onClick;5;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0040012form1/*@AD0040010Servlet,,$ZZ07003"
expj.AD0040010.AD0040012button1.Update12.onClick5 = function () {
  console.log('Update12 script6');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040012button1', '_AD0040012form1/*', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.changeBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callConfirm('AD0040010', 'AD0040012button1', 'ZZ07003', okEvent);
};
// script7="child;0;CHK;~LEN(_AD0040012form1/RCV_ISSUE_TIME)[eq]1[or]~LEN(_AD0040012form1/RCV_ISSUE_TIME)[eq]2@#AS00045"
expj.AD0040010.AD0040012button1.Update12.child0 = function () {
  console.log('Update12 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040012button1', 'AS00045');
}
};
// script8="child;1;CHK;[{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:1)}*10+{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:2)}][gte]60@#AS00046"
expj.AD0040010.AD0040012button1.Update12.child1 = function () {
  console.log('Update12 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040012button1', 'AS00046');
}
};
// script9="child;2;CHK;[{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:0)}*10+{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:1)}][gte]24[or][{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:2)}*10+{~CHARAT(_AD0040012form1/RCV_ISSUE_TIME:3)}][gte]60@#AS00046"
expj.AD0040010.AD0040012button1.Update12.child2 = function () {
  console.log('Update12 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0040010', 'AD0040012button1', '_AD0040012form1/RCV_ISSUE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040012button1', 'AS00046');
}
};
expj.AD0040010.AD0040012button1.Update12.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040012button1.Update12['onClick' + i])) {
        expj.AD0040010.AD0040012button1.Update12['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040012button1.Update12.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040012button1.Update12.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012button1-Update12').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040012button1', 'Update12', this, 'Button');
    }
  });
  expj.AD0040010.AD0040012button1.Update12.executePScriptOnLoad();
};

expj.AD0040010.AD0040012button1.Update12.executePScriptOnLoad = function () {
  console.log('execute AD0040012button1/Update12.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012button1-Update12');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040012button1-Update12" name="Update12" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<span class="version">AD0040012 Revision: 1.9  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AD0040010-AD0040012button0">
expj.AD0040010.AD0040012button0 = {};
expj.AD0040010.AD0040012button0.executeAllOnDecision = function () {
  console.log('execute AD0040012button0.onDecision');
};
expj.AD0040010.AD0040012button0.executeOnLoad = function () {
  expj.AD0040010.AD0040012button0.executePScriptOnLoad();
};

expj.AD0040010.AD0040012button0.executePScriptOnLoad = function () {
  console.log('execute AD0040012button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0040010-AD0040012button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0040010-AD0040012button0-Return12">
expj.AD0040010.AD0040012button0.Return12 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0040012form1/*@AD0040010Servlet,,$ZZ07013"
expj.AD0040010.AD0040012button0.Return12.onClick0 = function () {
  console.log('Return12 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040012button0', '_AD0040012form1/*', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.changeBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callConfirm('AD0040010', 'AD0040012button0', 'ZZ07013', okEvent);
};
expj.AD0040010.AD0040012button0.Return12.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040012button0.Return12['onClick' + i])) {
        expj.AD0040010.AD0040012button0.Return12['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040012button0.Return12.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040012button0.Return12.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040012button0-Return12').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040012button0', 'Return12', this, 'Button');
    }
  });
  expj.AD0040010.AD0040012button0.Return12.executePScriptOnLoad();
};

expj.AD0040010.AD0040012button0.Return12.executePScriptOnLoad = function () {
  console.log('execute AD0040012button0/Return12.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040012button0-Return12');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040012button0-Return12" name="Return12" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0040010 (END)-->
<%
MessageStruct msgStruct = aAD0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0040010)) {
  expj.common.treeInstanceMap.AD0040010 = {};
}
expj.common.treeInstanceMap.AD0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010)) {
  expj.common.detailDialogMap.AD0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0040010)) {
  expj.common.viewInstanceMap.AD0040010 = {};
}
expj.common.viewInstanceMap.AD0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0040010.<%=viewId %>.init = function () {
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
    expj.AD0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0040010_init">
/**
 * AD0040010用のロード完了時初期化関数
 */
expj.AD0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0040010');
  expj.common.calendarInstanceMap.AD0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0040010.AD0040012form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.TEMP_PLAN_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.TEMP_USEOVER_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.d1_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.TEMP_PLANOUT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.d2_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.TEMP_USE_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.d3_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.RCV_ISSUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.CalendarRcvIssueDate.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.RCV_ISSUE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.h_SYS_LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.PeekerLotNo.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.VEND_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.h_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.RCV_ISSUE_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.MRP_ODR_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.ISSUE_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.h_ISSUE_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.h_ITEM_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.IN_OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.PARTIAL_PRD_NO.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.h_ISSUE_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012button1.Insert12.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012button1.Update12.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012button0.Return12.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012form1.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012button1.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040012button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0040010', 'AD0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0040010', '<%=request.getContextPath() %>');
};

/**
 * AD0040010の全体onDecision処理
 */
expj.AD0040010.executeAllOnDecision = function () {
  expj.AD0040010.AD0040012form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0040010_console">
expj.AD0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>