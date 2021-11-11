<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:24:04 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0130\AA0130030.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0130.*" %>
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
<jsp:useBean id="aAA0130030Control" class="com.nec.jp.orteus.metamorBase.AA0130.AA0130030Control" scope="request"/>
<jsp:useBean id="aAA0130030Struct" class="com.nec.jp.orteus.metamorBase.AA0130.AA0130030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製品構成一括置換
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0130/jsp/AA0130030.jsp,v $
$Author: geng-jia $
$Revision: 1.18 $ $Date: 2017/02/22 02:04:04 $
********************************************************* --%>
<html>
<head>
<title>製品構成一括置換</title>
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
<script class="expj-script-AA0130030_init">
  // AA0130030名前空間
  expj.AA0130030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0130030" data-screen="AA0130030" data-newdata="<%=aAA0130030Control.isNewData() %>">
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
              <script class="expj-script-AA0130030-AA0130030form1">
expj.AA0130030.AA0130030form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AA0130030.AA0130030form1.onLoad0 = function () {
  console.log('AA0130030form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0130030.AA0130030form1.onDecision0 = function () {
  console.log('AA0130030form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0130030', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0130030button1/Select"
expj.AA0130030.AA0130030form1.child0 = function () {
  console.log('AA0130030form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button1/Select');
};
// script4="child;1;MASK;_AA0130030button1/Select"
expj.AA0130030.AA0130030form1.child1 = function () {
  console.log('AA0130030form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button1/Select');
};
// script5="onDecision;1;CHK;?AA0130030view3/*[eq]NORMAL[and]?AA0130030form1/Fr_ITEM_CD[eq]SAME[and]?AA0130030form1/TargetDate[eq]SAME@*2,*3"
expj.AA0130030.AA0130030form1.onDecision1 = function () {
  console.log('AA0130030form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030view3/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030form1/Fr_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030form1/TargetDate'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AA0130030button2/ParentCheckAll,_AA0130030button2/ParentCheckClear"
expj.AA0130030.AA0130030form1.child2 = function () {
  console.log('AA0130030form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button2/ParentCheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button2/ParentCheckClear');
};
// script7="child;3;MASK;_AA0130030button2/ParentCheckAll,_AA0130030button2/ParentCheckClear"
expj.AA0130030.AA0130030form1.child3 = function () {
  console.log('AA0130030form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button2/ParentCheckAll');
expj.common.pscript.setMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button2/ParentCheckClear');
};
// script8="onDecision;2;CHK;?AA0130030view4/*[eq]NORMAL[and]?AA0130030form1/Fr_ITEM_CD[eq]SAME[and]?AA0130030form1/TargetDate[eq]SAME@*4,*5"
expj.AA0130030.AA0130030form1.onDecision2 = function () {
  console.log('AA0130030form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030view4/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030form1/Fr_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030form1/TargetDate'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;4;UNMASK;_AA0130030button3/CompCheckAll,_AA0130030button3/CompCheckClear"
expj.AA0130030.AA0130030form1.child4 = function () {
  console.log('AA0130030form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button3/CompCheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button3/CompCheckClear');
};
// script10="child;5;MASK;_AA0130030button3/CompCheckAll,_AA0130030button3/CompCheckClear"
expj.AA0130030.AA0130030form1.child5 = function () {
  console.log('AA0130030form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button3/CompCheckAll');
expj.common.pscript.setMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button3/CompCheckClear');
};
// script11="onDecision;3;CHKRQ;A,B@*6,*10"
expj.AA0130030.AA0130030form1.onDecision3 = function () {
  console.log('AA0130030form1 script11');
if (expj.common.pscript.satisfiedRequiredComponent('AA0130030', 'A') && expj.common.pscript.satisfiedRequiredComponent('AA0130030', 'B')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script12="child;6;CHK;?AA0130030view3/*[eq]NORMAL[or]?AA0130030view4/*[eq]NORMAL@*7,*10"
expj.AA0130030.AA0130030form1.child6 = function () {
  console.log('AA0130030form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030view3/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030view4/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script13="child;7;CHK;?AA0130030form1/Fr_ITEM_CD[eq]SAME[and]?AA0130030form1/TargetDate[eq]SAME@*8,*10"
expj.AA0130030.AA0130030form1.child7 = function () {
  console.log('AA0130030form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030form1/Fr_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030form1/TargetDate'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script14="child;8;CHK;?AA0130030view3/?[neq]NOT_SELECTED[or]?AA0130030view4/?[neq]NOT_SELECTED@*9,*10"
expj.AA0130030.AA0130030form1.child8 = function () {
  console.log('AA0130030form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030view3/?'), '[neq]', 'NOT_SELECTED') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '?AA0130030view4/?'), '[neq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script15="child;9;UNMASK;_AA0130030button4/Update"
expj.AA0130030.AA0130030form1.child9 = function () {
  console.log('AA0130030form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button4/Update');
};
// script16="child;10;MASK;_AA0130030button4/Update"
expj.AA0130030.AA0130030form1.child10 = function () {
  console.log('AA0130030form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_AA0130030button4/Update');
};
expj.AA0130030.AA0130030form1.executeAllOnDecision = function () {
  console.log('execute AA0130030form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030form1['onDecision' + i])) {
        expj.AA0130030.AA0130030form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030form1.executeOnLoad = function () {
  expj.AA0130030.AA0130030form1.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form1.executePScriptOnLoad = function () {
  console.log('execute AA0130030form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0130030.AA0130030form1['onLoad' + i])) {
      expj.AA0130030.AA0130030form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0130030-AA0130030form1" action="AA0130030Servlet" name="AA0130030form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:175px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:83px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:175px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_9",rb)%></span><!-- 置換元品目番号 --></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030form1-Fr_ITEM_CD">
expj.AA0130030.AA0130030form1.Fr_ITEM_CD = {};
expj.AA0130030.AA0130030form1.Fr_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0130030form1/Fr_ITEM_CD.onDecision');
  expj.AA0130030.AA0130030form1.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030form1.Fr_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form1-Fr_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030form1', 'Fr_ITEM_CD', this);
  });
  expj.AA0130030.AA0130030form1.Fr_ITEM_CD.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form1.Fr_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0130030form1/Fr_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form1-Fr_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0130030-AA0130030form1-Fr_ITEM_CD" name="Fr_ITEM_CD" class="AA0130030-focus-move  required-value expj-AA0130030-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0130030Struct.getFr_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0130030-AA0130030form1-h_Fr_ITEM_CD" name="h_Fr_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130030Struct.geth_Fr_ITEM_CD()) %>">
<script class="expj-script-AA0130030-AA0130030form1-h_Fr_ITEM_CD">
expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD.onLoad0 = function () {
  console.log('h_Fr_ITEM_CD script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]''@*1,*2"
expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD.child0 = function () {
  console.log('h_Fr_ITEM_CD script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_Fr_ITEM_CD,_PeekerFrItemCd"
expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD.child1 = function () {
  console.log('h_Fr_ITEM_CD script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_Fr_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_PeekerFrItemCd');
};
// script4="child;2;MASK;_Fr_ITEM_CD,_PeekerFrItemCd"
expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD.child2 = function () {
  console.log('h_Fr_ITEM_CD script4');
expj.common.pscript.setMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_Fr_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_PeekerFrItemCd');
};
expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0130030form1/h_Fr_ITEM_CD.onDecision');
  expj.AA0130030.AA0130030form1.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form1-h_Fr_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030form1', 'h_Fr_ITEM_CD', this);
  });
  expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0130030form1/h_Fr_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form1-h_Fr_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD['onLoad' + i])) {
      expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0130030-AA0130030form1-PeekerFrItemCd">
expj.AA0130030.AA0130030form1.PeekerFrItemCd = {};
// script1="onClick;0;PEEKER;_AA0130030form1/Fr_ITEM_CD@<%=contextNo%>"
expj.AA0130030.AA0130030form1.PeekerFrItemCd.onClick0 = function () {
  console.log('PeekerFrItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0130030';
var parameterValues = 'PeekerFrItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '_Fr_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0130030form1/Fr_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0130030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0130030.AA0130030form1.PeekerFrItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030form1.PeekerFrItemCd['onClick' + i])) {
        expj.AA0130030.AA0130030form1.PeekerFrItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030form1.PeekerFrItemCd.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030form1.PeekerFrItemCd.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form1-PeekerFrItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030form1', 'PeekerFrItemCd', this, 'Button');
    }
  });
  expj.AA0130030.AA0130030form1.PeekerFrItemCd.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form1.PeekerFrItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0130030form1/PeekerFrItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form1-PeekerFrItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0130030-AA0130030form1-PeekerFrItemCd" class="AA0130030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030form1-Fr_ITEM_NAME">
expj.AA0130030.AA0130030form1.Fr_ITEM_NAME = {};
expj.AA0130030.AA0130030form1.Fr_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0130030form1/Fr_ITEM_NAME.onDecision');
  expj.AA0130030.AA0130030form1.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030form1.Fr_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form1-Fr_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030form1', 'Fr_ITEM_NAME', this);
  });
  expj.AA0130030.AA0130030form1.Fr_ITEM_NAME.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form1.Fr_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0130030form1/Fr_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form1-Fr_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0130030-AA0130030form1-Fr_ITEM_NAME" name="Fr_ITEM_NAME" class="AA0130030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0130030Struct.getFr_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:83px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:175px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_3",rb)%></span><!-- 対象日付 --></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030form1-TargetDate">
expj.AA0130030.AA0130030form1.TargetDate = {};
expj.AA0130030.AA0130030form1.TargetDate.executeAllOnDecision = function () {
  console.log('execute AA0130030form1/TargetDate.onDecision');
  expj.AA0130030.AA0130030form1.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030form1.TargetDate.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form1-TargetDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030form1', 'TargetDate', this);
  });
  expj.AA0130030.AA0130030form1.TargetDate.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form1.TargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0130030form1/TargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form1-TargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130030-AA0130030form1-TargetDate" name="TargetDate" class="AA0130030-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0130030Struct.getTargetDate()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030form1-CalendarTargetDate">
expj.AA0130030.AA0130030form1.CalendarTargetDate = {};
// script1="onClick;0;CALENDAR;_AA0130030form1/TargetDate"
expj.AA0130030.AA0130030form1.CalendarTargetDate.onClick0 = function () {
  console.log('CalendarTargetDate script1');
expj.common.pscript.executeCalendar('AA0130030','AA0130030form1','_AA0130030form1/TargetDate');
};
expj.AA0130030.AA0130030form1.CalendarTargetDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030form1.CalendarTargetDate['onClick' + i])) {
        expj.AA0130030.AA0130030form1.CalendarTargetDate['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030form1.CalendarTargetDate.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030form1.CalendarTargetDate.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form1-CalendarTargetDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030form1', 'CalendarTargetDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0130030','AA0130030form1','_AA0130030form1/TargetDate');
  expj.AA0130030.AA0130030form1.CalendarTargetDate.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form1.CalendarTargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0130030form1/CalendarTargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form1-CalendarTargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0130030-AA0130030form1-CalendarTargetDate" class="AA0130030-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-AA0130030-AA0130030form1-h_TargetDate" name="h_TargetDate" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130030Struct.geth_TargetDate()) %>">
<script class="expj-script-AA0130030-AA0130030form1-h_TargetDate">
expj.AA0130030.AA0130030form1.h_TargetDate = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0130030.AA0130030form1.h_TargetDate.onLoad0 = function () {
  console.log('h_TargetDate script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]''@*1,*2"
expj.AA0130030.AA0130030form1.h_TargetDate.child0 = function () {
  console.log('h_TargetDate script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_TargetDate,_CalendarTargetDate"
expj.AA0130030.AA0130030form1.h_TargetDate.child1 = function () {
  console.log('h_TargetDate script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_TargetDate');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_CalendarTargetDate');
};
// script4="child;2;MASK;_TargetDate,_CalendarTargetDate"
expj.AA0130030.AA0130030form1.h_TargetDate.child2 = function () {
  console.log('h_TargetDate script4');
expj.common.pscript.setMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_TargetDate');
expj.common.pscript.setMaskToReferenceComponent('AA0130030', 'AA0130030form1', '_CalendarTargetDate');
};
expj.AA0130030.AA0130030form1.h_TargetDate.executeAllOnDecision = function () {
  console.log('execute AA0130030form1/h_TargetDate.onDecision');
  expj.AA0130030.AA0130030form1.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030form1.h_TargetDate.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form1-h_TargetDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030form1', 'h_TargetDate', this);
  });
  expj.AA0130030.AA0130030form1.h_TargetDate.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form1.h_TargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0130030form1/h_TargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form1-h_TargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0130030.AA0130030form1.h_TargetDate['onLoad' + i])) {
      expj.AA0130030.AA0130030form1.h_TargetDate['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0130030-AA0130030form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130030Struct.geth_PLANT_CD()) %>">
<script class="expj-script-AA0130030-AA0130030form1-h_PLANT_CD">
expj.AA0130030.AA0130030form1.h_PLANT_CD = {};
expj.AA0130030.AA0130030form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AA0130030form1/h_PLANT_CD.onDecision');
  expj.AA0130030.AA0130030form1.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030form1', 'h_PLANT_CD', this);
  });
  expj.AA0130030.AA0130030form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AA0130030form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form1-h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:83px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0130030-AA0130030button1">
expj.AA0130030.AA0130030button1 = {};
expj.AA0130030.AA0130030button1.executeAllOnDecision = function () {
  console.log('execute AA0130030button1.onDecision');
};
expj.AA0130030.AA0130030button1.executeOnLoad = function () {
  expj.AA0130030.AA0130030button1.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button1.executePScriptOnLoad = function () {
  console.log('execute AA0130030button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0130030-AA0130030button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0130030-AA0130030button1-Select">
expj.AA0130030.AA0130030button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0130030form1/*,_AA0130030form2/ReplaceDate@AA0130030Servlet"
expj.AA0130030.AA0130030button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0130030', 'AA0130030button1', '_AA0130030form1/*,_AA0130030form2/ReplaceDate', 'AA0130030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0130030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0130030', response);
expj.common.updateBusinessScreenTab('AA0130030', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0130030.AA0130030button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030button1.Select['onClick' + i])) {
        expj.AA0130030.AA0130030button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030button1.Select.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030button1.Select.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030button1', 'Select', this, 'Button');
    }
  });
  expj.AA0130030.AA0130030button1.Select.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button1.Select.executePScriptOnLoad = function () {
  console.log('execute AA0130030button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130030-AA0130030button1-Select" name="Select" class="AA0130030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td "></div><!--/td-->
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;">
<div class="expj-td frame04" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);float:left;"><script class="expj-script-AA0130030-AA0130030view1">
expj.AA0130030.AA0130030view1 = {};
expj.AA0130030.AA0130030view1.executeAllOnClick = function () {
};
expj.AA0130030.AA0130030view1.executeAllOnDecision = function () {
  console.log('execute AA0130030view1.onDecision');
};
expj.AA0130030.AA0130030view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0130030view1", "expj.AA0130030.AA0130030view1.executeAllOnClick");
%>
  expj.AA0130030.AA0130030view1.executePScriptOnLoad();
};

expj.AA0130030.AA0130030view1.executePScriptOnLoad = function () {
  console.log('execute AA0130030view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0130030-AA0130030view1" class="expj-datagrid-view expj-view-noselect expj-view-headeronly" style="width:100%;height:23px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0130030view1_Id = "AA0130030view1";
 String AA0130030view1_select = "single";
 String AA0130030view1_sortable = "true";
 String AA0130030view1_resize = "true";
 String AA0130030view1_scroll = "true";
 StringBuffer AA0130030view1_HB = new StringBuffer();
 StringBuffer AA0130030view1_DB = new StringBuffer();
%>
<%
 AA0130030view1_select = "none";
 AA0130030view1_sortable = "false";
 AA0130030view1_resize = "false";
 AA0130030view1_scroll = "false";
%>
<%
 AA0130030view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0130030view1_sortable).append("}").append(",");
%>
 
<%
AA0130030view1_HB.append("{'visible':true, 'type':'string', 'width':'465px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0226",rb))).append("', 'name':'', 'class':'expj-tooltip ', 'sortable':").append(AA0130030view1_sortable).append("}").append(",");
%>
<%
 int aAA0130030StructLength = aAA0130030Control.getListsize();
 final AA0130030Struct structBackup = aAA0130030Struct;
 aAA0130030Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0130030StructLength; ++loopCount) {
  if((aAA0130030Struct = (AA0130030Struct) aAA0130030Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0130030Struct", aAA0130030Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
if (loopCount + 1 < aAA0130030StructLength) {
  }
 }
 aAA0130030Struct = structBackup;
 viewIdList.add(AA0130030view1_Id);
 viewSelectList.add(AA0130030view1_select);
 viewResizeList.add(AA0130030view1_resize);
 viewScrollList.add(AA0130030view1_scroll);
 viewHeaderDataList.add(AA0130030view1_HB);
 viewBodyDataList.add(AA0130030view1_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td widthLinePartition" style="height:23px;float:left;"></div><!--/td-->
<div class="expj-td frame04" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);float:left;"><script class="expj-script-AA0130030-AA0130030view2">
expj.AA0130030.AA0130030view2 = {};
expj.AA0130030.AA0130030view2.executeAllOnClick = function () {
};
expj.AA0130030.AA0130030view2.executeAllOnDecision = function () {
  console.log('execute AA0130030view2.onDecision');
};
expj.AA0130030.AA0130030view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0130030view2", "expj.AA0130030.AA0130030view2.executeAllOnClick");
%>
  expj.AA0130030.AA0130030view2.executePScriptOnLoad();
};

expj.AA0130030.AA0130030view2.executePScriptOnLoad = function () {
  console.log('execute AA0130030view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0130030-AA0130030view2" class="expj-datagrid-view expj-view-noselect expj-view-headeronly" style="width:100%;height:23px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0130030view2_Id = "AA0130030view2";
 String AA0130030view2_select = "single";
 String AA0130030view2_sortable = "true";
 String AA0130030view2_resize = "true";
 String AA0130030view2_scroll = "true";
 StringBuffer AA0130030view2_HB = new StringBuffer();
 StringBuffer AA0130030view2_DB = new StringBuffer();
%>
<%
 AA0130030view2_select = "none";
 AA0130030view2_sortable = "false";
 AA0130030view2_resize = "false";
 AA0130030view2_scroll = "false";
%>
<%
 AA0130030view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0130030view2_sortable).append("}").append(",");
%>
 
<%
AA0130030view2_HB.append("{'visible':true, 'type':'string', 'width':'465px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0227",rb))).append("', 'name':'', 'class':'expj-tooltip ', 'sortable':").append(AA0130030view2_sortable).append("}").append(",");
%>
<%
 int aAA0130030StructLength = aAA0130030Control.getListsize();
 final AA0130030Struct structBackup = aAA0130030Struct;
 aAA0130030Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0130030StructLength; ++loopCount) {
  if((aAA0130030Struct = (AA0130030Struct) aAA0130030Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0130030Struct", aAA0130030Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
if (loopCount + 1 < aAA0130030StructLength) {
  }
 }
 aAA0130030Struct = structBackup;
 viewIdList.add(AA0130030view2_Id);
 viewSelectList.add(AA0130030view2_select);
 viewResizeList.add(AA0130030view2_resize);
 viewScrollList.add(AA0130030view2_scroll);
 viewHeaderDataList.add(AA0130030view2_HB);
 viewBodyDataList.add(AA0130030view2_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;float:left;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);height:calc(100% - 23px);float:left;"><script class="expj-script-AA0130030-AA0130030view3">
expj.AA0130030.AA0130030view3 = {};
expj.AA0130030.AA0130030view3.executeAllOnClick = function () {
};
expj.AA0130030.AA0130030view3.executeAllOnDecision = function () {
  console.log('execute AA0130030view3.onDecision');
};
expj.AA0130030.AA0130030view3.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0130030view3", "expj.AA0130030.AA0130030view3.executeAllOnClick");
%>
  expj.AA0130030.AA0130030view3.executePScriptOnLoad();
};

expj.AA0130030.AA0130030view3.executePScriptOnLoad = function () {
  console.log('execute AA0130030view3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0130030-AA0130030view3" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAA0130030Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AA0130030view3_Id = "AA0130030view3";
 String AA0130030view3_select = "single";
 String AA0130030view3_sortable = "true";
 String AA0130030view3_resize = "true";
 String AA0130030view3_scroll = "true";
 StringBuffer AA0130030view3_HB = new StringBuffer();
 StringBuffer AA0130030view3_DB = new StringBuffer();
%>
<%
 AA0130030view3_select = "multi";
 AA0130030view3_sortable = "true";
 AA0130030view3_resize = "true";
 AA0130030view3_scroll = "true";
%>
<%
 AA0130030view3_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0130030view3_sortable).append("}").append(",");
%>
 
   <script class="expj-script-AA0130030-AA0130030view3-h_FrParent_MODIFY_COUNT">
expj.AA0130030.AA0130030view3.h_FrParent_MODIFY_COUNT = {};
expj.AA0130030.AA0130030view3.h_FrParent_MODIFY_COUNT.executeAllOnClick = function () {
};
expj.AA0130030.AA0130030view3.h_FrParent_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0130030view3/h_FrParent_MODIFY_COUNT.onDecision');
  expj.AA0130030.AA0130030view3.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030view3.h_FrParent_MODIFY_COUNT.executeOnLoad = function () {
  $('.expj-AA0130030-AA0130030view3-h_FrParent_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030view3', 'h_FrParent_MODIFY_COUNT', this);
  });
  expj.AA0130030.AA0130030view3.h_FrParent_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0130030.AA0130030view3.h_FrParent_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0130030view3/h_FrParent_MODIFY_COUNT.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>

<%
AA0130030view3_HB.append("{'visible':true, 'type':'string', 'width':'116px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'FrParent_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0130030view3_sortable).append("}").append(",");
AA0130030view3_HB.append("{'visible':true, 'type':'string', 'width':'35px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_EDITION_3",rb))).append("', 'name':'FrParent_PS_EDITION', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0130030view3_sortable).append("}").append(",");
AA0130030view3_HB.append("{'visible':true, 'type':'string', 'width':'164px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'FrParent_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0130030view3_sortable).append("}").append(",");
AA0130030view3_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb))).append("', 'name':'FrParent_EFF_PHASE_IN_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0130030view3_sortable).append("}").append(",");
AA0130030view3_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE",rb))).append("', 'name':'FrParent_EFF_PHASE_OUT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0130030view3_sortable).append("}").append(",");
AA0130030view3_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_FrParent_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0130030view3_sortable).append("}").append(",");
%>
<%
 int aAA0130030StructLength = aAA0130030Control.getListsize();
 final AA0130030Struct structBackup = aAA0130030Struct;
 aAA0130030Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0130030StructLength; ++loopCount) {
  if((aAA0130030Struct = (AA0130030Struct) aAA0130030Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0130030Struct", aAA0130030Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0130030view3_DB.append("[");
 AA0130030view3_DB.append(loopCount);
 AA0130030view3_DB.append(",").append("'<span id=\"expj-AA0130030-AA0130030view3-FrParent_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0130030-AA0130030view3-FrParent_ITEM_CD\" data-name=\"FrParent_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0130030Struct.getFrParent_ITEM_CD())).append("</span>'");
 AA0130030view3_DB.append(",").append("'<span id=\"expj-AA0130030-AA0130030view3-FrParent_PS_EDITION-").append(loopCount).append("\" class=\"expj-label expj-AA0130030-AA0130030view3-FrParent_PS_EDITION\" data-name=\"FrParent_PS_EDITION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0130030Struct.getFrParent_PS_EDITION())).append("</span>'");
 AA0130030view3_DB.append(",").append("'<span id=\"expj-AA0130030-AA0130030view3-FrParent_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0130030-AA0130030view3-FrParent_ITEM_NAME\" data-name=\"FrParent_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0130030Struct.getFrParent_ITEM_NAME())).append("</span>'");
 AA0130030view3_DB.append(",").append("'<span id=\"expj-AA0130030-AA0130030view3-FrParent_EFF_PHASE_IN_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0130030-AA0130030view3-FrParent_EFF_PHASE_IN_DATE\" data-name=\"FrParent_EFF_PHASE_IN_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0130030Struct.getFrParent_EFF_PHASE_IN_DATE())).append("</span>'");
 AA0130030view3_DB.append(",").append("'<span id=\"expj-AA0130030-AA0130030view3-FrParent_EFF_PHASE_OUT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0130030-AA0130030view3-FrParent_EFF_PHASE_OUT_DATE\" data-name=\"FrParent_EFF_PHASE_OUT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0130030Struct.getFrParent_EFF_PHASE_OUT_DATE())).append("</span>'");
 AA0130030view3_DB.append(",").append("'<input type=\"text\" id=\"expj-AA0130030-AA0130030view3-h_FrParent_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-AA0130030-AA0130030view3-h_FrParent_MODIFY_COUNT AA0130030-focus-move\" data-name=\"h_FrParent_MODIFY_COUNT\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAA0130030Struct.geth_FrParent_MODIFY_COUNT())).append("\">'");
 AA0130030view3_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0130030StructLength) {
   AA0130030view3_DB.append(",");
  }
 }
 aAA0130030Struct = structBackup;
 viewIdList.add(AA0130030view3_Id);
 viewSelectList.add(AA0130030view3_select);
 viewResizeList.add(AA0130030view3_resize);
 viewScrollList.add(AA0130030view3_scroll);
 viewHeaderDataList.add(AA0130030view3_HB);
 viewBodyDataList.add(AA0130030view3_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="float:left;"></div><!--/td-->
<div class="expj-td widthLinePartition" style="height:calc(100% - 23px);float:left;"></div><!--/td-->
<div class="expj-td frame04" style="float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);height:calc(100% - 23px);float:left;"><script class="expj-script-AA0130030-AA0130030view4">
expj.AA0130030.AA0130030view4 = {};
expj.AA0130030.AA0130030view4.executeAllOnClick = function () {
};
expj.AA0130030.AA0130030view4.executeAllOnDecision = function () {
  console.log('execute AA0130030view4.onDecision');
};
expj.AA0130030.AA0130030view4.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0130030view4", "expj.AA0130030.AA0130030view4.executeAllOnClick");
%>
  expj.AA0130030.AA0130030view4.executePScriptOnLoad();
};

expj.AA0130030.AA0130030view4.executePScriptOnLoad = function () {
  console.log('execute AA0130030view4.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0130030-AA0130030view4" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAA0130030Control.getReadCompStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AA0130030view4_Id = "AA0130030view4";
 String AA0130030view4_select = "single";
 String AA0130030view4_sortable = "true";
 String AA0130030view4_resize = "true";
 String AA0130030view4_scroll = "true";
 StringBuffer AA0130030view4_HB = new StringBuffer();
 StringBuffer AA0130030view4_DB = new StringBuffer();
%>
<%
 AA0130030view4_select = "multi";
 AA0130030view4_sortable = "true";
 AA0130030view4_resize = "true";
 AA0130030view4_scroll = "true";
%>
<%
 AA0130030view4_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0130030view4_sortable).append("}").append(",");
%>
 
    <script class="expj-script-AA0130030-AA0130030view4-h_FrComp_MODIFY_COUNT">
expj.AA0130030.AA0130030view4.h_FrComp_MODIFY_COUNT = {};
expj.AA0130030.AA0130030view4.h_FrComp_MODIFY_COUNT.executeAllOnClick = function () {
};
expj.AA0130030.AA0130030view4.h_FrComp_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0130030view4/h_FrComp_MODIFY_COUNT.onDecision');
  expj.AA0130030.AA0130030view4.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030view4.h_FrComp_MODIFY_COUNT.executeOnLoad = function () {
  $('.expj-AA0130030-AA0130030view4-h_FrComp_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030view4', 'h_FrComp_MODIFY_COUNT', this);
  });
  expj.AA0130030.AA0130030view4.h_FrComp_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0130030.AA0130030view4.h_FrComp_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0130030view4/h_FrComp_MODIFY_COUNT.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
                  List listBackup = aAA0130030Control.getList();
                  aAA0130030Control.setList(aAA0130030Control.getCompList());
                %>
 <%
AA0130030view4_HB.append("{'visible':true, 'type':'string', 'width':'116px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'FrComp_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0130030view4_sortable).append("}").append(",");
AA0130030view4_HB.append("{'visible':true, 'type':'string', 'width':'35px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_EDITION_3",rb))).append("', 'name':'FrComp_PS_EDITION', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0130030view4_sortable).append("}").append(",");
AA0130030view4_HB.append("{'visible':true, 'type':'string', 'width':'164px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'FrComp_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0130030view4_sortable).append("}").append(",");
AA0130030view4_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb))).append("', 'name':'FrComp_EFF_PHASE_IN_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0130030view4_sortable).append("}").append(",");
AA0130030view4_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE",rb))).append("', 'name':'FrComp_EFF_PHASE_OUT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0130030view4_sortable).append("}").append(",");
AA0130030view4_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_FrComp_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0130030view4_sortable).append("}").append(",");
%>
<%
 int aAA0130030StructLength = aAA0130030Control.getListsize();
 final AA0130030Struct structBackup = aAA0130030Struct;
 aAA0130030Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0130030StructLength; ++loopCount) {
  if((aAA0130030Struct = (AA0130030Struct) aAA0130030Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0130030Struct", aAA0130030Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0130030view4_DB.append("[");
 AA0130030view4_DB.append(loopCount);
 AA0130030view4_DB.append(",").append("'<span id=\"expj-AA0130030-AA0130030view4-FrComp_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0130030-AA0130030view4-FrComp_ITEM_CD\" data-name=\"FrComp_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0130030Struct.getFrComp_ITEM_CD())).append("</span>'");
 AA0130030view4_DB.append(",").append("'<span id=\"expj-AA0130030-AA0130030view4-FrComp_PS_EDITION-").append(loopCount).append("\" class=\"expj-label expj-AA0130030-AA0130030view4-FrComp_PS_EDITION\" data-name=\"FrComp_PS_EDITION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0130030Struct.getFrComp_PS_EDITION())).append("</span>'");
 AA0130030view4_DB.append(",").append("'<span id=\"expj-AA0130030-AA0130030view4-FrComp_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0130030-AA0130030view4-FrComp_ITEM_NAME\" data-name=\"FrComp_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0130030Struct.getFrComp_ITEM_NAME())).append("</span>'");
 AA0130030view4_DB.append(",").append("'<span id=\"expj-AA0130030-AA0130030view4-FrComp_EFF_PHASE_IN_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0130030-AA0130030view4-FrComp_EFF_PHASE_IN_DATE\" data-name=\"FrComp_EFF_PHASE_IN_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0130030Struct.getFrComp_EFF_PHASE_IN_DATE())).append("</span>'");
 AA0130030view4_DB.append(",").append("'<span id=\"expj-AA0130030-AA0130030view4-FrComp_EFF_PHASE_OUT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0130030-AA0130030view4-FrComp_EFF_PHASE_OUT_DATE\" data-name=\"FrComp_EFF_PHASE_OUT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0130030Struct.getFrComp_EFF_PHASE_OUT_DATE())).append("</span>'");
 AA0130030view4_DB.append(",").append("'<input type=\"text\" id=\"expj-AA0130030-AA0130030view4-h_FrComp_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-AA0130030-AA0130030view4-h_FrComp_MODIFY_COUNT AA0130030-focus-move\" data-name=\"h_FrComp_MODIFY_COUNT\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAA0130030Struct.geth_FrComp_MODIFY_COUNT())).append("\">'");
 AA0130030view4_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0130030StructLength) {
   AA0130030view4_DB.append(",");
  }
 }
 aAA0130030Struct = structBackup;
 viewIdList.add(AA0130030view4_Id);
 viewSelectList.add(AA0130030view4_select);
 viewResizeList.add(AA0130030view4_resize);
 viewScrollList.add(AA0130030view4_scroll);
 viewHeaderDataList.add(AA0130030view4_HB);
 viewBodyDataList.add(AA0130030view4_DB);
%>
 <%
                  aAA0130030Control.setList(listBackup);
                %>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="float:left;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field two-view-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area for-two-button" style="width:210px;height:32px;"><script class="expj-script-AA0130030-AA0130030button2">
expj.AA0130030.AA0130030button2 = {};
expj.AA0130030.AA0130030button2.executeAllOnDecision = function () {
  console.log('execute AA0130030button2.onDecision');
};
expj.AA0130030.AA0130030button2.executeOnLoad = function () {
  expj.AA0130030.AA0130030button2.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button2.executePScriptOnLoad = function () {
  console.log('execute AA0130030button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0130030-AA0130030button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0130030-AA0130030button2-ParentCheckAll">
expj.AA0130030.AA0130030button2.ParentCheckAll = {};
// script1="onClick;0;DGSALL;AA0130030view3"
expj.AA0130030.AA0130030button2.ParentCheckAll.onClick0 = function () {
  console.log('ParentCheckAll script1');
expj.common.pscript.selectVIEWAllRow('AA0130030', 'AA0130030view3');
};
expj.AA0130030.AA0130030button2.ParentCheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030button2.ParentCheckAll['onClick' + i])) {
        expj.AA0130030.AA0130030button2.ParentCheckAll['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030button2.ParentCheckAll.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030button2.ParentCheckAll.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030button2-ParentCheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030button2', 'ParentCheckAll', this, 'Button');
    }
  });
  expj.AA0130030.AA0130030button2.ParentCheckAll.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button2.ParentCheckAll.executePScriptOnLoad = function () {
  console.log('execute AA0130030button2/ParentCheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030button2-ParentCheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130030-AA0130030button2-ParentCheckAll" name="ParentCheckAll" class="AA0130030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030button2-ParentCheckClear">
expj.AA0130030.AA0130030button2.ParentCheckClear = {};
// script1="onClick;0;DGSCANCEL;AA0130030view3"
expj.AA0130030.AA0130030button2.ParentCheckClear.onClick0 = function () {
  console.log('ParentCheckClear script1');
expj.common.pscript.unselectVIEWAllRow('AA0130030', 'AA0130030view3');
};
expj.AA0130030.AA0130030button2.ParentCheckClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030button2.ParentCheckClear['onClick' + i])) {
        expj.AA0130030.AA0130030button2.ParentCheckClear['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030button2.ParentCheckClear.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030button2.ParentCheckClear.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030button2-ParentCheckClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030button2', 'ParentCheckClear', this, 'Button');
    }
  });
  expj.AA0130030.AA0130030button2.ParentCheckClear.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button2.ParentCheckClear.executePScriptOnLoad = function () {
  console.log('execute AA0130030button2/ParentCheckClear.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030button2-ParentCheckClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130030-AA0130030button2-ParentCheckClear" name="ParentCheckClear" class="AA0130030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(50vw - 103px - 210px);height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell widthLinePartition widthResizeLinePartition" style="height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area for-two-button" style="width:210px;height:32px;"><script class="expj-script-AA0130030-AA0130030button3">
expj.AA0130030.AA0130030button3 = {};
expj.AA0130030.AA0130030button3.executeAllOnDecision = function () {
  console.log('execute AA0130030button3.onDecision');
};
expj.AA0130030.AA0130030button3.executeOnLoad = function () {
  expj.AA0130030.AA0130030button3.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button3.executePScriptOnLoad = function () {
  console.log('execute AA0130030button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0130030-AA0130030button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0130030-AA0130030button3-CompCheckAll">
expj.AA0130030.AA0130030button3.CompCheckAll = {};
// script1="onClick;0;DGSALL;AA0130030view4"
expj.AA0130030.AA0130030button3.CompCheckAll.onClick0 = function () {
  console.log('CompCheckAll script1');
expj.common.pscript.selectVIEWAllRow('AA0130030', 'AA0130030view4');
};
expj.AA0130030.AA0130030button3.CompCheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030button3.CompCheckAll['onClick' + i])) {
        expj.AA0130030.AA0130030button3.CompCheckAll['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030button3.CompCheckAll.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030button3.CompCheckAll.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030button3-CompCheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030button3', 'CompCheckAll', this, 'Button');
    }
  });
  expj.AA0130030.AA0130030button3.CompCheckAll.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button3.CompCheckAll.executePScriptOnLoad = function () {
  console.log('execute AA0130030button3/CompCheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030button3-CompCheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130030-AA0130030button3-CompCheckAll" name="CompCheckAll" class="AA0130030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030button3-CompCheckClear">
expj.AA0130030.AA0130030button3.CompCheckClear = {};
// script1="onClick;0;DGSCANCEL;AA0130030view4"
expj.AA0130030.AA0130030button3.CompCheckClear.onClick0 = function () {
  console.log('CompCheckClear script1');
expj.common.pscript.unselectVIEWAllRow('AA0130030', 'AA0130030view4');
};
expj.AA0130030.AA0130030button3.CompCheckClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030button3.CompCheckClear['onClick' + i])) {
        expj.AA0130030.AA0130030button3.CompCheckClear['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030button3.CompCheckClear.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030button3.CompCheckClear.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030button3-CompCheckClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030button3', 'CompCheckClear', this, 'Button');
    }
  });
  expj.AA0130030.AA0130030button3.CompCheckClear.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button3.CompCheckClear.executePScriptOnLoad = function () {
  console.log('execute AA0130030button3/CompCheckClear.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030button3-CompCheckClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130030-AA0130030button3-CompCheckClear" name="CompCheckClear" class="AA0130030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(50vw - 103px - 210px);height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;height:32px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AA0130030-AA0130030form2">
expj.AA0130030.AA0130030form2 = {};
expj.AA0130030.AA0130030form2.executeAllOnDecision = function () {
  console.log('execute AA0130030form2.onDecision');
};
expj.AA0130030.AA0130030form2.executeOnLoad = function () {
  expj.AA0130030.AA0130030form2.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form2.executePScriptOnLoad = function () {
  console.log('execute AA0130030form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0130030-AA0130030form2" action="AA0130030Servlet" name="AA0130030form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_10",rb)%></span><!-- 置換先品目番号 --></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030form2-To_ITEM_CD">
expj.AA0130030.AA0130030form2.To_ITEM_CD = {};
expj.AA0130030.AA0130030form2.To_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0130030form2/To_ITEM_CD.onDecision');
  expj.AA0130030.AA0130030form2.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030form2.To_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form2-To_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030form2', 'To_ITEM_CD', this);
  });
  expj.AA0130030.AA0130030form2.To_ITEM_CD.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form2.To_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0130030form2/To_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form2-To_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0130030-AA0130030form2-To_ITEM_CD" name="To_ITEM_CD" class="AA0130030-focus-move  required-value expj-AA0130030-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0130030Struct.getTo_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030form2-PeekerToItemCd">
expj.AA0130030.AA0130030form2.PeekerToItemCd = {};
// script1="onClick;0;PEEKER;_AA0130030form2/To_ITEM_CD@<%=contextNo%>"
expj.AA0130030.AA0130030form2.PeekerToItemCd.onClick0 = function () {
  console.log('PeekerToItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0130030';
var parameterValues = 'PeekerToItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030form2', '_To_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0130030form2/To_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0130030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0130030.AA0130030form2.PeekerToItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030form2.PeekerToItemCd['onClick' + i])) {
        expj.AA0130030.AA0130030form2.PeekerToItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030form2.PeekerToItemCd.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030form2.PeekerToItemCd.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form2-PeekerToItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030form2', 'PeekerToItemCd', this, 'Button');
    }
  });
  expj.AA0130030.AA0130030form2.PeekerToItemCd.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form2.PeekerToItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0130030form2/PeekerToItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form2-PeekerToItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0130030-AA0130030form2-PeekerToItemCd" class="AA0130030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030form2-To_ITEM_NAME">
expj.AA0130030.AA0130030form2.To_ITEM_NAME = {};
expj.AA0130030.AA0130030form2.To_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0130030form2/To_ITEM_NAME.onDecision');
  expj.AA0130030.AA0130030form2.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030form2.To_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form2-To_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030form2', 'To_ITEM_NAME', this);
  });
  expj.AA0130030.AA0130030form2.To_ITEM_NAME.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form2.To_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0130030form2/To_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form2-To_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0130030-AA0130030form2-To_ITEM_NAME" name="To_ITEM_NAME" class="AA0130030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0130030Struct.getTo_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_5",rb)%></span><!-- 置換日付 --></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030form2-ReplaceDate">
expj.AA0130030.AA0130030form2.ReplaceDate = {};
expj.AA0130030.AA0130030form2.ReplaceDate.executeAllOnDecision = function () {
  console.log('execute AA0130030form2/ReplaceDate.onDecision');
  expj.AA0130030.AA0130030form2.executeAllOnDecision();
  expj.AA0130030.executeAllOnDecision();
};
expj.AA0130030.AA0130030form2.ReplaceDate.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form2-ReplaceDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130030', 'AA0130030form2', 'ReplaceDate', this);
  });
  expj.AA0130030.AA0130030form2.ReplaceDate.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form2.ReplaceDate.executePScriptOnLoad = function () {
  console.log('execute AA0130030form2/ReplaceDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form2-ReplaceDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130030-AA0130030form2-ReplaceDate" name="ReplaceDate" class="AA0130030-focus-move  required-value expj-AA0130030-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0130030Struct.getReplaceDate()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030form2-CalendarReplaceDate">
expj.AA0130030.AA0130030form2.CalendarReplaceDate = {};
// script1="onClick;0;CALENDAR;_AA0130030form2/ReplaceDate"
expj.AA0130030.AA0130030form2.CalendarReplaceDate.onClick0 = function () {
  console.log('CalendarReplaceDate script1');
expj.common.pscript.executeCalendar('AA0130030','AA0130030form2','_AA0130030form2/ReplaceDate');
};
expj.AA0130030.AA0130030form2.CalendarReplaceDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030form2.CalendarReplaceDate['onClick' + i])) {
        expj.AA0130030.AA0130030form2.CalendarReplaceDate['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030form2.CalendarReplaceDate.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030form2.CalendarReplaceDate.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030form2-CalendarReplaceDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030form2', 'CalendarReplaceDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0130030','AA0130030form2','_AA0130030form2/ReplaceDate');
  expj.AA0130030.AA0130030form2.CalendarReplaceDate.executePScriptOnLoad();
};

expj.AA0130030.AA0130030form2.CalendarReplaceDate.executePScriptOnLoad = function () {
  console.log('execute AA0130030form2/CalendarReplaceDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030form2-CalendarReplaceDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0130030-AA0130030form2-CalendarReplaceDate" class="AA0130030-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0130030-AA0130030button4">
expj.AA0130030.AA0130030button4 = {};
expj.AA0130030.AA0130030button4.executeAllOnDecision = function () {
  console.log('execute AA0130030button4.onDecision');
};
expj.AA0130030.AA0130030button4.executeOnLoad = function () {
  expj.AA0130030.AA0130030button4.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button4.executePScriptOnLoad = function () {
  console.log('execute AA0130030button4.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0130030-AA0130030button4" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0130030-AA0130030button4-Update">
expj.AA0130030.AA0130030button4.Update = {};
// script1="onClick;0;CHK;_AA0130030form1/Fr_ITEM_CD[eq]_AA0130030form2/To_ITEM_CD@#AA00051"
expj.AA0130030.AA0130030button4.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030button4', '_AA0130030form1/Fr_ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0130030', 'AA0130030button4', '_AA0130030form2/To_ITEM_CD'))) {
expj.common.pscript.addErrorMessage('AA0130030', 'AA0130030button4', 'AA00051');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0130030form1/*,_AA0130030view3/+,_AA0130030view4/+,_AA0130030form2/*@AA0130030Servlet,,$ZZ07003"
expj.AA0130030.AA0130030button4.Update.onClick1 = function () {
  console.log('Update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0130030', 'AA0130030button4', '_AA0130030form1/*,_AA0130030view3/+,_AA0130030view4/+,_AA0130030form2/*', 'AA0130030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0130030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0130030', response);
expj.common.updateBusinessScreenTab('AA0130030', contents);
};
expj.common.pscript.callConfirm('AA0130030', 'AA0130030button4', 'ZZ07003', okEvent);
};
expj.AA0130030.AA0130030button4.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030button4.Update['onClick' + i])) {
        expj.AA0130030.AA0130030button4.Update['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030button4.Update.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030button4.Update.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030button4-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030button4', 'Update', this, 'Button');
    }
  });
  expj.AA0130030.AA0130030button4.Update.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button4.Update.executePScriptOnLoad = function () {
  console.log('execute AA0130030button4/Update.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030button4-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130030-AA0130030button4-Update" name="Update" class="AA0130030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0130030 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0130030-AA0130030button0">
expj.AA0130030.AA0130030button0 = {};
expj.AA0130030.AA0130030button0.executeAllOnDecision = function () {
  console.log('execute AA0130030button0.onDecision');
};
expj.AA0130030.AA0130030button0.executeOnLoad = function () {
  expj.AA0130030.AA0130030button0.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button0.executePScriptOnLoad = function () {
  console.log('execute AA0130030button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0130030-AA0130030button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0130030-AA0130030button0-Clear">
expj.AA0130030.AA0130030button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0130030form1/*@AA0130030Servlet,,$ZZ07008"
expj.AA0130030.AA0130030button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0130030', 'AA0130030button0', '_AA0130030form1/*', 'AA0130030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0130030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0130030', response);
expj.common.updateBusinessScreenTab('AA0130030', contents);
};
expj.common.pscript.callConfirm('AA0130030', 'AA0130030button0', 'ZZ07008', okEvent);
};
expj.AA0130030.AA0130030button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030button0.Clear['onClick' + i])) {
        expj.AA0130030.AA0130030button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030button0.Clear.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030button0.Clear.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030button0', 'Clear', this, 'Button');
    }
  });
  expj.AA0130030.AA0130030button0.Clear.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AA0130030button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130030-AA0130030button0-Clear" name="Clear" class="AA0130030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0130030-AA0130030button0-Close">
expj.AA0130030.AA0130030button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AA0130030.AA0130030button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AA0130030');
};
expj.AA0130030.AA0130030button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130030.AA0130030button0.Close['onClick' + i])) {
        expj.AA0130030.AA0130030button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0130030.AA0130030button0.Close.executeAllOnDecision = function () {
};
expj.AA0130030.AA0130030button0.Close.executeOnLoad = function () {
  $('#expj-AA0130030-AA0130030button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130030', 'AA0130030button0', 'Close', this, 'Button');
    }
  });
  expj.AA0130030.AA0130030button0.Close.executePScriptOnLoad();
};

expj.AA0130030.AA0130030button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0130030button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0130030-AA0130030button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130030-AA0130030button0-Close" name="Close" class="AA0130030-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0130030 (END)-->
<%
  MessageStruct msgStruct = aAA0130030Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0130030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0130030)) {
  expj.common.treeInstanceMap.AA0130030 = {};
}
expj.common.treeInstanceMap.AA0130030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0130030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0130030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0130030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0130030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0130030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0130030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0130030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0130030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0130030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0130030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130030)) {
  expj.common.detailDialogMap.AA0130030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0130030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130030.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0130030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0130030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0130030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0130030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0130030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0130030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0130030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0130030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0130030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0130030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0130030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0130030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0130030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0130030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0130030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0130030)) {
  expj.common.viewInstanceMap.AA0130030 = {};
}
expj.common.viewInstanceMap.AA0130030.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0130030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0130030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0130030.<%=viewId %>.init = function () {
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
    expj.AA0130030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0130030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0130030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0130030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0130030_init">
/**
 * AA0130030用のロード完了時初期化関数
 */
expj.AA0130030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0130030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0130030');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0130030');
  expj.common.calendarInstanceMap.AA0130030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0130030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0130030.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0130030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0130030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0130030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0130030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0130030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0130030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0130030-<%=detailId %>');
<%
 }
%>
  try{expj.AA0130030.AA0130030form1.Fr_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form1.h_Fr_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form1.PeekerFrItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form1.Fr_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form1.TargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form1.CalendarTargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form1.h_TargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button1.Select.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030view3.h_FrParent_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030view4.h_FrComp_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button2.ParentCheckAll.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button2.ParentCheckClear.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button3.CompCheckAll.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button3.CompCheckClear.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form2.To_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form2.PeekerToItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form2.To_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form2.ReplaceDate.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form2.CalendarReplaceDate.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button4.Update.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form1.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button1.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030view1.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030view2.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030view3.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030view4.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button2.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button3.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030form2.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button4.executeOnLoad();}catch(e){};
  try{expj.AA0130030.AA0130030button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0130030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0130030', 'AA0130030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0130030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0130030-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0130030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0130030', '<%=request.getContextPath() %>');
};

/**
 * AA0130030の全体onDecision処理
 */
expj.AA0130030.executeAllOnDecision = function () {
  expj.AA0130030.AA0130030form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0130030_console">
expj.AA0130030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>