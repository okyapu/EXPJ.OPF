<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:23:15 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0100\AA0100030.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0100.*" %>
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
<jsp:useBean id="aAA0100030Control" class="com.nec.jp.orteus.metamorBase.AA0100.AA0100030Control" scope="request"/>
<jsp:useBean id="aAA0100030Struct" class="com.nec.jp.orteus.metamorBase.AA0100.AA0100030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

消費税区分メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0100/jsp/AA0100030.jsp,v $
$Author: geng-jia $
$Revision: 1.10 $ $Date: 2017/02/22 02:03:59 $
********************************************************* --%>
<html>
<head>
<title>消費税区分メンテナンス</title>
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
<script class="expj-script-AA0100030_init">
  // AA0100030名前空間
  expj.AA0100030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0100030" data-screen="AA0100030" data-newdata="<%=aAA0100030Control.isNewData() %>">
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
              <script class="expj-script-AA0100030-AA0100030form1">
expj.AA0100030.AA0100030form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0100030.AA0100030form1.onLoad0 = function () {
  console.log('AA0100030form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;?AA0100030form1/*[eq]NORMAL@*1,*2"
expj.AA0100030.AA0100030form1.child0 = function () {
  console.log('AA0100030form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030form1', '?AA0100030form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;MASK;_AA0100030button2/insert"
expj.AA0100030.AA0100030form1.child1 = function () {
  console.log('AA0100030form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/insert');
};
// script4="child;2;MASK;_AA0100030button2/update,_AA0100030button2/delete"
expj.AA0100030.AA0100030form1.child2 = function () {
  console.log('AA0100030form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/delete');
};
// script5="onLoad;1;CALL;onDecision@0,1"
expj.AA0100030.AA0100030form1.onLoad1 = function () {
  console.log('AA0100030form1 script5');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script6="onDecision;0;CHKRQ;A@*3,*4"
expj.AA0100030.AA0100030form1.onDecision0 = function () {
  console.log('AA0100030form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AA0100030', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AA0100030button1/select@*5"
expj.AA0100030.AA0100030form1.child3 = function () {
  console.log('AA0100030form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script8="child;4;MASK;_AA0100030button1/select@*6"
expj.AA0100030.AA0100030form1.child4 = function () {
  console.log('AA0100030form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script9="child;5;CHKRQ;B@*7,*6"
expj.AA0100030.AA0100030form1.child5 = function () {
  console.log('AA0100030form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('AA0100030', 'B')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;6;MASK;_AA0100030button2/insert,_AA0100030button2/update"
expj.AA0100030.AA0100030form1.child6 = function () {
  console.log('AA0100030form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/update');
};
// script11="child;7;CHK;?AA0100030form1/*[eq]INITIAL@*8,*9"
expj.AA0100030.AA0100030form1.child7 = function () {
  console.log('AA0100030form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030form1', '?AA0100030form1/*'), '[eq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;8;UNMASK;_AA0100030button2/insert"
expj.AA0100030.AA0100030form1.child8 = function () {
  console.log('AA0100030form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/insert');
};
// script13="child;9;CHK;_AA0100030form1/TAX_CD[eq]_AA0100030form1/h_TAX_CD@*10,*12"
expj.AA0100030.AA0100030form1.child9 = function () {
  console.log('AA0100030form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030form1', '_AA0100030form1/TAX_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030form1', '_AA0100030form1/h_TAX_CD'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script14="child;10;MASK;_AA0100030button2/insert@*11"
expj.AA0100030.AA0100030form1.child10 = function () {
  console.log('AA0100030form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script15="child;11;UNMASK;_AA0100030button2/update"
expj.AA0100030.AA0100030form1.child11 = function () {
  console.log('AA0100030form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/update');
};
// script16="child;12;MASK;_AA0100030button2/update@*13"
expj.AA0100030.AA0100030form1.child12 = function () {
  console.log('AA0100030form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script17="child;13;UNMASK;_AA0100030button2/insert"
expj.AA0100030.AA0100030form1.child13 = function () {
  console.log('AA0100030form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/insert');
};
// script18="onDecision;1;CHK;?AA0100030form1/*[eq]NORMAL@*14,*16"
expj.AA0100030.AA0100030form1.onDecision1 = function () {
  console.log('AA0100030form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030form1', '?AA0100030form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script19="child;14;CHK;_AA0100030form1/TAX_CD[eq]_AA0100030form1/h_TAX_CD@*15,*16"
expj.AA0100030.AA0100030form1.child14 = function () {
  console.log('AA0100030form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030form1', '_AA0100030form1/TAX_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030form1', '_AA0100030form1/h_TAX_CD'))) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script20="child;15;UNMASK;_AA0100030button2/delete"
expj.AA0100030.AA0100030form1.child15 = function () {
  console.log('AA0100030form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/delete');
};
// script21="child;16;MASK;_AA0100030button2/delete"
expj.AA0100030.AA0100030form1.child16 = function () {
  console.log('AA0100030form1 script21');
expj.common.pscript.setMaskToReferenceComponent('AA0100030', 'AA0100030form1', '_AA0100030button2/delete');
};
expj.AA0100030.AA0100030form1.executeAllOnDecision = function () {
  console.log('execute AA0100030form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100030.AA0100030form1['onDecision' + i])) {
        expj.AA0100030.AA0100030form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0100030.AA0100030form1.executeOnLoad = function () {
  expj.AA0100030.AA0100030form1.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form1.executePScriptOnLoad = function () {
  console.log('execute AA0100030form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0100030.AA0100030form1['onLoad' + i])) {
      expj.AA0100030.AA0100030form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0100030-AA0100030form1" action="AA0100030Servlet" name="AA0100030form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0100030Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TAX_CD_1",rb)%></span><!-- 消費税コード --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form1-TAX_CD">
expj.AA0100030.AA0100030form1.TAX_CD = {};
expj.AA0100030.AA0100030form1.TAX_CD.executeAllOnDecision = function () {
  console.log('execute AA0100030form1/TAX_CD.onDecision');
  expj.AA0100030.AA0100030form1.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form1.TAX_CD.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form1-TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form1', 'TAX_CD', this);
  });
  expj.AA0100030.AA0100030form1.TAX_CD.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form1.TAX_CD.executePScriptOnLoad = function () {
  console.log('execute AA0100030form1/TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form1-TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form1-TAX_CD" name="TAX_CD" class="AA0100030-focus-move  required-value expj-AA0100030-required-A" style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getTAX_CD()) %>" maxlength="3" ></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form1-PeekerTaxCd">
expj.AA0100030.AA0100030form1.PeekerTaxCd = {};
// script1="onClick;0;PEEKER;_AA0100030form1/TAX_CD@<%=contextNo%>"
expj.AA0100030.AA0100030form1.PeekerTaxCd.onClick0 = function () {
  console.log('PeekerTaxCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0100030';
var parameterValues = 'PeekerTaxCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030form1', '_AA0100030form1/TAX_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%TAX_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0100030form1/TAX_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0100030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0100030.AA0100030form1.PeekerTaxCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100030.AA0100030form1.PeekerTaxCd['onClick' + i])) {
        expj.AA0100030.AA0100030form1.PeekerTaxCd['onClick' + i]();
      }
    }
  }
};
expj.AA0100030.AA0100030form1.PeekerTaxCd.executeAllOnDecision = function () {
};
expj.AA0100030.AA0100030form1.PeekerTaxCd.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form1-PeekerTaxCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100030', 'AA0100030form1', 'PeekerTaxCd', this, 'Button');
    }
  });
  expj.AA0100030.AA0100030form1.PeekerTaxCd.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form1.PeekerTaxCd.executePScriptOnLoad = function () {
  console.log('execute AA0100030form1/PeekerTaxCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form1-PeekerTaxCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0100030-AA0100030form1-PeekerTaxCd" class="AA0100030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0100030-AA0100030form1-h_TAX_CD" name="h_TAX_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0100030Control.getMainStruct().getTAX_CD()) %>">
<script class="expj-script-AA0100030-AA0100030form1-h_TAX_CD">
expj.AA0100030.AA0100030form1.h_TAX_CD = {};
expj.AA0100030.AA0100030form1.h_TAX_CD.executeAllOnDecision = function () {
  console.log('execute AA0100030form1/h_TAX_CD.onDecision');
  expj.AA0100030.AA0100030form1.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form1.h_TAX_CD.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form1-h_TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form1', 'h_TAX_CD', this);
  });
  expj.AA0100030.AA0100030form1.h_TAX_CD.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form1.h_TAX_CD.executePScriptOnLoad = function () {
  console.log('execute AA0100030form1/h_TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form1-h_TAX_CD');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0100030-AA0100030button1">
expj.AA0100030.AA0100030button1 = {};
expj.AA0100030.AA0100030button1.executeAllOnDecision = function () {
  console.log('execute AA0100030button1.onDecision');
};
expj.AA0100030.AA0100030button1.executeOnLoad = function () {
  expj.AA0100030.AA0100030button1.executePScriptOnLoad();
};

expj.AA0100030.AA0100030button1.executePScriptOnLoad = function () {
  console.log('execute AA0100030button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0100030-AA0100030button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0100030-AA0100030button1-select">
expj.AA0100030.AA0100030button1.select = {};
// script1="onClick;0;CHK;~LEN(_AA0100030form1/TAX_CD)[eq]3@*0,!AA00140"
expj.AA0100030.AA0100030button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button1', 'AA00140');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0100030form1/*@AA0100030Servlet"
expj.AA0100030.AA0100030button1.select.onClick1 = function () {
  console.log('select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100030', 'AA0100030button1', '_AA0100030form1/*', 'AA0100030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100030', response);
expj.common.updateBusinessScreenTab('AA0100030', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script3="child;0;CHK;~CHARAT(_AA0100030form1/TAX_CD:0)[gte]0[and]~CHARAT(_AA0100030form1/TAX_CD:0)[lte]9@*1,!AA00141"
expj.AA0100030.AA0100030button1.select.child0 = function () {
  console.log('select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD', '0')), '[gte]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD', '0')), '[lte]', expj.common.pscript.convertNumber('9'))) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button1', 'AA00141');
}
};
// script4="child;1;CHK;~CHARAT(_AA0100030form1/TAX_CD:1)[gte]0[and]~CHARAT(_AA0100030form1/TAX_CD:1)[lte]9@*2,!AA00141"
expj.AA0100030.AA0100030button1.select.child1 = function () {
  console.log('select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD', '1')), '[gte]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD', '1')), '[lte]', expj.common.pscript.convertNumber('9'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button1', 'AA00141');
}
};
// script5="child;2;CHK;~CHARAT(_AA0100030form1/TAX_CD:2)[gte]0[and]~CHARAT(_AA0100030form1/TAX_CD:2)[lte]9@*3,!AA00141"
expj.AA0100030.AA0100030button1.select.child2 = function () {
  console.log('select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD', '2')), '[gte]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD', '2')), '[lte]', expj.common.pscript.convertNumber('9'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button1', 'AA00141');
}
};
// script6="child;3;CHK;~CHARAT(_AA0100030form1/TAX_CD:2)[neq]0[and]~CHARAT(_AA0100030form1/TAX_CD:2)[neq]1[and]~CHARAT(_AA0100030form1/TAX_CD:2)[neq]5[and]~CHARAT(_AA0100030form1/TAX_CD:2)[neq]9@!AA00113"
expj.AA0100030.AA0100030button1.select.child3 = function () {
  console.log('select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD', '2'), '[neq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD', '2'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD', '2'), '[neq]', '5') && expj.common.pscript.evaluate(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button1', '_AA0100030form1/TAX_CD', '2'), '[neq]', '9')) {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button1', 'AA00113');
}
};
expj.AA0100030.AA0100030button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100030.AA0100030button1.select['onClick' + i])) {
        expj.AA0100030.AA0100030button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0100030.AA0100030button1.select.executeAllOnDecision = function () {
};
expj.AA0100030.AA0100030button1.select.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100030', 'AA0100030button1', 'select', this, 'Button');
    }
  });
  expj.AA0100030.AA0100030button1.select.executePScriptOnLoad();
};

expj.AA0100030.AA0100030button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0100030button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100030-AA0100030button1-select" name="select" class="AA0100030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0100030-AA0100030form2">
expj.AA0100030.AA0100030form2 = {};
expj.AA0100030.AA0100030form2.executeAllOnDecision = function () {
  console.log('execute AA0100030form2.onDecision');
};
expj.AA0100030.AA0100030form2.executeOnLoad = function () {
  expj.AA0100030.AA0100030form2.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0100030-AA0100030form2" action="AA0100030Servlet" name="AA0100030form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TAX_NAME",rb)%></span><!-- 消費税名 --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-TAX_NAME">
expj.AA0100030.AA0100030form2.TAX_NAME = {};
expj.AA0100030.AA0100030form2.TAX_NAME.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/TAX_NAME.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.TAX_NAME.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-TAX_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'TAX_NAME', this);
  });
  expj.AA0100030.AA0100030form2.TAX_NAME.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.TAX_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/TAX_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-TAX_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-TAX_NAME" name="TAX_NAME" class="AA0100030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getTAX_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TAX_ANAME",rb)%></span><!-- 消費税略名 --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-TAX_ANAME">
expj.AA0100030.AA0100030form2.TAX_ANAME = {};
expj.AA0100030.AA0100030form2.TAX_ANAME.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/TAX_ANAME.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.TAX_ANAME.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-TAX_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'TAX_ANAME', this);
  });
  expj.AA0100030.AA0100030form2.TAX_ANAME.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.TAX_ANAME.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/TAX_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-TAX_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-TAX_ANAME" name="TAX_ANAME" class="AA0100030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getTAX_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OLD_TAX_RATE_1",rb)%></span><!-- 旧税率1 --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-OLD_TAX_RATE_1">
expj.AA0100030.AA0100030form2.OLD_TAX_RATE_1 = {};
expj.AA0100030.AA0100030form2.OLD_TAX_RATE_1.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/OLD_TAX_RATE_1.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.OLD_TAX_RATE_1.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-OLD_TAX_RATE_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'OLD_TAX_RATE_1', this);
  });
  expj.AA0100030.AA0100030form2.OLD_TAX_RATE_1.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.OLD_TAX_RATE_1.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/OLD_TAX_RATE_1.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-OLD_TAX_RATE_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-OLD_TAX_RATE_1" name="OLD_TAX_RATE_1" class="AA0100030-focus-move  required-value expj-AA0100030-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getOLD_TAX_RATE_1()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OLD_TAX_RATE_2",rb)%></span><!-- 旧税率2 --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-OLD_TAX_RATE_2">
expj.AA0100030.AA0100030form2.OLD_TAX_RATE_2 = {};
expj.AA0100030.AA0100030form2.OLD_TAX_RATE_2.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/OLD_TAX_RATE_2.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.OLD_TAX_RATE_2.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-OLD_TAX_RATE_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'OLD_TAX_RATE_2', this);
  });
  expj.AA0100030.AA0100030form2.OLD_TAX_RATE_2.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.OLD_TAX_RATE_2.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/OLD_TAX_RATE_2.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-OLD_TAX_RATE_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-OLD_TAX_RATE_2" name="OLD_TAX_RATE_2" class="AA0100030-focus-move  required-value expj-AA0100030-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getOLD_TAX_RATE_2()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OLD_TAX_RATE_3",rb)%></span><!-- 旧税率3 --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-OLD_TAX_RATE_3">
expj.AA0100030.AA0100030form2.OLD_TAX_RATE_3 = {};
expj.AA0100030.AA0100030form2.OLD_TAX_RATE_3.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/OLD_TAX_RATE_3.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.OLD_TAX_RATE_3.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-OLD_TAX_RATE_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'OLD_TAX_RATE_3', this);
  });
  expj.AA0100030.AA0100030form2.OLD_TAX_RATE_3.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.OLD_TAX_RATE_3.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/OLD_TAX_RATE_3.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-OLD_TAX_RATE_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-OLD_TAX_RATE_3" name="OLD_TAX_RATE_3" class="AA0100030-focus-move  required-value expj-AA0100030-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getOLD_TAX_RATE_3()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NEW_TAX_RATE_START_DATE_1",rb)%></span><!-- 新消費税開始日 --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-NEW_TAX_RATE_START_DATE">
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_START_DATE = {};
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_START_DATE.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/NEW_TAX_RATE_START_DATE.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_START_DATE.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-NEW_TAX_RATE_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'NEW_TAX_RATE_START_DATE', this);
  });
  expj.AA0100030.AA0100030form2.NEW_TAX_RATE_START_DATE.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.NEW_TAX_RATE_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/NEW_TAX_RATE_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-NEW_TAX_RATE_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-NEW_TAX_RATE_START_DATE" name="NEW_TAX_RATE_START_DATE" class="AA0100030-focus-move  required-value expj-AA0100030-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getNEW_TAX_RATE_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-calendar">
expj.AA0100030.AA0100030form2.calendar = {};
// script1="onClick;0;CALENDAR;_AA0100030form2/NEW_TAX_RATE_START_DATE"
expj.AA0100030.AA0100030form2.calendar.onClick0 = function () {
  console.log('calendar script1');
expj.common.pscript.executeCalendar('AA0100030','AA0100030form2','_AA0100030form2/NEW_TAX_RATE_START_DATE');
};
expj.AA0100030.AA0100030form2.calendar.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100030.AA0100030form2.calendar['onClick' + i])) {
        expj.AA0100030.AA0100030form2.calendar['onClick' + i]();
      }
    }
  }
};
expj.AA0100030.AA0100030form2.calendar.executeAllOnDecision = function () {
};
expj.AA0100030.AA0100030form2.calendar.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-calendar').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100030', 'AA0100030form2', 'calendar', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0100030','AA0100030form2','_AA0100030form2/NEW_TAX_RATE_START_DATE');
  expj.AA0100030.AA0100030form2.calendar.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.calendar.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/calendar.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-calendar');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0100030-AA0100030form2-calendar" class="AA0100030-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NEW_TAX_RATE_1",rb)%></span><!-- 新税率1 --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-NEW_TAX_RATE_1">
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_1 = {};
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_1.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/NEW_TAX_RATE_1.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_1.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-NEW_TAX_RATE_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'NEW_TAX_RATE_1', this);
  });
  expj.AA0100030.AA0100030form2.NEW_TAX_RATE_1.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.NEW_TAX_RATE_1.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/NEW_TAX_RATE_1.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-NEW_TAX_RATE_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-NEW_TAX_RATE_1" name="NEW_TAX_RATE_1" class="AA0100030-focus-move  required-value expj-AA0100030-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getNEW_TAX_RATE_1()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NEW_TAX_RATE_2",rb)%></span><!-- 新税率2 --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-NEW_TAX_RATE_2">
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_2 = {};
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_2.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/NEW_TAX_RATE_2.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_2.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-NEW_TAX_RATE_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'NEW_TAX_RATE_2', this);
  });
  expj.AA0100030.AA0100030form2.NEW_TAX_RATE_2.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.NEW_TAX_RATE_2.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/NEW_TAX_RATE_2.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-NEW_TAX_RATE_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-NEW_TAX_RATE_2" name="NEW_TAX_RATE_2" class="AA0100030-focus-move  required-value expj-AA0100030-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getNEW_TAX_RATE_2()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NEW_TAX_RATE_3",rb)%></span><!-- 新税率3 --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-NEW_TAX_RATE_3">
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_3 = {};
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_3.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/NEW_TAX_RATE_3.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.NEW_TAX_RATE_3.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-NEW_TAX_RATE_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'NEW_TAX_RATE_3', this);
  });
  expj.AA0100030.AA0100030form2.NEW_TAX_RATE_3.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.NEW_TAX_RATE_3.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/NEW_TAX_RATE_3.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-NEW_TAX_RATE_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-NEW_TAX_RATE_3" name="NEW_TAX_RATE_3" class="AA0100030-focus-move  required-value expj-AA0100030-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getNEW_TAX_RATE_3()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TAX_ROUND_TYP",rb)%></span><!-- 税端数区分 --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-ROUND_TYP">
expj.AA0100030.AA0100030form2.ROUND_TYP = {};
expj.AA0100030.AA0100030form2.ROUND_TYP.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/ROUND_TYP.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.ROUND_TYP.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-ROUND_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0100030', 'AA0100030form2', 'ROUND_TYP', this);
  });
  expj.AA0100030.AA0100030form2.ROUND_TYP.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.ROUND_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/ROUND_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-ROUND_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0100030-AA0100030form2-ROUND_TYP" name='ROUND_TYP' class='AA0100030-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0100030Control.getStruct().getList_ROUND_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0100030Control.getStruct().getList_ROUND_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0100030Control.getStruct().getList_ROUND_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0100030Struct.getROUND_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OLD_GL_TAX_CD",rb)%></span><!-- 旧一般会計消費税コード --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-OLD_GL_TAX_CD">
expj.AA0100030.AA0100030form2.OLD_GL_TAX_CD = {};
expj.AA0100030.AA0100030form2.OLD_GL_TAX_CD.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/OLD_GL_TAX_CD.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.OLD_GL_TAX_CD.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-OLD_GL_TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'OLD_GL_TAX_CD', this);
  });
  expj.AA0100030.AA0100030form2.OLD_GL_TAX_CD.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.OLD_GL_TAX_CD.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/OLD_GL_TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-OLD_GL_TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-OLD_GL_TAX_CD" name="OLD_GL_TAX_CD" class="AA0100030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getOLD_GL_TAX_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.NEW_GL_TAX_CD",rb)%></span><!-- 新一般会計消費税コード --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030form2-NEW_GL_TAX_CD">
expj.AA0100030.AA0100030form2.NEW_GL_TAX_CD = {};
expj.AA0100030.AA0100030form2.NEW_GL_TAX_CD.executeAllOnDecision = function () {
  console.log('execute AA0100030form2/NEW_GL_TAX_CD.onDecision');
  expj.AA0100030.AA0100030form2.executeAllOnDecision();
  expj.AA0100030.executeAllOnDecision();
};
expj.AA0100030.AA0100030form2.NEW_GL_TAX_CD.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030form2-NEW_GL_TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100030', 'AA0100030form2', 'NEW_GL_TAX_CD', this);
  });
  expj.AA0100030.AA0100030form2.NEW_GL_TAX_CD.executePScriptOnLoad();
};

expj.AA0100030.AA0100030form2.NEW_GL_TAX_CD.executePScriptOnLoad = function () {
  console.log('execute AA0100030form2/NEW_GL_TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030form2-NEW_GL_TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0100030-AA0100030form2-NEW_GL_TAX_CD" name="NEW_GL_TAX_CD" class="AA0100030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0100030Struct.getNEW_GL_TAX_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AA0100030-AA0100030button2">
expj.AA0100030.AA0100030button2 = {};
expj.AA0100030.AA0100030button2.executeAllOnDecision = function () {
  console.log('execute AA0100030button2.onDecision');
};
expj.AA0100030.AA0100030button2.executeOnLoad = function () {
  expj.AA0100030.AA0100030button2.executePScriptOnLoad();
};

expj.AA0100030.AA0100030button2.executePScriptOnLoad = function () {
  console.log('execute AA0100030button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0100030-AA0100030button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0100030-AA0100030button2-insert">
expj.AA0100030.AA0100030button2.insert = {};
// script1="onClick;0;CHK;~LEN(_AA0100030form1/TAX_CD)[eq]3@*0,!AA00140"
expj.AA0100030.AA0100030button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button2', 'AA00140');
}
};
// script2="onClick;1;CHK;~LEN(_AA0100030form1/TAX_CD)[eq]3[and]~CHARAT(_AA0100030form1/TAX_CD:2)[eq]0@*4"
expj.AA0100030.AA0100030button2.insert.onClick1 = function () {
  console.log('insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD'), '[eq]', '3') && expj.common.pscript.evaluate(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '2'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0100030form1/*,_AA0100030form2/*@AA0100030Servlet,,$ZZ07001"
expj.AA0100030.AA0100030button2.insert.onClick2 = function () {
  console.log('insert script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100030', 'AA0100030button2', '_AA0100030form1/*,_AA0100030form2/*', 'AA0100030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100030', response);
expj.common.updateBusinessScreenTab('AA0100030', contents);
};
expj.common.pscript.callConfirm('AA0100030', 'AA0100030button2', 'ZZ07001', okEvent);
};
// script4="child;0;CHK;~CHARAT(_AA0100030form1/TAX_CD:0)[gte]0[and]~CHARAT(_AA0100030form1/TAX_CD:0)[lte]9@*1,!AA00141"
expj.AA0100030.AA0100030button2.insert.child0 = function () {
  console.log('insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '0')), '[gte]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '0')), '[lte]', expj.common.pscript.convertNumber('9'))) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button2', 'AA00141');
}
};
// script5="child;1;CHK;~CHARAT(_AA0100030form1/TAX_CD:1)[gte]0[and]~CHARAT(_AA0100030form1/TAX_CD:1)[lte]9@*2,!AA00141"
expj.AA0100030.AA0100030button2.insert.child1 = function () {
  console.log('insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '1')), '[gte]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '1')), '[lte]', expj.common.pscript.convertNumber('9'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button2', 'AA00141');
}
};
// script6="child;2;CHK;~CHARAT(_AA0100030form1/TAX_CD:2)[gte]0[and]~CHARAT(_AA0100030form1/TAX_CD:2)[lte]9@*3,!AA00141"
expj.AA0100030.AA0100030button2.insert.child2 = function () {
  console.log('insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '2')), '[gte]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '2')), '[lte]', expj.common.pscript.convertNumber('9'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button2', 'AA00141');
}
};
// script7="child;3;CHK;~CHARAT(_AA0100030form1/TAX_CD:2)[neq]0[and]~CHARAT(_AA0100030form1/TAX_CD:2)[neq]1[and]~CHARAT(_AA0100030form1/TAX_CD:2)[neq]5[and]~CHARAT(_AA0100030form1/TAX_CD:2)[neq]9@!AA00113"
expj.AA0100030.AA0100030button2.insert.child3 = function () {
  console.log('insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '2'), '[neq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '2'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '2'), '[neq]', '5') && expj.common.pscript.evaluate(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '2'), '[neq]', '9')) {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button2', 'AA00113');
}
};
// script8="child;4;CHK;_AA0100030form2/OLD_TAX_RATE_1[numneq]0[or]_AA0100030form2/OLD_TAX_RATE_2[numneq]0[or]_AA0100030form2/OLD_TAX_RATE_3[numneq]0[or]_AA0100030form2/NEW_TAX_RATE_1[numneq]0[or]_AA0100030form2/NEW_TAX_RATE_2[numneq]0[or]_AA0100030form2/NEW_TAX_RATE_3[numneq]0@!AA00217"
expj.AA0100030.AA0100030button2.insert.child4 = function () {
  console.log('insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/OLD_TAX_RATE_1')), '[numneq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/OLD_TAX_RATE_2')), '[numneq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/OLD_TAX_RATE_3')), '[numneq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/NEW_TAX_RATE_1')), '[numneq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/NEW_TAX_RATE_2')), '[numneq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/NEW_TAX_RATE_3')), '[numneq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button2', 'AA00217');
}
};
expj.AA0100030.AA0100030button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100030.AA0100030button2.insert['onClick' + i])) {
        expj.AA0100030.AA0100030button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AA0100030.AA0100030button2.insert.executeAllOnDecision = function () {
};
expj.AA0100030.AA0100030button2.insert.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100030', 'AA0100030button2', 'insert', this, 'Button');
    }
  });
  expj.AA0100030.AA0100030button2.insert.executePScriptOnLoad();
};

expj.AA0100030.AA0100030button2.insert.executePScriptOnLoad = function () {
  console.log('execute AA0100030button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100030-AA0100030button2-insert" name="insert" class="AA0100030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030button2-update">
expj.AA0100030.AA0100030button2.update = {};
// script1="onClick;0;CHK;~CHARAT(_AA0100030form1/TAX_CD:2)[eq]0@*0"
expj.AA0100030.AA0100030button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.CHARAT('AA0100030', 'AA0100030button2', '_AA0100030form1/TAX_CD', '2'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0100030form1/*,_AA0100030form2/*@AA0100030Servlet,,$ZZ07003"
expj.AA0100030.AA0100030button2.update.onClick1 = function () {
  console.log('update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100030', 'AA0100030button2', '_AA0100030form1/*,_AA0100030form2/*', 'AA0100030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100030', response);
expj.common.updateBusinessScreenTab('AA0100030', contents);
};
expj.common.pscript.callConfirm('AA0100030', 'AA0100030button2', 'ZZ07003', okEvent);
};
// script3="child;0;CHK;_AA0100030form2/OLD_TAX_RATE_1[numneq]0[or]_AA0100030form2/OLD_TAX_RATE_2[numneq]0[or]_AA0100030form2/OLD_TAX_RATE_3[numneq]0[or]_AA0100030form2/NEW_TAX_RATE_1[numneq]0[or]_AA0100030form2/NEW_TAX_RATE_2[numneq]0[or]_AA0100030form2/NEW_TAX_RATE_3[numneq]0@!AA00217"
expj.AA0100030.AA0100030button2.update.child0 = function () {
  console.log('update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/OLD_TAX_RATE_1')), '[numneq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/OLD_TAX_RATE_2')), '[numneq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/OLD_TAX_RATE_3')), '[numneq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/NEW_TAX_RATE_1')), '[numneq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/NEW_TAX_RATE_2')), '[numneq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0100030', 'AA0100030button2', '_AA0100030form2/NEW_TAX_RATE_3')), '[numneq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('AA0100030', 'AA0100030button2', 'AA00217');
}
};
expj.AA0100030.AA0100030button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100030.AA0100030button2.update['onClick' + i])) {
        expj.AA0100030.AA0100030button2.update['onClick' + i]();
      }
    }
  }
};
expj.AA0100030.AA0100030button2.update.executeAllOnDecision = function () {
};
expj.AA0100030.AA0100030button2.update.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100030', 'AA0100030button2', 'update', this, 'Button');
    }
  });
  expj.AA0100030.AA0100030button2.update.executePScriptOnLoad();
};

expj.AA0100030.AA0100030button2.update.executePScriptOnLoad = function () {
  console.log('execute AA0100030button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100030-AA0100030button2-update" name="update" class="AA0100030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030button2-delete">
expj.AA0100030.AA0100030button2.delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0100030form1/*,_AA0100030form2/*@AA0100030Servlet,,$ZZ07004"
expj.AA0100030.AA0100030button2.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100030', 'AA0100030button2', '_AA0100030form1/*,_AA0100030form2/*', 'AA0100030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100030', response);
expj.common.updateBusinessScreenTab('AA0100030', contents);
};
expj.common.pscript.callConfirm('AA0100030', 'AA0100030button2', 'ZZ07004', okEvent);
};
expj.AA0100030.AA0100030button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100030.AA0100030button2.delete['onClick' + i])) {
        expj.AA0100030.AA0100030button2.delete['onClick' + i]();
      }
    }
  }
};
expj.AA0100030.AA0100030button2.delete.executeAllOnDecision = function () {
};
expj.AA0100030.AA0100030button2.delete.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100030', 'AA0100030button2', 'delete', this, 'Button');
    }
  });
  expj.AA0100030.AA0100030button2.delete.executePScriptOnLoad();
};

expj.AA0100030.AA0100030button2.delete.executePScriptOnLoad = function () {
  console.log('execute AA0100030button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100030-AA0100030button2-delete" name="delete" class="AA0100030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<span class="version">AA0100030 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0100030-AA0100030button0">
expj.AA0100030.AA0100030button0 = {};
expj.AA0100030.AA0100030button0.executeAllOnDecision = function () {
  console.log('execute AA0100030button0.onDecision');
};
expj.AA0100030.AA0100030button0.executeOnLoad = function () {
  expj.AA0100030.AA0100030button0.executePScriptOnLoad();
};

expj.AA0100030.AA0100030button0.executePScriptOnLoad = function () {
  console.log('execute AA0100030button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0100030-AA0100030button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0100030-AA0100030button0-clear">
expj.AA0100030.AA0100030button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0100030Servlet,,$ZZ07008"
expj.AA0100030.AA0100030button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100030', 'AA0100030button0', '', 'AA0100030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100030', response);
expj.common.updateBusinessScreenTab('AA0100030', contents);
};
expj.common.pscript.callConfirm('AA0100030', 'AA0100030button0', 'ZZ07008', okEvent);
};
expj.AA0100030.AA0100030button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100030.AA0100030button0.clear['onClick' + i])) {
        expj.AA0100030.AA0100030button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0100030.AA0100030button0.clear.executeAllOnDecision = function () {
};
expj.AA0100030.AA0100030button0.clear.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100030', 'AA0100030button0', 'clear', this, 'Button');
    }
  });
  expj.AA0100030.AA0100030button0.clear.executePScriptOnLoad();
};

expj.AA0100030.AA0100030button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0100030button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100030-AA0100030button0-clear" name="clear" class="AA0100030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0100030-AA0100030button0-close">
expj.AA0100030.AA0100030button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0100030.AA0100030button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0100030');
};
expj.AA0100030.AA0100030button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100030.AA0100030button0.close['onClick' + i])) {
        expj.AA0100030.AA0100030button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0100030.AA0100030button0.close.executeAllOnDecision = function () {
};
expj.AA0100030.AA0100030button0.close.executeOnLoad = function () {
  $('#expj-AA0100030-AA0100030button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100030', 'AA0100030button0', 'close', this, 'Button');
    }
  });
  expj.AA0100030.AA0100030button0.close.executePScriptOnLoad();
};

expj.AA0100030.AA0100030button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0100030button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0100030-AA0100030button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100030-AA0100030button0-close" name="close" class="AA0100030-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0100030 (END)-->
<%
MessageStruct msgStruct = aAA0100030Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0100030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0100030)) {
  expj.common.treeInstanceMap.AA0100030 = {};
}
expj.common.treeInstanceMap.AA0100030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0100030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0100030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0100030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0100030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0100030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0100030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0100030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0100030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0100030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0100030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0100030)) {
  expj.common.detailDialogMap.AA0100030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0100030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0100030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0100030.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0100030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0100030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0100030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0100030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0100030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0100030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0100030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0100030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0100030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0100030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0100030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0100030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0100030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0100030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0100030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0100030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0100030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0100030)) {
  expj.common.viewInstanceMap.AA0100030 = {};
}
expj.common.viewInstanceMap.AA0100030.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0100030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0100030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0100030.<%=viewId %>.init = function () {
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
    expj.AA0100030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0100030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0100030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0100030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0100030_init">
/**
 * AA0100030用のロード完了時初期化関数
 */
expj.AA0100030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0100030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0100030');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0100030');
  expj.common.calendarInstanceMap.AA0100030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0100030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0100030.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0100030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0100030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0100030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0100030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0100030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0100030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0100030-<%=detailId %>');
<%
 }
%>
  try{expj.AA0100030.AA0100030form1.TAX_CD.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form1.PeekerTaxCd.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form1.h_TAX_CD.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.TAX_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.TAX_ANAME.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.OLD_TAX_RATE_1.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.OLD_TAX_RATE_2.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.OLD_TAX_RATE_3.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.NEW_TAX_RATE_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.calendar.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.NEW_TAX_RATE_1.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.NEW_TAX_RATE_2.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.NEW_TAX_RATE_3.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.ROUND_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.OLD_GL_TAX_CD.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.NEW_GL_TAX_CD.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030button2.insert.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030button2.update.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030button2.delete.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form1.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030button1.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030form2.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030button2.executeOnLoad();}catch(e){};
  try{expj.AA0100030.AA0100030button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0100030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0100030', 'AA0100030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0100030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0100030-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0100030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0100030', '<%=request.getContextPath() %>');
};

/**
 * AA0100030の全体onDecision処理
 */
expj.AA0100030.executeAllOnDecision = function () {
  expj.AA0100030.AA0100030form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0100030_console">
expj.AA0100030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>