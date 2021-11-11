<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:38:24 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0030\AF0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0030.*" %>
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
<jsp:useBean id="aAF0030010Control" class="com.nec.jp.orteus.metamorBase.AF0030.AF0030010Control" scope="request"/>
<jsp:useBean id="aAF0030010Struct" class="com.nec.jp.orteus.metamorBase.AF0030.AF0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

キット出庫実績入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0030/jsp/AF0030010.jsp,v $
$Author: geng-jia $	
$Revision: 1.19 $ $Date: 2017/02/22 02:05:38 $
********************************************************* --%>
<html>
<head>
<title>キット出庫実績入力</title>
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
<script class="expj-script-AF0030010_init">
  // AF0030010名前空間
  expj.AF0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AF0030010" data-screen="AF0030010" data-newdata="<%=aAF0030010Control.isNewData() %>">
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
              <script class="expj-script-AF0030010-AF0030010form1">
expj.AF0030010.AF0030010form1 = {};
// script1="onLoad;0;CALL;child@0,9"
expj.AF0030010.AF0030010form1.onLoad0 = function () {
  console.log('AF0030010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child9)){this.child9();}
};
// script2="child;0;CHK;_AF0030010form1/w_CHOICE[eq]1@*1,*5"
expj.AF0030010.AF0030010form1.child0 = function () {
  console.log('AF0030010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/w_CHOICE'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script3="child;1;SET;_AF0030010form1/w_CHOICE_1=true@*2"
expj.AF0030010.AF0030010form1.child1 = function () {
  console.log('AF0030010form1 script3');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/w_CHOICE_1', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;SET;_AF0030010form1/OPR_INST_CD=@*3"
expj.AF0030010.AF0030010form1.child2 = function () {
  console.log('AF0030010form1 script4');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/OPR_INST_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;MASK;_AF0030010form1/OPR_INST_CD,_AF0030010form1/PeekerOprInstCd@*4"
expj.AF0030010.AF0030010form1.child3 = function () {
  console.log('AF0030010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/OPR_INST_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PeekerOprInstCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;UNMASK;_AF0030010form1/PUCH_ODR_CD,_AF0030010form1/PeekerPuchOdrCd"
expj.AF0030010.AF0030010form1.child4 = function () {
  console.log('AF0030010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PUCH_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PeekerPuchOdrCd');
};
// script7="child;5;SET;_AF0030010form1/w_CHOICE_0=true@*6"
expj.AF0030010.AF0030010form1.child5 = function () {
  console.log('AF0030010form1 script7');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/w_CHOICE_0', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;SET;_AF0030010form1/PUCH_ODR_CD=@*7"
expj.AF0030010.AF0030010form1.child6 = function () {
  console.log('AF0030010form1 script8');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/PUCH_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script9="child;7;MASK;_AF0030010form1/PUCH_ODR_CD,_AF0030010form1/PeekerPuchOdrCd@*8"
expj.AF0030010.AF0030010form1.child7 = function () {
  console.log('AF0030010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PUCH_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PeekerPuchOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script10="child;8;UNMASK;_AF0030010form1/OPR_INST_CD,_AF0030010form1/PeekerOprInstCd"
expj.AF0030010.AF0030010form1.child8 = function () {
  console.log('AF0030010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/OPR_INST_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PeekerOprInstCd');
};
// script11="child;9;CHK;?AF0030010form1/*[neq]NORMAL@*10,*11"
expj.AF0030010.AF0030010form1.child9 = function () {
  console.log('AF0030010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script12="child;10;MASK;_AF0030010button2/insert,_AF0030010button3/modify"
expj.AF0030010.AF0030010form1.child10 = function () {
  console.log('AF0030010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button3/modify');
};
// script13="child;11;CHK;_AF0030010form1/h_ISSUE_CMPLT_FLG[eq]1@*12,*14"
expj.AF0030010.AF0030010form1.child11 = function () {
  console.log('AF0030010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/h_ISSUE_CMPLT_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script14="child;12;MASK;_AF0030010form2/RCV_ISSUE_QTY,_AF0030010form2/RCV_ISSUE_DATE,_AF0030010form2/CalendarRcvIssueDate,_AF0030010form2/WH_CD,_AF0030010form2/PeekerWhCd,_AF0030010form2/VEND_LOT_NO,_AF0030010form2/c_SHIP_COMPLETE,_AF0030010form2/c_ALL_REMAIN,_AF0030010button2/insert@*13"
expj.AF0030010.AF0030010form1.child12 = function () {
  console.log('AF0030010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/RCV_ISSUE_QTY');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/RCV_ISSUE_DATE');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/CalendarRcvIssueDate');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/WH_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/PeekerWhCd');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/VEND_LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/c_SHIP_COMPLETE');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/c_ALL_REMAIN');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script15="child;13;SET;_AF0030010form2/c_SHIP_COMPLETE=true"
expj.AF0030010.AF0030010form1.child13 = function () {
  console.log('AF0030010form1 script15');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form2/c_SHIP_COMPLETE', 'true');
};
// script16="child;14;CHK;_AF0030010form1/h_SHIP_COMPLETE[eq]1@*15,*16"
expj.AF0030010.AF0030010form1.child14 = function () {
  console.log('AF0030010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/h_SHIP_COMPLETE'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script17="child;15;SET;_AF0030010form2/c_SHIP_COMPLETE=true@*16"
expj.AF0030010.AF0030010form1.child15 = function () {
  console.log('AF0030010form1 script17');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form2/c_SHIP_COMPLETE', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child16)){this.child16();}}
};
// script18="child;16;CHK;_AF0030010form1/h_ALL_REMAIN[eq]1@*17"
expj.AF0030010.AF0030010form1.child16 = function () {
  console.log('AF0030010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/h_ALL_REMAIN'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script19="child;17;MASK;_AF0030010form2/RCV_ISSUE_QTY@*18"
expj.AF0030010.AF0030010form1.child17 = function () {
  console.log('AF0030010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/RCV_ISSUE_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child18)){this.child18();}}
};
// script20="child;18;SET;_AF0030010form2/c_ALL_REMAIN=true"
expj.AF0030010.AF0030010form1.child18 = function () {
  console.log('AF0030010form1 script20');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form2/c_ALL_REMAIN', 'true');
};
// script21="onLoad;1;CALL;onDecision@0,1,2,3"
expj.AF0030010.AF0030010form1.onLoad1 = function () {
  console.log('AF0030010form1 script21');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script22="onDecision;0;CHK;_AF0030010form1/w_CHOICE_0[eq]true@*19,*20"
expj.AF0030010.AF0030010form1.onDecision0 = function () {
  console.log('AF0030010form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/w_CHOICE_0'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script23="child;19;CHKRQ;A@*21,*22"
expj.AF0030010.AF0030010form1.child19 = function () {
  console.log('AF0030010form1 script23');
if (expj.common.pscript.satisfiedRequiredComponent('AF0030010', 'A')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script24="child;20;CHKRQ;B@*21,*22"
expj.AF0030010.AF0030010form1.child20 = function () {
  console.log('AF0030010form1 script24');
if (expj.common.pscript.satisfiedRequiredComponent('AF0030010', 'B')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script25="child;21;UNMASK;_AF0030010button1/select"
expj.AF0030010.AF0030010form1.child21 = function () {
  console.log('AF0030010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button1/select');
};
// script26="child;22;MASK;_AF0030010button1/select"
expj.AF0030010.AF0030010form1.child22 = function () {
  console.log('AF0030010form1 script26');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button1/select');
};
// script27="onDecision;1;CHKRQ;?AF0030010view1/?[eq]SINGLE@*23,*26"
expj.AF0030010.AF0030010form1.onDecision1 = function () {
  console.log('AF0030010form1 script27');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script28="child;23;CHK;?AF0030010form1/*[eq]NORMAL@*24,*26"
expj.AF0030010.AF0030010form1.child23 = function () {
  console.log('AF0030010form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script29="child;24;CHK;?AF0030010form1/OPR_INST_CD[eq]SAME[and]?AF0030010form1/LOT_CTRL_FLG[eq]SAME[and]?AF0030010form1/PUCH_ODR_CD[eq]SAME@*25,*26"
expj.AF0030010.AF0030010form1.child24 = function () {
  console.log('AF0030010form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/LOT_CTRL_FLG'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/PUCH_ODR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script30="child;25;UNMASK;_AF0030010button3/modify"
expj.AF0030010.AF0030010form1.child25 = function () {
  console.log('AF0030010form1 script30');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button3/modify');
};
// script31="child;26;MASK;_AF0030010button3/modify"
expj.AF0030010.AF0030010form1.child26 = function () {
  console.log('AF0030010form1 script31');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button3/modify');
};
// script32="onDecision;2;CHK;?AF0030010form1/*[eq]NORMAL@*27,*31"
expj.AF0030010.AF0030010form1.onDecision2 = function () {
  console.log('AF0030010form1 script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script33="child;27;CHK;_AF0030010form1/h_ISSUE_CMPLT_FLG[neq]1@*28"
expj.AF0030010.AF0030010form1.child27 = function () {
  console.log('AF0030010form1 script33');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/h_ISSUE_CMPLT_FLG'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script34="child;28;CHKRQ;C@*29,*31"
expj.AF0030010.AF0030010form1.child28 = function () {
  console.log('AF0030010form1 script34');
if (expj.common.pscript.satisfiedRequiredComponent('AF0030010', 'C')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script35="child;29;CHK;?AF0030010form1/OPR_INST_CD[eq]SAME[and]?AF0030010form1/PUCH_ODR_CD[eq]SAME@*30,*31"
expj.AF0030010.AF0030010form1.child29 = function () {
  console.log('AF0030010form1 script35');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/PUCH_ODR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script36="child;30;UNMASK;_AF0030010button2/insert"
expj.AF0030010.AF0030010form1.child30 = function () {
  console.log('AF0030010form1 script36');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button2/insert');
};
// script37="child;31;MASK;_AF0030010button2/insert"
expj.AF0030010.AF0030010form1.child31 = function () {
  console.log('AF0030010form1 script37');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button2/insert');
};
// script38="onDecision;3;CHK;?AF0030010form1/*[eq]NORMAL@*32,*34"
expj.AF0030010.AF0030010form1.onDecision3 = function () {
  console.log('AF0030010form1 script38');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
} else {
if(expj.common.checkNameSpace(this.child34)){this.child34();}
}
};
// script39="child;32;CHK;?AF0030010form1/OPR_INST_CD[eq]SAME[and]?AF0030010form1/PUCH_ODR_CD[eq]SAME@*33,*34"
expj.AF0030010.AF0030010form1.child32 = function () {
  console.log('AF0030010form1 script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '?AF0030010form1/PUCH_ODR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
} else {
if(expj.common.checkNameSpace(this.child34)){this.child34();}
}
};
// script40="child;33;UNMASK;_AF0030010button0/CmpltCancel"
expj.AF0030010.AF0030010form1.child33 = function () {
  console.log('AF0030010form1 script40');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button0/CmpltCancel');
};
// script41="child;34;MASK;_AF0030010button0/CmpltCancel"
expj.AF0030010.AF0030010form1.child34 = function () {
  console.log('AF0030010form1 script41');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button0/CmpltCancel');
};
// script42="onLoad;2;CALL;onDecision@5"
expj.AF0030010.AF0030010form1.onLoad2 = function () {
  console.log('AF0030010form1 script42');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script43="onDecision;5;CHK;_AF0030010form1/LOT_CTRL_FLG[eq]1@*36,*37"
expj.AF0030010.AF0030010form1.onDecision5 = function () {
  console.log('AF0030010form1 script43');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/LOT_CTRL_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child36)){this.child36();}
} else {
if(expj.common.checkNameSpace(this.child37)){this.child37();}
}
};
// script44="child;36;MASK;_AF0030010button2/insert,_AF0030010form2/RCV_ISSUE_QTY,_AF0030010form2/RCV_ISSUE_DATE,_AF0030010form2/WH_CD,_AF0030010form2/c_SHIP_COMPLETE,_AF0030010form2/c_ALL_REMAIN,_AF0030010form2/CalendarRcvIssueDate,_AF0030010form2/PeekerWhCd"
expj.AF0030010.AF0030010form1.child36 = function () {
  console.log('AF0030010form1 script44');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/RCV_ISSUE_QTY');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/RCV_ISSUE_DATE');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/WH_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/c_SHIP_COMPLETE');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/c_ALL_REMAIN');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/CalendarRcvIssueDate');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/PeekerWhCd');
};
// script45="child;37;UNMASK;_AF0030010button2/insert,_AF0030010form2/RCV_ISSUE_DATE,_AF0030010form2/WH_CD,_AF0030010form2/c_SHIP_COMPLETE,_AF0030010form2/c_ALL_REMAIN,_AF0030010form2/CalendarRcvIssueDate,_AF0030010form2/PeekerWhCd@*41"
expj.AF0030010.AF0030010form1.child37 = function () {
  console.log('AF0030010form1 script45');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button2/insert');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/RCV_ISSUE_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/WH_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/c_SHIP_COMPLETE');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/c_ALL_REMAIN');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/CalendarRcvIssueDate');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/PeekerWhCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child41)){this.child41();}}
};
// script46="onLoad;3;CALL;child@38"
expj.AF0030010.AF0030010form1.onLoad3 = function () {
  console.log('AF0030010form1 script46');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child38)){this.child38();}
};
// script47="child;38;CHK;_AF0030010form1/h_lotCtrl[eq]true@*39,*40"
expj.AF0030010.AF0030010form1.child38 = function () {
  console.log('AF0030010form1 script47');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/h_lotCtrl'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child39)){this.child39();}
} else {
if(expj.common.checkNameSpace(this.child40)){this.child40();}
}
};
// script48="child;39;UNMASK;_AF0030010form1/LOT_CTRL_FLG"
expj.AF0030010.AF0030010form1.child39 = function () {
  console.log('AF0030010form1 script48');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/LOT_CTRL_FLG');
};
// script49="child;40;MASK;_AF0030010form1/LOT_CTRL_FLG"
expj.AF0030010.AF0030010form1.child40 = function () {
  console.log('AF0030010form1 script49');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/LOT_CTRL_FLG');
};
// script50="child;41;CHK;_AF0030010form2/c_ALL_REMAIN[neq]true@*42"
expj.AF0030010.AF0030010form1.child41 = function () {
  console.log('AF0030010form1 script50');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form2/c_ALL_REMAIN'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child42)){this.child42();}
}
};
// script51="child;42;UNMASK;_AF0030010form2/RCV_ISSUE_QTY"
expj.AF0030010.AF0030010form1.child42 = function () {
  console.log('AF0030010form1 script51');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form2/RCV_ISSUE_QTY');
};
expj.AF0030010.AF0030010form1.executeAllOnDecision = function () {
  console.log('execute AF0030010form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form1['onDecision' + i])) {
        expj.AF0030010.AF0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010form1.executeOnLoad = function () {
  expj.AF0030010.AF0030010form1.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form1['onLoad' + i])) {
      expj.AF0030010.AF0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0030010-AF0030010form1" action="AF0030010Servlet" name="AF0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAF0030010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AF0030010-AF0030010form1-OPR_INST_CD">
expj.AF0030010.AF0030010form1.OPR_INST_CD = {};
expj.AF0030010.AF0030010form1.OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/OPR_INST_CD.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'OPR_INST_CD', this);
  });
  expj.AF0030010.AF0030010form1.OPR_INST_CD.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0030010-AF0030010form1-OPR_INST_CD" name="OPR_INST_CD" class="AF0030010-focus-move  required-value expj-AF0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getOPR_INST_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form1-h_SHIP_COMPLETE" name="h_SHIP_COMPLETE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.geth_SHIP_COMPLETE()) %>">
<script class="expj-script-AF0030010-AF0030010form1-h_SHIP_COMPLETE">
expj.AF0030010.AF0030010form1.h_SHIP_COMPLETE = {};
expj.AF0030010.AF0030010form1.h_SHIP_COMPLETE.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/h_SHIP_COMPLETE.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.h_SHIP_COMPLETE.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-h_SHIP_COMPLETE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'h_SHIP_COMPLETE', this);
  });
  expj.AF0030010.AF0030010form1.h_SHIP_COMPLETE.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.h_SHIP_COMPLETE.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/h_SHIP_COMPLETE.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-h_SHIP_COMPLETE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AF0030010-AF0030010form1-h_RCV_ISSUE_QTY" name="h_RCV_ISSUE_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.geth_RCV_ISSUE_QTY()) %>">
<script class="expj-script-AF0030010-AF0030010form1-h_RCV_ISSUE_QTY">
expj.AF0030010.AF0030010form1.h_RCV_ISSUE_QTY = {};
expj.AF0030010.AF0030010form1.h_RCV_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/h_RCV_ISSUE_QTY.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.h_RCV_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-h_RCV_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'h_RCV_ISSUE_QTY', this);
  });
  expj.AF0030010.AF0030010form1.h_RCV_ISSUE_QTY.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.h_RCV_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/h_RCV_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-h_RCV_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AF0030010-AF0030010form1-PeekerOprInstCd">
expj.AF0030010.AF0030010form1.PeekerOprInstCd = {};
// script1="onClick;0;PEEKER;_AF0030010form1/OPR_INST_CD@<%=contextNo%>"
expj.AF0030010.AF0030010form1.PeekerOprInstCd.onClick0 = function () {
  console.log('PeekerOprInstCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0030010';
var parameterValues = 'PeekerOprInstCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0030010', 'PeekerOprInstCd', 'SQLPARAM_1', '<%=aAF0030010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/OPR_INST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%OPR_INST_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AF0030010form1/OPR_INST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0030010.AF0030010form1.PeekerOprInstCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form1.PeekerOprInstCd['onClick' + i])) {
        expj.AF0030010.AF0030010form1.PeekerOprInstCd['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010form1.PeekerOprInstCd.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010form1.PeekerOprInstCd.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-PeekerOprInstCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010form1', 'PeekerOprInstCd', this, 'Button');
    }
  });
  expj.AF0030010.AF0030010form1.PeekerOprInstCd.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.PeekerOprInstCd.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/PeekerOprInstCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-PeekerOprInstCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0030010-AF0030010form1-PeekerOprInstCd" class="AF0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form1-w_CHOICE" name="w_CHOICE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getw_CHOICE()) %>">
<script class="expj-script-AF0030010-AF0030010form1-w_CHOICE">
expj.AF0030010.AF0030010form1.w_CHOICE = {};
expj.AF0030010.AF0030010form1.w_CHOICE.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/w_CHOICE.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.w_CHOICE.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-w_CHOICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'w_CHOICE', this);
  });
  expj.AF0030010.AF0030010form1.w_CHOICE.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.w_CHOICE.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/w_CHOICE.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-w_CHOICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form1-w_CHOICE_0">
expj.AF0030010.AF0030010form1.w_CHOICE_0 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AF0030010.AF0030010form1.w_CHOICE_0.onLoad0 = function () {
  console.log('w_CHOICE_0 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.AF0030010.AF0030010form1.w_CHOICE_0.onClick0 = function () {
  console.log('w_CHOICE_0 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_AF0030010form1/OPR_INST_CD,_AF0030010form1/PeekerOprInstCd@*1"
expj.AF0030010.AF0030010form1.w_CHOICE_0.child0 = function () {
  console.log('w_CHOICE_0 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/OPR_INST_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PeekerOprInstCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;SET;_AF0030010form1/PUCH_ODR_CD=@*2"
expj.AF0030010.AF0030010form1.w_CHOICE_0.child1 = function () {
  console.log('w_CHOICE_0 script4');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/PUCH_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_AF0030010form1/PUCH_ODR_CD,_AF0030010form1/PeekerPuchOdrCd@*3"
expj.AF0030010.AF0030010form1.w_CHOICE_0.child2 = function () {
  console.log('w_CHOICE_0 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PUCH_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PeekerPuchOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script6="child;3;CHK;_AF0030010form1/OPR_INST_CD[eq]@*4"
expj.AF0030010.AF0030010form1.w_CHOICE_0.child3 = function () {
  console.log('w_CHOICE_0 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/OPR_INST_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;4;MASK;_AF0030010button1/select,_AF0030010button2/insert,_AF0030010button3/modify"
expj.AF0030010.AF0030010form1.w_CHOICE_0.child4 = function () {
  console.log('w_CHOICE_0 script7');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button1/select');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button3/modify');
};
expj.AF0030010.AF0030010form1.w_CHOICE_0.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form1.w_CHOICE_0['onClick' + i])) {
        expj.AF0030010.AF0030010form1.w_CHOICE_0['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010form1.w_CHOICE_0.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/w_CHOICE_0.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.w_CHOICE_0.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-w_CHOICE_0').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010form1', 'w_CHOICE_0', this, 'RadioButton');
    }
  });
  expj.AF0030010.AF0030010form1.w_CHOICE_0.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.w_CHOICE_0.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/w_CHOICE_0.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-w_CHOICE_0');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form1.w_CHOICE_0['onLoad' + i])) {
      expj.AF0030010.AF0030010form1.w_CHOICE_0['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="group1" data-name="w_CHOICE_0" value="true" <%= ("true".equals(TypeConverter.convert(aAF0030010Struct.getw_CHOICE_0())))?"checked=\"checked\"":"" %> class="" id="expj-AF0030010-AF0030010form1-w_CHOICE_0" ><label for="expj-AF0030010-AF0030010form1-w_CHOICE_0"><%=CoreTools.getRBString("Expj.Cmt0506",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form1-h_ISSUE_CMPLT_FLG" name="h_ISSUE_CMPLT_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.geth_ISSUE_CMPLT_FLG()) %>">
<script class="expj-script-AF0030010-AF0030010form1-h_ISSUE_CMPLT_FLG">
expj.AF0030010.AF0030010form1.h_ISSUE_CMPLT_FLG = {};
expj.AF0030010.AF0030010form1.h_ISSUE_CMPLT_FLG.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/h_ISSUE_CMPLT_FLG.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.h_ISSUE_CMPLT_FLG.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-h_ISSUE_CMPLT_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'h_ISSUE_CMPLT_FLG', this);
  });
  expj.AF0030010.AF0030010form1.h_ISSUE_CMPLT_FLG.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.h_ISSUE_CMPLT_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/h_ISSUE_CMPLT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-h_ISSUE_CMPLT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form1-h_ALL_REMAIN" name="h_ALL_REMAIN" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.geth_ALL_REMAIN()) %>">
<script class="expj-script-AF0030010-AF0030010form1-h_ALL_REMAIN">
expj.AF0030010.AF0030010form1.h_ALL_REMAIN = {};
expj.AF0030010.AF0030010form1.h_ALL_REMAIN.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/h_ALL_REMAIN.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.h_ALL_REMAIN.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-h_ALL_REMAIN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'h_ALL_REMAIN', this);
  });
  expj.AF0030010.AF0030010form1.h_ALL_REMAIN.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.h_ALL_REMAIN.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/h_ALL_REMAIN.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-h_ALL_REMAIN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form1-PUCH_ODR_CD">
expj.AF0030010.AF0030010form1.PUCH_ODR_CD = {};
expj.AF0030010.AF0030010form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/PUCH_ODR_CD.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'PUCH_ODR_CD', this);
  });
  expj.AF0030010.AF0030010form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0030010-AF0030010form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AF0030010-focus-move  required-value expj-AF0030010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form1-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-AF0030010-AF0030010form1-BUSINESS_OPR_DATE">
expj.AF0030010.AF0030010form1.BUSINESS_OPR_DATE = {};
expj.AF0030010.AF0030010form1.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/BUSINESS_OPR_DATE.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'BUSINESS_OPR_DATE', this);
  });
  expj.AF0030010.AF0030010form1.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AF0030010-AF0030010form1-h_SHIP_REMAIN_KIT_QTY" name="h_SHIP_REMAIN_KIT_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.geth_SHIP_REMAIN_KIT_QTY()) %>">
<script class="expj-script-AF0030010-AF0030010form1-h_SHIP_REMAIN_KIT_QTY">
expj.AF0030010.AF0030010form1.h_SHIP_REMAIN_KIT_QTY = {};
expj.AF0030010.AF0030010form1.h_SHIP_REMAIN_KIT_QTY.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/h_SHIP_REMAIN_KIT_QTY.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.h_SHIP_REMAIN_KIT_QTY.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-h_SHIP_REMAIN_KIT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'h_SHIP_REMAIN_KIT_QTY', this);
  });
  expj.AF0030010.AF0030010form1.h_SHIP_REMAIN_KIT_QTY.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.h_SHIP_REMAIN_KIT_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/h_SHIP_REMAIN_KIT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-h_SHIP_REMAIN_KIT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AF0030010-AF0030010form1-PeekerPuchOdrCd">
expj.AF0030010.AF0030010form1.PeekerPuchOdrCd = {};
// script1="onClick;0;PEEKER;_AF0030010form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AF0030010.AF0030010form1.PeekerPuchOdrCd.onClick0 = function () {
  console.log('PeekerPuchOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0030010';
var parameterValues = 'PeekerPuchOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0030010', 'PeekerPuchOdrCd', 'SQLPARAM_1', '<%=aAF0030010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_09%&%';
parameterValues += 'TARGET_FIELD%=%_AF0030010form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0030010.AF0030010form1.PeekerPuchOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form1.PeekerPuchOdrCd['onClick' + i])) {
        expj.AF0030010.AF0030010form1.PeekerPuchOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010form1.PeekerPuchOdrCd.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010form1.PeekerPuchOdrCd.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-PeekerPuchOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010form1', 'PeekerPuchOdrCd', this, 'Button');
    }
  });
  expj.AF0030010.AF0030010form1.PeekerPuchOdrCd.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.PeekerPuchOdrCd.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/PeekerPuchOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-PeekerPuchOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0030010-AF0030010form1-PeekerPuchOdrCd" class="AF0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form1-w_CHOICE_1">
expj.AF0030010.AF0030010form1.w_CHOICE_1 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AF0030010.AF0030010form1.w_CHOICE_1.onLoad0 = function () {
  console.log('w_CHOICE_1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.AF0030010.AF0030010form1.w_CHOICE_1.onClick0 = function () {
  console.log('w_CHOICE_1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_AF0030010form1/PUCH_ODR_CD,_AF0030010form1/PeekerPuchOdrCd@*1"
expj.AF0030010.AF0030010form1.w_CHOICE_1.child0 = function () {
  console.log('w_CHOICE_1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PUCH_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PeekerPuchOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;SET;_AF0030010form1/OPR_INST_CD=@*2"
expj.AF0030010.AF0030010form1.w_CHOICE_1.child1 = function () {
  console.log('w_CHOICE_1 script4');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/OPR_INST_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_AF0030010form1/OPR_INST_CD,_AF0030010form1/PeekerOprInstCd@*3"
expj.AF0030010.AF0030010form1.w_CHOICE_1.child2 = function () {
  console.log('w_CHOICE_1 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/OPR_INST_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010form1/PeekerOprInstCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script6="child;3;CHK;_AF0030010form1/PUCH_ODR_CD[eq]@*4"
expj.AF0030010.AF0030010form1.w_CHOICE_1.child3 = function () {
  console.log('w_CHOICE_1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form1', '_AF0030010form1/PUCH_ODR_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;4;MASK;_AF0030010button1/select,_AF0030010button2/insert,_AF0030010button3/modify"
expj.AF0030010.AF0030010form1.w_CHOICE_1.child4 = function () {
  console.log('w_CHOICE_1 script7');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button1/select');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form1', '_AF0030010button3/modify');
};
expj.AF0030010.AF0030010form1.w_CHOICE_1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form1.w_CHOICE_1['onClick' + i])) {
        expj.AF0030010.AF0030010form1.w_CHOICE_1['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010form1.w_CHOICE_1.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/w_CHOICE_1.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.w_CHOICE_1.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-w_CHOICE_1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010form1', 'w_CHOICE_1', this, 'RadioButton');
    }
  });
  expj.AF0030010.AF0030010form1.w_CHOICE_1.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.w_CHOICE_1.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/w_CHOICE_1.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-w_CHOICE_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form1.w_CHOICE_1['onLoad' + i])) {
      expj.AF0030010.AF0030010form1.w_CHOICE_1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="group1" data-name="w_CHOICE_1" value="true" <%= ("true".equals(TypeConverter.convert(aAF0030010Struct.getw_CHOICE_1())))?"checked=\"checked\"":"" %> class="" id="expj-AF0030010-AF0030010form1-w_CHOICE_1" ><label for="expj-AF0030010-AF0030010form1-w_CHOICE_1"><%=CoreTools.getRBString("Expj.Cmt0504",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form1-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AF0030010-AF0030010form1-MODIFY_COUNT">
expj.AF0030010.AF0030010form1.MODIFY_COUNT = {};
expj.AF0030010.AF0030010form1.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/MODIFY_COUNT.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'MODIFY_COUNT', this);
  });
  expj.AF0030010.AF0030010form1.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form1-h_ALL_CONS_TYP1" name="h_ALL_CONS_TYP1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.geth_ALL_CONS_TYP1()) %>">
<script class="expj-script-AF0030010-AF0030010form1-h_ALL_CONS_TYP1">
expj.AF0030010.AF0030010form1.h_ALL_CONS_TYP1 = {};
expj.AF0030010.AF0030010form1.h_ALL_CONS_TYP1.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/h_ALL_CONS_TYP1.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.h_ALL_CONS_TYP1.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-h_ALL_CONS_TYP1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'h_ALL_CONS_TYP1', this);
  });
  expj.AF0030010.AF0030010form1.h_ALL_CONS_TYP1.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.h_ALL_CONS_TYP1.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/h_ALL_CONS_TYP1.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-h_ALL_CONS_TYP1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOT_CTRL_FLG",rb)%></span><!-- ロット管理フラグ --></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form1-LOT_CTRL_FLG">
expj.AF0030010.AF0030010form1.LOT_CTRL_FLG = {};
expj.AF0030010.AF0030010form1.LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/LOT_CTRL_FLG.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-LOT_CTRL_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0030010', 'AF0030010form1', 'LOT_CTRL_FLG', this);
  });
  expj.AF0030010.AF0030010form1.LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0030010-AF0030010form1-LOT_CTRL_FLG" name='LOT_CTRL_FLG' class='AF0030010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0030010Control.getStruct().getList_LOT_CTRL_FLG_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0030010Control.getStruct().getList_LOT_CTRL_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0030010Control.getStruct().getList_LOT_CTRL_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0030010Struct.getLOT_CTRL_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AF0030010-AF0030010form1-h_lotCtrl">
expj.AF0030010.AF0030010form1.h_lotCtrl = {};
expj.AF0030010.AF0030010form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AF0030010form1/h_lotCtrl.onDecision');
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form1', 'h_lotCtrl', this);
  });
  expj.AF0030010.AF0030010form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AF0030010form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form1-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AF0030010-AF0030010button1">
expj.AF0030010.AF0030010button1 = {};
expj.AF0030010.AF0030010button1.executeAllOnDecision = function () {
  console.log('execute AF0030010button1.onDecision');
};
expj.AF0030010.AF0030010button1.executeOnLoad = function () {
  expj.AF0030010.AF0030010button1.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button1.executePScriptOnLoad = function () {
  console.log('execute AF0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0030010-AF0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0030010-AF0030010button1-Detail">
expj.AF0030010.AF0030010button1.Detail = {};
// script1="onClick;0;FSHOW;AF0030010float1"
expj.AF0030010.AF0030010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AF0030010', 'AF0030010float1', '');
};
expj.AF0030010.AF0030010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010button1.Detail['onClick' + i])) {
        expj.AF0030010.AF0030010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010button1.Detail.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010button1.Detail.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010button1', 'Detail', this, 'Button');
    }
  });
  expj.AF0030010.AF0030010button1.Detail.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AF0030010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0030010-AF0030010button1-Detail" name="Detail" class="AF0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010button1-select">
expj.AF0030010.AF0030010button1.select = {};
// script1="onClick;0;CHK;_AF0030010form1/w_CHOICE_0[eq]true@*0"
expj.AF0030010.AF0030010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button1', '_AF0030010form1/w_CHOICE_0'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_AF0030010form1/w_CHOICE_1[eq]true@*1"
expj.AF0030010.AF0030010button1.select.onClick1 = function () {
  console.log('select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button1', '_AF0030010form1/w_CHOICE_1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0030010form1/*@AF0030010Servlet"
expj.AF0030010.AF0030010button1.select.onClick2 = function () {
  console.log('select script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0030010', 'AF0030010button1', '_AF0030010form1/*', 'AF0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0030010', response);
expj.common.updateBusinessScreenTab('AF0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script4="child;0;SET;_AF0030010form1/w_CHOICE=0"
expj.AF0030010.AF0030010button1.select.child0 = function () {
  console.log('select script4');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010button1', '_AF0030010form1/w_CHOICE', '0');
};
// script5="child;1;SET;_AF0030010form1/w_CHOICE=1"
expj.AF0030010.AF0030010button1.select.child1 = function () {
  console.log('select script5');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010button1', '_AF0030010form1/w_CHOICE', '1');
};
expj.AF0030010.AF0030010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010button1.select['onClick' + i])) {
        expj.AF0030010.AF0030010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010button1.select.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010button1.select.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010button1', 'select', this, 'Button');
    }
  });
  expj.AF0030010.AF0030010button1.select.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button1.select.executePScriptOnLoad = function () {
  console.log('execute AF0030010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0030010-AF0030010button1-select" name="select" class="AF0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AF0030010-AF0030010form2">
expj.AF0030010.AF0030010form2 = {};
expj.AF0030010.AF0030010form2.executeAllOnDecision = function () {
  console.log('execute AF0030010form2.onDecision');
};
expj.AF0030010.AF0030010form2.executeOnLoad = function () {
  expj.AF0030010.AF0030010form2.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0030010-AF0030010form2" action="AF0030010Servlet" name="AF0030010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.RCV_ISSUE_QTY_5",rb)%></span><!-- 出庫キット数 --></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form2-RCV_ISSUE_QTY">
expj.AF0030010.AF0030010form2.RCV_ISSUE_QTY = {};
expj.AF0030010.AF0030010form2.RCV_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/RCV_ISSUE_QTY.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.RCV_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-RCV_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'RCV_ISSUE_QTY', this);
  });
  expj.AF0030010.AF0030010form2.RCV_ISSUE_QTY.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.RCV_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/RCV_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-RCV_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0030010-AF0030010form2-RCV_ISSUE_QTY" name="RCV_ISSUE_QTY" class="AF0030010-focus-move expj-align-right required-value expj-AF0030010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;14" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getRCV_ISSUE_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form2-OD_NO" name="OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getOD_NO()) %>">
<script class="expj-script-AF0030010-AF0030010form2-OD_NO">
expj.AF0030010.AF0030010form2.OD_NO = {};
expj.AF0030010.AF0030010form2.OD_NO.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/OD_NO.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.OD_NO.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'OD_NO', this);
  });
  expj.AF0030010.AF0030010form2.OD_NO.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.OD_NO.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form2-COMPANY_CD" name="COMPANY_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getCOMPANY_CD()) %>">
<script class="expj-script-AF0030010-AF0030010form2-COMPANY_CD">
expj.AF0030010.AF0030010form2.COMPANY_CD = {};
expj.AF0030010.AF0030010form2.COMPANY_CD.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/COMPANY_CD.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.COMPANY_CD.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-COMPANY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'COMPANY_CD', this);
  });
  expj.AF0030010.AF0030010form2.COMPANY_CD.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.COMPANY_CD.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/COMPANY_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-COMPANY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form2-c_SHIP_COMPLETE">
expj.AF0030010.AF0030010form2.c_SHIP_COMPLETE = {};
expj.AF0030010.AF0030010form2.c_SHIP_COMPLETE.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/c_SHIP_COMPLETE.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.c_SHIP_COMPLETE.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-c_SHIP_COMPLETE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010form2', 'c_SHIP_COMPLETE', this, 'CheckBox');
    }
  });
  expj.AF0030010.AF0030010form2.c_SHIP_COMPLETE.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.c_SHIP_COMPLETE.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/c_SHIP_COMPLETE.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-c_SHIP_COMPLETE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_SHIP_COMPLETE" value="true" <%= ("true".equals(TypeConverter.convert(aAF0030010Struct.getc_SHIP_COMPLETE())) || "1".equals(TypeConverter.convert(aAF0030010Struct.getc_SHIP_COMPLETE())))?"checked=\"checked\"":"" %>  class="AF0030010-focus-move" id="expj-AF0030010-AF0030010form2-c_SHIP_COMPLETE"><label for="expj-AF0030010-AF0030010form2-c_SHIP_COMPLETE"><%=CoreTools.getRBString("Expj.ISSUE_CMPLT_FLG_2",rb)%></label></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form2-c_ALL_REMAIN">
expj.AF0030010.AF0030010form2.c_ALL_REMAIN = {};
// script1="onClick;0;CHK;_THIS[eq]true@*0,*5"
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.onClick0 = function () {
  console.log('c_ALL_REMAIN script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form2', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script2="child;0;SET;_AF0030010form2/c_SHIP_COMPLETE=true@*1"
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.child0 = function () {
  console.log('c_ALL_REMAIN script2');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form2', '_AF0030010form2/c_SHIP_COMPLETE', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script3="child;1;SET;_AF0030010form2/RCV_ISSUE_QTY=0@*2"
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.child1 = function () {
  console.log('c_ALL_REMAIN script3');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form2', '_AF0030010form2/RCV_ISSUE_QTY', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;MASK;_AF0030010form2/RCV_ISSUE_QTY@*3"
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.child2 = function () {
  console.log('c_ALL_REMAIN script4');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form2', '_AF0030010form2/RCV_ISSUE_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHKRQ;C@*4,*7"
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.child3 = function () {
  console.log('c_ALL_REMAIN script5');
if (expj.common.pscript.satisfiedRequiredComponent('AF0030010', 'C')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script6="child;4;UNMASK;_AF0030010button2/insert"
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.child4 = function () {
  console.log('c_ALL_REMAIN script6');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form2', '_AF0030010button2/insert');
};
// script7="child;5;SET;_AF0030010form2/c_SHIP_COMPLETE=false@*6"
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.child5 = function () {
  console.log('c_ALL_REMAIN script7');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010form2', '_AF0030010form2/c_SHIP_COMPLETE', 'false');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;UNMASK;_AF0030010form2/RCV_ISSUE_QTY"
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.child6 = function () {
  console.log('c_ALL_REMAIN script8');
expj.common.pscript.setUnMaskToReferenceComponent('AF0030010', 'AF0030010form2', '_AF0030010form2/RCV_ISSUE_QTY');
};
// script9="child;7;MASK;_AF0030010button2/insert"
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.child7 = function () {
  console.log('c_ALL_REMAIN script9');
expj.common.pscript.setMaskToReferenceComponent('AF0030010', 'AF0030010form2', '_AF0030010button2/insert');
};
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form2.c_ALL_REMAIN['onClick' + i])) {
        expj.AF0030010.AF0030010form2.c_ALL_REMAIN['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/c_ALL_REMAIN.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.c_ALL_REMAIN.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-c_ALL_REMAIN').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010form2', 'c_ALL_REMAIN', this, 'CheckBox');
    }
  });
  expj.AF0030010.AF0030010form2.c_ALL_REMAIN.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.c_ALL_REMAIN.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/c_ALL_REMAIN.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-c_ALL_REMAIN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_ALL_REMAIN" value="true" <%= ("true".equals(TypeConverter.convert(aAF0030010Struct.getc_ALL_REMAIN())) || "1".equals(TypeConverter.convert(aAF0030010Struct.getc_ALL_REMAIN())))?"checked=\"checked\"":"" %>  class="AF0030010-focus-move" id="expj-AF0030010-AF0030010form2-c_ALL_REMAIN"><label for="expj-AF0030010-AF0030010form2-c_ALL_REMAIN"><%=CoreTools.getRBString("Expj.Cmt0214",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form2-REMAIN_FLG" name="REMAIN_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getREMAIN_FLG()) %>">
<script class="expj-script-AF0030010-AF0030010form2-REMAIN_FLG">
expj.AF0030010.AF0030010form2.REMAIN_FLG = {};
expj.AF0030010.AF0030010form2.REMAIN_FLG.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/REMAIN_FLG.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.REMAIN_FLG.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-REMAIN_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'REMAIN_FLG', this);
  });
  expj.AF0030010.AF0030010form2.REMAIN_FLG.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.REMAIN_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/REMAIN_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-REMAIN_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_DATE",rb)%></span><!-- 出庫日 --></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form2-RCV_ISSUE_DATE">
expj.AF0030010.AF0030010form2.RCV_ISSUE_DATE = {};
expj.AF0030010.AF0030010form2.RCV_ISSUE_DATE.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/RCV_ISSUE_DATE.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.RCV_ISSUE_DATE.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-RCV_ISSUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'RCV_ISSUE_DATE', this);
  });
  expj.AF0030010.AF0030010form2.RCV_ISSUE_DATE.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.RCV_ISSUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/RCV_ISSUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-RCV_ISSUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0030010-AF0030010form2-RCV_ISSUE_DATE" name="RCV_ISSUE_DATE" class="AF0030010-focus-move  required-value expj-AF0030010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getRCV_ISSUE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form2-CalendarRcvIssueDate">
expj.AF0030010.AF0030010form2.CalendarRcvIssueDate = {};
// script1="onClick;0;CALENDAR;_AF0030010form2/RCV_ISSUE_DATE"
expj.AF0030010.AF0030010form2.CalendarRcvIssueDate.onClick0 = function () {
  console.log('CalendarRcvIssueDate script1');
expj.common.pscript.executeCalendar('AF0030010','AF0030010form2','_AF0030010form2/RCV_ISSUE_DATE');
};
expj.AF0030010.AF0030010form2.CalendarRcvIssueDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form2.CalendarRcvIssueDate['onClick' + i])) {
        expj.AF0030010.AF0030010form2.CalendarRcvIssueDate['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010form2.CalendarRcvIssueDate.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010form2.CalendarRcvIssueDate.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-CalendarRcvIssueDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010form2', 'CalendarRcvIssueDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AF0030010','AF0030010form2','_AF0030010form2/RCV_ISSUE_DATE');
  expj.AF0030010.AF0030010form2.CalendarRcvIssueDate.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.CalendarRcvIssueDate.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/CalendarRcvIssueDate.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-CalendarRcvIssueDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0030010-AF0030010form2-CalendarRcvIssueDate" class="AF0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0339",rb)%></span><!-- 出庫可能最少キット数 --></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form2-w_SHIPPABLE_KIT_QTY">
expj.AF0030010.AF0030010form2.w_SHIPPABLE_KIT_QTY = {};
expj.AF0030010.AF0030010form2.w_SHIPPABLE_KIT_QTY.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/w_SHIPPABLE_KIT_QTY.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.w_SHIPPABLE_KIT_QTY.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-w_SHIPPABLE_KIT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'w_SHIPPABLE_KIT_QTY', this);
  });
  expj.AF0030010.AF0030010form2.w_SHIPPABLE_KIT_QTY.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.w_SHIPPABLE_KIT_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/w_SHIPPABLE_KIT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-w_SHIPPABLE_KIT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0030010-AF0030010form2-w_SHIPPABLE_KIT_QTY" name="w_SHIPPABLE_KIT_QTY" class="AF0030010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER;14" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getw_SHIPPABLE_KIT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD_1",rb)%></span><!-- 出庫先保管区コード --></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form2-WH_CD">
expj.AF0030010.AF0030010form2.WH_CD = {};
expj.AF0030010.AF0030010form2.WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/WH_CD.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.WH_CD.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'WH_CD', this);
  });
  expj.AF0030010.AF0030010form2.WH_CD.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0030010-AF0030010form2-WH_CD" name="WH_CD" class="AF0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form2-PeekerWhCd">
expj.AF0030010.AF0030010form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AF0030010form2/WH_CD@<%=contextNo%>"
expj.AF0030010.AF0030010form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0030010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0030010', 'PeekerWhCd', 'SQLPARAM_1', '<%=aAF0030010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010form2', '_AF0030010form2/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0030010form2/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0030010.AF0030010form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010form2.PeekerWhCd['onClick' + i])) {
        expj.AF0030010.AF0030010form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AF0030010.AF0030010form2.PeekerWhCd.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0030010-AF0030010form2-PeekerWhCd" class="AF0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form2-WH_NAME">
expj.AF0030010.AF0030010form2.WH_NAME = {};
expj.AF0030010.AF0030010form2.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/WH_NAME.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.WH_NAME.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'WH_NAME', this);
  });
  expj.AF0030010.AF0030010form2.WH_NAME.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0030010-AF0030010form2-WH_NAME" name="WH_NAME" class="AF0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_LOT_NO",rb)%></span><!-- メーカロット番号 --></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010form2-VEND_LOT_NO">
expj.AF0030010.AF0030010form2.VEND_LOT_NO = {};
expj.AF0030010.AF0030010form2.VEND_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/VEND_LOT_NO.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.VEND_LOT_NO.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-VEND_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'VEND_LOT_NO', this);
  });
  expj.AF0030010.AF0030010form2.VEND_LOT_NO.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.VEND_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/VEND_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-VEND_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0030010-AF0030010form2-VEND_LOT_NO" name="VEND_LOT_NO" class="AF0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getVEND_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form2-THIS_MONTH" name="THIS_MONTH" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getTHIS_MONTH()) %>">
<script class="expj-script-AF0030010-AF0030010form2-THIS_MONTH">
expj.AF0030010.AF0030010form2.THIS_MONTH = {};
expj.AF0030010.AF0030010form2.THIS_MONTH.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/THIS_MONTH.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.THIS_MONTH.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-THIS_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'THIS_MONTH', this);
  });
  expj.AF0030010.AF0030010form2.THIS_MONTH.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.THIS_MONTH.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/THIS_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-THIS_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form2-INSTALL_FLG" name="INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.getINSTALL_FLG()) %>">
<script class="expj-script-AF0030010-AF0030010form2-INSTALL_FLG">
expj.AF0030010.AF0030010form2.INSTALL_FLG = {};
expj.AF0030010.AF0030010form2.INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/INSTALL_FLG.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.INSTALL_FLG.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'INSTALL_FLG', this);
  });
  expj.AF0030010.AF0030010form2.INSTALL_FLG.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0030010-AF0030010form2-h_IS_NULL_ALL_WH_CD" name="h_IS_NULL_ALL_WH_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0030010Struct.geth_IS_NULL_ALL_WH_CD()) %>">
<script class="expj-script-AF0030010-AF0030010form2-h_IS_NULL_ALL_WH_CD">
expj.AF0030010.AF0030010form2.h_IS_NULL_ALL_WH_CD = {};
expj.AF0030010.AF0030010form2.h_IS_NULL_ALL_WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0030010form2/h_IS_NULL_ALL_WH_CD.onDecision');
  expj.AF0030010.AF0030010form2.executeAllOnDecision();
  expj.AF0030010.executeAllOnDecision();
};
expj.AF0030010.AF0030010form2.h_IS_NULL_ALL_WH_CD.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010form2-h_IS_NULL_ALL_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0030010', 'AF0030010form2', 'h_IS_NULL_ALL_WH_CD', this);
  });
  expj.AF0030010.AF0030010form2.h_IS_NULL_ALL_WH_CD.executePScriptOnLoad();
};

expj.AF0030010.AF0030010form2.h_IS_NULL_ALL_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0030010form2/h_IS_NULL_ALL_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010form2-h_IS_NULL_ALL_WH_CD');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0030010-AF0030010button2">
expj.AF0030010.AF0030010button2 = {};
expj.AF0030010.AF0030010button2.executeAllOnDecision = function () {
  console.log('execute AF0030010button2.onDecision');
};
expj.AF0030010.AF0030010button2.executeOnLoad = function () {
  expj.AF0030010.AF0030010button2.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button2.executePScriptOnLoad = function () {
  console.log('execute AF0030010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0030010-AF0030010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0030010-AF0030010button2-insert">
expj.AF0030010.AF0030010button2.insert = {};
// script1="onClick;0;CHK;_AF0030010form2/RCV_ISSUE_DATE[gt]_AF0030010form1/BUSINESS_OPR_DATE@#ZZ05103"
expj.AF0030010.AF0030010button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/RCV_ISSUE_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form1/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('AF0030010', 'AF0030010button2', 'ZZ05103');
}
};
// script2="onClick;1;CHK;_AF0030010form2/h_IS_NULL_ALL_WH_CD[neq]true[and]_AF0030010form2/WH_CD[eq]@#AF00030"
expj.AF0030010.AF0030010button2.insert.onClick1 = function () {
  console.log('insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/h_IS_NULL_ALL_WH_CD'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/WH_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AF0030010', 'AF0030010button2', 'AF00030');
}
};
// script3="onClick;2;CHK;_AF0030010form2/h_IS_NULL_ALL_WH_CD[eq]true[and]_AF0030010form2/WH_CD[neq]@#AF00138"
expj.AF0030010.AF0030010button2.insert.onClick2 = function () {
  console.log('insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/h_IS_NULL_ALL_WH_CD'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/WH_CD'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AF0030010', 'AF0030010button2', 'AF00138');
}
};
// script4="onClick;3;CHK;_AF0030010form2/c_ALL_REMAIN[neq]true@*0"
expj.AF0030010.AF0030010button2.insert.onClick3 = function () {
  console.log('insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/c_ALL_REMAIN'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script5="onClick;4;CHK;_AF0030010form2/c_SHIP_COMPLETE[eq]true@*6,*7"
expj.AF0030010.AF0030010button2.insert.onClick4 = function () {
  console.log('insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/c_SHIP_COMPLETE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script6="onClick;5;CHK;_AF0030010form2/c_ALL_REMAIN[eq]true@*8,*9"
expj.AF0030010.AF0030010button2.insert.onClick5 = function () {
  console.log('insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/c_ALL_REMAIN'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script7="onClick;6;CHK;_AF0030010form2/INSTALL_FLG[eq]1[and]_AF0030010form1/h_ALL_CONS_TYP1[eq]1@*10"
expj.AF0030010.AF0030010button2.insert.onClick6 = function () {
  console.log('insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/INSTALL_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form1/h_ALL_CONS_TYP1'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script8="onClick;7;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0030010form1/*,_AF0030010form2/*,_AF0030010view1/*@AF0030010Servlet,,$ZZ07001"
expj.AF0030010.AF0030010button2.insert.onClick7 = function () {
  console.log('insert script8');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0030010', 'AF0030010button2', '_AF0030010form1/*,_AF0030010form2/*,_AF0030010view1/*', 'AF0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0030010', response);
expj.common.updateBusinessScreenTab('AF0030010', contents);
};
expj.common.pscript.callConfirm('AF0030010', 'AF0030010button2', 'ZZ07001', okEvent);
};
// script9="child;0;CHK;_AF0030010form2/RCV_ISSUE_QTY[lt]_AF0030010form1/h_SHIP_REMAIN_KIT_QTY@*1,*3"
expj.AF0030010.AF0030010button2.insert.child0 = function () {
  console.log('insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/RCV_ISSUE_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form1/h_SHIP_REMAIN_KIT_QTY')))) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script10="child;1;CHK;_AF0030010form2/c_SHIP_COMPLETE[eq]true@*2"
expj.AF0030010.AF0030010button2.insert.child1 = function () {
  console.log('insert script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/c_SHIP_COMPLETE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script11="child;2;CHK;1[eq]1@$AF90004"
expj.AF0030010.AF0030010button2.insert.child2 = function () {
  console.log('insert script11');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
expj.common.pscript.addWarningMessage('AF0030010', 'AF0030010button2', 'AF90004');
}
};
// script12="child;3;CHK;_AF0030010form2/c_SHIP_COMPLETE[neq]true@*4"
expj.AF0030010.AF0030010button2.insert.child3 = function () {
  console.log('insert script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/c_SHIP_COMPLETE'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script13="child;4;CFMPUT;_AF0030010button2/insert=NO:-,5@AF90003"
expj.AF0030010.AF0030010button2.insert.child4 = function () {
  console.log('insert script13');
var yesFunc = function () {
expj.AF0030010.AF0030010button2.insert.child5();
};
var noFunc = function () {
expj.common.pscript.backInputValue('AF0030010', 'AF0030010button2', '_AF0030010button2/insert');
};
expj.common.pscript.executeConfirmPut('AF0030010', 'AF0030010button2', '_AF0030010button2/insert', 'AF90003', yesFunc, noFunc);
};
// script14="child;5;SET;_AF0030010form2/c_SHIP_COMPLETE=true"
expj.AF0030010.AF0030010button2.insert.child5 = function () {
  console.log('insert script14');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/c_SHIP_COMPLETE', 'true');
};
// script15="child;6;SET;_AF0030010form1/h_SHIP_COMPLETE=1"
expj.AF0030010.AF0030010button2.insert.child6 = function () {
  console.log('insert script15');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form1/h_SHIP_COMPLETE', '1');
};
// script16="child;7;SET;_AF0030010form1/h_SHIP_COMPLETE=0"
expj.AF0030010.AF0030010button2.insert.child7 = function () {
  console.log('insert script16');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form1/h_SHIP_COMPLETE', '0');
};
// script17="child;8;SET;_AF0030010form1/h_ALL_REMAIN=1"
expj.AF0030010.AF0030010button2.insert.child8 = function () {
  console.log('insert script17');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form1/h_ALL_REMAIN', '1');
};
// script18="child;9;SET;_AF0030010form1/h_ALL_REMAIN=0"
expj.AF0030010.AF0030010button2.insert.child9 = function () {
  console.log('insert script18');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form1/h_ALL_REMAIN', '0');
};
// script19="child;10;CHK;_AF0030010form2/THIS_MONTH[neq]@*11,!AF00142"
expj.AF0030010.AF0030010button2.insert.child10 = function () {
  console.log('insert script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/THIS_MONTH'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
expj.common.pscript.viewErrorMessage('AF0030010', 'AF0030010button2', 'AF00142');
}
};
// script20="child;11;CHK;_AF0030010form2/THIS_MONTH[gt]~TO_YYYY_MM(_AF0030010form2/RCV_ISSUE_DATE)@$AF00144"
expj.AF0030010.AF0030010button2.insert.child11 = function () {
  console.log('insert script20');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button2', '_AF0030010form2/THIS_MONTH')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('AF0030010', 'AF0030010button2', '_AF0030010form2/RCV_ISSUE_DATE')))) {
expj.common.pscript.addWarningMessage('AF0030010', 'AF0030010button2', 'AF00144');
}
};
expj.AF0030010.AF0030010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 7; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010button2.insert['onClick' + i])) {
        expj.AF0030010.AF0030010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010button2.insert.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010button2.insert.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010button2', 'insert', this, 'Button');
    }
  });
  expj.AF0030010.AF0030010button2.insert.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button2.insert.executePScriptOnLoad = function () {
  console.log('execute AF0030010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0030010-AF0030010button2-insert" name="insert" class="AF0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AF0030010-AF0030010view1">
expj.AF0030010.AF0030010view1 = {};
expj.AF0030010.AF0030010view1.executeAllOnClick = function () {
};
expj.AF0030010.AF0030010view1.executeAllOnDecision = function () {
  console.log('execute AF0030010view1.onDecision');
};
expj.AF0030010.AF0030010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AF0030010view1", "expj.AF0030010.AF0030010view1.executeAllOnClick");
%>
  expj.AF0030010.AF0030010view1.executePScriptOnLoad();
};

expj.AF0030010.AF0030010view1.executePScriptOnLoad = function () {
  console.log('execute AF0030010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AF0030010-AF0030010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AF0030010view1_Id = "AF0030010view1";
 String AF0030010view1_select = "single";
 String AF0030010view1_sortable = "true";
 String AF0030010view1_resize = "true";
 String AF0030010view1_scroll = "true";
 StringBuffer AF0030010view1_HB = new StringBuffer();
 StringBuffer AF0030010view1_DB = new StringBuffer();
%>
<%
 AF0030010view1_select = "single";
 AF0030010view1_sortable = "true";
 AF0030010view1_resize = "true";
 AF0030010view1_scroll = "true";
%>
<%
 AF0030010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
%>
     
<%
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_CD",rb))).append("', 'name':'ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0311",rb))).append("', 'name':'w_ISSUE_INST_KIT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0341",rb))).append("', 'name':'ISSUE_POS_KIT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0312",rb))).append("', 'name':'w_TOTAL_ISSUE_KIT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0313",rb))).append("', 'name':'w_SHIP_REMAIN_KIT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0310",rb))).append("', 'name':'w_TOTAL_STOCK_KIT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SCDL_ISSUE_DATE",rb))).append("', 'name':'SCDL_ISSUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_CMPLT_DATE",rb))).append("', 'name':'ISSUE_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ISSUE_CMPLT_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_CMPLT_FLG",rb))).append("', 'name':'ISSUE_CMPLT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD_1",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME_2",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'CONS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONS_TYP",rb))).append("', 'name':'CONS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_QTY",rb))).append("', 'name':'ISSUE_INST_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0340",rb))).append("', 'name':'ISSUE_POS_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY",rb))).append("', 'name':'TOTAL_ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0305",rb))).append("', 'name':'w_SHIP_REMAIN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0306",rb))).append("', 'name':'w_TOTAL_STOCK_ON_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_UNIT_NUMERATOR_2",rb))).append("', 'name':'ISSUE_INST_UNIT_NUMERATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
AF0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_UNIT_DENOMINATOR_2",rb))).append("', 'name':'ISSUE_INST_UNIT_DENOMINATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0030010view1_sortable).append("}").append(",");
%>
<%
 int aAF0030010StructLength = aAF0030010Control.getListsize();
 final AF0030010Struct structBackup = aAF0030010Struct;
 aAF0030010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAF0030010StructLength; ++loopCount) {
  if((aAF0030010Struct = (AF0030010Struct) aAF0030010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAF0030010Struct", aAF0030010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AF0030010view1_DB.append("[");
 AF0030010view1_DB.append(loopCount);
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getMODIFY_COUNT())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-ISSUE_INST_CD\" data-name=\"ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getISSUE_INST_CD())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getl_ITEM_CD())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getl_ITEM_NAME())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-w_ISSUE_INST_KIT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-w_ISSUE_INST_KIT_QTY\" data-name=\"w_ISSUE_INST_KIT_QTY\" data-view=\"true\" data-kind=\"OBT_INTEGER;14\">").append(TypeConverter.sanitizer(aAF0030010Struct.getw_ISSUE_INST_KIT_QTY())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-ISSUE_POS_KIT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-ISSUE_POS_KIT_QTY\" data-name=\"ISSUE_POS_KIT_QTY\" data-view=\"true\" data-kind=\"OBT_INTEGER;14\">").append(TypeConverter.sanitizer(aAF0030010Struct.getISSUE_POS_KIT_QTY())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-w_TOTAL_ISSUE_KIT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-w_TOTAL_ISSUE_KIT_QTY\" data-name=\"w_TOTAL_ISSUE_KIT_QTY\" data-view=\"true\" data-kind=\"OBT_INTEGER;14\">").append(TypeConverter.sanitizer(aAF0030010Struct.getw_TOTAL_ISSUE_KIT_QTY())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-w_SHIP_REMAIN_KIT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-w_SHIP_REMAIN_KIT_QTY\" data-name=\"w_SHIP_REMAIN_KIT_QTY\" data-view=\"true\" data-kind=\"OBT_INTEGER;14\">").append(TypeConverter.sanitizer(aAF0030010Struct.getw_SHIP_REMAIN_KIT_QTY())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-w_TOTAL_STOCK_KIT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-w_TOTAL_STOCK_KIT_QTY\" data-name=\"w_TOTAL_STOCK_KIT_QTY\" data-view=\"true\" data-kind=\"OBT_INTEGER;14\">").append(TypeConverter.sanitizer(aAF0030010Struct.getw_TOTAL_STOCK_KIT_QTY())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-SCDL_ISSUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-SCDL_ISSUE_DATE\" data-name=\"SCDL_ISSUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getSCDL_ISSUE_DATE())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-ISSUE_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-ISSUE_CMPLT_DATE\" data-name=\"ISSUE_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getISSUE_CMPLT_DATE())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-ISSUE_CMPLT_FLG-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-ISSUE_CMPLT_FLG\" data-name=\"ISSUE_CMPLT_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getISSUE_CMPLT_FLG())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-ISSUE_CMPLT_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-ISSUE_CMPLT_NAME\" data-name=\"ISSUE_CMPLT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getISSUE_CMPLT_NAME())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getWH_CD())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getWH_NAME())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-CONS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-CONS_TYP\" data-name=\"CONS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getCONS_TYP())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-CONS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-CONS_NAME\" data-name=\"CONS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getCONS_NAME())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-ISSUE_INST_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-ISSUE_INST_QTY\" data-name=\"ISSUE_INST_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0030010Struct.getISSUE_INST_QTY())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-ISSUE_POS_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-ISSUE_POS_QTY\" data-name=\"ISSUE_POS_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0030010Struct.getISSUE_POS_QTY())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-TOTAL_ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-TOTAL_ISSUE_QTY\" data-name=\"TOTAL_ISSUE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0030010Struct.getTOTAL_ISSUE_QTY())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-w_SHIP_REMAIN_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-w_SHIP_REMAIN_QTY\" data-name=\"w_SHIP_REMAIN_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0030010Struct.getw_SHIP_REMAIN_QTY())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-w_TOTAL_STOCK_ON_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-w_TOTAL_STOCK_ON_HAND_QTY\" data-name=\"w_TOTAL_STOCK_ON_HAND_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0030010Struct.getw_TOTAL_STOCK_ON_HAND_QTY())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-ISSUE_INST_UNIT_NUMERATOR-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-ISSUE_INST_UNIT_NUMERATOR\" data-name=\"ISSUE_INST_UNIT_NUMERATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0030010Struct.getISSUE_INST_UNIT_NUMERATOR())).append("</span>'");
 AF0030010view1_DB.append(",").append("'<span id=\"expj-AF0030010-AF0030010view1-ISSUE_INST_UNIT_DENOMINATOR-").append(loopCount).append("\" class=\"expj-label expj-AF0030010-AF0030010view1-ISSUE_INST_UNIT_DENOMINATOR\" data-name=\"ISSUE_INST_UNIT_DENOMINATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0030010Struct.getISSUE_INST_UNIT_DENOMINATOR())).append("</span>'");
 AF0030010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAF0030010StructLength) {
   AF0030010view1_DB.append(",");
  }
 }
 aAF0030010Struct = structBackup;
 viewIdList.add(AF0030010view1_Id);
 viewSelectList.add(AF0030010view1_select);
 viewResizeList.add(AF0030010view1_resize);
 viewScrollList.add(AF0030010view1_scroll);
 viewHeaderDataList.add(AF0030010view1_HB);
 viewBodyDataList.add(AF0030010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0030010-AF0030010button3">
expj.AF0030010.AF0030010button3 = {};
expj.AF0030010.AF0030010button3.executeAllOnDecision = function () {
  console.log('execute AF0030010button3.onDecision');
};
expj.AF0030010.AF0030010button3.executeOnLoad = function () {
  expj.AF0030010.AF0030010button3.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button3.executePScriptOnLoad = function () {
  console.log('execute AF0030010button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0030010-AF0030010button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0030010-AF0030010button3-modify">
expj.AF0030010.AF0030010button3.modify = {};
// script1="onClick;0;CHK;_AF0030010form2/c_SHIP_COMPLETE[eq]true@*0,*1"
expj.AF0030010.AF0030010button3.modify.onClick0 = function () {
  console.log('modify script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0030010', 'AF0030010button3', '_AF0030010form2/c_SHIP_COMPLETE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AF0030010form1/*,_AF0030010detail1/*,_AF0030010form2/*,_AF0030010view1/+@AF0030010Servlet"
expj.AF0030010.AF0030010button3.modify.onClick1 = function () {
  console.log('modify script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0030010', 'AF0030010button3', '_AF0030010form1/*,_AF0030010detail1/*,_AF0030010form2/*,_AF0030010view1/+', 'AF0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0030010', response);
expj.common.changeBusinessScreenTab('AF0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script3="child;0;SET;_AF0030010form1/h_SHIP_COMPLETE=1"
expj.AF0030010.AF0030010button3.modify.child0 = function () {
  console.log('modify script3');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010button3', '_AF0030010form1/h_SHIP_COMPLETE', '1');
};
// script4="child;1;SET;_AF0030010form1/h_SHIP_COMPLETE=0"
expj.AF0030010.AF0030010button3.modify.child1 = function () {
  console.log('modify script4');
expj.common.pscript.setReferenceComponentValue('AF0030010', 'AF0030010button3', '_AF0030010form1/h_SHIP_COMPLETE', '0');
};
expj.AF0030010.AF0030010button3.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010button3.modify['onClick' + i])) {
        expj.AF0030010.AF0030010button3.modify['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010button3.modify.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010button3.modify.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010button3-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010button3', 'modify', this, 'Button');
    }
  });
  expj.AF0030010.AF0030010button3.modify.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button3.modify.executePScriptOnLoad = function () {
  console.log('execute AF0030010button3/modify.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010button3-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0030010-AF0030010button3-modify" name="modify" class="AF0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AF0030010 Revision: 1.12  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AF0030010-AF0030010button0">
expj.AF0030010.AF0030010button0 = {};
expj.AF0030010.AF0030010button0.executeAllOnDecision = function () {
  console.log('execute AF0030010button0.onDecision');
};
expj.AF0030010.AF0030010button0.executeOnLoad = function () {
  expj.AF0030010.AF0030010button0.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button0.executePScriptOnLoad = function () {
  console.log('execute AF0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0030010-AF0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0030010-AF0030010button0-CmpltCancel">
expj.AF0030010.AF0030010button0.CmpltCancel = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0030010form1/*,_AF0030010form2/*@AF0030010Servlet,,$ZZ07001"
expj.AF0030010.AF0030010button0.CmpltCancel.onClick0 = function () {
  console.log('CmpltCancel script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0030010', 'AF0030010button0', '_AF0030010form1/*,_AF0030010form2/*', 'AF0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0030010', response);
expj.common.updateBusinessScreenTab('AF0030010', contents);
};
expj.common.pscript.callConfirm('AF0030010', 'AF0030010button0', 'ZZ07001', okEvent);
};
expj.AF0030010.AF0030010button0.CmpltCancel.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010button0.CmpltCancel['onClick' + i])) {
        expj.AF0030010.AF0030010button0.CmpltCancel['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010button0.CmpltCancel.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010button0.CmpltCancel.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010button0-CmpltCancel').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010button0', 'CmpltCancel', this, 'Button');
    }
  });
  expj.AF0030010.AF0030010button0.CmpltCancel.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button0.CmpltCancel.executePScriptOnLoad = function () {
  console.log('execute AF0030010button0/CmpltCancel.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010button0-CmpltCancel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0030010-AF0030010button0-CmpltCancel" name="CmpltCancel" class="AF0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelComplete",rb)%></button><!-- 完了解除ボタン --></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010button0-clear">
expj.AF0030010.AF0030010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AF0030010Servlet,,$ZZ07008"
expj.AF0030010.AF0030010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0030010', 'AF0030010button0', '', 'AF0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0030010', response);
expj.common.updateBusinessScreenTab('AF0030010', contents);
};
expj.common.pscript.callConfirm('AF0030010', 'AF0030010button0', 'ZZ07008', okEvent);
};
expj.AF0030010.AF0030010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010button0.clear['onClick' + i])) {
        expj.AF0030010.AF0030010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010button0.clear.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010button0.clear.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010button0', 'clear', this, 'Button');
    }
  });
  expj.AF0030010.AF0030010button0.clear.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AF0030010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0030010-AF0030010button0-clear" name="clear" class="AF0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AF0030010-AF0030010button0-close">
expj.AF0030010.AF0030010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AF0030010.AF0030010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AF0030010');
};
expj.AF0030010.AF0030010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0030010.AF0030010button0.close['onClick' + i])) {
        expj.AF0030010.AF0030010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AF0030010.AF0030010button0.close.executeAllOnDecision = function () {
};
expj.AF0030010.AF0030010button0.close.executeOnLoad = function () {
  $('#expj-AF0030010-AF0030010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0030010', 'AF0030010button0', 'close', this, 'Button');
    }
  });
  expj.AF0030010.AF0030010button0.close.executePScriptOnLoad();
};

expj.AF0030010.AF0030010button0.close.executePScriptOnLoad = function () {
  console.log('execute AF0030010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AF0030010-AF0030010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0030010-AF0030010button0-close" name="close" class="AF0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0030010 (END)-->
<script class="expj-script-AF0030010-AF0030010detail1">
expj.AF0030010.AF0030010detail1 = {};
expj.AF0030010.AF0030010detail1.executeAllOnDecision = function () {
  console.log('execute AF0030010detail1.onDecision');
};
expj.AF0030010.AF0030010detail1.executeOnLoad = function () {
  expj.AF0030010.AF0030010detail1.executePScriptOnLoad();
};

expj.AF0030010.AF0030010detail1.executePScriptOnLoad = function () {
  console.log('execute AF0030010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAF0030010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AF0030010-AF0030010detail1" class="expj-datagird-detail" data-float="AF0030010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AF0030010detail1";
 detailFloat = "AF0030010float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AF0030010detail1_Id = "AF0030010detail1";
 String AF0030010detail1_select = "single";
 String AF0030010detail1_sortable = "true";
 String AF0030010detail1_resize = "true";
 String AF0030010detail1_scroll = "true";
 StringBuffer AF0030010detail1_HB = new StringBuffer();
 StringBuffer AF0030010detail1_DB = new StringBuffer();
%>
<%
 AF0030010detail1_sortable = "false";
 AF0030010detail1_select = "none";
%>
<% AF0030010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AF0030010detail1_sortable).append("}").append(","); %>
<%  AF0030010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AF0030010detail1_sortable).append("}").append(",");
AF0030010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AF0030010detail1_sortable).append("}").append(",");
AF0030010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AF0030010detail1_sortable).append("}").append(",");
 %>
  <% AF0030010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.JOB_ODR_CD",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-JOB_ODR_CD\" class=\"expj-label\" data-name=\"JOB_ODR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getJOB_ODR_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-ITEM_CD\" class=\"expj-label\" data-name=\"ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-ITEM_NAME\" class=\"expj-label\" data-name=\"ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-OPR_INST_START_DATE\" class=\"expj-label\" data-name=\"OPR_INST_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getOPR_INST_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_3",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-WORK_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"WORK_ODR_DLV_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getWORK_ODR_DLV_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.OPR_INST_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AF0030010-AF0030010detail1-OPR_INST_QTY\" class=\"expj-label\" data-name=\"OPR_INST_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0030010Struct.getOPR_INST_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AF0030010-AF0030010detail1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.WORK_ODR_CD",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-WORK_ODR_CD\" class=\"expj-label\" data-name=\"WORK_ODR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getWORK_ODR_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-WORK_IN_PROC_CD\" class=\"expj-label\" data-name=\"WORK_IN_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getWORK_IN_PROC_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.PROC_NAME",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-PROC_NAME\" class=\"expj-label\" data-name=\"PROC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getPROC_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.WS_CD",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-WS_CD\" class=\"expj-label\" data-name=\"WS_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getWS_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.WS_NAME",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-WS_NAME\" class=\"expj-label\" data-name=\"WS_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getWS_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-VEND_CD\" class=\"expj-label\" data-name=\"VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getVEND_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AF0030010detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.VEND_ANAME",rb)).append("','").append("<span id=\"expj-AF0030010-AF0030010detail1-VEND_ANAME\" class=\"expj-label\" data-name=\"VEND_ANAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAF0030010Struct.getVEND_ANAME())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AF0030010detail1_Id;
 detailViewSelect = AF0030010detail1_select;
 detailViewResize = AF0030010detail1_resize;
 detailViewScroll = AF0030010detail1_scroll;
 detailViewHeaderData = AF0030010detail1_HB;
 detailViewBodyData = AF0030010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAF0030010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0030010)) {
  expj.common.treeInstanceMap.AF0030010 = {};
}
expj.common.treeInstanceMap.AF0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0030010)) {
  expj.common.detailDialogMap.AF0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AF0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0030010)) {
  expj.common.viewInstanceMap.AF0030010 = {};
}
expj.common.viewInstanceMap.AF0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0030010.<%=viewId %>.init = function () {
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
    expj.AF0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0030010_init">
/**
 * AF0030010用のロード完了時初期化関数
 */
expj.AF0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0030010');
  expj.common.calendarInstanceMap.AF0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0030010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0030010.AF0030010form1.OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.h_SHIP_COMPLETE.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.h_RCV_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.PeekerOprInstCd.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.w_CHOICE.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.w_CHOICE_0.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.h_ISSUE_CMPLT_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.h_ALL_REMAIN.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.h_SHIP_REMAIN_KIT_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.PeekerPuchOdrCd.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.w_CHOICE_1.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.h_ALL_CONS_TYP1.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button1.select.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.RCV_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.OD_NO.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.COMPANY_CD.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.c_SHIP_COMPLETE.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.c_ALL_REMAIN.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.REMAIN_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.RCV_ISSUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.CalendarRcvIssueDate.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.w_SHIPPABLE_KIT_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.VEND_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.THIS_MONTH.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.h_IS_NULL_ALL_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button2.insert.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button3.modify.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button0.CmpltCancel.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button0.close.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form1.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button1.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010form2.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button2.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010view1.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button3.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010button0.executeOnLoad();}catch(e){};
  try{expj.AF0030010.AF0030010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0030010', 'AF0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0030010', '<%=request.getContextPath() %>');
};

/**
 * AF0030010の全体onDecision処理
 */
expj.AF0030010.executeAllOnDecision = function () {
  expj.AF0030010.AF0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0030010_console">
expj.AF0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>