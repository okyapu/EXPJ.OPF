<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:22:17 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0070\AA0070010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0070.*" %>
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
<jsp:useBean id="aAA0070010Control" class="com.nec.jp.orteus.metamorBase.AA0070.AA0070010Control" scope="request"/>
<jsp:useBean id="aAA0070010Struct" class="com.nec.jp.orteus.metamorBase.AA0070.AA0070010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

取引先メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0070/jsp/AA0070010.jsp,v $
$Author: geng-jia $    
$Revision: 1.17 $ $Date: 2017/02/22 02:03:53 $
********************************************************* --%>
<html>
<head>
<title>取引先メンテナンス</title>
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
<script class="expj-script-AA0070010_init">
  // AA0070010名前空間
  expj.AA0070010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0070010" data-screen="AA0070010" data-newdata="<%=aAA0070010Control.isNewData() %>">
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
              <script class="expj-script-AA0070010-AA0070010form1">
expj.AA0070010.AA0070010form1 = {};
// script1="onLoad;0;CALL;child@2,5,13"
expj.AA0070010.AA0070010form1.onLoad0 = function () {
  console.log('AA0070010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child2)){this.child2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child5)){this.child5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child13)){this.child13();}
};
// script2="onLoad;1;CALL;onDecision@0,3,4"
expj.AA0070010.AA0070010form1.onLoad1 = function () {
  console.log('AA0070010form1 script2');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script3="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0070010.AA0070010form1.onDecision0 = function () {
  console.log('AA0070010form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('AA0070010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;0;UNMASK;_AA0070010button1/select"
expj.AA0070010.AA0070010form1.child0 = function () {
  console.log('AA0070010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button1/select');
};
// script5="child;1;MASK;_AA0070010button1/select"
expj.AA0070010.AA0070010form1.child1 = function () {
  console.log('AA0070010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button1/select');
};
// script6="child;2;CHK;?AA0070010form1/*[eq]NORMAL@*3,*4"
expj.AA0070010.AA0070010form1.child2 = function () {
  console.log('AA0070010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '?AA0070010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;MASK;_AA0070010button2/insert"
expj.AA0070010.AA0070010form1.child3 = function () {
  console.log('AA0070010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/insert');
};
// script8="child;4;MASK;_AA0070010button2/update,_AA0070010button2/delete"
expj.AA0070010.AA0070010form1.child4 = function () {
  console.log('AA0070010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/delete');
};
// script9="onDecision;1;CHK;1[eq]1@*5"
expj.AA0070010.AA0070010form1.onDecision1 = function () {
  console.log('AA0070010form1 script9');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="child;5;CHKRQ;A,B@*6,*12"
expj.AA0070010.AA0070010form1.child5 = function () {
  console.log('AA0070010form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('AA0070010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AA0070010', 'B')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script11="child;6;CHK;?AA0070010form1/*[eq]INITIAL[or]?AA0070010form1/*[eq]NORMAL@*7,*12"
expj.AA0070010.AA0070010form1.child6 = function () {
  console.log('AA0070010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '?AA0070010form1/*'), '[eq]', 'INITIAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '?AA0070010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script12="child;7;CHK;_AA0070010form1/VEND_CD[eq]_AA0070010form1/h_VEND_CD@*8,*10"
expj.AA0070010.AA0070010form1.child7 = function () {
  console.log('AA0070010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '_AA0070010form1/VEND_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '_AA0070010form1/h_VEND_CD'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script13="child;8;UNMASK;_AA0070010button2/update@*9"
expj.AA0070010.AA0070010form1.child8 = function () {
  console.log('AA0070010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script14="child;9;MASK;_AA0070010button2/insert"
expj.AA0070010.AA0070010form1.child9 = function () {
  console.log('AA0070010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/insert');
};
// script15="child;10;UNMASK;_AA0070010button2/insert@*11"
expj.AA0070010.AA0070010form1.child10 = function () {
  console.log('AA0070010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script16="child;11;MASK;_AA0070010button2/update"
expj.AA0070010.AA0070010form1.child11 = function () {
  console.log('AA0070010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/update');
};
// script17="child;12;MASK;_AA0070010button2/insert,_AA0070010button2/update"
expj.AA0070010.AA0070010form1.child12 = function () {
  console.log('AA0070010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/update');
};
// script18="onDecision;2;CHK;1[eq]1@*13"
expj.AA0070010.AA0070010form1.onDecision2 = function () {
  console.log('AA0070010form1 script18');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script19="child;13;CHK;?AA0070010form1/*[eq]NORMAL@*14,*16"
expj.AA0070010.AA0070010form1.child13 = function () {
  console.log('AA0070010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '?AA0070010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script20="child;14;CHK;_AA0070010form1/VEND_CD[eq]_AA0070010form1/h_VEND_CD@*15,*16"
expj.AA0070010.AA0070010form1.child14 = function () {
  console.log('AA0070010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '_AA0070010form1/VEND_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '_AA0070010form1/h_VEND_CD'))) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script21="child;15;UNMASK;_AA0070010button2/delete"
expj.AA0070010.AA0070010form1.child15 = function () {
  console.log('AA0070010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/delete');
};
// script22="child;16;MASK;_AA0070010button2/delete"
expj.AA0070010.AA0070010form1.child16 = function () {
  console.log('AA0070010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/delete');
};
// script23="onDecision;3;CHK;_AA0070010form1/h_APR_VEND_CTRL[eq]0@*17,*18"
expj.AA0070010.AA0070010form1.onDecision3 = function () {
  console.log('AA0070010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '_AA0070010form1/h_APR_VEND_CTRL'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script24="child;17;MASK;_AA0070010form2/APPR_REMARKS"
expj.AA0070010.AA0070010form1.child17 = function () {
  console.log('AA0070010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010form2/APPR_REMARKS');
};
// script25="child;18;UNMASK;_AA0070010form2/APPR_REMARKS"
expj.AA0070010.AA0070010form1.child18 = function () {
  console.log('AA0070010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010form2/APPR_REMARKS');
};
// script26="onDecision;4;CHK;_AA0070010form1/h_SCREENMOVE_TYP[neq]@*19"
expj.AA0070010.AA0070010form1.onDecision4 = function () {
  console.log('AA0070010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '_AA0070010form1/h_SCREENMOVE_TYP'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script27="child;19;MASK;_AA0070010button1/select,_AA0070010button2/insert,_AA0070010button2/update,_AA0070010button2/delete,_AA0070010button0/clear"
expj.AA0070010.AA0070010form1.child19 = function () {
  console.log('AA0070010form1 script27');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button1/select');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button2/delete');
expj.common.pscript.setMaskToReferenceComponent('AA0070010', 'AA0070010form1', '_AA0070010button0/clear');
};
expj.AA0070010.AA0070010form1.executeAllOnDecision = function () {
  console.log('execute AA0070010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010form1['onDecision' + i])) {
        expj.AA0070010.AA0070010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010form1.executeOnLoad = function () {
  expj.AA0070010.AA0070010form1.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form1.executePScriptOnLoad = function () {
  console.log('execute AA0070010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0070010.AA0070010form1['onLoad' + i])) {
      expj.AA0070010.AA0070010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0070010-AA0070010form1" action="AA0070010Servlet" name="AA0070010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0070010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form1-VEND_CD">
expj.AA0070010.AA0070010form1.VEND_CD = {};
expj.AA0070010.AA0070010form1.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AA0070010form1/VEND_CD.onDecision');
  expj.AA0070010.AA0070010form1.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form1.VEND_CD.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form1-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form1', 'VEND_CD', this);
  });
  expj.AA0070010.AA0070010form1.VEND_CD.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form1.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AA0070010form1/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form1-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form1-VEND_CD" name="VEND_CD" class="AA0070010-focus-move  required-value expj-AA0070010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0070010-AA0070010form1-h_VEND_CD" name="h_VEND_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0070010Struct.geth_VEND_CD()) %>">
<script class="expj-script-AA0070010-AA0070010form1-h_VEND_CD">
expj.AA0070010.AA0070010form1.h_VEND_CD = {};
expj.AA0070010.AA0070010form1.h_VEND_CD.executeAllOnDecision = function () {
  console.log('execute AA0070010form1/h_VEND_CD.onDecision');
  expj.AA0070010.AA0070010form1.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form1.h_VEND_CD.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form1-h_VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form1', 'h_VEND_CD', this);
  });
  expj.AA0070010.AA0070010form1.h_VEND_CD.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form1.h_VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AA0070010form1/h_VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form1-h_VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0070010-AA0070010form1-PeekerVendCd">
expj.AA0070010.AA0070010form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AA0070010form1/VEND_CD@<%=contextNo%>"
expj.AA0070010.AA0070010form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0070010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form1', '_AA0070010form1/VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AA0070010form1/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0070010.AA0070010form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010form1.PeekerVendCd['onClick' + i])) {
        expj.AA0070010.AA0070010form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AA0070010.AA0070010form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AA0070010.AA0070010form1.PeekerVendCd.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AA0070010form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0070010-AA0070010form1-PeekerVendCd" class="AA0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AA0070010-AA0070010form1-h_APR_VEND_CTRL" name="h_APR_VEND_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0070010Struct.geth_APR_VEND_CTRL()) %>">
<script class="expj-script-AA0070010-AA0070010form1-h_APR_VEND_CTRL">
expj.AA0070010.AA0070010form1.h_APR_VEND_CTRL = {};
expj.AA0070010.AA0070010form1.h_APR_VEND_CTRL.executeAllOnDecision = function () {
  console.log('execute AA0070010form1/h_APR_VEND_CTRL.onDecision');
  expj.AA0070010.AA0070010form1.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form1.h_APR_VEND_CTRL.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form1-h_APR_VEND_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form1', 'h_APR_VEND_CTRL', this);
  });
  expj.AA0070010.AA0070010form1.h_APR_VEND_CTRL.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form1.h_APR_VEND_CTRL.executePScriptOnLoad = function () {
  console.log('execute AA0070010form1/h_APR_VEND_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form1-h_APR_VEND_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0070010-AA0070010form1-h_SCREENMOVE_TYP" name="h_SCREENMOVE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0070010Struct.geth_SCREENMOVE_TYP()) %>">
<script class="expj-script-AA0070010-AA0070010form1-h_SCREENMOVE_TYP">
expj.AA0070010.AA0070010form1.h_SCREENMOVE_TYP = {};
expj.AA0070010.AA0070010form1.h_SCREENMOVE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0070010form1/h_SCREENMOVE_TYP.onDecision');
  expj.AA0070010.AA0070010form1.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form1.h_SCREENMOVE_TYP.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form1-h_SCREENMOVE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form1', 'h_SCREENMOVE_TYP', this);
  });
  expj.AA0070010.AA0070010form1.h_SCREENMOVE_TYP.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form1.h_SCREENMOVE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0070010form1/h_SCREENMOVE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form1-h_SCREENMOVE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0070010-AA0070010form1-h_APPR_ID" name="h_APPR_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0070010Struct.geth_APPR_ID()) %>">
<script class="expj-script-AA0070010-AA0070010form1-h_APPR_ID">
expj.AA0070010.AA0070010form1.h_APPR_ID = {};
expj.AA0070010.AA0070010form1.h_APPR_ID.executeAllOnDecision = function () {
  console.log('execute AA0070010form1/h_APPR_ID.onDecision');
  expj.AA0070010.AA0070010form1.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form1.h_APPR_ID.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form1-h_APPR_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form1', 'h_APPR_ID', this);
  });
  expj.AA0070010.AA0070010form1.h_APPR_ID.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form1.h_APPR_ID.executePScriptOnLoad = function () {
  console.log('execute AA0070010form1/h_APPR_ID.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form1-h_APPR_ID');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0070010-AA0070010button1">
expj.AA0070010.AA0070010button1 = {};
expj.AA0070010.AA0070010button1.executeAllOnDecision = function () {
  console.log('execute AA0070010button1.onDecision');
};
expj.AA0070010.AA0070010button1.executeOnLoad = function () {
  expj.AA0070010.AA0070010button1.executePScriptOnLoad();
};

expj.AA0070010.AA0070010button1.executePScriptOnLoad = function () {
  console.log('execute AA0070010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0070010-AA0070010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0070010-AA0070010button1-select">
expj.AA0070010.AA0070010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0070010form1/*@AA0070010Servlet"
expj.AA0070010.AA0070010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0070010', 'AA0070010button1', '_AA0070010form1/*', 'AA0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0070010', response);
expj.common.updateBusinessScreenTab('AA0070010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0070010.AA0070010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010button1.select['onClick' + i])) {
        expj.AA0070010.AA0070010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010button1.select.executeAllOnDecision = function () {
};
expj.AA0070010.AA0070010button1.select.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010button1', 'select', this, 'Button');
    }
  });
  expj.AA0070010.AA0070010button1.select.executePScriptOnLoad();
};

expj.AA0070010.AA0070010button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0070010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0070010-AA0070010button1-select" name="select" class="AA0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0070010-AA0070010form2">
expj.AA0070010.AA0070010form2 = {};
expj.AA0070010.AA0070010form2.executeAllOnDecision = function () {
  console.log('execute AA0070010form2.onDecision');
};
expj.AA0070010.AA0070010form2.executeOnLoad = function () {
  expj.AA0070010.AA0070010form2.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0070010-AA0070010form2" action="AA0070010Servlet" name="AA0070010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.VEND_NAME",rb)%></span><!-- 取引先名称 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-VEND_NAME">
expj.AA0070010.AA0070010form2.VEND_NAME = {};
expj.AA0070010.AA0070010form2.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/VEND_NAME.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.VEND_NAME.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'VEND_NAME', this);
  });
  expj.AA0070010.AA0070010form2.VEND_NAME.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-VEND_NAME" name="VEND_NAME" class="AA0070010-focus-move  required-value expj-AA0070010-required-B" style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getVEND_NAME()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-AA0070010-AA0070010form2-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AA0070010-AA0070010form2-MODIFY_COUNT">
expj.AA0070010.AA0070010form2.MODIFY_COUNT = {};
expj.AA0070010.AA0070010form2.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/MODIFY_COUNT.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'MODIFY_COUNT', this);
  });
  expj.AA0070010.AA0070010form2.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.VEND_ANAME",rb)%></span><!-- 取引先略称 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-VEND_ANAME">
expj.AA0070010.AA0070010form2.VEND_ANAME = {};
expj.AA0070010.AA0070010form2.VEND_ANAME.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/VEND_ANAME.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.VEND_ANAME.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-VEND_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'VEND_ANAME', this);
  });
  expj.AA0070010.AA0070010form2.VEND_ANAME.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.VEND_ANAME.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/VEND_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-VEND_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-VEND_ANAME" name="VEND_ANAME" class="AA0070010-focus-move  required-value expj-AA0070010-required-B" style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getVEND_ANAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_KNAME",rb)%></span><!-- 取引先カナ名称 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-VEND_KNAME">
expj.AA0070010.AA0070010form2.VEND_KNAME = {};
expj.AA0070010.AA0070010form2.VEND_KNAME.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/VEND_KNAME.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.VEND_KNAME.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-VEND_KNAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'VEND_KNAME', this);
  });
  expj.AA0070010.AA0070010form2.VEND_KNAME.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.VEND_KNAME.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/VEND_KNAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-VEND_KNAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-VEND_KNAME" name="VEND_KNAME" class="AA0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getVEND_KNAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td over-inner" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ZIP_CD",rb)%></span></div><script class="expj-script-AA0070010-AA0070010form2-ZIP_CD">
expj.AA0070010.AA0070010form2.ZIP_CD = {};
expj.AA0070010.AA0070010form2.ZIP_CD.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/ZIP_CD.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.ZIP_CD.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-ZIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'ZIP_CD', this);
  });
  expj.AA0070010.AA0070010form2.ZIP_CD.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.ZIP_CD.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/ZIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-ZIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-ZIP_CD" name="ZIP_CD" class="AA0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getZIP_CD()) %>" maxlength="25" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ADDRESS_1",rb)%></span><!-- 住所 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-ADDRESS_1">
expj.AA0070010.AA0070010form2.ADDRESS_1 = {};
expj.AA0070010.AA0070010form2.ADDRESS_1.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/ADDRESS_1.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.ADDRESS_1.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-ADDRESS_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'ADDRESS_1', this);
  });
  expj.AA0070010.AA0070010form2.ADDRESS_1.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.ADDRESS_1.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/ADDRESS_1.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-ADDRESS_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-ADDRESS_1" name="ADDRESS_1" class="AA0070010-focus-move  required-value expj-AA0070010-required-B" style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getADDRESS_1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_2",rb)%></span><!-- 住所 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-ADDRESS_2">
expj.AA0070010.AA0070010form2.ADDRESS_2 = {};
expj.AA0070010.AA0070010form2.ADDRESS_2.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/ADDRESS_2.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.ADDRESS_2.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-ADDRESS_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'ADDRESS_2', this);
  });
  expj.AA0070010.AA0070010form2.ADDRESS_2.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.ADDRESS_2.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/ADDRESS_2.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-ADDRESS_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-ADDRESS_2" name="ADDRESS_2" class="AA0070010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getADDRESS_2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_K_1",rb)%></span><!-- 住所(カナ)1 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-ADDRESS_K_1">
expj.AA0070010.AA0070010form2.ADDRESS_K_1 = {};
expj.AA0070010.AA0070010form2.ADDRESS_K_1.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/ADDRESS_K_1.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.ADDRESS_K_1.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-ADDRESS_K_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'ADDRESS_K_1', this);
  });
  expj.AA0070010.AA0070010form2.ADDRESS_K_1.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.ADDRESS_K_1.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/ADDRESS_K_1.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-ADDRESS_K_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-ADDRESS_K_1" name="ADDRESS_K_1" class="AA0070010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getADDRESS_K_1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_K_2",rb)%></span><!-- 住所(カナ)2 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-ADDRESS_K_2">
expj.AA0070010.AA0070010form2.ADDRESS_K_2 = {};
expj.AA0070010.AA0070010form2.ADDRESS_K_2.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/ADDRESS_K_2.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.ADDRESS_K_2.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-ADDRESS_K_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'ADDRESS_K_2', this);
  });
  expj.AA0070010.AA0070010form2.ADDRESS_K_2.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.ADDRESS_K_2.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/ADDRESS_K_2.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-ADDRESS_K_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-ADDRESS_K_2" name="ADDRESS_K_2" class="AA0070010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getADDRESS_K_2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TEL",rb)%></span><!-- 電話番号 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-TEL">
expj.AA0070010.AA0070010form2.TEL = {};
expj.AA0070010.AA0070010form2.TEL.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/TEL.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.TEL.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-TEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'TEL', this);
  });
  expj.AA0070010.AA0070010form2.TEL.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.TEL.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/TEL.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-TEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-TEL" name="TEL" class="AA0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getTEL()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.FAX",rb)%></span><!-- FAX番号 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-FAX">
expj.AA0070010.AA0070010form2.FAX = {};
expj.AA0070010.AA0070010form2.FAX.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/FAX.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.FAX.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-FAX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'FAX', this);
  });
  expj.AA0070010.AA0070010form2.FAX.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.FAX.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/FAX.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-FAX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-FAX" name="FAX" class="AA0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getFAX()) %>" maxlength="20" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EMAIL",rb)%></span><!-- メールアドレス --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-EMAIL">
expj.AA0070010.AA0070010form2.EMAIL = {};
expj.AA0070010.AA0070010form2.EMAIL.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/EMAIL.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.EMAIL.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-EMAIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'EMAIL', this);
  });
  expj.AA0070010.AA0070010form2.EMAIL.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.EMAIL.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/EMAIL.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-EMAIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-EMAIL" name="EMAIL" class="AA0070010-focus-move  " style="width:320px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getEMAIL()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_ORG",rb)%></span><!-- 相手先担当部門 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-VEND_ORG">
expj.AA0070010.AA0070010form2.VEND_ORG = {};
expj.AA0070010.AA0070010form2.VEND_ORG.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/VEND_ORG.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.VEND_ORG.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-VEND_ORG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'VEND_ORG', this);
  });
  expj.AA0070010.AA0070010form2.VEND_ORG.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.VEND_ORG.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/VEND_ORG.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-VEND_ORG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-VEND_ORG" name="VEND_ORG" class="AA0070010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getVEND_ORG()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_PERSON",rb)%></span><!-- 相手先担当者 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-VEND_PERSON">
expj.AA0070010.AA0070010form2.VEND_PERSON = {};
expj.AA0070010.AA0070010form2.VEND_PERSON.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/VEND_PERSON.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.VEND_PERSON.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-VEND_PERSON').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'VEND_PERSON', this);
  });
  expj.AA0070010.AA0070010form2.VEND_PERSON.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.VEND_PERSON.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/VEND_PERSON.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-VEND_PERSON');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-VEND_PERSON" name="VEND_PERSON" class="AA0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getVEND_PERSON()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OWN_ORG_CD_1",rb)%></span><!-- 担当部門コード --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-OWN_ORG_CD">
expj.AA0070010.AA0070010form2.OWN_ORG_CD = {};
expj.AA0070010.AA0070010form2.OWN_ORG_CD.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/OWN_ORG_CD.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.OWN_ORG_CD.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-OWN_ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'OWN_ORG_CD', this);
  });
  expj.AA0070010.AA0070010form2.OWN_ORG_CD.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.OWN_ORG_CD.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/OWN_ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-OWN_ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-OWN_ORG_CD" name="OWN_ORG_CD" class="AA0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getOWN_ORG_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OWN_ORG_NAME_1",rb)%></span><!-- 担当部門 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-OWN_ORG_NAME">
expj.AA0070010.AA0070010form2.OWN_ORG_NAME = {};
expj.AA0070010.AA0070010form2.OWN_ORG_NAME.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/OWN_ORG_NAME.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.OWN_ORG_NAME.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-OWN_ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'OWN_ORG_NAME', this);
  });
  expj.AA0070010.AA0070010form2.OWN_ORG_NAME.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.OWN_ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/OWN_ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-OWN_ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-OWN_ORG_NAME" name="OWN_ORG_NAME" class="AA0070010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getOWN_ORG_NAME()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OWN_PERSON_CD_1",rb)%></span><!-- 担当者コード --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-OWN_PERSON_CD">
expj.AA0070010.AA0070010form2.OWN_PERSON_CD = {};
expj.AA0070010.AA0070010form2.OWN_PERSON_CD.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/OWN_PERSON_CD.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.OWN_PERSON_CD.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-OWN_PERSON_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'OWN_PERSON_CD', this);
  });
  expj.AA0070010.AA0070010form2.OWN_PERSON_CD.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.OWN_PERSON_CD.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/OWN_PERSON_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-OWN_PERSON_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-OWN_PERSON_CD" name="OWN_PERSON_CD" class="AA0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getOWN_PERSON_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-PeekerOwnPersonCd">
expj.AA0070010.AA0070010form2.PeekerOwnPersonCd = {};
// script1="onClick;0;PEEKER;_AA0070010form2/OWN_PERSON_CD@<%=contextNo%>"
expj.AA0070010.AA0070010form2.PeekerOwnPersonCd.onClick0 = function () {
  console.log('PeekerOwnPersonCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0070010';
var parameterValues = 'PeekerOwnPersonCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form2', '_AA0070010form2/OWN_PERSON_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0070010form2/OWN_PERSON_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0070010.AA0070010form2.PeekerOwnPersonCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010form2.PeekerOwnPersonCd['onClick' + i])) {
        expj.AA0070010.AA0070010form2.PeekerOwnPersonCd['onClick' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010form2.PeekerOwnPersonCd.executeAllOnDecision = function () {
};
expj.AA0070010.AA0070010form2.PeekerOwnPersonCd.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-PeekerOwnPersonCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010form2', 'PeekerOwnPersonCd', this, 'Button');
    }
  });
  expj.AA0070010.AA0070010form2.PeekerOwnPersonCd.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.PeekerOwnPersonCd.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/PeekerOwnPersonCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-PeekerOwnPersonCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0070010-AA0070010form2-PeekerOwnPersonCd" class="AA0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-OWN_PERSON_NAME">
expj.AA0070010.AA0070010form2.OWN_PERSON_NAME = {};
expj.AA0070010.AA0070010form2.OWN_PERSON_NAME.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/OWN_PERSON_NAME.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.OWN_PERSON_NAME.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-OWN_PERSON_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'OWN_PERSON_NAME', this);
  });
  expj.AA0070010.AA0070010form2.OWN_PERSON_NAME.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.OWN_PERSON_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/OWN_PERSON_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-OWN_PERSON_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-OWN_PERSON_NAME" name="OWN_PERSON_NAME" class="AA0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getOWN_PERSON_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ROUND_TYP",rb)%></span><!-- 発注金額まるめ --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-ROUND_TYP">
expj.AA0070010.AA0070010form2.ROUND_TYP = {};
expj.AA0070010.AA0070010form2.ROUND_TYP.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/ROUND_TYP.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.ROUND_TYP.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-ROUND_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0070010', 'AA0070010form2', 'ROUND_TYP', this);
  });
  expj.AA0070010.AA0070010form2.ROUND_TYP.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.ROUND_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/ROUND_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-ROUND_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0070010-AA0070010form2-ROUND_TYP" name='ROUND_TYP' class='AA0070010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0070010Control.getStruct().getList_ROUND_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_ROUND_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_ROUND_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0070010Struct.getROUND_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TAX_CD_1",rb)%></span><!-- 消費税コード --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-TAX_CD">
expj.AA0070010.AA0070010form2.TAX_CD = {};
expj.AA0070010.AA0070010form2.TAX_CD.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/TAX_CD.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.TAX_CD.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'TAX_CD', this);
  });
  expj.AA0070010.AA0070010form2.TAX_CD.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.TAX_CD.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-TAX_CD" name="TAX_CD" class="AA0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getTAX_CD()) %>" maxlength="3" ></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-PeekerTaxCd">
expj.AA0070010.AA0070010form2.PeekerTaxCd = {};
// script1="onClick;0;PEEKER;_AA0070010form2/TAX_CD@<%=contextNo%>"
expj.AA0070010.AA0070010form2.PeekerTaxCd.onClick0 = function () {
  console.log('PeekerTaxCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0070010';
var parameterValues = 'PeekerTaxCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form2', '_AA0070010form2/TAX_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%TAX_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0070010form2/TAX_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0070010.AA0070010form2.PeekerTaxCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010form2.PeekerTaxCd['onClick' + i])) {
        expj.AA0070010.AA0070010form2.PeekerTaxCd['onClick' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010form2.PeekerTaxCd.executeAllOnDecision = function () {
};
expj.AA0070010.AA0070010form2.PeekerTaxCd.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-PeekerTaxCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010form2', 'PeekerTaxCd', this, 'Button');
    }
  });
  expj.AA0070010.AA0070010form2.PeekerTaxCd.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.PeekerTaxCd.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/PeekerTaxCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-PeekerTaxCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0070010-AA0070010form2-PeekerTaxCd" class="AA0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TAX_APPLY_TYP",rb)%></span><!-- 消費税適用区分 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-TAX_APPLY_TYP">
expj.AA0070010.AA0070010form2.TAX_APPLY_TYP = {};
expj.AA0070010.AA0070010form2.TAX_APPLY_TYP.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/TAX_APPLY_TYP.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.TAX_APPLY_TYP.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-TAX_APPLY_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0070010', 'AA0070010form2', 'TAX_APPLY_TYP', this);
  });
  expj.AA0070010.AA0070010form2.TAX_APPLY_TYP.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.TAX_APPLY_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/TAX_APPLY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-TAX_APPLY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0070010-AA0070010form2-TAX_APPLY_TYP" name='TAX_APPLY_TYP' class='AA0070010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0070010Control.getStruct().getList_TAX_APPLY_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_TAX_APPLY_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_TAX_APPLY_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0070010Struct.getTAX_APPLY_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TAX_CALC_TYP",rb)%></span><!-- 消費税計算区分 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-TAX_CALC_TYP">
expj.AA0070010.AA0070010form2.TAX_CALC_TYP = {};
expj.AA0070010.AA0070010form2.TAX_CALC_TYP.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/TAX_CALC_TYP.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.TAX_CALC_TYP.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-TAX_CALC_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0070010', 'AA0070010form2', 'TAX_CALC_TYP', this);
  });
  expj.AA0070010.AA0070010form2.TAX_CALC_TYP.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.TAX_CALC_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/TAX_CALC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-TAX_CALC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0070010-AA0070010form2-TAX_CALC_TYP" name='TAX_CALC_TYP' class='AA0070010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0070010Control.getStruct().getList_TAX_CALC_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_TAX_CALC_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_TAX_CALC_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0070010Struct.getTAX_CALC_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INSPC_ACPT_APP_TYP",rb)%></span><!-- 検収計上区分 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-INSPC_ACPT_APP_TYP">
expj.AA0070010.AA0070010form2.INSPC_ACPT_APP_TYP = {};
expj.AA0070010.AA0070010form2.INSPC_ACPT_APP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/INSPC_ACPT_APP_TYP.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.INSPC_ACPT_APP_TYP.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-INSPC_ACPT_APP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0070010', 'AA0070010form2', 'INSPC_ACPT_APP_TYP', this);
  });
  expj.AA0070010.AA0070010form2.INSPC_ACPT_APP_TYP.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.INSPC_ACPT_APP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/INSPC_ACPT_APP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-INSPC_ACPT_APP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0070010-AA0070010form2-INSPC_ACPT_APP_TYP" name='INSPC_ACPT_APP_TYP' class='AA0070010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0070010Control.getStruct().getList_INSPC_ACPT_APP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_INSPC_ACPT_APP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_INSPC_ACPT_APP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0070010Struct.getINSPC_ACPT_APP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0429",rb)%></span><!-- 発注情報 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-ODR_FORM_FLG">
expj.AA0070010.AA0070010form2.ODR_FORM_FLG = {};
expj.AA0070010.AA0070010form2.ODR_FORM_FLG.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/ODR_FORM_FLG.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.ODR_FORM_FLG.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-ODR_FORM_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010form2', 'ODR_FORM_FLG', this, 'CheckBox');
    }
  });
  expj.AA0070010.AA0070010form2.ODR_FORM_FLG.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.ODR_FORM_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/ODR_FORM_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-ODR_FORM_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="ODR_FORM_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAA0070010Struct.getODR_FORM_FLG())) || "1".equals(TypeConverter.convert(aAA0070010Struct.getODR_FORM_FLG())))?"checked=\"checked\"":"" %>  class="AA0070010-focus-move" id="expj-AA0070010-AA0070010form2-ODR_FORM_FLG"><label for="expj-AA0070010-AA0070010form2-ODR_FORM_FLG"><%=CoreTools.getRBString("Expj.Cmt0422",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0070010-AA0070010form2-ODR_FAX_FLG" name="ODR_FAX_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getODR_FAX_FLG()) %>">
<script class="expj-script-AA0070010-AA0070010form2-ODR_FAX_FLG">
expj.AA0070010.AA0070010form2.ODR_FAX_FLG = {};
expj.AA0070010.AA0070010form2.ODR_FAX_FLG.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/ODR_FAX_FLG.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.ODR_FAX_FLG.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-ODR_FAX_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'ODR_FAX_FLG', this);
  });
  expj.AA0070010.AA0070010form2.ODR_FAX_FLG.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.ODR_FAX_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/ODR_FAX_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-ODR_FAX_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-ODR_EDI_FLG">
expj.AA0070010.AA0070010form2.ODR_EDI_FLG = {};
expj.AA0070010.AA0070010form2.ODR_EDI_FLG.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/ODR_EDI_FLG.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.ODR_EDI_FLG.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-ODR_EDI_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010form2', 'ODR_EDI_FLG', this, 'CheckBox');
    }
  });
  expj.AA0070010.AA0070010form2.ODR_EDI_FLG.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.ODR_EDI_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/ODR_EDI_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-ODR_EDI_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="ODR_EDI_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAA0070010Struct.getODR_EDI_FLG())) || "1".equals(TypeConverter.convert(aAA0070010Struct.getODR_EDI_FLG())))?"checked=\"checked\"":"" %>  class="AA0070010-focus-move" id="expj-AA0070010-AA0070010form2-ODR_EDI_FLG"><label for="expj-AA0070010-AA0070010form2-ODR_EDI_FLG"><%=CoreTools.getRBString("Expj.Cmt0415",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0070010-AA0070010form2-ODR_MAIL_FLG" name="ODR_MAIL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getODR_MAIL_FLG()) %>">
<script class="expj-script-AA0070010-AA0070010form2-ODR_MAIL_FLG">
expj.AA0070010.AA0070010form2.ODR_MAIL_FLG = {};
expj.AA0070010.AA0070010form2.ODR_MAIL_FLG.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/ODR_MAIL_FLG.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.ODR_MAIL_FLG.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-ODR_MAIL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'ODR_MAIL_FLG', this);
  });
  expj.AA0070010.AA0070010form2.ODR_MAIL_FLG.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.ODR_MAIL_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/ODR_MAIL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-ODR_MAIL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_REM",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-VEND_REM">
expj.AA0070010.AA0070010form2.VEND_REM = {};
expj.AA0070010.AA0070010form2.VEND_REM.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/VEND_REM.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.VEND_REM.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-VEND_REM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'VEND_REM', this);
  });
  expj.AA0070010.AA0070010form2.VEND_REM.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.VEND_REM.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/VEND_REM.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-VEND_REM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-VEND_REM" name="VEND_REM" class="AA0070010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getVEND_REM()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUR_CD",rb)%></span><!-- 通貨コード --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-CUR_CD">
expj.AA0070010.AA0070010form2.CUR_CD = {};
expj.AA0070010.AA0070010form2.CUR_CD.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/CUR_CD.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.CUR_CD.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'CUR_CD', this);
  });
  expj.AA0070010.AA0070010form2.CUR_CD.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-CUR_CD" name="CUR_CD" class="AA0070010-focus-move  required-value expj-AA0070010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getCUR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-PeekerCurCd">
expj.AA0070010.AA0070010form2.PeekerCurCd = {};
// script1="onClick;0;PEEKER;_AA0070010form2/CUR_CD@<%=contextNo%>"
expj.AA0070010.AA0070010form2.PeekerCurCd.onClick0 = function () {
  console.log('PeekerCurCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0070010';
var parameterValues = 'PeekerCurCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010form2', '_AA0070010form2/CUR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUR_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0070010form2/CUR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0070010.AA0070010form2.PeekerCurCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010form2.PeekerCurCd['onClick' + i])) {
        expj.AA0070010.AA0070010form2.PeekerCurCd['onClick' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010form2.PeekerCurCd.executeAllOnDecision = function () {
};
expj.AA0070010.AA0070010form2.PeekerCurCd.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-PeekerCurCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010form2', 'PeekerCurCd', this, 'Button');
    }
  });
  expj.AA0070010.AA0070010form2.PeekerCurCd.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.PeekerCurCd.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/PeekerCurCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-PeekerCurCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0070010-AA0070010form2-PeekerCurCd" class="AA0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-CUR_NAME">
expj.AA0070010.AA0070010form2.CUR_NAME = {};
expj.AA0070010.AA0070010form2.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/CUR_NAME.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.CUR_NAME.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'CUR_NAME', this);
  });
  expj.AA0070010.AA0070010form2.CUR_NAME.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-CUR_NAME" name="CUR_NAME" class="AA0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getCUR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EXCH_TYP",rb)%></span><!-- 為替種別 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-EXCH_TYP">
expj.AA0070010.AA0070010form2.EXCH_TYP = {};
expj.AA0070010.AA0070010form2.EXCH_TYP.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/EXCH_TYP.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.EXCH_TYP.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-EXCH_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0070010', 'AA0070010form2', 'EXCH_TYP', this);
  });
  expj.AA0070010.AA0070010form2.EXCH_TYP.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.EXCH_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/EXCH_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-EXCH_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0070010-AA0070010form2-EXCH_TYP" name='EXCH_TYP' class='AA0070010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0070010Control.getStruct().getList_EXCH_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_EXCH_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_EXCH_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0070010Struct.getEXCH_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.IMPORT_TRN_TYP",rb)%></span><!-- 輸入取引区分 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-IMPORT_TRN_TYP">
expj.AA0070010.AA0070010form2.IMPORT_TRN_TYP = {};
expj.AA0070010.AA0070010form2.IMPORT_TRN_TYP.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/IMPORT_TRN_TYP.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.IMPORT_TRN_TYP.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-IMPORT_TRN_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0070010', 'AA0070010form2', 'IMPORT_TRN_TYP', this);
  });
  expj.AA0070010.AA0070010form2.IMPORT_TRN_TYP.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.IMPORT_TRN_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/IMPORT_TRN_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-IMPORT_TRN_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0070010-AA0070010form2-IMPORT_TRN_TYP" name='IMPORT_TRN_TYP' class='AA0070010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0070010Control.getStruct().getList_IMPORT_TRN_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_IMPORT_TRN_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0070010Control.getStruct().getList_IMPORT_TRN_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0070010Struct.getIMPORT_TRN_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010form2-APPR_REMARKS">
expj.AA0070010.AA0070010form2.APPR_REMARKS = {};
expj.AA0070010.AA0070010form2.APPR_REMARKS.executeAllOnDecision = function () {
  console.log('execute AA0070010form2/APPR_REMARKS.onDecision');
  expj.AA0070010.AA0070010form2.executeAllOnDecision();
  expj.AA0070010.executeAllOnDecision();
};
expj.AA0070010.AA0070010form2.APPR_REMARKS.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010form2-APPR_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0070010', 'AA0070010form2', 'APPR_REMARKS', this);
  });
  expj.AA0070010.AA0070010form2.APPR_REMARKS.executePScriptOnLoad();
};

expj.AA0070010.AA0070010form2.APPR_REMARKS.executePScriptOnLoad = function () {
  console.log('execute AA0070010form2/APPR_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010form2-APPR_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0070010-AA0070010form2-APPR_REMARKS" name="APPR_REMARKS" class="AA0070010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0070010Struct.getAPPR_REMARKS()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AA0070010-AA0070010button2">
expj.AA0070010.AA0070010button2 = {};
expj.AA0070010.AA0070010button2.executeAllOnDecision = function () {
  console.log('execute AA0070010button2.onDecision');
};
expj.AA0070010.AA0070010button2.executeOnLoad = function () {
  expj.AA0070010.AA0070010button2.executePScriptOnLoad();
};

expj.AA0070010.AA0070010button2.executePScriptOnLoad = function () {
  console.log('execute AA0070010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0070010-AA0070010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0070010-AA0070010button2-insert">
expj.AA0070010.AA0070010button2.insert = {};
// script1="onClick;0;CHK;_AA0070010form2/TAX_APPLY_TYP[numeq]2[and]_AA0070010form2/TAX_CD[eq]@#AA00157"
expj.AA0070010.AA0070010button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010button2', '_AA0070010form2/TAX_APPLY_TYP')), '[numeq]', expj.common.pscript.convertNumber('2')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010button2', '_AA0070010form2/TAX_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AA0070010', 'AA0070010button2', 'AA00157');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0070010form1/*,_AA0070010form2/*@AA0070010Servlet,,$ZZ07001"
expj.AA0070010.AA0070010button2.insert.onClick1 = function () {
  console.log('insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0070010', 'AA0070010button2', '_AA0070010form1/*,_AA0070010form2/*', 'AA0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0070010', response);
expj.common.updateBusinessScreenTab('AA0070010', contents);
};
expj.common.pscript.callConfirm('AA0070010', 'AA0070010button2', 'ZZ07001', okEvent);
};
expj.AA0070010.AA0070010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010button2.insert['onClick' + i])) {
        expj.AA0070010.AA0070010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010button2.insert.executeAllOnDecision = function () {
};
expj.AA0070010.AA0070010button2.insert.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010button2', 'insert', this, 'Button');
    }
  });
  expj.AA0070010.AA0070010button2.insert.executePScriptOnLoad();
};

expj.AA0070010.AA0070010button2.insert.executePScriptOnLoad = function () {
  console.log('execute AA0070010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0070010-AA0070010button2-insert" name="insert" class="AA0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010button2-update">
expj.AA0070010.AA0070010button2.update = {};
// script1="onClick;0;CHK;_AA0070010form2/TAX_APPLY_TYP[numeq]2[and]_AA0070010form2/TAX_CD[eq]@#AA00157"
expj.AA0070010.AA0070010button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010button2', '_AA0070010form2/TAX_APPLY_TYP')), '[numeq]', expj.common.pscript.convertNumber('2')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0070010', 'AA0070010button2', '_AA0070010form2/TAX_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AA0070010', 'AA0070010button2', 'AA00157');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0070010form1/*,_AA0070010form2/*@AA0070010Servlet,,$ZZ07003"
expj.AA0070010.AA0070010button2.update.onClick1 = function () {
  console.log('update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0070010', 'AA0070010button2', '_AA0070010form1/*,_AA0070010form2/*', 'AA0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0070010', response);
expj.common.updateBusinessScreenTab('AA0070010', contents);
};
expj.common.pscript.callConfirm('AA0070010', 'AA0070010button2', 'ZZ07003', okEvent);
};
expj.AA0070010.AA0070010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010button2.update['onClick' + i])) {
        expj.AA0070010.AA0070010button2.update['onClick' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010button2.update.executeAllOnDecision = function () {
};
expj.AA0070010.AA0070010button2.update.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010button2', 'update', this, 'Button');
    }
  });
  expj.AA0070010.AA0070010button2.update.executePScriptOnLoad();
};

expj.AA0070010.AA0070010button2.update.executePScriptOnLoad = function () {
  console.log('execute AA0070010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0070010-AA0070010button2-update" name="update" class="AA0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010button2-delete">
expj.AA0070010.AA0070010button2.delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0070010form1/*,_AA0070010form2/*@AA0070010Servlet,,$ZZ07004"
expj.AA0070010.AA0070010button2.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0070010', 'AA0070010button2', '_AA0070010form1/*,_AA0070010form2/*', 'AA0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0070010', response);
expj.common.updateBusinessScreenTab('AA0070010', contents);
};
expj.common.pscript.callConfirm('AA0070010', 'AA0070010button2', 'ZZ07004', okEvent);
};
expj.AA0070010.AA0070010button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010button2.delete['onClick' + i])) {
        expj.AA0070010.AA0070010button2.delete['onClick' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010button2.delete.executeAllOnDecision = function () {
};
expj.AA0070010.AA0070010button2.delete.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010button2', 'delete', this, 'Button');
    }
  });
  expj.AA0070010.AA0070010button2.delete.executePScriptOnLoad();
};

expj.AA0070010.AA0070010button2.delete.executePScriptOnLoad = function () {
  console.log('execute AA0070010button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0070010-AA0070010button2-delete" name="delete" class="AA0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0070010 Revision: 1.12  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0070010-AA0070010button0">
expj.AA0070010.AA0070010button0 = {};
expj.AA0070010.AA0070010button0.executeAllOnDecision = function () {
  console.log('execute AA0070010button0.onDecision');
};
expj.AA0070010.AA0070010button0.executeOnLoad = function () {
  expj.AA0070010.AA0070010button0.executePScriptOnLoad();
};

expj.AA0070010.AA0070010button0.executePScriptOnLoad = function () {
  console.log('execute AA0070010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0070010-AA0070010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0070010-AA0070010button0-clear">
expj.AA0070010.AA0070010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0070010Servlet,,$ZZ07008"
expj.AA0070010.AA0070010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0070010', 'AA0070010button0', '', 'AA0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0070010', response);
expj.common.updateBusinessScreenTab('AA0070010', contents);
};
expj.common.pscript.callConfirm('AA0070010', 'AA0070010button0', 'ZZ07008', okEvent);
};
expj.AA0070010.AA0070010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010button0.clear['onClick' + i])) {
        expj.AA0070010.AA0070010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010button0.clear.executeAllOnDecision = function () {
};
expj.AA0070010.AA0070010button0.clear.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010button0', 'clear', this, 'Button');
    }
  });
  expj.AA0070010.AA0070010button0.clear.executePScriptOnLoad();
};

expj.AA0070010.AA0070010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0070010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0070010-AA0070010button0-clear" name="clear" class="AA0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0070010-AA0070010button0-close">
expj.AA0070010.AA0070010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0070010.AA0070010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0070010');
};
expj.AA0070010.AA0070010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0070010.AA0070010button0.close['onClick' + i])) {
        expj.AA0070010.AA0070010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0070010.AA0070010button0.close.executeAllOnDecision = function () {
};
expj.AA0070010.AA0070010button0.close.executeOnLoad = function () {
  $('#expj-AA0070010-AA0070010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0070010', 'AA0070010button0', 'close', this, 'Button');
    }
  });
  expj.AA0070010.AA0070010button0.close.executePScriptOnLoad();
};

expj.AA0070010.AA0070010button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0070010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0070010-AA0070010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0070010-AA0070010button0-close" name="close" class="AA0070010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0070010 (END)-->
<%
MessageStruct msgStruct = aAA0070010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0070010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0070010)) {
  expj.common.treeInstanceMap.AA0070010 = {};
}
expj.common.treeInstanceMap.AA0070010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0070010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0070010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0070010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0070010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0070010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0070010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0070010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0070010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0070010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0070010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0070010)) {
  expj.common.detailDialogMap.AA0070010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0070010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0070010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0070010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0070010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0070010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0070010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0070010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0070010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0070010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0070010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0070010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0070010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0070010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0070010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0070010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0070010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0070010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0070010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0070010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0070010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0070010)) {
  expj.common.viewInstanceMap.AA0070010 = {};
}
expj.common.viewInstanceMap.AA0070010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0070010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0070010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0070010.<%=viewId %>.init = function () {
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
    expj.AA0070010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0070010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0070010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0070010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0070010_init">
/**
 * AA0070010用のロード完了時初期化関数
 */
expj.AA0070010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0070010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0070010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0070010');
  expj.common.calendarInstanceMap.AA0070010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0070010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0070010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0070010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0070010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0070010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0070010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0070010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0070010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0070010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0070010.AA0070010form1.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form1.h_VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form1.h_APR_VEND_CTRL.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form1.h_SCREENMOVE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form1.h_APPR_ID.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.VEND_ANAME.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.VEND_KNAME.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.ZIP_CD.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.ADDRESS_1.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.ADDRESS_2.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.ADDRESS_K_1.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.ADDRESS_K_2.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.TEL.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.FAX.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.EMAIL.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.VEND_ORG.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.VEND_PERSON.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.OWN_ORG_CD.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.OWN_ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.OWN_PERSON_CD.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.PeekerOwnPersonCd.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.OWN_PERSON_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.ROUND_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.TAX_CD.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.PeekerTaxCd.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.TAX_APPLY_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.TAX_CALC_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.INSPC_ACPT_APP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.ODR_FORM_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.ODR_FAX_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.ODR_EDI_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.ODR_MAIL_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.VEND_REM.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.PeekerCurCd.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.EXCH_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.IMPORT_TRN_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.APPR_REMARKS.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010button2.insert.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010button2.update.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010button2.delete.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form1.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010button1.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010form2.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010button2.executeOnLoad();}catch(e){};
  try{expj.AA0070010.AA0070010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0070010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0070010', 'AA0070010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0070010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0070010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0070010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0070010', '<%=request.getContextPath() %>');
};

/**
 * AA0070010の全体onDecision処理
 */
expj.AA0070010.executeAllOnDecision = function () {
  expj.AA0070010.AA0070010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0070010_console">
expj.AA0070010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>