<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:25:49 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0190\AA0190010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0190.*" %>
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
<jsp:useBean id="aAA0190010Control" class="com.nec.jp.orteus.metamorBase.AA0190.AA0190010Control" scope="request"/>
<jsp:useBean id="aAA0190010Struct" class="com.nec.jp.orteus.metamorBase.AA0190.AA0190010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

分類マスタメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0190/jsp/AA0190010.jsp,v $
$Author: geng-jia $	
$Revision: 1.8 $　$Date: 2017/02/22 02:04:15 $
********************************************************* --%>
<html>
<head>
<title>分類マスタメンテナンス</title>
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
<script class="expj-script-AA0190010_init">
  // AA0190010名前空間
  expj.AA0190010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AA0190010" data-screen="AA0190010" data-newdata="<%=aAA0190010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
			  <script class="expj-script-AA0190010-AA0190010form1">
expj.AA0190010.AA0190010form1 = {};
// script1="onLoad;1;CALL;onDecision@0,1"
expj.AA0190010.AA0190010form1.onLoad1 = function () {
  console.log('AA0190010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*1,*0"
expj.AA0190010.AA0190010form1.onDecision0 = function () {
  console.log('AA0190010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0190010', 'A')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script4="child;0;MASK;_AA0190010button1/Select@*10"
expj.AA0190010.AA0190010form1.child0 = function () {
  console.log('AA0190010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button1/Select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script5="child;1;UNMASK;_AA0190010button1/Select@*2"
expj.AA0190010.AA0190010form1.child1 = function () {
  console.log('AA0190010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button1/Select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script6="child;2;CHKRQ;B@*3,*10"
expj.AA0190010.AA0190010form1.child2 = function () {
  console.log('AA0190010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AA0190010', 'B')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script7="child;3;CHK;?AA0190010form1/*[eq]INITIAL[or]?AA0190010form1/*[eq]NOT_FOUND@*5,*4"
expj.AA0190010.AA0190010form1.child3 = function () {
  console.log('AA0190010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '?AA0190010form1/*'), '[eq]', 'INITIAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '?AA0190010form1/*'), '[eq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;4;CHK;?AA0190010form1/*[eq]NORMAL@*5,*10"
expj.AA0190010.AA0190010form1.child4 = function () {
  console.log('AA0190010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '?AA0190010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script9="child;5;CHK;_AA0190010form1/CLASS_CD1[eq]_AA0190010form1/h_CLASS_CD1[and]_AA0190010form1/CLASS_CD2[eq]_AA0190010form1/h_CLASS_CD2@*8,*6"
expj.AA0190010.AA0190010form1.child5 = function () {
  console.log('AA0190010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/CLASS_CD1'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/h_CLASS_CD1')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/CLASS_CD2'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/h_CLASS_CD2'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;6;MASK;_AA0190010button2/Update,_AA0190010button2/Delete,_AA0190010button2/Alldelete@*7"
expj.AA0190010.AA0190010form1.child6 = function () {
  console.log('AA0190010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Delete');
expj.common.pscript.setMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Alldelete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script11="child;7;UNMASK;_AA0190010button2/Insert"
expj.AA0190010.AA0190010form1.child7 = function () {
  console.log('AA0190010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Insert');
};
// script12="child;8;MASK;_AA0190010button2/Insert@*9"
expj.AA0190010.AA0190010form1.child8 = function () {
  console.log('AA0190010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script13="child;9;UNMASK;_AA0190010button2/Update,_AA0190010button2/Alldelete"
expj.AA0190010.AA0190010form1.child9 = function () {
  console.log('AA0190010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Alldelete');
};
// script14="child;10;MASK;_AA0190010button2/Update,_AA0190010button2/Delete,_AA0190010button2/Alldelete,_AA0190010button2/Insert"
expj.AA0190010.AA0190010form1.child10 = function () {
  console.log('AA0190010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Delete');
expj.common.pscript.setMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Alldelete');
expj.common.pscript.setMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Insert');
};
// script16="onDecision;1;SELCHK;AA0190010view1:_CLASS_CD3[eq]@*12,*11"
expj.AA0190010.AA0190010form1.onDecision1 = function () {
  console.log('AA0190010form1 script16');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AA0190010', 'AA0190010view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.CLASS_CD3, '[eq]', ''))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script17="child;11;CHK;_AA0190010form1/CLASS_CD1[eq]_AA0190010form1/h_CLASS_CD1[and]_AA0190010form1/CLASS_CD2[eq]_AA0190010form1/h_CLASS_CD2@*13,*12"
expj.AA0190010.AA0190010form1.child11 = function () {
  console.log('AA0190010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/CLASS_CD1'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/h_CLASS_CD1')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/CLASS_CD2'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/h_CLASS_CD2'))) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script18="child;12;MASK;_AA0190010button2/Delete"
expj.AA0190010.AA0190010form1.child12 = function () {
  console.log('AA0190010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Delete');
};
// script19="child;13;UNMASK;_AA0190010button2/Delete"
expj.AA0190010.AA0190010form1.child13 = function () {
  console.log('AA0190010form1 script19');
expj.common.pscript.setUnMaskToReferenceComponent('AA0190010', 'AA0190010form1', '_AA0190010button2/Delete');
};
expj.AA0190010.AA0190010form1.executeAllOnDecision = function () {
  console.log('execute AA0190010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0190010.AA0190010form1['onDecision' + i])) {
        expj.AA0190010.AA0190010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0190010.AA0190010form1.executeOnLoad = function () {
  expj.AA0190010.AA0190010form1.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form1.executePScriptOnLoad = function () {
  console.log('execute AA0190010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0190010.AA0190010form1['onLoad' + i])) {
      expj.AA0190010.AA0190010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0190010-AA0190010form1" action="AA0190010Servlet" name="AA0190010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0190010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:87px;align:"></div>
<div class="div-td" style="width:23px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:92px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt4124",rb)%></span></div><!--/td-->
<script class="expj-script-AA0190010-AA0190010form1-CLASS_CD1">
expj.AA0190010.AA0190010form1.CLASS_CD1 = {};
expj.AA0190010.AA0190010form1.CLASS_CD1.executeAllOnDecision = function () {
  console.log('execute AA0190010form1/CLASS_CD1.onDecision');
  expj.AA0190010.AA0190010form1.executeAllOnDecision();
  expj.AA0190010.executeAllOnDecision();
};
expj.AA0190010.AA0190010form1.CLASS_CD1.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010form1-CLASS_CD1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0190010', 'AA0190010form1', 'CLASS_CD1', this);
  });
  expj.AA0190010.AA0190010form1.CLASS_CD1.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form1.CLASS_CD1.executePScriptOnLoad = function () {
  console.log('execute AA0190010form1/CLASS_CD1.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010form1-CLASS_CD1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:259px;text-align:left;"><input type="text" id="expj-AA0190010-AA0190010form1-CLASS_CD1" name="CLASS_CD1" class="AA0190010-focus-move  required-value expj-AA0190010-required-A" style="width:260px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAA0190010Struct.getCLASS_CD1()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AA0190010-AA0190010form1-PeekerCLASS_CD1">
expj.AA0190010.AA0190010form1.PeekerCLASS_CD1 = {};
// script1="onClick;0;PEEKER;_AA0190010form1/CLASS_CD1@<%=contextNo%>"
expj.AA0190010.AA0190010form1.PeekerCLASS_CD1.onClick0 = function () {
  console.log('PeekerCLASS_CD1 script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0190010';
var parameterValues = 'PeekerCLASS_CD1%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/CLASS_CD1') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CLASS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0190010form1/CLASS_CD1%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0190010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0190010.AA0190010form1.PeekerCLASS_CD1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0190010.AA0190010form1.PeekerCLASS_CD1['onClick' + i])) {
        expj.AA0190010.AA0190010form1.PeekerCLASS_CD1['onClick' + i]();
      }
    }
  }
};
expj.AA0190010.AA0190010form1.PeekerCLASS_CD1.executeAllOnDecision = function () {
};
expj.AA0190010.AA0190010form1.PeekerCLASS_CD1.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010form1-PeekerCLASS_CD1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0190010', 'AA0190010form1', 'PeekerCLASS_CD1', this, 'Button');
    }
  });
  expj.AA0190010.AA0190010form1.PeekerCLASS_CD1.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form1.PeekerCLASS_CD1.executePScriptOnLoad = function () {
  console.log('execute AA0190010form1/PeekerCLASS_CD1.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010form1-PeekerCLASS_CD1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:23px;text-align:left;"><button type="button" id="expj-AA0190010-AA0190010form1-PeekerCLASS_CD1" class="AA0190010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<input type="hidden" id="expj-AA0190010-AA0190010form1-h_CLASS_CD1" name="h_CLASS_CD1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0190010Struct.geth_CLASS_CD1()) %>">
<script class="expj-script-AA0190010-AA0190010form1-h_CLASS_CD1">
expj.AA0190010.AA0190010form1.h_CLASS_CD1 = {};
expj.AA0190010.AA0190010form1.h_CLASS_CD1.executeAllOnDecision = function () {
  console.log('execute AA0190010form1/h_CLASS_CD1.onDecision');
  expj.AA0190010.AA0190010form1.executeAllOnDecision();
  expj.AA0190010.executeAllOnDecision();
};
expj.AA0190010.AA0190010form1.h_CLASS_CD1.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010form1-h_CLASS_CD1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0190010', 'AA0190010form1', 'h_CLASS_CD1', this);
  });
  expj.AA0190010.AA0190010form1.h_CLASS_CD1.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form1.h_CLASS_CD1.executePScriptOnLoad = function () {
  console.log('execute AA0190010form1/h_CLASS_CD1.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010form1-h_CLASS_CD1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:92px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt4125",rb)%></span><!-- 中分類 --></div><!--/td-->
<script class="expj-script-AA0190010-AA0190010form1-CLASS_CD2">
expj.AA0190010.AA0190010form1.CLASS_CD2 = {};
expj.AA0190010.AA0190010form1.CLASS_CD2.executeAllOnDecision = function () {
  console.log('execute AA0190010form1/CLASS_CD2.onDecision');
  expj.AA0190010.AA0190010form1.executeAllOnDecision();
  expj.AA0190010.executeAllOnDecision();
};
expj.AA0190010.AA0190010form1.CLASS_CD2.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010form1-CLASS_CD2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0190010', 'AA0190010form1', 'CLASS_CD2', this);
  });
  expj.AA0190010.AA0190010form1.CLASS_CD2.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form1.CLASS_CD2.executePScriptOnLoad = function () {
  console.log('execute AA0190010form1/CLASS_CD2.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010form1-CLASS_CD2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:259px;text-align:left;"><input type="text" id="expj-AA0190010-AA0190010form1-CLASS_CD2" name="CLASS_CD2" class="AA0190010-focus-move  required-value expj-AA0190010-required-A" style="width:260px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAA0190010Struct.getCLASS_CD2()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AA0190010-AA0190010form1-PeekerCLASS_CD2">
expj.AA0190010.AA0190010form1.PeekerCLASS_CD2 = {};
// script1="onClick;0;PEEKER;_AA0190010form1/CLASS_CD2@<%=contextNo%>"
expj.AA0190010.AA0190010form1.PeekerCLASS_CD2.onClick0 = function () {
  console.log('PeekerCLASS_CD2 script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0190010';
var parameterValues = 'PeekerCLASS_CD2%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/CLASS_CD1') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010form1', '_AA0190010form1/CLASS_CD2') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CLASS_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AA0190010form1/CLASS_CD2%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0190010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0190010.AA0190010form1.PeekerCLASS_CD2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0190010.AA0190010form1.PeekerCLASS_CD2['onClick' + i])) {
        expj.AA0190010.AA0190010form1.PeekerCLASS_CD2['onClick' + i]();
      }
    }
  }
};
expj.AA0190010.AA0190010form1.PeekerCLASS_CD2.executeAllOnDecision = function () {
};
expj.AA0190010.AA0190010form1.PeekerCLASS_CD2.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010form1-PeekerCLASS_CD2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0190010', 'AA0190010form1', 'PeekerCLASS_CD2', this, 'Button');
    }
  });
  expj.AA0190010.AA0190010form1.PeekerCLASS_CD2.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form1.PeekerCLASS_CD2.executePScriptOnLoad = function () {
  console.log('execute AA0190010form1/PeekerCLASS_CD2.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010form1-PeekerCLASS_CD2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:23px;text-align:left;"><button type="button" id="expj-AA0190010-AA0190010form1-PeekerCLASS_CD2" class="AA0190010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<input type="hidden" id="expj-AA0190010-AA0190010form1-h_CLASS_CD2" name="h_CLASS_CD2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0190010Struct.geth_CLASS_CD2()) %>">
<script class="expj-script-AA0190010-AA0190010form1-h_CLASS_CD2">
expj.AA0190010.AA0190010form1.h_CLASS_CD2 = {};
expj.AA0190010.AA0190010form1.h_CLASS_CD2.executeAllOnDecision = function () {
  console.log('execute AA0190010form1/h_CLASS_CD2.onDecision');
  expj.AA0190010.AA0190010form1.executeAllOnDecision();
  expj.AA0190010.executeAllOnDecision();
};
expj.AA0190010.AA0190010form1.h_CLASS_CD2.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010form1-h_CLASS_CD2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0190010', 'AA0190010form1', 'h_CLASS_CD2', this);
  });
  expj.AA0190010.AA0190010form1.h_CLASS_CD2.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form1.h_CLASS_CD2.executePScriptOnLoad = function () {
  console.log('execute AA0190010form1/h_CLASS_CD2.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010form1-h_CLASS_CD2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:92px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0190010-AA0190010button1">
expj.AA0190010.AA0190010button1 = {};
expj.AA0190010.AA0190010button1.executeAllOnDecision = function () {
  console.log('execute AA0190010button1.onDecision');
};
expj.AA0190010.AA0190010button1.executeOnLoad = function () {
  expj.AA0190010.AA0190010button1.executePScriptOnLoad();
};

expj.AA0190010.AA0190010button1.executePScriptOnLoad = function () {
  console.log('execute AA0190010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0190010-AA0190010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0190010-AA0190010button1-Select">
expj.AA0190010.AA0190010button1.Select = {};
// script1="onClick;1;CHK;_AA0190010form1/CLASS_CD1[gt]99[or]_AA0190010form1/CLASS_CD1[lt]01[or]~LEN(_AA0190010form1/CLASS_CD1)[eq]1@!AA20002"
expj.AA0190010.AA0190010button1.Select.onClick1 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button1', '_AA0190010form1/CLASS_CD1')), '[gt]', expj.common.pscript.convertNumber('99')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button1', '_AA0190010form1/CLASS_CD1')), '[lt]', expj.common.pscript.convertNumber('01')) || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AA0190010', 'AA0190010button1', '_AA0190010form1/CLASS_CD1'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button1', 'AA20002');
}
};
// script2="onClick;2;CHK;_AA0190010form1/CLASS_CD2[gt]99[or]_AA0190010form1/CLASS_CD2[lt]01[or]~LEN(_AA0190010form1/CLASS_CD2)[eq]1@!AA20003"
expj.AA0190010.AA0190010button1.Select.onClick2 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button1', '_AA0190010form1/CLASS_CD2')), '[gt]', expj.common.pscript.convertNumber('99')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button1', '_AA0190010form1/CLASS_CD2')), '[lt]', expj.common.pscript.convertNumber('01')) || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AA0190010', 'AA0190010button1', '_AA0190010form1/CLASS_CD2'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button1', 'AA20003');
}
};
// script3="onClick;3;CHK;?AA0190010form1/*[eq]NOT_FOUND@*0,*2"
expj.AA0190010.AA0190010button1.Select.onClick3 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button1', '?AA0190010form1/*'), '[eq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;0;CHK;_AA0190010form1/CLASS_CD1[eq]_AA0190010form1/h_CLASS_CD1[and]_AA0190010form1/CLASS_CD2[eq]_AA0190010form1/h_CLASS_CD2@*2,*1"
expj.AA0190010.AA0190010button1.Select.child0 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button1', '_AA0190010form1/CLASS_CD1'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button1', '_AA0190010form1/h_CLASS_CD1')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button1', '_AA0190010form1/CLASS_CD2'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button1', '_AA0190010form1/h_CLASS_CD2'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script5="child;1;CFMPUT;_AA0190010button1/Select=YES:2@AA00176"
expj.AA0190010.AA0190010button1.Select.child1 = function () {
  console.log('Select script5');
var yesFunc = function () {
expj.AA0190010.AA0190010button1.Select.child2();
};
var noFunc = function () {
};
expj.common.pscript.executeConfirmPut('AA0190010', 'AA0190010button1', '_AA0190010button1/Select', 'AA00176', yesFunc, noFunc);
};
// script6="child;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0190010form1/*@AA0190010Servlet"
expj.AA0190010.AA0190010button1.Select.child2 = function () {
  console.log('Select script6');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0190010', 'AA0190010button1', '_AA0190010form1/*', 'AA0190010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0190010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0190010', response);
expj.common.updateBusinessScreenTab('AA0190010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0190010.AA0190010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0190010.AA0190010button1.Select['onClick' + i])) {
        expj.AA0190010.AA0190010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AA0190010.AA0190010button1.Select.executeAllOnDecision = function () {
};
expj.AA0190010.AA0190010button1.Select.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0190010', 'AA0190010button1', 'Select', this, 'Button');
    }
  });
  expj.AA0190010.AA0190010button1.Select.executePScriptOnLoad();
};

expj.AA0190010.AA0190010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AA0190010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0190010-AA0190010button1-Select" name="Select" class="AA0190010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに上段検索条件用のDataGridを配置する。↓ --><script class="expj-script-AA0190010-AA0190010form2">
expj.AA0190010.AA0190010form2 = {};
expj.AA0190010.AA0190010form2.executeAllOnDecision = function () {
  console.log('execute AA0190010form2.onDecision');
};
expj.AA0190010.AA0190010form2.executeOnLoad = function () {
  expj.AA0190010.AA0190010form2.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form2.executePScriptOnLoad = function () {
  console.log('execute AA0190010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0190010-AA0190010form2" action="AA0190010Servlet" name="AA0190010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt4127",rb)%></span><!-- 大分類名称 --></div><!--/td-->
<script class="expj-script-AA0190010-AA0190010form2-CLASS_NAME1">
expj.AA0190010.AA0190010form2.CLASS_NAME1 = {};
expj.AA0190010.AA0190010form2.CLASS_NAME1.executeAllOnDecision = function () {
  console.log('execute AA0190010form2/CLASS_NAME1.onDecision');
  expj.AA0190010.AA0190010form2.executeAllOnDecision();
  expj.AA0190010.executeAllOnDecision();
};
expj.AA0190010.AA0190010form2.CLASS_NAME1.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010form2-CLASS_NAME1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0190010', 'AA0190010form2', 'CLASS_NAME1', this);
  });
  expj.AA0190010.AA0190010form2.CLASS_NAME1.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form2.CLASS_NAME1.executePScriptOnLoad = function () {
  console.log('execute AA0190010form2/CLASS_NAME1.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010form2-CLASS_NAME1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0190010-AA0190010form2-CLASS_NAME1" name="CLASS_NAME1" class="AA0190010-focus-move  required-value expj-AA0190010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0190010Struct.getCLASS_NAME1()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0190010-AA0190010form2-MODIFY_COUNT_CD1" name="MODIFY_COUNT_CD1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0190010Struct.getMODIFY_COUNT_CD1()) %>">
<script class="expj-script-AA0190010-AA0190010form2-MODIFY_COUNT_CD1">
expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD1 = {};
expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD1.executeAllOnDecision = function () {
  console.log('execute AA0190010form2/MODIFY_COUNT_CD1.onDecision');
  expj.AA0190010.AA0190010form2.executeAllOnDecision();
  expj.AA0190010.executeAllOnDecision();
};
expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD1.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010form2-MODIFY_COUNT_CD1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0190010', 'AA0190010form2', 'MODIFY_COUNT_CD1', this);
  });
  expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD1.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD1.executePScriptOnLoad = function () {
  console.log('execute AA0190010form2/MODIFY_COUNT_CD1.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010form2-MODIFY_COUNT_CD1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt4128",rb)%></span><!-- 中分類名称 --></div><!--/td-->
<script class="expj-script-AA0190010-AA0190010form2-CLASS_NAME2">
expj.AA0190010.AA0190010form2.CLASS_NAME2 = {};
expj.AA0190010.AA0190010form2.CLASS_NAME2.executeAllOnDecision = function () {
  console.log('execute AA0190010form2/CLASS_NAME2.onDecision');
  expj.AA0190010.AA0190010form2.executeAllOnDecision();
  expj.AA0190010.executeAllOnDecision();
};
expj.AA0190010.AA0190010form2.CLASS_NAME2.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010form2-CLASS_NAME2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0190010', 'AA0190010form2', 'CLASS_NAME2', this);
  });
  expj.AA0190010.AA0190010form2.CLASS_NAME2.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form2.CLASS_NAME2.executePScriptOnLoad = function () {
  console.log('execute AA0190010form2/CLASS_NAME2.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010form2-CLASS_NAME2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0190010-AA0190010form2-CLASS_NAME2" name="CLASS_NAME2" class="AA0190010-focus-move  required-value expj-AA0190010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0190010Struct.getCLASS_NAME2()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0190010-AA0190010form2-MODIFY_COUNT_CD2" name="MODIFY_COUNT_CD2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0190010Struct.getMODIFY_COUNT_CD2()) %>">
<script class="expj-script-AA0190010-AA0190010form2-MODIFY_COUNT_CD2">
expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD2 = {};
expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD2.executeAllOnDecision = function () {
  console.log('execute AA0190010form2/MODIFY_COUNT_CD2.onDecision');
  expj.AA0190010.AA0190010form2.executeAllOnDecision();
  expj.AA0190010.executeAllOnDecision();
};
expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD2.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010form2-MODIFY_COUNT_CD2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0190010', 'AA0190010form2', 'MODIFY_COUNT_CD2', this);
  });
  expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD2.executePScriptOnLoad();
};

expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD2.executePScriptOnLoad = function () {
  console.log('execute AA0190010form2/MODIFY_COUNT_CD2.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010form2-MODIFY_COUNT_CD2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AA0190010-AA0190010view1">
expj.AA0190010.AA0190010view1 = {};
expj.AA0190010.AA0190010view1.executeAllOnClick = function () {
};
expj.AA0190010.AA0190010view1.executeAllOnDecision = function () {
  console.log('execute AA0190010view1.onDecision');
};
expj.AA0190010.AA0190010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0190010view1", "expj.AA0190010.AA0190010view1.executeAllOnClick");
%>
  expj.AA0190010.AA0190010view1.executePScriptOnLoad();
};

expj.AA0190010.AA0190010view1.executePScriptOnLoad = function () {
  console.log('execute AA0190010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0190010-AA0190010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0190010view1_Id = "AA0190010view1";
 String AA0190010view1_select = "single";
 String AA0190010view1_sortable = "true";
 String AA0190010view1_resize = "true";
 String AA0190010view1_scroll = "true";
 StringBuffer AA0190010view1_HB = new StringBuffer();
 StringBuffer AA0190010view1_DB = new StringBuffer();
%>
<%
 AA0190010view1_select = "multi";
 AA0190010view1_sortable = "true";
 AA0190010view1_resize = "true";
 AA0190010view1_scroll = "true";
%>
<%
 AA0190010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0190010view1_sortable).append("}").append(",");
%>
     <script class="expj-script-AA0190010-AA0190010view1-CLASS_CD3">
expj.AA0190010.AA0190010view1.CLASS_CD3 = {};
expj.AA0190010.AA0190010view1.CLASS_CD3.executeAllOnClick = function () {
};
expj.AA0190010.AA0190010view1.CLASS_CD3.executeAllOnDecision = function () {
  console.log('execute AA0190010view1/CLASS_CD3.onDecision');
  expj.AA0190010.AA0190010view1.executeAllOnDecision();
  expj.AA0190010.executeAllOnDecision();
};
expj.AA0190010.AA0190010view1.CLASS_CD3.executeOnLoad = function () {
  $('.expj-AA0190010-AA0190010view1-CLASS_CD3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0190010', 'AA0190010view1', 'CLASS_CD3', this);
  });
  expj.AA0190010.AA0190010view1.CLASS_CD3.executePScriptOnLoad();
};

expj.AA0190010.AA0190010view1.CLASS_CD3.executePScriptOnLoad = function () {
  console.log('execute AA0190010view1/CLASS_CD3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0190010-AA0190010view1-CLASS_NAME3">
expj.AA0190010.AA0190010view1.CLASS_NAME3 = {};
expj.AA0190010.AA0190010view1.CLASS_NAME3.executeAllOnClick = function () {
};
expj.AA0190010.AA0190010view1.CLASS_NAME3.executeAllOnDecision = function () {
  console.log('execute AA0190010view1/CLASS_NAME3.onDecision');
  expj.AA0190010.AA0190010view1.executeAllOnDecision();
  expj.AA0190010.executeAllOnDecision();
};
expj.AA0190010.AA0190010view1.CLASS_NAME3.executeOnLoad = function () {
  $('.expj-AA0190010-AA0190010view1-CLASS_NAME3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0190010', 'AA0190010view1', 'CLASS_NAME3', this);
  });
  expj.AA0190010.AA0190010view1.CLASS_NAME3.executePScriptOnLoad();
};

expj.AA0190010.AA0190010view1.CLASS_NAME3.executePScriptOnLoad = function () {
  console.log('execute AA0190010view1/CLASS_NAME3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AA0190010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt4126",rb))).append("', 'name':'CLASS_CD3', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(AA0190010view1_sortable).append("}").append(",");
AA0190010view1_HB.append("{'visible':true, 'type':'string', 'width':'770px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt4129",rb))).append("', 'name':'CLASS_NAME3', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(AA0190010view1_sortable).append("}").append(",");
AA0190010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT_CD3', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0190010view1_sortable).append("}").append(",");
%>
<%
 int aAA0190010StructLength = aAA0190010Control.getListsize();
 final AA0190010Struct structBackup = aAA0190010Struct;
 aAA0190010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0190010StructLength; ++loopCount) {
  if((aAA0190010Struct = (AA0190010Struct) aAA0190010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0190010Struct", aAA0190010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
 <%
	String WriteStatus = "";
	WriteStatus =aAA0190010Struct.getWriteStatus() ;
%>
<%
 AA0190010view1_DB.append("[");
 AA0190010view1_DB.append(loopCount);
 AA0190010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AA0190010-AA0190010view1-CLASS_CD3-").append(loopCount).append("\" class=\"expj-AA0190010-AA0190010view1-CLASS_CD3 AA0190010-focus-move\" data-name=\"CLASS_CD3\" data-view=\"true\" style=\"width: 260px;\" maxlength=\"25\" data-kind=\"").append("").append("\"").append("false".equals( WriteStatus ) ? " disabled=\"disabled\"" : "").append(" value=\"").append(TypeConverter.sanitizer(aAA0190010Struct.getCLASS_CD3())).append("\">'");
 AA0190010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AA0190010-AA0190010view1-CLASS_NAME3-").append(loopCount).append("\" class=\"expj-AA0190010-AA0190010view1-CLASS_NAME3 AA0190010-focus-move\" data-name=\"CLASS_NAME3\" data-view=\"true\" style=\"width: 260px;\" maxlength=\"25\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAA0190010Struct.getCLASS_NAME3())).append("\">'");
 AA0190010view1_DB.append(",").append("'<span id=\"expj-AA0190010-AA0190010view1-MODIFY_COUNT_CD3-").append(loopCount).append("\" class=\"expj-label expj-AA0190010-AA0190010view1-MODIFY_COUNT_CD3\" data-name=\"MODIFY_COUNT_CD3\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0190010Struct.getMODIFY_COUNT_CD3())).append("</span>'");
 AA0190010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0190010StructLength) {
   AA0190010view1_DB.append(",");
  }
 }
 aAA0190010Struct = structBackup;
 viewIdList.add(AA0190010view1_Id);
 viewSelectList.add(AA0190010view1_select);
 viewResizeList.add(AA0190010view1_resize);
 viewScrollList.add(AA0190010view1_scroll);
 viewHeaderDataList.add(AA0190010view1_HB);
 viewBodyDataList.add(AA0190010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:559px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 643px);"><script class="expj-script-AA0190010-AA0190010button2">
expj.AA0190010.AA0190010button2 = {};
expj.AA0190010.AA0190010button2.executeAllOnDecision = function () {
  console.log('execute AA0190010button2.onDecision');
};
expj.AA0190010.AA0190010button2.executeOnLoad = function () {
  expj.AA0190010.AA0190010button2.executePScriptOnLoad();
};

expj.AA0190010.AA0190010button2.executePScriptOnLoad = function () {
  console.log('execute AA0190010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0190010-AA0190010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0190010-AA0190010button2-Insert">
expj.AA0190010.AA0190010button2.Insert = {};
// script1="onClick;0;CHK;_AA0190010form2/CLASS_NAME1[eq]@!AA20004"
expj.AA0190010.AA0190010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form2/CLASS_NAME1'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button2', 'AA20004');
}
};
// script2="onClick;1;CHK;_AA0190010form2/CLASS_NAME2[eq]@!AA20005"
expj.AA0190010.AA0190010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form2/CLASS_NAME2'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button2', 'AA20005');
}
};
// script3="onClick;2;CHK;_AA0190010form1/CLASS_CD1[gt]99[or]_AA0190010form1/CLASS_CD1[lt]01[or]~LEN(_AA0190010form1/CLASS_CD1)[eq]1@!AA20002"
expj.AA0190010.AA0190010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD1')), '[gt]', expj.common.pscript.convertNumber('99')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD1')), '[lt]', expj.common.pscript.convertNumber('01')) || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD1'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button2', 'AA20002');
}
};
// script4="onClick;3;CHK;_AA0190010form1/CLASS_CD2[gt]99[or]_AA0190010form1/CLASS_CD2[lt]01[or]~LEN(_AA0190010form1/CLASS_CD2)[eq]1@!AA20003"
expj.AA0190010.AA0190010button2.Insert.onClick3 = function () {
  console.log('Insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD2')), '[gt]', expj.common.pscript.convertNumber('99')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD2')), '[lt]', expj.common.pscript.convertNumber('01')) || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD2'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button2', 'AA20003');
}
};
// script5="onClick;4;CHK;?AA0190010form1/*[eq]NOT_FOUND@*0"
expj.AA0190010.AA0190010button2.Insert.onClick4 = function () {
  console.log('Insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '?AA0190010form1/*'), '[eq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script6="child;0;CHK;_AA0190010form1/CLASS_CD1[eq]_AA0190010form1/h_CLASS_CD1[and]_AA0190010form1/CLASS_CD2[eq]_AA0190010form1/h_CLASS_CD2@,$AA00176"
expj.AA0190010.AA0190010button2.Insert.child0 = function () {
  console.log('Insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD1'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/h_CLASS_CD1')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD2'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/h_CLASS_CD2'))) {

} else {
expj.common.pscript.addWarningMessage('AA0190010', 'AA0190010button2', 'AA00176');
}
};
// script8="onClick;5;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0190010form1/*,_AA0190010form2/*,_AA0190010view1/*@AA0190010Servlet,,$ZZ07001"
expj.AA0190010.AA0190010button2.Insert.onClick5 = function () {
  console.log('Insert script8');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0190010', 'AA0190010button2', '_AA0190010form1/*,_AA0190010form2/*,_AA0190010view1/*', 'AA0190010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0190010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0190010', response);
expj.common.updateBusinessScreenTab('AA0190010', contents);
};
expj.common.pscript.callConfirm('AA0190010', 'AA0190010button2', 'ZZ07001', okEvent);
};
expj.AA0190010.AA0190010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0190010.AA0190010button2.Insert['onClick' + i])) {
        expj.AA0190010.AA0190010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.AA0190010.AA0190010button2.Insert.executeAllOnDecision = function () {
};
expj.AA0190010.AA0190010button2.Insert.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0190010', 'AA0190010button2', 'Insert', this, 'Button');
    }
  });
  expj.AA0190010.AA0190010button2.Insert.executePScriptOnLoad();
};

expj.AA0190010.AA0190010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute AA0190010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0190010-AA0190010button2-Insert" name="Insert" class="AA0190010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0190010-AA0190010button2-Update">
expj.AA0190010.AA0190010button2.Update = {};
// script1="onClick;0;CHK;_AA0190010form2/CLASS_NAME1[eq]@!AA20004"
expj.AA0190010.AA0190010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form2/CLASS_NAME1'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button2', 'AA20004');
}
};
// script2="onClick;1;CHK;_AA0190010form2/CLASS_NAME2[eq]@!AA20005"
expj.AA0190010.AA0190010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form2/CLASS_NAME2'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button2', 'AA20005');
}
};
// script3="onClick;2;CHK;_AA0190010form1/CLASS_CD1[gt]99[or]_AA0190010form1/CLASS_CD1[lt]01[or]~LEN(_AA0190010form1/CLASS_CD1)[eq]1@!AA20002"
expj.AA0190010.AA0190010button2.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD1')), '[gt]', expj.common.pscript.convertNumber('99')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD1')), '[lt]', expj.common.pscript.convertNumber('01')) || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD1'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button2', 'AA20002');
}
};
// script4="onClick;3;CHK;_AA0190010form1/CLASS_CD2[gt]99[or]_AA0190010form1/CLASS_CD2[lt]01[or]~LEN(_AA0190010form1/CLASS_CD2)[eq]1@!AA20003"
expj.AA0190010.AA0190010button2.Update.onClick3 = function () {
  console.log('Update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD2')), '[gt]', expj.common.pscript.convertNumber('99')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD2')), '[lt]', expj.common.pscript.convertNumber('01')) || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AA0190010', 'AA0190010button2', '_AA0190010form1/CLASS_CD2'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button2', 'AA20003');
}
};
// script5="onClick;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0190010form1/*,_AA0190010form2/*,_AA0190010view1/*@AA0190010Servlet,,$ZZ07003"
expj.AA0190010.AA0190010button2.Update.onClick4 = function () {
  console.log('Update script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0190010', 'AA0190010button2', '_AA0190010form1/*,_AA0190010form2/*,_AA0190010view1/*', 'AA0190010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0190010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0190010', response);
expj.common.updateBusinessScreenTab('AA0190010', contents);
};
expj.common.pscript.callConfirm('AA0190010', 'AA0190010button2', 'ZZ07003', okEvent);
};
expj.AA0190010.AA0190010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0190010.AA0190010button2.Update['onClick' + i])) {
        expj.AA0190010.AA0190010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AA0190010.AA0190010button2.Update.executeAllOnDecision = function () {
};
expj.AA0190010.AA0190010button2.Update.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0190010', 'AA0190010button2', 'Update', this, 'Button');
    }
  });
  expj.AA0190010.AA0190010button2.Update.executePScriptOnLoad();
};

expj.AA0190010.AA0190010button2.Update.executePScriptOnLoad = function () {
  console.log('execute AA0190010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0190010-AA0190010button2-Update" name="Update" class="AA0190010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AA0190010-AA0190010button2-Delete">
expj.AA0190010.AA0190010button2.Delete = {};
// script1="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0190010form1/*,_AA0190010form2/*,_AA0190010view1/+@AA0190010Servlet,,$ZZ07004"
expj.AA0190010.AA0190010button2.Delete.onClick1 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0190010', 'AA0190010button2', '_AA0190010form1/*,_AA0190010form2/*,_AA0190010view1/+', 'AA0190010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0190010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0190010', response);
expj.common.updateBusinessScreenTab('AA0190010', contents);
};
expj.common.pscript.callConfirm('AA0190010', 'AA0190010button2', 'ZZ07004', okEvent);
};
expj.AA0190010.AA0190010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0190010.AA0190010button2.Delete['onClick' + i])) {
        expj.AA0190010.AA0190010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.AA0190010.AA0190010button2.Delete.executeAllOnDecision = function () {
};
expj.AA0190010.AA0190010button2.Delete.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0190010', 'AA0190010button2', 'Delete', this, 'Button');
    }
  });
  expj.AA0190010.AA0190010button2.Delete.executePScriptOnLoad();
};

expj.AA0190010.AA0190010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute AA0190010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0190010-AA0190010button2-Delete" name="Delete" class="AA0190010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAssort_1",rb)%></button><!-- 選択削除ボタン --></div><!--/td-->
<script class="expj-script-AA0190010-AA0190010button2-Alldelete">
expj.AA0190010.AA0190010button2.Alldelete = {};
// script1="onClick;0;CHK;_AA0190010form2/CLASS_NAME1[eq][or]_AA0190010form2/CLASS_NAME1[eq]''@!AA20004"
expj.AA0190010.AA0190010button2.Alldelete.onClick0 = function () {
  console.log('Alldelete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form2/CLASS_NAME1'), '[eq]', '') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form2/CLASS_NAME1'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button2', 'AA20004');
}
};
// script2="onClick;1;CHK;_AA0190010form2/CLASS_NAME2[eq][or]_AA0190010form2/CLASS_NAME2[eq]''@!AA20005"
expj.AA0190010.AA0190010button2.Alldelete.onClick1 = function () {
  console.log('Alldelete script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form2/CLASS_NAME2'), '[eq]', '') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0190010', 'AA0190010button2', '_AA0190010form2/CLASS_NAME2'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AA0190010', 'AA0190010button2', 'AA20005');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0190010form1/*,_AA0190010form2/*,_AA0190010view1/*@AA0190010Servlet,,$ZZ07014"
expj.AA0190010.AA0190010button2.Alldelete.onClick2 = function () {
  console.log('Alldelete script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0190010', 'AA0190010button2', '_AA0190010form1/*,_AA0190010form2/*,_AA0190010view1/*', 'AA0190010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0190010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0190010', response);
expj.common.updateBusinessScreenTab('AA0190010', contents);
};
expj.common.pscript.callConfirm('AA0190010', 'AA0190010button2', 'ZZ07014', okEvent);
};
expj.AA0190010.AA0190010button2.Alldelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0190010.AA0190010button2.Alldelete['onClick' + i])) {
        expj.AA0190010.AA0190010button2.Alldelete['onClick' + i]();
      }
    }
  }
};
expj.AA0190010.AA0190010button2.Alldelete.executeAllOnDecision = function () {
};
expj.AA0190010.AA0190010button2.Alldelete.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010button2-Alldelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0190010', 'AA0190010button2', 'Alldelete', this, 'Button');
    }
  });
  expj.AA0190010.AA0190010button2.Alldelete.executePScriptOnLoad();
};

expj.AA0190010.AA0190010button2.Alldelete.executePScriptOnLoad = function () {
  console.log('execute AA0190010button2/Alldelete.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010button2-Alldelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0190010-AA0190010button2-Alldelete" name="Alldelete" class="AA0190010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAll",rb)%></button><!-- 全削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
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
<span class="version">AA0190010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0190010-AA0190010button0">
expj.AA0190010.AA0190010button0 = {};
expj.AA0190010.AA0190010button0.executeAllOnDecision = function () {
  console.log('execute AA0190010button0.onDecision');
};
expj.AA0190010.AA0190010button0.executeOnLoad = function () {
  expj.AA0190010.AA0190010button0.executePScriptOnLoad();
};

expj.AA0190010.AA0190010button0.executePScriptOnLoad = function () {
  console.log('execute AA0190010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0190010-AA0190010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0190010-AA0190010button0-Clear">
expj.AA0190010.AA0190010button0.Clear = {};
// script2="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0190010Servlet,,$ZZ07008"
expj.AA0190010.AA0190010button0.Clear.onClick0 = function () {
  console.log('Clear script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0190010', 'AA0190010button0', '', 'AA0190010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0190010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0190010', response);
expj.common.updateBusinessScreenTab('AA0190010', contents);
};
expj.common.pscript.callConfirm('AA0190010', 'AA0190010button0', 'ZZ07008', okEvent);
};
expj.AA0190010.AA0190010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0190010.AA0190010button0.Clear['onClick' + i])) {
        expj.AA0190010.AA0190010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AA0190010.AA0190010button0.Clear.executeAllOnDecision = function () {
};
expj.AA0190010.AA0190010button0.Clear.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0190010', 'AA0190010button0', 'Clear', this, 'Button');
    }
  });
  expj.AA0190010.AA0190010button0.Clear.executePScriptOnLoad();
};

expj.AA0190010.AA0190010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AA0190010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0190010-AA0190010button0-Clear" name="Clear" class="AA0190010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0190010-AA0190010button0-Close">
expj.AA0190010.AA0190010button0.Close = {};
// script2="onClick;0;CLOSE"
expj.AA0190010.AA0190010button0.Close.onClick0 = function () {
  console.log('Close script2');
expj.common.executeBusinessScreenCloseDialog('AA0190010');
};
expj.AA0190010.AA0190010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0190010.AA0190010button0.Close['onClick' + i])) {
        expj.AA0190010.AA0190010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0190010.AA0190010button0.Close.executeAllOnDecision = function () {
};
expj.AA0190010.AA0190010button0.Close.executeOnLoad = function () {
  $('#expj-AA0190010-AA0190010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0190010', 'AA0190010button0', 'Close', this, 'Button');
    }
  });
  expj.AA0190010.AA0190010button0.Close.executePScriptOnLoad();
};

expj.AA0190010.AA0190010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0190010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0190010-AA0190010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0190010-AA0190010button0-Close" name="Close" class="AA0190010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0190010 (END)-->
<%
MessageStruct msgStruct = aAA0190010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0190010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0190010)) {
  expj.common.treeInstanceMap.AA0190010 = {};
}
expj.common.treeInstanceMap.AA0190010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0190010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0190010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0190010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0190010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0190010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0190010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0190010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0190010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0190010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0190010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0190010)) {
  expj.common.detailDialogMap.AA0190010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0190010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0190010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0190010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0190010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0190010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0190010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0190010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0190010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0190010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0190010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0190010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0190010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0190010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0190010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0190010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0190010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0190010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0190010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0190010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0190010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0190010)) {
  expj.common.viewInstanceMap.AA0190010 = {};
}
expj.common.viewInstanceMap.AA0190010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0190010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0190010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0190010.<%=viewId %>.init = function () {
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
    expj.AA0190010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0190010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0190010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0190010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0190010_init">
/**
 * AA0190010用のロード完了時初期化関数
 */
expj.AA0190010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0190010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0190010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0190010');
  expj.common.calendarInstanceMap.AA0190010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0190010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0190010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0190010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0190010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0190010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0190010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0190010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0190010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0190010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0190010.AA0190010form1.CLASS_CD1.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form1.PeekerCLASS_CD1.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form1.h_CLASS_CD1.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form1.CLASS_CD2.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form1.PeekerCLASS_CD2.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form1.h_CLASS_CD2.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form2.CLASS_NAME1.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD1.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form2.CLASS_NAME2.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form2.MODIFY_COUNT_CD2.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010view1.CLASS_CD3.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010view1.CLASS_NAME3.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010button2.Update.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010button2.Alldelete.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form1.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010button1.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010form2.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010view1.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010button2.executeOnLoad();}catch(e){};
  try{expj.AA0190010.AA0190010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0190010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0190010', 'AA0190010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0190010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0190010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0190010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0190010', '<%=request.getContextPath() %>');
};

/**
 * AA0190010の全体onDecision処理
 */
expj.AA0190010.executeAllOnDecision = function () {
  expj.AA0190010.AA0190010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0190010_console">
expj.AA0190010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>