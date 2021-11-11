<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:38:42 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0040\AF0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0040.*" %>
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
<jsp:useBean id="aAF0040010Control" class="com.nec.jp.orteus.metamorBase.AF0040.AF0040010Control" scope="request"/>
<jsp:useBean id="aAF0040010Struct" class="com.nec.jp.orteus.metamorBase.AF0040.AF0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

追加出庫実績入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0040/jsp/AF0040010.jsp,v $
$Author: geng-jia $	
$Revision: 1.14 $ $Date: 2017/02/22 02:05:42 $
********************************************************* --%>
<html>
<head>
<title>追加出庫実績入力</title>
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
<script class="expj-script-AF0040010_init">
  // AF0040010名前空間
  expj.AF0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AF0040010" data-screen="AF0040010" data-newdata="<%=aAF0040010Control.isNewData() %>">
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
 
            <div class="expj-td frame04" style=""></div><!--/td-->

            <div class="expj-td frame05" style=""> 
              <script class="expj-script-AF0040010-AF0040010form1">
expj.AF0040010.AF0040010form1 = {};
// script1="onLoad;0;CALL;child@0,3"
expj.AF0040010.AF0040010form1.onLoad0 = function () {
  console.log('AF0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child3)){this.child3();}
};
// script2="child;0;CHK;_AF0040010form1/w_CHOICE[eq]1@*1,*2"
expj.AF0040010.AF0040010form1.child0 = function () {
  console.log('AF0040010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '_AF0040010form1/w_CHOICE'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AF0040010form1/r_SELECT_CHOICE_1=true"
expj.AF0040010.AF0040010form1.child1 = function () {
  console.log('AF0040010form1 script3');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040010form1', '_AF0040010form1/r_SELECT_CHOICE_1', 'true');
};
// script4="child;2;SET;_AF0040010form1/r_SELECT_CHOICE_0=true"
expj.AF0040010.AF0040010form1.child2 = function () {
  console.log('AF0040010form1 script4');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040010form1', '_AF0040010form1/r_SELECT_CHOICE_0', 'true');
};
// script5="child;3;CHK;?AF0040010form1/*[neq]NORMAL@*4"
expj.AF0040010.AF0040010form1.child3 = function () {
  console.log('AF0040010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '?AF0040010form1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;4;MASK;_AF0040010button2/modify"
expj.AF0040010.AF0040010form1.child4 = function () {
  console.log('AF0040010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010button2/modify');
};
// script7="onLoad;1;CALL;onDecision@0,1"
expj.AF0040010.AF0040010form1.onLoad1 = function () {
  console.log('AF0040010form1 script7');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script8="onDecision;0;CHK;_AF0040010form1/r_SELECT_CHOICE_1[eq]true@*5,*6"
expj.AF0040010.AF0040010form1.onDecision0 = function () {
  console.log('AF0040010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '_AF0040010form1/r_SELECT_CHOICE_1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;CHKRQ;B@*7,*8"
expj.AF0040010.AF0040010form1.child5 = function () {
  console.log('AF0040010form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('AF0040010', 'B')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;6;CHKRQ;A@*7,*8"
expj.AF0040010.AF0040010form1.child6 = function () {
  console.log('AF0040010form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('AF0040010', 'A')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;7;UNMASK;_AF0040010button1/select"
expj.AF0040010.AF0040010form1.child7 = function () {
  console.log('AF0040010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010button1/select');
};
// script12="child;8;MASK;_AF0040010button1/select"
expj.AF0040010.AF0040010form1.child8 = function () {
  console.log('AF0040010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010button1/select');
};
// script13="onDecision;1;CHKRQ;?AF0040010view1/?[eq]SINGLE@*9,*12"
expj.AF0040010.AF0040010form1.onDecision1 = function () {
  console.log('AF0040010form1 script13');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '?AF0040010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script14="child;9;CHK;?AF0040010form1/*[eq]NORMAL@*10,*12"
expj.AF0040010.AF0040010form1.child9 = function () {
  console.log('AF0040010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '?AF0040010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script15="child;10;CHK;?AF0040010form1/OPR_INST_CD[eq]SAME[and]?AF0040010form1/PUCH_ODR_CD[eq]SAME[and]?AF0040010form1/LOT_CTRL_FLG[eq]SAME@*11,*12"
expj.AF0040010.AF0040010form1.child10 = function () {
  console.log('AF0040010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '?AF0040010form1/OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '?AF0040010form1/PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '?AF0040010form1/LOT_CTRL_FLG'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script16="child;11;UNMASK;_AF0040010button2/modify"
expj.AF0040010.AF0040010form1.child11 = function () {
  console.log('AF0040010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010button2/modify');
};
// script17="child;12;MASK;_AF0040010button2/modify"
expj.AF0040010.AF0040010form1.child12 = function () {
  console.log('AF0040010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010button2/modify');
};
// script18="onLoad;2;CALL;child@13"
expj.AF0040010.AF0040010form1.onLoad2 = function () {
  console.log('AF0040010form1 script18');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child13)){this.child13();}
};
// script19="child;13;CHK;_AF0040010form1/h_lotCtrl[eq]true@*14,*15"
expj.AF0040010.AF0040010form1.child13 = function () {
  console.log('AF0040010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '_AF0040010form1/h_lotCtrl'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script20="child;14;UNMASK;_AF0040010form1/LOT_CTRL_FLG"
expj.AF0040010.AF0040010form1.child14 = function () {
  console.log('AF0040010form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010form1/LOT_CTRL_FLG');
};
// script21="child;15;MASK;_AF0040010form1/LOT_CTRL_FLG"
expj.AF0040010.AF0040010form1.child15 = function () {
  console.log('AF0040010form1 script21');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010form1/LOT_CTRL_FLG');
};
expj.AF0040010.AF0040010form1.executeAllOnDecision = function () {
  console.log('execute AF0040010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040010form1['onDecision' + i])) {
        expj.AF0040010.AF0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040010form1.executeOnLoad = function () {
  expj.AF0040010.AF0040010form1.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040010form1['onLoad' + i])) {
      expj.AF0040010.AF0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0040010-AF0040010form1" action="AF0040010Servlet" name="AF0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAF0040010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_CD",rb)%></span><!-- 作業指示番号 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040010form1-OPR_INST_CD">
expj.AF0040010.AF0040010form1.OPR_INST_CD = {};
expj.AF0040010.AF0040010form1.OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AF0040010form1/OPR_INST_CD.onDecision');
  expj.AF0040010.AF0040010form1.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040010form1.OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010form1-OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040010form1', 'OPR_INST_CD', this);
  });
  expj.AF0040010.AF0040010form1.OPR_INST_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1/OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010form1-OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040010form1-OPR_INST_CD" name="OPR_INST_CD" class="AF0040010-focus-move  required-value expj-AF0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getOPR_INST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0040010-AF0040010form1-PeekerOprInstCd">
expj.AF0040010.AF0040010form1.PeekerOprInstCd = {};
// script1="onClick;0;PEEKER;_AF0040010form1/OPR_INST_CD@<%=contextNo%>"
expj.AF0040010.AF0040010form1.PeekerOprInstCd.onClick0 = function () {
  console.log('PeekerOprInstCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0040010';
var parameterValues = 'PeekerOprInstCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0040010', 'PeekerOprInstCd', 'SQLPARAM_1', '<%=aAF0040010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '_AF0040010form1/OPR_INST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%OPR_INST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0040010form1/OPR_INST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0040010.AF0040010form1.PeekerOprInstCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040010form1.PeekerOprInstCd['onClick' + i])) {
        expj.AF0040010.AF0040010form1.PeekerOprInstCd['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040010form1.PeekerOprInstCd.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040010form1.PeekerOprInstCd.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010form1-PeekerOprInstCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040010form1', 'PeekerOprInstCd', this, 'Button');
    }
  });
  expj.AF0040010.AF0040010form1.PeekerOprInstCd.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.PeekerOprInstCd.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1/PeekerOprInstCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010form1-PeekerOprInstCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0040010-AF0040010form1-PeekerOprInstCd" class="AF0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040010form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AF0040010-AF0040010form1-h_lotCtrl">
expj.AF0040010.AF0040010form1.h_lotCtrl = {};
expj.AF0040010.AF0040010form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AF0040010form1/h_lotCtrl.onDecision');
  expj.AF0040010.AF0040010form1.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040010form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040010form1', 'h_lotCtrl', this);
  });
  expj.AF0040010.AF0040010form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010form1-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-AF0040010-AF0040010form1-r_SELECT_CHOICE_0">
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.onLoad0 = function () {
  console.log('r_SELECT_CHOICE_0 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.onClick0 = function () {
  console.log('r_SELECT_CHOICE_0 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_AF0040010form1/OPR_INST_CD,_AF0040010form1/PeekerOprInstCd@*1"
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.child0 = function () {
  console.log('r_SELECT_CHOICE_0 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010form1/OPR_INST_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010form1/PeekerOprInstCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;SET;_AF0040010form1/PUCH_ODR_CD=@*2"
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.child1 = function () {
  console.log('r_SELECT_CHOICE_0 script4');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040010form1', '_AF0040010form1/PUCH_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_AF0040010form1/PUCH_ODR_CD,_AF0040010form1/PeekerPuchOdrCd"
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.child2 = function () {
  console.log('r_SELECT_CHOICE_0 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010form1/PUCH_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010form1/PeekerPuchOdrCd');
};
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0['onClick' + i])) {
        expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.executeAllOnDecision = function () {
  console.log('execute AF0040010form1/r_SELECT_CHOICE_0.onDecision');
  expj.AF0040010.AF0040010form1.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010form1-r_SELECT_CHOICE_0').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040010form1', 'r_SELECT_CHOICE_0', this, 'RadioButton');
    }
  });
  expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1/r_SELECT_CHOICE_0.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010form1-r_SELECT_CHOICE_0');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0['onLoad' + i])) {
      expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="group1" data-name="r_SELECT_CHOICE_0" value="true" <%= ("true".equals(TypeConverter.convert(aAF0040010Struct.getr_SELECT_CHOICE_0())))?"checked=\"checked\"":"" %> class="" id="expj-AF0040010-AF0040010form1-r_SELECT_CHOICE_0" ><label for="expj-AF0040010-AF0040010form1-r_SELECT_CHOICE_0"><%=CoreTools.getRBString("Expj.Cmt0506",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040010form1-COMPANY_CD" name="COMPANY_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getCOMPANY_CD()) %>">
<script class="expj-script-AF0040010-AF0040010form1-COMPANY_CD">
expj.AF0040010.AF0040010form1.COMPANY_CD = {};
expj.AF0040010.AF0040010form1.COMPANY_CD.executeAllOnDecision = function () {
  console.log('execute AF0040010form1/COMPANY_CD.onDecision');
  expj.AF0040010.AF0040010form1.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040010form1.COMPANY_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010form1-COMPANY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040010form1', 'COMPANY_CD', this);
  });
  expj.AF0040010.AF0040010form1.COMPANY_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.COMPANY_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1/COMPANY_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010form1-COMPANY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040010form1-w_CHOICE" name="w_CHOICE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getw_CHOICE()) %>">
<script class="expj-script-AF0040010-AF0040010form1-w_CHOICE">
expj.AF0040010.AF0040010form1.w_CHOICE = {};
expj.AF0040010.AF0040010form1.w_CHOICE.executeAllOnDecision = function () {
  console.log('execute AF0040010form1/w_CHOICE.onDecision');
  expj.AF0040010.AF0040010form1.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040010form1.w_CHOICE.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010form1-w_CHOICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040010form1', 'w_CHOICE', this);
  });
  expj.AF0040010.AF0040010form1.w_CHOICE.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.w_CHOICE.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1/w_CHOICE.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010form1-w_CHOICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040010form1-PUCH_ODR_CD">
expj.AF0040010.AF0040010form1.PUCH_ODR_CD = {};
expj.AF0040010.AF0040010form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0040010form1/PUCH_ODR_CD.onDecision');
  expj.AF0040010.AF0040010form1.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040010form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040010form1', 'PUCH_ODR_CD', this);
  });
  expj.AF0040010.AF0040010form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040010form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AF0040010-focus-move  required-value expj-AF0040010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0040010-AF0040010form1-PeekerPuchOdrCd">
expj.AF0040010.AF0040010form1.PeekerPuchOdrCd = {};
// script1="onClick;0;PEEKER;_AF0040010form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AF0040010.AF0040010form1.PeekerPuchOdrCd.onClick0 = function () {
  console.log('PeekerPuchOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0040010';
var parameterValues = 'PeekerPuchOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0040010', 'PeekerPuchOdrCd', 'SQLPARAM_1', '<%=aAF0040010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '_AF0040010form1/PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_07%&%';
parameterValues += 'TARGET_FIELD%=%_AF0040010form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0040010.AF0040010form1.PeekerPuchOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040010form1.PeekerPuchOdrCd['onClick' + i])) {
        expj.AF0040010.AF0040010form1.PeekerPuchOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040010form1.PeekerPuchOdrCd.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040010form1.PeekerPuchOdrCd.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010form1-PeekerPuchOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040010form1', 'PeekerPuchOdrCd', this, 'Button');
    }
  });
  expj.AF0040010.AF0040010form1.PeekerPuchOdrCd.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.PeekerPuchOdrCd.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1/PeekerPuchOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010form1-PeekerPuchOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0040010-AF0040010form1-PeekerPuchOdrCd" class="AF0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AF0040010-AF0040010form1-r_SELECT_CHOICE_1">
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.onLoad0 = function () {
  console.log('r_SELECT_CHOICE_1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.onClick0 = function () {
  console.log('r_SELECT_CHOICE_1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_AF0040010form1/PUCH_ODR_CD,_AF0040010form1/PeekerPuchOdrCd@*1"
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.child0 = function () {
  console.log('r_SELECT_CHOICE_1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010form1/PUCH_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010form1/PeekerPuchOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;SET;_AF0040010form1/OPR_INST_CD=@*2"
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.child1 = function () {
  console.log('r_SELECT_CHOICE_1 script4');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040010form1', '_AF0040010form1/OPR_INST_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_AF0040010form1/OPR_INST_CD,_AF0040010form1/PeekerOprInstCd"
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.child2 = function () {
  console.log('r_SELECT_CHOICE_1 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010form1/OPR_INST_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040010form1', '_AF0040010form1/PeekerOprInstCd');
};
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1['onClick' + i])) {
        expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.executeAllOnDecision = function () {
  console.log('execute AF0040010form1/r_SELECT_CHOICE_1.onDecision');
  expj.AF0040010.AF0040010form1.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010form1-r_SELECT_CHOICE_1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040010form1', 'r_SELECT_CHOICE_1', this, 'RadioButton');
    }
  });
  expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1/r_SELECT_CHOICE_1.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010form1-r_SELECT_CHOICE_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1['onLoad' + i])) {
      expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="group1" data-name="r_SELECT_CHOICE_1" value="true" <%= ("true".equals(TypeConverter.convert(aAF0040010Struct.getr_SELECT_CHOICE_1())))?"checked=\"checked\"":"" %> class="" id="expj-AF0040010-AF0040010form1-r_SELECT_CHOICE_1" ><label for="expj-AF0040010-AF0040010form1-r_SELECT_CHOICE_1"><%=CoreTools.getRBString("Expj.Cmt0504",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOT_CTRL_FLG",rb)%></span><!-- ロット管理フラグ --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040010form1-LOT_CTRL_FLG">
expj.AF0040010.AF0040010form1.LOT_CTRL_FLG = {};
expj.AF0040010.AF0040010form1.LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AF0040010form1/LOT_CTRL_FLG.onDecision');
  expj.AF0040010.AF0040010form1.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040010form1.LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010form1-LOT_CTRL_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0040010', 'AF0040010form1', 'LOT_CTRL_FLG', this);
  });
  expj.AF0040010.AF0040010form1.LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AF0040010.AF0040010form1.LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0040010form1/LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010form1-LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0040010-AF0040010form1-LOT_CTRL_FLG" name='LOT_CTRL_FLG' class='AF0040010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0040010Control.getStruct().getList_LOT_CTRL_FLG_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0040010Control.getStruct().getList_LOT_CTRL_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0040010Control.getStruct().getList_LOT_CTRL_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0040010Struct.getLOT_CTRL_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AF0040010-AF0040010button1">
expj.AF0040010.AF0040010button1 = {};
expj.AF0040010.AF0040010button1.executeAllOnDecision = function () {
  console.log('execute AF0040010button1.onDecision');
};
expj.AF0040010.AF0040010button1.executeOnLoad = function () {
  expj.AF0040010.AF0040010button1.executePScriptOnLoad();
};

expj.AF0040010.AF0040010button1.executePScriptOnLoad = function () {
  console.log('execute AF0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0040010-AF0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0040010-AF0040010button1-Detail">
expj.AF0040010.AF0040010button1.Detail = {};
// script1="onClick;0;FSHOW;AF0040010float1"
expj.AF0040010.AF0040010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AF0040010', 'AF0040010float1', '');
};
expj.AF0040010.AF0040010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040010button1.Detail['onClick' + i])) {
        expj.AF0040010.AF0040010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040010button1.Detail.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040010button1.Detail.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040010button1', 'Detail', this, 'Button');
    }
  });
  expj.AF0040010.AF0040010button1.Detail.executePScriptOnLoad();
};

expj.AF0040010.AF0040010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AF0040010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0040010-AF0040010button1-Detail" name="Detail" class="AF0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040010button1-select">
expj.AF0040010.AF0040010button1.select = {};
// script1="onClick;0;CHK;_AF0040010form1/r_SELECT_CHOICE_1[eq]true@*0,*1"
expj.AF0040010.AF0040010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040010button1', '_AF0040010form1/r_SELECT_CHOICE_1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0040010form1/*@AF0040010Servlet"
expj.AF0040010.AF0040010button1.select.onClick1 = function () {
  console.log('select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0040010', 'AF0040010button1', '_AF0040010form1/*', 'AF0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0040010', response);
expj.common.updateBusinessScreenTab('AF0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script3="child;0;SET;_AF0040010form1/w_CHOICE=1"
expj.AF0040010.AF0040010button1.select.child0 = function () {
  console.log('select script3');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040010button1', '_AF0040010form1/w_CHOICE', '1');
};
// script4="child;1;SET;_AF0040010form1/w_CHOICE=0"
expj.AF0040010.AF0040010button1.select.child1 = function () {
  console.log('select script4');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040010button1', '_AF0040010form1/w_CHOICE', '0');
};
expj.AF0040010.AF0040010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040010button1.select['onClick' + i])) {
        expj.AF0040010.AF0040010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040010button1.select.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040010button1.select.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040010button1', 'select', this, 'Button');
    }
  });
  expj.AF0040010.AF0040010button1.select.executePScriptOnLoad();
};

expj.AF0040010.AF0040010button1.select.executePScriptOnLoad = function () {
  console.log('execute AF0040010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0040010-AF0040010button1-select" name="select" class="AF0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AF0040010-AF0040010view1">
expj.AF0040010.AF0040010view1 = {};
expj.AF0040010.AF0040010view1.executeAllOnClick = function () {
};
expj.AF0040010.AF0040010view1.executeAllOnDecision = function () {
  console.log('execute AF0040010view1.onDecision');
};
expj.AF0040010.AF0040010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AF0040010view1", "expj.AF0040010.AF0040010view1.executeAllOnClick");
%>
  expj.AF0040010.AF0040010view1.executePScriptOnLoad();
};

expj.AF0040010.AF0040010view1.executePScriptOnLoad = function () {
  console.log('execute AF0040010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AF0040010-AF0040010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AF0040010view1_Id = "AF0040010view1";
 String AF0040010view1_select = "single";
 String AF0040010view1_sortable = "true";
 String AF0040010view1_resize = "true";
 String AF0040010view1_scroll = "true";
 StringBuffer AF0040010view1_HB = new StringBuffer();
 StringBuffer AF0040010view1_DB = new StringBuffer();
%>
<%
 AF0040010view1_select = "single";
 AF0040010view1_sortable = "true";
 AF0040010view1_resize = "true";
 AF0040010view1_scroll = "true";
%>
<%
 AF0040010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
%>
     
<%
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_CD",rb))).append("', 'name':'ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_QTY",rb))).append("', 'name':'ISSUE_INST_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY",rb))).append("', 'name':'TOTAL_ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_QTY_1",rb))).append("', 'name':'w_SHIP_REMAIN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SCDL_ISSUE_DATE",rb))).append("', 'name':'SCDL_ISSUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_CMPLT_DATE",rb))).append("', 'name':'ISSUE_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ISSUE_CMPLT_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_CMPLT_FLG",rb))).append("', 'name':'w_ISSUE_CMPLT_FLG_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD_1",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME_2",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'CONS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
AF0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONS_TYP",rb))).append("', 'name':'w_CONS_TYP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0040010view1_sortable).append("}").append(",");
%>
<%
 int aAF0040010StructLength = aAF0040010Control.getListsize();
 final AF0040010Struct structBackup = aAF0040010Struct;
 aAF0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAF0040010StructLength; ++loopCount) {
  if((aAF0040010Struct = (AF0040010Struct) aAF0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAF0040010Struct", aAF0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AF0040010view1_DB.append("[");
 AF0040010view1_DB.append(loopCount);
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getMODIFY_COUNT())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-ISSUE_INST_CD\" data-name=\"ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getISSUE_INST_CD())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getITEM_CD())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getITEM_NAME())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-ISSUE_INST_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-ISSUE_INST_QTY\" data-name=\"ISSUE_INST_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0040010Struct.getISSUE_INST_QTY())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-TOTAL_ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-TOTAL_ISSUE_QTY\" data-name=\"TOTAL_ISSUE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0040010Struct.getTOTAL_ISSUE_QTY())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-w_SHIP_REMAIN_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-w_SHIP_REMAIN_QTY\" data-name=\"w_SHIP_REMAIN_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0040010Struct.getw_SHIP_REMAIN_QTY())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-SCDL_ISSUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-SCDL_ISSUE_DATE\" data-name=\"SCDL_ISSUE_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAF0040010Struct.getSCDL_ISSUE_DATE())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-ISSUE_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-ISSUE_CMPLT_DATE\" data-name=\"ISSUE_CMPLT_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAF0040010Struct.getISSUE_CMPLT_DATE())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-ISSUE_CMPLT_FLG-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-ISSUE_CMPLT_FLG\" data-name=\"ISSUE_CMPLT_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getISSUE_CMPLT_FLG())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-w_ISSUE_CMPLT_FLG_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-w_ISSUE_CMPLT_FLG_NAME\" data-name=\"w_ISSUE_CMPLT_FLG_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getw_ISSUE_CMPLT_FLG_NAME())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-OD_NO\" data-name=\"OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getOD_NO())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getWH_CD())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getWH_NAME())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-CONS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-CONS_TYP\" data-name=\"CONS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getCONS_TYP())).append("</span>'");
 AF0040010view1_DB.append(",").append("'<span id=\"expj-AF0040010-AF0040010view1-w_CONS_TYP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0040010-AF0040010view1-w_CONS_TYP_NAME\" data-name=\"w_CONS_TYP_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getw_CONS_TYP_NAME())).append("</span>'");
 AF0040010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAF0040010StructLength) {
   AF0040010view1_DB.append(",");
  }
 }
 aAF0040010Struct = structBackup;
 viewIdList.add(AF0040010view1_Id);
 viewSelectList.add(AF0040010view1_select);
 viewResizeList.add(AF0040010view1_resize);
 viewScrollList.add(AF0040010view1_scroll);
 viewHeaderDataList.add(AF0040010view1_HB);
 viewBodyDataList.add(AF0040010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0040010-AF0040010button2">
expj.AF0040010.AF0040010button2 = {};
expj.AF0040010.AF0040010button2.executeAllOnDecision = function () {
  console.log('execute AF0040010button2.onDecision');
};
expj.AF0040010.AF0040010button2.executeOnLoad = function () {
  expj.AF0040010.AF0040010button2.executePScriptOnLoad();
};

expj.AF0040010.AF0040010button2.executePScriptOnLoad = function () {
  console.log('execute AF0040010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0040010-AF0040010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0040010-AF0040010button2-modify">
expj.AF0040010.AF0040010button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AF0040010form1/*,_AF0040010view1/+@AF0040010Servlet"
expj.AF0040010.AF0040010button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0040010', 'AF0040010button2', '_AF0040010form1/*,_AF0040010view1/+', 'AF0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0040010', response);
expj.common.changeBusinessScreenTab('AF0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0040010.AF0040010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040010button2.modify['onClick' + i])) {
        expj.AF0040010.AF0040010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040010button2.modify.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040010button2.modify.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040010button2', 'modify', this, 'Button');
    }
  });
  expj.AF0040010.AF0040010button2.modify.executePScriptOnLoad();
};

expj.AF0040010.AF0040010button2.modify.executePScriptOnLoad = function () {
  console.log('execute AF0040010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0040010-AF0040010button2-modify" name="modify" class="AF0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
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
<span class="version">AF0040010 Revision: 1.9  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AF0040010-AF0040010button0">
expj.AF0040010.AF0040010button0 = {};
expj.AF0040010.AF0040010button0.executeAllOnDecision = function () {
  console.log('execute AF0040010button0.onDecision');
};
expj.AF0040010.AF0040010button0.executeOnLoad = function () {
  expj.AF0040010.AF0040010button0.executePScriptOnLoad();
};

expj.AF0040010.AF0040010button0.executePScriptOnLoad = function () {
  console.log('execute AF0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0040010-AF0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0040010-AF0040010button0-clear">
expj.AF0040010.AF0040010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0040010form1/*@AF0040010Servlet,,$ZZ07008"
expj.AF0040010.AF0040010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0040010', 'AF0040010button0', '_AF0040010form1/*', 'AF0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0040010', response);
expj.common.updateBusinessScreenTab('AF0040010', contents);
};
expj.common.pscript.callConfirm('AF0040010', 'AF0040010button0', 'ZZ07008', okEvent);
};
expj.AF0040010.AF0040010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040010button0.clear['onClick' + i])) {
        expj.AF0040010.AF0040010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040010button0.clear.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040010button0.clear.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040010button0', 'clear', this, 'Button');
    }
  });
  expj.AF0040010.AF0040010button0.clear.executePScriptOnLoad();
};

expj.AF0040010.AF0040010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AF0040010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0040010-AF0040010button0-clear" name="clear" class="AF0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040010button0-close">
expj.AF0040010.AF0040010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AF0040010.AF0040010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AF0040010');
};
expj.AF0040010.AF0040010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040010button0.close['onClick' + i])) {
        expj.AF0040010.AF0040010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040010button0.close.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040010button0.close.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040010button0', 'close', this, 'Button');
    }
  });
  expj.AF0040010.AF0040010button0.close.executePScriptOnLoad();
};

expj.AF0040010.AF0040010button0.close.executePScriptOnLoad = function () {
  console.log('execute AF0040010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0040010-AF0040010button0-close" name="close" class="AF0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0040010 (END)-->
<script class="expj-script-AF0040010-AF0040010detail1">
expj.AF0040010.AF0040010detail1 = {};
expj.AF0040010.AF0040010detail1.executeAllOnDecision = function () {
  console.log('execute AF0040010detail1.onDecision');
};
expj.AF0040010.AF0040010detail1.executeOnLoad = function () {
  expj.AF0040010.AF0040010detail1.executePScriptOnLoad();
};

expj.AF0040010.AF0040010detail1.executePScriptOnLoad = function () {
  console.log('execute AF0040010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAF0040010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AF0040010-AF0040010detail1" class="expj-datagird-detail" data-float="AF0040010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AF0040010detail1";
 detailFloat = "AF0040010float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AF0040010detail1_Id = "AF0040010detail1";
 String AF0040010detail1_select = "single";
 String AF0040010detail1_sortable = "true";
 String AF0040010detail1_resize = "true";
 String AF0040010detail1_scroll = "true";
 StringBuffer AF0040010detail1_HB = new StringBuffer();
 StringBuffer AF0040010detail1_DB = new StringBuffer();
%>
<%
 AF0040010detail1_sortable = "false";
 AF0040010detail1_select = "none";
%>
<% AF0040010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AF0040010detail1_sortable).append("}").append(","); %>
<%  AF0040010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AF0040010detail1_sortable).append("}").append(",");
AF0040010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AF0040010detail1_sortable).append("}").append(",");
AF0040010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AF0040010detail1_sortable).append("}").append(",");
 %>
  <% AF0040010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.JOB_ODR_CD",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-JOB_ODR_CD\" class=\"expj-label\" data-name=\"JOB_ODR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getJOB_ODR_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-ITEM_CD\" class=\"expj-label\" data-name=\"ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-ITEM_NAME\" class=\"expj-label\" data-name=\"ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-OPR_INST_START_DATE\" class=\"expj-label\" data-name=\"OPR_INST_START_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAF0040010Struct.getOPR_INST_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_3",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-WORK_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"WORK_ODR_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAF0040010Struct.getWORK_ODR_DLV_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AF0040010-AF0040010detail1-OPR_INST_QTY\" class=\"expj-label\" data-name=\"OPR_INST_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0040010Struct.getOPR_INST_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AF0040010-AF0040010detail1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.WORK_ODR_CD",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-WORK_ODR_CD\" class=\"expj-label\" data-name=\"WORK_ODR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getWORK_ODR_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-WORK_IN_PROC_CD\" class=\"expj-label\" data-name=\"WORK_IN_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getWORK_IN_PROC_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.PROC_NAME",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-PROC_NAME\" class=\"expj-label\" data-name=\"PROC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getPROC_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.WS_CD",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-WS_CD\" class=\"expj-label\" data-name=\"WS_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getWS_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.WS_NAME",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-WS_NAME\" class=\"expj-label\" data-name=\"WS_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getWS_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-VEND_CD\" class=\"expj-label\" data-name=\"VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getVEND_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0040010detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.VEND_ANAME",rb)).append("','").append("<span id=\"expj-AF0040010-AF0040010detail1-VEND_ANAME\" class=\"expj-label\" data-name=\"VEND_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0040010Struct.getVEND_ANAME())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AF0040010detail1_Id;
 detailViewSelect = AF0040010detail1_select;
 detailViewResize = AF0040010detail1_resize;
 detailViewScroll = AF0040010detail1_scroll;
 detailViewHeaderData = AF0040010detail1_HB;
 detailViewBodyData = AF0040010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAF0040010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0040010)) {
  expj.common.treeInstanceMap.AF0040010 = {};
}
expj.common.treeInstanceMap.AF0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0040010)) {
  expj.common.detailDialogMap.AF0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AF0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0040010)) {
  expj.common.viewInstanceMap.AF0040010 = {};
}
expj.common.viewInstanceMap.AF0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0040010.<%=viewId %>.init = function () {
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
    expj.AF0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0040010_init">
/**
 * AF0040010用のロード完了時初期化関数
 */
expj.AF0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0040010');
  expj.common.calendarInstanceMap.AF0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0040010.AF0040010form1.OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010form1.PeekerOprInstCd.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_0.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010form1.COMPANY_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010form1.w_CHOICE.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010form1.PeekerPuchOdrCd.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010form1.r_SELECT_CHOICE_1.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010form1.LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010button1.select.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010button2.modify.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010button0.close.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010form1.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010button1.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010view1.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010button2.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010button0.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0040010', 'AF0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0040010', '<%=request.getContextPath() %>');
};

/**
 * AF0040010の全体onDecision処理
 */
expj.AF0040010.executeAllOnDecision = function () {
  expj.AF0040010.AF0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0040010_console">
expj.AF0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>