<%-- ***
This file is generated
 GeneratedDate  : Fri Feb 17 14:19:42 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DA0020\DA0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DA0020.*" %>
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
<jsp:useBean id="aDA0020010Control" class="com.nec.jp.orteus.metamorBase.DA0020.DA0020010Control" scope="request"/>
<jsp:useBean id="aDA0020010Struct" class="com.nec.jp.orteus.metamorBase.DA0020.DA0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

購入品マスタメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0020/jsp/DA0020010.jsp,v $
$Author: geng-jia $
$Revision: 1.6 $ $Date: 2017/02/22 02:06:36 $
********************************************************* --%>
<html>
<head>
<title>購入品マスタメンテナンス</title>
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
<script class="expj-script-DA0020010_init">
  // DA0020010名前空間
  expj.DA0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DA0020010" data-screen="DA0020010" data-newdata="<%=aDA0020010Control.isNewData() %>">
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
            <script class="expj-script-DA0020010-DA0020010form1">
expj.DA0020010.DA0020010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.DA0020010.DA0020010form1.onLoad0 = function () {
  console.log('DA0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DA0020010.DA0020010form1.onDecision0 = function () {
  console.log('DA0020010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DA0020010button1/Select"
expj.DA0020010.DA0020010form1.child0 = function () {
  console.log('DA0020010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010button1/Select');
};
// script4="child;1;MASK;_DA0020010button1/Select"
expj.DA0020010.DA0020010form1.child1 = function () {
  console.log('DA0020010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010button1/Select');
};
// script5="onDecision;1;CHK;_DA0020010form2/CS_PUCH_TYP[eq]1@*2,*3"
expj.DA0020010.DA0020010form1.onDecision1 = function () {
  console.log('DA0020010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_DA0020010form2/CS_PUCH_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;CHKRQ;A,C@*4,*6"
expj.DA0020010.DA0020010form1.child2 = function () {
  console.log('DA0020010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'A') && expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'C')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script7="child;3;CHKRQ;A,B,C@*4,*6"
expj.DA0020010.DA0020010form1.child3 = function () {
  console.log('DA0020010form1 script7');
if (expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'A') && expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'B') && expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'C')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;4;CHK;_PLANT_CD[neq]_h_PLANT_CD[or]_YEAR[neq]_h_YEAR[or]_HALF_TERM_TYP[neq]_h_HALF_TERM_TYP[or]_COST_TYP[neq]_h_COST_TYP[or]_ITEM_CD[neq]_h_ITEM_CD[or]_CS_PROC_CD[neq]_h_CS_PROC_CD@*5,*6"
expj.DA0020010.DA0020010form1.child4 = function () {
  console.log('DA0020010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_PLANT_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_PLANT_CD')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_YEAR'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_YEAR')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_HALF_TERM_TYP'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_HALF_TERM_TYP')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_COST_TYP'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_COST_TYP')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_ITEM_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_ITEM_CD')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_CS_PROC_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_CS_PROC_CD'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_DA0020010button2/Insert"
expj.DA0020010.DA0020010form1.child5 = function () {
  console.log('DA0020010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010button2/Insert');
};
// script10="child;6;MASK;_DA0020010button2/Insert"
expj.DA0020010.DA0020010form1.child6 = function () {
  console.log('DA0020010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010button2/Insert');
};
// script11="onDecision;2;CHK;_DA0020010form2/CS_PUCH_TYP[eq]1@*7,*8"
expj.DA0020010.DA0020010form1.onDecision2 = function () {
  console.log('DA0020010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_DA0020010form2/CS_PUCH_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;CHKRQ;A,C@*9,*11"
expj.DA0020010.DA0020010form1.child7 = function () {
  console.log('DA0020010form1 script12');
if (expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'A') && expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'C')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script13="child;8;CHKRQ;A,B,C@*9,*11"
expj.DA0020010.DA0020010form1.child8 = function () {
  console.log('DA0020010form1 script13');
if (expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'A') && expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'B') && expj.common.pscript.satisfiedRequiredComponent('DA0020010', 'C')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script14="child;9;CHK;?DA0020010form1/*[eq]NORMAL[and]_DA0020010form2/DEL_FLG[eq]0[and]_PLANT_CD[eq]_h_PLANT_CD[and]_YEAR[eq]_h_YEAR[and]_HALF_TERM_TYP[eq]_h_HALF_TERM_TYP[and]_COST_TYP[eq]_h_COST_TYP[and]_ITEM_CD[eq]_h_ITEM_CD[and]_CS_PROC_CD[eq]_h_CS_PROC_CD@*10,*11"
expj.DA0020010.DA0020010form1.child9 = function () {
  console.log('DA0020010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '?DA0020010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_DA0020010form2/DEL_FLG'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_PLANT_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_PLANT_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_YEAR'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_YEAR')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_HALF_TERM_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_HALF_TERM_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_COST_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_COST_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_ITEM_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_CS_PROC_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_CS_PROC_CD'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script15="child;10;UNMASK;_DA0020010button2/Update"
expj.DA0020010.DA0020010form1.child10 = function () {
  console.log('DA0020010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010button2/Update');
};
// script16="child;11;MASK;_DA0020010button2/Update"
expj.DA0020010.DA0020010form1.child11 = function () {
  console.log('DA0020010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010button2/Update');
};
// script17="onDecision;3;CHK;?DA0020010form1/*[eq]NORMAL[and]_DA0020010form2/DEL_FLG[eq]0[and]_PLANT_CD[eq]_h_PLANT_CD[and]_YEAR[eq]_h_YEAR[and]_HALF_TERM_TYP[eq]_h_HALF_TERM_TYP[and]_COST_TYP[eq]_h_COST_TYP[and]_ITEM_CD[eq]_h_ITEM_CD[and]_CS_PROC_CD[eq]_h_CS_PROC_CD@*12,*13"
expj.DA0020010.DA0020010form1.onDecision3 = function () {
  console.log('DA0020010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '?DA0020010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_DA0020010form2/DEL_FLG'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_PLANT_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_PLANT_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_YEAR'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_YEAR')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_HALF_TERM_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_HALF_TERM_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_COST_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_COST_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_ITEM_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_CS_PROC_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_CS_PROC_CD'))) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script18="child;12;UNMASK;_DA0020010button2/Delete"
expj.DA0020010.DA0020010form1.child12 = function () {
  console.log('DA0020010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010button2/Delete');
};
// script19="child;13;MASK;_DA0020010button2/Delete"
expj.DA0020010.DA0020010form1.child13 = function () {
  console.log('DA0020010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010button2/Delete');
};
// script20="onDecision;4;CHK;?DA0020010form1/*[eq]NORMAL[and]_DA0020010form2/DEL_FLG[eq]1[and]_PLANT_CD[eq]_h_PLANT_CD[and]_YEAR[eq]_h_YEAR[and]_HALF_TERM_TYP[eq]_h_HALF_TERM_TYP[and]_COST_TYP[eq]_h_COST_TYP[and]_ITEM_CD[eq]_h_ITEM_CD[and]_CS_PROC_CD[eq]_h_CS_PROC_CD@*14,*15"
expj.DA0020010.DA0020010form1.onDecision4 = function () {
  console.log('DA0020010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '?DA0020010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_DA0020010form2/DEL_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_PLANT_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_PLANT_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_YEAR'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_YEAR')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_HALF_TERM_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_HALF_TERM_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_COST_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_COST_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_ITEM_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_CS_PROC_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_h_CS_PROC_CD'))) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script21="child;14;UNMASK;_DA0020010button2/CancelDelete"
expj.DA0020010.DA0020010form1.child14 = function () {
  console.log('DA0020010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010button2/CancelDelete');
};
// script22="child;15;MASK;_DA0020010button2/CancelDelete"
expj.DA0020010.DA0020010form1.child15 = function () {
  console.log('DA0020010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010button2/CancelDelete');
};
// script23="onDecision;5;CHK;_DA0020010form2/CS_PUCH_TYP[eq]2@*16,*17"
expj.DA0020010.DA0020010form1.onDecision5 = function () {
  console.log('DA0020010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_DA0020010form2/CS_PUCH_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script24="child;16;UNMASK;_DA0020010form2/CS_PROC_CD,_DA0020010form2/PeekerCsProcCd"
expj.DA0020010.DA0020010form1.child16 = function () {
  console.log('DA0020010form1 script24');
expj.common.pscript.setUnMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010form2/CS_PROC_CD');
expj.common.pscript.setUnMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010form2/PeekerCsProcCd');
};
// script25="child;17;SET;_DA0020010form2/CS_PROC_CD=@*18"
expj.DA0020010.DA0020010form1.child17 = function () {
  console.log('DA0020010form1 script25');
expj.common.pscript.setReferenceComponentValue('DA0020010', 'DA0020010form1', '_DA0020010form2/CS_PROC_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child18)){this.child18();}}
};
// script26="child;18;MASK;_DA0020010form2/CS_PROC_CD,_DA0020010form2/PeekerCsProcCd"
expj.DA0020010.DA0020010form1.child18 = function () {
  console.log('DA0020010form1 script26');
expj.common.pscript.setMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010form2/CS_PROC_CD');
expj.common.pscript.setMaskToReferenceComponent('DA0020010', 'DA0020010form1', '_DA0020010form2/PeekerCsProcCd');
};
expj.DA0020010.DA0020010form1.executeAllOnDecision = function () {
  console.log('execute DA0020010form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010form1['onDecision' + i])) {
        expj.DA0020010.DA0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010form1.executeOnLoad = function () {
  expj.DA0020010.DA0020010form1.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DA0020010.DA0020010form1['onLoad' + i])) {
      expj.DA0020010.DA0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0020010-DA0020010form1" action="DA0020010Servlet" name="DA0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDA0020010Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form1-PLANT_CD">
expj.DA0020010.DA0020010form1.PLANT_CD = {};
expj.DA0020010.DA0020010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/PLANT_CD.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form1', 'PLANT_CD', this);
  });
  expj.DA0020010.DA0020010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form1-PLANT_CD" name="PLANT_CD" class="DA0020010-focus-move  required-value expj-DA0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<input type="hidden" id="expj-DA0020010-DA0020010form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0020010Struct.geth_PLANT_CD()) %>">
<script class="expj-script-DA0020010-DA0020010form1-h_PLANT_CD">
expj.DA0020010.DA0020010form1.h_PLANT_CD = {};
expj.DA0020010.DA0020010form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/h_PLANT_CD.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form1', 'h_PLANT_CD', this);
  });
  expj.DA0020010.DA0020010form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-DA0020010-DA0020010form1-PeekerPlantCd">
expj.DA0020010.DA0020010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DA0020010form1/PLANT_CD:_DA0020010form1/PLANT_NAME@<%=contextNo%>"
expj.DA0020010.DA0020010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0020010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0020010form1/PLANT_CD:_DA0020010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0020010.DA0020010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010form1.PeekerPlantCd['onClick' + i])) {
        expj.DA0020010.DA0020010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0020010-DA0020010form1-PeekerPlantCd" class="DA0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form1-PLANT_NAME">
expj.DA0020010.DA0020010form1.PLANT_NAME = {};
expj.DA0020010.DA0020010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/PLANT_NAME.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form1', 'PLANT_NAME', this);
  });
  expj.DA0020010.DA0020010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form1-PLANT_NAME" name="PLANT_NAME" class="DA0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.YEAR",rb)%></span><!-- 年度 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form1-YEAR">
expj.DA0020010.DA0020010form1.YEAR = {};
expj.DA0020010.DA0020010form1.YEAR.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/YEAR.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.YEAR.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form1', 'YEAR', this);
  });
  expj.DA0020010.DA0020010form1.YEAR.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.YEAR.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form1-YEAR" name="YEAR" class="DA0020010-focus-move expj-align-right required-value expj-DA0020010-required-A" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getYEAR()) %>" maxlength="4" ></div><!--/td-->
<input type="hidden" id="expj-DA0020010-DA0020010form1-h_YEAR" name="h_YEAR" class="" data-kind="OBT_N;" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0020010Struct.geth_YEAR()) %>">
<script class="expj-script-DA0020010-DA0020010form1-h_YEAR">
expj.DA0020010.DA0020010form1.h_YEAR = {};
expj.DA0020010.DA0020010form1.h_YEAR.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/h_YEAR.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.h_YEAR.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-h_YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form1', 'h_YEAR', this);
  });
  expj.DA0020010.DA0020010form1.h_YEAR.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.h_YEAR.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/h_YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-h_YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HALF_TERM_TYP",rb)%></span><!-- 半期区分 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form1-HALF_TERM_TYP">
expj.DA0020010.DA0020010form1.HALF_TERM_TYP = {};
expj.DA0020010.DA0020010form1.HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/HALF_TERM_TYP.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-HALF_TERM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0020010', 'DA0020010form1', 'HALF_TERM_TYP', this);
  });
  expj.DA0020010.DA0020010form1.HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0020010-DA0020010form1-HALF_TERM_TYP" name='HALF_TERM_TYP' class='DA0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0020010Control.getStruct().getList_HALF_TERM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_HALF_TERM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_HALF_TERM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0020010Struct.getHALF_TERM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-DA0020010-DA0020010form1-h_HALF_TERM_TYP" name="h_HALF_TERM_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0020010Struct.geth_HALF_TERM_TYP()) %>">
<script class="expj-script-DA0020010-DA0020010form1-h_HALF_TERM_TYP">
expj.DA0020010.DA0020010form1.h_HALF_TERM_TYP = {};
expj.DA0020010.DA0020010form1.h_HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/h_HALF_TERM_TYP.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.h_HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-h_HALF_TERM_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form1', 'h_HALF_TERM_TYP', this);
  });
  expj.DA0020010.DA0020010form1.h_HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.h_HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/h_HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-h_HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.COST_TYP",rb)%></span><!-- 原価種別 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form1-COST_TYP">
expj.DA0020010.DA0020010form1.COST_TYP = {};
expj.DA0020010.DA0020010form1.COST_TYP.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/COST_TYP.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.COST_TYP.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0020010', 'DA0020010form1', 'COST_TYP', this);
  });
  expj.DA0020010.DA0020010form1.COST_TYP.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0020010-DA0020010form1-COST_TYP" name='COST_TYP' class='DA0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0020010Control.getStruct().getList_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0020010Struct.getCOST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-DA0020010-DA0020010form1-h_COST_TYP" name="h_COST_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0020010Struct.geth_COST_TYP()) %>">
<script class="expj-script-DA0020010-DA0020010form1-h_COST_TYP">
expj.DA0020010.DA0020010form1.h_COST_TYP = {};
expj.DA0020010.DA0020010form1.h_COST_TYP.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/h_COST_TYP.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.h_COST_TYP.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-h_COST_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form1', 'h_COST_TYP', this);
  });
  expj.DA0020010.DA0020010form1.h_COST_TYP.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.h_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/h_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-h_COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form1-ITEM_CD">
expj.DA0020010.DA0020010form1.ITEM_CD = {};
expj.DA0020010.DA0020010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/ITEM_CD.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form1', 'ITEM_CD', this);
  });
  expj.DA0020010.DA0020010form1.ITEM_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form1-ITEM_CD" name="ITEM_CD" class="DA0020010-focus-move  required-value expj-DA0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-DA0020010-DA0020010form1-h_ITEM_CD" name="h_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0020010Struct.geth_ITEM_CD()) %>">
<script class="expj-script-DA0020010-DA0020010form1-h_ITEM_CD">
expj.DA0020010.DA0020010form1.h_ITEM_CD = {};
expj.DA0020010.DA0020010form1.h_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/h_ITEM_CD.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.h_ITEM_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-h_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form1', 'h_ITEM_CD', this);
  });
  expj.DA0020010.DA0020010form1.h_ITEM_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.h_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/h_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-h_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-DA0020010-DA0020010form1-PeekerItemCd">
expj.DA0020010.DA0020010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_DA0020010form1/ITEM_CD:_DA0020010form1/ITEM_NAME:_DA0020010form2/CLASIFICATION_CD:_DA0020010form2/STOCK_UNIT@<%=contextNo%>"
expj.DA0020010.DA0020010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0020010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form1', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_D02%&%';
parameterValues += 'TARGET_FIELD%=%_DA0020010form1/ITEM_CD:_DA0020010form1/ITEM_NAME:_DA0020010form2/CLASIFICATION_CD:_DA0020010form2/STOCK_UNIT%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0020010.DA0020010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010form1.PeekerItemCd['onClick' + i])) {
        expj.DA0020010.DA0020010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0020010-DA0020010form1-PeekerItemCd" class="DA0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form1-ITEM_NAME">
expj.DA0020010.DA0020010form1.ITEM_NAME = {};
expj.DA0020010.DA0020010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute DA0020010form1/ITEM_NAME.onDecision');
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form1', 'ITEM_NAME', this);
  });
  expj.DA0020010.DA0020010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0020010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form1-ITEM_NAME" name="ITEM_NAME" class="DA0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DA0020010-DA0020010button1">
expj.DA0020010.DA0020010button1 = {};
expj.DA0020010.DA0020010button1.executeAllOnDecision = function () {
  console.log('execute DA0020010button1.onDecision');
};
expj.DA0020010.DA0020010button1.executeOnLoad = function () {
  expj.DA0020010.DA0020010button1.executePScriptOnLoad();
};

expj.DA0020010.DA0020010button1.executePScriptOnLoad = function () {
  console.log('execute DA0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0020010-DA0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0020010-DA0020010button1-Select">
expj.DA0020010.DA0020010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0020010form1/*@DA0020010Servlet"
expj.DA0020010.DA0020010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0020010', 'DA0020010button1', '_DA0020010form1/*', 'DA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0020010', response);
expj.common.updateBusinessScreenTab('DA0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0020010.DA0020010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010button1.Select['onClick' + i])) {
        expj.DA0020010.DA0020010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010button1.Select.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010button1.Select.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010button1', 'Select', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010button1.Select.executePScriptOnLoad();
};

expj.DA0020010.DA0020010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DA0020010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0020010-DA0020010button1-Select" name="Select" class="DA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-DA0020010-DA0020010form2">
expj.DA0020010.DA0020010form2 = {};
expj.DA0020010.DA0020010form2.executeAllOnDecision = function () {
  console.log('execute DA0020010form2.onDecision');
};
expj.DA0020010.DA0020010form2.executeOnLoad = function () {
  expj.DA0020010.DA0020010form2.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0020010-DA0020010form2" action="DA0020010Servlet" name="DA0020010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CS_PUCH_TYP",rb)%></span><!-- 購入品単価種別 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-CS_PUCH_TYP">
expj.DA0020010.DA0020010form2.CS_PUCH_TYP = {};
expj.DA0020010.DA0020010form2.CS_PUCH_TYP.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/CS_PUCH_TYP.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.CS_PUCH_TYP.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-CS_PUCH_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0020010', 'DA0020010form2', 'CS_PUCH_TYP', this);
  });
  expj.DA0020010.DA0020010form2.CS_PUCH_TYP.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.CS_PUCH_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/CS_PUCH_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-CS_PUCH_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0020010-DA0020010form2-CS_PUCH_TYP" name='CS_PUCH_TYP' class='DA0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0020010Control.getStruct().getList_CS_PUCH_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_CS_PUCH_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_CS_PUCH_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0020010Struct.getCS_PUCH_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-DA0020010-DA0020010form2-h_CS_PUCH_TYP" name="h_CS_PUCH_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0020010Struct.geth_CS_PUCH_TYP()) %>">
<script class="expj-script-DA0020010-DA0020010form2-h_CS_PUCH_TYP">
expj.DA0020010.DA0020010form2.h_CS_PUCH_TYP = {};
expj.DA0020010.DA0020010form2.h_CS_PUCH_TYP.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/h_CS_PUCH_TYP.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.h_CS_PUCH_TYP.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-h_CS_PUCH_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'h_CS_PUCH_TYP', this);
  });
  expj.DA0020010.DA0020010form2.h_CS_PUCH_TYP.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.h_CS_PUCH_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/h_CS_PUCH_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-h_CS_PUCH_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CS_PROC_CD",rb)%></span><!-- 工程コード --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-CS_PROC_CD">
expj.DA0020010.DA0020010form2.CS_PROC_CD = {};
expj.DA0020010.DA0020010form2.CS_PROC_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/CS_PROC_CD.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.CS_PROC_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-CS_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'CS_PROC_CD', this);
  });
  expj.DA0020010.DA0020010form2.CS_PROC_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.CS_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/CS_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-CS_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-CS_PROC_CD" name="CS_PROC_CD" class="DA0020010-focus-move  required-value expj-DA0020010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getCS_PROC_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-PeekerCsProcCd">
expj.DA0020010.DA0020010form2.PeekerCsProcCd = {};
// script1="onClick;0;PEEKER;_DA0020010form2/CS_PROC_CD:_DA0020010form2/CS_PROC_NAME@<%=contextNo%>"
expj.DA0020010.DA0020010form2.PeekerCsProcCd.onClick0 = function () {
  console.log('PeekerCsProcCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0020010';
var parameterValues = 'PeekerCsProcCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form2', '_DA0020010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form2', '_CS_PROC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CS_PROC_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0020010form2/CS_PROC_CD:_DA0020010form2/CS_PROC_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0020010.DA0020010form2.PeekerCsProcCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010form2.PeekerCsProcCd['onClick' + i])) {
        expj.DA0020010.DA0020010form2.PeekerCsProcCd['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010form2.PeekerCsProcCd.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010form2.PeekerCsProcCd.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-PeekerCsProcCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010form2', 'PeekerCsProcCd', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010form2.PeekerCsProcCd.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.PeekerCsProcCd.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/PeekerCsProcCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-PeekerCsProcCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0020010-DA0020010form2-PeekerCsProcCd" class="DA0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-CS_PROC_NAME">
expj.DA0020010.DA0020010form2.CS_PROC_NAME = {};
expj.DA0020010.DA0020010form2.CS_PROC_NAME.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/CS_PROC_NAME.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.CS_PROC_NAME.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-CS_PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'CS_PROC_NAME', this);
  });
  expj.DA0020010.DA0020010form2.CS_PROC_NAME.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.CS_PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/CS_PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-CS_PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-CS_PROC_NAME" name="CS_PROC_NAME" class="DA0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getCS_PROC_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST_ACCEPT_TYP",rb)%></span><!-- 単価採用区分 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-UNIT_COST_ACCEPT_TYP">
expj.DA0020010.DA0020010form2.UNIT_COST_ACCEPT_TYP = {};
expj.DA0020010.DA0020010form2.UNIT_COST_ACCEPT_TYP.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/UNIT_COST_ACCEPT_TYP.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.UNIT_COST_ACCEPT_TYP.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-UNIT_COST_ACCEPT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0020010', 'DA0020010form2', 'UNIT_COST_ACCEPT_TYP', this);
  });
  expj.DA0020010.DA0020010form2.UNIT_COST_ACCEPT_TYP.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.UNIT_COST_ACCEPT_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/UNIT_COST_ACCEPT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-UNIT_COST_ACCEPT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0020010-DA0020010form2-UNIT_COST_ACCEPT_TYP" name='UNIT_COST_ACCEPT_TYP' class='DA0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0020010Control.getStruct().getList_UNIT_COST_ACCEPT_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_UNIT_COST_ACCEPT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_UNIT_COST_ACCEPT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0020010Struct.getUNIT_COST_ACCEPT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CLASIFICATION_CD_1",rb)%></span><!-- 品目管理コード --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-CLASIFICATION_CD">
expj.DA0020010.DA0020010form2.CLASIFICATION_CD = {};
expj.DA0020010.DA0020010form2.CLASIFICATION_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/CLASIFICATION_CD.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.CLASIFICATION_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-CLASIFICATION_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'CLASIFICATION_CD', this);
  });
  expj.DA0020010.DA0020010form2.CLASIFICATION_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.CLASIFICATION_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/CLASIFICATION_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-CLASIFICATION_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-CLASIFICATION_CD" name="CLASIFICATION_CD" class="DA0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getCLASIFICATION_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-c_NoCheckClasificationCd">
expj.DA0020010.DA0020010form2.c_NoCheckClasificationCd = {};
expj.DA0020010.DA0020010form2.c_NoCheckClasificationCd.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/c_NoCheckClasificationCd.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.c_NoCheckClasificationCd.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-c_NoCheckClasificationCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010form2', 'c_NoCheckClasificationCd', this, 'CheckBox');
    }
  });
  expj.DA0020010.DA0020010form2.c_NoCheckClasificationCd.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.c_NoCheckClasificationCd.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/c_NoCheckClasificationCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-c_NoCheckClasificationCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_NoCheckClasificationCd" value="true" <%= ("true".equals(TypeConverter.convert(aDA0020010Struct.getc_NoCheckClasificationCd())) || "1".equals(TypeConverter.convert(aDA0020010Struct.getc_NoCheckClasificationCd())))?"checked=\"checked\"":"" %>  class="DA0020010-focus-move" id="expj-DA0020010-DA0020010form2-c_NoCheckClasificationCd"><label for="expj-DA0020010-DA0020010form2-c_NoCheckClasificationCd"><%=CoreTools.getRBString("Expj.Cmt0253",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_UNIT",rb)%></span><!-- 計量単位 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-STOCK_UNIT">
expj.DA0020010.DA0020010form2.STOCK_UNIT = {};
expj.DA0020010.DA0020010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/STOCK_UNIT.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'STOCK_UNIT', this);
  });
  expj.DA0020010.DA0020010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-STOCK_UNIT" name="STOCK_UNIT" class="DA0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getSTOCK_UNIT()) %>" maxlength="12" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-c_NoCheckStockUnit">
expj.DA0020010.DA0020010form2.c_NoCheckStockUnit = {};
expj.DA0020010.DA0020010form2.c_NoCheckStockUnit.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/c_NoCheckStockUnit.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.c_NoCheckStockUnit.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-c_NoCheckStockUnit').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010form2', 'c_NoCheckStockUnit', this, 'CheckBox');
    }
  });
  expj.DA0020010.DA0020010form2.c_NoCheckStockUnit.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.c_NoCheckStockUnit.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/c_NoCheckStockUnit.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-c_NoCheckStockUnit');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_NoCheckStockUnit" value="true" <%= ("true".equals(TypeConverter.convert(aDA0020010Struct.getc_NoCheckStockUnit())) || "1".equals(TypeConverter.convert(aDA0020010Struct.getc_NoCheckStockUnit())))?"checked=\"checked\"":"" %>  class="DA0020010-focus-move" id="expj-DA0020010-DA0020010form2-c_NoCheckStockUnit"><label for="expj-DA0020010-DA0020010form2-c_NoCheckStockUnit"><%=CoreTools.getRBString("Expj.Cmt0253",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ORG_CD",rb)%></span><!-- 部門コード --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-ORG_CD">
expj.DA0020010.DA0020010form2.ORG_CD = {};
expj.DA0020010.DA0020010form2.ORG_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/ORG_CD.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.ORG_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'ORG_CD', this);
  });
  expj.DA0020010.DA0020010form2.ORG_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.ORG_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-ORG_CD" name="ORG_CD" class="DA0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getORG_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-PeekerOrgCd">
expj.DA0020010.DA0020010form2.PeekerOrgCd = {};
// script1="onClick;0;PEEKER;_DA0020010form2/ORG_CD:_DA0020010form2/ORG_NAME@<%=contextNo%>"
expj.DA0020010.DA0020010form2.PeekerOrgCd.onClick0 = function () {
  console.log('PeekerOrgCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0020010';
var parameterValues = 'PeekerOrgCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form2', '_ORG_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0020010form2/ORG_CD:_DA0020010form2/ORG_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0020010.DA0020010form2.PeekerOrgCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010form2.PeekerOrgCd['onClick' + i])) {
        expj.DA0020010.DA0020010form2.PeekerOrgCd['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010form2.PeekerOrgCd.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010form2.PeekerOrgCd.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-PeekerOrgCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010form2', 'PeekerOrgCd', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010form2.PeekerOrgCd.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.PeekerOrgCd.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/PeekerOrgCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-PeekerOrgCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0020010-DA0020010form2-PeekerOrgCd" class="DA0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-ORG_NAME">
expj.DA0020010.DA0020010form2.ORG_NAME = {};
expj.DA0020010.DA0020010form2.ORG_NAME.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/ORG_NAME.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.ORG_NAME.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'ORG_NAME', this);
  });
  expj.DA0020010.DA0020010form2.ORG_NAME.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-ORG_NAME" name="ORG_NAME" class="DA0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ONEROUS_CONS_FLG",rb)%></span><!-- 有償支給品フラグ --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-ONEROUS_CONS_FLG">
expj.DA0020010.DA0020010form2.ONEROUS_CONS_FLG = {};
expj.DA0020010.DA0020010form2.ONEROUS_CONS_FLG.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/ONEROUS_CONS_FLG.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.ONEROUS_CONS_FLG.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-ONEROUS_CONS_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0020010', 'DA0020010form2', 'ONEROUS_CONS_FLG', this);
  });
  expj.DA0020010.DA0020010form2.ONEROUS_CONS_FLG.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.ONEROUS_CONS_FLG.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/ONEROUS_CONS_FLG.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-ONEROUS_CONS_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0020010-DA0020010form2-ONEROUS_CONS_FLG" name='ONEROUS_CONS_FLG' class='DA0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0020010Control.getStruct().getList_ONEROUS_CONS_FLG_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_ONEROUS_CONS_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_ONEROUS_CONS_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0020010Struct.getONEROUS_CONS_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-VEND_CD">
expj.DA0020010.DA0020010form2.VEND_CD = {};
expj.DA0020010.DA0020010form2.VEND_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/VEND_CD.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.VEND_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'VEND_CD', this);
  });
  expj.DA0020010.DA0020010form2.VEND_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-VEND_CD" name="VEND_CD" class="DA0020010-focus-move  required-value expj-DA0020010-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-PeekerVendCd">
expj.DA0020010.DA0020010form2.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_DA0020010form2/VEND_CD:_DA0020010form2/VEND_NAME@<%=contextNo%>"
expj.DA0020010.DA0020010form2.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0020010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form2', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0020010form2/VEND_CD:_DA0020010form2/VEND_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0020010.DA0020010form2.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010form2.PeekerVendCd['onClick' + i])) {
        expj.DA0020010.DA0020010form2.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010form2.PeekerVendCd.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010form2.PeekerVendCd.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010form2', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010form2.PeekerVendCd.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0020010-DA0020010form2-PeekerVendCd" class="DA0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-VEND_NAME">
expj.DA0020010.DA0020010form2.VEND_NAME = {};
expj.DA0020010.DA0020010form2.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/VEND_NAME.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.VEND_NAME.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'VEND_NAME', this);
  });
  expj.DA0020010.DA0020010form2.VEND_NAME.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-VEND_NAME" name="VEND_NAME" class="DA0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getVEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST_2",rb)%></span><!-- 購入単価 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-UNIT_COST">
expj.DA0020010.DA0020010form2.UNIT_COST = {};
expj.DA0020010.DA0020010form2.UNIT_COST.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/UNIT_COST.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.UNIT_COST.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'UNIT_COST', this);
  });
  expj.DA0020010.DA0020010form2.UNIT_COST.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-UNIT_COST" name="UNIT_COST" class="DA0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getUNIT_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-CUR_UNIT">
expj.DA0020010.DA0020010form2.CUR_UNIT = {};
expj.DA0020010.DA0020010form2.CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/CUR_UNIT.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.CUR_UNIT.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'CUR_UNIT', this);
  });
  expj.DA0020010.DA0020010form2.CUR_UNIT.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-CUR_UNIT" name="CUR_UNIT" class="DA0020010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getCUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST_TYP_2",rb)%></span><!-- 購入単価区分 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-UNIT_COST_TYP">
expj.DA0020010.DA0020010form2.UNIT_COST_TYP = {};
expj.DA0020010.DA0020010form2.UNIT_COST_TYP.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/UNIT_COST_TYP.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.UNIT_COST_TYP.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-UNIT_COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0020010', 'DA0020010form2', 'UNIT_COST_TYP', this);
  });
  expj.DA0020010.DA0020010form2.UNIT_COST_TYP.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.UNIT_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/UNIT_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-UNIT_COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0020010-DA0020010form2-UNIT_COST_TYP" name='UNIT_COST_TYP' class='DA0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0020010Control.getStruct().getList_UNIT_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_UNIT_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_UNIT_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0020010Struct.getUNIT_COST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_UNIT_QTY",rb)%></span><!-- 購入品単位数 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-PUCH_UNIT_QTY">
expj.DA0020010.DA0020010form2.PUCH_UNIT_QTY = {};
expj.DA0020010.DA0020010form2.PUCH_UNIT_QTY.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/PUCH_UNIT_QTY.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.PUCH_UNIT_QTY.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-PUCH_UNIT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'PUCH_UNIT_QTY', this);
  });
  expj.DA0020010.DA0020010form2.PUCH_UNIT_QTY.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.PUCH_UNIT_QTY.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/PUCH_UNIT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-PUCH_UNIT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-PUCH_UNIT_QTY" name="PUCH_UNIT_QTY" class="DA0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getPUCH_UNIT_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUR_CD_1",rb)%></span><!-- 取引通貨コード --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-CUR_CD">
expj.DA0020010.DA0020010form2.CUR_CD = {};
expj.DA0020010.DA0020010form2.CUR_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/CUR_CD.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.CUR_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'CUR_CD', this);
  });
  expj.DA0020010.DA0020010form2.CUR_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-CUR_CD" name="CUR_CD" class="DA0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getCUR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-PeekerCurCd">
expj.DA0020010.DA0020010form2.PeekerCurCd = {};
// script1="onClick;0;PEEKER;_DA0020010form2/CUR_CD:_DA0020010form2/CUR_NAME@<%=contextNo%>"
expj.DA0020010.DA0020010form2.PeekerCurCd.onClick0 = function () {
  console.log('PeekerCurCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0020010';
var parameterValues = 'PeekerCurCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form2', '_CUR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUR_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0020010form2/CUR_CD:_DA0020010form2/CUR_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0020010.DA0020010form2.PeekerCurCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010form2.PeekerCurCd['onClick' + i])) {
        expj.DA0020010.DA0020010form2.PeekerCurCd['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010form2.PeekerCurCd.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010form2.PeekerCurCd.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-PeekerCurCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010form2', 'PeekerCurCd', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010form2.PeekerCurCd.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.PeekerCurCd.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/PeekerCurCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-PeekerCurCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0020010-DA0020010form2-PeekerCurCd" class="DA0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-CUR_NAME">
expj.DA0020010.DA0020010form2.CUR_NAME = {};
expj.DA0020010.DA0020010form2.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/CUR_NAME.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.CUR_NAME.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'CUR_NAME', this);
  });
  expj.DA0020010.DA0020010form2.CUR_NAME.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-CUR_NAME" name="CUR_NAME" class="DA0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getCUR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EXCH_RATE_1",rb)%></span><!-- 取引為替レート --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-EXCH_RATE">
expj.DA0020010.DA0020010form2.EXCH_RATE = {};
expj.DA0020010.DA0020010form2.EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/EXCH_RATE.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.EXCH_RATE.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'EXCH_RATE', this);
  });
  expj.DA0020010.DA0020010form2.EXCH_RATE.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-EXCH_RATE" name="EXCH_RATE" class="DA0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;6" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getEXCH_RATE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SUB_VEND_CD",rb)%></span><!-- 第二取引先コード --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-SUB_VEND_CD">
expj.DA0020010.DA0020010form2.SUB_VEND_CD = {};
expj.DA0020010.DA0020010form2.SUB_VEND_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/SUB_VEND_CD.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.SUB_VEND_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-SUB_VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'SUB_VEND_CD', this);
  });
  expj.DA0020010.DA0020010form2.SUB_VEND_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.SUB_VEND_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/SUB_VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-SUB_VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-SUB_VEND_CD" name="SUB_VEND_CD" class="DA0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getSUB_VEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-PeekerSubVendCd">
expj.DA0020010.DA0020010form2.PeekerSubVendCd = {};
// script1="onClick;0;PEEKER;_DA0020010form2/SUB_VEND_CD:_DA0020010form2/SUB_VEND_NAME@<%=contextNo%>"
expj.DA0020010.DA0020010form2.PeekerSubVendCd.onClick0 = function () {
  console.log('PeekerSubVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0020010';
var parameterValues = 'PeekerSubVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form2', '_SUB_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0020010form2/SUB_VEND_CD:_DA0020010form2/SUB_VEND_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0020010.DA0020010form2.PeekerSubVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010form2.PeekerSubVendCd['onClick' + i])) {
        expj.DA0020010.DA0020010form2.PeekerSubVendCd['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010form2.PeekerSubVendCd.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010form2.PeekerSubVendCd.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-PeekerSubVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010form2', 'PeekerSubVendCd', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010form2.PeekerSubVendCd.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.PeekerSubVendCd.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/PeekerSubVendCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-PeekerSubVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0020010-DA0020010form2-PeekerSubVendCd" class="DA0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-SUB_VEND_NAME">
expj.DA0020010.DA0020010form2.SUB_VEND_NAME = {};
expj.DA0020010.DA0020010form2.SUB_VEND_NAME.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/SUB_VEND_NAME.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.SUB_VEND_NAME.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-SUB_VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'SUB_VEND_NAME', this);
  });
  expj.DA0020010.DA0020010form2.SUB_VEND_NAME.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.SUB_VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/SUB_VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-SUB_VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-SUB_VEND_NAME" name="SUB_VEND_NAME" class="DA0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getSUB_VEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SUB_UNIT_COST",rb)%></span><!-- 第二購入単価 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-SUB_UNIT_COST">
expj.DA0020010.DA0020010form2.SUB_UNIT_COST = {};
expj.DA0020010.DA0020010form2.SUB_UNIT_COST.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/SUB_UNIT_COST.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.SUB_UNIT_COST.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-SUB_UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'SUB_UNIT_COST', this);
  });
  expj.DA0020010.DA0020010form2.SUB_UNIT_COST.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.SUB_UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/SUB_UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-SUB_UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-SUB_UNIT_COST" name="SUB_UNIT_COST" class="DA0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getSUB_UNIT_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-SUB_CUR_UNIT">
expj.DA0020010.DA0020010form2.SUB_CUR_UNIT = {};
expj.DA0020010.DA0020010form2.SUB_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/SUB_CUR_UNIT.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.SUB_CUR_UNIT.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-SUB_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'SUB_CUR_UNIT', this);
  });
  expj.DA0020010.DA0020010form2.SUB_CUR_UNIT.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.SUB_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/SUB_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-SUB_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-SUB_CUR_UNIT" name="SUB_CUR_UNIT" class="DA0020010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getSUB_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SUB_UNIT_COST_TYP",rb)%></span><!-- 第二購入単価区分 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-SUB_UNIT_COST_TYP">
expj.DA0020010.DA0020010form2.SUB_UNIT_COST_TYP = {};
expj.DA0020010.DA0020010form2.SUB_UNIT_COST_TYP.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/SUB_UNIT_COST_TYP.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.SUB_UNIT_COST_TYP.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-SUB_UNIT_COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0020010', 'DA0020010form2', 'SUB_UNIT_COST_TYP', this);
  });
  expj.DA0020010.DA0020010form2.SUB_UNIT_COST_TYP.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.SUB_UNIT_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/SUB_UNIT_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-SUB_UNIT_COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0020010-DA0020010form2-SUB_UNIT_COST_TYP" name='SUB_UNIT_COST_TYP' class='DA0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0020010Control.getStruct().getList_SUB_UNIT_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_SUB_UNIT_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0020010Control.getStruct().getList_SUB_UNIT_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0020010Struct.getSUB_UNIT_COST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SUB_PUCH_UNIT_QTY",rb)%></span><!-- 第二購入品単位数 --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-SUB_PUCH_UNIT_QTY">
expj.DA0020010.DA0020010form2.SUB_PUCH_UNIT_QTY = {};
expj.DA0020010.DA0020010form2.SUB_PUCH_UNIT_QTY.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/SUB_PUCH_UNIT_QTY.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.SUB_PUCH_UNIT_QTY.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-SUB_PUCH_UNIT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'SUB_PUCH_UNIT_QTY', this);
  });
  expj.DA0020010.DA0020010form2.SUB_PUCH_UNIT_QTY.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.SUB_PUCH_UNIT_QTY.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/SUB_PUCH_UNIT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-SUB_PUCH_UNIT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-SUB_PUCH_UNIT_QTY" name="SUB_PUCH_UNIT_QTY" class="DA0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getSUB_PUCH_UNIT_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SUB_CUR_CD",rb)%></span><!-- 第二取引通貨コード --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-SUB_CUR_CD">
expj.DA0020010.DA0020010form2.SUB_CUR_CD = {};
expj.DA0020010.DA0020010form2.SUB_CUR_CD.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/SUB_CUR_CD.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.SUB_CUR_CD.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-SUB_CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'SUB_CUR_CD', this);
  });
  expj.DA0020010.DA0020010form2.SUB_CUR_CD.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.SUB_CUR_CD.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/SUB_CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-SUB_CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-SUB_CUR_CD" name="SUB_CUR_CD" class="DA0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getSUB_CUR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-PeekerSubCurCd">
expj.DA0020010.DA0020010form2.PeekerSubCurCd = {};
// script1="onClick;0;PEEKER;_DA0020010form2/SUB_CUR_CD:_DA0020010form2/SUB_CUR_NAME@<%=contextNo%>"
expj.DA0020010.DA0020010form2.PeekerSubCurCd.onClick0 = function () {
  console.log('PeekerSubCurCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0020010';
var parameterValues = 'PeekerSubCurCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010form2', '_SUB_CUR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUR_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0020010form2/SUB_CUR_CD:_DA0020010form2/SUB_CUR_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0020010.DA0020010form2.PeekerSubCurCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010form2.PeekerSubCurCd['onClick' + i])) {
        expj.DA0020010.DA0020010form2.PeekerSubCurCd['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010form2.PeekerSubCurCd.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010form2.PeekerSubCurCd.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-PeekerSubCurCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010form2', 'PeekerSubCurCd', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010form2.PeekerSubCurCd.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.PeekerSubCurCd.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/PeekerSubCurCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-PeekerSubCurCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0020010-DA0020010form2-PeekerSubCurCd" class="DA0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-SUB_CUR_NAME">
expj.DA0020010.DA0020010form2.SUB_CUR_NAME = {};
expj.DA0020010.DA0020010form2.SUB_CUR_NAME.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/SUB_CUR_NAME.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.SUB_CUR_NAME.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-SUB_CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'SUB_CUR_NAME', this);
  });
  expj.DA0020010.DA0020010form2.SUB_CUR_NAME.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.SUB_CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/SUB_CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-SUB_CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-SUB_CUR_NAME" name="SUB_CUR_NAME" class="DA0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getSUB_CUR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SUB_EXCH_RATE",rb)%></span><!-- 第二取引為替レート --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010form2-SUB_EXCH_RATE">
expj.DA0020010.DA0020010form2.SUB_EXCH_RATE = {};
expj.DA0020010.DA0020010form2.SUB_EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/SUB_EXCH_RATE.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.SUB_EXCH_RATE.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-SUB_EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'SUB_EXCH_RATE', this);
  });
  expj.DA0020010.DA0020010form2.SUB_EXCH_RATE.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.SUB_EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/SUB_EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-SUB_EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0020010-DA0020010form2-SUB_EXCH_RATE" name="SUB_EXCH_RATE" class="DA0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;6" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getSUB_EXCH_RATE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-DA0020010-DA0020010form2-DEL_FLG" name="DEL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0020010Struct.getDEL_FLG()) %>">
<script class="expj-script-DA0020010-DA0020010form2-DEL_FLG">
expj.DA0020010.DA0020010form2.DEL_FLG = {};
expj.DA0020010.DA0020010form2.DEL_FLG.executeAllOnDecision = function () {
  console.log('execute DA0020010form2/DEL_FLG.onDecision');
  expj.DA0020010.DA0020010form2.executeAllOnDecision();
  expj.DA0020010.executeAllOnDecision();
};
expj.DA0020010.DA0020010form2.DEL_FLG.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010form2-DEL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0020010', 'DA0020010form2', 'DEL_FLG', this);
  });
  expj.DA0020010.DA0020010form2.DEL_FLG.executePScriptOnLoad();
};

expj.DA0020010.DA0020010form2.DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute DA0020010form2/DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010form2-DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 504px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-DA0020010-DA0020010button2">
expj.DA0020010.DA0020010button2 = {};
expj.DA0020010.DA0020010button2.executeAllOnDecision = function () {
  console.log('execute DA0020010button2.onDecision');
};
expj.DA0020010.DA0020010button2.executeOnLoad = function () {
  expj.DA0020010.DA0020010button2.executePScriptOnLoad();
};

expj.DA0020010.DA0020010button2.executePScriptOnLoad = function () {
  console.log('execute DA0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0020010-DA0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0020010-DA0020010button2-Insert">
expj.DA0020010.DA0020010button2.Insert = {};
// script1="onClick;0;CHK;_DA0020010form2/SUB_VEND_CD[eq][and]_DA0020010form2/UNIT_COST_ACCEPT_TYP[eq]2@#DA02101"
expj.DA0020010.DA0020010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_VEND_CD'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/UNIT_COST_ACCEPT_TYP'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('DA0020010', 'DA0020010button2', 'DA02101');
}
};
// script2="onClick;1;CHK;_DA0020010form2/c_NoCheckClasificationCd[neq]true[and]_DA0020010form2/CLASIFICATION_CD[eq]@$DA02103"
expj.DA0020010.DA0020010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/c_NoCheckClasificationCd'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/CLASIFICATION_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02103');
}
};
// script3="onClick;2;CHK;_DA0020010form2/c_NoCheckStockUnit[neq]true[and]_DA0020010form2/STOCK_UNIT[eq]@$DA02104"
expj.DA0020010.DA0020010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/c_NoCheckStockUnit'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/STOCK_UNIT'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02104');
}
};
// script4="onClick;3;CHK;_DA0020010form2/UNIT_COST[numeq]0@$DA02105"
expj.DA0020010.DA0020010button2.Insert.onClick3 = function () {
  console.log('Insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/UNIT_COST')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02105');
}
};
// script5="onClick;4;CHK;_DA0020010form2/CUR_CD[eq]@$DA02106"
expj.DA0020010.DA0020010button2.Insert.onClick4 = function () {
  console.log('Insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/CUR_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02106');
}
};
// script6="onClick;5;CHK;_DA0020010form2/EXCH_RATE[numeq]0@$DA02107"
expj.DA0020010.DA0020010button2.Insert.onClick5 = function () {
  console.log('Insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/EXCH_RATE')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02107');
}
};
// script7="onClick;6;CHK;_DA0020010form2/SUB_VEND_CD[neq][and]_DA0020010form2/SUB_UNIT_COST[numeq]0@$DA02108"
expj.DA0020010.DA0020010button2.Insert.onClick6 = function () {
  console.log('Insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_VEND_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_UNIT_COST')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02108');
}
};
// script8="onClick;7;CHK;_DA0020010form2/SUB_VEND_CD[neq][and]_DA0020010form2/SUB_CUR_CD[eq]@$DA02109"
expj.DA0020010.DA0020010button2.Insert.onClick7 = function () {
  console.log('Insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_VEND_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_CUR_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02109');
}
};
// script9="onClick;8;CHK;_DA0020010form2/SUB_VEND_CD[neq][and]_DA0020010form2/SUB_EXCH_RATE[numeq]0@$DA02110"
expj.DA0020010.DA0020010button2.Insert.onClick8 = function () {
  console.log('Insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_VEND_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_EXCH_RATE')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02110');
}
};
// script10="onClick;9;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0020010form1/*,_DA0020010form2/*@DA0020010Servlet,,$ZZ07001"
expj.DA0020010.DA0020010button2.Insert.onClick9 = function () {
  console.log('Insert script10');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0020010', 'DA0020010button2', '_DA0020010form1/*,_DA0020010form2/*', 'DA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0020010', response);
expj.common.updateBusinessScreenTab('DA0020010', contents);
};
expj.common.pscript.callConfirm('DA0020010', 'DA0020010button2', 'ZZ07001', okEvent);
};
expj.DA0020010.DA0020010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 9; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010button2.Insert['onClick' + i])) {
        expj.DA0020010.DA0020010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010button2.Insert.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010button2.Insert.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010button2', 'Insert', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010button2.Insert.executePScriptOnLoad();
};

expj.DA0020010.DA0020010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute DA0020010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0020010-DA0020010button2-Insert" name="Insert" class="DA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010button2-Update">
expj.DA0020010.DA0020010button2.Update = {};
// script1="onClick;0;CHK;_DA0020010form2/SUB_VEND_CD[eq][and]_DA0020010form2/UNIT_COST_ACCEPT_TYP[eq]2@#DA02101"
expj.DA0020010.DA0020010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_VEND_CD'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/UNIT_COST_ACCEPT_TYP'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('DA0020010', 'DA0020010button2', 'DA02101');
}
};
// script2="onClick;1;CHK;_DA0020010form2/CS_PUCH_TYP[neq]_DA0020010form2/h_CS_PUCH_TYP@#DA02102"
expj.DA0020010.DA0020010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/CS_PUCH_TYP'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/h_CS_PUCH_TYP'))) {
expj.common.pscript.addErrorMessage('DA0020010', 'DA0020010button2', 'DA02102');
}
};
// script3="onClick;2;CHK;_DA0020010form2/c_NoCheckClasificationCd[neq]true[and]_DA0020010form2/CLASIFICATION_CD[eq]@$DA02103"
expj.DA0020010.DA0020010button2.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/c_NoCheckClasificationCd'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/CLASIFICATION_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02103');
}
};
// script4="onClick;3;CHK;_DA0020010form2/c_NoCheckStockUnit[neq]true[and]_DA0020010form2/STOCK_UNIT[eq]@$DA02104"
expj.DA0020010.DA0020010button2.Update.onClick3 = function () {
  console.log('Update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/c_NoCheckStockUnit'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/STOCK_UNIT'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02104');
}
};
// script5="onClick;4;CHK;_DA0020010form2/UNIT_COST[numeq]0@$DA02105"
expj.DA0020010.DA0020010button2.Update.onClick4 = function () {
  console.log('Update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/UNIT_COST')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02105');
}
};
// script6="onClick;5;CHK;_DA0020010form2/CUR_CD[eq]@$DA02106"
expj.DA0020010.DA0020010button2.Update.onClick5 = function () {
  console.log('Update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/CUR_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02106');
}
};
// script7="onClick;6;CHK;_DA0020010form2/EXCH_RATE[numeq]0@$DA02107"
expj.DA0020010.DA0020010button2.Update.onClick6 = function () {
  console.log('Update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/EXCH_RATE')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02107');
}
};
// script8="onClick;7;CHK;_DA0020010form2/SUB_VEND_CD[neq][and]_DA0020010form2/SUB_UNIT_COST[numeq]0@$DA02108"
expj.DA0020010.DA0020010button2.Update.onClick7 = function () {
  console.log('Update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_VEND_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_UNIT_COST')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02108');
}
};
// script9="onClick;8;CHK;_DA0020010form2/SUB_VEND_CD[neq][and]_DA0020010form2/SUB_CUR_CD[eq]@$DA02109"
expj.DA0020010.DA0020010button2.Update.onClick8 = function () {
  console.log('Update script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_VEND_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_CUR_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02109');
}
};
// script10="onClick;9;CHK;_DA0020010form2/SUB_VEND_CD[neq][and]_DA0020010form2/SUB_EXCH_RATE[numeq]0@$DA02110"
expj.DA0020010.DA0020010button2.Update.onClick9 = function () {
  console.log('Update script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_VEND_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DA0020010', 'DA0020010button2', '_DA0020010form2/SUB_EXCH_RATE')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addWarningMessage('DA0020010', 'DA0020010button2', 'DA02110');
}
};
// script11="onClick;10;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0020010form1/*,_DA0020010form2/*@DA0020010Servlet,,$ZZ07003"
expj.DA0020010.DA0020010button2.Update.onClick10 = function () {
  console.log('Update script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0020010', 'DA0020010button2', '_DA0020010form1/*,_DA0020010form2/*', 'DA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0020010', response);
expj.common.updateBusinessScreenTab('DA0020010', contents);
};
expj.common.pscript.callConfirm('DA0020010', 'DA0020010button2', 'ZZ07003', okEvent);
};
expj.DA0020010.DA0020010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010button2.Update['onClick' + i])) {
        expj.DA0020010.DA0020010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010button2.Update.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010button2.Update.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010button2', 'Update', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010button2.Update.executePScriptOnLoad();
};

expj.DA0020010.DA0020010button2.Update.executePScriptOnLoad = function () {
  console.log('execute DA0020010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0020010-DA0020010button2-Update" name="Update" class="DA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010button2-Delete">
expj.DA0020010.DA0020010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0020010form1/*,_DA0020010form2/*@DA0020010Servlet,,$ZZ07004"
expj.DA0020010.DA0020010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0020010', 'DA0020010button2', '_DA0020010form1/*,_DA0020010form2/*', 'DA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0020010', response);
expj.common.updateBusinessScreenTab('DA0020010', contents);
};
expj.common.pscript.callConfirm('DA0020010', 'DA0020010button2', 'ZZ07004', okEvent);
};
expj.DA0020010.DA0020010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010button2.Delete['onClick' + i])) {
        expj.DA0020010.DA0020010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010button2.Delete.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010button2.Delete.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010button2', 'Delete', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010button2.Delete.executePScriptOnLoad();
};

expj.DA0020010.DA0020010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute DA0020010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0020010-DA0020010button2-Delete" name="Delete" class="DA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010button2-CancelDelete">
expj.DA0020010.DA0020010button2.CancelDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0020010form1/*,_DA0020010form2/*@DA0020010Servlet,,$ZZ07016"
expj.DA0020010.DA0020010button2.CancelDelete.onClick0 = function () {
  console.log('CancelDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0020010', 'DA0020010button2', '_DA0020010form1/*,_DA0020010form2/*', 'DA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0020010', response);
expj.common.updateBusinessScreenTab('DA0020010', contents);
};
expj.common.pscript.callConfirm('DA0020010', 'DA0020010button2', 'ZZ07016', okEvent);
};
expj.DA0020010.DA0020010button2.CancelDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010button2.CancelDelete['onClick' + i])) {
        expj.DA0020010.DA0020010button2.CancelDelete['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010button2.CancelDelete.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010button2.CancelDelete.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010button2-CancelDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010button2', 'CancelDelete', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010button2.CancelDelete.executePScriptOnLoad();
};

expj.DA0020010.DA0020010button2.CancelDelete.executePScriptOnLoad = function () {
  console.log('execute DA0020010button2/CancelDelete.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010button2-CancelDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0020010-DA0020010button2-CancelDelete" name="CancelDelete" class="DA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelDelete",rb)%></button><!-- 削除取消ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">DA0020010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-DA0020010-DA0020010button0">
expj.DA0020010.DA0020010button0 = {};
expj.DA0020010.DA0020010button0.executeAllOnDecision = function () {
  console.log('execute DA0020010button0.onDecision');
};
expj.DA0020010.DA0020010button0.executeOnLoad = function () {
  expj.DA0020010.DA0020010button0.executePScriptOnLoad();
};

expj.DA0020010.DA0020010button0.executePScriptOnLoad = function () {
  console.log('execute DA0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0020010-DA0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0020010-DA0020010button0-Clear">
expj.DA0020010.DA0020010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DA0020010Servlet,,$ZZ07008"
expj.DA0020010.DA0020010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0020010', 'DA0020010button0', '', 'DA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0020010', response);
expj.common.updateBusinessScreenTab('DA0020010', contents);
};
expj.common.pscript.callConfirm('DA0020010', 'DA0020010button0', 'ZZ07008', okEvent);
};
expj.DA0020010.DA0020010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010button0.Clear['onClick' + i])) {
        expj.DA0020010.DA0020010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010button0.Clear.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010button0.Clear.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010button0', 'Clear', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010button0.Clear.executePScriptOnLoad();
};

expj.DA0020010.DA0020010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DA0020010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0020010-DA0020010button0-Clear" name="Clear" class="DA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-DA0020010-DA0020010button0-Close">
expj.DA0020010.DA0020010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DA0020010.DA0020010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DA0020010');
};
expj.DA0020010.DA0020010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0020010.DA0020010button0.Close['onClick' + i])) {
        expj.DA0020010.DA0020010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DA0020010.DA0020010button0.Close.executeAllOnDecision = function () {
};
expj.DA0020010.DA0020010button0.Close.executeOnLoad = function () {
  $('#expj-DA0020010-DA0020010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0020010', 'DA0020010button0', 'Close', this, 'Button');
    }
  });
  expj.DA0020010.DA0020010button0.Close.executePScriptOnLoad();
};

expj.DA0020010.DA0020010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DA0020010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DA0020010-DA0020010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0020010-DA0020010button0-Close" name="Close" class="DA0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DA0020010 (END)-->
<%
MessageStruct msgStruct = aDA0020010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DA0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DA0020010)) {
  expj.common.treeInstanceMap.DA0020010 = {};
}
expj.common.treeInstanceMap.DA0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DA0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DA0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DA0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DA0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DA0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DA0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DA0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DA0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DA0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DA0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0020010)) {
  expj.common.detailDialogMap.DA0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DA0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.DA0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DA0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DA0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DA0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DA0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DA0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DA0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DA0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DA0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DA0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DA0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DA0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DA0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DA0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DA0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DA0020010)) {
  expj.common.viewInstanceMap.DA0020010 = {};
}
expj.common.viewInstanceMap.DA0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.DA0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DA0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DA0020010.<%=viewId %>.init = function () {
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
    expj.DA0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DA0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DA0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DA0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DA0020010_init">
/**
 * DA0020010用のロード完了時初期化関数
 */
expj.DA0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DA0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DA0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DA0020010');
  expj.common.calendarInstanceMap.DA0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DA0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DA0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.DA0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DA0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DA0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DA0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DA0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DA0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DA0020010-<%=detailId %>');
<%
 }
%>
  try{expj.DA0020010.DA0020010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.YEAR.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.h_YEAR.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.h_HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.h_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.h_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.CS_PUCH_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.h_CS_PUCH_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.CS_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.PeekerCsProcCd.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.CS_PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.UNIT_COST_ACCEPT_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.CLASIFICATION_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.c_NoCheckClasificationCd.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.c_NoCheckStockUnit.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.ORG_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.PeekerOrgCd.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.ONEROUS_CONS_FLG.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.UNIT_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.PUCH_UNIT_QTY.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.PeekerCurCd.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.SUB_VEND_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.PeekerSubVendCd.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.SUB_VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.SUB_UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.SUB_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.SUB_UNIT_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.SUB_PUCH_UNIT_QTY.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.SUB_CUR_CD.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.PeekerSubCurCd.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.SUB_CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.SUB_EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010button2.Update.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010button2.CancelDelete.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form1.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010button1.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010form2.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010button2.executeOnLoad();}catch(e){};
  try{expj.DA0020010.DA0020010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DA0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DA0020010', 'DA0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DA0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DA0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.DA0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DA0020010', '<%=request.getContextPath() %>');
};

/**
 * DA0020010の全体onDecision処理
 */
expj.DA0020010.executeAllOnDecision = function () {
  expj.DA0020010.DA0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DA0020010_console">
expj.DA0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>