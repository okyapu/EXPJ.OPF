<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:49:33 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DA0030\DA0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DA0030.*" %>
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
<jsp:useBean id="aDA0030010Control" class="com.nec.jp.orteus.metamorBase.DA0030.DA0030010Control" scope="request"/>
<jsp:useBean id="aDA0030010Struct" class="com.nec.jp.orteus.metamorBase.DA0030.DA0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

���H��}�X�^�����e�i���X
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0030/jsp/DA0030010.jsp,v $
$Author: geng-jia $
$Revision: 1.6 $ $Date: 2017/02/22 02:06:37 $
********************************************************* --%>
<html>
<head>
<title>���H��}�X�^�����e�i���X</title>
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
<script class="expj-script-DA0030010_init">
  // DA0030010���O���
  expj.DA0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DA0030010" data-screen="DA0030010" data-newdata="<%=aDA0030010Control.isNewData() %>">
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
            <script class="expj-script-DA0030010-DA0030010form1">
expj.DA0030010.DA0030010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.DA0030010.DA0030010form1.onLoad0 = function () {
  console.log('DA0030010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DA0030010.DA0030010form1.onDecision0 = function () {
  console.log('DA0030010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DA0030010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DA0030010button1/Select"
expj.DA0030010.DA0030010form1.child0 = function () {
  console.log('DA0030010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DA0030010', 'DA0030010form1', '_DA0030010button1/Select');
};
// script4="child;1;MASK;_DA0030010button1/Select"
expj.DA0030010.DA0030010form1.child1 = function () {
  console.log('DA0030010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DA0030010', 'DA0030010form1', '_DA0030010button1/Select');
};
// script5="onDecision;1;CHKRQ;A@*2,*4"
expj.DA0030010.DA0030010form1.onDecision1 = function () {
  console.log('DA0030010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('DA0030010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;_PLANT_CD[neq]_h_PLANT_CD[or]_YEAR[neq]_h_YEAR[or]_HALF_TERM_TYP[neq]_h_HALF_TERM_TYP[or]_COST_TYP[neq]_h_COST_TYP[or]_CS_PROC_CD[neq]_h_CS_PROC_CD[or]_PROC_COST_CLS_CD[neq]_h_PROC_COST_CLS_CD@*3,*4"
expj.DA0030010.DA0030010form1.child2 = function () {
  console.log('DA0030010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PLANT_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_PLANT_CD')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_YEAR'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_YEAR')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_HALF_TERM_TYP'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_HALF_TERM_TYP')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_COST_TYP'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_COST_TYP')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_CS_PROC_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_CS_PROC_CD')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PROC_COST_CLS_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_PROC_COST_CLS_CD'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_DA0030010button2/Insert"
expj.DA0030010.DA0030010form1.child3 = function () {
  console.log('DA0030010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('DA0030010', 'DA0030010form1', '_DA0030010button2/Insert');
};
// script8="child;4;MASK;_DA0030010button2/Insert"
expj.DA0030010.DA0030010form1.child4 = function () {
  console.log('DA0030010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('DA0030010', 'DA0030010form1', '_DA0030010button2/Insert');
};
// script9="onDecision;2;CHK;?DA0030010form1/*[eq]NORMAL@*5,*8"
expj.DA0030010.DA0030010form1.onDecision2 = function () {
  console.log('DA0030010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '?DA0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;5;CHKRQ;A@*6,*8"
expj.DA0030010.DA0030010form1.child5 = function () {
  console.log('DA0030010form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('DA0030010', 'A')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;6;CHK;_DA0030010form2/DEL_FLG[eq]0[and]_PLANT_CD[eq]_h_PLANT_CD[and]_YEAR[eq]_h_YEAR[and]_HALF_TERM_TYP[eq]_h_HALF_TERM_TYP[and]_COST_TYP[eq]_h_COST_TYP[and]_CS_PROC_CD[eq]_h_CS_PROC_CD[and]_PROC_COST_CLS_CD[eq]_h_PROC_COST_CLS_CD@*7,*8"
expj.DA0030010.DA0030010form1.child6 = function () {
  console.log('DA0030010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_DA0030010form2/DEL_FLG'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PLANT_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_PLANT_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_YEAR'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_YEAR')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_HALF_TERM_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_HALF_TERM_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_COST_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_COST_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_CS_PROC_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_CS_PROC_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PROC_COST_CLS_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_PROC_COST_CLS_CD'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_DA0030010button2/Update"
expj.DA0030010.DA0030010form1.child7 = function () {
  console.log('DA0030010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('DA0030010', 'DA0030010form1', '_DA0030010button2/Update');
};
// script13="child;8;MASK;_DA0030010button2/Update"
expj.DA0030010.DA0030010form1.child8 = function () {
  console.log('DA0030010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('DA0030010', 'DA0030010form1', '_DA0030010button2/Update');
};
// script14="onDecision;3;CHK;?DA0030010form1/*[eq]NORMAL@*9,*11"
expj.DA0030010.DA0030010form1.onDecision3 = function () {
  console.log('DA0030010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '?DA0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script15="child;9;CHK;_DA0030010form2/DEL_FLG[eq]0[and]_PLANT_CD[eq]_h_PLANT_CD[and]_YEAR[eq]_h_YEAR[and]_HALF_TERM_TYP[eq]_h_HALF_TERM_TYP[and]_COST_TYP[eq]_h_COST_TYP[and]_CS_PROC_CD[eq]_h_CS_PROC_CD[and]_PROC_COST_CLS_CD[eq]_h_PROC_COST_CLS_CD@*10,*11"
expj.DA0030010.DA0030010form1.child9 = function () {
  console.log('DA0030010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_DA0030010form2/DEL_FLG'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PLANT_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_PLANT_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_YEAR'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_YEAR')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_HALF_TERM_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_HALF_TERM_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_COST_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_COST_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_CS_PROC_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_CS_PROC_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PROC_COST_CLS_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_PROC_COST_CLS_CD'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;10;UNMASK;_DA0030010button2/Delete"
expj.DA0030010.DA0030010form1.child10 = function () {
  console.log('DA0030010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('DA0030010', 'DA0030010form1', '_DA0030010button2/Delete');
};
// script17="child;11;MASK;_DA0030010button2/Delete"
expj.DA0030010.DA0030010form1.child11 = function () {
  console.log('DA0030010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('DA0030010', 'DA0030010form1', '_DA0030010button2/Delete');
};
// script18="onDecision;4;CHK;?DA0030010form1/*[eq]NORMAL@*12,*14"
expj.DA0030010.DA0030010form1.onDecision4 = function () {
  console.log('DA0030010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '?DA0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script20="child;12;CHK;_DA0030010form2/DEL_FLG[eq]1[and]_PLANT_CD[eq]_h_PLANT_CD[and]_YEAR[eq]_h_YEAR[and]_HALF_TERM_TYP[eq]_h_HALF_TERM_TYP[and]_COST_TYP[eq]_h_COST_TYP[and]_CS_PROC_CD[eq]_h_CS_PROC_CD[and]_PROC_COST_CLS_CD[eq]_h_PROC_COST_CLS_CD@*13,*14"
expj.DA0030010.DA0030010form1.child12 = function () {
  console.log('DA0030010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_DA0030010form2/DEL_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PLANT_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_PLANT_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_YEAR'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_YEAR')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_HALF_TERM_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_HALF_TERM_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_COST_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_COST_TYP')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_CS_PROC_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_CS_PROC_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PROC_COST_CLS_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_h_PROC_COST_CLS_CD'))) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script21="child;13;UNMASK;_DA0030010button2/CancelDelete"
expj.DA0030010.DA0030010form1.child13 = function () {
  console.log('DA0030010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('DA0030010', 'DA0030010form1', '_DA0030010button2/CancelDelete');
};
// script22="child;14;MASK;_DA0030010button2/CancelDelete"
expj.DA0030010.DA0030010form1.child14 = function () {
  console.log('DA0030010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('DA0030010', 'DA0030010form1', '_DA0030010button2/CancelDelete');
};
expj.DA0030010.DA0030010form1.executeAllOnDecision = function () {
  console.log('execute DA0030010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010form1['onDecision' + i])) {
        expj.DA0030010.DA0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010form1.executeOnLoad = function () {
  expj.DA0030010.DA0030010form1.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DA0030010.DA0030010form1['onLoad' + i])) {
      expj.DA0030010.DA0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0030010-DA0030010form1" action="DA0030010Servlet" name="DA0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDA0030010Control.getReadStatusString()) %>" style="height:119px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:119px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- �H��R�[�h --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form1-PLANT_CD">
expj.DA0030010.DA0030010form1.PLANT_CD = {};
expj.DA0030010.DA0030010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/PLANT_CD.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'PLANT_CD', this);
  });
  expj.DA0030010.DA0030010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form1-PLANT_CD" name="PLANT_CD" class="DA0030010-focus-move  required-value expj-DA0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<input type="hidden" id="expj-DA0030010-DA0030010form1-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2" value="<%= TypeConverter.sanitizer(aDA0030010Struct.geth_PLANT_CD()) %>">
<script class="expj-script-DA0030010-DA0030010form1-h_PLANT_CD">
expj.DA0030010.DA0030010form1.h_PLANT_CD = {};
expj.DA0030010.DA0030010form1.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/h_PLANT_CD.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'h_PLANT_CD', this);
  });
  expj.DA0030010.DA0030010form1.h_PLANT_CD.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-DA0030010-DA0030010form1-PeekerPlantCd">
expj.DA0030010.DA0030010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DA0030010form1/PLANT_CD:_DA0030010form1/PLANT_NAME@<%=contextNo%>"
expj.DA0030010.DA0030010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0030010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0030010form1/PLANT_CD:_DA0030010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0030010.DA0030010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010form1.PeekerPlantCd['onClick' + i])) {
        expj.DA0030010.DA0030010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DA0030010.DA0030010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0030010', 'DA0030010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DA0030010.DA0030010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0030010-DA0030010form1-PeekerPlantCd" class="DA0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form1-PLANT_NAME">
expj.DA0030010.DA0030010form1.PLANT_NAME = {};
expj.DA0030010.DA0030010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/PLANT_NAME.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'PLANT_NAME', this);
  });
  expj.DA0030010.DA0030010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form1-PLANT_NAME" name="PLANT_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.YEAR",rb)%></span><!-- �N�x --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form1-YEAR">
expj.DA0030010.DA0030010form1.YEAR = {};
expj.DA0030010.DA0030010form1.YEAR.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/YEAR.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.YEAR.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'YEAR', this);
  });
  expj.DA0030010.DA0030010form1.YEAR.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.YEAR.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form1-YEAR" name="YEAR" class="DA0030010-focus-move expj-align-right required-value expj-DA0030010-required-A" style="width:150px;" data-kind="OBT_N" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getYEAR()) %>" maxlength="4" ></div><!--/td-->
<input type="hidden" id="expj-DA0030010-DA0030010form1-h_YEAR" name="h_YEAR" class="" data-kind="OBT_N" maxlength="4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.geth_YEAR()) %>">
<script class="expj-script-DA0030010-DA0030010form1-h_YEAR">
expj.DA0030010.DA0030010form1.h_YEAR = {};
expj.DA0030010.DA0030010form1.h_YEAR.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/h_YEAR.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.h_YEAR.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-h_YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'h_YEAR', this);
  });
  expj.DA0030010.DA0030010form1.h_YEAR.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.h_YEAR.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/h_YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-h_YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HALF_TERM_TYP",rb)%></span><!-- �����敪 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form1-HALF_TERM_TYP">
expj.DA0030010.DA0030010form1.HALF_TERM_TYP = {};
expj.DA0030010.DA0030010form1.HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/HALF_TERM_TYP.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-HALF_TERM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0030010', 'DA0030010form1', 'HALF_TERM_TYP', this);
  });
  expj.DA0030010.DA0030010form1.HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0030010-DA0030010form1-HALF_TERM_TYP" name='HALF_TERM_TYP' class='DA0030010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0030010Control.getStruct().getList_HALF_TERM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0030010Control.getStruct().getList_HALF_TERM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0030010Control.getStruct().getList_HALF_TERM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0030010Struct.getHALF_TERM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-DA0030010-DA0030010form1-h_HALF_TERM_TYP" name="h_HALF_TERM_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0030010Struct.geth_HALF_TERM_TYP()) %>">
<script class="expj-script-DA0030010-DA0030010form1-h_HALF_TERM_TYP">
expj.DA0030010.DA0030010form1.h_HALF_TERM_TYP = {};
expj.DA0030010.DA0030010form1.h_HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/h_HALF_TERM_TYP.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.h_HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-h_HALF_TERM_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'h_HALF_TERM_TYP', this);
  });
  expj.DA0030010.DA0030010form1.h_HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.h_HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/h_HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-h_HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.COST_TYP",rb)%></span><!-- ������� --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form1-COST_TYP">
expj.DA0030010.DA0030010form1.COST_TYP = {};
expj.DA0030010.DA0030010form1.COST_TYP.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/COST_TYP.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.COST_TYP.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0030010', 'DA0030010form1', 'COST_TYP', this);
  });
  expj.DA0030010.DA0030010form1.COST_TYP.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0030010-DA0030010form1-COST_TYP" name='COST_TYP' class='DA0030010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0030010Control.getStruct().getList_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0030010Control.getStruct().getList_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0030010Control.getStruct().getList_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0030010Struct.getCOST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-DA0030010-DA0030010form1-h_COST_TYP" name="h_COST_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0030010Struct.geth_COST_TYP()) %>">
<script class="expj-script-DA0030010-DA0030010form1-h_COST_TYP">
expj.DA0030010.DA0030010form1.h_COST_TYP = {};
expj.DA0030010.DA0030010form1.h_COST_TYP.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/h_COST_TYP.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.h_COST_TYP.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-h_COST_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'h_COST_TYP', this);
  });
  expj.DA0030010.DA0030010form1.h_COST_TYP.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.h_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/h_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-h_COST_TYP');
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CS_PROC_CD",rb)%></span><!-- �H���R�[�h --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form1-CS_PROC_CD">
expj.DA0030010.DA0030010form1.CS_PROC_CD = {};
expj.DA0030010.DA0030010form1.CS_PROC_CD.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/CS_PROC_CD.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.CS_PROC_CD.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-CS_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'CS_PROC_CD', this);
  });
  expj.DA0030010.DA0030010form1.CS_PROC_CD.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.CS_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/CS_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-CS_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form1-CS_PROC_CD" name="CS_PROC_CD" class="DA0030010-focus-move  required-value expj-DA0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getCS_PROC_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-DA0030010-DA0030010form1-h_CS_PROC_CD" name="h_CS_PROC_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0030010Struct.geth_CS_PROC_CD()) %>">
<script class="expj-script-DA0030010-DA0030010form1-h_CS_PROC_CD">
expj.DA0030010.DA0030010form1.h_CS_PROC_CD = {};
expj.DA0030010.DA0030010form1.h_CS_PROC_CD.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/h_CS_PROC_CD.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.h_CS_PROC_CD.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-h_CS_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'h_CS_PROC_CD', this);
  });
  expj.DA0030010.DA0030010form1.h_CS_PROC_CD.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.h_CS_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/h_CS_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-h_CS_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-DA0030010-DA0030010form1-PeekerCsProcCd">
expj.DA0030010.DA0030010form1.PeekerCsProcCd = {};
// script1="onClick;0;PEEKER;_DA0030010form1/CS_PROC_CD:_DA0030010form1/CS_PROC_NAME@<%=contextNo%>"
expj.DA0030010.DA0030010form1.PeekerCsProcCd.onClick0 = function () {
  console.log('PeekerCsProcCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0030010';
var parameterValues = 'PeekerCsProcCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_CS_PROC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CS_PROC_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0030010form1/CS_PROC_CD:_DA0030010form1/CS_PROC_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0030010.DA0030010form1.PeekerCsProcCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010form1.PeekerCsProcCd['onClick' + i])) {
        expj.DA0030010.DA0030010form1.PeekerCsProcCd['onClick' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010form1.PeekerCsProcCd.executeAllOnDecision = function () {
};
expj.DA0030010.DA0030010form1.PeekerCsProcCd.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-PeekerCsProcCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0030010', 'DA0030010form1', 'PeekerCsProcCd', this, 'Button');
    }
  });
  expj.DA0030010.DA0030010form1.PeekerCsProcCd.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.PeekerCsProcCd.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/PeekerCsProcCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-PeekerCsProcCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0030010-DA0030010form1-PeekerCsProcCd" class="DA0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form1-CS_PROC_NAME">
expj.DA0030010.DA0030010form1.CS_PROC_NAME = {};
expj.DA0030010.DA0030010form1.CS_PROC_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/CS_PROC_NAME.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.CS_PROC_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-CS_PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'CS_PROC_NAME', this);
  });
  expj.DA0030010.DA0030010form1.CS_PROC_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.CS_PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/CS_PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-CS_PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form1-CS_PROC_NAME" name="CS_PROC_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getCS_PROC_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROC_COST_CLS_CD",rb)%></span><!-- ���H��ރR�[�h --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form1-PROC_COST_CLS_CD">
expj.DA0030010.DA0030010form1.PROC_COST_CLS_CD = {};
expj.DA0030010.DA0030010form1.PROC_COST_CLS_CD.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/PROC_COST_CLS_CD.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.PROC_COST_CLS_CD.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-PROC_COST_CLS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'PROC_COST_CLS_CD', this);
  });
  expj.DA0030010.DA0030010form1.PROC_COST_CLS_CD.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.PROC_COST_CLS_CD.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/PROC_COST_CLS_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-PROC_COST_CLS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form1-PROC_COST_CLS_CD" name="PROC_COST_CLS_CD" class="DA0030010-focus-move  required-value expj-DA0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_CLS_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-DA0030010-DA0030010form1-h_PROC_COST_CLS_CD" name="h_PROC_COST_CLS_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0030010Struct.geth_PROC_COST_CLS_CD()) %>">
<script class="expj-script-DA0030010-DA0030010form1-h_PROC_COST_CLS_CD">
expj.DA0030010.DA0030010form1.h_PROC_COST_CLS_CD = {};
expj.DA0030010.DA0030010form1.h_PROC_COST_CLS_CD.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/h_PROC_COST_CLS_CD.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.h_PROC_COST_CLS_CD.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-h_PROC_COST_CLS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'h_PROC_COST_CLS_CD', this);
  });
  expj.DA0030010.DA0030010form1.h_PROC_COST_CLS_CD.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.h_PROC_COST_CLS_CD.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/h_PROC_COST_CLS_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-h_PROC_COST_CLS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-DA0030010-DA0030010form1-PeekerProcCostClsCd">
expj.DA0030010.DA0030010form1.PeekerProcCostClsCd = {};
// script1="onClick;0;PEEKER;_DA0030010form1/PROC_COST_CLS_CD:_DA0030010form1/PROC_COST_CLS_NAME:_DA0030010form2/PROC_COST_01_NAME:_DA0030010form2/PROC_COST_02_NAME:_DA0030010form2/PROC_COST_03_NAME:_DA0030010form2/PROC_COST_04_NAME:_DA0030010form2/PROC_COST_05_NAME:_DA0030010form2/PROC_COST_06_NAME:_DA0030010form2/PROC_COST_07_NAME:_DA0030010form2/PROC_COST_08_NAME:_DA0030010form2/PROC_COST_09_NAME:_DA0030010form2/PROC_COST_10_NAME:_DA0030010form2/PROC_COST_11_NAME:_DA0030010form2/PROC_COST_12_NAME@<%=contextNo%>"
expj.DA0030010.DA0030010form1.PeekerProcCostClsCd.onClick0 = function () {
  console.log('PeekerProcCostClsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0030010';
var parameterValues = 'PeekerProcCostClsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form1', '_PROC_COST_CLS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROC_COST_CLS_CD_D02%&%';
parameterValues += 'TARGET_FIELD%=%_DA0030010form1/PROC_COST_CLS_CD:_DA0030010form1/PROC_COST_CLS_NAME:_DA0030010form2/PROC_COST_01_NAME:_DA0030010form2/PROC_COST_02_NAME:_DA0030010form2/PROC_COST_03_NAME:_DA0030010form2/PROC_COST_04_NAME:_DA0030010form2/PROC_COST_05_NAME:_DA0030010form2/PROC_COST_06_NAME:_DA0030010form2/PROC_COST_07_NAME:_DA0030010form2/PROC_COST_08_NAME:_DA0030010form2/PROC_COST_09_NAME:_DA0030010form2/PROC_COST_10_NAME:_DA0030010form2/PROC_COST_11_NAME:_DA0030010form2/PROC_COST_12_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0030010.DA0030010form1.PeekerProcCostClsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010form1.PeekerProcCostClsCd['onClick' + i])) {
        expj.DA0030010.DA0030010form1.PeekerProcCostClsCd['onClick' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010form1.PeekerProcCostClsCd.executeAllOnDecision = function () {
};
expj.DA0030010.DA0030010form1.PeekerProcCostClsCd.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-PeekerProcCostClsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0030010', 'DA0030010form1', 'PeekerProcCostClsCd', this, 'Button');
    }
  });
  expj.DA0030010.DA0030010form1.PeekerProcCostClsCd.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.PeekerProcCostClsCd.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/PeekerProcCostClsCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-PeekerProcCostClsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0030010-DA0030010form1-PeekerProcCostClsCd" class="DA0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form1-PROC_COST_CLS_NAME">
expj.DA0030010.DA0030010form1.PROC_COST_CLS_NAME = {};
expj.DA0030010.DA0030010form1.PROC_COST_CLS_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form1/PROC_COST_CLS_NAME.onDecision');
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form1.PROC_COST_CLS_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form1-PROC_COST_CLS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form1', 'PROC_COST_CLS_NAME', this);
  });
  expj.DA0030010.DA0030010form1.PROC_COST_CLS_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form1.PROC_COST_CLS_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form1/PROC_COST_CLS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form1-PROC_COST_CLS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form1-PROC_COST_CLS_NAME" name="PROC_COST_CLS_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_CLS_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- �����ɏ�i���������p��DataGrid��z�u����B�� --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DA0030010-DA0030010button1">
expj.DA0030010.DA0030010button1 = {};
expj.DA0030010.DA0030010button1.executeAllOnDecision = function () {
  console.log('execute DA0030010button1.onDecision');
};
expj.DA0030010.DA0030010button1.executeOnLoad = function () {
  expj.DA0030010.DA0030010button1.executePScriptOnLoad();
};

expj.DA0030010.DA0030010button1.executePScriptOnLoad = function () {
  console.log('execute DA0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0030010-DA0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0030010-DA0030010button1-Select">
expj.DA0030010.DA0030010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0030010form1/*@DA0030010Servlet"
expj.DA0030010.DA0030010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0030010', 'DA0030010button1', '_DA0030010form1/*', 'DA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0030010', response);
expj.common.updateBusinessScreenTab('DA0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0030010.DA0030010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010button1.Select['onClick' + i])) {
        expj.DA0030010.DA0030010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010button1.Select.executeAllOnDecision = function () {
};
expj.DA0030010.DA0030010button1.Select.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0030010', 'DA0030010button1', 'Select', this, 'Button');
    }
  });
  expj.DA0030010.DA0030010button1.Select.executePScriptOnLoad();
};

expj.DA0030010.DA0030010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DA0030010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0030010-DA0030010button1-Select" name="Select" class="DA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- �Ǎ��{�^�� --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- �����ɉ��i�����e�i���X�p��DataGrid��z�u����B�� --><script class="expj-script-DA0030010-DA0030010form2">
expj.DA0030010.DA0030010form2 = {};
// script1="onDecision;0;SET;_PROC_COST_SUM=[{_PROC_COST_01}+{_PROC_COST_02}+{_PROC_COST_03}+{_PROC_COST_04}+{_PROC_COST_05}+{_PROC_COST_06}+{_PROC_COST_07}+{_PROC_COST_08}+{_PROC_COST_09}+{_PROC_COST_10}+{_PROC_COST_11}+{_PROC_COST_12}]"
expj.DA0030010.DA0030010form2.onDecision0 = function () {
  console.log('DA0030010form2 script1');
expj.common.pscript.setReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_SUM', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_01') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_02') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_03') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_04') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_05') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_06') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_07') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_08') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_09') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_10') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_11') + '+' + expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010form2', '_PROC_COST_12')));
};
expj.DA0030010.DA0030010form2.executeAllOnDecision = function () {
  console.log('execute DA0030010form2.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010form2['onDecision' + i])) {
        expj.DA0030010.DA0030010form2['onDecision' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010form2.executeOnLoad = function () {
  expj.DA0030010.DA0030010form2.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0030010-DA0030010form2" action="DA0030010Servlet" name="DA0030010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_UNIT_QTY",rb)%></span><!-- ���H��P�ʐ� --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_UNIT_QTY">
expj.DA0030010.DA0030010form2.PROC_COST_UNIT_QTY = {};
expj.DA0030010.DA0030010form2.PROC_COST_UNIT_QTY.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_UNIT_QTY.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_UNIT_QTY.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_UNIT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_UNIT_QTY', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_UNIT_QTY.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_UNIT_QTY.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_UNIT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_UNIT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_UNIT_QTY" name="PROC_COST_UNIT_QTY" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_UNIT_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_UNIT_2",rb)%></span><!-- ���H��P�ʐ��P�� --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-STOCK_UNIT">
expj.DA0030010.DA0030010form2.STOCK_UNIT = {};
expj.DA0030010.DA0030010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/STOCK_UNIT.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'STOCK_UNIT', this);
  });
  expj.DA0030010.DA0030010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-STOCK_UNIT" name="STOCK_UNIT" class="DA0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getSTOCK_UNIT()) %>" maxlength="12" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_01",rb)%></span><!-- ���H��01 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_01">
expj.DA0030010.DA0030010form2.PROC_COST_01 = {};
expj.DA0030010.DA0030010form2.PROC_COST_01.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_01.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_01.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_01').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_01', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_01.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_01.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_01.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_01');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_01" name="PROC_COST_01" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_01()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_01_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_01_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_01_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_01_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_01_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_01_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_01_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_01_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_01_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_01_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_01_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_01_NAME" name="PROC_COST_01_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_01_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_02",rb)%></span><!-- ���H��02 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_02">
expj.DA0030010.DA0030010form2.PROC_COST_02 = {};
expj.DA0030010.DA0030010form2.PROC_COST_02.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_02.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_02.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_02').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_02', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_02.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_02.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_02.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_02');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_02" name="PROC_COST_02" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_02()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_02_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_02_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_02_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_02_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_02_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_02_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_02_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_02_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_02_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_02_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_02_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_02_NAME" name="PROC_COST_02_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_02_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_03",rb)%></span><!-- ���H��03 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_03">
expj.DA0030010.DA0030010form2.PROC_COST_03 = {};
expj.DA0030010.DA0030010form2.PROC_COST_03.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_03.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_03.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_03').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_03', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_03.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_03.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_03.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_03');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_03" name="PROC_COST_03" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_03()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_03_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_03_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_03_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_03_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_03_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_03_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_03_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_03_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_03_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_03_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_03_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_03_NAME" name="PROC_COST_03_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_03_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_04",rb)%></span><!-- ���H��04 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_04">
expj.DA0030010.DA0030010form2.PROC_COST_04 = {};
expj.DA0030010.DA0030010form2.PROC_COST_04.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_04.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_04.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_04').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_04', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_04.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_04.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_04.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_04');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_04" name="PROC_COST_04" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_04()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_04_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_04_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_04_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_04_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_04_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_04_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_04_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_04_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_04_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_04_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_04_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_04_NAME" name="PROC_COST_04_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_04_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_05",rb)%></span><!-- ���H��05 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_05">
expj.DA0030010.DA0030010form2.PROC_COST_05 = {};
expj.DA0030010.DA0030010form2.PROC_COST_05.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_05.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_05.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_05').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_05', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_05.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_05.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_05.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_05');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_05" name="PROC_COST_05" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_05()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_05_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_05_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_05_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_05_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_05_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_05_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_05_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_05_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_05_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_05_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_05_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_05_NAME" name="PROC_COST_05_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_05_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_06",rb)%></span><!-- ���H��06 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_06">
expj.DA0030010.DA0030010form2.PROC_COST_06 = {};
expj.DA0030010.DA0030010form2.PROC_COST_06.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_06.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_06.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_06').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_06', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_06.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_06.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_06.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_06');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_06" name="PROC_COST_06" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_06()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_06_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_06_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_06_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_06_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_06_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_06_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_06_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_06_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_06_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_06_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_06_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_06_NAME" name="PROC_COST_06_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_06_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_07",rb)%></span><!-- ���H��07 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_07">
expj.DA0030010.DA0030010form2.PROC_COST_07 = {};
expj.DA0030010.DA0030010form2.PROC_COST_07.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_07.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_07.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_07').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_07', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_07.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_07.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_07.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_07');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_07" name="PROC_COST_07" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_07()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_07_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_07_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_07_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_07_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_07_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_07_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_07_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_07_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_07_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_07_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_07_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_07_NAME" name="PROC_COST_07_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_07_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_08",rb)%></span><!-- ���H��08 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_08">
expj.DA0030010.DA0030010form2.PROC_COST_08 = {};
expj.DA0030010.DA0030010form2.PROC_COST_08.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_08.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_08.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_08').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_08', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_08.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_08.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_08.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_08');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_08" name="PROC_COST_08" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_08()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_08_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_08_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_08_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_08_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_08_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_08_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_08_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_08_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_08_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_08_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_08_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_08_NAME" name="PROC_COST_08_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_08_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_09",rb)%></span><!-- ���H��09 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_09">
expj.DA0030010.DA0030010form2.PROC_COST_09 = {};
expj.DA0030010.DA0030010form2.PROC_COST_09.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_09.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_09.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_09').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_09', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_09.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_09.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_09.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_09');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_09" name="PROC_COST_09" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_09()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_09_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_09_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_09_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_09_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_09_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_09_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_09_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_09_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_09_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_09_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_09_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_09_NAME" name="PROC_COST_09_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_09_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_10",rb)%></span><!-- ���H��10 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_10">
expj.DA0030010.DA0030010form2.PROC_COST_10 = {};
expj.DA0030010.DA0030010form2.PROC_COST_10.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_10.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_10.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_10').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_10', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_10.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_10.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_10.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_10');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_10" name="PROC_COST_10" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_10()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_10_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_10_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_10_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_10_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_10_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_10_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_10_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_10_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_10_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_10_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_10_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_10_NAME" name="PROC_COST_10_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_10_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_11",rb)%></span><!-- ���H��11 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_11">
expj.DA0030010.DA0030010form2.PROC_COST_11 = {};
expj.DA0030010.DA0030010form2.PROC_COST_11.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_11.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_11.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_11').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_11', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_11.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_11.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_11.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_11');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_11" name="PROC_COST_11" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_11()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_11_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_11_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_11_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_11_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_11_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_11_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_11_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_11_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_11_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_11_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_11_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_11_NAME" name="PROC_COST_11_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_11_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_12",rb)%></span><!-- ���H��12 --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_12">
expj.DA0030010.DA0030010form2.PROC_COST_12 = {};
expj.DA0030010.DA0030010form2.PROC_COST_12.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_12.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_12.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_12').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_12', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_12.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_12.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_12.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_12');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_12" name="PROC_COST_12" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_12()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_12_NAME">
expj.DA0030010.DA0030010form2.PROC_COST_12_NAME = {};
expj.DA0030010.DA0030010form2.PROC_COST_12_NAME.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_12_NAME.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_12_NAME.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_12_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_12_NAME', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_12_NAME.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_12_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_12_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_12_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_12_NAME" name="PROC_COST_12_NAME" class="DA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_12_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_SUM",rb)%></span><!-- ���H��v --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-PROC_COST_SUM">
expj.DA0030010.DA0030010form2.PROC_COST_SUM = {};
expj.DA0030010.DA0030010form2.PROC_COST_SUM.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/PROC_COST_SUM.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.PROC_COST_SUM.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-PROC_COST_SUM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'PROC_COST_SUM', this);
  });
  expj.DA0030010.DA0030010form2.PROC_COST_SUM.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.PROC_COST_SUM.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/PROC_COST_SUM.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-PROC_COST_SUM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-PROC_COST_SUM" name="PROC_COST_SUM" class="DA0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;16.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getPROC_COST_SUM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010form2-HOME_CUR_UNIT">
expj.DA0030010.DA0030010form2.HOME_CUR_UNIT = {};
expj.DA0030010.DA0030010form2.HOME_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/HOME_CUR_UNIT.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.HOME_CUR_UNIT.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-HOME_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'HOME_CUR_UNIT', this);
  });
  expj.DA0030010.DA0030010form2.HOME_CUR_UNIT.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.HOME_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/HOME_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-HOME_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-DA0030010-DA0030010form2-HOME_CUR_UNIT" name="HOME_CUR_UNIT" class="DA0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getHOME_CUR_UNIT()) %>" maxlength="12" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-DA0030010-DA0030010form2-DEL_FLG" name="DEL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0030010Struct.getDEL_FLG()) %>">
<script class="expj-script-DA0030010-DA0030010form2-DEL_FLG">
expj.DA0030010.DA0030010form2.DEL_FLG = {};
expj.DA0030010.DA0030010form2.DEL_FLG.executeAllOnDecision = function () {
  console.log('execute DA0030010form2/DEL_FLG.onDecision');
  expj.DA0030010.DA0030010form2.executeAllOnDecision();
  expj.DA0030010.executeAllOnDecision();
};
expj.DA0030010.DA0030010form2.DEL_FLG.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010form2-DEL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0030010', 'DA0030010form2', 'DEL_FLG', this);
  });
  expj.DA0030010.DA0030010form2.DEL_FLG.executePScriptOnLoad();
};

expj.DA0030010.DA0030010form2.DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute DA0030010form2/DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010form2-DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- �����ɉ��i�����e�i���X�p��DataGrid��z�u����B�� --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 504px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-DA0030010-DA0030010button2">
expj.DA0030010.DA0030010button2 = {};
expj.DA0030010.DA0030010button2.executeAllOnDecision = function () {
  console.log('execute DA0030010button2.onDecision');
};
expj.DA0030010.DA0030010button2.executeOnLoad = function () {
  expj.DA0030010.DA0030010button2.executePScriptOnLoad();
};

expj.DA0030010.DA0030010button2.executePScriptOnLoad = function () {
  console.log('execute DA0030010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0030010-DA0030010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0030010-DA0030010button2-Insert">
expj.DA0030010.DA0030010button2.Insert = {};
// script1="onClick;0;CHK;_DA0030010form2/STOCK_UNIT[eq]@$DA03101"
expj.DA0030010.DA0030010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010button2', '_DA0030010form2/STOCK_UNIT'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0030010', 'DA0030010button2', 'DA03101');
}
};
// script2="onClick;1;CHK;_DA0030010form2/PROC_COST_SUM[numeq]0@$DA03102"
expj.DA0030010.DA0030010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010button2', '_DA0030010form2/PROC_COST_SUM')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addWarningMessage('DA0030010', 'DA0030010button2', 'DA03102');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0030010form1/*,_DA0030010form2/*@DA0030010Servlet,,$ZZ07001"
expj.DA0030010.DA0030010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0030010', 'DA0030010button2', '_DA0030010form1/*,_DA0030010form2/*', 'DA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0030010', response);
expj.common.updateBusinessScreenTab('DA0030010', contents);
};
expj.common.pscript.callConfirm('DA0030010', 'DA0030010button2', 'ZZ07001', okEvent);
};
expj.DA0030010.DA0030010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010button2.Insert['onClick' + i])) {
        expj.DA0030010.DA0030010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010button2.Insert.executeAllOnDecision = function () {
};
expj.DA0030010.DA0030010button2.Insert.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0030010', 'DA0030010button2', 'Insert', this, 'Button');
    }
  });
  expj.DA0030010.DA0030010button2.Insert.executePScriptOnLoad();
};

expj.DA0030010.DA0030010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute DA0030010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0030010-DA0030010button2-Insert" name="Insert" class="DA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- �o�^�{�^�� --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010button2-Update">
expj.DA0030010.DA0030010button2.Update = {};
// script1="onClick;0;CHK;_DA0030010form2/STOCK_UNIT[eq]@$DA03101"
expj.DA0030010.DA0030010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010button2', '_DA0030010form2/STOCK_UNIT'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0030010', 'DA0030010button2', 'DA03101');
}
};
// script2="onClick;1;CHK;_DA0030010form2/PROC_COST_SUM[numeq]0@$DA03102"
expj.DA0030010.DA0030010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('DA0030010', 'DA0030010button2', '_DA0030010form2/PROC_COST_SUM')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addWarningMessage('DA0030010', 'DA0030010button2', 'DA03102');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0030010form1/*,_DA0030010form2/*@DA0030010Servlet,,$ZZ07003"
expj.DA0030010.DA0030010button2.Update.onClick2 = function () {
  console.log('Update script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0030010', 'DA0030010button2', '_DA0030010form1/*,_DA0030010form2/*', 'DA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0030010', response);
expj.common.updateBusinessScreenTab('DA0030010', contents);
};
expj.common.pscript.callConfirm('DA0030010', 'DA0030010button2', 'ZZ07003', okEvent);
};
expj.DA0030010.DA0030010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010button2.Update['onClick' + i])) {
        expj.DA0030010.DA0030010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010button2.Update.executeAllOnDecision = function () {
};
expj.DA0030010.DA0030010button2.Update.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0030010', 'DA0030010button2', 'Update', this, 'Button');
    }
  });
  expj.DA0030010.DA0030010button2.Update.executePScriptOnLoad();
};

expj.DA0030010.DA0030010button2.Update.executePScriptOnLoad = function () {
  console.log('execute DA0030010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0030010-DA0030010button2-Update" name="Update" class="DA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- �X�V�{�^�� --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010button2-Delete">
expj.DA0030010.DA0030010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0030010form1/*,_DA0030010form2/*@DA0030010Servlet,,$ZZ07007"
expj.DA0030010.DA0030010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0030010', 'DA0030010button2', '_DA0030010form1/*,_DA0030010form2/*', 'DA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0030010', response);
expj.common.updateBusinessScreenTab('DA0030010', contents);
};
expj.common.pscript.callConfirm('DA0030010', 'DA0030010button2', 'ZZ07007', okEvent);
};
expj.DA0030010.DA0030010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010button2.Delete['onClick' + i])) {
        expj.DA0030010.DA0030010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010button2.Delete.executeAllOnDecision = function () {
};
expj.DA0030010.DA0030010button2.Delete.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0030010', 'DA0030010button2', 'Delete', this, 'Button');
    }
  });
  expj.DA0030010.DA0030010button2.Delete.executePScriptOnLoad();
};

expj.DA0030010.DA0030010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute DA0030010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0030010-DA0030010button2-Delete" name="Delete" class="DA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- �폜�{�^�� --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010button2-CancelDelete">
expj.DA0030010.DA0030010button2.CancelDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0030010form1/*,_DA0030010form2/*@DA0030010Servlet,,$ZZ07016"
expj.DA0030010.DA0030010button2.CancelDelete.onClick0 = function () {
  console.log('CancelDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0030010', 'DA0030010button2', '_DA0030010form1/*,_DA0030010form2/*', 'DA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0030010', response);
expj.common.updateBusinessScreenTab('DA0030010', contents);
};
expj.common.pscript.callConfirm('DA0030010', 'DA0030010button2', 'ZZ07016', okEvent);
};
expj.DA0030010.DA0030010button2.CancelDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010button2.CancelDelete['onClick' + i])) {
        expj.DA0030010.DA0030010button2.CancelDelete['onClick' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010button2.CancelDelete.executeAllOnDecision = function () {
};
expj.DA0030010.DA0030010button2.CancelDelete.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010button2-CancelDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0030010', 'DA0030010button2', 'CancelDelete', this, 'Button');
    }
  });
  expj.DA0030010.DA0030010button2.CancelDelete.executePScriptOnLoad();
};

expj.DA0030010.DA0030010button2.CancelDelete.executePScriptOnLoad = function () {
  console.log('execute DA0030010button2/CancelDelete.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010button2-CancelDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0030010-DA0030010button2-CancelDelete" name="CancelDelete" class="DA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelDelete",rb)%></button><!-- �폜����{�^�� --></div><!--/td-->
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
<span class="version">DA0030010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-DA0030010-DA0030010button0">
expj.DA0030010.DA0030010button0 = {};
expj.DA0030010.DA0030010button0.executeAllOnDecision = function () {
  console.log('execute DA0030010button0.onDecision');
};
expj.DA0030010.DA0030010button0.executeOnLoad = function () {
  expj.DA0030010.DA0030010button0.executePScriptOnLoad();
};

expj.DA0030010.DA0030010button0.executePScriptOnLoad = function () {
  console.log('execute DA0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0030010-DA0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0030010-DA0030010button0-Clear">
expj.DA0030010.DA0030010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DA0030010Servlet,,$ZZ07008"
expj.DA0030010.DA0030010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0030010', 'DA0030010button0', '', 'DA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0030010', response);
expj.common.updateBusinessScreenTab('DA0030010', contents);
};
expj.common.pscript.callConfirm('DA0030010', 'DA0030010button0', 'ZZ07008', okEvent);
};
expj.DA0030010.DA0030010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010button0.Clear['onClick' + i])) {
        expj.DA0030010.DA0030010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010button0.Clear.executeAllOnDecision = function () {
};
expj.DA0030010.DA0030010button0.Clear.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0030010', 'DA0030010button0', 'Clear', this, 'Button');
    }
  });
  expj.DA0030010.DA0030010button0.Clear.executePScriptOnLoad();
};

expj.DA0030010.DA0030010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DA0030010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0030010-DA0030010button0-Clear" name="Clear" class="DA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- �N���A�{�^�� --></div><!--/td-->
<script class="expj-script-DA0030010-DA0030010button0-Close">
expj.DA0030010.DA0030010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DA0030010.DA0030010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DA0030010');
};
expj.DA0030010.DA0030010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0030010.DA0030010button0.Close['onClick' + i])) {
        expj.DA0030010.DA0030010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DA0030010.DA0030010button0.Close.executeAllOnDecision = function () {
};
expj.DA0030010.DA0030010button0.Close.executeOnLoad = function () {
  $('#expj-DA0030010-DA0030010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0030010', 'DA0030010button0', 'Close', this, 'Button');
    }
  });
  expj.DA0030010.DA0030010button0.Close.executePScriptOnLoad();
};

expj.DA0030010.DA0030010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DA0030010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DA0030010-DA0030010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0030010-DA0030010button0-Close" name="Close" class="DA0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- ����{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DA0030010 (END)-->
<%
MessageStruct msgStruct = aDA0030010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-DA0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DA0030010)) {
  expj.common.treeInstanceMap.DA0030010 = {};
}
expj.common.treeInstanceMap.DA0030010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.DA0030010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.DA0030010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.DA0030010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
expj.common.treeInstanceMap.DA0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DA0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DA0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DA0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DA0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DA0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js�錾
 if (detailId != null) {
%>
<script class="expj-script-DA0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0030010)) {
  expj.common.detailDialogMap.DA0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DA0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.DA0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DA0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DA0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DA0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DA0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DA0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.DA0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DA0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
  expj.common.detailDialogMap.DA0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DA0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DA0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DA0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DA0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DA0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS�錾(END)

//VIEW JS�錾
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-DA0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DA0030010)) {
  expj.common.viewInstanceMap.DA0030010 = {};
}
expj.common.viewInstanceMap.DA0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.DA0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DA0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DA0030010.<%=viewId %>.init = function () {
  // DataGrid(VIEW)�̃{�f�B�f�[�^
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)�̃w�b�_�[�f�[�^
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
    expj.DA0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DA0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DA0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DA0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DA0030010_init">
/**
 * DA0030010�p�̃��[�h�������������֐�
 */
expj.DA0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DA0030010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('DA0030010');
  //��DataGridTable�ɓ��I�����ݒ�
  expj.common.setExpjDynamicHeight('DA0030010');
  expj.common.calendarInstanceMap.DA0030010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.DA0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.DA0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.DA0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DA0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DA0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DA0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DA0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DA0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DA0030010-<%=detailId %>');
<%
 }
%>
  try{expj.DA0030010.DA0030010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.YEAR.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.h_YEAR.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.h_HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.h_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.CS_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.h_CS_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.PeekerCsProcCd.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.CS_PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.PROC_COST_CLS_CD.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.h_PROC_COST_CLS_CD.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.PeekerProcCostClsCd.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.PROC_COST_CLS_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_UNIT_QTY.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_01.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_01_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_02.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_02_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_03.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_03_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_04.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_04_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_05.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_05_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_06.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_06_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_07.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_07_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_08.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_08_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_09.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_09_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_10.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_10_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_11.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_11_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_12.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_12_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.PROC_COST_SUM.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.HOME_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010button2.Update.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010button2.CancelDelete.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form1.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010button1.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010form2.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010button2.executeOnLoad();}catch(e){};
  try{expj.DA0030010.DA0030010button0.executeOnLoad();}catch(e){};
  // �R���\�[���o��
  expj.DA0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DA0030010', 'DA0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DA0030010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.DA0030010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.DA0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('DA0030010', '<%=request.getContextPath() %>');
};

/**
 * DA0030010�̑S��onDecision����
 */
expj.DA0030010.executeAllOnDecision = function () {
  expj.DA0030010.DA0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DA0030010_console">
expj.DA0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>