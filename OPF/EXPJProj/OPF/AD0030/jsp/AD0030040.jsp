<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:30:48 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0030\AD0030040.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0030.*" %>
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
<jsp:useBean id="aAD0030040Control" class="com.nec.jp.orteus.metamorBase.AD0030.AD0030040Control" scope="request"/>
<jsp:useBean id="aAD0030040Struct" class="com.nec.jp.orteus.metamorBase.AD0030.AD0030040Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業指示票発行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/jsp/AD0030040.jsp,v $
$Author: geng-jia $	
$Revision: 1.24 $ $Date: 2017/02/22 02:04:46 $
********************************************************* --%>
<html>
<head>
<title>作業指示票発行</title>
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
<script class="expj-script-AD0030040_init">
  // AD0030040名前空間
  expj.AD0030040 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AD0030040" data-screen="AD0030040" data-newdata="<%=aAD0030040Control.isNewData() %>">
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
              <script class="expj-script-AD0030040-AD0030040form1">
expj.AD0030040.AD0030040form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.AD0030040.AD0030040form1.onLoad0 = function () {
  console.log('AD0030040form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHK;_AD0030040form1/r1_MODE[eq]true@*0,*1"
expj.AD0030040.AD0030040form1.onDecision0 = function () {
  console.log('AD0030040form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/r1_MODE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;CHKRQ;A@*2,*3"
expj.AD0030040.AD0030040form1.child0 = function () {
  console.log('AD0030040form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030040', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHKRQ;B@*2,*3"
expj.AD0030040.AD0030040form1.child1 = function () {
  console.log('AD0030040form1 script4');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030040', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;UNMASK;_AD0030040button1/Select"
expj.AD0030040.AD0030040form1.child2 = function () {
  console.log('AD0030040form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button1/Select');
};
// script6="child;3;MASK;_AD0030040button1/Select"
expj.AD0030040.AD0030040form1.child3 = function () {
  console.log('AD0030040form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button1/Select');
};
// script7="onDecision;1;CHK;?AD0030040form1/*[eq]NORMAL@*4,*6"
expj.AD0030040.AD0030040form1.onDecision1 = function () {
  console.log('AD0030040form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;4;CHK;?AD0030040form1/OPR_INST_START_DATE[eq]SAME[and]?OPR_INST_START_TIME[eq]SAME[and]?AD0030040form1/WORK_ODR_DLV_DATE[eq]SAME[and]?WORK_ODR_DLV_TIME[eq]SAME[and]?AD0030040form1/JOB_ODR_CD[eq]SAME[and]?AD0030040form1/ITEM_CD[eq]SAME[and]?AD0030040form1/WS_CD[eq]SAME[and]?AD0030040form1/c_RE_PRINT[eq]SAME[and]?AD0030040form1/c_CARD_PRINT[eq]SAME[and]?AD0030040form1/r1_MODE[eq]SAME[and]?AD0030040form1/r2_MODE[eq]SAME@*5,*6"
expj.AD0030040.AD0030040form1.child4 = function () {
  console.log('AD0030040form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/OPR_INST_START_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?OPR_INST_START_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/WORK_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?WORK_ODR_DLV_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/c_RE_PRINT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/c_CARD_PRINT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/r1_MODE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/r2_MODE'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_AD0030040button0/Print@*17"
expj.AD0030040.AD0030040form1.child5 = function () {
  console.log('AD0030040form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button0/Print');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script10="child;6;MASK;_AD0030040button0/Print,_AD0030040button0/CardPrint"
expj.AD0030040.AD0030040form1.child6 = function () {
  console.log('AD0030040form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button0/Print');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button0/CardPrint');
};
// script11="onDecision;2;CHK;?AD0030040form1/OPR_INST_START_DATE[eq]SAME[and]?OPR_INST_START_TIME[eq]SAME[and]?AD0030040form1/WORK_ODR_DLV_DATE[eq]SAME[and]?WORK_ODR_DLV_TIME[eq]SAME[and]?AD0030040form1/JOB_ODR_CD[eq]SAME[and]?AD0030040form1/ITEM_CD[eq]SAME[and]?AD0030040form1/WS_CD[eq]SAME[and]?AD0030040form1/c_RE_PRINT[eq]SAME[and]?AD0030040form1/c_CARD_PRINT[eq]SAME[and]?AD0030040form1/r1_MODE[eq]SAME[and]?AD0030040form1/r2_MODE[eq]SAME[and]?AD0030040form1/*[eq]NORMAL@*7,*8"
expj.AD0030040.AD0030040form1.onDecision2 = function () {
  console.log('AD0030040form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/OPR_INST_START_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?OPR_INST_START_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/WORK_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?WORK_ODR_DLV_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/c_RE_PRINT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/c_CARD_PRINT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/r1_MODE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/r2_MODE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_AD0030040button2/CheckAll,_AD0030040button2/UncheckAll"
expj.AD0030040.AD0030040form1.child7 = function () {
  console.log('AD0030040form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button2/UncheckAll');
};
// script13="child;8;MASK;_AD0030040button2/CheckAll,_AD0030040button2/UncheckAll"
expj.AD0030040.AD0030040form1.child8 = function () {
  console.log('AD0030040form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button2/UncheckAll');
};
// script14="onDecision;3;CHK;_AD0030040form1/r1_MODE[eq]true@*9,*12"
expj.AD0030040.AD0030040form1.onDecision3 = function () {
  console.log('AD0030040form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/r1_MODE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script15="child;9;UNMASK;_AD0030040form1/OPR_INST_START_DATE,_AD0030040form1/OPR_INST_START_TIME,_AD0030040form1/CalendarOprInstStartDate@*10"
expj.AD0030040.AD0030040form1.child9 = function () {
  console.log('AD0030040form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/OPR_INST_START_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/OPR_INST_START_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/CalendarOprInstStartDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script16="child;10;MASK;_AD0030040form1/WORK_ODR_DLV_DATE,_AD0030040form1/WORK_ODR_DLV_TIME,_AD0030040form1/CalendarWorkOdrDlvDate@*11"
expj.AD0030040.AD0030040form1.child10 = function () {
  console.log('AD0030040form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/WORK_ODR_DLV_DATE');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/WORK_ODR_DLV_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/CalendarWorkOdrDlvDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script17="child;11;SET;_AD0030040form1/WORK_ODR_DLV_DATE=,_AD0030040form1/WORK_ODR_DLV_TIME="
expj.AD0030040.AD0030040form1.child11 = function () {
  console.log('AD0030040form1 script17');
expj.common.pscript.setReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/WORK_ODR_DLV_DATE', '');
expj.common.pscript.setReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/WORK_ODR_DLV_TIME', '');
};
// script18="child;12;UNMASK;_AD0030040form1/WORK_ODR_DLV_DATE,_AD0030040form1/WORK_ODR_DLV_TIME,_AD0030040form1/CalendarWorkOdrDlvDate@*13"
expj.AD0030040.AD0030040form1.child12 = function () {
  console.log('AD0030040form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/WORK_ODR_DLV_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/WORK_ODR_DLV_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/CalendarWorkOdrDlvDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script19="child;13;MASK;_AD0030040form1/OPR_INST_START_DATE,_AD0030040form1/OPR_INST_START_TIME,_AD0030040form1/CalendarOprInstStartDate@*14"
expj.AD0030040.AD0030040form1.child13 = function () {
  console.log('AD0030040form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/OPR_INST_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/OPR_INST_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040form1/CalendarOprInstStartDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script20="child;14;SET;_AD0030040form1/OPR_INST_START_DATE=,_AD0030040form1/OPR_INST_START_TIME="
expj.AD0030040.AD0030040form1.child14 = function () {
  console.log('AD0030040form1 script20');
expj.common.pscript.setReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/OPR_INST_START_DATE', '');
expj.common.pscript.setReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/OPR_INST_START_TIME', '');
};
// script21="onDecision;4;CHK;_TIME_CTRL[eq]false@*15"
expj.AD0030040.AD0030040form1.onDecision4 = function () {
  console.log('AD0030040form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '_TIME_CTRL'), '[eq]', 'false')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script22="child;15;MASK;_OPR_INST_START_TIME,_WORK_ODR_DLV_TIME@*16"
expj.AD0030040.AD0030040form1.child15 = function () {
  console.log('AD0030040form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_OPR_INST_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_WORK_ODR_DLV_TIME');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child16)){this.child16();}}
};
// script23="child;16;SET;_OPR_INST_START_TIME=,_WORK_ODR_DLV_TIME="
expj.AD0030040.AD0030040form1.child16 = function () {
  console.log('AD0030040form1 script23');
expj.common.pscript.setReferenceComponentValue('AD0030040', 'AD0030040form1', '_OPR_INST_START_TIME', '');
expj.common.pscript.setReferenceComponentValue('AD0030040', 'AD0030040form1', '_WORK_ODR_DLV_TIME', '');
};
// script24="child;17;CHK;_AD0030040form1/c_CARD_PRINT[eq]true@*18,*20"
expj.AD0030040.AD0030040form1.child17 = function () {
  console.log('AD0030040form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/c_CARD_PRINT'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script25="child;18;CHKRQ;?AD0030040view1/?[neq]NOT_SELECTED@*19,*20"
expj.AD0030040.AD0030040form1.child18 = function () {
  console.log('AD0030040form1 script25');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '?AD0030040view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script26="child;19;UNMASK;_AD0030040button0/CardPrint@*21"
expj.AD0030040.AD0030040form1.child19 = function () {
  console.log('AD0030040form1 script26');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button0/CardPrint');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child21)){this.child21();}}
};
// script27="child;20;MASK;_AD0030040button0/CardPrint"
expj.AD0030040.AD0030040form1.child20 = function () {
  console.log('AD0030040form1 script27');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button0/CardPrint');
};
// script28="child;21;SELCHK;AD0030040view1:_l_CARD_PRINTED_FLG[eq]1@*20"
expj.AD0030040.AD0030040form1.child21 = function () {
  console.log('AD0030040form1 script28');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AD0030040', 'AD0030040view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.l_CARD_PRINTED_FLG, '[eq]', '1'))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script29="onDecision;5;CHK;_INST_PRINTED[eq]true@*22"
expj.AD0030040.AD0030040form1.onDecision5 = function () {
  console.log('AD0030040form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '_INST_PRINTED'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script30="child;22;MASK;_AD0030040button0/Print"
expj.AD0030040.AD0030040form1.child22 = function () {
  console.log('AD0030040form1 script30');
expj.common.pscript.setMaskToReferenceComponent('AD0030040', 'AD0030040form1', '_AD0030040button0/Print');
};
expj.AD0030040.AD0030040form1.executeAllOnDecision = function () {
  console.log('execute AD0030040form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040form1['onDecision' + i])) {
        expj.AD0030040.AD0030040form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040form1.executeOnLoad = function () {
  expj.AD0030040.AD0030040form1.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0030040.AD0030040form1['onLoad' + i])) {
      expj.AD0030040.AD0030040form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0030040-AD0030040form1" action="AD0030040Servlet" name="AD0030040form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0030040Control.getReadStatusString()) %>" style="height:119px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:119px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:140px;align:left"></div>
<div class="div-td" style="width:180px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_START_DATE_4",rb)%></span><!-- 作業系列別着手日 --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-OPR_INST_START_DATE">
expj.AD0030040.AD0030040form1.OPR_INST_START_DATE = {};
expj.AD0030040.AD0030040form1.OPR_INST_START_DATE.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/OPR_INST_START_DATE.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.OPR_INST_START_DATE.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-OPR_INST_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'OPR_INST_START_DATE', this);
  });
  expj.AD0030040.AD0030040form1.OPR_INST_START_DATE.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.OPR_INST_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/OPR_INST_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-OPR_INST_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030040-AD0030040form1-OPR_INST_START_DATE" name="OPR_INST_START_DATE" class="AD0030040-focus-move  required-value expj-AD0030040-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getOPR_INST_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-CalendarOprInstStartDate">
expj.AD0030040.AD0030040form1.CalendarOprInstStartDate = {};
// script1="onClick;0;CALENDAR;_AD0030040form1/OPR_INST_START_DATE"
expj.AD0030040.AD0030040form1.CalendarOprInstStartDate.onClick0 = function () {
  console.log('CalendarOprInstStartDate script1');
expj.common.pscript.executeCalendar('AD0030040','AD0030040form1','_AD0030040form1/OPR_INST_START_DATE');
};
expj.AD0030040.AD0030040form1.CalendarOprInstStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040form1.CalendarOprInstStartDate['onClick' + i])) {
        expj.AD0030040.AD0030040form1.CalendarOprInstStartDate['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040form1.CalendarOprInstStartDate.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040form1.CalendarOprInstStartDate.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-CalendarOprInstStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040form1', 'CalendarOprInstStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0030040','AD0030040form1','_AD0030040form1/OPR_INST_START_DATE');
  expj.AD0030040.AD0030040form1.CalendarOprInstStartDate.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.CalendarOprInstStartDate.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/CalendarOprInstStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-CalendarOprInstStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030040-AD0030040form1-CalendarOprInstStartDate" class="AD0030040-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-OPR_INST_START_TIME">
expj.AD0030040.AD0030040form1.OPR_INST_START_TIME = {};
expj.AD0030040.AD0030040form1.OPR_INST_START_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/OPR_INST_START_TIME.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.OPR_INST_START_TIME.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-OPR_INST_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'OPR_INST_START_TIME', this);
  });
  expj.AD0030040.AD0030040form1.OPR_INST_START_TIME.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.OPR_INST_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/OPR_INST_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-OPR_INST_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0030040-AD0030040form1-OPR_INST_START_TIME" name="OPR_INST_START_TIME" class="AD0030040-focus-move  " style="width:100%;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getOPR_INST_START_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:140px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-r1_MODE">
expj.AD0030040.AD0030040form1.r1_MODE = {};
expj.AD0030040.AD0030040form1.r1_MODE.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/r1_MODE.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.r1_MODE.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-r1_MODE').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040form1', 'r1_MODE', this, 'RadioButton');
    }
  });
  expj.AD0030040.AD0030040form1.r1_MODE.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.r1_MODE.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/r1_MODE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-r1_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:180px;text-align:left;"><input type="radio" name="MODE" data-name="r1_MODE" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030040Struct.getr1_MODE())) || "".equals(TypeConverter.convert(aAD0030040Struct.getr1_MODE())))?"checked=\"checked\"": "" %> class="" id="expj-AD0030040-AD0030040form1-r1_MODE" ><label for="expj-AD0030040-AD0030040form1-r1_MODE"><%=CoreTools.getRBString("Expj.Cmt0512",rb)%></label></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-c_RE_PRINT">
expj.AD0030040.AD0030040form1.c_RE_PRINT = {};
expj.AD0030040.AD0030040form1.c_RE_PRINT.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/c_RE_PRINT.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.c_RE_PRINT.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-c_RE_PRINT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040form1', 'c_RE_PRINT', this, 'CheckBox');
    }
  });
  expj.AD0030040.AD0030040form1.c_RE_PRINT.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.c_RE_PRINT.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/c_RE_PRINT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-c_RE_PRINT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c_RE_PRINT" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030040Struct.getc_RE_PRINT())) || "1".equals(TypeConverter.convert(aAD0030040Struct.getc_RE_PRINT())))?"checked=\"checked\"":"" %>  class="AD0030040-focus-move" id="expj-AD0030040-AD0030040form1-c_RE_PRINT"><label for="expj-AD0030040-AD0030040form1-c_RE_PRINT"><%=CoreTools.getRBString("Expj.Cmt0203",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_1",rb)%></span><!-- 作業系列別製造納期 --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-WORK_ODR_DLV_DATE">
expj.AD0030040.AD0030040form1.WORK_ODR_DLV_DATE = {};
expj.AD0030040.AD0030040form1.WORK_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/WORK_ODR_DLV_DATE.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.WORK_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-WORK_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'WORK_ODR_DLV_DATE', this);
  });
  expj.AD0030040.AD0030040form1.WORK_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.WORK_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/WORK_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-WORK_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030040-AD0030040form1-WORK_ODR_DLV_DATE" name="WORK_ODR_DLV_DATE" class="AD0030040-focus-move  required-value expj-AD0030040-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getWORK_ODR_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-CalendarWorkOdrDlvDate">
expj.AD0030040.AD0030040form1.CalendarWorkOdrDlvDate = {};
// script1="onClick;0;CALENDAR;_AD0030040form1/WORK_ODR_DLV_DATE"
expj.AD0030040.AD0030040form1.CalendarWorkOdrDlvDate.onClick0 = function () {
  console.log('CalendarWorkOdrDlvDate script1');
expj.common.pscript.executeCalendar('AD0030040','AD0030040form1','_AD0030040form1/WORK_ODR_DLV_DATE');
};
expj.AD0030040.AD0030040form1.CalendarWorkOdrDlvDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040form1.CalendarWorkOdrDlvDate['onClick' + i])) {
        expj.AD0030040.AD0030040form1.CalendarWorkOdrDlvDate['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040form1.CalendarWorkOdrDlvDate.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040form1.CalendarWorkOdrDlvDate.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-CalendarWorkOdrDlvDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040form1', 'CalendarWorkOdrDlvDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0030040','AD0030040form1','_AD0030040form1/WORK_ODR_DLV_DATE');
  expj.AD0030040.AD0030040form1.CalendarWorkOdrDlvDate.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.CalendarWorkOdrDlvDate.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/CalendarWorkOdrDlvDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-CalendarWorkOdrDlvDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030040-AD0030040form1-CalendarWorkOdrDlvDate" class="AD0030040-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-WORK_ODR_DLV_TIME">
expj.AD0030040.AD0030040form1.WORK_ODR_DLV_TIME = {};
expj.AD0030040.AD0030040form1.WORK_ODR_DLV_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/WORK_ODR_DLV_TIME.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.WORK_ODR_DLV_TIME.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-WORK_ODR_DLV_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'WORK_ODR_DLV_TIME', this);
  });
  expj.AD0030040.AD0030040form1.WORK_ODR_DLV_TIME.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.WORK_ODR_DLV_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/WORK_ODR_DLV_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-WORK_ODR_DLV_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0030040-AD0030040form1-WORK_ODR_DLV_TIME" name="WORK_ODR_DLV_TIME" class="AD0030040-focus-move  " style="width:100%;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getWORK_ODR_DLV_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:140px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-r2_MODE">
expj.AD0030040.AD0030040form1.r2_MODE = {};
expj.AD0030040.AD0030040form1.r2_MODE.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/r2_MODE.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.r2_MODE.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-r2_MODE').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040form1', 'r2_MODE', this, 'RadioButton');
    }
  });
  expj.AD0030040.AD0030040form1.r2_MODE.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.r2_MODE.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/r2_MODE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-r2_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:180px;text-align:left;"><input type="radio" name="MODE" data-name="r2_MODE" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030040Struct.getr2_MODE())))?"checked=\"checked\"":"" %> class="" id="expj-AD0030040-AD0030040form1-r2_MODE" ><label for="expj-AD0030040-AD0030040form1-r2_MODE"><%=CoreTools.getRBString("Expj.Cmt0513",rb)%></label></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-c_CARD_PRINT">
expj.AD0030040.AD0030040form1.c_CARD_PRINT = {};
expj.AD0030040.AD0030040form1.c_CARD_PRINT.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/c_CARD_PRINT.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.c_CARD_PRINT.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-c_CARD_PRINT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040form1', 'c_CARD_PRINT', this, 'CheckBox');
    }
  });
  expj.AD0030040.AD0030040form1.c_CARD_PRINT.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.c_CARD_PRINT.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/c_CARD_PRINT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-c_CARD_PRINT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c_CARD_PRINT" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030040Struct.getc_CARD_PRINT())) || "1".equals(TypeConverter.convert(aAD0030040Struct.getc_CARD_PRINT())))?"checked=\"checked\"":"" %>  class="AD0030040-focus-move" id="expj-AD0030040-AD0030040form1-c_CARD_PRINT"><label for="expj-AD0030040-AD0030040form1-c_CARD_PRINT"><%=CoreTools.getRBString("Expj.Cmt6858",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AD0030040-AD0030040form1-INST_PRINTED" name="INST_PRINTED" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getINST_PRINTED()) %>">
<script class="expj-script-AD0030040-AD0030040form1-INST_PRINTED">
expj.AD0030040.AD0030040form1.INST_PRINTED = {};
expj.AD0030040.AD0030040form1.INST_PRINTED.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/INST_PRINTED.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.INST_PRINTED.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-INST_PRINTED').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'INST_PRINTED', this);
  });
  expj.AD0030040.AD0030040form1.INST_PRINTED.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.INST_PRINTED.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/INST_PRINTED.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-INST_PRINTED');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-JOB_ODR_CD">
expj.AD0030040.AD0030040form1.JOB_ODR_CD = {};
expj.AD0030040.AD0030040form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/JOB_ODR_CD.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'JOB_ODR_CD', this);
  });
  expj.AD0030040.AD0030040form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030040-AD0030040form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AD0030040-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-PeekerJOB_ODR_CD">
expj.AD0030040.AD0030040form1.PeekerJOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AD0030040form1/JOB_ODR_CD@<%=contextNo%>"
expj.AD0030040.AD0030040form1.PeekerJOB_ODR_CD.onClick0 = function () {
  console.log('PeekerJOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030040';
var parameterValues = 'PeekerJOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030040form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030040%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030040.AD0030040form1.PeekerJOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040form1.PeekerJOB_ODR_CD['onClick' + i])) {
        expj.AD0030040.AD0030040form1.PeekerJOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040form1.PeekerJOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040form1.PeekerJOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-PeekerJOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040form1', 'PeekerJOB_ODR_CD', this, 'Button');
    }
  });
  expj.AD0030040.AD0030040form1.PeekerJOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.PeekerJOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/PeekerJOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-PeekerJOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030040-AD0030040form1-PeekerJOB_ODR_CD" class="AD0030040-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:140px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:180px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-ITEM_CD">
expj.AD0030040.AD0030040form1.ITEM_CD = {};
expj.AD0030040.AD0030040form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/ITEM_CD.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'ITEM_CD', this);
  });
  expj.AD0030040.AD0030040form1.ITEM_CD.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030040-AD0030040form1-ITEM_CD" name="ITEM_CD" class="AD0030040-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-PeekerItemCd">
expj.AD0030040.AD0030040form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AD0030040form1/ITEM_CD@<%=contextNo%>"
expj.AD0030040.AD0030040form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030040';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030040form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030040%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030040.AD0030040form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040form1.PeekerItemCd['onClick' + i])) {
        expj.AD0030040.AD0030040form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AD0030040.AD0030040form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030040-AD0030040form1-PeekerItemCd" class="AD0030040-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:140px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:180px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030040-AD0030040form1-PRINT_PATTERN" name="PRINT_PATTERN" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getPRINT_PATTERN()) %>">
<script class="expj-script-AD0030040-AD0030040form1-PRINT_PATTERN">
expj.AD0030040.AD0030040form1.PRINT_PATTERN = {};
expj.AD0030040.AD0030040form1.PRINT_PATTERN.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/PRINT_PATTERN.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.PRINT_PATTERN.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-PRINT_PATTERN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'PRINT_PATTERN', this);
  });
  expj.AD0030040.AD0030040form1.PRINT_PATTERN.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.PRINT_PATTERN.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/PRINT_PATTERN.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-PRINT_PATTERN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-WS_CD">
expj.AD0030040.AD0030040form1.WS_CD = {};
expj.AD0030040.AD0030040form1.WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/WS_CD.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.WS_CD.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'WS_CD', this);
  });
  expj.AD0030040.AD0030040form1.WS_CD.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030040-AD0030040form1-WS_CD" name="WS_CD" class="AD0030040-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040form1-PeekerWsCd">
expj.AD0030040.AD0030040form1.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_AD0030040form1/WS_CD@<%=contextNo%>"
expj.AD0030040.AD0030040form1.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030040';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0030040', 'PeekerWsCd', 'SQLPARAM_1', '<%=aAD0030040Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040form1', '_AD0030040form1/WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030040form1/WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030040%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030040.AD0030040form1.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040form1.PeekerWsCd['onClick' + i])) {
        expj.AD0030040.AD0030040form1.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040form1.PeekerWsCd.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040form1.PeekerWsCd.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040form1', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.AD0030040.AD0030040form1.PeekerWsCd.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030040-AD0030040form1-PeekerWsCd" class="AD0030040-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:140px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:180px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030040-AD0030040form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0030040-AD0030040form1-TIME_CTRL">
expj.AD0030040.AD0030040form1.TIME_CTRL = {};
expj.AD0030040.AD0030040form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/TIME_CTRL.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'TIME_CTRL', this);
  });
  expj.AD0030040.AD0030040form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030040-AD0030040form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030040Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AD0030040-AD0030040form1-DOWNLOAD_FILE">
expj.AD0030040.AD0030040form1.DOWNLOAD_FILE = {};
expj.AD0030040.AD0030040form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AD0030040form1/DOWNLOAD_FILE.onDecision');
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
  expj.AD0030040.executeAllOnDecision();
};
expj.AD0030040.AD0030040form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030040', 'AD0030040form1', 'DOWNLOAD_FILE', this);
  });
  expj.AD0030040.AD0030040form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AD0030040.AD0030040form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AD0030040form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040form1-DOWNLOAD_FILE');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0030040-AD0030040button1">
expj.AD0030040.AD0030040button1 = {};
expj.AD0030040.AD0030040button1.executeAllOnDecision = function () {
  console.log('execute AD0030040button1.onDecision');
};
expj.AD0030040.AD0030040button1.executeOnLoad = function () {
  expj.AD0030040.AD0030040button1.executePScriptOnLoad();
};

expj.AD0030040.AD0030040button1.executePScriptOnLoad = function () {
  console.log('execute AD0030040button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030040-AD0030040button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030040-AD0030040button1-Select">
expj.AD0030040.AD0030040button1.Select = {};
// script1="onClick;0;CHK;~LEN(_AD0030040form1/OPR_INST_START_TIME)[eq]1[or]~LEN(_AD0030040form1/OPR_INST_START_TIME)[eq]2@!AS00047"
expj.AD0030040.AD0030040button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030040', 'AD0030040button1', '_AD0030040form1/OPR_INST_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030040', 'AD0030040button1', '_AD0030040form1/OPR_INST_START_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030040', 'AD0030040button1', 'AS00047');
}
};
// script2="onClick;1;CHK;~LEN(_AD0030040form1/WORK_ODR_DLV_TIME)[eq]1[or]~LEN(_AD0030040form1/WORK_ODR_DLV_TIME)[eq]2@!AS00049"
expj.AD0030040.AD0030040button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030040', 'AD0030040button1', '_AD0030040form1/WORK_ODR_DLV_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030040', 'AD0030040button1', '_AD0030040form1/WORK_ODR_DLV_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030040', 'AD0030040button1', 'AS00049');
}
};
// script3="onClick;2;CHK;~LEN(_AD0030040form1/OPR_INST_START_TIME)[eq]3@*3"
expj.AD0030040.AD0030040button1.Select.onClick2 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030040', 'AD0030040button1', '_AD0030040form1/OPR_INST_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;3;CHK;[{~CHARAT(_AD0030040form1/OPR_INST_START_TIME:1)}*10+{~CHARAT(_AD0030040form1/OPR_INST_START_TIME:2)}][gte]60@!AS00048"
expj.AD0030040.AD0030040button1.Select.child3 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/OPR_INST_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/OPR_INST_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030040', 'AD0030040button1', 'AS00048');
}
};
// script5="onClick;4;CHK;~LEN(_AD0030040form1/WORK_ODR_DLV_TIME)[eq]3@*5"
expj.AD0030040.AD0030040button1.Select.onClick4 = function () {
  console.log('Select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030040', 'AD0030040button1', '_AD0030040form1/WORK_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;5;CHK;[{~CHARAT(_AD0030040form1/WORK_ODR_DLV_TIME:1)}*10+{~CHARAT(_AD0030040form1/WORK_ODR_DLV_TIME:2)}][gte]60@!AS00050"
expj.AD0030040.AD0030040button1.Select.child5 = function () {
  console.log('Select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/WORK_ODR_DLV_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/WORK_ODR_DLV_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030040', 'AD0030040button1', 'AS00050');
}
};
// script7="onClick;6;CHK;~LEN(_AD0030040form1/OPR_INST_START_TIME)[eq]4@*7"
expj.AD0030040.AD0030040button1.Select.onClick6 = function () {
  console.log('Select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030040', 'AD0030040button1', '_AD0030040form1/OPR_INST_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;7;CHK;[{~CHARAT(_AD0030040form1/OPR_INST_START_TIME:0)}*10+{~CHARAT(_AD0030040form1/OPR_INST_START_TIME:1)}][gte]24[or][{~CHARAT(_AD0030040form1/OPR_INST_START_TIME:2)}*10+{~CHARAT(_AD0030040form1/OPR_INST_START_TIME:3)}][gte]60@!AS00048"
expj.AD0030040.AD0030040button1.Select.child7 = function () {
  console.log('Select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/OPR_INST_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/OPR_INST_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/OPR_INST_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/OPR_INST_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030040', 'AD0030040button1', 'AS00048');
}
};
// script9="onClick;8;CHK;~LEN(_AD0030040form1/WORK_ODR_DLV_TIME)[eq]4@*9"
expj.AD0030040.AD0030040button1.Select.onClick8 = function () {
  console.log('Select script9');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030040', 'AD0030040button1', '_AD0030040form1/WORK_ODR_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="child;9;CHK;[{~CHARAT(_AD0030040form1/WORK_ODR_DLV_TIME:0)}*10+{~CHARAT(_AD0030040form1/WORK_ODR_DLV_TIME:1)}][gte]24[or][{~CHARAT(_AD0030040form1/WORK_ODR_DLV_TIME:2)}*10+{~CHARAT(_AD0030040form1/WORK_ODR_DLV_TIME:3)}][gte]60@!AS00050"
expj.AD0030040.AD0030040button1.Select.child9 = function () {
  console.log('Select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/WORK_ODR_DLV_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/WORK_ODR_DLV_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/WORK_ODR_DLV_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030040', 'AD0030040button1', '_AD0030040form1/WORK_ODR_DLV_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030040', 'AD0030040button1', 'AS00050');
}
};
// script11="onClick;10;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030040form1/*@AD0030040Servlet"
expj.AD0030040.AD0030040button1.Select.onClick10 = function () {
  console.log('Select script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030040', 'AD0030040button1', '_AD0030040form1/*', 'AD0030040Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030040Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030040', response);
expj.common.updateBusinessScreenTab('AD0030040', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0030040.AD0030040button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040button1.Select['onClick' + i])) {
        expj.AD0030040.AD0030040button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040button1.Select.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040button1.Select.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040button1', 'Select', this, 'Button');
    }
  });
  expj.AD0030040.AD0030040button1.Select.executePScriptOnLoad();
};

expj.AD0030040.AD0030040button1.Select.executePScriptOnLoad = function () {
  console.log('execute AD0030040button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030040-AD0030040button1-Select" name="Select" class="AD0030040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0030040-AD0030040view1">
expj.AD0030040.AD0030040view1 = {};
expj.AD0030040.AD0030040view1.executeAllOnClick = function () {
};
expj.AD0030040.AD0030040view1.executeAllOnDecision = function () {
  console.log('execute AD0030040view1.onDecision');
};
expj.AD0030040.AD0030040view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0030040view1", "expj.AD0030040.AD0030040view1.executeAllOnClick");
%>
  expj.AD0030040.AD0030040view1.executePScriptOnLoad();
};

expj.AD0030040.AD0030040view1.executePScriptOnLoad = function () {
  console.log('execute AD0030040view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0030040-AD0030040view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0030040view1_Id = "AD0030040view1";
 String AD0030040view1_select = "single";
 String AD0030040view1_sortable = "true";
 String AD0030040view1_resize = "true";
 String AD0030040view1_scroll = "true";
 StringBuffer AD0030040view1_HB = new StringBuffer();
 StringBuffer AD0030040view1_DB = new StringBuffer();
%>
<%
 AD0030040view1_select = "multi";
 AD0030040view1_sortable = "true";
 AD0030040view1_resize = "true";
 AD0030040view1_scroll = "true";
%>
<%
 AD0030040view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
%>
     
<%
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_CD",rb))).append("', 'name':'l_WORK_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_CD",rb))).append("', 'name':'l_WORK_IN_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NAME_1",rb))).append("', 'name':'l_PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'numeric', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NO",rb))).append("', 'name':'l_PROC_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_CD",rb))).append("', 'name':'l_OPR_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'250px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'l_WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_NAME",rb))).append("', 'name':'l_WS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_START_DATE_4",rb))).append("', 'name':'l_OPR_INST_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_1",rb))).append("', 'name':'l_WORK_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_QTY",rb))).append("', 'name':'l_OPR_INST_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'300px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_COMMENT_3",rb))).append("', 'name':'l_WORK_IN_PROC_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_SLIP_ISS_DATE",rb))).append("', 'name':'l_OPR_INST_SLIP_ISS_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_SLIP_ISS_FLG",rb))).append("', 'name':'l_OPR_INST_SLIP_ISS_FLG_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_OPR_INST_SLIP_ISS_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
AD0030040view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_CARD_PRINTED_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0030040view1_sortable).append("}").append(",");
%>
<%
 int aAD0030040StructLength = aAD0030040Control.getListsize();
 final AD0030040Struct structBackup = aAD0030040Struct;
 aAD0030040Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0030040StructLength; ++loopCount) {
  if((aAD0030040Struct = (AD0030040Struct) aAD0030040Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0030040Struct", aAD0030040Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0030040view1_DB.append("[");
 AD0030040view1_DB.append(loopCount);
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_WORK_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_WORK_ODR_CD\" data-name=\"l_WORK_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_WORK_ODR_CD())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_WORK_IN_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_WORK_IN_PROC_CD\" data-name=\"l_WORK_IN_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_WORK_IN_PROC_CD())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_PROC_NAME\" data-name=\"l_PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_PROC_NAME())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_PROC_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_PROC_NO\" data-name=\"l_PROC_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_PROC_NO())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_OPR_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_OPR_INST_CD\" data-name=\"l_OPR_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_OPR_INST_CD())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_ITEM_CD())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_ITEM_NAME())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_WS_CD\" data-name=\"l_WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_WS_CD())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_WS_NAME\" data-name=\"l_WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_WS_NAME())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_JOB_ODR_CD())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_OPR_INST_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_OPR_INST_START_DATE\" data-name=\"l_OPR_INST_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_OPR_INST_START_DATE())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_WORK_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_WORK_ODR_DLV_DATE\" data-name=\"l_WORK_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_WORK_ODR_DLV_DATE())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_OPR_INST_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_OPR_INST_QTY\" data-name=\"l_OPR_INST_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_OPR_INST_QTY())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_WORK_IN_PROC_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_WORK_IN_PROC_COMMENT\" data-name=\"l_WORK_IN_PROC_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_WORK_IN_PROC_COMMENT())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_OPR_INST_SLIP_ISS_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_OPR_INST_SLIP_ISS_DATE\" data-name=\"l_OPR_INST_SLIP_ISS_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_OPR_INST_SLIP_ISS_DATE())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_OPR_INST_SLIP_ISS_FLG_DN-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_OPR_INST_SLIP_ISS_FLG_DN\" data-name=\"l_OPR_INST_SLIP_ISS_FLG_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_OPR_INST_SLIP_ISS_FLG_DN())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_OPR_INST_SLIP_ISS_FLG-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_OPR_INST_SLIP_ISS_FLG\" data-name=\"l_OPR_INST_SLIP_ISS_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_OPR_INST_SLIP_ISS_FLG())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_MODIFY_COUNT())).append("</span>'");
 AD0030040view1_DB.append(",").append("'<span id=\"expj-AD0030040-AD0030040view1-l_CARD_PRINTED_FLG-").append(loopCount).append("\" class=\"expj-label expj-AD0030040-AD0030040view1-l_CARD_PRINTED_FLG\" data-name=\"l_CARD_PRINTED_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030040Struct.getl_CARD_PRINTED_FLG())).append("</span>'");
 AD0030040view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0030040StructLength) {
   AD0030040view1_DB.append(",");
  }
 }
 aAD0030040Struct = structBackup;
 viewIdList.add(AD0030040view1_Id);
 viewSelectList.add(AD0030040view1_select);
 viewResizeList.add(AD0030040view1_resize);
 viewScrollList.add(AD0030040view1_scroll);
 viewHeaderDataList.add(AD0030040view1_HB);
 viewBodyDataList.add(AD0030040view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AD0030040-AD0030040button2">
expj.AD0030040.AD0030040button2 = {};
expj.AD0030040.AD0030040button2.executeAllOnDecision = function () {
  console.log('execute AD0030040button2.onDecision');
};
expj.AD0030040.AD0030040button2.executeOnLoad = function () {
  expj.AD0030040.AD0030040button2.executePScriptOnLoad();
};

expj.AD0030040.AD0030040button2.executePScriptOnLoad = function () {
  console.log('execute AD0030040button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030040-AD0030040button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030040-AD0030040button2-CheckAll">
expj.AD0030040.AD0030040button2.CheckAll = {};
// script1="onClick;0;DGSALL;AD0030040view1"
expj.AD0030040.AD0030040button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('AD0030040', 'AD0030040view1');
};
expj.AD0030040.AD0030040button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040button2.CheckAll['onClick' + i])) {
        expj.AD0030040.AD0030040button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040button2.CheckAll.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040button2.CheckAll.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040button2', 'CheckAll', this, 'Button');
    }
  });
  expj.AD0030040.AD0030040button2.CheckAll.executePScriptOnLoad();
};

expj.AD0030040.AD0030040button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute AD0030040button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030040-AD0030040button2-CheckAll" name="CheckAll" class="AD0030040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040button2-UncheckAll">
expj.AD0030040.AD0030040button2.UncheckAll = {};
// script1="onClick;0;DGSCANCEL;AD0030040view1"
expj.AD0030040.AD0030040button2.UncheckAll.onClick0 = function () {
  console.log('UncheckAll script1');
expj.common.pscript.unselectVIEWAllRow('AD0030040', 'AD0030040view1');
};
expj.AD0030040.AD0030040button2.UncheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040button2.UncheckAll['onClick' + i])) {
        expj.AD0030040.AD0030040button2.UncheckAll['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040button2.UncheckAll.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040button2.UncheckAll.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040button2-UncheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040button2', 'UncheckAll', this, 'Button');
    }
  });
  expj.AD0030040.AD0030040button2.UncheckAll.executePScriptOnLoad();
};

expj.AD0030040.AD0030040button2.UncheckAll.executePScriptOnLoad = function () {
  console.log('execute AD0030040button2/UncheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040button2-UncheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030040-AD0030040button2-UncheckAll" name="UncheckAll" class="AD0030040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 315px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0030040 Revision: 1.9  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AD0030040-AD0030040button0">
expj.AD0030040.AD0030040button0 = {};
expj.AD0030040.AD0030040button0.executeAllOnDecision = function () {
  console.log('execute AD0030040button0.onDecision');
};
expj.AD0030040.AD0030040button0.executeOnLoad = function () {
  expj.AD0030040.AD0030040button0.executePScriptOnLoad();
};

expj.AD0030040.AD0030040button0.executePScriptOnLoad = function () {
  console.log('execute AD0030040button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030040-AD0030040button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030040-AD0030040button0-Print">
expj.AD0030040.AD0030040button0.Print = {};
// script1="onClick;0;CHKRQ;?AD0030040view1/?[neq]NOT_SELECTED@*0,*1"
expj.AD0030040.AD0030040button0.Print.onClick0 = function () {
  console.log('Print script1');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030040', 'AD0030040button0', '?AD0030040view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AD0030040form1/*,_AD0030040view1/#,_AD0030040view1/+@AD0030040Servlet:U,U,C"
expj.AD0030040.AD0030040button0.Print.child0 = function () {
  console.log('Print script2');
expj.common.pscript.viewPrinterDialog('AD0030040', 'AD0030040button0', '_AD0030040form1/*,_AD0030040view1/#,_AD0030040view1/+', 'AD0030040Servlet', 'U,U,C');
};
// script3="child;1;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AD0030040form1/*,_AD0030040view1/#,_AD0030040view1/+@AD0030040Servlet:H,C,M"
expj.AD0030040.AD0030040button0.Print.child1 = function () {
  console.log('Print script3');
expj.common.pscript.viewPrinterDialog('AD0030040', 'AD0030040button0', '_AD0030040form1/*,_AD0030040view1/#,_AD0030040view1/+', 'AD0030040Servlet', 'H,C,M');
};
expj.AD0030040.AD0030040button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040button0.Print['onClick' + i])) {
        expj.AD0030040.AD0030040button0.Print['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040button0.Print.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040button0.Print.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040button0', 'Print', this, 'Button');
    }
  });
  expj.AD0030040.AD0030040button0.Print.executePScriptOnLoad();
};

expj.AD0030040.AD0030040button0.Print.executePScriptOnLoad = function () {
  console.log('execute AD0030040button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030040-AD0030040button0-Print" name="Print" class="AD0030040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInstPrint",rb)%></button><!-- 作業指示票出力ボタン --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040button0-CardPrint">
expj.AD0030040.AD0030040button0.CardPrint = {};
// script1="onClick;0;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AD0030040form1/*,_AD0030040view1/+@AD0030040Servlet:H,H,H"
expj.AD0030040.AD0030040button0.CardPrint.onClick0 = function () {
  console.log('CardPrint script1');
expj.common.pscript.viewPrinterDialog('AD0030040', 'AD0030040button0', '_AD0030040form1/*,_AD0030040view1/+', 'AD0030040Servlet', 'H,H,H');
};
expj.AD0030040.AD0030040button0.CardPrint.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040button0.CardPrint['onClick' + i])) {
        expj.AD0030040.AD0030040button0.CardPrint['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040button0.CardPrint.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040button0.CardPrint.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040button0-CardPrint').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040button0', 'CardPrint', this, 'Button');
    }
  });
  expj.AD0030040.AD0030040button0.CardPrint.executePScriptOnLoad();
};

expj.AD0030040.AD0030040button0.CardPrint.executePScriptOnLoad = function () {
  console.log('execute AD0030040button0/CardPrint.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040button0-CardPrint');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030040-AD0030040button0-CardPrint" name="CardPrint" class="AD0030040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCardPrint1",rb)%></button><!-- 現品票出力ボタン --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040button0-Clear">
expj.AD0030040.AD0030040button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030040form1/*@AD0030040Servlet,,$ZZ07008"
expj.AD0030040.AD0030040button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030040', 'AD0030040button0', '_AD0030040form1/*', 'AD0030040Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030040Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030040', response);
expj.common.updateBusinessScreenTab('AD0030040', contents);
};
expj.common.pscript.callConfirm('AD0030040', 'AD0030040button0', 'ZZ07008', okEvent);
};
expj.AD0030040.AD0030040button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040button0.Clear['onClick' + i])) {
        expj.AD0030040.AD0030040button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040button0.Clear.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040button0.Clear.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0030040.AD0030040button0.Clear.executePScriptOnLoad();
};

expj.AD0030040.AD0030040button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0030040button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030040-AD0030040button0-Clear" name="Clear" class="AD0030040-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0030040-AD0030040button0-Close">
expj.AD0030040.AD0030040button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0030040.AD0030040button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0030040');
};
expj.AD0030040.AD0030040button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030040.AD0030040button0.Close['onClick' + i])) {
        expj.AD0030040.AD0030040button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0030040.AD0030040button0.Close.executeAllOnDecision = function () {
};
expj.AD0030040.AD0030040button0.Close.executeOnLoad = function () {
  $('#expj-AD0030040-AD0030040button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030040', 'AD0030040button0', 'Close', this, 'Button');
    }
  });
  expj.AD0030040.AD0030040button0.Close.executePScriptOnLoad();
};

expj.AD0030040.AD0030040button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0030040button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0030040-AD0030040button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030040-AD0030040button0-Close" name="Close" class="AD0030040-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0030040 (END)-->
<%
MessageStruct msgStruct = aAD0030040Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0030040-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0030040)) {
  expj.common.treeInstanceMap.AD0030040 = {};
}
expj.common.treeInstanceMap.AD0030040.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0030040.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0030040.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0030040.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0030040.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0030040.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0030040.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0030040.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0030040.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0030040-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0030040-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030040)) {
  expj.common.detailDialogMap.AD0030040 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030040._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0030040._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030040.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0030040.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030040.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0030040.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030040.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0030040.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0030040.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0030040.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0030040-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0030040.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0030040-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0030040.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0030040-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0030040.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0030040.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0030040.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0030040._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0030040-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0030040)) {
  expj.common.viewInstanceMap.AD0030040 = {};
}
expj.common.viewInstanceMap.AD0030040.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0030040.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0030040.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0030040.<%=viewId %>.init = function () {
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
    expj.AD0030040.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0030040.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0030040-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0030040-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0030040_init">
/**
 * AD0030040用のロード完了時初期化関数
 */
expj.AD0030040.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0030040');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0030040');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0030040');
  expj.common.calendarInstanceMap.AD0030040 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0030040.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0030040.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0030040.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0030040.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0030040.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0030040');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0030040');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0030040-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0030040-<%=detailId %>');
<%
 }
%>
  try{expj.AD0030040.AD0030040form1.OPR_INST_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.CalendarOprInstStartDate.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.OPR_INST_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.r1_MODE.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.c_RE_PRINT.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.WORK_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.CalendarWorkOdrDlvDate.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.WORK_ODR_DLV_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.r2_MODE.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.c_CARD_PRINT.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.INST_PRINTED.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.PeekerJOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.PRINT_PATTERN.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040button1.Select.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040button2.UncheckAll.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040button0.Print.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040button0.CardPrint.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040form1.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040button1.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040view1.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040button2.executeOnLoad();}catch(e){};
  try{expj.AD0030040.AD0030040button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0030040.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0030040', 'AD0030040');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0030040');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0030040-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0030040-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0030040', '<%=request.getContextPath() %>');
};

/**
 * AD0030040の全体onDecision処理
 */
expj.AD0030040.executeAllOnDecision = function () {
  expj.AD0030040.AD0030040form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0030040_console">
expj.AD0030040.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>