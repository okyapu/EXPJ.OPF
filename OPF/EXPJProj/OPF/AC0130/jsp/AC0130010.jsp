<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:29:13 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0130\AC0130010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0130.*" %>
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
<jsp:useBean id="aAC0130010Control" class="com.nec.jp.orteus.metamorBase.AC0130.AC0130010Control" scope="request"/>
<jsp:useBean id="aAC0130010Struct" class="com.nec.jp.orteus.metamorBase.AC0130.AC0130010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製番計画一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0130/jsp/AC0130010.jsp,v $
$Author: geng-jia $
$Revision: 1.5 $ $Date: 2017/02/22 02:04:34 $
********************************************************* --%>
<html>
<head>
<title>製番計画一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%String ColKind = "OBT_NUMBER;14.1;FLOOR;4";%>

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
<script class="expj-script-AC0130010_init">
  // AC0130010名前空間
  expj.AC0130010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AC0130010" data-screen="AC0130010" data-newdata="<%=aAC0130010Control.isNewData() %>">
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
              <!-- 1段目のDataGrid配置↓ -->
              <script class="expj-script-AC0130010-AC0130010form1">
expj.AC0130010.AC0130010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AC0130010.AC0130010form1.onLoad0 = function () {
  console.log('AC0130010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;?AC0130010form1/*[neq]NORMAL[or]?AC0130010form1/JOB_ODR_CD[neq]SAME[or]?AC0130010form1/ITEM_CD[neq]SAME[or]?AC0130010form1/JOB_ODR_DLV_DATE_FROM[neq]SAME[or]?AC0130010form1/JOB_ODR_DLV_DATE_TO[neq]SAME[or]?AC0130010form1/c1_JOB_ODR_STS[neq]SAME[or]?AC0130010form1/c2_JOB_ODR_STS[neq]SAME[or]?AC0130010form1/c3_JOB_ODR_STS[neq]SAME[or]?AC0130010form1/c4_JOB_ODR_STS[neq]SAME[or]?AC0130010form1/c5_JOB_ODR_STS[neq]SAME[or]?AC0130010form1/c9_JOB_ODR_STS[neq]SAME@*1,*0"
expj.AC0130010.AC0130010form1.onDecision0 = function () {
  console.log('AC0130010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/*'), '[neq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/JOB_ODR_CD'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/ITEM_CD'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/JOB_ODR_DLV_DATE_FROM'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/JOB_ODR_DLV_DATE_TO'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/c1_JOB_ODR_STS'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/c2_JOB_ODR_STS'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/c3_JOB_ODR_STS'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/c4_JOB_ODR_STS'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/c5_JOB_ODR_STS'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010form1/c9_JOB_ODR_STS'), '[neq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;CHKRQ;?AC0130010view1/?[eq]SINGLE@*3,*1"
expj.AC0130010.AC0130010form1.child0 = function () {
  console.log('AC0130010form1 script3');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '?AC0130010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;MASK;_AC0130010button2/MRP"
expj.AC0130010.AC0130010form1.child1 = function () {
  console.log('AC0130010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AC0130010', 'AC0130010form1', '_AC0130010button2/MRP');
};
// script5="child;2;UNMASK;_AC0130010button2/MRP"
expj.AC0130010.AC0130010form1.child2 = function () {
  console.log('AC0130010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AC0130010', 'AC0130010form1', '_AC0130010button2/MRP');
};
// script6="child;3;SELCHK;AC0130010view1:_l_JobOdrExpect[eq]<%=aAC0130010Control._expectObject%>@*2,*1"
expj.AC0130010.AC0130010form1.child3 = function () {
  console.log('AC0130010form1 script6');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AC0130010', 'AC0130010view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.l_JobOdrExpect, '[eq]', '<%=aAC0130010Control._expectObject%>'))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
expj.AC0130010.AC0130010form1.executeAllOnDecision = function () {
  console.log('execute AC0130010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0130010.AC0130010form1['onDecision' + i])) {
        expj.AC0130010.AC0130010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0130010.AC0130010form1.executeOnLoad = function () {
  expj.AC0130010.AC0130010form1.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0130010.AC0130010form1['onLoad' + i])) {
      expj.AC0130010.AC0130010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0130010-AC0130010form1" action="AC0130010Servlet" name="AC0130010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0130010Control.getReadStatusString()) %>" style="height:165px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:165px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-JOB_ODR_CD">
expj.AC0130010.AC0130010form1.JOB_ODR_CD = {};
expj.AC0130010.AC0130010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/JOB_ODR_CD.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0130010', 'AC0130010form1', 'JOB_ODR_CD', this);
  });
  expj.AC0130010.AC0130010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0130010-AC0130010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AC0130010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aAC0130010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-PeekerJOB_ODR_CD">
expj.AC0130010.AC0130010form1.PeekerJOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AC0130010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AC0130010.AC0130010form1.PeekerJOB_ODR_CD.onClick0 = function () {
  console.log('PeekerJOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0130010';
var parameterValues = 'PeekerJOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AC0130010', 'PeekerJOB_ODR_CD', 'SQLPARAM_1', '<%=aAC0130010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '_AC0130010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AC0130010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0130010.AC0130010form1.PeekerJOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0130010.AC0130010form1.PeekerJOB_ODR_CD['onClick' + i])) {
        expj.AC0130010.AC0130010form1.PeekerJOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AC0130010.AC0130010form1.PeekerJOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AC0130010.AC0130010form1.PeekerJOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-PeekerJOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'PeekerJOB_ODR_CD', this, 'Button');
    }
  });
  expj.AC0130010.AC0130010form1.PeekerJOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.PeekerJOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/PeekerJOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-PeekerJOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0130010-AC0130010form1-PeekerJOB_ODR_CD" class="AC0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-ITEM_CD">
expj.AC0130010.AC0130010form1.ITEM_CD = {};
expj.AC0130010.AC0130010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/ITEM_CD.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0130010', 'AC0130010form1', 'ITEM_CD', this);
  });
  expj.AC0130010.AC0130010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0130010-AC0130010form1-ITEM_CD" name="ITEM_CD" class="AC0130010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aAC0130010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-PeekerITEM_CD">
expj.AC0130010.AC0130010form1.PeekerITEM_CD = {};
// script1="onClick;0;PEEKER;_AC0130010form1/ITEM_CD@<%=contextNo%>"
expj.AC0130010.AC0130010form1.PeekerITEM_CD.onClick0 = function () {
  console.log('PeekerITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0130010';
var parameterValues = 'PeekerITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010form1', '_AC0130010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0130010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0130010.AC0130010form1.PeekerITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0130010.AC0130010form1.PeekerITEM_CD['onClick' + i])) {
        expj.AC0130010.AC0130010form1.PeekerITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.AC0130010.AC0130010form1.PeekerITEM_CD.executeAllOnDecision = function () {
};
expj.AC0130010.AC0130010form1.PeekerITEM_CD.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-PeekerITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'PeekerITEM_CD', this, 'Button');
    }
  });
  expj.AC0130010.AC0130010form1.PeekerITEM_CD.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.PeekerITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/PeekerITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-PeekerITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0130010-AC0130010form1-PeekerITEM_CD" class="AC0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_TYP",rb)%></span><!-- 製番種別 --></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-JOB_ODR_TYP">
expj.AC0130010.AC0130010form1.JOB_ODR_TYP = {};
expj.AC0130010.AC0130010form1.JOB_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/JOB_ODR_TYP.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.JOB_ODR_TYP.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-JOB_ODR_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AC0130010', 'AC0130010form1', 'JOB_ODR_TYP', this);
  });
  expj.AC0130010.AC0130010form1.JOB_ODR_TYP.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.JOB_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/JOB_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-JOB_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AC0130010-AC0130010form1-JOB_ODR_TYP" name='JOB_ODR_TYP' class='AC0130010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAC0130010Control.getStruct().getList_JOB_ODR_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAC0130010Control.getStruct().getList_JOB_ODR_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAC0130010Control.getStruct().getList_JOB_ODR_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAC0130010Struct.getJOB_ODR_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)%></span><!-- 製番納期 --></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-JOB_ODR_DLV_DATE_FROM">
expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_FROM = {};
expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/JOB_ODR_DLV_DATE_FROM.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-JOB_ODR_DLV_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0130010', 'AC0130010form1', 'JOB_ODR_DLV_DATE_FROM', this);
  });
  expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_FROM.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/JOB_ODR_DLV_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-JOB_ODR_DLV_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0130010-AC0130010form1-JOB_ODR_DLV_DATE_FROM" name="JOB_ODR_DLV_DATE_FROM" class="AC0130010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aAC0130010Struct.getJOB_ODR_DLV_DATE_FROM()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-CalendarJOB_ODR_DLV_DATE_FROM">
expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_FROM = {};
// script1="onClick;0;CALENDAR;_AC0130010form1/JOB_ODR_DLV_DATE_FROM"
expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_FROM.onClick0 = function () {
  console.log('CalendarJOB_ODR_DLV_DATE_FROM script1');
expj.common.pscript.executeCalendar('AC0130010','AC0130010form1','_AC0130010form1/JOB_ODR_DLV_DATE_FROM');
};
expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_FROM.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_FROM['onClick' + i])) {
        expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_FROM['onClick' + i]();
      }
    }
  }
};
expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_FROM.executeAllOnDecision = function () {
};
expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-CalendarJOB_ODR_DLV_DATE_FROM').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'CalendarJOB_ODR_DLV_DATE_FROM', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0130010','AC0130010form1','_AC0130010form1/JOB_ODR_DLV_DATE_FROM');
  expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_FROM.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/CalendarJOB_ODR_DLV_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-CalendarJOB_ODR_DLV_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0130010-AC0130010form1-CalendarJOB_ODR_DLV_DATE_FROM" class="AC0130010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-JOB_ODR_DLV_DATE_TO">
expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_TO = {};
expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/JOB_ODR_DLV_DATE_TO.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-JOB_ODR_DLV_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0130010', 'AC0130010form1', 'JOB_ODR_DLV_DATE_TO', this);
  });
  expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_TO.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/JOB_ODR_DLV_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-JOB_ODR_DLV_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0130010-AC0130010form1-JOB_ODR_DLV_DATE_TO" name="JOB_ODR_DLV_DATE_TO" class="AC0130010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aAC0130010Struct.getJOB_ODR_DLV_DATE_TO()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-CalendarJOB_ODR_DLV_DATE_TO">
expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_TO = {};
// script1="onClick;0;CALENDAR;_AC0130010form1/JOB_ODR_DLV_DATE_TO"
expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_TO.onClick0 = function () {
  console.log('CalendarJOB_ODR_DLV_DATE_TO script1');
expj.common.pscript.executeCalendar('AC0130010','AC0130010form1','_AC0130010form1/JOB_ODR_DLV_DATE_TO');
};
expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_TO.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_TO['onClick' + i])) {
        expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_TO['onClick' + i]();
      }
    }
  }
};
expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_TO.executeAllOnDecision = function () {
};
expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-CalendarJOB_ODR_DLV_DATE_TO').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'CalendarJOB_ODR_DLV_DATE_TO', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0130010','AC0130010form1','_AC0130010form1/JOB_ODR_DLV_DATE_TO');
  expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_TO.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/CalendarJOB_ODR_DLV_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-CalendarJOB_ODR_DLV_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0130010-AC0130010form1-CalendarJOB_ODR_DLV_DATE_TO" class="AC0130010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_STS_TYP",rb)%></span><!-- 製番状態区分 --></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-c1_JOB_ODR_STS">
expj.AC0130010.AC0130010form1.c1_JOB_ODR_STS = {};
expj.AC0130010.AC0130010form1.c1_JOB_ODR_STS.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/c1_JOB_ODR_STS.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.c1_JOB_ODR_STS.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-c1_JOB_ODR_STS').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'c1_JOB_ODR_STS', this, 'CheckBox');
    }
  });
  expj.AC0130010.AC0130010form1.c1_JOB_ODR_STS.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.c1_JOB_ODR_STS.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/c1_JOB_ODR_STS.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-c1_JOB_ODR_STS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c1_JOB_ODR_STS" value="true" <%= ("true".equals(TypeConverter.convert(aAC0130010Struct.getc1_JOB_ODR_STS())) || "".equals(TypeConverter.convert(aAC0130010Struct.getc1_JOB_ODR_STS())))?"checked=\"checked\"": "" %> class="AC0130010-focus-move" id="expj-AC0130010-AC0130010form1-c1_JOB_ODR_STS"><label for="expj-AC0130010-AC0130010form1-c1_JOB_ODR_STS"><%=CoreTools.getRBString("Expj.Cmt3150",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-c2_JOB_ODR_STS">
expj.AC0130010.AC0130010form1.c2_JOB_ODR_STS = {};
expj.AC0130010.AC0130010form1.c2_JOB_ODR_STS.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/c2_JOB_ODR_STS.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.c2_JOB_ODR_STS.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-c2_JOB_ODR_STS').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'c2_JOB_ODR_STS', this, 'CheckBox');
    }
  });
  expj.AC0130010.AC0130010form1.c2_JOB_ODR_STS.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.c2_JOB_ODR_STS.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/c2_JOB_ODR_STS.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-c2_JOB_ODR_STS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c2_JOB_ODR_STS" value="true" <%= ("true".equals(TypeConverter.convert(aAC0130010Struct.getc2_JOB_ODR_STS())) || "".equals(TypeConverter.convert(aAC0130010Struct.getc2_JOB_ODR_STS())))?"checked=\"checked\"": "" %> class="AC0130010-focus-move" id="expj-AC0130010-AC0130010form1-c2_JOB_ODR_STS"><label for="expj-AC0130010-AC0130010form1-c2_JOB_ODR_STS"><%=CoreTools.getRBString("Expj.Cmt3151",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-c3_JOB_ODR_STS">
expj.AC0130010.AC0130010form1.c3_JOB_ODR_STS = {};
expj.AC0130010.AC0130010form1.c3_JOB_ODR_STS.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/c3_JOB_ODR_STS.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.c3_JOB_ODR_STS.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-c3_JOB_ODR_STS').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'c3_JOB_ODR_STS', this, 'CheckBox');
    }
  });
  expj.AC0130010.AC0130010form1.c3_JOB_ODR_STS.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.c3_JOB_ODR_STS.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/c3_JOB_ODR_STS.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-c3_JOB_ODR_STS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c3_JOB_ODR_STS" value="true" <%= ("true".equals(TypeConverter.convert(aAC0130010Struct.getc3_JOB_ODR_STS())) || "".equals(TypeConverter.convert(aAC0130010Struct.getc3_JOB_ODR_STS())))?"checked=\"checked\"": "" %> class="AC0130010-focus-move" id="expj-AC0130010-AC0130010form1-c3_JOB_ODR_STS"><label for="expj-AC0130010-AC0130010form1-c3_JOB_ODR_STS"><%=CoreTools.getRBString("Expj.Cmt3143",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-c4_JOB_ODR_STS">
expj.AC0130010.AC0130010form1.c4_JOB_ODR_STS = {};
expj.AC0130010.AC0130010form1.c4_JOB_ODR_STS.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/c4_JOB_ODR_STS.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.c4_JOB_ODR_STS.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-c4_JOB_ODR_STS').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'c4_JOB_ODR_STS', this, 'CheckBox');
    }
  });
  expj.AC0130010.AC0130010form1.c4_JOB_ODR_STS.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.c4_JOB_ODR_STS.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/c4_JOB_ODR_STS.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-c4_JOB_ODR_STS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c4_JOB_ODR_STS" value="true" <%= ("true".equals(TypeConverter.convert(aAC0130010Struct.getc4_JOB_ODR_STS())) || "".equals(TypeConverter.convert(aAC0130010Struct.getc4_JOB_ODR_STS())))?"checked=\"checked\"": "" %> class="AC0130010-focus-move" id="expj-AC0130010-AC0130010form1-c4_JOB_ODR_STS"><label for="expj-AC0130010-AC0130010form1-c4_JOB_ODR_STS"><%=CoreTools.getRBString("Expj.Cmt3144",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-c5_JOB_ODR_STS">
expj.AC0130010.AC0130010form1.c5_JOB_ODR_STS = {};
expj.AC0130010.AC0130010form1.c5_JOB_ODR_STS.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/c5_JOB_ODR_STS.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.c5_JOB_ODR_STS.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-c5_JOB_ODR_STS').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'c5_JOB_ODR_STS', this, 'CheckBox');
    }
  });
  expj.AC0130010.AC0130010form1.c5_JOB_ODR_STS.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.c5_JOB_ODR_STS.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/c5_JOB_ODR_STS.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-c5_JOB_ODR_STS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c5_JOB_ODR_STS" value="true" <%= ("true".equals(TypeConverter.convert(aAC0130010Struct.getc5_JOB_ODR_STS())) || "".equals(TypeConverter.convert(aAC0130010Struct.getc5_JOB_ODR_STS())))?"checked=\"checked\"": "" %> class="AC0130010-focus-move" id="expj-AC0130010-AC0130010form1-c5_JOB_ODR_STS"><label for="expj-AC0130010-AC0130010form1-c5_JOB_ODR_STS"><%=CoreTools.getRBString("Expj.Cmt3145",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-c9_JOB_ODR_STS">
expj.AC0130010.AC0130010form1.c9_JOB_ODR_STS = {};
expj.AC0130010.AC0130010form1.c9_JOB_ODR_STS.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/c9_JOB_ODR_STS.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.c9_JOB_ODR_STS.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-c9_JOB_ODR_STS').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'c9_JOB_ODR_STS', this, 'CheckBox');
    }
  });
  expj.AC0130010.AC0130010form1.c9_JOB_ODR_STS.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.c9_JOB_ODR_STS.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/c9_JOB_ODR_STS.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-c9_JOB_ODR_STS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c9_JOB_ODR_STS" value="true" <%= ("true".equals(TypeConverter.convert(aAC0130010Struct.getc9_JOB_ODR_STS())) || "1".equals(TypeConverter.convert(aAC0130010Struct.getc9_JOB_ODR_STS())))?"checked=\"checked\"":"" %>  class="AC0130010-focus-move" id="expj-AC0130010-AC0130010form1-c9_JOB_ODR_STS"><label for="expj-AC0130010-AC0130010form1-c9_JOB_ODR_STS"><%=CoreTools.getRBString("Expj.Cmt0013",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3146",rb)%></span><!-- 製番取消 --></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-c1_JOB_ODR_CANCEL">
expj.AC0130010.AC0130010form1.c1_JOB_ODR_CANCEL = {};
expj.AC0130010.AC0130010form1.c1_JOB_ODR_CANCEL.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/c1_JOB_ODR_CANCEL.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.c1_JOB_ODR_CANCEL.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-c1_JOB_ODR_CANCEL').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'c1_JOB_ODR_CANCEL', this, 'CheckBox');
    }
  });
  expj.AC0130010.AC0130010form1.c1_JOB_ODR_CANCEL.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.c1_JOB_ODR_CANCEL.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/c1_JOB_ODR_CANCEL.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-c1_JOB_ODR_CANCEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c1_JOB_ODR_CANCEL" value="true" <%= ("true".equals(TypeConverter.convert(aAC0130010Struct.getc1_JOB_ODR_CANCEL())) || "".equals(TypeConverter.convert(aAC0130010Struct.getc1_JOB_ODR_CANCEL())))?"checked=\"checked\"": "" %> class="AC0130010-focus-move" id="expj-AC0130010-AC0130010form1-c1_JOB_ODR_CANCEL"><label for="expj-AC0130010-AC0130010form1-c1_JOB_ODR_CANCEL"><%=CoreTools.getRBString("Expj.Cmt3147",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010form1-c2_JOB_ODR_CANCEL">
expj.AC0130010.AC0130010form1.c2_JOB_ODR_CANCEL = {};
expj.AC0130010.AC0130010form1.c2_JOB_ODR_CANCEL.executeAllOnDecision = function () {
  console.log('execute AC0130010form1/c2_JOB_ODR_CANCEL.onDecision');
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
  expj.AC0130010.executeAllOnDecision();
};
expj.AC0130010.AC0130010form1.c2_JOB_ODR_CANCEL.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010form1-c2_JOB_ODR_CANCEL').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010form1', 'c2_JOB_ODR_CANCEL', this, 'CheckBox');
    }
  });
  expj.AC0130010.AC0130010form1.c2_JOB_ODR_CANCEL.executePScriptOnLoad();
};

expj.AC0130010.AC0130010form1.c2_JOB_ODR_CANCEL.executePScriptOnLoad = function () {
  console.log('execute AC0130010form1/c2_JOB_ODR_CANCEL.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010form1-c2_JOB_ODR_CANCEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c2_JOB_ODR_CANCEL" value="true" <%= ("true".equals(TypeConverter.convert(aAC0130010Struct.getc2_JOB_ODR_CANCEL())) || "".equals(TypeConverter.convert(aAC0130010Struct.getc2_JOB_ODR_CANCEL())))?"checked=\"checked\"": "" %> class="AC0130010-focus-move" id="expj-AC0130010-AC0130010form1-c2_JOB_ODR_CANCEL"><label for="expj-AC0130010-AC0130010form1-c2_JOB_ODR_CANCEL"><%=CoreTools.getRBString("Expj.Cmt3148",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- 1段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0130010-AC0130010button1">
expj.AC0130010.AC0130010button1 = {};
expj.AC0130010.AC0130010button1.executeAllOnDecision = function () {
  console.log('execute AC0130010button1.onDecision');
};
expj.AC0130010.AC0130010button1.executeOnLoad = function () {
  expj.AC0130010.AC0130010button1.executePScriptOnLoad();
};

expj.AC0130010.AC0130010button1.executePScriptOnLoad = function () {
  console.log('execute AC0130010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0130010-AC0130010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0130010-AC0130010button1-select">
expj.AC0130010.AC0130010button1.select = {};
// script1="onClick;0;CHK;_AC0130010form1/JOB_ODR_DLV_DATE_FROM[neq][and]_AC0130010form1/JOB_ODR_DLV_DATE_FROM[neq][and]_AC0130010form1/JOB_ODR_DLV_DATE_FROM[gt]_AC0130010form1/JOB_ODR_DLV_DATE_TO@!AA00133"
expj.AC0130010.AC0130010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/JOB_ODR_DLV_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/JOB_ODR_DLV_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/JOB_ODR_DLV_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/JOB_ODR_DLV_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('AC0130010', 'AC0130010button1', 'AA00133');
}
};
// script2="onClick;1;CHK;_AC0130010form1/c1_JOB_ODR_STS[neq]true[and]_AC0130010form1/c2_JOB_ODR_STS[neq]true[and]_AC0130010form1/c3_JOB_ODR_STS[neq]true[and]_AC0130010form1/c4_JOB_ODR_STS[neq]true[and]_AC0130010form1/c5_JOB_ODR_STS[neq]true[and]_AC0130010form1/c9_JOB_ODR_STS[neq]true@!AC00226"
expj.AC0130010.AC0130010button1.select.onClick1 = function () {
  console.log('select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/c1_JOB_ODR_STS'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/c2_JOB_ODR_STS'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/c3_JOB_ODR_STS'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/c4_JOB_ODR_STS'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/c5_JOB_ODR_STS'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/c9_JOB_ODR_STS'), '[neq]', 'true')) {
expj.common.pscript.viewErrorMessage('AC0130010', 'AC0130010button1', 'AC00226');
}
};
// script3="onClick;2;CHK;_AC0130010form1/c1_JOB_ODR_CANCEL[neq]true[and]_AC0130010form1/c2_JOB_ODR_CANCEL[neq]true@!AC00231"
expj.AC0130010.AC0130010button1.select.onClick2 = function () {
  console.log('select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/c1_JOB_ODR_CANCEL'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button1', '_AC0130010form1/c2_JOB_ODR_CANCEL'), '[neq]', 'true')) {
expj.common.pscript.viewErrorMessage('AC0130010', 'AC0130010button1', 'AC00231');
}
};
// script4="onClick;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0130010form1/*@AC0130010Servlet"
expj.AC0130010.AC0130010button1.select.onClick3 = function () {
  console.log('select script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0130010', 'AC0130010button1', '_AC0130010form1/*', 'AC0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0130010', response);
expj.common.updateBusinessScreenTab('AC0130010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0130010.AC0130010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0130010.AC0130010button1.select['onClick' + i])) {
        expj.AC0130010.AC0130010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AC0130010.AC0130010button1.select.executeAllOnDecision = function () {
};
expj.AC0130010.AC0130010button1.select.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010button1', 'select', this, 'Button');
    }
  });
  expj.AC0130010.AC0130010button1.select.executePScriptOnLoad();
};

expj.AC0130010.AC0130010button1.select.executePScriptOnLoad = function () {
  console.log('execute AC0130010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0130010-AC0130010button1-select" name="select" class="AC0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- 2段目のDataGrid配置↓ --><script class="expj-script-AC0130010-AC0130010view1">
expj.AC0130010.AC0130010view1 = {};
expj.AC0130010.AC0130010view1.executeAllOnClick = function () {
};
expj.AC0130010.AC0130010view1.executeAllOnDecision = function () {
  console.log('execute AC0130010view1.onDecision');
};
expj.AC0130010.AC0130010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0130010view1", "expj.AC0130010.AC0130010view1.executeAllOnClick");
%>
  expj.AC0130010.AC0130010view1.executePScriptOnLoad();
};

expj.AC0130010.AC0130010view1.executePScriptOnLoad = function () {
  console.log('execute AC0130010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0130010-AC0130010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0130010view1_Id = "AC0130010view1";
 String AC0130010view1_select = "single";
 String AC0130010view1_sortable = "true";
 String AC0130010view1_resize = "true";
 String AC0130010view1_scroll = "true";
 StringBuffer AC0130010view1_HB = new StringBuffer();
 StringBuffer AC0130010view1_DB = new StringBuffer();
%>
<%
 AC0130010view1_select = "single";
 AC0130010view1_sortable = "true";
 AC0130010view1_resize = "true";
 AC0130010view1_scroll = "true";
%>
<%
 AC0130010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
%>
     
<%
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb))).append("', 'name':'l_JOB_ODR_CANCEL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3149",rb))).append("', 'name':'l_JobOdrExpect', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_QTY_1",rb))).append("', 'name':'l_JOB_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT_1",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb))).append("', 'name':'l_JOB_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'0px', 'title':'', 'name':'l_ALCD_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'0px', 'title':'', 'name':'l_ALCD_ENABLE_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_TYP",rb))).append("', 'name':'l_JOB_ODR_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PLAN_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLAN_TYP",rb))).append("', 'name':'l_PLAN_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALC_GRP_CD",rb))).append("', 'name':'l_ALC_GRP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
AC0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_STS_TYP",rb))).append("', 'name':'l_JOB_ODR_STS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0130010view1_sortable).append("}").append(",");
%>
<%
 int aAC0130010StructLength = aAC0130010Control.getListsize();
 final AC0130010Struct structBackup = aAC0130010Struct;
 aAC0130010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0130010StructLength; ++loopCount) {
  if((aAC0130010Struct = (AC0130010Struct) aAC0130010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0130010Struct", aAC0130010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0130010view1_DB.append("[");
 AC0130010view1_DB.append(loopCount);
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_JOB_ODR_CD())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_JOB_ODR_CANCEL_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_JOB_ODR_CANCEL_NO\" data-name=\"l_JOB_ODR_CANCEL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_JOB_ODR_CANCEL_NO())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_JobOdrExpect-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_JobOdrExpect\" data-name=\"l_JobOdrExpect\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_JobOdrExpect())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_ITEM_CD())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_ITEM_NAME())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_JOB_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_JOB_ODR_QTY\" data-name=\"l_JOB_ODR_QTY\" data-view=\"true\" data-kind=\"").append( ColKind ).append("\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_JOB_ODR_QTY())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_STOCK_UNIT())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_JOB_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_JOB_ODR_DLV_DATE\" data-name=\"l_JOB_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_JOB_ODR_DLV_DATE())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_ALCD_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_ALCD_QTY\" data-name=\"l_ALCD_QTY\" data-view=\"true\" data-kind=\"").append( ColKind ).append("\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_ALCD_QTY())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_ALCD_ENABLE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_ALCD_ENABLE_QTY\" data-name=\"l_ALCD_ENABLE_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_ALCD_ENABLE_QTY())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_JOB_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_JOB_ODR_TYP\" data-name=\"l_JOB_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_JOB_ODR_TYP())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_JOB_ODR_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_JOB_ODR_NAME\" data-name=\"l_JOB_ODR_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_JOB_ODR_NAME())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_PLAN_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_PLAN_TYP\" data-name=\"l_PLAN_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_PLAN_TYP())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_PLAN_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_PLAN_NAME\" data-name=\"l_PLAN_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_PLAN_NAME())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_ALC_GRP_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_ALC_GRP_CD\" data-name=\"l_ALC_GRP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_ALC_GRP_CD())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_JOB_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_JOB_ODR_STS_TYP\" data-name=\"l_JOB_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_JOB_ODR_STS_TYP())).append("</span>'");
 AC0130010view1_DB.append(",").append("'<span id=\"expj-AC0130010-AC0130010view1-l_JOB_ODR_STS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0130010-AC0130010view1-l_JOB_ODR_STS_NAME\" data-name=\"l_JOB_ODR_STS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0130010Struct.getl_JOB_ODR_STS_NAME())).append("</span>'");
 AC0130010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0130010StructLength) {
   AC0130010view1_DB.append(",");
  }
 }
 aAC0130010Struct = structBackup;
 viewIdList.add(AC0130010view1_Id);
 viewSelectList.add(AC0130010view1_select);
 viewResizeList.add(AC0130010view1_resize);
 viewScrollList.add(AC0130010view1_scroll);
 viewHeaderDataList.add(AC0130010view1_HB);
 viewBodyDataList.add(AC0130010view1_DB);
%>
<%
}
%>
<!-- 2段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0130010-AC0130010button2">
expj.AC0130010.AC0130010button2 = {};
expj.AC0130010.AC0130010button2.executeAllOnDecision = function () {
  console.log('execute AC0130010button2.onDecision');
};
expj.AC0130010.AC0130010button2.executeOnLoad = function () {
  expj.AC0130010.AC0130010button2.executePScriptOnLoad();
};

expj.AC0130010.AC0130010button2.executePScriptOnLoad = function () {
  console.log('execute AC0130010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0130010-AC0130010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0130010-AC0130010button2-MRP">
expj.AC0130010.AC0130010button2.MRP = {};
// script1="onClick;0;CHK;_AC0130010view1/l_JOB_ODR_STS_TYP[eq]9@!AC00225"
expj.AC0130010.AC0130010button2.MRP.onClick0 = function () {
  console.log('MRP script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0130010', 'AC0130010button2', '_AC0130010view1/l_JOB_ODR_STS_TYP'), '[eq]', '9')) {
expj.common.pscript.viewErrorMessage('AC0130010', 'AC0130010button2', 'AC00225');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0130010form1/*,_AC0130010view1/+@AC0130010Servlet,,$ZZ07010"
expj.AC0130010.AC0130010button2.MRP.onClick1 = function () {
  console.log('MRP script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0130010', 'AC0130010button2', '_AC0130010form1/*,_AC0130010view1/+', 'AC0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0130010', response);
expj.common.updateBusinessScreenTab('AC0130010', contents);
};
expj.common.pscript.callConfirm('AC0130010', 'AC0130010button2', 'ZZ07010', okEvent);
};
expj.AC0130010.AC0130010button2.MRP.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0130010.AC0130010button2.MRP['onClick' + i])) {
        expj.AC0130010.AC0130010button2.MRP['onClick' + i]();
      }
    }
  }
};
expj.AC0130010.AC0130010button2.MRP.executeAllOnDecision = function () {
};
expj.AC0130010.AC0130010button2.MRP.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010button2-MRP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010button2', 'MRP', this, 'Button');
    }
  });
  expj.AC0130010.AC0130010button2.MRP.executePScriptOnLoad();
};

expj.AC0130010.AC0130010button2.MRP.executePScriptOnLoad = function () {
  console.log('execute AC0130010button2/MRP.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010button2-MRP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0130010-AC0130010button2-MRP" name="MRP" class="AC0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnMRP",rb)%></button><!-- 所要量計算ボタン --></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0130010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AC0130010-AC0130010button0">
expj.AC0130010.AC0130010button0 = {};
expj.AC0130010.AC0130010button0.executeAllOnDecision = function () {
  console.log('execute AC0130010button0.onDecision');
};
expj.AC0130010.AC0130010button0.executeOnLoad = function () {
  expj.AC0130010.AC0130010button0.executePScriptOnLoad();
};

expj.AC0130010.AC0130010button0.executePScriptOnLoad = function () {
  console.log('execute AC0130010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0130010-AC0130010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0130010-AC0130010button0-Clear">
expj.AC0130010.AC0130010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0130010Servlet,,$ZZ07008"
expj.AC0130010.AC0130010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0130010', 'AC0130010button0', '', 'AC0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0130010', response);
expj.common.updateBusinessScreenTab('AC0130010', contents);
};
expj.common.pscript.callConfirm('AC0130010', 'AC0130010button0', 'ZZ07008', okEvent);
};
expj.AC0130010.AC0130010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0130010.AC0130010button0.Clear['onClick' + i])) {
        expj.AC0130010.AC0130010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AC0130010.AC0130010button0.Clear.executeAllOnDecision = function () {
};
expj.AC0130010.AC0130010button0.Clear.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010button0', 'Clear', this, 'Button');
    }
  });
  expj.AC0130010.AC0130010button0.Clear.executePScriptOnLoad();
};

expj.AC0130010.AC0130010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AC0130010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0130010-AC0130010button0-Clear" name="Clear" class="AC0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0130010-AC0130010button0-Close">
expj.AC0130010.AC0130010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AC0130010.AC0130010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AC0130010');
};
expj.AC0130010.AC0130010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0130010.AC0130010button0.Close['onClick' + i])) {
        expj.AC0130010.AC0130010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AC0130010.AC0130010button0.Close.executeAllOnDecision = function () {
};
expj.AC0130010.AC0130010button0.Close.executeOnLoad = function () {
  $('#expj-AC0130010-AC0130010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0130010', 'AC0130010button0', 'Close', this, 'Button');
    }
  });
  expj.AC0130010.AC0130010button0.Close.executePScriptOnLoad();
};

expj.AC0130010.AC0130010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AC0130010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AC0130010-AC0130010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0130010-AC0130010button0-Close" name="Close" class="AC0130010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0130010 (END)-->
<%
MessageStruct msgStruct = aAC0130010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0130010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0130010)) {
  expj.common.treeInstanceMap.AC0130010 = {};
}
expj.common.treeInstanceMap.AC0130010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0130010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0130010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0130010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0130010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0130010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0130010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0130010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0130010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0130010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0130010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0130010)) {
  expj.common.detailDialogMap.AC0130010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0130010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0130010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0130010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0130010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0130010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0130010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0130010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0130010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0130010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0130010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0130010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0130010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0130010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0130010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0130010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0130010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0130010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0130010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0130010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0130010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0130010)) {
  expj.common.viewInstanceMap.AC0130010 = {};
}
expj.common.viewInstanceMap.AC0130010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0130010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0130010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0130010.<%=viewId %>.init = function () {
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
    expj.AC0130010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0130010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0130010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0130010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0130010_init">
/**
 * AC0130010用のロード完了時初期化関数
 */
expj.AC0130010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0130010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0130010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0130010');
  expj.common.calendarInstanceMap.AC0130010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0130010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0130010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0130010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0130010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0130010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0130010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0130010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0130010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0130010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0130010.AC0130010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.PeekerJOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.PeekerITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.JOB_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.JOB_ODR_DLV_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.CalendarJOB_ODR_DLV_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.c1_JOB_ODR_STS.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.c2_JOB_ODR_STS.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.c3_JOB_ODR_STS.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.c4_JOB_ODR_STS.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.c5_JOB_ODR_STS.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.c9_JOB_ODR_STS.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.c1_JOB_ODR_CANCEL.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.c2_JOB_ODR_CANCEL.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010button1.select.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010button2.MRP.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010form1.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010button1.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010view1.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010button2.executeOnLoad();}catch(e){};
  try{expj.AC0130010.AC0130010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0130010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0130010', 'AC0130010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0130010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0130010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0130010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0130010', '<%=request.getContextPath() %>');
};

/**
 * AC0130010の全体onDecision処理
 */
expj.AC0130010.executeAllOnDecision = function () {
  expj.AC0130010.AC0130010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0130010_console">
expj.AC0130010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>