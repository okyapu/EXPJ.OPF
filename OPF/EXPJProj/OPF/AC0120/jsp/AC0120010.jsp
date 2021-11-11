<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:00:14 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AC0120\AC0120010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0120.*" %>
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
<jsp:useBean id="aAC0120010Control" class="com.nec.jp.orteus.metamorBase.AC0120.AC0120010Control" scope="request"/>
<jsp:useBean id="aAC0120010Struct" class="com.nec.jp.orteus.metamorBase.AC0120.AC0120010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

所要量メンテナンス（製番）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0120/jsp/AC0120010.jsp,v $
$Author: geng-jia $	
$Revision: 1.18 $ $Date: 2017/02/22 02:04:32 $
********************************************************* --%>
<html>
<head>
<title>所要量メンテナンス（製番）</title>
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
<script class="expj-script-AC0120010_init">
  // AC0120010名前空間
  expj.AC0120010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0120010" data-screen="AC0120010" data-newdata="<%=aAC0120010Control.isNewData() %>">
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
              <script class="expj-script-AC0120010-AC0120010form1">
expj.AC0120010.AC0120010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AC0120010.AC0120010form1.onLoad0 = function () {
  console.log('AC0120010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AC0120010.AC0120010form1.onDecision0 = function () {
  console.log('AC0120010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AC0120010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AC0120010button1/Select"
expj.AC0120010.AC0120010form1.child0 = function () {
  console.log('AC0120010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120010form1', '_AC0120010button1/Select');
};
// script4="child;1;MASK;_AC0120010button1/Select"
expj.AC0120010.AC0120010form1.child1 = function () {
  console.log('AC0120010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120010form1', '_AC0120010button1/Select');
};
// script5="onDecision;1;CHK;?AC0120010form1/*[eq]NORMAL@*2,*12"
expj.AC0120010.AC0120010form1.onDecision1 = function () {
  console.log('AC0120010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?AC0120010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script6="child;2;CHK;?JOB_ODR_CD[eq]SAME[and]?JOB_ODR_CANCEL_NO[eq]SAME@*3,*12"
expj.AC0120010.AC0120010form1.child2 = function () {
  console.log('AC0120010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?JOB_ODR_CANCEL_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script7="child;3;CHKRQ;?AC0120010tree1/*[eq]SELECTED@*4,*12"
expj.AC0120010.AC0120010form1.child3 = function () {
  console.log('AC0120010form1 script7');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?AC0120010tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script8="child;4;CHK;_AC0120010tree1/JOB_ODR_STS_TYP[eq]3[or]_AC0120010tree1/JOB_ODR_STS_TYP[eq]4[or]_AC0120010tree1/JOB_ODR_STS_TYP[eq]5@*5,*12"
expj.AC0120010.AC0120010form1.child4 = function () {
  console.log('AC0120010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/JOB_ODR_STS_TYP'), '[eq]', '3') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/JOB_ODR_STS_TYP'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/JOB_ODR_STS_TYP'), '[eq]', '5')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script9="child;5;CHK;_AC0120010tree1/MRP_ODR_TYP[eq]4[or]_AC0120010tree1/MRP_ODR_TYP[eq]5[or]_AC0120010tree1/MRP_ODR_TYP[eq]6[or]_AC0120010tree1/MRP_ODR_TYP[eq]7@*12,*6"
expj.AC0120010.AC0120010form1.child5 = function () {
  console.log('AC0120010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/MRP_ODR_TYP'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/MRP_ODR_TYP'), '[eq]', '5') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/MRP_ODR_TYP'), '[eq]', '7')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;6;CHK;_AC0120010tree1/MRP_TYP[eq]1[or]_AC0120010tree1/MRP_TYP[eq]3@*12,*7"
expj.AC0120010.AC0120010form1.child6 = function () {
  console.log('AC0120010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/MRP_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/MRP_TYP'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;7;CHK;_AC0120010tree1/DM_STS_TYP[eq]9@*12,*8"
expj.AC0120010.AC0120010form1.child7 = function () {
  console.log('AC0120010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/DM_STS_TYP'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;8;CHK;_AC0120010tree1/ODR_STS_TYP[eq]9@*12,*9"
expj.AC0120010.AC0120010form1.child8 = function () {
  console.log('AC0120010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/ODR_STS_TYP'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;9;CHK;_AC0120010tree1/OD_TYP[eq]3@*12,*10"
expj.AC0120010.AC0120010form1.child9 = function () {
  console.log('AC0120010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/OD_TYP'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script14="child;10;CHK;_AC0120010tree1/MANHOUR_TYP[eq]1@*12,*21"
expj.AC0120010.AC0120010form1.child10 = function () {
  console.log('AC0120010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/MANHOUR_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script15="child;11;UNMASK;_AC0120010button2/append"
expj.AC0120010.AC0120010form1.child11 = function () {
  console.log('AC0120010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120010form1', '_AC0120010button2/append');
};
// script16="child;12;MASK;_AC0120010button2/append"
expj.AC0120010.AC0120010form1.child12 = function () {
  console.log('AC0120010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120010form1', '_AC0120010button2/append');
};
// script17="onDecision;2;CHK;?AC0120010form1/*[eq]NORMAL@*13,*20"
expj.AC0120010.AC0120010form1.onDecision2 = function () {
  console.log('AC0120010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?AC0120010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script18="child;13;CHK;?JOB_ODR_CD[eq]SAME[and]?JOB_ODR_CANCEL_NO[eq]SAME@*14,*20"
expj.AC0120010.AC0120010form1.child13 = function () {
  console.log('AC0120010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?JOB_ODR_CANCEL_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script19="child;14;CHKRQ;?AC0120010tree1/*[eq]SELECTED@*15,*20"
expj.AC0120010.AC0120010form1.child14 = function () {
  console.log('AC0120010form1 script19');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?AC0120010tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script20="child;15;CHK;_AC0120010tree1/JOB_ODR_STS_TYP[eq]3[or]_AC0120010tree1/JOB_ODR_STS_TYP[eq]4[or]_AC0120010tree1/JOB_ODR_STS_TYP[eq]5@*16,*20"
expj.AC0120010.AC0120010form1.child15 = function () {
  console.log('AC0120010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/JOB_ODR_STS_TYP'), '[eq]', '3') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/JOB_ODR_STS_TYP'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/JOB_ODR_STS_TYP'), '[eq]', '5')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script21="child;16;CHK;_AC0120010tree1/DM_STS_TYP[eq]9@*20,*17"
expj.AC0120010.AC0120010form1.child16 = function () {
  console.log('AC0120010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/DM_STS_TYP'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script22="child;17;CHK;_AC0120010tree1/ODR_STS_TYP[eq]9@*20,*18"
expj.AC0120010.AC0120010form1.child17 = function () {
  console.log('AC0120010form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/ODR_STS_TYP'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script23="child;18;CHK;_AC0120010tree1/PARENT_OD_NO[eq]@*20,*22"
expj.AC0120010.AC0120010form1.child18 = function () {
  console.log('AC0120010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/PARENT_OD_NO'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script24="child;19;UNMASK;_AC0120010button2/modify"
expj.AC0120010.AC0120010form1.child19 = function () {
  console.log('AC0120010form1 script24');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120010form1', '_AC0120010button2/modify');
};
// script25="child;20;MASK;_AC0120010button2/modify"
expj.AC0120010.AC0120010form1.child20 = function () {
  console.log('AC0120010form1 script25');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120010form1', '_AC0120010button2/modify');
};
// script26="child;21;CHK;_AC0120010tree1/TOTAL_RCV_QTY[neq]0[or]_AC0120010tree1/TOTAL_ISSUE_QTY[neq]0@*12,*11"
expj.AC0120010.AC0120010form1.child21 = function () {
  console.log('AC0120010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/TOTAL_RCV_QTY'), '[neq]', '0') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/TOTAL_ISSUE_QTY'), '[neq]', '0')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script27="child;22;CHK;_AC0120010tree1/TOTAL_RCV_QTY[neq]0[or]_AC0120010tree1/TOTAL_ISSUE_QTY[neq]0@*20,*28"
expj.AC0120010.AC0120010form1.child22 = function () {
  console.log('AC0120010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/TOTAL_RCV_QTY'), '[neq]', '0') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/TOTAL_ISSUE_QTY'), '[neq]', '0')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script28="onDecision;3;CHK;?AC0120010form1/*[eq]NORMAL@*23,*26"
expj.AC0120010.AC0120010form1.onDecision3 = function () {
  console.log('AC0120010form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?AC0120010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script29="child;23;CHK;?JOB_ODR_CD[eq]SAME[and]?JOB_ODR_CANCEL_NO[eq]SAME@*24,*26"
expj.AC0120010.AC0120010form1.child23 = function () {
  console.log('AC0120010form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '?JOB_ODR_CANCEL_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script30="child;24;CHK;_AC0120010form1/h_size[eq]0@*26,*27"
expj.AC0120010.AC0120010form1.child24 = function () {
  console.log('AC0120010form1 script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010form1/h_size'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script31="child;26;MASK;_AC0120010button0/CsvOut"
expj.AC0120010.AC0120010form1.child26 = function () {
  console.log('AC0120010form1 script31');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120010form1', '_AC0120010button0/CsvOut');
};
// script32="child;27;UNMASK;_AC0120010button0/CsvOut"
expj.AC0120010.AC0120010form1.child27 = function () {
  console.log('AC0120010form1 script32');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120010form1', '_AC0120010button0/CsvOut');
};
// script33="child;28;CHK;_AC0120010tree1/DM_STS_TYP[eq]2[or]_AC0120010tree1/ODR_STS_TYP[eq]2@*29,*19"
expj.AC0120010.AC0120010form1.child28 = function () {
  console.log('AC0120010form1 script33');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/DM_STS_TYP'), '[eq]', '2') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/ODR_STS_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script34="child;29;CHK;_AC0120010tree1/MANHOUR_TYP[eq]1@*20,*30"
expj.AC0120010.AC0120010form1.child29 = function () {
  console.log('AC0120010form1 script34');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/MANHOUR_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
}
};
// script35="child;30;CHK;_AC0120010tree1/DM_STS_TYP[eq]2[and]_AC0120010tree1/CHIID_OD_NO[neq]@*20,*19"
expj.AC0120010.AC0120010form1.child30 = function () {
  console.log('AC0120010form1 script35');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/DM_STS_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_AC0120010tree1/CHIID_OD_NO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
expj.AC0120010.AC0120010form1.executeAllOnDecision = function () {
  console.log('execute AC0120010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120010form1['onDecision' + i])) {
        expj.AC0120010.AC0120010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120010form1.executeOnLoad = function () {
  expj.AC0120010.AC0120010form1.executePScriptOnLoad();
};

expj.AC0120010.AC0120010form1.executePScriptOnLoad = function () {
  console.log('execute AC0120010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0120010.AC0120010form1['onLoad' + i])) {
      expj.AC0120010.AC0120010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0120010-AC0120010form1" action="AC0120010Servlet" name="AC0120010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0120010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120010form1-JOB_ODR_CD">
expj.AC0120010.AC0120010form1.JOB_ODR_CD = {};
expj.AC0120010.AC0120010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0120010form1/JOB_ODR_CD.onDecision');
  expj.AC0120010.AC0120010form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120010form1', 'JOB_ODR_CD', this);
  });
  expj.AC0120010.AC0120010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0120010.AC0120010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0120010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AC0120010-focus-move  required-value expj-AC0120010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0120010-AC0120010form1-PeekerJobOdrCd">
expj.AC0120010.AC0120010form1.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AC0120010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AC0120010.AC0120010form1.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0120010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AC0120010', 'PeekerJobOdrCd', 'SQLPARAM_1', '<%=aAC0120010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120010form1', '_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_15%&%';
parameterValues += 'TARGET_FIELD%=%_AC0120010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0120010.AC0120010form1.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120010form1.PeekerJobOdrCd['onClick' + i])) {
        expj.AC0120010.AC0120010form1.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120010form1.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120010form1.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010form1-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120010form1', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AC0120010.AC0120010form1.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AC0120010.AC0120010form1.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AC0120010form1/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010form1-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0120010-AC0120010form1-PeekerJobOdrCd" class="AC0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120010form1-JOB_ODR_STS_TYP1" name="JOB_ODR_STS_TYP1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getJOB_ODR_STS_TYP1()) %>">
<script class="expj-script-AC0120010-AC0120010form1-JOB_ODR_STS_TYP1">
expj.AC0120010.AC0120010form1.JOB_ODR_STS_TYP1 = {};
expj.AC0120010.AC0120010form1.JOB_ODR_STS_TYP1.executeAllOnDecision = function () {
  console.log('execute AC0120010form1/JOB_ODR_STS_TYP1.onDecision');
  expj.AC0120010.AC0120010form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120010form1.JOB_ODR_STS_TYP1.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010form1-JOB_ODR_STS_TYP1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120010form1', 'JOB_ODR_STS_TYP1', this);
  });
  expj.AC0120010.AC0120010form1.JOB_ODR_STS_TYP1.executePScriptOnLoad();
};

expj.AC0120010.AC0120010form1.JOB_ODR_STS_TYP1.executePScriptOnLoad = function () {
  console.log('execute AC0120010form1/JOB_ODR_STS_TYP1.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010form1-JOB_ODR_STS_TYP1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120010form1-JOB_ODR_CANCEL_NO">
expj.AC0120010.AC0120010form1.JOB_ODR_CANCEL_NO = {};
expj.AC0120010.AC0120010form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AC0120010form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AC0120010.AC0120010form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120010form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120010form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AC0120010.AC0120010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AC0120010.AC0120010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AC0120010form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120010form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AC0120010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0018",rb)%></span><!-- 初期展開レベル --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120010form1-InitLevel">
expj.AC0120010.AC0120010form1.InitLevel = {};
expj.AC0120010.AC0120010form1.InitLevel.executeAllOnDecision = function () {
  console.log('execute AC0120010form1/InitLevel.onDecision');
  expj.AC0120010.AC0120010form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120010form1.InitLevel.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010form1-InitLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120010form1', 'InitLevel', this);
  });
  expj.AC0120010.AC0120010form1.InitLevel.executePScriptOnLoad();
};

expj.AC0120010.AC0120010form1.InitLevel.executePScriptOnLoad = function () {
  console.log('execute AC0120010form1/InitLevel.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010form1-InitLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120010form1-InitLevel" name="InitLevel" class="AC0120010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;8" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getInitLevel()) %>" maxlength="2147483647" ></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120010form1-h_size" name="h_size" class="" data-kind="OBT_INTEGER_Z;8" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_size()) %>">
<script class="expj-script-AC0120010-AC0120010form1-h_size">
expj.AC0120010.AC0120010form1.h_size = {};
expj.AC0120010.AC0120010form1.h_size.executeAllOnDecision = function () {
  console.log('execute AC0120010form1/h_size.onDecision');
  expj.AC0120010.AC0120010form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120010form1.h_size.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010form1-h_size').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120010form1', 'h_size', this);
  });
  expj.AC0120010.AC0120010form1.h_size.executePScriptOnLoad();
};

expj.AC0120010.AC0120010form1.h_size.executePScriptOnLoad = function () {
  console.log('execute AC0120010form1/h_size.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010form1-h_size');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AC0120010-AC0120010form1-DOWNLOAD_FILE">
expj.AC0120010.AC0120010form1.DOWNLOAD_FILE = {};
expj.AC0120010.AC0120010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AC0120010form1/DOWNLOAD_FILE.onDecision');
  expj.AC0120010.AC0120010form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AC0120010.AC0120010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AC0120010.AC0120010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AC0120010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010form1-DOWNLOAD_FILE');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0120010-AC0120010button1">
expj.AC0120010.AC0120010button1 = {};
expj.AC0120010.AC0120010button1.executeAllOnDecision = function () {
  console.log('execute AC0120010button1.onDecision');
};
expj.AC0120010.AC0120010button1.executeOnLoad = function () {
  expj.AC0120010.AC0120010button1.executePScriptOnLoad();
};

expj.AC0120010.AC0120010button1.executePScriptOnLoad = function () {
  console.log('execute AC0120010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0120010-AC0120010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0120010-AC0120010button1-Select">
expj.AC0120010.AC0120010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0120010form1/*@AC0120010Servlet"
expj.AC0120010.AC0120010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120010button1', '_AC0120010form1/*', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0120010', response);
expj.common.updateBusinessScreenTab('AC0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0120010.AC0120010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120010button1.Select['onClick' + i])) {
        expj.AC0120010.AC0120010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120010button1.Select.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120010button1.Select.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120010button1', 'Select', this, 'Button');
    }
  });
  expj.AC0120010.AC0120010button1.Select.executePScriptOnLoad();
};

expj.AC0120010.AC0120010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AC0120010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0120010-AC0120010button1-Select" name="Select" class="AC0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AC0120010-AC0120010tree1">
expj.AC0120010.AC0120010tree1 = {};
// script1="onClick;0;FSHOW;AC0120010float1@115"
expj.AC0120010.AC0120010tree1.onClick0 = function () {
  console.log('AC0120010tree1 script1');
expj.common.pscript.showDetailWindow('AC0120010', 'AC0120010float1', '115');
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ShowDetail=ACT,SUBMIT_BUTTON_TYPE=0,_AC0120010form1/*,_AC0120010tree1/+@AC0120010Servlet"
expj.AC0120010.AC0120010tree1.onClick1 = function () {
  console.log('AC0120010tree1 script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120010tree1', 'ShowDetail=ACT,SUBMIT_BUTTON_TYPE=0,_AC0120010form1/*,_AC0120010tree1/+', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0120010', response);
expj.common.updateBusinessScreenTab('AC0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script3="onDmyOpen;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,AddTree=ACT,_AC0120010tree1/+@AC0120010Servlet"
expj.AC0120010.AC0120010tree1.onDmyOpen0 = function () {
  console.log('AC0120010tree1 script3');
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120010tree1', 'AddTree=ACT,_AC0120010tree1/+', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
return params;
};
expj.AC0120010.AC0120010tree1.setContextAll = function () {
  var controlData = [
  ];
  var contextData = [
  ];
  var beforeFunc = function (event, ui) {
    expj.common.changeStateTreeContext(expj.common.treeInstanceMap.AC0120010.AC0120010tree1.gPrevSelectedNode, ui);
  };
  expj.common.createTreeContextInstance('#expj-AC0120010-AC0120010tree1-wrapper', '#expj-AC0120010-AC0120010tree1', contextData, controlData, beforeFunc);
};
expj.AC0120010.AC0120010tree1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120010tree1['onClick' + i])) {
        expj.AC0120010.AC0120010tree1['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120010tree1.executeAllOnDecision = function () {
  console.log('execute AC0120010tree1.onDecision');
};
expj.AC0120010.AC0120010tree1.executeOnLoad = function () {
<%
    treeClickEvent.put("AC0120010tree1", "expj.AC0120010.AC0120010tree1.executeAllOnClick");
%>
  expj.AC0120010.AC0120010tree1.setContextAll();
  expj.AC0120010.AC0120010tree1.executePScriptOnLoad();
};

expj.AC0120010.AC0120010tree1.executePScriptOnLoad = function () {
  console.log('execute AC0120010tree1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
if(aAC0120010Control.isNewData() == true){
%>
<div id="expj-AC0120010-AC0120010tree1-wrapper" class="expj-datagrid-tree" style="width:100%; height:100%; overflow:auto;background-color:#FFFFFF;">
<div id="expj-AC0120010-AC0120010tree1" data-orftype="Tree" data-mode="TREE" class="hasmenu" style="background-color:#FFFFFF;">
</div><!--Tree-->
</div>
<%
 treeId = "AC0120010tree1";
 treeXmlData = aAC0120010Control.getFlashTreeXML();
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0120010-AC0120010button2">
expj.AC0120010.AC0120010button2 = {};
expj.AC0120010.AC0120010button2.executeAllOnDecision = function () {
  console.log('execute AC0120010button2.onDecision');
};
expj.AC0120010.AC0120010button2.executeOnLoad = function () {
  expj.AC0120010.AC0120010button2.executePScriptOnLoad();
};

expj.AC0120010.AC0120010button2.executePScriptOnLoad = function () {
  console.log('execute AC0120010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0120010-AC0120010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0120010-AC0120010button2-append">
expj.AC0120010.AC0120010button2.append = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0120010form1/*,_AC0120010detailview1/*,_AC0120010tree1/+@AC0120010Servlet"
expj.AC0120010.AC0120010button2.append.onClick0 = function () {
  console.log('append script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120010button2', '_AC0120010form1/*,_AC0120010detailview1/*,_AC0120010tree1/+', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0120010', response);
expj.common.changeBusinessScreenTab('AC0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0120010.AC0120010button2.append.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120010button2.append['onClick' + i])) {
        expj.AC0120010.AC0120010button2.append['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120010button2.append.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120010button2.append.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010button2-append').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120010button2', 'append', this, 'Button');
    }
  });
  expj.AC0120010.AC0120010button2.append.executePScriptOnLoad();
};

expj.AC0120010.AC0120010button2.append.executePScriptOnLoad = function () {
  console.log('execute AC0120010button2/append.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010button2-append');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0120010-AC0120010button2-append" name="append" class="AC0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120010button2-modify">
expj.AC0120010.AC0120010button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0120010form1/*,_AC0120010detailview1/*,_AC0120010tree1/+@AC0120010Servlet"
expj.AC0120010.AC0120010button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120010button2', '_AC0120010form1/*,_AC0120010detailview1/*,_AC0120010tree1/+', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0120010', response);
expj.common.changeBusinessScreenTab('AC0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0120010.AC0120010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120010button2.modify['onClick' + i])) {
        expj.AC0120010.AC0120010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120010button2.modify.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120010button2.modify.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120010button2', 'modify', this, 'Button');
    }
  });
  expj.AC0120010.AC0120010button2.modify.executePScriptOnLoad();
};

expj.AC0120010.AC0120010button2.modify.executePScriptOnLoad = function () {
  console.log('execute AC0120010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0120010-AC0120010button2-modify" name="modify" class="AC0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
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
<span class="version">AC0120010 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AC0120010-AC0120010button0">
expj.AC0120010.AC0120010button0 = {};
expj.AC0120010.AC0120010button0.executeAllOnDecision = function () {
  console.log('execute AC0120010button0.onDecision');
};
expj.AC0120010.AC0120010button0.executeOnLoad = function () {
  expj.AC0120010.AC0120010button0.executePScriptOnLoad();
};

expj.AC0120010.AC0120010button0.executePScriptOnLoad = function () {
  console.log('execute AC0120010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0120010-AC0120010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0120010-AC0120010button0-CsvOut">
expj.AC0120010.AC0120010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0120010form1/*@AC0120010Servlet,,$ZZ07011"
expj.AC0120010.AC0120010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120010button0', '_AC0120010form1/*', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0120010', response);
expj.common.updateBusinessScreenTab('AC0120010', contents);
};
expj.common.pscript.callConfirm('AC0120010', 'AC0120010button0', 'ZZ07011', okEvent);
};
expj.AC0120010.AC0120010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120010button0.CsvOut['onClick' + i])) {
        expj.AC0120010.AC0120010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AC0120010.AC0120010button0.CsvOut.executePScriptOnLoad();
};

expj.AC0120010.AC0120010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AC0120010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0120010-AC0120010button0-CsvOut" name="CsvOut" class="AC0120010-focus-move" style="width:100 px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120010button0-Clear">
expj.AC0120010.AC0120010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0120010Servlet,,$ZZ07008"
expj.AC0120010.AC0120010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120010button0', '', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0120010', response);
expj.common.updateBusinessScreenTab('AC0120010', contents);
};
expj.common.pscript.callConfirm('AC0120010', 'AC0120010button0', 'ZZ07008', okEvent);
};
expj.AC0120010.AC0120010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120010button0.Clear['onClick' + i])) {
        expj.AC0120010.AC0120010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120010button0.Clear.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120010button0.Clear.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120010button0', 'Clear', this, 'Button');
    }
  });
  expj.AC0120010.AC0120010button0.Clear.executePScriptOnLoad();
};

expj.AC0120010.AC0120010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AC0120010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0120010-AC0120010button0-Clear" name="Clear" class="AC0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120010button0-Close">
expj.AC0120010.AC0120010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AC0120010.AC0120010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AC0120010');
};
expj.AC0120010.AC0120010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120010button0.Close['onClick' + i])) {
        expj.AC0120010.AC0120010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120010button0.Close.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120010button0.Close.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120010button0', 'Close', this, 'Button');
    }
  });
  expj.AC0120010.AC0120010button0.Close.executePScriptOnLoad();
};

expj.AC0120010.AC0120010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AC0120010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0120010-AC0120010button0-Close" name="Close" class="AC0120010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0120010 (END)-->
<script class="expj-script-AC0120010-AC0120010detailview1">
expj.AC0120010.AC0120010detailview1 = {};
expj.AC0120010.AC0120010detailview1.executeAllOnDecision = function () {
  console.log('execute AC0120010detailview1.onDecision');
};
expj.AC0120010.AC0120010detailview1.executeOnLoad = function () {
  expj.AC0120010.AC0120010detailview1.executePScriptOnLoad();
};

expj.AC0120010.AC0120010detailview1.executePScriptOnLoad = function () {
  console.log('execute AC0120010detailview1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAC0120010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AC0120010-AC0120010detailview1" class="expj-datagird-detail" data-float="AC0120010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AC0120010detailview1";
 detailFloat = "AC0120010float1";
 detailWidth = 358;
 detailHeight = 368 + 47;
 String AC0120010detailview1_Id = "AC0120010detailview1";
 String AC0120010detailview1_select = "single";
 String AC0120010detailview1_sortable = "true";
 String AC0120010detailview1_resize = "true";
 String AC0120010detailview1_scroll = "true";
 StringBuffer AC0120010detailview1_HB = new StringBuffer();
 StringBuffer AC0120010detailview1_DB = new StringBuffer();
%>
<%
 AC0120010detailview1_sortable = "false";
 AC0120010detailview1_select = "none";
%>
<% AC0120010detailview1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AC0120010detailview1_sortable).append("}").append(","); %>
<%  AC0120010detailview1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AC0120010detailview1_sortable).append("}").append(",");
AC0120010detailview1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AC0120010detailview1_sortable).append("}").append(",");
AC0120010detailview1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AC0120010detailview1_sortable).append("}").append(",");
 %>
  <% AC0120010detailview1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-Detail_ITEM_NAME\" class=\"expj-label\" data-name=\"Detail_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getDetail_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['2','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['3','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-OUTSIDE_TYP_DN\" class=\"expj-label\" data-name=\"OUTSIDE_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getOUTSIDE_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['5','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-ITEM_SPOIL\" class=\"expj-label\" data-name=\"ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;9.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-UNIT_QTY_TYP_DN\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getUNIT_QTY_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['7','").append(CoreTools.getRBString("Expj.DUE_DATE",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-DUE_DATE\" class=\"expj-label\" data-name=\"DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getDUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['8','").append(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-PRD_DUE_DATE\" class=\"expj-label\" data-name=\"PRD_DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getPRD_DUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['9','").append(CoreTools.getRBString("Expj.PRD_START_DATE",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-PRD_START_DATE\" class=\"expj-label\" data-name=\"PRD_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getPRD_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['10','").append(CoreTools.getRBString("Expj.ODR_START_DATE",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-ODR_START_DATE\" class=\"expj-label\" data-name=\"ODR_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getODR_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['11','").append(CoreTools.getRBString("Expj.REQ_PRD_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-DM_QTY\" class=\"expj-label\" data-name=\"DM_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getDM_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0120010-AC0120010detailview1-d2_STOCK_UNIT\" class=\"expj-label\" data-name=\"d2_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['12','").append(CoreTools.getRBString("Expj.ODR_QTY_1",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-ODR_QTY\" class=\"expj-label\" data-name=\"ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0120010-AC0120010detailview1-d3_STOCK_UNIT\" class=\"expj-label\" data-name=\"d3_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['13','").append(CoreTools.getRBString("Expj.ALCD_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-SUM_ALCD_QTY\" class=\"expj-label\" data-name=\"SUM_ALCD_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSUM_ALCD_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0120010-AC0120010detailview1-d4_STOCK_UNIT\" class=\"expj-label\" data-name=\"d4_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['14','").append(CoreTools.getRBString("Expj.ODR_STS_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-ODR_STS_TYP_DN\" class=\"expj-label\" data-name=\"ODR_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getODR_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['15','").append(CoreTools.getRBString("Expj.DM_STS_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-DM_STS_TYP_DN\" class=\"expj-label\" data-name=\"DM_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getDM_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['16','").append(CoreTools.getRBString("Expj.OD_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-OD_TYP_DN\" class=\"expj-label\" data-name=\"OD_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getOD_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['17','").append(CoreTools.getRBString("Expj.OD_GNR_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-OD_GNR_TYP_DN\" class=\"expj-label\" data-name=\"OD_GNR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getOD_GNR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['18','").append(CoreTools.getRBString("Expj.MANHOUR_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-MANHOUR_TYP_DN\" class=\"expj-label\" data-name=\"MANHOUR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getMANHOUR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['19','").append(CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb)).append("','").append("<span id=\"expj-AC0120010-AC0120010detailview1-OPR_RSLT_TYP_DN\" class=\"expj-label\" data-name=\"OPR_RSLT_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getOPR_RSLT_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['20','").append(CoreTools.getRBString("Expj.TOTAL_RCV_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-TOTAL_RCV_QTY\" class=\"expj-label\" data-name=\"TOTAL_RCV_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getTOTAL_RCV_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0120010-AC0120010detailview1-d5_STOCK_UNIT\" class=\"expj-label\" data-name=\"d5_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0120010detailview1_DB.append("['21','").append(CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0120010-AC0120010detailview1-TOTAL_ISSUE_QTY\" class=\"expj-label\" data-name=\"TOTAL_ISSUE_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0120010Struct.getTOTAL_ISSUE_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0120010-AC0120010detailview1-d6_STOCK_UNIT\" class=\"expj-label\" data-name=\"d6_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0120010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AC0120010detailview1_Id;
 detailViewSelect = AC0120010detailview1_select;
 detailViewResize = AC0120010detailview1_resize;
 detailViewScroll = AC0120010detailview1_scroll;
 detailViewHeaderData = AC0120010detailview1_HB;
 detailViewBodyData = AC0120010detailview1_DB;
%>
<%
}
%>
<% MessageStruct msgStruct = aAC0120010Control.getMsgStruct(); %><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0120010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0120010)) {
  expj.common.treeInstanceMap.AC0120010 = {};
}
expj.common.treeInstanceMap.AC0120010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0120010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0120010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0120010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = expj.AC0120010.AC0120010tree1.onDmyOpen0;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0120010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0120010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010)) {
  expj.common.detailDialogMap.AC0120010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0120010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0120010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0120010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0120010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0120010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0120010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0120010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0120010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0120010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0120010)) {
  expj.common.viewInstanceMap.AC0120010 = {};
}
expj.common.viewInstanceMap.AC0120010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0120010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0120010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0120010.<%=viewId %>.init = function () {
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
    expj.AC0120010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0120010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0120010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0120010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0120010_init">
/**
 * AC0120010用のロード完了時初期化関数
 */
expj.AC0120010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0120010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0120010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0120010');
  expj.common.calendarInstanceMap.AC0120010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0120010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0120010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0120010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0120010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0120010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0120010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0120010.AC0120010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010form1.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010form1.JOB_ODR_STS_TYP1.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010form1.InitLevel.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010form1.h_size.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010button2.append.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010button2.modify.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010form1.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010button1.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010tree1.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010button2.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010button0.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120010detailview1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0120010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0120010', 'AC0120010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0120010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0120010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0120010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0120010', '<%=request.getContextPath() %>');
};

/**
 * AC0120010の全体onDecision処理
 */
expj.AC0120010.executeAllOnDecision = function () {
  expj.AC0120010.AC0120010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0120010_console">
expj.AC0120010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>