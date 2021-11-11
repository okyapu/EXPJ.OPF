<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:38:06 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0020\AF0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0020.*" %>
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
<jsp:useBean id="aAF0020010Control" class="com.nec.jp.orteus.metamorBase.AF0020.AF0020010Control" scope="request"/>
<jsp:useBean id="aAF0020010Struct" class="com.nec.jp.orteus.metamorBase.AF0020.AF0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

マニュアル出庫実績入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0020/jsp/AF0020010.jsp,v $
$Author: geng-jia $	
$Revision: 1.24 $ $Date: 2017/02/22 02:05:35 $
********************************************************* --%>
<html>
<head>
<title>マニュアル出庫実績入力</title>
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
<script class="expj-script-AF0020010_init">
  // AF0020010名前空間
  expj.AF0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AF0020010" data-screen="AF0020010" data-newdata="<%=aAF0020010Control.isNewData() %>">
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
              <script class="expj-script-AF0020010-AF0020010form1">
expj.AF0020010.AF0020010form1 = {};
// script1="onLoad;0;CALL;child@0,6,49"
expj.AF0020010.AF0020010form1.onLoad0 = function () {
  console.log('AF0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child6)){this.child6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child49)){this.child49();}
};
// script2="child;0;CHK;_w_CHOICE[eq]0@*1,*2"
expj.AF0020010.AF0020010form1.child0 = function () {
  console.log('AF0020010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_w_CHOICE'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_w_CHOICE_1=true"
expj.AF0020010.AF0020010form1.child1 = function () {
  console.log('AF0020010form1 script3');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_w_CHOICE_1', 'true');
};
// script4="child;2;CHK;_w_CHOICE[eq]1@*3,*4"
expj.AF0020010.AF0020010form1.child2 = function () {
  console.log('AF0020010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_w_CHOICE'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;3;SET;_w_CHOICE_2=true"
expj.AF0020010.AF0020010form1.child3 = function () {
  console.log('AF0020010form1 script5');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_w_CHOICE_2', 'true');
};
// script6="child;4;CHK;_w_CHOICE[eq]2@*5,*33"
expj.AF0020010.AF0020010form1.child4 = function () {
  console.log('AF0020010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_w_CHOICE'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
}
};
// script7="child;5;SET;_w_CHOICE_3=true"
expj.AF0020010.AF0020010form1.child5 = function () {
  console.log('AF0020010form1 script7');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_w_CHOICE_3', 'true');
};
// script8="child;6;CHK;?AF0020010form1/*[neq]NORMAL@*7"
expj.AF0020010.AF0020010form1.child6 = function () {
  console.log('AF0020010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="child;7;MASK;_AF0020010button2/insert,_AF0020010button2/modify,_AF0020010button2/choiceAll,_AF0020010button2/cancelAll"
expj.AF0020010.AF0020010form1.child7 = function () {
  console.log('AF0020010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/choiceAll');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/cancelAll');
};
// script10="onLoad;1;CALL;onDecision@0,1,2,3"
expj.AF0020010.AF0020010form1.onLoad1 = function () {
  console.log('AF0020010form1 script10');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script11="onDecision;0;CHK;_AF0020010form1/w_CHOICE_1[eq]true@*8,*9"
expj.AF0020010.AF0020010form1.onDecision0 = function () {
  console.log('AF0020010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_CHOICE_1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;8;CHKRQ;A@*12,*13"
expj.AF0020010.AF0020010form1.child8 = function () {
  console.log('AF0020010form1 script12');
if (expj.common.pscript.satisfiedRequiredComponent('AF0020010', 'A')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script13="child;9;CHK;_AF0020010form1/w_CHOICE_2[eq]true@*10"
expj.AF0020010.AF0020010form1.child9 = function () {
  console.log('AF0020010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_CHOICE_2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script14="child;10;CHKRQ;B@*12,*13"
expj.AF0020010.AF0020010form1.child10 = function () {
  console.log('AF0020010form1 script14');
if (expj.common.pscript.satisfiedRequiredComponent('AF0020010', 'B')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script15="child;11;CHKRQ;C@*12,*13"
expj.AF0020010.AF0020010form1.child11 = function () {
  console.log('AF0020010form1 script15');
if (expj.common.pscript.satisfiedRequiredComponent('AF0020010', 'C')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script16="child;12;UNMASK;_AF0020010button1/select"
expj.AF0020010.AF0020010form1.child12 = function () {
  console.log('AF0020010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button1/select');
};
// script17="child;13;MASK;_AF0020010button1/select"
expj.AF0020010.AF0020010form1.child13 = function () {
  console.log('AF0020010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button1/select');
};
// script18="onDecision;1;CHK;?AF0020010form1/*[eq]NORMAL@*14,*27"
expj.AF0020010.AF0020010form1.onDecision1 = function () {
  console.log('AF0020010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script19="child;14;CHK;?AF0020010form1/w_ISSUE_INST_CD[eq]SAME[and]?AF0020010form1/w_WS_CD[eq]SAME[and]?AF0020010form1/w_VEND_CD[eq]SAME[and]?AF0020010form1/w_OPR_INST_CD[eq]SAME[and]?AF0020010form1/w_ISSUE_CMPLT_FLG[eq]SAME[and]?AF0020010form1/w_PUCH_ODR_CD[eq]SAME[and]?AF0020010form1/w_LOT_CTRL_FLG[eq]SAME@*15,*28"
expj.AF0020010.AF0020010form1.child14 = function () {
  console.log('AF0020010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_ISSUE_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_ISSUE_CMPLT_FLG'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_LOT_CTRL_FLG'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script20="child;15;CHK;_AF0020010form1/w_ISSUE_CMPLT_FLG[eq]0[and]_AF0020010form1/w_LOT_CTRL_FLG[eq]0@*16,*23"
expj.AF0020010.AF0020010form1.child15 = function () {
  console.log('AF0020010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_CMPLT_FLG'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_LOT_CTRL_FLG'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script21="child;16;UNMASK;_AF0020010button2/choiceAll,_AF0020010button2/cancelAll@*17"
expj.AF0020010.AF0020010form1.child16 = function () {
  console.log('AF0020010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/choiceAll');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/cancelAll');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script22="child;17;CHKRQ;?AF0020010view1/?[eq]SINGLE@*18,*19"
expj.AF0020010.AF0020010form1.child17 = function () {
  console.log('AF0020010form1 script22');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script23="child;18;UNMASK;_AF0020010button2/insert,_AF0020010button2/modify"
expj.AF0020010.AF0020010form1.child18 = function () {
  console.log('AF0020010form1 script23');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/insert');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/modify');
};
// script24="child;19;CHKRQ;?AF0020010view1/?[eq]MULTI@*20,*22"
expj.AF0020010.AF0020010form1.child19 = function () {
  console.log('AF0020010form1 script24');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010view1/?'), '[eq]', 'MULTI'))) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script25="child;20;UNMASK;_AF0020010button2/insert@*21"
expj.AF0020010.AF0020010form1.child20 = function () {
  console.log('AF0020010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child21)){this.child21();}}
};
// script26="child;21;MASK;_AF0020010button2/modify"
expj.AF0020010.AF0020010form1.child21 = function () {
  console.log('AF0020010form1 script26');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/modify');
};
// script27="child;22;MASK;_AF0020010button2/insert,_AF0020010button2/modify"
expj.AF0020010.AF0020010form1.child22 = function () {
  console.log('AF0020010form1 script27');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/modify');
};
// script28="child;23;MASK;_AF0020010button2/insert@*24"
expj.AF0020010.AF0020010form1.child23 = function () {
  console.log('AF0020010form1 script28');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child24)){this.child24();}}
};
// script29="child;24;UNMASK;_AF0020010button2/choiceAll,_AF0020010button2/cancelAll@*25"
expj.AF0020010.AF0020010form1.child24 = function () {
  console.log('AF0020010form1 script29');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/choiceAll');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/cancelAll');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child25)){this.child25();}}
};
// script30="child;25;CHKRQ;?AF0020010view1/?[eq]SINGLE@*26,*27"
expj.AF0020010.AF0020010form1.child25 = function () {
  console.log('AF0020010form1 script30');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script31="child;26;UNMASK;_AF0020010button2/modify"
expj.AF0020010.AF0020010form1.child26 = function () {
  console.log('AF0020010form1 script31');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/modify');
};
// script32="child;27;MASK;_AF0020010button2/modify"
expj.AF0020010.AF0020010form1.child27 = function () {
  console.log('AF0020010form1 script32');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/modify');
};
// script33="child;28;MASK;_AF0020010button2/insert,_AF0020010button2/modify,_AF0020010button2/choiceAll,_AF0020010button2/cancelAll"
expj.AF0020010.AF0020010form1.child28 = function () {
  console.log('AF0020010form1 script33');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/choiceAll');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/cancelAll');
};
// script34="onDecision;2;CHK;?AF0020010form1/*[eq]NORMAL[and]_AF0020010form1/w_ISSUE_CMPLT_FLG[numeq]1@*29,*32"
expj.AF0020010.AF0020010form1.onDecision2 = function () {
  console.log('AF0020010form1 script34');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_CMPLT_FLG')), '[numeq]', expj.common.pscript.convertNumber('1'))) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
}
};
// script35="child;29;CHKRQ;?AF0020010view1/?[eq]SINGLE[or]?AF0020010view1/?[eq]MULTI@*30,*32"
expj.AF0020010.AF0020010form1.child29 = function () {
  console.log('AF0020010form1 script35');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010view1/?'), '[eq]', 'SINGLE') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010view1/?'), '[eq]', 'MULTI'))) {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
} else {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
}
};
// script36="child;30;CHK;?AF0020010form1/w_ISSUE_INST_CD[eq]SAME[and]?AF0020010form1/w_WS_CD[eq]SAME[and]?AF0020010form1/w_VEND_CD[eq]SAME[and]?AF0020010form1/w_OPR_INST_CD[eq]SAME[and]?AF0020010form1/w_ISSUE_CMPLT_FLG[eq]SAME[and]?AF0020010form1/w_PUCH_ODR_CD[eq]SAME[and]?AF0020010form1/w_LOT_CTRL_FLG[eq]SAME@*31,*32"
expj.AF0020010.AF0020010form1.child30 = function () {
  console.log('AF0020010form1 script36');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_ISSUE_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_ISSUE_CMPLT_FLG'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_LOT_CTRL_FLG'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
} else {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
}
};
// script37="child;31;UNMASK;_AF0020010button2/CmpltCancel"
expj.AF0020010.AF0020010form1.child31 = function () {
  console.log('AF0020010form1 script37');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/CmpltCancel');
};
// script38="child;32;MASK;_AF0020010button2/CmpltCancel"
expj.AF0020010.AF0020010form1.child32 = function () {
  console.log('AF0020010form1 script38');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/CmpltCancel');
};
// script39="child;33;CHK;_w_CHOICE[eq]3@*34,*35"
expj.AF0020010.AF0020010form1.child33 = function () {
  console.log('AF0020010form1 script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_w_CHOICE'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child34)){this.child34();}
} else {
if(expj.common.checkNameSpace(this.child35)){this.child35();}
}
};
// script40="child;34;SET;_w_CHOICE_4=true"
expj.AF0020010.AF0020010form1.child34 = function () {
  console.log('AF0020010form1 script40');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_w_CHOICE_4', 'true');
};
// script41="child;35;CHK;_w_CHOICE[eq]4@*36"
expj.AF0020010.AF0020010form1.child35 = function () {
  console.log('AF0020010form1 script41');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_w_CHOICE'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child36)){this.child36();}
}
};
// script42="child;36;SET;_w_CHOICE_5=true"
expj.AF0020010.AF0020010form1.child36 = function () {
  console.log('AF0020010form1 script42');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_w_CHOICE_5', 'true');
};
// script50="onDecision;3;CHK;_AF0020010form1/w_CHOICE_3[eq]true@*11,*45"
expj.AF0020010.AF0020010form1.onDecision3 = function () {
  console.log('AF0020010form1 script50');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_CHOICE_3'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child45)){this.child45();}
}
};
// script52="child;45;CHK;_AF0020010form1/w_CHOICE_4[eq]true@*46,*47"
expj.AF0020010.AF0020010form1.child45 = function () {
  console.log('AF0020010form1 script52');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_CHOICE_4'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child46)){this.child46();}
} else {
if(expj.common.checkNameSpace(this.child47)){this.child47();}
}
};
// script53="child;46;CHKRQ;D@*12,*13"
expj.AF0020010.AF0020010form1.child46 = function () {
  console.log('AF0020010form1 script53');
if (expj.common.pscript.satisfiedRequiredComponent('AF0020010', 'D')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script54="child;47;CHK;_AF0020010form1/w_CHOICE_5[eq]true@*48"
expj.AF0020010.AF0020010form1.child47 = function () {
  console.log('AF0020010form1 script54');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_CHOICE_5'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child48)){this.child48();}
}
};
// script55="child;48;CHKRQ;E@*12,*13"
expj.AF0020010.AF0020010form1.child48 = function () {
  console.log('AF0020010form1 script55');
if (expj.common.pscript.satisfiedRequiredComponent('AF0020010', 'E')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script56="child;49;CHK;_AF0020010form1/h_SYS_LOT_CTRL_FLG[eq]true@*50,*51"
expj.AF0020010.AF0020010form1.child49 = function () {
  console.log('AF0020010form1 script56');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/h_SYS_LOT_CTRL_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child50)){this.child50();}
} else {
if(expj.common.checkNameSpace(this.child51)){this.child51();}
}
};
// script57="child;50;UNMASK;_AF0020010form1/w_LOT_CTRL_FLG"
expj.AF0020010.AF0020010form1.child50 = function () {
  console.log('AF0020010form1 script57');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_LOT_CTRL_FLG');
};
// script58="child;51;MASK;_AF0020010form1/w_LOT_CTRL_FLG"
expj.AF0020010.AF0020010form1.child51 = function () {
  console.log('AF0020010form1 script58');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_LOT_CTRL_FLG');
};
// script59="onDecision;4;CHK;?AF0020010form1/*[eq]NORMAL@*52,*56"
expj.AF0020010.AF0020010form1.onDecision4 = function () {
  console.log('AF0020010form1 script59');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child52)){this.child52();}
} else {
if(expj.common.checkNameSpace(this.child56)){this.child56();}
}
};
// script60="child;52;CHK;?AF0020010form1/w_ISSUE_INST_CD[eq]SAME[and]?AF0020010form1/w_WS_CD[eq]SAME[and]?AF0020010form1/w_VEND_CD[eq]SAME[and]?AF0020010form1/w_OPR_INST_CD[eq]SAME[and]?AF0020010form1/w_ISSUE_CMPLT_FLG[eq]SAME[and]?AF0020010form1/w_PUCH_ODR_CD[eq]SAME@[and]?AF0020010form1/w_LOT_CTRL_FLG[eq]SAME@*53,*56"
expj.AF0020010.AF0020010form1.child52 = function () {
  console.log('AF0020010form1 script60');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_ISSUE_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_ISSUE_CMPLT_FLG'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010form1/w_PUCH_ODR_CD'), '[eq]', 'SAME')) {

}
};
// script61="child;53;CHK;_AF0020010form1/w_ISSUE_CMPLT_FLG[eq]0[and]_AF0020010form1/w_LOT_CTRL_FLG[eq]1@*54,*56"
expj.AF0020010.AF0020010form1.child53 = function () {
  console.log('AF0020010form1 script61');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_CMPLT_FLG'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_LOT_CTRL_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child54)){this.child54();}
} else {
if(expj.common.checkNameSpace(this.child56)){this.child56();}
}
};
// script62="child;54;CHKRQ;?AF0020010view1/?[eq]SINGLE@*55,*56"
expj.AF0020010.AF0020010form1.child54 = function () {
  console.log('AF0020010form1 script62');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '?AF0020010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child55)){this.child55();}
} else {
if(expj.common.checkNameSpace(this.child56)){this.child56();}
}
};
// script63="child;55;UNMASK;_AF0020010button2/modify"
expj.AF0020010.AF0020010form1.child55 = function () {
  console.log('AF0020010form1 script63');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010button2/modify');
};
// script64="child;56;MASK;MASK;_AF0020010button2/modify"
expj.AF0020010.AF0020010form1.child56 = function () {
  console.log('AF0020010form1 script64');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', 'MASK');
};
expj.AF0020010.AF0020010form1.executeAllOnDecision = function () {
  console.log('execute AF0020010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1['onDecision' + i])) {
        expj.AF0020010.AF0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010form1.executeOnLoad = function () {
  expj.AF0020010.AF0020010form1.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1['onLoad' + i])) {
      expj.AF0020010.AF0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0020010-AF0020010form1" action="AF0020010Servlet" name="AF0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAF0020010Control.getReadStatusString()) %>" style="height:165px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:165px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_INST_CD",rb)%></span><!-- 出庫指示番号 --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_ISSUE_INST_CD">
expj.AF0020010.AF0020010form1.w_ISSUE_INST_CD = {};
expj.AF0020010.AF0020010form1.w_ISSUE_INST_CD.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_ISSUE_INST_CD.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_ISSUE_INST_CD.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_ISSUE_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'w_ISSUE_INST_CD', this);
  });
  expj.AF0020010.AF0020010form1.w_ISSUE_INST_CD.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_ISSUE_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_ISSUE_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_ISSUE_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0020010-AF0020010form1-w_ISSUE_INST_CD" name="w_ISSUE_INST_CD" class="AF0020010-focus-move  required-value expj-AF0020010-required-A" style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getw_ISSUE_INST_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_CHOICE_1">
expj.AF0020010.AF0020010form1.w_CHOICE_1 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AF0020010.AF0020010form1.w_CHOICE_1.onLoad0 = function () {
  console.log('w_CHOICE_1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.AF0020010.AF0020010form1.w_CHOICE_1.onClick0 = function () {
  console.log('w_CHOICE_1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_AF0020010form1/w_ISSUE_INST_CD@*1"
expj.AF0020010.AF0020010form1.w_CHOICE_1.child0 = function () {
  console.log('w_CHOICE_1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_INST_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;SET;_AF0020010form1/w_WS_CD=,_AF0020010form1/w_VEND_CD=,_AF0020010form1/w_WS_NAME=,_AF0020010form1/w_VEND_NAME=,_AF0020010form1/w_OPR_INST_CD=,_AF0020010form1/w_PUCH_ODR_CD=@*2"
expj.AF0020010.AF0020010form1.w_CHOICE_1.child1 = function () {
  console.log('w_CHOICE_1 script4');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_NAME', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_NAME', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_OPR_INST_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_PUCH_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_AF0020010form1/w_WS_CD,_AF0020010form1/PeekerWWsCd,_AF0020010form1/w_VEND_CD,_AF0020010form1/PeekerWVendCd,_AF0020010form1/w_OPR_INST_CD,_AF0020010form1/PeekerWOprInstCd,_AF0020010form1/w_PUCH_ODR_CD"
expj.AF0020010.AF0020010form1.w_CHOICE_1.child2 = function () {
  console.log('w_CHOICE_1 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWWsCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWVendCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_OPR_INST_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWOprInstCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_PUCH_ODR_CD');
};
expj.AF0020010.AF0020010form1.w_CHOICE_1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.w_CHOICE_1['onClick' + i])) {
        expj.AF0020010.AF0020010form1.w_CHOICE_1['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010form1.w_CHOICE_1.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_CHOICE_1.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_CHOICE_1.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_CHOICE_1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010form1', 'w_CHOICE_1', this, 'RadioButton');
    }
  });
  expj.AF0020010.AF0020010form1.w_CHOICE_1.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_CHOICE_1.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_CHOICE_1.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_CHOICE_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.w_CHOICE_1['onLoad' + i])) {
      expj.AF0020010.AF0020010form1.w_CHOICE_1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="radio" data-name="w_CHOICE_1" value="true" <%= ("true".equals(TypeConverter.convert(aAF0020010Struct.getw_CHOICE_1())))?"checked=\"checked\"":"" %> class="" id="expj-AF0020010-AF0020010form1-w_CHOICE_1" ><label for="expj-AF0020010-AF0020010form1-w_CHOICE_1"><%=CoreTools.getRBString("Expj.Cmt0507",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_PUCH_ODR_CD">
expj.AF0020010.AF0020010form1.w_PUCH_ODR_CD = {};
expj.AF0020010.AF0020010form1.w_PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_PUCH_ODR_CD.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'w_PUCH_ODR_CD', this);
  });
  expj.AF0020010.AF0020010form1.w_PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0020010-AF0020010form1-w_PUCH_ODR_CD" name="w_PUCH_ODR_CD" class="AF0020010-focus-move  required-value expj-AF0020010-required-E" style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getw_PUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_CHOICE_5">
expj.AF0020010.AF0020010form1.w_CHOICE_5 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AF0020010.AF0020010form1.w_CHOICE_5.onLoad0 = function () {
  console.log('w_CHOICE_5 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.AF0020010.AF0020010form1.w_CHOICE_5.onClick0 = function () {
  console.log('w_CHOICE_5 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_AF0020010form1/w_PUCH_ODR_CD@*1"
expj.AF0020010.AF0020010form1.w_CHOICE_5.child0 = function () {
  console.log('w_CHOICE_5 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_PUCH_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;SET;_AF0020010form1/w_WS_CD=,_AF0020010form1/w_VEND_CD=,_AF0020010form1/w_WS_NAME=,_AF0020010form1/w_VEND_NAME=,_AF0020010form1/w_OPR_INST_CD=,_AF0020010form1/w_ISSUE_INST_CD=@*2"
expj.AF0020010.AF0020010form1.w_CHOICE_5.child1 = function () {
  console.log('w_CHOICE_5 script4');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_NAME', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_NAME', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_OPR_INST_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_INST_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_AF0020010form1/w_WS_CD,_AF0020010form1/PeekerWWsCd,_AF0020010form1/w_VEND_CD,_AF0020010form1/PeekerWVendCd,_AF0020010form1/w_OPR_INST_CD,_AF0020010form1/PeekerWOprInstCd,_AF0020010form1/w_ISSUE_INST_CD"
expj.AF0020010.AF0020010form1.w_CHOICE_5.child2 = function () {
  console.log('w_CHOICE_5 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWWsCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWVendCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_OPR_INST_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWOprInstCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_INST_CD');
};
expj.AF0020010.AF0020010form1.w_CHOICE_5.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.w_CHOICE_5['onClick' + i])) {
        expj.AF0020010.AF0020010form1.w_CHOICE_5['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010form1.w_CHOICE_5.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_CHOICE_5.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_CHOICE_5.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_CHOICE_5').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010form1', 'w_CHOICE_5', this, 'RadioButton');
    }
  });
  expj.AF0020010.AF0020010form1.w_CHOICE_5.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_CHOICE_5.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_CHOICE_5.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_CHOICE_5');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.w_CHOICE_5['onLoad' + i])) {
      expj.AF0020010.AF0020010form1.w_CHOICE_5['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="radio" data-name="w_CHOICE_5" value="true" <%= ("true".equals(TypeConverter.convert(aAF0020010Struct.getw_CHOICE_5())))?"checked=\"checked\"":"" %> class="" id="expj-AF0020010-AF0020010form1-w_CHOICE_5" ><label for="expj-AF0020010-AF0020010form1-w_CHOICE_5"><%=CoreTools.getRBString("Expj.Cmt0504",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_WS_CD">
expj.AF0020010.AF0020010form1.w_WS_CD = {};
expj.AF0020010.AF0020010form1.w_WS_CD.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_WS_CD.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_WS_CD.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'w_WS_CD', this);
  });
  expj.AF0020010.AF0020010form1.w_WS_CD.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_WS_CD.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0020010-AF0020010form1-w_WS_CD" name="w_WS_CD" class="AF0020010-focus-move  required-value expj-AF0020010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getw_WS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-PeekerWWsCd">
expj.AF0020010.AF0020010form1.PeekerWWsCd = {};
// script1="onClick;0;PEEKER;_AF0020010form1/w_WS_CD@<%=contextNo%>"
expj.AF0020010.AF0020010form1.PeekerWWsCd.onClick0 = function () {
  console.log('PeekerWWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0020010';
var parameterValues = 'PeekerWWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0020010', 'PeekerWWsCd', 'SQLPARAM_1', '<%=aAF0020010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0020010form1/w_WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0020010.AF0020010form1.PeekerWWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.PeekerWWsCd['onClick' + i])) {
        expj.AF0020010.AF0020010form1.PeekerWWsCd['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010form1.PeekerWWsCd.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010form1.PeekerWWsCd.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-PeekerWWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010form1', 'PeekerWWsCd', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010form1.PeekerWWsCd.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.PeekerWWsCd.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/PeekerWWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-PeekerWWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0020010-AF0020010form1-PeekerWWsCd" class="AF0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_WS_NAME">
expj.AF0020010.AF0020010form1.w_WS_NAME = {};
expj.AF0020010.AF0020010form1.w_WS_NAME.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_WS_NAME.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_WS_NAME.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'w_WS_NAME', this);
  });
  expj.AF0020010.AF0020010form1.w_WS_NAME.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0020010-AF0020010form1-w_WS_NAME" name="w_WS_NAME" class="AF0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getw_WS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_CHOICE_2">
expj.AF0020010.AF0020010form1.w_CHOICE_2 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AF0020010.AF0020010form1.w_CHOICE_2.onLoad0 = function () {
  console.log('w_CHOICE_2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.AF0020010.AF0020010form1.w_CHOICE_2.onClick0 = function () {
  console.log('w_CHOICE_2 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_AF0020010form1/w_WS_CD,_AF0020010form1/PeekerWWsCd@*1"
expj.AF0020010.AF0020010form1.w_CHOICE_2.child0 = function () {
  console.log('w_CHOICE_2 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWWsCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;SET;_AF0020010form1/w_ISSUE_INST_CD=,_AF0020010form1/w_VEND_CD=,_AF0020010form1/w_VEND_NAME=,_AF0020010form1/w_OPR_INST_CD=,_AF0020010form1/w_PUCH_ODR_CD=@*2"
expj.AF0020010.AF0020010form1.w_CHOICE_2.child1 = function () {
  console.log('w_CHOICE_2 script4');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_INST_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_NAME', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_OPR_INST_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_PUCH_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_AF0020010form1/w_ISSUE_INST_CD,_AF0020010form1/w_VEND_CD,_AF0020010form1/PeekerWVendCd,_AF0020010form1/w_OPR_INST_CD,_AF0020010form1/PeekerWOprInstCd,_AF0020010form1/w_PUCH_ODR_CD"
expj.AF0020010.AF0020010form1.w_CHOICE_2.child2 = function () {
  console.log('w_CHOICE_2 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_INST_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWVendCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_OPR_INST_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWOprInstCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_PUCH_ODR_CD');
};
expj.AF0020010.AF0020010form1.w_CHOICE_2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.w_CHOICE_2['onClick' + i])) {
        expj.AF0020010.AF0020010form1.w_CHOICE_2['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010form1.w_CHOICE_2.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_CHOICE_2.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_CHOICE_2.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_CHOICE_2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010form1', 'w_CHOICE_2', this, 'RadioButton');
    }
  });
  expj.AF0020010.AF0020010form1.w_CHOICE_2.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_CHOICE_2.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_CHOICE_2.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_CHOICE_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.w_CHOICE_2['onLoad' + i])) {
      expj.AF0020010.AF0020010form1.w_CHOICE_2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="radio" data-name="w_CHOICE_2" value="true" <%= ("true".equals(TypeConverter.convert(aAF0020010Struct.getw_CHOICE_2())))?"checked=\"checked\"":"" %> class="" id="expj-AF0020010-AF0020010form1-w_CHOICE_2" ><label for="expj-AF0020010-AF0020010form1-w_CHOICE_2"><%=CoreTools.getRBString("Expj.Cmt0508",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_VEND_CD">
expj.AF0020010.AF0020010form1.w_VEND_CD = {};
expj.AF0020010.AF0020010form1.w_VEND_CD.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_VEND_CD.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_VEND_CD.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'w_VEND_CD', this);
  });
  expj.AF0020010.AF0020010form1.w_VEND_CD.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0020010-AF0020010form1-w_VEND_CD" name="w_VEND_CD" class="AF0020010-focus-move  required-value expj-AF0020010-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getw_VEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-PeekerWVendCd">
expj.AF0020010.AF0020010form1.PeekerWVendCd = {};
// script1="onClick;0;PEEKER;_AF0020010form1/w_VEND_CD@<%=contextNo%>"
expj.AF0020010.AF0020010form1.PeekerWVendCd.onClick0 = function () {
  console.log('PeekerWVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0020010';
var parameterValues = 'PeekerWVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AF0020010form1/w_VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0020010.AF0020010form1.PeekerWVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.PeekerWVendCd['onClick' + i])) {
        expj.AF0020010.AF0020010form1.PeekerWVendCd['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010form1.PeekerWVendCd.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010form1.PeekerWVendCd.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-PeekerWVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010form1', 'PeekerWVendCd', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010form1.PeekerWVendCd.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.PeekerWVendCd.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/PeekerWVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-PeekerWVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0020010-AF0020010form1-PeekerWVendCd" class="AF0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_VEND_NAME">
expj.AF0020010.AF0020010form1.w_VEND_NAME = {};
expj.AF0020010.AF0020010form1.w_VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_VEND_NAME.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_VEND_NAME.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'w_VEND_NAME', this);
  });
  expj.AF0020010.AF0020010form1.w_VEND_NAME.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0020010-AF0020010form1-w_VEND_NAME" name="w_VEND_NAME" class="AF0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getw_VEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_CHOICE_3">
expj.AF0020010.AF0020010form1.w_CHOICE_3 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AF0020010.AF0020010form1.w_CHOICE_3.onLoad0 = function () {
  console.log('w_CHOICE_3 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.AF0020010.AF0020010form1.w_CHOICE_3.onClick0 = function () {
  console.log('w_CHOICE_3 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_AF0020010form1/w_VEND_CD,_AF0020010form1/PeekerWVendCd@*1"
expj.AF0020010.AF0020010form1.w_CHOICE_3.child0 = function () {
  console.log('w_CHOICE_3 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWVendCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;SET;_AF0020010form1/w_WS_CD=,_AF0020010form1/w_ISSUE_INST_CD=,_AF0020010form1/w_WS_NAME=,_AF0020010form1/w_OPR_INST_CD=,_AF0020010form1/w_PUCH_ODR_CD=@*2"
expj.AF0020010.AF0020010form1.w_CHOICE_3.child1 = function () {
  console.log('w_CHOICE_3 script4');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_INST_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_NAME', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_OPR_INST_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_PUCH_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_AF0020010form1/w_WS_CD,_AF0020010form1/PeekerWWsCd,_AF0020010form1/w_ISSUE_INST_CD,_AF0020010form1/w_OPR_INST_CD,_AF0020010form1/PeekerWOprInstCd,_AF0020010form1/w_PUCH_ODR_CD"
expj.AF0020010.AF0020010form1.w_CHOICE_3.child2 = function () {
  console.log('w_CHOICE_3 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWWsCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_INST_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_OPR_INST_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWOprInstCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_PUCH_ODR_CD');
};
expj.AF0020010.AF0020010form1.w_CHOICE_3.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.w_CHOICE_3['onClick' + i])) {
        expj.AF0020010.AF0020010form1.w_CHOICE_3['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010form1.w_CHOICE_3.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_CHOICE_3.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_CHOICE_3.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_CHOICE_3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010form1', 'w_CHOICE_3', this, 'RadioButton');
    }
  });
  expj.AF0020010.AF0020010form1.w_CHOICE_3.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_CHOICE_3.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_CHOICE_3.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_CHOICE_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.w_CHOICE_3['onLoad' + i])) {
      expj.AF0020010.AF0020010form1.w_CHOICE_3['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="radio" data-name="w_CHOICE_3" value="true" <%= ("true".equals(TypeConverter.convert(aAF0020010Struct.getw_CHOICE_3())))?"checked=\"checked\"":"" %> class="" id="expj-AF0020010-AF0020010form1-w_CHOICE_3" ><label for="expj-AF0020010-AF0020010form1-w_CHOICE_3"><%=CoreTools.getRBString("Expj.Cmt0509",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_CD",rb)%></span><!-- 作業指示番号 --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_OPR_INST_CD">
expj.AF0020010.AF0020010form1.w_OPR_INST_CD = {};
expj.AF0020010.AF0020010form1.w_OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_OPR_INST_CD.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'w_OPR_INST_CD', this);
  });
  expj.AF0020010.AF0020010form1.w_OPR_INST_CD.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0020010-AF0020010form1-w_OPR_INST_CD" name="w_OPR_INST_CD" class="AF0020010-focus-move  required-value expj-AF0020010-required-D" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getw_OPR_INST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-PeekerWOprInstCd">
expj.AF0020010.AF0020010form1.PeekerWOprInstCd = {};
// script1="onClick;0;PEEKER;_AF0020010form1/w_OPR_INST_CD@<%=contextNo%>"
expj.AF0020010.AF0020010form1.PeekerWOprInstCd.onClick0 = function () {
  console.log('PeekerWOprInstCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0020010';
var parameterValues = 'PeekerWOprInstCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_OPR_INST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%OPR_INST_CD_05%&%';
parameterValues += 'TARGET_FIELD%=%_AF0020010form1/w_OPR_INST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0020010.AF0020010form1.PeekerWOprInstCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.PeekerWOprInstCd['onClick' + i])) {
        expj.AF0020010.AF0020010form1.PeekerWOprInstCd['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010form1.PeekerWOprInstCd.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010form1.PeekerWOprInstCd.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-PeekerWOprInstCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010form1', 'PeekerWOprInstCd', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010form1.PeekerWOprInstCd.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.PeekerWOprInstCd.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/PeekerWOprInstCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-PeekerWOprInstCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0020010-AF0020010form1-PeekerWOprInstCd" class="AF0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_CHOICE_4">
expj.AF0020010.AF0020010form1.w_CHOICE_4 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AF0020010.AF0020010form1.w_CHOICE_4.onLoad0 = function () {
  console.log('w_CHOICE_4 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0"
expj.AF0020010.AF0020010form1.w_CHOICE_4.onClick0 = function () {
  console.log('w_CHOICE_4 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;UNMASK;_AF0020010form1/w_OPR_INST_CD,_AF0020010form1/PeekerWOprInstCd@*1"
expj.AF0020010.AF0020010form1.w_CHOICE_4.child0 = function () {
  console.log('w_CHOICE_4 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_OPR_INST_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWOprInstCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;SET;_AF0020010form1/w_WS_CD=,_AF0020010form1/w_ISSUE_INST_CD=,_AF0020010form1/w_WS_NAME,_AF0020010form1/w_VEND_CD=,_AF0020010form1/w_VEND_NAME=,_AF0020010form1/w_PUCH_ODR_CD=@*2"
expj.AF0020010.AF0020010form1.w_CHOICE_4.child1 = function () {
  console.log('w_CHOICE_4 script4');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_INST_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_NAME', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_NAME', '');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010form1', '_AF0020010form1/w_PUCH_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_AF0020010form1/w_WS_CD,_AF0020010form1/PeekerWWsCd,_AF0020010form1/w_ISSUE_INST_CD,_AF0020010form1/w_VEND_CD,_AF0020010form1/PeekerWVendCd,_AF0020010form1/w_PUCH_ODR_CD"
expj.AF0020010.AF0020010form1.w_CHOICE_4.child2 = function () {
  console.log('w_CHOICE_4 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_WS_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWWsCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_ISSUE_INST_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_VEND_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/PeekerWVendCd');
expj.common.pscript.setMaskToReferenceComponent('AF0020010', 'AF0020010form1', '_AF0020010form1/w_PUCH_ODR_CD');
};
expj.AF0020010.AF0020010form1.w_CHOICE_4.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.w_CHOICE_4['onClick' + i])) {
        expj.AF0020010.AF0020010form1.w_CHOICE_4['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010form1.w_CHOICE_4.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_CHOICE_4.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_CHOICE_4.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_CHOICE_4').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010form1', 'w_CHOICE_4', this, 'RadioButton');
    }
  });
  expj.AF0020010.AF0020010form1.w_CHOICE_4.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_CHOICE_4.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_CHOICE_4.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_CHOICE_4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0020010.AF0020010form1.w_CHOICE_4['onLoad' + i])) {
      expj.AF0020010.AF0020010form1.w_CHOICE_4['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="radio" data-name="w_CHOICE_4" value="true" <%= ("true".equals(TypeConverter.convert(aAF0020010Struct.getw_CHOICE_4())))?"checked=\"checked\"":"" %> class="" id="expj-AF0020010-AF0020010form1-w_CHOICE_4" ><label for="expj-AF0020010-AF0020010form1-w_CHOICE_4"><%=CoreTools.getRBString("Expj.Cmt0506",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_CMPLT_FLG",rb)%></span><!-- 出庫完了フラグ --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_ISSUE_CMPLT_FLG">
expj.AF0020010.AF0020010form1.w_ISSUE_CMPLT_FLG = {};
expj.AF0020010.AF0020010form1.w_ISSUE_CMPLT_FLG.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_ISSUE_CMPLT_FLG.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_ISSUE_CMPLT_FLG.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_ISSUE_CMPLT_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0020010', 'AF0020010form1', 'w_ISSUE_CMPLT_FLG', this);
  });
  expj.AF0020010.AF0020010form1.w_ISSUE_CMPLT_FLG.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_ISSUE_CMPLT_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_ISSUE_CMPLT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_ISSUE_CMPLT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0020010-AF0020010form1-w_ISSUE_CMPLT_FLG" name='w_ISSUE_CMPLT_FLG' class='AF0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0020010Control.getStruct().getList_w_ISSUE_CMPLT_FLG_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0020010Control.getStruct().getList_w_ISSUE_CMPLT_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0020010Control.getStruct().getList_w_ISSUE_CMPLT_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0020010Struct.getw_ISSUE_CMPLT_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-AF0020010-AF0020010form1-THIS_MONTH" name="THIS_MONTH" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getTHIS_MONTH()) %>">
<script class="expj-script-AF0020010-AF0020010form1-THIS_MONTH">
expj.AF0020010.AF0020010form1.THIS_MONTH = {};
expj.AF0020010.AF0020010form1.THIS_MONTH.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/THIS_MONTH.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.THIS_MONTH.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-THIS_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'THIS_MONTH', this);
  });
  expj.AF0020010.AF0020010form1.THIS_MONTH.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.THIS_MONTH.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/THIS_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-THIS_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0020010-AF0020010form1-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-AF0020010-AF0020010form1-BUSINESS_OPR_DATE">
expj.AF0020010.AF0020010form1.BUSINESS_OPR_DATE = {};
expj.AF0020010.AF0020010form1.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/BUSINESS_OPR_DATE.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'BUSINESS_OPR_DATE', this);
  });
  expj.AF0020010.AF0020010form1.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0020010-AF0020010form1-INSTALL_FLG" name="INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getINSTALL_FLG()) %>">
<script class="expj-script-AF0020010-AF0020010form1-INSTALL_FLG">
expj.AF0020010.AF0020010form1.INSTALL_FLG = {};
expj.AF0020010.AF0020010form1.INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/INSTALL_FLG.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.INSTALL_FLG.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'INSTALL_FLG', this);
  });
  expj.AF0020010.AF0020010form1.INSTALL_FLG.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0020010-AF0020010form1-w_CHOICE" name="w_CHOICE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0020010Struct.getw_CHOICE()) %>">
<script class="expj-script-AF0020010-AF0020010form1-w_CHOICE">
expj.AF0020010.AF0020010form1.w_CHOICE = {};
expj.AF0020010.AF0020010form1.w_CHOICE.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_CHOICE.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_CHOICE.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_CHOICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'w_CHOICE', this);
  });
  expj.AF0020010.AF0020010form1.w_CHOICE.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_CHOICE.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_CHOICE.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_CHOICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOT_CTRL_FLG",rb)%></span><!-- ロット管理フラグ --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010form1-w_LOT_CTRL_FLG">
expj.AF0020010.AF0020010form1.w_LOT_CTRL_FLG = {};
expj.AF0020010.AF0020010form1.w_LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/w_LOT_CTRL_FLG.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.w_LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-w_LOT_CTRL_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0020010', 'AF0020010form1', 'w_LOT_CTRL_FLG', this);
  });
  expj.AF0020010.AF0020010form1.w_LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.w_LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/w_LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-w_LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0020010-AF0020010form1-w_LOT_CTRL_FLG" name='w_LOT_CTRL_FLG' class='AF0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0020010Control.getStruct().getList_w_LOT_CTRL_FLG_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0020010Control.getStruct().getList_w_LOT_CTRL_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0020010Control.getStruct().getList_w_LOT_CTRL_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0020010Struct.getw_LOT_CTRL_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-AF0020010-AF0020010form1-h_SYS_LOT_CTRL_FLG" name="h_SYS_LOT_CTRL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0020010Struct.geth_SYS_LOT_CTRL_FLG()) %>">
<script class="expj-script-AF0020010-AF0020010form1-h_SYS_LOT_CTRL_FLG">
expj.AF0020010.AF0020010form1.h_SYS_LOT_CTRL_FLG = {};
expj.AF0020010.AF0020010form1.h_SYS_LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AF0020010form1/h_SYS_LOT_CTRL_FLG.onDecision');
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
  expj.AF0020010.executeAllOnDecision();
};
expj.AF0020010.AF0020010form1.h_SYS_LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010form1-h_SYS_LOT_CTRL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0020010', 'AF0020010form1', 'h_SYS_LOT_CTRL_FLG', this);
  });
  expj.AF0020010.AF0020010form1.h_SYS_LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AF0020010.AF0020010form1.h_SYS_LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0020010form1/h_SYS_LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010form1-h_SYS_LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0020010-AF0020010button1">
expj.AF0020010.AF0020010button1 = {};
expj.AF0020010.AF0020010button1.executeAllOnDecision = function () {
  console.log('execute AF0020010button1.onDecision');
};
expj.AF0020010.AF0020010button1.executeOnLoad = function () {
  expj.AF0020010.AF0020010button1.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button1.executePScriptOnLoad = function () {
  console.log('execute AF0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0020010-AF0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0020010-AF0020010button1-select">
expj.AF0020010.AF0020010button1.select = {};
// script1="onClick;0;CHK;_AF0020010form1/w_CHOICE_1[eq]true@*0"
expj.AF0020010.AF0020010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010button1', '_AF0020010form1/w_CHOICE_1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_AF0020010form1/w_CHOICE_2[eq]true@*1"
expj.AF0020010.AF0020010button1.select.onClick1 = function () {
  console.log('select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010button1', '_AF0020010form1/w_CHOICE_2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_AF0020010form1/w_CHOICE_3[eq]true@*2"
expj.AF0020010.AF0020010button1.select.onClick2 = function () {
  console.log('select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010button1', '_AF0020010form1/w_CHOICE_3'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onClick;3;CHK;_AF0020010form1/w_CHOICE_4[eq]true@*3"
expj.AF0020010.AF0020010button1.select.onClick3 = function () {
  console.log('select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010button1', '_AF0020010form1/w_CHOICE_4'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onClick;4;CHK;_AF0020010form1/w_CHOICE_5[eq]true@*4"
expj.AF0020010.AF0020010button1.select.onClick4 = function () {
  console.log('select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010button1', '_AF0020010form1/w_CHOICE_5'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onClick;5;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0020010form1/*@AF0020010Servlet"
expj.AF0020010.AF0020010button1.select.onClick5 = function () {
  console.log('select script6');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0020010', 'AF0020010button1', '_AF0020010form1/*', 'AF0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0020010', response);
expj.common.updateBusinessScreenTab('AF0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script7="child;0;SET;_AF0020010form1/w_CHOICE=0"
expj.AF0020010.AF0020010button1.select.child0 = function () {
  console.log('select script7');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010button1', '_AF0020010form1/w_CHOICE', '0');
};
// script8="child;1;SET;_AF0020010form1/w_CHOICE=1"
expj.AF0020010.AF0020010button1.select.child1 = function () {
  console.log('select script8');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010button1', '_AF0020010form1/w_CHOICE', '1');
};
// script9="child;2;SET;_AF0020010form1/w_CHOICE=2"
expj.AF0020010.AF0020010button1.select.child2 = function () {
  console.log('select script9');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010button1', '_AF0020010form1/w_CHOICE', '2');
};
// script10="child;3;SET;_AF0020010form1/w_CHOICE=3"
expj.AF0020010.AF0020010button1.select.child3 = function () {
  console.log('select script10');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010button1', '_AF0020010form1/w_CHOICE', '3');
};
// script11="child;4;SET;_AF0020010form1/w_CHOICE=4"
expj.AF0020010.AF0020010button1.select.child4 = function () {
  console.log('select script11');
expj.common.pscript.setReferenceComponentValue('AF0020010', 'AF0020010button1', '_AF0020010form1/w_CHOICE', '4');
};
expj.AF0020010.AF0020010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010button1.select['onClick' + i])) {
        expj.AF0020010.AF0020010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010button1.select.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010button1.select.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010button1', 'select', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010button1.select.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button1.select.executePScriptOnLoad = function () {
  console.log('execute AF0020010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0020010-AF0020010button1-select" name="select" class="AF0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AF0020010-AF0020010view1">
expj.AF0020010.AF0020010view1 = {};
expj.AF0020010.AF0020010view1.executeAllOnClick = function () {
};
expj.AF0020010.AF0020010view1.executeAllOnDecision = function () {
  console.log('execute AF0020010view1.onDecision');
};
expj.AF0020010.AF0020010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AF0020010view1", "expj.AF0020010.AF0020010view1.executeAllOnClick");
%>
  expj.AF0020010.AF0020010view1.executePScriptOnLoad();
};

expj.AF0020010.AF0020010view1.executePScriptOnLoad = function () {
  console.log('execute AF0020010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AF0020010-AF0020010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AF0020010view1_Id = "AF0020010view1";
 String AF0020010view1_select = "single";
 String AF0020010view1_sortable = "true";
 String AF0020010view1_resize = "true";
 String AF0020010view1_scroll = "true";
 StringBuffer AF0020010view1_HB = new StringBuffer();
 StringBuffer AF0020010view1_DB = new StringBuffer();
%>
<%
 AF0020010view1_select = "multi";
 AF0020010view1_sortable = "true";
 AF0020010view1_resize = "true";
 AF0020010view1_scroll = "true";
%>
<%
 AF0020010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
%>
     
<%
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_CD",rb))).append("', 'name':'ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_QTY",rb))).append("', 'name':'ISSUE_INST_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY",rb))).append("', 'name':'TOTAL_ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_QTY_1",rb))).append("', 'name':'w_SHIP_REMAIN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SCDL_ISSUE_DATE",rb))).append("', 'name':'SCDL_ISSUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_CMPLT_DATE",rb))).append("', 'name':'ISSUE_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ISSUE_CMPLT_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD_1",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME_2",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'CONS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONS_TYP",rb))).append("', 'name':'CONS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'JOB_ODR_DETAIL_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_CD",rb))).append("', 'name':'OPR_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OPR_INST_CD_item', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OPR_INST_CD_proc', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_NAME",rb))).append("', 'name':'WS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_CD",rb))).append("', 'name':'WORK_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb))).append("', 'name':'WORK_IN_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NAME",rb))).append("', 'name':'PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'COMPANY_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'VEND_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
AF0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0020010view1_sortable).append("}").append(",");
%>
<%
 int aAF0020010StructLength = aAF0020010Control.getListsize();
 final AF0020010Struct structBackup = aAF0020010Struct;
 aAF0020010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAF0020010StructLength; ++loopCount) {
  if((aAF0020010Struct = (AF0020010Struct) aAF0020010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAF0020010Struct", aAF0020010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AF0020010view1_DB.append("[");
 AF0020010view1_DB.append(loopCount);
 AF0020010view1_DB.append(",''");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-ISSUE_INST_CD\" data-name=\"ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getISSUE_INST_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getITEM_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getITEM_NAME())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-UNIT_QTY_TYP\" data-name=\"UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getUNIT_QTY_TYP())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-ISSUE_INST_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-ISSUE_INST_QTY\" data-name=\"ISSUE_INST_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0020010Struct.getISSUE_INST_QTY())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-TOTAL_ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-TOTAL_ISSUE_QTY\" data-name=\"TOTAL_ISSUE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0020010Struct.getTOTAL_ISSUE_QTY())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-w_SHIP_REMAIN_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-w_SHIP_REMAIN_QTY\" data-name=\"w_SHIP_REMAIN_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0020010Struct.getw_SHIP_REMAIN_QTY())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-SCDL_ISSUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-SCDL_ISSUE_DATE\" data-name=\"SCDL_ISSUE_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAF0020010Struct.getSCDL_ISSUE_DATE())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-ISSUE_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-ISSUE_CMPLT_DATE\" data-name=\"ISSUE_CMPLT_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAF0020010Struct.getISSUE_CMPLT_DATE())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-ISSUE_CMPLT_FLG-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-ISSUE_CMPLT_FLG\" data-name=\"ISSUE_CMPLT_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getISSUE_CMPLT_FLG())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getWH_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getWH_NAME())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-CONS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-CONS_TYP\" data-name=\"CONS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getCONS_TYP())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-CONS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-CONS_NAME\" data-name=\"CONS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getCONS_NAME())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getJOB_ODR_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-JOB_ODR_DETAIL_NO-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-JOB_ODR_DETAIL_NO\" data-name=\"JOB_ODR_DETAIL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getJOB_ODR_DETAIL_NO())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-OPR_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-OPR_INST_CD\" data-name=\"OPR_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getOPR_INST_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-OPR_INST_CD_item-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-OPR_INST_CD_item\" data-name=\"OPR_INST_CD_item\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getOPR_INST_CD_item())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-OPR_INST_CD_proc-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-OPR_INST_CD_proc\" data-name=\"OPR_INST_CD_proc\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getOPR_INST_CD_proc())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-WS_CD\" data-name=\"WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getWS_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-WS_NAME\" data-name=\"WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getWS_NAME())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-WORK_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-WORK_ODR_CD\" data-name=\"WORK_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getWORK_ODR_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-WORK_IN_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-WORK_IN_PROC_CD\" data-name=\"WORK_IN_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getWORK_IN_PROC_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-PROC_NAME\" data-name=\"PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getPROC_NAME())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-PUCH_ODR_CD\" data-name=\"PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getPUCH_ODR_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-COMPANY_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-COMPANY_CD\" data-name=\"COMPANY_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getCOMPANY_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-OD_NO\" data-name=\"OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getOD_NO())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-MRP_ODR_TYP\" data-name=\"MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getMRP_ODR_TYP())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getVEND_CD())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-VEND_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-VEND_NAME\" data-name=\"VEND_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getVEND_NAME())).append("</span>'");
 AF0020010view1_DB.append(",").append("'<span id=\"expj-AF0020010-AF0020010view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AF0020010-AF0020010view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0020010Struct.getMODIFY_COUNT())).append("</span>'");
 AF0020010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAF0020010StructLength) {
   AF0020010view1_DB.append(",");
  }
 }
 aAF0020010Struct = structBackup;
 viewIdList.add(AF0020010view1_Id);
 viewSelectList.add(AF0020010view1_select);
 viewResizeList.add(AF0020010view1_resize);
 viewScrollList.add(AF0020010view1_scroll);
 viewHeaderDataList.add(AF0020010view1_HB);
 viewBodyDataList.add(AF0020010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:525px;"><script class="expj-script-AF0020010-AF0020010button2">
expj.AF0020010.AF0020010button2 = {};
expj.AF0020010.AF0020010button2.executeAllOnDecision = function () {
  console.log('execute AF0020010button2.onDecision');
};
expj.AF0020010.AF0020010button2.executeOnLoad = function () {
  expj.AF0020010.AF0020010button2.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button2.executePScriptOnLoad = function () {
  console.log('execute AF0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0020010-AF0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:525px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0020010-AF0020010button2-insert">
expj.AF0020010.AF0020010button2.insert = {};
// script1="onClick;0;CHK;_AF0020010form1/INSTALL_FLG[eq]1@*0"
expj.AF0020010.AF0020010button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010button2', '_AF0020010form1/INSTALL_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0020010form1/*,_AF0020010view1/+@AF0020010Servlet,,$ZZ07001"
expj.AF0020010.AF0020010button2.insert.onClick1 = function () {
  console.log('insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0020010', 'AF0020010button2', '_AF0020010form1/*,_AF0020010view1/+', 'AF0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0020010', response);
expj.common.updateBusinessScreenTab('AF0020010', contents);
};
expj.common.pscript.callConfirm('AF0020010', 'AF0020010button2', 'ZZ07001', okEvent);
};
// script3="child;0;SELCHKT;AF0020010view1:_CONS_TYP[eq]1@*1"
expj.AF0020010.AF0020010button2.insert.child0 = function () {
  console.log('insert script3');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AF0020010', 'AF0020010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.CONS_TYP, '[eq]', '1')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;_AF0020010form1/THIS_MONTH[neq]@*2,!AF00142"
expj.AF0020010.AF0020010button2.insert.child1 = function () {
  console.log('insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010button2', '_AF0020010form1/THIS_MONTH'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
expj.common.pscript.viewErrorMessage('AF0020010', 'AF0020010button2', 'AF00142');
}
};
// script5="child;2;CHK;_AF0020010form1/THIS_MONTH[gt]~TO_YYYY_MM(_AF0020010form1/BUSINESS_OPR_DATE)@$AF00143"
expj.AF0020010.AF0020010button2.insert.child2 = function () {
  console.log('insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0020010', 'AF0020010button2', '_AF0020010form1/THIS_MONTH')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('AF0020010', 'AF0020010button2', '_AF0020010form1/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AF0020010', 'AF0020010button2', 'AF00143');
}
};
expj.AF0020010.AF0020010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010button2.insert['onClick' + i])) {
        expj.AF0020010.AF0020010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010button2.insert.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010button2.insert.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010button2', 'insert', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010button2.insert.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button2.insert.executePScriptOnLoad = function () {
  console.log('execute AF0020010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0020010-AF0020010button2-insert" name="insert" class="AF0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsertAssort",rb)%></button><!-- 選択登録ボタン --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010button2-CmpltCancel">
expj.AF0020010.AF0020010button2.CmpltCancel = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0020010form1/*,_AF0020010view1/+@AF0020010Servlet,,$ZZ07001"
expj.AF0020010.AF0020010button2.CmpltCancel.onClick0 = function () {
  console.log('CmpltCancel script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0020010', 'AF0020010button2', '_AF0020010form1/*,_AF0020010view1/+', 'AF0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0020010', response);
expj.common.updateBusinessScreenTab('AF0020010', contents);
};
expj.common.pscript.callConfirm('AF0020010', 'AF0020010button2', 'ZZ07001', okEvent);
};
expj.AF0020010.AF0020010button2.CmpltCancel.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010button2.CmpltCancel['onClick' + i])) {
        expj.AF0020010.AF0020010button2.CmpltCancel['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010button2.CmpltCancel.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010button2.CmpltCancel.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010button2-CmpltCancel').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010button2', 'CmpltCancel', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010button2.CmpltCancel.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button2.CmpltCancel.executePScriptOnLoad = function () {
  console.log('execute AF0020010button2/CmpltCancel.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010button2-CmpltCancel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0020010-AF0020010button2-CmpltCancel" name="CmpltCancel" class="AF0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.Cmt0495",rb)%></button><!-- 選択完了解除ボタン --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010button2-modify">
expj.AF0020010.AF0020010button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AF0020010form1/*,_AF0020010view1/+@AF0020010Servlet"
expj.AF0020010.AF0020010button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0020010', 'AF0020010button2', '_AF0020010form1/*,_AF0020010view1/+', 'AF0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0020010', response);
expj.common.changeBusinessScreenTab('AF0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0020010.AF0020010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010button2.modify['onClick' + i])) {
        expj.AF0020010.AF0020010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010button2.modify.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010button2.modify.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010button2', 'modify', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010button2.modify.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button2.modify.executePScriptOnLoad = function () {
  console.log('execute AF0020010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0020010-AF0020010button2-modify" name="modify" class="AF0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010button2-choiceAll">
expj.AF0020010.AF0020010button2.choiceAll = {};
// script1="onClick;0;DGSALL;AF0020010view1"
expj.AF0020010.AF0020010button2.choiceAll.onClick0 = function () {
  console.log('choiceAll script1');
expj.common.pscript.selectVIEWAllRow('AF0020010', 'AF0020010view1');
};
expj.AF0020010.AF0020010button2.choiceAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010button2.choiceAll['onClick' + i])) {
        expj.AF0020010.AF0020010button2.choiceAll['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010button2.choiceAll.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010button2.choiceAll.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010button2-choiceAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010button2', 'choiceAll', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010button2.choiceAll.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button2.choiceAll.executePScriptOnLoad = function () {
  console.log('execute AF0020010button2/choiceAll.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010button2-choiceAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0020010-AF0020010button2-choiceAll" name="choiceAll" class="AF0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010button2-cancelAll">
expj.AF0020010.AF0020010button2.cancelAll = {};
// script1="onClick;0;DGSCANCEL;AF0020010view1"
expj.AF0020010.AF0020010button2.cancelAll.onClick0 = function () {
  console.log('cancelAll script1');
expj.common.pscript.unselectVIEWAllRow('AF0020010', 'AF0020010view1');
};
expj.AF0020010.AF0020010button2.cancelAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010button2.cancelAll['onClick' + i])) {
        expj.AF0020010.AF0020010button2.cancelAll['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010button2.cancelAll.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010button2.cancelAll.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010button2-cancelAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010button2', 'cancelAll', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010button2.cancelAll.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button2.cancelAll.executePScriptOnLoad = function () {
  console.log('execute AF0020010button2/cancelAll.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010button2-cancelAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0020010-AF0020010button2-cancelAll" name="cancelAll" class="AF0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 504px);"></div><!--/td-->
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
<span class="version">AF0020010 Revision: 1.14  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AF0020010-AF0020010button0">
expj.AF0020010.AF0020010button0 = {};
expj.AF0020010.AF0020010button0.executeAllOnDecision = function () {
  console.log('execute AF0020010button0.onDecision');
};
expj.AF0020010.AF0020010button0.executeOnLoad = function () {
  expj.AF0020010.AF0020010button0.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button0.executePScriptOnLoad = function () {
  console.log('execute AF0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0020010-AF0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0020010-AF0020010button0-clear">
expj.AF0020010.AF0020010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0020010form1/*@AF0020010Servlet,,$ZZ07008"
expj.AF0020010.AF0020010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0020010', 'AF0020010button0', '_AF0020010form1/*', 'AF0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0020010', response);
expj.common.updateBusinessScreenTab('AF0020010', contents);
};
expj.common.pscript.callConfirm('AF0020010', 'AF0020010button0', 'ZZ07008', okEvent);
};
expj.AF0020010.AF0020010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010button0.clear['onClick' + i])) {
        expj.AF0020010.AF0020010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010button0.clear.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010button0.clear.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010button0', 'clear', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010button0.clear.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AF0020010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0020010-AF0020010button0-clear" name="clear" class="AF0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AF0020010-AF0020010button0-close">
expj.AF0020010.AF0020010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AF0020010.AF0020010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AF0020010');
};
expj.AF0020010.AF0020010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0020010.AF0020010button0.close['onClick' + i])) {
        expj.AF0020010.AF0020010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AF0020010.AF0020010button0.close.executeAllOnDecision = function () {
};
expj.AF0020010.AF0020010button0.close.executeOnLoad = function () {
  $('#expj-AF0020010-AF0020010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0020010', 'AF0020010button0', 'close', this, 'Button');
    }
  });
  expj.AF0020010.AF0020010button0.close.executePScriptOnLoad();
};

expj.AF0020010.AF0020010button0.close.executePScriptOnLoad = function () {
  console.log('execute AF0020010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AF0020010-AF0020010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0020010-AF0020010button0-close" name="close" class="AF0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0020010 (END)-->
<%
MessageStruct msgStruct = aAF0020010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0020010)) {
  expj.common.treeInstanceMap.AF0020010 = {};
}
expj.common.treeInstanceMap.AF0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0020010)) {
  expj.common.detailDialogMap.AF0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AF0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0020010)) {
  expj.common.viewInstanceMap.AF0020010 = {};
}
expj.common.viewInstanceMap.AF0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0020010.<%=viewId %>.init = function () {
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
    expj.AF0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0020010_init">
/**
 * AF0020010用のロード完了時初期化関数
 */
expj.AF0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0020010');
  expj.common.calendarInstanceMap.AF0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0020010.AF0020010form1.w_ISSUE_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_CHOICE_1.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_CHOICE_5.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_WS_CD.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.PeekerWWsCd.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_CHOICE_2.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.PeekerWVendCd.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_CHOICE_3.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.PeekerWOprInstCd.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_CHOICE_4.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_ISSUE_CMPLT_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.THIS_MONTH.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_CHOICE.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.w_LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.h_SYS_LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button1.select.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button2.insert.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button2.CmpltCancel.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button2.modify.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button2.choiceAll.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button2.cancelAll.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button0.close.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010form1.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button1.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010view1.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button2.executeOnLoad();}catch(e){};
  try{expj.AF0020010.AF0020010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0020010', 'AF0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0020010', '<%=request.getContextPath() %>');
};

/**
 * AF0020010の全体onDecision処理
 */
expj.AF0020010.executeAllOnDecision = function () {
  expj.AF0020010.AF0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0020010_console">
expj.AF0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>