<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:25:07 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0170\AA0170011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0170.*" %>
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
<jsp:useBean id="aAA0170010Control" class="com.nec.jp.orteus.metamorBase.AA0170.AA0170010Control" scope="request"/>
<jsp:useBean id="aAA0170010Struct" class="com.nec.jp.orteus.metamorBase.AA0170.AA0170010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

構成系列メンテナンスサブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0170/jsp/AA0170011.jsp,v $
$Author: geng-jia $     
$Revision: 1.5 $ $Date: 2017/02/22 02:04:10 $
********************************************************* --%>
<html>
<head>
<title>構成系列メンテナンスサブ1</title>
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
<script class="expj-script-AA0170010_init">
  // AA0170010名前空間
  expj.AA0170010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

<% String CallButton = aAA0170010Control.getButton(); %>
  <div id="expj-business-screen-AA0170010" data-screen="AA0170011" data-newdata="<%=aAA0170010Control.isNewData() %>">
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
              <script class="expj-script-AA0170010-AA0170011form1">
expj.AA0170010.AA0170011form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0170010.AA0170011form1.onLoad0 = function () {
  console.log('AA0170011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;<%=CallButton%>[eq]updatePs[or]<%=CallButton%>[eq]updateSub1@*1,*2"
expj.AA0170010.AA0170011form1.child0 = function () {
  console.log('AA0170011form1 script2');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'updatePs') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'updateSub1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;MASK;_AA0170011form1/sub1_PARENT_ITEM_CD,_AA0170011form1/PeekerParentItemCd,_AA0170011form1/sub1_COMP_ITEM_CD,_AA0170011form1/sub1_PS_EDITION,_AA0170011button1/insertSub1,_AA0170011form1/PeekerCompItemCd"
expj.AA0170010.AA0170011form1.child1 = function () {
  console.log('AA0170011form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011form1/sub1_PARENT_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011form1/PeekerParentItemCd');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011form1/sub1_COMP_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011form1/sub1_PS_EDITION');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011button1/insertSub1');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011form1/PeekerCompItemCd');
};
// script4="child;2;MASK;_AA0170011button1/updateSub1@*3"
expj.AA0170010.AA0170011form1.child2 = function () {
  console.log('AA0170011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011button1/updateSub1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHK;<%=aAA0170010Struct.getsub1_DEVELOP_TYP()%>[eq]1@*4,*5"
expj.AA0170010.AA0170011form1.child3 = function () {
  console.log('AA0170011form1 script5');
if (expj.common.pscript.evaluate('<%=aAA0170010Struct.getsub1_DEVELOP_TYP()%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;MASK;_AA0170011form1/sub1_PARENT_ITEM_CD,_AA0170011form1/PeekerParentItemCd"
expj.AA0170010.AA0170011form1.child4 = function () {
  console.log('AA0170011form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011form1/sub1_PARENT_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011form1/PeekerParentItemCd');
};
// script7="child;5;MASK;_AA0170011form1/sub1_COMP_ITEM_CD,_AA0170011form1/PeekerCompItemCd"
expj.AA0170010.AA0170011form1.child5 = function () {
  console.log('AA0170011form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011form1/sub1_COMP_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011form1/PeekerCompItemCd');
};
// script8="onLoad;1;CALL;onDecision@0"
expj.AA0170010.AA0170011form1.onLoad1 = function () {
  console.log('AA0170011form1 script8');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script9="onDecision;0;CHKRQ;D@*6,*12"
expj.AA0170010.AA0170011form1.onDecision0 = function () {
  console.log('AA0170011form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('AA0170010', 'D')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script10="child;6;CHK;<%=CallButton%>[eq]insertPs[or]<%=CallButton%>[eq]insertSub1@*7,*13"
expj.AA0170010.AA0170011form1.child6 = function () {
  console.log('AA0170011form1 script10');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'insertPs') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'insertSub1')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script11="child;7;CHK;<%=aAA0170010Struct.getsub1_DEVELOP_TYP()%>[eq]1@*8,*9"
expj.AA0170010.AA0170011form1.child7 = function () {
  console.log('AA0170011form1 script11');
if (expj.common.pscript.evaluate('<%=aAA0170010Struct.getsub1_DEVELOP_TYP()%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;8;CHKRQ;B,C@*10,*11"
expj.AA0170010.AA0170011form1.child8 = function () {
  console.log('AA0170011form1 script12');
if (expj.common.pscript.satisfiedRequiredComponent('AA0170010', 'B') && expj.common.pscript.satisfiedRequiredComponent('AA0170010', 'C')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script13="child;9;CHKRQ;A,C@*10,*11"
expj.AA0170010.AA0170011form1.child9 = function () {
  console.log('AA0170011form1 script13');
if (expj.common.pscript.satisfiedRequiredComponent('AA0170010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AA0170010', 'C')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script14="child;10;UNMASK;_AA0170011button1/insertSub1"
expj.AA0170010.AA0170011form1.child10 = function () {
  console.log('AA0170011form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011button1/insertSub1');
};
// script15="child;11;MASK;_AA0170011button1/insertSub1"
expj.AA0170010.AA0170011form1.child11 = function () {
  console.log('AA0170011form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011button1/insertSub1');
};
// script16="child;12;MASK;_AA0170011button1/insertSub1,_AA0170011button1/updateSub1"
expj.AA0170010.AA0170011form1.child12 = function () {
  console.log('AA0170011form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011button1/insertSub1');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011button1/updateSub1');
};
// script17="child;13;UNMASK;_AA0170011button1/updateSub1"
expj.AA0170010.AA0170011form1.child13 = function () {
  console.log('AA0170011form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170011form1', '_AA0170011button1/updateSub1');
};
expj.AA0170010.AA0170011form1.executeAllOnDecision = function () {
  console.log('execute AA0170011form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170011form1['onDecision' + i])) {
        expj.AA0170010.AA0170011form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170011form1.executeOnLoad = function () {
  expj.AA0170010.AA0170011form1.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0170010.AA0170011form1['onLoad' + i])) {
      expj.AA0170010.AA0170011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0170010-AA0170011form1" action="AA0170010Servlet" name="AA0170011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AA0170010-AA0170011form1-sub1_PARENT_ITEM_CD">
expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_CD = {};
expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0170011form1/sub1_PARENT_ITEM_CD.onDecision');
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-sub1_PARENT_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form1', 'sub1_PARENT_ITEM_CD', this);
  });
  expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_CD.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/sub1_PARENT_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-sub1_PARENT_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form1-sub1_PARENT_ITEM_CD" name="sub1_PARENT_ITEM_CD" class="AA0170010-focus-move  required-value expj-AA0170010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PARENT_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form1-PeekerParentItemCd">
expj.AA0170010.AA0170011form1.PeekerParentItemCd = {};
// script1="onClick;0;PEEKER;_AA0170011form1/sub1_PARENT_ITEM_CD@<%=contextNo%>"
expj.AA0170010.AA0170011form1.PeekerParentItemCd.onClick0 = function () {
  console.log('PeekerParentItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0170010';
var parameterValues = 'PeekerParentItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170011form1', '_AA0170011form1/sub1_PARENT_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0170011form1/sub1_PARENT_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0170010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0170010.AA0170011form1.PeekerParentItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170011form1.PeekerParentItemCd['onClick' + i])) {
        expj.AA0170010.AA0170011form1.PeekerParentItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170011form1.PeekerParentItemCd.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170011form1.PeekerParentItemCd.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-PeekerParentItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170011form1', 'PeekerParentItemCd', this, 'Button');
    }
  });
  expj.AA0170010.AA0170011form1.PeekerParentItemCd.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.PeekerParentItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/PeekerParentItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-PeekerParentItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0170010-AA0170011form1-PeekerParentItemCd" class="AA0170010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form1-sub1_PARENT_ITEM_NAME">
expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_NAME = {};
expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0170011form1/sub1_PARENT_ITEM_NAME.onDecision');
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-sub1_PARENT_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form1', 'sub1_PARENT_ITEM_NAME', this);
  });
  expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_NAME.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/sub1_PARENT_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-sub1_PARENT_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form1-sub1_PARENT_ITEM_NAME" name="sub1_PARENT_ITEM_NAME" class="AA0170010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PARENT_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0170010-AA0170011form1-sub1_TARGET_ITEM_CD" name="sub1_TARGET_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_TARGET_ITEM_CD()) %>">
<script class="expj-script-AA0170010-AA0170011form1-sub1_TARGET_ITEM_CD">
expj.AA0170010.AA0170011form1.sub1_TARGET_ITEM_CD = {};
expj.AA0170010.AA0170011form1.sub1_TARGET_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0170011form1/sub1_TARGET_ITEM_CD.onDecision');
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form1.sub1_TARGET_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-sub1_TARGET_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form1', 'sub1_TARGET_ITEM_CD', this);
  });
  expj.AA0170010.AA0170011form1.sub1_TARGET_ITEM_CD.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.sub1_TARGET_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/sub1_TARGET_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-sub1_TARGET_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0170010-AA0170011form1-sub1_DEVELOP_TYP" name="sub1_DEVELOP_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_DEVELOP_TYP()) %>">
<script class="expj-script-AA0170010-AA0170011form1-sub1_DEVELOP_TYP">
expj.AA0170010.AA0170011form1.sub1_DEVELOP_TYP = {};
expj.AA0170010.AA0170011form1.sub1_DEVELOP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0170011form1/sub1_DEVELOP_TYP.onDecision');
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form1.sub1_DEVELOP_TYP.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-sub1_DEVELOP_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form1', 'sub1_DEVELOP_TYP', this);
  });
  expj.AA0170010.AA0170011form1.sub1_DEVELOP_TYP.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.sub1_DEVELOP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/sub1_DEVELOP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-sub1_DEVELOP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.COMP_ITEM_CD_1",rb)%></span><!-- 構成品目番号 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form1-sub1_COMP_ITEM_CD">
expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_CD = {};
expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0170011form1/sub1_COMP_ITEM_CD.onDecision');
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-sub1_COMP_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form1', 'sub1_COMP_ITEM_CD', this);
  });
  expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_CD.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/sub1_COMP_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-sub1_COMP_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form1-sub1_COMP_ITEM_CD" name="sub1_COMP_ITEM_CD" class="AA0170010-focus-move  required-value expj-AA0170010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_COMP_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form1-PeekerCompItemCd">
expj.AA0170010.AA0170011form1.PeekerCompItemCd = {};
// script1="onClick;0;PEEKER;_AA0170011form1/sub1_COMP_ITEM_CD@<%=contextNo%>"
expj.AA0170010.AA0170011form1.PeekerCompItemCd.onClick0 = function () {
  console.log('PeekerCompItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0170010';
var parameterValues = 'PeekerCompItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170011form1', '_AA0170011form1/sub1_COMP_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0170011form1/sub1_COMP_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0170010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0170010.AA0170011form1.PeekerCompItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170011form1.PeekerCompItemCd['onClick' + i])) {
        expj.AA0170010.AA0170011form1.PeekerCompItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170011form1.PeekerCompItemCd.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170011form1.PeekerCompItemCd.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-PeekerCompItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170011form1', 'PeekerCompItemCd', this, 'Button');
    }
  });
  expj.AA0170010.AA0170011form1.PeekerCompItemCd.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.PeekerCompItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/PeekerCompItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-PeekerCompItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0170010-AA0170011form1-PeekerCompItemCd" class="AA0170010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form1-sub1_COMP_ITEM_NAME">
expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_NAME = {};
expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0170011form1/sub1_COMP_ITEM_NAME.onDecision');
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-sub1_COMP_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form1', 'sub1_COMP_ITEM_NAME', this);
  });
  expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_NAME.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/sub1_COMP_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-sub1_COMP_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form1-sub1_COMP_ITEM_NAME" name="sub1_COMP_ITEM_NAME" class="AA0170010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_COMP_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0170010-AA0170011form1-sub1_LEVEL" name="sub1_LEVEL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_LEVEL()) %>">
<script class="expj-script-AA0170010-AA0170011form1-sub1_LEVEL">
expj.AA0170010.AA0170011form1.sub1_LEVEL = {};
expj.AA0170010.AA0170011form1.sub1_LEVEL.executeAllOnDecision = function () {
  console.log('execute AA0170011form1/sub1_LEVEL.onDecision');
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form1.sub1_LEVEL.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-sub1_LEVEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form1', 'sub1_LEVEL', this);
  });
  expj.AA0170010.AA0170011form1.sub1_LEVEL.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.sub1_LEVEL.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/sub1_LEVEL.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-sub1_LEVEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0170010-AA0170011form1-sub1_TARGET_DATE" name="sub1_TARGET_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_TARGET_DATE()) %>">
<script class="expj-script-AA0170010-AA0170011form1-sub1_TARGET_DATE">
expj.AA0170010.AA0170011form1.sub1_TARGET_DATE = {};
expj.AA0170010.AA0170011form1.sub1_TARGET_DATE.executeAllOnDecision = function () {
  console.log('execute AA0170011form1/sub1_TARGET_DATE.onDecision');
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form1.sub1_TARGET_DATE.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-sub1_TARGET_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form1', 'sub1_TARGET_DATE', this);
  });
  expj.AA0170010.AA0170011form1.sub1_TARGET_DATE.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.sub1_TARGET_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/sub1_TARGET_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-sub1_TARGET_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PS_EDITION",rb)%></span><!-- 製品構成版数 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form1-sub1_PS_EDITION">
expj.AA0170010.AA0170011form1.sub1_PS_EDITION = {};
expj.AA0170010.AA0170011form1.sub1_PS_EDITION.executeAllOnDecision = function () {
  console.log('execute AA0170011form1/sub1_PS_EDITION.onDecision');
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form1.sub1_PS_EDITION.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-sub1_PS_EDITION').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form1', 'sub1_PS_EDITION', this);
  });
  expj.AA0170010.AA0170011form1.sub1_PS_EDITION.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.sub1_PS_EDITION.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/sub1_PS_EDITION.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-sub1_PS_EDITION');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form1-sub1_PS_EDITION" name="sub1_PS_EDITION" class="AA0170010-focus-move  required-value expj-AA0170010-required-C" style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PS_EDITION()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0170010-AA0170011form1-sub1_MODIFY_COUNT" name="sub1_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_MODIFY_COUNT()) %>">
<script class="expj-script-AA0170010-AA0170011form1-sub1_MODIFY_COUNT">
expj.AA0170010.AA0170011form1.sub1_MODIFY_COUNT = {};
expj.AA0170010.AA0170011form1.sub1_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0170011form1/sub1_MODIFY_COUNT.onDecision');
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form1.sub1_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form1-sub1_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form1', 'sub1_MODIFY_COUNT', this);
  });
  expj.AA0170010.AA0170011form1.sub1_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form1.sub1_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0170011form1/sub1_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form1-sub1_MODIFY_COUNT');
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
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0170010-AA0170011form2">
expj.AA0170010.AA0170011form2 = {};
expj.AA0170010.AA0170011form2.executeAllOnDecision = function () {
  console.log('execute AA0170011form2.onDecision');
};
expj.AA0170010.AA0170011form2.executeOnLoad = function () {
  expj.AA0170010.AA0170011form2.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0170010-AA0170011form2" action="AA0170010Servlet" name="AA0170011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_UNIT_QTY",rb)%></span><!-- 製品構成単位数 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_PS_UNIT_NUMERATOR">
expj.AA0170010.AA0170011form2.sub1_PS_UNIT_NUMERATOR = {};
expj.AA0170010.AA0170011form2.sub1_PS_UNIT_NUMERATOR.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_PS_UNIT_NUMERATOR.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_PS_UNIT_NUMERATOR.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_PS_UNIT_NUMERATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_PS_UNIT_NUMERATOR', this);
  });
  expj.AA0170010.AA0170011form2.sub1_PS_UNIT_NUMERATOR.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_PS_UNIT_NUMERATOR.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_PS_UNIT_NUMERATOR.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_PS_UNIT_NUMERATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form2-sub1_PS_UNIT_NUMERATOR" name="sub1_PS_UNIT_NUMERATOR" class="AA0170010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PS_UNIT_NUMERATOR()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0005",rb)%></span><!-- ／ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_PS_UNIT_DENOMINATOR">
expj.AA0170010.AA0170011form2.sub1_PS_UNIT_DENOMINATOR = {};
expj.AA0170010.AA0170011form2.sub1_PS_UNIT_DENOMINATOR.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_PS_UNIT_DENOMINATOR.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_PS_UNIT_DENOMINATOR.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_PS_UNIT_DENOMINATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_PS_UNIT_DENOMINATOR', this);
  });
  expj.AA0170010.AA0170011form2.sub1_PS_UNIT_DENOMINATOR.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_PS_UNIT_DENOMINATOR.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_PS_UNIT_DENOMINATOR.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_PS_UNIT_DENOMINATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form2-sub1_PS_UNIT_DENOMINATOR" name="sub1_PS_UNIT_DENOMINATOR" class="AA0170010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PS_UNIT_DENOMINATOR()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_STOCK_UNIT">
expj.AA0170010.AA0170011form2.sub1_STOCK_UNIT = {};
expj.AA0170010.AA0170011form2.sub1_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_STOCK_UNIT.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_STOCK_UNIT', this);
  });
  expj.AA0170010.AA0170011form2.sub1_STOCK_UNIT.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form2-sub1_STOCK_UNIT" name="sub1_STOCK_UNIT" class="AA0170010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_STOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0170010-AA0170011form2-sub1_h_PS_UNIT_NUMERATOR" name="sub1_h_PS_UNIT_NUMERATOR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_h_PS_UNIT_NUMERATOR()) %>">
<script class="expj-script-AA0170010-AA0170011form2-sub1_h_PS_UNIT_NUMERATOR">
expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_NUMERATOR = {};
expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_NUMERATOR.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_h_PS_UNIT_NUMERATOR.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_NUMERATOR.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_h_PS_UNIT_NUMERATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_h_PS_UNIT_NUMERATOR', this);
  });
  expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_NUMERATOR.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_NUMERATOR.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_h_PS_UNIT_NUMERATOR.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_h_PS_UNIT_NUMERATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0170010-AA0170011form2-sub1_h_PS_UNIT_DENOMINATOR" name="sub1_h_PS_UNIT_DENOMINATOR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_h_PS_UNIT_DENOMINATOR()) %>">
<script class="expj-script-AA0170010-AA0170011form2-sub1_h_PS_UNIT_DENOMINATOR">
expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_DENOMINATOR = {};
expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_DENOMINATOR.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_h_PS_UNIT_DENOMINATOR.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_DENOMINATOR.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_h_PS_UNIT_DENOMINATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_h_PS_UNIT_DENOMINATOR', this);
  });
  expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_DENOMINATOR.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_DENOMINATOR.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_h_PS_UNIT_DENOMINATOR.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_h_PS_UNIT_DENOMINATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_2",rb)%></span><!-- 構成有効日 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_EFF_PHASE_IN_DATE">
expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_IN_DATE = {};
expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_IN_DATE.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_EFF_PHASE_IN_DATE.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_IN_DATE.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_EFF_PHASE_IN_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_EFF_PHASE_IN_DATE', this);
  });
  expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_IN_DATE.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_IN_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_EFF_PHASE_IN_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_EFF_PHASE_IN_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form2-sub1_EFF_PHASE_IN_DATE" name="sub1_EFF_PHASE_IN_DATE" class="AA0170010-focus-move  required-value expj-AA0170010-required-D" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_EFF_PHASE_IN_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-CalendarEffPhaseInDate">
expj.AA0170010.AA0170011form2.CalendarEffPhaseInDate = {};
// script1="onClick;0;CALENDAR;_AA0170011form2/sub1_EFF_PHASE_IN_DATE"
expj.AA0170010.AA0170011form2.CalendarEffPhaseInDate.onClick0 = function () {
  console.log('CalendarEffPhaseInDate script1');
expj.common.pscript.executeCalendar('AA0170010','AA0170011form2','_AA0170011form2/sub1_EFF_PHASE_IN_DATE');
};
expj.AA0170010.AA0170011form2.CalendarEffPhaseInDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170011form2.CalendarEffPhaseInDate['onClick' + i])) {
        expj.AA0170010.AA0170011form2.CalendarEffPhaseInDate['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170011form2.CalendarEffPhaseInDate.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170011form2.CalendarEffPhaseInDate.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-CalendarEffPhaseInDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170011form2', 'CalendarEffPhaseInDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0170010','AA0170011form2','_AA0170011form2/sub1_EFF_PHASE_IN_DATE');
  expj.AA0170010.AA0170011form2.CalendarEffPhaseInDate.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.CalendarEffPhaseInDate.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/CalendarEffPhaseInDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-CalendarEffPhaseInDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0170010-AA0170011form2-CalendarEffPhaseInDate" class="AA0170010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_EFF_PHASE_OUT_DATE">
expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_OUT_DATE = {};
expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_OUT_DATE.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_EFF_PHASE_OUT_DATE.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_OUT_DATE.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_EFF_PHASE_OUT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_EFF_PHASE_OUT_DATE', this);
  });
  expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_OUT_DATE.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_OUT_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_EFF_PHASE_OUT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_EFF_PHASE_OUT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form2-sub1_EFF_PHASE_OUT_DATE" name="sub1_EFF_PHASE_OUT_DATE" class="AA0170010-focus-move  required-value expj-AA0170010-required-D" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_EFF_PHASE_OUT_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-CalendarEffPhaseOutDate">
expj.AA0170010.AA0170011form2.CalendarEffPhaseOutDate = {};
// script1="onClick;0;CALENDAR;_AA0170011form2/sub1_EFF_PHASE_OUT_DATE"
expj.AA0170010.AA0170011form2.CalendarEffPhaseOutDate.onClick0 = function () {
  console.log('CalendarEffPhaseOutDate script1');
expj.common.pscript.executeCalendar('AA0170010','AA0170011form2','_AA0170011form2/sub1_EFF_PHASE_OUT_DATE');
};
expj.AA0170010.AA0170011form2.CalendarEffPhaseOutDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170011form2.CalendarEffPhaseOutDate['onClick' + i])) {
        expj.AA0170010.AA0170011form2.CalendarEffPhaseOutDate['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170011form2.CalendarEffPhaseOutDate.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170011form2.CalendarEffPhaseOutDate.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-CalendarEffPhaseOutDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170011form2', 'CalendarEffPhaseOutDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0170010','AA0170011form2','_AA0170011form2/sub1_EFF_PHASE_OUT_DATE');
  expj.AA0170010.AA0170011form2.CalendarEffPhaseOutDate.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.CalendarEffPhaseOutDate.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/CalendarEffPhaseOutDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-CalendarEffPhaseOutDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AA0170010-AA0170011form2-CalendarEffPhaseOutDate" class="AA0170010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PS_SPOIL",rb)%></span><!-- 構成仕損率 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_PS_SPOIL">
expj.AA0170010.AA0170011form2.sub1_PS_SPOIL = {};
expj.AA0170010.AA0170011form2.sub1_PS_SPOIL.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_PS_SPOIL.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_PS_SPOIL.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_PS_SPOIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_PS_SPOIL', this);
  });
  expj.AA0170010.AA0170011form2.sub1_PS_SPOIL.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_PS_SPOIL.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_PS_SPOIL.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_PS_SPOIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form2-sub1_PS_SPOIL" name="sub1_PS_SPOIL" class="AA0170010-focus-move expj-align-right required-value expj-AA0170010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;5.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PS_SPOIL()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CONS_TYP",rb)%></span><!-- 支給区分 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_CONS_TYP">
expj.AA0170010.AA0170011form2.sub1_CONS_TYP = {};
expj.AA0170010.AA0170011form2.sub1_CONS_TYP.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_CONS_TYP.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_CONS_TYP.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_CONS_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_CONS_TYP', this);
  });
  expj.AA0170010.AA0170011form2.sub1_CONS_TYP.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_CONS_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_CONS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_CONS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0170010-AA0170011form2-sub1_CONS_TYP" name='sub1_CONS_TYP' class='AA0170010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0170010Control.getStruct().getList_sub1_CONS_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0170010Control.getStruct().getList_sub1_CONS_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0170010Control.getStruct().getList_sub1_CONS_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0170010Struct.getsub1_CONS_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_REF_NO_1",rb)%></span><!-- 照会順序 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_PS_REF_NO">
expj.AA0170010.AA0170011form2.sub1_PS_REF_NO = {};
expj.AA0170010.AA0170011form2.sub1_PS_REF_NO.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_PS_REF_NO.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_PS_REF_NO.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_PS_REF_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_PS_REF_NO', this);
  });
  expj.AA0170010.AA0170011form2.sub1_PS_REF_NO.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_PS_REF_NO.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_PS_REF_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_PS_REF_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form2-sub1_PS_REF_NO" name="sub1_PS_REF_NO" class="AA0170010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PS_REF_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_FIXED_LT",rb)%></span><!-- 製品構成固定分リードタイム --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_PS_FIXED_LT">
expj.AA0170010.AA0170011form2.sub1_PS_FIXED_LT = {};
expj.AA0170010.AA0170011form2.sub1_PS_FIXED_LT.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_PS_FIXED_LT.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_PS_FIXED_LT.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_PS_FIXED_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_PS_FIXED_LT', this);
  });
  expj.AA0170010.AA0170011form2.sub1_PS_FIXED_LT.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_PS_FIXED_LT.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_PS_FIXED_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_PS_FIXED_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form2-sub1_PS_FIXED_LT" name="sub1_PS_FIXED_LT" class="AA0170010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PS_FIXED_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_PS_LT_CHECK">
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.onLoad0 = function () {
  console.log('sub1_PS_LT_CHECK script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_AA0170011form2/sub1_PS_LT_FLG[eq]1@*1"
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.child0 = function () {
  console.log('sub1_PS_LT_CHECK script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170011form2', '_AA0170011form2/sub1_PS_LT_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;SET;_THIS=true"
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.child1 = function () {
  console.log('sub1_PS_LT_CHECK script3');
expj.common.pscript.setReferenceComponentValue('AA0170010', 'AA0170011form2', '_THIS', 'true');
};
// script4="onLoad;1;CALL;onClick@0"
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.onLoad1 = function () {
  console.log('sub1_PS_LT_CHECK script4');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script5="onClick;0;CHK;_AA0170011form2/sub1_PS_LT_CHECK[eq]true@*2,*4"
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.onClick0 = function () {
  console.log('sub1_PS_LT_CHECK script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170011form2', '_AA0170011form2/sub1_PS_LT_CHECK'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;UNMASK;_AA0170011form2/sub1_PS_FIXED_LT,_AA0170011form2/sub1_PS_PROP_LT,_AA0170011form2/sub1_PS_PROP_LOT_SIZE@*3"
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.child2 = function () {
  console.log('sub1_PS_LT_CHECK script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170011form2', '_AA0170011form2/sub1_PS_FIXED_LT');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170011form2', '_AA0170011form2/sub1_PS_PROP_LT');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170011form2', '_AA0170011form2/sub1_PS_PROP_LOT_SIZE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script7="child;3;SET;_AA0170011form2/sub1_PS_LT_FLG=1"
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.child3 = function () {
  console.log('sub1_PS_LT_CHECK script7');
expj.common.pscript.setReferenceComponentValue('AA0170010', 'AA0170011form2', '_AA0170011form2/sub1_PS_LT_FLG', '1');
};
// script8="child;4;MASK;_AA0170011form2/sub1_PS_FIXED_LT,_AA0170011form2/sub1_PS_PROP_LT,_AA0170011form2/sub1_PS_PROP_LOT_SIZE@*5"
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.child4 = function () {
  console.log('sub1_PS_LT_CHECK script8');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form2', '_AA0170011form2/sub1_PS_FIXED_LT');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form2', '_AA0170011form2/sub1_PS_PROP_LT');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170011form2', '_AA0170011form2/sub1_PS_PROP_LOT_SIZE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script9="child;5;SET;_AA0170011form2/sub1_PS_LT_FLG=0"
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.child5 = function () {
  console.log('sub1_PS_LT_CHECK script9');
expj.common.pscript.setReferenceComponentValue('AA0170010', 'AA0170011form2', '_AA0170011form2/sub1_PS_LT_FLG', '0');
};
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK['onClick' + i])) {
        expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_PS_LT_CHECK.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_PS_LT_CHECK').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170011form2', 'sub1_PS_LT_CHECK', this, 'CheckBox');
    }
  });
  expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_PS_LT_CHECK.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_PS_LT_CHECK');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK['onLoad' + i])) {
      expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="sub1_PS_LT_CHECK" value="true" <%= ("true".equals(TypeConverter.convert(aAA0170010Struct.getsub1_PS_LT_CHECK())) || "1".equals(TypeConverter.convert(aAA0170010Struct.getsub1_PS_LT_CHECK())))?"checked=\"checked\"":"" %>  class="AA0170010-focus-move" id="expj-AA0170010-AA0170011form2-sub1_PS_LT_CHECK"><label for="expj-AA0170010-AA0170011form2-sub1_PS_LT_CHECK"><%=CoreTools.getRBString("Expj.Cmt0205",rb)%></label></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0170010-AA0170011form2-sub1_PS_LT_FLG" name="sub1_PS_LT_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PS_LT_FLG()) %>">
<script class="expj-script-AA0170010-AA0170011form2-sub1_PS_LT_FLG">
expj.AA0170010.AA0170011form2.sub1_PS_LT_FLG = {};
expj.AA0170010.AA0170011form2.sub1_PS_LT_FLG.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_PS_LT_FLG.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_PS_LT_FLG.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_PS_LT_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_PS_LT_FLG', this);
  });
  expj.AA0170010.AA0170011form2.sub1_PS_LT_FLG.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_PS_LT_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_PS_LT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_PS_LT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_PROP_LT",rb)%></span><!-- 製品構成比例分リードタイム --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_PS_PROP_LT">
expj.AA0170010.AA0170011form2.sub1_PS_PROP_LT = {};
expj.AA0170010.AA0170011form2.sub1_PS_PROP_LT.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_PS_PROP_LT.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_PS_PROP_LT.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_PS_PROP_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_PS_PROP_LT', this);
  });
  expj.AA0170010.AA0170011form2.sub1_PS_PROP_LT.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_PS_PROP_LT.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_PS_PROP_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_PS_PROP_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form2-sub1_PS_PROP_LT" name="sub1_PS_PROP_LT" class="AA0170010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PS_PROP_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_PROP_LOT_SIZE",rb)%></span><!-- 製品構成比例分ロットサイズ --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_PS_PROP_LOT_SIZE">
expj.AA0170010.AA0170011form2.sub1_PS_PROP_LOT_SIZE = {};
expj.AA0170010.AA0170011form2.sub1_PS_PROP_LOT_SIZE.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_PS_PROP_LOT_SIZE.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_PS_PROP_LOT_SIZE.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_PS_PROP_LOT_SIZE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_PS_PROP_LOT_SIZE', this);
  });
  expj.AA0170010.AA0170011form2.sub1_PS_PROP_LOT_SIZE.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_PS_PROP_LOT_SIZE.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_PS_PROP_LOT_SIZE.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_PS_PROP_LOT_SIZE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170011form2-sub1_PS_PROP_LOT_SIZE" name="sub1_PS_PROP_LOT_SIZE" class="AA0170010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getsub1_PS_PROP_LOT_SIZE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.COST_UP_TYP_2",rb)%></span><!-- 原価積上有無 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_COST_UP_TYP">
expj.AA0170010.AA0170011form2.sub1_COST_UP_TYP = {};
expj.AA0170010.AA0170011form2.sub1_COST_UP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_COST_UP_TYP.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_COST_UP_TYP.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_COST_UP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_COST_UP_TYP', this);
  });
  expj.AA0170010.AA0170011form2.sub1_COST_UP_TYP.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_COST_UP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_COST_UP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_COST_UP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0170010-AA0170011form2-sub1_COST_UP_TYP" name='sub1_COST_UP_TYP' class='AA0170010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0170010Control.getStruct().getList_sub1_COST_UP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0170010Control.getStruct().getList_sub1_COST_UP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0170010Control.getStruct().getList_sub1_COST_UP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0170010Struct.getsub1_COST_UP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_EXP_TYP_2",rb)%></span><!-- MRP展開有無 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011form2-sub1_MRP_EXP_TYP">
expj.AA0170010.AA0170011form2.sub1_MRP_EXP_TYP = {};
expj.AA0170010.AA0170011form2.sub1_MRP_EXP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0170011form2/sub1_MRP_EXP_TYP.onDecision');
  expj.AA0170010.AA0170011form2.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170011form2.sub1_MRP_EXP_TYP.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011form2-sub1_MRP_EXP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0170010', 'AA0170011form2', 'sub1_MRP_EXP_TYP', this);
  });
  expj.AA0170010.AA0170011form2.sub1_MRP_EXP_TYP.executePScriptOnLoad();
};

expj.AA0170010.AA0170011form2.sub1_MRP_EXP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0170011form2/sub1_MRP_EXP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011form2-sub1_MRP_EXP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0170010-AA0170011form2-sub1_MRP_EXP_TYP" name='sub1_MRP_EXP_TYP' class='AA0170010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0170010Control.getStruct().getList_sub1_MRP_EXP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0170010Control.getStruct().getList_sub1_MRP_EXP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0170010Control.getStruct().getList_sub1_MRP_EXP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0170010Struct.getsub1_MRP_EXP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0170010-AA0170011button1">
expj.AA0170010.AA0170011button1 = {};
expj.AA0170010.AA0170011button1.executeAllOnDecision = function () {
  console.log('execute AA0170011button1.onDecision');
};
expj.AA0170010.AA0170011button1.executeOnLoad = function () {
  expj.AA0170010.AA0170011button1.executePScriptOnLoad();
};

expj.AA0170010.AA0170011button1.executePScriptOnLoad = function () {
  console.log('execute AA0170011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0170010-AA0170011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0170010-AA0170011button1-insertSub1">
expj.AA0170010.AA0170011button1.insertSub1 = {};
// script1="onClick;0;CHK;_AA0170011form2/sub1_EFF_PHASE_IN_DATE[gt]_AA0170011form2/sub1_EFF_PHASE_OUT_DATE@#AA00048"
expj.AA0170010.AA0170011button1.insertSub1.onClick0 = function () {
  console.log('insertSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170011button1', '_AA0170011form2/sub1_EFF_PHASE_IN_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170011button1', '_AA0170011form2/sub1_EFF_PHASE_OUT_DATE')))) {
expj.common.pscript.addErrorMessage('AA0170010', 'AA0170011button1', 'AA00048');
}
};
// script2="onClick;1;CHK;_AA0170011form1/sub1_PARENT_ITEM_CD[eq]_AA0170011form1/sub1_COMP_ITEM_CD@#AA00051"
expj.AA0170010.AA0170011button1.insertSub1.onClick1 = function () {
  console.log('insertSub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170011button1', '_AA0170011form1/sub1_PARENT_ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170011button1', '_AA0170011form1/sub1_COMP_ITEM_CD'))) {
expj.common.pscript.addErrorMessage('AA0170010', 'AA0170011button1', 'AA00051');
}
};
// script3="onClick;2;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0170011form1/*,_AA0170011form2/*@AA0170010Servlet,,$ZZ07001"
expj.AA0170010.AA0170011button1.insertSub1.onClick2 = function () {
  console.log('insertSub1 script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170011button1', '_AA0170011form1/*,_AA0170011form2/*', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.changeBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callConfirm('AA0170010', 'AA0170011button1', 'ZZ07001', okEvent);
};
expj.AA0170010.AA0170011button1.insertSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170011button1.insertSub1['onClick' + i])) {
        expj.AA0170010.AA0170011button1.insertSub1['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170011button1.insertSub1.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170011button1.insertSub1.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011button1-insertSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170011button1', 'insertSub1', this, 'Button');
    }
  });
  expj.AA0170010.AA0170011button1.insertSub1.executePScriptOnLoad();
};

expj.AA0170010.AA0170011button1.insertSub1.executePScriptOnLoad = function () {
  console.log('execute AA0170011button1/insertSub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011button1-insertSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170011button1-insertSub1" name="insertSub1" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170011button1-updateSub1">
expj.AA0170010.AA0170011button1.updateSub1 = {};
// script1="onClick;0;CHK;_AA0170011form2/sub1_EFF_PHASE_IN_DATE[gt]_AA0170011form2/sub1_EFF_PHASE_OUT_DATE@!AA00048"
expj.AA0170010.AA0170011button1.updateSub1.onClick0 = function () {
  console.log('updateSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170011button1', '_AA0170011form2/sub1_EFF_PHASE_IN_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170011button1', '_AA0170011form2/sub1_EFF_PHASE_OUT_DATE')))) {
expj.common.pscript.viewErrorMessage('AA0170010', 'AA0170011button1', 'AA00048');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0170011form1/*,_AA0170011form2/*@AA0170010Servlet,,$ZZ07003"
expj.AA0170010.AA0170011button1.updateSub1.onClick1 = function () {
  console.log('updateSub1 script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170011button1', '_AA0170011form1/*,_AA0170011form2/*', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.changeBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callConfirm('AA0170010', 'AA0170011button1', 'ZZ07003', okEvent);
};
expj.AA0170010.AA0170011button1.updateSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170011button1.updateSub1['onClick' + i])) {
        expj.AA0170010.AA0170011button1.updateSub1['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170011button1.updateSub1.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170011button1.updateSub1.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011button1-updateSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170011button1', 'updateSub1', this, 'Button');
    }
  });
  expj.AA0170010.AA0170011button1.updateSub1.executePScriptOnLoad();
};

expj.AA0170010.AA0170011button1.updateSub1.executePScriptOnLoad = function () {
  console.log('execute AA0170011button1/updateSub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011button1-updateSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170011button1-updateSub1" name="updateSub1" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0170011 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AA0170010-AA0170011button0">
expj.AA0170010.AA0170011button0 = {};
expj.AA0170010.AA0170011button0.executeAllOnDecision = function () {
  console.log('execute AA0170011button0.onDecision');
};
expj.AA0170010.AA0170011button0.executeOnLoad = function () {
  expj.AA0170010.AA0170011button0.executePScriptOnLoad();
};

expj.AA0170010.AA0170011button0.executePScriptOnLoad = function () {
  console.log('execute AA0170011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0170010-AA0170011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0170010-AA0170011button0-closeSub1">
expj.AA0170010.AA0170011button0.closeSub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@AA0170010Servlet,,$ZZ07013"
expj.AA0170010.AA0170011button0.closeSub1.onClick0 = function () {
  console.log('closeSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170011button0', '', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.changeBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callConfirm('AA0170010', 'AA0170011button0', 'ZZ07013', okEvent);
};
expj.AA0170010.AA0170011button0.closeSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170011button0.closeSub1['onClick' + i])) {
        expj.AA0170010.AA0170011button0.closeSub1['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170011button0.closeSub1.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170011button0.closeSub1.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170011button0-closeSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170011button0', 'closeSub1', this, 'Button');
    }
  });
  expj.AA0170010.AA0170011button0.closeSub1.executePScriptOnLoad();
};

expj.AA0170010.AA0170011button0.closeSub1.executePScriptOnLoad = function () {
  console.log('execute AA0170011button0/closeSub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170011button0-closeSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170011button0-closeSub1" name="closeSub1" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0170010 (END)-->
<%
MessageStruct msgStruct = aAA0170010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0170010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0170010)) {
  expj.common.treeInstanceMap.AA0170010 = {};
}
expj.common.treeInstanceMap.AA0170010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0170010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0170010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0170010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0170010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0170010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010)) {
  expj.common.detailDialogMap.AA0170010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0170010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0170010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0170010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0170010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0170010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0170010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0170010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0170010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0170010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0170010)) {
  expj.common.viewInstanceMap.AA0170010 = {};
}
expj.common.viewInstanceMap.AA0170010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0170010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0170010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0170010.<%=viewId %>.init = function () {
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
    expj.AA0170010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0170010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0170010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0170010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0170010_init">
/**
 * AA0170010用のロード完了時初期化関数
 */
expj.AA0170010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0170010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0170010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0170010');
  expj.common.calendarInstanceMap.AA0170010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0170010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0170010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0170010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0170010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0170010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0170010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.PeekerParentItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.sub1_PARENT_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.sub1_TARGET_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.sub1_DEVELOP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.PeekerCompItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.sub1_COMP_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.sub1_LEVEL.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.sub1_TARGET_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.sub1_PS_EDITION.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.sub1_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_PS_UNIT_NUMERATOR.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_PS_UNIT_DENOMINATOR.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_NUMERATOR.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_h_PS_UNIT_DENOMINATOR.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_IN_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.CalendarEffPhaseInDate.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_EFF_PHASE_OUT_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.CalendarEffPhaseOutDate.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_PS_SPOIL.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_CONS_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_PS_REF_NO.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_PS_FIXED_LT.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_PS_LT_CHECK.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_PS_LT_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_PS_PROP_LT.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_PS_PROP_LOT_SIZE.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_COST_UP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.sub1_MRP_EXP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011button1.insertSub1.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011button1.updateSub1.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011button0.closeSub1.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form1.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011form2.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011button1.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0170010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0170010', 'AA0170010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0170010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0170010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0170010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0170010', '<%=request.getContextPath() %>');
};

/**
 * AA0170010の全体onDecision処理
 */
expj.AA0170010.executeAllOnDecision = function () {
  expj.AA0170010.AA0170011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0170010_console">
expj.AA0170010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>