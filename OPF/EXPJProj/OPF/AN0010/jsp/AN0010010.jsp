<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:46:03 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AN0010\AN0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AN0010.*" %>
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
<jsp:useBean id="aAN0010010Control" class="com.nec.jp.orteus.metamorBase.AN0010.AN0010010Control" scope="request"/>
<jsp:useBean id="aAN0010010Struct" class="com.nec.jp.orteus.metamorBase.AN0010.AN0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

業務ロックパラメータメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0010/jsp/AN0010010.jsp,v $
$Author: geng-jia $
$Revision: 1.8 $ $Date: 2017/02/22 02:06:21 $
********************************************************* --%>
<html>
<head>
<title>業務ロックパラメータメンテナンス</title>
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
<script class="expj-script-AN0010010_init">
  // AN0010010名前空間
  expj.AN0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AN0010010" data-screen="AN0010010" data-newdata="<%=aAN0010010Control.isNewData() %>">
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
              <script class="expj-script-AN0010010-AN0010010form1">
expj.AN0010010.AN0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AN0010010.AN0010010form1.onLoad0 = function () {
  console.log('AN0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AN0010010.AN0010010form1.onDecision0 = function () {
  console.log('AN0010010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AN0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AN0010010button1/Select"
expj.AN0010010.AN0010010form1.child0 = function () {
  console.log('AN0010010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AN0010010', 'AN0010010form1', '_AN0010010button1/Select');
};
// script4="child;1;MASK;_AN0010010button1/Select"
expj.AN0010010.AN0010010form1.child1 = function () {
  console.log('AN0010010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AN0010010', 'AN0010010form1', '_AN0010010button1/Select');
};
// script5="onDecision;1;CHKRQ;A@*2,*5"
expj.AN0010010.AN0010010form1.onDecision1 = function () {
  console.log('AN0010010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AN0010010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;2;CHK;?AN0010010view1/*[eq]NORMAL@*3,*5"
expj.AN0010010.AN0010010form1.child2 = function () {
  console.log('AN0010010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010form1', '?AN0010010view1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHK;_AN0010010form1/h_ExistSysBusinessLock[eq]false[or]_AN0010010form1/PROGRAM_CD[neq]_AN0010010form1/h_PROGRAM_CD@*4,*5"
expj.AN0010010.AN0010010form1.child3 = function () {
  console.log('AN0010010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010form1', '_AN0010010form1/h_ExistSysBusinessLock'), '[eq]', 'false') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010form1', '_AN0010010form1/PROGRAM_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010form1', '_AN0010010form1/h_PROGRAM_CD'))) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AN0010010button2/Insert"
expj.AN0010010.AN0010010form1.child4 = function () {
  console.log('AN0010010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AN0010010', 'AN0010010form1', '_AN0010010button2/Insert');
};
// script9="child;5;MASK;_AN0010010button2/Insert"
expj.AN0010010.AN0010010form1.child5 = function () {
  console.log('AN0010010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AN0010010', 'AN0010010form1', '_AN0010010button2/Insert');
};
// script10="onDecision;2;CHK;?AN0010010view1/*[eq]NORMAL[and]_AN0010010form1/h_ExistSysBusinessLock[eq]true[and]_AN0010010form1/PROGRAM_CD[eq]_AN0010010form1/h_PROGRAM_CD@*6,*7"
expj.AN0010010.AN0010010form1.onDecision2 = function () {
  console.log('AN0010010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010form1', '?AN0010010view1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010form1', '_AN0010010form1/h_ExistSysBusinessLock'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010form1', '_AN0010010form1/PROGRAM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010form1', '_AN0010010form1/h_PROGRAM_CD'))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_AN0010010button2/Update"
expj.AN0010010.AN0010010form1.child6 = function () {
  console.log('AN0010010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AN0010010', 'AN0010010form1', '_AN0010010button2/Update');
};
// script12="child;7;MASK;_AN0010010button2/Update"
expj.AN0010010.AN0010010form1.child7 = function () {
  console.log('AN0010010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AN0010010', 'AN0010010form1', '_AN0010010button2/Update');
};
expj.AN0010010.AN0010010form1.executeAllOnDecision = function () {
  console.log('execute AN0010010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0010010.AN0010010form1['onDecision' + i])) {
        expj.AN0010010.AN0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.AN0010010.AN0010010form1.executeOnLoad = function () {
  expj.AN0010010.AN0010010form1.executePScriptOnLoad();
};

expj.AN0010010.AN0010010form1.executePScriptOnLoad = function () {
  console.log('execute AN0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AN0010010.AN0010010form1['onLoad' + i])) {
      expj.AN0010010.AN0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AN0010010-AN0010010form1" action="AN0010010Servlet" name="AN0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.MODE_FORM_FROM_NAME",rb)%></span><!-- 業務ロック元名 --></div><!--/td-->
<script class="expj-script-AN0010010-AN0010010form1-PROGRAM_CD">
expj.AN0010010.AN0010010form1.PROGRAM_CD = {};
expj.AN0010010.AN0010010form1.PROGRAM_CD.executeAllOnDecision = function () {
  console.log('execute AN0010010form1/PROGRAM_CD.onDecision');
  expj.AN0010010.AN0010010form1.executeAllOnDecision();
  expj.AN0010010.executeAllOnDecision();
};
expj.AN0010010.AN0010010form1.PROGRAM_CD.executeOnLoad = function () {
  $('#expj-AN0010010-AN0010010form1-PROGRAM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0010010', 'AN0010010form1', 'PROGRAM_CD', this);
  });
  expj.AN0010010.AN0010010form1.PROGRAM_CD.executePScriptOnLoad();
};

expj.AN0010010.AN0010010form1.PROGRAM_CD.executePScriptOnLoad = function () {
  console.log('execute AN0010010form1/PROGRAM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AN0010010-AN0010010form1-PROGRAM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AN0010010-AN0010010form1-PROGRAM_CD" name="PROGRAM_CD" class="AN0010010-focus-move  required-value expj-AN0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAN0010010Struct.getPROGRAM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AN0010010-AN0010010form1-h_PROGRAM_CD" name="h_PROGRAM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAN0010010Struct.geth_PROGRAM_CD()) %>">
<script class="expj-script-AN0010010-AN0010010form1-h_PROGRAM_CD">
expj.AN0010010.AN0010010form1.h_PROGRAM_CD = {};
expj.AN0010010.AN0010010form1.h_PROGRAM_CD.executeAllOnDecision = function () {
  console.log('execute AN0010010form1/h_PROGRAM_CD.onDecision');
  expj.AN0010010.AN0010010form1.executeAllOnDecision();
  expj.AN0010010.executeAllOnDecision();
};
expj.AN0010010.AN0010010form1.h_PROGRAM_CD.executeOnLoad = function () {
  $('#expj-AN0010010-AN0010010form1-h_PROGRAM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0010010', 'AN0010010form1', 'h_PROGRAM_CD', this);
  });
  expj.AN0010010.AN0010010form1.h_PROGRAM_CD.executePScriptOnLoad();
};

expj.AN0010010.AN0010010form1.h_PROGRAM_CD.executePScriptOnLoad = function () {
  console.log('execute AN0010010form1/h_PROGRAM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AN0010010-AN0010010form1-h_PROGRAM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AN0010010-AN0010010form1-PeekerProgramCd">
expj.AN0010010.AN0010010form1.PeekerProgramCd = {};
// script1="onClick;0;PEEKER;_AN0010010form1/PROGRAM_CD@<%=contextNo%>"
expj.AN0010010.AN0010010form1.PeekerProgramCd.onClick0 = function () {
  console.log('PeekerProgramCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AN0010010';
var parameterValues = 'PeekerProgramCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010form1', '_PROGRAM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROGRAM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AN0010010form1/PROGRAM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AN0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AN0010010.AN0010010form1.PeekerProgramCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0010010.AN0010010form1.PeekerProgramCd['onClick' + i])) {
        expj.AN0010010.AN0010010form1.PeekerProgramCd['onClick' + i]();
      }
    }
  }
};
expj.AN0010010.AN0010010form1.PeekerProgramCd.executeAllOnDecision = function () {
};
expj.AN0010010.AN0010010form1.PeekerProgramCd.executeOnLoad = function () {
  $('#expj-AN0010010-AN0010010form1-PeekerProgramCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0010010', 'AN0010010form1', 'PeekerProgramCd', this, 'Button');
    }
  });
  expj.AN0010010.AN0010010form1.PeekerProgramCd.executePScriptOnLoad();
};

expj.AN0010010.AN0010010form1.PeekerProgramCd.executePScriptOnLoad = function () {
  console.log('execute AN0010010form1/PeekerProgramCd.onLoad');
  var targetComponent = document.getElementById('expj-AN0010010-AN0010010form1-PeekerProgramCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AN0010010-AN0010010form1-PeekerProgramCd" class="AN0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AN0010010-AN0010010form1-PROGRAM_NAME">
expj.AN0010010.AN0010010form1.PROGRAM_NAME = {};
expj.AN0010010.AN0010010form1.PROGRAM_NAME.executeAllOnDecision = function () {
  console.log('execute AN0010010form1/PROGRAM_NAME.onDecision');
  expj.AN0010010.AN0010010form1.executeAllOnDecision();
  expj.AN0010010.executeAllOnDecision();
};
expj.AN0010010.AN0010010form1.PROGRAM_NAME.executeOnLoad = function () {
  $('#expj-AN0010010-AN0010010form1-PROGRAM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0010010', 'AN0010010form1', 'PROGRAM_NAME', this);
  });
  expj.AN0010010.AN0010010form1.PROGRAM_NAME.executePScriptOnLoad();
};

expj.AN0010010.AN0010010form1.PROGRAM_NAME.executePScriptOnLoad = function () {
  console.log('execute AN0010010form1/PROGRAM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AN0010010-AN0010010form1-PROGRAM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AN0010010-AN0010010form1-PROGRAM_NAME" name="PROGRAM_NAME" class="AN0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAN0010010Struct.getPROGRAM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AN0010010-AN0010010form1-h_ExistSysBusinessLock" name="h_ExistSysBusinessLock" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAN0010010Struct.geth_ExistSysBusinessLock()) %>">
<script class="expj-script-AN0010010-AN0010010form1-h_ExistSysBusinessLock">
expj.AN0010010.AN0010010form1.h_ExistSysBusinessLock = {};
expj.AN0010010.AN0010010form1.h_ExistSysBusinessLock.executeAllOnDecision = function () {
  console.log('execute AN0010010form1/h_ExistSysBusinessLock.onDecision');
  expj.AN0010010.AN0010010form1.executeAllOnDecision();
  expj.AN0010010.executeAllOnDecision();
};
expj.AN0010010.AN0010010form1.h_ExistSysBusinessLock.executeOnLoad = function () {
  $('#expj-AN0010010-AN0010010form1-h_ExistSysBusinessLock').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0010010', 'AN0010010form1', 'h_ExistSysBusinessLock', this);
  });
  expj.AN0010010.AN0010010form1.h_ExistSysBusinessLock.executePScriptOnLoad();
};

expj.AN0010010.AN0010010form1.h_ExistSysBusinessLock.executePScriptOnLoad = function () {
  console.log('execute AN0010010form1/h_ExistSysBusinessLock.onLoad');
  var targetComponent = document.getElementById('expj-AN0010010-AN0010010form1-h_ExistSysBusinessLock');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AN0010010-AN0010010button1">
expj.AN0010010.AN0010010button1 = {};
expj.AN0010010.AN0010010button1.executeAllOnDecision = function () {
  console.log('execute AN0010010button1.onDecision');
};
expj.AN0010010.AN0010010button1.executeOnLoad = function () {
  expj.AN0010010.AN0010010button1.executePScriptOnLoad();
};

expj.AN0010010.AN0010010button1.executePScriptOnLoad = function () {
  console.log('execute AN0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0010010-AN0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0010010-AN0010010button1-Select">
expj.AN0010010.AN0010010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0010010form1/*@AN0010010Servlet"
expj.AN0010010.AN0010010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0010010', 'AN0010010button1', '_AN0010010form1/*', 'AN0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0010010', response);
expj.common.updateBusinessScreenTab('AN0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AN0010010.AN0010010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0010010.AN0010010button1.Select['onClick' + i])) {
        expj.AN0010010.AN0010010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AN0010010.AN0010010button1.Select.executeAllOnDecision = function () {
};
expj.AN0010010.AN0010010button1.Select.executeOnLoad = function () {
  $('#expj-AN0010010-AN0010010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0010010', 'AN0010010button1', 'Select', this, 'Button');
    }
  });
  expj.AN0010010.AN0010010button1.Select.executePScriptOnLoad();
};

expj.AN0010010.AN0010010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AN0010010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AN0010010-AN0010010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0010010-AN0010010button1-Select" name="Select" class="AN0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AN0010010-AN0010010view1">
expj.AN0010010.AN0010010view1 = {};
expj.AN0010010.AN0010010view1.executeAllOnClick = function () {
};
expj.AN0010010.AN0010010view1.executeAllOnDecision = function () {
  console.log('execute AN0010010view1.onDecision');
};
expj.AN0010010.AN0010010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AN0010010view1", "expj.AN0010010.AN0010010view1.executeAllOnClick");
%>
  expj.AN0010010.AN0010010view1.executePScriptOnLoad();
};

expj.AN0010010.AN0010010view1.executePScriptOnLoad = function () {
  console.log('execute AN0010010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AN0010010-AN0010010view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAN0010010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AN0010010view1_Id = "AN0010010view1";
 String AN0010010view1_select = "single";
 String AN0010010view1_sortable = "true";
 String AN0010010view1_resize = "true";
 String AN0010010view1_scroll = "true";
 StringBuffer AN0010010view1_HB = new StringBuffer();
 StringBuffer AN0010010view1_DB = new StringBuffer();
%>
<%
 AN0010010view1_select = "none";
 AN0010010view1_sortable = "false";
 AN0010010view1_resize = "true";
 AN0010010view1_scroll = "true";
%>
<%
 AN0010010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AN0010010view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AN0010010-AN0010010view1-TARGET_PLANT_TYP">
expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP.onDecision0 = function () {
  console.log('TARGET_PLANT_TYP script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010view1', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_h_CHANGEABLE_TYP[eq]1@*1"
expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP.child0 = function () {
  console.log('TARGET_PLANT_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0010010', 'AN0010010view1', '_h_CHANGEABLE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;CFMPUT;_AN0010010view1/TARGET_PLANT_TYP=NO@AN01001"
expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP.child1 = function () {
  console.log('TARGET_PLANT_TYP script3');
var yesFunc = function () {
};
var noFunc = function () {
expj.common.pscript.backInputValue('AN0010010', 'AN0010010view1', '_AN0010010view1/TARGET_PLANT_TYP');
};
expj.common.pscript.executeConfirmPut('AN0010010', 'AN0010010view1', '_AN0010010view1/TARGET_PLANT_TYP', 'AN01001', yesFunc, noFunc);
};
expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP.executeAllOnClick = function () {
};
expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP.executeAllOnDecision = function () {
  console.log('execute AN0010010view1/TARGET_PLANT_TYP.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP['onDecision' + i])) {
        expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP['onDecision' + i]();
      }
    }
  }
  expj.AN0010010.AN0010010view1.executeAllOnDecision();
  expj.AN0010010.executeAllOnDecision();
};
expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP.executeOnLoad = function () {
  $('.expj-AN0010010-AN0010010view1-TARGET_PLANT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AN0010010', 'AN0010010view1', 'TARGET_PLANT_TYP', this);
  });
  expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP.executePScriptOnLoad();
};

expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP.executePScriptOnLoad = function () {
  console.log('execute AN0010010view1/TARGET_PLANT_TYP.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AN0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_TARGET_PLANT_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0010010view1_sortable).append("}").append(",");
AN0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_TARGET_PLANT_TYP2', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0010010view1_sortable).append("}").append(",");
AN0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_CHANGEABLE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0010010view1_sortable).append("}").append(",");
AN0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0010010view1_sortable).append("}").append(",");
AN0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT2', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0010010view1_sortable).append("}").append(",");
AN0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROGRAM_CD_3",rb))).append("', 'name':'l_PROGRAM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AN0010010view1_sortable).append("}").append(",");
AN0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'630px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MODE_FORM_TO_NAME",rb))).append("', 'name':'l_PROGRAM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AN0010010view1_sortable).append("}").append(",");
AN0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TARGET_PLANT_TYP",rb))).append("', 'name':'TARGET_PLANT_TYP', 'class':'expj-tooltip expj-view-cell-combobox', 'sortable':").append(AN0010010view1_sortable).append("}").append(",");
%>
<%
 int aAN0010010StructLength = aAN0010010Control.getListsize();
 final AN0010010Struct structBackup = aAN0010010Struct;
 aAN0010010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAN0010010StructLength; ++loopCount) {
  if((aAN0010010Struct = (AN0010010Struct) aAN0010010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAN0010010Struct", aAN0010010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AN0010010view1_DB.append("[");
 AN0010010view1_DB.append(loopCount);
 AN0010010view1_DB.append(",").append("'<span id=\"expj-AN0010010-AN0010010view1-h_TARGET_PLANT_TYP-").append(loopCount).append("\" class=\"expj-label expj-AN0010010-AN0010010view1-h_TARGET_PLANT_TYP\" data-name=\"h_TARGET_PLANT_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0010010Struct.geth_TARGET_PLANT_TYP())).append("</span>'");
 AN0010010view1_DB.append(",").append("'<span id=\"expj-AN0010010-AN0010010view1-h_TARGET_PLANT_TYP2-").append(loopCount).append("\" class=\"expj-label expj-AN0010010-AN0010010view1-h_TARGET_PLANT_TYP2\" data-name=\"h_TARGET_PLANT_TYP2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0010010Struct.geth_TARGET_PLANT_TYP2())).append("</span>'");
 AN0010010view1_DB.append(",").append("'<span id=\"expj-AN0010010-AN0010010view1-h_CHANGEABLE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AN0010010-AN0010010view1-h_CHANGEABLE_TYP\" data-name=\"h_CHANGEABLE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0010010Struct.geth_CHANGEABLE_TYP())).append("</span>'");
 AN0010010view1_DB.append(",").append("'<span id=\"expj-AN0010010-AN0010010view1-h_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AN0010010-AN0010010view1-h_MODIFY_COUNT\" data-name=\"h_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0010010Struct.geth_MODIFY_COUNT())).append("</span>'");
 AN0010010view1_DB.append(",").append("'<span id=\"expj-AN0010010-AN0010010view1-h_MODIFY_COUNT2-").append(loopCount).append("\" class=\"expj-label expj-AN0010010-AN0010010view1-h_MODIFY_COUNT2\" data-name=\"h_MODIFY_COUNT2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0010010Struct.geth_MODIFY_COUNT2())).append("</span>'");
 AN0010010view1_DB.append(",").append("'<span id=\"expj-AN0010010-AN0010010view1-l_PROGRAM_CD-").append(loopCount).append("\" class=\"expj-label expj-AN0010010-AN0010010view1-l_PROGRAM_CD\" data-name=\"l_PROGRAM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0010010Struct.getl_PROGRAM_CD())).append("</span>'");
 AN0010010view1_DB.append(",").append("'<span id=\"expj-AN0010010-AN0010010view1-l_PROGRAM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AN0010010-AN0010010view1-l_PROGRAM_NAME\" data-name=\"l_PROGRAM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0010010Struct.getl_PROGRAM_NAME())).append("</span>'");
 AN0010010view1_DB.append(",").append("'<select id=\"expj-AN0010010-AN0010010view1-TARGET_PLANT_TYP-").append(loopCount).append("\" class=\"expj-AN0010010-AN0010010view1-TARGET_PLANT_TYP AN0010010-focus-move\" data-name=\"TARGET_PLANT_TYP\" data-view=\"true\">"); for(int i = 0, size = aAN0010010Control.getStruct().getList_TARGET_PLANT_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAN0010010Control.getStruct().getList_TARGET_PLANT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAN0010010Control.getStruct().getList_TARGET_PLANT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAN0010010Struct.getTARGET_PLANT_TYP()))) ? " selected" : "";    AN0010010view1_DB.append("<option value=\"").append(val).append("\"").append( selected ).append(">").append(name).append("</option>");  } AN0010010view1_DB.append("</select>'");
 AN0010010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAN0010010StructLength) {
   AN0010010view1_DB.append(",");
  }
 }
 aAN0010010Struct = structBackup;
 viewIdList.add(AN0010010view1_Id);
 viewSelectList.add(AN0010010view1_select);
 viewResizeList.add(AN0010010view1_resize);
 viewScrollList.add(AN0010010view1_scroll);
 viewHeaderDataList.add(AN0010010view1_HB);
 viewBodyDataList.add(AN0010010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AN0010010-AN0010010button2">
expj.AN0010010.AN0010010button2 = {};
expj.AN0010010.AN0010010button2.executeAllOnDecision = function () {
  console.log('execute AN0010010button2.onDecision');
};
expj.AN0010010.AN0010010button2.executeOnLoad = function () {
  expj.AN0010010.AN0010010button2.executePScriptOnLoad();
};

expj.AN0010010.AN0010010button2.executePScriptOnLoad = function () {
  console.log('execute AN0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0010010-AN0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0010010-AN0010010button2-Insert">
expj.AN0010010.AN0010010button2.Insert = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0010010form1/*,_AN0010010view1/*@AN0010010Servlet,,$ZZ07001"
expj.AN0010010.AN0010010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0010010', 'AN0010010button2', '_AN0010010form1/*,_AN0010010view1/*', 'AN0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0010010', response);
expj.common.updateBusinessScreenTab('AN0010010', contents);
};
expj.common.pscript.callConfirm('AN0010010', 'AN0010010button2', 'ZZ07001', okEvent);
};
expj.AN0010010.AN0010010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0010010.AN0010010button2.Insert['onClick' + i])) {
        expj.AN0010010.AN0010010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.AN0010010.AN0010010button2.Insert.executeAllOnDecision = function () {
};
expj.AN0010010.AN0010010button2.Insert.executeOnLoad = function () {
  $('#expj-AN0010010-AN0010010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0010010', 'AN0010010button2', 'Insert', this, 'Button');
    }
  });
  expj.AN0010010.AN0010010button2.Insert.executePScriptOnLoad();
};

expj.AN0010010.AN0010010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute AN0010010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AN0010010-AN0010010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0010010-AN0010010button2-Insert" name="Insert" class="AN0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AN0010010-AN0010010button2-Update">
expj.AN0010010.AN0010010button2.Update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0010010form1/*,_AN0010010view1/*@AN0010010Servlet,,$ZZ07003"
expj.AN0010010.AN0010010button2.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0010010', 'AN0010010button2', '_AN0010010form1/*,_AN0010010view1/*', 'AN0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0010010', response);
expj.common.updateBusinessScreenTab('AN0010010', contents);
};
expj.common.pscript.callConfirm('AN0010010', 'AN0010010button2', 'ZZ07003', okEvent);
};
expj.AN0010010.AN0010010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0010010.AN0010010button2.Update['onClick' + i])) {
        expj.AN0010010.AN0010010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AN0010010.AN0010010button2.Update.executeAllOnDecision = function () {
};
expj.AN0010010.AN0010010button2.Update.executeOnLoad = function () {
  $('#expj-AN0010010-AN0010010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0010010', 'AN0010010button2', 'Update', this, 'Button');
    }
  });
  expj.AN0010010.AN0010010button2.Update.executePScriptOnLoad();
};

expj.AN0010010.AN0010010button2.Update.executePScriptOnLoad = function () {
  console.log('execute AN0010010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AN0010010-AN0010010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0010010-AN0010010button2-Update" name="Update" class="AN0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<span class="version">AN0010010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AN0010010-AN0010010button0">
expj.AN0010010.AN0010010button0 = {};
expj.AN0010010.AN0010010button0.executeAllOnDecision = function () {
  console.log('execute AN0010010button0.onDecision');
};
expj.AN0010010.AN0010010button0.executeOnLoad = function () {
  expj.AN0010010.AN0010010button0.executePScriptOnLoad();
};

expj.AN0010010.AN0010010button0.executePScriptOnLoad = function () {
  console.log('execute AN0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0010010-AN0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0010010-AN0010010button0-Clear">
expj.AN0010010.AN0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0010010form1/*@AN0010010Servlet,,$ZZ07008"
expj.AN0010010.AN0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0010010', 'AN0010010button0', '_AN0010010form1/*', 'AN0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0010010', response);
expj.common.updateBusinessScreenTab('AN0010010', contents);
};
expj.common.pscript.callConfirm('AN0010010', 'AN0010010button0', 'ZZ07008', okEvent);
};
expj.AN0010010.AN0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0010010.AN0010010button0.Clear['onClick' + i])) {
        expj.AN0010010.AN0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AN0010010.AN0010010button0.Clear.executeAllOnDecision = function () {
};
expj.AN0010010.AN0010010button0.Clear.executeOnLoad = function () {
  $('#expj-AN0010010-AN0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0010010', 'AN0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.AN0010010.AN0010010button0.Clear.executePScriptOnLoad();
};

expj.AN0010010.AN0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AN0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AN0010010-AN0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0010010-AN0010010button0-Clear" name="Clear" class="AN0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AN0010010-AN0010010button0-Close">
expj.AN0010010.AN0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AN0010010.AN0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AN0010010');
};
expj.AN0010010.AN0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0010010.AN0010010button0.Close['onClick' + i])) {
        expj.AN0010010.AN0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AN0010010.AN0010010button0.Close.executeAllOnDecision = function () {
};
expj.AN0010010.AN0010010button0.Close.executeOnLoad = function () {
  $('#expj-AN0010010-AN0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0010010', 'AN0010010button0', 'Close', this, 'Button');
    }
  });
  expj.AN0010010.AN0010010button0.Close.executePScriptOnLoad();
};

expj.AN0010010.AN0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AN0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AN0010010-AN0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0010010-AN0010010button0-Close" name="Close" class="AN0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AN0010010 (END)-->
<%
  MessageStruct msgStruct = aAN0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AN0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AN0010010)) {
  expj.common.treeInstanceMap.AN0010010 = {};
}
expj.common.treeInstanceMap.AN0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AN0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AN0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AN0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AN0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AN0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AN0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AN0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AN0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0010010)) {
  expj.common.detailDialogMap.AN0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AN0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AN0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AN0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AN0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AN0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AN0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AN0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AN0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AN0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AN0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AN0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AN0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AN0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AN0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AN0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AN0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AN0010010)) {
  expj.common.viewInstanceMap.AN0010010 = {};
}
expj.common.viewInstanceMap.AN0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AN0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AN0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AN0010010.<%=viewId %>.init = function () {
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
    expj.AN0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AN0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AN0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AN0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AN0010010_init">
/**
 * AN0010010用のロード完了時初期化関数
 */
expj.AN0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AN0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AN0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AN0010010');
  expj.common.calendarInstanceMap.AN0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AN0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AN0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AN0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AN0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AN0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AN0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AN0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AN0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AN0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AN0010010.AN0010010form1.PROGRAM_CD.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010form1.h_PROGRAM_CD.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010form1.PeekerProgramCd.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010form1.PROGRAM_NAME.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010form1.h_ExistSysBusinessLock.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010view1.TARGET_PLANT_TYP.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010button2.Update.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010form1.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010button1.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010view1.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010button2.executeOnLoad();}catch(e){};
  try{expj.AN0010010.AN0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AN0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AN0010010', 'AN0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AN0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AN0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.AN0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AN0010010', '<%=request.getContextPath() %>');
};

/**
 * AN0010010の全体onDecision処理
 */
expj.AN0010010.executeAllOnDecision = function () {
  expj.AN0010010.AN0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AN0010010_console">
expj.AN0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>