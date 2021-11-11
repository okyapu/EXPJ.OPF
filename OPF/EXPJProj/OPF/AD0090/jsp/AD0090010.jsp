<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 27 16:38:38 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0090\AD0090010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0090.*" %>
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
<jsp:useBean id="aAD0090010Control" class="com.nec.jp.orteus.metamorBase.AD0090.AD0090010Control" scope="request"/>
<jsp:useBean id="aAD0090010Struct" class="com.nec.jp.orteus.metamorBase.AD0090.AD0090010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業実績入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0090/jsp/AD0090010.jsp,v $
$Author: geng-jia $	
$Revision: 1.15 $　$Date: 2017/02/27 09:01:28 $
********************************************************* --%>
<html>
<head>
<title>作業実績入力</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AD0040010Servlet", so);
ScreenMoveUtil sv = new ScreenMoveUtil("AE0200010Servlet", so);
%>

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
<script class="expj-script-AD0090010_init">
  // AD0090010名前空間
  expj.AD0090010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<%
String h_WORK_STS_TYP = aAD0090010Control.getSelectStruct().getWORK_STS_TYP();
String h_UNIT_QTY_TYP = aAD0090010Control.getSelectStruct().getUNIT_QTY_TYP();
%>
  <div id="expj-business-screen-AD0090010" data-screen="AD0090010" data-newdata="<%=aAD0090010Control.isNewData() %>">
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
              <script class="expj-script-AD0090010-AD0090010form1">
expj.AD0090010.AD0090010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6"
expj.AD0090010.AD0090010form1.onLoad0 = function () {
  console.log('AD0090010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AD0090010.AD0090010form1.onDecision0 = function () {
  console.log('AD0090010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AD0090010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AD0090010button1/Select,_AD0090010form2/LotInsert"
expj.AD0090010.AD0090010form1.child0 = function () {
  console.log('AD0090010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010button1/Select');
expj.common.pscript.setUnMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010form2/LotInsert');
};
// script4="child;1;MASK;_AD0090010button1/Select,_AD0090010form2/LotInsert,_AD0090010button2/Insert,_AD0090010button0/CancelComplete"
expj.AD0090010.AD0090010form1.child1 = function () {
  console.log('AD0090010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010button1/Select');
expj.common.pscript.setMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010form2/LotInsert');
expj.common.pscript.setMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010button2/Insert');
expj.common.pscript.setMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010button0/CancelComplete');
};
// script5="onDecision;1;CHK;<%= TypeConverter.sanitizer(aAD0090010Control.getOutputFlg()) %>[neq]1@*2,*10"
expj.AD0090010.AD0090010form1.onDecision1 = function () {
  console.log('AD0090010form1 script5');
if (expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(aAD0090010Control.getOutputFlg()) %>', '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script6="child;2;SET;_AD0090010form2/chk_OUTPUT=false@*17"
expj.AD0090010.AD0090010form1.child2 = function () {
  console.log('AD0090010form1 script6');
expj.common.pscript.setReferenceComponentValue('AD0090010', 'AD0090010form1', '_AD0090010form2/chk_OUTPUT', 'false');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script7="onDecision;2;CHK;?AD0090010form1/*[eq]NORMAL[and]?AD0090010form1/IN_OPR_INST_CD[eq]SAME[and]<%= TypeConverter.sanitizer(h_WORK_STS_TYP) %>[neq]9@*3,*4"
expj.AD0090010.AD0090010form1.onDecision2 = function () {
  console.log('AD0090010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form1', '?AD0090010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form1', '?AD0090010form1/IN_OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(h_WORK_STS_TYP) %>', '[neq]', '9')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;3;CHKRQ;B@*14,*4"
expj.AD0090010.AD0090010form1.child3 = function () {
  console.log('AD0090010form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('AD0090010', 'B')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script9="child;4;MASK;_AD0090010button2/Insert"
expj.AD0090010.AD0090010form1.child4 = function () {
  console.log('AD0090010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010button2/Insert');
};
// script10="onDecision;3;CHK;?AD0090010form1/*[eq]NORMAL[and]<%= TypeConverter.sanitizer(h_WORK_STS_TYP) %>[eq]9@*5,*6"
expj.AD0090010.AD0090010form1.onDecision3 = function () {
  console.log('AD0090010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form1', '?AD0090010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(h_WORK_STS_TYP) %>', '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script11="child;5;UNMASK;_AD0090010button0/CancelComplete"
expj.AD0090010.AD0090010form1.child5 = function () {
  console.log('AD0090010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010button0/CancelComplete');
};
// script12="child;6;MASK;_AD0090010button0/CancelComplete"
expj.AD0090010.AD0090010form1.child6 = function () {
  console.log('AD0090010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010button0/CancelComplete');
};
// script13="onDecision;4;CHK;_AD0090010form2/TIME_CTRL[neq]true@*7,*9"
expj.AD0090010.AD0090010form1.onDecision4 = function () {
  console.log('AD0090010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form1', '_AD0090010form2/TIME_CTRL'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script14="child;7;MASK;_AD0090010form2/OPRATION_TIME"
expj.AD0090010.AD0090010form1.child7 = function () {
  console.log('AD0090010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010form2/OPRATION_TIME');
};
// script15="child;16;CHK;_AD0090010form2/chk_OUTPUT[eq]true[and]<%=aAD0090010Control.getPrintFlg()%>[eq]1@*8"
expj.AD0090010.AD0090010form1.child16 = function () {
  console.log('AD0090010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form1', '_AD0090010form2/chk_OUTPUT'), '[eq]', 'true') && expj.common.pscript.evaluate('<%=aAD0090010Control.getPrintFlg()%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script16="child;8;PRINTER;ORTEUS_HASHED=<%=hashed%>,PrintShow=,_AD0090010form1/*,_AD0090010form2/*,_AD0090010view1/*@AD0090010Servlet:H,H,H"
expj.AD0090010.AD0090010form1.child8 = function () {
  console.log('AD0090010form1 script16');
expj.common.pscript.viewPrinterDialog('AD0090010', 'AD0090010form1', 'PrintShow=,_AD0090010form1/*,_AD0090010form2/*,_AD0090010view1/*', 'AD0090010Servlet', 'H,H,H');
};
// script17="child;9;UNMASK;_AD0090010form2/OPRATION_TIME"
expj.AD0090010.AD0090010form1.child9 = function () {
  console.log('AD0090010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010form2/OPRATION_TIME');
};
// script18="child;10;UNMASK;_AD0090010form2/chk_OUTPUT"
expj.AD0090010.AD0090010form1.child10 = function () {
  console.log('AD0090010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010form2/chk_OUTPUT');
};
// script19="onDecision;5;CHK;<%= TypeConverter.sanitizer(aAD0090010Control.getLastProc()) %>[neq]true@*11,*12"
expj.AD0090010.AD0090010form1.onDecision5 = function () {
  console.log('AD0090010form1 script19');
if (expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(aAD0090010Control.getLastProc()) %>', '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script20="child;11;SET;_AD0090010form2/chk_CHILD_RSLTUPDATE=false@*13"
expj.AD0090010.AD0090010form1.child11 = function () {
  console.log('AD0090010form1 script20');
expj.common.pscript.setReferenceComponentValue('AD0090010', 'AD0090010form1', '_AD0090010form2/chk_CHILD_RSLTUPDATE', 'false');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script21="child;12;UNMASK;_AD0090010form2/chk_CHILD_RSLTUPDATE"
expj.AD0090010.AD0090010form1.child12 = function () {
  console.log('AD0090010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010form2/chk_CHILD_RSLTUPDATE');
};
// script22="child;13;MASK;_AD0090010form2/chk_CHILD_RSLTUPDATE"
expj.AD0090010.AD0090010form1.child13 = function () {
  console.log('AD0090010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010form2/chk_CHILD_RSLTUPDATE');
};
// script23="child;14;UNMASK;_AD0090010button2/Insert"
expj.AD0090010.AD0090010form1.child14 = function () {
  console.log('AD0090010form1 script23');
expj.common.pscript.setUnMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010button2/Insert');
};
// script24="onDecision;6;CHK;_AD0090010form1/PARTIAL_PRD_NO[eq]0@*15"
expj.AD0090010.AD0090010form1.onDecision6 = function () {
  console.log('AD0090010form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form1', '_AD0090010form1/PARTIAL_PRD_NO'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script25="child;15;SET;_AD0090010form1/PARTIAL_PRD_NO=1"
expj.AD0090010.AD0090010form1.child15 = function () {
  console.log('AD0090010form1 script25');
expj.common.pscript.setReferenceComponentValue('AD0090010', 'AD0090010form1', '_AD0090010form1/PARTIAL_PRD_NO', '1');
};
// script26="onLoad;1;CALL;child@16"
expj.AD0090010.AD0090010form1.onLoad1 = function () {
  console.log('AD0090010form1 script26');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child16)){this.child16();}
};
// script27="child;17;MASK;_AD0090010form2/chk_OUTPUT"
expj.AD0090010.AD0090010form1.child17 = function () {
  console.log('AD0090010form1 script27');
expj.common.pscript.setMaskToReferenceComponent('AD0090010', 'AD0090010form1', '_AD0090010form2/chk_OUTPUT');
};
expj.AD0090010.AD0090010form1.executeAllOnDecision = function () {
  console.log('execute AD0090010form1.onDecision');
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010form1['onDecision' + i])) {
        expj.AD0090010.AD0090010form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010form1.executeOnLoad = function () {
  expj.AD0090010.AD0090010form1.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form1.executePScriptOnLoad = function () {
  console.log('execute AD0090010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AD0090010.AD0090010form1['onLoad' + i])) {
      expj.AD0090010.AD0090010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0090010-AD0090010form1" action="AD0090010Servlet" name="AD0090010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0090010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:22px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_CD",rb)%></span><!-- 作業指示番号 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form1-IN_OPR_INST_CD">
expj.AD0090010.AD0090010form1.IN_OPR_INST_CD = {};
expj.AD0090010.AD0090010form1.IN_OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AD0090010form1/IN_OPR_INST_CD.onDecision');
  expj.AD0090010.AD0090010form1.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form1.IN_OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form1-IN_OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form1', 'IN_OPR_INST_CD', this);
  });
  expj.AD0090010.AD0090010form1.IN_OPR_INST_CD.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form1.IN_OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AD0090010form1/IN_OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form1-IN_OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form1-IN_OPR_INST_CD" name="IN_OPR_INST_CD" class="AD0090010-focus-move  required-value expj-AD0090010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getIN_OPR_INST_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AD0090010-AD0090010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AD0090010-AD0090010form1-DOWNLOAD_FILE">
expj.AD0090010.AD0090010form1.DOWNLOAD_FILE = {};
expj.AD0090010.AD0090010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AD0090010form1/DOWNLOAD_FILE.onDecision');
  expj.AD0090010.AD0090010form1.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AD0090010.AD0090010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AD0090010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0090010-AD0090010form1-PeekerOprInstCd">
expj.AD0090010.AD0090010form1.PeekerOprInstCd = {};
// script1="onClick;0;PEEKER;_AD0090010form1/IN_OPR_INST_CD@<%=contextNo%>"
expj.AD0090010.AD0090010form1.PeekerOprInstCd.onClick0 = function () {
  console.log('PeekerOprInstCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0090010';
var parameterValues = 'PeekerOprInstCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0090010', 'PeekerOprInstCd', 'SQLPARAM_1', '<%=aAD0090010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form1', '_IN_OPR_INST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%OPR_INST_CD_06%&%';
parameterValues += 'TARGET_FIELD%=%_AD0090010form1/IN_OPR_INST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0090010.AD0090010form1.PeekerOprInstCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010form1.PeekerOprInstCd['onClick' + i])) {
        expj.AD0090010.AD0090010form1.PeekerOprInstCd['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010form1.PeekerOprInstCd.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010form1.PeekerOprInstCd.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form1-PeekerOprInstCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010form1', 'PeekerOprInstCd', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010form1.PeekerOprInstCd.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form1.PeekerOprInstCd.executePScriptOnLoad = function () {
  console.log('execute AD0090010form1/PeekerOprInstCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form1-PeekerOprInstCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0090010-AD0090010form1-PeekerOprInstCd" class="AD0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PARTIAL_PRD_NO",rb)%></span><!-- 分作回数 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form1-PARTIAL_PRD_NO">
expj.AD0090010.AD0090010form1.PARTIAL_PRD_NO = {};
expj.AD0090010.AD0090010form1.PARTIAL_PRD_NO.executeAllOnDecision = function () {
  console.log('execute AD0090010form1/PARTIAL_PRD_NO.onDecision');
  expj.AD0090010.AD0090010form1.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form1.PARTIAL_PRD_NO.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form1-PARTIAL_PRD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form1', 'PARTIAL_PRD_NO', this);
  });
  expj.AD0090010.AD0090010form1.PARTIAL_PRD_NO.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form1.PARTIAL_PRD_NO.executePScriptOnLoad = function () {
  console.log('execute AD0090010form1/PARTIAL_PRD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form1-PARTIAL_PRD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form1-PARTIAL_PRD_NO" name="PARTIAL_PRD_NO" class="AD0090010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6;;" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getPARTIAL_PRD_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AD0090010-AD0090010button1">
expj.AD0090010.AD0090010button1 = {};
expj.AD0090010.AD0090010button1.executeAllOnDecision = function () {
  console.log('execute AD0090010button1.onDecision');
};
expj.AD0090010.AD0090010button1.executeOnLoad = function () {
  expj.AD0090010.AD0090010button1.executePScriptOnLoad();
};

expj.AD0090010.AD0090010button1.executePScriptOnLoad = function () {
  console.log('execute AD0090010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0090010-AD0090010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0090010-AD0090010button1-Detail">
expj.AD0090010.AD0090010button1.Detail = {};
// script1="onClick;0;FSHOW;AD0090010float1"
expj.AD0090010.AD0090010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AD0090010', 'AD0090010float1', '');
};
expj.AD0090010.AD0090010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010button1.Detail['onClick' + i])) {
        expj.AD0090010.AD0090010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010button1.Detail.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010button1.Detail.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010button1', 'Detail', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010button1.Detail.executePScriptOnLoad();
};

expj.AD0090010.AD0090010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AD0090010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0090010-AD0090010button1-Detail" name="Detail" class="AD0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010button1-Select">
expj.AD0090010.AD0090010button1.Select = {};
// script1="onClick;0;CHK;_AD0090010form1/IN_OPR_INST_CD[eq]@!ZZ01104"
expj.AD0090010.AD0090010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button1', '_AD0090010form1/IN_OPR_INST_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button1', 'ZZ01104');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0090010form1/IN_OPR_INST_CD@AD0090010Servlet"
expj.AD0090010.AD0090010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0090010', 'AD0090010button1', '_AD0090010form1/IN_OPR_INST_CD', 'AD0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0090010', response);
expj.common.updateBusinessScreenTab('AD0090010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0090010.AD0090010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010button1.Select['onClick' + i])) {
        expj.AD0090010.AD0090010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010button1.Select.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010button1.Select.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010button1', 'Select', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010button1.Select.executePScriptOnLoad();
};

expj.AD0090010.AD0090010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AD0090010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0090010-AD0090010button1-Select" name="Select" class="AD0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0090010-AD0090010form2">
expj.AD0090010.AD0090010form2 = {};
expj.AD0090010.AD0090010form2.executeAllOnDecision = function () {
  console.log('execute AD0090010form2.onDecision');
};
expj.AD0090010.AD0090010form2.executeOnLoad = function () {
  expj.AD0090010.AD0090010form2.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0090010-AD0090010form2" action="AD0090010Servlet" name="AD0090010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:303px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:303px;">
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
<div class="div-td" style="width:22px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-ITEM_CD">
expj.AD0090010.AD0090010form2.ITEM_CD = {};
expj.AD0090010.AD0090010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/ITEM_CD.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'ITEM_CD', this);
  });
  expj.AD0090010.AD0090010form2.ITEM_CD.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-ITEM_CD" name="ITEM_CD" class="AD0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getITEM_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-ITEM_NAME">
expj.AD0090010.AD0090010form2.ITEM_NAME = {};
expj.AD0090010.AD0090010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/ITEM_NAME.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'ITEM_NAME', this);
  });
  expj.AD0090010.AD0090010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-ITEM_NAME" name="ITEM_NAME" class="AD0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getITEM_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-chk_COMPLETE">
expj.AD0090010.AD0090010form2.chk_COMPLETE = {};
expj.AD0090010.AD0090010form2.chk_COMPLETE.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/chk_COMPLETE.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.chk_COMPLETE.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-chk_COMPLETE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010form2', 'chk_COMPLETE', this, 'CheckBox');
    }
  });
  expj.AD0090010.AD0090010form2.chk_COMPLETE.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.chk_COMPLETE.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/chk_COMPLETE.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-chk_COMPLETE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="chk_COMPLETE" value="true" <%= ("true".equals(TypeConverter.convert(aAD0090010Struct.getchk_COMPLETE())) || "".equals(TypeConverter.convert(aAD0090010Struct.getchk_COMPLETE())))?"checked=\"checked\"": "" %> class="AD0090010-focus-move" id="expj-AD0090010-AD0090010form2-chk_COMPLETE"><label for="expj-AD0090010-AD0090010form2-chk_COMPLETE"><%=CoreTools.getRBString("Expj.Cmt0464",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb)%></span><!-- 作業コード --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-WORK_IN_PROC_CD">
expj.AD0090010.AD0090010form2.WORK_IN_PROC_CD = {};
expj.AD0090010.AD0090010form2.WORK_IN_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/WORK_IN_PROC_CD.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.WORK_IN_PROC_CD.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-WORK_IN_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'WORK_IN_PROC_CD', this);
  });
  expj.AD0090010.AD0090010form2.WORK_IN_PROC_CD.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.WORK_IN_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/WORK_IN_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-WORK_IN_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-WORK_IN_PROC_CD" name="WORK_IN_PROC_CD" class="AD0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getWORK_IN_PROC_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-PROC_NAME">
expj.AD0090010.AD0090010form2.PROC_NAME = {};
expj.AD0090010.AD0090010form2.PROC_NAME.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/PROC_NAME.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.PROC_NAME.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'PROC_NAME', this);
  });
  expj.AD0090010.AD0090010form2.PROC_NAME.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-PROC_NAME" name="PROC_NAME" class="AD0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getPROC_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-chk_CHILD_RSLTUPDATE">
expj.AD0090010.AD0090010form2.chk_CHILD_RSLTUPDATE = {};
expj.AD0090010.AD0090010form2.chk_CHILD_RSLTUPDATE.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/chk_CHILD_RSLTUPDATE.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.chk_CHILD_RSLTUPDATE.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-chk_CHILD_RSLTUPDATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010form2', 'chk_CHILD_RSLTUPDATE', this, 'CheckBox');
    }
  });
  expj.AD0090010.AD0090010form2.chk_CHILD_RSLTUPDATE.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.chk_CHILD_RSLTUPDATE.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/chk_CHILD_RSLTUPDATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-chk_CHILD_RSLTUPDATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="chk_CHILD_RSLTUPDATE" value="true" <%= ("true".equals(TypeConverter.convert(aAD0090010Struct.getchk_CHILD_RSLTUPDATE())) || "".equals(TypeConverter.convert(aAD0090010Struct.getchk_CHILD_RSLTUPDATE())))?"checked=\"checked\"": "" %> class="AD0090010-focus-move" id="expj-AD0090010-AD0090010form2-chk_CHILD_RSLTUPDATE"><label for="expj-AD0090010-AD0090010form2-chk_CHILD_RSLTUPDATE"><%=CoreTools.getRBString("Expj.Cmt5103",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_DATE_3",rb)%></span><!-- 作業日 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-OPR_DATE">
expj.AD0090010.AD0090010form2.OPR_DATE = {};
expj.AD0090010.AD0090010form2.OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/OPR_DATE.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'OPR_DATE', this);
  });
  expj.AD0090010.AD0090010form2.OPR_DATE.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-OPR_DATE" name="OPR_DATE" class="AD0090010-focus-move  required-value expj-AD0090010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getOPR_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-CalendarOprDate">
expj.AD0090010.AD0090010form2.CalendarOprDate = {};
// script1="onClick;0;CALENDAR;_AD0090010form2/OPR_DATE"
expj.AD0090010.AD0090010form2.CalendarOprDate.onClick0 = function () {
  console.log('CalendarOprDate script1');
expj.common.pscript.executeCalendar('AD0090010','AD0090010form2','_AD0090010form2/OPR_DATE');
};
expj.AD0090010.AD0090010form2.CalendarOprDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010form2.CalendarOprDate['onClick' + i])) {
        expj.AD0090010.AD0090010form2.CalendarOprDate['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010form2.CalendarOprDate.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010form2.CalendarOprDate.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-CalendarOprDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010form2', 'CalendarOprDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0090010','AD0090010form2','_AD0090010form2/OPR_DATE');
  expj.AD0090010.AD0090010form2.CalendarOprDate.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.CalendarOprDate.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/CalendarOprDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-CalendarOprDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0090010-AD0090010form2-CalendarOprDate" class="AD0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-OPRATION_TIME">
expj.AD0090010.AD0090010form2.OPRATION_TIME = {};
expj.AD0090010.AD0090010form2.OPRATION_TIME.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/OPRATION_TIME.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.OPRATION_TIME.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-OPRATION_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'OPRATION_TIME', this);
  });
  expj.AD0090010.AD0090010form2.OPRATION_TIME.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.OPRATION_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/OPRATION_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-OPRATION_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-OPRATION_TIME" name="OPRATION_TIME" class="AD0090010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getOPRATION_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_QTY",rb)%></span><!-- 作業指示数 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-OPR_INST_QTY">
expj.AD0090010.AD0090010form2.OPR_INST_QTY = {};
expj.AD0090010.AD0090010form2.OPR_INST_QTY.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/OPR_INST_QTY.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.OPR_INST_QTY.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-OPR_INST_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'OPR_INST_QTY', this);
  });
  expj.AD0090010.AD0090010form2.OPR_INST_QTY.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.OPR_INST_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/OPR_INST_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-OPR_INST_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-OPR_INST_QTY" name="OPR_INST_QTY" class="AD0090010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0090010Control.getSelectStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getOPR_INST_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-chk_OUTPUT">
expj.AD0090010.AD0090010form2.chk_OUTPUT = {};
expj.AD0090010.AD0090010form2.chk_OUTPUT.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/chk_OUTPUT.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.chk_OUTPUT.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-chk_OUTPUT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010form2', 'chk_OUTPUT', this, 'CheckBox');
    }
  });
  expj.AD0090010.AD0090010form2.chk_OUTPUT.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.chk_OUTPUT.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/chk_OUTPUT.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-chk_OUTPUT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="chk_OUTPUT" value="true" <%= ("true".equals(TypeConverter.convert(aAD0090010Struct.getchk_OUTPUT())) || "".equals(TypeConverter.convert(aAD0090010Struct.getchk_OUTPUT())))?"checked=\"checked\"": "" %> class="AD0090010-focus-move" id="expj-AD0090010-AD0090010form2-chk_OUTPUT"><label for="expj-AD0090010-AD0090010form2-chk_OUTPUT"><%=CoreTools.getRBString("Expj.Cmt3088",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_QTY",rb)%></span><!-- 良品数 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-ACPT_QTY">
expj.AD0090010.AD0090010form2.ACPT_QTY = {};
expj.AD0090010.AD0090010form2.ACPT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/ACPT_QTY.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.ACPT_QTY.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-ACPT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'ACPT_QTY', this);
  });
  expj.AD0090010.AD0090010form2.ACPT_QTY.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.ACPT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/ACPT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-ACPT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-ACPT_QTY" name="ACPT_QTY" class="AD0090010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0090010Control.getSelectStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getACPT_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-STOCK_UNIT">
expj.AD0090010.AD0090010form2.STOCK_UNIT = {};
expj.AD0090010.AD0090010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/STOCK_UNIT.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'STOCK_UNIT', this);
  });
  expj.AD0090010.AD0090010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-STOCK_UNIT" name="STOCK_UNIT" class="AD0090010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0318",rb)%></span><!-- 良品累計数 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-SUM_ACPT_QTY">
expj.AD0090010.AD0090010form2.SUM_ACPT_QTY = {};
expj.AD0090010.AD0090010form2.SUM_ACPT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/SUM_ACPT_QTY.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.SUM_ACPT_QTY.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-SUM_ACPT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'SUM_ACPT_QTY', this);
  });
  expj.AD0090010.AD0090010form2.SUM_ACPT_QTY.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.SUM_ACPT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/SUM_ACPT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-SUM_ACPT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-SUM_ACPT_QTY" name="SUM_ACPT_QTY" class="AD0090010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0090010Control.getSelectStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getSUM_ACPT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEFECT_QTY",rb)%></span><!-- 不良数 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-DEFECT_QTY">
expj.AD0090010.AD0090010form2.DEFECT_QTY = {};
expj.AD0090010.AD0090010form2.DEFECT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/DEFECT_QTY.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.DEFECT_QTY.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-DEFECT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'DEFECT_QTY', this);
  });
  expj.AD0090010.AD0090010form2.DEFECT_QTY.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.DEFECT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/DEFECT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-DEFECT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-DEFECT_QTY" name="DEFECT_QTY" class="AD0090010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0090010Control.getSelectStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getDEFECT_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-d1_STOCK_UNIT">
expj.AD0090010.AD0090010form2.d1_STOCK_UNIT = {};
expj.AD0090010.AD0090010form2.d1_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/d1_STOCK_UNIT.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.d1_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-d1_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'd1_STOCK_UNIT', this);
  });
  expj.AD0090010.AD0090010form2.d1_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.d1_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/d1_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-d1_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-d1_STOCK_UNIT" name="d1_STOCK_UNIT" class="AD0090010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getd1_STOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0325",rb)%></span><!-- 不良累計数 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-SUM_DEFECT_QTY">
expj.AD0090010.AD0090010form2.SUM_DEFECT_QTY = {};
expj.AD0090010.AD0090010form2.SUM_DEFECT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/SUM_DEFECT_QTY.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.SUM_DEFECT_QTY.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-SUM_DEFECT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'SUM_DEFECT_QTY', this);
  });
  expj.AD0090010.AD0090010form2.SUM_DEFECT_QTY.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.SUM_DEFECT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/SUM_DEFECT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-SUM_DEFECT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-SUM_DEFECT_QTY" name="SUM_DEFECT_QTY" class="AD0090010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0090010Control.getSelectStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getSUM_DEFECT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-WH_CD">
expj.AD0090010.AD0090010form2.WH_CD = {};
expj.AD0090010.AD0090010form2.WH_CD.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/WH_CD.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.WH_CD.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'WH_CD', this);
  });
  expj.AD0090010.AD0090010form2.WH_CD.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-WH_CD" name="WH_CD" class="AD0090010-focus-move  required-value expj-AD0090010-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-PeekerWhCd">
expj.AD0090010.AD0090010form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AD0090010form2/WH_CD@<%=contextNo%>"
expj.AD0090010.AD0090010form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0090010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0090010', 'PeekerWhCd', 'SQLPARAM_1', '<%=aAD0090010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0090010form2/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0090010.AD0090010form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010form2.PeekerWhCd['onClick' + i])) {
        expj.AD0090010.AD0090010form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010form2.PeekerWhCd.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0090010-AD0090010form2-PeekerWhCd" class="AD0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-WH_NAME">
expj.AD0090010.AD0090010form2.WH_NAME = {};
expj.AD0090010.AD0090010form2.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/WH_NAME.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.WH_NAME.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'WH_NAME', this);
  });
  expj.AD0090010.AD0090010form2.WH_NAME.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-WH_NAME" name="WH_NAME" class="AD0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getWH_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0090010-AD0090010form2-param3" name="param3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getparam3()) %>">
<script class="expj-script-AD0090010-AD0090010form2-param3">
expj.AD0090010.AD0090010form2.param3 = {};
expj.AD0090010.AD0090010form2.param3.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/param3.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.param3.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-param3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'param3', this);
  });
  expj.AD0090010.AD0090010form2.param3.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.param3.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/param3.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-param3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WS_CD_1",rb)%></span><!-- 実績作業区コード --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-WS_CD">
expj.AD0090010.AD0090010form2.WS_CD = {};
expj.AD0090010.AD0090010form2.WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/WS_CD.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.WS_CD.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'WS_CD', this);
  });
  expj.AD0090010.AD0090010form2.WS_CD.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-WS_CD" name="WS_CD" class="AD0090010-focus-move  required-value expj-AD0090010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AD0090010-AD0090010form2-h_SYS_LOT_CTRL_FLG" name="h_SYS_LOT_CTRL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.geth_SYS_LOT_CTRL_FLG()) %>">
<script class="expj-script-AD0090010-AD0090010form2-h_SYS_LOT_CTRL_FLG">
expj.AD0090010.AD0090010form2.h_SYS_LOT_CTRL_FLG = {};
expj.AD0090010.AD0090010form2.h_SYS_LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/h_SYS_LOT_CTRL_FLG.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.h_SYS_LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-h_SYS_LOT_CTRL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'h_SYS_LOT_CTRL_FLG', this);
  });
  expj.AD0090010.AD0090010form2.h_SYS_LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.h_SYS_LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/h_SYS_LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-h_SYS_LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0090010-AD0090010form2-PeekerWsCd">
expj.AD0090010.AD0090010form2.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_AD0090010form2/WS_CD@<%=contextNo%>"
expj.AD0090010.AD0090010form2.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0090010';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0090010', 'PeekerWsCd', 'SQLPARAM_1', '<%=aAD0090010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AD0090010form2/WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0090010.AD0090010form2.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010form2.PeekerWsCd['onClick' + i])) {
        expj.AD0090010.AD0090010form2.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010form2.PeekerWsCd.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010form2.PeekerWsCd.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010form2', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010form2.PeekerWsCd.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0090010-AD0090010form2-PeekerWsCd" class="AD0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-WS_NAME">
expj.AD0090010.AD0090010form2.WS_NAME = {};
expj.AD0090010.AD0090010form2.WS_NAME.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/WS_NAME.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.WS_NAME.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'WS_NAME', this);
  });
  expj.AD0090010.AD0090010form2.WS_NAME.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-WS_NAME" name="WS_NAME" class="AD0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getWS_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0090010-AD0090010form2-LOT_CTRL_FLG" name="LOT_CTRL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getLOT_CTRL_FLG()) %>">
<script class="expj-script-AD0090010-AD0090010form2-LOT_CTRL_FLG">
expj.AD0090010.AD0090010form2.LOT_CTRL_FLG = {};
expj.AD0090010.AD0090010form2.LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/LOT_CTRL_FLG.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-LOT_CTRL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'LOT_CTRL_FLG', this);
  });
  expj.AD0090010.AD0090010form2.LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-LotInsert">
expj.AD0090010.AD0090010form2.LotInsert = {};
// script1="onClick;0;CHK;?AD0090010form1/*[neq]NORMAL@!ZZ01114"
expj.AD0090010.AD0090010form2.LotInsert.onClick0 = function () {
  console.log('LotInsert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '?AD0090010form1/*'), '[neq]', 'NORMAL')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010form2', 'ZZ01114');
}
};
// script2="onClick;1;CHK;_AD0090010form2/LOT_CTRL_FLG[eq]1@*0,!AE20601"
expj.AD0090010.AD0090010form2.LotInsert.onClick1 = function () {
  console.log('LotInsert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/LOT_CTRL_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010form2', 'AE20601');
}
};
// script3="onClick;2;CHK;_AD0090010form2/ACPT_QTY[eq]0[or]_AD0090010form2/ACPT_QTY[eq]0.0@!AD20139"
expj.AD0090010.AD0090010form2.LotInsert.onClick2 = function () {
  console.log('LotInsert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/ACPT_QTY'), '[eq]', '0') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/ACPT_QTY'), '[eq]', '0.0')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010form2', 'AD20139');
}
};
// script4="onClick;3;SET;_AD0090010form2/param1=AD0090010form2/ITEM_CD,_AD0090010form2/param2=AD0090010form2/LOT_NO,_AD0090010form2/param3=AD0090010form2/OPR_DATE@*2"
expj.AD0090010.AD0090010form2.LotInsert.onClick3 = function () {
  console.log('LotInsert script4');
expj.common.pscript.setReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/param1', 'AD0090010form2/ITEM_CD');
expj.common.pscript.setReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/param2', 'AD0090010form2/LOT_NO');
expj.common.pscript.setReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/param3', 'AD0090010form2/OPR_DATE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;0;CHK;_AD0090010form2/h_FINAL_PROC_FLG[eq]0@!AE20602,*1"
expj.AD0090010.AD0090010form2.LotInsert.child0 = function () {
  console.log('LotInsert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/h_FINAL_PROC_FLG'), '[eq]', '0')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010form2', 'AE20602');
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script6="child;1;CHK;_AD0090010form2/ACPT_QTY[gt]0[and]_AD0090010form2/LOT_NUMBERING_TYP[neq]0@!AE00165"
expj.AD0090010.AD0090010form2.LotInsert.child1 = function () {
  console.log('LotInsert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/ACPT_QTY')), '[gt]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/LOT_NUMBERING_TYP'), '[neq]', '0')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010form2', 'AE00165');
}
};
// script7="child;2;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AD0090010form2/ITEM_CD,_AD0090010form2/OPR_DATE,_AD0090010form2/LOT_NO,_AD0090010form2/param1,_AD0090010form2/param2,_AD0090010form2/param3@AE0200010Servlet,<%=contextNo%>,<%=sv.getScreenName()%>,<%=sv.getScreenID()%>"
expj.AD0090010.AD0090010form2.LotInsert.child2 = function () {
  console.log('LotInsert script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0090010', 'AD0090010form2', '_AD0090010form2/ITEM_CD,_AD0090010form2/OPR_DATE,_AD0090010form2/LOT_NO,_AD0090010form2/param1,_AD0090010form2/param2,_AD0090010form2/param3', 'AE0200010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=sv.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AE0200010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AE0200010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=sv.getScreenName()%>', contents, 'AD0090010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0090010.AD0090010form2.LotInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010form2.LotInsert['onClick' + i])) {
        expj.AD0090010.AD0090010form2.LotInsert['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010form2.LotInsert.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010form2.LotInsert.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-LotInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010form2', 'LotInsert', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010form2.LotInsert.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.LotInsert.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/LotInsert.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-LotInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><button type="button" id="expj-AD0090010-AD0090010form2-LotInsert" name="LotInsert" class="AD0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLotInsert",rb)%></button><!-- ロット管理ボタン --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_LOT_NO_1",rb)%></span><!-- 製造ロット番号 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-VEND_LOT_NO">
expj.AD0090010.AD0090010form2.VEND_LOT_NO = {};
expj.AD0090010.AD0090010form2.VEND_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/VEND_LOT_NO.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.VEND_LOT_NO.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-VEND_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'VEND_LOT_NO', this);
  });
  expj.AD0090010.AD0090010form2.VEND_LOT_NO.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.VEND_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/VEND_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-VEND_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-VEND_LOT_NO" name="VEND_LOT_NO" class="AD0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getVEND_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-LOT_NO">
expj.AD0090010.AD0090010form2.LOT_NO = {};
expj.AD0090010.AD0090010form2.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/LOT_NO.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.LOT_NO.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'LOT_NO', this);
  });
  expj.AD0090010.AD0090010form2.LOT_NO.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-LOT_NO" name="LOT_NO" class="AD0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getLOT_NO()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AD0090010-AD0090010form2-param2" name="param2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getparam2()) %>">
<script class="expj-script-AD0090010-AD0090010form2-param2">
expj.AD0090010.AD0090010form2.param2 = {};
expj.AD0090010.AD0090010form2.param2.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/param2.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.param2.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-param2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'param2', this);
  });
  expj.AD0090010.AD0090010form2.param2.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.param2.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/param2.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-param2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0090010-AD0090010form2-PeekerLotNo">
expj.AD0090010.AD0090010form2.PeekerLotNo = {};
// script1="onClick;0;PEEKER;_AD0090010form2/LOT_NO@<%=contextNo%>"
expj.AD0090010.AD0090010form2.PeekerLotNo.onClick0 = function () {
  console.log('PeekerLotNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0090010';
var parameterValues = 'PeekerLotNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010form2', '_AD0090010form2/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_08%&%';
parameterValues += 'TARGET_FIELD%=%_AD0090010form2/LOT_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0090010.AD0090010form2.PeekerLotNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010form2.PeekerLotNo['onClick' + i])) {
        expj.AD0090010.AD0090010form2.PeekerLotNo['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010form2.PeekerLotNo.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010form2.PeekerLotNo.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-PeekerLotNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010form2', 'PeekerLotNo', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010form2.PeekerLotNo.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.PeekerLotNo.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/PeekerLotNo.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-PeekerLotNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0090010-AD0090010form2-PeekerLotNo" class="AD0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_RSLT_PERSON_1",rb)%></span><!-- 作業担当者 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-OPR_RSLT_PERSON">
expj.AD0090010.AD0090010form2.OPR_RSLT_PERSON = {};
expj.AD0090010.AD0090010form2.OPR_RSLT_PERSON.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/OPR_RSLT_PERSON.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.OPR_RSLT_PERSON.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-OPR_RSLT_PERSON').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'OPR_RSLT_PERSON', this);
  });
  expj.AD0090010.AD0090010form2.OPR_RSLT_PERSON.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.OPR_RSLT_PERSON.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/OPR_RSLT_PERSON.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-OPR_RSLT_PERSON');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-OPR_RSLT_PERSON" name="OPR_RSLT_PERSON" class="AD0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getOPR_RSLT_PERSON()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td over-inner" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_TIME_UNIT_TYP",rb)%></span></div><script class="expj-script-AD0090010-AD0090010form2-OPR_TIME_UNIT_TYP">
expj.AD0090010.AD0090010form2.OPR_TIME_UNIT_TYP = {};
expj.AD0090010.AD0090010form2.OPR_TIME_UNIT_TYP.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/OPR_TIME_UNIT_TYP.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.OPR_TIME_UNIT_TYP.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-OPR_TIME_UNIT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0090010', 'AD0090010form2', 'OPR_TIME_UNIT_TYP', this);
  });
  expj.AD0090010.AD0090010form2.OPR_TIME_UNIT_TYP.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.OPR_TIME_UNIT_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/OPR_TIME_UNIT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-OPR_TIME_UNIT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AD0090010-AD0090010form2-OPR_TIME_UNIT_TYP" name='OPR_TIME_UNIT_TYP' class='AD0090010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAD0090010Control.getStruct().getList_OPR_TIME_UNIT_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0090010Control.getStruct().getList_OPR_TIME_UNIT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0090010Control.getStruct().getList_OPR_TIME_UNIT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0090010Struct.getOPR_TIME_UNIT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRE_ARRANGEMENT_TIME",rb)%></span><!-- 前段取時間 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-PRE_ARRANGEMENT_TIME">
expj.AD0090010.AD0090010form2.PRE_ARRANGEMENT_TIME = {};
expj.AD0090010.AD0090010form2.PRE_ARRANGEMENT_TIME.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/PRE_ARRANGEMENT_TIME.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.PRE_ARRANGEMENT_TIME.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-PRE_ARRANGEMENT_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'PRE_ARRANGEMENT_TIME', this);
  });
  expj.AD0090010.AD0090010form2.PRE_ARRANGEMENT_TIME.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.PRE_ARRANGEMENT_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/PRE_ARRANGEMENT_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-PRE_ARRANGEMENT_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-PRE_ARRANGEMENT_TIME" name="PRE_ARRANGEMENT_TIME" class="AD0090010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;ROUND;4" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getPRE_ARRANGEMENT_TIME()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_TIME",rb)%></span><!-- 作業時間 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-OPR_TIME">
expj.AD0090010.AD0090010form2.OPR_TIME = {};
expj.AD0090010.AD0090010form2.OPR_TIME.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/OPR_TIME.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.OPR_TIME.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-OPR_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'OPR_TIME', this);
  });
  expj.AD0090010.AD0090010form2.OPR_TIME.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.OPR_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/OPR_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-OPR_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-OPR_TIME" name="OPR_TIME" class="AD0090010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;ROUND;4" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getOPR_TIME()) %>" maxlength="2147483647" ></div><!--/td-->
<input type="hidden" id="expj-AD0090010-AD0090010form2-param1" name="param1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getparam1()) %>">
<script class="expj-script-AD0090010-AD0090010form2-param1">
expj.AD0090010.AD0090010form2.param1 = {};
expj.AD0090010.AD0090010form2.param1.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/param1.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.param1.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-param1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'param1', this);
  });
  expj.AD0090010.AD0090010form2.param1.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.param1.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/param1.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-param1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.POST_ARRANGEMENT_TIME",rb)%></span><!-- 後段取時間 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-POST_ARRANGEMENT_TIME">
expj.AD0090010.AD0090010form2.POST_ARRANGEMENT_TIME = {};
expj.AD0090010.AD0090010form2.POST_ARRANGEMENT_TIME.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/POST_ARRANGEMENT_TIME.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.POST_ARRANGEMENT_TIME.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-POST_ARRANGEMENT_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'POST_ARRANGEMENT_TIME', this);
  });
  expj.AD0090010.AD0090010form2.POST_ARRANGEMENT_TIME.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.POST_ARRANGEMENT_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/POST_ARRANGEMENT_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-POST_ARRANGEMENT_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-POST_ARRANGEMENT_TIME" name="POST_ARRANGEMENT_TIME" class="AD0090010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;ROUND;4" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getPOST_ARRANGEMENT_TIME()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CESSATION_TIME",rb)%></span><!-- 停止時間 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-CESSATION_TIME">
expj.AD0090010.AD0090010form2.CESSATION_TIME = {};
expj.AD0090010.AD0090010form2.CESSATION_TIME.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/CESSATION_TIME.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.CESSATION_TIME.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-CESSATION_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'CESSATION_TIME', this);
  });
  expj.AD0090010.AD0090010form2.CESSATION_TIME.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.CESSATION_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/CESSATION_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-CESSATION_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-CESSATION_TIME" name="CESSATION_TIME" class="AD0090010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;ROUND;4" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getCESSATION_TIME()) %>" maxlength="2147483647" ></div><!--/td-->
<input type="hidden" id="expj-AD0090010-AD0090010form2-LOT_NUMBERING_TYP" name="LOT_NUMBERING_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getLOT_NUMBERING_TYP()) %>">
<script class="expj-script-AD0090010-AD0090010form2-LOT_NUMBERING_TYP">
expj.AD0090010.AD0090010form2.LOT_NUMBERING_TYP = {};
expj.AD0090010.AD0090010form2.LOT_NUMBERING_TYP.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/LOT_NUMBERING_TYP.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.LOT_NUMBERING_TYP.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-LOT_NUMBERING_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'LOT_NUMBERING_TYP', this);
  });
  expj.AD0090010.AD0090010form2.LOT_NUMBERING_TYP.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.LOT_NUMBERING_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/LOT_NUMBERING_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-LOT_NUMBERING_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CESSATION_CAUSE",rb)%></span><!-- 停止理由 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-CESSATION_CAUSE">
expj.AD0090010.AD0090010form2.CESSATION_CAUSE = {};
expj.AD0090010.AD0090010form2.CESSATION_CAUSE.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/CESSATION_CAUSE.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.CESSATION_CAUSE.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-CESSATION_CAUSE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'CESSATION_CAUSE', this);
  });
  expj.AD0090010.AD0090010form2.CESSATION_CAUSE.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.CESSATION_CAUSE.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/CESSATION_CAUSE.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-CESSATION_CAUSE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-CESSATION_CAUSE" name="CESSATION_CAUSE" class="AD0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getCESSATION_CAUSE()) %>" maxlength="80" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_RSLT_COMMENT_1",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010form2-OPR_RSLT_COMMENT">
expj.AD0090010.AD0090010form2.OPR_RSLT_COMMENT = {};
expj.AD0090010.AD0090010form2.OPR_RSLT_COMMENT.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/OPR_RSLT_COMMENT.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.OPR_RSLT_COMMENT.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-OPR_RSLT_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'OPR_RSLT_COMMENT', this);
  });
  expj.AD0090010.AD0090010form2.OPR_RSLT_COMMENT.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.OPR_RSLT_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/OPR_RSLT_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-OPR_RSLT_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0090010-AD0090010form2-OPR_RSLT_COMMENT" name="OPR_RSLT_COMMENT" class="AD0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getOPR_RSLT_COMMENT()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-AD0090010-AD0090010form2-h_OPR_DATE" name="h_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.geth_OPR_DATE()) %>">
<script class="expj-script-AD0090010-AD0090010form2-h_OPR_DATE">
expj.AD0090010.AD0090010form2.h_OPR_DATE = {};
expj.AD0090010.AD0090010form2.h_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/h_OPR_DATE.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.h_OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-h_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'h_OPR_DATE', this);
  });
  expj.AD0090010.AD0090010form2.h_OPR_DATE.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.h_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/h_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-h_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0090010-AD0090010form2-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0090010-AD0090010form2-TIME_CTRL">
expj.AD0090010.AD0090010form2.TIME_CTRL = {};
expj.AD0090010.AD0090010form2.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/TIME_CTRL.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'TIME_CTRL', this);
  });
  expj.AD0090010.AD0090010form2.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0090010-AD0090010form2-IN_OPR_INST_CD" name="IN_OPR_INST_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.getIN_OPR_INST_CD()) %>">
<script class="expj-script-AD0090010-AD0090010form2-IN_OPR_INST_CD">
expj.AD0090010.AD0090010form2.IN_OPR_INST_CD = {};
expj.AD0090010.AD0090010form2.IN_OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/IN_OPR_INST_CD.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.IN_OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-IN_OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'IN_OPR_INST_CD', this);
  });
  expj.AD0090010.AD0090010form2.IN_OPR_INST_CD.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.IN_OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/IN_OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-IN_OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0090010-AD0090010form2-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-AD0090010-AD0090010form2-h_BUSINESS_OPR_DATE">
expj.AD0090010.AD0090010form2.h_BUSINESS_OPR_DATE = {};
expj.AD0090010.AD0090010form2.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/h_BUSINESS_OPR_DATE.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.AD0090010.AD0090010form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-h_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0090010-AD0090010form2-h_FINAL_PROC_FLG" name="h_FINAL_PROC_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.geth_FINAL_PROC_FLG()) %>">
<script class="expj-script-AD0090010-AD0090010form2-h_FINAL_PROC_FLG">
expj.AD0090010.AD0090010form2.h_FINAL_PROC_FLG = {};
expj.AD0090010.AD0090010form2.h_FINAL_PROC_FLG.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/h_FINAL_PROC_FLG.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.h_FINAL_PROC_FLG.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-h_FINAL_PROC_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'h_FINAL_PROC_FLG', this);
  });
  expj.AD0090010.AD0090010form2.h_FINAL_PROC_FLG.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.h_FINAL_PROC_FLG.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/h_FINAL_PROC_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-h_FINAL_PROC_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0090010-AD0090010form2-h_PROCESS_MANAGE_FLG" name="h_PROCESS_MANAGE_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0090010Struct.geth_PROCESS_MANAGE_FLG()) %>">
<script class="expj-script-AD0090010-AD0090010form2-h_PROCESS_MANAGE_FLG">
expj.AD0090010.AD0090010form2.h_PROCESS_MANAGE_FLG = {};
expj.AD0090010.AD0090010form2.h_PROCESS_MANAGE_FLG.executeAllOnDecision = function () {
  console.log('execute AD0090010form2/h_PROCESS_MANAGE_FLG.onDecision');
  expj.AD0090010.AD0090010form2.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010form2.h_PROCESS_MANAGE_FLG.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010form2-h_PROCESS_MANAGE_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010form2', 'h_PROCESS_MANAGE_FLG', this);
  });
  expj.AD0090010.AD0090010form2.h_PROCESS_MANAGE_FLG.executePScriptOnLoad();
};

expj.AD0090010.AD0090010form2.h_PROCESS_MANAGE_FLG.executePScriptOnLoad = function () {
  console.log('execute AD0090010form2/h_PROCESS_MANAGE_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010form2-h_PROCESS_MANAGE_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0090010-AD0090010view1">
expj.AD0090010.AD0090010view1 = {};
expj.AD0090010.AD0090010view1.executeAllOnClick = function () {
};
expj.AD0090010.AD0090010view1.executeAllOnDecision = function () {
  console.log('execute AD0090010view1.onDecision');
};
expj.AD0090010.AD0090010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0090010view1", "expj.AD0090010.AD0090010view1.executeAllOnClick");
%>
  expj.AD0090010.AD0090010view1.executePScriptOnLoad();
};

expj.AD0090010.AD0090010view1.executePScriptOnLoad = function () {
  console.log('execute AD0090010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0090010-AD0090010view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0090010view1_Id = "AD0090010view1";
 String AD0090010view1_select = "single";
 String AD0090010view1_sortable = "true";
 String AD0090010view1_resize = "true";
 String AD0090010view1_scroll = "true";
 StringBuffer AD0090010view1_HB = new StringBuffer();
 StringBuffer AD0090010view1_DB = new StringBuffer();
%>
<%
 AD0090010view1_select = "none";
 AD0090010view1_sortable = "true";
 AD0090010view1_resize = "true";
 AD0090010view1_scroll = "true";
%>
<%
 AD0090010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0090010view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AD0090010-AD0090010view1-l_DEFECT_CAUSE_CD">
expj.AD0090010.AD0090010view1.l_DEFECT_CAUSE_CD = {};
expj.AD0090010.AD0090010view1.l_DEFECT_CAUSE_CD.executeAllOnClick = function () {
};
expj.AD0090010.AD0090010view1.l_DEFECT_CAUSE_CD.executeAllOnDecision = function () {
  console.log('execute AD0090010view1/l_DEFECT_CAUSE_CD.onDecision');
  expj.AD0090010.AD0090010view1.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010view1.l_DEFECT_CAUSE_CD.executeOnLoad = function () {
  $('.expj-AD0090010-AD0090010view1-l_DEFECT_CAUSE_CD').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0090010', 'AD0090010view1', 'l_DEFECT_CAUSE_CD', this);
  });
  expj.AD0090010.AD0090010view1.l_DEFECT_CAUSE_CD.executePScriptOnLoad();
};

expj.AD0090010.AD0090010view1.l_DEFECT_CAUSE_CD.executePScriptOnLoad = function () {
  console.log('execute AD0090010view1/l_DEFECT_CAUSE_CD.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0090010-AD0090010view1-l_DEFECT_QTY">
expj.AD0090010.AD0090010view1.l_DEFECT_QTY = {};
expj.AD0090010.AD0090010view1.l_DEFECT_QTY.executeAllOnClick = function () {
};
expj.AD0090010.AD0090010view1.l_DEFECT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0090010view1/l_DEFECT_QTY.onDecision');
  expj.AD0090010.AD0090010view1.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010view1.l_DEFECT_QTY.executeOnLoad = function () {
  $('.expj-AD0090010-AD0090010view1-l_DEFECT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010view1', 'l_DEFECT_QTY', this);
  });
  expj.AD0090010.AD0090010view1.l_DEFECT_QTY.executePScriptOnLoad();
};

expj.AD0090010.AD0090010view1.l_DEFECT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0090010view1/l_DEFECT_QTY.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0090010-AD0090010view1-l_DEFECT_COMMENT">
expj.AD0090010.AD0090010view1.l_DEFECT_COMMENT = {};
expj.AD0090010.AD0090010view1.l_DEFECT_COMMENT.executeAllOnClick = function () {
};
expj.AD0090010.AD0090010view1.l_DEFECT_COMMENT.executeAllOnDecision = function () {
  console.log('execute AD0090010view1/l_DEFECT_COMMENT.onDecision');
  expj.AD0090010.AD0090010view1.executeAllOnDecision();
  expj.AD0090010.executeAllOnDecision();
};
expj.AD0090010.AD0090010view1.l_DEFECT_COMMENT.executeOnLoad = function () {
  $('.expj-AD0090010-AD0090010view1-l_DEFECT_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0090010', 'AD0090010view1', 'l_DEFECT_COMMENT', this);
  });
  expj.AD0090010.AD0090010view1.l_DEFECT_COMMENT.executePScriptOnLoad();
};

expj.AD0090010.AD0090010view1.l_DEFECT_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AD0090010view1/l_DEFECT_COMMENT.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AD0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEFECT_CAUSE_CD",rb))).append("', 'name':'l_DEFECT_CAUSE_CD', 'class':'expj-tooltip expj-view-cell-combobox', 'sortable':").append(AD0090010view1_sortable).append("}").append(",");
AD0090010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEFECT_QTY",rb))).append("', 'name':'l_DEFECT_QTY', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AD0090010view1_sortable).append("}").append(",");
AD0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'400px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEFECT_COMMENT",rb))).append("', 'name':'l_DEFECT_COMMENT', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(AD0090010view1_sortable).append("}").append(",");
%>
<%
 int aAD0090010StructLength = aAD0090010Control.getListsize();
 final AD0090010Struct structBackup = aAD0090010Struct;
 aAD0090010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0090010StructLength; ++loopCount) {
  if((aAD0090010Struct = (AD0090010Struct) aAD0090010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0090010Struct", aAD0090010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0090010view1_DB.append("[");
 AD0090010view1_DB.append(loopCount);
 AD0090010view1_DB.append(",").append("'<select id=\"expj-AD0090010-AD0090010view1-l_DEFECT_CAUSE_CD-").append(loopCount).append("\" class=\"expj-AD0090010-AD0090010view1-l_DEFECT_CAUSE_CD AD0090010-focus-move\" data-name=\"l_DEFECT_CAUSE_CD\" data-view=\"true\">"); for(int i = 0, size = aAD0090010Control.getStruct().getList_l_DEFECT_CAUSE_CD_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0090010Control.getStruct().getList_l_DEFECT_CAUSE_CD_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0090010Control.getStruct().getList_l_DEFECT_CAUSE_CD_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0090010Struct.getl_DEFECT_CAUSE_CD()))) ? " selected" : "";    AD0090010view1_DB.append("<option value=\"").append(val).append("\"").append( selected ).append(">").append(name).append("</option>");  } AD0090010view1_DB.append("</select>'");
 AD0090010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AD0090010-AD0090010view1-l_DEFECT_QTY-").append(loopCount).append("\" class=\"expj-AD0090010-AD0090010view1-l_DEFECT_QTY AD0090010-focus-move\" data-name=\"l_DEFECT_QTY\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append(Kind.convertNumeric(aAD0090010Control.getSelectStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAD0090010Struct.getl_DEFECT_QTY())).append("\">'");
 AD0090010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AD0090010-AD0090010view1-l_DEFECT_COMMENT-").append(loopCount).append("\" class=\"expj-AD0090010-AD0090010view1-l_DEFECT_COMMENT AD0090010-focus-move\" data-name=\"l_DEFECT_COMMENT\" data-view=\"true\" maxlength=\"80\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAD0090010Struct.getl_DEFECT_COMMENT())).append("\">'");
 AD0090010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0090010StructLength) {
   AD0090010view1_DB.append(",");
  }
 }
 aAD0090010Struct = structBackup;
 viewIdList.add(AD0090010view1_Id);
 viewSelectList.add(AD0090010view1_select);
 viewResizeList.add(AD0090010view1_resize);
 viewScrollList.add(AD0090010view1_scroll);
 viewHeaderDataList.add(AD0090010view1_HB);
 viewBodyDataList.add(AD0090010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:769px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 853px);"><script class="expj-script-AD0090010-AD0090010button2">
expj.AD0090010.AD0090010button2 = {};
expj.AD0090010.AD0090010button2.executeAllOnDecision = function () {
  console.log('execute AD0090010button2.onDecision');
};
expj.AD0090010.AD0090010button2.executeOnLoad = function () {
  expj.AD0090010.AD0090010button2.executePScriptOnLoad();
};

expj.AD0090010.AD0090010button2.executePScriptOnLoad = function () {
  console.log('execute AD0090010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0090010-AD0090010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0090010-AD0090010button2-Insert">
expj.AD0090010.AD0090010button2.Insert = {};
// script1="onClick;0;CHK;_AD0090010form2/h_BUSINESS_OPR_DATE[lt]_AD0090010form2/OPR_DATE@!AD30773"
expj.AD0090010.AD0090010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/h_BUSINESS_OPR_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AD30773');
}
};
// script2="onClick;1;CHK;_AD0090010form2/h_PROCESS_MANAGE_FLG[neq]1[and]_AD0090010form2/h_FINAL_PROC_FLG[eq]1[and][{_AD0090010form2/ACPT_QTY}+{_AD0090010form2/DEFECT_QTY}][neq]0[and]_AD0090010form2/WH_CD[eq]@!AD20060"
expj.AD0090010.AD0090010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/h_PROCESS_MANAGE_FLG'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/h_FINAL_PROC_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/ACPT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/DEFECT_QTY')), '[neq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/WH_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AD20060');
}
};
// script3="onClick;2;CHK;_AD0090010form2/h_PROCESS_MANAGE_FLG[eq]1[and][{_AD0090010form2/ACPT_QTY}+{_AD0090010form2/DEFECT_QTY}][neq]0[and]_AD0090010form2/WH_CD[eq]@!AD20060"
expj.AD0090010.AD0090010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/h_PROCESS_MANAGE_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/ACPT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/DEFECT_QTY')), '[neq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/WH_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AD20060');
}
};
// script4="onClick;3;COLCHKT;AD0090010view1:_l_DEFECT_CAUSE_CD[eq]0[and]_l_DEFECT_QTY[gt]0@!AD30009"
expj.AD0090010.AD0090010button2.Insert.onClick3 = function () {
  console.log('Insert script4');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AD0090010', 'AD0090010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_DEFECT_CAUSE_CD, '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(cell.l_DEFECT_QTY), '[gt]', expj.common.pscript.convertNumber('0'))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AD30009');
}
};
// script5="onClick;4;CHK;<%= TypeConverter.sanitizer(h_UNIT_QTY_TYP) %>[eq]1@*0,*1"
expj.AD0090010.AD0090010button2.Insert.onClick4 = function () {
  console.log('Insert script5');
if (expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(h_UNIT_QTY_TYP) %>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script6="child;0;COLCHKT;AD0090010view1:_l_DEFECT_CAUSE_CD[neq]0[and]_l_DEFECT_QTY[lte]0@!AD00102"
expj.AD0090010.AD0090010button2.Insert.child0 = function () {
  console.log('Insert script6');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AD0090010', 'AD0090010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_DEFECT_CAUSE_CD, '[neq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(cell.l_DEFECT_QTY), '[lte]', expj.common.pscript.convertNumber('0'))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AD00102');
}
};
// script7="child;1;COLCHKT;AD0090010view1:_l_DEFECT_CAUSE_CD[neq]0[and]_l_DEFECT_QTY[lte]0@!AD00103"
expj.AD0090010.AD0090010button2.Insert.child1 = function () {
  console.log('Insert script7');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AD0090010', 'AD0090010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_DEFECT_CAUSE_CD, '[neq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(cell.l_DEFECT_QTY), '[lte]', expj.common.pscript.convertNumber('0'))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AD00103');
}
};
// script8="onClick;5;CHK;~COLSUM(_AD0090010view1/l_DEFECT_QTY)[gt]_AD0090010form2/DEFECT_QTY@!AD00118"
expj.AD0090010.AD0090010button2.Insert.onClick5 = function () {
  console.log('Insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.COLSUM('AD0090010', 'AD0090010button2', '_AD0090010view1/l_DEFECT_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/DEFECT_QTY')))) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AD00118');
}
};
// script9="onClick;6;CHK;_AD0090010form2/TIME_CTRL[eq]true@*2"
expj.AD0090010.AD0090010button2.Insert.onClick6 = function () {
  console.log('Insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script10="child;2;CHK;~LEN(_AD0090010form2/OPRATION_TIME)[eq]1[or]~LEN(_AD0090010form2/OPRATION_TIME)[eq]2@!AS00043"
expj.AD0090010.AD0090010button2.Insert.child2 = function () {
  console.log('Insert script10');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0090010', 'AD0090010button2', '_AD0090010form2/OPRATION_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0090010', 'AD0090010button2', '_AD0090010form2/OPRATION_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AS00043');
}
};
// script11="onClick;7;CHK;_AD0090010form2/TIME_CTRL[eq]true[and]~LEN(_AD0090010form2/OPRATION_TIME)[eq]3@*3"
expj.AD0090010.AD0090010button2.Insert.onClick7 = function () {
  console.log('Insert script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0090010', 'AD0090010button2', '_AD0090010form2/OPRATION_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script12="child;3;CHK;[{~CHARAT(_AD0090010form2/OPRATION_TIME:1)}*10+{~CHARAT(_AD0090010form2/OPRATION_TIME:2)}][gte]60@!AS00044"
expj.AD0090010.AD0090010button2.Insert.child3 = function () {
  console.log('Insert script12');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0090010', 'AD0090010button2', '_AD0090010form2/OPRATION_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0090010', 'AD0090010button2', '_AD0090010form2/OPRATION_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AS00044');
}
};
// script13="onClick;8;CHK;_AD0090010form2/TIME_CTRL[eq]true[and]~LEN(_AD0090010form2/OPRATION_TIME)[eq]4@*4"
expj.AD0090010.AD0090010button2.Insert.onClick8 = function () {
  console.log('Insert script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0090010', 'AD0090010button2', '_AD0090010form2/OPRATION_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script14="child;4;CHK;[{~CHARAT(_AD0090010form2/OPRATION_TIME:0)}*10+{~CHARAT(_AD0090010form2/OPRATION_TIME:1)}][gte]24[or][{~CHARAT(_AD0090010form2/OPRATION_TIME:2)}*10+{~CHARAT(_AD0090010form2/OPRATION_TIME:3)}][gte]60@!AS00044"
expj.AD0090010.AD0090010button2.Insert.child4 = function () {
  console.log('Insert script14');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0090010', 'AD0090010button2', '_AD0090010form2/OPRATION_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0090010', 'AD0090010button2', '_AD0090010form2/OPRATION_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0090010', 'AD0090010button2', '_AD0090010form2/OPRATION_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0090010', 'AD0090010button2', '_AD0090010form2/OPRATION_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AS00044');
}
};
// script15="onClick;9;CHK;_AD0090010form2/h_SYS_LOT_CTRL_FLG[eq]true@*5"
expj.AD0090010.AD0090010button2.Insert.onClick9 = function () {
  console.log('Insert script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/h_SYS_LOT_CTRL_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script16="child;5;CHK;_AD0090010form2/LOT_CTRL_FLG[eq]1@*6,*11"
expj.AD0090010.AD0090010button2.Insert.child5 = function () {
  console.log('Insert script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/LOT_CTRL_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script17="child;6;CHK;_AD0090010form2/h_FINAL_PROC_FLG[eq]1[or]_AD0090010form2/h_FINAL_PROC_FLG[eq]@*7,*10"
expj.AD0090010.AD0090010button2.Insert.child6 = function () {
  console.log('Insert script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/h_FINAL_PROC_FLG'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/h_FINAL_PROC_FLG'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script18="child;7;CHK;_AD0090010form2/ACPT_QTY[numeq]0@*8,*9"
expj.AD0090010.AD0090010button2.Insert.child7 = function () {
  console.log('Insert script18');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/ACPT_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script19="child;8;CHK;_AD0090010form2/LOT_NO[neq]@!AD20139"
expj.AD0090010.AD0090010button2.Insert.child8 = function () {
  console.log('Insert script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/LOT_NO'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AD20139');
}
};
// script20="child;9;CHK;_AD0090010form2/LOT_NUMBERING_TYP[neq]0[and]_AD0090010form2/LOT_NO[eq]@$AE20613,*12"
expj.AD0090010.AD0090010button2.Insert.child9 = function () {
  console.log('Insert script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/LOT_NUMBERING_TYP'), '[neq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/LOT_NO'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AD0090010', 'AD0090010button2', 'AE20613');
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script21="child;10;CHK;_AD0090010form2/LOT_NO[neq]@!AE20602"
expj.AD0090010.AD0090010button2.Insert.child10 = function () {
  console.log('Insert script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/LOT_NO'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AE20602');
}
};
// script22="child;11;CHK;_AD0090010form2/LOT_NO[neq]@!AE20601"
expj.AD0090010.AD0090010button2.Insert.child11 = function () {
  console.log('Insert script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/LOT_NO'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AE20601');
}
};
// script23="child;12;CHK;_AD0090010form2/LOT_NO[eq]@!AE20600"
expj.AD0090010.AD0090010button2.Insert.child12 = function () {
  console.log('Insert script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/LOT_NO'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AD0090010', 'AD0090010button2', 'AE20600');
}
};
// script24="onClick;10;CHK;[{_AD0090010form2/ACPT_QTY}+{_AD0090010form2/SUM_ACPT_QTY}+{_AD0090010form2/DEFECT_QTY}+{_AD0090010form2/SUM_DEFECT_QTY}][gt]_AD0090010form2/OPR_INST_QTY@$AD25044"
expj.AD0090010.AD0090010button2.Insert.onClick10 = function () {
  console.log('Insert script24');
if (expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/ACPT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/SUM_ACPT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/DEFECT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/SUM_DEFECT_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/OPR_INST_QTY')))) {
expj.common.pscript.addWarningMessage('AD0090010', 'AD0090010button2', 'AD25044');
}
};
// script25="onClick;11;CHK;_AD0090010form2/chk_COMPLETE[eq]true[and][{_AD0090010form2/ACPT_QTY}+{_AD0090010form2/SUM_ACPT_QTY}+{_AD0090010form2/DEFECT_QTY}+{_AD0090010form2/SUM_DEFECT_QTY}][lt]_AD0090010form2/OPR_INST_QTY@$AD25045"
expj.AD0090010.AD0090010button2.Insert.onClick11 = function () {
  console.log('Insert script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/chk_COMPLETE'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/ACPT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/SUM_ACPT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/DEFECT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/SUM_DEFECT_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/OPR_INST_QTY')))) {
expj.common.pscript.addWarningMessage('AD0090010', 'AD0090010button2', 'AD25045');
}
};
// script26="onClick;12;CHK;_AD0090010form2/h_BUSINESS_OPR_DATE[gt]_AD0090010form2/OPR_DATE@$AD25028"
expj.AD0090010.AD0090010button2.Insert.onClick12 = function () {
  console.log('Insert script26');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/h_BUSINESS_OPR_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0090010', 'AD0090010button2', 'AD25028');
}
};
// script27="onClick;13;CHK;~COLSUM(_AD0090010view1/l_DEFECT_QTY)[lt]_AD0090010form2/DEFECT_QTY@$AD00117"
expj.AD0090010.AD0090010button2.Insert.onClick13 = function () {
  console.log('Insert script27');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.COLSUM('AD0090010', 'AD0090010button2', '_AD0090010view1/l_DEFECT_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/DEFECT_QTY')))) {
expj.common.pscript.addWarningMessage('AD0090010', 'AD0090010button2', 'AD00117');
}
};
// script28="onClick;14;CHK;_AD0090010form2/chk_OUTPUT[eq]true@*13"
expj.AD0090010.AD0090010button2.Insert.onClick14 = function () {
  console.log('Insert script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/chk_OUTPUT'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script29="child;13;CFMPUT;_AD0090010button2/Insert=YES:-,14@KZ10001"
expj.AD0090010.AD0090010button2.Insert.child13 = function () {
  console.log('Insert script29');
var yesFunc = function () {
expj.common.pscript.backInputValue('AD0090010', 'AD0090010button2', '_AD0090010button2/Insert');
};
var noFunc = function () {
expj.AD0090010.AD0090010button2.Insert.child14();
};
expj.common.pscript.executeConfirmPut('AD0090010', 'AD0090010button2', '_AD0090010button2/Insert', 'KZ10001', yesFunc, noFunc);
};
// script30="child;14;SET;_AD0090010form2/chk_OUTPUT=false"
expj.AD0090010.AD0090010button2.Insert.child14 = function () {
  console.log('Insert script30');
expj.common.pscript.setReferenceComponentValue('AD0090010', 'AD0090010button2', '_AD0090010form2/chk_OUTPUT', 'false');
};
// script31="onClick;15;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0090010form1/*,_AD0090010form2/*,_AD0090010view1/*@AD0090010Servlet,,$ZZ07001"
expj.AD0090010.AD0090010button2.Insert.onClick15 = function () {
  console.log('Insert script31');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0090010', 'AD0090010button2', '_AD0090010form1/*,_AD0090010form2/*,_AD0090010view1/*', 'AD0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0090010', response);
expj.common.changeBusinessScreenTab('AD0090010', contents);
};
expj.common.pscript.callConfirm('AD0090010', 'AD0090010button2', 'ZZ07001', okEvent);
};
expj.AD0090010.AD0090010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 15; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010button2.Insert['onClick' + i])) {
        expj.AD0090010.AD0090010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010button2.Insert.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010button2.Insert.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010button2', 'Insert', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010button2.Insert.executePScriptOnLoad();
};

expj.AD0090010.AD0090010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute AD0090010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0090010-AD0090010button2-Insert" name="Insert" class="AD0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 410px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0090010 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AD0090010-AD0090010button0">
expj.AD0090010.AD0090010button0 = {};
expj.AD0090010.AD0090010button0.executeAllOnDecision = function () {
  console.log('execute AD0090010button0.onDecision');
};
expj.AD0090010.AD0090010button0.executeOnLoad = function () {
  expj.AD0090010.AD0090010button0.executePScriptOnLoad();
};

expj.AD0090010.AD0090010button0.executePScriptOnLoad = function () {
  console.log('execute AD0090010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0090010-AD0090010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0090010-AD0090010button0-CancelComplete">
expj.AD0090010.AD0090010button0.CancelComplete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0090010form1/*,_AD0090010form2/*@AD0090010Servlet,,$AD00091"
expj.AD0090010.AD0090010button0.CancelComplete.onClick0 = function () {
  console.log('CancelComplete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0090010', 'AD0090010button0', '_AD0090010form1/*,_AD0090010form2/*', 'AD0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0090010', response);
expj.common.updateBusinessScreenTab('AD0090010', contents);
};
expj.common.pscript.callConfirm('AD0090010', 'AD0090010button0', 'AD00091', okEvent);
};
expj.AD0090010.AD0090010button0.CancelComplete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010button0.CancelComplete['onClick' + i])) {
        expj.AD0090010.AD0090010button0.CancelComplete['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010button0.CancelComplete.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010button0.CancelComplete.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010button0-CancelComplete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010button0', 'CancelComplete', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010button0.CancelComplete.executePScriptOnLoad();
};

expj.AD0090010.AD0090010button0.CancelComplete.executePScriptOnLoad = function () {
  console.log('execute AD0090010button0/CancelComplete.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010button0-CancelComplete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0090010-AD0090010button0-CancelComplete" name="CancelComplete" class="AD0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelComplete",rb)%></button><!-- 完了解除ボタン --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010button0-MainTain">
expj.AD0090010.AD0090010button0.MainTain = {};
// script1="onClick;0;SET;_AD0090010form2/param1=_AD0090010form1/IN_OPR_INST_CD@*0"
expj.AD0090010.AD0090010button0.MainTain.onClick0 = function () {
  console.log('MainTain script1');
expj.common.pscript.setReferenceComponentValue('AD0090010', 'AD0090010button0', '_AD0090010form2/param1', expj.common.pscript.getReferenceComponentValue('AD0090010', 'AD0090010button0', '_AD0090010form1/IN_OPR_INST_CD'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child0)){this.child0();}}
};
// script2="child;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AD0090010form2/param1@AD0040010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AD0090010.AD0090010button0.MainTain.child0 = function () {
  console.log('MainTain script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0090010', 'AD0090010button0', '_AD0090010form2/param1', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AD0040010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AD0090010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0090010.AD0090010button0.MainTain.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010button0.MainTain['onClick' + i])) {
        expj.AD0090010.AD0090010button0.MainTain['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010button0.MainTain.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010button0.MainTain.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010button0-MainTain').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010button0', 'MainTain', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010button0.MainTain.executePScriptOnLoad();
};

expj.AD0090010.AD0090010button0.MainTain.executePScriptOnLoad = function () {
  console.log('execute AD0090010button0/MainTain.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010button0-MainTain');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0090010-AD0090010button0-MainTain" name="MainTain" class="AD0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnMaintenance",rb)%></button><!-- メンテナンスボタン --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010button0-Clear">
expj.AD0090010.AD0090010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AD0090010Servlet,,$ZZ07008"
expj.AD0090010.AD0090010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0090010', 'AD0090010button0', '', 'AD0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0090010', response);
expj.common.updateBusinessScreenTab('AD0090010', contents);
};
expj.common.pscript.callConfirm('AD0090010', 'AD0090010button0', 'ZZ07008', okEvent);
};
expj.AD0090010.AD0090010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010button0.Clear['onClick' + i])) {
        expj.AD0090010.AD0090010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010button0.Clear.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010button0.Clear.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010button0.Clear.executePScriptOnLoad();
};

expj.AD0090010.AD0090010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0090010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0090010-AD0090010button0-Clear" name="Clear" class="AD0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0090010-AD0090010button0-Close">
expj.AD0090010.AD0090010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0090010.AD0090010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0090010');
};
expj.AD0090010.AD0090010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0090010.AD0090010button0.Close['onClick' + i])) {
        expj.AD0090010.AD0090010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0090010.AD0090010button0.Close.executeAllOnDecision = function () {
};
expj.AD0090010.AD0090010button0.Close.executeOnLoad = function () {
  $('#expj-AD0090010-AD0090010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0090010', 'AD0090010button0', 'Close', this, 'Button');
    }
  });
  expj.AD0090010.AD0090010button0.Close.executePScriptOnLoad();
};

expj.AD0090010.AD0090010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0090010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0090010-AD0090010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0090010-AD0090010button0-Close" name="Close" class="AD0090010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0090010 (END)-->
<script class="expj-script-AD0090010-AD0090010detail1">
expj.AD0090010.AD0090010detail1 = {};
expj.AD0090010.AD0090010detail1.executeAllOnDecision = function () {
  console.log('execute AD0090010detail1.onDecision');
};
expj.AD0090010.AD0090010detail1.executeOnLoad = function () {
  expj.AD0090010.AD0090010detail1.executePScriptOnLoad();
};

expj.AD0090010.AD0090010detail1.executePScriptOnLoad = function () {
  console.log('execute AD0090010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAD0090010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AD0090010-AD0090010detail1" class="expj-datagird-detail" data-float="AD0090010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AD0090010detail1";
 detailFloat = "AD0090010float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AD0090010detail1_Id = "AD0090010detail1";
 String AD0090010detail1_select = "single";
 String AD0090010detail1_sortable = "true";
 String AD0090010detail1_resize = "true";
 String AD0090010detail1_scroll = "true";
 StringBuffer AD0090010detail1_HB = new StringBuffer();
 StringBuffer AD0090010detail1_DB = new StringBuffer();
%>
<%
 AD0090010detail1_sortable = "false";
 AD0090010detail1_select = "none";
%>
<% AD0090010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AD0090010detail1_sortable).append("}").append(","); %>
<%  AD0090010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AD0090010detail1_sortable).append("}").append(",");
AD0090010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AD0090010detail1_sortable).append("}").append(",");
AD0090010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AD0090010detail1_sortable).append("}").append(",");
 %>
  <% AD0090010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AD0090010-AD0090010detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0090010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0090010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_SPEC",rb)).append("','").append("<span id=\"expj-AD0090010-AD0090010detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0090010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0090010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AD0090010-AD0090010detail1-MRP_ODR_TYP_DN\" class=\"expj-label\" data-name=\"MRP_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0090010Struct.getMRP_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0090010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.JOB_ODR_CD",rb)).append("','").append("<span id=\"expj-AD0090010-AD0090010detail1-JOB_ODR_CD\" class=\"expj-label\" data-name=\"JOB_ODR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0090010Struct.getJOB_ODR_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0090010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.WS_CD",rb)).append("','").append("<span id=\"expj-AD0090010-AD0090010detail1-WS_CD\" class=\"expj-label\" data-name=\"WS_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0090010Struct.getWS_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0090010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.WS_NAME",rb)).append("','").append("<span id=\"expj-AD0090010-AD0090010detail1-WS_NAME\" class=\"expj-label\" data-name=\"WS_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0090010Struct.getWS_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0090010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_7",rb)).append("','").append("<span id=\"expj-AD0090010-AD0090010detail1-WORK_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"WORK_ODR_DLV_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0090010Struct.getWORK_ODR_DLV_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0090010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.OPR_INST_START_DATE_7",rb)).append("','").append("<span id=\"expj-AD0090010-AD0090010detail1-OPR_INST_START_DATE\" class=\"expj-label\" data-name=\"OPR_INST_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0090010Struct.getOPR_INST_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AD0090010detail1_Id;
 detailViewSelect = AD0090010detail1_select;
 detailViewResize = AD0090010detail1_resize;
 detailViewScroll = AD0090010detail1_scroll;
 detailViewHeaderData = AD0090010detail1_HB;
 detailViewBodyData = AD0090010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAD0090010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0090010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0090010)) {
  expj.common.treeInstanceMap.AD0090010 = {};
}
expj.common.treeInstanceMap.AD0090010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0090010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0090010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0090010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0090010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0090010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0090010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0090010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0090010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0090010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0090010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0090010)) {
  expj.common.detailDialogMap.AD0090010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0090010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0090010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0090010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0090010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0090010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0090010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0090010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0090010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0090010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0090010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0090010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0090010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0090010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0090010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0090010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0090010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0090010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0090010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0090010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0090010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0090010)) {
  expj.common.viewInstanceMap.AD0090010 = {};
}
expj.common.viewInstanceMap.AD0090010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0090010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0090010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0090010.<%=viewId %>.init = function () {
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
    expj.AD0090010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0090010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0090010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0090010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0090010_init">
/**
 * AD0090010用のロード完了時初期化関数
 */
expj.AD0090010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0090010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0090010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0090010');
  expj.common.calendarInstanceMap.AD0090010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0090010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0090010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0090010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0090010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0090010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0090010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0090010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0090010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0090010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0090010.AD0090010form1.IN_OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form1.PeekerOprInstCd.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form1.PARTIAL_PRD_NO.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.chk_COMPLETE.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.WORK_IN_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.chk_CHILD_RSLTUPDATE.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.CalendarOprDate.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.OPRATION_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.OPR_INST_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.chk_OUTPUT.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.ACPT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.SUM_ACPT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.DEFECT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.d1_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.SUM_DEFECT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.param3.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.h_SYS_LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.LotInsert.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.VEND_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.param2.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.PeekerLotNo.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.OPR_RSLT_PERSON.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.OPR_TIME_UNIT_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.PRE_ARRANGEMENT_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.OPR_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.param1.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.POST_ARRANGEMENT_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.CESSATION_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.LOT_NUMBERING_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.CESSATION_CAUSE.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.OPR_RSLT_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.h_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.IN_OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.h_FINAL_PROC_FLG.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.h_PROCESS_MANAGE_FLG.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010view1.l_DEFECT_CAUSE_CD.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010view1.l_DEFECT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010view1.l_DEFECT_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010button0.CancelComplete.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010button0.MainTain.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form1.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010button1.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010form2.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010view1.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010button2.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010button0.executeOnLoad();}catch(e){};
  try{expj.AD0090010.AD0090010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0090010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0090010', 'AD0090010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0090010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0090010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0090010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0090010', '<%=request.getContextPath() %>');
};

/**
 * AD0090010の全体onDecision処理
 */
expj.AD0090010.executeAllOnDecision = function () {
  expj.AD0090010.AD0090010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0090010_console">
expj.AD0090010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>